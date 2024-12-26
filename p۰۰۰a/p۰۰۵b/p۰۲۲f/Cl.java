package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.b.f.l  reason: invalid class name */
public class Cl {

    /* renamed from: a  reason: contains not printable characters */
    private ViewGroup f۸۵۶۸a;

    /* renamed from: b  reason: contains not printable characters */
    private Runnable f۸۵۶۹b;

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۲۹۶a() {
        Runnable runnable;
        if (m۱۰۲۹۴a(this.f۸۵۶۸a) == this && (runnable = this.f۸۵۶۹b) != null) {
            runnable.run();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۰۲۹۵a(View view, Cl scene) {
        view.setTag(Cj.transition_current_scene, scene);
    }

    /* renamed from: a  reason: contains not printable characters */
    static Cl m۱۰۲۹۴a(View view) {
        return (Cl) view.getTag(Cj.transition_current_scene);
    }
}
