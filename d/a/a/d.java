package d.a.a;

import android.view.animation.Interpolator;
import b.h.a.a;
import d.a.a.b;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class d extends b {

    /* renamed from: a  reason: collision with root package name */
    WeakReference<b.h.a.a> f۳۶۶۱a;

    d(b.h.a.a animator, a target) {
        super(target);
        this.f۳۶۶۱a = new WeakReference<>(animator);
    }

    @Override // d.a.a.b
    public void a() {
        b.h.a.a a2 = this.f۳۶۶۱a.get();
        if (a2 != null) {
            a2.b();
        }
    }

    @Override // d.a.a.b
    public void a(int duration) {
        b.h.a.a a2 = this.f۳۶۶۱a.get();
        if (a2 != null) {
            a2.a((long) duration);
        }
    }

    @Override // d.a.a.b
    public void a(Interpolator value) {
        b.h.a.a a2 = this.f۳۶۶۱a.get();
        if (a2 != null) {
            a2.a(value);
        }
    }

    @Override // d.a.a.b
    public void a(b.a listener) {
        b.h.a.a a2 = this.f۳۶۶۱a.get();
        if (a2 != null) {
            if (listener == null) {
                a2.a((a.AbstractC۰۰۵۲a) null);
            } else {
                a2.a(new a(this, listener));
            }
        }
    }

    class a implements a.AbstractC۰۰۵۲a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.a f۳۶۶۲a;

        a(d this$0, b.a aVar) {
            this.f۳۶۶۲a = aVar;
        }

        @Override // b.h.a.a.AbstractC۰۰۵۲a
        public void c(b.h.a.a animation) {
            this.f۳۶۶۲a.d();
        }

        @Override // b.h.a.a.AbstractC۰۰۵۲a
        public void a(b.h.a.a animation) {
            this.f۳۶۶۲a.a();
        }

        @Override // b.h.a.a.AbstractC۰۰۵۲a
        public void b(b.h.a.a animation) {
            this.f۳۶۶۲a.c();
        }
    }
}
