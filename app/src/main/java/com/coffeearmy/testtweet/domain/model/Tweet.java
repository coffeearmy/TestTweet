package com.coffeearmy.testtweet.domain.model;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.sql.Date;

public class Tweet {
    //"Sat Feb 20 01:49:01 +0000 2016"
    private final DateTimeFormatter dateFormat;
    String name;
    String nick;
    String pathPhoto;
    String message;
    DateTime date;
    int numRetweets;

    public Tweet() {
        dateFormat=DateTimeFormat.forPattern("EEE MMM dd HH:mm:ss Z yyyy");
    }

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

    public DateTime getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = dateFormat.parseDateTime(date);
    }

    public int getNumRetweets() {
        return numRetweets;
    }

    public void setNumRetweets(int numRetweets) {
        this.numRetweets = numRetweets;
    }


    public Integer compare(Tweet tweet2) {
        int result=0;
        result=Integer.compare(getNumRetweets(),tweet2.getNumRetweets());
        if(result==0) {
           result=getDate().compareTo(tweet2.getDate());
        }
        return result;
    }
}
