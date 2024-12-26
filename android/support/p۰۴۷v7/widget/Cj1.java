package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.content.p۰۴۴e.Cf;
import android.util.AttributeSet;
import android.util.TypedValue;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca;

/* renamed from: android.support.v7.widget.j1  reason: invalid class name */
public class Cj1 {

    /* renamed from: a  reason: contains not printable characters */
    private final Context f۱۲۱۵۳a;

    /* renamed from: b  reason: contains not printable characters */
    private final TypedArray f۱۲۱۵۴b;

    /* renamed from: c  reason: contains not printable characters */
    private TypedValue f۱۲۱۵۵c;

    /* renamed from: a  reason: contains not printable characters */
    public static Cj1 m۱۵۳۴۴a(Context context, AttributeSet set, int[] attrs) {
        return new Cj1(context, context.obtainStyledAttributes(set, attrs));
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cj1 m۱۵۳۴۵a(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes) {
        return new Cj1(context, context.obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes));
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cj1 m۱۵۳۴۳a(Context context, int resid, int[] attrs) {
        return new Cj1(context, context.obtainStyledAttributes(resid, attrs));
    }

    private Cj1(Context context, TypedArray array) {
        this.f۱۲۱۵۳a = context;
        this.f۱۲۱۵۴b = array;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Drawable m۱۵۳۵۴b(int index) {
        int resourceId;
        if (!this.f۱۲۱۵۴b.hasValue(index) || (resourceId = this.f۱۲۱۵۴b.getResourceId(index, 0)) == 0) {
            return this.f۱۲۱۵۴b.getDrawable(index);
        }
        return Ca.m۱۰۶۷۳c(this.f۱۲۱۵۳a, resourceId);
    }

    /* renamed from: c  reason: contains not printable characters */
    public Drawable m۱۵۳۵۶c(int index) {
        int resourceId;
        if (!this.f۱۲۱۵۴b.hasValue(index) || (resourceId = this.f۱۲۱۵۴b.getResourceId(index, 0)) == 0) {
            return null;
        }
        return Cj.m۱۵۲۸۷a().m۱۵۳۰۷a(this.f۱۲۱۵۳a, resourceId, true);
    }

    /* renamed from: a  reason: contains not printable characters */
    public Typeface m۱۵۳۴۹a(int index, int style, Cf.AbstractCa fontCallback) {
        int resourceId = this.f۱۲۱۵۴b.getResourceId(index, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f۱۲۱۵۵c == null) {
            this.f۱۲۱۵۵c = new TypedValue();
        }
        return Cf.m۱۲۶۸۱a(this.f۱۲۱۵۳a, resourceId, this.f۱۲۱۵۵c, style, fontCallback);
    }

    /* renamed from: e  reason: contains not printable characters */
    public CharSequence m۱۵۳۶۰e(int index) {
        return this.f۱۲۱۵۴b.getText(index);
    }

    /* renamed from: d  reason: contains not printable characters */
    public String m۱۵۳۵۸d(int index) {
        return this.f۱۲۱۵۴b.getString(index);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۵۳۵۱a(int index, boolean defValue) {
        return this.f۱۲۱۵۴b.getBoolean(index, defValue);
    }

    /* renamed from: d  reason: contains not printable characters */
    public int m۱۵۳۵۷d(int index, int defValue) {
        return this.f۱۲۱۵۴b.getInt(index, defValue);
    }

    /* renamed from: b  reason: contains not printable characters */
    public float m۱۵۳۵۲b(int index, float defValue) {
        return this.f۱۲۱۵۴b.getFloat(index, defValue);
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۵۳۴۷a(int index, int defValue) {
        return this.f۱۲۱۵۴b.getColor(index, defValue);
    }

    /* renamed from: a  reason: contains not printable characters */
    public ColorStateList m۱۵۳۴۸a(int index) {
        int resourceId;
        ColorStateList value;
        if (!this.f۱۲۱۵۴b.hasValue(index) || (resourceId = this.f۱۲۱۵۴b.getResourceId(index, 0)) == 0 || (value = Ca.m۱۰۶۷۲b(this.f۱۲۱۵۳a, resourceId)) == null) {
            return this.f۱۲۱۵۴b.getColorStateList(index);
        }
        return value;
    }

    /* renamed from: e  reason: contains not printable characters */
    public int m۱۵۳۵۹e(int index, int defValue) {
        return this.f۱۲۱۵۴b.getInteger(index, defValue);
    }

    /* renamed from: a  reason: contains not printable characters */
    public float m۱۵۳۴۶a(int index, float defValue) {
        return this.f۱۲۱۵۴b.getDimension(index, defValue);
    }

    /* renamed from: b  reason: contains not printable characters */
    public int m۱۵۳۵۳b(int index, int defValue) {
        return this.f۱۲۱۵۴b.getDimensionPixelOffset(index, defValue);
    }

    /* renamed from: c  reason: contains not printable characters */
    public int m۱۵۳۵۵c(int index, int defValue) {
        return this.f۱۲۱۵۴b.getDimensionPixelSize(index, defValue);
    }

    /* renamed from: f  reason: contains not printable characters */
    public int m۱۵۳۶۱f(int index, int defValue) {
        return this.f۱۲۱۵۴b.getLayoutDimension(index, defValue);
    }

    /* renamed from: g  reason: contains not printable characters */
    public int m۱۵۳۶۳g(int index, int defValue) {
        return this.f۱۲۱۵۴b.getResourceId(index, defValue);
    }

    /* renamed from: f  reason: contains not printable characters */
    public CharSequence[] m۱۵۳۶۲f(int index) {
        return this.f۱۲۱۵۴b.getTextArray(index);
    }

    /* renamed from: g  reason: contains not printable characters */
    public boolean m۱۵۳۶۴g(int index) {
        return this.f۱۲۱۵۴b.hasValue(index);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۳۵۰a() {
        this.f۱۲۱۵۴b.recycle();
    }
}
