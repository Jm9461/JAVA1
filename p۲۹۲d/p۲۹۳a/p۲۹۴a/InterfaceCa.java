package p۲۹۲d.p۲۹۳a.p۲۹۴a;

import android.annotation.TargetApi;
import android.view.View;
import java.lang.ref.WeakReference;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa;
import p۲۹۲d.p۲۹۳a.p۲۹۴a.Ce;

/* renamed from: d.a.a.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public interface InterfaceCa {

    /* renamed from: b, reason: contains not printable characters */
    public static final e f۱۵۵۸۷b = new e();

    /* renamed from: a, reason: contains not printable characters */
    void mo۱۷۵۸۴a();

    /* renamed from: a, reason: contains not printable characters */
    void mo۱۷۵۸۵a(d dVar);

    /* renamed from: b, reason: contains not printable characters */
    void mo۱۷۵۸۶b();

    float getRevealRadius();

    void setRevealRadius(float f2);

    /* renamed from: d.a.a.a$d */
    public static class d {

        /* renamed from: a, reason: contains not printable characters */
        public final int f۱۵۵۹۱a;

        /* renamed from: b, reason: contains not printable characters */
        public final int f۱۵۵۹۲b;

        /* renamed from: c, reason: contains not printable characters */
        public final WeakReference<View> f۱۵۵۹۳c;

        public d(int centerX, int centerY, float startRadius, float endRadius, WeakReference<View> target) {
            this.f۱۵۵۹۱a = centerX;
            this.f۱۵۵۹۲b = centerY;
            this.f۱۵۵۹۳c = target;
        }

        /* renamed from: a, reason: contains not printable characters */
        public View m۱۶۳۸۵a() {
            return this.f۱۵۵۹۳c.get();
        }
    }

    /* renamed from: d.a.a.a$a */
    public static class a extends Ce.a {

        /* renamed from: a, reason: contains not printable characters */
        WeakReference<InterfaceCa> f۱۵۵۸۸a;

        a(InterfaceCa target) {
            this.f۱۵۵۸۸a = new WeakReference<>(target);
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: c, reason: contains not printable characters */
        public void mo۱۶۴۰۷c(AbstractCa animation) {
            InterfaceCa target = this.f۱۵۵۸۸a.get();
            target.mo۱۷۵۸۶b();
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۴۰۵a(AbstractCa animation) {
            InterfaceCa target = this.f۱۵۵۸۸a.get();
            target.mo۱۷۵۸۴a();
        }
    }

    @TargetApi(11)
    /* renamed from: d.a.a.a$b */
    public static class b extends a {

        /* renamed from: b, reason: contains not printable characters */
        int f۱۵۵۸۹b;

        /* renamed from: c, reason: contains not printable characters */
        int f۱۵۵۹۰c;

        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceCa interfaceCa) {
            super(interfaceCa);
            this.f۱۵۵۹۰c = ((View) interfaceCa).getLayerType();
            this.f۱۵۵۸۹b = 1;
        }

        @Override // p۲۹۲d.p۲۹۳a.p۲۹۴a.InterfaceCa.a, p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: c, reason: contains not printable characters */
        public void mo۱۶۴۰۷c(AbstractCa animation) {
            ((View) this.f۱۵۵۸۸a.get()).setLayerType(this.f۱۵۵۸۹b, null);
            super.mo۱۶۴۰۷c(animation);
        }

        @Override // p۲۹۲d.p۲۹۳a.p۲۹۴a.InterfaceCa.a, p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۴۰۵a(AbstractCa animation) {
            ((View) this.f۱۵۵۸۸a.get()).setLayerType(this.f۱۵۵۹۰c, null);
            super.mo۱۶۴۰۵a(animation);
        }
    }

    /* renamed from: d.a.a.a$c */
    public static class c extends b {
        @TargetApi(11)
        c(InterfaceCa target) {
            super(target);
            this.f۱۵۵۸۹b = 2;
        }
    }

    /* renamed from: d.a.a.a$e */
    public static class e extends p۲۰۸b.p۲۵۹h.p۲۶۱b.AbstractCa<InterfaceCa> {
        public e() {
            super("revealRadius");
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۱b.AbstractCa
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo۱۶۳۸۸a(InterfaceCa object, float value) {
            object.setRevealRadius(value);
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۱b.AbstractCc
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float mo۱۶۳۸۷a(InterfaceCa object) {
            return Float.valueOf(object.getRevealRadius());
        }
    }
}
