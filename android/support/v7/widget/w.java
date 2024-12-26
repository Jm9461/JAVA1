package android.support.v7.widget;

import a.b.h.a.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.content.e.f;
import android.support.v4.widget.b;
import android.support.v4.widget.p;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f۲۲۷۷a;

    /* renamed from: b  reason: collision with root package name */
    private h1 f۲۲۷۸b;

    /* renamed from: c  reason: collision with root package name */
    private h1 f۲۲۷۹c;

    /* renamed from: d  reason: collision with root package name */
    private h1 f۲۲۸۰d;

    /* renamed from: e  reason: collision with root package name */
    private h1 f۲۲۸۱e;

    /* renamed from: f  reason: collision with root package name */
    private h1 f۲۲۸۲f;

    /* renamed from: g  reason: collision with root package name */
    private h1 f۲۲۸۳g;

    /* renamed from: h  reason: collision with root package name */
    private final x f۲۲۸۴h;
    private int i = 0;
    private Typeface j;
    private boolean k;

    w(TextView view) {
        this.f۲۲۷۷a = view;
        this.f۲۲۸۴h = new x(this.f۲۲۷۷a);
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    public void a(AttributeSet attrs, int defStyleAttr) {
        Context context = this.f۲۲۷۷a.getContext();
        j drawableManager = j.a();
        j1 a2 = j1.a(context, attrs, j.AppCompatTextHelper, defStyleAttr, 0);
        int ap = a2.g(j.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.g(j.AppCompatTextHelper_android_drawableLeft)) {
            this.f۲۲۷۸b = a(context, drawableManager, a2.g(j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.g(j.AppCompatTextHelper_android_drawableTop)) {
            this.f۲۲۷۹c = a(context, drawableManager, a2.g(j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.g(j.AppCompatTextHelper_android_drawableRight)) {
            this.f۲۲۸۰d = a(context, drawableManager, a2.g(j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.g(j.AppCompatTextHelper_android_drawableBottom)) {
            this.f۲۲۸۱e = a(context, drawableManager, a2.g(j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (a2.g(j.AppCompatTextHelper_android_drawableStart)) {
                this.f۲۲۸۲f = a(context, drawableManager, a2.g(j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (a2.g(j.AppCompatTextHelper_android_drawableEnd)) {
                this.f۲۲۸۳g = a(context, drawableManager, a2.g(j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        a2.a();
        boolean hasPwdTm = this.f۲۲۷۷a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean allCaps = false;
        boolean allCapsSet = false;
        ColorStateList textColor = null;
        ColorStateList textColorHint = null;
        ColorStateList textColorLink = null;
        if (ap != -1) {
            j1 a3 = j1.a(context, ap, j.TextAppearance);
            if (!hasPwdTm && a3.g(j.TextAppearance_textAllCaps)) {
                allCaps = a3.a(j.TextAppearance_textAllCaps, false);
                allCapsSet = true;
            }
            a(context, a3);
            if (Build.VERSION.SDK_INT < 23) {
                if (a3.g(j.TextAppearance_android_textColor)) {
                    textColor = a3.a(j.TextAppearance_android_textColor);
                }
                if (a3.g(j.TextAppearance_android_textColorHint)) {
                    textColorHint = a3.a(j.TextAppearance_android_textColorHint);
                }
                if (a3.g(j.TextAppearance_android_textColorLink)) {
                    textColorLink = a3.a(j.TextAppearance_android_textColorLink);
                }
            }
            a3.a();
        }
        j1 a4 = j1.a(context, attrs, j.TextAppearance, defStyleAttr, 0);
        if (!hasPwdTm && a4.g(j.TextAppearance_textAllCaps)) {
            allCapsSet = true;
            allCaps = a4.a(j.TextAppearance_textAllCaps, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a4.g(j.TextAppearance_android_textColor)) {
                textColor = a4.a(j.TextAppearance_android_textColor);
            }
            if (a4.g(j.TextAppearance_android_textColorHint)) {
                textColorHint = a4.a(j.TextAppearance_android_textColorHint);
            }
            if (a4.g(j.TextAppearance_android_textColorLink)) {
                textColorLink = a4.a(j.TextAppearance_android_textColorLink);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && a4.g(j.TextAppearance_android_textSize) && a4.c(j.TextAppearance_android_textSize, -1) == 0) {
            this.f۲۲۷۷a.setTextSize(0, 0.0f);
        }
        a(context, a4);
        a4.a();
        if (textColor != null) {
            this.f۲۲۷۷a.setTextColor(textColor);
        }
        if (textColorHint != null) {
            this.f۲۲۷۷a.setHintTextColor(textColorHint);
        }
        if (textColorLink != null) {
            this.f۲۲۷۷a.setLinkTextColor(textColorLink);
        }
        if (!hasPwdTm && allCapsSet) {
            a(allCaps);
        }
        Typeface typeface = this.j;
        if (typeface != null) {
            this.f۲۲۷۷a.setTypeface(typeface, this.i);
        }
        this.f۲۲۸۴h.a(attrs, defStyleAttr);
        if (b.f۱۴۳۶a) {
            if (this.f۲۲۸۴h.f() != 0) {
                int[] autoSizeTextSizesInPx = this.f۲۲۸۴h.e();
                if (autoSizeTextSizesInPx.length > 0) {
                    if (((float) this.f۲۲۷۷a.getAutoSizeStepGranularity()) != -1.0f) {
                        this.f۲۲۷۷a.setAutoSizeTextTypeUniformWithConfiguration(this.f۲۲۸۴h.c(), this.f۲۲۸۴h.b(), this.f۲۲۸۴h.d(), 0);
                    } else {
                        this.f۲۲۷۷a.setAutoSizeTextTypeUniformWithPresetSizes(autoSizeTextSizesInPx, 0);
                    }
                }
            }
        }
        j1 a5 = j1.a(context, attrs, j.AppCompatTextView);
        int firstBaselineToTopHeight = a5.c(j.AppCompatTextView_firstBaselineToTopHeight, -1);
        int lastBaselineToBottomHeight = a5.c(j.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int lineHeight = a5.c(j.AppCompatTextView_lineHeight, -1);
        a5.a();
        if (firstBaselineToTopHeight != -1) {
            p.a(this.f۲۲۷۷a, firstBaselineToTopHeight);
        }
        if (lastBaselineToBottomHeight != -1) {
            p.b(this.f۲۲۷۷a, lastBaselineToBottomHeight);
        }
        if (lineHeight != -1) {
            p.c(this.f۲۲۷۷a, lineHeight);
        }
    }

    private void a(Context context, j1 a2) {
        String fontFamilyName;
        this.i = a2.d(j.TextAppearance_android_textStyle, this.i);
        boolean z = false;
        if (a2.g(j.TextAppearance_android_fontFamily) || a2.g(j.TextAppearance_fontFamily)) {
            this.j = null;
            int fontFamilyId = a2.g(j.TextAppearance_fontFamily) ? j.TextAppearance_fontFamily : j.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                try {
                    this.j = a2.a(fontFamilyId, this.i, new a(new WeakReference<>(this.f۲۲۷۷a)));
                    if (this.j == null) {
                        z = true;
                    }
                    this.k = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException e2) {
                }
            }
            if (this.j == null && (fontFamilyName = a2.d(fontFamilyId)) != null) {
                this.j = Typeface.create(fontFamilyName, this.i);
            }
        } else if (a2.g(j.TextAppearance_android_typeface)) {
            this.k = false;
            int typefaceIndex = a2.d(j.TextAppearance_android_typeface, 1);
            if (typefaceIndex == 1) {
                this.j = Typeface.SANS_SERIF;
            } else if (typefaceIndex == 2) {
                this.j = Typeface.SERIF;
            } else if (typefaceIndex == 3) {
                this.j = Typeface.MONOSPACE;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class a extends f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f۲۲۸۵a;

        a(WeakReference weakReference) {
            this.f۲۲۸۵a = weakReference;
        }

        @Override // android.support.v4.content.e.f.a
        public void a(Typeface typeface) {
            w.this.a(this.f۲۲۸۵a, typeface);
        }

        @Override // android.support.v4.content.e.f.a
        public void a(int reason) {
        }
    }

    /* access modifiers changed from: package-private */
    public void a(WeakReference<TextView> textViewWeak, Typeface typeface) {
        if (this.k) {
            this.j = typeface;
            TextView textView = textViewWeak.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, int resId) {
        ColorStateList textColor;
        j1 a2 = j1.a(context, resId, j.TextAppearance);
        if (a2.g(j.TextAppearance_textAllCaps)) {
            a(a2.a(j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a2.g(j.TextAppearance_android_textColor) && (textColor = a2.a(j.TextAppearance_android_textColor)) != null) {
            this.f۲۲۷۷a.setTextColor(textColor);
        }
        if (a2.g(j.TextAppearance_android_textSize) && a2.c(j.TextAppearance_android_textSize, -1) == 0) {
            this.f۲۲۷۷a.setTextSize(0, 0.0f);
        }
        a(context, a2);
        a2.a();
        Typeface typeface = this.j;
        if (typeface != null) {
            this.f۲۲۷۷a.setTypeface(typeface, this.i);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean allCaps) {
        this.f۲۲۷۷a.setAllCaps(allCaps);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!(this.f۲۲۷۸b == null && this.f۲۲۷۹c == null && this.f۲۲۸۰d == null && this.f۲۲۸۱e == null)) {
            Drawable[] compoundDrawables = this.f۲۲۷۷a.getCompoundDrawables();
            a(compoundDrawables[0], this.f۲۲۷۸b);
            a(compoundDrawables[1], this.f۲۲۷۹c);
            a(compoundDrawables[2], this.f۲۲۸۰d);
            a(compoundDrawables[3], this.f۲۲۸۱e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f۲۲۸۲f != null || this.f۲۲۸۳g != null) {
            Drawable[] compoundDrawables2 = this.f۲۲۷۷a.getCompoundDrawablesRelative();
            a(compoundDrawables2[0], this.f۲۲۸۲f);
            a(compoundDrawables2[2], this.f۲۲۸۳g);
        }
    }

    private void a(Drawable drawable, h1 info2) {
        if (drawable != null && info2 != null) {
            j.a(drawable, info2, this.f۲۲۷۷a.getDrawableState());
        }
    }

    private static h1 a(Context context, j drawableManager, int drawableId) {
        ColorStateList tintList = drawableManager.b(context, drawableId);
        if (tintList == null) {
            return null;
        }
        h1 tintInfo = new h1();
        tintInfo.f۲۰۹۰d = true;
        tintInfo.f۲۰۸۷a = tintList;
        return tintInfo;
    }

    /* access modifiers changed from: package-private */
    public void a(boolean changed, int left, int top, int right, int bottom) {
        if (!b.f۱۴۳۶a) {
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int unit, float size) {
        if (!b.f۱۴۳۶a && !h()) {
            b(unit, size);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f۲۲۸۴h.a();
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.f۲۲۸۴h.g();
    }

    private void b(int unit, float size) {
        this.f۲۲۸۴h.a(unit, size);
    }

    /* access modifiers changed from: package-private */
    public void a(int autoSizeTextType) {
        this.f۲۲۸۴h.a(autoSizeTextType);
    }

    /* access modifiers changed from: package-private */
    public void a(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        this.f۲۲۸۴h.a(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
    }

    /* access modifiers changed from: package-private */
    public void a(int[] presetSizes, int unit) {
        this.f۲۲۸۴h.a(presetSizes, unit);
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f۲۲۸۴h.f();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f۲۲۸۴h.d();
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f۲۲۸۴h.c();
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f۲۲۸۴h.b();
    }

    /* access modifiers changed from: package-private */
    public int[] f() {
        return this.f۲۲۸۴h.e();
    }
}
