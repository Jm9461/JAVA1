package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.content.p۲۰۲e.Cf;
import android.support.v4.widget.Cp;
import android.support.v4.widget.InterfaceCb;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj;

/* renamed from: android.support.v7.widget.w, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cw {

    /* renamed from: a, reason: contains not printable characters */
    private final TextView f۱۲۳۷۴a;

    /* renamed from: b, reason: contains not printable characters */
    private Ch1 f۱۲۳۷۵b;

    /* renamed from: c, reason: contains not printable characters */
    private Ch1 f۱۲۳۷۶c;

    /* renamed from: d, reason: contains not printable characters */
    private Ch1 f۱۲۳۷۷d;

    /* renamed from: e, reason: contains not printable characters */
    private Ch1 f۱۲۳۷۸e;

    /* renamed from: f, reason: contains not printable characters */
    private Ch1 f۱۲۳۷۹f;

    /* renamed from: g, reason: contains not printable characters */
    private Ch1 f۱۲۳۸۰g;

    /* renamed from: h, reason: contains not printable characters */
    private final Cx f۱۲۳۸۱h;

    /* renamed from: i, reason: contains not printable characters */
    private int f۱۲۳۸۲i = 0;

    /* renamed from: j, reason: contains not printable characters */
    private Typeface f۱۲۳۸۳j;

    /* renamed from: k, reason: contains not printable characters */
    private boolean f۱۲۳۸۴k;

    Cw(TextView view) {
        this.f۱۲۳۷۴a = view;
        this.f۱۲۳۸۱h = new Cx(this.f۱۲۳۷۴a);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۵۹۴a(AttributeSet attrs, int defStyleAttr) {
        Context context = this.f۱۲۳۷۴a.getContext();
        Cj drawableManager = Cj.m۱۳۲۱۷a();
        Cj1 a2 = Cj1.m۱۳۲۷۵a(context, attrs, Cj.AppCompatTextHelper, defStyleAttr, 0);
        int ap = a2.m۱۳۲۹۳g(Cj.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.m۱۳۲۹۴g(Cj.AppCompatTextHelper_android_drawableLeft)) {
            this.f۱۲۳۷۵b = m۱۳۵۸۵a(context, drawableManager, a2.m۱۳۲۹۳g(Cj.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.m۱۳۲۹۴g(Cj.AppCompatTextHelper_android_drawableTop)) {
            this.f۱۲۳۷۶c = m۱۳۵۸۵a(context, drawableManager, a2.m۱۳۲۹۳g(Cj.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.m۱۳۲۹۴g(Cj.AppCompatTextHelper_android_drawableRight)) {
            this.f۱۲۳۷۷d = m۱۳۵۸۵a(context, drawableManager, a2.m۱۳۲۹۳g(Cj.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.m۱۳۲۹۴g(Cj.AppCompatTextHelper_android_drawableBottom)) {
            this.f۱۲۳۷۸e = m۱۳۵۸۵a(context, drawableManager, a2.m۱۳۲۹۳g(Cj.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (a2.m۱۳۲۹۴g(Cj.AppCompatTextHelper_android_drawableStart)) {
                this.f۱۲۳۷۹f = m۱۳۵۸۵a(context, drawableManager, a2.m۱۳۲۹۳g(Cj.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (a2.m۱۳۲۹۴g(Cj.AppCompatTextHelper_android_drawableEnd)) {
                this.f۱۲۳۸۰g = m۱۳۵۸۵a(context, drawableManager, a2.m۱۳۲۹۳g(Cj.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        a2.m۱۳۲۸۰a();
        boolean hasPwdTm = this.f۱۲۳۷۴a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean allCaps = false;
        boolean allCapsSet = false;
        ColorStateList textColor = null;
        ColorStateList textColorHint = null;
        ColorStateList textColorLink = null;
        if (ap != -1) {
            Cj1 a3 = Cj1.m۱۳۲۷۳a(context, ap, Cj.TextAppearance);
            if (!hasPwdTm && a3.m۱۳۲۹۴g(Cj.TextAppearance_textAllCaps)) {
                allCaps = a3.m۱۳۲۸۱a(Cj.TextAppearance_textAllCaps, false);
                allCapsSet = true;
            }
            m۱۳۵۸۶a(context, a3);
            if (Build.VERSION.SDK_INT < 23) {
                if (a3.m۱۳۲۹۴g(Cj.TextAppearance_android_textColor)) {
                    textColor = a3.m۱۳۲۷۸a(Cj.TextAppearance_android_textColor);
                }
                if (a3.m۱۳۲۹۴g(Cj.TextAppearance_android_textColorHint)) {
                    textColorHint = a3.m۱۳۲۷۸a(Cj.TextAppearance_android_textColorHint);
                }
                if (a3.m۱۳۲۹۴g(Cj.TextAppearance_android_textColorLink)) {
                    textColorLink = a3.m۱۳۲۷۸a(Cj.TextAppearance_android_textColorLink);
                }
            }
            a3.m۱۳۲۸۰a();
        }
        Cj1 a4 = Cj1.m۱۳۲۷۵a(context, attrs, Cj.TextAppearance, defStyleAttr, 0);
        if (!hasPwdTm && a4.m۱۳۲۹۴g(Cj.TextAppearance_textAllCaps)) {
            allCapsSet = true;
            allCaps = a4.m۱۳۲۸۱a(Cj.TextAppearance_textAllCaps, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a4.m۱۳۲۹۴g(Cj.TextAppearance_android_textColor)) {
                textColor = a4.m۱۳۲۷۸a(Cj.TextAppearance_android_textColor);
            }
            if (a4.m۱۳۲۹۴g(Cj.TextAppearance_android_textColorHint)) {
                textColorHint = a4.m۱۳۲۷۸a(Cj.TextAppearance_android_textColorHint);
            }
            if (a4.m۱۳۲۹۴g(Cj.TextAppearance_android_textColorLink)) {
                textColorLink = a4.m۱۳۲۷۸a(Cj.TextAppearance_android_textColorLink);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && a4.m۱۳۲۹۴g(Cj.TextAppearance_android_textSize) && a4.m۱۳۲۸۵c(Cj.TextAppearance_android_textSize, -1) == 0) {
            this.f۱۲۳۷۴a.setTextSize(0, 0.0f);
        }
        m۱۳۵۸۶a(context, a4);
        a4.m۱۳۲۸۰a();
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
            m۱۳۵۹۶a(allCaps);
        }
        Typeface typeface = this.f۱۲۳۸۳j;
        if (typeface != null) {
            this.f۱۲۳۷۴a.setTypeface(typeface, this.f۱۲۳۸۲i);
        }
        this.f۱۲۳۸۱h.m۱۳۶۲۶a(attrs, defStyleAttr);
        if (InterfaceCb.f۱۰۷۶۳a && this.f۱۲۳۸۱h.m۱۳۶۳۲f() != 0) {
            int[] autoSizeTextSizesInPx = this.f۱۲۳۸۱h.m۱۳۶۳۱e();
            if (autoSizeTextSizesInPx.length > 0) {
                if (this.f۱۲۳۷۴a.getAutoSizeStepGranularity() == -1.0f) {
                    this.f۱۲۳۷۴a.setAutoSizeTextTypeUniformWithPresetSizes(autoSizeTextSizesInPx, 0);
                } else {
                    this.f۱۲۳۷۴a.setAutoSizeTextTypeUniformWithConfiguration(this.f۱۲۳۸۱h.m۱۳۶۲۹c(), this.f۱۲۳۸۱h.m۱۳۶۲۸b(), this.f۱۲۳۸۱h.m۱۳۶۳۰d(), 0);
                }
            }
        }
        Cj1 a5 = Cj1.m۱۳۲۷۴a(context, attrs, Cj.AppCompatTextView);
        int firstBaselineToTopHeight = a5.m۱۳۲۸۵c(Cj.AppCompatTextView_firstBaselineToTopHeight, -1);
        int lastBaselineToBottomHeight = a5.m۱۳۲۸۵c(Cj.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int lineHeight = a5.m۱۳۲۸۵c(Cj.AppCompatTextView_lineHeight, -1);
        a5.m۱۳۲۸۰a();
        if (firstBaselineToTopHeight != -1) {
            Cp.m۱۱۲۳۲a(this.f۱۲۳۷۴a, firstBaselineToTopHeight);
        }
        if (lastBaselineToBottomHeight != -1) {
            Cp.m۱۱۲۳۸b(this.f۱۲۳۷۴a, lastBaselineToBottomHeight);
        }
        if (lineHeight != -1) {
            Cp.m۱۱۲۴۰c(this.f۱۲۳۷۴a, lineHeight);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۵۸۶a(Context context, Cj1 a2) {
        String fontFamilyName;
        this.f۱۲۳۸۲i = a2.m۱۳۲۸۷d(Cj.TextAppearance_android_textStyle, this.f۱۲۳۸۲i);
        if (a2.m۱۳۲۹۴g(Cj.TextAppearance_android_fontFamily) || a2.m۱۳۲۹۴g(Cj.TextAppearance_fontFamily)) {
            this.f۱۲۳۸۳j = null;
            int fontFamilyId = a2.m۱۳۲۹۴g(Cj.TextAppearance_fontFamily) ? Cj.TextAppearance_fontFamily : Cj.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                WeakReference<TextView> textViewWeak = new WeakReference<>(this.f۱۲۳۷۴a);
                Cf.a replyCallback = new a(textViewWeak);
                try {
                    this.f۱۲۳۸۳j = a2.m۱۳۲۷۹a(fontFamilyId, this.f۱۲۳۸۲i, replyCallback);
                    this.f۱۲۳۸۴k = this.f۱۲۳۸۳j == null;
                } catch (Resources.NotFoundException e2) {
                } catch (UnsupportedOperationException e3) {
                }
            }
            if (this.f۱۲۳۸۳j == null && (fontFamilyName = a2.m۱۳۲۸۸d(fontFamilyId)) != null) {
                this.f۱۲۳۸۳j = Typeface.create(fontFamilyName, this.f۱۲۳۸۲i);
                return;
            }
            return;
        }
        if (a2.m۱۳۲۹۴g(Cj.TextAppearance_android_typeface)) {
            this.f۱۲۳۸۴k = false;
            int typefaceIndex = a2.m۱۳۲۸۷d(Cj.TextAppearance_android_typeface, 1);
            if (typefaceIndex == 1) {
                this.f۱۲۳۸۳j = Typeface.SANS_SERIF;
            } else if (typefaceIndex == 2) {
                this.f۱۲۳۸۳j = Typeface.SERIF;
            } else if (typefaceIndex == 3) {
                this.f۱۲۳۸۳j = Typeface.MONOSPACE;
            }
        }
    }

    /* renamed from: android.support.v7.widget.w$a */
    class a extends Cf.a {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ WeakReference f۱۲۳۸۵a;

        a(WeakReference weakReference) {
            this.f۱۲۳۸۵a = weakReference;
        }

        @Override // android.support.v4.content.p۲۰۲e.Cf.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۳۶۰۷a(Typeface typeface) {
            Cw.this.m۱۳۵۹۵a(this.f۱۲۳۸۵a, typeface);
        }

        @Override // android.support.v4.content.p۲۰۲e.Cf.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۳۶۰۶a(int reason) {
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۵۹۵a(WeakReference<TextView> textViewWeak, Typeface typeface) {
        if (this.f۱۲۳۸۴k) {
            this.f۱۲۳۸۳j = typeface;
            TextView textView = textViewWeak.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f۱۲۳۸۲i);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۵۹۳a(Context context, int resId) {
        ColorStateList textColor;
        Cj1 a2 = Cj1.m۱۳۲۷۳a(context, resId, Cj.TextAppearance);
        if (a2.m۱۳۲۹۴g(Cj.TextAppearance_textAllCaps)) {
            m۱۳۵۹۶a(a2.m۱۳۲۸۱a(Cj.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a2.m۱۳۲۹۴g(Cj.TextAppearance_android_textColor) && (textColor = a2.m۱۳۲۷۸a(Cj.TextAppearance_android_textColor)) != null) {
            this.f۱۲۳۷۴a.setTextColor(textColor);
        }
        if (a2.m۱۳۲۹۴g(Cj.TextAppearance_android_textSize) && a2.m۱۳۲۸۵c(Cj.TextAppearance_android_textSize, -1) == 0) {
            this.f۱۲۳۷۴a.setTextSize(0, 0.0f);
        }
        m۱۳۵۸۶a(context, a2);
        a2.m۱۳۲۸۰a();
        Typeface typeface = this.f۱۲۳۸۳j;
        if (typeface != null) {
            this.f۱۲۳۷۴a.setTypeface(typeface, this.f۱۲۳۸۲i);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۵۹۶a(boolean allCaps) {
        this.f۱۲۳۷۴a.setAllCaps(allCaps);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۵۸۹a() {
        if (this.f۱۲۳۷۵b != null || this.f۱۲۳۷۶c != null || this.f۱۲۳۷۷d != null || this.f۱۲۳۷۸e != null) {
            Drawable[] compoundDrawables = this.f۱۲۳۷۴a.getCompoundDrawables();
            m۱۳۵۸۷a(compoundDrawables[0], this.f۱۲۳۷۵b);
            m۱۳۵۸۷a(compoundDrawables[1], this.f۱۲۳۷۶c);
            m۱۳۵۸۷a(compoundDrawables[2], this.f۱۲۳۷۷d);
            m۱۳۵۸۷a(compoundDrawables[3], this.f۱۲۳۷۸e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f۱۲۳۷۹f != null || this.f۱۲۳۸۰g != null) {
                Drawable[] compoundDrawables2 = this.f۱۲۳۷۴a.getCompoundDrawablesRelative();
                m۱۳۵۸۷a(compoundDrawables2[0], this.f۱۲۳۷۹f);
                m۱۳۵۸۷a(compoundDrawables2[2], this.f۱۲۳۸۰g);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۵۸۷a(Drawable drawable, Ch1 info2) {
        if (drawable != null && info2 != null) {
            Cj.m۱۳۲۲۰a(drawable, info2, this.f۱۲۳۷۴a.getDrawableState());
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Ch1 m۱۳۵۸۵a(Context context, Cj drawableManager, int drawableId) {
        ColorStateList tintList = drawableManager.m۱۳۲۴۰b(context, drawableId);
        if (tintList != null) {
            Ch1 tintInfo = new Ch1();
            tintInfo.f۱۲۰۷۸d = true;
            tintInfo.f۱۲۰۷۵a = tintList;
            return tintInfo;
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۵۹۷a(boolean changed, int left, int top, int right, int bottom) {
        if (!InterfaceCb.f۱۰۷۶۳a) {
            m۱۳۵۹۹b();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۵۹۱a(int unit, float size) {
        if (!InterfaceCb.f۱۰۷۶۳a && !m۱۳۶۰۵h()) {
            m۱۳۵۸۸b(unit, size);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۳۵۹۹b() {
        this.f۱۲۳۸۱h.m۱۳۶۲۲a();
    }

    /* renamed from: h, reason: contains not printable characters */
    boolean m۱۳۶۰۵h() {
        return this.f۱۲۳۸۱h.m۱۳۶۳۳g();
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۳۵۸۸b(int unit, float size) {
        this.f۱۲۳۸۱h.m۱۳۶۲۴a(unit, size);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۵۹۰a(int autoSizeTextType) {
        this.f۱۲۳۸۱h.m۱۳۶۲۳a(autoSizeTextType);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۵۹۲a(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        this.f۱۲۳۸۱h.m۱۳۶۲۵a(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۵۹۸a(int[] presetSizes, int unit) {
        this.f۱۲۳۸۱h.m۱۳۶۲۷a(presetSizes, unit);
    }

    /* renamed from: g, reason: contains not printable characters */
    int m۱۳۶۰۴g() {
        return this.f۱۲۳۸۱h.m۱۳۶۳۲f();
    }

    /* renamed from: e, reason: contains not printable characters */
    int m۱۳۶۰۲e() {
        return this.f۱۲۳۸۱h.m۱۳۶۳۰d();
    }

    /* renamed from: d, reason: contains not printable characters */
    int m۱۳۶۰۱d() {
        return this.f۱۲۳۸۱h.m۱۳۶۲۹c();
    }

    /* renamed from: c, reason: contains not printable characters */
    int m۱۳۶۰۰c() {
        return this.f۱۲۳۸۱h.m۱۳۶۲۸b();
    }

    /* renamed from: f, reason: contains not printable characters */
    int[] m۱۳۶۰۳f() {
        return this.f۱۲۳۸۱h.m۱۳۶۳۱e();
    }
}
