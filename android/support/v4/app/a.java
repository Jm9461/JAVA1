package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class a extends android.support.v4.content.a {

    /* renamed from: c  reason: collision with root package name */
    private static c f۱۰۴۲c;

    public interface b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    public interface c {
        boolean a(Activity activity, int i, int i2, Intent intent);

        boolean a(Activity activity, String[] strArr, int i);
    }

    public interface d {
        void a(int i);
    }

    public static c a() {
        return f۱۰۴۲c;
    }

    public static void a(Activity activity, Intent intent, int requestCode, Bundle options) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, requestCode, options);
        } else {
            activity.startActivityForResult(intent, requestCode);
        }
    }

    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void a(Activity activity, String[] permissions, int requestCode) {
        c cVar = f۱۰۴۲c;
        if (cVar != null && cVar.a(activity, permissions, requestCode)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof d) {
                ((d) activity).a(requestCode);
            }
            activity.requestPermissions(permissions, requestCode);
        } else if (activity instanceof b) {
            new Handler(Looper.getMainLooper()).post(new RunnableC۰۰۲۴a(permissions, activity, requestCode));
        }
    }

    /* renamed from: android.support.v4.app.a$a  reason: collision with other inner class name */
    static class RunnableC۰۰۲۴a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String[] f۱۰۴۳c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Activity f۱۰۴۴d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f۱۰۴۵e;

        RunnableC۰۰۲۴a(String[] strArr, Activity activity, int i) {
            this.f۱۰۴۳c = strArr;
            this.f۱۰۴۴d = activity;
            this.f۱۰۴۵e = i;
        }

        public void run() {
            int[] grantResults = new int[this.f۱۰۴۳c.length];
            PackageManager packageManager = this.f۱۰۴۴d.getPackageManager();
            String packageName = this.f۱۰۴۴d.getPackageName();
            int permissionCount = this.f۱۰۴۳c.length;
            for (int i = 0; i < permissionCount; i++) {
                grantResults[i] = packageManager.checkPermission(this.f۱۰۴۳c[i], packageName);
            }
            ((b) this.f۱۰۴۴d).onRequestPermissionsResult(this.f۱۰۴۵e, this.f۱۰۴۳c, grantResults);
        }
    }
}
