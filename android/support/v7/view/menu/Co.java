package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.view.Cu;
import android.support.v7.view.menu.InterfaceCp;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cd;

/* renamed from: android.support.v7.view.menu.o, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Co implements InterfaceCj {

    /* renamed from: a, reason: contains not printable characters */
    private final Context f۱۱۳۳۳a;

    /* renamed from: b, reason: contains not printable characters */
    private final Ch f۱۱۳۳۴b;

    /* renamed from: c, reason: contains not printable characters */
    private final boolean f۱۱۳۳۵c;

    /* renamed from: d, reason: contains not printable characters */
    private final int f۱۱۳۳۶d;

    /* renamed from: e, reason: contains not printable characters */
    private final int f۱۱۳۳۷e;

    /* renamed from: f, reason: contains not printable characters */
    private View f۱۱۳۳۸f;

    /* renamed from: g, reason: contains not printable characters */
    private int f۱۱۳۳۹g;

    /* renamed from: h, reason: contains not printable characters */
    private boolean f۱۱۳۴۰h;

    /* renamed from: i, reason: contains not printable characters */
    private InterfaceCp.a f۱۱۳۴۱i;

    /* renamed from: j, reason: contains not printable characters */
    private AbstractCn f۱۱۳۴۲j;

    /* renamed from: k, reason: contains not printable characters */
    private PopupWindow.OnDismissListener f۱۱۳۴۳k;

    /* renamed from: l, reason: contains not printable characters */
    private final PopupWindow.OnDismissListener f۱۱۳۴۴l;

    public Co(Context context, Ch menu, View anchorView, boolean overflowOnly, int popupStyleAttr) {
        this(context, menu, anchorView, overflowOnly, popupStyleAttr, 0);
    }

    public Co(Context context, Ch menu, View anchorView, boolean overflowOnly, int popupStyleAttr, int popupStyleRes) {
        this.f۱۱۳۳۹g = 8388611;
        this.f۱۱۳۴۴l = new a();
        this.f۱۱۳۳۳a = context;
        this.f۱۱۳۳۴b = menu;
        this.f۱۱۳۳۸f = anchorView;
        this.f۱۱۳۳۵c = overflowOnly;
        this.f۱۱۳۳۶d = popupStyleAttr;
        this.f۱۱۳۳۷e = popupStyleRes;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۸۸۸a(PopupWindow.OnDismissListener listener) {
        this.f۱۱۳۴۳k = listener;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۸۸۷a(View anchor) {
        this.f۱۱۳۳۸f = anchor;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۸۸۹a(boolean forceShowIcon) {
        this.f۱۱۳۴۰h = forceShowIcon;
        AbstractCn abstractCn = this.f۱۱۳۴۲j;
        if (abstractCn != null) {
            abstractCn.mo۱۱۹۲۹b(forceShowIcon);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۸۸۵a(int gravity) {
        this.f۱۱۳۳۹g = gravity;
    }

    /* renamed from: e, reason: contains not printable characters */
    public void m۱۱۸۹۴e() {
        if (!m۱۱۸۹۵f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public AbstractCn m۱۱۸۹۱b() {
        if (this.f۱۱۳۴۲j == null) {
            this.f۱۱۳۴۲j = m۱۱۸۸۳g();
        }
        return this.f۱۱۳۴۲j;
    }

    /* renamed from: f, reason: contains not printable characters */
    public boolean m۱۱۸۹۵f() {
        if (m۱۱۸۹۲c()) {
            return true;
        }
        if (this.f۱۱۳۳۸f == null) {
            return false;
        }
        m۱۱۸۸۲a(0, 0, false, false);
        return true;
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۱۸۹۰a(int x, int y) {
        if (m۱۱۸۹۲c()) {
            return true;
        }
        if (this.f۱۱۳۳۸f == null) {
            return false;
        }
        m۱۱۸۸۲a(x, y, true, true);
        return true;
    }

    /* renamed from: g, reason: contains not printable characters */
    private AbstractCn m۱۱۸۸۳g() {
        AbstractCn popup;
        WindowManager windowManager = (WindowManager) this.f۱۱۳۳۳a.getSystemService("window");
        Display display = windowManager.getDefaultDisplay();
        Point displaySize = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            display.getRealSize(displaySize);
        } else {
            display.getSize(displaySize);
        }
        int smallestWidth = Math.min(displaySize.x, displaySize.y);
        int minSmallestWidthCascading = this.f۱۱۳۳۳a.getResources().getDimensionPixelSize(Cd.abc_cascading_menus_min_smallest_width);
        boolean enableCascadingSubmenus = smallestWidth >= minSmallestWidthCascading;
        if (enableCascadingSubmenus) {
            popup = new ViewOnKeyListenerCe(this.f۱۱۳۳۳a, this.f۱۱۳۳۸f, this.f۱۱۳۳۶d, this.f۱۱۳۳۷e, this.f۱۱۳۳۵c);
        } else {
            popup = new ViewOnKeyListenerCu(this.f۱۱۳۳۳a, this.f۱۱۳۳۴b, this.f۱۱۳۳۸f, this.f۱۱۳۳۶d, this.f۱۱۳۳۷e, this.f۱۱۳۳۵c);
        }
        popup.mo۱۱۹۲۱a(this.f۱۱۳۳۴b);
        popup.mo۱۱۹۲۵a(this.f۱۱۳۴۴l);
        popup.mo۱۱۹۲۴a(this.f۱۱۳۳۸f);
        popup.mo۱۱۹۲۳a(this.f۱۱۳۴۱i);
        popup.mo۱۱۹۲۹b(this.f۱۱۳۴۰h);
        popup.mo۱۱۹۱۹a(this.f۱۱۳۳۹g);
        return popup;
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۱۸۸۲a(int xOffset, int yOffset, boolean useOffsets, boolean showTitle) {
        AbstractCn popup = m۱۱۸۹۱b();
        popup.mo۱۱۹۳۳c(showTitle);
        if (useOffsets) {
            int hgrav = android.support.v4.view.Cd.m۱۰۷۵۵a(this.f۱۱۳۳۹g, Cu.m۱۰۹۴۴k(this.f۱۱۳۳۸f)) & 7;
            if (hgrav == 5) {
                xOffset -= this.f۱۱۳۳۸f.getWidth();
            }
            popup.mo۱۱۹۲۸b(xOffset);
            popup.mo۱۱۹۳۲c(yOffset);
            float density = this.f۱۱۳۳۳a.getResources().getDisplayMetrics().density;
            int halfSize = (int) ((48.0f * density) / 2.0f);
            Rect epicenter = new Rect(xOffset - halfSize, yOffset - halfSize, xOffset + halfSize, yOffset + halfSize);
            popup.m۱۱۸۷۰a(epicenter);
        }
        popup.mo۱۳۵۷۵d();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۸۸۴a() {
        if (m۱۱۸۹۲c()) {
            this.f۱۱۳۴۲j.dismiss();
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    protected void mo۱۲۹۷۵d() {
        this.f۱۱۳۴۲j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f۱۱۳۴۳k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public boolean m۱۱۸۹۲c() {
        AbstractCn abstractCn = this.f۱۱۳۴۲j;
        return abstractCn != null && abstractCn.mo۱۳۴۳۳e();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۸۸۶a(InterfaceCp.a cb) {
        this.f۱۱۳۴۱i = cb;
        AbstractCn abstractCn = this.f۱۱۳۴۲j;
        if (abstractCn != null) {
            abstractCn.mo۱۱۹۲۳a(cb);
        }
    }

    /* renamed from: android.support.v7.view.menu.o$a */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            Co.this.mo۱۲۹۷۵d();
        }
    }
}
