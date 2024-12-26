package android.support.v7.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.Cu;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* renamed from: android.support.v7.widget.j0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cj0 extends RecyclerView.AbstractCn implements RecyclerView.InterfaceCs {

    /* renamed from: D, reason: contains not printable characters */
    private static final int[] f۱۲۱۱۷D = {R.attr.state_pressed};

    /* renamed from: E, reason: contains not printable characters */
    private static final int[] f۱۲۱۱۸E = new int[0];

    /* renamed from: a, reason: contains not printable characters */
    private final int f۱۲۱۲۲a;

    /* renamed from: b, reason: contains not printable characters */
    private final int f۱۲۱۲۳b;

    /* renamed from: c, reason: contains not printable characters */
    final StateListDrawable f۱۲۱۲۴c;

    /* renamed from: d, reason: contains not printable characters */
    final Drawable f۱۲۱۲۵d;

    /* renamed from: e, reason: contains not printable characters */
    private final int f۱۲۱۲۶e;

    /* renamed from: f, reason: contains not printable characters */
    private final int f۱۲۱۲۷f;

    /* renamed from: g, reason: contains not printable characters */
    private final StateListDrawable f۱۲۱۲۸g;

    /* renamed from: h, reason: contains not printable characters */
    private final Drawable f۱۲۱۲۹h;

    /* renamed from: i, reason: contains not printable characters */
    private final int f۱۲۱۳۰i;

    /* renamed from: j, reason: contains not printable characters */
    private final int f۱۲۱۳۱j;

    /* renamed from: k, reason: contains not printable characters */
    int f۱۲۱۳۲k;

    /* renamed from: l, reason: contains not printable characters */
    int f۱۲۱۳۳l;

    /* renamed from: m, reason: contains not printable characters */
    float f۱۲۱۳۴m;

    /* renamed from: n, reason: contains not printable characters */
    int f۱۲۱۳۵n;

    /* renamed from: o, reason: contains not printable characters */
    int f۱۲۱۳۶o;

    /* renamed from: p, reason: contains not printable characters */
    float f۱۲۱۳۷p;

    /* renamed from: s, reason: contains not printable characters */
    private RecyclerView f۱۲۱۴۰s;

    /* renamed from: q, reason: contains not printable characters */
    private int f۱۲۱۳۸q = 0;

    /* renamed from: r, reason: contains not printable characters */
    private int f۱۲۱۳۹r = 0;

    /* renamed from: t, reason: contains not printable characters */
    private boolean f۱۲۱۴۱t = false;

    /* renamed from: u, reason: contains not printable characters */
    private boolean f۱۲۱۴۲u = false;

    /* renamed from: v, reason: contains not printable characters */
    private int f۱۲۱۴۳v = 0;

    /* renamed from: w, reason: contains not printable characters */
    private int f۱۲۱۴۴w = 0;

    /* renamed from: x, reason: contains not printable characters */
    private final int[] f۱۲۱۴۵x = new int[2];

    /* renamed from: y, reason: contains not printable characters */
    private final int[] f۱۲۱۴۶y = new int[2];

    /* renamed from: z, reason: contains not printable characters */
    final ValueAnimator f۱۲۱۴۷z = ValueAnimator.ofFloat(0.0f, 1.0f);

    /* renamed from: A, reason: contains not printable characters */
    int f۱۲۱۱۹A = 0;

    /* renamed from: B, reason: contains not printable characters */
    private final Runnable f۱۲۱۲۰B = new a();

    /* renamed from: C, reason: contains not printable characters */
    private final RecyclerView.AbstractCt f۱۲۱۲۱C = new b();

    /* renamed from: android.support.v7.widget.j0$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Cj0.this.m۱۳۲۶۱a(500);
        }
    }

    /* renamed from: android.support.v7.widget.j0$b */
    class b extends RecyclerView.AbstractCt {
        b() {
        }

        @Override // android.support.v7.widget.RecyclerView.AbstractCt
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۴۶۸۵a(RecyclerView recyclerView, int dx, int dy) {
            Cj0.this.m۱۳۲۶۲a(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
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
        this.f۱۲۱۴۷z.addListener(new c());
        this.f۱۲۱۴۷z.addUpdateListener(new d());
        m۱۳۲۶۳a(recyclerView);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۲۶۳a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f۱۲۱۴۰s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m۱۳۲۵۵d();
        }
        this.f۱۲۱۴۰s = recyclerView;
        if (this.f۱۲۱۴۰s != null) {
            m۱۳۲۵۹h();
        }
    }

    /* renamed from: h, reason: contains not printable characters */
    private void m۱۳۲۵۹h() {
        this.f۱۲۱۴۰s.m۱۲۲۱۵a((RecyclerView.AbstractCn) this);
        this.f۱۲۱۴۰s.m۱۲۲۱۷a((RecyclerView.InterfaceCs) this);
        this.f۱۲۱۴۰s.m۱۲۲۱۸a(this.f۱۲۱۲۱C);
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۱۳۲۵۵d() {
        this.f۱۲۱۴۰s.m۱۲۲۳۳b((RecyclerView.AbstractCn) this);
        this.f۱۲۱۴۰s.m۱۲۲۳۴b((RecyclerView.InterfaceCs) this);
        this.f۱۲۱۴۰s.m۱۲۲۳۵b(this.f۱۲۱۲۱C);
        m۱۳۲۵۳c();
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۲۶۰a() {
        this.f۱۲۱۴۰s.invalidate();
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۳۲۶۸b(int state) {
        if (state == 2 && this.f۱۲۱۴۳v != 2) {
            this.f۱۲۱۲۴c.setState(f۱۲۱۱۷D);
            m۱۳۲۵۳c();
        }
        if (state == 0) {
            m۱۳۲۶۰a();
        } else {
            m۱۳۲۶۷b();
        }
        if (this.f۱۲۱۴۳v == 2 && state != 2) {
            this.f۱۲۱۲۴c.setState(f۱۲۱۱۸E);
            m۱۳۲۵۴c(1200);
        } else if (state == 1) {
            m۱۳۲۵۴c(1500);
        }
        this.f۱۲۱۴۳v = state;
    }

    /* renamed from: g, reason: contains not printable characters */
    private boolean m۱۳۲۵۸g() {
        return Cu.m۱۰۹۴۴k(this.f۱۲۱۴۰s) == 1;
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۳۲۶۷b() {
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
        this.f۱۲۱۴۷z.setStartDelay(0L);
        this.f۱۲۱۴۷z.start();
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۲۶۱a(int duration) {
        int i = this.f۱۲۱۱۹A;
        if (i == 1) {
            this.f۱۲۱۴۷z.cancel();
        } else if (i != 2) {
            return;
        }
        this.f۱۲۱۱۹A = 3;
        ValueAnimator valueAnimator = this.f۱۲۱۴۷z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f۱۲۱۴۷z.setDuration(duration);
        this.f۱۲۱۴۷z.start();
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۱۳۲۵۳c() {
        this.f۱۲۱۴۰s.removeCallbacks(this.f۱۲۱۲۰B);
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۱۳۲۵۴c(int delay) {
        m۱۳۲۵۳c();
        this.f۱۲۱۴۰s.postDelayed(this.f۱۲۱۲۰B, delay);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCn
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۳۲۶۹b(Canvas canvas, RecyclerView parent, RecyclerView.Ca0 state) {
        if (this.f۱۲۱۳۸q != this.f۱۲۱۴۰s.getWidth() || this.f۱۲۱۳۹r != this.f۱۲۱۴۰s.getHeight()) {
            this.f۱۲۱۳۸q = this.f۱۲۱۴۰s.getWidth();
            this.f۱۲۱۳۹r = this.f۱۲۱۴۰s.getHeight();
            m۱۳۲۶۸b(0);
        } else if (this.f۱۲۱۱۹A != 0) {
            if (this.f۱۲۱۴۱t) {
                m۱۳۲۵۲b(canvas);
            }
            if (this.f۱۲۱۴۲u) {
                m۱۳۲۵۰a(canvas);
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۳۲۵۲b(Canvas canvas) {
        int viewWidth = this.f۱۲۱۳۸q;
        int i = this.f۱۲۱۲۶e;
        int left = viewWidth - i;
        int i2 = this.f۱۲۱۳۳l;
        int i3 = this.f۱۲۱۳۲k;
        int top = i2 - (i3 / 2);
        this.f۱۲۱۲۴c.setBounds(0, 0, i, i3);
        this.f۱۲۱۲۵d.setBounds(0, 0, this.f۱۲۱۲۷f, this.f۱۲۱۳۹r);
        if (m۱۳۲۵۸g()) {
            this.f۱۲۱۲۵d.draw(canvas);
            canvas.translate(this.f۱۲۱۲۶e, top);
            canvas.scale(-1.0f, 1.0f);
            this.f۱۲۱۲۴c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate(-this.f۱۲۱۲۶e, -top);
            return;
        }
        canvas.translate(left, 0.0f);
        this.f۱۲۱۲۵d.draw(canvas);
        canvas.translate(0.0f, top);
        this.f۱۲۱۲۴c.draw(canvas);
        canvas.translate(-left, -top);
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۲۵۰a(Canvas canvas) {
        int viewHeight = this.f۱۲۱۳۹r;
        int i = this.f۱۲۱۳۰i;
        int top = viewHeight - i;
        int i2 = this.f۱۲۱۳۶o;
        int i3 = this.f۱۲۱۳۵n;
        int left = i2 - (i3 / 2);
        this.f۱۲۱۲۸g.setBounds(0, 0, i3, i);
        this.f۱۲۱۲۹h.setBounds(0, 0, this.f۱۲۱۳۸q, this.f۱۲۱۳۱j);
        canvas.translate(0.0f, top);
        this.f۱۲۱۲۹h.draw(canvas);
        canvas.translate(left, 0.0f);
        this.f۱۲۱۲۸g.draw(canvas);
        canvas.translate(-left, -top);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۲۶۲a(int offsetX, int offsetY) {
        int verticalContentLength = this.f۱۲۱۴۰s.computeVerticalScrollRange();
        int verticalVisibleLength = this.f۱۲۱۳۹r;
        this.f۱۲۱۴۱t = verticalContentLength - verticalVisibleLength > 0 && this.f۱۲۱۳۹r >= this.f۱۲۱۲۲a;
        int horizontalContentLength = this.f۱۲۱۴۰s.computeHorizontalScrollRange();
        int horizontalVisibleLength = this.f۱۲۱۳۸q;
        this.f۱۲۱۴۲u = horizontalContentLength - horizontalVisibleLength > 0 && this.f۱۲۱۳۸q >= this.f۱۲۱۲۲a;
        if (!this.f۱۲۱۴۱t && !this.f۱۲۱۴۲u) {
            if (this.f۱۲۱۴۳v != 0) {
                m۱۳۲۶۸b(0);
                return;
            }
            return;
        }
        if (this.f۱۲۱۴۱t) {
            float middleScreenPos = offsetY + (verticalVisibleLength / 2.0f);
            this.f۱۲۱۳۳l = (int) ((verticalVisibleLength * middleScreenPos) / verticalContentLength);
            this.f۱۲۱۳۲k = Math.min(verticalVisibleLength, (verticalVisibleLength * verticalVisibleLength) / verticalContentLength);
        }
        if (this.f۱۲۱۴۲u) {
            float middleScreenPos2 = offsetX + (horizontalVisibleLength / 2.0f);
            this.f۱۲۱۳۶o = (int) ((horizontalVisibleLength * middleScreenPos2) / horizontalContentLength);
            this.f۱۲۱۳۵n = Math.min(horizontalVisibleLength, (horizontalVisibleLength * horizontalVisibleLength) / horizontalContentLength);
        }
        int i = this.f۱۲۱۴۳v;
        if (i == 0 || i == 1) {
            m۱۳۲۶۸b(1);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.InterfaceCs
    /* renamed from: b, reason: contains not printable characters */
    public boolean mo۱۳۲۷۱b(RecyclerView recyclerView, MotionEvent ev) {
        int i = this.f۱۲۱۴۳v;
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            return false;
        }
        boolean insideVerticalThumb = m۱۳۲۷۰b(ev.getX(), ev.getY());
        boolean insideHorizontalThumb = m۱۳۲۶۶a(ev.getX(), ev.getY());
        if (ev.getAction() == 0 && (insideVerticalThumb || insideHorizontalThumb)) {
            if (insideHorizontalThumb) {
                this.f۱۲۱۴۴w = 1;
                this.f۱۲۱۳۷p = (int) ev.getX();
            } else if (insideVerticalThumb) {
                this.f۱۲۱۴۴w = 2;
                this.f۱۲۱۳۴m = (int) ev.getY();
            }
            m۱۳۲۶۸b(2);
            return true;
        }
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView.InterfaceCs
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۲۶۴a(RecyclerView recyclerView, MotionEvent me2) {
        if (this.f۱۲۱۴۳v == 0) {
            return;
        }
        if (me2.getAction() == 0) {
            boolean insideVerticalThumb = m۱۳۲۷۰b(me2.getX(), me2.getY());
            boolean insideHorizontalThumb = m۱۳۲۶۶a(me2.getX(), me2.getY());
            if (insideVerticalThumb || insideHorizontalThumb) {
                if (insideHorizontalThumb) {
                    this.f۱۲۱۴۴w = 1;
                    this.f۱۲۱۳۷p = (int) me2.getX();
                } else if (insideVerticalThumb) {
                    this.f۱۲۱۴۴w = 2;
                    this.f۱۲۱۳۴m = (int) me2.getY();
                }
                m۱۳۲۶۸b(2);
                return;
            }
            return;
        }
        if (me2.getAction() == 1 && this.f۱۲۱۴۳v == 2) {
            this.f۱۲۱۳۴m = 0.0f;
            this.f۱۲۱۳۷p = 0.0f;
            m۱۳۲۶۸b(1);
            this.f۱۲۱۴۴w = 0;
            return;
        }
        if (me2.getAction() == 2 && this.f۱۲۱۴۳v == 2) {
            m۱۳۲۶۷b();
            if (this.f۱۲۱۴۴w == 1) {
                m۱۳۲۴۹a(me2.getX());
            }
            if (this.f۱۲۱۴۴w == 2) {
                m۱۳۲۵۱b(me2.getY());
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.InterfaceCs
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۲۶۵a(boolean disallowIntercept) {
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۳۲۵۱b(float y) {
        int[] scrollbarRange = m۱۳۲۵۷f();
        float y2 = Math.max(scrollbarRange[0], Math.min(scrollbarRange[1], y));
        if (Math.abs(this.f۱۲۱۳۳l - y2) < 2.0f) {
            return;
        }
        int scrollingBy = m۱۳۲۴۸a(this.f۱۲۱۳۴m, y2, scrollbarRange, this.f۱۲۱۴۰s.computeVerticalScrollRange(), this.f۱۲۱۴۰s.computeVerticalScrollOffset(), this.f۱۲۱۳۹r);
        if (scrollingBy != 0) {
            this.f۱۲۱۴۰s.scrollBy(0, scrollingBy);
        }
        this.f۱۲۱۳۴m = y2;
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۲۴۹a(float x) {
        int[] scrollbarRange = m۱۳۲۵۶e();
        float x2 = Math.max(scrollbarRange[0], Math.min(scrollbarRange[1], x));
        if (Math.abs(this.f۱۲۱۳۶o - x2) < 2.0f) {
            return;
        }
        int scrollingBy = m۱۳۲۴۸a(this.f۱۲۱۳۷p, x2, scrollbarRange, this.f۱۲۱۴۰s.computeHorizontalScrollRange(), this.f۱۲۱۴۰s.computeHorizontalScrollOffset(), this.f۱۲۱۳۸q);
        if (scrollingBy != 0) {
            this.f۱۲۱۴۰s.scrollBy(scrollingBy, 0);
        }
        this.f۱۲۱۳۷p = x2;
    }

    /* renamed from: a, reason: contains not printable characters */
    private int m۱۳۲۴۸a(float oldDragPos, float newDragPos, int[] scrollbarRange, int scrollRange, int scrollOffset, int viewLength) {
        int scrollbarLength = scrollbarRange[1] - scrollbarRange[0];
        if (scrollbarLength == 0) {
            return 0;
        }
        float percentage = (newDragPos - oldDragPos) / scrollbarLength;
        int totalPossibleOffset = scrollRange - viewLength;
        int scrollingBy = (int) (totalPossibleOffset * percentage);
        int absoluteOffset = scrollOffset + scrollingBy;
        if (absoluteOffset >= totalPossibleOffset || absoluteOffset < 0) {
            return 0;
        }
        return scrollingBy;
    }

    /* renamed from: b, reason: contains not printable characters */
    boolean m۱۳۲۷۰b(float x, float y) {
        if (!m۱۳۲۵۸g() ? x >= this.f۱۲۱۳۸q - this.f۱۲۱۲۶e : x <= this.f۱۲۱۲۶e / 2) {
            int i = this.f۱۲۱۳۳l;
            int i2 = this.f۱۲۱۳۲k;
            if (y >= i - (i2 / 2) && y <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    boolean m۱۳۲۶۶a(float x, float y) {
        if (y >= this.f۱۲۱۳۹r - this.f۱۲۱۳۰i) {
            int i = this.f۱۲۱۳۶o;
            int i2 = this.f۱۲۱۳۵n;
            if (x >= i - (i2 / 2) && x <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f, reason: contains not printable characters */
    private int[] m۱۳۲۵۷f() {
        int[] iArr = this.f۱۲۱۴۵x;
        int i = this.f۱۲۱۲۳b;
        iArr[0] = i;
        iArr[1] = this.f۱۲۱۳۹r - i;
        return iArr;
    }

    /* renamed from: e, reason: contains not printable characters */
    private int[] m۱۳۲۵۶e() {
        int[] iArr = this.f۱۲۱۴۶y;
        int i = this.f۱۲۱۲۳b;
        iArr[0] = i;
        iArr[1] = this.f۱۲۱۳۸q - i;
        return iArr;
    }

    /* renamed from: android.support.v7.widget.j0$c */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: contains not printable characters */
        private boolean f۱۲۱۵۰a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            if (this.f۱۲۱۵۰a) {
                this.f۱۲۱۵۰a = false;
                return;
            }
            if (((Float) Cj0.this.f۱۲۱۴۷z.getAnimatedValue()).floatValue() == 0.0f) {
                Cj0 cj0 = Cj0.this;
                cj0.f۱۲۱۱۹A = 0;
                cj0.m۱۳۲۶۸b(0);
            } else {
                Cj0 cj02 = Cj0.this;
                cj02.f۱۲۱۱۹A = 2;
                cj02.m۱۳۲۶۰a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            this.f۱۲۱۵۰a = true;
        }
    }

    /* renamed from: android.support.v7.widget.j0$d */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int alpha = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            Cj0.this.f۱۲۱۲۴c.setAlpha(alpha);
            Cj0.this.f۱۲۱۲۵d.setAlpha(alpha);
            Cj0.this.m۱۳۲۶۰a();
        }
    }
}
