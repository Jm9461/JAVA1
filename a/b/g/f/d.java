package a.b.g.f;

import java.util.Locale;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f۳۵۹a = new e(b.f۳۶۳a, false);

    /* renamed from: b  reason: collision with root package name */
    public static final c f۳۶۰b = new e(b.f۳۶۳a, true);

    /* access modifiers changed from: private */
    public interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    static {
        new e(null, false);
        new e(null, true);
        new e(a.f۳۶۱b, false);
        f fVar = f.f۳۶۶b;
    }

    static int a(int directionality) {
        if (directionality == 0) {
            return 1;
        }
        if (directionality == 1 || directionality == 2) {
            return 0;
        }
        return 2;
    }

    static int b(int directionality) {
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

    /* renamed from: a.b.g.f.d$d  reason: collision with other inner class name */
    private static abstract class AbstractC۰۰۱۵d implements c {

        /* renamed from: a  reason: collision with root package name */
        private final c f۳۶۴a;

        /* access modifiers changed from: protected */
        public abstract boolean a();

        AbstractC۰۰۱۵d(c algorithm) {
            this.f۳۶۴a = algorithm;
        }

        @Override // a.b.g.f.c
        public boolean a(CharSequence cs, int start, int count) {
            if (cs == null || start < 0 || count < 0 || cs.length() - count < start) {
                throw new IllegalArgumentException();
            } else if (this.f۳۶۴a == null) {
                return a();
            } else {
                return b(cs, start, count);
            }
        }

        private boolean b(CharSequence cs, int start, int count) {
            int a2 = this.f۳۶۴a.a(cs, start, count);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                return a();
            }
            return false;
        }
    }

    private static class e extends AbstractC۰۰۱۵d {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f۳۶۵b;

        e(c algorithm, boolean defaultIsRtl) {
            super(algorithm);
            this.f۳۶۵b = defaultIsRtl;
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.f.d.AbstractC۰۰۱۵d
        public boolean a() {
            return this.f۳۶۵b;
        }
    }

    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        static final b f۳۶۳a = new b();

        @Override // a.b.g.f.d.c
        public int a(CharSequence cs, int start, int count) {
            int result = 2;
            int e2 = start + count;
            for (int i = start; i < e2 && result == 2; i++) {
                result = d.b(Character.getDirectionality(cs.charAt(i)));
            }
            return result;
        }

        private b() {
        }
    }

    private static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        static final a f۳۶۱b = new a(true);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f۳۶۲a;

        @Override // a.b.g.f.d.c
        public int a(CharSequence cs, int start, int count) {
            boolean haveUnlookedFor = false;
            int e2 = start + count;
            for (int i = start; i < e2; i++) {
                int a2 = d.a(Character.getDirectionality(cs.charAt(i)));
                if (a2 != 0) {
                    if (a2 != 1) {
                        continue;
                    } else if (!this.f۳۶۲a) {
                        return 1;
                    } else {
                        haveUnlookedFor = true;
                    }
                } else if (this.f۳۶۲a) {
                    return 0;
                } else {
                    haveUnlookedFor = true;
                }
            }
            if (haveUnlookedFor) {
                return this.f۳۶۲a ? 1 : 0;
            }
            return 2;
        }

        private a(boolean lookForRtl) {
            this.f۳۶۲a = lookForRtl;
        }

        static {
            new a(false);
        }
    }

    private static class f extends AbstractC۰۰۱۵d {

        /* renamed from: b  reason: collision with root package name */
        static final f f۳۶۶b = new f();

        f() {
            super(null);
        }

        /* access modifiers changed from: protected */
        @Override // a.b.g.f.d.AbstractC۰۰۱۵d
        public boolean a() {
            return e.b(Locale.getDefault()) == 1;
        }
    }
}
