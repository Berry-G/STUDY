package com.example.recycleview;

public class MainData {

    private String tv_name;
    private String tv_content;
    private String tv_holiday;
    private String tv_days;

    public MainData(String tv_name, String tv_content, String tv_holiday, String tv_days) {
        this.tv_name = tv_name;
        this.tv_content = tv_content;
        this.tv_holiday = tv_holiday;
        this.tv_days = tv_days;
    }

    public String getTv_name() {
        return tv_name;
    }

    public void setTv_name(String tv_name) {
        this.tv_name = tv_name;
    }

    public String getTv_content() {
        return tv_content;
    }

    public void setTv_content(String tv_content) {
        this.tv_content = tv_content;
    }

    public String getTv_holiday() {
        return tv_holiday;
    }

    public void setTv_holiday(String tv_holiday) {
        this.tv_holiday = tv_holiday;
    }

    public String getTv_days() {
        return tv_days;
    }

    public void setTv_days(String tv_days) {
        this.tv_days = tv_days;
    }
}
