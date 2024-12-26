package p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۸g;

/* renamed from: b.f.a.g.a  reason: invalid class name */
public class Ca extends Cb {

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۲۸۴۶f;

    /* renamed from: g  reason: contains not printable characters */
    private int f۱۲۸۴۷g;

    /* renamed from: h  reason: contains not printable characters */
    private int f۱۲۸۴۸h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۲۸۴۹i;

    private Ca(int originalWidth, int originalHeight, int viewWidth, int viewHeight) {
        this.f۱۲۸۴۶f = originalWidth;
        this.f۱۲۸۴۷g = originalHeight;
        this.f۱۲۸۴۸h = viewWidth;
        this.f۱۲۸۴۹i = viewHeight;
    }

    /* access modifiers changed from: protected */
    @Override // p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۸g.Cb
    /* renamed from: a  reason: contains not printable characters */
    public float m۱۶۱۷۰a(float x) {
        return (((float) this.f۱۲۸۴۸h) * x) / ((float) this.f۱۲۸۴۶f);
    }

    /* access modifiers changed from: protected */
    @Override // p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۸g.Cb
    /* renamed from: b  reason: contains not printable characters */
    public float m۱۶۱۷۱b(float y) {
        return (((float) this.f۱۲۸۴۹i) * y) / ((float) this.f۱۲۸۴۷g);
    }

    /* renamed from: b.f.a.g.a$b  reason: invalid class name */
    public static class Cb {

        /* renamed from: a  reason: contains not printable characters */
        private int f۱۲۸۵۰a;

        /* renamed from: b  reason: contains not printable characters */
        private int f۱۲۸۵۱b;

        /* renamed from: c  reason: contains not printable characters */
        private int f۱۲۸۵۲c;

        /* renamed from: d  reason: contains not printable characters */
        private int f۱۲۸۵۳d;

        /* renamed from: b  reason: contains not printable characters */
        public Cb m۱۶۱۷۴b(int originalWidth) {
            this.f۱۲۸۵۰a = originalWidth;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cb m۱۶۱۷۲a(int originalHeight) {
            this.f۱۲۸۵۱b = originalHeight;
            return this;
        }

        /* renamed from: d  reason: contains not printable characters */
        public Cb m۱۶۱۷۶d(int width) {
            this.f۱۲۸۵۲c = width;
            return this;
        }

        /* renamed from: c  reason: contains not printable characters */
        public Cb m۱۶۱۷۵c(int height) {
            this.f۱۲۸۵۳d = height;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۶۱۷۳a() {
            return new Ca(this.f۱۲۸۵۰a, this.f۱۲۸۵۱b, this.f۱۲۸۵۲c, this.f۱۲۸۵۳d);
        }
    }
}
