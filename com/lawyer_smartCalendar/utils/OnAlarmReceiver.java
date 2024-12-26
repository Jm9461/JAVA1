package com.lawyer_smartCalendar.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class OnAlarmReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String id = intent.getStringExtra("id");
        Cg.m۱۷۷۵۱a(context, Integer.parseInt(id), intent.getStringExtra("title"), intent.getStringExtra("message"));
    }
}
