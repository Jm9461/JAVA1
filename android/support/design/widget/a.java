package android.support.design.widget;

import android.support.design.widget.t;
import android.view.MotionEvent;
import android.view.View;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private t.b f۹۱۸a;

    public a(SwipeDismissBehavior<?> behavior) {
        behavior.b(0.1f);
        behavior.a(0.6f);
        behavior.a(0);
    }

    public boolean a(View child) {
        return child instanceof d;
    }

    public void a(CoordinatorLayout parent, View child, MotionEvent event) {
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                t.a().b(this.f۹۱۸a);
            }
        } else if (parent.a(child, (int) event.getX(), (int) event.getY())) {
            t.a().a(this.f۹۱۸a);
        }
    }
}
