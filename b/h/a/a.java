package b.h.a;

import android.view.animation.Interpolator;
import com.nineoldandroids.animation.Animator;
import java.util.ArrayList;

public abstract class a implements Cloneable {

    /* renamed from: c  reason: collision with root package name */
    ArrayList<AbstractC۰۰۵۲a> f۲۵۱۹c = null;

    /* renamed from: b.h.a.a$a  reason: collision with other inner class name */
    public interface AbstractC۰۰۵۲a {
        void a(a aVar);

        void b(a aVar);

        void c(a aVar);
    }

    public abstract a a(long j);

    public abstract void a(Interpolator interpolator);

    public void b() {
    }

    public void a(AbstractC۰۰۵۲a listener) {
        if (this.f۲۵۱۹c == null) {
            this.f۲۵۱۹c = new ArrayList<>();
        }
        this.f۲۵۱۹c.add(listener);
    }

    public void b(AbstractC۰۰۵۲a listener) {
        ArrayList<AbstractC۰۰۵۲a> arrayList = this.f۲۵۱۹c;
        if (arrayList != null) {
            arrayList.remove(listener);
            if (this.f۲۵۱۹c.size() == 0) {
                this.f۲۵۱۹c = null;
            }
        }
    }

    public ArrayList<AbstractC۰۰۵۲a> a() {
        return this.f۲۵۱۹c;
    }

    @Override // java.lang.Object
    public a clone() {
        try {
            a anim = (a) super.clone();
            if (this.f۲۵۱۹c != null) {
                ArrayList<Animator.AnimatorListener> oldListeners = this.f۲۵۱۹c;
                anim.f۲۵۱۹c = new ArrayList<>();
                int numListeners = oldListeners.size();
                for (int i = 0; i < numListeners; i++) {
                    anim.f۲۵۱۹c.add(oldListeners.get(i));
                }
            }
            return anim;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError();
        }
    }
}
