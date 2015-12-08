package com.example.student1.cglazerearthquakes;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by student1 on 12/3/2015.
 */
public class EarthquakeViewHolder extends RecyclerView.ViewHolder {

    private TextView place;
    private TextView feltBy;
    private TextView magnitude;
    private TextView significance;
    private TextView gap;
    private TextView dmin;
    private TextView time;

    public EarthquakeViewHolder(View itemView) {
        super(itemView);
        this.place = (TextView) itemView.findViewById(R.id.place);
        this.magnitude = (TextView) itemView.findViewById(R.id.magnitude);
        this.feltBy = (TextView) itemView.findViewById(R.id.felt_by);
        this.significance = (TextView) itemView.findViewById(R.id.significance);
        this.gap = (TextView) itemView.findViewById(R.id.gap);
        this.dmin = (TextView) itemView.findViewById(R.id.dmin);
        this.time= (TextView) itemView.findViewById(R.id.time);
    }

    public void bind(Properties properties, int position) {
        StringBuilder places = new StringBuilder();
        places.append(position + 1);
        places.append(". ");
        places.append(properties.getPlace());
        place.setText(places);
        StringBuilder hour= new StringBuilder();
        hour.append("Time: ");
        Date date = new Date(properties.getTime());
        DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        hour.append(formatter.format(date));
        time.setText(hour);
        StringBuilder felt = new StringBuilder();
        felt.append("Felt By: ");
        felt.append(properties.getFelt());
        felt.append(" people");
        feltBy.setText(felt);
        StringBuilder mag = new StringBuilder();
        mag.append("Magnitude: ");
        mag.append(properties.getMag());
        magnitude.setText(mag);
        StringBuilder sig = new StringBuilder();
        sig.append("Significance: ");
        sig.append(properties.getSig());
        significance.setText(sig);
        double d = properties.getDmin();
        StringBuilder distance = new StringBuilder();
        distance.append("Distance from Epicenter to Nearest Station: ");
        if (d == 0) {
            distance.append("UNKNOWN");
        } else {
            distance.append(d);
            distance.append(" degrees");
        }
        dmin.setText(distance);
        double g = properties.getGap();
        StringBuilder gaps = new StringBuilder();
        gaps.append("Largest Gap: ");
        if (g == 0) {
            gaps.append("UNKNOWN");
        } else {
            gaps.append(g);
            gaps.append(" degrees");
        }
        gap.setText(gaps);
    }
}
