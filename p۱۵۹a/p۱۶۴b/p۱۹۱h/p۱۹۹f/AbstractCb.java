package p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: a.b.h.f.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCb {

    /* renamed from: c, reason: contains not printable characters */
    private Object f۸۸۷۹c;

    /* renamed from: d, reason: contains not printable characters */
    private boolean f۸۸۸۰d;

    /* renamed from: a.b.h.f.b$a */
    public interface a {
        /* renamed from: a, reason: contains not printable characters */
        void mo۱۱۵۳۸a(AbstractCb abstractCb);

        /* renamed from: a, reason: contains not printable characters */
        boolean mo۱۱۵۳۹a(AbstractCb abstractCb, Menu menu);

        /* renamed from: a, reason: contains not printable characters */
        boolean mo۱۱۵۴۰a(AbstractCb abstractCb, MenuItem menuItem);

        /* renamed from: b, reason: contains not printable characters */
        boolean mo۱۱۵۴۱b(AbstractCb abstractCb, Menu menu);
    }

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۱۶۴۸a();

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۱۶۴۹a(int i);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۱۶۵۱a(View view);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۱۶۵۲a(CharSequence charSequence);

    /* renamed from: b, reason: contains not printable characters */
    public abstract View mo۱۱۶۵۵b();

    /* renamed from: b, reason: contains not printable characters */
    public abstract void mo۱۱۶۵۶b(int i);

    /* renamed from: b, reason: contains not printable characters */
    public abstract void mo۱۱۶۵۷b(CharSequence charSequence);

    /* renamed from: c, reason: contains not printable characters */
    public abstract Menu mo۱۱۶۵۸c();

    /* renamed from: d, reason: contains not printable characters */
    public abstract MenuInflater mo۱۱۶۵۹d();

    /* renamed from: e, reason: contains not printable characters */
    public abstract CharSequence mo۱۱۶۶۰e();

    /* renamed from: g, reason: contains not printable characters */
    public abstract CharSequence mo۱۱۶۶۱g();

    /* renamed from: i, reason: contains not printable characters */
    public abstract void mo۱۱۶۶۲i();

    /* renamed from: j, reason: contains not printable characters */
    public abstract boolean mo۱۱۶۶۳j();

    /* renamed from: a, reason: contains not printable characters */
    public void m۸۷۰۷a(Object tag) {
        this.f۸۸۷۹c = tag;
    }

    /* renamed from: f, reason: contains not printable characters */
    public Object m۸۷۱۵f() {
        return this.f۸۸۷۹c;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۶۵۳a(boolean titleOptional) {
        this.f۸۸۸۰d = titleOptional;
    }

    /* renamed from: h, reason: contains not printable characters */
    public boolean m۸۷۱۷h() {
        return this.f۸۸۸۰d;
    }
}
