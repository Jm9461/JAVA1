package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.f;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public abstract class k {

    public interface a {
    }

    public static abstract class b {
        public abstract void a(k kVar, f fVar);

        public abstract void a(k kVar, f fVar, Context context);

        public abstract void a(k kVar, f fVar, Bundle bundle);

        public abstract void a(k kVar, f fVar, View view, Bundle bundle);

        public abstract void b(k kVar, f fVar);

        public abstract void b(k kVar, f fVar, Context context);

        public abstract void b(k kVar, f fVar, Bundle bundle);

        public abstract void c(k kVar, f fVar);

        public abstract void c(k kVar, f fVar, Bundle bundle);

        public abstract void d(k kVar, f fVar);

        public abstract void d(k kVar, f fVar, Bundle bundle);

        public abstract void e(k kVar, f fVar);

        public abstract void f(k kVar, f fVar);

        public abstract void g(k kVar, f fVar);
    }

    public interface c {
        void a();
    }

    public abstract f.g a(f fVar);

    public abstract f a(Bundle bundle, String str);

    public abstract f a(String str);

    public abstract q a();

    public abstract void a(int i, int i2);

    public abstract void a(Bundle bundle, String str, f fVar);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract List<f> b();

    public abstract boolean c();

    public abstract boolean d();
}
