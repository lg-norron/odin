package com.southwind.odin.dal.mybatis.model;

public class News {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.id
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.title
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.tag
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    private String tag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.url
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.source
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.publishtime
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    private Long publishtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.id
     *
     * @return the value of news.id
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.id
     *
     * @param id the value for news.id
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.title
     *
     * @return the value of news.title
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.title
     *
     * @param title the value for news.title
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.tag
     *
     * @return the value of news.tag
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.tag
     *
     * @param tag the value for news.tag
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.url
     *
     * @return the value of news.url
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.url
     *
     * @param url the value for news.url
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.source
     *
     * @return the value of news.source
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.source
     *
     * @param source the value for news.source
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.publishtime
     *
     * @return the value of news.publishtime
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public Long getPublishtime() {
        return publishtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.publishtime
     *
     * @param publishtime the value for news.publishtime
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public void setPublishtime(Long publishtime) {
        this.publishtime = publishtime;
    }
}