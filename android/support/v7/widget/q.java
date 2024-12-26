package android.support.v7.widget;

import a.b.h.a.j;
import android.content.Context;
import android.os.Build;
import android.support.v4.widget.n;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* access modifiers changed from: package-private */
public class q extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f۲۲۳۲b = (Build.VERSION.SDK_INT < 21);

    /* renamed from: a  reason: collision with root package name */
    private boolean f۲۲۳۳a;

    public q(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        a(context, attrs, defStyleAttr, defStyleRes);
    }

    private void a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        j1 a2 = j1.a(context, attrs, j.PopupWindow, defStyleAttr, defStyleRes);
        if (a2.g(j.PopupWindow_overlapAnchor)) {
            a(a2.a(j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a2.b(j.PopupWindow_android_popupBackground));
        a2.a();
    }

    public void showAsDropDown(View anchor, int xoff, int yoff) {
        if (f۲۲۳۲b && this.f۲۲۳۳a) {
            yoff -= anchor.getHeight();
        }
        super.showAsDropDown(anchor, xoff, yoff);
    }

    public void showAsDropDown(View anchor, int xoff, int yoff, int gravity) {
        if (f۲۲۳۲b && this.f۲۲۳۳a) {
            yoff -= anchor.getHeight();
        }
        super.showAsDropDown(anchor, xoff, yoff, gravity);
    }

    @Override // android.widget.PopupWindow
    public void update(View anchor, int xoff, int yoff, int width, int height) {
        if (f۲۲۳۲b && this.f۲۲۳۳a) {
            yoff -= anchor.getHeight();
        }
        super.update(anchor, xoff, yoff, width, height);
    }

    private void a(boolean overlapAnchor) {
        if (f۲۲۳۲b) {
            this.f۲۲۳۳a = overlapAnchor;
        } else {
            n.a(this, overlapAnchor);
        }
    }
}
