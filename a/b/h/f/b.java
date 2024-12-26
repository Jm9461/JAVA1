package a.b.h.f;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class b {

    /* renamed from: c  reason: collision with root package name */
    private Object f۴۶۲c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f۴۶۳d;

    public interface a {
        void a(b bVar);

        boolean a(b bVar, Menu menu);

        boolean a(b bVar, MenuItem menuItem);

        boolean b(b bVar, Menu menu);
    }

    public abstract void a();

    public abstract void a(int i);

    public abstract void a(View view);

    public abstract void a(CharSequence charSequence);

    public abstract View b();

    public abstract void b(int i);

    public abstract void b(CharSequence charSequence);

    public abstract Menu c();

    public abstract MenuInflater d();

    public abstract CharSequence e();

    public abstract CharSequence g();

    public abstract void i();

    public abstract boolean j();

    public void a(Object tag) {
        this.f۴۶۲c = tag;
    }

    public Object f() {
        return this.f۴۶۲c;
    }

    public void a(boolean titleOptional) {
        this.f۴۶۳d = titleOptional;
    }

    public boolean h() {
        return this.f۴۶۳d;
    }
}
