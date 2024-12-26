package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import java.util.ArrayList;

/* renamed from: a.b.f.a  reason: invalid class name */
class Ca {

    /* renamed from: a.b.f.a$a  reason: invalid class name */
    interface AbstractCa {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۰۱۶۵a(Animator animator, AnimatorListenerAdapter listener) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.addPauseListener(listener);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۰۱۶۴a(Animator animator) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.pause();
            return;
        }
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                Animator.AnimatorListener listener = listeners.get(i);
                if (listener instanceof AbstractCa) {
                    ((AbstractCa) listener).onAnimationPause(animator);
                }
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    static void m۱۰۱۶۶b(Animator animator) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.resume();
            return;
        }
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                Animator.AnimatorListener listener = listeners.get(i);
                if (listener instanceof AbstractCa) {
                    ((AbstractCa) listener).onAnimationResume(animator);
                }
            }
        }
    }
}
