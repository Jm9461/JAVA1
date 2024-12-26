package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.os.Build;
import android.support.p۰۴۳v4.widget.Cn;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.q  reason: invalid class name */
public class Cq extends PopupWindow {

    /* renamed from: b  reason: contains not printable characters */
    private static final boolean f۱۲۳۱۳b = (Build.VERSION.SDK_INT < 21);

    /* renamed from: a  reason: contains not printable characters */
    private boolean f۱۲۳۱۴a;

    public Cq(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        m۱۵۵۲۶a(context, attrs, defStyleAttr, defStyleRes);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۵۲۶a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        Cj1 a = Cj1.m۱۵۳۴۵a(context, attrs, Cj.PopupWindow, defStyleAttr, defStyleRes);
        if (a.m۱۵۳۶۴g(Cj.PopupWindow_overlapAnchor)) {
            m۱۵۵۲۷a(a.m۱۵۳۵۱a(Cj.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a.m۱۵۳۵۴b(Cj.PopupWindow_android_popupBackground));
        a.m۱۵۳۵۰a();
    }

    public void showAsDropDown(View anchor, int xoff, int yoff) {
        if (f۱۲۳۱۳b && this.f۱۲۳۱۴a) {
            yoff -= anchor.getHeight();
        }
        super.showAsDropDown(anchor, xoff, yoff);
    }

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

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۵۲۷a(boolean overlapAnchor) {
        if (f۱۲۳۱۳b) {
            this.f۱۲۳۱۴a = overlapAnchor;
        } else {
            Cn.m۱۳۲۹۵a(this, overlapAnchor);
        }
    }
}
