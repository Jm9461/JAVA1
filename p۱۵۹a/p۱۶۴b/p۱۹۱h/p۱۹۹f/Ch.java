package p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f;

import android.support.v4.view.Ca0;
import android.support.v4.view.Cy;
import android.support.v4.view.InterfaceCz;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.b.h.f.h, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ch {

    /* renamed from: c, reason: contains not printable characters */
    private Interpolator f۸۹۴۱c;

    /* renamed from: d, reason: contains not printable characters */
    InterfaceCz f۸۹۴۲d;

    /* renamed from: e, reason: contains not printable characters */
    private boolean f۸۹۴۳e;

    /* renamed from: b, reason: contains not printable characters */
    private long f۸۹۴۰b = -1;

    /* renamed from: f, reason: contains not printable characters */
    private final Ca0 f۸۹۴۴f = new a();

    /* renamed from: a, reason: contains not printable characters */
    final ArrayList<Cy> f۸۹۳۹a = new ArrayList<>();

    /* renamed from: a, reason: contains not printable characters */
    public Ch m۸۷۶۵a(Cy animator) {
        if (!this.f۸۹۴۳e) {
            this.f۸۹۳۹a.add(animator);
        }
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Ch m۸۷۶۶a(Cy anim1, Cy anim2) {
        this.f۸۹۳۹a.add(anim1);
        anim2.m۱۰۹۹۱b(anim1.m۱۰۹۸۹b());
        this.f۸۹۳۹a.add(anim2);
        return this;
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۸۷۷۱c() {
        if (this.f۸۹۴۳e) {
            return;
        }
        Iterator<Cy> it = this.f۸۹۳۹a.iterator();
        while (it.hasNext()) {
            Cy animator = it.next();
            long j = this.f۸۹۴۰b;
            if (j >= 0) {
                animator.m۱۰۹۸۴a(j);
            }
            Interpolator interpolator = this.f۸۹۴۱c;
            if (interpolator != null) {
                animator.m۱۰۹۸۷a(interpolator);
            }
            if (this.f۸۹۴۲d != null) {
                animator.m۱۰۹۸۶a(this.f۸۹۴۴f);
            }
            animator.m۱۰۹۹۲c();
        }
        this.f۸۹۴۳e = true;
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۸۷۷۰b() {
        this.f۸۹۴۳e = false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۸۷۶۹a() {
        if (!this.f۸۹۴۳e) {
            return;
        }
        Iterator<Cy> it = this.f۸۹۳۹a.iterator();
        while (it.hasNext()) {
            Cy animator = it.next();
            animator.m۱۰۹۸۸a();
        }
        this.f۸۹۴۳e = false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Ch m۸۷۶۴a(long duration) {
        if (!this.f۸۹۴۳e) {
            this.f۸۹۴۰b = duration;
        }
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Ch m۸۷۶۸a(Interpolator interpolator) {
        if (!this.f۸۹۴۳e) {
            this.f۸۹۴۱c = interpolator;
        }
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Ch m۸۷۶۷a(InterfaceCz listener) {
        if (!this.f۸۹۴۳e) {
            this.f۸۹۴۲d = listener;
        }
        return this;
    }

    /* renamed from: a.b.h.f.h$a */
    class a extends Ca0 {

        /* renamed from: a, reason: contains not printable characters */
        private boolean f۸۹۴۵a = false;

        /* renamed from: b, reason: contains not printable characters */
        private int f۸۹۴۶b = 0;

        a() {
        }

        @Override // android.support.v4.view.Ca0, android.support.v4.view.InterfaceCz
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۵۷۹۶b(View view) {
            if (this.f۸۹۴۵a) {
                return;
            }
            this.f۸۹۴۵a = true;
            InterfaceCz interfaceCz = Ch.this.f۸۹۴۲d;
            if (interfaceCz != null) {
                interfaceCz.mo۱۵۷۹۶b(null);
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۸۷۷۲a() {
            this.f۸۹۴۶b = 0;
            this.f۸۹۴۵a = false;
            Ch.this.m۸۷۷۰b();
        }

        @Override // android.support.v4.view.InterfaceCz
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۵۷۹۵a(View view) {
            int i = this.f۸۹۴۶b + 1;
            this.f۸۹۴۶b = i;
            if (i == Ch.this.f۸۹۳۹a.size()) {
                InterfaceCz interfaceCz = Ch.this.f۸۹۴۲d;
                if (interfaceCz != null) {
                    interfaceCz.mo۱۵۷۹۵a(null);
                }
                m۸۷۷۲a();
            }
        }
    }
}
