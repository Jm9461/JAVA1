package p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f;

import android.support.p۰۴۳v4.view.AbstractCz;
import android.support.p۰۴۳v4.view.Ca0;
import android.support.p۰۴۳v4.view.Cy;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.b.h.f.h  reason: invalid class name */
public class Ch {

    /* renamed from: a  reason: contains not printable characters */
    final ArrayList<Cy> f۸۹۳۹a = new ArrayList<>();

    /* renamed from: b  reason: contains not printable characters */
    private long f۸۹۴۰b = -1;

    /* renamed from: c  reason: contains not printable characters */
    private Interpolator f۸۹۴۱c;

    /* renamed from: d  reason: contains not printable characters */
    AbstractCz f۸۹۴۲d;

    /* renamed from: e  reason: contains not printable characters */
    private boolean f۸۹۴۳e;

    /* renamed from: f  reason: contains not printable characters */
    private final Ca0 f۸۹۴۴f = new Ca();

    /* renamed from: a  reason: contains not printable characters */
    public Ch m۱۰۸۳۴a(Cy animator) {
        if (!this.f۸۹۴۳e) {
            this.f۸۹۳۹a.add(animator);
        }
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ch m۱۰۸۳۵a(Cy anim1, Cy anim2) {
        this.f۸۹۳۹a.add(anim1);
        anim2.m۱۳۰۶۱b(anim1.m۱۳۰۵۹b());
        this.f۸۹۳۹a.add(anim2);
        return this;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۰۸۴۰c() {
        if (!this.f۸۹۴۳e) {
            Iterator<Cy> it = this.f۸۹۳۹a.iterator();
            while (it.hasNext()) {
                Cy animator = it.next();
                long j = this.f۸۹۴۰b;
                if (j >= 0) {
                    animator.m۱۳۰۵۴a(j);
                }
                Interpolator interpolator = this.f۸۹۴۱c;
                if (interpolator != null) {
                    animator.m۱۳۰۵۷a(interpolator);
                }
                if (this.f۸۹۴۲d != null) {
                    animator.m۱۳۰۵۶a(this.f۸۹۴۴f);
                }
                animator.m۱۳۰۶۲c();
            }
            this.f۸۹۴۳e = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۸۳۹b() {
        this.f۸۹۴۳e = false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۸۳۸a() {
        if (this.f۸۹۴۳e) {
            Iterator<Cy> it = this.f۸۹۳۹a.iterator();
            while (it.hasNext()) {
                it.next().m۱۳۰۵۸a();
            }
            this.f۸۹۴۳e = false;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ch m۱۰۸۳۳a(long duration) {
        if (!this.f۸۹۴۳e) {
            this.f۸۹۴۰b = duration;
        }
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ch m۱۰۸۳۷a(Interpolator interpolator) {
        if (!this.f۸۹۴۳e) {
            this.f۸۹۴۱c = interpolator;
        }
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ch m۱۰۸۳۶a(AbstractCz listener) {
        if (!this.f۸۹۴۳e) {
            this.f۸۹۴۲d = listener;
        }
        return this;
    }

    /* renamed from: a.b.h.f.h$a  reason: invalid class name */
    class Ca extends Ca0 {

        /* renamed from: a  reason: contains not printable characters */
        private boolean f۸۹۴۵a = false;

        /* renamed from: b  reason: contains not printable characters */
        private int f۸۹۴۶b = 0;

        Ca() {
        }

        @Override // android.support.p۰۴۳v4.view.Ca0, android.support.p۰۴۳v4.view.AbstractCz
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۰۸۴۳b(View view) {
            if (!this.f۸۹۴۵a) {
                this.f۸۹۴۵a = true;
                AbstractCz zVar = Ch.this.f۸۹۴۲d;
                if (zVar != null) {
                    zVar.m۱۳۰۶۷b(null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۸۴۱a() {
            this.f۸۹۴۶b = 0;
            this.f۸۹۴۵a = false;
            Ch.this.m۱۰۸۳۹b();
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCz
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۸۴۲a(View view) {
            int i = this.f۸۹۴۶b + 1;
            this.f۸۹۴۶b = i;
            if (i == Ch.this.f۸۹۳۹a.size()) {
                AbstractCz zVar = Ch.this.f۸۹۴۲d;
                if (zVar != null) {
                    zVar.m۱۳۰۶۶a(null);
                }
                m۱۰۸۴۱a();
            }
        }
    }
}
