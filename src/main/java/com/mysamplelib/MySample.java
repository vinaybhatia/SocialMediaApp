package com.mysamplelib;

import android.content.Context;
import android.widget.Toast;

public class MySample {
    public static void setData(Context context, String msg){
        Toast.makeText(context, "Hello run", Toast.LENGTH_SHORT).show();
    }
}
