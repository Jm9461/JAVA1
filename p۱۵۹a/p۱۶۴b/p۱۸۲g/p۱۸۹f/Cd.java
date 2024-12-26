package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۹f;

import java.util.Locale;

/* renamed from: a.b.g.f.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cd {

    /* renamed from: a, reason: contains not printable characters */
    public static final InterfaceCc f۸۷۲۲a;

    /* renamed from: b, reason: contains not printable characters */
    public static final InterfaceCc f۸۷۲۳b;

    /* renamed from: a.b.g.f.d$c */
    private interface c {
        /* renamed from: a, reason: contains not printable characters */
        int mo۸۴۷۸a(CharSequence charSequence, int i, int i2);
    }

    static {
        new e(null, false);
        new e(null, true);
        f۸۷۲۲a = new e(b.f۸۷۲۶a, false);
        f۸۷۲۳b = new e(b.f۸۷۲۶a, true);
        new e(a.f۸۷۲۴b, false);
        f fVar = f.f۸۷۲۹b;
    }

    /* renamed from: a, reason: contains not printable characters */
    static int m۸۴۷۴a(int directionality) {
        if (directionality != 0) {
            return (directionality == 1 || directionality == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b, reason: contains not printable characters */
    static int m۸۴۷۵b(int directionality) {
        if (directionality != 0) {
            if (directionality == 1 || directionality == 2) {
                return 0;
            }
            switch (directionality) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }

    /* renamed from: a.b.g.f.d$d */
    private static abstract class d implements InterfaceCc {

        /* renamed from: a, reason: contains not printable characters */
        private final c f۸۷۲۷a;

        /* renamed from: a, reason: contains not printable characters */
        protected abstract boolean mo۸۴۸۳a();

        d(c algorithm) {
            this.f۸۷۲۷a = algorithm;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۹f.InterfaceCc
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۸۴۸۱a(CharSequence cs, int start, int count) {
            if (cs == null || start < 0 || count < 0 || cs.length() - count < start) {
                throw new IllegalArgumentException();
            }
            if (this.f۸۷۲۷a == null) {
                return mo۸۴۸۳a();
            }
            return m۸۴۷۹b(cs, start, count);
        }

        /* renamed from: b, reason: contains not printable characters */
        private boolean m۸۴۷۹b(CharSequence cs, int start, int count) {
            int i = this.f۸۷۲۷a.mo۸۴۷۸a(cs, start, count);
            if (i == 0) {
                return true;
            }
            if (i == 1) {
                return false;
            }
            return mo۸۴۸۳a();
        }
    }

    /* renamed from: a.b.g.f.d$e */
    private static class e extends d {

        /* renamed from: b, reason: contains not printable characters */
        private final boolean f۸۷۲۸b;

        e(c algorithm, boolean defaultIsRtl) {
            super(algorithm);
            this.f۸۷۲۸b = defaultIsRtl;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۹f.Cd.d
        /* renamed from: a, reason: contains not printable characters */
        protected boolean mo۸۴۸۳a() {
            return this.f۸۷۲۸b;
        }
    }

    /* renamed from: a.b.g.f.d$b */
    private static class b implements c {

        /* renamed from: a, reason: contains not printable characters */
        static final b f۸۷۲۶a = new b();

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۹f.Cd.c
        /* renamed from: a, reason: contains not printable characters */
        public int mo۸۴۷۸a(CharSequence cs, int start, int count) {
            int result = 2;
            int e2 = start + count;
            for (int i = start; i < e2 && result == 2; i++) {
                result = Cd.m۸۴۷۵b(Character.getDirectionality(cs.charAt(i)));
            }
            return result;
        }

        private b() {
        }
    }

    /* renamed from: a.b.g.f.d$a */
    private static class a implements c {

        /* renamed from: b, reason: contains not printable characters */
        static final a f۸۷۲۴b = new a(true);

        /* renamed from: a, reason: contains not printable characters */
        private final boolean f۸۷۲۵a;

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۹f.Cd.c
        /* renamed from: a, reason: contains not printable characters */
        public int mo۸۴۷۸a(CharSequence charSequence, int i, int i2) {
            boolean z = false;
            int i3 = i + i2;
            for (int i4 = i; i4 < i3; i4++) {
                int i5 = Cd.m۸۴۷۴a(Character.getDirectionality(charSequence.charAt(i4)));
                if (i5 == 0) {
                    if (this.f۸۷۲۵a) {
                        return 0;
                    }
                    z = true;
                } else if (i5 != 1) {
                    continue;
                } else {
                    if (!this.f۸۷۲۵a) {
                        return 1;
                    }
                    z = true;
                }
            }
            if (z) {
                return this.f۸۷۲۵a ? 1 : 0;
            }
            return 2;
        }

        private a(boolean lookForRtl) {
            this.f۸۷۲۵a = lookForRtl;
        }

        static {
            new a(false);
        }
    }

    /* renamed from: a.b.g.f.d$f */
    private static class f extends d {

        /* renamed from: b, reason: contains not printable characters */
        static final f f۸۷۲۹b = new f();

        f() {
            super(null);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۹f.Cd.d
        /* renamed from: a, reason: contains not printable characters */
        protected boolean mo۸۴۸۳a() {
            int dir = Ce.m۸۴۸۵b(Locale.getDefault());
            return dir == 1;
        }
    }
}
