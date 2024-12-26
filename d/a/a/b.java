package d.a.a;

import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public abstract class b {

    public interface a {
        void a();

        void b();

        void c();

        void d();
    }

    public abstract void a();

    public abstract void a(int i);

    public abstract void a(Interpolator interpolator);

    public abstract void a(a aVar);

    public b(a target) {
        new WeakReference(target);
    }
}
