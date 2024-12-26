package android.support.design.widget;

import android.content.Context;
import android.support.p۰۴۳v4.view.Cb;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.view.p۰۴۵d0.Cc;
import android.support.p۰۴۷v7.widget.Cm;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;

public class CheckableImageButton extends Cm implements Checkable {

    /* renamed from: f  reason: contains not printable characters */
    private static final int[] f۹۶۰۷f = {16842912};

    /* renamed from: e  reason: contains not printable characters */
    private boolean f۹۶۰۸e;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attrs) {
        this(context, attrs, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Cu.m۱۲۹۸۵a(this, new Ca());
    }

    /* renamed from: android.support.design.widget.CheckableImageButton$a  reason: invalid class name */
    class Ca extends Cb {
        Ca() {
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۱۵۱۱b(View host, AccessibilityEvent event) {
            super.m۱۲۸۰۱b(host, event);
            event.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۵۱۰a(View host, Cc info2) {
            super.m۱۲۷۹۷a(host, info2);
            info2.m۱۲۸۵۲b(true);
            info2.m۱۲۸۵۸c(CheckableImageButton.this.isChecked());
        }
    }

    public void setChecked(boolean checked) {
        if (this.f۹۶۰۸e != checked) {
            this.f۹۶۰۸e = checked;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public boolean isChecked() {
        return this.f۹۶۰۸e;
    }

    public void toggle() {
        setChecked(!this.f۹۶۰۸e);
    }

    public int[] onCreateDrawableState(int extraSpace) {
        if (this.f۹۶۰۸e) {
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(f۹۶۰۷f.length + extraSpace), f۹۶۰۷f);
        }
        return super.onCreateDrawableState(extraSpace);
    }
}
