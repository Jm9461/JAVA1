package p۱۳۶d.p۱۳۷a.p۱۳۸a;

import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa;
import p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCb;

/* access modifiers changed from: package-private */
/* renamed from: d.a.a.d  reason: invalid class name */
public final class Cd extends AbstractCb {

    /* renamed from: a  reason: contains not printable characters */
    WeakReference<AbstractCa> f۱۵۵۹۶a;

    Cd(AbstractCa animator, AbstractCa target) {
        super(target);
        this.f۱۵۵۹۶a = new WeakReference<>(animator);
    }

    @Override // p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۴۸۰a() {
        AbstractCa a = this.f۱۵۵۹۶a.get();
        if (a != null) {
            a.m۱۶۱۹۰b();
        }
    }

    @Override // p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۴۸۱a(int duration) {
        AbstractCa a = this.f۱۵۵۹۶a.get();
        if (a != null) {
            a.m۱۶۱۸۶a((long) duration);
        }
    }

    @Override // p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۴۸۲a(Interpolator value) {
        AbstractCa a = this.f۱۵۵۹۶a.get();
        if (a != null) {
            a.m۱۶۱۸۸a(value);
        }
    }

    @Override // p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۴۸۳a(AbstractCb.AbstractCa listener) {
        AbstractCa a = this.f۱۵۵۹۶a.get();
        if (a != null) {
            if (listener == null) {
                a.m۱۶۱۸۹a((AbstractCa.AbstractCa) null);
            } else {
                a.m۱۶۱۸۹a(new Ca(this, listener));
            }
        }
    }

    /* renamed from: d.a.a.d$a  reason: invalid class name */
    class Ca implements AbstractCa.AbstractCa {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ AbstractCb.AbstractCa f۱۵۵۹۷a;

        Ca(Cd this$0, AbstractCb.AbstractCa aVar) {
            this.f۱۵۵۹۷a = aVar;
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۸۴۸۶c(AbstractCa animation) {
            this.f۱۵۵۹۷a.m۱۸۴۷۵d();
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۴۸۴a(AbstractCa animation) {
            this.f۱۵۵۹۷a.m۱۸۴۷۲a();
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۸۴۸۵b(AbstractCa animation) {
            this.f۱۵۵۹۷a.m۱۸۴۷۴c();
        }
    }
}
