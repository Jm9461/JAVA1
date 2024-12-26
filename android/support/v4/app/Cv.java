package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

/* renamed from: android.support.v4.app.v, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cv {
    /* renamed from: b, reason: contains not printable characters */
    public static boolean m۱۰۴۹۴b(Activity sourceActivity, Intent targetIntent) {
        if (Build.VERSION.SDK_INT >= 16) {
            return sourceActivity.shouldUpRecreateTask(targetIntent);
        }
        String action = sourceActivity.getIntent().getAction();
        return (action == null || action.equals("android.intent.action.MAIN")) ? false : true;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۴۹۱a(Activity sourceActivity, Intent upIntent) {
        if (Build.VERSION.SDK_INT >= 16) {
            sourceActivity.navigateUpTo(upIntent);
            return;
        }
        upIntent.addFlags(67108864);
        sourceActivity.startActivity(upIntent);
        sourceActivity.finish();
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Intent m۱۰۴۸۹a(Activity sourceActivity) {
        Intent result;
        if (Build.VERSION.SDK_INT >= 16 && (result = sourceActivity.getParentActivityIntent()) != null) {
            return result;
        }
        String parentName = m۱۰۴۹۲b(sourceActivity);
        if (parentName == null) {
            return null;
        }
        ComponentName target = new ComponentName(sourceActivity, parentName);
        try {
            String grandparent = m۱۰۴۹۳b(sourceActivity, target);
            if (grandparent == null) {
                return Intent.makeMainActivity(target);
            }
            return new Intent().setComponent(target);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + parentName + "' in manifest");
            return null;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Intent m۱۰۴۹۰a(Context context, ComponentName componentName) {
        String parentActivity = m۱۰۴۹۳b(context, componentName);
        if (parentActivity == null) {
            return null;
        }
        ComponentName target = new ComponentName(componentName.getPackageName(), parentActivity);
        String grandparent = m۱۰۴۹۳b(context, target);
        if (grandparent == null) {
            Intent parentIntent = Intent.makeMainActivity(target);
            return parentIntent;
        }
        Intent parentIntent2 = new Intent().setComponent(target);
        return parentIntent2;
    }

    /* renamed from: b, reason: contains not printable characters */
    public static String m۱۰۴۹۲b(Activity sourceActivity) {
        try {
            return m۱۰۴۹۳b(sourceActivity, sourceActivity.getComponentName());
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public static String m۱۰۴۹۳b(Context context, ComponentName componentName) {
        String parentActivity;
        String result;
        PackageManager pm = context.getPackageManager();
        ActivityInfo info2 = pm.getActivityInfo(componentName, 128);
        if (Build.VERSION.SDK_INT >= 16 && (result = info2.parentActivityName) != null) {
            return result;
        }
        if (info2.metaData == null || (parentActivity = info2.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (parentActivity.charAt(0) == '.') {
            return context.getPackageName() + parentActivity;
        }
        return parentActivity;
    }
}
