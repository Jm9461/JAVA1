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

public class u {

    /* renamed from: a  reason: collision with root package name */
    private static Field f۱۳۶۹a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f۱۳۷۰b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f۱۳۷۱c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f۱۳۷۲d;

    /* renamed from: e  reason: collision with root package name */
    private static WeakHashMap<View, String> f۱۳۷۳e;

    /* renamed from: f  reason: collision with root package name */
    private static WeakHashMap<View, y> f۱۳۷۴f = null;

    /* renamed from: g  reason: collision with root package name */
    private static Field f۱۳۷۵g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f۱۳۷۶h = false;
    private static ThreadLocal<Rect> i;

    public interface b {
        boolean a(View view, KeyEvent keyEvent);
    }

    static {
        new AtomicInteger(1);
    }

    private static Rect a() {
        if (i == null) {
            i = new ThreadLocal<>();
        }
        Rect rect = i.get();
        if (rect == null) {
            rect = new Rect();
            i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void a(View v, android.support.v4.view.d0.c info2) {
        v.onInitializeAccessibilityNodeInfo(info2.v());
    }

    public static void a(View v, b delegate) {
        v.setAccessibilityDelegate(delegate == null ? null : delegate.a());
    }

    @SuppressLint({"InlinedApi"})
    public static int j(View v) {
        if (Build.VERSION.SDK_INT >= 26) {
            return v.getImportantForAutofill();
        }
        return 0;
    }

    public static void g(View v, int mode) {
        if (Build.VERSION.SDK_INT >= 26) {
            v.setImportantForAutofill(mode);
        }
    }

    public static boolean t(View v) {
        if (f۱۳۷۶h) {
            return false;
        }
        if (f۱۳۷۵g == null) {
            try {
                f۱۳۷۵g = View.class.getDeclaredField("mAccessibilityDelegate");
                f۱۳۷۵g.setAccessible(true);
            } catch (Throwable th) {
                f۱۳۷۶h = true;
                return false;
            }
        }
        try {
            if (f۱۳۷۵g.get(v) != null) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            f۱۳۷۶h = true;
            return false;
        }
    }

    public static boolean w(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    public static void b(View view, boolean hasTransientState) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(hasTransientState);
        }
    }

    public static void B(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static void a(View view, Runnable action) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(action);
        } else {
            view.postDelayed(action, ValueAnimator.getFrameDelay());
        }
    }

    public static void a(View view, Runnable action, long delayMillis) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(action, delayMillis);
        } else {
            view.postDelayed(action, ValueAnimator.getFrameDelay() + delayMillis);
        }
    }

    public static int i(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    public static void f(View view, int mode) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            view.setImportantForAccessibility(mode);
        } else if (i2 >= 16) {
            if (mode == 4) {
                mode = 2;
            }
            view.setImportantForAccessibility(mode);
        }
    }

    public static boolean a(View view, int action, Bundle arguments) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(action, arguments);
        }
        return false;
    }

    public static int k(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static ViewParent p(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    public static int b(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static void e(View view, int mode) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(mode);
        }
    }

    public static int o(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    public static int n(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    public static void a(View view, int start, int top, int end, int bottom) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(start, top, end, bottom);
        } else {
            view.setPadding(start, top, end, bottom);
        }
    }

    public static int m(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f۱۳۷۰b) {
            try {
                f۱۳۶۹a = View.class.getDeclaredField("mMinWidth");
                f۱۳۶۹a.setAccessible(true);
            } catch (NoSuchFieldException e2) {
            }
            f۱۳۷۰b = true;
        }
        Field field = f۱۳۶۹a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception e3) {
            return 0;
        }
    }

    public static int l(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f۱۳۷۲d) {
            try {
                f۱۳۷۱c = View.class.getDeclaredField("mMinHeight");
                f۱۳۷۱c.setAccessible(true);
            } catch (NoSuchFieldException e2) {
            }
            f۱۳۷۲d = true;
        }
        Field field = f۱۳۷۱c;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception e3) {
            return 0;
        }
    }

    public static y a(View view) {
        if (f۱۳۷۴f == null) {
            f۱۳۷۴f = new WeakHashMap<>();
        }
        y vpa = f۱۳۷۴f.get(view);
        if (vpa != null) {
            return vpa;
        }
        y vpa2 = new y(view);
        f۱۳۷۴f.put(view, vpa2);
        return vpa2;
    }

    public static void a(View view, float elevation) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(elevation);
        }
    }

    public static float g(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    public static void a(View view, String transitionName) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(transitionName);
            return;
        }
        if (f۱۳۷۳e == null) {
            f۱۳۷۳e = new WeakHashMap<>();
        }
        f۱۳۷۳e.put(view, transitionName);
    }

    public static String q(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f۱۳۷۳e;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static int r(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static void C(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            view.requestApplyInsets();
        } else if (i2 >= 16) {
            view.requestFitSystemWindows();
        }
    }

    public static boolean h(View v) {
        if (Build.VERSION.SDK_INT >= 16) {
            return v.getFitsSystemWindows();
        }
        return false;
    }

    @Deprecated
    public static void a(View view, boolean fitSystemWindows) {
        view.setFitsSystemWindows(fitSystemWindows);
    }

    public static void a(View v, p listener) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (listener == null) {
            v.setOnApplyWindowInsetsListener(null);
        } else {
            v.setOnApplyWindowInsetsListener(new a(listener));
        }
    }

    static class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f۱۳۷۷a;

        a(p pVar) {
            this.f۱۳۷۷a = pVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
            return (WindowInsets) c0.a(this.f۱۳۷۷a.a(view, c0.a(insets)));
        }
    }

    public static c0 b(View view, c0 insets) {
        if (Build.VERSION.SDK_INT < 21) {
            return insets;
        }
        WindowInsets unwrapped = (WindowInsets) c0.a(insets);
        WindowInsets result = view.onApplyWindowInsets(unwrapped);
        if (result != unwrapped) {
            unwrapped = new WindowInsets(result);
        }
        return c0.a(unwrapped);
    }

    public static c0 a(View view, c0 insets) {
        if (Build.VERSION.SDK_INT < 21) {
            return insets;
        }
        WindowInsets unwrapped = (WindowInsets) c0.a(insets);
        WindowInsets result = view.dispatchApplyWindowInsets(unwrapped);
        if (result != unwrapped) {
            unwrapped = new WindowInsets(result);
        }
        return c0.a(unwrapped);
    }

    public static boolean v(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    public static boolean A(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    public static void a(View view, Drawable background) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(background);
        } else {
            view.setBackgroundDrawable(background);
        }
    }

    public static ColorStateList c(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof t) {
            return ((t) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static void a(View view, ColorStateList tintList) {
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
        } else if (view instanceof t) {
            ((t) view).setSupportBackgroundTintList(tintList);
        }
    }

    public static PorterDuff.Mode d(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof t) {
            return ((t) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static void a(View view, PorterDuff.Mode mode) {
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
        } else if (view instanceof t) {
            ((t) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static boolean z(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof k) {
            return ((k) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static void D(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof k) {
            ((k) view).stopNestedScroll();
        }
    }

    public static void h(View view, int type) {
        if (view instanceof j) {
            ((j) view).a(type);
        } else if (type == 0) {
            D(view);
        }
    }

    public static boolean y(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static float s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static void d(View view, int offset) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(offset);
        } else if (i2 >= 21) {
            Rect parentRect = a();
            boolean needInvalidateWorkaround = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View p = (View) parent;
                parentRect.set(p.getLeft(), p.getTop(), p.getRight(), p.getBottom());
                needInvalidateWorkaround = !parentRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            b(view, offset);
            if (needInvalidateWorkaround && parentRect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(parentRect);
            }
        } else {
            b(view, offset);
        }
    }

    private static void b(View view, int offset) {
        view.offsetTopAndBottom(offset);
        if (view.getVisibility() == 0) {
            E(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                E((View) parent);
            }
        }
    }

    public static void c(View view, int offset) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(offset);
        } else if (i2 >= 21) {
            Rect parentRect = a();
            boolean needInvalidateWorkaround = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View p = (View) parent;
                parentRect.set(p.getLeft(), p.getTop(), p.getRight(), p.getBottom());
                needInvalidateWorkaround = !parentRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            a(view, offset);
            if (needInvalidateWorkaround && parentRect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(parentRect);
            }
        } else {
            a(view, offset);
        }
    }

    private static void a(View view, int offset) {
        view.offsetLeftAndRight(offset);
        if (view.getVisibility() == 0) {
            E(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                E((View) parent);
            }
        }
    }

    private static void E(View view) {
        float y = view.getTranslationY();
        view.setTranslationY(1.0f + y);
        view.setTranslationY(y);
    }

    public static void a(View view, Rect clipBounds) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(clipBounds);
        }
    }

    public static Rect e(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    public static boolean x(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    public static boolean u(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static void a(View view, int indicators, int mask) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(indicators, mask);
        }
    }

    public static void a(View view, r pointerIcon) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (pointerIcon != null ? pointerIcon.a() : null));
        }
    }

    public static Display f(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (x(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    static boolean b(View root, KeyEvent evt) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return c.a(root).a(evt);
    }

    static boolean a(View root, KeyEvent evt) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return c.a(root).a(root, evt);
    }

    static class c {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f۱۳۷۸d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f۱۳۷۹a = null;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<WeakReference<View>> f۱۳۸۰b = null;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<KeyEvent> f۱۳۸۱c = null;

        c() {
        }

        private SparseArray<WeakReference<View>> a() {
            if (this.f۱۳۸۰b == null) {
                this.f۱۳۸۰b = new SparseArray<>();
            }
            return this.f۱۳۸۰b;
        }

        static c a(View root) {
            c manager = (c) root.getTag(a.b.a.c.tag_unhandled_key_event_manager);
            if (manager != null) {
                return manager;
            }
            c manager2 = new c();
            root.setTag(a.b.a.c.tag_unhandled_key_event_manager, manager2);
            return manager2;
        }

        /* access modifiers changed from: package-private */
        public boolean a(View root, KeyEvent event) {
            if (event.getAction() == 0) {
                b();
            }
            View consumer = b(root, event);
            if (event.getAction() == 0) {
                int keycode = event.getKeyCode();
                if (consumer != null && !KeyEvent.isModifierKey(keycode)) {
                    a().put(keycode, new WeakReference<>(consumer));
                }
            }
            return consumer != null;
        }

        private View b(View view, KeyEvent event) {
            WeakHashMap<View, Boolean> weakHashMap = this.f۱۳۷۹a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup vg = (ViewGroup) view;
                for (int i = vg.getChildCount() - 1; i >= 0; i--) {
                    View consumer = b(vg.getChildAt(i), event);
                    if (consumer != null) {
                        return consumer;
                    }
                }
            }
            if (c(view, event)) {
                return view;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean a(KeyEvent event) {
            int idx;
            WeakReference<KeyEvent> weakReference = this.f۱۳۸۱c;
            if (weakReference != null && weakReference.get() == event) {
                return false;
            }
            this.f۱۳۸۱c = new WeakReference<>(event);
            WeakReference<View> currentReceiver = null;
            SparseArray<WeakReference<View>> capturedKeys = a();
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
            if (target != null && u.x(target)) {
                c(target, event);
            }
            return true;
        }

        private boolean c(View v, KeyEvent event) {
            ArrayList<ViewCompat.OnUnhandledKeyEventListenerCompat> viewListeners = (ArrayList) v.getTag(a.b.a.c.tag_unhandled_key_listeners);
            if (viewListeners == null) {
                return false;
            }
            for (int i = viewListeners.size() - 1; i >= 0; i--) {
                if (((b) viewListeners.get(i)).a(v, event)) {
                    return true;
                }
            }
            return false;
        }

        private void b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f۱۳۷۹a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f۱۳۷۸d.isEmpty()) {
                synchronized (f۱۳۷۸d) {
                    if (this.f۱۳۷۹a == null) {
                        this.f۱۳۷۹a = new WeakHashMap<>();
                    }
                    for (int i = f۱۳۷۸d.size() - 1; i >= 0; i--) {
                        View v = f۱۳۷۸d.get(i).get();
                        if (v == null) {
                            f۱۳۷۸d.remove(i);
                        } else {
                            this.f۱۳۷۹a.put(v, Boolean.TRUE);
                            for (ViewParent nxt = v.getParent(); nxt instanceof View; nxt = nxt.getParent()) {
                                this.f۱۳۷۹a.put((View) nxt, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
    }
}
