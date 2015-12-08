package com.example.student1.cglazerearthquakes;

import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by student1 on 12/3/2015.
 */
public class EarthquakeAsyncTask extends AsyncTask<Long, String, EarthquakeReport> {

    //asynchronous - not at the same time
    //AsyncTask is an abstract class, which will be discussed in 2 weeks

    private RecyclerView recyclerView;
    EarthquakesRecyclerViewAdapter adapter;

    public EarthquakeAsyncTask(RecyclerView recyclerView) {

        this.recyclerView = recyclerView;
    }

    //the methods below were created using code override
    //the return and parameter types were generated based the the classes parameters in the header
    //this is like the run method of a thread
    @Override
    protected EarthquakeReport doInBackground(Long... params) {
        URL url = null;
        try {
            url = new URL("http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_hour.geojson");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStream in = null;
        try {
            in = connection.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        Gson gson = new Gson();
        EarthquakeReport report = gson.fromJson(reader, EarthquakeReport.class);
        adapter = new EarthquakesRecyclerViewAdapter(report);
        return null;
    }

    //this is what to do when the Async task is done
    @Override
    protected void onPostExecute(EarthquakeReport result) {
        super.onPostExecute(result);
        //need to create a constructor to have access to the textView in MainActivity
        //there are other ways to access the main thread variables
        recyclerView.setAdapter(adapter);
    }


}

