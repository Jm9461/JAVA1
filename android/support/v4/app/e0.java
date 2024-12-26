package android.support.v4.app;

import a.b.g.g.n;
import android.app.Activity;
import android.arch.lifecycle.c;
import android.arch.lifecycle.e;
import android.arch.lifecycle.f;
import android.arch.lifecycle.m;
import android.os.Bundle;
import android.support.v4.view.e;
import android.view.KeyEvent;
import android.view.View;

public class e0 extends Activity implements e, e.a {

    /* renamed from: c  reason: collision with root package name */
    private f f۱۰۶۹c = new f(this);

    public e0() {
        new n();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m.a(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle outState) {
        this.f۱۰۶۹c.a(c.b.CREATED);
        super.onSaveInstanceState(outState);
    }

    @Override // android.arch.lifecycle.e
    public c a() {
        return this.f۱۰۶۹c;
    }

    @Override // android.support.v4.view.e.a
    public boolean a(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        View decor = getWindow().getDecorView();
        if (decor == null || !android.support.v4.view.e.a(decor, event)) {
            return super.dispatchKeyShortcutEvent(event);
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        View decor = getWindow().getDecorView();
        if (decor == null || !android.support.v4.view.e.a(decor, event)) {
            return android.support.v4.view.e.a(this, decor, this, event);
        }
        return true;
    }
}
