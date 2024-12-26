package android.support.p۰۴۳v4.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p۰۴۳v4.graphics.drawable.Ca;
import android.support.p۰۴۳v4.view.AbstractCa;
import android.support.p۰۴۳v4.view.Cd;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.view.p۰۴۵d0.Cc;
import android.support.p۰۴۳v4.widget.Cs;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.widget.DrawerLayout */
public class DrawerLayout extends ViewGroup {

    /* renamed from: M  reason: contains not printable characters */
    private static final int[] f۱۰۶۴۸M = {16843828};

    /* renamed from: N  reason: contains not printable characters */
    static final int[] f۱۰۶۴۹N = {16842931};

    /* renamed from: O  reason: contains not printable characters */
    static final boolean f۱۰۶۵۰O = (Build.VERSION.SDK_INT >= 19);

    /* renamed from: P  reason: contains not printable characters */
    private static final boolean f۱۰۶۵۱P;

    /* renamed from: A  reason: contains not printable characters */
    private Drawable f۱۰۶۵۲A;

    /* renamed from: B  reason: contains not printable characters */
    private CharSequence f۱۰۶۵۳B;

    /* renamed from: C  reason: contains not printable characters */
    private CharSequence f۱۰۶۵۴C;

    /* renamed from: D  reason: contains not printable characters */
    private Object f۱۰۶۵۵D;

    /* renamed from: E  reason: contains not printable characters */
    private boolean f۱۰۶۵۶E;

    /* renamed from: F  reason: contains not printable characters */
    private Drawable f۱۰۶۵۷F;

    /* renamed from: G  reason: contains not printable characters */
    private Drawable f۱۰۶۵۸G;

    /* renamed from: H  reason: contains not printable characters */
    private Drawable f۱۰۶۵۹H;

    /* renamed from: I  reason: contains not printable characters */
    private Drawable f۱۰۶۶۰I;

    /* renamed from: J  reason: contains not printable characters */
    private final ArrayList<View> f۱۰۶۶۱J;

    /* renamed from: K  reason: contains not printable characters */
    private Rect f۱۰۶۶۲K;

    /* renamed from: L  reason: contains not printable characters */
    private Matrix f۱۰۶۶۳L;

    /* renamed from: c  reason: contains not printable characters */
    private final Cc f۱۰۶۶۴c;

    /* renamed from: d  reason: contains not printable characters */
    private float f۱۰۶۶۵d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۰۶۶۶e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۰۶۶۷f;

    /* renamed from: g  reason: contains not printable characters */
    private float f۱۰۶۶۸g;

    /* renamed from: h  reason: contains not printable characters */
    private Paint f۱۰۶۶۹h;

    /* renamed from: i  reason: contains not printable characters */
    private final Cs f۱۰۶۷۰i;

    /* renamed from: j  reason: contains not printable characters */
    private final Cs f۱۰۶۷۱j;

    /* renamed from: k  reason: contains not printable characters */
    private final Cg f۱۰۶۷۲k;

    /* renamed from: l  reason: contains not printable characters */
    private final Cg f۱۰۶۷۳l;

    /* renamed from: m  reason: contains not printable characters */
    private int f۱۰۶۷۴m;

    /* renamed from: n  reason: contains not printable characters */
    private boolean f۱۰۶۷۵n;

    /* renamed from: o  reason: contains not printable characters */
    private boolean f۱۰۶۷۶o;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۰۶۷۷p;

    /* renamed from: q  reason: contains not printable characters */
    private int f۱۰۶۷۸q;

    /* renamed from: r  reason: contains not printable characters */
    private int f۱۰۶۷۹r;

    /* renamed from: s  reason: contains not printable characters */
    private int f۱۰۶۸۰s;

    /* renamed from: t  reason: contains not printable characters */
    private boolean f۱۰۶۸۱t;

    /* renamed from: u  reason: contains not printable characters */
    private AbstractCd f۱۰۶۸۲u;

    /* renamed from: v  reason: contains not printable characters */
    private List<AbstractCd> f۱۰۶۸۳v;

    /* renamed from: w  reason: contains not printable characters */
    private float f۱۰۶۸۴w;

    /* renamed from: x  reason: contains not printable characters */
    private float f۱۰۶۸۵x;

    /* renamed from: y  reason: contains not printable characters */
    private Drawable f۱۰۶۸۶y;

    /* renamed from: z  reason: contains not printable characters */
    private Drawable f۱۰۶۸۷z;

    /* renamed from: android.support.v4.widget.DrawerLayout$d  reason: invalid class name */
    public interface AbstractCd {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۳۱۲۵a(int i);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۳۱۲۶a(View view);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۳۱۲۷a(View view, float f);

        /* renamed from: b  reason: contains not printable characters */
        void m۱۳۱۲۸b(View view);
    }

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 21) {
            z = false;
        }
        f۱۰۶۵۱P = z;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DrawerLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f۱۰۶۶۴c = new Cc();
        this.f۱۰۶۶۷f = -1728053248;
        this.f۱۰۶۶۹h = new Paint();
        this.f۱۰۶۷۶o = true;
        this.f۱۰۶۷۷p = 3;
        this.f۱۰۶۷۸q = 3;
        this.f۱۰۶۷۹r = 3;
        this.f۱۰۶۸۰s = 3;
        this.f۱۰۶۵۷F = null;
        this.f۱۰۶۵۸G = null;
        this.f۱۰۶۵۹H = null;
        this.f۱۰۶۶۰I = null;
        setDescendantFocusability(262144);
        float density = getResources().getDisplayMetrics().density;
        this.f۱۰۶۶۶e = (int) ((64.0f * density) + 0.5f);
        float minVel = 400.0f * density;
        this.f۱۰۶۷۲k = new Cg(3);
        this.f۱۰۶۷۳l = new Cg(5);
        this.f۱۰۶۷۰i = Cs.m۱۳۳۲۴a(this, 1.0f, this.f۱۰۶۷۲k);
        this.f۱۰۶۷۰i.m۱۳۳۶۰d(1);
        this.f۱۰۶۷۰i.m۱۳۳۴۳a(minVel);
        this.f۱۰۶۷۲k.m۱۳۱۳۴a(this.f۱۰۶۷۰i);
        this.f۱۰۶۷۱j = Cs.m۱۳۳۲۴a(this, 1.0f, this.f۱۰۶۷۳l);
        this.f۱۰۶۷۱j.m۱۳۳۶۰d(2);
        this.f۱۰۶۷۱j.m۱۳۳۴۳a(minVel);
        this.f۱۰۶۷۳l.m۱۳۱۳۴a(this.f۱۰۶۷۱j);
        setFocusableInTouchMode(true);
        Cu.m۱۳۰۰۷f(this, 1);
        Cu.m۱۲۹۸۵a(this, new Cb());
        setMotionEventSplittingEnabled(false);
        if (Cu.m۱۳۰۱۱h(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerCa(this));
                setSystemUiVisibility(1280);
                TypedArray a = context.obtainStyledAttributes(f۱۰۶۴۸M);
                try {
                    this.f۱۰۶۸۶y = a.getDrawable(0);
                } finally {
                    a.recycle();
                }
            } else {
                this.f۱۰۶۸۶y = null;
            }
        }
        this.f۱۰۶۶۵d = 10.0f * density;
        this.f۱۰۶۶۱J = new ArrayList<>();
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$a  reason: invalid class name */
    class View$OnApplyWindowInsetsListenerCa implements View.OnApplyWindowInsetsListener {
        View$OnApplyWindowInsetsListenerCa(DrawerLayout this$0) {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
            ((DrawerLayout) view).m۱۳۰۹۱a(insets, insets.getSystemWindowInsetTop() > 0);
            return insets.consumeSystemWindowInsets();
        }
    }

    public void setDrawerElevation(float elevation) {
        this.f۱۰۶۶۵d = elevation;
        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            if (m۱۳۱۱۵i(child)) {
                Cu.m۱۲۹۷۷a(child, this.f۱۰۶۶۵d);
            }
        }
    }

    public float getDrawerElevation() {
        if (f۱۰۶۵۱P) {
            return this.f۱۰۶۶۵d;
        }
        return 0.0f;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۰۹۱a(Object insets, boolean draw) {
        this.f۱۰۶۵۵D = insets;
        this.f۱۰۶۵۶E = draw;
        setWillNotDraw(!draw && getBackground() == null);
        requestLayout();
    }

    public void setScrimColor(int color) {
        this.f۱۰۶۶۷f = color;
        invalidate();
    }

    @Deprecated
    public void setDrawerListener(AbstractCd listener) {
        AbstractCd dVar = this.f۱۰۶۸۲u;
        if (dVar != null) {
            m۱۳۰۹۷b(dVar);
        }
        if (listener != null) {
            m۱۳۰۸۷a(listener);
        }
        this.f۱۰۶۸۲u = listener;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۰۸۷a(AbstractCd listener) {
        if (listener != null) {
            if (this.f۱۰۶۸۳v == null) {
                this.f۱۰۶۸۳v = new ArrayList();
            }
            this.f۱۰۶۸۳v.add(listener);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۰۹۷b(AbstractCd listener) {
        List<AbstractCd> list;
        if (listener != null && (list = this.f۱۰۶۸۳v) != null) {
            list.remove(listener);
        }
    }

    public void setDrawerLockMode(int lockMode) {
        m۱۳۰۸۴a(lockMode, 3);
        m۱۳۰۸۴a(lockMode, 5);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۰۸۴a(int lockMode, int edgeGravity) {
        View toOpen;
        int absGravity = Cd.m۱۲۸۲۵a(edgeGravity, Cu.m۱۳۰۱۴k(this));
        if (edgeGravity == 3) {
            this.f۱۰۶۷۷p = lockMode;
        } else if (edgeGravity == 5) {
            this.f۱۰۶۷۸q = lockMode;
        } else if (edgeGravity == 8388611) {
            this.f۱۰۶۷۹r = lockMode;
        } else if (edgeGravity == 8388613) {
            this.f۱۰۶۸۰s = lockMode;
        }
        if (lockMode != 0) {
            (absGravity == 3 ? this.f۱۰۶۷۰i : this.f۱۰۶۷۱j).m۱۳۳۴۲a();
        }
        if (lockMode == 1) {
            View toClose = m۱۳۰۹۴b(absGravity);
            if (toClose != null) {
                m۱۳۰۸۸a(toClose);
            }
        } else if (lockMode == 2 && (toOpen = m۱۳۰۹۴b(absGravity)) != null) {
            m۱۳۱۱۷k(toOpen);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public int m۱۳۱۰۱c(int edgeGravity) {
        int layoutDirection = Cu.m۱۳۰۱۴k(this);
        if (edgeGravity == 3) {
            int rightLockMode = this.f۱۰۶۷۷p;
            if (rightLockMode != 3) {
                return rightLockMode;
            }
            int leftLockMode = layoutDirection == 0 ? this.f۱۰۶۷۹r : this.f۱۰۶۸۰s;
            if (leftLockMode != 3) {
                return leftLockMode;
            }
            return 0;
        } else if (edgeGravity == 5) {
            int startLockMode = this.f۱۰۶۷۸q;
            if (startLockMode != 3) {
                return startLockMode;
            }
            int rightLockMode2 = layoutDirection == 0 ? this.f۱۰۶۸۰s : this.f۱۰۶۷۹r;
            if (rightLockMode2 != 3) {
                return rightLockMode2;
            }
            return 0;
        } else if (edgeGravity == 8388611) {
            int endLockMode = this.f۱۰۶۷۹r;
            if (endLockMode != 3) {
                return endLockMode;
            }
            int startLockMode2 = layoutDirection == 0 ? this.f۱۰۶۷۷p : this.f۱۰۶۷۸q;
            if (startLockMode2 != 3) {
                return startLockMode2;
            }
            return 0;
        } else if (edgeGravity != 8388613) {
            return 0;
        } else {
            int i = this.f۱۰۶۸۰s;
            if (i != 3) {
                return i;
            }
            int endLockMode2 = layoutDirection == 0 ? this.f۱۰۶۷۸q : this.f۱۰۶۷۷p;
            if (endLockMode2 != 3) {
                return endLockMode2;
            }
            return 0;
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public int m۱۳۱۰۵d(View drawerView) {
        if (m۱۳۱۱۵i(drawerView)) {
            return m۱۳۱۰۱c(((Ce) drawerView.getLayoutParams()).f۱۰۶۹۰a);
        }
        throw new IllegalArgumentException("View " + drawerView + " is not a drawer");
    }

    /* renamed from: d  reason: contains not printable characters */
    public CharSequence m۱۳۱۰۷d(int edgeGravity) {
        int absGravity = Cd.m۱۲۸۲۵a(edgeGravity, Cu.m۱۳۰۱۴k(this));
        if (absGravity == 3) {
            return this.f۱۰۶۵۳B;
        }
        if (absGravity == 5) {
            return this.f۱۰۶۵۴C;
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۳۰۶۹a(float x, float y, View child) {
        if (this.f۱۰۶۶۲K == null) {
            this.f۱۰۶۶۲K = new Rect();
        }
        child.getHitRect(this.f۱۰۶۶۲K);
        return this.f۱۰۶۶۲K.contains((int) x, (int) y);
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۳۰۷۱a(MotionEvent event, View child) {
        if (!child.getMatrix().isIdentity()) {
            MotionEvent transformedEvent = m۱۳۰۷۲b(event, child);
            boolean handled = child.dispatchGenericMotionEvent(transformedEvent);
            transformedEvent.recycle();
            return handled;
        }
        float offsetX = (float) (getScrollX() - child.getLeft());
        float offsetY = (float) (getScrollY() - child.getTop());
        event.offsetLocation(offsetX, offsetY);
        boolean handled2 = child.dispatchGenericMotionEvent(event);
        event.offsetLocation(-offsetX, -offsetY);
        return handled2;
    }

    /* renamed from: b  reason: contains not printable characters */
    private MotionEvent m۱۳۰۷۲b(MotionEvent event, View child) {
        MotionEvent transformedEvent = MotionEvent.obtain(event);
        transformedEvent.offsetLocation((float) (getScrollX() - child.getLeft()), (float) (getScrollY() - child.getTop()));
        Matrix childMatrix = child.getMatrix();
        if (!childMatrix.isIdentity()) {
            if (this.f۱۰۶۶۳L == null) {
                this.f۱۰۶۶۳L = new Matrix();
            }
            childMatrix.invert(this.f۱۰۶۶۳L);
            transformedEvent.transform(this.f۱۰۶۶۳L);
        }
        return transformedEvent;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۰۸۵a(int forGravity, int activeState, View activeDrawer) {
        int state;
        int leftState = this.f۱۰۶۷۰i.m۱۳۳۶۲e();
        int rightState = this.f۱۰۶۷۱j.m۱۳۳۶۲e();
        if (leftState == 1 || rightState == 1) {
            state = 1;
        } else if (leftState == 2 || rightState == 2) {
            state = 2;
        } else {
            state = 0;
        }
        if (activeDrawer != null && activeState == 0) {
            float f = ((Ce) activeDrawer.getLayoutParams()).f۱۰۶۹۱b;
            if (f == 0.0f) {
                m۱۳۰۹۸b(activeDrawer);
            } else if (f == 1.0f) {
                m۱۳۱۰۳c(activeDrawer);
            }
        }
        if (state != this.f۱۰۶۷۴m) {
            this.f۱۰۶۷۴m = state;
            List<AbstractCd> list = this.f۱۰۶۸۳v;
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    this.f۱۰۶۸۳v.get(i).m۱۳۱۲۵a(state);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۰۹۸b(View drawerView) {
        View rootView;
        Ce lp = (Ce) drawerView.getLayoutParams();
        if ((lp.f۱۰۶۹۳d & 1) == 1) {
            lp.f۱۰۶۹۳d = 0;
            List<AbstractCd> list = this.f۱۰۶۸۳v;
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    this.f۱۰۶۸۳v.get(i).m۱۳۱۲۸b(drawerView);
                }
            }
            m۱۳۰۷۳c(drawerView, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۳۱۰۳c(View drawerView) {
        Ce lp = (Ce) drawerView.getLayoutParams();
        if ((lp.f۱۰۶۹۳d & 1) == 0) {
            lp.f۱۰۶۹۳d = 1;
            List<AbstractCd> list = this.f۱۰۶۸۳v;
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    this.f۱۰۶۸۳v.get(i).m۱۳۱۲۶a(drawerView);
                }
            }
            m۱۳۰۷۳c(drawerView, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۳۰۷۳c(View drawerView, boolean isDrawerOpen) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            if ((isDrawerOpen || m۱۳۱۱۵i(child)) && (!isDrawerOpen || child != drawerView)) {
                Cu.m۱۳۰۰۷f(child, 4);
            } else {
                Cu.m۱۳۰۰۷f(child, 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۰۸۹a(View drawerView, float slideOffset) {
        List<AbstractCd> list = this.f۱۰۶۸۳v;
        if (list != null) {
            for (int i = list.size() - 1; i >= 0; i--) {
                this.f۱۰۶۸۳v.get(i).m۱۳۱۲۷a(drawerView, slideOffset);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۳۱۰۴c(View drawerView, float slideOffset) {
        Ce lp = (Ce) drawerView.getLayoutParams();
        if (slideOffset != lp.f۱۰۶۹۱b) {
            lp.f۱۰۶۹۱b = slideOffset;
            m۱۳۰۸۹a(drawerView, slideOffset);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public float m۱۳۱۱۰f(View drawerView) {
        return ((Ce) drawerView.getLayoutParams()).f۱۰۶۹۱b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public int m۱۳۱۰۸e(View drawerView) {
        return Cd.m۱۲۸۲۵a(((Ce) drawerView.getLayoutParams()).f۱۰۶۹۰a, Cu.m۱۳۰۱۴k(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۰۹۳a(View drawerView, int checkFor) {
        return (m۱۳۱۰۸e(drawerView) & checkFor) == checkFor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public View m۱۳۱۰۲c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            if ((((Ce) child.getLayoutParams()).f۱۰۶۹۳d & 1) == 1) {
                return child;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۰۹۹b(View drawerView, float slideOffset) {
        float oldOffset = m۱۳۱۱۰f(drawerView);
        int width = drawerView.getWidth();
        int dx = ((int) (((float) width) * slideOffset)) - ((int) (((float) width) * oldOffset));
        drawerView.offsetLeftAndRight(m۱۳۰۹۳a(drawerView, 3) ? dx : -dx);
        m۱۳۱۰۴c(drawerView, slideOffset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public View m۱۳۰۹۴b(int gravity) {
        int absHorizGravity = Cd.m۱۲۸۲۵a(gravity, Cu.m۱۳۰۱۴k(this)) & 7;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            if ((m۱۳۱۰۸e(child) & 7) == absHorizGravity) {
                return child;
            }
        }
        return null;
    }

    /* renamed from: h  reason: contains not printable characters */
    static String m۱۳۰۷۸h(int gravity) {
        if ((gravity & 3) == 3) {
            return "LEFT";
        }
        if ((gravity & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(gravity);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f۱۰۶۷۶o = true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f۱۰۶۷۶o = true;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        boolean applyInsets;
        int heightMode;
        int widthMode;
        DrawerLayout drawerLayout = this;
        int widthMode2 = View.MeasureSpec.getMode(widthMeasureSpec);
        int heightMode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
        if (!(widthMode2 == 1073741824 && heightMode2 == 1073741824)) {
            if (isInEditMode()) {
                if (widthMode2 == Integer.MIN_VALUE) {
                    widthMode2 = 1073741824;
                } else if (widthMode2 == 0) {
                    widthMode2 = 1073741824;
                    widthSize = 300;
                }
                if (heightMode2 == Integer.MIN_VALUE) {
                    heightMode2 = 1073741824;
                } else if (heightMode2 == 0) {
                    heightMode2 = 1073741824;
                    heightSize = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        drawerLayout.setMeasuredDimension(widthSize, heightSize);
        boolean applyInsets2 = drawerLayout.f۱۰۶۵۵D != null && Cu.m۱۳۰۱۱h(this);
        int layoutDirection = Cu.m۱۳۰۱۴k(this);
        boolean hasDrawerOnLeftEdge = false;
        boolean hasDrawerOnRightEdge = false;
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View child = drawerLayout.getChildAt(i);
            if (child.getVisibility() == 8) {
                widthMode = widthMode2;
                heightMode = heightMode2;
                applyInsets = applyInsets2;
            } else {
                Ce lp = (Ce) child.getLayoutParams();
                if (applyInsets2) {
                    int cgrav = Cd.m۱۲۸۲۵a(lp.f۱۰۶۹۰a, layoutDirection);
                    if (!Cu.m۱۳۰۱۱h(child)) {
                        widthMode = widthMode2;
                        heightMode = heightMode2;
                        applyInsets = applyInsets2;
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets wi = (WindowInsets) drawerLayout.f۱۰۶۵۵D;
                            if (cgrav == 3) {
                                wi = wi.replaceSystemWindowInsets(wi.getSystemWindowInsetLeft(), wi.getSystemWindowInsetTop(), 0, wi.getSystemWindowInsetBottom());
                            } else if (cgrav == 5) {
                                wi = wi.replaceSystemWindowInsets(0, wi.getSystemWindowInsetTop(), wi.getSystemWindowInsetRight(), wi.getSystemWindowInsetBottom());
                            }
                            ((ViewGroup.MarginLayoutParams) lp).leftMargin = wi.getSystemWindowInsetLeft();
                            ((ViewGroup.MarginLayoutParams) lp).topMargin = wi.getSystemWindowInsetTop();
                            ((ViewGroup.MarginLayoutParams) lp).rightMargin = wi.getSystemWindowInsetRight();
                            ((ViewGroup.MarginLayoutParams) lp).bottomMargin = wi.getSystemWindowInsetBottom();
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets wi2 = (WindowInsets) drawerLayout.f۱۰۶۵۵D;
                        if (cgrav == 3) {
                            widthMode = widthMode2;
                            heightMode = heightMode2;
                            applyInsets = applyInsets2;
                            wi2 = wi2.replaceSystemWindowInsets(wi2.getSystemWindowInsetLeft(), wi2.getSystemWindowInsetTop(), 0, wi2.getSystemWindowInsetBottom());
                        } else {
                            widthMode = widthMode2;
                            heightMode = heightMode2;
                            applyInsets = applyInsets2;
                            if (cgrav == 5) {
                                wi2 = wi2.replaceSystemWindowInsets(0, wi2.getSystemWindowInsetTop(), wi2.getSystemWindowInsetRight(), wi2.getSystemWindowInsetBottom());
                            }
                        }
                        child.dispatchApplyWindowInsets(wi2);
                    } else {
                        widthMode = widthMode2;
                        heightMode = heightMode2;
                        applyInsets = applyInsets2;
                    }
                } else {
                    widthMode = widthMode2;
                    heightMode = heightMode2;
                    applyInsets = applyInsets2;
                }
                if (drawerLayout.m۱۳۱۱۳g(child)) {
                    child.measure(View.MeasureSpec.makeMeasureSpec((widthSize - ((ViewGroup.MarginLayoutParams) lp).leftMargin) - ((ViewGroup.MarginLayoutParams) lp).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((heightSize - ((ViewGroup.MarginLayoutParams) lp).topMargin) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin, 1073741824));
                } else if (drawerLayout.m۱۳۱۱۵i(child)) {
                    if (f۱۰۶۵۱P) {
                        float g = Cu.m۱۳۰۰۸g(child);
                        float f = drawerLayout.f۱۰۶۶۵d;
                        if (g != f) {
                            Cu.m۱۲۹۷۷a(child, f);
                        }
                    }
                    int childGravity = drawerLayout.m۱۳۱۰۸e(child) & 7;
                    boolean isLeftEdgeDrawer = childGravity == 3;
                    if ((!isLeftEdgeDrawer || !hasDrawerOnLeftEdge) && (isLeftEdgeDrawer || !hasDrawerOnRightEdge)) {
                        if (isLeftEdgeDrawer) {
                            hasDrawerOnLeftEdge = true;
                        } else {
                            hasDrawerOnRightEdge = true;
                        }
                        child.measure(ViewGroup.getChildMeasureSpec(widthMeasureSpec, drawerLayout.f۱۰۶۶۶e + ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin, ((ViewGroup.MarginLayoutParams) lp).width), ViewGroup.getChildMeasureSpec(heightMeasureSpec, ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin, ((ViewGroup.MarginLayoutParams) lp).height));
                        i++;
                        drawerLayout = this;
                        widthMode2 = widthMode;
                        heightMode2 = heightMode;
                        applyInsets2 = applyInsets;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m۱۳۰۷۸h(childGravity) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + child + " at index " + i + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            i++;
            drawerLayout = this;
            widthMode2 = widthMode;
            heightMode2 = heightMode;
            applyInsets2 = applyInsets;
        }
    }

    /* renamed from: i  reason: contains not printable characters */
    private void m۱۳۰۷۹i() {
        if (!f۱۰۶۵۱P) {
            this.f۱۰۶۸۷z = m۱۳۰۷۶g();
            this.f۱۰۶۵۲A = m۱۳۰۷۷h();
        }
    }

    /* renamed from: g  reason: contains not printable characters */
    private Drawable m۱۳۰۷۶g() {
        int layoutDirection = Cu.m۱۳۰۱۴k(this);
        if (layoutDirection == 0) {
            Drawable drawable = this.f۱۰۶۵۷F;
            if (drawable != null) {
                m۱۳۰۷۰a(drawable, layoutDirection);
                return this.f۱۰۶۵۷F;
            }
        } else {
            Drawable drawable2 = this.f۱۰۶۵۸G;
            if (drawable2 != null) {
                m۱۳۰۷۰a(drawable2, layoutDirection);
                return this.f۱۰۶۵۸G;
            }
        }
        return this.f۱۰۶۵۹H;
    }

    /* renamed from: h  reason: contains not printable characters */
    private Drawable m۱۳۰۷۷h() {
        int layoutDirection = Cu.m۱۳۰۱۴k(this);
        if (layoutDirection == 0) {
            Drawable drawable = this.f۱۰۶۵۸G;
            if (drawable != null) {
                m۱۳۰۷۰a(drawable, layoutDirection);
                return this.f۱۰۶۵۸G;
            }
        } else {
            Drawable drawable2 = this.f۱۰۶۵۷F;
            if (drawable2 != null) {
                m۱۳۰۷۰a(drawable2, layoutDirection);
                return this.f۱۰۶۵۷F;
            }
        }
        return this.f۱۰۶۶۰I;
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۳۰۷۰a(Drawable drawable, int layoutDirection) {
        if (drawable == null || !Ca.m۱۲۷۲۰f(drawable)) {
            return false;
        }
        Ca.m۱۲۷۱۴a(drawable, layoutDirection);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        int width;
        float newOffset;
        int childLeft;
        this.f۱۰۶۷۵n = true;
        int width2 = r - l;
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View child = getChildAt(i);
            if (child.getVisibility() == 8) {
                width = width2;
            } else {
                Ce lp = (Ce) child.getLayoutParams();
                if (m۱۳۱۱۳g(child)) {
                    int i2 = ((ViewGroup.MarginLayoutParams) lp).leftMargin;
                    child.layout(i2, ((ViewGroup.MarginLayoutParams) lp).topMargin, child.getMeasuredWidth() + i2, ((ViewGroup.MarginLayoutParams) lp).topMargin + child.getMeasuredHeight());
                    width = width2;
                } else {
                    int childWidth = child.getMeasuredWidth();
                    int childHeight = child.getMeasuredHeight();
                    if (m۱۳۰۹۳a(child, 3)) {
                        childLeft = (-childWidth) + ((int) (((float) childWidth) * lp.f۱۰۶۹۱b));
                        newOffset = ((float) (childWidth + childLeft)) / ((float) childWidth);
                    } else {
                        childLeft = width2 - ((int) (((float) childWidth) * lp.f۱۰۶۹۱b));
                        newOffset = ((float) (width2 - childLeft)) / ((float) childWidth);
                    }
                    boolean changeOffset = newOffset != lp.f۱۰۶۹۱b;
                    int vgrav = lp.f۱۰۶۹۰a & 112;
                    if (vgrav == 16) {
                        int height = b - t;
                        int childTop = (height - childHeight) / 2;
                        if (childTop < ((ViewGroup.MarginLayoutParams) lp).topMargin) {
                            childTop = ((ViewGroup.MarginLayoutParams) lp).topMargin;
                            width = width2;
                        } else {
                            int i3 = childTop + childHeight;
                            int i4 = ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
                            width = width2;
                            if (i3 > height - i4) {
                                childTop = (height - i4) - childHeight;
                            }
                        }
                        child.layout(childLeft, childTop, childLeft + childWidth, childTop + childHeight);
                    } else if (vgrav != 80) {
                        int i5 = ((ViewGroup.MarginLayoutParams) lp).topMargin;
                        child.layout(childLeft, i5, childLeft + childWidth, i5 + childHeight);
                        width = width2;
                    } else {
                        int height2 = b - t;
                        child.layout(childLeft, (height2 - ((ViewGroup.MarginLayoutParams) lp).bottomMargin) - child.getMeasuredHeight(), childLeft + childWidth, height2 - ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
                        width = width2;
                    }
                    if (changeOffset) {
                        m۱۳۱۰۴c(child, newOffset);
                    }
                    int newVisibility = lp.f۱۰۶۹۱b > 0.0f ? 0 : 4;
                    if (child.getVisibility() != newVisibility) {
                        child.setVisibility(newVisibility);
                    }
                }
            }
            i++;
            width2 = width;
        }
        this.f۱۰۶۷۵n = false;
        this.f۱۰۶۷۶o = false;
    }

    public void requestLayout() {
        if (!this.f۱۰۶۷۵n) {
            super.requestLayout();
        }
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float scrimOpacity = 0.0f;
        for (int i = 0; i < childCount; i++) {
            scrimOpacity = Math.max(scrimOpacity, ((Ce) getChildAt(i).getLayoutParams()).f۱۰۶۹۱b);
        }
        this.f۱۰۶۶۸g = scrimOpacity;
        boolean leftDraggerSettling = this.f۱۰۶۷۰i.m۱۳۳۴۹a(true);
        boolean rightDraggerSettling = this.f۱۰۶۷۱j.m۱۳۳۴۹a(true);
        if (leftDraggerSettling || rightDraggerSettling) {
            Cu.m۱۲۹۷۰B(this);
        }
    }

    /* renamed from: l  reason: contains not printable characters */
    private static boolean m۱۳۰۸۰l(View v) {
        Drawable bg = v.getBackground();
        if (bg == null || bg.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    public void setStatusBarBackground(Drawable bg) {
        this.f۱۰۶۸۶y = bg;
        invalidate();
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f۱۰۶۸۶y;
    }

    public void setStatusBarBackground(int resId) {
        this.f۱۰۶۸۶y = resId != 0 ? android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۶c(getContext(), resId) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int color) {
        this.f۱۰۶۸۶y = new ColorDrawable(color);
        invalidate();
    }

    public void onRtlPropertiesChanged(int layoutDirection) {
        m۱۳۰۷۹i();
    }

    public void onDraw(Canvas c) {
        int inset;
        super.onDraw(c);
        if (this.f۱۰۶۵۶E && this.f۱۰۶۸۶y != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                Object obj = this.f۱۰۶۵۵D;
                inset = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
            } else {
                inset = 0;
            }
            if (inset > 0) {
                this.f۱۰۶۸۶y.setBounds(0, 0, getWidth(), inset);
                this.f۱۰۶۸۶y.draw(c);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        int clipRight;
        int clipLeft;
        int height = getHeight();
        boolean drawingContent = m۱۳۱۱۳g(child);
        int clipLeft2 = 0;
        int clipRight2 = getWidth();
        int restoreCount = canvas.save();
        if (drawingContent) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View v = getChildAt(i);
                if (v != child && v.getVisibility() == 0 && m۱۳۰۸۰l(v) && m۱۳۱۱۵i(v) && v.getHeight() >= height) {
                    if (m۱۳۰۹۳a(v, 3)) {
                        int vright = v.getRight();
                        if (vright > clipLeft2) {
                            clipLeft2 = vright;
                        }
                    } else {
                        int vleft = v.getLeft();
                        if (vleft < clipRight2) {
                            clipRight2 = vleft;
                        }
                    }
                }
            }
            canvas.clipRect(clipLeft2, 0, clipRight2, getHeight());
            clipLeft = clipLeft2;
            clipRight = clipRight2;
        } else {
            clipLeft = 0;
            clipRight = clipRight2;
        }
        boolean result = super.drawChild(canvas, child, drawingTime);
        canvas.restoreToCount(restoreCount);
        float f = this.f۱۰۶۶۸g;
        if (f > 0.0f && drawingContent) {
            int i2 = this.f۱۰۶۶۷f;
            this.f۱۰۶۶۹h.setColor((((int) (((float) ((-16777216 & i2) >>> 24)) * f)) << 24) | (i2 & 16777215));
            canvas.drawRect((float) clipLeft, 0.0f, (float) clipRight, (float) getHeight(), this.f۱۰۶۶۹h);
        } else if (this.f۱۰۶۸۷z != null && m۱۳۰۹۳a(child, 3)) {
            int shadowWidth = this.f۱۰۶۸۷z.getIntrinsicWidth();
            int childRight = child.getRight();
            float alpha = Math.max(0.0f, Math.min(((float) childRight) / ((float) this.f۱۰۶۷۰i.m۱۳۳۵۶c()), 1.0f));
            this.f۱۰۶۸۷z.setBounds(childRight, child.getTop(), childRight + shadowWidth, child.getBottom());
            this.f۱۰۶۸۷z.setAlpha((int) (255.0f * alpha));
            this.f۱۰۶۸۷z.draw(canvas);
        } else if (this.f۱۰۶۵۲A != null && m۱۳۰۹۳a(child, 5)) {
            int shadowWidth2 = this.f۱۰۶۵۲A.getIntrinsicWidth();
            int childLeft = child.getLeft();
            float alpha2 = Math.max(0.0f, Math.min(((float) (getWidth() - childLeft)) / ((float) this.f۱۰۶۷۱j.m۱۳۳۵۶c()), 1.0f));
            this.f۱۰۶۵۲A.setBounds(childLeft - shadowWidth2, child.getTop(), childLeft, child.getBottom());
            this.f۱۰۶۵۲A.setAlpha((int) (255.0f * alpha2));
            this.f۱۰۶۵۲A.draw(canvas);
        }
        return result;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public boolean m۱۳۱۱۳g(View child) {
        return ((Ce) child.getLayoutParams()).f۱۰۶۹۰a == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i  reason: contains not printable characters */
    public boolean m۱۳۱۱۵i(View child) {
        int absGravity = Cd.m۱۲۸۲۵a(((Ce) child.getLayoutParams()).f۱۰۶۹۰a, Cu.m۱۳۰۱۴k(child));
        if ((absGravity & 3) == 0 && (absGravity & 5) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r0 != 3) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۳v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        if ((event.getSource() & 2) == 0 || event.getAction() == 10 || this.f۱۰۶۶۸g <= 0.0f) {
            return super.dispatchGenericMotionEvent(event);
        }
        int childrenCount = getChildCount();
        if (childrenCount == 0) {
            return false;
        }
        float x = event.getX();
        float y = event.getY();
        for (int i = childrenCount - 1; i >= 0; i--) {
            View child = getChildAt(i);
            if (m۱۳۰۶۹a(x, y, child) && !m۱۳۱۱۳g(child) && m۱۳۰۷۱a(event, child)) {
                return true;
            }
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent ev) {
        View openDrawer;
        this.f۱۰۶۷۰i.m۱۳۳۴۴a(ev);
        this.f۱۰۶۷۱j.m۱۳۳۴۴a(ev);
        int action = ev.getAction() & 255;
        boolean z = false;
        if (action == 0) {
            float x = ev.getX();
            float y = ev.getY();
            this.f۱۰۶۸۴w = x;
            this.f۱۰۶۸۵x = y;
            this.f۱۰۶۸۱t = false;
        } else if (action == 1) {
            float x2 = ev.getX();
            float y2 = ev.getY();
            boolean peekingOnly = true;
            View touchedView = this.f۱۰۶۷۰i.m۱۳۳۵۱b((int) x2, (int) y2);
            if (touchedView != null && m۱۳۱۱۳g(touchedView)) {
                float dx = x2 - this.f۱۰۶۸۴w;
                float dy = y2 - this.f۱۰۶۸۵x;
                int slop = this.f۱۰۶۷۰i.m۱۳۳۵۹d();
                if ((dx * dx) + (dy * dy) < ((float) (slop * slop)) && (openDrawer = m۱۳۱۰۲c()) != null) {
                    if (m۱۳۱۰۵d(openDrawer) == 2) {
                        z = true;
                    }
                    peekingOnly = z;
                }
            }
            m۱۳۰۹۲a(peekingOnly);
        } else if (action == 3) {
            m۱۳۰۹۲a(true);
            this.f۱۰۶۸۱t = false;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
        if (disallowIntercept) {
            m۱۳۰۹۲a(true);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۰۹۵b() {
        m۱۳۰۹۲a(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۰۹۲a(boolean peekingOnly) {
        boolean needsInvalidate = false;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            Ce lp = (Ce) child.getLayoutParams();
            if (m۱۳۱۱۵i(child) && (!peekingOnly || lp.f۱۰۶۹۲c)) {
                int childWidth = child.getWidth();
                if (m۱۳۰۹۳a(child, 3)) {
                    needsInvalidate |= this.f۱۰۶۷۰i.m۱۳۳۵۵b(child, -childWidth, child.getTop());
                } else {
                    needsInvalidate |= this.f۱۰۶۷۱j.m۱۳۳۵۵b(child, getWidth(), child.getTop());
                }
                lp.f۱۰۶۹۲c = false;
            }
        }
        this.f۱۰۶۷۲k.m۱۳۱۳۹b();
        this.f۱۰۶۷۳l.m۱۳۱۳۹b();
        if (needsInvalidate) {
            invalidate();
        }
    }

    /* renamed from: k  reason: contains not printable characters */
    public void m۱۳۱۱۷k(View drawerView) {
        m۱۳۱۰۰b(drawerView, true);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۱۰۰b(View drawerView, boolean animate) {
        if (m۱۳۱۱۵i(drawerView)) {
            Ce lp = (Ce) drawerView.getLayoutParams();
            if (this.f۱۰۶۷۶o) {
                lp.f۱۰۶۹۱b = 1.0f;
                lp.f۱۰۶۹۳d = 1;
                m۱۳۰۷۳c(drawerView, true);
            } else if (animate) {
                lp.f۱۰۶۹۳d |= 2;
                if (m۱۳۰۹۳a(drawerView, 3)) {
                    this.f۱۰۶۷۰i.m۱۳۳۵۵b(drawerView, 0, drawerView.getTop());
                } else {
                    this.f۱۰۶۷۱j.m۱۳۳۵۵b(drawerView, getWidth() - drawerView.getWidth(), drawerView.getTop());
                }
            } else {
                m۱۳۰۹۹b(drawerView, 1.0f);
                m۱۳۰۸۵a(lp.f۱۰۶۹۰a, 0, drawerView);
                drawerView.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + drawerView + " is not a sliding drawer");
    }

    /* renamed from: g  reason: contains not printable characters */
    public void m۱۳۱۱۲g(int gravity) {
        m۱۳۰۹۶b(gravity, true);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۰۹۶b(int gravity, boolean animate) {
        View drawerView = m۱۳۰۹۴b(gravity);
        if (drawerView != null) {
            m۱۳۱۰۰b(drawerView, animate);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m۱۳۰۷۸h(gravity));
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۰۸۸a(View drawerView) {
        m۱۳۰۹۰a(drawerView, true);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۰۹۰a(View drawerView, boolean animate) {
        if (m۱۳۱۱۵i(drawerView)) {
            Ce lp = (Ce) drawerView.getLayoutParams();
            if (this.f۱۰۶۷۶o) {
                lp.f۱۰۶۹۱b = 0.0f;
                lp.f۱۰۶۹۳d = 0;
            } else if (animate) {
                lp.f۱۰۶۹۳d = 4 | lp.f۱۰۶۹۳d;
                if (m۱۳۰۹۳a(drawerView, 3)) {
                    this.f۱۰۶۷۰i.m۱۳۳۵۵b(drawerView, -drawerView.getWidth(), drawerView.getTop());
                } else {
                    this.f۱۰۶۷۱j.m۱۳۳۵۵b(drawerView, getWidth(), drawerView.getTop());
                }
            } else {
                m۱۳۰۹۹b(drawerView, 0.0f);
                m۱۳۰۸۵a(lp.f۱۰۶۹۰a, 0, drawerView);
                drawerView.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + drawerView + " is not a sliding drawer");
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۰۸۳a(int gravity) {
        m۱۳۰۸۶a(gravity, true);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۰۸۶a(int gravity, boolean animate) {
        View drawerView = m۱۳۰۹۴b(gravity);
        if (drawerView != null) {
            m۱۳۰۹۰a(drawerView, animate);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m۱۳۰۷۸h(gravity));
    }

    /* renamed from: h  reason: contains not printable characters */
    public boolean m۱۳۱۱۴h(View drawer) {
        if (m۱۳۱۱۵i(drawer)) {
            return (((Ce) drawer.getLayoutParams()).f۱۰۶۹۳d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + drawer + " is not a drawer");
    }

    /* renamed from: e  reason: contains not printable characters */
    public boolean m۱۳۱۰۹e(int drawerGravity) {
        View drawerView = m۱۳۰۹۴b(drawerGravity);
        if (drawerView != null) {
            return m۱۳۱۱۴h(drawerView);
        }
        return false;
    }

    /* renamed from: j  reason: contains not printable characters */
    public boolean m۱۳۱۱۶j(View drawer) {
        if (m۱۳۱۱۵i(drawer)) {
            return ((Ce) drawer.getLayoutParams()).f۱۰۶۹۱b > 0.0f;
        }
        throw new IllegalArgumentException("View " + drawer + " is not a drawer");
    }

    /* renamed from: f  reason: contains not printable characters */
    public boolean m۱۳۱۱۱f(int drawerGravity) {
        View drawerView = m۱۳۰۹۴b(drawerGravity);
        if (drawerView != null) {
            return m۱۳۱۱۶j(drawerView);
        }
        return false;
    }

    /* renamed from: e  reason: contains not printable characters */
    private boolean m۱۳۰۷۴e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((Ce) getChildAt(i).getLayoutParams()).f۱۰۶۹۲c) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new Ce(-1, -1);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        if (p instanceof Ce) {
            return new Ce((Ce) p);
        }
        return p instanceof ViewGroup.MarginLayoutParams ? new Ce((ViewGroup.MarginLayoutParams) p) : new Ce(p);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return (p instanceof Ce) && super.checkLayoutParams(p);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new Ce(getContext(), attrs);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> views, int direction, int focusableMode) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean isDrawerOpen = false;
            for (int i = 0; i < childCount; i++) {
                View child = getChildAt(i);
                if (!m۱۳۱۱۵i(child)) {
                    this.f۱۰۶۶۱J.add(child);
                } else if (m۱۳۱۱۴h(child)) {
                    isDrawerOpen = true;
                    child.addFocusables(views, direction, focusableMode);
                }
            }
            if (!isDrawerOpen) {
                int nonDrawerViewsCount = this.f۱۰۶۶۱J.size();
                for (int i2 = 0; i2 < nonDrawerViewsCount; i2++) {
                    View child2 = this.f۱۰۶۶۱J.get(i2);
                    if (child2.getVisibility() == 0) {
                        child2.addFocusables(views, direction, focusableMode);
                    }
                }
            }
            this.f۱۰۶۶۱J.clear();
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private boolean m۱۳۰۷۵f() {
        return m۱۳۱۰۶d() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public View m۱۳۱۰۶d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            if (m۱۳۱۱۵i(child) && m۱۳۱۱۶j(child)) {
                return child;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۰۸۲a() {
        if (!this.f۱۰۶۸۱t) {
            long now = SystemClock.uptimeMillis();
            MotionEvent cancelEvent = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(cancelEvent);
            }
            cancelEvent.recycle();
            this.f۱۰۶۸۱t = true;
        }
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode != 4 || !m۱۳۰۷۵f()) {
            return super.onKeyDown(keyCode, event);
        }
        event.startTracking();
        return true;
    }

    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode != 4) {
            return super.onKeyUp(keyCode, event);
        }
        View visibleDrawer = m۱۳۱۰۶d();
        if (visibleDrawer != null && m۱۳۱۰۵d(visibleDrawer) == 0) {
            m۱۳۰۹۵b();
        }
        return visibleDrawer != null;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable state) {
        View toOpen;
        if (!(state instanceof Cf)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Cf ss = (Cf) state;
        super.onRestoreInstanceState(ss.m۱۲۷۹۱a());
        int i = ss.f۱۰۶۹۴e;
        if (!(i == 0 || (toOpen = m۱۳۰۹۴b(i)) == null)) {
            m۱۳۱۱۷k(toOpen);
        }
        int i2 = ss.f۱۰۶۹۵f;
        if (i2 != 3) {
            m۱۳۰۸۴a(i2, 3);
        }
        int i3 = ss.f۱۰۶۹۶g;
        if (i3 != 3) {
            m۱۳۰۸۴a(i3, 5);
        }
        int i4 = ss.f۱۰۶۹۷h;
        if (i4 != 3) {
            m۱۳۰۸۴a(i4, 8388611);
        }
        int i5 = ss.f۱۰۶۹۸i;
        if (i5 != 3) {
            m۱۳۰۸۴a(i5, 8388613);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Cf ss = new Cf(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            Ce lp = (Ce) getChildAt(i).getLayoutParams();
            boolean isClosedAndOpening = false;
            boolean isOpenedAndNotClosing = lp.f۱۰۶۹۳d == 1;
            if (lp.f۱۰۶۹۳d == 2) {
                isClosedAndOpening = true;
            }
            if (isOpenedAndNotClosing || isClosedAndOpening) {
                ss.f۱۰۶۹۴e = lp.f۱۰۶۹۰a;
            } else {
                i++;
            }
        }
        ss.f۱۰۶۹۵f = this.f۱۰۶۷۷p;
        ss.f۱۰۶۹۶g = this.f۱۰۶۷۸q;
        ss.f۱۰۶۹۷h = this.f۱۰۶۷۹r;
        ss.f۱۰۶۹۸i = this.f۱۰۶۸۰s;
        return ss;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        if (m۱۳۱۰۲c() != null || m۱۳۱۱۵i(child)) {
            Cu.m۱۳۰۰۷f(child, 4);
        } else {
            Cu.m۱۳۰۰۷f(child, 1);
        }
        if (!f۱۰۶۵۰O) {
            Cu.m۱۲۹۸۵a(child, this.f۱۰۶۶۴c);
        }
    }

    /* renamed from: m  reason: contains not printable characters */
    static boolean m۱۳۰۸۱m(View child) {
        return (Cu.m۱۳۰۱۲i(child) == 4 || Cu.m۱۳۰۱۲i(child) == 2) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: android.support.v4.widget.DrawerLayout$f  reason: invalid class name */
    public static class Cf extends AbstractCa {
        public static final Parcelable.Creator<Cf> CREATOR = new Ca();

        /* renamed from: e  reason: contains not printable characters */
        int f۱۰۶۹۴e = 0;

        /* renamed from: f  reason: contains not printable characters */
        int f۱۰۶۹۵f;

        /* renamed from: g  reason: contains not printable characters */
        int f۱۰۶۹۶g;

        /* renamed from: h  reason: contains not printable characters */
        int f۱۰۶۹۷h;

        /* renamed from: i  reason: contains not printable characters */
        int f۱۰۶۹۸i;

        public Cf(Parcel in, ClassLoader loader) {
            super(in, loader);
            this.f۱۰۶۹۴e = in.readInt();
            this.f۱۰۶۹۵f = in.readInt();
            this.f۱۰۶۹۶g = in.readInt();
            this.f۱۰۶۹۷h = in.readInt();
            this.f۱۰۶۹۸i = in.readInt();
        }

        public Cf(Parcelable superState) {
            super(superState);
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCa
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeInt(this.f۱۰۶۹۴e);
            dest.writeInt(this.f۱۰۶۹۵f);
            dest.writeInt(this.f۱۰۶۹۶g);
            dest.writeInt(this.f۱۰۶۹۷h);
            dest.writeInt(this.f۱۰۶۹۸i);
        }

        /* renamed from: android.support.v4.widget.DrawerLayout$f$a  reason: invalid class name */
        static class Ca implements Parcelable.ClassLoaderCreator<Cf> {
            Ca() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public Cf createFromParcel(Parcel in, ClassLoader loader) {
                return new Cf(in, loader);
            }

            @Override // android.os.Parcelable.Creator
            public Cf createFromParcel(Parcel in) {
                return new Cf(in, null);
            }

            @Override // android.os.Parcelable.Creator
            public Cf[] newArray(int size) {
                return new Cf[size];
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.DrawerLayout$g  reason: invalid class name */
    public class Cg extends Cs.AbstractCc {

        /* renamed from: a  reason: contains not printable characters */
        private final int f۱۰۶۹۹a;

        /* renamed from: b  reason: contains not printable characters */
        private Cs f۱۰۷۰۰b;

        /* renamed from: c  reason: contains not printable characters */
        private final Runnable f۱۰۷۰۱c = new RunnableCa();

        /* renamed from: android.support.v4.widget.DrawerLayout$g$a  reason: invalid class name */
        class RunnableCa implements Runnable {
            RunnableCa() {
            }

            public void run() {
                Cg.this.m۱۳۱۳۲a();
            }
        }

        Cg(int gravity) {
            this.f۱۰۶۹۹a = gravity;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۱۳۴a(Cs dragger) {
            this.f۱۰۷۰۰b = dragger;
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۳۱۳۹b() {
            DrawerLayout.this.removeCallbacks(this.f۱۰۷۰۱c);
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۳۱۴۲b(View child, int pointerId) {
            return DrawerLayout.this.m۱۳۱۱۵i(child) && DrawerLayout.this.m۱۳۰۹۳a(child, this.f۱۰۶۹۹a) && DrawerLayout.this.m۱۳۱۰۵d(child) == 0;
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۳۱۴۳c(int state) {
            DrawerLayout.this.m۱۳۰۸۵a(this.f۱۰۶۹۹a, state, this.f۱۰۷۰۰b.m۱۳۳۵۰b());
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۱۳۷a(View changedView, int left, int top, int dx, int dy) {
            float offset;
            int childWidth = changedView.getWidth();
            if (DrawerLayout.this.m۱۳۰۹۳a(changedView, 3)) {
                offset = ((float) (childWidth + left)) / ((float) childWidth);
            } else {
                offset = ((float) (DrawerLayout.this.getWidth() - left)) / ((float) childWidth);
            }
            DrawerLayout.this.m۱۳۱۰۴c(changedView, offset);
            changedView.setVisibility(offset == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۱۳۶a(View capturedChild, int activePointerId) {
            ((Ce) capturedChild.getLayoutParams()).f۱۰۶۹۲c = false;
            m۱۳۱۲۹c();
        }

        /* renamed from: c  reason: contains not printable characters */
        private void m۱۳۱۲۹c() {
            int otherGrav = 3;
            if (this.f۱۰۶۹۹a == 3) {
                otherGrav = 5;
            }
            View toClose = DrawerLayout.this.m۱۳۰۹۴b(otherGrav);
            if (toClose != null) {
                DrawerLayout.this.m۱۳۰۸۸a(toClose);
            }
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۱۳۵a(View releasedChild, float xvel, float yvel) {
            int width;
            float offset = DrawerLayout.this.m۱۳۱۱۰f(releasedChild);
            int childWidth = releasedChild.getWidth();
            if (DrawerLayout.this.m۱۳۰۹۳a(releasedChild, 3)) {
                width = (xvel > 0.0f || (xvel == 0.0f && offset > 0.5f)) ? 0 : -childWidth;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                width = (xvel < 0.0f || (xvel == 0.0f && offset > 0.5f)) ? width2 - childWidth : width2;
            }
            this.f۱۰۷۰۰b.m۱۳۳۶۱d(width, releasedChild.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۳۱۴۰b(int edgeFlags, int pointerId) {
            DrawerLayout.this.postDelayed(this.f۱۰۷۰۱c, 160);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۱۳۲a() {
            View toCapture;
            int childLeft;
            int peekDistance = this.f۱۰۷۰۰b.m۱۳۳۵۶c();
            int i = 0;
            boolean leftEdge = this.f۱۰۶۹۹a == 3;
            if (leftEdge) {
                toCapture = DrawerLayout.this.m۱۳۰۹۴b(3);
                if (toCapture != null) {
                    i = -toCapture.getWidth();
                }
                childLeft = i + peekDistance;
            } else {
                toCapture = DrawerLayout.this.m۱۳۰۹۴b(5);
                childLeft = DrawerLayout.this.getWidth() - peekDistance;
            }
            if (toCapture == null) {
                return;
            }
            if (((leftEdge && toCapture.getLeft() < childLeft) || (!leftEdge && toCapture.getLeft() > childLeft)) && DrawerLayout.this.m۱۳۱۰۵d(toCapture) == 0) {
                this.f۱۰۷۰۰b.m۱۳۳۵۵b(toCapture, childLeft, toCapture.getTop());
                ((Ce) toCapture.getLayoutParams()).f۱۰۶۹۲c = true;
                DrawerLayout.this.invalidate();
                m۱۳۱۲۹c();
                DrawerLayout.this.m۱۳۰۸۲a();
            }
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۳۱۴۱b(int edgeFlags) {
            return false;
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۱۳۳a(int edgeFlags, int pointerId) {
            View toCapture;
            if ((edgeFlags & 1) == 1) {
                toCapture = DrawerLayout.this.m۱۳۰۹۴b(3);
            } else {
                toCapture = DrawerLayout.this.m۱۳۰۹۴b(5);
            }
            if (toCapture != null && DrawerLayout.this.m۱۳۱۰۵d(toCapture) == 0) {
                this.f۱۰۷۰۰b.m۱۳۳۴۵a(toCapture, pointerId);
            }
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۳۱۳۰a(View child) {
            if (DrawerLayout.this.m۱۳۱۱۵i(child)) {
                return child.getWidth();
            }
            return 0;
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۳۱۳۱a(View child, int left, int dx) {
            if (DrawerLayout.this.m۱۳۰۹۳a(child, 3)) {
                return Math.max(-child.getWidth(), Math.min(left, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - child.getWidth(), Math.min(left, width));
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public int m۱۳۱۳۸b(View child, int top, int dy) {
            return child.getTop();
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$e  reason: invalid class name */
    public static class Ce extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: contains not printable characters */
        public int f۱۰۶۹۰a = 0;

        /* renamed from: b  reason: contains not printable characters */
        float f۱۰۶۹۱b;

        /* renamed from: c  reason: contains not printable characters */
        boolean f۱۰۶۹۲c;

        /* renamed from: d  reason: contains not printable characters */
        int f۱۰۶۹۳d;

        public Ce(Context c, AttributeSet attrs) {
            super(c, attrs);
            TypedArray a = c.obtainStyledAttributes(attrs, DrawerLayout.f۱۰۶۴۹N);
            this.f۱۰۶۹۰a = a.getInt(0, 0);
            a.recycle();
        }

        public Ce(int width, int height) {
            super(width, height);
        }

        public Ce(Ce source) {
            super((ViewGroup.MarginLayoutParams) source);
            this.f۱۰۶۹۰a = source.f۱۰۶۹۰a;
        }

        public Ce(ViewGroup.LayoutParams source) {
            super(source);
        }

        public Ce(ViewGroup.MarginLayoutParams source) {
            super(source);
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$b  reason: invalid class name */
    class Cb extends android.support.p۰۴۳v4.view.Cb {

        /* renamed from: c  reason: contains not printable characters */
        private final Rect f۱۰۶۸۸c = new Rect();

        Cb() {
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۱۲۰a(View host, android.support.p۰۴۳v4.view.p۰۴۵d0.Cc info2) {
            if (DrawerLayout.f۱۰۶۵۰O) {
                super.m۱۲۷۹۷a(host, info2);
            } else {
                android.support.p۰۴۳v4.view.p۰۴۵d0.Cc superNode = android.support.p۰۴۳v4.view.p۰۴۵d0.Cc.m۱۲۸۳۱a(info2);
                super.m۱۲۷۹۷a(host, superNode);
                info2.m۱۲۸۵۵c(host);
                ViewParent parent = Cu.m۱۳۰۱۹p(host);
                if (parent instanceof View) {
                    info2.m۱۲۸۴۸b((View) parent);
                }
                m۱۳۱۱۸a(info2, superNode);
                superNode.m۱۲۸۹۱u();
                m۱۳۱۱۹a(info2, (ViewGroup) host);
            }
            info2.m۱۲۸۴۲a((CharSequence) DrawerLayout.class.getName());
            info2.m۱۲۸۷۲h(false);
            info2.m۱۲۸۷۳i(false);
            info2.m۱۲۸۴۵a(Cc.Ca.f۱۰۵۹۴b);
            info2.m۱۲۸۴۵a(Cc.Ca.f۱۰۵۹۵c);
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۳۱۲۳b(View host, AccessibilityEvent event) {
            super.m۱۲۸۰۱b(host, event);
            event.setClassName(DrawerLayout.class.getName());
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۳۱۲۱a(View host, AccessibilityEvent event) {
            CharSequence title;
            if (event.getEventType() != 32) {
                return super.m۱۲۷۹۹a(host, event);
            }
            List<CharSequence> eventText = event.getText();
            View visibleDrawer = DrawerLayout.this.m۱۳۱۰۶d();
            if (visibleDrawer == null || (title = DrawerLayout.this.m۱۳۱۰۷d(DrawerLayout.this.m۱۳۱۰۸e(visibleDrawer))) == null) {
                return true;
            }
            eventText.add(title);
            return true;
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۳۱۲۲a(ViewGroup host, View child, AccessibilityEvent event) {
            if (DrawerLayout.f۱۰۶۵۰O || DrawerLayout.m۱۳۰۸۱m(child)) {
                return super.m۱۲۸۰۰a(host, child, event);
            }
            return false;
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۳۱۱۹a(android.support.p۰۴۳v4.view.p۰۴۵d0.Cc info2, ViewGroup v) {
            int childCount = v.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = v.getChildAt(i);
                if (DrawerLayout.m۱۳۰۸۱m(child)) {
                    info2.m۱۲۸۴۰a(child);
                }
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۳۱۱۸a(android.support.p۰۴۳v4.view.p۰۴۵d0.Cc dest, android.support.p۰۴۳v4.view.p۰۴۵d0.Cc src) {
            Rect rect = this.f۱۰۶۸۸c;
            src.m۱۲۸۳۹a(rect);
            dest.m۱۲۸۵۴c(rect);
            src.m۱۲۸۴۷b(rect);
            dest.m۱۲۸۶۰d(rect);
            dest.m۱۲۸۸۳n(src.m۱۲۸۹۰t());
            dest.m۱۲۸۶۴e(src.m۱۲۸۶۶f());
            dest.m۱۲۸۴۲a(src.m۱۲۸۵۳c());
            dest.m۱۲۸۵۰b(src.m۱۲۸۵۹d());
            dest.m۱۲۸۷۰g(src.m۱۲۸۸۲m());
            dest.m۱۲۸۶۲d(src.m۱۲۸۸۰l());
            dest.m۱۲۸۷۲h(src.m۱۲۸۸۴n());
            dest.m۱۲۸۷۳i(src.m۱۲۸۸۵o());
            dest.m۱۲۸۴۴a(src.m۱۲۸۷۴i());
            dest.m۱۲۸۷۹l(src.m۱۲۸۸۹s());
            dest.m۱۲۸۷۵j(src.m۱۲۸۸۶p());
            dest.m۱۲۸۳۸a(src.m۱۲۸۳۷a());
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$c  reason: invalid class name */
    static final class Cc extends android.support.p۰۴۳v4.view.Cb {
        Cc() {
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۱۲۴a(View child, android.support.p۰۴۳v4.view.p۰۴۵d0.Cc info2) {
            super.m۱۲۷۹۷a(child, info2);
            if (!DrawerLayout.m۱۳۰۸۱m(child)) {
                info2.m۱۲۸۴۸b((View) null);
            }
        }
    }
}
