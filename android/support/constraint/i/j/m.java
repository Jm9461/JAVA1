package android.support.constraint.i.j;

import java.util.HashSet;
import java.util.Iterator;

public class m {

    /* renamed from: a  reason: collision with root package name */
    HashSet<m> f۷۰۶a = new HashSet<>(2);

    /* renamed from: b  reason: collision with root package name */
    int f۷۰۷b = 0;

    public void a(m node) {
        this.f۷۰۶a.add(node);
    }

    public void d() {
        this.f۷۰۷b = 0;
        this.f۷۰۶a.clear();
    }

    public void b() {
        this.f۷۰۷b = 0;
        Iterator<m> it = this.f۷۰۶a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void a() {
        this.f۷۰۷b = 1;
        Iterator<m> it = this.f۷۰۶a.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    public boolean c() {
        return this.f۷۰۷b == 1;
    }

    public void e() {
    }
}
