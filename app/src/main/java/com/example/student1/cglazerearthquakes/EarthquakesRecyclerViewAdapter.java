package com.example.student1.cglazerearthquakes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by student1 on 12/3/2015.
 */
public class EarthquakesRecyclerViewAdapter extends RecyclerView.Adapter<EarthquakeViewHolder> {

    private EarthquakeReport report;
    private ArrayList<Features> features;

    public EarthquakesRecyclerViewAdapter(EarthquakeReport report) {
        this.report = report;
        this.features = report.getFeatures();
    }

    public EarthquakeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.earthquake_list, parent, false);

        return new EarthquakeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(EarthquakeViewHolder holder, int position) {
        holder.bind(features.get(position).getProperties(), position);
        // holder.bind(properties);
    }

    @Override
    public int getItemCount() {

        return features.size();
    }
}
