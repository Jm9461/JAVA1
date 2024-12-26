package android.support.v7.widget;

/* access modifiers changed from: package-private */
public class z0 {

    /* renamed from: a  reason: collision with root package name */
    private int f۲۳۱۲a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f۲۳۱۳b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f۲۳۱۴c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private int f۲۳۱۵d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f۲۳۱۶e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f۲۳۱۷f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f۲۳۱۸g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f۲۳۱۹h = false;

    z0() {
    }

    public int b() {
        return this.f۲۳۱۲a;
    }

    public int c() {
        return this.f۲۳۱۳b;
    }

    public int d() {
        return this.f۲۳۱۸g ? this.f۲۳۱۳b : this.f۲۳۱۲a;
    }

    public int a() {
        return this.f۲۳۱۸g ? this.f۲۳۱۲a : this.f۲۳۱۳b;
    }

    public void b(int start, int end) {
        this.f۲۳۱۴c = start;
        this.f۲۳۱۵d = end;
        this.f۲۳۱۹h = true;
        if (this.f۲۳۱۸g) {
            if (end != Integer.MIN_VALUE) {
                this.f۲۳۱۲a = end;
            }
            if (start != Integer.MIN_VALUE) {
                this.f۲۳۱۳b = start;
                return;
            }
            return;
        }
        if (start != Integer.MIN_VALUE) {
            this.f۲۳۱۲a = start;
        }
        if (end != Integer.MIN_VALUE) {
            this.f۲۳۱۳b = end;
        }
    }

    public void a(int left, int right) {
        this.f۲۳۱۹h = false;
        if (left != Integer.MIN_VALUE) {
            this.f۲۳۱۶e = left;
            this.f۲۳۱۲a = left;
        }
        if (right != Integer.MIN_VALUE) {
            this.f۲۳۱۷f = right;
            this.f۲۳۱۳b = right;
        }
    }

    public void a(boolean isRtl) {
        if (isRtl != this.f۲۳۱۸g) {
            this.f۲۳۱۸g = isRtl;
            if (!this.f۲۳۱۹h) {
                this.f۲۳۱۲a = this.f۲۳۱۶e;
                this.f۲۳۱۳b = this.f۲۳۱۷f;
            } else if (isRtl) {
                int i = this.f۲۳۱۵d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f۲۳۱۶e;
                }
                this.f۲۳۱۲a = i;
                int i2 = this.f۲۳۱۴c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f۲۳۱۷f;
                }
                this.f۲۳۱۳b = i2;
            } else {
                int i3 = this.f۲۳۱۴c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f۲۳۱۶e;
                }
                this.f۲۳۱۲a = i3;
                int i4 = this.f۲۳۱۵d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f۲۳۱۷f;
                }
                this.f۲۳۱۳b = i4;
            }
        }
    }
}
