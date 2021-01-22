package com.amar.covid19telangana.RetrofitClass;

import com.google.gson.annotations.SerializedName;

public class NewsSource {

    @SerializedName("id")
    private String newsid;
    @SerializedName("name")
    private  String newspapername;

    public NewsSource(String newsid, String newspapername) {
        this.newsid = newsid;
        this.newspapername = newspapername;
    }

    public String getNewsid() {
        return newsid;
    }

    public void setNewsid(String newsid) {
        this.newsid = newsid;
    }

    public String getNewspapername() {
        return newspapername;
    }

    public void setNewspapername(String newspapername) {
        this.newspapername = newspapername;
    }
}
