package com.lawyer_smartCalendar.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.lawyer_smartCalendar.model.Schedule;
import com.lawyer_smartCalendar.p۱۳۳d.Ci;
import com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb;
import java.util.Calendar;
import java.util.List;

public class OnBootReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: contains not printable characters */
    private Ci f۱۴۷۷۱a;

    public void onReceive(Context context, Intent intent) {
        this.f۱۴۷۷۱a = new Ci(context);
        Calendar calendar = Calendar.getInstance();
        this.f۱۴۷۷۱a.m۱۷۸۱۱n();
        List<Schedule> scheduleList = this.f۱۴۷۷۱a.m۱۷۸۰۷l();
        this.f۱۴۷۷۱a.close();
        if (scheduleList.size() > 0) {
            for (int i = 0; i < scheduleList.size(); i++) {
                if (Long.parseLong(((Ci) scheduleList.get(i)).m۱۷۷۱۰a()) >= calendar.getTimeInMillis()) {
                    Cb d = new Cb();
                    Calendar calendar_temp = Calendar.getInstance();
                    calendar_temp.setTimeInMillis(Long.parseLong(((Ci) scheduleList.get(i)).m۱۷۷۱۹d()));
                    d.setTimeInMillis(Long.parseLong(((Ci) scheduleList.get(i)).m۱۷۷۱۹d()));
                    Intent alarmIntent = new Intent(context, OnAlarmReceiver.class);
                    alarmIntent.putExtra("id", ((Ci) scheduleList.get(i)).m۱۷۷۲۱e() + "");
                    alarmIntent.putExtra("title", ((Ci) scheduleList.get(i)).m۱۷۷۲۵h());
                    alarmIntent.putExtra("message", "تاریخ : " + d.m۱۸۰۱۱f() + "\nساعت : " + (calendar_temp.get(12) + " : " + calendar_temp.get(11)));
                    new Ck(context, alarmIntent, Long.parseLong(((Ci) scheduleList.get(i)).m۱۷۷۱۰a()), (long) ((Ci) scheduleList.get(i)).m۱۷۷۲۱e()).m۱۷۸۲۵b();
                }
            }
        }
    }
}
