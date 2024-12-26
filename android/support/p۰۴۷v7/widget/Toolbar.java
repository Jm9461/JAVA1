package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۷v7.app.AbstractCa;
import android.support.p۰۴۷v7.view.menu.AbstractCp;
import android.support.p۰۴۷v7.view.menu.Ch;
import android.support.p۰۴۷v7.view.menu.Ck;
import android.support.p۰۴۷v7.view.menu.SubMenuCv;
import android.support.p۰۴۷v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCc;

/* renamed from: android.support.v7.widget.Toolbar */
public class Toolbar extends ViewGroup {

    /* renamed from: A  reason: contains not printable characters */
    private CharSequence f۱۱۸۴۵A;

    /* renamed from: B  reason: contains not printable characters */
    private int f۱۱۸۴۶B;

    /* renamed from: C  reason: contains not printable characters */
    private int f۱۱۸۴۷C;

    /* renamed from: D  reason: contains not printable characters */
    private boolean f۱۱۸۴۸D;

    /* renamed from: E  reason: contains not printable characters */
    private boolean f۱۱۸۴۹E;

    /* renamed from: F  reason: contains not printable characters */
    private final ArrayList<View> f۱۱۸۵۰F;

    /* renamed from: G  reason: contains not printable characters */
    private final ArrayList<View> f۱۱۸۵۱G;

    /* renamed from: H  reason: contains not printable characters */
    private final int[] f۱۱۸۵۲H;

    /* renamed from: I  reason: contains not printable characters */
    AbstractCf f۱۱۸۵۳I;

    /* renamed from: J  reason: contains not printable characters */
    private final ActionMenuView.AbstractCe f۱۱۸۵۴J;

    /* renamed from: K  reason: contains not printable characters */
    private Ck1 f۱۱۸۵۵K;

    /* renamed from: L  reason: contains not printable characters */
    private Cc f۱۱۸۵۶L;

    /* renamed from: M  reason: contains not printable characters */
    private Cd f۱۱۸۵۷M;

    /* renamed from: N  reason: contains not printable characters */
    private AbstractCp.AbstractCa f۱۱۸۵۸N;

    /* renamed from: O  reason: contains not printable characters */
    private Ch.AbstractCa f۱۱۸۵۹O;

    /* renamed from: P  reason: contains not printable characters */
    private boolean f۱۱۸۶۰P;

    /* renamed from: Q  reason: contains not printable characters */
    private final Runnable f۱۱۸۶۱Q;

    /* renamed from: c  reason: contains not printable characters */
    private ActionMenuView f۱۱۸۶۲c;

    /* renamed from: d  reason: contains not printable characters */
    private TextView f۱۱۸۶۳d;

    /* renamed from: e  reason: contains not printable characters */
    private TextView f۱۱۸۶۴e;

    /* renamed from: f  reason: contains not printable characters */
    private ImageButton f۱۱۸۶۵f;

    /* renamed from: g  reason: contains not printable characters */
    private ImageView f۱۱۸۶۶g;

    /* renamed from: h  reason: contains not printable characters */
    private Drawable f۱۱۸۶۷h;

    /* renamed from: i  reason: contains not printable characters */
    private CharSequence f۱۱۸۶۸i;

    /* renamed from: j  reason: contains not printable characters */
    ImageButton f۱۱۸۶۹j;

    /* renamed from: k  reason: contains not printable characters */
    View f۱۱۸۷۰k;

    /* renamed from: l  reason: contains not printable characters */
    private Context f۱۱۸۷۱l;

    /* renamed from: m  reason: contains not printable characters */
    private int f۱۱۸۷۲m;

    /* renamed from: n  reason: contains not printable characters */
    private int f۱۱۸۷۳n;

    /* renamed from: o  reason: contains not printable characters */
    private int f۱۱۸۷۴o;

    /* renamed from: p  reason: contains not printable characters */
    int f۱۱۸۷۵p;

    /* renamed from: q  reason: contains not printable characters */
    private int f۱۱۸۷۶q;

    /* renamed from: r  reason: contains not printable characters */
    private int f۱۱۸۷۷r;

    /* renamed from: s  reason: contains not printable characters */
    private int f۱۱۸۷۸s;

    /* renamed from: t  reason: contains not printable characters */
    private int f۱۱۸۷۹t;

    /* renamed from: u  reason: contains not printable characters */
    private int f۱۱۸۸۰u;

    /* renamed from: v  reason: contains not printable characters */
    private Cz0 f۱۱۸۸۱v;

    /* renamed from: w  reason: contains not printable characters */
    private int f۱۱۸۸۲w;

    /* renamed from: x  reason: contains not printable characters */
    private int f۱۱۸۸۳x;

    /* renamed from: y  reason: contains not printable characters */
    private int f۱۱۸۸۴y;

    /* renamed from: z  reason: contains not printable characters */
    private CharSequence f۱۱۸۸۵z;

    /* renamed from: android.support.v7.widget.Toolbar$f  reason: invalid class name */
    public interface AbstractCf {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: android.support.v7.widget.Toolbar$a  reason: invalid class name */
    class Ca implements ActionMenuView.AbstractCe {
        Ca() {
        }

        @Override // android.support.p۰۴۷v7.widget.ActionMenuView.AbstractCe
        public boolean onMenuItemClick(MenuItem item) {
            AbstractCf fVar = Toolbar.this.f۱۱۸۵۳I;
            if (fVar != null) {
                return fVar.onMenuItemClick(item);
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$b  reason: invalid class name */
    class RunnableCb implements Runnable {
        RunnableCb() {
        }

        public void run() {
            Toolbar.this.m۱۴۹۴۶k();
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attrs) {
        this(context, attrs, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        int i;
        this.f۱۱۸۸۴y = 8388627;
        this.f۱۱۸۵۰F = new ArrayList<>();
        this.f۱۱۸۵۱G = new ArrayList<>();
        this.f۱۱۸۵۲H = new int[2];
        this.f۱۱۸۵۴J = new Ca();
        this.f۱۱۸۶۱Q = new RunnableCb();
        Cj1 a = Cj1.m۱۵۳۴۵a(getContext(), attrs, Cj.Toolbar, defStyleAttr, 0);
        this.f۱۱۸۷۳n = a.m۱۵۳۶۳g(Cj.Toolbar_titleTextAppearance, 0);
        this.f۱۱۸۷۴o = a.m۱۵۳۶۳g(Cj.Toolbar_subtitleTextAppearance, 0);
        this.f۱۱۸۸۴y = a.m۱۵۳۵۹e(Cj.Toolbar_android_gravity, this.f۱۱۸۸۴y);
        this.f۱۱۸۷۵p = a.m۱۵۳۵۹e(Cj.Toolbar_buttonGravity, 48);
        int titleMargin = a.m۱۵۳۵۳b(Cj.Toolbar_titleMargin, 0);
        titleMargin = a.m۱۵۳۶۴g(Cj.Toolbar_titleMargins) ? a.m۱۵۳۵۳b(Cj.Toolbar_titleMargins, titleMargin) : titleMargin;
        this.f۱۱۸۸۰u = titleMargin;
        this.f۱۱۸۷۹t = titleMargin;
        this.f۱۱۸۷۸s = titleMargin;
        this.f۱۱۸۷۷r = titleMargin;
        int marginStart = a.m۱۵۳۵۳b(Cj.Toolbar_titleMarginStart, -1);
        if (marginStart >= 0) {
            this.f۱۱۸۷۷r = marginStart;
        }
        int marginEnd = a.m۱۵۳۵۳b(Cj.Toolbar_titleMarginEnd, -1);
        if (marginEnd >= 0) {
            this.f۱۱۸۷۸s = marginEnd;
        }
        int marginTop = a.m۱۵۳۵۳b(Cj.Toolbar_titleMarginTop, -1);
        if (marginTop >= 0) {
            this.f۱۱۸۷۹t = marginTop;
        }
        int marginBottom = a.m۱۵۳۵۳b(Cj.Toolbar_titleMarginBottom, -1);
        if (marginBottom >= 0) {
            this.f۱۱۸۸۰u = marginBottom;
        }
        this.f۱۱۸۷۶q = a.m۱۵۳۵۵c(Cj.Toolbar_maxButtonHeight, -1);
        int contentInsetStart = a.m۱۵۳۵۳b(Cj.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int contentInsetEnd = a.m۱۵۳۵۳b(Cj.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int contentInsetLeft = a.m۱۵۳۵۵c(Cj.Toolbar_contentInsetLeft, 0);
        int contentInsetRight = a.m۱۵۳۵۵c(Cj.Toolbar_contentInsetRight, 0);
        m۱۴۹۲۳l();
        this.f۱۱۸۸۱v.m۱۵۷۵۳a(contentInsetLeft, contentInsetRight);
        if (!(contentInsetStart == Integer.MIN_VALUE && contentInsetEnd == Integer.MIN_VALUE)) {
            this.f۱۱۸۸۱v.m۱۵۷۵۶b(contentInsetStart, contentInsetEnd);
        }
        this.f۱۱۸۸۲w = a.m۱۵۳۵۳b(Cj.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f۱۱۸۸۳x = a.m۱۵۳۵۳b(Cj.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f۱۱۸۶۷h = a.m۱۵۳۵۴b(Cj.Toolbar_collapseIcon);
        this.f۱۱۸۶۸i = a.m۱۵۳۶۰e(Cj.Toolbar_collapseContentDescription);
        CharSequence title = a.m۱۵۳۶۰e(Cj.Toolbar_title);
        if (!TextUtils.isEmpty(title)) {
            setTitle(title);
        }
        CharSequence subtitle = a.m۱۵۳۶۰e(Cj.Toolbar_subtitle);
        if (!TextUtils.isEmpty(subtitle)) {
            setSubtitle(subtitle);
        }
        this.f۱۱۸۷۱l = getContext();
        setPopupTheme(a.m۱۵۳۶۳g(Cj.Toolbar_popupTheme, 0));
        Drawable navIcon = a.m۱۵۳۵۴b(Cj.Toolbar_navigationIcon);
        if (navIcon != null) {
            setNavigationIcon(navIcon);
        }
        CharSequence navDesc = a.m۱۵۳۶۰e(Cj.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(navDesc)) {
            setNavigationContentDescription(navDesc);
        }
        Drawable logo = a.m۱۵۳۵۴b(Cj.Toolbar_logo);
        if (logo != null) {
            setLogo(logo);
        }
        CharSequence logoDesc = a.m۱۵۳۶۰e(Cj.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(logoDesc)) {
            setLogoDescription(logoDesc);
        }
        if (a.m۱۵۳۶۴g(Cj.Toolbar_titleTextColor)) {
            i = -1;
            setTitleTextColor(a.m۱۵۳۴۷a(Cj.Toolbar_titleTextColor, -1));
        } else {
            i = -1;
        }
        if (a.m۱۵۳۶۴g(Cj.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.m۱۵۳۴۷a(Cj.Toolbar_subtitleTextColor, i));
        }
        a.m۱۵۳۵۰a();
    }

    public void setPopupTheme(int resId) {
        if (this.f۱۱۸۷۲m != resId) {
            this.f۱۱۸۷۲m = resId;
            if (resId == 0) {
                this.f۱۱۸۷۱l = getContext();
            } else {
                this.f۱۱۸۷۱l = new ContextThemeWrapper(getContext(), resId);
            }
        }
    }

    public int getPopupTheme() {
        return this.f۱۱۸۷۲m;
    }

    public int getTitleMarginStart() {
        return this.f۱۱۸۷۷r;
    }

    public void setTitleMarginStart(int margin) {
        this.f۱۱۸۷۷r = margin;
        requestLayout();
    }

    public int getTitleMarginTop() {
        return this.f۱۱۸۷۹t;
    }

    public void setTitleMarginTop(int margin) {
        this.f۱۱۸۷۹t = margin;
        requestLayout();
    }

    public int getTitleMarginEnd() {
        return this.f۱۱۸۷۸s;
    }

    public void setTitleMarginEnd(int margin) {
        this.f۱۱۸۷۸s = margin;
        requestLayout();
    }

    public int getTitleMarginBottom() {
        return this.f۱۱۸۸۰u;
    }

    public void setTitleMarginBottom(int margin) {
        this.f۱۱۸۸۰u = margin;
        requestLayout();
    }

    public void onRtlPropertiesChanged(int layoutDirection) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(layoutDirection);
        }
        m۱۴۹۲۳l();
        Cz0 z0Var = this.f۱۱۸۸۱v;
        boolean z = true;
        if (layoutDirection != 1) {
            z = false;
        }
        z0Var.m۱۵۷۵۴a(z);
    }

    public void setLogo(int resId) {
        setLogo(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۳c(getContext(), resId));
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۴۹۳۷b() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f۱۱۸۶۲c) != null && actionMenuView.m۱۴۰۶۳i();
    }

    /* renamed from: i  reason: contains not printable characters */
    public boolean m۱۴۹۴۴i() {
        ActionMenuView actionMenuView = this.f۱۱۸۶۲c;
        return actionMenuView != null && actionMenuView.m۱۴۰۶۲h();
    }

    /* renamed from: h  reason: contains not printable characters */
    public boolean m۱۴۹۴۳h() {
        ActionMenuView actionMenuView = this.f۱۱۸۶۲c;
        return actionMenuView != null && actionMenuView.m۱۴۰۶۱g();
    }

    /* renamed from: k  reason: contains not printable characters */
    public boolean m۱۴۹۴۶k() {
        ActionMenuView actionMenuView = this.f۱۱۸۶۲c;
        return actionMenuView != null && actionMenuView.m۱۴۰۶۵k();
    }

    /* renamed from: g  reason: contains not printable characters */
    public boolean m۱۴۹۴۲g() {
        ActionMenuView actionMenuView = this.f۱۱۸۶۲c;
        return actionMenuView != null && actionMenuView.m۱۴۰۶۰f();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۹۳۳a(Ch menu, Cc outerPresenter) {
        if (menu != null || this.f۱۱۸۶۲c != null) {
            m۱۴۹۲۶o();
            Ch oldMenu = this.f۱۱۸۶۲c.m۱۴۰۶۴j();
            if (oldMenu != menu) {
                if (oldMenu != null) {
                    oldMenu.m۱۳۸۶۰b(this.f۱۱۸۵۶L);
                    oldMenu.m۱۳۸۶۰b(this.f۱۱۸۵۷M);
                }
                if (this.f۱۱۸۵۷M == null) {
                    this.f۱۱۸۵۷M = new Cd();
                }
                outerPresenter.m۱۵۰۲۷b(true);
                if (menu != null) {
                    menu.m۱۳۸۴۹a(outerPresenter, this.f۱۱۸۷۱l);
                    menu.m۱۳۸۴۹a(this.f۱۱۸۵۷M, this.f۱۱۸۷۱l);
                } else {
                    outerPresenter.m۱۵۰۱۵a(this.f۱۱۸۷۱l, (Ch) null);
                    this.f۱۱۸۵۷M.m۱۴۹۴۸a(this.f۱۱۸۷۱l, (Ch) null);
                    outerPresenter.m۱۵۰۲۲a(true);
                    this.f۱۱۸۵۷M.m۱۴۹۵۱a(true);
                }
                this.f۱۱۸۶۲c.setPopupTheme(this.f۱۱۸۷۲m);
                this.f۱۱۸۶۲c.setPresenter(outerPresenter);
                this.f۱۱۸۵۶L = outerPresenter;
            }
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۴۹۳۹d() {
        ActionMenuView actionMenuView = this.f۱۱۸۶۲c;
        if (actionMenuView != null) {
            actionMenuView.m۱۴۰۵۷d();
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m۱۴۹۲۴m();
            if (!m۱۴۹۲۱c(this.f۱۱۸۶۶g)) {
                m۱۴۹۱۶a((View) this.f۱۱۸۶۶g, true);
            }
        } else {
            ImageView imageView = this.f۱۱۸۶۶g;
            if (imageView != null && m۱۴۹۲۱c(imageView)) {
                removeView(this.f۱۱۸۶۶g);
                this.f۱۱۸۵۱G.remove(this.f۱۱۸۶۶g);
            }
        }
        ImageView imageView2 = this.f۱۱۸۶۶g;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        ImageView imageView = this.f۱۱۸۶۶g;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int resId) {
        setLogoDescription(getContext().getText(resId));
    }

    public void setLogoDescription(CharSequence description) {
        if (!TextUtils.isEmpty(description)) {
            m۱۴۹۲۴m();
        }
        ImageView imageView = this.f۱۱۸۶۶g;
        if (imageView != null) {
            imageView.setContentDescription(description);
        }
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f۱۱۸۶۶g;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    /* renamed from: m  reason: contains not printable characters */
    private void m۱۴۹۲۴m() {
        if (this.f۱۱۸۶۶g == null) {
            this.f۱۱۸۶۶g = new Co(getContext());
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    public boolean m۱۴۹۴۱f() {
        Cd dVar = this.f۱۱۸۵۷M;
        return (dVar == null || dVar.f۱۱۸۹۰d == null) ? false : true;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۴۹۳۸c() {
        Cd dVar = this.f۱۱۸۵۷M;
        Ck item = dVar == null ? null : dVar.f۱۱۸۹۰d;
        if (item != null) {
            item.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.f۱۱۸۸۵z;
    }

    public void setTitle(int resId) {
        setTitle(getContext().getText(resId));
    }

    public void setTitle(CharSequence title) {
        if (!TextUtils.isEmpty(title)) {
            if (this.f۱۱۸۶۳d == null) {
                Context context = getContext();
                this.f۱۱۸۶۳d = new AppCompatTextView(context);
                this.f۱۱۸۶۳d.setSingleLine();
                this.f۱۱۸۶۳d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f۱۱۸۷۳n;
                if (i != 0) {
                    this.f۱۱۸۶۳d.setTextAppearance(context, i);
                }
                int i2 = this.f۱۱۸۴۶B;
                if (i2 != 0) {
                    this.f۱۱۸۶۳d.setTextColor(i2);
                }
            }
            if (!m۱۴۹۲۱c(this.f۱۱۸۶۳d)) {
                m۱۴۹۱۶a((View) this.f۱۱۸۶۳d, true);
            }
        } else {
            TextView textView = this.f۱۱۸۶۳d;
            if (textView != null && m۱۴۹۲۱c(textView)) {
                removeView(this.f۱۱۸۶۳d);
                this.f۱۱۸۵۱G.remove(this.f۱۱۸۶۳d);
            }
        }
        TextView textView2 = this.f۱۱۸۶۳d;
        if (textView2 != null) {
            textView2.setText(title);
        }
        this.f۱۱۸۸۵z = title;
    }

    public CharSequence getSubtitle() {
        return this.f۱۱۸۴۵A;
    }

    public void setSubtitle(int resId) {
        setSubtitle(getContext().getText(resId));
    }

    public void setSubtitle(CharSequence subtitle) {
        if (!TextUtils.isEmpty(subtitle)) {
            if (this.f۱۱۸۶۴e == null) {
                Context context = getContext();
                this.f۱۱۸۶۴e = new AppCompatTextView(context);
                this.f۱۱۸۶۴e.setSingleLine();
                this.f۱۱۸۶۴e.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f۱۱۸۷۴o;
                if (i != 0) {
                    this.f۱۱۸۶۴e.setTextAppearance(context, i);
                }
                int i2 = this.f۱۱۸۴۷C;
                if (i2 != 0) {
                    this.f۱۱۸۶۴e.setTextColor(i2);
                }
            }
            if (!m۱۴۹۲۱c(this.f۱۱۸۶۴e)) {
                m۱۴۹۱۶a((View) this.f۱۱۸۶۴e, true);
            }
        } else {
            TextView textView = this.f۱۱۸۶۴e;
            if (textView != null && m۱۴۹۲۱c(textView)) {
                removeView(this.f۱۱۸۶۴e);
                this.f۱۱۸۵۱G.remove(this.f۱۱۸۶۴e);
            }
        }
        TextView textView2 = this.f۱۱۸۶۴e;
        if (textView2 != null) {
            textView2.setText(subtitle);
        }
        this.f۱۱۸۴۵A = subtitle;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۹۳۶b(Context context, int resId) {
        this.f۱۱۸۷۳n = resId;
        TextView textView = this.f۱۱۸۶۳d;
        if (textView != null) {
            textView.setTextAppearance(context, resId);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۹۳۲a(Context context, int resId) {
        this.f۱۱۸۷۴o = resId;
        TextView textView = this.f۱۱۸۶۴e;
        if (textView != null) {
            textView.setTextAppearance(context, resId);
        }
    }

    public void setTitleTextColor(int color) {
        this.f۱۱۸۴۶B = color;
        TextView textView = this.f۱۱۸۶۳d;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public void setSubtitleTextColor(int color) {
        this.f۱۱۸۴۷C = color;
        TextView textView = this.f۱۱۸۶۴e;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f۱۱۸۶۵f;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int resId) {
        setNavigationContentDescription(resId != 0 ? getContext().getText(resId) : null);
    }

    public void setNavigationContentDescription(CharSequence description) {
        if (!TextUtils.isEmpty(description)) {
            m۱۴۹۲۷p();
        }
        ImageButton imageButton = this.f۱۱۸۶۵f;
        if (imageButton != null) {
            imageButton.setContentDescription(description);
        }
    }

    public void setNavigationIcon(int resId) {
        setNavigationIcon(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۳c(getContext(), resId));
    }

    public void setNavigationIcon(Drawable icon) {
        if (icon != null) {
            m۱۴۹۲۷p();
            if (!m۱۴۹۲۱c(this.f۱۱۸۶۵f)) {
                m۱۴۹۱۶a((View) this.f۱۱۸۶۵f, true);
            }
        } else {
            ImageButton imageButton = this.f۱۱۸۶۵f;
            if (imageButton != null && m۱۴۹۲۱c(imageButton)) {
                removeView(this.f۱۱۸۶۵f);
                this.f۱۱۸۵۱G.remove(this.f۱۱۸۶۵f);
            }
        }
        ImageButton imageButton2 = this.f۱۱۸۶۵f;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(icon);
        }
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f۱۱۸۶۵f;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener listener) {
        m۱۴۹۲۷p();
        this.f۱۱۸۶۵f.setOnClickListener(listener);
    }

    public Menu getMenu() {
        m۱۴۹۲۵n();
        return this.f۱۱۸۶۲c.getMenu();
    }

    public void setOverflowIcon(Drawable icon) {
        m۱۴۹۲۵n();
        this.f۱۱۸۶۲c.setOverflowIcon(icon);
    }

    public Drawable getOverflowIcon() {
        m۱۴۹۲۵n();
        return this.f۱۱۸۶۲c.getOverflowIcon();
    }

    /* renamed from: n  reason: contains not printable characters */
    private void m۱۴۹۲۵n() {
        m۱۴۹۲۶o();
        if (this.f۱۱۸۶۲c.m۱۴۰۶۴j() == null) {
            Ch menu = (Ch) this.f۱۱۸۶۲c.getMenu();
            if (this.f۱۱۸۵۷M == null) {
                this.f۱۱۸۵۷M = new Cd();
            }
            this.f۱۱۸۶۲c.setExpandedActionViewsExclusive(true);
            menu.m۱۳۸۴۹a(this.f۱۱۸۵۷M, this.f۱۱۸۷۱l);
        }
    }

    /* renamed from: o  reason: contains not printable characters */
    private void m۱۴۹۲۶o() {
        if (this.f۱۱۸۶۲c == null) {
            this.f۱۱۸۶۲c = new ActionMenuView(getContext());
            this.f۱۱۸۶۲c.setPopupTheme(this.f۱۱۸۷۲m);
            this.f۱۱۸۶۲c.setOnMenuItemClickListener(this.f۱۱۸۵۴J);
            this.f۱۱۸۶۲c.m۱۴۰۵۵a(this.f۱۱۸۵۸N, this.f۱۱۸۵۹O);
            Ce lp = generateDefaultLayoutParams();
            lp.f۱۰۹۵۳a = 8388613 | (this.f۱۱۸۷۵p & 112);
            this.f۱۱۸۶۲c.setLayoutParams(lp);
            m۱۴۹۱۶a((View) this.f۱۱۸۶۲c, false);
        }
    }

    private MenuInflater getMenuInflater() {
        return new p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Cg(getContext());
    }

    public void setOnMenuItemClickListener(AbstractCf listener) {
        this.f۱۱۸۵۳I = listener;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۹۳۵b(int contentInsetStart, int contentInsetEnd) {
        m۱۴۹۲۳l();
        this.f۱۱۸۸۱v.m۱۵۷۵۶b(contentInsetStart, contentInsetEnd);
    }

    public int getContentInsetStart() {
        Cz0 z0Var = this.f۱۱۸۸۱v;
        if (z0Var != null) {
            return z0Var.m۱۵۷۵۸d();
        }
        return 0;
    }

    public int getContentInsetEnd() {
        Cz0 z0Var = this.f۱۱۸۸۱v;
        if (z0Var != null) {
            return z0Var.m۱۵۷۵۲a();
        }
        return 0;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۹۳۱a(int contentInsetLeft, int contentInsetRight) {
        m۱۴۹۲۳l();
        this.f۱۱۸۸۱v.m۱۵۷۵۳a(contentInsetLeft, contentInsetRight);
    }

    public int getContentInsetLeft() {
        Cz0 z0Var = this.f۱۱۸۸۱v;
        if (z0Var != null) {
            return z0Var.m۱۵۷۵۵b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        Cz0 z0Var = this.f۱۱۸۸۱v;
        if (z0Var != null) {
            return z0Var.m۱۵۷۵۷c();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f۱۱۸۸۲w;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public void setContentInsetStartWithNavigation(int insetStartWithNavigation) {
        if (insetStartWithNavigation < 0) {
            insetStartWithNavigation = Integer.MIN_VALUE;
        }
        if (insetStartWithNavigation != this.f۱۱۸۸۲w) {
            this.f۱۱۸۸۲w = insetStartWithNavigation;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getContentInsetEndWithActions() {
        int i = this.f۱۱۸۸۳x;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public void setContentInsetEndWithActions(int insetEndWithActions) {
        if (insetEndWithActions < 0) {
            insetEndWithActions = Integer.MIN_VALUE;
        }
        if (insetEndWithActions != this.f۱۱۸۸۳x) {
            this.f۱۱۸۸۳x = insetEndWithActions;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f۱۱۸۸۲w, 0));
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean hasActions = false;
        ActionMenuView actionMenuView = this.f۱۱۸۶۲c;
        if (actionMenuView != null) {
            Ch mb = actionMenuView.m۱۴۰۶۴j();
            hasActions = mb != null && mb.hasVisibleItems();
        }
        if (hasActions) {
            return Math.max(getContentInsetEnd(), Math.max(this.f۱۱۸۸۳x, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (Cu.m۱۳۰۱۴k(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (Cu.m۱۳۰۱۴k(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    /* renamed from: p  reason: contains not printable characters */
    private void m۱۴۹۲۷p() {
        if (this.f۱۱۸۶۵f == null) {
            this.f۱۱۸۶۵f = new Cm(getContext(), null, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.toolbarNavigationButtonStyle);
            Ce lp = generateDefaultLayoutParams();
            lp.f۱۰۹۵۳a = 8388611 | (this.f۱۱۸۷۵p & 112);
            this.f۱۱۸۶۵f.setLayoutParams(lp);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۴۹۴۰e() {
        if (this.f۱۱۸۶۹j == null) {
            this.f۱۱۸۶۹j = new Cm(getContext(), null, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.toolbarNavigationButtonStyle);
            this.f۱۱۸۶۹j.setImageDrawable(this.f۱۱۸۶۷h);
            this.f۱۱۸۶۹j.setContentDescription(this.f۱۱۸۶۸i);
            Ce lp = generateDefaultLayoutParams();
            lp.f۱۰۹۵۳a = 8388611 | (this.f۱۱۸۷۵p & 112);
            lp.f۱۱۸۹۲b = 2;
            this.f۱۱۸۶۹j.setLayoutParams(lp);
            this.f۱۱۸۶۹j.setOnClickListener(new View$OnClickListenerCc());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.Toolbar$c  reason: invalid class name */
    public class View$OnClickListenerCc implements View.OnClickListener {
        View$OnClickListenerCc() {
        }

        public void onClick(View v) {
            Toolbar.this.m۱۴۹۳۸c();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۹۱۶a(View v, boolean allowHide) {
        Ce lp;
        ViewGroup.LayoutParams vlp = v.getLayoutParams();
        if (vlp == null) {
            lp = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(vlp)) {
            lp = generateLayoutParams(vlp);
        } else {
            lp = (Ce) vlp;
        }
        lp.f۱۱۸۹۲b = 1;
        if (!allowHide || this.f۱۱۸۷۰k == null) {
            addView(v, lp);
            return;
        }
        v.setLayoutParams(lp);
        this.f۱۱۸۵۱G.add(v);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Ck kVar;
        Cg state = new Cg(super.onSaveInstanceState());
        Cd dVar = this.f۱۱۸۵۷M;
        if (!(dVar == null || (kVar = dVar.f۱۱۸۹۰d) == null)) {
            state.f۱۱۸۹۳e = kVar.getItemId();
        }
        state.f۱۱۸۹۴f = m۱۴۹۴۴i();
        return state;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable state) {
        MenuItem item;
        if (!(state instanceof Cg)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Cg ss = (Cg) state;
        super.onRestoreInstanceState(ss.m۱۲۷۹۱a());
        ActionMenuView actionMenuView = this.f۱۱۸۶۲c;
        Menu menu = actionMenuView != null ? actionMenuView.m۱۴۰۶۴j() : null;
        int i = ss.f۱۱۸۹۳e;
        if (!(i == 0 || this.f۱۱۸۵۷M == null || menu == null || (item = menu.findItem(i)) == null)) {
            item.expandActionView();
        }
        if (ss.f۱۱۸۹۴f) {
            m۱۴۹۲۸q();
        }
    }

    /* renamed from: q  reason: contains not printable characters */
    private void m۱۴۹۲۸q() {
        removeCallbacks(this.f۱۱۸۶۱Q);
        post(this.f۱۱۸۶۱Q);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f۱۱۸۶۱Q);
    }

    public boolean onTouchEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 0) {
            this.f۱۱۸۴۸D = false;
        }
        if (!this.f۱۱۸۴۸D) {
            boolean handled = super.onTouchEvent(ev);
            if (action == 0 && !handled) {
                this.f۱۱۸۴۸D = true;
            }
        }
        if (action == 1 || action == 3) {
            this.f۱۱۸۴۸D = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 9) {
            this.f۱۱۸۴۹E = false;
        }
        if (!this.f۱۱۸۴۹E) {
            boolean handled = super.onHoverEvent(ev);
            if (action == 9 && !handled) {
                this.f۱۱۸۴۹E = true;
            }
        }
        if (action == 10 || action == 3) {
            this.f۱۱۸۴۹E = false;
        }
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۹۱۵a(View child, int parentWidthSpec, int widthUsed, int parentHeightSpec, int heightUsed, int heightConstraint) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        int childWidthSpec = ViewGroup.getChildMeasureSpec(parentWidthSpec, getPaddingLeft() + getPaddingRight() + lp.leftMargin + lp.rightMargin + widthUsed, lp.width);
        int childHeightSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, getPaddingTop() + getPaddingBottom() + lp.topMargin + lp.bottomMargin + heightUsed, lp.height);
        int childHeightMode = View.MeasureSpec.getMode(childHeightSpec);
        if (childHeightMode != 1073741824 && heightConstraint >= 0) {
            childHeightSpec = View.MeasureSpec.makeMeasureSpec(childHeightMode != 0 ? Math.min(View.MeasureSpec.getSize(childHeightSpec), heightConstraint) : heightConstraint, 1073741824);
        }
        child.measure(childWidthSpec, childHeightSpec);
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۴۹۱۲a(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed, int[] collapsingMargins) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        int leftDiff = lp.leftMargin - collapsingMargins[0];
        int rightDiff = lp.rightMargin - collapsingMargins[1];
        int hMargins = Math.max(0, leftDiff) + Math.max(0, rightDiff);
        collapsingMargins[0] = Math.max(0, -leftDiff);
        collapsingMargins[1] = Math.max(0, -rightDiff);
        child.measure(ViewGroup.getChildMeasureSpec(parentWidthMeasureSpec, getPaddingLeft() + getPaddingRight() + hMargins + widthUsed, lp.width), ViewGroup.getChildMeasureSpec(parentHeightMeasureSpec, getPaddingTop() + getPaddingBottom() + lp.topMargin + lp.bottomMargin + heightUsed, lp.height));
        return child.getMeasuredWidth() + hMargins;
    }

    /* renamed from: r  reason: contains not printable characters */
    private boolean m۱۴۹۲۹r() {
        if (!this.f۱۱۸۶۰P) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            if (m۱۴۹۲۲d(child) && child.getMeasuredWidth() > 0 && child.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int marginEndIndex;
        int marginStartIndex;
        int marginStartIndex2;
        int childState;
        int height;
        int childState2;
        int childState3;
        int titleHeight;
        int menuWidth;
        int childCount;
        int menuWidth2;
        int height2 = 0;
        int childState4 = 0;
        int[] collapsingMargins = this.f۱۱۸۵۲H;
        if (Cr1.m۱۵۵۶۷a(this)) {
            marginStartIndex = 1;
            marginEndIndex = 0;
        } else {
            marginStartIndex = 0;
            marginEndIndex = 1;
        }
        int navWidth = 0;
        if (m۱۴۹۲۲d(this.f۱۱۸۶۵f)) {
            m۱۴۹۱۵a(this.f۱۱۸۶۵f, widthMeasureSpec, 0, heightMeasureSpec, 0, this.f۱۱۸۷۶q);
            navWidth = this.f۱۱۸۶۵f.getMeasuredWidth() + m۱۴۹۱۰a(this.f۱۱۸۶۵f);
            height2 = Math.max(0, this.f۱۱۸۶۵f.getMeasuredHeight() + m۱۴۹۱۹b(this.f۱۱۸۶۵f));
            childState4 = View.combineMeasuredStates(0, this.f۱۱۸۶۵f.getMeasuredState());
        }
        if (m۱۴۹۲۲d(this.f۱۱۸۶۹j)) {
            m۱۴۹۱۵a(this.f۱۱۸۶۹j, widthMeasureSpec, 0, heightMeasureSpec, 0, this.f۱۱۸۷۶q);
            navWidth = this.f۱۱۸۶۹j.getMeasuredWidth() + m۱۴۹۱۰a(this.f۱۱۸۶۹j);
            height2 = Math.max(height2, this.f۱۱۸۶۹j.getMeasuredHeight() + m۱۴۹۱۹b(this.f۱۱۸۶۹j));
            childState4 = View.combineMeasuredStates(childState4, this.f۱۱۸۶۹j.getMeasuredState());
        }
        int contentInsetStart = getCurrentContentInsetStart();
        int width = 0 + Math.max(contentInsetStart, navWidth);
        collapsingMargins[marginStartIndex] = Math.max(0, contentInsetStart - navWidth);
        if (m۱۴۹۲۲d(this.f۱۱۸۶۲c)) {
            marginStartIndex2 = 0;
            m۱۴۹۱۵a(this.f۱۱۸۶۲c, widthMeasureSpec, width, heightMeasureSpec, 0, this.f۱۱۸۷۶q);
            int menuWidth3 = this.f۱۱۸۶۲c.getMeasuredWidth() + m۱۴۹۱۰a(this.f۱۱۸۶۲c);
            int height3 = Math.max(height2, this.f۱۱۸۶۲c.getMeasuredHeight() + m۱۴۹۱۹b(this.f۱۱۸۶۲c));
            childState2 = View.combineMeasuredStates(childState4, this.f۱۱۸۶۲c.getMeasuredState());
            childState = height3;
            height = menuWidth3;
        } else {
            marginStartIndex2 = 0;
            childState2 = childState4;
            childState = height2;
            height = 0;
        }
        int contentInsetEnd = getCurrentContentInsetEnd();
        int width2 = width + Math.max(contentInsetEnd, height);
        collapsingMargins[marginEndIndex] = Math.max(marginStartIndex2, contentInsetEnd - height);
        if (m۱۴۹۲۲d(this.f۱۱۸۷۰k)) {
            width2 += m۱۴۹۱۲a(this.f۱۱۸۷۰k, widthMeasureSpec, width2, heightMeasureSpec, 0, collapsingMargins);
            childState = Math.max(childState, this.f۱۱۸۷۰k.getMeasuredHeight() + m۱۴۹۱۹b(this.f۱۱۸۷۰k));
            childState3 = View.combineMeasuredStates(childState2, this.f۱۱۸۷۰k.getMeasuredState());
        } else {
            childState3 = childState2;
        }
        if (m۱۴۹۲۲d(this.f۱۱۸۶۶g)) {
            width2 += m۱۴۹۱۲a(this.f۱۱۸۶۶g, widthMeasureSpec, width2, heightMeasureSpec, 0, collapsingMargins);
            childState = Math.max(childState, this.f۱۱۸۶۶g.getMeasuredHeight() + m۱۴۹۱۹b(this.f۱۱۸۶۶g));
            childState3 = View.combineMeasuredStates(childState3, this.f۱۱۸۶۶g.getMeasuredState());
        }
        int childCount2 = getChildCount();
        int height4 = childState;
        int width3 = width2;
        int i = 0;
        while (i < childCount2) {
            View child = getChildAt(i);
            if (((Ce) child.getLayoutParams()).f۱۱۸۹۲b != 0) {
                childCount = childCount2;
                menuWidth = height;
                menuWidth2 = height4;
            } else if (!m۱۴۹۲۲d(child)) {
                childCount = childCount2;
                menuWidth = height;
                menuWidth2 = height4;
            } else {
                menuWidth = height;
                childCount = childCount2;
                width3 += m۱۴۹۱۲a(child, widthMeasureSpec, width3, heightMeasureSpec, 0, collapsingMargins);
                height4 = Math.max(height4, child.getMeasuredHeight() + m۱۴۹۱۹b(child));
                childState3 = View.combineMeasuredStates(childState3, child.getMeasuredState());
                i++;
                childCount2 = childCount;
                height = menuWidth;
            }
            height4 = menuWidth2;
            i++;
            childCount2 = childCount;
            height = menuWidth;
        }
        int titleWidth = 0;
        int titleHeight2 = 0;
        int titleVertMargins = this.f۱۱۸۷۹t + this.f۱۱۸۸۰u;
        int titleHorizMargins = this.f۱۱۸۷۷r + this.f۱۱۸۷۸s;
        if (m۱۴۹۲۲d(this.f۱۱۸۶۳d)) {
            m۱۴۹۱۲a(this.f۱۱۸۶۳d, widthMeasureSpec, width3 + titleHorizMargins, heightMeasureSpec, titleVertMargins, collapsingMargins);
            titleWidth = this.f۱۱۸۶۳d.getMeasuredWidth() + m۱۴۹۱۰a(this.f۱۱۸۶۳d);
            titleHeight2 = this.f۱۱۸۶۳d.getMeasuredHeight() + m۱۴۹۱۹b(this.f۱۱۸۶۳d);
            childState3 = View.combineMeasuredStates(childState3, this.f۱۱۸۶۳d.getMeasuredState());
        }
        if (m۱۴۹۲۲d(this.f۱۱۸۶۴e)) {
            titleWidth = Math.max(titleWidth, m۱۴۹۱۲a(this.f۱۱۸۶۴e, widthMeasureSpec, width3 + titleHorizMargins, heightMeasureSpec, titleHeight2 + titleVertMargins, collapsingMargins));
            int titleHeight3 = titleHeight2 + this.f۱۱۸۶۴e.getMeasuredHeight() + m۱۴۹۱۹b(this.f۱۱۸۶۴e);
            childState3 = View.combineMeasuredStates(childState3, this.f۱۱۸۶۴e.getMeasuredState());
            titleHeight = titleHeight3;
        } else {
            titleHeight = titleHeight2;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(width3 + titleWidth + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), widthMeasureSpec, -16777216 & childState3), m۱۴۹۲۹r() ? 0 : View.resolveSizeAndState(Math.max(Math.max(height4, titleHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), heightMeasureSpec, childState3 << 16));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015e, code lost:
        if (r33.f۱۱۸۶۳d.getMeasuredWidth() <= 0) goto L_0x0163;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x025c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r34, int r35, int r36, int r37, int r38) {
        /*
        // Method dump skipped, instructions count: 877
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۷v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۴۹۱۴a(List<View> views, int[] collapsingMargins) {
        int collapseLeft = collapsingMargins[0];
        int collapseRight = collapsingMargins[1];
        int width = 0;
        int count = views.size();
        for (int i = 0; i < count; i++) {
            View v = views.get(i);
            Ce lp = (Ce) v.getLayoutParams();
            int l = ((ViewGroup.MarginLayoutParams) lp).leftMargin - collapseLeft;
            int r = ((ViewGroup.MarginLayoutParams) lp).rightMargin - collapseRight;
            int leftMargin = Math.max(0, l);
            int rightMargin = Math.max(0, r);
            collapseLeft = Math.max(0, -l);
            collapseRight = Math.max(0, -r);
            width += v.getMeasuredWidth() + leftMargin + rightMargin;
        }
        return width;
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۴۹۱۳a(View child, int left, int[] collapsingMargins, int alignmentHeight) {
        Ce lp = (Ce) child.getLayoutParams();
        int l = ((ViewGroup.MarginLayoutParams) lp).leftMargin - collapsingMargins[0];
        int left2 = left + Math.max(0, l);
        collapsingMargins[0] = Math.max(0, -l);
        int top = m۱۴۹۱۱a(child, alignmentHeight);
        int childWidth = child.getMeasuredWidth();
        child.layout(left2, top, left2 + childWidth, child.getMeasuredHeight() + top);
        return left2 + ((ViewGroup.MarginLayoutParams) lp).rightMargin + childWidth;
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۴۹۲۰b(View child, int right, int[] collapsingMargins, int alignmentHeight) {
        Ce lp = (Ce) child.getLayoutParams();
        int r = ((ViewGroup.MarginLayoutParams) lp).rightMargin - collapsingMargins[1];
        int right2 = right - Math.max(0, r);
        collapsingMargins[1] = Math.max(0, -r);
        int top = m۱۴۹۱۱a(child, alignmentHeight);
        int childWidth = child.getMeasuredWidth();
        child.layout(right2 - childWidth, top, right2, child.getMeasuredHeight() + top);
        return right2 - (((ViewGroup.MarginLayoutParams) lp).leftMargin + childWidth);
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۴۹۱۱a(View child, int alignmentHeight) {
        Ce lp = (Ce) child.getLayoutParams();
        int childHeight = child.getMeasuredHeight();
        int alignmentOffset = alignmentHeight > 0 ? (childHeight - alignmentHeight) / 2 : 0;
        int b = m۱۴۹۱۸b(lp.f۱۰۹۵۳a);
        if (b == 48) {
            return getPaddingTop() - alignmentOffset;
        }
        if (b == 80) {
            return (((getHeight() - getPaddingBottom()) - childHeight) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin) - alignmentOffset;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int spaceAbove = (((height - paddingTop) - paddingBottom) - childHeight) / 2;
        if (spaceAbove < ((ViewGroup.MarginLayoutParams) lp).topMargin) {
            spaceAbove = ((ViewGroup.MarginLayoutParams) lp).topMargin;
        } else {
            int spaceBelow = (((height - paddingBottom) - childHeight) - spaceAbove) - paddingTop;
            int i = ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
            if (spaceBelow < i) {
                spaceAbove = Math.max(0, spaceAbove - (i - spaceBelow));
            }
        }
        return paddingTop + spaceAbove;
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۴۹۱۸b(int gravity) {
        int vgrav = gravity & 112;
        if (vgrav == 16 || vgrav == 48 || vgrav == 80) {
            return vgrav;
        }
        return this.f۱۱۸۸۴y & 112;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۹۱۷a(List<View> views, int gravity) {
        boolean isRtl = true;
        if (Cu.m۱۳۰۱۴k(this) != 1) {
            isRtl = false;
        }
        int childCount = getChildCount();
        int absGrav = android.support.p۰۴۳v4.view.Cd.m۱۲۸۲۵a(gravity, Cu.m۱۳۰۱۴k(this));
        views.clear();
        if (isRtl) {
            for (int i = childCount - 1; i >= 0; i--) {
                View child = getChildAt(i);
                Ce lp = (Ce) child.getLayoutParams();
                if (lp.f۱۱۸۹۲b == 0 && m۱۴۹۲۲d(child) && m۱۴۹۰۹a(lp.f۱۰۹۵۳a) == absGrav) {
                    views.add(child);
                }
            }
            return;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View child2 = getChildAt(i2);
            Ce lp2 = (Ce) child2.getLayoutParams();
            if (lp2.f۱۱۸۹۲b == 0 && m۱۴۹۲۲d(child2) && m۱۴۹۰۹a(lp2.f۱۰۹۵۳a) == absGrav) {
                views.add(child2);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۴۹۰۹a(int gravity) {
        int ld = Cu.m۱۳۰۱۴k(this);
        int hGrav = android.support.p۰۴۳v4.view.Cd.m۱۲۸۲۵a(gravity, ld) & 7;
        if (hGrav == 1 || hGrav == 3 || hGrav == 5) {
            return hGrav;
        }
        if (ld == 1) {
            return 5;
        }
        return 3;
    }

    /* renamed from: d  reason: contains not printable characters */
    private boolean m۱۴۹۲۲d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۴۹۱۰a(View v) {
        ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        return android.support.p۰۴۳v4.view.Cg.m۱۲۹۱۵b(mlp) + android.support.p۰۴۳v4.view.Cg.m۱۲۹۱۳a(mlp);
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۴۹۱۹b(View v) {
        ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        return mlp.topMargin + mlp.bottomMargin;
    }

    @Override // android.view.ViewGroup
    public Ce generateLayoutParams(AttributeSet attrs) {
        return new Ce(getContext(), attrs);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public Ce generateLayoutParams(ViewGroup.LayoutParams p) {
        if (p instanceof Ce) {
            return new Ce((Ce) p);
        }
        if (p instanceof AbstractCa.Ca) {
            return new Ce((AbstractCa.Ca) p);
        }
        if (p instanceof ViewGroup.MarginLayoutParams) {
            return new Ce((ViewGroup.MarginLayoutParams) p);
        }
        return new Ce(p);
    }

    /* access modifiers changed from: protected */
    public Ce generateDefaultLayoutParams() {
        return new Ce(-2, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return super.checkLayoutParams(p) && (p instanceof Ce);
    }

    public AbstractCf0 getWrapper() {
        if (this.f۱۱۸۵۵K == null) {
            this.f۱۱۸۵۵K = new Ck1(this, true);
        }
        return this.f۱۱۸۵۵K;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j  reason: contains not printable characters */
    public void m۱۴۹۴۵j() {
        for (int i = getChildCount() - 1; i >= 0; i--) {
            View child = getChildAt(i);
            if (!(((Ce) child.getLayoutParams()).f۱۱۸۹۲b == 2 || child == this.f۱۱۸۶۲c)) {
                removeViewAt(i);
                this.f۱۱۸۵۱G.add(child);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۹۳۰a() {
        for (int i = this.f۱۱۸۵۱G.size() - 1; i >= 0; i--) {
            addView(this.f۱۱۸۵۱G.get(i));
        }
        this.f۱۱۸۵۱G.clear();
    }

    /* renamed from: c  reason: contains not printable characters */
    private boolean m۱۴۹۲۱c(View child) {
        return child.getParent() == this || this.f۱۱۸۵۱G.contains(child);
    }

    public void setCollapsible(boolean collapsible) {
        this.f۱۱۸۶۰P = collapsible;
        requestLayout();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۹۳۴a(AbstractCp.AbstractCa pcb, Ch.AbstractCa mcb) {
        this.f۱۱۸۵۸N = pcb;
        this.f۱۱۸۵۹O = mcb;
        ActionMenuView actionMenuView = this.f۱۱۸۶۲c;
        if (actionMenuView != null) {
            actionMenuView.m۱۴۰۵۵a(pcb, mcb);
        }
    }

    /* renamed from: l  reason: contains not printable characters */
    private void m۱۴۹۲۳l() {
        if (this.f۱۱۸۸۱v == null) {
            this.f۱۱۸۸۱v = new Cz0();
        }
    }

    /* access modifiers changed from: package-private */
    public Cc getOuterActionMenuPresenter() {
        return this.f۱۱۸۵۶L;
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f۱۱۸۷۱l;
    }

    /* renamed from: android.support.v7.widget.Toolbar$e  reason: invalid class name */
    public static class Ce extends AbstractCa.Ca {

        /* renamed from: b  reason: contains not printable characters */
        int f۱۱۸۹۲b = 0;

        public Ce(Context c, AttributeSet attrs) {
            super(c, attrs);
        }

        public Ce(int width, int height) {
            super(width, height);
            this.f۱۰۹۵۳a = 8388627;
        }

        public Ce(Ce source) {
            super((AbstractCa.Ca) source);
            this.f۱۱۸۹۲b = source.f۱۱۸۹۲b;
        }

        public Ce(AbstractCa.Ca source) {
            super(source);
        }

        public Ce(ViewGroup.MarginLayoutParams source) {
            super(source);
            m۱۴۹۵۷a(source);
        }

        public Ce(ViewGroup.LayoutParams source) {
            super(source);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۹۵۷a(ViewGroup.MarginLayoutParams source) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = source.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = source.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = source.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = source.bottomMargin;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$g  reason: invalid class name */
    public static class Cg extends android.support.p۰۴۳v4.view.AbstractCa {
        public static final Parcelable.Creator<Cg> CREATOR = new Ca();

        /* renamed from: e  reason: contains not printable characters */
        int f۱۱۸۹۳e;

        /* renamed from: f  reason: contains not printable characters */
        boolean f۱۱۸۹۴f;

        public Cg(Parcel source, ClassLoader loader) {
            super(source, loader);
            this.f۱۱۸۹۳e = source.readInt();
            this.f۱۱۸۹۴f = source.readInt() != 0;
        }

        public Cg(Parcelable superState) {
            super(superState);
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCa
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f۱۱۸۹۳e);
            out.writeInt(this.f۱۱۸۹۴f ? 1 : 0);
        }

        /* renamed from: android.support.v7.widget.Toolbar$g$a  reason: invalid class name */
        static class Ca implements Parcelable.ClassLoaderCreator<Cg> {
            Ca() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public Cg createFromParcel(Parcel in, ClassLoader loader) {
                return new Cg(in, loader);
            }

            @Override // android.os.Parcelable.Creator
            public Cg createFromParcel(Parcel in) {
                return new Cg(in, null);
            }

            @Override // android.os.Parcelable.Creator
            public Cg[] newArray(int size) {
                return new Cg[size];
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.Toolbar$d  reason: invalid class name */
    public class Cd implements AbstractCp {

        /* renamed from: c  reason: contains not printable characters */
        Ch f۱۱۸۸۹c;

        /* renamed from: d  reason: contains not printable characters */
        Ck f۱۱۸۹۰d;

        Cd() {
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۹۴۸a(Context context, Ch menu) {
            Ck kVar;
            Ch hVar = this.f۱۱۸۸۹c;
            if (!(hVar == null || (kVar = this.f۱۱۸۹۰d) == null)) {
                hVar.m۱۳۸۵۴a(kVar);
            }
            this.f۱۱۸۸۹c = menu;
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۹۵۱a(boolean cleared) {
            if (this.f۱۱۸۹۰d != null) {
                boolean found = false;
                Ch hVar = this.f۱۱۸۸۹c;
                if (hVar != null) {
                    int count = hVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= count) {
                            break;
                        } else if (this.f۱۱۸۸۹c.getItem(i) == this.f۱۱۸۹۰d) {
                            found = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!found) {
                    m۱۴۹۵۲a(this.f۱۱۸۸۹c, this.f۱۱۸۹۰d);
                }
            }
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۹۵۳a(SubMenuCv subMenu) {
            return false;
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۹۵۰a(Ch menu, boolean allMenusAreClosing) {
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۴۹۵۴b() {
            return false;
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۴۹۵۵b(Ch menu, Ck item) {
            Toolbar.this.m۱۴۹۴۰e();
            ViewParent collapseButtonParent = Toolbar.this.f۱۱۸۶۹j.getParent();
            Toolbar toolbar = Toolbar.this;
            if (collapseButtonParent != toolbar) {
                if (collapseButtonParent instanceof ViewGroup) {
                    ((ViewGroup) collapseButtonParent).removeView(toolbar.f۱۱۸۶۹j);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f۱۱۸۶۹j);
            }
            Toolbar.this.f۱۱۸۷۰k = item.getActionView();
            this.f۱۱۸۹۰d = item;
            ViewParent expandedActionParent = Toolbar.this.f۱۱۸۷۰k.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (expandedActionParent != toolbar3) {
                if (expandedActionParent instanceof ViewGroup) {
                    ((ViewGroup) expandedActionParent).removeView(toolbar3.f۱۱۸۷۰k);
                }
                Ce lp = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                lp.f۱۰۹۵۳a = 8388611 | (toolbar4.f۱۱۸۷۵p & 112);
                lp.f۱۱۸۹۲b = 2;
                toolbar4.f۱۱۸۷۰k.setLayoutParams(lp);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f۱۱۸۷۰k);
            }
            Toolbar.this.m۱۴۹۴۵j();
            Toolbar.this.requestLayout();
            item.m۱۳۹۰۲a(true);
            View view = Toolbar.this.f۱۱۸۷۰k;
            if (view instanceof AbstractCc) {
                ((AbstractCc) view).m۱۰۷۹۳b();
            }
            return true;
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۹۵۲a(Ch menu, Ck item) {
            View view = Toolbar.this.f۱۱۸۷۰k;
            if (view instanceof AbstractCc) {
                ((AbstractCc) view).m۱۰۷۹۴c();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f۱۱۸۷۰k);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f۱۱۸۶۹j);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f۱۱۸۷۰k = null;
            toolbar3.m۱۴۹۳۰a();
            this.f۱۱۸۹۰d = null;
            Toolbar.this.requestLayout();
            item.m۱۳۹۰۲a(false);
            return true;
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۴۹۴۷a() {
            return 0;
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
        /* renamed from: c  reason: contains not printable characters */
        public Parcelable m۱۴۹۵۶c() {
            return null;
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۹۴۹a(Parcelable state) {
        }
    }
}
