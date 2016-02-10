package com.coffeearmy.testtweet.data.remote.model;

/**
 * Created by elisadegregorio on 09/02/16.
 */
public class SearchMetadata {

    private Integer maxId;
    private Integer sinceId;
    private String refreshUrl;
    private String nextResults;
    private Integer count;
    private Double completedIn;
    private String sinceIdStr;
    private String query;
    private String maxIdStr;

    /**
     * @return The maxId
     */
    public Integer getMaxId() {
        return maxId;
    }

    /**
     * @param maxId The max_id
     */
    public void setMaxId(Integer maxId) {
        this.maxId = maxId;
    }

    /**
     * @return The sinceId
     */
    public Integer getSinceId() {
        return sinceId;
    }

    /**
     * @param sinceId The since_id
     */
    public void setSinceId(Integer sinceId) {
        this.sinceId = sinceId;
    }

    /**
     * @return The refreshUrl
     */
    public String getRefreshUrl() {
        return refreshUrl;
    }

    /**
     * @param refreshUrl The refresh_url
     */
    public void setRefreshUrl(String refreshUrl) {
        this.refreshUrl = refreshUrl;
    }

    /**
     * @return The nextResults
     */
    public String getNextResults() {
        return nextResults;
    }

    /**
     * @param nextResults The next_results
     */
    public void setNextResults(String nextResults) {
        this.nextResults = nextResults;
    }

    /**
     * @return The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count The count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * @return The completedIn
     */
    public Double getCompletedIn() {
        return completedIn;
    }

    /**
     * @param completedIn The completed_in
     */
    public void setCompletedIn(Double completedIn) {
        this.completedIn = completedIn;
    }

    /**
     * @return The sinceIdStr
     */
    public String getSinceIdStr() {
        return sinceIdStr;
    }

    /**
     * @param sinceIdStr The since_id_str
     */
    public void setSinceIdStr(String sinceIdStr) {
        this.sinceIdStr = sinceIdStr;
    }

    /**
     * @return The query
     */
    public String getQuery() {
        return query;
    }

    /**
     * @param query The query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * @return The maxIdStr
     */
    public String getMaxIdStr() {
        return maxIdStr;
    }

    /**
     * @param maxIdStr The max_id_str
     */
    public void setMaxIdStr(String maxIdStr) {
        this.maxIdStr = maxIdStr;
    }

}
