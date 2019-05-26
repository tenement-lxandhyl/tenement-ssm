package com.lx.pojo;

import java.sql.Date;

public class Order {
    private String o_id;
    private String u_id;
    private String h_id;
    private Date o_starttime;
    private Integer o_totalmonth;
    private String o_status;

    public String getO_id() {
        return o_id;
    }

    public void setO_id(String o_id) {
        this.o_id = o_id;
    }

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getH_id() {
        return h_id;
    }

    public void setH_id(String h_id) {
        this.h_id = h_id;
    }

    public Date getO_starttime() {
        return o_starttime;
    }

    public void setO_starttime(Date o_starttime) {
        this.o_starttime = o_starttime;
    }

    public Integer getO_totalmonth() {
        return o_totalmonth;
    }

    public void setO_totalmonth(Integer o_totalmonth) {
        this.o_totalmonth = o_totalmonth;
    }

    public String getO_status() {
        return o_status;
    }

    public void setO_status(String o_status) {
        this.o_status = o_status;
    }
}
