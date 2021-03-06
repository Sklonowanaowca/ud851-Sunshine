/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvWeatherData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        tvWeatherData = (TextView) findViewById(R.id.tv_weather_data);

        String[] weatherData = {"Monday, May 17 - Clear - 17°C / 15°C",
        "Tuesday, May 18 - Clear - 19°C / 16°C",
        "Wensday, May 19 - Clear - 17°C / 15°C",
        "Thirsday, May 20 - Rainy - 17°C / 15°C",
        "Friday, May 21 - Cloudy - 13°C / 10°C",
                "Monday, May 17 - Clear - 17°C / 15°C",
                "Tuesday, May 18 - Clear - 19°C / 16°C",
                "Wensday, May 19 - Clear - 17°C / 15°C",
                "Thirsday, May 20 - Rainy - 17°C / 15°C",
                "Friday, May 21 - Cloudy - 13°C / 10°C",
                "Monday, May 17 - Clear - 17°C / 15°C",
                "Tuesday, May 18 - Clear - 19°C / 16°C",
                "Wensday, May 19 - Clear - 17°C / 15°C",
                "Thirsday, May 20 - Rainy - 17°C / 15°C",
                "Friday, May 21 - Cloudy - 13°C / 10°C"};

        for(String data : weatherData)
           tvWeatherData.append(data+"\n\n");
    }
}