package br.com.narebastudio.blonde.conection;

public class TwitchInfo {
    private String username;
    private String apiKey;
    private String channel;
    public TwitchInfo(String username, String apiKey, String channel)   {
        this.username = username;
        this.apiKey = apiKey;
        this.channel = channel;
    }
    public String getUsername()   {
        return this.username;
    }
    public String getApiKey()   {
        return this.apiKey;
    }
    public String getChannel()   {
        return this.channel;
    }
}
