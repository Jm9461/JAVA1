package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.content.p۲۰۲e.Cf;
import android.util.AttributeSet;
import android.util.TypedValue;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca;

/* renamed from: android.support.v7.widget.j1, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cj1 {

    /* renamed from: a, reason: contains not printable characters */
    private final Context f۱۲۱۵۳a;

    /* renamed from: b, reason: contains not printable characters */
    private final TypedArray f۱۲۱۵۴b;

    /* renamed from: c, reason: contains not printable characters */
    private TypedValue f۱۲۱۵۵c;

    /* renamed from: a, reason: contains not printable characters */
    public static Cj1 m۱۳۲۷۴a(Context context, AttributeSet set, int[] attrs) {
        return new Cj1(context, context.obtainStyledAttributes(set, attrs));
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cj1 m۱۳۲۷۵a(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes) {
        return new Cj1(context, context.obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes));
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cj1 m۱۳۲۷۳a(Context context, int resid, int[] attrs) {
        return new Cj1(context, context.obtainStyledAttributes(resid, attrs));
    }

    private Cj1(Context context, TypedArray array) {
        this.f۱۲۱۵۳a = context;
        this.f۱۲۱۵۴b = array;
    }

    /* renamed from: b, reason: contains not printable characters */
    public Drawable m۱۳۲۸۴b(int index) {
        int resourceId;
        if (this.f۱۲۱۵۴b.hasValue(index) && (resourceId = this.f۱۲۱۵۴b.getResourceId(index, 0)) != 0) {
            return Ca.m۸۶۰۴c(this.f۱۲۱۵۳a, resourceId);
        }
        return this.f۱۲۱۵۴b.getDrawable(index);
    }

    /* renamed from: c, reason: contains not printable characters */
    public Drawable m۱۳۲۸۶c(int index) {
        int resourceId;
        if (this.f۱۲۱۵۴b.hasValue(index) && (resourceId = this.f۱۲۱۵۴b.getResourceId(index, 0)) != 0) {
            return Cj.m۱۳۲۱۷a().m۱۳۲۳۷a(this.f۱۲۱۵۳a, resourceId, true);
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Typeface m۱۳۲۷۹a(int index, int style, Cf.a fontCallback) {
        int resourceId = this.f۱۲۱۵۴b.getResourceId(index, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f۱۲۱۵۵c == null) {
            this.f۱۲۱۵۵c = new TypedValue();
        }
        return Cf.m۱۰۶۱۱a(this.f۱۲۱۵۳a, resourceId, this.f۱۲۱۵۵c, style, fontCallback);
    }

    /* renamed from: e, reason: contains not printable characters */
    public CharSequence m۱۳۲۹۰e(int index) {
        return this.f۱۲۱۵۴b.getText(index);
    }

    /* renamed from: d, reason: contains not printable characters */
    public String m۱۳۲۸۸d(int index) {
        return this.f۱۲۱۵۴b.getString(index);
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۳۲۸۱a(int index, boolean defValue) {
        return this.f۱۲۱۵۴b.getBoolean(index, defValue);
    }

    /* renamed from: d, reason: contains not printable characters */
    public int m۱۳۲۸۷d(int index, int defValue) {
        return this.f۱۲۱۵۴b.getInt(index, defValue);
    }

    /* renamed from: b, reason: contains not printable characters */
    public float m۱۳۲۸۲b(int index, float defValue) {
        return this.f۱۲۱۵۴b.getFloat(index, defValue);
    }

    /* renamed from: a, reason: contains not printable characters */
    public int m۱۳۲۷۷a(int index, int defValue) {
        return this.f۱۲۱۵۴b.getColor(index, defValue);
    }

    /* renamed from: a, reason: contains not printable characters */
    public ColorStateList m۱۳۲۷۸a(int index) {
        int resourceId;
        ColorStateList value;
        if (this.f۱۲۱۵۴b.hasValue(index) && (resourceId = this.f۱۲۱۵۴b.getResourceId(index, 0)) != 0 && (value = Ca.m۸۶۰۳b(this.f۱۲۱۵۳a, resourceId)) != null) {
            return value;
        }
        return this.f۱۲۱۵۴b.getColorStateList(index);
    }

    /* renamed from: e, reason: contains not printable characters */
    public int m۱۳۲۸۹e(int index, int defValue) {
        return this.f۱۲۱۵۴b.getInteger(index, defValue);
    }

    /* renamed from: a, reason: contains not printable characters */
    public float m۱۳۲۷۶a(int index, float defValue) {
        return this.f۱۲۱۵۴b.getDimension(index, defValue);
    }

    /* renamed from: b, reason: contains not printable characters */
    public int m۱۳۲۸۳b(int index, int defValue) {
        return this.f۱۲۱۵۴b.getDimensionPixelOffset(index, defValue);
    }

    /* renamed from: c, reason: contains not printable characters */
    public int m۱۳۲۸۵c(int index, int defValue) {
        return this.f۱۲۱۵۴b.getDimensionPixelSize(index, defValue);
    }

    /* renamed from: f, reason: contains not printable characters */
    public int m۱۳۲۹۱f(int index, int defValue) {
        return this.f۱۲۱۵۴b.getLayoutDimension(index, defValue);
    }

    /* renamed from: g, reason: contains not printable characters */
    public int m۱۳۲۹۳g(int index, int defValue) {
        return this.f۱۲۱۵۴b.getResourceId(index, defValue);
    }

    /* renamed from: f, reason: contains not printable characters */
    public CharSequence[] m۱۳۲۹۲f(int index) {
        return this.f۱۲۱۵۴b.getTextArray(index);
    }

    /* renamed from: g, reason: contains not printable characters */
    public boolean m۱۳۲۹۴g(int index) {
        return this.f۱۲۱۵۴b.hasValue(index);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۲۸۰a() {
        this.f۱۲۱۵۴b.recycle();
    }
}
