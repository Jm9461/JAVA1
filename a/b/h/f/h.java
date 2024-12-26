package a.b.h.f;

import android.support.v4.view.a0;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public class h {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<y> f۴۹۶a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private long f۴۹۷b = -1;

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f۴۹۸c;

    /* renamed from: d  reason: collision with root package name */
    z f۴۹۹d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f۵۰۰e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f۵۰۱f = new a();

    public h a(y animator) {
        if (!this.f۵۰۰e) {
            this.f۴۹۶a.add(animator);
        }
        return this;
    }

    public h a(y anim1, y anim2) {
        this.f۴۹۶a.add(anim1);
        anim2.b(anim1.b());
        this.f۴۹۶a.add(anim2);
        return this;
    }

    public void c() {
        if (!this.f۵۰۰e) {
            Iterator<y> it = this.f۴۹۶a.iterator();
            while (it.hasNext()) {
                y animator = it.next();
                long j = this.f۴۹۷b;
                if (j >= 0) {
                    animator.a(j);
                }
                Interpolator interpolator = this.f۴۹۸c;
                if (interpolator != null) {
                    animator.a(interpolator);
                }
                if (this.f۴۹۹d != null) {
                    animator.a(this.f۵۰۱f);
                }
                animator.c();
            }
            this.f۵۰۰e = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f۵۰۰e = false;
    }

    public void a() {
        if (this.f۵۰۰e) {
            Iterator<y> it = this.f۴۹۶a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f۵۰۰e = false;
        }
    }

    public h a(long duration) {
        if (!this.f۵۰۰e) {
            this.f۴۹۷b = duration;
        }
        return this;
    }

    public h a(Interpolator interpolator) {
        if (!this.f۵۰۰e) {
            this.f۴۹۸c = interpolator;
        }
        return this;
    }

    public h a(z listener) {
        if (!this.f۵۰۰e) {
            this.f۴۹۹d = listener;
        }
        return this;
    }

    class a extends a0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f۵۰۲a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f۵۰۳b = 0;

        a() {
        }

        @Override // android.support.v4.view.a0, android.support.v4.view.z
        public void b(View view) {
            if (!this.f۵۰۲a) {
                this.f۵۰۲a = true;
                z zVar = h.this.f۴۹۹d;
                if (zVar != null) {
                    zVar.b(null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f۵۰۳b = 0;
            this.f۵۰۲a = false;
            h.this.b();
        }

        @Override // android.support.v4.view.z
        public void a(View view) {
            int i = this.f۵۰۳b + 1;
            this.f۵۰۳b = i;
            if (i == h.this.f۴۹۶a.size()) {
                z zVar = h.this.f۴۹۹d;
                if (zVar != null) {
                    zVar.a(null);
                }
                a();
            }
        }
    }
}
