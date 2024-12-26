package android.support.p۰۴۳v4.app;

import android.app.Notification;
import android.os.Bundle;
import android.support.p۰۴۳v4.app.Cx;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.z  reason: invalid class name */
public class Cz {

    /* renamed from: a  reason: contains not printable characters */
    private static final Object f۱۰۴۳۷a = new Object();

    /* renamed from: b  reason: contains not printable characters */
    private static Field f۱۰۴۳۸b;

    /* renamed from: c  reason: contains not printable characters */
    private static boolean f۱۰۴۳۹c;

    static {
        new Object();
    }

    /* renamed from: a  reason: contains not printable characters */
    public static SparseArray<Bundle> m۱۲۶۰۶a(List<Bundle> actionExtrasList) {
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

    /* renamed from: a  reason: contains not printable characters */
    public static Bundle m۱۲۶۰۳a(Notification notif) {
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
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f۱۰۴۳۹c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f۱۰۴۳۹c = true;
                return null;
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Bundle m۱۲۶۰۲a(Notification.Builder builder, Cx.Ca action) {
        builder.addAction(action.m۱۲۵۷۱e(), action.m۱۲۵۷۵i(), action.m۱۲۵۶۷a());
        Bundle actionExtras = new Bundle(action.m۱۲۵۷۰d());
        if (action.m۱۲۵۷۲f() != null) {
            actionExtras.putParcelableArray("android.support.remoteInputs", m۱۲۶۰۷a(action.m۱۲۵۷۲f()));
        }
        if (action.m۱۲۵۶۹c() != null) {
            actionExtras.putParcelableArray("android.support.dataRemoteInputs", m۱۲۶۰۷a(action.m۱۲۵۶۹c()));
        }
        actionExtras.putBoolean("android.support.allowGeneratedReplies", action.m۱۲۵۶۸b());
        return actionExtras;
    }

    /* renamed from: a  reason: contains not printable characters */
    static Bundle m۱۲۶۰۵a(Cx.Ca action) {
        Bundle actionExtras;
        Bundle bundle = new Bundle();
        bundle.putInt("icon", action.m۱۲۵۷۱e());
        bundle.putCharSequence("title", action.m۱۲۵۷۵i());
        bundle.putParcelable("actionIntent", action.m۱۲۵۶۷a());
        if (action.m۱۲۵۷۰d() != null) {
            actionExtras = new Bundle(action.m۱۲۵۷۰d());
        } else {
            actionExtras = new Bundle();
        }
        actionExtras.putBoolean("android.support.allowGeneratedReplies", action.m۱۲۵۶۸b());
        bundle.putBundle("extras", actionExtras);
        bundle.putParcelableArray("remoteInputs", m۱۲۶۰۷a(action.m۱۲۵۷۲f()));
        bundle.putBoolean("showsUserInterface", action.m۱۲۵۷۴h());
        bundle.putInt("semanticAction", action.m۱۲۵۷۳g());
        return bundle;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Bundle m۱۲۶۰۴a(Cb0 remoteInput) {
        new Bundle();
        remoteInput.m۱۲۰۷۲a();
        throw null;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Bundle[] m۱۲۶۰۷a(Cb0[] remoteInputs) {
        if (remoteInputs == null) {
            return null;
        }
        Bundle[] bundles = new Bundle[remoteInputs.length];
        if (0 >= remoteInputs.length) {
            return bundles;
        }
        m۱۲۶۰۴a(remoteInputs[0]);
        throw null;
    }
}
