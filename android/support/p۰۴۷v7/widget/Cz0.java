package android.support.p۰۴۷v7.widget;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.z0  reason: invalid class name */
public class Cz0 {

    /* renamed from: a  reason: contains not printable characters */
    private int f۱۲۴۲۹a = 0;

    /* renamed from: b  reason: contains not printable characters */
    private int f۱۲۴۳۰b = 0;

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۲۴۳۱c = Integer.MIN_VALUE;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۲۴۳۲d = Integer.MIN_VALUE;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۲۴۳۳e = 0;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۲۴۳۴f = 0;

    /* renamed from: g  reason: contains not printable characters */
    private boolean f۱۲۴۳۵g = false;

    /* renamed from: h  reason: contains not printable characters */
    private boolean f۱۲۴۳۶h = false;

    Cz0() {
    }

    /* renamed from: b  reason: contains not printable characters */
    public int m۱۵۷۵۵b() {
        return this.f۱۲۴۲۹a;
    }

    /* renamed from: c  reason: contains not printable characters */
    public int m۱۵۷۵۷c() {
        return this.f۱۲۴۳۰b;
    }

    /* renamed from: d  reason: contains not printable characters */
    public int m۱۵۷۵۸d() {
        return this.f۱۲۴۳۵g ? this.f۱۲۴۳۰b : this.f۱۲۴۲۹a;
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۵۷۵۲a() {
        return this.f۱۲۴۳۵g ? this.f۱۲۴۲۹a : this.f۱۲۴۳۰b;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۷۵۶b(int start, int end) {
        this.f۱۲۴۳۱c = start;
        this.f۱۲۴۳۲d = end;
        this.f۱۲۴۳۶h = true;
        if (this.f۱۲۴۳۵g) {
            if (end != Integer.MIN_VALUE) {
                this.f۱۲۴۲۹a = end;
            }
            if (start != Integer.MIN_VALUE) {
                this.f۱۲۴۳۰b = start;
                return;
            }
            return;
        }
        if (start != Integer.MIN_VALUE) {
            this.f۱۲۴۲۹a = start;
        }
        if (end != Integer.MIN_VALUE) {
            this.f۱۲۴۳۰b = end;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۵۳a(int left, int right) {
        this.f۱۲۴۳۶h = false;
        if (left != Integer.MIN_VALUE) {
            this.f۱۲۴۳۳e = left;
            this.f۱۲۴۲۹a = left;
        }
        if (right != Integer.MIN_VALUE) {
            this.f۱۲۴۳۴f = right;
            this.f۱۲۴۳۰b = right;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۵۴a(boolean isRtl) {
        if (isRtl != this.f۱۲۴۳۵g) {
            this.f۱۲۴۳۵g = isRtl;
            if (!this.f۱۲۴۳۶h) {
                this.f۱۲۴۲۹a = this.f۱۲۴۳۳e;
                this.f۱۲۴۳۰b = this.f۱۲۴۳۴f;
            } else if (isRtl) {
                int i = this.f۱۲۴۳۲d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f۱۲۴۳۳e;
                }
                this.f۱۲۴۲۹a = i;
                int i2 = this.f۱۲۴۳۱c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f۱۲۴۳۴f;
                }
                this.f۱۲۴۳۰b = i2;
            } else {
                int i3 = this.f۱۲۴۳۱c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f۱۲۴۳۳e;
                }
                this.f۱۲۴۲۹a = i3;
                int i4 = this.f۱۲۴۳۲d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f۱۲۴۳۴f;
                }
                this.f۱۲۴۳۰b = i4;
            }
        }
    }
}
