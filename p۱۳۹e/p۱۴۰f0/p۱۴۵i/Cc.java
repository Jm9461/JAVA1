package p۱۳۹e.p۱۴۰f0.p۱۴۵i;

import p۱۴۹f.Cf;

/* renamed from: e.f0.i.c  reason: invalid class name */
public final class Cc {

    /* renamed from: d  reason: contains not printable characters */
    public static final Cf f۱۵۸۸۲d = Cf.m۱۹۴۳۸d(":");

    /* renamed from: e  reason: contains not printable characters */
    public static final Cf f۱۵۸۸۳e = Cf.m۱۹۴۳۸d(":status");

    /* renamed from: f  reason: contains not printable characters */
    public static final Cf f۱۵۸۸۴f = Cf.m۱۹۴۳۸d(":method");

    /* renamed from: g  reason: contains not printable characters */
    public static final Cf f۱۵۸۸۵g = Cf.m۱۹۴۳۸d(":path");

    /* renamed from: h  reason: contains not printable characters */
    public static final Cf f۱۵۸۸۶h = Cf.m۱۹۴۳۸d(":scheme");

    /* renamed from: i  reason: contains not printable characters */
    public static final Cf f۱۵۸۸۷i = Cf.m۱۹۴۳۸d(":authority");

    /* renamed from: a  reason: contains not printable characters */
    public final Cf f۱۵۸۸۸a;

    /* renamed from: b  reason: contains not printable characters */
    public final Cf f۱۵۸۸۹b;

    /* renamed from: c  reason: contains not printable characters */
    final int f۱۵۸۹۰c;

    public Cc(String name, String value) {
        this(Cf.m۱۹۴۳۸d(name), Cf.m۱۹۴۳۸d(value));
    }

    public Cc(Cf name, String value) {
        this(name, Cf.m۱۹۴۳۸d(value));
    }

    public Cc(Cf name, Cf value) {
        this.f۱۵۸۸۸a = name;
        this.f۱۵۸۸۹b = value;
        this.f۱۵۸۹۰c = name.m۱۹۴۵۱f() + 32 + value.m۱۹۴۵۱f();
    }

    public boolean equals(Object other) {
        if (!(other instanceof Cc)) {
            return false;
        }
        Cc that = (Cc) other;
        if (!this.f۱۵۸۸۸a.equals(that.f۱۵۸۸۸a) || !this.f۱۵۸۸۹b.equals(that.f۱۵۸۸۹b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((17 * 31) + this.f۱۵۸۸۸a.hashCode()) * 31) + this.f۱۵۸۸۹b.hashCode();
    }

    public String toString() {
        return p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۱۴a("%s: %s", this.f۱۵۸۸۸a.m۱۹۴۵۴i(), this.f۱۵۸۸۹b.m۱۹۴۵۴i());
    }
}
