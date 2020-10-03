package com.zahra.astro.data;

public class Age_Item {
    private String planetName;
    private int planetImg;
    private String yearEt;
    private String dayEt;

    public Age_Item(String planetName, int planetImg, String yearEt, String dayEt) {
        this.planetName = planetName;
        this.planetImg = planetImg;
        this.yearEt = yearEt;
        this.dayEt = dayEt;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public int getPlanetImg() {
        return planetImg;
    }

    public void setPlanetImg(int planetImg) {
        this.planetImg = planetImg;
    }

    public String getYearEt() {
        return yearEt;
    }

    public void setYearEt(String yearEt) {
        this.yearEt = yearEt;
    }

    public String getDayEt() {
        return dayEt;
    }

    public void setDayEt(String dayEt) {
        this.dayEt = dayEt;
    }
}
