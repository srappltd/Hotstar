package com.sandhya.hotstar.models;

public class ContentModel {
    String thumbnail,title,description,views,date,time,category,totalEpisode,language,type,id,uid,logo;

    String duration,SE;

    public ContentModel() {
    }

    public ContentModel(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public ContentModel(String thumbnail, String title) {
        this.thumbnail = thumbnail;
        this.title = title;
    }

    public ContentModel(String thumbnail, String title, String date, String duration, String SE) {
        this.thumbnail = thumbnail;
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.SE = SE;
    }

    public ContentModel(String thumbnail, String title, String description, String views, String date, String time, String category, String totalEpisode, String language, String type, String id, String uid, String logo, String duration, String SE) {
        this.thumbnail = thumbnail;
        this.title = title;
        this.description = description;
        this.views = views;
        this.date = date;
        this.time = time;
        this.category = category;
        this.totalEpisode = totalEpisode;
        this.language = language;
        this.type = type;
        this.id = id;
        this.uid = uid;
        this.logo = logo;
        this.duration = duration;
        this.SE = SE;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTotalEpisode() {
        return totalEpisode;
    }

    public void setTotalEpisode(String totalEpisode) {
        this.totalEpisode = totalEpisode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSE() {
        return SE;
    }

    public void setSE(String SE) {
        this.SE = SE;
    }
}
