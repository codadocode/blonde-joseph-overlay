package br.com.narebastudio.blonde.conection;

import br.com.narebastudio.blonde.controller.Controller;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class TwitchConection {
    private Controller controller;
    private String host;
    private int port;
    private Socket socket;
    private PrintStream out;
    private DataInputStream reader;
    public TwitchConection(String host, int port, Controller controller)   {
        this.host = host;
        this.port = port;
        this.controller = controller;
    }
    public void connect(String apiKey, String username, String channel) throws IOException {
        socket = new Socket(host, port);
        reader = new DataInputStream(socket.getInputStream());
        out = new PrintStream(socket.getOutputStream());
        out.println("PASS " + apiKey);
        out.println("NICK " + username);
        out.println("USER " + username + "8 * :" + username);
        out.println("JOIN #" + username);
        out.flush();
        if (socket.isConnected())   {
            System.out.println("Conectado ao chat!");
        }
    }
    public void readChat() throws IOException {
        if (socket.isConnected())   {
            if (socket.getInputStream().available() > 0)   {
                String newMsg = reader.readLine();
                System.out.println(newMsg);
                if (newMsg.contains("PRIVMSG"))   {
                    String msgFormatada = newMsg.substring(newMsg.indexOf("#") + 1, newMsg.length());
                    String usuario = msgFormatada.substring(msgFormatada.indexOf("#") + 1, msgFormatada.indexOf(":") - 1);
                    String msgFinal = msgFormatada.substring(msgFormatada.indexOf(":") + 1, msgFormatada.length());
                    //System.out.println("Usuario " + usuario + " enviou: " + msgFinal);
                    if (msgFinal.contains(Controller.commandCode) || msgFinal.contains(Controller.commandCode1) || msgFinal.contains(Controller.commandCode2))   {
                        controller.getBlonde().sendToBlonde(msgFinal.toLowerCase());
                    }
                }else if (newMsg.contains("PING"))   {
                    System.out.println("Mandou um PONG pra Twitch!");
                    out.println("PONG");
                }
            }
        }
    }
    public Socket getSocket()   {
        return this.socket;
    }
}
