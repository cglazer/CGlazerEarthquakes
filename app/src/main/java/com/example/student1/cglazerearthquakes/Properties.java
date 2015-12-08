package com.example.student1.cglazerearthquakes;

/**
 * Created by student1 on 12/3/2015.
 */
public class Properties {
    private String place;
    private double mag;
    private int sig;
    private int felt;
    private double gap;
    private double dmin;
    private long time;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public double getDmin() {
        return dmin;
    }

    public void setDmin(double dmin) {
        this.dmin = dmin;
    }

    public double getGap() {

        return gap;
    }

    public void setGap(double gap) {
        this.gap = gap;
    }

    public int getFelt() {
        return felt;
    }

    public void setFelt(int felt) {
        this.felt = felt;
    }

    public int getSig() {
        return sig;
    }

    public void setSig(int sig) {
        this.sig = sig;
    }

    public double getMag() {
        return mag;
    }

    public void setMag(double mag) {
        this.mag = mag;
    }

    public String getPlace() {

        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
