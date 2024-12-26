package com.lawyer_smartCalendar.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.Calendar;

/* renamed from: com.lawyer_smartCalendar.utils.k  reason: invalid class name */
public class Ck {

    /* renamed from: a  reason: contains not printable characters */
    private Context f۱۴۷۹۵a;

    /* renamed from: b  reason: contains not printable characters */
    private Intent f۱۴۷۹۶b;

    /* renamed from: c  reason: contains not printable characters */
    private Calendar f۱۴۷۹۷c = Calendar.getInstance();

    /* renamed from: d  reason: contains not printable characters */
    private long f۱۴۷۹۸d;

    /* renamed from: e  reason: contains not printable characters */
    public PendingIntent f۱۴۷۹۹e;

    public Ck(Context context, Intent alarmIntent, long timeStamp, long Alarm_id) {
        this.f۱۴۷۹۵a = context;
        this.f۱۴۷۹۶b = alarmIntent;
        this.f۱۴۷۹۷c.setTimeInMillis(timeStamp);
        this.f۱۴۷۹۸d = Alarm_id;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Ck m۱۷۸۲۵b() {
        if (PendingIntent.getBroadcast(this.f۱۴۷۹۵a, (int) this.f۱۴۷۹۸d, this.f۱۴۷۹۶b, 536870912) == null) {
            this.f۱۴۷۹۹e = PendingIntent.getBroadcast(this.f۱۴۷۹۵a, (int) this.f۱۴۷۹۸d, this.f۱۴۷۹۶b, 134217728);
            if (this.f۱۴۷۹۹e != null) {
                ((AlarmManager) this.f۱۴۷۹۵a.getSystemService("alarm")).set(0, this.f۱۴۷۹۷c.getTimeInMillis(), this.f۱۴۷۹۹e);
            }
        }
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ck m۱۷۸۲۴a() {
        this.f۱۴۷۹۹e = PendingIntent.getBroadcast(this.f۱۴۷۹۵a, (int) this.f۱۴۷۹۸d, this.f۱۴۷۹۶b, 536870912);
        if (this.f۱۴۷۹۹e != null) {
            ((AlarmManager) this.f۱۴۷۹۵a.getSystemService("alarm")).cancel(this.f۱۴۷۹۹e);
        }
        return this;
    }
}
