package a.b.f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import java.util.ArrayList;

class a {

    /* renamed from: a.b.f.a$a  reason: collision with other inner class name */
    interface AbstractC۰۰۰۸a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    static void a(Animator animator, AnimatorListenerAdapter listener) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.addPauseListener(listener);
        }
    }

    static void a(Animator animator) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.pause();
            return;
        }
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                Animator.AnimatorListener listener = listeners.get(i);
                if (listener instanceof AbstractC۰۰۰۸a) {
                    ((AbstractC۰۰۰۸a) listener).onAnimationPause(animator);
                }
            }
        }
    }

    static void b(Animator animator) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.resume();
            return;
        }
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                Animator.AnimatorListener listener = listeners.get(i);
                if (listener instanceof AbstractC۰۰۰۸a) {
                    ((AbstractC۰۰۰۸a) listener).onAnimationResume(animator);
                }
            }
        }
    }
}
