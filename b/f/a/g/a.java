package b.f.a.g;

public class a extends b {

    /* renamed from: f  reason: collision with root package name */
    private int f۲۵۰۶f;

    /* renamed from: g  reason: collision with root package name */
    private int f۲۵۰۷g;

    /* renamed from: h  reason: collision with root package name */
    private int f۲۵۰۸h;
    private int i;

    private a(int originalWidth, int originalHeight, int viewWidth, int viewHeight) {
        this.f۲۵۰۶f = originalWidth;
        this.f۲۵۰۷g = originalHeight;
        this.f۲۵۰۸h = viewWidth;
        this.i = viewHeight;
    }

    /* access modifiers changed from: protected */
    @Override // b.f.a.g.b
    public float a(float x) {
        return (((float) this.f۲۵۰۸h) * x) / ((float) this.f۲۵۰۶f);
    }

    /* access modifiers changed from: protected */
    @Override // b.f.a.g.b
    public float b(float y) {
        return (((float) this.i) * y) / ((float) this.f۲۵۰۷g);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f۲۵۰۹a;

        /* renamed from: b  reason: collision with root package name */
        private int f۲۵۱۰b;

        /* renamed from: c  reason: collision with root package name */
        private int f۲۵۱۱c;

        /* renamed from: d  reason: collision with root package name */
        private int f۲۵۱۲d;

        public b b(int originalWidth) {
            this.f۲۵۰۹a = originalWidth;
            return this;
        }

        public b a(int originalHeight) {
            this.f۲۵۱۰b = originalHeight;
            return this;
        }

        public b d(int width) {
            this.f۲۵۱۱c = width;
            return this;
        }

        public b c(int height) {
            this.f۲۵۱۲d = height;
            return this;
        }

        public a a() {
            return new a(this.f۲۵۰۹a, this.f۲۵۱۰b, this.f۲۵۱۱c, this.f۲۵۱۲d);
        }
    }
}
