package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class f0 implements Iterable<Intent> {

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<Intent> f۱۰۸۸c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final Context f۱۰۸۹d;

    public interface a {
        Intent c();
    }

    private f0(Context a2) {
        this.f۱۰۸۹d = a2;
    }

    public static f0 a(Context context) {
        return new f0(context);
    }

    public f0 a(Intent nextIntent) {
        this.f۱۰۸۸c.add(nextIntent);
        return this;
    }

    public f0 a(Activity sourceActivity) {
        Intent parent = null;
        if (sourceActivity instanceof a) {
            parent = ((a) sourceActivity).c();
        }
        if (parent == null) {
            parent = v.a(sourceActivity);
        }
        if (parent != null) {
            ComponentName target = parent.getComponent();
            if (target == null) {
                target = parent.resolveActivity(this.f۱۰۸۹d.getPackageManager());
            }
            a(target);
            a(parent);
        }
        return this;
    }

    public f0 a(ComponentName sourceActivityName) {
        int insertAt = this.f۱۰۸۸c.size();
        try {
            Intent parent = v.a(this.f۱۰۸۹d, sourceActivityName);
            while (parent != null) {
                this.f۱۰۸۸c.add(insertAt, parent);
                parent = v.a(this.f۱۰۸۹d, parent.getComponent());
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
        return this.f۱۰۸۸c.iterator();
    }

    public void a() {
        a((Bundle) null);
    }

    public void a(Bundle options) {
        if (!this.f۱۰۸۸c.isEmpty()) {
            ArrayList<Intent> arrayList = this.f۱۰۸۸c;
            Intent[] intents = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intents[0] = new Intent(intents[0]).addFlags(268484608);
            if (!android.support.v4.content.a.a(this.f۱۰۸۹d, intents, options)) {
                Intent topIntent = new Intent(intents[intents.length - 1]);
                topIntent.addFlags(268435456);
                this.f۱۰۸۹d.startActivity(topIntent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
