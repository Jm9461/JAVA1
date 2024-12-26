package p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۳a;

import java.util.concurrent.Executor;

/* renamed from: a.a.a.a.a  reason: invalid class name */
public class Ca extends AbstractCc {

    /* renamed from: c  reason: contains not printable characters */
    private static volatile Ca f۸۲۲۸c;

    /* renamed from: a  reason: contains not printable characters */
    private AbstractCc f۸۲۲۹a = this.f۸۲۳۰b;

    /* renamed from: b  reason: contains not printable characters */
    private AbstractCc f۸۲۳۰b = new Cb();

    /* renamed from: a.a.a.a.a$a  reason: invalid class name */
    static class ExecutorCa implements Executor {
        ExecutorCa() {
        }

        public void execute(Runnable command) {
            Ca.m۹۹۱۲b().m۹۹۱۵b(command);
        }
    }

    static {
        new ExecutorCa();
        new ExecutorCb();
    }

    /* renamed from: a.a.a.a.a$b  reason: invalid class name */
    static class ExecutorCb implements Executor {
        ExecutorCb() {
        }

        public void execute(Runnable command) {
            Ca.m۹۹۱۲b().m۹۹۱۳a(command);
        }
    }

    private Ca() {
    }

    /* renamed from: b  reason: contains not printable characters */
    public static Ca m۹۹۱۲b() {
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

    @Override // p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۳a.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public void m۹۹۱۳a(Runnable runnable) {
        this.f۸۲۲۹a.m۹۹۱۹a(runnable);
    }

    @Override // p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۳a.AbstractCc
    /* renamed from: b  reason: contains not printable characters */
    public void m۹۹۱۵b(Runnable runnable) {
        this.f۸۲۲۹a.m۹۹۲۱b(runnable);
    }

    @Override // p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۳a.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۹۹۱۴a() {
        return this.f۸۲۲۹a.m۹۹۲۰a();
    }
}
