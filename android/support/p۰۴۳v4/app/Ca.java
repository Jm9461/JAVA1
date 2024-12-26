package android.support.p۰۴۳v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* renamed from: android.support.v4.app.a  reason: invalid class name */
public class Ca extends android.support.p۰۴۳v4.content.Ca {

    /* renamed from: c  reason: contains not printable characters */
    private static AbstractCc f۱۰۰۷۵c;

    /* renamed from: android.support.v4.app.a$b  reason: invalid class name */
    public interface AbstractCb {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: android.support.v4.app.a$c  reason: invalid class name */
    public interface AbstractCc {
        /* renamed from: a  reason: contains not printable characters */
        boolean m۱۲۰۶۳a(Activity activity, int i, int i2, Intent intent);

        /* renamed from: a  reason: contains not printable characters */
        boolean m۱۲۰۶۴a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: android.support.v4.app.a$d  reason: invalid class name */
    public interface AbstractCd {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۲۰۶۵a(int i);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCc m۱۲۰۵۹a() {
        return f۱۰۰۷۵c;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۰۶۱a(Activity activity, Intent intent, int requestCode, Bundle options) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, requestCode, options);
        } else {
            activity.startActivityForResult(intent, requestCode);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۰۶۰a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۰۶۲a(Activity activity, String[] permissions, int requestCode) {
        AbstractCc cVar = f۱۰۰۷۵c;
        if (cVar != null && cVar.m۱۲۰۶۴a(activity, permissions, requestCode)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof AbstractCd) {
                ((AbstractCd) activity).m۱۲۰۶۵a(requestCode);
            }
            activity.requestPermissions(permissions, requestCode);
        } else if (activity instanceof AbstractCb) {
            new Handler(Looper.getMainLooper()).post(new RunnableCa(permissions, activity, requestCode));
        }
    }

    /* renamed from: android.support.v4.app.a$a  reason: invalid class name */
    static class RunnableCa implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ String[] f۱۰۰۷۶c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ Activity f۱۰۰۷۷d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ int f۱۰۰۷۸e;

        RunnableCa(String[] strArr, Activity activity, int i) {
            this.f۱۰۰۷۶c = strArr;
            this.f۱۰۰۷۷d = activity;
            this.f۱۰۰۷۸e = i;
        }

        public void run() {
            int[] grantResults = new int[this.f۱۰۰۷۶c.length];
            PackageManager packageManager = this.f۱۰۰۷۷d.getPackageManager();
            String packageName = this.f۱۰۰۷۷d.getPackageName();
            int permissionCount = this.f۱۰۰۷۶c.length;
            for (int i = 0; i < permissionCount; i++) {
                grantResults[i] = packageManager.checkPermission(this.f۱۰۰۷۶c[i], packageName);
            }
            ((AbstractCb) this.f۱۰۰۷۷d).onRequestPermissionsResult(this.f۱۰۰۷۸e, this.f۱۰۰۷۶c, grantResults);
        }
    }
}
