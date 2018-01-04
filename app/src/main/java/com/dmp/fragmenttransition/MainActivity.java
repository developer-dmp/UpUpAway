package com.dmp.fragmenttransition;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button slideButton = (Button)findViewById(R.id.fragTransitionButton);
        slideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragment();
            }
        });
    }

    private void showFragment() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Fragment prev = getSupportFragmentManager().findFragmentByTag("frag_tag");
        if (prev != null) {
            ft.remove(prev);
        }

        AnimatedFragment fragment = AnimatedFragment.getInstance();
        ft.addToBackStack(null);
        fragment.show(ft, "frag_tag");
    }
}
