package android.support.v7.widget;

import a.b.h.f.g;
import android.content.Context;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.o;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;

public class u0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f۲۲۵۵a;

    /* renamed from: b  reason: collision with root package name */
    private final h f۲۲۵۶b;

    /* renamed from: c  reason: collision with root package name */
    final o f۲۲۵۷c;

    /* renamed from: d  reason: collision with root package name */
    d f۲۲۵۸d;

    /* renamed from: e  reason: collision with root package name */
    c f۲۲۵۹e;

    public interface c {
        void a(u0 u0Var);
    }

    public interface d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public u0(Context context, View anchor) {
        this(context, anchor, 0);
    }

    public u0(Context context, View anchor, int gravity) {
        this(context, anchor, gravity, a.b.h.a.a.popupMenuStyle, 0);
    }

    public u0(Context context, View anchor, int gravity, int popupStyleAttr, int popupStyleRes) {
        this.f۲۲۵۵a = context;
        this.f۲۲۵۶b = new h(context);
        this.f۲۲۵۶b.a(new a());
        this.f۲۲۵۷c = new o(context, this.f۲۲۵۶b, anchor, false, popupStyleAttr, popupStyleRes);
        this.f۲۲۵۷c.a(gravity);
        this.f۲۲۵۷c.a(new b());
    }

    class a implements h.a {
        a() {
        }

        @Override // android.support.v7.view.menu.h.a
        public boolean a(h menu, MenuItem item) {
            d dVar = u0.this.f۲۲۵۸d;
            if (dVar != null) {
                return dVar.onMenuItemClick(item);
            }
            return false;
        }

        @Override // android.support.v7.view.menu.h.a
        public void a(h menu) {
        }
    }

    class b implements PopupWindow.OnDismissListener {
        b() {
        }

        public void onDismiss() {
            u0 u0Var = u0.this;
            c cVar = u0Var.f۲۲۵۹e;
            if (cVar != null) {
                cVar.a(u0Var);
            }
        }
    }

    public Menu a() {
        return this.f۲۲۵۶b;
    }

    public MenuInflater b() {
        return new g(this.f۲۲۵۵a);
    }

    public void c() {
        this.f۲۲۵۷c.e();
    }

    public void a(d listener) {
        this.f۲۲۵۸d = listener;
    }
}
