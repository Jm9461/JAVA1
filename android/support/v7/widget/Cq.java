package android.support.v7.widget;

import android.content.Context;
import android.os.Build;
import android.support.v4.widget.Cn;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj;

/* renamed from: android.support.v7.widget.q, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cq extends PopupWindow {

    /* renamed from: b, reason: contains not printable characters */
    private static final boolean f۱۲۳۱۳b;

    /* renamed from: a, reason: contains not printable characters */
    private boolean f۱۲۳۱۴a;

    static {
        f۱۲۳۱۳b = Build.VERSION.SDK_INT < 21;
    }

    public Cq(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        m۱۳۴۵۶a(context, attrs, defStyleAttr, defStyleRes);
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۴۵۶a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        Cj1 a2 = Cj1.m۱۳۲۷۵a(context, attrs, Cj.PopupWindow, defStyleAttr, defStyleRes);
        if (a2.m۱۳۲۹۴g(Cj.PopupWindow_overlapAnchor)) {
            m۱۳۴۵۷a(a2.m۱۳۲۸۱a(Cj.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a2.m۱۳۲۸۴b(Cj.PopupWindow_android_popupBackground));
        a2.m۱۳۲۸۰a();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View anchor, int xoff, int yoff) {
        if (f۱۲۳۱۳b && this.f۱۲۳۱۴a) {
            yoff -= anchor.getHeight();
        }
        super.showAsDropDown(anchor, xoff, yoff);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View anchor, int xoff, int yoff, int gravity) {
        if (f۱۲۳۱۳b && this.f۱۲۳۱۴a) {
            yoff -= anchor.getHeight();
        }
        super.showAsDropDown(anchor, xoff, yoff, gravity);
    }

    @Override // android.widget.PopupWindow
    public void update(View anchor, int xoff, int yoff, int width, int height) {
        if (f۱۲۳۱۳b && this.f۱۲۳۱۴a) {
            yoff -= anchor.getHeight();
        }
        super.update(anchor, xoff, yoff, width, height);
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۴۵۷a(boolean overlapAnchor) {
        if (f۱۲۳۱۳b) {
            this.f۱۲۳۱۴a = overlapAnchor;
        } else {
            Cn.m۱۱۲۲۵a(this, overlapAnchor);
        }
    }
}
