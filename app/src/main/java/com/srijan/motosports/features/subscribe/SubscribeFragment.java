package com.srijan.motosports.features.subscribe;

/**
 * Created by pari on 18-01-2017.
 */
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.srijan.motosports.R;

public class SubscribeFragment extends Fragment {
    public SubscribeFragment()
    {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment.
        View vv= inflater.inflate(R.layout.fragment_subscribe, container, false);
        Button b = (Button)vv.findViewById(R.id.button2);
        RadioGroup pack = (RadioGroup) vv.findViewById(R.id.pack);
        Typeface face= Typeface.createFromAsset(getContext().getAssets(), "font/finalFont.ttf");
        RadioButton rb1 = (RadioButton)vv.findViewById(R.id.radioButton);
        rb1.setTypeface(face);
        RadioButton rb2 = (RadioButton)vv.findViewById(R.id.radioButton2);
        rb2.setTypeface(face);
        RadioButton rb3 = (RadioButton)vv.findViewById(R.id.radioButton3);
        rb3.setTypeface(face);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = pack.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton packButton = (RadioButton) vv.findViewById(selectedId);

                Toast.makeText(v.getContext(),
                        "Subscribed to: "+packButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        return vv;
    }
}
