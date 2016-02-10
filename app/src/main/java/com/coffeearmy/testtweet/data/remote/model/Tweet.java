package com.coffeearmy.testtweet.data.remote.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by elisadegregorio on 09/02/16.
 */
public class Tweet {
    private List<Status> statuses = new ArrayList<Status>();
    private SearchMetadata searchMetadata;

    /**
     * @return The statuses
     */
    public List<Status> getStatuses() {
        return statuses;
    }

    /**
     * @param statuses The statuses
     */
    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    /**
     * @return The searchMetadata
     */
    public SearchMetadata getSearchMetadata() {
        return searchMetadata;
    }

    /**
     * @param searchMetadata The search_metadata
     */
    public void setSearchMetadata(SearchMetadata searchMetadata) {
        this.searchMetadata = searchMetadata;
    }
}
