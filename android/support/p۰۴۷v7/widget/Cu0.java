package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.support.p۰۴۷v7.view.menu.Ch;
import android.support.p۰۴۷v7.view.menu.Co;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Cg;

/* renamed from: android.support.v7.widget.u0  reason: invalid class name */
public class Cu0 {

    /* renamed from: a  reason: contains not printable characters */
    private final Context f۱۲۳۴۳a;

    /* renamed from: b  reason: contains not printable characters */
    private final Ch f۱۲۳۴۴b;

    /* renamed from: c  reason: contains not printable characters */
    final Co f۱۲۳۴۵c;

    /* renamed from: d  reason: contains not printable characters */
    AbstractCd f۱۲۳۴۶d;

    /* renamed from: e  reason: contains not printable characters */
    AbstractCc f۱۲۳۴۷e;

    /* renamed from: android.support.v7.widget.u0$c  reason: invalid class name */
    public interface AbstractCc {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۵۶۳۷a(Cu0 u0Var);
    }

    /* renamed from: android.support.v7.widget.u0$d  reason: invalid class name */
    public interface AbstractCd {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Cu0(Context context, View anchor) {
        this(context, anchor, 0);
    }

    public Cu0(Context context, View anchor, int gravity) {
        this(context, anchor, gravity, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.popupMenuStyle, 0);
    }

    public Cu0(Context context, View anchor, int gravity, int popupStyleAttr, int popupStyleRes) {
        this.f۱۲۳۴۳a = context;
        this.f۱۲۳۴۴b = new Ch(context);
        this.f۱۲۳۴۴b.m۱۳۸۴۷a(new Ca());
        this.f۱۲۳۴۵c = new Co(context, this.f۱۲۳۴۴b, anchor, false, popupStyleAttr, popupStyleRes);
        this.f۱۲۳۴۵c.m۱۳۹۵۵a(gravity);
        this.f۱۲۳۴۵c.m۱۳۹۵۸a(new Cb());
    }

    /* renamed from: android.support.v7.widget.u0$a  reason: invalid class name */
    class Ca implements Ch.AbstractCa {
        Ca() {
        }

        @Override // android.support.p۰۴۷v7.view.menu.Ch.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۵۶۳۶a(Ch menu, MenuItem item) {
            AbstractCd dVar = Cu0.this.f۱۲۳۴۶d;
            if (dVar != null) {
                return dVar.onMenuItemClick(item);
            }
            return false;
        }

        @Override // android.support.p۰۴۷v7.view.menu.Ch.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۶۳۵a(Ch menu) {
        }
    }

    /* renamed from: android.support.v7.widget.u0$b  reason: invalid class name */
    class Cb implements PopupWindow.OnDismissListener {
        Cb() {
        }

        public void onDismiss() {
            Cu0 u0Var = Cu0.this;
            AbstractCc cVar = u0Var.f۱۲۳۴۷e;
            if (cVar != null) {
                cVar.m۱۵۶۳۷a(u0Var);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public Menu m۱۵۶۳۱a() {
        return this.f۱۲۳۴۴b;
    }

    /* renamed from: b  reason: contains not printable characters */
    public MenuInflater m۱۵۶۳۳b() {
        return new Cg(this.f۱۲۳۴۳a);
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۵۶۳۴c() {
        this.f۱۲۳۴۵c.m۱۳۹۶۴e();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۳۲a(AbstractCd listener) {
        this.f۱۲۳۴۶d = listener;
    }
}
