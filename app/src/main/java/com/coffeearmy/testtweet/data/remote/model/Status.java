package com.coffeearmy.testtweet.data.remote.model;

/**
 * Created by elisadegregorio on 09/02/16.
 */
public class Status {
    private Object coordinates;
    private Boolean favorited;
    private Boolean truncated;
    private String createdAt;
    private String idStr;
    private Entities entities;
    private Object inReplyToUserIdStr;
    private Object contributors;
    private String text;
    private Metadata metadata;
    private Integer retweetCount;
    private Object inReplyToStatusIdStr;
    private Integer id;
    private Object geo;
    private Boolean retweeted;
    private Object inReplyToUserId;
    private Object place;
    private User user;
    private Object inReplyToScreenName;
    private String source;
    private Object inReplyToStatusId;

    /**
     * @return The coordinates
     */
    public Object getCoordinates() {
        return coordinates;
    }

    /**
     * @param coordinates The coordinates
     */
    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * @return The favorited
     */
    public Boolean getFavorited() {
        return favorited;
    }

    /**
     * @param favorited The favorited
     */
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    /**
     * @return The truncated
     */
    public Boolean getTruncated() {
        return truncated;
    }

    /**
     * @param truncated The truncated
     */
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * @return The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return The idStr
     */
    public String getIdStr() {
        return idStr;
    }

    /**
     * @param idStr The id_str
     */
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    /**
     * @return The entities
     */
    public Entities getEntities() {
        return entities;
    }

    /**
     * @param entities The entities
     */
    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    /**
     * @return The inReplyToUserIdStr
     */
    public Object getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    /**
     * @param inReplyToUserIdStr The in_reply_to_user_id_str
     */
    public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    /**
     * @return The contributors
     */
    public Object getContributors() {
        return contributors;
    }

    /**
     * @param contributors The contributors
     */
    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    /**
     * @return The text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return The metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * @param metadata The metadata
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * @return The retweetCount
     */
    public Integer getRetweetCount() {
        return retweetCount;
    }

    /**
     * @param retweetCount The retweet_count
     */
    public void setRetweetCount(Integer retweetCount) {
        this.retweetCount = retweetCount;
    }

    /**
     * @return The inReplyToStatusIdStr
     */
    public Object getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    /**
     * @param inReplyToStatusIdStr The in_reply_to_status_id_str
     */
    public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The geo
     */
    public Object getGeo() {
        return geo;
    }

    /**
     * @param geo The geo
     */
    public void setGeo(Object geo) {
        this.geo = geo;
    }

    /**
     * @return The retweeted
     */
    public Boolean getRetweeted() {
        return retweeted;
    }

    /**
     * @param retweeted The retweeted
     */
    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    /**
     * @return The inReplyToUserId
     */
    public Object getInReplyToUserId() {
        return inReplyToUserId;
    }

    /**
     * @param inReplyToUserId The in_reply_to_user_id
     */
    public void setInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    /**
     * @return The place
     */
    public Object getPlace() {
        return place;
    }

    /**
     * @param place The place
     */
    public void setPlace(Object place) {
        this.place = place;
    }

    /**
     * @return The user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user The user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return The inReplyToScreenName
     */
    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    /**
     * @param inReplyToScreenName The in_reply_to_screen_name
     */
    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    /**
     * @return The source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return The inReplyToStatusId
     */
    public Object getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    /**
     * @param inReplyToStatusId The in_reply_to_status_id
     */
    public void setInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }
}
