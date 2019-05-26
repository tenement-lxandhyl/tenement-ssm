package com.lx.pojo;

import java.sql.Date;

public class News {
    private String n_id;
    private String n_titie;
    private String n_content;
    private Date n_time;
    private String n_author;
    private String n_i_address;

    public String getN_id() {
        return n_id;
    }

    public void setN_id(String n_id) {
        this.n_id = n_id;
    }

    public String getN_titie() {
        return n_titie;
    }

    public void setN_titie(String n_titie) {
        this.n_titie = n_titie;
    }

    public String getN_content() {
        return n_content;
    }

    public void setN_content(String n_content) {
        this.n_content = n_content;
    }

    public Date getN_time() {
        return n_time;
    }

    public void setN_time(Date n_time) {
        this.n_time = n_time;
    }

    public String getN_author() {
        return n_author;
    }

    public void setN_author(String n_author) {
        this.n_author = n_author;
    }

    public String getN_i_address() {
        return n_i_address;
    }

    public void setN_i_address(String n_i_address) {
        this.n_i_address = n_i_address;
    }
}
