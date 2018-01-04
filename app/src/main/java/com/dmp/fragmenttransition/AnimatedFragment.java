package com.dmp.fragmenttransition;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rtd1p on 1/3/2018.
 */

public class AnimatedFragment extends DialogFragment {

    public static AnimatedFragment getInstance() {
        // create bundle here and assign to frag before returning
        return new AnimatedFragment();
    }

    @Override
    public void onActivityCreated(Bundle arg0) {
        super.onActivityCreated(arg0);
        getDialog().getWindow()
                .getAttributes().windowAnimations = R.style.DialogAnimation;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_slider, container, false);
        ((TextView)v.findViewById(R.id.profileNameTextView)).setText("Domenic, 23");
        ((TextView)v.findViewById(R.id.profileLocationTextView)).setText("USA");
        return v;
    }
}