package a.a.a.a;

import java.util.concurrent.Executor;

public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f۰c;

    /* renamed from: a  reason: collision with root package name */
    private c f۱a = this.f۲b;

    /* renamed from: b  reason: collision with root package name */
    private c f۲b = new b();

    /* renamed from: a.a.a.a.a$a  reason: collision with other inner class name */
    static class ExecutorC۰۰۰۰a implements Executor {
        ExecutorC۰۰۰۰a() {
        }

        public void execute(Runnable command) {
            a.b().b(command);
        }
    }

    static {
        new ExecutorC۰۰۰۰a();
        new b();
    }

    static class b implements Executor {
        b() {
        }

        public void execute(Runnable command) {
            a.b().a(command);
        }
    }

    private a() {
    }

    public static a b() {
        if (f۰c != null) {
            return f۰c;
        }
        synchronized (a.class) {
            if (f۰c == null) {
                f۰c = new a();
            }
        }
        return f۰c;
    }

    @Override // a.a.a.a.c
    public void a(Runnable runnable) {
        this.f۱a.a(runnable);
    }

    @Override // a.a.a.a.c
    public void b(Runnable runnable) {
        this.f۱a.b(runnable);
    }

    @Override // a.a.a.a.c
    public boolean a() {
        return this.f۱a.a();
    }
}
