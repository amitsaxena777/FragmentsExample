package com.example.fragmentsexample;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentA.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        FragmentA fragmentA=FragmentA.newInstance("","");
        fragmentTransaction.replace(R.id.parentLayout,fragmentA,"FragmentA");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        FragmentB fragmentB=FragmentB.newInstance("","");
        fragmentTransaction.replace(R.id.parentLayout,fragmentB,"FragmentB");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
