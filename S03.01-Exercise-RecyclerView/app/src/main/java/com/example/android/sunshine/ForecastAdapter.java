package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Monia on 2017-11-14.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>{
    // (15) Add a class file called ForecastAdapter
    // (22) Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>

    // (23) Create a private string array called mWeatherData
    private String[] mWeatherData;

    // TODO (47) Create the default constructor (we will pass in parameters in a later lesson)

    // (16) Create a class within ForecastAdapter called ForecastAdapterViewHolder
    // (17) Extend RecyclerView.ViewHolder
    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder{
        // (18) Create a public final TextView variable called mWeatherTextView
        public final TextView mWeatherTextView;

        //  (19) Create a constructor for this class that accepts a View as a parameter
        public ForecastAdapterViewHolder(View view){
            // (20) Call super(view) within the constructor for ForecastAdapterViewHolder
            super(view);
            // (21) Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView
            mWeatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);
        }
    }

    // (24) Override onCreateViewHolder
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // (25) Within onCreateViewHolder, inflate the list item xml into a view
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.forecast_list_item;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;
        View view = layoutInflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        // (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter
        return new ForecastAdapterViewHolder(view);
    }

    // (27) Override onBindViewHolder
    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
        // (28) Set the text of the TextView to the weather for this list item's position
        holder.mWeatherTextView.setText(mWeatherData[position]);
    }

    // (29) Override getItemCount
    @Override
    public int getItemCount() {
        // (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null
        if(mWeatherData == null)
            return 0;
        else
            return mWeatherData.length;
    }

    // (31) Create a setWeatherData method that saves the weatherData to mWeatherData
    public void setWeatherData(String[] weatherData){
        mWeatherData = weatherData;
        // (32) After you save mWeatherData, call notifyDataSetChanged
        notifyDataSetChanged();
    }
}
