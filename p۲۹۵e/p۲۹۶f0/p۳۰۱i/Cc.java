package p۲۹۵e.p۲۹۶f0.p۳۰۱i;

import p۳۰۵f.Cf;

/* renamed from: e.f0.i.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cc {

    /* renamed from: d, reason: contains not printable characters */
    public static final Cf f۱۵۸۸۲d = Cf.m۱۷۳۶۱d(":");

    /* renamed from: e, reason: contains not printable characters */
    public static final Cf f۱۵۸۸۳e = Cf.m۱۷۳۶۱d(":status");

    /* renamed from: f, reason: contains not printable characters */
    public static final Cf f۱۵۸۸۴f = Cf.m۱۷۳۶۱d(":method");

    /* renamed from: g, reason: contains not printable characters */
    public static final Cf f۱۵۸۸۵g = Cf.m۱۷۳۶۱d(":path");

    /* renamed from: h, reason: contains not printable characters */
    public static final Cf f۱۵۸۸۶h = Cf.m۱۷۳۶۱d(":scheme");

    /* renamed from: i, reason: contains not printable characters */
    public static final Cf f۱۵۸۸۷i = Cf.m۱۷۳۶۱d(":authority");

    /* renamed from: a, reason: contains not printable characters */
    public final Cf f۱۵۸۸۸a;

    /* renamed from: b, reason: contains not printable characters */
    public final Cf f۱۵۸۸۹b;

    /* renamed from: c, reason: contains not printable characters */
    final int f۱۵۸۹۰c;

    public Cc(String name, String value) {
        this(Cf.m۱۷۳۶۱d(name), Cf.m۱۷۳۶۱d(value));
    }

    public Cc(Cf name, String value) {
        this(name, Cf.m۱۷۳۶۱d(value));
    }

    public Cc(Cf name, Cf value) {
        this.f۱۵۸۸۸a = name;
        this.f۱۵۸۸۹b = value;
        this.f۱۵۸۹۰c = name.mo۱۷۴۷۱f() + 32 + value.mo۱۷۴۷۱f();
    }

    public boolean equals(Object other) {
        if (!(other instanceof Cc)) {
            return false;
        }
        Cc that = (Cc) other;
        return this.f۱۵۸۸۸a.equals(that.f۱۵۸۸۸a) && this.f۱۵۸۸۹b.equals(that.f۱۵۸۸۹b);
    }

    public int hashCode() {
        int result = (17 * 31) + this.f۱۵۸۸۸a.hashCode();
        return (result * 31) + this.f۱۵۸۸۹b.hashCode();
    }

    public String toString() {
        return p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۳۵a("%s: %s", this.f۱۵۸۸۸a.mo۱۷۴۷۴i(), this.f۱۵۸۸۹b.mo۱۷۴۷۴i());
    }
}
