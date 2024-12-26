package android.support.p۰۴۳v4.app;

import android.app.Activity;
import android.arch.lifecycle.AbstractCc;
import android.arch.lifecycle.AbstractCe;
import android.arch.lifecycle.Cf;
import android.arch.lifecycle.FragmentCm;
import android.os.Bundle;
import android.support.p۰۴۳v4.view.Ce;
import android.view.KeyEvent;
import android.view.View;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cn;

/* renamed from: android.support.v4.app.e0  reason: invalid class name */
public class ActivityCe0 extends Activity implements AbstractCe, Ce.AbstractCa {

    /* renamed from: c  reason: contains not printable characters */
    private Cf f۱۰۱۲۹c = new Cf(this);

    public ActivityCe0() {
        new Cn();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentCm.m۱۰۹۲۰a(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle outState) {
        this.f۱۰۱۲۹c.m۱۰۹۰۶a(AbstractCc.EnumCb.CREATED);
        super.onSaveInstanceState(outState);
    }

    @Override // android.arch.lifecycle.AbstractCe
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCc m۱۲۱۲۰a() {
        return this.f۱۰۱۲۹c;
    }

    @Override // android.support.p۰۴۳v4.view.Ce.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۱۲۱a(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        View decor = getWindow().getDecorView();
        if (decor == null || !Ce.m۱۲۹۰۸a(decor, event)) {
            return super.dispatchKeyShortcutEvent(event);
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        View decor = getWindow().getDecorView();
        if (decor == null || !Ce.m۱۲۹۰۸a(decor, event)) {
            return Ce.m۱۲۹۰۷a(this, decor, this, event);
        }
        return true;
    }
}
