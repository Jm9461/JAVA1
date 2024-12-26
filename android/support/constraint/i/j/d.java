package android.support.constraint.i.j;

import android.support.constraint.i.i;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private k f۶۶۰a = new k(this);

    /* renamed from: b  reason: collision with root package name */
    final e f۶۶۱b;

    /* renamed from: c  reason: collision with root package name */
    final EnumC۰۰۲۲d f۶۶۲c;

    /* renamed from: d  reason: collision with root package name */
    d f۶۶۳d;

    /* renamed from: e  reason: collision with root package name */
    public int f۶۶۴e = 0;

    /* renamed from: f  reason: collision with root package name */
    int f۶۶۵f = -1;

    /* renamed from: g  reason: collision with root package name */
    private c f۶۶۶g = c.NONE;

    /* renamed from: h  reason: collision with root package name */
    private int f۶۶۷h;
    i i;

    public enum b {
        RELAXED,
        STRICT
    }

    public enum c {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: android.support.constraint.i.j.d$d  reason: collision with other inner class name */
    public enum EnumC۰۰۲۲d {
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

    public k d() {
        return this.f۶۶۰a;
    }

    public d(e owner, EnumC۰۰۲۲d type) {
        b bVar = b.RELAXED;
        this.f۶۶۷h = 0;
        this.f۶۶۱b = owner;
        this.f۶۶۲c = type;
    }

    public i e() {
        return this.i;
    }

    public void a(android.support.constraint.i.c cache) {
        i iVar = this.i;
        if (iVar == null) {
            this.i = new i(i.a.UNRESTRICTED, null);
        } else {
            iVar.a();
        }
    }

    public e c() {
        return this.f۶۶۱b;
    }

    public EnumC۰۰۲۲d h() {
        return this.f۶۶۲c;
    }

    public int b() {
        d dVar;
        if (this.f۶۶۱b.s() == 8) {
            return 0;
        }
        if (this.f۶۶۵f <= -1 || (dVar = this.f۶۶۳d) == null || dVar.f۶۶۱b.s() != 8) {
            return this.f۶۶۴e;
        }
        return this.f۶۶۵f;
    }

    public c f() {
        return this.f۶۶۶g;
    }

    public d g() {
        return this.f۶۶۳d;
    }

    public int a() {
        return this.f۶۶۷h;
    }

    public void j() {
        this.f۶۶۳d = null;
        this.f۶۶۴e = 0;
        this.f۶۶۵f = -1;
        this.f۶۶۶g = c.STRONG;
        this.f۶۶۷h = 0;
        b bVar = b.RELAXED;
        this.f۶۶۰a.d();
    }

    public boolean a(d toAnchor, int margin, c strength, int creator) {
        return a(toAnchor, margin, -1, strength, creator, false);
    }

    public boolean a(d toAnchor, int margin, int goneMargin, c strength, int creator, boolean forceConnection) {
        if (toAnchor == null) {
            this.f۶۶۳d = null;
            this.f۶۶۴e = 0;
            this.f۶۶۵f = -1;
            this.f۶۶۶g = c.NONE;
            this.f۶۶۷h = 2;
            return true;
        } else if (!forceConnection && !a(toAnchor)) {
            return false;
        } else {
            this.f۶۶۳d = toAnchor;
            if (margin > 0) {
                this.f۶۶۴e = margin;
            } else {
                this.f۶۶۴e = 0;
            }
            this.f۶۶۵f = goneMargin;
            this.f۶۶۶g = strength;
            this.f۶۶۷h = creator;
            return true;
        }
    }

    public boolean i() {
        return this.f۶۶۳d != null;
    }

    public boolean a(d anchor) {
        boolean isCompatible = false;
        if (anchor == null) {
            return false;
        }
        EnumC۰۰۲۲d target = anchor.h();
        EnumC۰۰۲۲d dVar = this.f۶۶۲c;
        if (target != dVar) {
            switch (a.f۶۶۸a[dVar.ordinal()]) {
                case 1:
                    if (target == EnumC۰۰۲۲d.BASELINE || target == EnumC۰۰۲۲d.CENTER_X || target == EnumC۰۰۲۲d.CENTER_Y) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    boolean isCompatible2 = target == EnumC۰۰۲۲d.LEFT || target == EnumC۰۰۲۲d.RIGHT;
                    if (!(anchor.c() instanceof g)) {
                        return isCompatible2;
                    }
                    if (isCompatible2 || target == EnumC۰۰۲۲d.CENTER_X) {
                        isCompatible = true;
                    }
                    return isCompatible;
                case 4:
                case 5:
                    boolean isCompatible3 = target == EnumC۰۰۲۲d.TOP || target == EnumC۰۰۲۲d.BOTTOM;
                    if (!(anchor.c() instanceof g)) {
                        return isCompatible3;
                    }
                    if (isCompatible3 || target == EnumC۰۰۲۲d.CENTER_Y) {
                        isCompatible = true;
                    }
                    return isCompatible;
                case 6:
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f۶۶۲c.name());
            }
        } else if (dVar != EnumC۰۰۲۲d.BASELINE || (anchor.c().y() && c().y())) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f۶۶۸a = new int[EnumC۰۰۲۲d.values().length];

        static {
            try {
                f۶۶۸a[EnumC۰۰۲۲d.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۶۶۸a[EnumC۰۰۲۲d.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f۶۶۸a[EnumC۰۰۲۲d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f۶۶۸a[EnumC۰۰۲۲d.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f۶۶۸a[EnumC۰۰۲۲d.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f۶۶۸a[EnumC۰۰۲۲d.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f۶۶۸a[EnumC۰۰۲۲d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f۶۶۸a[EnumC۰۰۲۲d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError e9) {
            }
            try {
                f۶۶۸a[EnumC۰۰۲۲d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError e10) {
            }
        }
    }

    public String toString() {
        return this.f۶۶۱b.f() + ":" + this.f۶۶۲c.toString();
    }
}
