package com.taotao.search.bean;

import org.apache.commons.lang3.StringUtils;
import org.apache.solr.client.solrj.beans.Field;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
// 忽略为知字段
public class Item {

    @Field("id")
    private Long id;

    @Field("title")
    private String title;

    @Field("sellPoint")
    private String sellPoint;

    @Field("price")
    private Long price;

    @Field("image")
    private String image;

    @Field("cid")
    private Integer cid;

    @Field("status")
    private Integer status;

    @Field("updated")
    private Long updated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public String[] getImages() {
        return StringUtils.split(this.getImage(), ',');
    }

}