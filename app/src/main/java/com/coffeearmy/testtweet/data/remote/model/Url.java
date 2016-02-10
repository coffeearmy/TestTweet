package com.coffeearmy.testtweet.data.remote.model;

import java.util.ArrayList;
import java.util.List;


public class Url {
    private List<Url_> urls = new ArrayList<Url_>();

    /**
     * @return The urls
     */
    public List<Url_> getUrls() {
        return urls;
    }

    /**
     * @param urls The urls
     */
    public void setUrls(List<Url_> urls) {
        this.urls = urls;
    }
}
