package com.uabc.lsc.a01128562.clase05;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements LandscapeFragment.OnFragmentLandscapeInteractionListener, PortraitFragment.OnFragmentPortraitInteractionListener{

    Configuration config;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    EditText tPortrait;
    EditText tLandscape;
    String temp="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        config= getResources().getConfiguration();
        fragmentManager=getFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        tPortrait=(EditText) findViewById(R.id.textoPortrait);
        tLandscape=(EditText) findViewById(R.id.textoLandscape);

        if(config.orientation==Configuration.ORIENTATION_LANDSCAPE){
            LandscapeFragment ls_frag=new LandscapeFragment();
            fragmentTransaction.replace(android.R.id.content, ls_frag);
            this.setTitle("Landscape");
        }else{
            PortraitFragment pt_frag=new PortraitFragment();
            fragmentTransaction.replace(android.R.id.content, pt_frag);
            this.setTitle("Portrait");
        }
        fragmentTransaction.commit();

    }


    @Override
    public void onFragmentLandscapeInteracion(String info) {
        String temp = tLandscape.getText().t
    }

    @Override
    public void onFragmentPortraitInteracion(String info) {
        Log.i("wx",info);
    }
}
