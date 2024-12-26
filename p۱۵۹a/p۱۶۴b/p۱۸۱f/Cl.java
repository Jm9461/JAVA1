package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.b.f.l, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cl {

    /* renamed from: a, reason: contains not printable characters */
    private ViewGroup f۸۵۶۸a;

    /* renamed from: b, reason: contains not printable characters */
    private Runnable f۸۵۶۹b;

    /* renamed from: a, reason: contains not printable characters */
    public void m۸۲۲۹a() {
        Runnable runnable;
        if (m۸۲۲۷a(this.f۸۵۶۸a) == this && (runnable = this.f۸۵۶۹b) != null) {
            runnable.run();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    static void m۸۲۲۸a(View view, Cl scene) {
        view.setTag(Cj.transition_current_scene, scene);
    }

    /* renamed from: a, reason: contains not printable characters */
    static Cl m۸۲۲۷a(View view) {
        return (Cl) view.getTag(Cj.transition_current_scene);
    }
}
