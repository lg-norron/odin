package com.southwind.odin.dal.mybatis.model;

public class Newspulllog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column newspulllog.id
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column newspulllog.mac
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    private String mac;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column newspulllog.newsid
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    private Long newsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column newspulllog.pulltime
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    private Long pulltime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column newspulllog.readtime
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    private Long readtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column newspulllog.id
     *
     * @return the value of newspulllog.id
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column newspulllog.id
     *
     * @param id the value for newspulllog.id
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column newspulllog.mac
     *
     * @return the value of newspulllog.mac
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public String getMac() {
        return mac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column newspulllog.mac
     *
     * @param mac the value for newspulllog.mac
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column newspulllog.newsid
     *
     * @return the value of newspulllog.newsid
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public Long getNewsid() {
        return newsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column newspulllog.newsid
     *
     * @param newsid the value for newspulllog.newsid
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public void setNewsid(Long newsid) {
        this.newsid = newsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column newspulllog.pulltime
     *
     * @return the value of newspulllog.pulltime
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public Long getPulltime() {
        return pulltime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column newspulllog.pulltime
     *
     * @param pulltime the value for newspulllog.pulltime
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public void setPulltime(Long pulltime) {
        this.pulltime = pulltime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column newspulllog.readtime
     *
     * @return the value of newspulllog.readtime
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public Long getReadtime() {
        return readtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column newspulllog.readtime
     *
     * @param readtime the value for newspulllog.readtime
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    public void setReadtime(Long readtime) {
        this.readtime = readtime;
    }
}