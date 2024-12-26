package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.content.Ca;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v4.app.f0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cf0 implements Iterable<Intent> {

    /* renamed from: c, reason: contains not printable characters */
    private final ArrayList<Intent> f۱۰۲۰۳c = new ArrayList<>();

    /* renamed from: d, reason: contains not printable characters */
    private final Context f۱۰۲۰۴d;

    /* renamed from: android.support.v4.app.f0$a */
    public interface a {
        /* renamed from: c, reason: contains not printable characters */
        Intent mo۱۱۴۱۵c();
    }

    private Cf0(Context a2) {
        this.f۱۰۲۰۴d = a2;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cf0 m۱۰۱۷۴a(Context context) {
        return new Cf0(context);
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cf0 m۱۰۱۷۷a(Intent nextIntent) {
        this.f۱۰۲۰۳c.add(nextIntent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: contains not printable characters */
    public Cf0 m۱۰۱۷۵a(Activity activity) {
        Intent parent = null;
        if (activity instanceof a) {
            parent = ((a) activity).mo۱۱۴۱۵c();
        }
        if (parent == null) {
            parent = Cv.m۱۰۴۸۹a(activity);
        }
        if (parent != null) {
            ComponentName target = parent.getComponent();
            if (target == null) {
                target = parent.resolveActivity(this.f۱۰۲۰۴d.getPackageManager());
            }
            m۱۰۱۷۶a(target);
            m۱۰۱۷۷a(parent);
        }
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cf0 m۱۰۱۷۶a(ComponentName sourceActivityName) {
        int insertAt = this.f۱۰۲۰۳c.size();
        try {
            Intent parent = Cv.m۱۰۴۹۰a(this.f۱۰۲۰۴d, sourceActivityName);
            while (parent != null) {
                this.f۱۰۲۰۳c.add(insertAt, parent);
                parent = Cv.m۱۰۴۹۰a(this.f۱۰۲۰۴d, parent.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f۱۰۲۰۳c.iterator();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۱۷۸a() {
        m۱۰۱۷۹a((Bundle) null);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۱۷۹a(Bundle options) {
        if (this.f۱۰۲۰۳c.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.f۱۰۲۰۳c;
        Intent[] intents = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intents[0] = new Intent(intents[0]).addFlags(268484608);
        if (!Ca.m۱۰۵۵۲a(this.f۱۰۲۰۴d, intents, options)) {
            Intent topIntent = new Intent(intents[intents.length - 1]);
            topIntent.addFlags(268435456);
            this.f۱۰۲۰۴d.startActivity(topIntent);
        }
    }
}
