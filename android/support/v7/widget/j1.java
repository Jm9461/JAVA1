package android.support.v7.widget;

import a.b.h.c.a.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.content.e.f;
import android.util.AttributeSet;
import android.util.TypedValue;

public class j1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f۲۱۲۷a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f۲۱۲۸b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f۲۱۲۹c;

    public static j1 a(Context context, AttributeSet set, int[] attrs) {
        return new j1(context, context.obtainStyledAttributes(set, attrs));
    }

    public static j1 a(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes) {
        return new j1(context, context.obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes));
    }

    public static j1 a(Context context, int resid, int[] attrs) {
        return new j1(context, context.obtainStyledAttributes(resid, attrs));
    }

    private j1(Context context, TypedArray array) {
        this.f۲۱۲۷a = context;
        this.f۲۱۲۸b = array;
    }

    public Drawable b(int index) {
        int resourceId;
        if (!this.f۲۱۲۸b.hasValue(index) || (resourceId = this.f۲۱۲۸b.getResourceId(index, 0)) == 0) {
            return this.f۲۱۲۸b.getDrawable(index);
        }
        return a.c(this.f۲۱۲۷a, resourceId);
    }

    public Drawable c(int index) {
        int resourceId;
        if (!this.f۲۱۲۸b.hasValue(index) || (resourceId = this.f۲۱۲۸b.getResourceId(index, 0)) == 0) {
            return null;
        }
        return j.a().a(this.f۲۱۲۷a, resourceId, true);
    }

    public Typeface a(int index, int style, f.a fontCallback) {
        int resourceId = this.f۲۱۲۸b.getResourceId(index, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f۲۱۲۹c == null) {
            this.f۲۱۲۹c = new TypedValue();
        }
        return f.a(this.f۲۱۲۷a, resourceId, this.f۲۱۲۹c, style, fontCallback);
    }

    public CharSequence e(int index) {
        return this.f۲۱۲۸b.getText(index);
    }

    public String d(int index) {
        return this.f۲۱۲۸b.getString(index);
    }

    public boolean a(int index, boolean defValue) {
        return this.f۲۱۲۸b.getBoolean(index, defValue);
    }

    public int d(int index, int defValue) {
        return this.f۲۱۲۸b.getInt(index, defValue);
    }

    public float b(int index, float defValue) {
        return this.f۲۱۲۸b.getFloat(index, defValue);
    }

    public int a(int index, int defValue) {
        return this.f۲۱۲۸b.getColor(index, defValue);
    }

    public ColorStateList a(int index) {
        int resourceId;
        ColorStateList value;
        if (!this.f۲۱۲۸b.hasValue(index) || (resourceId = this.f۲۱۲۸b.getResourceId(index, 0)) == 0 || (value = a.b(this.f۲۱۲۷a, resourceId)) == null) {
            return this.f۲۱۲۸b.getColorStateList(index);
        }
        return value;
    }

    public int e(int index, int defValue) {
        return this.f۲۱۲۸b.getInteger(index, defValue);
    }

    public float a(int index, float defValue) {
        return this.f۲۱۲۸b.getDimension(index, defValue);
    }

    public int b(int index, int defValue) {
        return this.f۲۱۲۸b.getDimensionPixelOffset(index, defValue);
    }

    public int c(int index, int defValue) {
        return this.f۲۱۲۸b.getDimensionPixelSize(index, defValue);
    }

    public int f(int index, int defValue) {
        return this.f۲۱۲۸b.getLayoutDimension(index, defValue);
    }

    public int g(int index, int defValue) {
        return this.f۲۱۲۸b.getResourceId(index, defValue);
    }

    public CharSequence[] f(int index) {
        return this.f۲۱۲۸b.getTextArray(index);
    }

    public boolean g(int index) {
        return this.f۲۱۲۸b.hasValue(index);
    }

    public void a() {
        this.f۲۱۲۸b.recycle();
    }
}
