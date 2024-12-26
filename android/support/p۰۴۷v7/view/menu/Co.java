package android.support.p۰۴۷v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۷v7.view.menu.AbstractCp;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cd;

/* renamed from: android.support.v7.view.menu.o  reason: invalid class name */
public class Co implements AbstractCj {

    /* renamed from: a  reason: contains not printable characters */
    private final Context f۱۱۳۳۳a;

    /* renamed from: b  reason: contains not printable characters */
    private final Ch f۱۱۳۳۴b;

    /* renamed from: c  reason: contains not printable characters */
    private final boolean f۱۱۳۳۵c;

    /* renamed from: d  reason: contains not printable characters */
    private final int f۱۱۳۳۶d;

    /* renamed from: e  reason: contains not printable characters */
    private final int f۱۱۳۳۷e;

    /* renamed from: f  reason: contains not printable characters */
    private View f۱۱۳۳۸f;

    /* renamed from: g  reason: contains not printable characters */
    private int f۱۱۳۳۹g;

    /* renamed from: h  reason: contains not printable characters */
    private boolean f۱۱۳۴۰h;

    /* renamed from: i  reason: contains not printable characters */
    private AbstractCp.AbstractCa f۱۱۳۴۱i;

    /* renamed from: j  reason: contains not printable characters */
    private AbstractCn f۱۱۳۴۲j;

    /* renamed from: k  reason: contains not printable characters */
    private PopupWindow.OnDismissListener f۱۱۳۴۳k;

    /* renamed from: l  reason: contains not printable characters */
    private final PopupWindow.OnDismissListener f۱۱۳۴۴l;

    public Co(Context context, Ch menu, View anchorView, boolean overflowOnly, int popupStyleAttr) {
        this(context, menu, anchorView, overflowOnly, popupStyleAttr, 0);
    }

    public Co(Context context, Ch menu, View anchorView, boolean overflowOnly, int popupStyleAttr, int popupStyleRes) {
        this.f۱۱۳۳۹g = 8388611;
        this.f۱۱۳۴۴l = new Ca();
        this.f۱۱۳۳۳a = context;
        this.f۱۱۳۳۴b = menu;
        this.f۱۱۳۳۸f = anchorView;
        this.f۱۱۳۳۵c = overflowOnly;
        this.f۱۱۳۳۶d = popupStyleAttr;
        this.f۱۱۳۳۷e = popupStyleRes;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۵۸a(PopupWindow.OnDismissListener listener) {
        this.f۱۱۳۴۳k = listener;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۵۷a(View anchor) {
        this.f۱۱۳۳۸f = anchor;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۵۹a(boolean forceShowIcon) {
        this.f۱۱۳۴۰h = forceShowIcon;
        AbstractCn nVar = this.f۱۱۳۴۲j;
        if (nVar != null) {
            nVar.m۱۳۹۴۶b(forceShowIcon);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۵۵a(int gravity) {
        this.f۱۱۳۳۹g = gravity;
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۳۹۶۴e() {
        if (!m۱۳۹۶۵f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public AbstractCn m۱۳۹۶۱b() {
        if (this.f۱۱۳۴۲j == null) {
            this.f۱۱۳۴۲j = m۱۳۹۵۳g();
        }
        return this.f۱۱۳۴۲j;
    }

    /* renamed from: f  reason: contains not printable characters */
    public boolean m۱۳۹۶۵f() {
        if (m۱۳۹۶۲c()) {
            return true;
        }
        if (this.f۱۱۳۳۸f == null) {
            return false;
        }
        m۱۳۹۵۲a(0, 0, false, false);
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۹۶۰a(int x, int y) {
        if (m۱۳۹۶۲c()) {
            return true;
        }
        if (this.f۱۱۳۳۸f == null) {
            return false;
        }
        m۱۳۹۵۲a(x, y, true, true);
        return true;
    }

    /* renamed from: g  reason: contains not printable characters */
    private AbstractCn m۱۳۹۵۳g() {
        AbstractCn popup;
        Display display = ((WindowManager) this.f۱۱۳۳۳a.getSystemService("window")).getDefaultDisplay();
        Point displaySize = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            display.getRealSize(displaySize);
        } else {
            display.getSize(displaySize);
        }
        if (Math.min(displaySize.x, displaySize.y) >= this.f۱۱۳۳۳a.getResources().getDimensionPixelSize(Cd.abc_cascading_menus_min_smallest_width)) {
            popup = new View$OnKeyListenerCe(this.f۱۱۳۳۳a, this.f۱۱۳۳۸f, this.f۱۱۳۳۶d, this.f۱۱۳۳۷e, this.f۱۱۳۳۵c);
        } else {
            popup = new View$OnKeyListenerCu(this.f۱۱۳۳۳a, this.f۱۱۳۳۴b, this.f۱۱۳۳۸f, this.f۱۱۳۳۶d, this.f۱۱۳۳۷e, this.f۱۱۳۳۵c);
        }
        popup.m۱۳۹۴۱a(this.f۱۱۳۳۴b);
        popup.m۱۳۹۴۳a(this.f۱۱۳۴۴l);
        popup.m۱۳۹۴۲a(this.f۱۱۳۳۸f);
        popup.m۱۳۹۷۰a(this.f۱۱۳۴۱i);
        popup.m۱۳۹۴۶b(this.f۱۱۳۴۰h);
        popup.m۱۳۹۳۸a(this.f۱۱۳۳۹g);
        return popup;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۳۹۵۲a(int xOffset, int yOffset, boolean useOffsets, boolean showTitle) {
        AbstractCn popup = m۱۳۹۶۱b();
        popup.m۱۳۹۴۹c(showTitle);
        if (useOffsets) {
            if ((android.support.p۰۴۳v4.view.Cd.m۱۲۸۲۵a(this.f۱۱۳۳۹g, Cu.m۱۳۰۱۴k(this.f۱۱۳۳۸f)) & 7) == 5) {
                xOffset -= this.f۱۱۳۳۸f.getWidth();
            }
            popup.m۱۳۹۴۵b(xOffset);
            popup.m۱۳۹۴۸c(yOffset);
            int halfSize = (int) ((48.0f * this.f۱۱۳۳۳a.getResources().getDisplayMetrics().density) / 2.0f);
            popup.m۱۳۹۴۰a(new Rect(xOffset - halfSize, yOffset - halfSize, xOffset + halfSize, yOffset + halfSize));
        }
        popup.m۱۳۹۸۵d();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۵۴a() {
        if (m۱۳۹۶۲c()) {
            this.f۱۱۳۴۲j.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۳۹۶۳d() {
        this.f۱۱۳۴۲j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f۱۱۳۴۳k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۳۹۶۲c() {
        AbstractCn nVar = this.f۱۱۳۴۲j;
        return nVar != null && nVar.m۱۳۹۸۶e();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۵۶a(AbstractCp.AbstractCa cb) {
        this.f۱۱۳۴۱i = cb;
        AbstractCn nVar = this.f۱۱۳۴۲j;
        if (nVar != null) {
            nVar.m۱۳۹۷۰a(cb);
        }
    }

    /* renamed from: android.support.v7.view.menu.o$a  reason: invalid class name */
    class Ca implements PopupWindow.OnDismissListener {
        Ca() {
        }

        public void onDismiss() {
            Co.this.m۱۳۹۶۳d();
        }
    }
}
