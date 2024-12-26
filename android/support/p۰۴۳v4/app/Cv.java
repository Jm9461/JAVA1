package android.support.p۰۴۳v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

/* renamed from: android.support.v4.app.v  reason: invalid class name */
public final class Cv {
    /* renamed from: b  reason: contains not printable characters */
    public static boolean m۱۲۵۶۴b(Activity sourceActivity, Intent targetIntent) {
        if (Build.VERSION.SDK_INT >= 16) {
            return sourceActivity.shouldUpRecreateTask(targetIntent);
        }
        String action = sourceActivity.getIntent().getAction();
        return action != null && !action.equals("android.intent.action.MAIN");
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۵۶۱a(Activity sourceActivity, Intent upIntent) {
        if (Build.VERSION.SDK_INT >= 16) {
            sourceActivity.navigateUpTo(upIntent);
            return;
        }
        upIntent.addFlags(67108864);
        sourceActivity.startActivity(upIntent);
        sourceActivity.finish();
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Intent m۱۲۵۵۹a(Activity sourceActivity) {
        Intent result;
        if (Build.VERSION.SDK_INT >= 16 && (result = sourceActivity.getParentActivityIntent()) != null) {
            return result;
        }
        String parentName = m۱۲۵۶۲b(sourceActivity);
        if (parentName == null) {
            return null;
        }
        ComponentName target = new ComponentName(sourceActivity, parentName);
        try {
            if (m۱۲۵۶۳b(sourceActivity, target) == null) {
                return Intent.makeMainActivity(target);
            }
            return new Intent().setComponent(target);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + parentName + "' in manifest");
            return null;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Intent m۱۲۵۶۰a(Context context, ComponentName componentName) {
        String parentActivity = m۱۲۵۶۳b(context, componentName);
        if (parentActivity == null) {
            return null;
        }
        ComponentName target = new ComponentName(componentName.getPackageName(), parentActivity);
        if (m۱۲۵۶۳b(context, target) == null) {
            return Intent.makeMainActivity(target);
        }
        return new Intent().setComponent(target);
    }

    /* renamed from: b  reason: contains not printable characters */
    public static String m۱۲۵۶۲b(Activity sourceActivity) {
        try {
            return m۱۲۵۶۳b(sourceActivity, sourceActivity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static String m۱۲۵۶۳b(Context context, ComponentName componentName) {
        String parentActivity;
        String result;
        ActivityInfo info2 = context.getPackageManager().getActivityInfo(componentName, 128);
        if (Build.VERSION.SDK_INT >= 16 && (result = info2.parentActivityName) != null) {
            return result;
        }
        if (info2.metaData == null || (parentActivity = info2.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (parentActivity.charAt(0) != '.') {
            return parentActivity;
        }
        return context.getPackageName() + parentActivity;
    }
}
