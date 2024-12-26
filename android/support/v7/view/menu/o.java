package android.support.v7.view.menu;

import a.b.h.a.d;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.view.u;
import android.support.v7.view.menu.p;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

public class o implements j {

    /* renamed from: a  reason: collision with root package name */
    private final Context f۱۷۲۹a;

    /* renamed from: b  reason: collision with root package name */
    private final h f۱۷۳۰b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f۱۷۳۱c;

    /* renamed from: d  reason: collision with root package name */
    private final int f۱۷۳۲d;

    /* renamed from: e  reason: collision with root package name */
    private final int f۱۷۳۳e;

    /* renamed from: f  reason: collision with root package name */
    private View f۱۷۳۴f;

    /* renamed from: g  reason: collision with root package name */
    private int f۱۷۳۵g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f۱۷۳۶h;
    private p.a i;
    private n j;
    private PopupWindow.OnDismissListener k;
    private final PopupWindow.OnDismissListener l;

    public o(Context context, h menu, View anchorView, boolean overflowOnly, int popupStyleAttr) {
        this(context, menu, anchorView, overflowOnly, popupStyleAttr, 0);
    }

    public o(Context context, h menu, View anchorView, boolean overflowOnly, int popupStyleAttr, int popupStyleRes) {
        this.f۱۷۳۵g = 8388611;
        this.l = new a();
        this.f۱۷۲۹a = context;
        this.f۱۷۳۰b = menu;
        this.f۱۷۳۴f = anchorView;
        this.f۱۷۳۱c = overflowOnly;
        this.f۱۷۳۲d = popupStyleAttr;
        this.f۱۷۳۳e = popupStyleRes;
    }

    public void a(PopupWindow.OnDismissListener listener) {
        this.k = listener;
    }

    public void a(View anchor) {
        this.f۱۷۳۴f = anchor;
    }

    public void a(boolean forceShowIcon) {
        this.f۱۷۳۶h = forceShowIcon;
        n nVar = this.j;
        if (nVar != null) {
            nVar.b(forceShowIcon);
        }
    }

    public void a(int gravity) {
        this.f۱۷۳۵g = gravity;
    }

    public void e() {
        if (!f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public n b() {
        if (this.j == null) {
            this.j = g();
        }
        return this.j;
    }

    public boolean f() {
        if (c()) {
            return true;
        }
        if (this.f۱۷۳۴f == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }

    public boolean a(int x, int y) {
        if (c()) {
            return true;
        }
        if (this.f۱۷۳۴f == null) {
            return false;
        }
        a(x, y, true, true);
        return true;
    }

    private n g() {
        n popup;
        Display display = ((WindowManager) this.f۱۷۲۹a.getSystemService("window")).getDefaultDisplay();
        Point displaySize = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            display.getRealSize(displaySize);
        } else {
            display.getSize(displaySize);
        }
        if (Math.min(displaySize.x, displaySize.y) >= this.f۱۷۲۹a.getResources().getDimensionPixelSize(d.abc_cascading_menus_min_smallest_width)) {
            popup = new e(this.f۱۷۲۹a, this.f۱۷۳۴f, this.f۱۷۳۲d, this.f۱۷۳۳e, this.f۱۷۳۱c);
        } else {
            popup = new u(this.f۱۷۲۹a, this.f۱۷۳۰b, this.f۱۷۳۴f, this.f۱۷۳۲d, this.f۱۷۳۳e, this.f۱۷۳۱c);
        }
        popup.a(this.f۱۷۳۰b);
        popup.a(this.l);
        popup.a(this.f۱۷۳۴f);
        popup.a(this.i);
        popup.b(this.f۱۷۳۶h);
        popup.a(this.f۱۷۳۵g);
        return popup;
    }

    private void a(int xOffset, int yOffset, boolean useOffsets, boolean showTitle) {
        n popup = b();
        popup.c(showTitle);
        if (useOffsets) {
            if ((android.support.v4.view.d.a(this.f۱۷۳۵g, u.k(this.f۱۷۳۴f)) & 7) == 5) {
                xOffset -= this.f۱۷۳۴f.getWidth();
            }
            popup.b(xOffset);
            popup.c(yOffset);
            int halfSize = (int) ((48.0f * this.f۱۷۲۹a.getResources().getDisplayMetrics().density) / 2.0f);
            popup.a(new Rect(xOffset - halfSize, yOffset - halfSize, xOffset + halfSize, yOffset + halfSize));
        }
        popup.d();
    }

    public void a() {
        if (c()) {
            this.j.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean c() {
        n nVar = this.j;
        return nVar != null && nVar.e();
    }

    public void a(p.a cb) {
        this.i = cb;
        n nVar = this.j;
        if (nVar != null) {
            nVar.a(cb);
        }
    }

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        public void onDismiss() {
            o.this.d();
        }
    }
}
