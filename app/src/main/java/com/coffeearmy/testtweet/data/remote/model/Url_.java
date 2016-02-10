package com.coffeearmy.testtweet.data.remote.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by elisadegregorio on 09/02/16.
 */
public class Url_ {
    private Object expandedUrl;
    private String url;
    private List<Integer> indices = new ArrayList<Integer>();

    /**
     * @return The expandedUrl
     */
    public Object getExpandedUrl() {
        return expandedUrl;
    }

    /**
     * @param expandedUrl The expanded_url
     */
    public void setExpandedUrl(Object expandedUrl) {
        this.expandedUrl = expandedUrl;
    }

    /**
     * @return The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return The indices
     */
    public List<Integer> getIndices() {
        return indices;
    }

    /**
     * @param indices The indices
     */
    public void setIndices(List<Integer> indices) {
        this.indices = indices;
    }
}
