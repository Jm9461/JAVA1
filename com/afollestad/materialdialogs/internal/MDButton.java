package com.afollestad.materialdialogs.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.Ci;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca;

@SuppressLint({"AppCompatCustomView"})
public class MDButton extends TextView {

    /* renamed from: c  reason: contains not printable characters */
    private boolean f۱۳۲۸۵c = false;

    /* renamed from: d  reason: contains not printable characters */
    private EnumCe f۱۳۲۸۶d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۳۲۸۷e;

    /* renamed from: f  reason: contains not printable characters */
    private Drawable f۱۳۲۸۸f;

    /* renamed from: g  reason: contains not printable characters */
    private Drawable f۱۳۲۸۹g;

    public MDButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        m۱۶۷۳۸a(context);
    }

    public MDButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m۱۶۷۳۸a(context);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۷۳۸a(Context context) {
        this.f۱۳۲۸۷e = context.getResources().getDimensionPixelSize(Ci.md_dialog_frame_margin);
        this.f۱۳۲۸۶d = EnumCe.END;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۷۳۹a(boolean stacked, boolean force) {
        if (this.f۱۳۲۸۵c != stacked || force) {
            setGravity(stacked ? this.f۱۳۲۸۶d.m۱۵۸۲۱a() | 16 : 17);
            if (Build.VERSION.SDK_INT >= 17) {
                setTextAlignment(stacked ? this.f۱۳۲۸۶d.m۱۵۸۲۲b() : 4);
            }
            Ca.m۱۵۸۹۷a(this, stacked ? this.f۱۳۲۸۸f : this.f۱۳۲۸۹g);
            if (stacked) {
                setPadding(this.f۱۳۲۸۷e, getPaddingTop(), this.f۱۳۲۸۷e, getPaddingBottom());
            }
            this.f۱۳۲۸۵c = stacked;
        }
    }

    public void setStackedGravity(EnumCe gravity) {
        this.f۱۳۲۸۶d = gravity;
    }

    public void setStackedSelector(Drawable d) {
        this.f۱۳۲۸۸f = d;
        if (this.f۱۳۲۸۵c) {
            m۱۶۷۳۹a(true, true);
        }
    }

    public void setDefaultSelector(Drawable d) {
        this.f۱۳۲۸۹g = d;
        if (!this.f۱۳۲۸۵c) {
            m۱۶۷۳۹a(false, true);
        }
    }

    public void setAllCapsCompat(boolean allCaps) {
        if (Build.VERSION.SDK_INT >= 14) {
            setAllCaps(allCaps);
        } else if (allCaps) {
            setTransformationMethod(new Ca(getContext()));
        } else {
            setTransformationMethod(null);
        }
    }
}
