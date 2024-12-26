package android.support.p۰۴۷v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.MotionEvent;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.j0  reason: invalid class name */
public class Cj0 extends RecyclerView.AbstractCn implements RecyclerView.AbstractCs {

    /* renamed from: D  reason: contains not printable characters */
    private static final int[] f۱۲۱۱۷D = {16842919};

    /* renamed from: E  reason: contains not printable characters */
    private static final int[] f۱۲۱۱۸E = new int[0];

    /* renamed from: A  reason: contains not printable characters */
    int f۱۲۱۱۹A = 0;

    /* renamed from: B  reason: contains not printable characters */
    private final Runnable f۱۲۱۲۰B = new RunnableCa();

    /* renamed from: C  reason: contains not printable characters */
    private final RecyclerView.AbstractCt f۱۲۱۲۱C = new Cb();

    /* renamed from: a  reason: contains not printable characters */
    private final int f۱۲۱۲۲a;

    /* renamed from: b  reason: contains not printable characters */
    private final int f۱۲۱۲۳b;

    /* renamed from: c  reason: contains not printable characters */
    final StateListDrawable f۱۲۱۲۴c;

    /* renamed from: d  reason: contains not printable characters */
    final Drawable f۱۲۱۲۵d;

    /* renamed from: e  reason: contains not printable characters */
    private final int f۱۲۱۲۶e;

    /* renamed from: f  reason: contains not printable characters */
    private final int f۱۲۱۲۷f;

    /* renamed from: g  reason: contains not printable characters */
    private final StateListDrawable f۱۲۱۲۸g;

    /* renamed from: h  reason: contains not printable characters */
    private final Drawable f۱۲۱۲۹h;

    /* renamed from: i  reason: contains not printable characters */
    private final int f۱۲۱۳۰i;

    /* renamed from: j  reason: contains not printable characters */
    private final int f۱۲۱۳۱j;

    /* renamed from: k  reason: contains not printable characters */
    int f۱۲۱۳۲k;

    /* renamed from: l  reason: contains not printable characters */
    int f۱۲۱۳۳l;

    /* renamed from: m  reason: contains not printable characters */
    float f۱۲۱۳۴m;

    /* renamed from: n  reason: contains not printable characters */
    int f۱۲۱۳۵n;

    /* renamed from: o  reason: contains not printable characters */
    int f۱۲۱۳۶o;

    /* renamed from: p  reason: contains not printable characters */
    float f۱۲۱۳۷p;

    /* renamed from: q  reason: contains not printable characters */
    private int f۱۲۱۳۸q = 0;

    /* renamed from: r  reason: contains not printable characters */
    private int f۱۲۱۳۹r = 0;

    /* renamed from: s  reason: contains not printable characters */
    private RecyclerView f۱۲۱۴۰s;

    /* renamed from: t  reason: contains not printable characters */
    private boolean f۱۲۱۴۱t = false;

    /* renamed from: u  reason: contains not printable characters */
    private boolean f۱۲۱۴۲u = false;

    /* renamed from: v  reason: contains not printable characters */
    private int f۱۲۱۴۳v = 0;

    /* renamed from: w  reason: contains not printable characters */
    private int f۱۲۱۴۴w = 0;

    /* renamed from: x  reason: contains not printable characters */
    private final int[] f۱۲۱۴۵x = new int[2];

    /* renamed from: y  reason: contains not printable characters */
    private final int[] f۱۲۱۴۶y = new int[2];

    /* renamed from: z  reason: contains not printable characters */
    final ValueAnimator f۱۲۱۴۷z = ValueAnimator.ofFloat(0.0f, 1.0f);

    /* renamed from: android.support.v7.widget.j0$a  reason: invalid class name */
    class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            Cj0.this.m۱۵۳۳۱a(500);
        }
    }

    /* renamed from: android.support.v7.widget.j0$b  reason: invalid class name */
    class Cb extends RecyclerView.AbstractCt {
        Cb() {
        }

        @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCt
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۳۴۲a(RecyclerView recyclerView, int dx, int dy) {
            Cj0.this.m۱۵۳۳۲a(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    Cj0(RecyclerView recyclerView, StateListDrawable verticalThumbDrawable, Drawable verticalTrackDrawable, StateListDrawable horizontalThumbDrawable, Drawable horizontalTrackDrawable, int defaultWidth, int scrollbarMinimumRange, int margin) {
        this.f۱۲۱۲۴c = verticalThumbDrawable;
        this.f۱۲۱۲۵d = verticalTrackDrawable;
        this.f۱۲۱۲۸g = horizontalThumbDrawable;
        this.f۱۲۱۲۹h = horizontalTrackDrawable;
        this.f۱۲۱۲۶e = Math.max(defaultWidth, verticalThumbDrawable.getIntrinsicWidth());
        this.f۱۲۱۲۷f = Math.max(defaultWidth, verticalTrackDrawable.getIntrinsicWidth());
        this.f۱۲۱۳۰i = Math.max(defaultWidth, horizontalThumbDrawable.getIntrinsicWidth());
        this.f۱۲۱۳۱j = Math.max(defaultWidth, horizontalTrackDrawable.getIntrinsicWidth());
        this.f۱۲۱۲۲a = scrollbarMinimumRange;
        this.f۱۲۱۲۳b = margin;
        this.f۱۲۱۲۴c.setAlpha(255);
        this.f۱۲۱۲۵d.setAlpha(255);
        this.f۱۲۱۴۷z.addListener(new Cc());
        this.f۱۲۱۴۷z.addUpdateListener(new Cd());
        m۱۵۳۳۳a(recyclerView);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۳۳۳a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f۱۲۱۴۰s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m۱۵۳۲۵d();
            }
            this.f۱۲۱۴۰s = recyclerView;
            if (this.f۱۲۱۴۰s != null) {
                m۱۵۳۲۹h();
            }
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    private void m۱۵۳۲۹h() {
        this.f۱۲۱۴۰s.m۱۴۲۸۵a((RecyclerView.AbstractCn) this);
        this.f۱۲۱۴۰s.m۱۴۲۸۷a((RecyclerView.AbstractCs) this);
        this.f۱۲۱۴۰s.m۱۴۲۸۸a(this.f۱۲۱۲۱C);
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۵۳۲۵d() {
        this.f۱۲۱۴۰s.m۱۴۳۰۳b((RecyclerView.AbstractCn) this);
        this.f۱۲۱۴۰s.m۱۴۳۰۴b((RecyclerView.AbstractCs) this);
        this.f۱۲۱۴۰s.m۱۴۳۰۵b(this.f۱۲۱۲۱C);
        m۱۵۳۲۳c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۳۳۰a() {
        this.f۱۲۱۴۰s.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۳۳۸b(int state) {
        if (state == 2 && this.f۱۲۱۴۳v != 2) {
            this.f۱۲۱۲۴c.setState(f۱۲۱۱۷D);
            m۱۵۳۲۳c();
        }
        if (state == 0) {
            m۱۵۳۳۰a();
        } else {
            m۱۵۳۳۷b();
        }
        if (this.f۱۲۱۴۳v == 2 && state != 2) {
            this.f۱۲۱۲۴c.setState(f۱۲۱۱۸E);
            m۱۵۳۲۴c(1200);
        } else if (state == 1) {
            m۱۵۳۲۴c(1500);
        }
        this.f۱۲۱۴۳v = state;
    }

    /* renamed from: g  reason: contains not printable characters */
    private boolean m۱۵۳۲۸g() {
        return Cu.m۱۳۰۱۴k(this.f۱۲۱۴۰s) == 1;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۳۳۷b() {
        int i = this.f۱۲۱۱۹A;
        if (i != 0) {
            if (i == 3) {
                this.f۱۲۱۴۷z.cancel();
            } else {
                return;
            }
        }
        this.f۱۲۱۱۹A = 1;
        ValueAnimator valueAnimator = this.f۱۲۱۴۷z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f۱۲۱۴۷z.setDuration(500L);
        this.f۱۲۱۴۷z.setStartDelay(0);
        this.f۱۲۱۴۷z.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۳۳۱a(int duration) {
        int i = this.f۱۲۱۱۹A;
        if (i == 1) {
            this.f۱۲۱۴۷z.cancel();
        } else if (i != 2) {
            return;
        }
        this.f۱۲۱۱۹A = 3;
        ValueAnimator valueAnimator = this.f۱۲۱۴۷z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f۱۲۱۴۷z.setDuration((long) duration);
        this.f۱۲۱۴۷z.start();
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۵۳۲۳c() {
        this.f۱۲۱۴۰s.removeCallbacks(this.f۱۲۱۲۰B);
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۵۳۲۴c(int delay) {
        m۱۵۳۲۳c();
        this.f۱۲۱۴۰s.postDelayed(this.f۱۲۱۲۰B, (long) delay);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCn
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۳۳۹b(Canvas canvas, RecyclerView parent, RecyclerView.Ca0 state) {
        if (this.f۱۲۱۳۸q != this.f۱۲۱۴۰s.getWidth() || this.f۱۲۱۳۹r != this.f۱۲۱۴۰s.getHeight()) {
            this.f۱۲۱۳۸q = this.f۱۲۱۴۰s.getWidth();
            this.f۱۲۱۳۹r = this.f۱۲۱۴۰s.getHeight();
            m۱۵۳۳۸b(0);
        } else if (this.f۱۲۱۱۹A != 0) {
            if (this.f۱۲۱۴۱t) {
                m۱۵۳۲۲b(canvas);
            }
            if (this.f۱۲۱۴۲u) {
                m۱۵۳۲۰a(canvas);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۵۳۲۲b(Canvas canvas) {
        int viewWidth = this.f۱۲۱۳۸q;
        int i = this.f۱۲۱۲۶e;
        int left = viewWidth - i;
        int i2 = this.f۱۲۱۳۳l;
        int i3 = this.f۱۲۱۳۲k;
        int top = i2 - (i3 / 2);
        this.f۱۲۱۲۴c.setBounds(0, 0, i, i3);
        this.f۱۲۱۲۵d.setBounds(0, 0, this.f۱۲۱۲۷f, this.f۱۲۱۳۹r);
        if (m۱۵۳۲۸g()) {
            this.f۱۲۱۲۵d.draw(canvas);
            canvas.translate((float) this.f۱۲۱۲۶e, (float) top);
            canvas.scale(-1.0f, 1.0f);
            this.f۱۲۱۲۴c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f۱۲۱۲۶e), (float) (-top));
            return;
        }
        canvas.translate((float) left, 0.0f);
        this.f۱۲۱۲۵d.draw(canvas);
        canvas.translate(0.0f, (float) top);
        this.f۱۲۱۲۴c.draw(canvas);
        canvas.translate((float) (-left), (float) (-top));
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۳۲۰a(Canvas canvas) {
        int viewHeight = this.f۱۲۱۳۹r;
        int i = this.f۱۲۱۳۰i;
        int top = viewHeight - i;
        int i2 = this.f۱۲۱۳۶o;
        int i3 = this.f۱۲۱۳۵n;
        int left = i2 - (i3 / 2);
        this.f۱۲۱۲۸g.setBounds(0, 0, i3, i);
        this.f۱۲۱۲۹h.setBounds(0, 0, this.f۱۲۱۳۸q, this.f۱۲۱۳۱j);
        canvas.translate(0.0f, (float) top);
        this.f۱۲۱۲۹h.draw(canvas);
        canvas.translate((float) left, 0.0f);
        this.f۱۲۱۲۸g.draw(canvas);
        canvas.translate((float) (-left), (float) (-top));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۳۳۲a(int offsetX, int offsetY) {
        int verticalContentLength = this.f۱۲۱۴۰s.computeVerticalScrollRange();
        int verticalVisibleLength = this.f۱۲۱۳۹r;
        this.f۱۲۱۴۱t = verticalContentLength - verticalVisibleLength > 0 && this.f۱۲۱۳۹r >= this.f۱۲۱۲۲a;
        int horizontalContentLength = this.f۱۲۱۴۰s.computeHorizontalScrollRange();
        int horizontalVisibleLength = this.f۱۲۱۳۸q;
        this.f۱۲۱۴۲u = horizontalContentLength - horizontalVisibleLength > 0 && this.f۱۲۱۳۸q >= this.f۱۲۱۲۲a;
        if (this.f۱۲۱۴۱t || this.f۱۲۱۴۲u) {
            if (this.f۱۲۱۴۱t) {
                this.f۱۲۱۳۳l = (int) ((((float) verticalVisibleLength) * (((float) offsetY) + (((float) verticalVisibleLength) / 2.0f))) / ((float) verticalContentLength));
                this.f۱۲۱۳۲k = Math.min(verticalVisibleLength, (verticalVisibleLength * verticalVisibleLength) / verticalContentLength);
            }
            if (this.f۱۲۱۴۲u) {
                this.f۱۲۱۳۶o = (int) ((((float) horizontalVisibleLength) * (((float) offsetX) + (((float) horizontalVisibleLength) / 2.0f))) / ((float) horizontalContentLength));
                this.f۱۲۱۳۵n = Math.min(horizontalVisibleLength, (horizontalVisibleLength * horizontalVisibleLength) / horizontalContentLength);
            }
            int i = this.f۱۲۱۴۳v;
            if (i == 0 || i == 1) {
                m۱۵۳۳۸b(1);
            }
        } else if (this.f۱۲۱۴۳v != 0) {
            m۱۵۳۳۸b(0);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCs
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۵۳۴۱b(RecyclerView recyclerView, MotionEvent ev) {
        int i = this.f۱۲۱۴۳v;
        if (i == 1) {
            boolean insideVerticalThumb = m۱۵۳۴۰b(ev.getX(), ev.getY());
            boolean insideHorizontalThumb = m۱۵۳۳۶a(ev.getX(), ev.getY());
            if (ev.getAction() != 0 || (!insideVerticalThumb && !insideHorizontalThumb)) {
                return false;
            }
            if (insideHorizontalThumb) {
                this.f۱۲۱۴۴w = 1;
                this.f۱۲۱۳۷p = (float) ((int) ev.getX());
            } else if (insideVerticalThumb) {
                this.f۱۲۱۴۴w = 2;
                this.f۱۲۱۳۴m = (float) ((int) ev.getY());
            }
            m۱۵۳۳۸b(2);
            return true;
        } else if (i == 2) {
            return true;
        } else {
            return false;
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCs
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۳۳۴a(RecyclerView recyclerView, MotionEvent me) {
        if (this.f۱۲۱۴۳v != 0) {
            if (me.getAction() == 0) {
                boolean insideVerticalThumb = m۱۵۳۴۰b(me.getX(), me.getY());
                boolean insideHorizontalThumb = m۱۵۳۳۶a(me.getX(), me.getY());
                if (insideVerticalThumb || insideHorizontalThumb) {
                    if (insideHorizontalThumb) {
                        this.f۱۲۱۴۴w = 1;
                        this.f۱۲۱۳۷p = (float) ((int) me.getX());
                    } else if (insideVerticalThumb) {
                        this.f۱۲۱۴۴w = 2;
                        this.f۱۲۱۳۴m = (float) ((int) me.getY());
                    }
                    m۱۵۳۳۸b(2);
                }
            } else if (me.getAction() == 1 && this.f۱۲۱۴۳v == 2) {
                this.f۱۲۱۳۴m = 0.0f;
                this.f۱۲۱۳۷p = 0.0f;
                m۱۵۳۳۸b(1);
                this.f۱۲۱۴۴w = 0;
            } else if (me.getAction() == 2 && this.f۱۲۱۴۳v == 2) {
                m۱۵۳۳۷b();
                if (this.f۱۲۱۴۴w == 1) {
                    m۱۵۳۱۹a(me.getX());
                }
                if (this.f۱۲۱۴۴w == 2) {
                    m۱۵۳۲۱b(me.getY());
                }
            }
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCs
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۳۳۵a(boolean disallowIntercept) {
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۵۳۲۱b(float y) {
        int[] scrollbarRange = m۱۵۳۲۷f();
        float y2 = Math.max((float) scrollbarRange[0], Math.min((float) scrollbarRange[1], y));
        if (Math.abs(((float) this.f۱۲۱۳۳l) - y2) >= 2.0f) {
            int scrollingBy = m۱۵۳۱۸a(this.f۱۲۱۳۴m, y2, scrollbarRange, this.f۱۲۱۴۰s.computeVerticalScrollRange(), this.f۱۲۱۴۰s.computeVerticalScrollOffset(), this.f۱۲۱۳۹r);
            if (scrollingBy != 0) {
                this.f۱۲۱۴۰s.scrollBy(0, scrollingBy);
            }
            this.f۱۲۱۳۴m = y2;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۳۱۹a(float x) {
        int[] scrollbarRange = m۱۵۳۲۶e();
        float x2 = Math.max((float) scrollbarRange[0], Math.min((float) scrollbarRange[1], x));
        if (Math.abs(((float) this.f۱۲۱۳۶o) - x2) >= 2.0f) {
            int scrollingBy = m۱۵۳۱۸a(this.f۱۲۱۳۷p, x2, scrollbarRange, this.f۱۲۱۴۰s.computeHorizontalScrollRange(), this.f۱۲۱۴۰s.computeHorizontalScrollOffset(), this.f۱۲۱۳۸q);
            if (scrollingBy != 0) {
                this.f۱۲۱۴۰s.scrollBy(scrollingBy, 0);
            }
            this.f۱۲۱۳۷p = x2;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۵۳۱۸a(float oldDragPos, float newDragPos, int[] scrollbarRange, int scrollRange, int scrollOffset, int viewLength) {
        int scrollbarLength = scrollbarRange[1] - scrollbarRange[0];
        if (scrollbarLength == 0) {
            return 0;
        }
        int totalPossibleOffset = scrollRange - viewLength;
        int scrollingBy = (int) (((float) totalPossibleOffset) * ((newDragPos - oldDragPos) / ((float) scrollbarLength)));
        int absoluteOffset = scrollOffset + scrollingBy;
        if (absoluteOffset >= totalPossibleOffset || absoluteOffset < 0) {
            return 0;
        }
        return scrollingBy;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۵۳۴۰b(float x, float y) {
        if (!m۱۵۳۲۸g() ? x >= ((float) (this.f۱۲۱۳۸q - this.f۱۲۱۲۶e)) : x <= ((float) (this.f۱۲۱۲۶e / 2))) {
            int i = this.f۱۲۱۳۳l;
            int i2 = this.f۱۲۱۳۲k;
            return y >= ((float) (i - (i2 / 2))) && y <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۵۳۳۶a(float x, float y) {
        if (y >= ((float) (this.f۱۲۱۳۹r - this.f۱۲۱۳۰i))) {
            int i = this.f۱۲۱۳۶o;
            int i2 = this.f۱۲۱۳۵n;
            return x >= ((float) (i - (i2 / 2))) && x <= ((float) (i + (i2 / 2)));
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private int[] m۱۵۳۲۷f() {
        int[] iArr = this.f۱۲۱۴۵x;
        int i = this.f۱۲۱۲۳b;
        iArr[0] = i;
        iArr[1] = this.f۱۲۱۳۹r - i;
        return iArr;
    }

    /* renamed from: e  reason: contains not printable characters */
    private int[] m۱۵۳۲۶e() {
        int[] iArr = this.f۱۲۱۴۶y;
        int i = this.f۱۲۱۲۳b;
        iArr[0] = i;
        iArr[1] = this.f۱۲۱۳۸q - i;
        return iArr;
    }

    /* renamed from: android.support.v7.widget.j0$c  reason: invalid class name */
    private class Cc extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        private boolean f۱۲۱۵۰a = false;

        Cc() {
        }

        public void onAnimationEnd(Animator animation) {
            if (this.f۱۲۱۵۰a) {
                this.f۱۲۱۵۰a = false;
            } else if (((Float) Cj0.this.f۱۲۱۴۷z.getAnimatedValue()).floatValue() == 0.0f) {
                Cj0 j0Var = Cj0.this;
                j0Var.f۱۲۱۱۹A = 0;
                j0Var.m۱۵۳۳۸b(0);
            } else {
                Cj0 j0Var2 = Cj0.this;
                j0Var2.f۱۲۱۱۹A = 2;
                j0Var2.m۱۵۳۳۰a();
            }
        }

        public void onAnimationCancel(Animator animation) {
            this.f۱۲۱۵۰a = true;
        }
    }

    /* renamed from: android.support.v7.widget.j0$d  reason: invalid class name */
    private class Cd implements ValueAnimator.AnimatorUpdateListener {
        Cd() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int alpha = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            Cj0.this.f۱۲۱۲۴c.setAlpha(alpha);
            Cj0.this.f۱۲۱۲۵d.setAlpha(alpha);
            Cj0.this.m۱۵۳۳۰a();
        }
    }
}
