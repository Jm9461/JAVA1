package p۲۹۲d.p۲۹۳a.p۲۹۴a;

import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa;
import p۲۹۲d.p۲۹۳a.p۲۹۴a.AbstractCb;

/* renamed from: d.a.a.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Cd extends AbstractCb {

    /* renamed from: a, reason: contains not printable characters */
    WeakReference<AbstractCa> f۱۵۵۹۶a;

    Cd(AbstractCa animator, InterfaceCa target) {
        super(target);
        this.f۱۵۵۹۶a = new WeakReference<>(animator);
    }

    @Override // p۲۹۲d.p۲۹۳a.p۲۹۴a.AbstractCb
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۶۴۰۱a() {
        AbstractCa a2 = this.f۱۵۵۹۶a.get();
        if (a2 != null) {
            a2.mo۱۴۲۷۲b();
        }
    }

    @Override // p۲۹۲d.p۲۹۳a.p۲۹۴a.AbstractCb
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۶۴۰۲a(int duration) {
        AbstractCa a2 = this.f۱۵۵۹۶a.get();
        if (a2 != null) {
            a2.mo۱۴۲۶۶a(duration);
        }
    }

    @Override // p۲۹۲d.p۲۹۳a.p۲۹۴a.AbstractCb
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۶۴۰۳a(Interpolator value) {
        AbstractCa a2 = this.f۱۵۵۹۶a.get();
        if (a2 != null) {
            a2.mo۱۴۲۶۸a(value);
        }
    }

    @Override // p۲۹۲d.p۲۹۳a.p۲۹۴a.AbstractCb
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۶۴۰۴a(AbstractCb.a listener) {
        AbstractCa a2 = this.f۱۵۵۹۶a.get();
        if (a2 == null) {
            return;
        }
        if (listener == null) {
            a2.m۱۴۱۱۸a((AbstractCa.a) null);
        } else {
            a2.m۱۴۱۱۸a(new a(this, listener));
        }
    }

    /* renamed from: d.a.a.d$a */
    class a implements AbstractCa.a {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ AbstractCb.a f۱۵۵۹۷a;

        a(Cd this$0, AbstractCb.a aVar) {
            this.f۱۵۵۹۷a = aVar;
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: c, reason: contains not printable characters */
        public void mo۱۶۴۰۷c(AbstractCa animation) {
            this.f۱۵۵۹۷a.mo۱۶۳۹۶d();
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۴۰۵a(AbstractCa animation) {
            this.f۱۵۵۹۷a.mo۱۶۳۹۳a();
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۶۴۱۰b(AbstractCa animation) {
            this.f۱۵۵۹۷a.mo۱۶۳۹۵c();
        }
    }
}
