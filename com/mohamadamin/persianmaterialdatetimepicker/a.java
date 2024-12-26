package com.mohamadamin.persianmaterialdatetimepicker;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f۳۳۰۹a;

    /* renamed from: b  reason: collision with root package name */
    private final ContentObserver f۳۳۱۰b = new C۰۱۰۷a(null);

    /* renamed from: c  reason: collision with root package name */
    private Vibrator f۳۳۱۱c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f۳۳۱۲d;

    /* renamed from: e  reason: collision with root package name */
    private long f۳۳۱۳e;

    /* access modifiers changed from: private */
    public static boolean b(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "haptic_feedback_enabled", 0) == 1;
    }

    public a(Context context) {
        this.f۳۳۰۹a = context;
    }

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.a$a  reason: collision with other inner class name */
    class C۰۱۰۷a extends ContentObserver {
        C۰۱۰۷a(Handler x0) {
            super(x0);
        }

        public void onChange(boolean selfChange) {
            a aVar = a.this;
            aVar.f۳۳۱۲d = a.b(aVar.f۳۳۰۹a);
        }
    }

    public void a() {
        this.f۳۳۱۱c = (Vibrator) this.f۳۳۰۹a.getSystemService("vibrator");
        this.f۳۳۱۲d = b(this.f۳۳۰۹a);
        this.f۳۳۰۹a.getContentResolver().registerContentObserver(Settings.System.getUriFor("haptic_feedback_enabled"), false, this.f۳۳۱۰b);
    }

    public void b() {
        this.f۳۳۱۱c = null;
        this.f۳۳۰۹a.getContentResolver().unregisterContentObserver(this.f۳۳۱۰b);
    }

    public void c() {
        if (this.f۳۳۱۱c != null && this.f۳۳۱۲d) {
            long now = SystemClock.uptimeMillis();
            if (now - this.f۳۳۱۳e >= 125) {
                this.f۳۳۱۱c.vibrate(5);
                this.f۳۳۱۳e = now;
            }
        }
    }
}
