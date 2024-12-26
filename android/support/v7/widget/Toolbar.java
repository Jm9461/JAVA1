package android.support.v7.widget;

import a.b.h.a.j;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.u;
import android.support.v7.app.a;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.k;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.v;
import android.support.v7.widget.ActionMenuView;
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

public class Toolbar extends ViewGroup {
    private CharSequence A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private final ArrayList<View> F;
    private final ArrayList<View> G;
    private final int[] H;
    f I;
    private final ActionMenuView.e J;
    private k1 K;
    private c L;
    private d M;
    private p.a N;
    private h.a O;
    private boolean P;
    private final Runnable Q;

    /* renamed from: c  reason: collision with root package name */
    private ActionMenuView f۱۹۴۶c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f۱۹۴۷d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f۱۹۴۸e;

    /* renamed from: f  reason: collision with root package name */
    private ImageButton f۱۹۴۹f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f۱۹۵۰g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f۱۹۵۱h;
    private CharSequence i;
    ImageButton j;
    View k;
    private Context l;
    private int m;
    private int n;
    private int o;
    int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private z0 v;
    private int w;
    private int x;
    private int y;
    private CharSequence z;

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // android.support.v7.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem item) {
            f fVar = Toolbar.this.I;
            if (fVar != null) {
                return fVar.onMenuItemClick(item);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Toolbar.this.k();
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attrs) {
        this(context, attrs, a.b.h.a.a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        int i2;
        this.y = 8388627;
        this.F = new ArrayList<>();
        this.G = new ArrayList<>();
        this.H = new int[2];
        this.J = new a();
        this.Q = new b();
        j1 a2 = j1.a(getContext(), attrs, j.Toolbar, defStyleAttr, 0);
        this.n = a2.g(j.Toolbar_titleTextAppearance, 0);
        this.o = a2.g(j.Toolbar_subtitleTextAppearance, 0);
        this.y = a2.e(j.Toolbar_android_gravity, this.y);
        this.p = a2.e(j.Toolbar_buttonGravity, 48);
        int titleMargin = a2.b(j.Toolbar_titleMargin, 0);
        titleMargin = a2.g(j.Toolbar_titleMargins) ? a2.b(j.Toolbar_titleMargins, titleMargin) : titleMargin;
        this.u = titleMargin;
        this.t = titleMargin;
        this.s = titleMargin;
        this.r = titleMargin;
        int marginStart = a2.b(j.Toolbar_titleMarginStart, -1);
        if (marginStart >= 0) {
            this.r = marginStart;
        }
        int marginEnd = a2.b(j.Toolbar_titleMarginEnd, -1);
        if (marginEnd >= 0) {
            this.s = marginEnd;
        }
        int marginTop = a2.b(j.Toolbar_titleMarginTop, -1);
        if (marginTop >= 0) {
            this.t = marginTop;
        }
        int marginBottom = a2.b(j.Toolbar_titleMarginBottom, -1);
        if (marginBottom >= 0) {
            this.u = marginBottom;
        }
        this.q = a2.c(j.Toolbar_maxButtonHeight, -1);
        int contentInsetStart = a2.b(j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int contentInsetEnd = a2.b(j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int contentInsetLeft = a2.c(j.Toolbar_contentInsetLeft, 0);
        int contentInsetRight = a2.c(j.Toolbar_contentInsetRight, 0);
        l();
        this.v.a(contentInsetLeft, contentInsetRight);
        if (!(contentInsetStart == Integer.MIN_VALUE && contentInsetEnd == Integer.MIN_VALUE)) {
            this.v.b(contentInsetStart, contentInsetEnd);
        }
        this.w = a2.b(j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.x = a2.b(j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f۱۹۵۱h = a2.b(j.Toolbar_collapseIcon);
        this.i = a2.e(j.Toolbar_collapseContentDescription);
        CharSequence title = a2.e(j.Toolbar_title);
        if (!TextUtils.isEmpty(title)) {
            setTitle(title);
        }
        CharSequence subtitle = a2.e(j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(subtitle)) {
            setSubtitle(subtitle);
        }
        this.l = getContext();
        setPopupTheme(a2.g(j.Toolbar_popupTheme, 0));
        Drawable navIcon = a2.b(j.Toolbar_navigationIcon);
        if (navIcon != null) {
            setNavigationIcon(navIcon);
        }
        CharSequence navDesc = a2.e(j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(navDesc)) {
            setNavigationContentDescription(navDesc);
        }
        Drawable logo = a2.b(j.Toolbar_logo);
        if (logo != null) {
            setLogo(logo);
        }
        CharSequence logoDesc = a2.e(j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(logoDesc)) {
            setLogoDescription(logoDesc);
        }
        if (a2.g(j.Toolbar_titleTextColor)) {
            i2 = -1;
            setTitleTextColor(a2.a(j.Toolbar_titleTextColor, -1));
        } else {
            i2 = -1;
        }
        if (a2.g(j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a2.a(j.Toolbar_subtitleTextColor, i2));
        }
        a2.a();
    }

    public void setPopupTheme(int resId) {
        if (this.m != resId) {
            this.m = resId;
            if (resId == 0) {
                this.l = getContext();
            } else {
                this.l = new ContextThemeWrapper(getContext(), resId);
            }
        }
    }

    public int getPopupTheme() {
        return this.m;
    }

    public int getTitleMarginStart() {
        return this.r;
    }

    public void setTitleMarginStart(int margin) {
        this.r = margin;
        requestLayout();
    }

    public int getTitleMarginTop() {
        return this.t;
    }

    public void setTitleMarginTop(int margin) {
        this.t = margin;
        requestLayout();
    }

    public int getTitleMarginEnd() {
        return this.s;
    }

    public void setTitleMarginEnd(int margin) {
        this.s = margin;
        requestLayout();
    }

    public int getTitleMarginBottom() {
        return this.u;
    }

    public void setTitleMarginBottom(int margin) {
        this.u = margin;
        requestLayout();
    }

    public void onRtlPropertiesChanged(int layoutDirection) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(layoutDirection);
        }
        l();
        z0 z0Var = this.v;
        boolean z2 = true;
        if (layoutDirection != 1) {
            z2 = false;
        }
        z0Var.a(z2);
    }

    public void setLogo(int resId) {
        setLogo(a.b.h.c.a.a.c(getContext(), resId));
    }

    public boolean b() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f۱۹۴۶c) != null && actionMenuView.i();
    }

    public boolean i() {
        ActionMenuView actionMenuView = this.f۱۹۴۶c;
        return actionMenuView != null && actionMenuView.h();
    }

    public boolean h() {
        ActionMenuView actionMenuView = this.f۱۹۴۶c;
        return actionMenuView != null && actionMenuView.g();
    }

    public boolean k() {
        ActionMenuView actionMenuView = this.f۱۹۴۶c;
        return actionMenuView != null && actionMenuView.k();
    }

    public boolean g() {
        ActionMenuView actionMenuView = this.f۱۹۴۶c;
        return actionMenuView != null && actionMenuView.f();
    }

    public void a(h menu, c outerPresenter) {
        if (menu != null || this.f۱۹۴۶c != null) {
            o();
            h oldMenu = this.f۱۹۴۶c.j();
            if (oldMenu != menu) {
                if (oldMenu != null) {
                    oldMenu.b(this.L);
                    oldMenu.b(this.M);
                }
                if (this.M == null) {
                    this.M = new d();
                }
                outerPresenter.b(true);
                if (menu != null) {
                    menu.a(outerPresenter, this.l);
                    menu.a(this.M, this.l);
                } else {
                    outerPresenter.a(this.l, (h) null);
                    this.M.a(this.l, (h) null);
                    outerPresenter.a(true);
                    this.M.a(true);
                }
                this.f۱۹۴۶c.setPopupTheme(this.m);
                this.f۱۹۴۶c.setPresenter(outerPresenter);
                this.L = outerPresenter;
            }
        }
    }

    public void d() {
        ActionMenuView actionMenuView = this.f۱۹۴۶c;
        if (actionMenuView != null) {
            actionMenuView.d();
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m();
            if (!c(this.f۱۹۵۰g)) {
                a((View) this.f۱۹۵۰g, true);
            }
        } else {
            ImageView imageView = this.f۱۹۵۰g;
            if (imageView != null && c(imageView)) {
                removeView(this.f۱۹۵۰g);
                this.G.remove(this.f۱۹۵۰g);
            }
        }
        ImageView imageView2 = this.f۱۹۵۰g;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        ImageView imageView = this.f۱۹۵۰g;
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
            m();
        }
        ImageView imageView = this.f۱۹۵۰g;
        if (imageView != null) {
            imageView.setContentDescription(description);
        }
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f۱۹۵۰g;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    private void m() {
        if (this.f۱۹۵۰g == null) {
            this.f۱۹۵۰g = new o(getContext());
        }
    }

    public boolean f() {
        d dVar = this.M;
        return (dVar == null || dVar.f۱۹۵۶d == null) ? false : true;
    }

    public void c() {
        d dVar = this.M;
        k item = dVar == null ? null : dVar.f۱۹۵۶d;
        if (item != null) {
            item.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.z;
    }

    public void setTitle(int resId) {
        setTitle(getContext().getText(resId));
    }

    public void setTitle(CharSequence title) {
        if (!TextUtils.isEmpty(title)) {
            if (this.f۱۹۴۷d == null) {
                Context context = getContext();
                this.f۱۹۴۷d = new AppCompatTextView(context);
                this.f۱۹۴۷d.setSingleLine();
                this.f۱۹۴۷d.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.n;
                if (i2 != 0) {
                    this.f۱۹۴۷d.setTextAppearance(context, i2);
                }
                int i3 = this.B;
                if (i3 != 0) {
                    this.f۱۹۴۷d.setTextColor(i3);
                }
            }
            if (!c(this.f۱۹۴۷d)) {
                a((View) this.f۱۹۴۷d, true);
            }
        } else {
            TextView textView = this.f۱۹۴۷d;
            if (textView != null && c(textView)) {
                removeView(this.f۱۹۴۷d);
                this.G.remove(this.f۱۹۴۷d);
            }
        }
        TextView textView2 = this.f۱۹۴۷d;
        if (textView2 != null) {
            textView2.setText(title);
        }
        this.z = title;
    }

    public CharSequence getSubtitle() {
        return this.A;
    }

    public void setSubtitle(int resId) {
        setSubtitle(getContext().getText(resId));
    }

    public void setSubtitle(CharSequence subtitle) {
        if (!TextUtils.isEmpty(subtitle)) {
            if (this.f۱۹۴۸e == null) {
                Context context = getContext();
                this.f۱۹۴۸e = new AppCompatTextView(context);
                this.f۱۹۴۸e.setSingleLine();
                this.f۱۹۴۸e.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.o;
                if (i2 != 0) {
                    this.f۱۹۴۸e.setTextAppearance(context, i2);
                }
                int i3 = this.C;
                if (i3 != 0) {
                    this.f۱۹۴۸e.setTextColor(i3);
                }
            }
            if (!c(this.f۱۹۴۸e)) {
                a((View) this.f۱۹۴۸e, true);
            }
        } else {
            TextView textView = this.f۱۹۴۸e;
            if (textView != null && c(textView)) {
                removeView(this.f۱۹۴۸e);
                this.G.remove(this.f۱۹۴۸e);
            }
        }
        TextView textView2 = this.f۱۹۴۸e;
        if (textView2 != null) {
            textView2.setText(subtitle);
        }
        this.A = subtitle;
    }

    public void b(Context context, int resId) {
        this.n = resId;
        TextView textView = this.f۱۹۴۷d;
        if (textView != null) {
            textView.setTextAppearance(context, resId);
        }
    }

    public void a(Context context, int resId) {
        this.o = resId;
        TextView textView = this.f۱۹۴۸e;
        if (textView != null) {
            textView.setTextAppearance(context, resId);
        }
    }

    public void setTitleTextColor(int color) {
        this.B = color;
        TextView textView = this.f۱۹۴۷d;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public void setSubtitleTextColor(int color) {
        this.C = color;
        TextView textView = this.f۱۹۴۸e;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f۱۹۴۹f;
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
            p();
        }
        ImageButton imageButton = this.f۱۹۴۹f;
        if (imageButton != null) {
            imageButton.setContentDescription(description);
        }
    }

    public void setNavigationIcon(int resId) {
        setNavigationIcon(a.b.h.c.a.a.c(getContext(), resId));
    }

    public void setNavigationIcon(Drawable icon) {
        if (icon != null) {
            p();
            if (!c(this.f۱۹۴۹f)) {
                a((View) this.f۱۹۴۹f, true);
            }
        } else {
            ImageButton imageButton = this.f۱۹۴۹f;
            if (imageButton != null && c(imageButton)) {
                removeView(this.f۱۹۴۹f);
                this.G.remove(this.f۱۹۴۹f);
            }
        }
        ImageButton imageButton2 = this.f۱۹۴۹f;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(icon);
        }
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f۱۹۴۹f;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener listener) {
        p();
        this.f۱۹۴۹f.setOnClickListener(listener);
    }

    public Menu getMenu() {
        n();
        return this.f۱۹۴۶c.getMenu();
    }

    public void setOverflowIcon(Drawable icon) {
        n();
        this.f۱۹۴۶c.setOverflowIcon(icon);
    }

    public Drawable getOverflowIcon() {
        n();
        return this.f۱۹۴۶c.getOverflowIcon();
    }

    private void n() {
        o();
        if (this.f۱۹۴۶c.j() == null) {
            h menu = (h) this.f۱۹۴۶c.getMenu();
            if (this.M == null) {
                this.M = new d();
            }
            this.f۱۹۴۶c.setExpandedActionViewsExclusive(true);
            menu.a(this.M, this.l);
        }
    }

    private void o() {
        if (this.f۱۹۴۶c == null) {
            this.f۱۹۴۶c = new ActionMenuView(getContext());
            this.f۱۹۴۶c.setPopupTheme(this.m);
            this.f۱۹۴۶c.setOnMenuItemClickListener(this.J);
            this.f۱۹۴۶c.a(this.N, this.O);
            e lp = generateDefaultLayoutParams();
            lp.f۱۵۳۰a = 8388613 | (this.p & 112);
            this.f۱۹۴۶c.setLayoutParams(lp);
            a((View) this.f۱۹۴۶c, false);
        }
    }

    private MenuInflater getMenuInflater() {
        return new a.b.h.f.g(getContext());
    }

    public void setOnMenuItemClickListener(f listener) {
        this.I = listener;
    }

    public void b(int contentInsetStart, int contentInsetEnd) {
        l();
        this.v.b(contentInsetStart, contentInsetEnd);
    }

    public int getContentInsetStart() {
        z0 z0Var = this.v;
        if (z0Var != null) {
            return z0Var.d();
        }
        return 0;
    }

    public int getContentInsetEnd() {
        z0 z0Var = this.v;
        if (z0Var != null) {
            return z0Var.a();
        }
        return 0;
    }

    public void a(int contentInsetLeft, int contentInsetRight) {
        l();
        this.v.a(contentInsetLeft, contentInsetRight);
    }

    public int getContentInsetLeft() {
        z0 z0Var = this.v;
        if (z0Var != null) {
            return z0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        z0 z0Var = this.v;
        if (z0Var != null) {
            return z0Var.c();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.w;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public void setContentInsetStartWithNavigation(int insetStartWithNavigation) {
        if (insetStartWithNavigation < 0) {
            insetStartWithNavigation = Integer.MIN_VALUE;
        }
        if (insetStartWithNavigation != this.w) {
            this.w = insetStartWithNavigation;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.x;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public void setContentInsetEndWithActions(int insetEndWithActions) {
        if (insetEndWithActions < 0) {
            insetEndWithActions = Integer.MIN_VALUE;
        }
        if (insetEndWithActions != this.x) {
            this.x = insetEndWithActions;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.w, 0));
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean hasActions = false;
        ActionMenuView actionMenuView = this.f۱۹۴۶c;
        if (actionMenuView != null) {
            h mb = actionMenuView.j();
            hasActions = mb != null && mb.hasVisibleItems();
        }
        if (hasActions) {
            return Math.max(getContentInsetEnd(), Math.max(this.x, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (u.k(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (u.k(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    private void p() {
        if (this.f۱۹۴۹f == null) {
            this.f۱۹۴۹f = new m(getContext(), null, a.b.h.a.a.toolbarNavigationButtonStyle);
            e lp = generateDefaultLayoutParams();
            lp.f۱۵۳۰a = 8388611 | (this.p & 112);
            this.f۱۹۴۹f.setLayoutParams(lp);
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (this.j == null) {
            this.j = new m(getContext(), null, a.b.h.a.a.toolbarNavigationButtonStyle);
            this.j.setImageDrawable(this.f۱۹۵۱h);
            this.j.setContentDescription(this.i);
            e lp = generateDefaultLayoutParams();
            lp.f۱۵۳۰a = 8388611 | (this.p & 112);
            lp.f۱۹۵۸b = 2;
            this.j.setLayoutParams(lp);
            this.j.setOnClickListener(new c());
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View v) {
            Toolbar.this.c();
        }
    }

    private void a(View v2, boolean allowHide) {
        e lp;
        ViewGroup.LayoutParams vlp = v2.getLayoutParams();
        if (vlp == null) {
            lp = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(vlp)) {
            lp = generateLayoutParams(vlp);
        } else {
            lp = (e) vlp;
        }
        lp.f۱۹۵۸b = 1;
        if (!allowHide || this.k == null) {
            addView(v2, lp);
            return;
        }
        v2.setLayoutParams(lp);
        this.G.add(v2);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        k kVar;
        g state = new g(super.onSaveInstanceState());
        d dVar = this.M;
        if (!(dVar == null || (kVar = dVar.f۱۹۵۶d) == null)) {
            state.f۱۹۵۹e = kVar.getItemId();
        }
        state.f۱۹۶۰f = i();
        return state;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable state) {
        MenuItem item;
        if (!(state instanceof g)) {
            super.onRestoreInstanceState(state);
            return;
        }
        g ss = (g) state;
        super.onRestoreInstanceState(ss.a());
        ActionMenuView actionMenuView = this.f۱۹۴۶c;
        Menu menu = actionMenuView != null ? actionMenuView.j() : null;
        int i2 = ss.f۱۹۵۹e;
        if (!(i2 == 0 || this.M == null || menu == null || (item = menu.findItem(i2)) == null)) {
            item.expandActionView();
        }
        if (ss.f۱۹۶۰f) {
            q();
        }
    }

    private void q() {
        removeCallbacks(this.Q);
        post(this.Q);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.Q);
    }

    public boolean onTouchEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 0) {
            this.D = false;
        }
        if (!this.D) {
            boolean handled = super.onTouchEvent(ev);
            if (action == 0 && !handled) {
                this.D = true;
            }
        }
        if (action == 1 || action == 3) {
            this.D = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 9) {
            this.E = false;
        }
        if (!this.E) {
            boolean handled = super.onHoverEvent(ev);
            if (action == 9 && !handled) {
                this.E = true;
            }
        }
        if (action == 10 || action == 3) {
            this.E = false;
        }
        return true;
    }

    private void a(View child, int parentWidthSpec, int widthUsed, int parentHeightSpec, int heightUsed, int heightConstraint) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        int childWidthSpec = ViewGroup.getChildMeasureSpec(parentWidthSpec, getPaddingLeft() + getPaddingRight() + lp.leftMargin + lp.rightMargin + widthUsed, lp.width);
        int childHeightSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, getPaddingTop() + getPaddingBottom() + lp.topMargin + lp.bottomMargin + heightUsed, lp.height);
        int childHeightMode = View.MeasureSpec.getMode(childHeightSpec);
        if (childHeightMode != 1073741824 && heightConstraint >= 0) {
            childHeightSpec = View.MeasureSpec.makeMeasureSpec(childHeightMode != 0 ? Math.min(View.MeasureSpec.getSize(childHeightSpec), heightConstraint) : heightConstraint, 1073741824);
        }
        child.measure(childWidthSpec, childHeightSpec);
    }

    private int a(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed, int[] collapsingMargins) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        int leftDiff = lp.leftMargin - collapsingMargins[0];
        int rightDiff = lp.rightMargin - collapsingMargins[1];
        int hMargins = Math.max(0, leftDiff) + Math.max(0, rightDiff);
        collapsingMargins[0] = Math.max(0, -leftDiff);
        collapsingMargins[1] = Math.max(0, -rightDiff);
        child.measure(ViewGroup.getChildMeasureSpec(parentWidthMeasureSpec, getPaddingLeft() + getPaddingRight() + hMargins + widthUsed, lp.width), ViewGroup.getChildMeasureSpec(parentHeightMeasureSpec, getPaddingTop() + getPaddingBottom() + lp.topMargin + lp.bottomMargin + heightUsed, lp.height));
        return child.getMeasuredWidth() + hMargins;
    }

    private boolean r() {
        if (!this.P) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = getChildAt(i2);
            if (d(child) && child.getMeasuredWidth() > 0 && child.getMeasuredHeight() > 0) {
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
        int[] collapsingMargins = this.H;
        if (r1.a(this)) {
            marginStartIndex = 1;
            marginEndIndex = 0;
        } else {
            marginStartIndex = 0;
            marginEndIndex = 1;
        }
        int navWidth = 0;
        if (d(this.f۱۹۴۹f)) {
            a(this.f۱۹۴۹f, widthMeasureSpec, 0, heightMeasureSpec, 0, this.q);
            navWidth = this.f۱۹۴۹f.getMeasuredWidth() + a(this.f۱۹۴۹f);
            height2 = Math.max(0, this.f۱۹۴۹f.getMeasuredHeight() + b(this.f۱۹۴۹f));
            childState4 = View.combineMeasuredStates(0, this.f۱۹۴۹f.getMeasuredState());
        }
        if (d(this.j)) {
            a(this.j, widthMeasureSpec, 0, heightMeasureSpec, 0, this.q);
            navWidth = this.j.getMeasuredWidth() + a(this.j);
            height2 = Math.max(height2, this.j.getMeasuredHeight() + b(this.j));
            childState4 = View.combineMeasuredStates(childState4, this.j.getMeasuredState());
        }
        int contentInsetStart = getCurrentContentInsetStart();
        int width = 0 + Math.max(contentInsetStart, navWidth);
        collapsingMargins[marginStartIndex] = Math.max(0, contentInsetStart - navWidth);
        if (d(this.f۱۹۴۶c)) {
            marginStartIndex2 = 0;
            a(this.f۱۹۴۶c, widthMeasureSpec, width, heightMeasureSpec, 0, this.q);
            int menuWidth3 = this.f۱۹۴۶c.getMeasuredWidth() + a(this.f۱۹۴۶c);
            int height3 = Math.max(height2, this.f۱۹۴۶c.getMeasuredHeight() + b(this.f۱۹۴۶c));
            childState2 = View.combineMeasuredStates(childState4, this.f۱۹۴۶c.getMeasuredState());
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
        if (d(this.k)) {
            width2 += a(this.k, widthMeasureSpec, width2, heightMeasureSpec, 0, collapsingMargins);
            childState = Math.max(childState, this.k.getMeasuredHeight() + b(this.k));
            childState3 = View.combineMeasuredStates(childState2, this.k.getMeasuredState());
        } else {
            childState3 = childState2;
        }
        if (d(this.f۱۹۵۰g)) {
            width2 += a(this.f۱۹۵۰g, widthMeasureSpec, width2, heightMeasureSpec, 0, collapsingMargins);
            childState = Math.max(childState, this.f۱۹۵۰g.getMeasuredHeight() + b(this.f۱۹۵۰g));
            childState3 = View.combineMeasuredStates(childState3, this.f۱۹۵۰g.getMeasuredState());
        }
        int childCount2 = getChildCount();
        int height4 = childState;
        int width3 = width2;
        int i2 = 0;
        while (i2 < childCount2) {
            View child = getChildAt(i2);
            if (((e) child.getLayoutParams()).f۱۹۵۸b != 0) {
                childCount = childCount2;
                menuWidth = height;
                menuWidth2 = height4;
            } else if (!d(child)) {
                childCount = childCount2;
                menuWidth = height;
                menuWidth2 = height4;
            } else {
                menuWidth = height;
                childCount = childCount2;
                width3 += a(child, widthMeasureSpec, width3, heightMeasureSpec, 0, collapsingMargins);
                height4 = Math.max(height4, child.getMeasuredHeight() + b(child));
                childState3 = View.combineMeasuredStates(childState3, child.getMeasuredState());
                i2++;
                childCount2 = childCount;
                height = menuWidth;
            }
            height4 = menuWidth2;
            i2++;
            childCount2 = childCount;
            height = menuWidth;
        }
        int titleWidth = 0;
        int titleHeight2 = 0;
        int titleVertMargins = this.t + this.u;
        int titleHorizMargins = this.r + this.s;
        if (d(this.f۱۹۴۷d)) {
            a(this.f۱۹۴۷d, widthMeasureSpec, width3 + titleHorizMargins, heightMeasureSpec, titleVertMargins, collapsingMargins);
            titleWidth = this.f۱۹۴۷d.getMeasuredWidth() + a(this.f۱۹۴۷d);
            titleHeight2 = this.f۱۹۴۷d.getMeasuredHeight() + b(this.f۱۹۴۷d);
            childState3 = View.combineMeasuredStates(childState3, this.f۱۹۴۷d.getMeasuredState());
        }
        if (d(this.f۱۹۴۸e)) {
            titleWidth = Math.max(titleWidth, a(this.f۱۹۴۸e, widthMeasureSpec, width3 + titleHorizMargins, heightMeasureSpec, titleHeight2 + titleVertMargins, collapsingMargins));
            int titleHeight3 = titleHeight2 + this.f۱۹۴۸e.getMeasuredHeight() + b(this.f۱۹۴۸e);
            childState3 = View.combineMeasuredStates(childState3, this.f۱۹۴۸e.getMeasuredState());
            titleHeight = titleHeight3;
        } else {
            titleHeight = titleHeight2;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(width3 + titleWidth + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), widthMeasureSpec, -16777216 & childState3), r() ? 0 : View.resolveSizeAndState(Math.max(Math.max(height4, titleHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), heightMeasureSpec, childState3 << 16));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015e, code lost:
        if (r33.f۱۹۴۷d.getMeasuredWidth() <= 0) goto L_0x0163;
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    private int a(List<View> views, int[] collapsingMargins) {
        int collapseLeft = collapsingMargins[0];
        int collapseRight = collapsingMargins[1];
        int width = 0;
        int count = views.size();
        for (int i2 = 0; i2 < count; i2++) {
            View v2 = views.get(i2);
            e lp = (e) v2.getLayoutParams();
            int l2 = ((ViewGroup.MarginLayoutParams) lp).leftMargin - collapseLeft;
            int r2 = ((ViewGroup.MarginLayoutParams) lp).rightMargin - collapseRight;
            int leftMargin = Math.max(0, l2);
            int rightMargin = Math.max(0, r2);
            collapseLeft = Math.max(0, -l2);
            collapseRight = Math.max(0, -r2);
            width += v2.getMeasuredWidth() + leftMargin + rightMargin;
        }
        return width;
    }

    private int a(View child, int left, int[] collapsingMargins, int alignmentHeight) {
        e lp = (e) child.getLayoutParams();
        int l2 = ((ViewGroup.MarginLayoutParams) lp).leftMargin - collapsingMargins[0];
        int left2 = left + Math.max(0, l2);
        collapsingMargins[0] = Math.max(0, -l2);
        int top = a(child, alignmentHeight);
        int childWidth = child.getMeasuredWidth();
        child.layout(left2, top, left2 + childWidth, child.getMeasuredHeight() + top);
        return left2 + ((ViewGroup.MarginLayoutParams) lp).rightMargin + childWidth;
    }

    private int b(View child, int right, int[] collapsingMargins, int alignmentHeight) {
        e lp = (e) child.getLayoutParams();
        int r2 = ((ViewGroup.MarginLayoutParams) lp).rightMargin - collapsingMargins[1];
        int right2 = right - Math.max(0, r2);
        collapsingMargins[1] = Math.max(0, -r2);
        int top = a(child, alignmentHeight);
        int childWidth = child.getMeasuredWidth();
        child.layout(right2 - childWidth, top, right2, child.getMeasuredHeight() + top);
        return right2 - (((ViewGroup.MarginLayoutParams) lp).leftMargin + childWidth);
    }

    private int a(View child, int alignmentHeight) {
        e lp = (e) child.getLayoutParams();
        int childHeight = child.getMeasuredHeight();
        int alignmentOffset = alignmentHeight > 0 ? (childHeight - alignmentHeight) / 2 : 0;
        int b2 = b(lp.f۱۵۳۰a);
        if (b2 == 48) {
            return getPaddingTop() - alignmentOffset;
        }
        if (b2 == 80) {
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
            int i2 = ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
            if (spaceBelow < i2) {
                spaceAbove = Math.max(0, spaceAbove - (i2 - spaceBelow));
            }
        }
        return paddingTop + spaceAbove;
    }

    private int b(int gravity) {
        int vgrav = gravity & 112;
        if (vgrav == 16 || vgrav == 48 || vgrav == 80) {
            return vgrav;
        }
        return this.y & 112;
    }

    private void a(List<View> views, int gravity) {
        boolean isRtl = true;
        if (u.k(this) != 1) {
            isRtl = false;
        }
        int childCount = getChildCount();
        int absGrav = android.support.v4.view.d.a(gravity, u.k(this));
        views.clear();
        if (isRtl) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View child = getChildAt(i2);
                e lp = (e) child.getLayoutParams();
                if (lp.f۱۹۵۸b == 0 && d(child) && a(lp.f۱۵۳۰a) == absGrav) {
                    views.add(child);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View child2 = getChildAt(i3);
            e lp2 = (e) child2.getLayoutParams();
            if (lp2.f۱۹۵۸b == 0 && d(child2) && a(lp2.f۱۵۳۰a) == absGrav) {
                views.add(child2);
            }
        }
    }

    private int a(int gravity) {
        int ld = u.k(this);
        int hGrav = android.support.v4.view.d.a(gravity, ld) & 7;
        if (hGrav == 1 || hGrav == 3 || hGrav == 5) {
            return hGrav;
        }
        if (ld == 1) {
            return 5;
        }
        return 3;
    }

    private boolean d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private int a(View v2) {
        ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) v2.getLayoutParams();
        return android.support.v4.view.g.b(mlp) + android.support.v4.view.g.a(mlp);
    }

    private int b(View v2) {
        ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) v2.getLayoutParams();
        return mlp.topMargin + mlp.bottomMargin;
    }

    @Override // android.view.ViewGroup
    public e generateLayoutParams(AttributeSet attrs) {
        return new e(getContext(), attrs);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public e generateLayoutParams(ViewGroup.LayoutParams p2) {
        if (p2 instanceof e) {
            return new e((e) p2);
        }
        if (p2 instanceof a.C۰۰۳۴a) {
            return new e((a.C۰۰۳۴a) p2);
        }
        if (p2 instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) p2);
        }
        return new e(p2);
    }

    /* access modifiers changed from: protected */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return super.checkLayoutParams(p2) && (p2 instanceof e);
    }

    public f0 getWrapper() {
        if (this.K == null) {
            this.K = new k1(this, true);
        }
        return this.K;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        for (int i2 = getChildCount() - 1; i2 >= 0; i2--) {
            View child = getChildAt(i2);
            if (!(((e) child.getLayoutParams()).f۱۹۵۸b == 2 || child == this.f۱۹۴۶c)) {
                removeViewAt(i2);
                this.G.add(child);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        for (int i2 = this.G.size() - 1; i2 >= 0; i2--) {
            addView(this.G.get(i2));
        }
        this.G.clear();
    }

    private boolean c(View child) {
        return child.getParent() == this || this.G.contains(child);
    }

    public void setCollapsible(boolean collapsible) {
        this.P = collapsible;
        requestLayout();
    }

    public void a(p.a pcb, h.a mcb) {
        this.N = pcb;
        this.O = mcb;
        ActionMenuView actionMenuView = this.f۱۹۴۶c;
        if (actionMenuView != null) {
            actionMenuView.a(pcb, mcb);
        }
    }

    private void l() {
        if (this.v == null) {
            this.v = new z0();
        }
    }

    /* access modifiers changed from: package-private */
    public c getOuterActionMenuPresenter() {
        return this.L;
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.l;
    }

    public static class e extends a.C۰۰۳۴a {

        /* renamed from: b  reason: collision with root package name */
        int f۱۹۵۸b = 0;

        public e(Context c2, AttributeSet attrs) {
            super(c2, attrs);
        }

        public e(int width, int height) {
            super(width, height);
            this.f۱۵۳۰a = 8388627;
        }

        public e(e source) {
            super((a.C۰۰۳۴a) source);
            this.f۱۹۵۸b = source.f۱۹۵۸b;
        }

        public e(a.C۰۰۳۴a source) {
            super(source);
        }

        public e(ViewGroup.MarginLayoutParams source) {
            super(source);
            a(source);
        }

        public e(ViewGroup.LayoutParams source) {
            super(source);
        }

        /* access modifiers changed from: package-private */
        public void a(ViewGroup.MarginLayoutParams source) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = source.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = source.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = source.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = source.bottomMargin;
        }
    }

    public static class g extends android.support.v4.view.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        int f۱۹۵۹e;

        /* renamed from: f  reason: collision with root package name */
        boolean f۱۹۶۰f;

        public g(Parcel source, ClassLoader loader) {
            super(source, loader);
            this.f۱۹۵۹e = source.readInt();
            this.f۱۹۶۰f = source.readInt() != 0;
        }

        public g(Parcelable superState) {
            super(superState);
        }

        @Override // android.support.v4.view.a
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f۱۹۵۹e);
            out.writeInt(this.f۱۹۶۰f ? 1 : 0);
        }

        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public g createFromParcel(Parcel in, ClassLoader loader) {
                return new g(in, loader);
            }

            @Override // android.os.Parcelable.Creator
            public g createFromParcel(Parcel in) {
                return new g(in, null);
            }

            @Override // android.os.Parcelable.Creator
            public g[] newArray(int size) {
                return new g[size];
            }
        }
    }

    /* access modifiers changed from: private */
    public class d implements p {

        /* renamed from: c  reason: collision with root package name */
        h f۱۹۵۵c;

        /* renamed from: d  reason: collision with root package name */
        k f۱۹۵۶d;

        d() {
        }

        @Override // android.support.v7.view.menu.p
        public void a(Context context, h menu) {
            k kVar;
            h hVar = this.f۱۹۵۵c;
            if (!(hVar == null || (kVar = this.f۱۹۵۶d) == null)) {
                hVar.a(kVar);
            }
            this.f۱۹۵۵c = menu;
        }

        @Override // android.support.v7.view.menu.p
        public void a(boolean cleared) {
            if (this.f۱۹۵۶d != null) {
                boolean found = false;
                h hVar = this.f۱۹۵۵c;
                if (hVar != null) {
                    int count = hVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= count) {
                            break;
                        } else if (this.f۱۹۵۵c.getItem(i) == this.f۱۹۵۶d) {
                            found = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!found) {
                    a(this.f۱۹۵۵c, this.f۱۹۵۶d);
                }
            }
        }

        @Override // android.support.v7.view.menu.p
        public boolean a(v subMenu) {
            return false;
        }

        @Override // android.support.v7.view.menu.p
        public void a(h menu, boolean allMenusAreClosing) {
        }

        @Override // android.support.v7.view.menu.p
        public boolean b() {
            return false;
        }

        @Override // android.support.v7.view.menu.p
        public boolean b(h menu, k item) {
            Toolbar.this.e();
            ViewParent collapseButtonParent = Toolbar.this.j.getParent();
            Toolbar toolbar = Toolbar.this;
            if (collapseButtonParent != toolbar) {
                if (collapseButtonParent instanceof ViewGroup) {
                    ((ViewGroup) collapseButtonParent).removeView(toolbar.j);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.j);
            }
            Toolbar.this.k = item.getActionView();
            this.f۱۹۵۶d = item;
            ViewParent expandedActionParent = Toolbar.this.k.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (expandedActionParent != toolbar3) {
                if (expandedActionParent instanceof ViewGroup) {
                    ((ViewGroup) expandedActionParent).removeView(toolbar3.k);
                }
                e lp = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                lp.f۱۵۳۰a = 8388611 | (toolbar4.p & 112);
                lp.f۱۹۵۸b = 2;
                toolbar4.k.setLayoutParams(lp);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.k);
            }
            Toolbar.this.j();
            Toolbar.this.requestLayout();
            item.a(true);
            View view = Toolbar.this.k;
            if (view instanceof a.b.h.f.c) {
                ((a.b.h.f.c) view).b();
            }
            return true;
        }

        @Override // android.support.v7.view.menu.p
        public boolean a(h menu, k item) {
            View view = Toolbar.this.k;
            if (view instanceof a.b.h.f.c) {
                ((a.b.h.f.c) view).c();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.k);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.j);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.k = null;
            toolbar3.a();
            this.f۱۹۵۶d = null;
            Toolbar.this.requestLayout();
            item.a(false);
            return true;
        }

        @Override // android.support.v7.view.menu.p
        public int a() {
            return 0;
        }

        @Override // android.support.v7.view.menu.p
        public Parcelable c() {
            return null;
        }

        @Override // android.support.v7.view.menu.p
        public void a(Parcelable state) {
        }
    }
}
