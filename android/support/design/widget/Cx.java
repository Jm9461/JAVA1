package android.support.design.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: android.support.design.widget.x  reason: invalid class name */
public class Cx<V extends View> extends CoordinatorLayout.AbstractCc<V> {

    /* renamed from: a  reason: contains not printable characters */
    private Cy f۱۰۰۵۵a;

    /* renamed from: b  reason: contains not printable characters */
    private int f۱۰۰۵۶b = 0;

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۰۰۵۷c = 0;

    public Cx() {
    }

    public Cx(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۰۳۲a(CoordinatorLayout parent, V child, int layoutDirection) {
        m۱۲۰۳۴b(parent, child, layoutDirection);
        if (this.f۱۰۰۵۵a == null) {
            this.f۱۰۰۵۵a = new Cy(child);
        }
        this.f۱۰۰۵۵a.m۱۲۰۳۸b();
        int i = this.f۱۰۰۵۶b;
        if (i != 0) {
            this.f۱۰۰۵۵a.m۱۲۰۳۹b(i);
            this.f۱۰۰۵۶b = 0;
        }
        int i2 = this.f۱۰۰۵۷c;
        if (i2 == 0) {
            return true;
        }
        this.f۱۰۰۵۵a.m۱۲۰۳۷a(i2);
        this.f۱۰۰۵۷c = 0;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۰۳۴b(CoordinatorLayout parent, V child, int layoutDirection) {
        parent.m۱۱۵۵۵c(child, layoutDirection);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۰۳۱a(int offset) {
        Cy yVar = this.f۱۰۰۵۵a;
        if (yVar != null) {
            return yVar.m۱۲۰۳۹b(offset);
        }
        this.f۱۰۰۵۶b = offset;
        return false;
    }

    /* renamed from: b  reason: contains not printable characters */
    public int m۱۲۰۳۳b() {
        Cy yVar = this.f۱۰۰۵۵a;
        if (yVar != null) {
            return yVar.m۱۲۰۳۶a();
        }
        return 0;
    }
}
