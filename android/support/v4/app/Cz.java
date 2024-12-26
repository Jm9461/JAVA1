package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import android.support.v4.app.Cx;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: android.support.v4.app.z, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cz {

    /* renamed from: a, reason: contains not printable characters */
    private static final Object f۱۰۴۳۷a = new Object();

    /* renamed from: b, reason: contains not printable characters */
    private static Field f۱۰۴۳۸b;

    /* renamed from: c, reason: contains not printable characters */
    private static boolean f۱۰۴۳۹c;

    static {
        new Object();
    }

    /* renamed from: a, reason: contains not printable characters */
    public static SparseArray<Bundle> m۱۰۵۳۶a(List<Bundle> actionExtrasList) {
        SparseArray<Bundle> actionExtrasMap = null;
        int count = actionExtrasList.size();
        for (int i = 0; i < count; i++) {
            Bundle actionExtras = actionExtrasList.get(i);
            if (actionExtras != null) {
                if (actionExtrasMap == null) {
                    actionExtrasMap = new SparseArray<>();
                }
                actionExtrasMap.put(i, actionExtras);
            }
        }
        return actionExtrasMap;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Bundle m۱۰۵۳۳a(Notification notif) {
        synchronized (f۱۰۴۳۷a) {
            if (f۱۰۴۳۹c) {
                return null;
            }
            try {
                if (f۱۰۴۳۸b == null) {
                    Field extrasField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(extrasField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f۱۰۴۳۹c = true;
                        return null;
                    }
                    extrasField.setAccessible(true);
                    f۱۰۴۳۸b = extrasField;
                }
                Bundle extras = (Bundle) f۱۰۴۳۸b.get(notif);
                if (extras == null) {
                    extras = new Bundle();
                    f۱۰۴۳۸b.set(notif, extras);
                }
                return extras;
            } catch (IllegalAccessException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f۱۰۴۳۹c = true;
                return null;
            } catch (NoSuchFieldException e3) {
                Log.e("NotificationCompat", "Unable to access notification extras", e3);
                f۱۰۴۳۹c = true;
                return null;
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Bundle m۱۰۵۳۲a(Notification.Builder builder, Cx.a action) {
        builder.addAction(action.m۱۰۵۰۱e(), action.m۱۰۵۰۵i(), action.m۱۰۴۹۷a());
        Bundle actionExtras = new Bundle(action.m۱۰۵۰۰d());
        if (action.m۱۰۵۰۲f() != null) {
            actionExtras.putParcelableArray("android.support.remoteInputs", m۱۰۵۳۷a(action.m۱۰۵۰۲f()));
        }
        if (action.m۱۰۴۹۹c() != null) {
            actionExtras.putParcelableArray("android.support.dataRemoteInputs", m۱۰۵۳۷a(action.m۱۰۴۹۹c()));
        }
        actionExtras.putBoolean("android.support.allowGeneratedReplies", action.m۱۰۴۹۸b());
        return actionExtras;
    }

    /* renamed from: a, reason: contains not printable characters */
    static Bundle m۱۰۵۳۵a(Cx.a action) {
        Bundle actionExtras;
        Bundle bundle = new Bundle();
        bundle.putInt("icon", action.m۱۰۵۰۱e());
        bundle.putCharSequence("title", action.m۱۰۵۰۵i());
        bundle.putParcelable("actionIntent", action.m۱۰۴۹۷a());
        if (action.m۱۰۵۰۰d() != null) {
            actionExtras = new Bundle(action.m۱۰۵۰۰d());
        } else {
            actionExtras = new Bundle();
        }
        actionExtras.putBoolean("android.support.allowGeneratedReplies", action.m۱۰۴۹۸b());
        bundle.putBundle("extras", actionExtras);
        bundle.putParcelableArray("remoteInputs", m۱۰۵۳۷a(action.m۱۰۵۰۲f()));
        bundle.putBoolean("showsUserInterface", action.m۱۰۵۰۴h());
        bundle.putInt("semanticAction", action.m۱۰۵۰۳g());
        return bundle;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Bundle m۱۰۵۳۴a(Cb0 remoteInput) {
        new Bundle();
        remoteInput.m۱۰۰۰۲a();
        throw null;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Bundle[] m۱۰۵۳۷a(Cb0[] remoteInputs) {
        if (remoteInputs == null) {
            return null;
        }
        Bundle[] bundles = new Bundle[remoteInputs.length];
        if (0 < remoteInputs.length) {
            m۱۰۵۳۴a(remoteInputs[0]);
            throw null;
        }
        return bundles;
    }
}
