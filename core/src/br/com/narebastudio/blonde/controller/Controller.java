package br.com.narebastudio.blonde.controller;

import br.com.narebastudio.blonde.personagem.BlondeJoseph;

public class Controller {
    public static BlondeJoseph blonde = null;
    public static String commandCode = "louro";
    public static String commandCode1 = "loro";
    public static String commandCode2 = "blonde";
    public void setBlonde(BlondeJoseph newBlonde)   {
        blonde = newBlonde;
    }
    public BlondeJoseph getBlonde()   {
        if (blonde != null)   {
            return this.blonde;
        }
        return null;
    }
    public String getCommandCode()   {
        return this.commandCode;
    }
}
