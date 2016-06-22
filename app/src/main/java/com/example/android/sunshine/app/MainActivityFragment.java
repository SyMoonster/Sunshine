package com.example.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private ArrayAdapter mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] data = {"Lun 20/06 - Soleil - 32-34",
                "Mar 20/06 - Soleil - 32-34",
                "Mer 20/06 - Soleil - 32-34",
                "Jeu 20/06 - Soleil - 32-34",
                "Ven 20/06 - Grele - 32-34",
                "Sam 20/06 - Neige - 32-34",
                "Dim 20/06 - Pluie - 32-34"
                };
         List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));
        mForecastAdapter = new ArrayAdapter(getActivity(),R.layout.list_item_forecast, R.id.list_item_forecast_textview, weekForecast);
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);
        return rootView;
    }
}
