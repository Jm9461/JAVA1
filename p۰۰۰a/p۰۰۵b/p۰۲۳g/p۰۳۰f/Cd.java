package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۰f;

import java.util.Locale;

/* renamed from: a.b.g.f.d  reason: invalid class name */
public final class Cd {

    /* renamed from: a  reason: contains not printable characters */
    public static final AbstractCc f۸۷۲۲a = new Ce(Cb.f۸۷۲۶a, false);

    /* renamed from: b  reason: contains not printable characters */
    public static final AbstractCc f۸۷۲۳b = new Ce(Cb.f۸۷۲۶a, true);

    /* access modifiers changed from: private */
    /* renamed from: a.b.g.f.d$c  reason: invalid class name */
    public interface AbstractCc {
        /* renamed from: a  reason: contains not printable characters */
        int m۱۰۵۴۹a(CharSequence charSequence, int i, int i2);
    }

    static {
        new Ce(null, false);
        new Ce(null, true);
        new Ce(Ca.f۸۷۲۴b, false);
        Cf fVar = Cf.f۸۷۲۹b;
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۰۵۴۵a(int directionality) {
        if (directionality == 0) {
            return 1;
        }
        if (directionality == 1 || directionality == 2) {
            return 0;
        }
        return 2;
    }

    /* renamed from: b  reason: contains not printable characters */
    static int m۱۰۵۴۶b(int directionality) {
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

    /* renamed from: a.b.g.f.d$d  reason: invalid class name */
    private static abstract class AbstractCd implements AbstractCc {

        /* renamed from: a  reason: contains not printable characters */
        private final AbstractCc f۸۷۲۷a;

        /* access modifiers changed from: protected */
        /* renamed from: a  reason: contains not printable characters */
        public abstract boolean m۱۰۵۵۱a();

        AbstractCd(AbstractCc algorithm) {
            this.f۸۷۲۷a = algorithm;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۰f.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۵۵۲a(CharSequence cs, int start, int count) {
            if (cs == null || start < 0 || count < 0 || cs.length() - count < start) {
                throw new IllegalArgumentException();
            } else if (this.f۸۷۲۷a == null) {
                return m۱۰۵۵۱a();
            } else {
                return m۱۰۵۵۰b(cs, start, count);
            }
        }

        /* renamed from: b  reason: contains not printable characters */
        private boolean m۱۰۵۵۰b(CharSequence cs, int start, int count) {
            int a = this.f۸۷۲۷a.m۱۰۵۴۹a(cs, start, count);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return m۱۰۵۵۱a();
            }
            return false;
        }
    }

    /* renamed from: a.b.g.f.d$e  reason: invalid class name */
    private static class Ce extends AbstractCd {

        /* renamed from: b  reason: contains not printable characters */
        private final boolean f۸۷۲۸b;

        Ce(AbstractCc algorithm, boolean defaultIsRtl) {
            super(algorithm);
            this.f۸۷۲۸b = defaultIsRtl;
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۰f.Cd.AbstractCd
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۵۵۳a() {
            return this.f۸۷۲۸b;
        }
    }

    /* renamed from: a.b.g.f.d$b  reason: invalid class name */
    private static class Cb implements AbstractCc {

        /* renamed from: a  reason: contains not printable characters */
        static final Cb f۸۷۲۶a = new Cb();

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۰f.Cd.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۰۵۴۸a(CharSequence cs, int start, int count) {
            int result = 2;
            int e = start + count;
            for (int i = start; i < e && result == 2; i++) {
                result = Cd.m۱۰۵۴۶b(Character.getDirectionality(cs.charAt(i)));
            }
            return result;
        }

        private Cb() {
        }
    }

    /* renamed from: a.b.g.f.d$a  reason: invalid class name */
    private static class Ca implements AbstractCc {

        /* renamed from: b  reason: contains not printable characters */
        static final Ca f۸۷۲۴b = new Ca(true);

        /* renamed from: a  reason: contains not printable characters */
        private final boolean f۸۷۲۵a;

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۰f.Cd.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۰۵۴۷a(CharSequence cs, int start, int count) {
            boolean haveUnlookedFor = false;
            int e = start + count;
            for (int i = start; i < e; i++) {
                int a = Cd.m۱۰۵۴۵a(Character.getDirectionality(cs.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                    } else if (!this.f۸۷۲۵a) {
                        return 1;
                    } else {
                        haveUnlookedFor = true;
                    }
                } else if (this.f۸۷۲۵a) {
                    return 0;
                } else {
                    haveUnlookedFor = true;
                }
            }
            if (haveUnlookedFor) {
                return this.f۸۷۲۵a ? 1 : 0;
            }
            return 2;
        }

        private Ca(boolean lookForRtl) {
            this.f۸۷۲۵a = lookForRtl;
        }

        static {
            new Ca(false);
        }
    }

    /* renamed from: a.b.g.f.d$f  reason: invalid class name */
    private static class Cf extends AbstractCd {

        /* renamed from: b  reason: contains not printable characters */
        static final Cf f۸۷۲۹b = new Cf();

        Cf() {
            super(null);
        }

        /* access modifiers changed from: protected */
        @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۰f.Cd.AbstractCd
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۵۵۴a() {
            return Ce.m۱۰۵۵۶b(Locale.getDefault()) == 1;
        }
    }
}
