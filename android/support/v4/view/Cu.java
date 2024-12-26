package android.support.v4.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.p۲۰۳d0.Cc;
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

/* renamed from: android.support.v4.view.u, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cu {

    /* renamed from: a, reason: contains not printable characters */
    private static Field f۱۰۶۲۳a;

    /* renamed from: b, reason: contains not printable characters */
    private static boolean f۱۰۶۲۴b;

    /* renamed from: c, reason: contains not printable characters */
    private static Field f۱۰۶۲۵c;

    /* renamed from: d, reason: contains not printable characters */
    private static boolean f۱۰۶۲۶d;

    /* renamed from: e, reason: contains not printable characters */
    private static WeakHashMap<View, String> f۱۰۶۲۷e;

    /* renamed from: f, reason: contains not printable characters */
    private static WeakHashMap<View, Cy> f۱۰۶۲۸f;

    /* renamed from: g, reason: contains not printable characters */
    private static Field f۱۰۶۲۹g;

    /* renamed from: h, reason: contains not printable characters */
    private static boolean f۱۰۶۳۰h;

    /* renamed from: i, reason: contains not printable characters */
    private static ThreadLocal<Rect> f۱۰۶۳۱i;

    /* renamed from: android.support.v4.view.u$b */
    public interface b {
        /* renamed from: a, reason: contains not printable characters */
        boolean m۱۰۹۶۰a(View view, KeyEvent keyEvent);
    }

    static {
        new AtomicInteger(1);
        f۱۰۶۲۸f = null;
        f۱۰۶۳۰h = false;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Rect m۱۰۹۰۴a() {
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

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۹۱۶a(View v, Cc info2) {
        v.onInitializeAccessibilityNodeInfo(info2.m۱۰۸۲۲v());
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۹۱۵a(View v, Cb delegate) {
        v.setAccessibilityDelegate(delegate == null ? null : delegate.m۱۰۷۲۵a());
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: j, reason: contains not printable characters */
    public static int m۱۰۹۴۳j(View v) {
        if (Build.VERSION.SDK_INT >= 26) {
            return v.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: g, reason: contains not printable characters */
    public static void m۱۰۹۳۹g(View v, int mode) {
        if (Build.VERSION.SDK_INT >= 26) {
            v.setImportantForAutofill(mode);
        }
    }

    /* renamed from: t, reason: contains not printable characters */
    public static boolean m۱۰۹۵۳t(View v) {
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
            return f۱۰۶۲۹g.get(v) != null;
        } catch (Throwable th2) {
            f۱۰۶۳۰h = true;
            return false;
        }
    }

    /* renamed from: w, reason: contains not printable characters */
    public static boolean m۱۰۹۵۶w(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: b, reason: contains not printable characters */
    public static void m۱۰۹۲۸b(View view, boolean hasTransientState) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(hasTransientState);
        }
    }

    /* renamed from: B, reason: contains not printable characters */
    public static void m۱۰۹۰۰B(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۹۱۹a(View view, Runnable action) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(action);
        } else {
            view.postDelayed(action, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۹۲۰a(View view, Runnable action, long delayMillis) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(action, delayMillis);
        } else {
            view.postDelayed(action, ValueAnimator.getFrameDelay() + delayMillis);
        }
    }

    /* renamed from: i, reason: contains not printable characters */
    public static int m۱۰۹۴۲i(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: f, reason: contains not printable characters */
    public static void m۱۰۹۳۷f(View view, int mode) {
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

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۰۹۲۳a(View view, int action, Bundle arguments) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(action, arguments);
        }
        return false;
    }

    /* renamed from: k, reason: contains not printable characters */
    public static int m۱۰۹۴۴k(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: p, reason: contains not printable characters */
    public static ViewParent m۱۰۹۴۹p(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    /* renamed from: b, reason: contains not printable characters */
    public static int m۱۰۹۲۵b(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: e, reason: contains not printable characters */
    public static void m۱۰۹۳۵e(View view, int mode) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(mode);
        }
    }

    /* renamed from: o, reason: contains not printable characters */
    public static int m۱۰۹۴۸o(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    /* renamed from: n, reason: contains not printable characters */
    public static int m۱۰۹۴۷n(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۹۱۰a(View view, int start, int top, int end, int bottom) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(start, top, end, bottom);
        } else {
            view.setPadding(start, top, end, bottom);
        }
    }

    /* renamed from: m, reason: contains not printable characters */
    public static int m۱۰۹۴۶m(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f۱۰۶۲۴b) {
            try {
                f۱۰۶۲۳a = View.class.getDeclaredField("mMinWidth");
                f۱۰۶۲۳a.setAccessible(true);
            } catch (NoSuchFieldException e2) {
            }
            f۱۰۶۲۴b = true;
        }
        Field field = f۱۰۶۲۳a;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception e3) {
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: l, reason: contains not printable characters */
    public static int m۱۰۹۴۵l(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f۱۰۶۲۶d) {
            try {
                f۱۰۶۲۵c = View.class.getDeclaredField("mMinHeight");
                f۱۰۶۲۵c.setAccessible(true);
            } catch (NoSuchFieldException e2) {
            }
            f۱۰۶۲۶d = true;
        }
        Field field = f۱۰۶۲۵c;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception e3) {
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cy m۱۰۹۰۶a(View view) {
        if (f۱۰۶۲۸f == null) {
            f۱۰۶۲۸f = new WeakHashMap<>();
        }
        Cy vpa = f۱۰۶۲۸f.get(view);
        if (vpa == null) {
            Cy vpa2 = new Cy(view);
            f۱۰۶۲۸f.put(view, vpa2);
            return vpa2;
        }
        return vpa;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۹۰۷a(View view, float elevation) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(elevation);
        }
    }

    /* renamed from: g, reason: contains not printable characters */
    public static float m۱۰۹۳۸g(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۹۲۱a(View view, String transitionName) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(transitionName);
            return;
        }
        if (f۱۰۶۲۷e == null) {
            f۱۰۶۲۷e = new WeakHashMap<>();
        }
        f۱۰۶۲۷e.put(view, transitionName);
    }

    /* renamed from: q, reason: contains not printable characters */
    public static String m۱۰۹۵۰q(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f۱۰۶۲۷e;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: r, reason: contains not printable characters */
    public static int m۱۰۹۵۱r(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: C, reason: contains not printable characters */
    public static void m۱۰۹۰۱C(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: h, reason: contains not printable characters */
    public static boolean m۱۰۹۴۱h(View v) {
        if (Build.VERSION.SDK_INT >= 16) {
            return v.getFitsSystemWindows();
        }
        return false;
    }

    @Deprecated
    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۹۲۲a(View view, boolean fitSystemWindows) {
        view.setFitsSystemWindows(fitSystemWindows);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۹۱۷a(View v, InterfaceCp listener) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (listener == null) {
                v.setOnApplyWindowInsetsListener(null);
            } else {
                v.setOnApplyWindowInsetsListener(new a(listener));
            }
        }
    }

    /* renamed from: android.support.v4.view.u$a */
    static class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ InterfaceCp f۱۰۶۳۲a;

        a(InterfaceCp interfaceCp) {
            this.f۱۰۶۳۲a = interfaceCp;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
            Cc0 compatInsets = Cc0.m۱۰۷۴۵a(insets);
            return (WindowInsets) Cc0.m۱۰۷۴۶a(this.f۱۰۶۳۲a.mo۱۱۵۲۴a(view, compatInsets));
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public static Cc0 m۱۰۹۲۶b(View view, Cc0 insets) {
        if (Build.VERSION.SDK_INT >= 21) {
            WindowInsets unwrapped = (WindowInsets) Cc0.m۱۰۷۴۶a(insets);
            WindowInsets result = view.onApplyWindowInsets(unwrapped);
            if (result != unwrapped) {
                unwrapped = new WindowInsets(result);
            }
            return Cc0.m۱۰۷۴۵a(unwrapped);
        }
        return insets;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cc0 m۱۰۹۰۵a(View view, Cc0 insets) {
        if (Build.VERSION.SDK_INT >= 21) {
            WindowInsets unwrapped = (WindowInsets) Cc0.m۱۰۷۴۶a(insets);
            WindowInsets result = view.dispatchApplyWindowInsets(unwrapped);
            if (result != unwrapped) {
                unwrapped = new WindowInsets(result);
            }
            return Cc0.m۱۰۷۴۵a(unwrapped);
        }
        return insets;
    }

    /* renamed from: v, reason: contains not printable characters */
    public static boolean m۱۰۹۵۵v(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: A, reason: contains not printable characters */
    public static boolean m۱۰۸۹۹A(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۹۱۴a(View view, Drawable background) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(background);
        } else {
            view.setBackgroundDrawable(background);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c, reason: contains not printable characters */
    public static ColorStateList m۱۰۹۳۰c(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof InterfaceCt) {
            return ((InterfaceCt) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۹۱۱a(View view, ColorStateList tintList) {
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
                    return;
                }
                return;
            }
            return;
        }
        if (view instanceof InterfaceCt) {
            ((InterfaceCt) view).setSupportBackgroundTintList(tintList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d, reason: contains not printable characters */
    public static PorterDuff.Mode m۱۰۹۳۲d(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof InterfaceCt) {
            return ((InterfaceCt) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۹۱۲a(View view, PorterDuff.Mode mode) {
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
                    return;
                }
                return;
            }
            return;
        }
        if (view instanceof InterfaceCt) {
            ((InterfaceCt) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z, reason: contains not printable characters */
    public static boolean m۱۰۹۵۹z(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof InterfaceCk) {
            return ((InterfaceCk) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D, reason: contains not printable characters */
    public static void m۱۰۹۰۲D(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof InterfaceCk) {
            ((InterfaceCk) view).stopNestedScroll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h, reason: contains not printable characters */
    public static void m۱۰۹۴۰h(View view, int type) {
        if (view instanceof InterfaceCj) {
            ((InterfaceCj) view).mo۱۲۲۰۵a(type);
        } else if (type == 0) {
            m۱۰۹۰۲D(view);
        }
    }

    /* renamed from: y, reason: contains not printable characters */
    public static boolean m۱۰۹۵۸y(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: s, reason: contains not printable characters */
    public static float m۱۰۹۵۲s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: d, reason: contains not printable characters */
    public static void m۱۰۹۳۳d(View view, int offset) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            view.offsetTopAndBottom(offset);
            return;
        }
        if (i >= 21) {
            Rect parentRect = m۱۰۹۰۴a();
            boolean needInvalidateWorkaround = false;
            Object parent = view.getParent();
            if (parent instanceof View) {
                View p = (View) parent;
                parentRect.set(p.getLeft(), p.getTop(), p.getRight(), p.getBottom());
                needInvalidateWorkaround = !parentRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m۱۰۹۲۷b(view, offset);
            if (needInvalidateWorkaround && parentRect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(parentRect);
                return;
            }
            return;
        }
        m۱۰۹۲۷b(view, offset);
    }

    /* renamed from: b, reason: contains not printable characters */
    private static void m۱۰۹۲۷b(View view, int offset) {
        view.offsetTopAndBottom(offset);
        if (view.getVisibility() == 0) {
            m۱۰۹۰۳E(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m۱۰۹۰۳E((View) parent);
            }
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public static void m۱۰۹۳۱c(View view, int offset) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            view.offsetLeftAndRight(offset);
            return;
        }
        if (i >= 21) {
            Rect parentRect = m۱۰۹۰۴a();
            boolean needInvalidateWorkaround = false;
            Object parent = view.getParent();
            if (parent instanceof View) {
                View p = (View) parent;
                parentRect.set(p.getLeft(), p.getTop(), p.getRight(), p.getBottom());
                needInvalidateWorkaround = !parentRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m۱۰۹۰۸a(view, offset);
            if (needInvalidateWorkaround && parentRect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(parentRect);
                return;
            }
            return;
        }
        m۱۰۹۰۸a(view, offset);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۰۹۰۸a(View view, int offset) {
        view.offsetLeftAndRight(offset);
        if (view.getVisibility() == 0) {
            m۱۰۹۰۳E(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m۱۰۹۰۳E((View) parent);
            }
        }
    }

    /* renamed from: E, reason: contains not printable characters */
    private static void m۱۰۹۰۳E(View view) {
        float y = view.getTranslationY();
        view.setTranslationY(1.0f + y);
        view.setTranslationY(y);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۹۱۳a(View view, Rect clipBounds) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(clipBounds);
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    public static Rect m۱۰۹۳۴e(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: x, reason: contains not printable characters */
    public static boolean m۱۰۹۵۷x(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: u, reason: contains not printable characters */
    public static boolean m۱۰۹۵۴u(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۹۰۹a(View view, int indicators, int mask) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(indicators, mask);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۹۱۸a(View view, Cr pointerIcon) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (pointerIcon != null ? pointerIcon.m۱۰۸۹۸a() : null));
        }
    }

    /* renamed from: f, reason: contains not printable characters */
    public static Display m۱۰۹۳۶f(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m۱۰۹۵۷x(view)) {
            WindowManager wm = (WindowManager) view.getContext().getSystemService("window");
            return wm.getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: b, reason: contains not printable characters */
    static boolean m۱۰۹۲۹b(View root, KeyEvent evt) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return c.m۱۰۹۶۱a(root).m۱۰۹۶۶a(evt);
    }

    /* renamed from: a, reason: contains not printable characters */
    static boolean m۱۰۹۲۴a(View root, KeyEvent evt) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return c.m۱۰۹۶۱a(root).m۱۰۹۶۷a(root, evt);
    }

    /* renamed from: android.support.v4.view.u$c */
    static class c {

        /* renamed from: d, reason: contains not printable characters */
        private static final ArrayList<WeakReference<View>> f۱۰۶۳۳d = new ArrayList<>();

        /* renamed from: a, reason: contains not printable characters */
        private WeakHashMap<View, Boolean> f۱۰۶۳۴a = null;

        /* renamed from: b, reason: contains not printable characters */
        private SparseArray<WeakReference<View>> f۱۰۶۳۵b = null;

        /* renamed from: c, reason: contains not printable characters */
        private WeakReference<KeyEvent> f۱۰۶۳۶c = null;

        c() {
        }

        /* renamed from: a, reason: contains not printable characters */
        private SparseArray<WeakReference<View>> m۱۰۹۶۲a() {
            if (this.f۱۰۶۳۵b == null) {
                this.f۱۰۶۳۵b = new SparseArray<>();
            }
            return this.f۱۰۶۳۵b;
        }

        /* renamed from: a, reason: contains not printable characters */
        static c m۱۰۹۶۱a(View root) {
            c manager = (c) root.getTag(p۱۵۹a.p۱۶۴b.p۱۶۵a.Cc.tag_unhandled_key_event_manager);
            if (manager == null) {
                c manager2 = new c();
                root.setTag(p۱۵۹a.p۱۶۴b.p۱۶۵a.Cc.tag_unhandled_key_event_manager, manager2);
                return manager2;
            }
            return manager;
        }

        /* renamed from: a, reason: contains not printable characters */
        boolean m۱۰۹۶۷a(View root, KeyEvent event) {
            if (event.getAction() == 0) {
                m۱۰۹۶۴b();
            }
            View consumer = m۱۰۹۶۳b(root, event);
            if (event.getAction() == 0) {
                int keycode = event.getKeyCode();
                if (consumer != null && !KeyEvent.isModifierKey(keycode)) {
                    m۱۰۹۶۲a().put(keycode, new WeakReference<>(consumer));
                }
            }
            return consumer != null;
        }

        /* renamed from: b, reason: contains not printable characters */
        private View m۱۰۹۶۳b(View view, KeyEvent event) {
            WeakHashMap<View, Boolean> weakHashMap = this.f۱۰۶۳۴a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup vg = (ViewGroup) view;
                for (int i = vg.getChildCount() - 1; i >= 0; i--) {
                    View v = vg.getChildAt(i);
                    View consumer = m۱۰۹۶۳b(v, event);
                    if (consumer != null) {
                        return consumer;
                    }
                }
            }
            if (m۱۰۹۶۵c(view, event)) {
                return view;
            }
            return null;
        }

        /* renamed from: a, reason: contains not printable characters */
        boolean m۱۰۹۶۶a(KeyEvent event) {
            int idx;
            WeakReference<KeyEvent> weakReference = this.f۱۰۶۳۶c;
            if (weakReference != null && weakReference.get() == event) {
                return false;
            }
            this.f۱۰۶۳۶c = new WeakReference<>(event);
            WeakReference<View> currentReceiver = null;
            SparseArray<WeakReference<View>> capturedKeys = m۱۰۹۶۲a();
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
            if (target != null && Cu.m۱۰۹۵۷x(target)) {
                m۱۰۹۶۵c(target, event);
            }
            return true;
        }

        /* renamed from: c, reason: contains not printable characters */
        private boolean m۱۰۹۶۵c(View v, KeyEvent event) {
            ArrayList<ViewCompat.OnUnhandledKeyEventListenerCompat> viewListeners = (ArrayList) v.getTag(p۱۵۹a.p۱۶۴b.p۱۶۵a.Cc.tag_unhandled_key_listeners);
            if (viewListeners != null) {
                for (int i = viewListeners.size() - 1; i >= 0; i--) {
                    if (((b) viewListeners.get(i)).m۱۰۹۶۰a(v, event)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        /* renamed from: b, reason: contains not printable characters */
        private void m۱۰۹۶۴b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f۱۰۶۳۴a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (f۱۰۶۳۳d.isEmpty()) {
                return;
            }
            synchronized (f۱۰۶۳۳d) {
                if (this.f۱۰۶۳۴a == null) {
                    this.f۱۰۶۳۴a = new WeakHashMap<>();
                }
                for (int i = f۱۰۶۳۳d.size() - 1; i >= 0; i--) {
                    WeakReference<View> vw = f۱۰۶۳۳d.get(i);
                    View v = vw.get();
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
