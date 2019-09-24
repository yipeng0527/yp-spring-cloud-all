package com.yp.common.bean.product.vo;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * @author ex-yipeng
 * @version Id: User.java, v 0.1 2019/9/9 16:23 ex-yipeng Exp $
 */
public class User implements Serializable {

    private String userName;

    private String passWord;

    private String contact;

    private String desc;

    public User(){

    }

    public User(String userName, String passWord, String contact, String desc) {
        this.userName = userName;
        this.passWord = passWord;
        this.contact = contact;
        this.desc = desc;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
