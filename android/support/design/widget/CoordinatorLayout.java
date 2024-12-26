package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p۰۴۳v4.view.AbstractCa;
import android.support.p۰۴۳v4.view.AbstractCm;
import android.support.p۰۴۳v4.view.AbstractCp;
import android.support.p۰۴۳v4.view.Cc0;
import android.support.p۰۴۳v4.view.Cd;
import android.support.p۰۴۳v4.view.Co;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.widget.Ct;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p۰۰۰a.p۰۰۵b.p۰۰۷b.Cb;
import p۰۰۰a.p۰۰۵b.p۰۰۷b.Cc;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCj;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cl;

public class CoordinatorLayout extends ViewGroup implements AbstractCm {

    /* renamed from: v  reason: contains not printable characters */
    static final String f۹۶۱۰v;

    /* renamed from: w  reason: contains not printable characters */
    static final Class<?>[] f۹۶۱۱w = {Context.class, AttributeSet.class};

    /* renamed from: x  reason: contains not printable characters */
    static final ThreadLocal<Map<String, Constructor<AbstractCc>>> f۹۶۱۲x = new ThreadLocal<>();

    /* renamed from: y  reason: contains not printable characters */
    static final Comparator<View> f۹۶۱۳y;

    /* renamed from: z  reason: contains not printable characters */
    private static final AbstractCj<Rect> f۹۶۱۴z = new Cl(12);

    /* renamed from: c  reason: contains not printable characters */
    private final List<View> f۹۶۱۵c;

    /* renamed from: d  reason: contains not printable characters */
    private final android.support.p۰۴۳v4.widget.Cf<View> f۹۶۱۶d;

    /* renamed from: e  reason: contains not printable characters */
    private final List<View> f۹۶۱۷e;

    /* renamed from: f  reason: contains not printable characters */
    private final List<View> f۹۶۱۸f;

    /* renamed from: g  reason: contains not printable characters */
    private final int[] f۹۶۱۹g;

    /* renamed from: h  reason: contains not printable characters */
    private Paint f۹۶۲۰h;

    /* renamed from: i  reason: contains not printable characters */
    private boolean f۹۶۲۱i;

    /* renamed from: j  reason: contains not printable characters */
    private boolean f۹۶۲۲j;

    /* renamed from: k  reason: contains not printable characters */
    private int[] f۹۶۲۳k;

    /* renamed from: l  reason: contains not printable characters */
    private View f۹۶۲۴l;

    /* renamed from: m  reason: contains not printable characters */
    private View f۹۶۲۵m;

    /* renamed from: n  reason: contains not printable characters */
    private ViewTreeObserver$OnPreDrawListenerCg f۹۶۲۶n;

    /* renamed from: o  reason: contains not printable characters */
    private boolean f۹۶۲۷o;

    /* renamed from: p  reason: contains not printable characters */
    private Cc0 f۹۶۲۸p;

    /* renamed from: q  reason: contains not printable characters */
    private boolean f۹۶۲۹q;

    /* renamed from: r  reason: contains not printable characters */
    private Drawable f۹۶۳۰r;

    /* renamed from: s  reason: contains not printable characters */
    ViewGroup.OnHierarchyChangeListener f۹۶۳۱s;

    /* renamed from: t  reason: contains not printable characters */
    private AbstractCp f۹۶۳۲t;

    /* renamed from: u  reason: contains not printable characters */
    private final Co f۹۶۳۳u;

    /* renamed from: android.support.design.widget.CoordinatorLayout$b  reason: invalid class name */
    public interface AbstractCb {
        AbstractCc getBehavior();
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: android.support.design.widget.CoordinatorLayout$d  reason: invalid class name */
    public @interface AbstractCd {
        Class<? extends AbstractCc> value();
    }

    static {
        Package pkg = CoordinatorLayout.class.getPackage();
        f۹۶۱۰v = pkg != null ? pkg.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f۹۶۱۳y = new Ci();
        } else {
            f۹۶۱۳y = null;
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private static Rect m۱۱۵۲۷d() {
        Rect rect = f۹۶۱۴z.m۱۰۶۳۴a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۱۵۱۴a(Rect rect) {
        rect.setEmpty();
        f۹۶۱۴z.m۱۰۶۳۵a(rect);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attrs) {
        this(context, attrs, p۰۰۰a.p۰۰۵b.p۰۰۷b.Ca.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a;
        this.f۹۶۱۵c = new ArrayList();
        this.f۹۶۱۶d = new android.support.p۰۴۳v4.widget.Cf<>();
        this.f۹۶۱۷e = new ArrayList();
        this.f۹۶۱۸f = new ArrayList();
        this.f۹۶۱۹g = new int[2];
        this.f۹۶۳۳u = new Co(this);
        if (defStyleAttr == 0) {
            a = context.obtainStyledAttributes(attrs, Cc.CoordinatorLayout, 0, Cb.Widget_Support_CoordinatorLayout);
        } else {
            a = context.obtainStyledAttributes(attrs, Cc.CoordinatorLayout, defStyleAttr, 0);
        }
        int keylineArrayRes = a.getResourceId(Cc.CoordinatorLayout_keylines, 0);
        if (keylineArrayRes != 0) {
            Resources res = context.getResources();
            this.f۹۶۲۳k = res.getIntArray(keylineArrayRes);
            float density = res.getDisplayMetrics().density;
            int count = this.f۹۶۲۳k.length;
            for (int i = 0; i < count; i++) {
                int[] iArr = this.f۹۶۲۳k;
                iArr[i] = (int) (((float) iArr[i]) * density);
            }
        }
        this.f۹۶۳۰r = a.getDrawable(Cc.CoordinatorLayout_statusBarBackground);
        a.recycle();
        m۱۱۵۳۳f();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerCe());
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f۹۶۳۱s = onHierarchyChangeListener;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m۱۱۵۲۰a(false);
        if (this.f۹۶۲۷o) {
            if (this.f۹۶۲۶n == null) {
                this.f۹۶۲۶n = new ViewTreeObserver$OnPreDrawListenerCg();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f۹۶۲۶n);
        }
        if (this.f۹۶۲۸p == null && Cu.m۱۳۰۱۱h(this)) {
            Cu.m۱۲۹۷۱C(this);
        }
        this.f۹۶۲۲j = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m۱۱۵۲۰a(false);
        if (this.f۹۶۲۷o && this.f۹۶۲۶n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f۹۶۲۶n);
        }
        View view = this.f۹۶۲۵m;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f۹۶۲۲j = false;
    }

    public void setStatusBarBackground(Drawable bg) {
        Drawable drawable = this.f۹۶۳۰r;
        if (drawable != bg) {
            Drawable drawable2 = null;
            if (drawable != null) {
                drawable.setCallback(null);
            }
            if (bg != null) {
                drawable2 = bg.mutate();
            }
            this.f۹۶۳۰r = drawable2;
            Drawable drawable3 = this.f۹۶۳۰r;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f۹۶۳۰r.setState(getDrawableState());
                }
                android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۴a(this.f۹۶۳۰r, Cu.m۱۳۰۱۴k(this));
                this.f۹۶۳۰r.setVisible(getVisibility() == 0, false);
                this.f۹۶۳۰r.setCallback(this);
            }
            Cu.m۱۲۹۷۰B(this);
        }
    }

    public Drawable getStatusBarBackground() {
        return this.f۹۶۳۰r;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] state = getDrawableState();
        boolean changed = false;
        Drawable d = this.f۹۶۳۰r;
        if (d != null && d.isStateful()) {
            changed = false | d.setState(state);
        }
        if (changed) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || who == this.f۹۶۳۰r;
    }

    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        boolean visible = visibility == 0;
        Drawable drawable = this.f۹۶۳۰r;
        if (drawable != null && drawable.isVisible() != visible) {
            this.f۹۶۳۰r.setVisible(visible, false);
        }
    }

    public void setStatusBarBackgroundResource(int resId) {
        setStatusBarBackground(resId != 0 ? android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۶c(getContext(), resId) : null);
    }

    public void setStatusBarBackgroundColor(int color) {
        setStatusBarBackground(new ColorDrawable(color));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final Cc0 m۱۱۵۳۵a(Cc0 insets) {
        if (p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ci.m۱۰۶۳۳a(this.f۹۶۲۸p, insets)) {
            return insets;
        }
        this.f۹۶۲۸p = insets;
        boolean z = true;
        this.f۹۶۲۹q = insets != null && insets.m۱۲۸۲۲e() > 0;
        if (this.f۹۶۲۹q || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        Cc0 insets2 = m۱۱۵۲۳b(insets);
        requestLayout();
        return insets2;
    }

    public final Cc0 getLastWindowInsets() {
        return this.f۹۶۲۸p;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۵۲۰a(boolean notifyOnInterceptTouchEvent) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            AbstractCc b = ((Cf) child.getLayoutParams()).m۱۱۶۰۳d();
            if (b != null) {
                long now = SystemClock.uptimeMillis();
                MotionEvent cancelEvent = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
                if (notifyOnInterceptTouchEvent) {
                    b.m۱۱۵۷۵a(this, child, cancelEvent);
                } else {
                    b.m۱۱۵۸۰b(this, child, cancelEvent);
                }
                cancelEvent.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((Cf) getChildAt(i2).getLayoutParams()).m۱۱۶۰۷h();
        }
        this.f۹۶۲۴l = null;
        this.f۹۶۲۱i = false;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۵۱۹a(List<View> out) {
        out.clear();
        boolean useCustomOrder = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            out.add(getChildAt(useCustomOrder ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f۹۶۱۳y;
        if (comparator != null) {
            Collections.sort(out, comparator);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۱۵۲۱a(MotionEvent ev, int type) {
        boolean intercepted = false;
        boolean newBlock = false;
        MotionEvent cancelEvent = null;
        int action = ev.getActionMasked();
        List<View> topmostChildList = this.f۹۶۱۷e;
        m۱۱۵۱۹a(topmostChildList);
        int childCount = topmostChildList.size();
        for (int i = 0; i < childCount; i++) {
            View child = topmostChildList.get(i);
            Cf lp = (Cf) child.getLayoutParams();
            AbstractCc b = lp.m۱۱۶۰۳d();
            boolean z = true;
            if (!(intercepted || newBlock) || action == 0) {
                if (!intercepted && b != null) {
                    if (type == 0) {
                        intercepted = b.m۱۱۵۷۵a(this, child, ev);
                    } else if (type == 1) {
                        intercepted = b.m۱۱۵۸۰b(this, child, ev);
                    }
                    if (intercepted) {
                        this.f۹۶۲۴l = child;
                    }
                }
                boolean wasBlocking = lp.m۱۱۶۰۰b();
                boolean isBlocking = lp.m۱۱۶۰۱b(this, child);
                if (!isBlocking || wasBlocking) {
                    z = false;
                }
                newBlock = z;
                if (isBlocking && !newBlock) {
                    break;
                }
            } else if (b != null) {
                if (cancelEvent == null) {
                    long now = SystemClock.uptimeMillis();
                    cancelEvent = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
                }
                if (type == 0) {
                    b.m۱۱۵۷۵a(this, child, cancelEvent);
                } else if (type == 1) {
                    b.m۱۱۵۸۰b(this, child, cancelEvent);
                }
            }
        }
        topmostChildList.clear();
        return intercepted;
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 0) {
            m۱۱۵۲۰a(true);
        }
        boolean intercepted = m۱۱۵۲۱a(ev, 0);
        if (action == 1 || action == 3) {
            m۱۱۵۲۰a(true);
        }
        return intercepted;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r6 != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 0
            r3 = 0
            r4 = 0
            int r5 = r19.getActionMasked()
            android.view.View r6 = r0.f۹۶۲۴l
            r7 = 1
            if (r6 != 0) goto L_0x0017
            boolean r6 = r0.m۱۱۵۲۱a(r1, r7)
            r3 = r6
            if (r6 == 0) goto L_0x002b
        L_0x0017:
            android.view.View r6 = r0.f۹۶۲۴l
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.design.widget.CoordinatorLayout$f r6 = (android.support.design.widget.CoordinatorLayout.Cf) r6
            android.support.design.widget.CoordinatorLayout$c r8 = r6.m۱۱۶۰۳d()
            if (r8 == 0) goto L_0x002b
            android.view.View r9 = r0.f۹۶۲۴l
            boolean r2 = r8.m۱۱۵۸۰b(r0, r9, r1)
        L_0x002b:
            android.view.View r6 = r0.f۹۶۲۴l
            if (r6 != 0) goto L_0x0035
            boolean r6 = super.onTouchEvent(r19)
            r2 = r2 | r6
            goto L_0x004c
        L_0x0035:
            if (r3 == 0) goto L_0x004c
            if (r4 != 0) goto L_0x0049
            long r16 = android.os.SystemClock.uptimeMillis()
            r12 = 3
            r13 = 0
            r14 = 0
            r15 = 0
            r8 = r16
            r10 = r16
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r8, r10, r12, r13, r14, r15)
        L_0x0049:
            super.onTouchEvent(r4)
        L_0x004c:
            if (r4 == 0) goto L_0x0052
            r4.recycle()
        L_0x0052:
            if (r5 == r7) goto L_0x0057
            r6 = 3
            if (r5 != r6) goto L_0x005b
        L_0x0057:
            r6 = 0
            r0.m۱۱۵۲۰a(r6)
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
        if (disallowIntercept && !this.f۹۶۲۱i) {
            m۱۱۵۲۰a(false);
            this.f۹۶۲۱i = true;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۱۵۲۲b(int index) {
        int[] iArr = this.f۹۶۲۳k;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + index);
            return 0;
        } else if (index >= 0 && index < iArr.length) {
            return iArr[index];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + index + " out of range for " + this);
            return 0;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static AbstractCc m۱۱۵۱۳a(Context context, AttributeSet attrs, String name) {
        String fullName;
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        if (name.startsWith(".")) {
            fullName = context.getPackageName() + name;
        } else if (name.indexOf(46) >= 0) {
            fullName = name;
        } else if (!TextUtils.isEmpty(f۹۶۱۰v)) {
            fullName = f۹۶۱۰v + '.' + name;
        } else {
            fullName = name;
        }
        try {
            Map<String, Constructor<Behavior>> constructors = f۹۶۱۲x.get();
            if (constructors == null) {
                constructors = new HashMap<>();
                f۹۶۱۲x.set(constructors);
            }
            Constructor<Behavior> c = constructors.get(fullName);
            if (c == null) {
                c = context.getClassLoader().loadClass(fullName).getConstructor(f۹۶۱۱w);
                c.setAccessible(true);
                constructors.put(fullName, c);
            }
            return (AbstractCc) c.newInstance(context, attrs);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + fullName, e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public Cf m۱۱۵۵۷d(View child) {
        Cf result = (Cf) child.getLayoutParams();
        if (!result.f۹۶۳۷b) {
            if (child instanceof AbstractCb) {
                AbstractCc attachedBehavior = ((AbstractCb) child).getBehavior();
                if (attachedBehavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                result.m۱۱۵۹۴a(attachedBehavior);
                result.f۹۶۳۷b = true;
            } else {
                AbstractCd defaultBehavior = null;
                for (Class<?> childClass = child.getClass(); childClass != null; childClass = childClass.getSuperclass()) {
                    AbstractCd dVar = (AbstractCd) childClass.getAnnotation(AbstractCd.class);
                    defaultBehavior = dVar;
                    if (dVar != null) {
                        break;
                    }
                }
                if (defaultBehavior != null) {
                    try {
                        result.m۱۱۵۹۴a((AbstractCc) defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + defaultBehavior.value().getName() + " could not be instantiated. Did you forget" + " a default constructor?", e);
                    }
                }
                result.f۹۶۳۷b = true;
            }
        }
        return result;
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۱۵۳۰e() {
        this.f۹۶۱۵c.clear();
        this.f۹۶۱۶d.m۱۳۲۴۱a();
        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            View view = getChildAt(i);
            Cf lp = m۱۱۵۵۷d(view);
            lp.m۱۱۵۹۱a(this, view);
            this.f۹۶۱۶d.m۱۳۲۴۲a(view);
            for (int j = 0; j < count; j++) {
                if (j != i) {
                    View other = getChildAt(j);
                    if (lp.m۱۱۵۹۸a(this, view, other)) {
                        if (!this.f۹۶۱۶d.m۱۳۲۴۵b(other)) {
                            this.f۹۶۱۶d.m۱۳۲۴۲a(other);
                        }
                        this.f۹۶۱۶d.m۱۳۲۴۳a(other, view);
                    }
                }
            }
        }
        this.f۹۶۱۵c.addAll(this.f۹۶۱۶d.m۱۳۲۴۴b());
        Collections.reverse(this.f۹۶۱۵c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۵۴۴a(View descendant, Rect out) {
        Ct.m۱۳۳۷۶a(this, descendant, out);
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۵۴۰a(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        measureChildWithMargins(child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013a, code lost:
        if (r29.m۱۱۵۷۲a(r35, r21, r26, r23, r28, 0) == false) goto L_0x014b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r36, int r37) {
        /*
        // Method dump skipped, instructions count: 433
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* renamed from: b  reason: contains not printable characters */
    private Cc0 m۱۱۵۲۳b(Cc0 insets) {
        AbstractCc b;
        if (insets.m۱۲۸۲۴g()) {
            return insets;
        }
        int z = getChildCount();
        for (int i = 0; i < z; i++) {
            View child = getChildAt(i);
            if (Cu.m۱۳۰۱۱h(child) && (b = ((Cf) child.getLayoutParams()).m۱۱۶۰۳d()) != null) {
                insets = b.m۱۱۵۵۹a(this, child, insets);
                if (insets.m۱۲۸۲۴g()) {
                    break;
                }
            }
        }
        return insets;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۱۵۵۵c(View child, int layoutDirection) {
        Cf lp = (Cf) child.getLayoutParams();
        if (!lp.m۱۱۵۹۶a()) {
            View view = lp.f۹۶۴۶k;
            if (view != null) {
                m۱۱۵۱۸a(child, view, layoutDirection);
                return;
            }
            int i = lp.f۹۶۴۰e;
            if (i >= 0) {
                m۱۱۵۲۴b(child, i, layoutDirection);
            } else {
                m۱۱۵۲۸d(child, layoutDirection);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        AbstractCc behavior;
        int layoutDirection = Cu.m۱۳۰۱۴k(this);
        int childCount = this.f۹۶۱۵c.size();
        for (int i = 0; i < childCount; i++) {
            View child = this.f۹۶۱۵c.get(i);
            if (child.getVisibility() != 8 && ((behavior = ((Cf) child.getLayoutParams()).m۱۱۶۰۳d()) == null || !behavior.m۱۱۵۷۱a(this, child, layoutDirection))) {
                m۱۱۵۵۵c(child, layoutDirection);
            }
        }
    }

    public void onDraw(Canvas c) {
        super.onDraw(c);
        if (this.f۹۶۲۹q && this.f۹۶۳۰r != null) {
            Cc0 c0Var = this.f۹۶۲۸p;
            int inset = c0Var != null ? c0Var.m۱۲۸۲۲e() : 0;
            if (inset > 0) {
                this.f۹۶۳۰r.setBounds(0, 0, getWidth(), inset);
                this.f۹۶۳۰r.draw(c);
            }
        }
    }

    public void setFitsSystemWindows(boolean fitSystemWindows) {
        super.setFitsSystemWindows(fitSystemWindows);
        m۱۱۵۳۳f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۱۵۵۶c(View child, Rect r) {
        ((Cf) child.getLayoutParams()).m۱۱۵۹۳a(r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۵۵۱b(View child, Rect out) {
        out.set(((Cf) child.getLayoutParams()).m۱۱۶۰۵f());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۵۴۶a(View child, boolean transform, Rect out) {
        if (child.isLayoutRequested() || child.getVisibility() == 8) {
            out.setEmpty();
        } else if (transform) {
            m۱۱۵۴۴a(child, out);
        } else {
            out.set(child.getLeft(), child.getTop(), child.getRight(), child.getBottom());
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۵۱۶a(View child, int layoutDirection, Rect anchorRect, Rect out, Cf lp, int childWidth, int childHeight) {
        int left;
        int top;
        int absGravity = Cd.m۱۲۸۲۵a(m۱۱۵۲۵c(lp.f۹۶۳۸c), layoutDirection);
        int absAnchorGravity = Cd.m۱۲۸۲۵a(m۱۱۵۲۶d(lp.f۹۶۳۹d), layoutDirection);
        int hgrav = absGravity & 7;
        int vgrav = absGravity & 112;
        int anchorHgrav = absAnchorGravity & 7;
        int anchorVgrav = absAnchorGravity & 112;
        if (anchorHgrav == 1) {
            left = anchorRect.left + (anchorRect.width() / 2);
        } else if (anchorHgrav != 5) {
            left = anchorRect.left;
        } else {
            left = anchorRect.right;
        }
        if (anchorVgrav == 16) {
            top = anchorRect.top + (anchorRect.height() / 2);
        } else if (anchorVgrav != 80) {
            top = anchorRect.top;
        } else {
            top = anchorRect.bottom;
        }
        if (hgrav == 1) {
            left -= childWidth / 2;
        } else if (hgrav != 5) {
            left -= childWidth;
        }
        if (vgrav == 16) {
            top -= childHeight / 2;
        } else if (vgrav != 80) {
            top -= childHeight;
        }
        out.set(left, top, left + childWidth, top + childHeight);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۵۱۵a(Cf lp, Rect out, int childWidth, int childHeight) {
        int width = getWidth();
        int height = getHeight();
        int left = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lp).leftMargin, Math.min(out.left, ((width - getPaddingRight()) - childWidth) - ((ViewGroup.MarginLayoutParams) lp).rightMargin));
        int top = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) lp).topMargin, Math.min(out.top, ((height - getPaddingBottom()) - childHeight) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin));
        out.set(left, top, left + childWidth, top + childHeight);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۵۴۳a(View child, int layoutDirection, Rect anchorRect, Rect out) {
        Cf lp = (Cf) child.getLayoutParams();
        int childWidth = child.getMeasuredWidth();
        int childHeight = child.getMeasuredHeight();
        m۱۱۵۱۶a(child, layoutDirection, anchorRect, out, lp, childWidth, childHeight);
        m۱۱۵۱۵a(lp, out, childWidth, childHeight);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۵۱۸a(View child, View anchor, int layoutDirection) {
        Rect anchorRect = m۱۱۵۲۷d();
        Rect childRect = m۱۱۵۲۷d();
        try {
            m۱۱۵۴۴a(anchor, anchorRect);
            m۱۱۵۴۳a(child, layoutDirection, anchorRect, childRect);
            child.layout(childRect.left, childRect.top, childRect.right, childRect.bottom);
        } finally {
            m۱۱۵۱۴a(anchorRect);
            m۱۱۵۱۴a(childRect);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۱۵۲۴b(View child, int keyline, int layoutDirection) {
        int keyline2;
        Cf lp = (Cf) child.getLayoutParams();
        int absGravity = Cd.m۱۲۸۲۵a(m۱۱۵۲۹e(lp.f۹۶۳۸c), layoutDirection);
        int hgrav = absGravity & 7;
        int vgrav = absGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int childWidth = child.getMeasuredWidth();
        int childHeight = child.getMeasuredHeight();
        if (layoutDirection == 1) {
            keyline2 = width - keyline;
        } else {
            keyline2 = keyline;
        }
        int left = m۱۱۵۲۲b(keyline2) - childWidth;
        int top = 0;
        if (hgrav == 1) {
            left += childWidth / 2;
        } else if (hgrav == 5) {
            left += childWidth;
        }
        if (vgrav == 16) {
            top = 0 + (childHeight / 2);
        } else if (vgrav == 80) {
            top = 0 + childHeight;
        }
        int left2 = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lp).leftMargin, Math.min(left, ((width - getPaddingRight()) - childWidth) - ((ViewGroup.MarginLayoutParams) lp).rightMargin));
        int top2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) lp).topMargin, Math.min(top, ((height - getPaddingBottom()) - childHeight) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin));
        child.layout(left2, top2, left2 + childWidth, top2 + childHeight);
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۱۵۲۸d(View child, int layoutDirection) {
        Cf lp = (Cf) child.getLayoutParams();
        Rect parent = m۱۱۵۲۷d();
        parent.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lp).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) lp).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) lp).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
        if (this.f۹۶۲۸p != null && Cu.m۱۳۰۱۱h(this) && !Cu.m۱۳۰۱۱h(child)) {
            parent.left += this.f۹۶۲۸p.m۱۲۸۲۰c();
            parent.top += this.f۹۶۲۸p.m۱۲۸۲۲e();
            parent.right -= this.f۹۶۲۸p.m۱۲۸۲۱d();
            parent.bottom -= this.f۹۶۲۸p.m۱۲۸۱۹b();
        }
        Rect out = m۱۱۵۲۷d();
        Cd.m۱۲۸۲۶a(m۱۱۵۲۶d(lp.f۹۶۳۸c), child.getMeasuredWidth(), child.getMeasuredHeight(), parent, out, layoutDirection);
        child.layout(out.left, out.top, out.right, out.bottom);
        m۱۱۵۱۴a(parent);
        m۱۱۵۱۴a(out);
    }

    /* renamed from: d  reason: contains not printable characters */
    private static int m۱۱۵۲۶d(int gravity) {
        if ((gravity & 7) == 0) {
            gravity |= 8388611;
        }
        if ((gravity & 112) == 0) {
            return gravity | 48;
        }
        return gravity;
    }

    /* renamed from: e  reason: contains not printable characters */
    private static int m۱۱۵۲۹e(int gravity) {
        if (gravity == 0) {
            return 8388661;
        }
        return gravity;
    }

    /* renamed from: c  reason: contains not printable characters */
    private static int m۱۱۵۲۵c(int gravity) {
        if (gravity == 0) {
            return 17;
        }
        return gravity;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        Cf lp = (Cf) child.getLayoutParams();
        AbstractCc cVar = lp.f۹۶۳۶a;
        if (cVar != null) {
            float scrimAlpha = cVar.m۱۱۵۸۴c(this, child);
            if (scrimAlpha > 0.0f) {
                if (this.f۹۶۲۰h == null) {
                    this.f۹۶۲۰h = new Paint();
                }
                this.f۹۶۲۰h.setColor(lp.f۹۶۳۶a.m۱۱۵۷۹b(this, child));
                this.f۹۶۲۰h.setAlpha(m۱۱۵۱۲a(Math.round(255.0f * scrimAlpha), 0, 255));
                int saved = canvas.save();
                if (child.isOpaque()) {
                    canvas.clipRect((float) child.getLeft(), (float) child.getTop(), (float) child.getRight(), (float) child.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f۹۶۲۰h);
                canvas.restoreToCount(saved);
            }
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۱۵۱۲a(int value, int min, int max) {
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۱۵۳۷a(int type) {
        boolean handled;
        int layoutDirection = Cu.m۱۳۰۱۴k(this);
        int childCount = this.f۹۶۱۵c.size();
        Rect inset = m۱۱۵۲۷d();
        Rect drawRect = m۱۱۵۲۷d();
        Rect lastDrawRect = m۱۱۵۲۷d();
        for (int i = 0; i < childCount; i++) {
            View child = this.f۹۶۱۵c.get(i);
            Cf lp = (Cf) child.getLayoutParams();
            if (type != 0 || child.getVisibility() != 8) {
                for (int j = 0; j < i; j++) {
                    if (lp.f۹۶۴۷l == this.f۹۶۱۵c.get(j)) {
                        m۱۱۵۵۰b(child, layoutDirection);
                    }
                }
                m۱۱۵۴۶a(child, true, drawRect);
                if (lp.f۹۶۴۲g != 0 && !drawRect.isEmpty()) {
                    int absInsetEdge = Cd.m۱۲۸۲۵a(lp.f۹۶۴۲g, layoutDirection);
                    int i2 = absInsetEdge & 112;
                    if (i2 == 48) {
                        inset.top = Math.max(inset.top, drawRect.bottom);
                    } else if (i2 == 80) {
                        inset.bottom = Math.max(inset.bottom, getHeight() - drawRect.top);
                    }
                    int i3 = absInsetEdge & 7;
                    if (i3 == 3) {
                        inset.left = Math.max(inset.left, drawRect.right);
                    } else if (i3 == 5) {
                        inset.right = Math.max(inset.right, getWidth() - drawRect.left);
                    }
                }
                if (lp.f۹۶۴۳h != 0 && child.getVisibility() == 0) {
                    m۱۱۵۱۷a(child, inset, layoutDirection);
                }
                int i4 = 2;
                if (type != 2) {
                    m۱۱۵۵۱b(child, lastDrawRect);
                    if (!lastDrawRect.equals(drawRect)) {
                        m۱۱۵۵۶c(child, drawRect);
                    }
                }
                int j2 = i + 1;
                while (j2 < childCount) {
                    View checkChild = this.f۹۶۱۵c.get(j2);
                    Cf checkLp = (Cf) checkChild.getLayoutParams();
                    AbstractCc b = checkLp.m۱۱۶۰۳d();
                    if (b != null && b.m۱۱۵۷۶a(this, checkChild, child)) {
                        if (type != 0 || !checkLp.m۱۱۶۰۴e()) {
                            if (type != i4) {
                                handled = b.m۱۱۵۸۱b(this, checkChild, child);
                            } else {
                                b.m۱۱۵۸۵c(this, checkChild, child);
                                handled = true;
                            }
                            if (type == 1) {
                                checkLp.m۱۱۵۹۵a(handled);
                            }
                        } else {
                            checkLp.m۱۱۶۰۶g();
                        }
                    }
                    j2++;
                    i4 = 2;
                }
            }
        }
        m۱۱۵۱۴a(inset);
        m۱۱۵۱۴a(drawRect);
        m۱۱۵۱۴a(lastDrawRect);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۵۱۷a(View child, Rect inset, int layoutDirection) {
        int distance;
        int i;
        int distance2;
        int i2;
        int distance3;
        int i3;
        int distance4;
        int i4;
        if (Cu.m۱۳۰۲۸y(child) && child.getWidth() > 0 && child.getHeight() > 0) {
            Cf lp = (Cf) child.getLayoutParams();
            AbstractCc behavior = lp.m۱۱۶۰۳d();
            Rect dodgeRect = m۱۱۵۲۷d();
            Rect bounds = m۱۱۵۲۷d();
            bounds.set(child.getLeft(), child.getTop(), child.getRight(), child.getBottom());
            if (behavior == null || !behavior.m۱۱۵۷۳a(this, child, dodgeRect)) {
                dodgeRect.set(bounds);
            } else if (!bounds.contains(dodgeRect)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + dodgeRect.toShortString() + " | Bounds:" + bounds.toShortString());
            }
            m۱۱۵۱۴a(bounds);
            if (dodgeRect.isEmpty()) {
                m۱۱۵۱۴a(dodgeRect);
                return;
            }
            int absDodgeInsetEdges = Cd.m۱۲۸۲۵a(lp.f۹۶۴۳h, layoutDirection);
            boolean offsetY = false;
            if ((absDodgeInsetEdges & 48) == 48 && (distance4 = (dodgeRect.top - ((ViewGroup.MarginLayoutParams) lp).topMargin) - lp.f۹۶۴۵j) < (i4 = inset.top)) {
                m۱۱۵۳۴f(child, i4 - distance4);
                offsetY = true;
            }
            if ((absDodgeInsetEdges & 80) == 80 && (distance3 = ((getHeight() - dodgeRect.bottom) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin) + lp.f۹۶۴۵j) < (i3 = inset.bottom)) {
                m۱۱۵۳۴f(child, distance3 - i3);
                offsetY = true;
            }
            if (!offsetY) {
                m۱۱۵۳۴f(child, 0);
            }
            boolean offsetX = false;
            if ((absDodgeInsetEdges & 3) == 3 && (distance2 = (dodgeRect.left - ((ViewGroup.MarginLayoutParams) lp).leftMargin) - lp.f۹۶۴۴i) < (i2 = inset.left)) {
                m۱۱۵۳۱e(child, i2 - distance2);
                offsetX = true;
            }
            if ((absDodgeInsetEdges & 5) == 5 && (distance = ((getWidth() - dodgeRect.right) - ((ViewGroup.MarginLayoutParams) lp).rightMargin) + lp.f۹۶۴۴i) < (i = inset.right)) {
                m۱۱۵۳۱e(child, distance - i);
                offsetX = true;
            }
            if (!offsetX) {
                m۱۱۵۳۱e(child, 0);
            }
            m۱۱۵۱۴a(dodgeRect);
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۱۵۳۱e(View child, int offsetX) {
        Cf lp = (Cf) child.getLayoutParams();
        int i = lp.f۹۶۴۴i;
        if (i != offsetX) {
            Cu.m۱۳۰۰۱c(child, offsetX - i);
            lp.f۹۶۴۴i = offsetX;
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۱۵۳۴f(View child, int offsetY) {
        Cf lp = (Cf) child.getLayoutParams();
        int i = lp.f۹۶۴۵j;
        if (i != offsetY) {
            Cu.m۱۳۰۰۳d(child, offsetY - i);
            lp.f۹۶۴۵j = offsetY;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۵۳۸a(View view) {
        List<View> dependents = this.f۹۶۱۶d.m۱۳۲۴۶c(view);
        if (!(dependents == null || dependents.isEmpty())) {
            for (int i = 0; i < dependents.size(); i++) {
                View child = dependents.get(i);
                AbstractCc b = ((Cf) child.getLayoutParams()).m۱۱۶۰۳d();
                if (b != null) {
                    b.m۱۱۵۸۱b(this, child, view);
                }
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public List<View> m۱۱۵۴۸b(View child) {
        List<View> dependencies = this.f۹۶۱۶d.m۱۳۲۴۷d(child);
        this.f۹۶۱۸f.clear();
        if (dependencies != null) {
            this.f۹۶۱۸f.addAll(dependencies);
        }
        return this.f۹۶۱۸f;
    }

    /* renamed from: c  reason: contains not printable characters */
    public List<View> m۱۱۵۵۳c(View child) {
        List<View> edges = this.f۹۶۱۶d.m۱۳۲۴۶c(child);
        this.f۹۶۱۸f.clear();
        if (edges != null) {
            this.f۹۶۱۸f.addAll(edges);
        }
        return this.f۹۶۱۸f;
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        m۱۱۵۳۰e();
        return Collections.unmodifiableList(this.f۹۶۱۵c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۵۴۹b() {
        boolean hasDependencies = false;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m۱۱۵۳۲e(getChildAt(i))) {
                hasDependencies = true;
                break;
            } else {
                i++;
            }
        }
        if (hasDependencies == this.f۹۶۲۷o) {
            return;
        }
        if (hasDependencies) {
            m۱۱۵۳۶a();
        } else {
            m۱۱۵۵۴c();
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private boolean m۱۱۵۳۲e(View child) {
        return this.f۹۶۱۶d.m۱۳۲۴۸e(child);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۵۳۶a() {
        if (this.f۹۶۲۲j) {
            if (this.f۹۶۲۶n == null) {
                this.f۹۶۲۶n = new ViewTreeObserver$OnPreDrawListenerCg();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f۹۶۲۶n);
        }
        this.f۹۶۲۷o = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۱۵۵۴c() {
        if (this.f۹۶۲۲j && this.f۹۶۲۶n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f۹۶۲۶n);
        }
        this.f۹۶۲۷o = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۵۵۰b(View child, int layoutDirection) {
        AbstractCc b;
        Cf lp = (Cf) child.getLayoutParams();
        if (lp.f۹۶۴۶k != null) {
            Rect anchorRect = m۱۱۵۲۷d();
            Rect childRect = m۱۱۵۲۷d();
            Rect desiredChildRect = m۱۱۵۲۷d();
            m۱۱۵۴۴a(lp.f۹۶۴۶k, anchorRect);
            boolean changed = false;
            m۱۱۵۴۶a(child, false, childRect);
            int childWidth = child.getMeasuredWidth();
            int childHeight = child.getMeasuredHeight();
            m۱۱۵۱۶a(child, layoutDirection, anchorRect, desiredChildRect, lp, childWidth, childHeight);
            if (!(desiredChildRect.left == childRect.left && desiredChildRect.top == childRect.top)) {
                changed = true;
            }
            m۱۱۵۱۵a(lp, desiredChildRect, childWidth, childHeight);
            int dx = desiredChildRect.left - childRect.left;
            int dy = desiredChildRect.top - childRect.top;
            if (dx != 0) {
                Cu.m۱۳۰۰۱c(child, dx);
            }
            if (dy != 0) {
                Cu.m۱۳۰۰۳d(child, dy);
            }
            if (changed && (b = lp.m۱۱۶۰۳d()) != null) {
                b.m۱۱۵۸۱b(this, child, lp.f۹۶۴۶k);
            }
            m۱۱۵۱۴a(anchorRect);
            m۱۱۵۱۴a(childRect);
            m۱۱۵۱۴a(desiredChildRect);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۵۴۷a(View child, int x, int y) {
        Rect r = m۱۱۵۲۷d();
        m۱۱۵۴۴a(child, r);
        try {
            return r.contains(x, y);
        } finally {
            m۱۱۵۱۴a(r);
        }
    }

    @Override // android.view.ViewGroup
    public Cf generateLayoutParams(AttributeSet attrs) {
        return new Cf(getContext(), attrs);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public Cf generateLayoutParams(ViewGroup.LayoutParams p) {
        if (p instanceof Cf) {
            return new Cf((Cf) p);
        }
        if (p instanceof ViewGroup.MarginLayoutParams) {
            return new Cf((ViewGroup.MarginLayoutParams) p);
        }
        return new Cf(p);
    }

    /* access modifiers changed from: protected */
    public Cf generateDefaultLayoutParams() {
        return new Cf(-2, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return (p instanceof Cf) && super.checkLayoutParams(p);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
        return m۱۱۵۵۲b(child, target, nestedScrollAxes, 0);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCm
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۱۵۵۲b(View child, View target, int axes, int type) {
        int childCount = getChildCount();
        boolean handled = false;
        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            if (view.getVisibility() != 8) {
                Cf lp = (Cf) view.getLayoutParams();
                AbstractCc viewBehavior = lp.m۱۱۶۰۳d();
                if (viewBehavior != null) {
                    boolean accepted = viewBehavior.m۱۱۵۸۳b(this, view, child, target, axes, type);
                    lp.m۱۱۵۹۲a(type, accepted);
                    handled |= accepted;
                } else {
                    lp.m۱۱۵۹۲a(type, false);
                }
            }
        }
        return handled;
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public void onNestedScrollAccepted(View child, View target, int nestedScrollAxes) {
        m۱۱۵۴۵a(child, target, nestedScrollAxes, 0);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۵۴۵a(View child, View target, int nestedScrollAxes, int type) {
        AbstractCc viewBehavior;
        this.f۹۶۳۳u.m۱۲۹۴۹a(child, target, nestedScrollAxes, type);
        this.f۹۶۲۵m = target;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            Cf lp = (Cf) view.getLayoutParams();
            if (lp.m۱۱۵۹۷a(type) && (viewBehavior = lp.m۱۱۶۰۳d()) != null) {
                viewBehavior.m۱۱۵۶۹a(this, view, child, target, nestedScrollAxes, type);
            }
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public void onStopNestedScroll(View target) {
        m۱۱۵۳۹a(target, 0);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۵۳۹a(View target, int type) {
        this.f۹۶۳۳u.m۱۲۹۴۷a(target, type);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            Cf lp = (Cf) view.getLayoutParams();
            if (lp.m۱۱۵۹۷a(type)) {
                AbstractCc viewBehavior = lp.m۱۱۶۰۳d();
                if (viewBehavior != null) {
                    viewBehavior.m۱۱۵۶۳a(this, view, target, type);
                }
                lp.m۱۱۵۹۹b(type);
                lp.m۱۱۶۰۶g();
            }
        }
        this.f۹۶۲۵m = null;
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        m۱۱۵۴۱a(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, 0);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۵۴۱a(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        AbstractCc viewBehavior;
        int childCount = getChildCount();
        boolean accepted = false;
        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            if (view.getVisibility() != 8) {
                Cf lp = (Cf) view.getLayoutParams();
                if (lp.m۱۱۵۹۷a(type) && (viewBehavior = lp.m۱۱۶۰۳d()) != null) {
                    viewBehavior.m۱۱۵۶۵a(this, view, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
                    accepted = true;
                }
            }
        }
        if (accepted) {
            m۱۱۵۳۷a(1);
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
        m۱۱۵۴۲a(target, dx, dy, consumed, 0);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۵۴۲a(View target, int dx, int dy, int[] consumed, int type) {
        int xConsumed;
        int yConsumed;
        int childCount = getChildCount();
        int xConsumed2 = 0;
        int yConsumed2 = 0;
        boolean accepted = false;
        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            if (view.getVisibility() != 8) {
                Cf lp = (Cf) view.getLayoutParams();
                if (lp.m۱۱۵۹۷a(type)) {
                    AbstractCc viewBehavior = lp.m۱۱۶۰۳d();
                    if (viewBehavior != null) {
                        int[] iArr = this.f۹۶۱۹g;
                        iArr[1] = 0;
                        iArr[0] = 0;
                        viewBehavior.m۱۱۵۶۷a(this, view, target, dx, dy, iArr, type);
                        int[] iArr2 = this.f۹۶۱۹g;
                        if (dx > 0) {
                            xConsumed = Math.max(xConsumed2, iArr2[0]);
                        } else {
                            xConsumed = Math.min(xConsumed2, iArr2[0]);
                        }
                        int[] iArr3 = this.f۹۶۱۹g;
                        if (dy > 0) {
                            yConsumed = Math.max(yConsumed2, iArr3[1]);
                        } else {
                            yConsumed = Math.min(yConsumed2, iArr3[1]);
                        }
                        xConsumed2 = xConsumed;
                        yConsumed2 = yConsumed;
                        accepted = true;
                    }
                }
            }
        }
        consumed[0] = xConsumed2;
        consumed[1] = yConsumed2;
        if (accepted) {
            m۱۱۵۳۷a(1);
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        AbstractCc viewBehavior;
        int childCount = getChildCount();
        boolean handled = false;
        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            if (view.getVisibility() != 8) {
                Cf lp = (Cf) view.getLayoutParams();
                if (lp.m۱۱۵۹۷a(0) && (viewBehavior = lp.m۱۱۶۰۳d()) != null) {
                    handled = viewBehavior.m۱۱۵۷۸a(this, view, target, velocityX, velocityY, consumed) | handled;
                }
            }
        }
        if (handled) {
            m۱۱۵۳۷a(1);
        }
        return handled;
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        AbstractCc viewBehavior;
        boolean handled = false;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View view = getChildAt(i);
            if (view.getVisibility() != 8) {
                Cf lp = (Cf) view.getLayoutParams();
                if (lp.m۱۱۵۹۷a(0) && (viewBehavior = lp.m۱۱۶۰۳d()) != null) {
                    handled |= viewBehavior.m۱۱۵۷۷a(this, view, target, velocityX, velocityY);
                }
            }
        }
        return handled;
    }

    public int getNestedScrollAxes() {
        return this.f۹۶۳۳u.m۱۲۹۴۶a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.widget.CoordinatorLayout$g  reason: invalid class name */
    public class ViewTreeObserver$OnPreDrawListenerCg implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerCg() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.m۱۱۵۳۷a(0);
            return true;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$i  reason: invalid class name */
    static class Ci implements Comparator<View> {
        Ci() {
        }

        /* renamed from: a  reason: contains not printable characters */
        public int compare(View lhs, View rhs) {
            float lz = Cu.m۱۳۰۲۲s(lhs);
            float rz = Cu.m۱۳۰۲۲s(rhs);
            if (lz > rz) {
                return -1;
            }
            if (lz < rz) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$c  reason: invalid class name */
    public static abstract class AbstractCc<V extends View> {
        public AbstractCc() {
        }

        public AbstractCc(Context context, AttributeSet attrs) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۵۶۱a(Cf params) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۵۶۰a() {
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۵۷۵a(CoordinatorLayout parent, V v, MotionEvent ev) {
            return false;
        }

        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۱۵۸۰b(CoordinatorLayout parent, V v, MotionEvent ev) {
            return false;
        }

        /* renamed from: b  reason: contains not printable characters */
        public int m۱۱۵۷۹b(CoordinatorLayout parent, V v) {
            return -16777216;
        }

        /* renamed from: c  reason: contains not printable characters */
        public float m۱۱۵۸۴c(CoordinatorLayout parent, V v) {
            return 0.0f;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۵۷۰a(CoordinatorLayout parent, V child) {
            return m۱۱۵۸۴c(parent, child) > 0.0f;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۵۷۶a(CoordinatorLayout parent, V v, View dependency) {
            return false;
        }

        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۱۵۸۱b(CoordinatorLayout parent, V v, View dependency) {
            return false;
        }

        /* renamed from: c  reason: contains not printable characters */
        public void m۱۱۵۸۵c(CoordinatorLayout parent, V v, View dependency) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۵۷۲a(CoordinatorLayout parent, V v, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
            return false;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۵۷۱a(CoordinatorLayout parent, V v, int layoutDirection) {
            return false;
        }

        @Deprecated
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۱۵۸۲b(CoordinatorLayout coordinatorLayout, V v, View directTargetChild, View target, int axes) {
            return false;
        }

        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۱۵۸۳b(CoordinatorLayout coordinatorLayout, V child, View directTargetChild, View target, int axes, int type) {
            if (type == 0) {
                return m۱۱۵۸۲b(coordinatorLayout, child, directTargetChild, target, axes);
            }
            return false;
        }

        @Deprecated
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۵۶۸a(CoordinatorLayout coordinatorLayout, V v, View directTargetChild, View target, int axes) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۵۶۹a(CoordinatorLayout coordinatorLayout, V child, View directTargetChild, View target, int axes, int type) {
            if (type == 0) {
                m۱۱۵۶۸a(coordinatorLayout, child, directTargetChild, target, axes);
            }
        }

        @Deprecated
        /* renamed from: d  reason: contains not printable characters */
        public void m۱۱۵۸۷d(CoordinatorLayout coordinatorLayout, V v, View target) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۵۶۳a(CoordinatorLayout coordinatorLayout, V child, View target, int type) {
            if (type == 0) {
                m۱۱۵۸۷d(coordinatorLayout, child, target);
            }
        }

        @Deprecated
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۵۶۴a(CoordinatorLayout coordinatorLayout, V v, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۵۶۵a(CoordinatorLayout coordinatorLayout, V child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
            if (type == 0) {
                m۱۱۵۶۴a(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
            }
        }

        @Deprecated
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۵۶۶a(CoordinatorLayout coordinatorLayout, V v, View target, int dx, int dy, int[] consumed) {
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۵۶۷a(CoordinatorLayout coordinatorLayout, V child, View target, int dx, int dy, int[] consumed, int type) {
            if (type == 0) {
                m۱۱۵۶۶a(coordinatorLayout, child, target, dx, dy, consumed);
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۵۷۸a(CoordinatorLayout coordinatorLayout, V v, View target, float velocityX, float velocityY, boolean consumed) {
            return false;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۵۷۷a(CoordinatorLayout coordinatorLayout, V v, View target, float velocityX, float velocityY) {
            return false;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cc0 m۱۱۵۵۹a(CoordinatorLayout coordinatorLayout, V v, Cc0 insets) {
            return insets;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۵۷۴a(CoordinatorLayout coordinatorLayout, V v, Rect rectangle, boolean immediate) {
            return false;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۵۶۲a(CoordinatorLayout parent, V v, Parcelable state) {
        }

        /* renamed from: d  reason: contains not printable characters */
        public Parcelable m۱۱۵۸۶d(CoordinatorLayout parent, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۵۷۳a(CoordinatorLayout parent, V v, Rect rect) {
            return false;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$f  reason: invalid class name */
    public static class Cf extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: contains not printable characters */
        AbstractCc f۹۶۳۶a;

        /* renamed from: b  reason: contains not printable characters */
        boolean f۹۶۳۷b = false;

        /* renamed from: c  reason: contains not printable characters */
        public int f۹۶۳۸c = 0;

        /* renamed from: d  reason: contains not printable characters */
        public int f۹۶۳۹d = 0;

        /* renamed from: e  reason: contains not printable characters */
        public int f۹۶۴۰e = -1;

        /* renamed from: f  reason: contains not printable characters */
        int f۹۶۴۱f = -1;

        /* renamed from: g  reason: contains not printable characters */
        public int f۹۶۴۲g = 0;

        /* renamed from: h  reason: contains not printable characters */
        public int f۹۶۴۳h = 0;

        /* renamed from: i  reason: contains not printable characters */
        int f۹۶۴۴i;

        /* renamed from: j  reason: contains not printable characters */
        int f۹۶۴۵j;

        /* renamed from: k  reason: contains not printable characters */
        View f۹۶۴۶k;

        /* renamed from: l  reason: contains not printable characters */
        View f۹۶۴۷l;

        /* renamed from: m  reason: contains not printable characters */
        private boolean f۹۶۴۸m;

        /* renamed from: n  reason: contains not printable characters */
        private boolean f۹۶۴۹n;

        /* renamed from: o  reason: contains not printable characters */
        private boolean f۹۶۵۰o;

        /* renamed from: p  reason: contains not printable characters */
        private boolean f۹۶۵۱p;

        /* renamed from: q  reason: contains not printable characters */
        final Rect f۹۶۵۲q = new Rect();

        public Cf(int width, int height) {
            super(width, height);
        }

        Cf(Context context, AttributeSet attrs) {
            super(context, attrs);
            TypedArray a = context.obtainStyledAttributes(attrs, Cc.CoordinatorLayout_Layout);
            this.f۹۶۳۸c = a.getInteger(Cc.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f۹۶۴۱f = a.getResourceId(Cc.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f۹۶۳۹d = a.getInteger(Cc.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f۹۶۴۰e = a.getInteger(Cc.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f۹۶۴۲g = a.getInt(Cc.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f۹۶۴۳h = a.getInt(Cc.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.f۹۶۳۷b = a.hasValue(Cc.CoordinatorLayout_Layout_layout_behavior);
            if (this.f۹۶۳۷b) {
                this.f۹۶۳۶a = CoordinatorLayout.m۱۱۵۱۳a(context, attrs, a.getString(Cc.CoordinatorLayout_Layout_layout_behavior));
            }
            a.recycle();
            AbstractCc cVar = this.f۹۶۳۶a;
            if (cVar != null) {
                cVar.m۱۱۵۶۱a(this);
            }
        }

        public Cf(Cf p) {
            super((ViewGroup.MarginLayoutParams) p);
        }

        public Cf(ViewGroup.MarginLayoutParams p) {
            super(p);
        }

        public Cf(ViewGroup.LayoutParams p) {
            super(p);
        }

        /* renamed from: c  reason: contains not printable characters */
        public int m۱۱۶۰۲c() {
            return this.f۹۶۴۱f;
        }

        /* renamed from: d  reason: contains not printable characters */
        public AbstractCc m۱۱۶۰۳d() {
            return this.f۹۶۳۶a;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۵۹۴a(AbstractCc behavior) {
            AbstractCc cVar = this.f۹۶۳۶a;
            if (cVar != behavior) {
                if (cVar != null) {
                    cVar.m۱۱۵۶۰a();
                }
                this.f۹۶۳۶a = behavior;
                this.f۹۶۳۷b = true;
                if (behavior != null) {
                    behavior.m۱۱۵۶۱a(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۵۹۳a(Rect r) {
            this.f۹۶۵۲q.set(r);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f  reason: contains not printable characters */
        public Rect m۱۱۶۰۵f() {
            return this.f۹۶۵۲q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۵۹۶a() {
            return this.f۹۶۴۶k == null && this.f۹۶۴۱f != -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۱۶۰۰b() {
            if (this.f۹۶۳۶a == null) {
                this.f۹۶۴۸m = false;
            }
            return this.f۹۶۴۸m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۱۶۰۱b(CoordinatorLayout parent, View child) {
            boolean z = this.f۹۶۴۸m;
            if (z) {
                return true;
            }
            AbstractCc cVar = this.f۹۶۳۶a;
            boolean a = z | (cVar != null ? cVar.m۱۱۵۷۰a(parent, child) : false);
            this.f۹۶۴۸m = a;
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h  reason: contains not printable characters */
        public void m۱۱۶۰۷h() {
            this.f۹۶۴۸m = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۱۵۹۹b(int type) {
            m۱۱۵۹۲a(type, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۵۹۲a(int type, boolean accept) {
            if (type == 0) {
                this.f۹۶۴۹n = accept;
            } else if (type == 1) {
                this.f۹۶۵۰o = accept;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۵۹۷a(int type) {
            if (type == 0) {
                return this.f۹۶۴۹n;
            }
            if (type != 1) {
                return false;
            }
            return this.f۹۶۵۰o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e  reason: contains not printable characters */
        public boolean m۱۱۶۰۴e() {
            return this.f۹۶۵۱p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۵۹۵a(boolean changed) {
            this.f۹۶۵۱p = changed;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g  reason: contains not printable characters */
        public void m۱۱۶۰۶g() {
            this.f۹۶۵۱p = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۵۹۸a(CoordinatorLayout parent, View child, View dependency) {
            AbstractCc cVar;
            return dependency == this.f۹۶۴۷l || m۱۱۵۸۹a(dependency, Cu.m۱۳۰۱۴k(parent)) || ((cVar = this.f۹۶۳۶a) != null && cVar.m۱۱۵۷۶a(parent, child, dependency));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public View m۱۱۵۹۱a(CoordinatorLayout parent, View forChild) {
            if (this.f۹۶۴۱f == -1) {
                this.f۹۶۴۷l = null;
                this.f۹۶۴۶k = null;
                return null;
            }
            if (this.f۹۶۴۶k == null || !m۱۱۵۹۰b(forChild, parent)) {
                m۱۱۵۸۸a(forChild, parent);
            }
            return this.f۹۶۴۶k;
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۱۵۸۸a(View forChild, CoordinatorLayout parent) {
            this.f۹۶۴۶k = parent.findViewById(this.f۹۶۴۱f);
            View view = this.f۹۶۴۶k;
            if (view != null) {
                if (view != parent) {
                    View directChild = this.f۹۶۴۶k;
                    ViewParent p = view.getParent();
                    while (p != parent && p != null) {
                        if (p != forChild) {
                            if (p instanceof View) {
                                directChild = (View) p;
                            }
                            p = p.getParent();
                        } else if (parent.isInEditMode()) {
                            this.f۹۶۴۷l = null;
                            this.f۹۶۴۶k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f۹۶۴۷l = directChild;
                } else if (parent.isInEditMode()) {
                    this.f۹۶۴۷l = null;
                    this.f۹۶۴۶k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (parent.isInEditMode()) {
                this.f۹۶۴۷l = null;
                this.f۹۶۴۶k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + parent.getResources().getResourceName(this.f۹۶۴۱f) + " to anchor view " + forChild);
            }
        }

        /* renamed from: b  reason: contains not printable characters */
        private boolean m۱۱۵۹۰b(View forChild, CoordinatorLayout parent) {
            if (this.f۹۶۴۶k.getId() != this.f۹۶۴۱f) {
                return false;
            }
            View directChild = this.f۹۶۴۶k;
            for (ViewParent p = this.f۹۶۴۶k.getParent(); p != parent; p = p.getParent()) {
                if (p == null || p == forChild) {
                    this.f۹۶۴۷l = null;
                    this.f۹۶۴۶k = null;
                    return false;
                }
                if (p instanceof View) {
                    directChild = (View) p;
                }
            }
            this.f۹۶۴۷l = directChild;
            return true;
        }

        /* renamed from: a  reason: contains not printable characters */
        private boolean m۱۱۵۸۹a(View other, int layoutDirection) {
            int absInset = Cd.m۱۲۸۲۵a(((Cf) other.getLayoutParams()).f۹۶۴۲g, layoutDirection);
            return absInset != 0 && (Cd.m۱۲۸۲۵a(this.f۹۶۴۳h, layoutDirection) & absInset) == absInset;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$e  reason: invalid class name */
    private class ViewGroup$OnHierarchyChangeListenerCe implements ViewGroup.OnHierarchyChangeListener {
        ViewGroup$OnHierarchyChangeListenerCe() {
        }

        public void onChildViewAdded(View parent, View child) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f۹۶۳۱s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(parent, child);
            }
        }

        public void onChildViewRemoved(View parent, View child) {
            CoordinatorLayout.this.m۱۱۵۳۷a(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f۹۶۳۱s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(parent, child);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable state) {
        Parcelable savedState;
        if (!(state instanceof Ch)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Ch ss = (Ch) state;
        super.onRestoreInstanceState(ss.m۱۲۷۹۱a());
        SparseArray<Parcelable> behaviorStates = ss.f۹۶۵۴e;
        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);
            int childId = child.getId();
            AbstractCc b = m۱۱۵۵۷d(child).m۱۱۶۰۳d();
            if (!(childId == -1 || b == null || (savedState = behaviorStates.get(childId)) == null)) {
                b.m۱۱۵۶۲a(this, child, savedState);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable state;
        Ch ss = new Ch(super.onSaveInstanceState());
        SparseArray<Parcelable> behaviorStates = new SparseArray<>();
        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);
            int childId = child.getId();
            AbstractCc b = ((Cf) child.getLayoutParams()).m۱۱۶۰۳d();
            if (!(childId == -1 || b == null || (state = b.m۱۱۵۸۶d(this, child)) == null)) {
                behaviorStates.append(childId, state);
            }
        }
        ss.f۹۶۵۴e = behaviorStates;
        return ss;
    }

    public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
        AbstractCc behavior = ((Cf) child.getLayoutParams()).m۱۱۶۰۳d();
        if (behavior == null || !behavior.m۱۱۵۷۴a(this, child, rectangle, immediate)) {
            return super.requestChildRectangleOnScreen(child, rectangle, immediate);
        }
        return true;
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۱۵۳۳f() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (Cu.m۱۳۰۱۱h(this)) {
                if (this.f۹۶۳۲t == null) {
                    this.f۹۶۳۲t = new Ca();
                }
                Cu.m۱۲۹۸۷a(this, this.f۹۶۳۲t);
                setSystemUiVisibility(1280);
                return;
            }
            Cu.m۱۲۹۸۷a(this, (AbstractCp) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.widget.CoordinatorLayout$a  reason: invalid class name */
    public class Ca implements AbstractCp {
        Ca() {
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCp
        /* renamed from: a  reason: contains not printable characters */
        public Cc0 m۱۱۵۵۸a(View v, Cc0 insets) {
            return CoordinatorLayout.this.m۱۱۵۳۵a(insets);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: android.support.design.widget.CoordinatorLayout$h  reason: invalid class name */
    public static class Ch extends AbstractCa {
        public static final Parcelable.Creator<Ch> CREATOR = new Ca();

        /* renamed from: e  reason: contains not printable characters */
        SparseArray<Parcelable> f۹۶۵۴e;

        public Ch(Parcel source, ClassLoader loader) {
            super(source, loader);
            int size = source.readInt();
            int[] ids = new int[size];
            source.readIntArray(ids);
            Parcelable[] states = source.readParcelableArray(loader);
            this.f۹۶۵۴e = new SparseArray<>(size);
            for (int i = 0; i < size; i++) {
                this.f۹۶۵۴e.append(ids[i], states[i]);
            }
        }

        public Ch(Parcelable superState) {
            super(superState);
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCa
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            SparseArray<Parcelable> sparseArray = this.f۹۶۵۴e;
            int size = sparseArray != null ? sparseArray.size() : 0;
            dest.writeInt(size);
            int[] ids = new int[size];
            Parcelable[] states = new Parcelable[size];
            for (int i = 0; i < size; i++) {
                ids[i] = this.f۹۶۵۴e.keyAt(i);
                states[i] = this.f۹۶۵۴e.valueAt(i);
            }
            dest.writeIntArray(ids);
            dest.writeParcelableArray(states, flags);
        }

        /* renamed from: android.support.design.widget.CoordinatorLayout$h$a  reason: invalid class name */
        static class Ca implements Parcelable.ClassLoaderCreator<Ch> {
            Ca() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public Ch createFromParcel(Parcel in, ClassLoader loader) {
                return new Ch(in, loader);
            }

            @Override // android.os.Parcelable.Creator
            public Ch createFromParcel(Parcel in) {
                return new Ch(in, null);
            }

            @Override // android.os.Parcelable.Creator
            public Ch[] newArray(int size) {
                return new Ch[size];
            }
        }
    }
}
