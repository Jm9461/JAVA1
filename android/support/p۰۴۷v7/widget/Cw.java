package android.support.p۰۴۷v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p۰۴۳v4.content.p۰۴۴e.Cf;
import android.support.p۰۴۳v4.widget.AbstractCb;
import android.support.p۰۴۳v4.widget.Cp;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.w  reason: invalid class name */
public class Cw {

    /* renamed from: a  reason: contains not printable characters */
    private final TextView f۱۲۳۷۴a;

    /* renamed from: b  reason: contains not printable characters */
    private Ch1 f۱۲۳۷۵b;

    /* renamed from: c  reason: contains not printable characters */
    private Ch1 f۱۲۳۷۶c;

    /* renamed from: d  reason: contains not printable characters */
    private Ch1 f۱۲۳۷۷d;

    /* renamed from: e  reason: contains not printable characters */
    private Ch1 f۱۲۳۷۸e;

    /* renamed from: f  reason: contains not printable characters */
    private Ch1 f۱۲۳۷۹f;

    /* renamed from: g  reason: contains not printable characters */
    private Ch1 f۱۲۳۸۰g;

    /* renamed from: h  reason: contains not printable characters */
    private final Cx f۱۲۳۸۱h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۲۳۸۲i = 0;

    /* renamed from: j  reason: contains not printable characters */
    private Typeface f۱۲۳۸۳j;

    /* renamed from: k  reason: contains not printable characters */
    private boolean f۱۲۳۸۴k;

    Cw(TextView view) {
        this.f۱۲۳۷۴a = view;
        this.f۱۲۳۸۱h = new Cx(this.f۱۲۳۷۴a);
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۶۴a(AttributeSet attrs, int defStyleAttr) {
        Context context = this.f۱۲۳۷۴a.getContext();
        Cj drawableManager = Cj.m۱۵۲۸۷a();
        Cj1 a = Cj1.m۱۵۳۴۵a(context, attrs, Cj.AppCompatTextHelper, defStyleAttr, 0);
        int ap = a.m۱۵۳۶۳g(Cj.AppCompatTextHelper_android_textAppearance, -1);
        if (a.m۱۵۳۶۴g(Cj.AppCompatTextHelper_android_drawableLeft)) {
            this.f۱۲۳۷۵b = m۱۵۶۵۵a(context, drawableManager, a.m۱۵۳۶۳g(Cj.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a.m۱۵۳۶۴g(Cj.AppCompatTextHelper_android_drawableTop)) {
            this.f۱۲۳۷۶c = m۱۵۶۵۵a(context, drawableManager, a.m۱۵۳۶۳g(Cj.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a.m۱۵۳۶۴g(Cj.AppCompatTextHelper_android_drawableRight)) {
            this.f۱۲۳۷۷d = m۱۵۶۵۵a(context, drawableManager, a.m۱۵۳۶۳g(Cj.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a.m۱۵۳۶۴g(Cj.AppCompatTextHelper_android_drawableBottom)) {
            this.f۱۲۳۷۸e = m۱۵۶۵۵a(context, drawableManager, a.m۱۵۳۶۳g(Cj.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (a.m۱۵۳۶۴g(Cj.AppCompatTextHelper_android_drawableStart)) {
                this.f۱۲۳۷۹f = m۱۵۶۵۵a(context, drawableManager, a.m۱۵۳۶۳g(Cj.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (a.m۱۵۳۶۴g(Cj.AppCompatTextHelper_android_drawableEnd)) {
                this.f۱۲۳۸۰g = m۱۵۶۵۵a(context, drawableManager, a.m۱۵۳۶۳g(Cj.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        a.m۱۵۳۵۰a();
        boolean hasPwdTm = this.f۱۲۳۷۴a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean allCaps = false;
        boolean allCapsSet = false;
        ColorStateList textColor = null;
        ColorStateList textColorHint = null;
        ColorStateList textColorLink = null;
        if (ap != -1) {
            Cj1 a2 = Cj1.m۱۵۳۴۳a(context, ap, Cj.TextAppearance);
            if (!hasPwdTm && a2.m۱۵۳۶۴g(Cj.TextAppearance_textAllCaps)) {
                allCaps = a2.m۱۵۳۵۱a(Cj.TextAppearance_textAllCaps, false);
                allCapsSet = true;
            }
            m۱۵۶۵۶a(context, a2);
            if (Build.VERSION.SDK_INT < 23) {
                if (a2.m۱۵۳۶۴g(Cj.TextAppearance_android_textColor)) {
                    textColor = a2.m۱۵۳۴۸a(Cj.TextAppearance_android_textColor);
                }
                if (a2.m۱۵۳۶۴g(Cj.TextAppearance_android_textColorHint)) {
                    textColorHint = a2.m۱۵۳۴۸a(Cj.TextAppearance_android_textColorHint);
                }
                if (a2.m۱۵۳۶۴g(Cj.TextAppearance_android_textColorLink)) {
                    textColorLink = a2.m۱۵۳۴۸a(Cj.TextAppearance_android_textColorLink);
                }
            }
            a2.m۱۵۳۵۰a();
        }
        Cj1 a3 = Cj1.m۱۵۳۴۵a(context, attrs, Cj.TextAppearance, defStyleAttr, 0);
        if (!hasPwdTm && a3.m۱۵۳۶۴g(Cj.TextAppearance_textAllCaps)) {
            allCapsSet = true;
            allCaps = a3.m۱۵۳۵۱a(Cj.TextAppearance_textAllCaps, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a3.m۱۵۳۶۴g(Cj.TextAppearance_android_textColor)) {
                textColor = a3.m۱۵۳۴۸a(Cj.TextAppearance_android_textColor);
            }
            if (a3.m۱۵۳۶۴g(Cj.TextAppearance_android_textColorHint)) {
                textColorHint = a3.m۱۵۳۴۸a(Cj.TextAppearance_android_textColorHint);
            }
            if (a3.m۱۵۳۶۴g(Cj.TextAppearance_android_textColorLink)) {
                textColorLink = a3.m۱۵۳۴۸a(Cj.TextAppearance_android_textColorLink);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && a3.m۱۵۳۶۴g(Cj.TextAppearance_android_textSize) && a3.m۱۵۳۵۵c(Cj.TextAppearance_android_textSize, -1) == 0) {
            this.f۱۲۳۷۴a.setTextSize(0, 0.0f);
        }
        m۱۵۶۵۶a(context, a3);
        a3.m۱۵۳۵۰a();
        if (textColor != null) {
            this.f۱۲۳۷۴a.setTextColor(textColor);
        }
        if (textColorHint != null) {
            this.f۱۲۳۷۴a.setHintTextColor(textColorHint);
        }
        if (textColorLink != null) {
            this.f۱۲۳۷۴a.setLinkTextColor(textColorLink);
        }
        if (!hasPwdTm && allCapsSet) {
            m۱۵۶۶۶a(allCaps);
        }
        Typeface typeface = this.f۱۲۳۸۳j;
        if (typeface != null) {
            this.f۱۲۳۷۴a.setTypeface(typeface, this.f۱۲۳۸۲i);
        }
        this.f۱۲۳۸۱h.m۱۵۶۹۶a(attrs, defStyleAttr);
        if (AbstractCb.f۱۰۷۶۳a) {
            if (this.f۱۲۳۸۱h.m۱۵۷۰۲f() != 0) {
                int[] autoSizeTextSizesInPx = this.f۱۲۳۸۱h.m۱۵۷۰۱e();
                if (autoSizeTextSizesInPx.length > 0) {
                    if (((float) this.f۱۲۳۷۴a.getAutoSizeStepGranularity()) != -1.0f) {
                        this.f۱۲۳۷۴a.setAutoSizeTextTypeUniformWithConfiguration(this.f۱۲۳۸۱h.m۱۵۶۹۹c(), this.f۱۲۳۸۱h.m۱۵۶۹۸b(), this.f۱۲۳۸۱h.m۱۵۷۰۰d(), 0);
                    } else {
                        this.f۱۲۳۷۴a.setAutoSizeTextTypeUniformWithPresetSizes(autoSizeTextSizesInPx, 0);
                    }
                }
            }
        }
        Cj1 a4 = Cj1.m۱۵۳۴۴a(context, attrs, Cj.AppCompatTextView);
        int firstBaselineToTopHeight = a4.m۱۵۳۵۵c(Cj.AppCompatTextView_firstBaselineToTopHeight, -1);
        int lastBaselineToBottomHeight = a4.m۱۵۳۵۵c(Cj.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int lineHeight = a4.m۱۵۳۵۵c(Cj.AppCompatTextView_lineHeight, -1);
        a4.m۱۵۳۵۰a();
        if (firstBaselineToTopHeight != -1) {
            Cp.m۱۳۳۰۲a(this.f۱۲۳۷۴a, firstBaselineToTopHeight);
        }
        if (lastBaselineToBottomHeight != -1) {
            Cp.m۱۳۳۰۸b(this.f۱۲۳۷۴a, lastBaselineToBottomHeight);
        }
        if (lineHeight != -1) {
            Cp.m۱۳۳۱۰c(this.f۱۲۳۷۴a, lineHeight);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۶۵۶a(Context context, Cj1 a) {
        String fontFamilyName;
        this.f۱۲۳۸۲i = a.m۱۵۳۵۷d(Cj.TextAppearance_android_textStyle, this.f۱۲۳۸۲i);
        boolean z = false;
        if (a.m۱۵۳۶۴g(Cj.TextAppearance_android_fontFamily) || a.m۱۵۳۶۴g(Cj.TextAppearance_fontFamily)) {
            this.f۱۲۳۸۳j = null;
            int fontFamilyId = a.m۱۵۳۶۴g(Cj.TextAppearance_fontFamily) ? Cj.TextAppearance_fontFamily : Cj.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                try {
                    this.f۱۲۳۸۳j = a.m۱۵۳۴۹a(fontFamilyId, this.f۱۲۳۸۲i, new Ca(new WeakReference<>(this.f۱۲۳۷۴a)));
                    if (this.f۱۲۳۸۳j == null) {
                        z = true;
                    }
                    this.f۱۲۳۸۴k = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException e) {
                }
            }
            if (this.f۱۲۳۸۳j == null && (fontFamilyName = a.m۱۵۳۵۸d(fontFamilyId)) != null) {
                this.f۱۲۳۸۳j = Typeface.create(fontFamilyName, this.f۱۲۳۸۲i);
            }
        } else if (a.m۱۵۳۶۴g(Cj.TextAppearance_android_typeface)) {
            this.f۱۲۳۸۴k = false;
            int typefaceIndex = a.m۱۵۳۵۷d(Cj.TextAppearance_android_typeface, 1);
            if (typefaceIndex == 1) {
                this.f۱۲۳۸۳j = Typeface.SANS_SERIF;
            } else if (typefaceIndex == 2) {
                this.f۱۲۳۸۳j = Typeface.SERIF;
            } else if (typefaceIndex == 3) {
                this.f۱۲۳۸۳j = Typeface.MONOSPACE;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.w$a  reason: invalid class name */
    public class Ca extends Cf.AbstractCa {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ WeakReference f۱۲۳۸۵a;

        Ca(WeakReference weakReference) {
            this.f۱۲۳۸۵a = weakReference;
        }

        @Override // android.support.p۰۴۳v4.content.p۰۴۴e.Cf.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۶۷۷a(Typeface typeface) {
            Cw.this.m۱۵۶۶۵a(this.f۱۲۳۸۵a, typeface);
        }

        @Override // android.support.p۰۴۳v4.content.p۰۴۴e.Cf.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۶۷۶a(int reason) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۶۵a(WeakReference<TextView> textViewWeak, Typeface typeface) {
        if (this.f۱۲۳۸۴k) {
            this.f۱۲۳۸۳j = typeface;
            TextView textView = textViewWeak.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f۱۲۳۸۲i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۶۳a(Context context, int resId) {
        ColorStateList textColor;
        Cj1 a = Cj1.m۱۵۳۴۳a(context, resId, Cj.TextAppearance);
        if (a.m۱۵۳۶۴g(Cj.TextAppearance_textAllCaps)) {
            m۱۵۶۶۶a(a.m۱۵۳۵۱a(Cj.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a.m۱۵۳۶۴g(Cj.TextAppearance_android_textColor) && (textColor = a.m۱۵۳۴۸a(Cj.TextAppearance_android_textColor)) != null) {
            this.f۱۲۳۷۴a.setTextColor(textColor);
        }
        if (a.m۱۵۳۶۴g(Cj.TextAppearance_android_textSize) && a.m۱۵۳۵۵c(Cj.TextAppearance_android_textSize, -1) == 0) {
            this.f۱۲۳۷۴a.setTextSize(0, 0.0f);
        }
        m۱۵۶۵۶a(context, a);
        a.m۱۵۳۵۰a();
        Typeface typeface = this.f۱۲۳۸۳j;
        if (typeface != null) {
            this.f۱۲۳۷۴a.setTypeface(typeface, this.f۱۲۳۸۲i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۶۶a(boolean allCaps) {
        this.f۱۲۳۷۴a.setAllCaps(allCaps);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۵۹a() {
        if (!(this.f۱۲۳۷۵b == null && this.f۱۲۳۷۶c == null && this.f۱۲۳۷۷d == null && this.f۱۲۳۷۸e == null)) {
            Drawable[] compoundDrawables = this.f۱۲۳۷۴a.getCompoundDrawables();
            m۱۵۶۵۷a(compoundDrawables[0], this.f۱۲۳۷۵b);
            m۱۵۶۵۷a(compoundDrawables[1], this.f۱۲۳۷۶c);
            m۱۵۶۵۷a(compoundDrawables[2], this.f۱۲۳۷۷d);
            m۱۵۶۵۷a(compoundDrawables[3], this.f۱۲۳۷۸e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f۱۲۳۷۹f != null || this.f۱۲۳۸۰g != null) {
            Drawable[] compoundDrawables2 = this.f۱۲۳۷۴a.getCompoundDrawablesRelative();
            m۱۵۶۵۷a(compoundDrawables2[0], this.f۱۲۳۷۹f);
            m۱۵۶۵۷a(compoundDrawables2[2], this.f۱۲۳۸۰g);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۶۵۷a(Drawable drawable, Ch1 info2) {
        if (drawable != null && info2 != null) {
            Cj.m۱۵۲۹۰a(drawable, info2, this.f۱۲۳۷۴a.getDrawableState());
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Ch1 m۱۵۶۵۵a(Context context, Cj drawableManager, int drawableId) {
        ColorStateList tintList = drawableManager.m۱۵۳۱۰b(context, drawableId);
        if (tintList == null) {
            return null;
        }
        Ch1 tintInfo = new Ch1();
        tintInfo.f۱۲۰۷۸d = true;
        tintInfo.f۱۲۰۷۵a = tintList;
        return tintInfo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۶۷a(boolean changed, int left, int top, int right, int bottom) {
        if (!AbstractCb.f۱۰۷۶۳a) {
            m۱۵۶۶۹b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۶۱a(int unit, float size) {
        if (!AbstractCb.f۱۰۷۶۳a && !m۱۵۶۷۵h()) {
            m۱۵۶۵۸b(unit, size);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۶۶۹b() {
        this.f۱۲۳۸۱h.m۱۵۶۹۲a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h  reason: contains not printable characters */
    public boolean m۱۵۶۷۵h() {
        return this.f۱۲۳۸۱h.m۱۵۷۰۳g();
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۵۶۵۸b(int unit, float size) {
        this.f۱۲۳۸۱h.m۱۵۶۹۴a(unit, size);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۶۰a(int autoSizeTextType) {
        this.f۱۲۳۸۱h.m۱۵۶۹۳a(autoSizeTextType);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۶۲a(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        this.f۱۲۳۸۱h.m۱۵۶۹۵a(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۶۸a(int[] presetSizes, int unit) {
        this.f۱۲۳۸۱h.m۱۵۶۹۷a(presetSizes, unit);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public int m۱۵۶۷۴g() {
        return this.f۱۲۳۸۱h.m۱۵۷۰۲f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public int m۱۵۶۷۲e() {
        return this.f۱۲۳۸۱h.m۱۵۷۰۰d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public int m۱۵۶۷۱d() {
        return this.f۱۲۳۸۱h.m۱۵۶۹۹c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public int m۱۵۶۷۰c() {
        return this.f۱۲۳۸۱h.m۱۵۶۹۸b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public int[] m۱۵۶۷۳f() {
        return this.f۱۲۳۸۱h.m۱۵۷۰۱e();
    }
}
