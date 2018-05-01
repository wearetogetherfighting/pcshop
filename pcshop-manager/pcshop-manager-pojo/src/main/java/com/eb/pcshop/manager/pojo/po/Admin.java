package com.eb.pcshop.manager.pojo.po;

public class Admin {
    private Integer aid;

    private String aname;

    private String apwd;

    private Integer aflag;

    public Admin(Integer aid, String aname, String apwd, Integer aflag) {
        this.aid = aid;
        this.aname = aname;
        this.apwd = apwd;
        this.aflag = aflag;
    }

    public Admin() {
        super();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd == null ? null : apwd.trim();
    }

    public Integer getAflag() {
        return aflag;
    }

    public void setAflag(Integer aflag) {
        this.aflag = aflag;
    }
}