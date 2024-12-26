package android.support.constraint.p۰۴۱i.p۰۴۲j;

import android.support.constraint.p۰۴۱i.Cc;
import android.support.constraint.p۰۴۱i.Ci;

/* renamed from: android.support.constraint.i.j.d  reason: invalid class name */
public class Cd {

    /* renamed from: a  reason: contains not printable characters */
    private Ck f۹۳۰۴a = new Ck(this);

    /* renamed from: b  reason: contains not printable characters */
    final Ce f۹۳۰۵b;

    /* renamed from: c  reason: contains not printable characters */
    final EnumCd f۹۳۰۶c;

    /* renamed from: d  reason: contains not printable characters */
    Cd f۹۳۰۷d;

    /* renamed from: e  reason: contains not printable characters */
    public int f۹۳۰۸e = 0;

    /* renamed from: f  reason: contains not printable characters */
    int f۹۳۰۹f = -1;

    /* renamed from: g  reason: contains not printable characters */
    private EnumCc f۹۳۱۰g = EnumCc.NONE;

    /* renamed from: h  reason: contains not printable characters */
    private int f۹۳۱۱h;

    /* renamed from: i  reason: contains not printable characters */
    Ci f۹۳۱۲i;

    /* renamed from: android.support.constraint.i.j.d$b  reason: invalid class name */
    public enum EnumCb {
        RELAXED,
        STRICT
    }

    /* renamed from: android.support.constraint.i.j.d$c  reason: invalid class name */
    public enum EnumCc {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: android.support.constraint.i.j.d$d  reason: invalid class name */
    public enum EnumCd {
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

    /* renamed from: d  reason: contains not printable characters */
    public Ck m۱۱۰۸۶d() {
        return this.f۹۳۰۴a;
    }

    public Cd(Ce owner, EnumCd type) {
        EnumCb bVar = EnumCb.RELAXED;
        this.f۹۳۱۱h = 0;
        this.f۹۳۰۵b = owner;
        this.f۹۳۰۶c = type;
    }

    /* renamed from: e  reason: contains not printable characters */
    public Ci m۱۱۰۸۷e() {
        return this.f۹۳۱۲i;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۰۸۰a(Cc cache) {
        Ci iVar = this.f۹۳۱۲i;
        if (iVar == null) {
            this.f۹۳۱۲i = new Ci(Ci.EnumCa.UNRESTRICTED, null);
        } else {
            iVar.m۱۱۰۶۲a();
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public Ce m۱۱۰۸۵c() {
        return this.f۹۳۰۵b;
    }

    /* renamed from: h  reason: contains not printable characters */
    public EnumCd m۱۱۰۹۰h() {
        return this.f۹۳۰۶c;
    }

    /* renamed from: b  reason: contains not printable characters */
    public int m۱۱۰۸۴b() {
        Cd dVar;
        if (this.f۹۳۰۵b.m۱۱۱۶۲s() == 8) {
            return 0;
        }
        if (this.f۹۳۰۹f <= -1 || (dVar = this.f۹۳۰۷d) == null || dVar.f۹۳۰۵b.m۱۱۱۶۲s() != 8) {
            return this.f۹۳۰۸e;
        }
        return this.f۹۳۰۹f;
    }

    /* renamed from: f  reason: contains not printable characters */
    public EnumCc m۱۱۰۸۸f() {
        return this.f۹۳۱۰g;
    }

    /* renamed from: g  reason: contains not printable characters */
    public Cd m۱۱۰۸۹g() {
        return this.f۹۳۰۷d;
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۱۰۷۹a() {
        return this.f۹۳۱۱h;
    }

    /* renamed from: j  reason: contains not printable characters */
    public void m۱۱۰۹۲j() {
        this.f۹۳۰۷d = null;
        this.f۹۳۰۸e = 0;
        this.f۹۳۰۹f = -1;
        this.f۹۳۱۰g = EnumCc.STRONG;
        this.f۹۳۱۱h = 0;
        EnumCb bVar = EnumCb.RELAXED;
        this.f۹۳۰۴a.m۱۱۲۱۸d();
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۰۸۳a(Cd toAnchor, int margin, EnumCc strength, int creator) {
        return m۱۱۰۸۲a(toAnchor, margin, -1, strength, creator, false);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۰۸۲a(Cd toAnchor, int margin, int goneMargin, EnumCc strength, int creator, boolean forceConnection) {
        if (toAnchor == null) {
            this.f۹۳۰۷d = null;
            this.f۹۳۰۸e = 0;
            this.f۹۳۰۹f = -1;
            this.f۹۳۱۰g = EnumCc.NONE;
            this.f۹۳۱۱h = 2;
            return true;
        } else if (!forceConnection && !m۱۱۰۸۱a(toAnchor)) {
            return false;
        } else {
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
    }

    /* renamed from: i  reason: contains not printable characters */
    public boolean m۱۱۰۹۱i() {
        return this.f۹۳۰۷d != null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۰۸۱a(Cd anchor) {
        boolean isCompatible = false;
        if (anchor == null) {
            return false;
        }
        EnumCd target = anchor.m۱۱۰۹۰h();
        EnumCd dVar = this.f۹۳۰۶c;
        if (target != dVar) {
            switch (Ca.f۹۳۱۳a[dVar.ordinal()]) {
                case 1:
                    if (target == EnumCd.BASELINE || target == EnumCd.CENTER_X || target == EnumCd.CENTER_Y) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    boolean isCompatible2 = target == EnumCd.LEFT || target == EnumCd.RIGHT;
                    if (!(anchor.m۱۱۰۸۵c() instanceof Cg)) {
                        return isCompatible2;
                    }
                    if (isCompatible2 || target == EnumCd.CENTER_X) {
                        isCompatible = true;
                    }
                    return isCompatible;
                case 4:
                case 5:
                    boolean isCompatible3 = target == EnumCd.TOP || target == EnumCd.BOTTOM;
                    if (!(anchor.m۱۱۰۸۵c() instanceof Cg)) {
                        return isCompatible3;
                    }
                    if (isCompatible3 || target == EnumCd.CENTER_Y) {
                        isCompatible = true;
                    }
                    return isCompatible;
                case 6:
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f۹۳۰۶c.name());
            }
        } else if (dVar != EnumCd.BASELINE || (anchor.m۱۱۰۸۵c().m۱۱۱۶۸y() && m۱۱۰۸۵c().m۱۱۱۶۸y())) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.constraint.i.j.d$a  reason: invalid class name */
    public static /* synthetic */ class Ca {

        /* renamed from: a  reason: contains not printable characters */
        static final /* synthetic */ int[] f۹۳۱۳a = new int[EnumCd.values().length];

        static {
            try {
                f۹۳۱۳a[EnumCd.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f۹۳۱۳a[EnumCd.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۹۳۱۳a[EnumCd.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f۹۳۱۳a[EnumCd.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f۹۳۱۳a[EnumCd.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f۹۳۱۳a[EnumCd.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f۹۳۱۳a[EnumCd.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f۹۳۱۳a[EnumCd.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f۹۳۱۳a[EnumCd.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
        }
    }

    public String toString() {
        return this.f۹۳۰۵b.m۱۱۱۳۹f() + ":" + this.f۹۳۰۶c.toString();
    }
}
