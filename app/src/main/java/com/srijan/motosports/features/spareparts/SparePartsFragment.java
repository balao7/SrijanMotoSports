package com.srijan.motosports.features.spareparts;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.srijan.motosports.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SparePartsFragment extends Fragment {


    public SparePartsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_spare_parts, container, false);
    }

}
