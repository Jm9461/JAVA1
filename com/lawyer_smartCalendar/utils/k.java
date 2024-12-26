package com.lawyer_smartCalendar.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.Calendar;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private Context f۳۲۶۹a;

    /* renamed from: b  reason: collision with root package name */
    private Intent f۳۲۷۰b;

    /* renamed from: c  reason: collision with root package name */
    private Calendar f۳۲۷۱c = Calendar.getInstance();

    /* renamed from: d  reason: collision with root package name */
    private long f۳۲۷۲d;

    /* renamed from: e  reason: collision with root package name */
    public PendingIntent f۳۲۷۳e;

    public k(Context context, Intent alarmIntent, long timeStamp, long Alarm_id) {
        this.f۳۲۶۹a = context;
        this.f۳۲۷۰b = alarmIntent;
        this.f۳۲۷۱c.setTimeInMillis(timeStamp);
        this.f۳۲۷۲d = Alarm_id;
    }

    public k b() {
        if (PendingIntent.getBroadcast(this.f۳۲۶۹a, (int) this.f۳۲۷۲d, this.f۳۲۷۰b, 536870912) == null) {
            this.f۳۲۷۳e = PendingIntent.getBroadcast(this.f۳۲۶۹a, (int) this.f۳۲۷۲d, this.f۳۲۷۰b, 134217728);
            if (this.f۳۲۷۳e != null) {
                ((AlarmManager) this.f۳۲۶۹a.getSystemService("alarm")).set(0, this.f۳۲۷۱c.getTimeInMillis(), this.f۳۲۷۳e);
            }
        }
        return this;
    }

    public k a() {
        this.f۳۲۷۳e = PendingIntent.getBroadcast(this.f۳۲۶۹a, (int) this.f۳۲۷۲d, this.f۳۲۷۰b, 536870912);
        if (this.f۳۲۷۳e != null) {
            ((AlarmManager) this.f۳۲۶۹a.getSystemService("alarm")).cancel(this.f۳۲۷۳e);
        }
        return this;
    }
}
