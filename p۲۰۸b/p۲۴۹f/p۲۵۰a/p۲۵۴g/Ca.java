package p۲۰۸b.p۲۴۹f.p۲۵۰a.p۲۵۴g;

/* renamed from: b.f.a.g.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca extends Cb {

    /* renamed from: f, reason: contains not printable characters */
    private int f۱۲۸۴۶f;

    /* renamed from: g, reason: contains not printable characters */
    private int f۱۲۸۴۷g;

    /* renamed from: h, reason: contains not printable characters */
    private int f۱۲۸۴۸h;

    /* renamed from: i, reason: contains not printable characters */
    private int f۱۲۸۴۹i;

    private Ca(int originalWidth, int originalHeight, int viewWidth, int viewHeight) {
        this.f۱۲۸۴۶f = originalWidth;
        this.f۱۲۸۴۷g = originalHeight;
        this.f۱۲۸۴۸h = viewWidth;
        this.f۱۲۸۴۹i = viewHeight;
    }

    @Override // p۲۰۸b.p۲۴۹f.p۲۵۰a.p۲۵۴g.Cb
    /* renamed from: a, reason: contains not printable characters */
    protected float mo۱۴۱۱۰a(float x) {
        return (this.f۱۲۸۴۸h * x) / this.f۱۲۸۴۶f;
    }

    @Override // p۲۰۸b.p۲۴۹f.p۲۵۰a.p۲۵۴g.Cb
    /* renamed from: b, reason: contains not printable characters */
    protected float mo۱۴۱۱۲b(float y) {
        return (this.f۱۲۸۴۹i * y) / this.f۱۲۸۴۷g;
    }

    /* renamed from: b.f.a.g.a$b */
    public static class b {

        /* renamed from: a, reason: contains not printable characters */
        private int f۱۲۸۵۰a;

        /* renamed from: b, reason: contains not printable characters */
        private int f۱۲۸۵۱b;

        /* renamed from: c, reason: contains not printable characters */
        private int f۱۲۸۵۲c;

        /* renamed from: d, reason: contains not printable characters */
        private int f۱۲۸۵۳d;

        /* renamed from: b, reason: contains not printable characters */
        public b m۱۴۱۰۳b(int originalWidth) {
            this.f۱۲۸۵۰a = originalWidth;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public b m۱۴۱۰۱a(int originalHeight) {
            this.f۱۲۸۵۱b = originalHeight;
            return this;
        }

        /* renamed from: d, reason: contains not printable characters */
        public b m۱۴۱۰۵d(int width) {
            this.f۱۲۸۵۲c = width;
            return this;
        }

        /* renamed from: c, reason: contains not printable characters */
        public b m۱۴۱۰۴c(int height) {
            this.f۱۲۸۵۳d = height;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public Ca m۱۴۱۰۲a() {
            return new Ca(this.f۱۲۸۵۰a, this.f۱۲۸۵۱b, this.f۱۲۸۵۲c, this.f۱۲۸۵۳d);
        }
    }
}
