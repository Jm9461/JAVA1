package p۰۵۲b.p۱۰۳h.p۱۰۴a;

import android.view.animation.Interpolator;
import com.nineoldandroids.animation.Animator;
import java.util.ArrayList;

/* renamed from: b.h.a.a  reason: invalid class name */
public abstract class AbstractCa implements Cloneable {

    /* renamed from: c  reason: contains not printable characters */
    ArrayList<AbstractCa> f۱۲۸۶۰c = null;

    /* renamed from: b.h.a.a$a  reason: invalid class name */
    public interface AbstractCa {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۶۱۹۲a(AbstractCa aVar);

        /* renamed from: b  reason: contains not printable characters */
        void m۱۶۱۹۳b(AbstractCa aVar);

        /* renamed from: c  reason: contains not printable characters */
        void m۱۶۱۹۴c(AbstractCa aVar);
    }

    /* renamed from: a  reason: contains not printable characters */
    public abstract AbstractCa m۱۶۱۸۶a(long j);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۶۱۸۸a(Interpolator interpolator);

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۱۹۰b() {
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۱۸۹a(AbstractCa listener) {
        if (this.f۱۲۸۶۰c == null) {
            this.f۱۲۸۶۰c = new ArrayList<>();
        }
        this.f۱۲۸۶۰c.add(listener);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۱۹۱b(AbstractCa listener) {
        ArrayList<AbstractCa> arrayList = this.f۱۲۸۶۰c;
        if (arrayList != null) {
            arrayList.remove(listener);
            if (this.f۱۲۸۶۰c.size() == 0) {
                this.f۱۲۸۶۰c = null;
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public ArrayList<AbstractCa> m۱۶۱۸۷a() {
        return this.f۱۲۸۶۰c;
    }

    @Override // java.lang.Object
    public AbstractCa clone() {
        try {
            AbstractCa anim = (AbstractCa) super.clone();
            if (this.f۱۲۸۶۰c != null) {
                ArrayList<Animator.AnimatorListener> oldListeners = this.f۱۲۸۶۰c;
                anim.f۱۲۸۶۰c = new ArrayList<>();
                int numListeners = oldListeners.size();
                for (int i = 0; i < numListeners; i++) {
                    anim.f۱۲۸۶۰c.add(oldListeners.get(i));
                }
            }
            return anim;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
