package p۲۰۸b.p۲۵۹h.p۲۶۰a;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* renamed from: b.h.a.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCa implements Cloneable {

    /* renamed from: c, reason: contains not printable characters */
    ArrayList<a> f۱۲۸۶۰c = null;

    /* renamed from: b.h.a.a$a */
    public interface a {
        /* renamed from: a, reason: contains not printable characters */
        void mo۱۶۴۰۵a(AbstractCa abstractCa);

        /* renamed from: b, reason: contains not printable characters */
        void mo۱۶۴۱۰b(AbstractCa abstractCa);

        /* renamed from: c, reason: contains not printable characters */
        void mo۱۶۴۰۷c(AbstractCa abstractCa);
    }

    /* renamed from: a, reason: contains not printable characters */
    public abstract AbstractCa mo۱۴۲۶۶a(long j);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۴۲۶۸a(Interpolator interpolator);

    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۴۲۷۲b() {
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۱۱۸a(a listener) {
        if (this.f۱۲۸۶۰c == null) {
            this.f۱۲۸۶۰c = new ArrayList<>();
        }
        this.f۱۲۸۶۰c.add(listener);
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۴۱۲۰b(a listener) {
        ArrayList<a> arrayList = this.f۱۲۸۶۰c;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(listener);
        if (this.f۱۲۸۶۰c.size() == 0) {
            this.f۱۲۸۶۰c = null;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public ArrayList<a> m۱۴۱۱۶a() {
        return this.f۱۲۸۶۰c;
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AbstractCa mo۱۴۲۷۶clone() {
        try {
            AbstractCa anim = (AbstractCa) super.clone();
            if (this.f۱۲۸۶۰c != null) {
                ArrayList<a> arrayList = this.f۱۲۸۶۰c;
                anim.f۱۲۸۶۰c = new ArrayList<>();
                int numListeners = arrayList.size();
                for (int i = 0; i < numListeners; i++) {
                    anim.f۱۲۸۶۰c.add(arrayList.get(i));
                }
            }
            return anim;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError();
        }
    }
}
