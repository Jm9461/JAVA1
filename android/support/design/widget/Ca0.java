package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: android.support.design.widget.a0  reason: invalid class name */
public class Ca0 extends ImageButton {

    /* renamed from: c  reason: contains not printable characters */
    private int f۹۸۵۰c;

    public Ca0(Context context) {
        this(context, null);
    }

    public Ca0(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Ca0(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۹۸۵۰c = getVisibility();
    }

    public void setVisibility(int visibility) {
        m۱۱۸۰۰a(visibility, true);
    }

    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۱۸۰۰a(int visibility, boolean fromUser) {
        super.setVisibility(visibility);
        if (fromUser) {
            this.f۹۸۵۰c = visibility;
        }
    }

    public final int getUserSetVisibility() {
        return this.f۹۸۵۰c;
    }
}
