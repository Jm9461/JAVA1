package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p۱۵۹a.p۱۶۴b.p۱۷۸d.p۱۷۹a.Ci;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ca;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cf;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cg;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Co;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cc;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ce;

/* renamed from: android.support.v7.widget.j, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cj {

    /* renamed from: h, reason: contains not printable characters */
    private static Cj f۱۲۱۰۳h;

    /* renamed from: a, reason: contains not printable characters */
    private WeakHashMap<Context, Co<ColorStateList>> f۱۲۱۱۱a;

    /* renamed from: b, reason: contains not printable characters */
    private Ca<String, d> f۱۲۱۱۲b;

    /* renamed from: c, reason: contains not printable characters */
    private Co<String> f۱۲۱۱۳c;

    /* renamed from: d, reason: contains not printable characters */
    private final WeakHashMap<Context, Cf<WeakReference<Drawable.ConstantState>>> f۱۲۱۱۴d = new WeakHashMap<>(0);

    /* renamed from: e, reason: contains not printable characters */
    private TypedValue f۱۲۱۱۵e;

    /* renamed from: f, reason: contains not printable characters */
    private boolean f۱۲۱۱۶f;

    /* renamed from: g, reason: contains not printable characters */
    private static final PorterDuff.Mode f۱۲۱۰۲g = PorterDuff.Mode.SRC_IN;

    /* renamed from: i, reason: contains not printable characters */
    private static final c f۱۲۱۰۴i = new c(6);

    /* renamed from: j, reason: contains not printable characters */
    private static final int[] f۱۲۱۰۵j = {Ce.abc_textfield_search_default_mtrl_alpha, Ce.abc_textfield_default_mtrl_alpha, Ce.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: k, reason: contains not printable characters */
    private static final int[] f۱۲۱۰۶k = {Ce.abc_ic_commit_search_api_mtrl_alpha, Ce.abc_seekbar_tick_mark_material, Ce.abc_ic_menu_share_mtrl_alpha, Ce.abc_ic_menu_copy_mtrl_am_alpha, Ce.abc_ic_menu_cut_mtrl_alpha, Ce.abc_ic_menu_selectall_mtrl_alpha, Ce.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: l, reason: contains not printable characters */
    private static final int[] f۱۲۱۰۷l = {Ce.abc_textfield_activated_mtrl_alpha, Ce.abc_textfield_search_activated_mtrl_alpha, Ce.abc_cab_background_top_mtrl_alpha, Ce.abc_text_cursor_material, Ce.abc_text_select_handle_left_mtrl_dark, Ce.abc_text_select_handle_middle_mtrl_dark, Ce.abc_text_select_handle_right_mtrl_dark, Ce.abc_text_select_handle_left_mtrl_light, Ce.abc_text_select_handle_middle_mtrl_light, Ce.abc_text_select_handle_right_mtrl_light};

    /* renamed from: m, reason: contains not printable characters */
    private static final int[] f۱۲۱۰۸m = {Ce.abc_popup_background_mtrl_mult, Ce.abc_cab_background_internal_bg, Ce.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: n, reason: contains not printable characters */
    private static final int[] f۱۲۱۰۹n = {Ce.abc_tab_indicator_material, Ce.abc_textfield_search_material};

    /* renamed from: o, reason: contains not printable characters */
    private static final int[] f۱۲۱۱۰o = {Ce.abc_btn_check_material, Ce.abc_btn_radio_material};

    /* renamed from: android.support.v7.widget.j$d */
    private interface d {
        /* renamed from: a, reason: contains not printable characters */
        Drawable mo۱۳۲۴۷a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static synchronized Cj m۱۳۲۱۷a() {
        Cj cj;
        synchronized (Cj.class) {
            if (f۱۲۱۰۳h == null) {
                f۱۲۱۰۳h = new Cj();
                m۱۳۲۲۱a(f۱۲۱۰۳h);
            }
            cj = f۱۲۱۰۳h;
        }
        return cj;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۳۲۲۱a(Cj manager) {
        if (Build.VERSION.SDK_INT < 24) {
            manager.m۱۳۲۲۲a("vector", new e());
            manager.m۱۳۲۲۲a("animated-vector", new b());
            manager.m۱۳۲۲۲a("animated-selector", new a());
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public synchronized Drawable m۱۳۲۳۶a(Context context, int resId) {
        return m۱۳۲۳۷a(context, resId, false);
    }

    /* renamed from: a, reason: contains not printable characters */
    synchronized Drawable m۱۳۲۳۷a(Context context, int resId, boolean failIfNotKnown) {
        Drawable drawable;
        m۱۳۲۲۷b(context);
        drawable = m۱۳۲۳۵f(context, resId);
        if (drawable == null) {
            drawable = m۱۳۲۳۱d(context, resId);
        }
        if (drawable == null) {
            drawable = android.support.v4.content.Ca.m۱۰۵۵۶c(context, resId);
        }
        if (drawable != null) {
            drawable = m۱۳۲۱۵a(context, resId, failIfNotKnown, drawable);
        }
        if (drawable != null) {
            Ch0.m۱۳۱۸۶b(drawable);
        }
        return drawable;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.f != android.support.v4.util.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>> */
    /* renamed from: a, reason: contains not printable characters */
    public synchronized void m۱۳۲۳۹a(Context context) {
        Cf<WeakReference<Drawable.ConstantState>> cf = this.f۱۲۱۱۴d.get(context);
        if (cf != null) {
            cf.m۸۵۲۵a();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static long m۱۳۲۱۱a(TypedValue tv) {
        return (tv.assetCookie << 32) | tv.data;
    }

    /* renamed from: d, reason: contains not printable characters */
    private Drawable m۱۳۲۳۱d(Context context, int resId) {
        if (this.f۱۲۱۱۵e == null) {
            this.f۱۲۱۱۵e = new TypedValue();
        }
        TypedValue tv = this.f۱۲۱۱۵e;
        context.getResources().getValue(resId, tv, true);
        long key = m۱۳۲۱۱a(tv);
        Drawable dr = m۱۳۲۱۶a(context, key);
        if (dr != null) {
            return dr;
        }
        if (resId == Ce.abc_cab_background_top_material) {
            dr = new LayerDrawable(new Drawable[]{m۱۳۲۳۶a(context, Ce.abc_cab_background_internal_bg), m۱۳۲۳۶a(context, Ce.abc_cab_background_top_mtrl_alpha)});
        }
        if (dr != null) {
            dr.setChangingConfigurations(tv.changingConfigurations);
            m۱۳۲۲۴a(context, key, dr);
        }
        return dr;
    }

    /* renamed from: a, reason: contains not printable characters */
    private Drawable m۱۳۲۱۵a(Context context, int resId, boolean failIfNotKnown, Drawable drawable) {
        ColorStateList tintList = m۱۳۲۴۰b(context, resId);
        if (tintList != null) {
            if (Ch0.m۱۳۱۸۵a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable drawable2 = android.support.v4.graphics.drawable.Ca.m۱۰۶۵۲h(drawable);
            android.support.v4.graphics.drawable.Ca.m۱۰۶۳۸a(drawable2, tintList);
            PorterDuff.Mode tintMode = m۱۳۲۱۲a(resId);
            if (tintMode != null) {
                android.support.v4.graphics.drawable.Ca.m۱۰۶۴۱a(drawable2, tintMode);
                return drawable2;
            }
            return drawable2;
        }
        if (resId == Ce.abc_seekbar_track_material) {
            LayerDrawable ld = (LayerDrawable) drawable;
            m۱۳۲۱۹a(ld.findDrawableByLayerId(R.id.background), Ce1.m۱۳۱۲۳b(context, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.colorControlNormal), f۱۲۱۰۲g);
            m۱۳۲۱۹a(ld.findDrawableByLayerId(R.id.secondaryProgress), Ce1.m۱۳۱۲۳b(context, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.colorControlNormal), f۱۲۱۰۲g);
            m۱۳۲۱۹a(ld.findDrawableByLayerId(R.id.progress), Ce1.m۱۳۱۲۳b(context, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.colorControlActivated), f۱۲۱۰۲g);
            return drawable;
        }
        if (resId == Ce.abc_ratingbar_material || resId == Ce.abc_ratingbar_indicator_material || resId == Ce.abc_ratingbar_small_material) {
            LayerDrawable ld2 = (LayerDrawable) drawable;
            m۱۳۲۱۹a(ld2.findDrawableByLayerId(R.id.background), Ce1.m۱۳۱۲۰a(context, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.colorControlNormal), f۱۲۱۰۲g);
            m۱۳۲۱۹a(ld2.findDrawableByLayerId(R.id.secondaryProgress), Ce1.m۱۳۱۲۳b(context, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.colorControlActivated), f۱۲۱۰۲g);
            m۱۳۲۱۹a(ld2.findDrawableByLayerId(R.id.progress), Ce1.m۱۳۱۲۳b(context, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.colorControlActivated), f۱۲۱۰۲g);
            return drawable;
        }
        boolean tinted = m۱۳۲۲۳a(context, resId, drawable);
        if (!tinted && failIfNotKnown) {
            return null;
        }
        return drawable;
    }

    /* renamed from: f, reason: contains not printable characters */
    private Drawable m۱۳۲۳۵f(Context context, int resId) {
        int type;
        Ca<String, d> ca = this.f۱۲۱۱۲b;
        if (ca == null || ca.isEmpty()) {
            return null;
        }
        Co<String> co = this.f۱۲۱۱۳c;
        if (co != null) {
            String cachedTagName = co.m۸۵۹۲b(resId);
            if ("appcompat_skip_skip".equals(cachedTagName) || (cachedTagName != null && this.f۱۲۱۱۲b.get(cachedTagName) == null)) {
                return null;
            }
        } else {
            this.f۱۲۱۱۳c = new Co<>();
        }
        if (this.f۱۲۱۱۵e == null) {
            this.f۱۲۱۱۵e = new TypedValue();
        }
        TypedValue tv = this.f۱۲۱۱۵e;
        Resources res = context.getResources();
        res.getValue(resId, tv, true);
        long key = m۱۳۲۱۱a(tv);
        Drawable dr = m۱۳۲۱۶a(context, key);
        if (dr != null) {
            return dr;
        }
        CharSequence charSequence = tv.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlPullParser parser = res.getXml(resId);
                AttributeSet attrs = Xml.asAttributeSet(parser);
                do {
                    type = parser.next();
                    if (type == 2) {
                        break;
                    }
                } while (type != 1);
                if (type != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String tagName = parser.getName();
                this.f۱۲۱۱۳c.m۸۵۹۰a(resId, tagName);
                d delegate = this.f۱۲۱۱۲b.get(tagName);
                if (delegate != null) {
                    dr = delegate.mo۱۳۲۴۷a(context, parser, attrs, context.getTheme());
                }
                if (dr != null) {
                    dr.setChangingConfigurations(tv.changingConfigurations);
                    m۱۳۲۲۴a(context, key, dr);
                }
            } catch (Exception e2) {
                Log.e("AppCompatDrawableManag", "Exception while inflating drawable", e2);
            }
        }
        if (dr == null) {
            this.f۱۲۱۱۳c.m۸۵۹۰a(resId, "appcompat_skip_skip");
        }
        return dr;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.f != android.support.v4.util.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>> */
    /* renamed from: a, reason: contains not printable characters */
    private synchronized Drawable m۱۳۲۱۶a(Context context, long key) {
        Cf<WeakReference<Drawable.ConstantState>> cf = this.f۱۲۱۱۴d.get(context);
        if (cf == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> wr = cf.m۸۵۲۹b(key);
        if (wr != null) {
            Drawable.ConstantState entry = wr.get();
            if (entry != null) {
                return entry.newDrawable(context.getResources());
            }
            cf.m۸۵۲۶a(key);
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.f != android.support.v4.util.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>> */
    /* renamed from: a, reason: contains not printable characters */
    private synchronized boolean m۱۳۲۲۴a(Context context, long key, Drawable drawable) {
        Drawable.ConstantState cs = drawable.getConstantState();
        if (cs != null) {
            Cf<WeakReference<Drawable.ConstantState>> cf = this.f۱۲۱۱۴d.get(context);
            if (cf == null) {
                cf = new Cf<>();
                this.f۱۲۱۱۴d.put(context, cf);
            }
            cf.m۸۵۳۴c(key, new WeakReference<>(cs));
            return true;
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    synchronized Drawable m۱۳۲۳۸a(Context context, Co1 resources, int resId) {
        Drawable drawable = m۱۳۲۳۵f(context, resId);
        if (drawable == null) {
            drawable = resources.m۱۳۴۱۰a(resId);
        }
        if (drawable != null) {
            return m۱۳۲۱۵a(context, resId, false, drawable);
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    static boolean m۱۳۲۲۳a(Context context, int resId, Drawable drawable) {
        PorterDuff.Mode tintMode = f۱۲۱۰۲g;
        boolean colorAttrSet = false;
        int colorAttr = 0;
        int alpha = -1;
        if (m۱۳۲۲۶a(f۱۲۱۰۵j, resId)) {
            colorAttr = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.colorControlNormal;
            colorAttrSet = true;
        } else if (m۱۳۲۲۶a(f۱۲۱۰۷l, resId)) {
            colorAttr = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.colorControlActivated;
            colorAttrSet = true;
        } else if (m۱۳۲۲۶a(f۱۲۱۰۸m, resId)) {
            colorAttr = R.attr.colorBackground;
            colorAttrSet = true;
            tintMode = PorterDuff.Mode.MULTIPLY;
        } else if (resId == Ce.abc_list_divider_mtrl_alpha) {
            colorAttr = R.attr.colorForeground;
            colorAttrSet = true;
            alpha = Math.round(40.8f);
        } else if (resId == Ce.abc_dialog_material_background) {
            colorAttr = R.attr.colorBackground;
            colorAttrSet = true;
        }
        if (colorAttrSet) {
            if (Ch0.m۱۳۱۸۵a(drawable)) {
                drawable = drawable.mutate();
            }
            int color = Ce1.m۱۳۱۲۳b(context, colorAttr);
            drawable.setColorFilter(m۱۳۲۱۳a(color, tintMode));
            if (alpha != -1) {
                drawable.setAlpha(alpha);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۲۲۲a(String tagName, d delegate) {
        if (this.f۱۲۱۱۲b == null) {
            this.f۱۲۱۱۲b = new Ca<>();
        }
        this.f۱۲۱۱۲b.put(tagName, delegate);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۱۳۲۲۶a(int[] array, int value) {
        for (int id : array) {
            if (id == value) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    static PorterDuff.Mode m۱۳۲۱۲a(int resId) {
        if (resId != Ce.abc_switch_thumb_material) {
            return null;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        return mode;
    }

    /* renamed from: b, reason: contains not printable characters */
    synchronized ColorStateList m۱۳۲۴۰b(Context context, int resId) {
        ColorStateList tint;
        tint = m۱۳۲۳۳e(context, resId);
        if (tint == null) {
            if (resId == Ce.abc_edit_text_material) {
                tint = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۳b(context, Cc.abc_tint_edittext);
            } else if (resId == Ce.abc_switch_track_mtrl_alpha) {
                tint = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۳b(context, Cc.abc_tint_switch_track);
            } else if (resId == Ce.abc_switch_thumb_material) {
                tint = m۱۳۲۳۴f(context);
            } else if (resId == Ce.abc_btn_default_mtrl_shape) {
                tint = m۱۳۲۳۲e(context);
            } else if (resId == Ce.abc_btn_borderless_material) {
                tint = m۱۳۲۲۸c(context);
            } else if (resId == Ce.abc_btn_colored_material) {
                tint = m۱۳۲۳۰d(context);
            } else {
                if (resId != Ce.abc_spinner_mtrl_am_alpha && resId != Ce.abc_spinner_textfield_background_material) {
                    if (m۱۳۲۲۶a(f۱۲۱۰۶k, resId)) {
                        tint = Ce1.m۱۳۱۲۴c(context, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.colorControlNormal);
                    } else if (m۱۳۲۲۶a(f۱۲۱۰۹n, resId)) {
                        tint = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۳b(context, Cc.abc_tint_default);
                    } else if (m۱۳۲۲۶a(f۱۲۱۱۰o, resId)) {
                        tint = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۳b(context, Cc.abc_tint_btn_checkable);
                    } else if (resId == Ce.abc_seekbar_thumb_material) {
                        tint = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۳b(context, Cc.abc_tint_seek_thumb);
                    }
                }
                tint = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۳b(context, Cc.abc_tint_spinner);
            }
            if (tint != null) {
                m۱۳۲۱۸a(context, resId, tint);
            }
        }
        return tint;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.o != android.support.v4.util.SparseArrayCompat<android.content.res.ColorStateList> */
    /* renamed from: e, reason: contains not printable characters */
    private ColorStateList m۱۳۲۳۳e(Context context, int resId) {
        Co<ColorStateList> co;
        WeakHashMap<Context, Co<ColorStateList>> weakHashMap = this.f۱۲۱۱۱a;
        if (weakHashMap == null || (co = weakHashMap.get(context)) == null) {
            return null;
        }
        return co.m۸۵۹۲b(resId);
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.o != android.support.v4.util.SparseArrayCompat<android.content.res.ColorStateList> */
    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۲۱۸a(Context context, int resId, ColorStateList tintList) {
        if (this.f۱۲۱۱۱a == null) {
            this.f۱۲۱۱۱a = new WeakHashMap<>();
        }
        Co<ColorStateList> co = this.f۱۲۱۱۱a.get(context);
        if (co == null) {
            co = new Co<>();
            this.f۱۲۱۱۱a.put(context, co);
        }
        co.m۸۵۹۰a(resId, tintList);
    }

    /* renamed from: e, reason: contains not printable characters */
    private ColorStateList m۱۳۲۳۲e(Context context) {
        return m۱۳۲۲۹c(context, Ce1.m۱۳۱۲۳b(context, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.colorButtonNormal));
    }

    /* renamed from: c, reason: contains not printable characters */
    private ColorStateList m۱۳۲۲۸c(Context context) {
        return m۱۳۲۲۹c(context, 0);
    }

    /* renamed from: d, reason: contains not printable characters */
    private ColorStateList m۱۳۲۳۰d(Context context) {
        return m۱۳۲۲۹c(context, Ce1.m۱۳۱۲۳b(context, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.colorAccent));
    }

    /* renamed from: c, reason: contains not printable characters */
    private ColorStateList m۱۳۲۲۹c(Context context, int baseColor) {
        int[][] states = new int[4][];
        int[] colors = new int[4];
        int colorControlHighlight = Ce1.m۱۳۱۲۳b(context, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.colorControlHighlight);
        int disabledColor = Ce1.m۱۳۱۲۰a(context, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.colorButtonNormal);
        states[0] = Ce1.f۱۲۰۰۴b;
        colors[0] = disabledColor;
        int i = 0 + 1;
        states[i] = Ce1.f۱۲۰۰۶d;
        colors[i] = p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Ca.m۸۳۵۴b(colorControlHighlight, baseColor);
        int i2 = i + 1;
        states[i2] = Ce1.f۱۲۰۰۵c;
        colors[i2] = p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Ca.m۸۳۵۴b(colorControlHighlight, baseColor);
        int i3 = i2 + 1;
        states[i3] = Ce1.f۱۲۰۰۸f;
        colors[i3] = baseColor;
        int i4 = i3 + 1;
        return new ColorStateList(states, colors);
    }

    /* renamed from: f, reason: contains not printable characters */
    private ColorStateList m۱۳۲۳۴f(Context context) {
        int[][] states = new int[3][];
        int[] colors = new int[3];
        ColorStateList thumbColor = Ce1.m۱۳۱۲۴c(context, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.colorSwitchThumbNormal);
        if (thumbColor == null || !thumbColor.isStateful()) {
            states[0] = Ce1.f۱۲۰۰۴b;
            colors[0] = Ce1.m۱۳۱۲۰a(context, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.colorSwitchThumbNormal);
            int i = 0 + 1;
            states[i] = Ce1.f۱۲۰۰۷e;
            colors[i] = Ce1.m۱۳۱۲۳b(context, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.colorControlActivated);
            int i2 = i + 1;
            states[i2] = Ce1.f۱۲۰۰۸f;
            colors[i2] = Ce1.m۱۳۱۲۳b(context, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.colorSwitchThumbNormal);
            int i3 = i2 + 1;
        } else {
            states[0] = Ce1.f۱۲۰۰۴b;
            colors[0] = thumbColor.getColorForState(states[0], 0);
            int i4 = 0 + 1;
            states[i4] = Ce1.f۱۲۰۰۷e;
            colors[i4] = Ce1.m۱۳۱۲۳b(context, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.colorControlActivated);
            int i5 = i4 + 1;
            states[i5] = Ce1.f۱۲۰۰۸f;
            colors[i5] = thumbColor.getDefaultColor();
            int i6 = i5 + 1;
        }
        return new ColorStateList(states, colors);
    }

    /* renamed from: android.support.v7.widget.j$c */
    private static class c extends Cg<Integer, PorterDuffColorFilter> {
        public c(int maxSize) {
            super(maxSize);
        }

        /* renamed from: a, reason: contains not printable characters */
        PorterDuffColorFilter m۱۳۲۴۴a(int color, PorterDuff.Mode mode) {
            return m۸۵۴۲b(Integer.valueOf(m۱۳۲۴۳b(color, mode)));
        }

        /* renamed from: a, reason: contains not printable characters */
        PorterDuffColorFilter m۱۳۲۴۵a(int color, PorterDuff.Mode mode, PorterDuffColorFilter filter) {
            return m۸۵۳۸a((c) Integer.valueOf(m۱۳۲۴۳b(color, mode)), (Integer) filter);
        }

        /* renamed from: b, reason: contains not printable characters */
        private static int m۱۳۲۴۳b(int color, PorterDuff.Mode mode) {
            int hashCode = (1 * 31) + color;
            return (hashCode * 31) + mode.hashCode();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    static void m۱۳۲۲۰a(Drawable drawable, Ch1 tint, int[] state) {
        if (Ch0.m۱۳۱۸۵a(drawable) && drawable.mutate() != drawable) {
            Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if (tint.f۱۲۰۷۸d || tint.f۱۲۰۷۷c) {
            drawable.setColorFilter(m۱۳۲۱۴a(tint.f۱۲۰۷۸d ? tint.f۱۲۰۷۵a : null, tint.f۱۲۰۷۷c ? tint.f۱۲۰۷۶b : f۱۲۱۰۲g, state));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static PorterDuffColorFilter m۱۳۲۱۴a(ColorStateList tint, PorterDuff.Mode tintMode, int[] state) {
        if (tint == null || tintMode == null) {
            return null;
        }
        int color = tint.getColorForState(state, 0);
        return m۱۳۲۱۳a(color, tintMode);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m۱۳۲۱۳a(int color, PorterDuff.Mode mode) {
        PorterDuffColorFilter filter;
        synchronized (Cj.class) {
            filter = f۱۲۱۰۴i.m۱۳۲۴۴a(color, mode);
            if (filter == null) {
                filter = new PorterDuffColorFilter(color, mode);
                f۱۲۱۰۴i.m۱۳۲۴۵a(color, mode, filter);
            }
        }
        return filter;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۳۲۱۹a(Drawable d2, int color, PorterDuff.Mode mode) {
        if (Ch0.m۱۳۱۸۵a(d2)) {
            d2 = d2.mutate();
        }
        d2.setColorFilter(m۱۳۲۱۳a(color, mode == null ? f۱۲۱۰۲g : mode));
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۳۲۲۷b(Context context) {
        if (this.f۱۲۱۱۶f) {
            return;
        }
        this.f۱۲۱۱۶f = true;
        Drawable d2 = m۱۳۲۳۶a(context, Ce.abc_vector_test);
        if (d2 == null || !m۱۳۲۲۵a(d2)) {
            this.f۱۲۱۱۶f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۱۳۲۲۵a(Drawable d2) {
        return (d2 instanceof Ci) || "android.graphics.drawable.VectorDrawable".equals(d2.getClass().getName());
    }

    /* renamed from: android.support.v7.widget.j$e */
    private static class e implements d {
        e() {
        }

        @Override // android.support.v7.widget.Cj.d
        /* renamed from: a, reason: contains not printable characters */
        public Drawable mo۱۳۲۴۷a(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return Ci.createFromXmlInner(context.getResources(), parser, attrs, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.j$b */
    private static class b implements d {
        b() {
        }

        @Override // android.support.v7.widget.Cj.d
        /* renamed from: a, reason: contains not printable characters */
        public Drawable mo۱۳۲۴۷a(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return p۱۵۹a.p۱۶۴b.p۱۷۸d.p۱۷۹a.Cc.m۷۹۶۹a(context, context.getResources(), parser, attrs, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.j$a */
    static class a implements d {
        a() {
        }

        @Override // android.support.v7.widget.Cj.d
        /* renamed from: a, reason: contains not printable characters */
        public Drawable mo۱۳۲۴۷a(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Ca.m۸۶۰۸b(context, context.getResources(), parser, attrs, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }
}
