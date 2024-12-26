package p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۲a;

import java.util.concurrent.Executor;

/* renamed from: a.a.a.a.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca extends AbstractCc {

    /* renamed from: c, reason: contains not printable characters */
    private static volatile Ca f۸۲۲۸c;

    /* renamed from: b, reason: contains not printable characters */
    private AbstractCc f۸۲۳۰b = new Cb();

    /* renamed from: a, reason: contains not printable characters */
    private AbstractCc f۸۲۲۹a = this.f۸۲۳۰b;

    /* renamed from: a.a.a.a.a$a */
    static class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            Ca.m۷۸۴۵b().mo۷۸۵۴b(command);
        }
    }

    static {
        new a();
        new b();
    }

    /* renamed from: a.a.a.a.a$b */
    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            Ca.m۷۸۴۵b().mo۷۸۵۲a(command);
        }
    }

    private Ca() {
    }

    /* renamed from: b, reason: contains not printable characters */
    public static Ca m۷۸۴۵b() {
        if (f۸۲۲۸c != null) {
            return f۸۲۲۸c;
        }
        synchronized (Ca.class) {
            if (f۸۲۲۸c == null) {
                f۸۲۲۸c = new Ca();
            }
        }
        return f۸۲۲۸c;
    }

    @Override // p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۲a.AbstractCc
    /* renamed from: a, reason: contains not printable characters */
    public void mo۷۸۵۲a(Runnable runnable) {
        this.f۸۲۲۹a.mo۷۸۵۲a(runnable);
    }

    @Override // p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۲a.AbstractCc
    /* renamed from: b, reason: contains not printable characters */
    public void mo۷۸۵۴b(Runnable runnable) {
        this.f۸۲۲۹a.mo۷۸۵۴b(runnable);
    }

    @Override // p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۲a.AbstractCc
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۷۸۵۳a() {
        return this.f۸۲۲۹a.mo۷۸۵۳a();
    }
}
