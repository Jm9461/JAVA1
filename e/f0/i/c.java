package e.f0.i;

import f.f;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final f f۳۸۷۶d = f.d(":");

    /* renamed from: e  reason: collision with root package name */
    public static final f f۳۸۷۷e = f.d(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final f f۳۸۷۸f = f.d(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final f f۳۸۷۹g = f.d(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final f f۳۸۸۰h = f.d(":scheme");
    public static final f i = f.d(":authority");

    /* renamed from: a  reason: collision with root package name */
    public final f f۳۸۸۱a;

    /* renamed from: b  reason: collision with root package name */
    public final f f۳۸۸۲b;

    /* renamed from: c  reason: collision with root package name */
    final int f۳۸۸۳c;

    public c(String name, String value) {
        this(f.d(name), f.d(value));
    }

    public c(f name, String value) {
        this(name, f.d(value));
    }

    public c(f name, f value) {
        this.f۳۸۸۱a = name;
        this.f۳۸۸۲b = value;
        this.f۳۸۸۳c = name.f() + 32 + value.f();
    }

    public boolean equals(Object other) {
        if (!(other instanceof c)) {
            return false;
        }
        c that = (c) other;
        if (!this.f۳۸۸۱a.equals(that.f۳۸۸۱a) || !this.f۳۸۸۲b.equals(that.f۳۸۸۲b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((17 * 31) + this.f۳۸۸۱a.hashCode()) * 31) + this.f۳۸۸۲b.hashCode();
    }

    public String toString() {
        return e.f0.c.a("%s: %s", this.f۳۸۸۱a.i(), this.f۳۸۸۲b.i());
    }
}
