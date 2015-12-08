package com.example.student1.cglazerearthquakes;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by student1 on 12/3/2015.
 */
public class EarthquakeReport {
    private ArrayList<Features> features;
    private Metadata metadata;

    public EarthquakeReport() {
        this.features = new ArrayList<Features>();
        this.metadata = new Metadata();
    }

    public ArrayList<Features> getFeatures() {
        return features;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public void setFeatures(ArrayList<Features> features) {

        this.features = features;
    }
}
