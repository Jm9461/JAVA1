package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.u;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* access modifiers changed from: package-private */
public class j0 extends RecyclerView.n implements RecyclerView.s {
    private static final int[] D = {16842919};
    private static final int[] E = new int[0];
    int A = 0;
    private final Runnable B = new a();
    private final RecyclerView.t C = new b();

    /* renamed from: a  reason: collision with root package name */
    private final int f۲۱۱۴a;

    /* renamed from: b  reason: collision with root package name */
    private final int f۲۱۱۵b;

    /* renamed from: c  reason: collision with root package name */
    final StateListDrawable f۲۱۱۶c;

    /* renamed from: d  reason: collision with root package name */
    final Drawable f۲۱۱۷d;

    /* renamed from: e  reason: collision with root package name */
    private final int f۲۱۱۸e;

    /* renamed from: f  reason: collision with root package name */
    private final int f۲۱۱۹f;

    /* renamed from: g  reason: collision with root package name */
    private final StateListDrawable f۲۱۲۰g;

    /* renamed from: h  reason: collision with root package name */
    private final Drawable f۲۱۲۱h;
    private final int i;
    private final int j;
    int k;
    int l;
    float m;
    int n;
    int o;
    float p;
    private int q = 0;
    private int r = 0;
    private RecyclerView s;
    private boolean t = false;
    private boolean u = false;
    private int v = 0;
    private int w = 0;
    private final int[] x = new int[2];
    private final int[] y = new int[2];
    final ValueAnimator z = ValueAnimator.ofFloat(0.0f, 1.0f);

    class a implements Runnable {
        a() {
        }

        public void run() {
            j0.this.a(500);
        }
    }

    class b extends RecyclerView.t {
        b() {
        }

        @Override // android.support.v7.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int dx, int dy) {
            j0.this.a(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    j0(RecyclerView recyclerView, StateListDrawable verticalThumbDrawable, Drawable verticalTrackDrawable, StateListDrawable horizontalThumbDrawable, Drawable horizontalTrackDrawable, int defaultWidth, int scrollbarMinimumRange, int margin) {
        this.f۲۱۱۶c = verticalThumbDrawable;
        this.f۲۱۱۷d = verticalTrackDrawable;
        this.f۲۱۲۰g = horizontalThumbDrawable;
        this.f۲۱۲۱h = horizontalTrackDrawable;
        this.f۲۱۱۸e = Math.max(defaultWidth, verticalThumbDrawable.getIntrinsicWidth());
        this.f۲۱۱۹f = Math.max(defaultWidth, verticalTrackDrawable.getIntrinsicWidth());
        this.i = Math.max(defaultWidth, horizontalThumbDrawable.getIntrinsicWidth());
        this.j = Math.max(defaultWidth, horizontalTrackDrawable.getIntrinsicWidth());
        this.f۲۱۱۴a = scrollbarMinimumRange;
        this.f۲۱۱۵b = margin;
        this.f۲۱۱۶c.setAlpha(255);
        this.f۲۱۱۷d.setAlpha(255);
        this.z.addListener(new c());
        this.z.addUpdateListener(new d());
        a(recyclerView);
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                d();
            }
            this.s = recyclerView;
            if (this.s != null) {
                h();
            }
        }
    }

    private void h() {
        this.s.a((RecyclerView.n) this);
        this.s.a((RecyclerView.s) this);
        this.s.a(this.C);
    }

    private void d() {
        this.s.b((RecyclerView.n) this);
        this.s.b((RecyclerView.s) this);
        this.s.b(this.C);
        c();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.s.invalidate();
    }

    /* access modifiers changed from: package-private */
    public void b(int state) {
        if (state == 2 && this.v != 2) {
            this.f۲۱۱۶c.setState(D);
            c();
        }
        if (state == 0) {
            a();
        } else {
            b();
        }
        if (this.v == 2 && state != 2) {
            this.f۲۱۱۶c.setState(E);
            c(1200);
        } else if (state == 1) {
            c(1500);
        }
        this.v = state;
    }

    private boolean g() {
        return u.k(this.s) == 1;
    }

    public void b() {
        int i2 = this.A;
        if (i2 != 0) {
            if (i2 == 3) {
                this.z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.z.setDuration(500L);
        this.z.setStartDelay(0);
        this.z.start();
    }

    /* access modifiers changed from: package-private */
    public void a(int duration) {
        int i2 = this.A;
        if (i2 == 1) {
            this.z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.z.setDuration((long) duration);
        this.z.start();
    }

    private void c() {
        this.s.removeCallbacks(this.B);
    }

    private void c(int delay) {
        c();
        this.s.postDelayed(this.B, (long) delay);
    }

    @Override // android.support.v7.widget.RecyclerView.n
    public void b(Canvas canvas, RecyclerView parent, RecyclerView.a0 state) {
        if (this.q != this.s.getWidth() || this.r != this.s.getHeight()) {
            this.q = this.s.getWidth();
            this.r = this.s.getHeight();
            b(0);
        } else if (this.A != 0) {
            if (this.t) {
                b(canvas);
            }
            if (this.u) {
                a(canvas);
            }
        }
    }

    private void b(Canvas canvas) {
        int viewWidth = this.q;
        int i2 = this.f۲۱۱۸e;
        int left = viewWidth - i2;
        int i3 = this.l;
        int i4 = this.k;
        int top = i3 - (i4 / 2);
        this.f۲۱۱۶c.setBounds(0, 0, i2, i4);
        this.f۲۱۱۷d.setBounds(0, 0, this.f۲۱۱۹f, this.r);
        if (g()) {
            this.f۲۱۱۷d.draw(canvas);
            canvas.translate((float) this.f۲۱۱۸e, (float) top);
            canvas.scale(-1.0f, 1.0f);
            this.f۲۱۱۶c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f۲۱۱۸e), (float) (-top));
            return;
        }
        canvas.translate((float) left, 0.0f);
        this.f۲۱۱۷d.draw(canvas);
        canvas.translate(0.0f, (float) top);
        this.f۲۱۱۶c.draw(canvas);
        canvas.translate((float) (-left), (float) (-top));
    }

    private void a(Canvas canvas) {
        int viewHeight = this.r;
        int i2 = this.i;
        int top = viewHeight - i2;
        int i3 = this.o;
        int i4 = this.n;
        int left = i3 - (i4 / 2);
        this.f۲۱۲۰g.setBounds(0, 0, i4, i2);
        this.f۲۱۲۱h.setBounds(0, 0, this.q, this.j);
        canvas.translate(0.0f, (float) top);
        this.f۲۱۲۱h.draw(canvas);
        canvas.translate((float) left, 0.0f);
        this.f۲۱۲۰g.draw(canvas);
        canvas.translate((float) (-left), (float) (-top));
    }

    /* access modifiers changed from: package-private */
    public void a(int offsetX, int offsetY) {
        int verticalContentLength = this.s.computeVerticalScrollRange();
        int verticalVisibleLength = this.r;
        this.t = verticalContentLength - verticalVisibleLength > 0 && this.r >= this.f۲۱۱۴a;
        int horizontalContentLength = this.s.computeHorizontalScrollRange();
        int horizontalVisibleLength = this.q;
        this.u = horizontalContentLength - horizontalVisibleLength > 0 && this.q >= this.f۲۱۱۴a;
        if (this.t || this.u) {
            if (this.t) {
                this.l = (int) ((((float) verticalVisibleLength) * (((float) offsetY) + (((float) verticalVisibleLength) / 2.0f))) / ((float) verticalContentLength));
                this.k = Math.min(verticalVisibleLength, (verticalVisibleLength * verticalVisibleLength) / verticalContentLength);
            }
            if (this.u) {
                this.o = (int) ((((float) horizontalVisibleLength) * (((float) offsetX) + (((float) horizontalVisibleLength) / 2.0f))) / ((float) horizontalContentLength));
                this.n = Math.min(horizontalVisibleLength, (horizontalVisibleLength * horizontalVisibleLength) / horizontalContentLength);
            }
            int i2 = this.v;
            if (i2 == 0 || i2 == 1) {
                b(1);
            }
        } else if (this.v != 0) {
            b(0);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.s
    public boolean b(RecyclerView recyclerView, MotionEvent ev) {
        int i2 = this.v;
        if (i2 == 1) {
            boolean insideVerticalThumb = b(ev.getX(), ev.getY());
            boolean insideHorizontalThumb = a(ev.getX(), ev.getY());
            if (ev.getAction() != 0 || (!insideVerticalThumb && !insideHorizontalThumb)) {
                return false;
            }
            if (insideHorizontalThumb) {
                this.w = 1;
                this.p = (float) ((int) ev.getX());
            } else if (insideVerticalThumb) {
                this.w = 2;
                this.m = (float) ((int) ev.getY());
            }
            b(2);
            return true;
        } else if (i2 == 2) {
            return true;
        } else {
            return false;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.s
    public void a(RecyclerView recyclerView, MotionEvent me2) {
        if (this.v != 0) {
            if (me2.getAction() == 0) {
                boolean insideVerticalThumb = b(me2.getX(), me2.getY());
                boolean insideHorizontalThumb = a(me2.getX(), me2.getY());
                if (insideVerticalThumb || insideHorizontalThumb) {
                    if (insideHorizontalThumb) {
                        this.w = 1;
                        this.p = (float) ((int) me2.getX());
                    } else if (insideVerticalThumb) {
                        this.w = 2;
                        this.m = (float) ((int) me2.getY());
                    }
                    b(2);
                }
            } else if (me2.getAction() == 1 && this.v == 2) {
                this.m = 0.0f;
                this.p = 0.0f;
                b(1);
                this.w = 0;
            } else if (me2.getAction() == 2 && this.v == 2) {
                b();
                if (this.w == 1) {
                    a(me2.getX());
                }
                if (this.w == 2) {
                    b(me2.getY());
                }
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.s
    public void a(boolean disallowIntercept) {
    }

    private void b(float y2) {
        int[] scrollbarRange = f();
        float y3 = Math.max((float) scrollbarRange[0], Math.min((float) scrollbarRange[1], y2));
        if (Math.abs(((float) this.l) - y3) >= 2.0f) {
            int scrollingBy = a(this.m, y3, scrollbarRange, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
            if (scrollingBy != 0) {
                this.s.scrollBy(0, scrollingBy);
            }
            this.m = y3;
        }
    }

    private void a(float x2) {
        int[] scrollbarRange = e();
        float x3 = Math.max((float) scrollbarRange[0], Math.min((float) scrollbarRange[1], x2));
        if (Math.abs(((float) this.o) - x3) >= 2.0f) {
            int scrollingBy = a(this.p, x3, scrollbarRange, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
            if (scrollingBy != 0) {
                this.s.scrollBy(scrollingBy, 0);
            }
            this.p = x3;
        }
    }

    private int a(float oldDragPos, float newDragPos, int[] scrollbarRange, int scrollRange, int scrollOffset, int viewLength) {
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
    public boolean b(float x2, float y2) {
        if (!g() ? x2 >= ((float) (this.q - this.f۲۱۱۸e)) : x2 <= ((float) (this.f۲۱۱۸e / 2))) {
            int i2 = this.l;
            int i3 = this.k;
            return y2 >= ((float) (i2 - (i3 / 2))) && y2 <= ((float) (i2 + (i3 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(float x2, float y2) {
        if (y2 >= ((float) (this.r - this.i))) {
            int i2 = this.o;
            int i3 = this.n;
            return x2 >= ((float) (i2 - (i3 / 2))) && x2 <= ((float) (i2 + (i3 / 2)));
        }
    }

    private int[] f() {
        int[] iArr = this.x;
        int i2 = this.f۲۱۱۵b;
        iArr[0] = i2;
        iArr[1] = this.r - i2;
        return iArr;
    }

    private int[] e() {
        int[] iArr = this.y;
        int i2 = this.f۲۱۱۵b;
        iArr[0] = i2;
        iArr[1] = this.q - i2;
        return iArr;
    }

    private class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f۲۱۲۴a = false;

        c() {
        }

        public void onAnimationEnd(Animator animation) {
            if (this.f۲۱۲۴a) {
                this.f۲۱۲۴a = false;
            } else if (((Float) j0.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                j0 j0Var = j0.this;
                j0Var.A = 0;
                j0Var.b(0);
            } else {
                j0 j0Var2 = j0.this;
                j0Var2.A = 2;
                j0Var2.a();
            }
        }

        public void onAnimationCancel(Animator animation) {
            this.f۲۱۲۴a = true;
        }
    }

    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int alpha = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            j0.this.f۲۱۱۶c.setAlpha(alpha);
            j0.this.f۲۱۱۷d.setAlpha(alpha);
            j0.this.a();
        }
    }
}
