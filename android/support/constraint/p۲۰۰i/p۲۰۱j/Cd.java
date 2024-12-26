package android.support.constraint.p۲۰۰i.p۲۰۱j;

import android.support.constraint.p۲۰۰i.Cc;
import android.support.constraint.p۲۰۰i.Ci;

/* renamed from: android.support.constraint.i.j.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cd {

    /* renamed from: b, reason: contains not printable characters */
    final Ce f۹۳۰۵b;

    /* renamed from: c, reason: contains not printable characters */
    final d f۹۳۰۶c;

    /* renamed from: d, reason: contains not printable characters */
    Cd f۹۳۰۷d;

    /* renamed from: h, reason: contains not printable characters */
    private int f۹۳۱۱h;

    /* renamed from: i, reason: contains not printable characters */
    Ci f۹۳۱۲i;

    /* renamed from: a, reason: contains not printable characters */
    private Ck f۹۳۰۴a = new Ck(this);

    /* renamed from: e, reason: contains not printable characters */
    public int f۹۳۰۸e = 0;

    /* renamed from: f, reason: contains not printable characters */
    int f۹۳۰۹f = -1;

    /* renamed from: g, reason: contains not printable characters */
    private c f۹۳۱۰g = c.NONE;

    /* renamed from: android.support.constraint.i.j.d$b */
    public enum b {
        RELAXED,
        STRICT
    }

    /* renamed from: android.support.constraint.i.j.d$c */
    public enum c {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: android.support.constraint.i.j.d$d */
    public enum d {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    /* renamed from: d, reason: contains not printable characters */
    public Ck m۹۰۱۸d() {
        return this.f۹۳۰۴a;
    }

    public Cd(Ce owner, d type) {
        b bVar = b.RELAXED;
        this.f۹۳۱۱h = 0;
        this.f۹۳۰۵b = owner;
        this.f۹۳۰۶c = type;
    }

    /* renamed from: e, reason: contains not printable characters */
    public Ci m۹۰۱۹e() {
        return this.f۹۳۱۲i;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۹۰۱۲a(Cc cache) {
        Ci ci = this.f۹۳۱۲i;
        if (ci == null) {
            this.f۹۳۱۲i = new Ci(Ci.a.UNRESTRICTED, null);
        } else {
            ci.m۸۹۹۴a();
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public Ce m۹۰۱۷c() {
        return this.f۹۳۰۵b;
    }

    /* renamed from: h, reason: contains not printable characters */
    public d m۹۰۲۲h() {
        return this.f۹۳۰۶c;
    }

    /* renamed from: b, reason: contains not printable characters */
    public int m۹۰۱۶b() {
        Cd cd;
        if (this.f۹۳۰۵b.m۹۰۹۴s() == 8) {
            return 0;
        }
        if (this.f۹۳۰۹f > -1 && (cd = this.f۹۳۰۷d) != null && cd.f۹۳۰۵b.m۹۰۹۴s() == 8) {
            return this.f۹۳۰۹f;
        }
        return this.f۹۳۰۸e;
    }

    /* renamed from: f, reason: contains not printable characters */
    public c m۹۰۲۰f() {
        return this.f۹۳۱۰g;
    }

    /* renamed from: g, reason: contains not printable characters */
    public Cd m۹۰۲۱g() {
        return this.f۹۳۰۷d;
    }

    /* renamed from: a, reason: contains not printable characters */
    public int m۹۰۱۱a() {
        return this.f۹۳۱۱h;
    }

    /* renamed from: j, reason: contains not printable characters */
    public void m۹۰۲۴j() {
        this.f۹۳۰۷d = null;
        this.f۹۳۰۸e = 0;
        this.f۹۳۰۹f = -1;
        this.f۹۳۱۰g = c.STRONG;
        this.f۹۳۱۱h = 0;
        b bVar = b.RELAXED;
        this.f۹۳۰۴a.mo۹۱۶۱d();
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۹۰۱۵a(Cd toAnchor, int margin, c strength, int creator) {
        return m۹۰۱۴a(toAnchor, margin, -1, strength, creator, false);
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۹۰۱۴a(Cd toAnchor, int margin, int goneMargin, c strength, int creator, boolean forceConnection) {
        if (toAnchor == null) {
            this.f۹۳۰۷d = null;
            this.f۹۳۰۸e = 0;
            this.f۹۳۰۹f = -1;
            this.f۹۳۱۰g = c.NONE;
            this.f۹۳۱۱h = 2;
            return true;
        }
        if (!forceConnection && !m۹۰۱۳a(toAnchor)) {
            return false;
        }
        this.f۹۳۰۷d = toAnchor;
        if (margin > 0) {
            this.f۹۳۰۸e = margin;
        } else {
            this.f۹۳۰۸e = 0;
        }
        this.f۹۳۰۹f = goneMargin;
        this.f۹۳۱۰g = strength;
        this.f۹۳۱۱h = creator;
        return true;
    }

    /* renamed from: i, reason: contains not printable characters */
    public boolean m۹۰۲۳i() {
        return this.f۹۳۰۷d != null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۹۰۱۳a(Cd anchor) {
        if (anchor == null) {
            return false;
        }
        d target = anchor.m۹۰۲۲h();
        d dVar = this.f۹۳۰۶c;
        if (target == dVar) {
            return dVar != d.BASELINE || (anchor.m۹۰۱۷c().m۹۱۰۰y() && m۹۰۱۷c().m۹۱۰۰y());
        }
        switch (a.f۹۳۱۳a[dVar.ordinal()]) {
            case 1:
                return (target == d.BASELINE || target == d.CENTER_X || target == d.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean isCompatible = target == d.LEFT || target == d.RIGHT;
                if (anchor.m۹۰۱۷c() instanceof Cg) {
                    return isCompatible || target == d.CENTER_X;
                }
                return isCompatible;
            case 4:
            case 5:
                boolean isCompatible2 = target == d.TOP || target == d.BOTTOM;
                if (anchor.m۹۰۱۷c() instanceof Cg) {
                    return isCompatible2 || target == d.CENTER_Y;
                }
                return isCompatible2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f۹۳۰۶c.name());
        }
    }

    /* renamed from: android.support.constraint.i.j.d$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: contains not printable characters */
        static final /* synthetic */ int[] f۹۳۱۳a = new int[d.values().length];

        static {
            try {
                f۹۳۱۳a[d.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۹۳۱۳a[d.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f۹۳۱۳a[d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f۹۳۱۳a[d.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f۹۳۱۳a[d.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f۹۳۱۳a[d.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f۹۳۱۳a[d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f۹۳۱۳a[d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError e9) {
            }
            try {
                f۹۳۱۳a[d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError e10) {
            }
        }
    }

    public String toString() {
        return this.f۹۳۰۵b.m۹۰۷۱f() + ":" + this.f۹۳۰۶c.toString();
    }
}
