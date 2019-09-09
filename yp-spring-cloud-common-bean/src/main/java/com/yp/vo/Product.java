package com.yp.vo;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * @author ex-yipeng
 * @version Id: Product.java, v 0.1 2019/9/9 15:38 ex-yipeng Exp $
 */
public class Product implements Serializable {

    /**
     * 产品货号
     */
    private String itemCode;

    /**
     * 产品名称
     */
    private String name;

    /**
     * 产品品牌名称
     */
    private String bandName;

    /**
     * 产品价格
     */
    private int price;

    public Product(){

    }

    public Product(String itemCode, String name, String bandName, int price) {
        this.itemCode = itemCode;
        this.name = name;
        this.bandName = bandName;
        this.price = price;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
