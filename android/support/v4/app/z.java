package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import android.support.v4.app.x;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.List;

/* access modifiers changed from: package-private */
public class z {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f۱۲۳۹a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static Field f۱۲۴۰b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f۱۲۴۱c;

    static {
        new Object();
    }

    public static SparseArray<Bundle> a(List<Bundle> actionExtrasList) {
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

    public static Bundle a(Notification notif) {
        synchronized (f۱۲۳۹a) {
            if (f۱۲۴۱c) {
                return null;
            }
            try {
                if (f۱۲۴۰b == null) {
                    Field extrasField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(extrasField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f۱۲۴۱c = true;
                        return null;
                    }
                    extrasField.setAccessible(true);
                    f۱۲۴۰b = extrasField;
                }
                Bundle extras = (Bundle) f۱۲۴۰b.get(notif);
                if (extras == null) {
                    extras = new Bundle();
                    f۱۲۴۰b.set(notif, extras);
                }
                return extras;
            } catch (IllegalAccessException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f۱۲۴۱c = true;
                return null;
            } catch (NoSuchFieldException e3) {
                Log.e("NotificationCompat", "Unable to access notification extras", e3);
                f۱۲۴۱c = true;
                return null;
            }
        }
    }

    public static Bundle a(Notification.Builder builder, x.a action) {
        builder.addAction(action.e(), action.i(), action.a());
        Bundle actionExtras = new Bundle(action.d());
        if (action.f() != null) {
            actionExtras.putParcelableArray("android.support.remoteInputs", a(action.f()));
        }
        if (action.c() != null) {
            actionExtras.putParcelableArray("android.support.dataRemoteInputs", a(action.c()));
        }
        actionExtras.putBoolean("android.support.allowGeneratedReplies", action.b());
        return actionExtras;
    }

    static Bundle a(x.a action) {
        Bundle actionExtras;
        Bundle bundle = new Bundle();
        bundle.putInt("icon", action.e());
        bundle.putCharSequence("title", action.i());
        bundle.putParcelable("actionIntent", action.a());
        if (action.d() != null) {
            actionExtras = new Bundle(action.d());
        } else {
            actionExtras = new Bundle();
        }
        actionExtras.putBoolean("android.support.allowGeneratedReplies", action.b());
        bundle.putBundle("extras", actionExtras);
        bundle.putParcelableArray("remoteInputs", a(action.f()));
        bundle.putBoolean("showsUserInterface", action.h());
        bundle.putInt("semanticAction", action.g());
        return bundle;
    }

    private static Bundle a(b0 remoteInput) {
        new Bundle();
        remoteInput.a();
        throw null;
    }

    private static Bundle[] a(b0[] remoteInputs) {
        if (remoteInputs == null) {
            return null;
        }
        Bundle[] bundles = new Bundle[remoteInputs.length];
        if (0 >= remoteInputs.length) {
            return bundles;
        }
        a(remoteInputs[0]);
        throw null;
    }
}
