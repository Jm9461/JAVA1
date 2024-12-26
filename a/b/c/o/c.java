package a.b.c.o;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewParent;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final View f۶۶a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f۶۷b = false;

    /* renamed from: c  reason: collision with root package name */
    private int f۶۸c = 0;

    public c(b widget) {
        this.f۶۶a = (View) widget;
    }

    public boolean b() {
        return this.f۶۷b;
    }

    public Bundle c() {
        Bundle state = new Bundle();
        state.putBoolean("expanded", this.f۶۷b);
        state.putInt("expandedComponentIdHint", this.f۶۸c);
        return state;
    }

    public void a(Bundle state) {
        this.f۶۷b = state.getBoolean("expanded", false);
        this.f۶۸c = state.getInt("expandedComponentIdHint", 0);
        if (this.f۶۷b) {
            d();
        }
    }

    public void a(int expandedComponentIdHint) {
        this.f۶۸c = expandedComponentIdHint;
    }

    public int a() {
        return this.f۶۸c;
    }

    private void d() {
        ViewParent parent = this.f۶۶a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).a(this.f۶۶a);
        }
    }
}
