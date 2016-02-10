package com.coffeearmy.testtweet.data.remote.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by elisadegregorio on 09/02/16.
 */
public class Description {

    private List<Object> urls = new ArrayList<Object>();

    /**
     * @return The urls
     */
    public List<Object> getUrls() {
        return urls;
    }

    /**
     * @param urls The urls
     */
    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }
}
