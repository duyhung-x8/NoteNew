package com.example.noterikkei.app;

/**
 * Created by DUYHUNG on 13-06-2014.
 */
public class NoteModel {
    String strTitle;
    String strTimeSet;
    String strContent;
    Boolean isSetAlarm;

    public String getStrTitle() {
        return strTitle;
    }
    public void setStrTitle(String strTitle) {
        this.strTitle = strTitle;
    }
    public Boolean getIsSetAlarm() {
        return isSetAlarm;
    }

    public void setIsSetAlarm(Boolean isSetAlarm) {
        this.isSetAlarm = isSetAlarm;
    }
    public String getStrTimeSet() {
        return strTimeSet;
    }

    public void setStrTimeSet(String strTimeSet) {
        this.strTimeSet = strTimeSet;
    }
    public String getStrContent() {
        return strContent;
    }
    public void setStrContent(String strContent) {
        this.strContent = strContent;
    }
}
