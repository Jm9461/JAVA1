package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* renamed from: android.support.v4.app.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca extends android.support.v4.content.Ca {

    /* renamed from: c, reason: contains not printable characters */
    private static c f۱۰۰۷۵c;

    /* renamed from: android.support.v4.app.a$b */
    public interface b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: android.support.v4.app.a$c */
    public interface c {
        /* renamed from: a, reason: contains not printable characters */
        boolean m۹۹۹۳a(Activity activity, int i, int i2, Intent intent);

        /* renamed from: a, reason: contains not printable characters */
        boolean m۹۹۹۴a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: android.support.v4.app.a$d */
    public interface d {
        /* renamed from: a, reason: contains not printable characters */
        void mo۱۰۱۸۷a(int i);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static c m۹۹۸۹a() {
        return f۱۰۰۷۵c;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۹۹۹۱a(Activity activity, Intent intent, int requestCode, Bundle options) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, requestCode, options);
        } else {
            activity.startActivityForResult(intent, requestCode);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۹۹۹۰a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: contains not printable characters */
    public static void m۹۹۹۲a(Activity activity, String[] permissions, int requestCode) {
        c cVar = f۱۰۰۷۵c;
        if (cVar != null && cVar.m۹۹۹۴a(activity, permissions, requestCode)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof d) {
                ((d) activity).mo۱۰۱۸۷a(requestCode);
            }
            activity.requestPermissions(permissions, requestCode);
        } else if (activity instanceof b) {
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new a(permissions, activity, requestCode));
        }
    }

    /* renamed from: android.support.v4.app.a$a */
    static class a implements Runnable {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ String[] f۱۰۰۷۶c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ Activity f۱۰۰۷۷d;

        /* renamed from: e, reason: contains not printable characters */
        final /* synthetic */ int f۱۰۰۷۸e;

        a(String[] strArr, Activity activity, int i) {
            this.f۱۰۰۷۶c = strArr;
            this.f۱۰۰۷۷d = activity;
            this.f۱۰۰۷۸e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] grantResults = new int[this.f۱۰۰۷۶c.length];
            PackageManager packageManager = this.f۱۰۰۷۷d.getPackageManager();
            String packageName = this.f۱۰۰۷۷d.getPackageName();
            int permissionCount = this.f۱۰۰۷۶c.length;
            for (int i = 0; i < permissionCount; i++) {
                grantResults[i] = packageManager.checkPermission(this.f۱۰۰۷۶c[i], packageName);
            }
            ((b) this.f۱۰۰۷۷d).onRequestPermissionsResult(this.f۱۰۰۷۸e, this.f۱۰۰۷۶c, grantResults);
        }
    }
}
