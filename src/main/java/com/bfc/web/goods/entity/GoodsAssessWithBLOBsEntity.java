package com.bfc.web.goods.entity;

public class GoodsAssessWithBLOBsEntity extends GoodsAssessEntity {
    private String assessContent;

    private String appendAssessContent;

    private String bossReply;

    public String getAssessContent() {
        return assessContent;
    }

    public void setAssessContent(String assessContent) {
        this.assessContent = assessContent == null ? null : assessContent.trim();
    }

    public String getAppendAssessContent() {
        return appendAssessContent;
    }

    public void setAppendAssessContent(String appendAssessContent) {
        this.appendAssessContent = appendAssessContent == null ? null : appendAssessContent.trim();
    }

    public String getBossReply() {
        return bossReply;
    }

    public void setBossReply(String bossReply) {
        this.bossReply = bossReply == null ? null : bossReply.trim();
    }
}