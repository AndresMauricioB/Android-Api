package com.movil.proapp.Models;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Personaje {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("hairColor")
    @Expose
    private String hairColor;
    @SerializedName("occupation")
    @Expose
    private String occupation;
    @SerializedName("firstEpisode")
    @Expose
    private String firstEpisode;
    @SerializedName("voicedBy")
    @Expose
    private String voicedBy;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("wikiUrl")
    @Expose
    private String wikiUrl;
    @SerializedName("relatives")
    @Expose
    private List<Object> relatives = null;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getFirstEpisode() {
        return firstEpisode;
    }

    public void setFirstEpisode(String firstEpisode) {
        this.firstEpisode = firstEpisode;
    }

    public String getVoicedBy() {
        return voicedBy;
    }

    public void setVoicedBy(String voicedBy) {
        this.voicedBy = voicedBy;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWikiUrl() {
        return wikiUrl;
    }

    public void setWikiUrl(String wikiUrl) {
        this.wikiUrl = wikiUrl;
    }

    public List<Object> getRelatives() {
        return relatives;
    }

    public void setRelatives(List<Object> relatives) {
        this.relatives = relatives;
    }
}
