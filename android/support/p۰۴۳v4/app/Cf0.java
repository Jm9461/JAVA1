package android.support.p۰۴۳v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.p۰۴۳v4.content.Ca;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v4.app.f0  reason: invalid class name */
public final class Cf0 implements Iterable<Intent> {

    /* renamed from: c  reason: contains not printable characters */
    private final ArrayList<Intent> f۱۰۲۰۳c = new ArrayList<>();

    /* renamed from: d  reason: contains not printable characters */
    private final Context f۱۰۲۰۴d;

    /* renamed from: android.support.v4.app.f0$a  reason: invalid class name */
    public interface AbstractCa {
        /* renamed from: c  reason: contains not printable characters */
        Intent m۱۲۲۵۰c();
    }

    private Cf0(Context a) {
        this.f۱۰۲۰۴d = a;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cf0 m۱۲۲۴۴a(Context context) {
        return new Cf0(context);
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cf0 m۱۲۲۴۷a(Intent nextIntent) {
        this.f۱۰۲۰۳c.add(nextIntent);
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cf0 m۱۲۲۴۵a(Activity sourceActivity) {
        Intent parent = null;
        if (sourceActivity instanceof AbstractCa) {
            parent = ((AbstractCa) sourceActivity).m۱۲۲۵۰c();
        }
        if (parent == null) {
            parent = Cv.m۱۲۵۵۹a(sourceActivity);
        }
        if (parent != null) {
            ComponentName target = parent.getComponent();
            if (target == null) {
                target = parent.resolveActivity(this.f۱۰۲۰۴d.getPackageManager());
            }
            m۱۲۲۴۶a(target);
            m۱۲۲۴۷a(parent);
        }
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cf0 m۱۲۲۴۶a(ComponentName sourceActivityName) {
        int insertAt = this.f۱۰۲۰۳c.size();
        try {
            Intent parent = Cv.m۱۲۵۶۰a(this.f۱۰۲۰۴d, sourceActivityName);
            while (parent != null) {
                this.f۱۰۲۰۳c.add(insertAt, parent);
                parent = Cv.m۱۲۵۶۰a(this.f۱۰۲۰۴d, parent.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f۱۰۲۰۳c.iterator();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۲۴۸a() {
        m۱۲۲۴۹a((Bundle) null);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۲۴۹a(Bundle options) {
        if (!this.f۱۰۲۰۳c.isEmpty()) {
            ArrayList<Intent> arrayList = this.f۱۰۲۰۳c;
            Intent[] intents = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intents[0] = new Intent(intents[0]).addFlags(268484608);
            if (!Ca.m۱۲۶۲۲a(this.f۱۰۲۰۴d, intents, options)) {
                Intent topIntent = new Intent(intents[intents.length - 1]);
                topIntent.addFlags(268435456);
                this.f۱۰۲۰۴d.startActivity(topIntent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
