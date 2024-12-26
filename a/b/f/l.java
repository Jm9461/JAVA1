package a.b.f;

import android.view.View;
import android.view.ViewGroup;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f۲۳۹a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f۲۴۰b;

    public void a() {
        Runnable runnable;
        if (a(this.f۲۳۹a) == this && (runnable = this.f۲۴۰b) != null) {
            runnable.run();
        }
    }

    static void a(View view, l scene) {
        view.setTag(j.transition_current_scene, scene);
    }

    static l a(View view) {
        return (l) view.getTag(j.transition_current_scene);
    }
}
