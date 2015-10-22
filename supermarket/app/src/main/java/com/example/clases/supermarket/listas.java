package com.example.clases.supermarket;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


/**
 * Created by Clases on 08/10/2015.
 */
public class listas extends Fragment {

    private ImageButton mButton;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.listas, container, false);
        mButton = (ImageButton)rootView.findViewById(R.id.lacteos);
        mButton.setOnClickListener(new OnClickListener() {
            Fragment fragment = null;
            @Override
            public void onClick(View v) {

                fragment = new lacteos();
                if (fragment != null) {
                    FragmentManager fragmentManager = getFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.frame_container, fragment).commit();
                }
            }
        });
        return rootView;
    }
}
