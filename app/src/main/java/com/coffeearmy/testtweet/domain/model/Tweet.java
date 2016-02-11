package com.coffeearmy.testtweet.domain.model;

public class Tweet {

    String name;
    String nick;
    String pathPhoto;
    String message;
    String date;
    int numRetweets;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPathPhoto() {
        return pathPhoto;
    }

    public void setPathPhoto(String pathPhoto) {
        this.pathPhoto = pathPhoto;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumRetweets() {
        return numRetweets;
    }

    public void setNumRetweets(int numRetweets) {
        this.numRetweets = numRetweets;
    }
}
