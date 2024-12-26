package com.mohamadamin.persianmaterialdatetimepicker;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings;

/* renamed from: com.mohamadamin.persianmaterialdatetimepicker.a  reason: invalid class name */
public class Ca {

    /* renamed from: a  reason: contains not printable characters */
    private final Context f۱۴۸۵۶a;

    /* renamed from: b  reason: contains not printable characters */
    private final ContentObserver f۱۴۸۵۷b = new Ca(null);

    /* renamed from: c  reason: contains not printable characters */
    private Vibrator f۱۴۸۵۸c;

    /* renamed from: d  reason: contains not printable characters */
    private boolean f۱۴۸۵۹d;

    /* renamed from: e  reason: contains not printable characters */
    private long f۱۴۸۶۰e;

    /* access modifiers changed from: private */
    /* renamed from: b  reason: contains not printable characters */
    public static boolean m۱۷۸۹۰b(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "haptic_feedback_enabled", 0) == 1;
    }

    public Ca(Context context) {
        this.f۱۴۸۵۶a = context;
    }

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.a$a  reason: invalid class name */
    class Ca extends ContentObserver {
        Ca(Handler x0) {
            super(x0);
        }

        public void onChange(boolean selfChange) {
            Ca aVar = Ca.this;
            aVar.f۱۴۸۵۹d = Ca.m۱۷۸۹۰b(aVar.f۱۴۸۵۶a);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۸۹۱a() {
        this.f۱۴۸۵۸c = (Vibrator) this.f۱۴۸۵۶a.getSystemService("vibrator");
        this.f۱۴۸۵۹d = m۱۷۸۹۰b(this.f۱۴۸۵۶a);
        this.f۱۴۸۵۶a.getContentResolver().registerContentObserver(Settings.System.getUriFor("haptic_feedback_enabled"), false, this.f۱۴۸۵۷b);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۸۹۲b() {
        this.f۱۴۸۵۸c = null;
        this.f۱۴۸۵۶a.getContentResolver().unregisterContentObserver(this.f۱۴۸۵۷b);
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۷۸۹۳c() {
        if (this.f۱۴۸۵۸c != null && this.f۱۴۸۵۹d) {
            long now = SystemClock.uptimeMillis();
            if (now - this.f۱۴۸۶۰e >= 125) {
                this.f۱۴۸۵۸c.vibrate(5);
                this.f۱۴۸۶۰e = now;
            }
        }
    }
}
