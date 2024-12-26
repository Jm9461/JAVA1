package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.AbstractCc;
import android.arch.lifecycle.Cf;
import android.arch.lifecycle.FragmentCm;
import android.arch.lifecycle.InterfaceCe;
import android.os.Bundle;
import android.support.v4.view.Ce;
import android.view.KeyEvent;
import android.view.View;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cn;

/* renamed from: android.support.v4.app.e0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class ActivityCe0 extends Activity implements InterfaceCe, Ce.a {

    /* renamed from: c, reason: contains not printable characters */
    private Cf f۱۰۱۲۹c;

    public ActivityCe0() {
        new Cn();
        this.f۱۰۱۲۹c = new Cf(this);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentCm.m۸۸۵۱a(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        this.f۱۰۱۲۹c.m۸۸۳۷a(AbstractCc.b.CREATED);
        super.onSaveInstanceState(outState);
    }

    @Override // android.arch.lifecycle.InterfaceCe
    /* renamed from: a, reason: contains not printable characters */
    public AbstractCc mo۱۰۱۸۵a() {
        return this.f۱۰۱۲۹c;
    }

    @Override // android.support.v4.view.Ce.a
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۱۵۶۲a(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        View decor = getWindow().getDecorView();
        if (decor != null && Ce.m۱۰۸۳۸a(decor, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        View decor = getWindow().getDecorView();
        if (decor != null && Ce.m۱۰۸۳۸a(decor, event)) {
            return true;
        }
        return Ce.m۱۰۸۳۷a(this, decor, this, event);
    }
}
