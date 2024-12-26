package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    static final int[] h0 = {16842931};
    private static final Comparator<f> i0 = new a();
    private static final Interpolator j0 = new b();
    private static final n k0 = new n();
    private boolean A;
    private int B;
    private int C;
    private int D;
    private float E;
    private float F;
    private float G;
    private float H;
    private int I = -1;
    private VelocityTracker J;
    private int K;
    private int L;
    private int M;
    private int N;
    private boolean O;
    private EdgeEffect P;
    private EdgeEffect Q;
    private boolean R = true;
    private boolean S;
    private int T;
    private List<j> U;
    private j V;
    private j W;
    private List<i> a0;
    private k b0;

    /* renamed from: c  reason: collision with root package name */
    private int f۱۳۰۵c;
    private int c0;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<f> f۱۳۰۶d = new ArrayList<>();
    private int d0;

    /* renamed from: e  reason: collision with root package name */
    private final f f۱۳۰۷e = new f();
    private ArrayList<View> e0;

    /* renamed from: f  reason: collision with root package name */
    private final Rect f۱۳۰۸f = new Rect();
    private final Runnable f0 = new c();

    /* renamed from: g  reason: collision with root package name */
    q f۱۳۰۹g;
    private int g0 = 0;

    /* renamed from: h  reason: collision with root package name */
    int f۱۳۱۰h;
    private int i = -1;
    private Parcelable j = null;
    private ClassLoader k = null;
    private Scroller l;
    private boolean m;
    private l n;
    private int o;
    private Drawable p;
    private int q;
    private int r;
    private float s = -3.4028235E38f;
    private float t = Float.MAX_VALUE;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y = 1;
    private boolean z;

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    public interface i {
        void a(ViewPager viewPager, q qVar, q qVar2);
    }

    public interface j {
        void a(int i);

        void a(int i, float f2, int i2);

        void b(int i);
    }

    public interface k {
        void a(View view, float f2);
    }

    /* access modifiers changed from: package-private */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        Object f۱۳۱۴a;

        /* renamed from: b  reason: collision with root package name */
        int f۱۳۱۵b;

        /* renamed from: c  reason: collision with root package name */
        boolean f۱۳۱۶c;

        /* renamed from: d  reason: collision with root package name */
        float f۱۳۱۷d;

        /* renamed from: e  reason: collision with root package name */
        float f۱۳۱۸e;

        f() {
        }
    }

    static class a implements Comparator<f> {
        a() {
        }

        /* renamed from: a */
        public int compare(f lhs, f rhs) {
            return lhs.f۱۳۱۵b - rhs.f۱۳۱۵b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        public float getInterpolation(float t) {
            float t2 = t - 1.0f;
            return (t2 * t2 * t2 * t2 * t2) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.e();
        }
    }

    public ViewPager(Context context) {
        super(context);
        b();
    }

    public ViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        b();
    }

    /* access modifiers changed from: package-private */
    public void b() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.l = new Scroller(context, j0);
        ViewConfiguration configuration = ViewConfiguration.get(context);
        float density = context.getResources().getDisplayMetrics().density;
        this.D = configuration.getScaledPagingTouchSlop();
        this.K = (int) (400.0f * density);
        this.L = configuration.getScaledMaximumFlingVelocity();
        this.P = new EdgeEffect(context);
        this.Q = new EdgeEffect(context);
        this.M = (int) (25.0f * density);
        this.N = (int) (2.0f * density);
        this.B = (int) (16.0f * density);
        u.a(this, new h());
        if (u.i(this) == 0) {
            u.f(this, 1);
        }
        u.a(this, new d());
    }

    /* access modifiers changed from: package-private */
    public class d implements p {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f۱۳۱۲a = new Rect();

        d() {
        }

        @Override // android.support.v4.view.p
        public c0 a(View v, c0 originalInsets) {
            c0 applied = u.b(v, originalInsets);
            if (applied.g()) {
                return applied;
            }
            Rect res = this.f۱۳۱۲a;
            res.left = applied.c();
            res.top = applied.e();
            res.right = applied.d();
            res.bottom = applied.b();
            int count = ViewPager.this.getChildCount();
            for (int i = 0; i < count; i++) {
                c0 childInsets = u.a(ViewPager.this.getChildAt(i), applied);
                res.left = Math.min(childInsets.c(), res.left);
                res.top = Math.min(childInsets.e(), res.top);
                res.right = Math.min(childInsets.d(), res.right);
                res.bottom = Math.min(childInsets.b(), res.bottom);
            }
            return applied.a(res.left, res.top, res.right, res.bottom);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f0);
        Scroller scroller = this.l;
        if (scroller != null && !scroller.isFinished()) {
            this.l.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int newState) {
        if (this.g0 != newState) {
            this.g0 = newState;
            if (this.b0 != null) {
                b(newState != 0);
            }
            e(newState);
        }
    }

    public void setAdapter(q adapter) {
        q qVar = this.f۱۳۰۹g;
        if (qVar != null) {
            qVar.b((DataSetObserver) null);
            this.f۱۳۰۹g.b(this);
            for (int i2 = 0; i2 < this.f۱۳۰۶d.size(); i2++) {
                f ii = this.f۱۳۰۶d.get(i2);
                this.f۱۳۰۹g.a(this, ii.f۱۳۱۵b, ii.f۱۳۱۴a);
            }
            this.f۱۳۰۹g.a((ViewGroup) this);
            this.f۱۳۰۶d.clear();
            h();
            this.f۱۳۱۰h = 0;
            scrollTo(0, 0);
        }
        q oldAdapter = this.f۱۳۰۹g;
        this.f۱۳۰۹g = adapter;
        this.f۱۳۰۵c = 0;
        if (this.f۱۳۰۹g != null) {
            if (this.n == null) {
                this.n = new l();
            }
            this.f۱۳۰۹g.b(this.n);
            this.x = false;
            boolean wasFirstLayout = this.R;
            this.R = true;
            this.f۱۳۰۵c = this.f۱۳۰۹g.a();
            if (this.i >= 0) {
                this.f۱۳۰۹g.a(this.j, this.k);
                a(this.i, false, true);
                this.i = -1;
                this.j = null;
                this.k = null;
            } else if (!wasFirstLayout) {
                e();
            } else {
                requestLayout();
            }
        }
        List<i> list = this.a0;
        if (!(list == null || list.isEmpty())) {
            int count = this.a0.size();
            for (int i3 = 0; i3 < count; i3++) {
                this.a0.get(i3).a(this, oldAdapter, adapter);
            }
        }
    }

    private void h() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((g) getChildAt(i2).getLayoutParams()).f۱۳۱۹a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    public q getAdapter() {
        return this.f۱۳۰۹g;
    }

    public void a(i listener) {
        if (this.a0 == null) {
            this.a0 = new ArrayList();
        }
        this.a0.add(listener);
    }

    public void b(i listener) {
        List<i> list = this.a0;
        if (list != null) {
            list.remove(listener);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int item) {
        this.x = false;
        a(item, !this.R, false);
    }

    public void a(int item, boolean smoothScroll) {
        this.x = false;
        a(item, smoothScroll, false);
    }

    public int getCurrentItem() {
        return this.f۱۳۱۰h;
    }

    /* access modifiers changed from: package-private */
    public void a(int item, boolean smoothScroll, boolean always) {
        a(item, smoothScroll, always, 0);
    }

    /* access modifiers changed from: package-private */
    public void a(int item, boolean smoothScroll, boolean always, int velocity) {
        q qVar = this.f۱۳۰۹g;
        if (qVar == null || qVar.a() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (always || this.f۱۳۱۰h != item || this.f۱۳۰۶d.size() == 0) {
            boolean dispatchSelected = true;
            if (item < 0) {
                item = 0;
            } else if (item >= this.f۱۳۰۹g.a()) {
                item = this.f۱۳۰۹g.a() - 1;
            }
            int pageLimit = this.y;
            int i2 = this.f۱۳۱۰h;
            if (item > i2 + pageLimit || item < i2 - pageLimit) {
                for (int i3 = 0; i3 < this.f۱۳۰۶d.size(); i3++) {
                    this.f۱۳۰۶d.get(i3).f۱۳۱۶c = true;
                }
            }
            if (this.f۱۳۱۰h == item) {
                dispatchSelected = false;
            }
            if (this.R) {
                this.f۱۳۱۰h = item;
                if (dispatchSelected) {
                    d(item);
                }
                requestLayout();
                return;
            }
            c(item);
            a(item, smoothScroll, velocity, dispatchSelected);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    private void a(int item, boolean smoothScroll, int velocity, boolean dispatchSelected) {
        f curInfo = b(item);
        int destX = 0;
        if (curInfo != null) {
            destX = (int) (((float) getClientWidth()) * Math.max(this.s, Math.min(curInfo.f۱۳۱۸e, this.t)));
        }
        if (smoothScroll) {
            a(destX, 0, velocity);
            if (dispatchSelected) {
                d(item);
                return;
            }
            return;
        }
        if (dispatchSelected) {
            d(item);
        }
        a(false);
        scrollTo(destX, 0);
        f(destX);
    }

    @Deprecated
    public void setOnPageChangeListener(j listener) {
        this.V = listener;
    }

    public void a(j listener) {
        if (this.U == null) {
            this.U = new ArrayList();
        }
        this.U.add(listener);
    }

    public void b(j listener) {
        List<j> list = this.U;
        if (list != null) {
            list.remove(listener);
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int childCount, int i2) {
        return ((g) this.e0.get(this.d0 == 2 ? (childCount - 1) - i2 : i2).getLayoutParams()).f۱۳۲۴f;
    }

    public int getOffscreenPageLimit() {
        return this.y;
    }

    public void setOffscreenPageLimit(int limit) {
        if (limit < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + limit + " too small; defaulting to " + 1);
            limit = 1;
        }
        if (limit != this.y) {
            this.y = limit;
            e();
        }
    }

    public void setPageMargin(int marginPixels) {
        int oldMargin = this.o;
        this.o = marginPixels;
        int width = getWidth();
        a(width, width, marginPixels, oldMargin);
        requestLayout();
    }

    public int getPageMargin() {
        return this.o;
    }

    public void setPageMarginDrawable(Drawable d2) {
        this.p = d2;
        if (d2 != null) {
            refreshDrawableState();
        }
        setWillNotDraw(d2 == null);
        invalidate();
    }

    public void setPageMarginDrawable(int resId) {
        setPageMarginDrawable(android.support.v4.content.a.c(getContext(), resId));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || who == this.p;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable d2 = this.p;
        if (d2 != null && d2.isStateful()) {
            d2.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    public float a(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: package-private */
    public void a(int x2, int y2, int velocity) {
        int sx;
        int duration;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.l;
        if (scroller != null && !scroller.isFinished()) {
            sx = this.m ? this.l.getCurrX() : this.l.getStartX();
            this.l.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            sx = getScrollX();
        }
        int sy = getScrollY();
        int dx = x2 - sx;
        int dy = y2 - sy;
        if (dx == 0 && dy == 0) {
            a(false);
            e();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int width = getClientWidth();
        int halfWidth = width / 2;
        float distance = ((float) halfWidth) + (((float) halfWidth) * a(Math.min(1.0f, (((float) Math.abs(dx)) * 1.0f) / ((float) width))));
        int velocity2 = Math.abs(velocity);
        if (velocity2 > 0) {
            duration = Math.round(Math.abs(distance / ((float) velocity2)) * 1000.0f) * 4;
        } else {
            duration = (int) ((1.0f + (((float) Math.abs(dx)) / (((float) this.o) + (((float) width) * this.f۱۳۰۹g.b(this.f۱۳۱۰h))))) * 100.0f);
        }
        int duration2 = Math.min(duration, 600);
        this.m = false;
        this.l.startScroll(sx, sy, dx, dy, duration2);
        u.B(this);
    }

    /* access modifiers changed from: package-private */
    public f a(int position, int index) {
        f ii = new f();
        ii.f۱۳۱۵b = position;
        ii.f۱۳۱۴a = this.f۱۳۰۹g.a(this, position);
        ii.f۱۳۱۷d = this.f۱۳۰۹g.b(position);
        if (index < 0 || index >= this.f۱۳۰۶d.size()) {
            this.f۱۳۰۶d.add(ii);
        } else {
            this.f۱۳۰۶d.add(index, ii);
        }
        return ii;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int adapterCount = this.f۱۳۰۹g.a();
        this.f۱۳۰۵c = adapterCount;
        boolean needPopulate = this.f۱۳۰۶d.size() < (this.y * 2) + 1 && this.f۱۳۰۶d.size() < adapterCount;
        int newCurrItem = this.f۱۳۱۰h;
        boolean isUpdating = false;
        int i2 = 0;
        while (i2 < this.f۱۳۰۶d.size()) {
            f ii = this.f۱۳۰۶d.get(i2);
            int newPos = this.f۱۳۰۹g.a(ii.f۱۳۱۴a);
            if (newPos != -1) {
                if (newPos == -2) {
                    this.f۱۳۰۶d.remove(i2);
                    i2--;
                    if (!isUpdating) {
                        this.f۱۳۰۹g.b(this);
                        isUpdating = true;
                    }
                    this.f۱۳۰۹g.a(this, ii.f۱۳۱۵b, ii.f۱۳۱۴a);
                    needPopulate = true;
                    int i3 = this.f۱۳۱۰h;
                    if (i3 == ii.f۱۳۱۵b) {
                        newCurrItem = Math.max(0, Math.min(i3, adapterCount - 1));
                        needPopulate = true;
                    }
                } else {
                    int i4 = ii.f۱۳۱۵b;
                    if (i4 != newPos) {
                        if (i4 == this.f۱۳۱۰h) {
                            newCurrItem = newPos;
                        }
                        ii.f۱۳۱۵b = newPos;
                        needPopulate = true;
                    }
                }
            }
            i2++;
        }
        if (isUpdating) {
            this.f۱۳۰۹g.a((ViewGroup) this);
        }
        Collections.sort(this.f۱۳۰۶d, i0);
        if (needPopulate) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                g lp = (g) getChildAt(i5).getLayoutParams();
                if (!lp.f۱۳۱۹a) {
                    lp.f۱۳۲۱c = 0.0f;
                }
            }
            a(newCurrItem, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        c(this.f۱۳۱۰h);
    }

    /* access modifiers changed from: package-private */
    public void c(int newCurrentItem) {
        f oldCurInfo;
        String resName;
        f ii;
        float leftWidthNeeded;
        float rightWidthNeeded;
        int startPos;
        int pageLimit;
        int i2 = this.f۱۳۱۰h;
        if (i2 != newCurrentItem) {
            f oldCurInfo2 = b(i2);
            this.f۱۳۱۰h = newCurrentItem;
            oldCurInfo = oldCurInfo2;
        } else {
            oldCurInfo = null;
        }
        if (this.f۱۳۰۹g == null) {
            j();
        } else if (this.x) {
            j();
        } else if (getWindowToken() != null) {
            this.f۱۳۰۹g.b(this);
            int pageLimit2 = this.y;
            int startPos2 = Math.max(0, this.f۱۳۱۰h - pageLimit2);
            int N2 = this.f۱۳۰۹g.a();
            int endPos = Math.min(N2 - 1, this.f۱۳۱۰h + pageLimit2);
            if (N2 == this.f۱۳۰۵c) {
                f curItem = null;
                int curIndex = 0;
                while (true) {
                    if (curIndex >= this.f۱۳۰۶d.size()) {
                        break;
                    }
                    f ii2 = this.f۱۳۰۶d.get(curIndex);
                    int i3 = ii2.f۱۳۱۵b;
                    int i4 = this.f۱۳۱۰h;
                    if (i3 < i4) {
                        curIndex++;
                    } else if (i3 == i4) {
                        curItem = ii2;
                    }
                }
                if (curItem == null && N2 > 0) {
                    curItem = a(this.f۱۳۱۰h, curIndex);
                }
                if (curItem != null) {
                    float extraWidthLeft = 0.0f;
                    int itemIndex = curIndex - 1;
                    f ii3 = itemIndex >= 0 ? this.f۱۳۰۶d.get(itemIndex) : null;
                    int clientWidth = getClientWidth();
                    if (clientWidth <= 0) {
                        leftWidthNeeded = 0.0f;
                    } else {
                        leftWidthNeeded = (((float) getPaddingLeft()) / ((float) clientWidth)) + (2.0f - curItem.f۱۳۱۷d);
                    }
                    for (int pos = this.f۱۳۱۰h - 1; pos >= 0; pos--) {
                        if (extraWidthLeft < leftWidthNeeded || pos >= startPos2) {
                            if (ii3 == null || pos != ii3.f۱۳۱۵b) {
                                extraWidthLeft += a(pos, itemIndex + 1).f۱۳۱۷d;
                                curIndex++;
                                ii3 = itemIndex >= 0 ? this.f۱۳۰۶d.get(itemIndex) : null;
                            } else {
                                extraWidthLeft += ii3.f۱۳۱۷d;
                                itemIndex--;
                                ii3 = itemIndex >= 0 ? this.f۱۳۰۶d.get(itemIndex) : null;
                            }
                        } else if (ii3 == null) {
                            break;
                        } else if (pos == ii3.f۱۳۱۵b && !ii3.f۱۳۱۶c) {
                            this.f۱۳۰۶d.remove(itemIndex);
                            this.f۱۳۰۹g.a(this, pos, ii3.f۱۳۱۴a);
                            itemIndex--;
                            curIndex--;
                            ii3 = itemIndex >= 0 ? this.f۱۳۰۶d.get(itemIndex) : null;
                        }
                    }
                    float extraWidthRight = curItem.f۱۳۱۷d;
                    int itemIndex2 = curIndex + 1;
                    if (extraWidthRight < 2.0f) {
                        f ii4 = itemIndex2 < this.f۱۳۰۶d.size() ? this.f۱۳۰۶d.get(itemIndex2) : null;
                        if (clientWidth <= 0) {
                            rightWidthNeeded = 0.0f;
                        } else {
                            rightWidthNeeded = (((float) getPaddingRight()) / ((float) clientWidth)) + 2.0f;
                        }
                        int pos2 = this.f۱۳۱۰h + 1;
                        while (true) {
                            if (pos2 >= N2) {
                                break;
                            }
                            if (extraWidthRight < rightWidthNeeded || pos2 <= endPos) {
                                pageLimit = pageLimit2;
                                startPos = startPos2;
                                if (ii4 == null || pos2 != ii4.f۱۳۱۵b) {
                                    f ii5 = a(pos2, itemIndex2);
                                    itemIndex2++;
                                    extraWidthRight += ii5.f۱۳۱۷d;
                                    ii4 = itemIndex2 < this.f۱۳۰۶d.size() ? this.f۱۳۰۶d.get(itemIndex2) : null;
                                } else {
                                    extraWidthRight += ii4.f۱۳۱۷d;
                                    itemIndex2++;
                                    ii4 = itemIndex2 < this.f۱۳۰۶d.size() ? this.f۱۳۰۶d.get(itemIndex2) : null;
                                }
                            } else if (ii4 == null) {
                                break;
                            } else {
                                pageLimit = pageLimit2;
                                if (pos2 != ii4.f۱۳۱۵b || ii4.f۱۳۱۶c) {
                                    startPos = startPos2;
                                } else {
                                    this.f۱۳۰۶d.remove(itemIndex2);
                                    startPos = startPos2;
                                    this.f۱۳۰۹g.a(this, pos2, ii4.f۱۳۱۴a);
                                    ii4 = itemIndex2 < this.f۱۳۰۶d.size() ? this.f۱۳۰۶d.get(itemIndex2) : null;
                                }
                            }
                            pos2++;
                            pageLimit2 = pageLimit;
                            startPos2 = startPos;
                        }
                    }
                    a(curItem, curIndex, oldCurInfo);
                    this.f۱۳۰۹g.b(this, this.f۱۳۱۰h, curItem.f۱۳۱۴a);
                }
                this.f۱۳۰۹g.a((ViewGroup) this);
                int childCount = getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View child = getChildAt(i5);
                    g lp = (g) child.getLayoutParams();
                    lp.f۱۳۲۴f = i5;
                    if (!lp.f۱۳۱۹a) {
                        if (lp.f۱۳۲۱c == 0.0f && (ii = b(child)) != null) {
                            lp.f۱۳۲۱c = ii.f۱۳۱۷d;
                            lp.f۱۳۲۳e = ii.f۱۳۱۵b;
                        }
                    }
                }
                j();
                if (hasFocus()) {
                    View currentFocused = findFocus();
                    f ii6 = currentFocused != null ? a(currentFocused) : null;
                    if (ii6 == null || ii6.f۱۳۱۵b != this.f۱۳۱۰h) {
                        for (int i6 = 0; i6 < getChildCount(); i6++) {
                            View child2 = getChildAt(i6);
                            f ii7 = b(child2);
                            if (ii7 != null && ii7.f۱۳۱۵b == this.f۱۳۱۰h && child2.requestFocus(2)) {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                resName = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException e2) {
                resName = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f۱۳۰۵c + ", found: " + N2 + " Pager id: " + resName + " Pager class: " + getClass() + " Problematic adapter: " + this.f۱۳۰۹g.getClass());
        }
    }

    private void j() {
        if (this.d0 != 0) {
            ArrayList<View> arrayList = this.e0;
            if (arrayList == null) {
                this.e0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.e0.add(getChildAt(i2));
            }
            Collections.sort(this.e0, k0);
        }
    }

    private void a(f curItem, int curIndex, f oldCurInfo) {
        int i2;
        int i3;
        f ii;
        f ii2;
        int N2 = this.f۱۳۰۹g.a();
        int width = getClientWidth();
        float marginOffset = width > 0 ? ((float) this.o) / ((float) width) : 0.0f;
        if (oldCurInfo != null) {
            int oldCurPosition = oldCurInfo.f۱۳۱۵b;
            int itemIndex = curItem.f۱۳۱۵b;
            if (oldCurPosition < itemIndex) {
                int itemIndex2 = 0;
                float offset = oldCurInfo.f۱۳۱۸e + oldCurInfo.f۱۳۱۷d + marginOffset;
                int pos = oldCurPosition + 1;
                while (pos <= curItem.f۱۳۱۵b && itemIndex2 < this.f۱۳۰۶d.size()) {
                    f ii3 = this.f۱۳۰۶d.get(itemIndex2);
                    while (true) {
                        ii2 = ii3;
                        if (pos > ii2.f۱۳۱۵b && itemIndex2 < this.f۱۳۰۶d.size() - 1) {
                            itemIndex2++;
                            ii3 = this.f۱۳۰۶d.get(itemIndex2);
                        }
                    }
                    while (pos < ii2.f۱۳۱۵b) {
                        offset += this.f۱۳۰۹g.b(pos) + marginOffset;
                        pos++;
                    }
                    ii2.f۱۳۱۸e = offset;
                    offset += ii2.f۱۳۱۷d + marginOffset;
                    pos++;
                }
            } else if (oldCurPosition > itemIndex) {
                int itemIndex3 = this.f۱۳۰۶d.size() - 1;
                float offset2 = oldCurInfo.f۱۳۱۸e;
                int pos2 = oldCurPosition - 1;
                while (pos2 >= curItem.f۱۳۱۵b && itemIndex3 >= 0) {
                    f ii4 = this.f۱۳۰۶d.get(itemIndex3);
                    while (true) {
                        ii = ii4;
                        if (pos2 < ii.f۱۳۱۵b && itemIndex3 > 0) {
                            itemIndex3--;
                            ii4 = this.f۱۳۰۶d.get(itemIndex3);
                        }
                    }
                    while (pos2 > ii.f۱۳۱۵b) {
                        offset2 -= this.f۱۳۰۹g.b(pos2) + marginOffset;
                        pos2--;
                    }
                    offset2 -= ii.f۱۳۱۷d + marginOffset;
                    ii.f۱۳۱۸e = offset2;
                    pos2--;
                }
            }
        }
        int itemCount = this.f۱۳۰۶d.size();
        float offset3 = curItem.f۱۳۱۸e;
        int i4 = curItem.f۱۳۱۵b;
        int pos3 = i4 - 1;
        this.s = i4 == 0 ? curItem.f۱۳۱۸e : -3.4028235E38f;
        this.t = curItem.f۱۳۱۵b == N2 + -1 ? (curItem.f۱۳۱۸e + curItem.f۱۳۱۷d) - 1.0f : Float.MAX_VALUE;
        int i5 = curIndex - 1;
        while (i5 >= 0) {
            f ii5 = this.f۱۳۰۶d.get(i5);
            while (true) {
                i3 = ii5.f۱۳۱۵b;
                if (pos3 <= i3) {
                    break;
                }
                offset3 -= this.f۱۳۰۹g.b(pos3) + marginOffset;
                pos3--;
            }
            offset3 -= ii5.f۱۳۱۷d + marginOffset;
            ii5.f۱۳۱۸e = offset3;
            if (i3 == 0) {
                this.s = offset3;
            }
            i5--;
            pos3--;
        }
        float offset4 = curItem.f۱۳۱۸e + curItem.f۱۳۱۷d + marginOffset;
        int pos4 = curItem.f۱۳۱۵b + 1;
        int i6 = curIndex + 1;
        while (i6 < itemCount) {
            f ii6 = this.f۱۳۰۶d.get(i6);
            while (true) {
                i2 = ii6.f۱۳۱۵b;
                if (pos4 >= i2) {
                    break;
                }
                offset4 += this.f۱۳۰۹g.b(pos4) + marginOffset;
                pos4++;
            }
            if (i2 == N2 - 1) {
                this.t = (ii6.f۱۳۱۷d + offset4) - 1.0f;
            }
            ii6.f۱۳۱۸e = offset4;
            offset4 += ii6.f۱۳۱۷d + marginOffset;
            i6++;
            pos4++;
        }
    }

    public static class m extends a {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        int f۱۳۲۷e;

        /* renamed from: f  reason: collision with root package name */
        Parcelable f۱۳۲۸f;

        /* renamed from: g  reason: collision with root package name */
        ClassLoader f۱۳۲۹g;

        public m(Parcelable superState) {
            super(superState);
        }

        @Override // android.support.v4.view.a
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f۱۳۲۷e);
            out.writeParcelable(this.f۱۳۲۸f, flags);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f۱۳۲۷e + "}";
        }

        static class a implements Parcelable.ClassLoaderCreator<m> {
            a() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public m createFromParcel(Parcel in, ClassLoader loader) {
                return new m(in, loader);
            }

            @Override // android.os.Parcelable.Creator
            public m createFromParcel(Parcel in) {
                return new m(in, null);
            }

            @Override // android.os.Parcelable.Creator
            public m[] newArray(int size) {
                return new m[size];
            }
        }

        m(Parcel in, ClassLoader loader) {
            super(in, loader);
            loader = loader == null ? getClass().getClassLoader() : loader;
            this.f۱۳۲۷e = in.readInt();
            this.f۱۳۲۸f = in.readParcelable(loader);
            this.f۱۳۲۹g = loader;
        }
    }

    public Parcelable onSaveInstanceState() {
        m ss = new m(super.onSaveInstanceState());
        ss.f۱۳۲۷e = this.f۱۳۱۰h;
        q qVar = this.f۱۳۰۹g;
        if (qVar != null) {
            ss.f۱۳۲۸f = qVar.c();
        }
        return ss;
    }

    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof m)) {
            super.onRestoreInstanceState(state);
            return;
        }
        m ss = (m) state;
        super.onRestoreInstanceState(ss.a());
        q qVar = this.f۱۳۰۹g;
        if (qVar != null) {
            qVar.a(ss.f۱۳۲۸f, ss.f۱۳۲۹g);
            a(ss.f۱۳۲۷e, false, true);
            return;
        }
        this.i = ss.f۱۳۲۷e;
        this.j = ss.f۱۳۲۸f;
        this.k = ss.f۱۳۲۹g;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (!checkLayoutParams(params)) {
            params = generateLayoutParams(params);
        }
        g lp = (g) params;
        lp.f۱۳۱۹a |= c(child);
        if (!this.v) {
            super.addView(child, index, params);
        } else if (lp == null || !lp.f۱۳۱۹a) {
            lp.f۱۳۲۲d = true;
            addViewInLayout(child, index, params);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    private static boolean c(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    public void removeView(View view) {
        if (this.v) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: package-private */
    public f b(View child) {
        for (int i2 = 0; i2 < this.f۱۳۰۶d.size(); i2++) {
            f ii = this.f۱۳۰۶d.get(i2);
            if (this.f۱۳۰۹g.a(child, ii.f۱۳۱۴a)) {
                return ii;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public f a(View child) {
        while (true) {
            ViewParent parent = child.getParent();
            if (parent == this) {
                return b(child);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            child = (View) parent;
        }
    }

    /* access modifiers changed from: package-private */
    public f b(int position) {
        for (int i2 = 0; i2 < this.f۱۳۰۶d.size(); i2++) {
            f ii = this.f۱۳۰۶d.get(i2);
            if (ii.f۱۳۱۵b == position) {
                return ii;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        g lp;
        int measuredWidth;
        int heightMode;
        int widthSize;
        int heightMode2;
        int heightSize;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, widthMeasureSpec), ViewGroup.getDefaultSize(0, heightMeasureSpec));
        int measuredWidth2 = getMeasuredWidth();
        int maxGutterSize = measuredWidth2 / 10;
        this.C = Math.min(maxGutterSize, this.B);
        int childWidthSize = (measuredWidth2 - getPaddingLeft()) - getPaddingRight();
        int childHeightSize = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int size = getChildCount();
        int i2 = 0;
        while (i2 < size) {
            View child = getChildAt(i2);
            if (child.getVisibility() != 8) {
                g lp2 = (g) child.getLayoutParams();
                if (lp2 == null || !lp2.f۱۳۱۹a) {
                    measuredWidth = measuredWidth2;
                    heightMode = maxGutterSize;
                } else {
                    int i3 = lp2.f۱۳۲۰b;
                    int hgrav = i3 & 7;
                    int vgrav = i3 & 112;
                    int widthMode = Integer.MIN_VALUE;
                    int heightMode3 = Integer.MIN_VALUE;
                    boolean consumeVertical = vgrav == 48 || vgrav == 80;
                    boolean consumeHorizontal = hgrav == 3 || hgrav == 5;
                    if (consumeVertical) {
                        widthMode = 1073741824;
                    } else if (consumeHorizontal) {
                        heightMode3 = 1073741824;
                    }
                    int i4 = ((ViewGroup.LayoutParams) lp2).width;
                    measuredWidth = measuredWidth2;
                    if (i4 != -2) {
                        widthMode = 1073741824;
                        if (i4 != -1) {
                            widthSize = ((ViewGroup.LayoutParams) lp2).width;
                        } else {
                            widthSize = childWidthSize;
                        }
                    } else {
                        widthSize = childWidthSize;
                    }
                    int i5 = ((ViewGroup.LayoutParams) lp2).height;
                    if (i5 == -2) {
                        heightMode2 = heightMode3;
                        heightSize = childHeightSize;
                    } else if (i5 != -1) {
                        heightSize = ((ViewGroup.LayoutParams) lp2).height;
                        heightMode2 = 1073741824;
                    } else {
                        heightMode2 = 1073741824;
                        heightSize = childHeightSize;
                    }
                    heightMode = maxGutterSize;
                    child.measure(View.MeasureSpec.makeMeasureSpec(widthSize, widthMode), View.MeasureSpec.makeMeasureSpec(heightSize, heightMode2));
                    if (consumeVertical) {
                        childHeightSize -= child.getMeasuredHeight();
                    } else if (consumeHorizontal) {
                        childWidthSize -= child.getMeasuredWidth();
                    }
                }
            } else {
                measuredWidth = measuredWidth2;
                heightMode = maxGutterSize;
            }
            i2++;
            maxGutterSize = heightMode;
            measuredWidth2 = measuredWidth;
        }
        View.MeasureSpec.makeMeasureSpec(childWidthSize, 1073741824);
        this.u = View.MeasureSpec.makeMeasureSpec(childHeightSize, 1073741824);
        this.v = true;
        e();
        this.v = false;
        int size2 = getChildCount();
        for (int i6 = 0; i6 < size2; i6++) {
            View child2 = getChildAt(i6);
            if (child2.getVisibility() != 8 && ((lp = (g) child2.getLayoutParams()) == null || !lp.f۱۳۱۹a)) {
                child2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) childWidthSize) * lp.f۱۳۲۱c), 1073741824), this.u);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        if (w2 != oldw) {
            int i2 = this.o;
            a(w2, oldw, i2, i2);
        }
    }

    private void a(int width, int oldWidth, int margin, int oldMargin) {
        if (oldWidth <= 0 || this.f۱۳۰۶d.isEmpty()) {
            f ii = b(this.f۱۳۱۰h);
            int scrollPos = (int) (((float) ((width - getPaddingLeft()) - getPaddingRight())) * (ii != null ? Math.min(ii.f۱۳۱۸e, this.t) : 0.0f));
            if (scrollPos != getScrollX()) {
                a(false);
                scrollTo(scrollPos, getScrollY());
            }
        } else if (!this.l.isFinished()) {
            this.l.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) (((float) (((width - getPaddingLeft()) - getPaddingRight()) + margin)) * (((float) getScrollX()) / ((float) (((oldWidth - getPaddingLeft()) - getPaddingRight()) + oldMargin)))), getScrollY());
        }
    }

    /* JADX INFO: Multiple debug info for r11v10 int: [D('lp' android.support.v4.view.ViewPager$g), D('hgrav' int)] */
    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        int i2;
        boolean z2;
        int paddingLeft;
        int width;
        int count;
        int childLeft;
        int childTop;
        int count2 = getChildCount();
        int width2 = r2 - l2;
        int height = b2 - t2;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int decorCount = 0;
        int i3 = 0;
        while (true) {
            i2 = 8;
            if (i3 >= count2) {
                break;
            }
            View child = getChildAt(i3);
            if (child.getVisibility() != 8) {
                g lp = (g) child.getLayoutParams();
                if (lp.f۱۳۱۹a) {
                    int i4 = lp.f۱۳۲۰b;
                    int hgrav = i4 & 7;
                    int vgrav = i4 & 112;
                    if (hgrav == 1) {
                        childLeft = Math.max((width2 - child.getMeasuredWidth()) / 2, paddingLeft2);
                    } else if (hgrav == 3) {
                        childLeft = paddingLeft2;
                        paddingLeft2 += child.getMeasuredWidth();
                    } else if (hgrav != 5) {
                        childLeft = paddingLeft2;
                    } else {
                        childLeft = (width2 - paddingRight) - child.getMeasuredWidth();
                        paddingRight += child.getMeasuredWidth();
                    }
                    if (vgrav == 16) {
                        childTop = Math.max((height - child.getMeasuredHeight()) / 2, paddingTop);
                    } else if (vgrav == 48) {
                        childTop = paddingTop;
                        paddingTop += child.getMeasuredHeight();
                    } else if (vgrav != 80) {
                        childTop = paddingTop;
                    } else {
                        childTop = (height - paddingBottom) - child.getMeasuredHeight();
                        paddingBottom += child.getMeasuredHeight();
                    }
                    int childLeft2 = childLeft + scrollX;
                    child.layout(childLeft2, childTop, child.getMeasuredWidth() + childLeft2, childTop + child.getMeasuredHeight());
                    decorCount++;
                    paddingLeft2 = paddingLeft2;
                    paddingTop = paddingTop;
                }
            }
            i3++;
        }
        int childWidth = (width2 - paddingLeft2) - paddingRight;
        int i5 = 0;
        while (i5 < count2) {
            View child2 = getChildAt(i5);
            if (child2.getVisibility() != i2) {
                g lp2 = (g) child2.getLayoutParams();
                if (!lp2.f۱۳۱۹a) {
                    f ii = b(child2);
                    if (ii != null) {
                        count = count2;
                        int childLeft3 = paddingLeft2 + ((int) (((float) childWidth) * ii.f۱۳۱۸e));
                        if (lp2.f۱۳۲۲d) {
                            lp2.f۱۳۲۲d = false;
                            width = width2;
                            paddingLeft = paddingLeft2;
                            child2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) childWidth) * lp2.f۱۳۲۱c), 1073741824), View.MeasureSpec.makeMeasureSpec((height - paddingTop) - paddingBottom, 1073741824));
                        } else {
                            width = width2;
                            paddingLeft = paddingLeft2;
                        }
                        child2.layout(childLeft3, paddingTop, child2.getMeasuredWidth() + childLeft3, child2.getMeasuredHeight() + paddingTop);
                    } else {
                        width = width2;
                        paddingLeft = paddingLeft2;
                        count = count2;
                    }
                } else {
                    count = count2;
                    width = width2;
                    paddingLeft = paddingLeft2;
                }
            } else {
                count = count2;
                width = width2;
                paddingLeft = paddingLeft2;
            }
            i5++;
            count2 = count;
            width2 = width;
            paddingLeft2 = paddingLeft;
            i2 = 8;
        }
        this.q = paddingTop;
        this.r = height - paddingBottom;
        this.T = decorCount;
        if (this.R) {
            z2 = false;
            a(this.f۱۳۱۰h, false, 0, false);
        } else {
            z2 = false;
        }
        this.R = z2;
    }

    public void computeScroll() {
        this.m = true;
        if (this.l.isFinished() || !this.l.computeScrollOffset()) {
            a(true);
            return;
        }
        int oldX = getScrollX();
        int oldY = getScrollY();
        int x2 = this.l.getCurrX();
        int y2 = this.l.getCurrY();
        if (!(oldX == x2 && oldY == y2)) {
            scrollTo(x2, y2);
            if (!f(x2)) {
                this.l.abortAnimation();
                scrollTo(0, y2);
            }
        }
        u.B(this);
    }

    private boolean f(int xpos) {
        if (this.f۱۳۰۶d.size() != 0) {
            f ii = g();
            int width = getClientWidth();
            int i2 = this.o;
            int widthWithMargin = width + i2;
            int currentPage = ii.f۱۳۱۵b;
            float pageOffset = ((((float) xpos) / ((float) width)) - ii.f۱۳۱۸e) / (ii.f۱۳۱۷d + (((float) i2) / ((float) width)));
            this.S = false;
            a(currentPage, pageOffset, (int) (((float) widthWithMargin) * pageOffset));
            if (this.S) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.R) {
            return false;
        } else {
            this.S = false;
            a(0, 0.0f, 0);
            if (this.S) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* access modifiers changed from: protected */
    public void a(int position, float offset, int offsetPixels) {
        int childLeft;
        if (this.T > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View child = getChildAt(i2);
                g lp = (g) child.getLayoutParams();
                if (lp.f۱۳۱۹a) {
                    int hgrav = lp.f۱۳۲۰b & 7;
                    if (hgrav == 1) {
                        childLeft = Math.max((width - child.getMeasuredWidth()) / 2, paddingLeft);
                    } else if (hgrav == 3) {
                        childLeft = paddingLeft;
                        paddingLeft += child.getWidth();
                    } else if (hgrav != 5) {
                        childLeft = paddingLeft;
                    } else {
                        childLeft = (width - paddingRight) - child.getMeasuredWidth();
                        paddingRight += child.getMeasuredWidth();
                    }
                    int childOffset = (childLeft + scrollX) - child.getLeft();
                    if (childOffset != 0) {
                        child.offsetLeftAndRight(childOffset);
                    }
                }
            }
        }
        b(position, offset, offsetPixels);
        if (this.b0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View child2 = getChildAt(i3);
                if (!((g) child2.getLayoutParams()).f۱۳۱۹a) {
                    this.b0.a(child2, ((float) (child2.getLeft() - scrollX2)) / ((float) getClientWidth()));
                }
            }
        }
        this.S = true;
    }

    private void b(int position, float offset, int offsetPixels) {
        j jVar = this.V;
        if (jVar != null) {
            jVar.a(position, offset, offsetPixels);
        }
        List<j> list = this.U;
        if (list != null) {
            int z2 = list.size();
            for (int i2 = 0; i2 < z2; i2++) {
                j listener = this.U.get(i2);
                if (listener != null) {
                    listener.a(position, offset, offsetPixels);
                }
            }
        }
        j jVar2 = this.W;
        if (jVar2 != null) {
            jVar2.a(position, offset, offsetPixels);
        }
    }

    private void d(int position) {
        j jVar = this.V;
        if (jVar != null) {
            jVar.b(position);
        }
        List<j> list = this.U;
        if (list != null) {
            int z2 = list.size();
            for (int i2 = 0; i2 < z2; i2++) {
                j listener = this.U.get(i2);
                if (listener != null) {
                    listener.b(position);
                }
            }
        }
        j jVar2 = this.W;
        if (jVar2 != null) {
            jVar2.b(position);
        }
    }

    private void e(int state) {
        j jVar = this.V;
        if (jVar != null) {
            jVar.a(state);
        }
        List<j> list = this.U;
        if (list != null) {
            int z2 = list.size();
            for (int i2 = 0; i2 < z2; i2++) {
                j listener = this.U.get(i2);
                if (listener != null) {
                    listener.a(state);
                }
            }
        }
        j jVar2 = this.W;
        if (jVar2 != null) {
            jVar2.a(state);
        }
    }

    private void a(boolean postEvents) {
        boolean needPopulate = this.g0 == 2;
        if (needPopulate) {
            setScrollingCacheEnabled(false);
            if (true ^ this.l.isFinished()) {
                this.l.abortAnimation();
                int oldX = getScrollX();
                int oldY = getScrollY();
                int x2 = this.l.getCurrX();
                int y2 = this.l.getCurrY();
                if (!(oldX == x2 && oldY == y2)) {
                    scrollTo(x2, y2);
                    if (x2 != oldX) {
                        f(x2);
                    }
                }
            }
        }
        this.x = false;
        for (int i2 = 0; i2 < this.f۱۳۰۶d.size(); i2++) {
            f ii = this.f۱۳۰۶d.get(i2);
            if (ii.f۱۳۱۶c) {
                needPopulate = true;
                ii.f۱۳۱۶c = false;
            }
        }
        if (!needPopulate) {
            return;
        }
        if (postEvents) {
            u.a(this, this.f0);
        } else {
            this.f0.run();
        }
    }

    private boolean a(float x2, float dx) {
        return (x2 < ((float) this.C) && dx > 0.0f) || (x2 > ((float) (getWidth() - this.C)) && dx < 0.0f);
    }

    private void b(boolean enable) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(enable ? this.c0 : 0, null);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {
        float y2;
        int action = ev.getAction() & 255;
        if (action == 3 || action == 1) {
            i();
            return false;
        }
        if (action != 0) {
            if (this.z) {
                return true;
            }
            if (this.A) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = ev.getX();
            this.G = x2;
            this.E = x2;
            float y3 = ev.getY();
            this.H = y3;
            this.F = y3;
            this.I = ev.getPointerId(0);
            this.A = false;
            this.m = true;
            this.l.computeScrollOffset();
            if (this.g0 != 2 || Math.abs(this.l.getFinalX() - this.l.getCurrX()) <= this.N) {
                a(false);
                this.z = false;
            } else {
                this.l.abortAnimation();
                this.x = false;
                e();
                this.z = true;
                c(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int activePointerId = this.I;
            if (activePointerId != -1) {
                int pointerIndex = ev.findPointerIndex(activePointerId);
                float x3 = ev.getX(pointerIndex);
                float dx = x3 - this.E;
                float xDiff = Math.abs(dx);
                float y4 = ev.getY(pointerIndex);
                float yDiff = Math.abs(y4 - this.H);
                if (dx == 0.0f || a(this.E, dx)) {
                    y2 = y4;
                } else {
                    y2 = y4;
                    if (a(this, false, (int) dx, (int) x3, (int) y4)) {
                        this.E = x3;
                        this.F = y2;
                        this.A = true;
                        return false;
                    }
                }
                if (xDiff > ((float) this.D) && 0.5f * xDiff > yDiff) {
                    this.z = true;
                    c(true);
                    setScrollState(1);
                    this.E = dx > 0.0f ? this.G + ((float) this.D) : this.G - ((float) this.D);
                    this.F = y2;
                    setScrollingCacheEnabled(true);
                } else if (yDiff > ((float) this.D)) {
                    this.A = true;
                }
                if (this.z && b(x3)) {
                    u.B(this);
                }
            }
        } else if (action == 6) {
            a(ev);
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(ev);
        return this.z;
    }

    public boolean onTouchEvent(MotionEvent ev) {
        q qVar;
        if (this.O) {
            return true;
        }
        if ((ev.getAction() == 0 && ev.getEdgeFlags() != 0) || (qVar = this.f۱۳۰۹g) == null || qVar.a() == 0) {
            return false;
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(ev);
        boolean needsInvalidate = false;
        int action = ev.getAction() & 255;
        if (action == 0) {
            this.l.abortAnimation();
            this.x = false;
            e();
            float x2 = ev.getX();
            this.G = x2;
            this.E = x2;
            float y2 = ev.getY();
            this.H = y2;
            this.F = y2;
            this.I = ev.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.z) {
                    int pointerIndex = ev.findPointerIndex(this.I);
                    if (pointerIndex == -1) {
                        needsInvalidate = i();
                    } else {
                        float x3 = ev.getX(pointerIndex);
                        float xDiff = Math.abs(x3 - this.E);
                        float y3 = ev.getY(pointerIndex);
                        float yDiff = Math.abs(y3 - this.F);
                        if (xDiff > ((float) this.D) && xDiff > yDiff) {
                            this.z = true;
                            c(true);
                            float f2 = this.G;
                            this.E = x3 - f2 > 0.0f ? f2 + ((float) this.D) : f2 - ((float) this.D);
                            this.F = y3;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.z) {
                    needsInvalidate = false | b(ev.getX(ev.findPointerIndex(this.I)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int index = ev.getActionIndex();
                    this.E = ev.getX(index);
                    this.I = ev.getPointerId(index);
                } else if (action == 6) {
                    a(ev);
                    this.E = ev.getX(ev.findPointerIndex(this.I));
                }
            } else if (this.z) {
                a(this.f۱۳۱۰h, true, 0, false);
                needsInvalidate = i();
            }
        } else if (this.z) {
            VelocityTracker velocityTracker = this.J;
            velocityTracker.computeCurrentVelocity(1000, (float) this.L);
            int initialVelocity = (int) velocityTracker.getXVelocity(this.I);
            this.x = true;
            int width = getClientWidth();
            int scrollX = getScrollX();
            f ii = g();
            a(a(ii.f۱۳۱۵b, ((((float) scrollX) / ((float) width)) - ii.f۱۳۱۸e) / (ii.f۱۳۱۷d + (((float) this.o) / ((float) width))), initialVelocity, (int) (ev.getX(ev.findPointerIndex(this.I)) - this.G)), true, true, initialVelocity);
            needsInvalidate = i();
        }
        if (needsInvalidate) {
            u.B(this);
        }
        return true;
    }

    private boolean i() {
        this.I = -1;
        f();
        this.P.onRelease();
        this.Q.onRelease();
        return this.P.isFinished() || this.Q.isFinished();
    }

    private void c(boolean disallowIntercept) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(disallowIntercept);
        }
    }

    private boolean b(float x2) {
        boolean needsInvalidate = false;
        this.E = x2;
        float scrollX = ((float) getScrollX()) + (this.E - x2);
        int width = getClientWidth();
        float leftBound = ((float) width) * this.s;
        float rightBound = ((float) width) * this.t;
        boolean leftAbsolute = true;
        boolean rightAbsolute = true;
        f firstItem = this.f۱۳۰۶d.get(0);
        ArrayList<f> arrayList = this.f۱۳۰۶d;
        f lastItem = arrayList.get(arrayList.size() - 1);
        if (firstItem.f۱۳۱۵b != 0) {
            leftAbsolute = false;
            leftBound = firstItem.f۱۳۱۸e * ((float) width);
        }
        if (lastItem.f۱۳۱۵b != this.f۱۳۰۹g.a() - 1) {
            rightAbsolute = false;
            rightBound = lastItem.f۱۳۱۸e * ((float) width);
        }
        if (scrollX < leftBound) {
            if (leftAbsolute) {
                this.P.onPull(Math.abs(leftBound - scrollX) / ((float) width));
                needsInvalidate = true;
            }
            scrollX = leftBound;
        } else if (scrollX > rightBound) {
            if (rightAbsolute) {
                this.Q.onPull(Math.abs(scrollX - rightBound) / ((float) width));
                needsInvalidate = true;
            }
            scrollX = rightBound;
        }
        this.E += scrollX - ((float) ((int) scrollX));
        scrollTo((int) scrollX, getScrollY());
        f((int) scrollX);
        return needsInvalidate;
    }

    private f g() {
        int width = getClientWidth();
        float marginOffset = 0.0f;
        float scrollOffset = width > 0 ? ((float) getScrollX()) / ((float) width) : 0.0f;
        if (width > 0) {
            marginOffset = ((float) this.o) / ((float) width);
        }
        int lastPos = -1;
        float lastOffset = 0.0f;
        float lastWidth = 0.0f;
        boolean first = true;
        f lastItem = null;
        int i2 = 0;
        while (i2 < this.f۱۳۰۶d.size()) {
            f ii = this.f۱۳۰۶d.get(i2);
            if (!first && ii.f۱۳۱۵b != lastPos + 1) {
                ii = this.f۱۳۰۷e;
                ii.f۱۳۱۸e = lastOffset + lastWidth + marginOffset;
                ii.f۱۳۱۵b = lastPos + 1;
                ii.f۱۳۱۷d = this.f۱۳۰۹g.b(ii.f۱۳۱۵b);
                i2--;
            }
            float offset = ii.f۱۳۱۸e;
            float rightBound = ii.f۱۳۱۷d + offset + marginOffset;
            if (!first && scrollOffset < offset) {
                return lastItem;
            }
            if (scrollOffset < rightBound || i2 == this.f۱۳۰۶d.size() - 1) {
                return ii;
            }
            first = false;
            lastPos = ii.f۱۳۱۵b;
            lastOffset = offset;
            lastWidth = ii.f۱۳۱۷d;
            lastItem = ii;
            i2++;
        }
        return lastItem;
    }

    private int a(int currentPage, float pageOffset, int velocity, int deltaX) {
        int targetPage;
        if (Math.abs(deltaX) <= this.M || Math.abs(velocity) <= this.K) {
            targetPage = currentPage + ((int) (pageOffset + (currentPage >= this.f۱۳۱۰h ? 0.4f : 0.6f)));
        } else {
            targetPage = velocity > 0 ? currentPage : currentPage + 1;
        }
        if (this.f۱۳۰۶d.size() <= 0) {
            return targetPage;
        }
        ArrayList<f> arrayList = this.f۱۳۰۶d;
        return Math.max(this.f۱۳۰۶d.get(0).f۱۳۱۵b, Math.min(targetPage, arrayList.get(arrayList.size() - 1).f۱۳۱۵b));
    }

    public void draw(Canvas canvas) {
        q qVar;
        super.draw(canvas);
        boolean needsInvalidate = false;
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && (qVar = this.f۱۳۰۹g) != null && qVar.a() > 1)) {
            if (!this.P.isFinished()) {
                int restoreCount = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.s * ((float) width));
                this.P.setSize(height, width);
                needsInvalidate = false | this.P.draw(canvas);
                canvas.restoreToCount(restoreCount);
            }
            if (!this.Q.isFinished()) {
                int restoreCount2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.t + 1.0f)) * ((float) width2));
                this.Q.setSize(height2, width2);
                needsInvalidate |= this.Q.draw(canvas);
                canvas.restoreToCount(restoreCount2);
            }
        } else {
            this.P.finish();
            this.Q.finish();
        }
        if (needsInvalidate) {
            u.B(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float drawAt;
        float marginOffset;
        super.onDraw(canvas);
        if (this.o > 0 && this.p != null && this.f۱۳۰۶d.size() > 0 && this.f۱۳۰۹g != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float marginOffset2 = ((float) this.o) / ((float) width);
            int itemIndex = 0;
            f ii = this.f۱۳۰۶d.get(0);
            float offset = ii.f۱۳۱۸e;
            int itemCount = this.f۱۳۰۶d.size();
            int firstPos = ii.f۱۳۱۵b;
            int lastPos = this.f۱۳۰۶d.get(itemCount - 1).f۱۳۱۵b;
            int pos = firstPos;
            while (pos < lastPos) {
                while (pos > ii.f۱۳۱۵b && itemIndex < itemCount) {
                    itemIndex++;
                    ii = this.f۱۳۰۶d.get(itemIndex);
                }
                if (pos == ii.f۱۳۱۵b) {
                    float f2 = ii.f۱۳۱۸e;
                    float f3 = ii.f۱۳۱۷d;
                    drawAt = (f2 + f3) * ((float) width);
                    offset = f2 + f3 + marginOffset2;
                } else {
                    float widthFactor = this.f۱۳۰۹g.b(pos);
                    drawAt = ((float) width) * (offset + widthFactor);
                    offset += widthFactor + marginOffset2;
                }
                if (((float) this.o) + drawAt > ((float) scrollX)) {
                    marginOffset = marginOffset2;
                    this.p.setBounds(Math.round(drawAt), this.q, Math.round(((float) this.o) + drawAt), this.r);
                    this.p.draw(canvas);
                } else {
                    marginOffset = marginOffset2;
                }
                if (drawAt <= ((float) (scrollX + width))) {
                    pos++;
                    marginOffset2 = marginOffset;
                } else {
                    return;
                }
            }
        }
    }

    private void a(MotionEvent ev) {
        int pointerIndex = ev.getActionIndex();
        if (ev.getPointerId(pointerIndex) == this.I) {
            int newPointerIndex = pointerIndex == 0 ? 1 : 0;
            this.E = ev.getX(newPointerIndex);
            this.I = ev.getPointerId(newPointerIndex);
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void f() {
        this.z = false;
        this.A = false;
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J = null;
        }
    }

    private void setScrollingCacheEnabled(boolean enabled) {
        if (this.w != enabled) {
            this.w = enabled;
        }
    }

    public boolean canScrollHorizontally(int direction) {
        if (this.f۱۳۰۹g == null) {
            return false;
        }
        int width = getClientWidth();
        int scrollX = getScrollX();
        if (direction < 0) {
            if (scrollX > ((int) (((float) width) * this.s))) {
                return true;
            }
            return false;
        } else if (direction <= 0 || scrollX >= ((int) (((float) width) * this.t))) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(View v2, boolean checkV, int dx, int x2, int y2) {
        if (v2 instanceof ViewGroup) {
            ViewGroup group = (ViewGroup) v2;
            int scrollX = v2.getScrollX();
            int scrollY = v2.getScrollY();
            for (int i2 = group.getChildCount() - 1; i2 >= 0; i2--) {
                View child = group.getChildAt(i2);
                if (x2 + scrollX >= child.getLeft() && x2 + scrollX < child.getRight() && y2 + scrollY >= child.getTop() && y2 + scrollY < child.getBottom() && a(child, true, dx, (x2 + scrollX) - child.getLeft(), (y2 + scrollY) - child.getTop())) {
                    return true;
                }
            }
        }
        if (checkV) {
            if (v2.canScrollHorizontally(-dx)) {
                return true;
            }
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event) || a(event);
    }

    public boolean a(KeyEvent event) {
        if (event.getAction() != 0) {
            return false;
        }
        int keyCode = event.getKeyCode();
        if (keyCode != 21) {
            if (keyCode != 22) {
                if (keyCode != 61) {
                    return false;
                }
                if (event.hasNoModifiers()) {
                    return a(2);
                }
                if (event.hasModifiers(1)) {
                    return a(1);
                }
                return false;
            } else if (event.hasModifiers(2)) {
                return d();
            } else {
                return a(66);
            }
        } else if (event.hasModifiers(2)) {
            return c();
        } else {
            return a(17);
        }
    }

    public boolean a(int direction) {
        View currentFocused = findFocus();
        if (currentFocused == this) {
            currentFocused = null;
        } else if (currentFocused != null) {
            boolean isChild = false;
            ViewParent parent = currentFocused.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                } else if (parent == this) {
                    isChild = true;
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
            if (!isChild) {
                StringBuilder sb = new StringBuilder();
                sb.append(currentFocused.getClass().getSimpleName());
                for (ViewParent parent2 = currentFocused.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                currentFocused = null;
            }
        }
        boolean handled = false;
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, currentFocused, direction);
        if (nextFocused == null || nextFocused == currentFocused) {
            if (direction == 17 || direction == 1) {
                handled = c();
            } else if (direction == 66 || direction == 2) {
                handled = d();
            }
        } else if (direction == 17) {
            handled = (currentFocused == null || a(this.f۱۳۰۸f, nextFocused).left < a(this.f۱۳۰۸f, currentFocused).left) ? nextFocused.requestFocus() : c();
        } else if (direction == 66) {
            handled = (currentFocused == null || a(this.f۱۳۰۸f, nextFocused).left > a(this.f۱۳۰۸f, currentFocused).left) ? nextFocused.requestFocus() : d();
        }
        if (handled) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(direction));
        }
        return handled;
    }

    private Rect a(Rect outRect, View child) {
        if (outRect == null) {
            outRect = new Rect();
        }
        if (child == null) {
            outRect.set(0, 0, 0, 0);
            return outRect;
        }
        outRect.left = child.getLeft();
        outRect.right = child.getRight();
        outRect.top = child.getTop();
        outRect.bottom = child.getBottom();
        ViewParent parent = child.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup group = (ViewGroup) parent;
            outRect.left += group.getLeft();
            outRect.right += group.getRight();
            outRect.top += group.getTop();
            outRect.bottom += group.getBottom();
            parent = group.getParent();
        }
        return outRect;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        int i2 = this.f۱۳۱۰h;
        if (i2 <= 0) {
            return false;
        }
        a(i2 - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        q qVar = this.f۱۳۰۹g;
        if (qVar == null || this.f۱۳۱۰h >= qVar.a() - 1) {
            return false;
        }
        a(this.f۱۳۱۰h + 1, true);
        return true;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> views, int direction, int focusableMode) {
        f ii;
        int focusableCount = views.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View child = getChildAt(i2);
                if (child.getVisibility() == 0 && (ii = b(child)) != null && ii.f۱۳۱۵b == this.f۱۳۱۰h) {
                    child.addFocusables(views, direction, focusableMode);
                }
            }
        }
        if ((descendantFocusability == 262144 && focusableCount != views.size()) || !isFocusable()) {
            return;
        }
        if (((focusableMode & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && views != null) {
            views.add(this);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> views) {
        f ii;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View child = getChildAt(i2);
            if (child.getVisibility() == 0 && (ii = b(child)) != null && ii.f۱۳۱۵b == this.f۱۳۱۰h) {
                child.addTouchables(views);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        int end;
        int increment;
        int index;
        f ii;
        int count = getChildCount();
        if ((direction & 2) != 0) {
            index = 0;
            increment = 1;
            end = count;
        } else {
            index = count - 1;
            increment = -1;
            end = -1;
        }
        for (int i2 = index; i2 != end; i2 += increment) {
            View child = getChildAt(i2);
            if (child.getVisibility() == 0 && (ii = b(child)) != null && ii.f۱۳۱۵b == this.f۱۳۱۰h && child.requestFocus(direction, previouslyFocusedRect)) {
                return true;
            }
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        f ii;
        if (event.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(event);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = getChildAt(i2);
            if (child.getVisibility() == 0 && (ii = b(child)) != null && ii.f۱۳۱۵b == this.f۱۳۱۰h && child.dispatchPopulateAccessibilityEvent(event)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p2) {
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return (p2 instanceof g) && super.checkLayoutParams(p2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new g(getContext(), attrs);
    }

    /* access modifiers changed from: package-private */
    public class h extends b {
        h() {
        }

        @Override // android.support.v4.view.b
        public void b(View host, AccessibilityEvent event) {
            q qVar;
            super.b(host, event);
            event.setClassName(ViewPager.class.getName());
            event.setScrollable(b());
            if (event.getEventType() == 4096 && (qVar = ViewPager.this.f۱۳۰۹g) != null) {
                event.setItemCount(qVar.a());
                event.setFromIndex(ViewPager.this.f۱۳۱۰h);
                event.setToIndex(ViewPager.this.f۱۳۱۰h);
            }
        }

        @Override // android.support.v4.view.b
        public void a(View host, android.support.v4.view.d0.c info2) {
            super.a(host, info2);
            info2.a((CharSequence) ViewPager.class.getName());
            info2.k(b());
            if (ViewPager.this.canScrollHorizontally(1)) {
                info2.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                info2.a(8192);
            }
        }

        @Override // android.support.v4.view.b
        public boolean a(View host, int action, Bundle args) {
            if (super.a(host, action, args)) {
                return true;
            }
            if (action != 4096) {
                if (action != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f۱۳۱۰h - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.f۱۳۱۰h + 1);
                return true;
            }
        }

        private boolean b() {
            q qVar = ViewPager.this.f۱۳۰۹g;
            return qVar != null && qVar.a() > 1;
        }
    }

    private class l extends DataSetObserver {
        l() {
        }

        public void onChanged() {
            ViewPager.this.a();
        }

        public void onInvalidated() {
            ViewPager.this.a();
        }
    }

    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f۱۳۱۹a;

        /* renamed from: b  reason: collision with root package name */
        public int f۱۳۲۰b;

        /* renamed from: c  reason: collision with root package name */
        float f۱۳۲۱c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        boolean f۱۳۲۲d;

        /* renamed from: e  reason: collision with root package name */
        int f۱۳۲۳e;

        /* renamed from: f  reason: collision with root package name */
        int f۱۳۲۴f;

        public g() {
            super(-1, -1);
        }

        public g(Context context, AttributeSet attrs) {
            super(context, attrs);
            TypedArray a2 = context.obtainStyledAttributes(attrs, ViewPager.h0);
            this.f۱۳۲۰b = a2.getInteger(0, 48);
            a2.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    public static class n implements Comparator<View> {
        n() {
        }

        /* renamed from: a */
        public int compare(View lhs, View rhs) {
            g llp = (g) lhs.getLayoutParams();
            g rlp = (g) rhs.getLayoutParams();
            boolean z = llp.f۱۳۱۹a;
            if (z != rlp.f۱۳۱۹a) {
                return z ? 1 : -1;
            }
            return llp.f۱۳۲۳e - rlp.f۱۳۲۳e;
        }
    }
}
