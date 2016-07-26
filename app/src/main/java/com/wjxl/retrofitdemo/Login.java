package com.wjxl.retrofitdemo;

import java.util.List;

/**
 * Created by lenovo on 2016/7/20.
 */
public class Login {
    /**
     * result : succ
     * cause : 登陆成功!
     * msgcount : 0
     * issales : true
     * banben : 1.8
     * lighttime : 18
     * updatetype : 2
     * carth : false
     * isrexiufu : false
     * rexiufuurl : a
     * msgtype : [{"typeid":"0","typename":"所有"},{"typeid":"03","typename":"物业通知"},{"typeid":"A01","typename":"未读"},{"typeid":"A02","typename":"已读"}]
     */

    private String result;
    private String cause;
    private String msgcount;
    private String issales;
    private String banben;
    private String lighttime;
    private String updatetype;
    private String carth;
    private String isrexiufu;
    private String rexiufuurl;
    /**
     * typeid : 0
     * typename : 所有
     */

    private List<MsgtypeBean> msgtype;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getMsgcount() {
        return msgcount;
    }

    public void setMsgcount(String msgcount) {
        this.msgcount = msgcount;
    }

    public String getIssales() {
        return issales;
    }

    public void setIssales(String issales) {
        this.issales = issales;
    }

    public String getBanben() {
        return banben;
    }

    public void setBanben(String banben) {
        this.banben = banben;
    }

    public String getLighttime() {
        return lighttime;
    }

    public void setLighttime(String lighttime) {
        this.lighttime = lighttime;
    }

    public String getUpdatetype() {
        return updatetype;
    }

    public void setUpdatetype(String updatetype) {
        this.updatetype = updatetype;
    }

    public String getCarth() {
        return carth;
    }

    public void setCarth(String carth) {
        this.carth = carth;
    }

    public String getIsrexiufu() {
        return isrexiufu;
    }

    public void setIsrexiufu(String isrexiufu) {
        this.isrexiufu = isrexiufu;
    }

    public String getRexiufuurl() {
        return rexiufuurl;
    }

    public void setRexiufuurl(String rexiufuurl) {
        this.rexiufuurl = rexiufuurl;
    }

    public List<MsgtypeBean> getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(List<MsgtypeBean> msgtype) {
        this.msgtype = msgtype;
    }

    public static class MsgtypeBean {
        private String typeid;
        private String typename;

        public String getTypeid() {
            return typeid;
        }

        public void setTypeid(String typeid) {
            this.typeid = typeid;
        }

        public String getTypename() {
            return typename;
        }

        public void setTypename(String typename) {
            this.typename = typename;
        }
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "result='" + result + '\'' +
                ", cause='" + cause + '\'' +
                ", msgcount='" + msgcount + '\'' +
                ", issales='" + issales + '\'' +
                ", banben='" + banben + '\'' +
                ", lighttime='" + lighttime + '\'' +
                ", updatetype='" + updatetype + '\'' +
                ", carth='" + carth + '\'' +
                ", isrexiufu='" + isrexiufu + '\'' +
                ", rexiufuurl='" + rexiufuurl + '\'' +
                ", msgtype=" + msgtype +
                '}';
    }
}
