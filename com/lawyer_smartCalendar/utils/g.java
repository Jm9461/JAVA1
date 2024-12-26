package com.lawyer_smartCalendar.utils;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.support.v4.app.x;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.ScheduleDetailActivity;

public class g {
    public static void a(Context context, int notification_id, String title, String message) {
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
        x.c cVar = new x.c(context, "channel_id");
        cVar.c(R.drawable.ic_launcher);
        cVar.a(bitmap);
        cVar.b(title);
        cVar.a(System.currentTimeMillis());
        cVar.a(message);
        x.b bVar = new x.b();
        bVar.a(message);
        cVar.a(bVar);
        cVar.a(-1);
        cVar.a(contentIntent);
        notificationManager.notify(notification_id, cVar.b(0).a());
    }

    public static void a(Context ctx, int notification_id) {
        ((NotificationManager) ctx.getSystemService("notification")).cancel(notification_id);
    }
}
