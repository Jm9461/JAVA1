package android.support.design.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

/* access modifiers changed from: package-private */
public class x<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private y f۱۰۲۸a;

    /* renamed from: b  reason: collision with root package name */
    private int f۱۰۲۹b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f۱۰۳۰c = 0;

    public x() {
    }

    public x(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // android.support.design.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout parent, V child, int layoutDirection) {
        b(parent, child, layoutDirection);
        if (this.f۱۰۲۸a == null) {
            this.f۱۰۲۸a = new y(child);
        }
        this.f۱۰۲۸a.b();
        int i = this.f۱۰۲۹b;
        if (i != 0) {
            this.f۱۰۲۸a.b(i);
            this.f۱۰۲۹b = 0;
        }
        int i2 = this.f۱۰۳۰c;
        if (i2 == 0) {
            return true;
        }
        this.f۱۰۲۸a.a(i2);
        this.f۱۰۳۰c = 0;
        return true;
    }

    /* access modifiers changed from: protected */
    public void b(CoordinatorLayout parent, V child, int layoutDirection) {
        parent.c(child, layoutDirection);
    }

    public boolean a(int offset) {
        y yVar = this.f۱۰۲۸a;
        if (yVar != null) {
            return yVar.b(offset);
        }
        this.f۱۰۲۹b = offset;
        return false;
    }

    public int b() {
        y yVar = this.f۱۰۲۸a;
        if (yVar != null) {
            return yVar.a();
        }
        return 0;
    }
}
