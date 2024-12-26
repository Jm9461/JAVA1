package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.Ch;
import android.support.v7.view.menu.Co;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.Cg;

/* renamed from: android.support.v7.widget.u0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cu0 {

    /* renamed from: a, reason: contains not printable characters */
    private final Context f۱۲۳۴۳a;

    /* renamed from: b, reason: contains not printable characters */
    private final Ch f۱۲۳۴۴b;

    /* renamed from: c, reason: contains not printable characters */
    final Co f۱۲۳۴۵c;

    /* renamed from: d, reason: contains not printable characters */
    d f۱۲۳۴۶d;

    /* renamed from: e, reason: contains not printable characters */
    c f۱۲۳۴۷e;

    /* renamed from: android.support.v7.widget.u0$c */
    public interface c {
        /* renamed from: a, reason: contains not printable characters */
        void m۱۳۵۶۷a(Cu0 cu0);
    }

    /* renamed from: android.support.v7.widget.u0$d */
    public interface d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Cu0(Context context, View anchor) {
        this(context, anchor, 0);
    }

    public Cu0(Context context, View anchor, int gravity) {
        this(context, anchor, gravity, Ca.popupMenuStyle, 0);
    }

    public Cu0(Context context, View anchor, int gravity, int popupStyleAttr, int popupStyleRes) {
        this.f۱۲۳۴۳a = context;
        this.f۱۲۳۴۴b = new Ch(context);
        this.f۱۲۳۴۴b.mo۱۱۹۳۷a(new a());
        this.f۱۲۳۴۵c = new Co(context, this.f۱۲۳۴۴b, anchor, false, popupStyleAttr, popupStyleRes);
        this.f۱۲۳۴۵c.m۱۱۸۸۵a(gravity);
        this.f۱۲۳۴۵c.m۱۱۸۸۸a(new b());
    }

    /* renamed from: android.support.v7.widget.u0$a */
    class a implements Ch.a {
        a() {
        }

        @Override // android.support.v7.view.menu.Ch.a
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۳۵۶۶a(Ch menu, MenuItem item) {
            d dVar = Cu0.this.f۱۲۳۴۶d;
            if (dVar != null) {
                return dVar.onMenuItemClick(item);
            }
            return false;
        }

        @Override // android.support.v7.view.menu.Ch.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۳۵۶۵a(Ch menu) {
        }
    }

    /* renamed from: android.support.v7.widget.u0$b */
    class b implements PopupWindow.OnDismissListener {
        b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            Cu0 cu0 = Cu0.this;
            c cVar = cu0.f۱۲۳۴۷e;
            if (cVar != null) {
                cVar.m۱۳۵۶۷a(cu0);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public Menu m۱۳۵۶۱a() {
        return this.f۱۲۳۴۴b;
    }

    /* renamed from: b, reason: contains not printable characters */
    public MenuInflater m۱۳۵۶۳b() {
        return new Cg(this.f۱۲۳۴۳a);
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۳۵۶۴c() {
        this.f۱۲۳۴۵c.m۱۱۸۹۴e();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۵۶۲a(d listener) {
        this.f۱۲۳۴۶d = listener;
    }
}
