package com.kvest.gradletests;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;

import com.kvest.gradletests.flavor2.TimeActivity;

import java.lang.Override;

/**
 * Created by Kvest on 15.03.2015.
 */
public class ShowTime {
    public void subscribe(final Context context, Window window) {
        window.findViewById(R.id.show_time).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TimeActivity.class);
                context.startActivity(intent);
            }
        });
    }
}
