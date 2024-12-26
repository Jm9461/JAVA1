package android.support.constraint.i.j;

public class l extends m {

    /* renamed from: c  reason: collision with root package name */
    float f۷۰۵c = 0.0f;

    @Override // android.support.constraint.i.j.m
    public void d() {
        super.d();
        this.f۷۰۵c = 0.0f;
    }

    public void a(int value) {
        if (this.f۷۰۷b == 0 || this.f۷۰۵c != ((float) value)) {
            this.f۷۰۵c = (float) value;
            if (this.f۷۰۷b == 1) {
                b();
            }
            a();
        }
    }

    public void f() {
        this.f۷۰۷b = 2;
    }
}
