package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۰f;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ci;

/* renamed from: a.b.g.f.b  reason: invalid class name */
public class Cb implements Spannable {

    /* renamed from: c  reason: contains not printable characters */
    private final Spannable f۸۷۱۰c;

    /* renamed from: d  reason: contains not printable characters */
    private final Ca f۸۷۱۱d;

    /* renamed from: e  reason: contains not printable characters */
    private final PrecomputedText f۸۷۱۲e;

    static {
        new Object();
    }

    /* renamed from: a.b.g.f.b$a  reason: invalid class name */
    public static final class Ca {

        /* renamed from: a  reason: contains not printable characters */
        private final TextPaint f۸۷۱۳a;

        /* renamed from: b  reason: contains not printable characters */
        private final TextDirectionHeuristic f۸۷۱۴b;

        /* renamed from: c  reason: contains not printable characters */
        private final int f۸۷۱۵c;

        /* renamed from: d  reason: contains not printable characters */
        private final int f۸۷۱۶d;

        /* renamed from: e  reason: contains not printable characters */
        final PrecomputedText.Params f۸۷۱۷e;

        /* renamed from: a.b.g.f.b$a$a  reason: invalid class name */
        public static class Ca {

            /* renamed from: a  reason: contains not printable characters */
            private final TextPaint f۸۷۱۸a;

            /* renamed from: b  reason: contains not printable characters */
            private TextDirectionHeuristic f۸۷۱۹b;

            /* renamed from: c  reason: contains not printable characters */
            private int f۸۷۲۰c;

            /* renamed from: d  reason: contains not printable characters */
            private int f۸۷۲۱d;

            public Ca(TextPaint paint) {
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

            /* renamed from: a  reason: contains not printable characters */
            public Ca m۱۰۵۴۰a(int strategy) {
                this.f۸۷۲۰c = strategy;
                return this;
            }

            /* renamed from: b  reason: contains not printable characters */
            public Ca m۱۰۵۴۳b(int frequency) {
                this.f۸۷۲۱d = frequency;
                return this;
            }

            /* renamed from: a  reason: contains not printable characters */
            public Ca m۱۰۵۴۱a(TextDirectionHeuristic textDir) {
                this.f۸۷۱۹b = textDir;
                return this;
            }

            /* renamed from: a  reason: contains not printable characters */
            public Ca m۱۰۵۴۲a() {
                return new Ca(this.f۸۷۱۸a, this.f۸۷۱۹b, this.f۸۷۲۰c, this.f۸۷۲۱d);
            }
        }

        Ca(TextPaint paint, TextDirectionHeuristic textDir, int strategy, int frequency) {
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

        public Ca(PrecomputedText.Params wrapped) {
            this.f۸۷۱۳a = wrapped.getTextPaint();
            this.f۸۷۱۴b = wrapped.getTextDirection();
            this.f۸۷۱۵c = wrapped.getBreakStrategy();
            this.f۸۷۱۶d = wrapped.getHyphenationFrequency();
            this.f۸۷۱۷e = wrapped;
        }

        /* renamed from: d  reason: contains not printable characters */
        public TextPaint m۱۰۵۳۹d() {
            return this.f۸۷۱۳a;
        }

        /* renamed from: c  reason: contains not printable characters */
        public TextDirectionHeuristic m۱۰۵۳۸c() {
            return this.f۸۷۱۴b;
        }

        /* renamed from: a  reason: contains not printable characters */
        public int m۱۰۵۳۶a() {
            return this.f۸۷۱۵c;
        }

        /* renamed from: b  reason: contains not printable characters */
        public int m۱۰۵۳۷b() {
            return this.f۸۷۱۶d;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o == null || !(o instanceof Ca)) {
                return false;
            }
            Ca other = (Ca) o;
            PrecomputedText.Params params = this.f۸۷۱۷e;
            if (params != null) {
                return params.equals(other.f۸۷۱۷e);
            }
            if (Build.VERSION.SDK_INT >= 23 && (this.f۸۷۱۵c != other.m۱۰۵۳۶a() || this.f۸۷۱۶d != other.m۱۰۵۳۷b())) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 18 && this.f۸۷۱۴b != other.m۱۰۵۳۸c()) || this.f۸۷۱۳a.getTextSize() != other.m۱۰۵۳۹d().getTextSize() || this.f۸۷۱۳a.getTextScaleX() != other.m۱۰۵۳۹d().getTextScaleX() || this.f۸۷۱۳a.getTextSkewX() != other.m۱۰۵۳۹d().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f۸۷۱۳a.getLetterSpacing() != other.m۱۰۵۳۹d().getLetterSpacing() || !TextUtils.equals(this.f۸۷۱۳a.getFontFeatureSettings(), other.m۱۰۵۳۹d().getFontFeatureSettings()))) || this.f۸۷۱۳a.getFlags() != other.m۱۰۵۳۹d().getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f۸۷۱۳a.getTextLocales().equals(other.m۱۰۵۳۹d().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f۸۷۱۳a.getTextLocale().equals(other.m۱۰۵۳۹d().getTextLocale())) {
                return false;
            }
            if (this.f۸۷۱۳a.getTypeface() == null) {
                if (other.m۱۰۵۳۹d().getTypeface() != null) {
                    return false;
                }
            } else if (!this.f۸۷۱۳a.getTypeface().equals(other.m۱۰۵۳۹d().getTypeface())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return Ci.m۱۰۶۳۲a(Float.valueOf(this.f۸۷۱۳a.getTextSize()), Float.valueOf(this.f۸۷۱۳a.getTextScaleX()), Float.valueOf(this.f۸۷۱۳a.getTextSkewX()), Float.valueOf(this.f۸۷۱۳a.getLetterSpacing()), Integer.valueOf(this.f۸۷۱۳a.getFlags()), this.f۸۷۱۳a.getTextLocales(), this.f۸۷۱۳a.getTypeface(), Boolean.valueOf(this.f۸۷۱۳a.isElegantTextHeight()), this.f۸۷۱۴b, Integer.valueOf(this.f۸۷۱۵c), Integer.valueOf(this.f۸۷۱۶d));
            } else if (i >= 21) {
                return Ci.m۱۰۶۳۲a(Float.valueOf(this.f۸۷۱۳a.getTextSize()), Float.valueOf(this.f۸۷۱۳a.getTextScaleX()), Float.valueOf(this.f۸۷۱۳a.getTextSkewX()), Float.valueOf(this.f۸۷۱۳a.getLetterSpacing()), Integer.valueOf(this.f۸۷۱۳a.getFlags()), this.f۸۷۱۳a.getTextLocale(), this.f۸۷۱۳a.getTypeface(), Boolean.valueOf(this.f۸۷۱۳a.isElegantTextHeight()), this.f۸۷۱۴b, Integer.valueOf(this.f۸۷۱۵c), Integer.valueOf(this.f۸۷۱۶d));
            } else if (i >= 18) {
                return Ci.m۱۰۶۳۲a(Float.valueOf(this.f۸۷۱۳a.getTextSize()), Float.valueOf(this.f۸۷۱۳a.getTextScaleX()), Float.valueOf(this.f۸۷۱۳a.getTextSkewX()), Integer.valueOf(this.f۸۷۱۳a.getFlags()), this.f۸۷۱۳a.getTextLocale(), this.f۸۷۱۳a.getTypeface(), this.f۸۷۱۴b, Integer.valueOf(this.f۸۷۱۵c), Integer.valueOf(this.f۸۷۱۶d));
            } else if (i >= 17) {
                return Ci.m۱۰۶۳۲a(Float.valueOf(this.f۸۷۱۳a.getTextSize()), Float.valueOf(this.f۸۷۱۳a.getTextScaleX()), Float.valueOf(this.f۸۷۱۳a.getTextSkewX()), Integer.valueOf(this.f۸۷۱۳a.getFlags()), this.f۸۷۱۳a.getTextLocale(), this.f۸۷۱۳a.getTypeface(), this.f۸۷۱۴b, Integer.valueOf(this.f۸۷۱۵c), Integer.valueOf(this.f۸۷۱۶d));
            } else {
                return Ci.m۱۰۶۳۲a(Float.valueOf(this.f۸۷۱۳a.getTextSize()), Float.valueOf(this.f۸۷۱۳a.getTextScaleX()), Float.valueOf(this.f۸۷۱۳a.getTextSkewX()), Integer.valueOf(this.f۸۷۱۳a.getFlags()), this.f۸۷۱۳a.getTypeface(), this.f۸۷۱۴b, Integer.valueOf(this.f۸۷۱۵c), Integer.valueOf(this.f۸۷۱۶d));
            }
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

    /* renamed from: b  reason: contains not printable characters */
    public PrecomputedText m۱۰۵۳۵b() {
        Spannable spannable = this.f۸۷۱۰c;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ca m۱۰۵۳۴a() {
        return this.f۸۷۱۱d;
    }

    public void setSpan(Object what, int start, int end, int flags) {
        if (what instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f۸۷۱۲e.setSpan(what, start, end, flags);
        } else {
            this.f۸۷۱۰c.setSpan(what, start, end, flags);
        }
    }

    public void removeSpan(Object what) {
        if (what instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f۸۷۱۲e.removeSpan(what);
        } else {
            this.f۸۷۱۰c.removeSpan(what);
        }
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int start, int end, Class<T> type) {
        return Build.VERSION.SDK_INT >= 28 ? (T[]) this.f۸۷۱۲e.getSpans(start, end, type) : (T[]) this.f۸۷۱۰c.getSpans(start, end, type);
    }

    public int getSpanStart(Object tag) {
        return this.f۸۷۱۰c.getSpanStart(tag);
    }

    public int getSpanEnd(Object tag) {
        return this.f۸۷۱۰c.getSpanEnd(tag);
    }

    public int getSpanFlags(Object tag) {
        return this.f۸۷۱۰c.getSpanFlags(tag);
    }

    public int nextSpanTransition(int start, int limit, Class type) {
        return this.f۸۷۱۰c.nextSpanTransition(start, limit, type);
    }

    public int length() {
        return this.f۸۷۱۰c.length();
    }

    public char charAt(int index) {
        return this.f۸۷۱۰c.charAt(index);
    }

    public CharSequence subSequence(int start, int end) {
        return this.f۸۷۱۰c.subSequence(start, end);
    }

    public String toString() {
        return this.f۸۷۱۰c.toString();
    }
}
