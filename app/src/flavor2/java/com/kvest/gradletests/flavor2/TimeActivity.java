package com.kvest.gradletests.flavor2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import org.joda.time.LocalTime;

import com.kvest.gradletests.R;

public class TimeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        LocalTime currentTime = new LocalTime();
        TextView textView = (TextView) findViewById(R.id.time);
        textView.setText("The current local time is: " + currentTime);
    }
}
