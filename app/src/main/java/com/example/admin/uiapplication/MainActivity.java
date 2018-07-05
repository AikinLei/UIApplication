package com.example.admin.uiapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jarsigner -verbose -keystore C:\sign\jincihaoche.jks -signedjar C:\sign\sign.apk C:\sign\tap_unsign.apk haochejinci
    }
}
