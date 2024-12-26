package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۹f;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ci;

/* renamed from: a.b.g.f.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb implements Spannable {

    /* renamed from: c, reason: contains not printable characters */
    private final Spannable f۸۷۱۰c;

    /* renamed from: d, reason: contains not printable characters */
    private final a f۸۷۱۱d;

    /* renamed from: e, reason: contains not printable characters */
    private final PrecomputedText f۸۷۱۲e;

    static {
        new Object();
    }

    /* renamed from: a.b.g.f.b$a */
    public static final class a {

        /* renamed from: a, reason: contains not printable characters */
        private final TextPaint f۸۷۱۳a;

        /* renamed from: b, reason: contains not printable characters */
        private final TextDirectionHeuristic f۸۷۱۴b;

        /* renamed from: c, reason: contains not printable characters */
        private final int f۸۷۱۵c;

        /* renamed from: d, reason: contains not printable characters */
        private final int f۸۷۱۶d;

        /* renamed from: e, reason: contains not printable characters */
        final PrecomputedText.Params f۸۷۱۷e;

        /* renamed from: a.b.g.f.b$a$a, reason: collision with other inner class name */
        public static class C۱۴۲۶a {

            /* renamed from: a, reason: contains not printable characters */
            private final TextPaint f۸۷۱۸a;

            /* renamed from: b, reason: contains not printable characters */
            private TextDirectionHeuristic f۸۷۱۹b;

            /* renamed from: c, reason: contains not printable characters */
            private int f۸۷۲۰c;

            /* renamed from: d, reason: contains not printable characters */
            private int f۸۷۲۱d;

            public C۱۴۲۶a(TextPaint paint) {
                this.f۸۷۱۸a = paint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f۸۷۲۰c = 1;
                    this.f۸۷۲۱d = 1;
                } else {
                    this.f۸۷۲۱d = 0;
                    this.f۸۷۲۰c = 0;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    this.f۸۷۱۹b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f۸۷۱۹b = null;
                }
            }

            /* renamed from: a, reason: contains not printable characters */
            public C۱۴۲۶a m۸۴۶۹a(int strategy) {
                this.f۸۷۲۰c = strategy;
                return this;
            }

            /* renamed from: b, reason: contains not printable characters */
            public C۱۴۲۶a m۸۴۷۲b(int frequency) {
                this.f۸۷۲۱d = frequency;
                return this;
            }

            /* renamed from: a, reason: contains not printable characters */
            public C۱۴۲۶a m۸۴۷۰a(TextDirectionHeuristic textDir) {
                this.f۸۷۱۹b = textDir;
                return this;
            }

            /* renamed from: a, reason: contains not printable characters */
            public a m۸۴۷۱a() {
                return new a(this.f۸۷۱۸a, this.f۸۷۱۹b, this.f۸۷۲۰c, this.f۸۷۲۱d);
            }
        }

        a(TextPaint paint, TextDirectionHeuristic textDir, int strategy, int frequency) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f۸۷۱۷e = new PrecomputedText.Params.Builder(paint).setBreakStrategy(strategy).setHyphenationFrequency(frequency).setTextDirection(textDir).build();
            } else {
                this.f۸۷۱۷e = null;
            }
            this.f۸۷۱۳a = paint;
            this.f۸۷۱۴b = textDir;
            this.f۸۷۱۵c = strategy;
            this.f۸۷۱۶d = frequency;
        }

        public a(PrecomputedText.Params wrapped) {
            this.f۸۷۱۳a = wrapped.getTextPaint();
            this.f۸۷۱۴b = wrapped.getTextDirection();
            this.f۸۷۱۵c = wrapped.getBreakStrategy();
            this.f۸۷۱۶d = wrapped.getHyphenationFrequency();
            this.f۸۷۱۷e = wrapped;
        }

        /* renamed from: d, reason: contains not printable characters */
        public TextPaint m۸۴۶۸d() {
            return this.f۸۷۱۳a;
        }

        /* renamed from: c, reason: contains not printable characters */
        public TextDirectionHeuristic m۸۴۶۷c() {
            return this.f۸۷۱۴b;
        }

        /* renamed from: a, reason: contains not printable characters */
        public int m۸۴۶۵a() {
            return this.f۸۷۱۵c;
        }

        /* renamed from: b, reason: contains not printable characters */
        public int m۸۴۶۶b() {
            return this.f۸۷۱۶d;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o == null || !(o instanceof a)) {
                return false;
            }
            a other = (a) o;
            PrecomputedText.Params params = this.f۸۷۱۷e;
            if (params != null) {
                return params.equals(other.f۸۷۱۷e);
            }
            if (Build.VERSION.SDK_INT >= 23 && (this.f۸۷۱۵c != other.m۸۴۶۵a() || this.f۸۷۱۶d != other.m۸۴۶۶b())) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 18 && this.f۸۷۱۴b != other.m۸۴۶۷c()) || this.f۸۷۱۳a.getTextSize() != other.m۸۴۶۸d().getTextSize() || this.f۸۷۱۳a.getTextScaleX() != other.m۸۴۶۸d().getTextScaleX() || this.f۸۷۱۳a.getTextSkewX() != other.m۸۴۶۸d().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f۸۷۱۳a.getLetterSpacing() != other.m۸۴۶۸d().getLetterSpacing() || !TextUtils.equals(this.f۸۷۱۳a.getFontFeatureSettings(), other.m۸۴۶۸d().getFontFeatureSettings()))) || this.f۸۷۱۳a.getFlags() != other.m۸۴۶۸d().getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f۸۷۱۳a.getTextLocales().equals(other.m۸۴۶۸d().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f۸۷۱۳a.getTextLocale().equals(other.m۸۴۶۸d().getTextLocale())) {
                return false;
            }
            if (this.f۸۷۱۳a.getTypeface() == null) {
                if (other.m۸۴۶۸d().getTypeface() != null) {
                    return false;
                }
            } else if (!this.f۸۷۱۳a.getTypeface().equals(other.m۸۴۶۸d().getTypeface())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return Ci.m۸۵۶۲a(Float.valueOf(this.f۸۷۱۳a.getTextSize()), Float.valueOf(this.f۸۷۱۳a.getTextScaleX()), Float.valueOf(this.f۸۷۱۳a.getTextSkewX()), Float.valueOf(this.f۸۷۱۳a.getLetterSpacing()), Integer.valueOf(this.f۸۷۱۳a.getFlags()), this.f۸۷۱۳a.getTextLocales(), this.f۸۷۱۳a.getTypeface(), Boolean.valueOf(this.f۸۷۱۳a.isElegantTextHeight()), this.f۸۷۱۴b, Integer.valueOf(this.f۸۷۱۵c), Integer.valueOf(this.f۸۷۱۶d));
            }
            if (i >= 21) {
                return Ci.m۸۵۶۲a(Float.valueOf(this.f۸۷۱۳a.getTextSize()), Float.valueOf(this.f۸۷۱۳a.getTextScaleX()), Float.valueOf(this.f۸۷۱۳a.getTextSkewX()), Float.valueOf(this.f۸۷۱۳a.getLetterSpacing()), Integer.valueOf(this.f۸۷۱۳a.getFlags()), this.f۸۷۱۳a.getTextLocale(), this.f۸۷۱۳a.getTypeface(), Boolean.valueOf(this.f۸۷۱۳a.isElegantTextHeight()), this.f۸۷۱۴b, Integer.valueOf(this.f۸۷۱۵c), Integer.valueOf(this.f۸۷۱۶d));
            }
            if (i >= 18) {
                return Ci.m۸۵۶۲a(Float.valueOf(this.f۸۷۱۳a.getTextSize()), Float.valueOf(this.f۸۷۱۳a.getTextScaleX()), Float.valueOf(this.f۸۷۱۳a.getTextSkewX()), Integer.valueOf(this.f۸۷۱۳a.getFlags()), this.f۸۷۱۳a.getTextLocale(), this.f۸۷۱۳a.getTypeface(), this.f۸۷۱۴b, Integer.valueOf(this.f۸۷۱۵c), Integer.valueOf(this.f۸۷۱۶d));
            }
            if (i >= 17) {
                return Ci.m۸۵۶۲a(Float.valueOf(this.f۸۷۱۳a.getTextSize()), Float.valueOf(this.f۸۷۱۳a.getTextScaleX()), Float.valueOf(this.f۸۷۱۳a.getTextSkewX()), Integer.valueOf(this.f۸۷۱۳a.getFlags()), this.f۸۷۱۳a.getTextLocale(), this.f۸۷۱۳a.getTypeface(), this.f۸۷۱۴b, Integer.valueOf(this.f۸۷۱۵c), Integer.valueOf(this.f۸۷۱۶d));
            }
            return Ci.m۸۵۶۲a(Float.valueOf(this.f۸۷۱۳a.getTextSize()), Float.valueOf(this.f۸۷۱۳a.getTextScaleX()), Float.valueOf(this.f۸۷۱۳a.getTextSkewX()), Integer.valueOf(this.f۸۷۱۳a.getFlags()), this.f۸۷۱۳a.getTypeface(), this.f۸۷۱۴b, Integer.valueOf(this.f۸۷۱۵c), Integer.valueOf(this.f۸۷۱۶d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f۸۷۱۳a.getTextSize());
            sb.append(", textScaleX=" + this.f۸۷۱۳a.getTextScaleX());
            sb.append(", textSkewX=" + this.f۸۷۱۳a.getTextSkewX());
            if (Build.VERSION.SDK_INT >= 21) {
                sb.append(", letterSpacing=" + this.f۸۷۱۳a.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f۸۷۱۳a.isElegantTextHeight());
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                sb.append(", textLocale=" + this.f۸۷۱۳a.getTextLocales());
            } else if (i >= 17) {
                sb.append(", textLocale=" + this.f۸۷۱۳a.getTextLocale());
            }
            sb.append(", typeface=" + this.f۸۷۱۳a.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.f۸۷۱۳a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f۸۷۱۴b);
            sb.append(", breakStrategy=" + this.f۸۷۱۵c);
            sb.append(", hyphenationFrequency=" + this.f۸۷۱۶d);
            sb.append("}");
            return sb.toString();
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public PrecomputedText m۸۴۶۴b() {
        Spannable spannable = this.f۸۷۱۰c;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public a m۸۴۶۳a() {
        return this.f۸۷۱۱d;
    }

    @Override // android.text.Spannable
    public void setSpan(Object what, int start, int end, int flags) {
        if (what instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.f۸۷۱۲e.setSpan(what, start, end, flags);
        } else {
            this.f۸۷۱۰c.setSpan(what, start, end, flags);
        }
    }

    @Override // android.text.Spannable
    public void removeSpan(Object what) {
        if (what instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.f۸۷۱۲e.removeSpan(what);
        } else {
            this.f۸۷۱۰c.removeSpan(what);
        }
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T[]) this.f۸۷۱۲e.getSpans(i, i2, cls);
        }
        return (T[]) this.f۸۷۱۰c.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object tag) {
        return this.f۸۷۱۰c.getSpanStart(tag);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object tag) {
        return this.f۸۷۱۰c.getSpanEnd(tag);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object tag) {
        return this.f۸۷۱۰c.getSpanFlags(tag);
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int start, int limit, Class type) {
        return this.f۸۷۱۰c.nextSpanTransition(start, limit, type);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f۸۷۱۰c.length();
    }

    @Override // java.lang.CharSequence
    public char charAt(int index) {
        return this.f۸۷۱۰c.charAt(index);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int start, int end) {
        return this.f۸۷۱۰c.subSequence(start, end);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f۸۷۱۰c.toString();
    }
}
