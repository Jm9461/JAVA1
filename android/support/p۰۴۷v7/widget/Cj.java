package android.support.p۰۴۷v7.widget;

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
import p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a.Ci;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cf;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cg;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Co;

/* renamed from: android.support.v7.widget.j  reason: invalid class name */
public final class Cj {

    /* renamed from: g  reason: contains not printable characters */
    private static final PorterDuff.Mode f۱۲۱۰۲g = PorterDuff.Mode.SRC_IN;

    /* renamed from: h  reason: contains not printable characters */
    private static Cj f۱۲۱۰۳h;

    /* renamed from: i  reason: contains not printable characters */
    private static final Cc f۱۲۱۰۴i = new Cc(6);

    /* renamed from: j  reason: contains not printable characters */
    private static final int[] f۱۲۱۰۵j = {p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_textfield_search_default_mtrl_alpha, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_textfield_default_mtrl_alpha, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: k  reason: contains not printable characters */
    private static final int[] f۱۲۱۰۶k = {p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_ic_commit_search_api_mtrl_alpha, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_seekbar_tick_mark_material, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_ic_menu_share_mtrl_alpha, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_ic_menu_copy_mtrl_am_alpha, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_ic_menu_cut_mtrl_alpha, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_ic_menu_selectall_mtrl_alpha, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: l  reason: contains not printable characters */
    private static final int[] f۱۲۱۰۷l = {p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_textfield_activated_mtrl_alpha, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_textfield_search_activated_mtrl_alpha, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_cab_background_top_mtrl_alpha, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_text_cursor_material, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_text_select_handle_left_mtrl_dark, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_text_select_handle_middle_mtrl_dark, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_text_select_handle_right_mtrl_dark, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_text_select_handle_left_mtrl_light, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_text_select_handle_middle_mtrl_light, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_text_select_handle_right_mtrl_light};

    /* renamed from: m  reason: contains not printable characters */
    private static final int[] f۱۲۱۰۸m = {p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_popup_background_mtrl_mult, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_cab_background_internal_bg, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: n  reason: contains not printable characters */
    private static final int[] f۱۲۱۰۹n = {p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_tab_indicator_material, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_textfield_search_material};

    /* renamed from: o  reason: contains not printable characters */
    private static final int[] f۱۲۱۱۰o = {p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_btn_check_material, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_btn_radio_material};

    /* renamed from: a  reason: contains not printable characters */
    private WeakHashMap<Context, Co<ColorStateList>> f۱۲۱۱۱a;

    /* renamed from: b  reason: contains not printable characters */
    private p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<String, AbstractCd> f۱۲۱۱۲b;

    /* renamed from: c  reason: contains not printable characters */
    private Co<String> f۱۲۱۱۳c;

    /* renamed from: d  reason: contains not printable characters */
    private final WeakHashMap<Context, Cf<WeakReference<Drawable.ConstantState>>> f۱۲۱۱۴d = new WeakHashMap<>(0);

    /* renamed from: e  reason: contains not printable characters */
    private TypedValue f۱۲۱۱۵e;

    /* renamed from: f  reason: contains not printable characters */
    private boolean f۱۲۱۱۶f;

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.j$d  reason: invalid class name */
    public interface AbstractCd {
        /* renamed from: a  reason: contains not printable characters */
        Drawable m۱۵۳۱۶a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static synchronized Cj m۱۵۲۸۷a() {
        Cj jVar;
        synchronized (Cj.class) {
            if (f۱۲۱۰۳h == null) {
                f۱۲۱۰۳h = new Cj();
                m۱۵۲۹۱a(f۱۲۱۰۳h);
            }
            jVar = f۱۲۱۰۳h;
        }
        return jVar;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۵۲۹۱a(Cj manager) {
        if (Build.VERSION.SDK_INT < 24) {
            manager.m۱۵۲۹۲a("vector", new Ce());
            manager.m۱۵۲۹۲a("animated-vector", new Cb());
            manager.m۱۵۲۹۲a("animated-selector", new Ca());
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public synchronized Drawable m۱۵۳۰۶a(Context context, int resId) {
        return m۱۵۳۰۷a(context, resId, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public synchronized Drawable m۱۵۳۰۷a(Context context, int resId, boolean failIfNotKnown) {
        Drawable drawable;
        m۱۵۲۹۷b(context);
        drawable = m۱۵۳۰۵f(context, resId);
        if (drawable == null) {
            drawable = m۱۵۳۰۱d(context, resId);
        }
        if (drawable == null) {
            drawable = android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۶c(context, resId);
        }
        if (drawable != null) {
            drawable = m۱۵۲۸۵a(context, resId, failIfNotKnown, drawable);
        }
        if (drawable != null) {
            Ch0.m۱۵۲۵۶b(drawable);
        }
        return drawable;
    }

    /* renamed from: a  reason: contains not printable characters */
    public synchronized void m۱۵۳۰۹a(Context context) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> cache = (Cf) this.f۱۲۱۱۴d.get(context);
        if (cache != null) {
            cache.m۱۰۵۹۶a();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static long m۱۵۲۸۱a(TypedValue tv) {
        return (((long) tv.assetCookie) << 32) | ((long) tv.data);
    }

    /* renamed from: d  reason: contains not printable characters */
    private Drawable m۱۵۳۰۱d(Context context, int resId) {
        if (this.f۱۲۱۱۵e == null) {
            this.f۱۲۱۱۵e = new TypedValue();
        }
        TypedValue tv = this.f۱۲۱۱۵e;
        context.getResources().getValue(resId, tv, true);
        long key = m۱۵۲۸۱a(tv);
        Drawable dr = m۱۵۲۸۶a(context, key);
        if (dr != null) {
            return dr;
        }
        if (resId == p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_cab_background_top_material) {
            dr = new LayerDrawable(new Drawable[]{m۱۵۳۰۶a(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_cab_background_internal_bg), m۱۵۳۰۶a(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_cab_background_top_mtrl_alpha)});
        }
        if (dr != null) {
            dr.setChangingConfigurations(tv.changingConfigurations);
            m۱۵۲۹۴a(context, key, dr);
        }
        return dr;
    }

    /* renamed from: a  reason: contains not printable characters */
    private Drawable m۱۵۲۸۵a(Context context, int resId, boolean failIfNotKnown, Drawable drawable) {
        ColorStateList tintList = m۱۵۳۱۰b(context, resId);
        if (tintList != null) {
            if (Ch0.m۱۵۲۵۵a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable drawable2 = android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۲۲h(drawable);
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(drawable2, tintList);
            PorterDuff.Mode tintMode = m۱۵۲۸۲a(resId);
            if (tintMode == null) {
                return drawable2;
            }
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۱a(drawable2, tintMode);
            return drawable2;
        } else if (resId == p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_seekbar_track_material) {
            LayerDrawable ld = (LayerDrawable) drawable;
            m۱۵۲۸۹a(ld.findDrawableByLayerId(16908288), Ce1.m۱۵۱۹۳b(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorControlNormal), f۱۲۱۰۲g);
            m۱۵۲۸۹a(ld.findDrawableByLayerId(16908303), Ce1.m۱۵۱۹۳b(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorControlNormal), f۱۲۱۰۲g);
            m۱۵۲۸۹a(ld.findDrawableByLayerId(16908301), Ce1.m۱۵۱۹۳b(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorControlActivated), f۱۲۱۰۲g);
            return drawable;
        } else if (resId == p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_ratingbar_material || resId == p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_ratingbar_indicator_material || resId == p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_ratingbar_small_material) {
            LayerDrawable ld2 = (LayerDrawable) drawable;
            m۱۵۲۸۹a(ld2.findDrawableByLayerId(16908288), Ce1.m۱۵۱۹۰a(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorControlNormal), f۱۲۱۰۲g);
            m۱۵۲۸۹a(ld2.findDrawableByLayerId(16908303), Ce1.m۱۵۱۹۳b(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorControlActivated), f۱۲۱۰۲g);
            m۱۵۲۸۹a(ld2.findDrawableByLayerId(16908301), Ce1.m۱۵۱۹۳b(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorControlActivated), f۱۲۱۰۲g);
            return drawable;
        } else if (m۱۵۲۹۳a(context, resId, drawable) || !failIfNotKnown) {
            return drawable;
        } else {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076 A[Catch:{ Exception -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e A[Catch:{ Exception -> 0x00a6 }] */
    /* renamed from: f  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m۱۵۳۰۵f(android.content.Context r13, int r14) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۷v7.widget.Cj.m۱۵۳۰۵f(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: a  reason: contains not printable characters */
    private synchronized Drawable m۱۵۲۸۶a(Context context, long key) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> cache = (Cf) this.f۱۲۱۱۴d.get(context);
        if (cache == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> wr = cache.m۱۰۶۰۰b(key);
        if (wr != null) {
            Drawable.ConstantState entry = wr.get();
            if (entry != null) {
                return entry.newDrawable(context.getResources());
            }
            cache.m۱۰۵۹۷a(key);
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    private synchronized boolean m۱۵۲۹۴a(Context context, long key, Drawable drawable) {
        Drawable.ConstantState cs = drawable.getConstantState();
        if (cs == null) {
            return false;
        }
        LongSparseArray<WeakReference<Drawable.ConstantState>> cache = (Cf) this.f۱۲۱۱۴d.get(context);
        if (cache == null) {
            cache = new Cf<>();
            this.f۱۲۱۱۴d.put(context, cache);
        }
        cache.m۱۰۶۰۵c(key, new WeakReference<>(cs));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public synchronized Drawable m۱۵۳۰۸a(Context context, Co1 resources, int resId) {
        Drawable drawable = m۱۵۳۰۵f(context, resId);
        if (drawable == null) {
            drawable = resources.m۱۵۴۸۰a(resId);
        }
        if (drawable == null) {
            return null;
        }
        return m۱۵۲۸۵a(context, resId, false, drawable);
    }

    /* renamed from: a  reason: contains not printable characters */
    static boolean m۱۵۲۹۳a(Context context, int resId, Drawable drawable) {
        PorterDuff.Mode tintMode = f۱۲۱۰۲g;
        boolean colorAttrSet = false;
        int colorAttr = 0;
        int alpha = -1;
        if (m۱۵۲۹۶a(f۱۲۱۰۵j, resId)) {
            colorAttr = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorControlNormal;
            colorAttrSet = true;
        } else if (m۱۵۲۹۶a(f۱۲۱۰۷l, resId)) {
            colorAttr = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorControlActivated;
            colorAttrSet = true;
        } else if (m۱۵۲۹۶a(f۱۲۱۰۸m, resId)) {
            colorAttr = 16842801;
            colorAttrSet = true;
            tintMode = PorterDuff.Mode.MULTIPLY;
        } else if (resId == p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_list_divider_mtrl_alpha) {
            colorAttr = 16842800;
            colorAttrSet = true;
            alpha = Math.round(40.8f);
        } else if (resId == p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_dialog_material_background) {
            colorAttr = 16842801;
            colorAttrSet = true;
        }
        if (!colorAttrSet) {
            return false;
        }
        if (Ch0.m۱۵۲۵۵a(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(m۱۵۲۸۳a(Ce1.m۱۵۱۹۳b(context, colorAttr), tintMode));
        if (alpha == -1) {
            return true;
        }
        drawable.setAlpha(alpha);
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۲۹۲a(String tagName, AbstractCd delegate) {
        if (this.f۱۲۱۱۲b == null) {
            this.f۱۲۱۱۲b = new p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<>();
        }
        this.f۱۲۱۱۲b.put(tagName, delegate);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۵۲۹۶a(int[] array, int value) {
        for (int id : array) {
            if (id == value) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    static PorterDuff.Mode m۱۵۲۸۲a(int resId) {
        if (resId == p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public synchronized ColorStateList m۱۵۳۱۰b(Context context, int resId) {
        ColorStateList tint;
        tint = m۱۵۳۰۳e(context, resId);
        if (tint == null) {
            if (resId == p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_edit_text_material) {
                tint = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۲b(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cc.abc_tint_edittext);
            } else if (resId == p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_switch_track_mtrl_alpha) {
                tint = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۲b(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cc.abc_tint_switch_track);
            } else if (resId == p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_switch_thumb_material) {
                tint = m۱۵۳۰۴f(context);
            } else if (resId == p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_btn_default_mtrl_shape) {
                tint = m۱۵۳۰۲e(context);
            } else if (resId == p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_btn_borderless_material) {
                tint = m۱۵۲۹۸c(context);
            } else if (resId == p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_btn_colored_material) {
                tint = m۱۵۳۰۰d(context);
            } else {
                if (resId != p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_spinner_mtrl_am_alpha) {
                    if (resId != p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_spinner_textfield_background_material) {
                        if (m۱۵۲۹۶a(f۱۲۱۰۶k, resId)) {
                            tint = Ce1.m۱۵۱۹۴c(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorControlNormal);
                        } else if (m۱۵۲۹۶a(f۱۲۱۰۹n, resId)) {
                            tint = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۲b(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cc.abc_tint_default);
                        } else if (m۱۵۲۹۶a(f۱۲۱۱۰o, resId)) {
                            tint = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۲b(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cc.abc_tint_btn_checkable);
                        } else if (resId == p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_seekbar_thumb_material) {
                            tint = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۲b(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cc.abc_tint_seek_thumb);
                        }
                    }
                }
                tint = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۲b(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cc.abc_tint_spinner);
            }
            if (tint != null) {
                m۱۵۲۸۸a(context, resId, tint);
            }
        }
        return tint;
    }

    /* renamed from: e  reason: contains not printable characters */
    private ColorStateList m۱۵۳۰۳e(Context context, int resId) {
        SparseArrayCompat<ColorStateList> tints;
        WeakHashMap<Context, Co<ColorStateList>> weakHashMap = this.f۱۲۱۱۱a;
        if (weakHashMap == null || (tints = (Co) weakHashMap.get(context)) == null) {
            return null;
        }
        return tints.m۱۰۶۶۲b(resId);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۲۸۸a(Context context, int resId, ColorStateList tintList) {
        if (this.f۱۲۱۱۱a == null) {
            this.f۱۲۱۱۱a = new WeakHashMap<>();
        }
        SparseArrayCompat<ColorStateList> themeTints = (Co) this.f۱۲۱۱۱a.get(context);
        if (themeTints == null) {
            themeTints = new Co<>();
            this.f۱۲۱۱۱a.put(context, themeTints);
        }
        themeTints.m۱۰۶۶۰a(resId, tintList);
    }

    /* renamed from: e  reason: contains not printable characters */
    private ColorStateList m۱۵۳۰۲e(Context context) {
        return m۱۵۲۹۹c(context, Ce1.m۱۵۱۹۳b(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorButtonNormal));
    }

    /* renamed from: c  reason: contains not printable characters */
    private ColorStateList m۱۵۲۹۸c(Context context) {
        return m۱۵۲۹۹c(context, 0);
    }

    /* renamed from: d  reason: contains not printable characters */
    private ColorStateList m۱۵۳۰۰d(Context context) {
        return m۱۵۲۹۹c(context, Ce1.m۱۵۱۹۳b(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorAccent));
    }

    /* renamed from: c  reason: contains not printable characters */
    private ColorStateList m۱۵۲۹۹c(Context context, int baseColor) {
        int[][] states = new int[4][];
        int[] colors = new int[4];
        int colorControlHighlight = Ce1.m۱۵۱۹۳b(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorControlHighlight);
        int disabledColor = Ce1.m۱۵۱۹۰a(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorButtonNormal);
        states[0] = Ce1.f۱۲۰۰۴b;
        colors[0] = disabledColor;
        int i = 0 + 1;
        states[i] = Ce1.f۱۲۰۰۶d;
        colors[i] = p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Ca.m۱۰۴۱۹b(colorControlHighlight, baseColor);
        int i2 = i + 1;
        states[i2] = Ce1.f۱۲۰۰۵c;
        colors[i2] = p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Ca.m۱۰۴۱۹b(colorControlHighlight, baseColor);
        int i3 = i2 + 1;
        states[i3] = Ce1.f۱۲۰۰۸f;
        colors[i3] = baseColor;
        int i4 = i3 + 1;
        return new ColorStateList(states, colors);
    }

    /* renamed from: f  reason: contains not printable characters */
    private ColorStateList m۱۵۳۰۴f(Context context) {
        int[][] states = new int[3][];
        int[] colors = new int[3];
        ColorStateList thumbColor = Ce1.m۱۵۱۹۴c(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorSwitchThumbNormal);
        if (thumbColor == null || !thumbColor.isStateful()) {
            states[0] = Ce1.f۱۲۰۰۴b;
            colors[0] = Ce1.m۱۵۱۹۰a(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorSwitchThumbNormal);
            int i = 0 + 1;
            states[i] = Ce1.f۱۲۰۰۷e;
            colors[i] = Ce1.m۱۵۱۹۳b(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorControlActivated);
            int i2 = i + 1;
            states[i2] = Ce1.f۱۲۰۰۸f;
            colors[i2] = Ce1.m۱۵۱۹۳b(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorSwitchThumbNormal);
            int i3 = i2 + 1;
        } else {
            states[0] = Ce1.f۱۲۰۰۴b;
            colors[0] = thumbColor.getColorForState(states[0], 0);
            int i4 = 0 + 1;
            states[i4] = Ce1.f۱۲۰۰۷e;
            colors[i4] = Ce1.m۱۵۱۹۳b(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorControlActivated);
            int i5 = i4 + 1;
            states[i5] = Ce1.f۱۲۰۰۸f;
            colors[i5] = thumbColor.getDefaultColor();
            int i6 = i5 + 1;
        }
        return new ColorStateList(states, colors);
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.j$c  reason: invalid class name */
    public static class Cc extends Cg<Integer, PorterDuffColorFilter> {
        public Cc(int maxSize) {
            super(maxSize);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public PorterDuffColorFilter m۱۵۳۱۴a(int color, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) m۱۰۶۱۲b(Integer.valueOf(m۱۵۳۱۳b(color, mode)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public PorterDuffColorFilter m۱۵۳۱۵a(int color, PorterDuff.Mode mode, PorterDuffColorFilter filter) {
            return (PorterDuffColorFilter) m۱۰۶۰۸a(Integer.valueOf(m۱۵۳۱۳b(color, mode)), filter);
        }

        /* renamed from: b  reason: contains not printable characters */
        private static int m۱۵۳۱۳b(int color, PorterDuff.Mode mode) {
            return (((1 * 31) + color) * 31) + mode.hashCode();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۵۲۹۰a(Drawable drawable, Ch1 tint, int[] state) {
        if (!Ch0.m۱۵۲۵۵a(drawable) || drawable.mutate() == drawable) {
            if (tint.f۱۲۰۷۸d || tint.f۱۲۰۷۷c) {
                drawable.setColorFilter(m۱۵۲۸۴a(tint.f۱۲۰۷۸d ? tint.f۱۲۰۷۵a : null, tint.f۱۲۰۷۷c ? tint.f۱۲۰۷۶b : f۱۲۱۰۲g, state));
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

    /* renamed from: a  reason: contains not printable characters */
    private static PorterDuffColorFilter m۱۵۲۸۴a(ColorStateList tint, PorterDuff.Mode tintMode, int[] state) {
        if (tint == null || tintMode == null) {
            return null;
        }
        return m۱۵۲۸۳a(tint.getColorForState(state, 0), tintMode);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m۱۵۲۸۳a(int color, PorterDuff.Mode mode) {
        PorterDuffColorFilter filter;
        synchronized (Cj.class) {
            filter = f۱۲۱۰۴i.m۱۵۳۱۴a(color, mode);
            if (filter == null) {
                filter = new PorterDuffColorFilter(color, mode);
                f۱۲۱۰۴i.m۱۵۳۱۵a(color, mode, filter);
            }
        }
        return filter;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۵۲۸۹a(Drawable d, int color, PorterDuff.Mode mode) {
        if (Ch0.m۱۵۲۵۵a(d)) {
            d = d.mutate();
        }
        d.setColorFilter(m۱۵۲۸۳a(color, mode == null ? f۱۲۱۰۲g : mode));
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۵۲۹۷b(Context context) {
        if (!this.f۱۲۱۱۶f) {
            this.f۱۲۱۱۶f = true;
            Drawable d = m۱۵۳۰۶a(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ce.abc_vector_test);
            if (d == null || !m۱۵۲۹۵a(d)) {
                this.f۱۲۱۱۶f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۵۲۹۵a(Drawable d) {
        return (d instanceof Ci) || "android.graphics.drawable.VectorDrawable".equals(d.getClass().getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.j$e  reason: invalid class name */
    public static class Ce implements AbstractCd {
        Ce() {
        }

        @Override // android.support.p۰۴۷v7.widget.Cj.AbstractCd
        /* renamed from: a  reason: contains not printable characters */
        public Drawable m۱۵۳۱۷a(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return Ci.createFromXmlInner(context.getResources(), parser, attrs, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.j$b  reason: invalid class name */
    public static class Cb implements AbstractCd {
        Cb() {
        }

        @Override // android.support.p۰۴۷v7.widget.Cj.AbstractCd
        /* renamed from: a  reason: contains not printable characters */
        public Drawable m۱۵۳۱۲a(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a.Cc.m۱۰۰۳۶a(context, context.getResources(), parser, attrs, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.j$a  reason: invalid class name */
    public static class Ca implements AbstractCd {
        Ca() {
        }

        @Override // android.support.p۰۴۷v7.widget.Cj.AbstractCd
        /* renamed from: a  reason: contains not printable characters */
        public Drawable m۱۵۳۱۱a(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Ca.m۱۰۶۷۷b(context, context.getResources(), parser, attrs, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }
}
