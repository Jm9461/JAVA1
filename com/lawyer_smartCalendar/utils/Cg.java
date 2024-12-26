package com.lawyer_smartCalendar.utils;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.support.p۰۴۳v4.app.Cx;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.ScheduleDetailActivity;

/* renamed from: com.lawyer_smartCalendar.utils.g  reason: invalid class name */
public class Cg {
    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۷۷۵۱a(Context context, int notification_id, String title, String message) {
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_launcher);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel("channel_id", "my_channel", 3);
            channel.setDescription("channel description");
            notificationManager.createNotificationChannel(channel);
        }
        Intent frm_schedule = new Intent(context, ScheduleDetailActivity.class);
        frm_schedule.putExtra("id", notification_id + "");
        PendingIntent contentIntent = PendingIntent.getActivity(context, notification_id, frm_schedule, 134217728);
        Cx.Cc cVar = new Cx.Cc(context, "channel_id");
        cVar.m۱۲۵۹۰c(R.drawable.ic_launcher);
        cVar.m۱۲۵۸۴a(bitmap);
        cVar.m۱۲۵۸۹b(title);
        cVar.m۱۲۵۸۲a(System.currentTimeMillis());
        cVar.m۱۲۵۸۶a(message);
        Cx.Cb bVar = new Cx.Cb();
        bVar.m۱۲۵۷۶a(message);
        cVar.m۱۲۵۸۵a(bVar);
        cVar.m۱۲۵۸۱a(-1);
        cVar.m۱۲۵۸۳a(contentIntent);
        notificationManager.notify(notification_id, cVar.m۱۲۵۸۸b(0).m۱۲۵۸۰a());
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۷۷۵۰a(Context ctx, int notification_id) {
        ((NotificationManager) ctx.getSystemService("notification")).cancel(notification_id);
    }
}
