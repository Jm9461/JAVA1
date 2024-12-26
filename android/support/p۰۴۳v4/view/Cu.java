package android.support.p۰۴۳v4.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: android.support.v4.view.u  reason: invalid class name */
public class Cu {

    /* renamed from: a  reason: contains not printable characters */
    private static Field f۱۰۶۲۳a;

    /* renamed from: b  reason: contains not printable characters */
    private static boolean f۱۰۶۲۴b;

    /* renamed from: c  reason: contains not printable characters */
    private static Field f۱۰۶۲۵c;

    /* renamed from: d  reason: contains not printable characters */
    private static boolean f۱۰۶۲۶d;

    /* renamed from: e  reason: contains not printable characters */
    private static WeakHashMap<View, String> f۱۰۶۲۷e;

    /* renamed from: f  reason: contains not printable characters */
    private static WeakHashMap<View, Cy> f۱۰۶۲۸f = null;

    /* renamed from: g  reason: contains not printable characters */
    private static Field f۱۰۶۲۹g;

    /* renamed from: h  reason: contains not printable characters */
    private static boolean f۱۰۶۳۰h = false;

    /* renamed from: i  reason: contains not printable characters */
    private static ThreadLocal<Rect> f۱۰۶۳۱i;

    /* renamed from: android.support.v4.view.u$b  reason: invalid class name */
    public interface AbstractCb {
        /* renamed from: a  reason: contains not printable characters */
        boolean m۱۳۰۳۰a(View view, KeyEvent keyEvent);
    }

    static {
        new AtomicInteger(1);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Rect m۱۲۹۷۴a() {
        if (f۱۰۶۳۱i == null) {
            f۱۰۶۳۱i = new ThreadLocal<>();
        }
        Rect rect = f۱۰۶۳۱i.get();
        if (rect == null) {
            rect = new Rect();
            f۱۰۶۳۱i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۸۶a(View v, android.support.p۰۴۳v4.view.p۰۴۵d0.Cc info2) {
        v.onInitializeAccessibilityNodeInfo(info2.m۱۲۸۹۲v());
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۸۵a(View v, Cb delegate) {
        v.setAccessibilityDelegate(delegate == null ? null : delegate.m۱۲۷۹۵a());
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: j  reason: contains not printable characters */
    public static int m۱۳۰۱۳j(View v) {
        if (Build.VERSION.SDK_INT >= 26) {
            return v.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: g  reason: contains not printable characters */
    public static void m۱۳۰۰۹g(View v, int mode) {
        if (Build.VERSION.SDK_INT >= 26) {
            v.setImportantForAutofill(mode);
        }
    }

    /* renamed from: t  reason: contains not printable characters */
    public static boolean m۱۳۰۲۳t(View v) {
        if (f۱۰۶۳۰h) {
            return false;
        }
        if (f۱۰۶۲۹g == null) {
            try {
                f۱۰۶۲۹g = View.class.getDeclaredField("mAccessibilityDelegate");
                f۱۰۶۲۹g.setAccessible(true);
            } catch (Throwable th) {
                f۱۰۶۳۰h = true;
                return false;
            }
        }
        try {
            if (f۱۰۶۲۹g.get(v) != null) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            f۱۰۶۳۰h = true;
            return false;
        }
    }

    /* renamed from: w  reason: contains not printable characters */
    public static boolean m۱۳۰۲۶w(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۲۹۹۸b(View view, boolean hasTransientState) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(hasTransientState);
        }
    }

    /* renamed from: B  reason: contains not printable characters */
    public static void m۱۲۹۷۰B(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۸۹a(View view, Runnable action) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(action);
        } else {
            view.postDelayed(action, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۹۰a(View view, Runnable action, long delayMillis) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(action, delayMillis);
        } else {
            view.postDelayed(action, ValueAnimator.getFrameDelay() + delayMillis);
        }
    }

    /* renamed from: i  reason: contains not printable characters */
    public static int m۱۳۰۱۲i(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: f  reason: contains not printable characters */
    public static void m۱۳۰۰۷f(View view, int mode) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            view.setImportantForAccessibility(mode);
        } else if (i >= 16) {
            if (mode == 4) {
                mode = 2;
            }
            view.setImportantForAccessibility(mode);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۲۹۹۳a(View view, int action, Bundle arguments) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(action, arguments);
        }
        return false;
    }

    /* renamed from: k  reason: contains not printable characters */
    public static int m۱۳۰۱۴k(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: p  reason: contains not printable characters */
    public static ViewParent m۱۳۰۱۹p(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    /* renamed from: b  reason: contains not printable characters */
    public static int m۱۲۹۹۵b(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: e  reason: contains not printable characters */
    public static void m۱۳۰۰۵e(View view, int mode) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(mode);
        }
    }

    /* renamed from: o  reason: contains not printable characters */
    public static int m۱۳۰۱۸o(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    /* renamed from: n  reason: contains not printable characters */
    public static int m۱۳۰۱۷n(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۸۰a(View view, int start, int top, int end, int bottom) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(start, top, end, bottom);
        } else {
            view.setPadding(start, top, end, bottom);
        }
    }

    /* renamed from: m  reason: contains not printable characters */
    public static int m۱۳۰۱۶m(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f۱۰۶۲۴b) {
            try {
                f۱۰۶۲۳a = View.class.getDeclaredField("mMinWidth");
                f۱۰۶۲۳a.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f۱۰۶۲۴b = true;
        }
        Field field = f۱۰۶۲۳a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception e2) {
            return 0;
        }
    }

    /* renamed from: l  reason: contains not printable characters */
    public static int m۱۳۰۱۵l(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f۱۰۶۲۶d) {
            try {
                f۱۰۶۲۵c = View.class.getDeclaredField("mMinHeight");
                f۱۰۶۲۵c.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f۱۰۶۲۶d = true;
        }
        Field field = f۱۰۶۲۵c;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception e2) {
            return 0;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cy m۱۲۹۷۶a(View view) {
        if (f۱۰۶۲۸f == null) {
            f۱۰۶۲۸f = new WeakHashMap<>();
        }
        Cy vpa = f۱۰۶۲۸f.get(view);
        if (vpa != null) {
            return vpa;
        }
        Cy vpa2 = new Cy(view);
        f۱۰۶۲۸f.put(view, vpa2);
        return vpa2;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۷۷a(View view, float elevation) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(elevation);
        }
    }

    /* renamed from: g  reason: contains not printable characters */
    public static float m۱۳۰۰۸g(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۹۱a(View view, String transitionName) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(transitionName);
            return;
        }
        if (f۱۰۶۲۷e == null) {
            f۱۰۶۲۷e = new WeakHashMap<>();
        }
        f۱۰۶۲۷e.put(view, transitionName);
    }

    /* renamed from: q  reason: contains not printable characters */
    public static String m۱۳۰۲۰q(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f۱۰۶۲۷e;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: r  reason: contains not printable characters */
    public static int m۱۳۰۲۱r(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: C  reason: contains not printable characters */
    public static void m۱۲۹۷۱C(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    public static boolean m۱۳۰۱۱h(View v) {
        if (Build.VERSION.SDK_INT >= 16) {
            return v.getFitsSystemWindows();
        }
        return false;
    }

    @Deprecated
    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۹۲a(View view, boolean fitSystemWindows) {
        view.setFitsSystemWindows(fitSystemWindows);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۸۷a(View v, AbstractCp listener) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (listener == null) {
            v.setOnApplyWindowInsetsListener(null);
        } else {
            v.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerCa(listener));
        }
    }

    /* renamed from: android.support.v4.view.u$a  reason: invalid class name */
    static class View$OnApplyWindowInsetsListenerCa implements View.OnApplyWindowInsetsListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ AbstractCp f۱۰۶۳۲a;

        View$OnApplyWindowInsetsListenerCa(AbstractCp pVar) {
            this.f۱۰۶۳۲a = pVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
            return (WindowInsets) Cc0.m۱۲۸۱۶a(this.f۱۰۶۳۲a.m۱۲۹۵۰a(view, Cc0.m۱۲۸۱۵a(insets)));
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static Cc0 m۱۲۹۹۶b(View view, Cc0 insets) {
        if (Build.VERSION.SDK_INT < 21) {
            return insets;
        }
        WindowInsets unwrapped = (WindowInsets) Cc0.m۱۲۸۱۶a(insets);
        WindowInsets result = view.onApplyWindowInsets(unwrapped);
        if (result != unwrapped) {
            unwrapped = new WindowInsets(result);
        }
        return Cc0.m۱۲۸۱۵a(unwrapped);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cc0 m۱۲۹۷۵a(View view, Cc0 insets) {
        if (Build.VERSION.SDK_INT < 21) {
            return insets;
        }
        WindowInsets unwrapped = (WindowInsets) Cc0.m۱۲۸۱۶a(insets);
        WindowInsets result = view.dispatchApplyWindowInsets(unwrapped);
        if (result != unwrapped) {
            unwrapped = new WindowInsets(result);
        }
        return Cc0.m۱۲۸۱۵a(unwrapped);
    }

    /* renamed from: v  reason: contains not printable characters */
    public static boolean m۱۳۰۲۵v(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: A  reason: contains not printable characters */
    public static boolean m۱۲۹۶۹A(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۸۴a(View view, Drawable background) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(background);
        } else {
            view.setBackgroundDrawable(background);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public static ColorStateList m۱۳۰۰۰c(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof AbstractCt) {
            return ((AbstractCt) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۸۱a(View view, ColorStateList tintList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(tintList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean hasTint = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && hasTint) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof AbstractCt) {
            ((AbstractCt) view).setSupportBackgroundTintList(tintList);
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public static PorterDuff.Mode m۱۳۰۰۲d(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof AbstractCt) {
            return ((AbstractCt) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۸۲a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean hasTint = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && hasTint) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof AbstractCt) {
            ((AbstractCt) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: z  reason: contains not printable characters */
    public static boolean m۱۳۰۲۹z(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof AbstractCk) {
            return ((AbstractCk) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: D  reason: contains not printable characters */
    public static void m۱۲۹۷۲D(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof AbstractCk) {
            ((AbstractCk) view).stopNestedScroll();
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    public static void m۱۳۰۱۰h(View view, int type) {
        if (view instanceof AbstractCj) {
            ((AbstractCj) view).m۱۲۹۲۴a(type);
        } else if (type == 0) {
            m۱۲۹۷۲D(view);
        }
    }

    /* renamed from: y  reason: contains not printable characters */
    public static boolean m۱۳۰۲۸y(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: s  reason: contains not printable characters */
    public static float m۱۳۰۲۲s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: d  reason: contains not printable characters */
    public static void m۱۳۰۰۳d(View view, int offset) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            view.offsetTopAndBottom(offset);
        } else if (i >= 21) {
            Rect parentRect = m۱۲۹۷۴a();
            boolean needInvalidateWorkaround = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View p = (View) parent;
                parentRect.set(p.getLeft(), p.getTop(), p.getRight(), p.getBottom());
                needInvalidateWorkaround = !parentRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m۱۲۹۹۷b(view, offset);
            if (needInvalidateWorkaround && parentRect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(parentRect);
            }
        } else {
            m۱۲۹۹۷b(view, offset);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private static void m۱۲۹۹۷b(View view, int offset) {
        view.offsetTopAndBottom(offset);
        if (view.getVisibility() == 0) {
            m۱۲۹۷۳E(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m۱۲۹۷۳E((View) parent);
            }
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public static void m۱۳۰۰۱c(View view, int offset) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            view.offsetLeftAndRight(offset);
        } else if (i >= 21) {
            Rect parentRect = m۱۲۹۷۴a();
            boolean needInvalidateWorkaround = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View p = (View) parent;
                parentRect.set(p.getLeft(), p.getTop(), p.getRight(), p.getBottom());
                needInvalidateWorkaround = !parentRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m۱۲۹۷۸a(view, offset);
            if (needInvalidateWorkaround && parentRect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(parentRect);
            }
        } else {
            m۱۲۹۷۸a(view, offset);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۲۹۷۸a(View view, int offset) {
        view.offsetLeftAndRight(offset);
        if (view.getVisibility() == 0) {
            m۱۲۹۷۳E(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m۱۲۹۷۳E((View) parent);
            }
        }
    }

    /* renamed from: E  reason: contains not printable characters */
    private static void m۱۲۹۷۳E(View view) {
        float y = view.getTranslationY();
        view.setTranslationY(1.0f + y);
        view.setTranslationY(y);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۸۳a(View view, Rect clipBounds) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(clipBounds);
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    public static Rect m۱۳۰۰۴e(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: x  reason: contains not printable characters */
    public static boolean m۱۳۰۲۷x(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: u  reason: contains not printable characters */
    public static boolean m۱۳۰۲۴u(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۷۹a(View view, int indicators, int mask) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(indicators, mask);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۸۸a(View view, Cr pointerIcon) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (pointerIcon != null ? pointerIcon.m۱۲۹۶۸a() : null));
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    public static Display m۱۳۰۰۶f(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m۱۳۰۲۷x(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: b  reason: contains not printable characters */
    static boolean m۱۲۹۹۹b(View root, KeyEvent evt) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return Cc.m۱۳۰۳۱a(root).m۱۳۰۳۶a(evt);
    }

    /* renamed from: a  reason: contains not printable characters */
    static boolean m۱۲۹۹۴a(View root, KeyEvent evt) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return Cc.m۱۳۰۳۱a(root).m۱۳۰۳۷a(root, evt);
    }

    /* renamed from: android.support.v4.view.u$c  reason: invalid class name */
    static class Cc {

        /* renamed from: d  reason: contains not printable characters */
        private static final ArrayList<WeakReference<View>> f۱۰۶۳۳d = new ArrayList<>();

        /* renamed from: a  reason: contains not printable characters */
        private WeakHashMap<View, Boolean> f۱۰۶۳۴a = null;

        /* renamed from: b  reason: contains not printable characters */
        private SparseArray<WeakReference<View>> f۱۰۶۳۵b = null;

        /* renamed from: c  reason: contains not printable characters */
        private WeakReference<KeyEvent> f۱۰۶۳۶c = null;

        Cc() {
        }

        /* renamed from: a  reason: contains not printable characters */
        private SparseArray<WeakReference<View>> m۱۳۰۳۲a() {
            if (this.f۱۰۶۳۵b == null) {
                this.f۱۰۶۳۵b = new SparseArray<>();
            }
            return this.f۱۰۶۳۵b;
        }

        /* renamed from: a  reason: contains not printable characters */
        static Cc m۱۳۰۳۱a(View root) {
            Cc manager = (Cc) root.getTag(p۰۰۰a.p۰۰۵b.p۰۰۶a.Cc.tag_unhandled_key_event_manager);
            if (manager != null) {
                return manager;
            }
            Cc manager2 = new Cc();
            root.setTag(p۰۰۰a.p۰۰۵b.p۰۰۶a.Cc.tag_unhandled_key_event_manager, manager2);
            return manager2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۳۰۳۷a(View root, KeyEvent event) {
            if (event.getAction() == 0) {
                m۱۳۰۳۴b();
            }
            View consumer = m۱۳۰۳۳b(root, event);
            if (event.getAction() == 0) {
                int keycode = event.getKeyCode();
                if (consumer != null && !KeyEvent.isModifierKey(keycode)) {
                    m۱۳۰۳۲a().put(keycode, new WeakReference<>(consumer));
                }
            }
            return consumer != null;
        }

        /* renamed from: b  reason: contains not printable characters */
        private View m۱۳۰۳۳b(View view, KeyEvent event) {
            WeakHashMap<View, Boolean> weakHashMap = this.f۱۰۶۳۴a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup vg = (ViewGroup) view;
                for (int i = vg.getChildCount() - 1; i >= 0; i--) {
                    View consumer = m۱۳۰۳۳b(vg.getChildAt(i), event);
                    if (consumer != null) {
                        return consumer;
                    }
                }
            }
            if (m۱۳۰۳۵c(view, event)) {
                return view;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۳۰۳۶a(KeyEvent event) {
            int idx;
            WeakReference<KeyEvent> weakReference = this.f۱۰۶۳۶c;
            if (weakReference != null && weakReference.get() == event) {
                return false;
            }
            this.f۱۰۶۳۶c = new WeakReference<>(event);
            WeakReference<View> currentReceiver = null;
            SparseArray<WeakReference<View>> capturedKeys = m۱۳۰۳۲a();
            if (event.getAction() == 1 && (idx = capturedKeys.indexOfKey(event.getKeyCode())) >= 0) {
                currentReceiver = capturedKeys.valueAt(idx);
                capturedKeys.removeAt(idx);
            }
            if (currentReceiver == null) {
                currentReceiver = capturedKeys.get(event.getKeyCode());
            }
            if (currentReceiver == null) {
                return false;
            }
            View target = currentReceiver.get();
            if (target != null && Cu.m۱۳۰۲۷x(target)) {
                m۱۳۰۳۵c(target, event);
            }
            return true;
        }

        /* renamed from: c  reason: contains not printable characters */
        private boolean m۱۳۰۳۵c(View v, KeyEvent event) {
            ArrayList<ViewCompat.OnUnhandledKeyEventListenerCompat> viewListeners = (ArrayList) v.getTag(p۰۰۰a.p۰۰۵b.p۰۰۶a.Cc.tag_unhandled_key_listeners);
            if (viewListeners == null) {
                return false;
            }
            for (int i = viewListeners.size() - 1; i >= 0; i--) {
                if (((AbstractCb) viewListeners.get(i)).m۱۳۰۳۰a(v, event)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b  reason: contains not printable characters */
        private void m۱۳۰۳۴b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f۱۰۶۳۴a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f۱۰۶۳۳d.isEmpty()) {
                synchronized (f۱۰۶۳۳d) {
                    if (this.f۱۰۶۳۴a == null) {
                        this.f۱۰۶۳۴a = new WeakHashMap<>();
                    }
                    for (int i = f۱۰۶۳۳d.size() - 1; i >= 0; i--) {
                        View v = f۱۰۶۳۳d.get(i).get();
                        if (v == null) {
                            f۱۰۶۳۳d.remove(i);
                        } else {
                            this.f۱۰۶۳۴a.put(v, Boolean.TRUE);
                            for (ViewParent nxt = v.getParent(); nxt instanceof View; nxt = nxt.getParent()) {
                                this.f۱۰۶۳۴a.put((View) nxt, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
    }
}
