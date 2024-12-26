package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;

/* renamed from: android.support.constraint.a  reason: invalid class name */
public class Ca extends AbstractCb {

    /* renamed from: i  reason: contains not printable characters */
    private int f۹۱۰۱i = 0;

    /* renamed from: j  reason: contains not printable characters */
    private int f۹۱۰۲j = 0;

    /* renamed from: k  reason: contains not printable characters */
    private android.support.constraint.p۰۴۱i.p۰۴۲j.Ca f۹۱۰۳k;

    public Ca(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public int getType() {
        return this.f۹۱۰۱i;
    }

    public void setType(int type) {
        this.f۹۱۰۱i = type;
        this.f۹۱۰۲j = type;
        if (Build.VERSION.SDK_INT < 17) {
            int i = this.f۹۱۰۱i;
            if (i == 5) {
                this.f۹۱۰۲j = 0;
            } else if (i == 6) {
                this.f۹۱۰۲j = 1;
            }
        } else {
            if (1 == getResources().getConfiguration().getLayoutDirection()) {
                int i2 = this.f۹۱۰۱i;
                if (i2 == 5) {
                    this.f۹۱۰۲j = 1;
                } else if (i2 == 6) {
                    this.f۹۱۰۲j = 0;
                }
            } else {
                int i3 = this.f۹۱۰۱i;
                if (i3 == 5) {
                    this.f۹۱۰۲j = 0;
                } else if (i3 == 6) {
                    this.f۹۱۰۲j = 1;
                }
            }
        }
        this.f۹۱۰۳k.m۱۱۰۷۳p(this.f۹۱۰۲j);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.constraint.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۹۵۹a(AttributeSet attrs) {
        super.m۱۰۹۶۳a(attrs);
        this.f۹۱۰۳k = new android.support.constraint.p۰۴۱i.p۰۴۲j.Ca();
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, Ch.ConstraintLayout_Layout);
            int N = a.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a.getIndex(i);
                if (attr == Ch.ConstraintLayout_Layout_barrierDirection) {
                    setType(a.getInt(attr, 0));
                } else if (attr == Ch.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f۹۱۰۳k.m۱۱۰۷۲c(a.getBoolean(attr, true));
                }
            }
        }
        this.f۹۱۰۷f = this.f۹۱۰۳k;
        m۱۰۹۶۱a();
    }
}
