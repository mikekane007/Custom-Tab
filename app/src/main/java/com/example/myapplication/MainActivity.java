package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.core.content.ContextCompat;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button button_web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    button_web = findViewById(R.id.button_web);

    button_web.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            // Visit website via chrome link
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            CustomTabColorSchemeParams defaultcolor = new CustomTabColorSchemeParams.Builder().
                    setToolbarColor(ContextCompat.getColor(getApplicationContext(), R.color.myColor)).
                    build();
            builder.setDefaultColorSchemeParams(defaultcolor);
            CustomTabsIntent customTabsIntent = builder.build();
            customTabsIntent.launchUrl(MainActivity.this, Uri.parse("https://github.com/mikekane007"));
                 }
             });

        }
    }


