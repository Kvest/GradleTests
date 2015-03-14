package com.kvest.gradletests;

import android.content.Context;
import android.view.Window;
import android.widget.Toast;

/**
 * Created by Kvest on 15.03.2015.
 */
public class ShowTime {
    public void subscribe(Context context, Window window) {
        Toast.makeText(context, "This is flavor1", Toast.LENGTH_LONG).show();
    }
}
