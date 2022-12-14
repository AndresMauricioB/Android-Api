package com.movil.proapp.Models;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Episode {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("productionCode")
    @Expose
    private String productionCode;
    @SerializedName("airDate")
    @Expose
    private String airDate;
    @SerializedName("season")
    @Expose
    private Integer season;
    @SerializedName("episode")
    @Expose
    private Integer episode;
    @SerializedName("totalViewers")
    @Expose
    private String totalViewers;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("episodeUrl")
    @Expose
    private String episodeUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductionCode() {
        return productionCode;
    }

    public void setProductionCode(String productionCode) {
        this.productionCode = productionCode;
    }

    public String getAirDate() {
        return airDate;
    }

    public void setAirDate(String airDate) {
        this.airDate = airDate;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Integer getEpisode() {
        return episode;
    }

    public void setEpisode(Integer episode) {
        this.episode = episode;
    }

    public String getTotalViewers() {
        return totalViewers;
    }

    public void setTotalViewers(String totalViewers) {
        this.totalViewers = totalViewers;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEpisodeUrl() {
        return episodeUrl;
    }

    public void setEpisodeUrl(String episodeUrl) {
        this.episodeUrl = episodeUrl;
    }

}
