package a.b.g.f;

import a.b.g.g.i;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

public class b implements Spannable {

    /* renamed from: c  reason: collision with root package name */
    private final Spannable f۳۴۷c;

    /* renamed from: d  reason: collision with root package name */
    private final a f۳۴۸d;

    /* renamed from: e  reason: collision with root package name */
    private final PrecomputedText f۳۴۹e;

    static {
        new Object();
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f۳۵۰a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f۳۵۱b;

        /* renamed from: c  reason: collision with root package name */
        private final int f۳۵۲c;

        /* renamed from: d  reason: collision with root package name */
        private final int f۳۵۳d;

        /* renamed from: e  reason: collision with root package name */
        final PrecomputedText.Params f۳۵۴e;

        /* renamed from: a.b.g.f.b$a$a  reason: collision with other inner class name */
        public static class C۰۰۱۴a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f۳۵۵a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f۳۵۶b;

            /* renamed from: c  reason: collision with root package name */
            private int f۳۵۷c;

            /* renamed from: d  reason: collision with root package name */
            private int f۳۵۸d;

            public C۰۰۱۴a(TextPaint paint) {
                this.f۳۵۵a = paint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f۳۵۷c = 1;
                    this.f۳۵۸d = 1;
                } else {
                    this.f۳۵۸d = 0;
                    this.f۳۵۷c = 0;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    this.f۳۵۶b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f۳۵۶b = null;
                }
            }

            public C۰۰۱۴a a(int strategy) {
                this.f۳۵۷c = strategy;
                return this;
            }

            public C۰۰۱۴a b(int frequency) {
                this.f۳۵۸d = frequency;
                return this;
            }

            public C۰۰۱۴a a(TextDirectionHeuristic textDir) {
                this.f۳۵۶b = textDir;
                return this;
            }

            public a a() {
                return new a(this.f۳۵۵a, this.f۳۵۶b, this.f۳۵۷c, this.f۳۵۸d);
            }
        }

        a(TextPaint paint, TextDirectionHeuristic textDir, int strategy, int frequency) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f۳۵۴e = new PrecomputedText.Params.Builder(paint).setBreakStrategy(strategy).setHyphenationFrequency(frequency).setTextDirection(textDir).build();
            } else {
                this.f۳۵۴e = null;
            }
            this.f۳۵۰a = paint;
            this.f۳۵۱b = textDir;
            this.f۳۵۲c = strategy;
            this.f۳۵۳d = frequency;
        }

        public a(PrecomputedText.Params wrapped) {
            this.f۳۵۰a = wrapped.getTextPaint();
            this.f۳۵۱b = wrapped.getTextDirection();
            this.f۳۵۲c = wrapped.getBreakStrategy();
            this.f۳۵۳d = wrapped.getHyphenationFrequency();
            this.f۳۵۴e = wrapped;
        }

        public TextPaint d() {
            return this.f۳۵۰a;
        }

        public TextDirectionHeuristic c() {
            return this.f۳۵۱b;
        }

        public int a() {
            return this.f۳۵۲c;
        }

        public int b() {
            return this.f۳۵۳d;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o == null || !(o instanceof a)) {
                return false;
            }
            a other = (a) o;
            PrecomputedText.Params params = this.f۳۵۴e;
            if (params != null) {
                return params.equals(other.f۳۵۴e);
            }
            if (Build.VERSION.SDK_INT >= 23 && (this.f۳۵۲c != other.a() || this.f۳۵۳d != other.b())) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 18 && this.f۳۵۱b != other.c()) || this.f۳۵۰a.getTextSize() != other.d().getTextSize() || this.f۳۵۰a.getTextScaleX() != other.d().getTextScaleX() || this.f۳۵۰a.getTextSkewX() != other.d().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f۳۵۰a.getLetterSpacing() != other.d().getLetterSpacing() || !TextUtils.equals(this.f۳۵۰a.getFontFeatureSettings(), other.d().getFontFeatureSettings()))) || this.f۳۵۰a.getFlags() != other.d().getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f۳۵۰a.getTextLocales().equals(other.d().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f۳۵۰a.getTextLocale().equals(other.d().getTextLocale())) {
                return false;
            }
            if (this.f۳۵۰a.getTypeface() == null) {
                if (other.d().getTypeface() != null) {
                    return false;
                }
            } else if (!this.f۳۵۰a.getTypeface().equals(other.d().getTypeface())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return i.a(Float.valueOf(this.f۳۵۰a.getTextSize()), Float.valueOf(this.f۳۵۰a.getTextScaleX()), Float.valueOf(this.f۳۵۰a.getTextSkewX()), Float.valueOf(this.f۳۵۰a.getLetterSpacing()), Integer.valueOf(this.f۳۵۰a.getFlags()), this.f۳۵۰a.getTextLocales(), this.f۳۵۰a.getTypeface(), Boolean.valueOf(this.f۳۵۰a.isElegantTextHeight()), this.f۳۵۱b, Integer.valueOf(this.f۳۵۲c), Integer.valueOf(this.f۳۵۳d));
            } else if (i >= 21) {
                return i.a(Float.valueOf(this.f۳۵۰a.getTextSize()), Float.valueOf(this.f۳۵۰a.getTextScaleX()), Float.valueOf(this.f۳۵۰a.getTextSkewX()), Float.valueOf(this.f۳۵۰a.getLetterSpacing()), Integer.valueOf(this.f۳۵۰a.getFlags()), this.f۳۵۰a.getTextLocale(), this.f۳۵۰a.getTypeface(), Boolean.valueOf(this.f۳۵۰a.isElegantTextHeight()), this.f۳۵۱b, Integer.valueOf(this.f۳۵۲c), Integer.valueOf(this.f۳۵۳d));
            } else if (i >= 18) {
                return i.a(Float.valueOf(this.f۳۵۰a.getTextSize()), Float.valueOf(this.f۳۵۰a.getTextScaleX()), Float.valueOf(this.f۳۵۰a.getTextSkewX()), Integer.valueOf(this.f۳۵۰a.getFlags()), this.f۳۵۰a.getTextLocale(), this.f۳۵۰a.getTypeface(), this.f۳۵۱b, Integer.valueOf(this.f۳۵۲c), Integer.valueOf(this.f۳۵۳d));
            } else if (i >= 17) {
                return i.a(Float.valueOf(this.f۳۵۰a.getTextSize()), Float.valueOf(this.f۳۵۰a.getTextScaleX()), Float.valueOf(this.f۳۵۰a.getTextSkewX()), Integer.valueOf(this.f۳۵۰a.getFlags()), this.f۳۵۰a.getTextLocale(), this.f۳۵۰a.getTypeface(), this.f۳۵۱b, Integer.valueOf(this.f۳۵۲c), Integer.valueOf(this.f۳۵۳d));
            } else {
                return i.a(Float.valueOf(this.f۳۵۰a.getTextSize()), Float.valueOf(this.f۳۵۰a.getTextScaleX()), Float.valueOf(this.f۳۵۰a.getTextSkewX()), Integer.valueOf(this.f۳۵۰a.getFlags()), this.f۳۵۰a.getTypeface(), this.f۳۵۱b, Integer.valueOf(this.f۳۵۲c), Integer.valueOf(this.f۳۵۳d));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f۳۵۰a.getTextSize());
            sb.append(", textScaleX=" + this.f۳۵۰a.getTextScaleX());
            sb.append(", textSkewX=" + this.f۳۵۰a.getTextSkewX());
            if (Build.VERSION.SDK_INT >= 21) {
                sb.append(", letterSpacing=" + this.f۳۵۰a.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f۳۵۰a.isElegantTextHeight());
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                sb.append(", textLocale=" + this.f۳۵۰a.getTextLocales());
            } else if (i >= 17) {
                sb.append(", textLocale=" + this.f۳۵۰a.getTextLocale());
            }
            sb.append(", typeface=" + this.f۳۵۰a.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.f۳۵۰a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f۳۵۱b);
            sb.append(", breakStrategy=" + this.f۳۵۲c);
            sb.append(", hyphenationFrequency=" + this.f۳۵۳d);
            sb.append("}");
            return sb.toString();
        }
    }

    public PrecomputedText b() {
        Spannable spannable = this.f۳۴۷c;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public a a() {
        return this.f۳۴۸d;
    }

    public void setSpan(Object what, int start, int end, int flags) {
        if (what instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f۳۴۹e.setSpan(what, start, end, flags);
        } else {
            this.f۳۴۷c.setSpan(what, start, end, flags);
        }
    }

    public void removeSpan(Object what) {
        if (what instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f۳۴۹e.removeSpan(what);
        } else {
            this.f۳۴۷c.removeSpan(what);
        }
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int start, int end, Class<T> type) {
        return Build.VERSION.SDK_INT >= 28 ? (T[]) this.f۳۴۹e.getSpans(start, end, type) : (T[]) this.f۳۴۷c.getSpans(start, end, type);
    }

    public int getSpanStart(Object tag) {
        return this.f۳۴۷c.getSpanStart(tag);
    }

    public int getSpanEnd(Object tag) {
        return this.f۳۴۷c.getSpanEnd(tag);
    }

    public int getSpanFlags(Object tag) {
        return this.f۳۴۷c.getSpanFlags(tag);
    }

    public int nextSpanTransition(int start, int limit, Class type) {
        return this.f۳۴۷c.nextSpanTransition(start, limit, type);
    }

    public int length() {
        return this.f۳۴۷c.length();
    }

    public char charAt(int index) {
        return this.f۳۴۷c.charAt(index);
    }

    public CharSequence subSequence(int start, int end) {
        return this.f۳۴۷c.subSequence(start, end);
    }

    public String toString() {
        return this.f۳۴۷c.toString();
    }
}
