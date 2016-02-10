package com.coffeearmy.testtweet.data.remote.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by elisadegregorio on 09/02/16.
 */
public class Hashtag {
    private String text;
    private List<Integer> indices = new ArrayList<Integer>();

    /**
     *
     * @return
     * The text
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     * The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * @return
     * The indices
     */
    public List<Integer> getIndices() {
        return indices;
    }

    /**
     *
     * @param indices
     * The indices
     */
    public void setIndices(List<Integer> indices) {
        this.indices = indices;
    }

}
