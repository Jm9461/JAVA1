package android.support.v7.widget;

import a.b.d.a.i;
import a.b.g.g.f;
import a.b.g.g.g;
import a.b.g.g.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.v4.util.LongSparseArray;
import android.support.v4.util.SparseArrayCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

public final class j {

    /* renamed from: g  reason: collision with root package name */
    private static final PorterDuff.Mode f۲۱۰۶g = PorterDuff.Mode.SRC_IN;

    /* renamed from: h  reason: collision with root package name */
    private static j f۲۱۰۷h;
    private static final c i = new c(6);
    private static final int[] j = {a.b.h.a.e.abc_textfield_search_default_mtrl_alpha, a.b.h.a.e.abc_textfield_default_mtrl_alpha, a.b.h.a.e.abc_ab_share_pack_mtrl_alpha};
    private static final int[] k = {a.b.h.a.e.abc_ic_commit_search_api_mtrl_alpha, a.b.h.a.e.abc_seekbar_tick_mark_material, a.b.h.a.e.abc_ic_menu_share_mtrl_alpha, a.b.h.a.e.abc_ic_menu_copy_mtrl_am_alpha, a.b.h.a.e.abc_ic_menu_cut_mtrl_alpha, a.b.h.a.e.abc_ic_menu_selectall_mtrl_alpha, a.b.h.a.e.abc_ic_menu_paste_mtrl_am_alpha};
    private static final int[] l = {a.b.h.a.e.abc_textfield_activated_mtrl_alpha, a.b.h.a.e.abc_textfield_search_activated_mtrl_alpha, a.b.h.a.e.abc_cab_background_top_mtrl_alpha, a.b.h.a.e.abc_text_cursor_material, a.b.h.a.e.abc_text_select_handle_left_mtrl_dark, a.b.h.a.e.abc_text_select_handle_middle_mtrl_dark, a.b.h.a.e.abc_text_select_handle_right_mtrl_dark, a.b.h.a.e.abc_text_select_handle_left_mtrl_light, a.b.h.a.e.abc_text_select_handle_middle_mtrl_light, a.b.h.a.e.abc_text_select_handle_right_mtrl_light};
    private static final int[] m = {a.b.h.a.e.abc_popup_background_mtrl_mult, a.b.h.a.e.abc_cab_background_internal_bg, a.b.h.a.e.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] n = {a.b.h.a.e.abc_tab_indicator_material, a.b.h.a.e.abc_textfield_search_material};
    private static final int[] o = {a.b.h.a.e.abc_btn_check_material, a.b.h.a.e.abc_btn_radio_material};

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap<Context, o<ColorStateList>> f۲۱۰۸a;

    /* renamed from: b  reason: collision with root package name */
    private a.b.g.g.a<String, d> f۲۱۰۹b;

    /* renamed from: c  reason: collision with root package name */
    private o<String> f۲۱۱۰c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap<Context, f<WeakReference<Drawable.ConstantState>>> f۲۱۱۱d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f۲۱۱۲e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f۲۱۱۳f;

    /* access modifiers changed from: private */
    public interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (f۲۱۰۷h == null) {
                f۲۱۰۷h = new j();
                a(f۲۱۰۷h);
            }
            jVar = f۲۱۰۷h;
        }
        return jVar;
    }

    private static void a(j manager) {
        if (Build.VERSION.SDK_INT < 24) {
            manager.a("vector", new e());
            manager.a("animated-vector", new b());
            manager.a("animated-selector", new a());
        }
    }

    public synchronized Drawable a(Context context, int resId) {
        return a(context, resId, false);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable a(Context context, int resId, boolean failIfNotKnown) {
        Drawable drawable;
        b(context);
        drawable = f(context, resId);
        if (drawable == null) {
            drawable = d(context, resId);
        }
        if (drawable == null) {
            drawable = android.support.v4.content.a.c(context, resId);
        }
        if (drawable != null) {
            drawable = a(context, resId, failIfNotKnown, drawable);
        }
        if (drawable != null) {
            h0.b(drawable);
        }
        return drawable;
    }

    public synchronized void a(Context context) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> cache = (f) this.f۲۱۱۱d.get(context);
        if (cache != null) {
            cache.a();
        }
    }

    private static long a(TypedValue tv) {
        return (((long) tv.assetCookie) << 32) | ((long) tv.data);
    }

    private Drawable d(Context context, int resId) {
        if (this.f۲۱۱۲e == null) {
            this.f۲۱۱۲e = new TypedValue();
        }
        TypedValue tv = this.f۲۱۱۲e;
        context.getResources().getValue(resId, tv, true);
        long key = a(tv);
        Drawable dr = a(context, key);
        if (dr != null) {
            return dr;
        }
        if (resId == a.b.h.a.e.abc_cab_background_top_material) {
            dr = new LayerDrawable(new Drawable[]{a(context, a.b.h.a.e.abc_cab_background_internal_bg), a(context, a.b.h.a.e.abc_cab_background_top_mtrl_alpha)});
        }
        if (dr != null) {
            dr.setChangingConfigurations(tv.changingConfigurations);
            a(context, key, dr);
        }
        return dr;
    }

    private Drawable a(Context context, int resId, boolean failIfNotKnown, Drawable drawable) {
        ColorStateList tintList = b(context, resId);
        if (tintList != null) {
            if (h0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable drawable2 = android.support.v4.graphics.drawable.a.h(drawable);
            android.support.v4.graphics.drawable.a.a(drawable2, tintList);
            PorterDuff.Mode tintMode = a(resId);
            if (tintMode == null) {
                return drawable2;
            }
            android.support.v4.graphics.drawable.a.a(drawable2, tintMode);
            return drawable2;
        } else if (resId == a.b.h.a.e.abc_seekbar_track_material) {
            LayerDrawable ld = (LayerDrawable) drawable;
            a(ld.findDrawableByLayerId(16908288), e1.b(context, a.b.h.a.a.colorControlNormal), f۲۱۰۶g);
            a(ld.findDrawableByLayerId(16908303), e1.b(context, a.b.h.a.a.colorControlNormal), f۲۱۰۶g);
            a(ld.findDrawableByLayerId(16908301), e1.b(context, a.b.h.a.a.colorControlActivated), f۲۱۰۶g);
            return drawable;
        } else if (resId == a.b.h.a.e.abc_ratingbar_material || resId == a.b.h.a.e.abc_ratingbar_indicator_material || resId == a.b.h.a.e.abc_ratingbar_small_material) {
            LayerDrawable ld2 = (LayerDrawable) drawable;
            a(ld2.findDrawableByLayerId(16908288), e1.a(context, a.b.h.a.a.colorControlNormal), f۲۱۰۶g);
            a(ld2.findDrawableByLayerId(16908303), e1.b(context, a.b.h.a.a.colorControlActivated), f۲۱۰۶g);
            a(ld2.findDrawableByLayerId(16908301), e1.b(context, a.b.h.a.a.colorControlActivated), f۲۱۰۶g);
            return drawable;
        } else if (a(context, resId, drawable) || !failIfNotKnown) {
            return drawable;
        } else {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076 A[Catch:{ Exception -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e A[Catch:{ Exception -> 0x00a6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable f(android.content.Context r13, int r14) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.j.f(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    private synchronized Drawable a(Context context, long key) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> cache = (f) this.f۲۱۱۱d.get(context);
        if (cache == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> wr = cache.b(key);
        if (wr != null) {
            Drawable.ConstantState entry = wr.get();
            if (entry != null) {
                return entry.newDrawable(context.getResources());
            }
            cache.a(key);
        }
        return null;
    }

    private synchronized boolean a(Context context, long key, Drawable drawable) {
        Drawable.ConstantState cs = drawable.getConstantState();
        if (cs == null) {
            return false;
        }
        LongSparseArray<WeakReference<Drawable.ConstantState>> cache = (f) this.f۲۱۱۱d.get(context);
        if (cache == null) {
            cache = new f<>();
            this.f۲۱۱۱d.put(context, cache);
        }
        cache.c(key, new WeakReference<>(cs));
        return true;
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable a(Context context, o1 resources, int resId) {
        Drawable drawable = f(context, resId);
        if (drawable == null) {
            drawable = resources.a(resId);
        }
        if (drawable == null) {
            return null;
        }
        return a(context, resId, false, drawable);
    }

    static boolean a(Context context, int resId, Drawable drawable) {
        PorterDuff.Mode tintMode = f۲۱۰۶g;
        boolean colorAttrSet = false;
        int colorAttr = 0;
        int alpha = -1;
        if (a(j, resId)) {
            colorAttr = a.b.h.a.a.colorControlNormal;
            colorAttrSet = true;
        } else if (a(l, resId)) {
            colorAttr = a.b.h.a.a.colorControlActivated;
            colorAttrSet = true;
        } else if (a(m, resId)) {
            colorAttr = 16842801;
            colorAttrSet = true;
            tintMode = PorterDuff.Mode.MULTIPLY;
        } else if (resId == a.b.h.a.e.abc_list_divider_mtrl_alpha) {
            colorAttr = 16842800;
            colorAttrSet = true;
            alpha = Math.round(40.8f);
        } else if (resId == a.b.h.a.e.abc_dialog_material_background) {
            colorAttr = 16842801;
            colorAttrSet = true;
        }
        if (!colorAttrSet) {
            return false;
        }
        if (h0.a(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(a(e1.b(context, colorAttr), tintMode));
        if (alpha == -1) {
            return true;
        }
        drawable.setAlpha(alpha);
        return true;
    }

    private void a(String tagName, d delegate) {
        if (this.f۲۱۰۹b == null) {
            this.f۲۱۰۹b = new a.b.g.g.a<>();
        }
        this.f۲۱۰۹b.put(tagName, delegate);
    }

    private static boolean a(int[] array, int value) {
        for (int id : array) {
            if (id == value) {
                return true;
            }
        }
        return false;
    }

    static PorterDuff.Mode a(int resId) {
        if (resId == a.b.h.a.e.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList b(Context context, int resId) {
        ColorStateList tint;
        tint = e(context, resId);
        if (tint == null) {
            if (resId == a.b.h.a.e.abc_edit_text_material) {
                tint = a.b.h.c.a.a.b(context, a.b.h.a.c.abc_tint_edittext);
            } else if (resId == a.b.h.a.e.abc_switch_track_mtrl_alpha) {
                tint = a.b.h.c.a.a.b(context, a.b.h.a.c.abc_tint_switch_track);
            } else if (resId == a.b.h.a.e.abc_switch_thumb_material) {
                tint = f(context);
            } else if (resId == a.b.h.a.e.abc_btn_default_mtrl_shape) {
                tint = e(context);
            } else if (resId == a.b.h.a.e.abc_btn_borderless_material) {
                tint = c(context);
            } else if (resId == a.b.h.a.e.abc_btn_colored_material) {
                tint = d(context);
            } else {
                if (resId != a.b.h.a.e.abc_spinner_mtrl_am_alpha) {
                    if (resId != a.b.h.a.e.abc_spinner_textfield_background_material) {
                        if (a(k, resId)) {
                            tint = e1.c(context, a.b.h.a.a.colorControlNormal);
                        } else if (a(n, resId)) {
                            tint = a.b.h.c.a.a.b(context, a.b.h.a.c.abc_tint_default);
                        } else if (a(o, resId)) {
                            tint = a.b.h.c.a.a.b(context, a.b.h.a.c.abc_tint_btn_checkable);
                        } else if (resId == a.b.h.a.e.abc_seekbar_thumb_material) {
                            tint = a.b.h.c.a.a.b(context, a.b.h.a.c.abc_tint_seek_thumb);
                        }
                    }
                }
                tint = a.b.h.c.a.a.b(context, a.b.h.a.c.abc_tint_spinner);
            }
            if (tint != null) {
                a(context, resId, tint);
            }
        }
        return tint;
    }

    private ColorStateList e(Context context, int resId) {
        SparseArrayCompat<ColorStateList> tints;
        WeakHashMap<Context, o<ColorStateList>> weakHashMap = this.f۲۱۰۸a;
        if (weakHashMap == null || (tints = (o) weakHashMap.get(context)) == null) {
            return null;
        }
        return tints.b(resId);
    }

    private void a(Context context, int resId, ColorStateList tintList) {
        if (this.f۲۱۰۸a == null) {
            this.f۲۱۰۸a = new WeakHashMap<>();
        }
        SparseArrayCompat<ColorStateList> themeTints = (o) this.f۲۱۰۸a.get(context);
        if (themeTints == null) {
            themeTints = new o<>();
            this.f۲۱۰۸a.put(context, themeTints);
        }
        themeTints.a(resId, tintList);
    }

    private ColorStateList e(Context context) {
        return c(context, e1.b(context, a.b.h.a.a.colorButtonNormal));
    }

    private ColorStateList c(Context context) {
        return c(context, 0);
    }

    private ColorStateList d(Context context) {
        return c(context, e1.b(context, a.b.h.a.a.colorAccent));
    }

    private ColorStateList c(Context context, int baseColor) {
        int[][] states = new int[4][];
        int[] colors = new int[4];
        int colorControlHighlight = e1.b(context, a.b.h.a.a.colorControlHighlight);
        int disabledColor = e1.a(context, a.b.h.a.a.colorButtonNormal);
        states[0] = e1.f۲۰۲۷b;
        colors[0] = disabledColor;
        int i2 = 0 + 1;
        states[i2] = e1.f۲۰۲۹d;
        colors[i2] = a.b.g.a.a.b(colorControlHighlight, baseColor);
        int i3 = i2 + 1;
        states[i3] = e1.f۲۰۲۸c;
        colors[i3] = a.b.g.a.a.b(colorControlHighlight, baseColor);
        int i4 = i3 + 1;
        states[i4] = e1.f۲۰۳۱f;
        colors[i4] = baseColor;
        int i5 = i4 + 1;
        return new ColorStateList(states, colors);
    }

    private ColorStateList f(Context context) {
        int[][] states = new int[3][];
        int[] colors = new int[3];
        ColorStateList thumbColor = e1.c(context, a.b.h.a.a.colorSwitchThumbNormal);
        if (thumbColor == null || !thumbColor.isStateful()) {
            states[0] = e1.f۲۰۲۷b;
            colors[0] = e1.a(context, a.b.h.a.a.colorSwitchThumbNormal);
            int i2 = 0 + 1;
            states[i2] = e1.f۲۰۳۰e;
            colors[i2] = e1.b(context, a.b.h.a.a.colorControlActivated);
            int i3 = i2 + 1;
            states[i3] = e1.f۲۰۳۱f;
            colors[i3] = e1.b(context, a.b.h.a.a.colorSwitchThumbNormal);
            int i4 = i3 + 1;
        } else {
            states[0] = e1.f۲۰۲۷b;
            colors[0] = thumbColor.getColorForState(states[0], 0);
            int i5 = 0 + 1;
            states[i5] = e1.f۲۰۳۰e;
            colors[i5] = e1.b(context, a.b.h.a.a.colorControlActivated);
            int i6 = i5 + 1;
            states[i6] = e1.f۲۰۳۱f;
            colors[i6] = thumbColor.getDefaultColor();
            int i7 = i6 + 1;
        }
        return new ColorStateList(states, colors);
    }

    /* access modifiers changed from: private */
    public static class c extends g<Integer, PorterDuffColorFilter> {
        public c(int maxSize) {
            super(maxSize);
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter a(int color, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) b(Integer.valueOf(b(color, mode)));
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter a(int color, PorterDuff.Mode mode, PorterDuffColorFilter filter) {
            return (PorterDuffColorFilter) a(Integer.valueOf(b(color, mode)), filter);
        }

        private static int b(int color, PorterDuff.Mode mode) {
            return (((1 * 31) + color) * 31) + mode.hashCode();
        }
    }

    static void a(Drawable drawable, h1 tint, int[] state) {
        if (!h0.a(drawable) || drawable.mutate() == drawable) {
            if (tint.f۲۰۹۰d || tint.f۲۰۸۹c) {
                drawable.setColorFilter(a(tint.f۲۰۹۰d ? tint.f۲۰۸۷a : null, tint.f۲۰۸۹c ? tint.f۲۰۸۸b : f۲۱۰۶g, state));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }

    private static PorterDuffColorFilter a(ColorStateList tint, PorterDuff.Mode tintMode, int[] state) {
        if (tint == null || tintMode == null) {
            return null;
        }
        return a(tint.getColorForState(state, 0), tintMode);
    }

    public static synchronized PorterDuffColorFilter a(int color, PorterDuff.Mode mode) {
        PorterDuffColorFilter filter;
        synchronized (j.class) {
            filter = i.a(color, mode);
            if (filter == null) {
                filter = new PorterDuffColorFilter(color, mode);
                i.a(color, mode, filter);
            }
        }
        return filter;
    }

    private static void a(Drawable d2, int color, PorterDuff.Mode mode) {
        if (h0.a(d2)) {
            d2 = d2.mutate();
        }
        d2.setColorFilter(a(color, mode == null ? f۲۱۰۶g : mode));
    }

    private void b(Context context) {
        if (!this.f۲۱۱۳f) {
            this.f۲۱۱۳f = true;
            Drawable d2 = a(context, a.b.h.a.e.abc_vector_test);
            if (d2 == null || !a(d2)) {
                this.f۲۱۱۳f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private static boolean a(Drawable d2) {
        return (d2 instanceof i) || "android.graphics.drawable.VectorDrawable".equals(d2.getClass().getName());
    }

    /* access modifiers changed from: private */
    public static class e implements d {
        e() {
        }

        @Override // android.support.v7.widget.j.d
        public Drawable a(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return i.createFromXmlInner(context.getResources(), parser, attrs, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    public static class b implements d {
        b() {
        }

        @Override // android.support.v7.widget.j.d
        public Drawable a(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return a.b.d.a.c.a(context, context.getResources(), parser, attrs, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class a implements d {
        a() {
        }

        @Override // android.support.v7.widget.j.d
        public Drawable a(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return a.b.h.d.a.a.b(context, context.getResources(), parser, attrs, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }
}
