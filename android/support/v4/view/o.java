package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private int f۱۳۶۵a;

    public o(ViewGroup viewGroup) {
    }

    public void a(View child, View target, int axes) {
        a(child, target, axes, 0);
    }

    public void a(View child, View target, int axes, int type) {
        this.f۱۳۶۵a = axes;
    }

    public int a() {
        return this.f۱۳۶۵a;
    }

    public void a(View target, int type) {
        this.f۱۳۶۵a = 0;
    }
}
