package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.p۰۴۳v4.view.AbstractCq;
import android.support.p۰۴۳v4.view.Cr;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.view.ViewPager;
import android.support.p۰۴۳v4.widget.Cp;
import android.support.p۰۴۷v7.app.AbstractCa;
import android.support.p۰۴۷v7.widget.Cl1;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cd;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCj;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ck;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cl;

@ViewPager.AbstractCe
public class TabLayout extends HorizontalScrollView {

    /* renamed from: Q  reason: contains not printable characters */
    private static final AbstractCj<Cg> f۹۷۰۶Q = new Cl(16);

    /* renamed from: A  reason: contains not printable characters */
    int f۹۷۰۷A;

    /* renamed from: B  reason: contains not printable characters */
    int f۹۷۰۸B;

    /* renamed from: C  reason: contains not printable characters */
    boolean f۹۷۰۹C;

    /* renamed from: D  reason: contains not printable characters */
    boolean f۹۷۱۰D;

    /* renamed from: E  reason: contains not printable characters */
    boolean f۹۷۱۱E;

    /* renamed from: F  reason: contains not printable characters */
    private AbstractCc f۹۷۱۲F;

    /* renamed from: G  reason: contains not printable characters */
    private final ArrayList<AbstractCc> f۹۷۱۳G;

    /* renamed from: H  reason: contains not printable characters */
    private AbstractCc f۹۷۱۴H;

    /* renamed from: I  reason: contains not printable characters */
    private ValueAnimator f۹۷۱۵I;

    /* renamed from: J  reason: contains not printable characters */
    ViewPager f۹۷۱۶J;

    /* renamed from: K  reason: contains not printable characters */
    private AbstractCq f۹۷۱۷K;

    /* renamed from: L  reason: contains not printable characters */
    private DataSetObserver f۹۷۱۸L;

    /* renamed from: M  reason: contains not printable characters */
    private Ch f۹۷۱۹M;

    /* renamed from: N  reason: contains not printable characters */
    private Cb f۹۷۲۰N;

    /* renamed from: O  reason: contains not printable characters */
    private boolean f۹۷۲۱O;

    /* renamed from: P  reason: contains not printable characters */
    private final AbstractCj<Ci> f۹۷۲۲P;

    /* renamed from: c  reason: contains not printable characters */
    private final ArrayList<Cg> f۹۷۲۳c;

    /* renamed from: d  reason: contains not printable characters */
    private Cg f۹۷۲۴d;

    /* renamed from: e  reason: contains not printable characters */
    private final RectF f۹۷۲۵e;

    /* renamed from: f  reason: contains not printable characters */
    private final Cf f۹۷۲۶f;

    /* renamed from: g  reason: contains not printable characters */
    int f۹۷۲۷g;

    /* renamed from: h  reason: contains not printable characters */
    int f۹۷۲۸h;

    /* renamed from: i  reason: contains not printable characters */
    int f۹۷۲۹i;

    /* renamed from: j  reason: contains not printable characters */
    int f۹۷۳۰j;

    /* renamed from: k  reason: contains not printable characters */
    int f۹۷۳۱k;

    /* renamed from: l  reason: contains not printable characters */
    ColorStateList f۹۷۳۲l;

    /* renamed from: m  reason: contains not printable characters */
    ColorStateList f۹۷۳۳m;

    /* renamed from: n  reason: contains not printable characters */
    ColorStateList f۹۷۳۴n;

    /* renamed from: o  reason: contains not printable characters */
    Drawable f۹۷۳۵o;

    /* renamed from: p  reason: contains not printable characters */
    PorterDuff.Mode f۹۷۳۶p;

    /* renamed from: q  reason: contains not printable characters */
    float f۹۷۳۷q;

    /* renamed from: r  reason: contains not printable characters */
    float f۹۷۳۸r;

    /* renamed from: s  reason: contains not printable characters */
    final int f۹۷۳۹s;

    /* renamed from: t  reason: contains not printable characters */
    int f۹۷۴۰t;

    /* renamed from: u  reason: contains not printable characters */
    private final int f۹۷۴۱u;

    /* renamed from: v  reason: contains not printable characters */
    private final int f۹۷۴۲v;

    /* renamed from: w  reason: contains not printable characters */
    private final int f۹۷۴۳w;

    /* renamed from: x  reason: contains not printable characters */
    private int f۹۷۴۴x;

    /* renamed from: y  reason: contains not printable characters */
    int f۹۷۴۵y;

    /* renamed from: z  reason: contains not printable characters */
    int f۹۷۴۶z;

    /* renamed from: android.support.design.widget.TabLayout$c  reason: invalid class name */
    public interface AbstractCc<T extends Cg> {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۱۷۱۷a(T t);

        /* renamed from: b  reason: contains not printable characters */
        void m۱۱۷۱۸b(T t);

        /* renamed from: c  reason: contains not printable characters */
        void m۱۱۷۱۹c(T t);
    }

    /* renamed from: android.support.design.widget.TabLayout$d  reason: invalid class name */
    public interface AbstractCd extends AbstractCc<Cg> {
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attrs) {
        this(context, attrs, p۰۰۰a.p۰۰۵b.p۰۰۸c.Cb.tabStyle);
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۹۷۲۳c = new ArrayList<>();
        this.f۹۷۲۵e = new RectF();
        this.f۹۷۴۰t = Integer.MAX_VALUE;
        this.f۹۷۱۳G = new ArrayList<>();
        this.f۹۷۲۲P = new Ck(12);
        setHorizontalScrollBarEnabled(false);
        this.f۹۷۲۶f = new Cf(context);
        super.addView(this.f۹۷۲۶f, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray a = android.support.design.internal.Cg.m۱۱۳۶۰c(context, attrs, p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout, defStyleAttr, p۰۰۰a.p۰۰۵b.p۰۰۸c.Cj.Widget_Design_TabLayout, p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabTextAppearance);
        this.f۹۷۲۶f.m۱۱۷۲۶b(a.getDimensionPixelSize(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabIndicatorHeight, -1));
        this.f۹۷۲۶f.m۱۱۷۲۲a(a.getColor(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabIndicatorColor, 0));
        setSelectedTabIndicator(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۴p.Ca.m۱۰۰۳۱b(context, a, p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(a.getInt(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(a.getBoolean(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = a.getDimensionPixelSize(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabPadding, 0);
        this.f۹۷۳۰j = dimensionPixelSize;
        this.f۹۷۲۹i = dimensionPixelSize;
        this.f۹۷۲۸h = dimensionPixelSize;
        this.f۹۷۲۷g = dimensionPixelSize;
        this.f۹۷۲۷g = a.getDimensionPixelSize(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabPaddingStart, this.f۹۷۲۷g);
        this.f۹۷۲۸h = a.getDimensionPixelSize(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabPaddingTop, this.f۹۷۲۸h);
        this.f۹۷۲۹i = a.getDimensionPixelSize(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabPaddingEnd, this.f۹۷۲۹i);
        this.f۹۷۳۰j = a.getDimensionPixelSize(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabPaddingBottom, this.f۹۷۳۰j);
        this.f۹۷۳۱k = a.getResourceId(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabTextAppearance, p۰۰۰a.p۰۰۵b.p۰۰۸c.Cj.TextAppearance_Design_Tab);
        TypedArray ta = context.obtainStyledAttributes(this.f۹۷۳۱k, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.TextAppearance);
        try {
            this.f۹۷۳۷q = (float) ta.getDimensionPixelSize(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.TextAppearance_android_textSize, 0);
            this.f۹۷۳۲l = p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۴p.Ca.m۱۰۰۳۰a(context, ta, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.TextAppearance_android_textColor);
            ta.recycle();
            if (a.hasValue(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabTextColor)) {
                this.f۹۷۳۲l = p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۴p.Ca.m۱۰۰۳۰a(context, a, p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabTextColor);
            }
            if (a.hasValue(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabSelectedTextColor)) {
                this.f۹۷۳۲l = m۱۱۶۷۸a(this.f۹۷۳۲l.getDefaultColor(), a.getColor(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabSelectedTextColor, 0));
            }
            this.f۹۷۳۳m = p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۴p.Ca.m۱۰۰۳۰a(context, a, p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabIconTint);
            this.f۹۷۳۶p = android.support.design.internal.Ch.m۱۱۳۶۲a(a.getInt(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabIconTintMode, -1), null);
            this.f۹۷۳۴n = p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۴p.Ca.m۱۰۰۳۰a(context, a, p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabRippleColor);
            this.f۹۷۴۶z = a.getInt(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabIndicatorAnimationDuration, 300);
            this.f۹۷۴۱u = a.getDimensionPixelSize(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabMinWidth, -1);
            this.f۹۷۴۲v = a.getDimensionPixelSize(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabMaxWidth, -1);
            this.f۹۷۳۹s = a.getResourceId(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabBackground, 0);
            this.f۹۷۴۴x = a.getDimensionPixelSize(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabContentStart, 0);
            this.f۹۷۰۸B = a.getInt(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabMode, 1);
            this.f۹۷۴۵y = a.getInt(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabGravity, 0);
            this.f۹۷۰۹C = a.getBoolean(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabInlineLabel, false);
            this.f۹۷۱۱E = a.getBoolean(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck.TabLayout_tabUnboundedRipple, false);
            a.recycle();
            Resources res = getResources();
            this.f۹۷۳۸r = (float) res.getDimensionPixelSize(Cd.design_tab_text_size_2line);
            this.f۹۷۴۳w = res.getDimensionPixelSize(Cd.design_tab_scrollable_min_width);
            m۱۱۶۸۹e();
        } catch (Throwable th) {
            ta.recycle();
            throw th;
        }
    }

    public void setSelectedTabIndicatorColor(int color) {
        this.f۹۷۲۶f.m۱۱۷۲۲a(color);
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int height) {
        this.f۹۷۲۶f.m۱۱۷۲۶b(height);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۶۹۸a(int position, float positionOffset, boolean updateSelectedText) {
        m۱۱۶۹۹a(position, positionOffset, updateSelectedText, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۶۹۹a(int position, float positionOffset, boolean updateSelectedText, boolean updateIndicatorPosition) {
        int roundedPosition = Math.round(((float) position) + positionOffset);
        if (roundedPosition >= 0 && roundedPosition < this.f۹۷۲۶f.getChildCount()) {
            if (updateIndicatorPosition) {
                this.f۹۷۲۶f.m۱۱۷۲۳a(position, positionOffset);
            }
            ValueAnimator valueAnimator = this.f۹۷۱۵I;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f۹۷۱۵I.cancel();
            }
            scrollTo(m۱۱۶۷۷a(position, positionOffset), 0);
            if (updateSelectedText) {
                setSelectedTabView(roundedPosition);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۷۰۱a(Cg tab) {
        m۱۱۷۰۳a(tab, this.f۹۷۲۳c.isEmpty());
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۷۰۳a(Cg tab, boolean setSelected) {
        m۱۱۷۰۲a(tab, this.f۹۷۲۳c.size(), setSelected);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۷۰۲a(Cg tab, int position, boolean setSelected) {
        if (tab.f۹۷۷۳f == this) {
            m۱۱۶۸۰a(tab, position);
            m۱۱۶۸۷d(tab);
            if (setSelected) {
                tab.m۱۱۷۴۲g();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۶۸۱a(Cv item) {
        Cg tab = m۱۱۷۰۷b();
        CharSequence charSequence = item.f۱۰۰۵۲c;
        if (charSequence != null) {
            tab.m۱۱۷۳۶b(charSequence);
        }
        Drawable drawable = item.f۱۰۰۵۳d;
        if (drawable != null) {
            tab.m۱۱۷۳۱a(drawable);
        }
        int i = item.f۱۰۰۵۴e;
        if (i != 0) {
            tab.m۱۱۷۳۰a(i);
        }
        if (!TextUtils.isEmpty(item.getContentDescription())) {
            tab.m۱۱۷۳۳a(item.getContentDescription());
        }
        m۱۱۷۰۱a(tab);
    }

    @Deprecated
    public void setOnTabSelectedListener(AbstractCc listener) {
        AbstractCc cVar = this.f۹۷۱۲F;
        if (cVar != null) {
            m۱۱۷۰۹b(cVar);
        }
        this.f۹۷۱۲F = listener;
        if (listener != null) {
            m۱۱۷۰۰a(listener);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۷۰۰a(AbstractCc listener) {
        if (!this.f۹۷۱۳G.contains(listener)) {
            this.f۹۷۱۳G.add(listener);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۷۰۹b(AbstractCc listener) {
        this.f۹۷۱۳G.remove(listener);
    }

    /* renamed from: b  reason: contains not printable characters */
    public Cg m۱۱۷۰۷b() {
        Cg tab = m۱۱۶۹۷a();
        tab.f۹۷۷۳f = this;
        tab.f۹۷۷۴g = m۱۱۶۸۸e(tab);
        return tab;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public Cg m۱۱۶۹۷a() {
        Cg tab = f۹۷۰۶Q.m۱۰۶۳۴a();
        if (tab == null) {
            return new Cg();
        }
        return tab;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۱۷۱۱b(Cg tab) {
        return f۹۷۰۶Q.m۱۰۶۳۵a(tab);
    }

    public int getTabCount() {
        return this.f۹۷۲۳c.size();
    }

    /* renamed from: b  reason: contains not printable characters */
    public Cg m۱۱۷۰۸b(int index) {
        if (index < 0 || index >= getTabCount()) {
            return null;
        }
        return this.f۹۷۲۳c.get(index);
    }

    public int getSelectedTabPosition() {
        Cg gVar = this.f۹۷۲۴d;
        if (gVar != null) {
            return gVar.m۱۱۷۳۸c();
        }
        return -1;
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۱۷۱۴d() {
        for (int i = this.f۹۷۲۶f.getChildCount() - 1; i >= 0; i--) {
            m۱۱۶۸۶d(i);
        }
        Iterator<Tab> i2 = this.f۹۷۲۳c.iterator();
        while (i2.hasNext()) {
            Cg tab = (Cg) i2.next();
            i2.remove();
            tab.m۱۱۷۴۱f();
            m۱۱۷۱۱b(tab);
        }
        this.f۹۷۲۴d = null;
    }

    public void setTabMode(int mode) {
        if (mode != this.f۹۷۰۸B) {
            this.f۹۷۰۸B = mode;
            m۱۱۶۸۹e();
        }
    }

    public int getTabMode() {
        return this.f۹۷۰۸B;
    }

    public void setTabGravity(int gravity) {
        if (this.f۹۷۴۵y != gravity) {
            this.f۹۷۴۵y = gravity;
            m۱۱۶۸۹e();
        }
    }

    public int getTabGravity() {
        return this.f۹۷۴۵y;
    }

    public void setSelectedTabIndicatorGravity(int indicatorGravity) {
        if (this.f۹۷۰۷A != indicatorGravity) {
            this.f۹۷۰۷A = indicatorGravity;
            Cu.m۱۲۹۷۰B(this.f۹۷۲۶f);
        }
    }

    public int getTabIndicatorGravity() {
        return this.f۹۷۰۷A;
    }

    public void setTabIndicatorFullWidth(boolean tabIndicatorFullWidth) {
        this.f۹۷۱۰D = tabIndicatorFullWidth;
        Cu.m۱۲۹۷۰B(this.f۹۷۲۶f);
    }

    public void setInlineLabel(boolean inline) {
        if (this.f۹۷۰۹C != inline) {
            this.f۹۷۰۹C = inline;
            for (int i = 0; i < this.f۹۷۲۶f.getChildCount(); i++) {
                View child = this.f۹۷۲۶f.getChildAt(i);
                if (child instanceof Ci) {
                    ((Ci) child).m۱۱۷۵۹c();
                }
            }
            m۱۱۶۸۹e();
        }
    }

    public void setInlineLabelResource(int inlineResourceId) {
        setInlineLabel(getResources().getBoolean(inlineResourceId));
    }

    public void setUnboundedRipple(boolean unboundedRipple) {
        if (this.f۹۷۱۱E != unboundedRipple) {
            this.f۹۷۱۱E = unboundedRipple;
            for (int i = 0; i < this.f۹۷۲۶f.getChildCount(); i++) {
                View child = this.f۹۷۲۶f.getChildAt(i);
                if (child instanceof Ci) {
                    ((Ci) child).m۱۱۷۵۰a((Ci) getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int unboundedRippleResourceId) {
        setUnboundedRipple(getResources().getBoolean(unboundedRippleResourceId));
    }

    public void setTabTextColors(ColorStateList textColor) {
        if (this.f۹۷۳۲l != textColor) {
            this.f۹۷۳۲l = textColor;
            m۱۱۶۹۴h();
        }
    }

    public ColorStateList getTabTextColors() {
        return this.f۹۷۳۲l;
    }

    public void setTabIconTint(ColorStateList iconTint) {
        if (this.f۹۷۳۳m != iconTint) {
            this.f۹۷۳۳m = iconTint;
            m۱۱۶۹۴h();
        }
    }

    public void setTabIconTintResource(int iconTintResourceId) {
        setTabIconTint(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۲b(getContext(), iconTintResourceId));
    }

    public ColorStateList getTabIconTint() {
        return this.f۹۷۳۳m;
    }

    public ColorStateList getTabRippleColor() {
        return this.f۹۷۳۴n;
    }

    public void setTabRippleColor(ColorStateList color) {
        if (this.f۹۷۳۴n != color) {
            this.f۹۷۳۴n = color;
            for (int i = 0; i < this.f۹۷۲۶f.getChildCount(); i++) {
                View child = this.f۹۷۲۶f.getChildAt(i);
                if (child instanceof Ci) {
                    ((Ci) child).m۱۱۷۵۰a((Ci) getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int tabRippleColorResourceId) {
        setTabRippleColor(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۲b(getContext(), tabRippleColorResourceId));
    }

    public Drawable getTabSelectedIndicator() {
        return this.f۹۷۳۵o;
    }

    public void setSelectedTabIndicator(Drawable tabSelectedIndicator) {
        if (this.f۹۷۳۵o != tabSelectedIndicator) {
            this.f۹۷۳۵o = tabSelectedIndicator;
            Cu.m۱۲۹۷۰B(this.f۹۷۲۶f);
        }
    }

    public void setSelectedTabIndicator(int tabSelectedIndicatorResourceId) {
        if (tabSelectedIndicatorResourceId != 0) {
            setSelectedTabIndicator(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۳c(getContext(), tabSelectedIndicatorResourceId));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m۱۱۷۰۴a(viewPager, true);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۷۰۴a(ViewPager viewPager, boolean autoRefresh) {
        m۱۱۶۸۲a(viewPager, autoRefresh, false);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۶۸۲a(ViewPager viewPager, boolean autoRefresh, boolean implicitSetup) {
        ViewPager viewPager2 = this.f۹۷۱۶J;
        if (viewPager2 != null) {
            Ch hVar = this.f۹۷۱۹M;
            if (hVar != null) {
                viewPager2.m۱۲۷۷۴b(hVar);
            }
            Cb bVar = this.f۹۷۲۰N;
            if (bVar != null) {
                this.f۹۷۱۶J.m۱۲۷۷۳b(bVar);
            }
        }
        AbstractCc cVar = this.f۹۷۱۴H;
        if (cVar != null) {
            m۱۱۷۰۹b(cVar);
            this.f۹۷۱۴H = null;
        }
        if (viewPager != null) {
            this.f۹۷۱۶J = viewPager;
            if (this.f۹۷۱۹M == null) {
                this.f۹۷۱۹M = new Ch(this);
            }
            this.f۹۷۱۹M.m۱۱۷۴۴a();
            viewPager.m۱۲۷۶۶a(this.f۹۷۱۹M);
            this.f۹۷۱۴H = new Cj(viewPager);
            m۱۱۷۰۰a(this.f۹۷۱۴H);
            AbstractCq adapter = viewPager.getAdapter();
            if (adapter != null) {
                m۱۱۷۰۵a(adapter, autoRefresh);
            }
            if (this.f۹۷۲۰N == null) {
                this.f۹۷۲۰N = new Cb();
            }
            this.f۹۷۲۰N.m۱۱۷۱۶a(autoRefresh);
            viewPager.m۱۲۷۶۵a(this.f۹۷۲۰N);
            m۱۱۶۹۸a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f۹۷۱۶J = null;
            m۱۱۷۰۵a((AbstractCq) null, false);
        }
        this.f۹۷۲۱O = implicitSetup;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractCq adapter) {
        m۱۱۷۰۵a(adapter, false);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f۹۷۱۶J == null) {
            ViewParent vp = getParent();
            if (vp instanceof ViewPager) {
                m۱۱۶۸۲a((ViewPager) vp, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f۹۷۲۱O) {
            setupWithViewPager(null);
            this.f۹۷۲۱O = false;
        }
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f۹۷۲۶f.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۷۰۵a(AbstractCq adapter, boolean addObserver) {
        DataSetObserver dataSetObserver;
        AbstractCq qVar = this.f۹۷۱۷K;
        if (!(qVar == null || (dataSetObserver = this.f۹۷۱۸L) == null)) {
            qVar.m۱۲۹۶۶c(dataSetObserver);
        }
        this.f۹۷۱۷K = adapter;
        if (addObserver && adapter != null) {
            if (this.f۹۷۱۸L == null) {
                this.f۹۷۱۸L = new Ce();
            }
            adapter.m۱۲۹۵۵a(this.f۹۷۱۸L);
        }
        m۱۱۷۱۲c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۱۷۱۲c() {
        int curItem;
        m۱۱۷۱۴d();
        AbstractCq qVar = this.f۹۷۱۷K;
        if (qVar != null) {
            int adapterCount = qVar.m۱۲۹۵۱a();
            for (int i = 0; i < adapterCount; i++) {
                Cg b = m۱۱۷۰۷b();
                b.m۱۱۷۳۶b(this.f۹۷۱۷K.m۱۲۹۵۳a(i));
                m۱۱۷۰۳a(b, false);
            }
            ViewPager viewPager = this.f۹۷۱۶J;
            if (viewPager != null && adapterCount > 0 && (curItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && curItem < getTabCount()) {
                m۱۱۷۱۳c(m۱۱۷۰۸b(curItem));
            }
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    private void m۱۱۶۹۴h() {
        int z = this.f۹۷۲۳c.size();
        for (int i = 0; i < z; i++) {
            this.f۹۷۲۳c.get(i).m۱۱۷۴۳h();
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private Ci m۱۱۶۸۸e(Cg tab) {
        AbstractCj<Ci> jVar = this.f۹۷۲۲P;
        Ci tabView = jVar != null ? jVar.m۱۰۶۳۴a() : null;
        if (tabView == null) {
            tabView = new Ci(getContext());
        }
        tabView.m۱۱۷۵۷a(tab);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(tab.f۹۷۷۰c)) {
            tabView.setContentDescription(tab.f۹۷۶۹b);
        } else {
            tabView.setContentDescription(tab.f۹۷۷۰c);
        }
        return tabView;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۶۸۰a(Cg tab, int position) {
        tab.m۱۱۷۳۷b(position);
        this.f۹۷۲۳c.add(position, tab);
        int count = this.f۹۷۲۳c.size();
        for (int i = position + 1; i < count; i++) {
            this.f۹۷۲۳c.get(i).m۱۱۷۳۷b(i);
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۱۶۸۷d(Cg tab) {
        this.f۹۷۲۶f.addView(tab.f۹۷۷۴g, tab.m۱۱۷۳۸c(), m۱۱۶۹۰f());
    }

    public void addView(View child) {
        m۱۱۶۸۳a(child);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View child, int index) {
        m۱۱۶۸۳a(child);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View child, ViewGroup.LayoutParams params) {
        m۱۱۶۸۳a(child);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        m۱۱۶۸۳a(child);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۶۸۳a(View child) {
        if (child instanceof Cv) {
            m۱۱۶۸۱a((Cv) child);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: f  reason: contains not printable characters */
    private LinearLayout.LayoutParams m۱۱۶۹۰f() {
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-2, -1);
        m۱۱۶۸۴a(lp);
        return lp;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۶۸۴a(LinearLayout.LayoutParams lp) {
        if (this.f۹۷۰۸B == 1 && this.f۹۷۴۵y == 0) {
            lp.width = 0;
            lp.weight = 1.0f;
            return;
        }
        lp.width = -2;
        lp.weight = 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۱۶۹۶a(int dps) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) dps));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f۹۷۲۶f.getChildCount(); i++) {
            View tabView = this.f۹۷۲۶f.getChildAt(i);
            if (tabView instanceof Ci) {
                ((Ci) tabView).m۱۱۷۵۱a((Ci) canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int idealHeight = m۱۱۶۹۶a(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(idealHeight, View.MeasureSpec.getSize(heightMeasureSpec)), 1073741824);
        } else if (mode == 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(idealHeight, 1073741824);
        }
        int specWidth = View.MeasureSpec.getSize(widthMeasureSpec);
        if (View.MeasureSpec.getMode(widthMeasureSpec) != 0) {
            int i = this.f۹۷۴۲v;
            if (i <= 0) {
                i = specWidth - m۱۱۶۹۶a(56);
            }
            this.f۹۷۴۰t = i;
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (getChildCount() == 1) {
            boolean z = false;
            View child = getChildAt(0);
            boolean remeasure = false;
            int i2 = this.f۹۷۰۸B;
            if (i2 == 0) {
                if (child.getMeasuredWidth() < getMeasuredWidth()) {
                    z = true;
                }
                remeasure = z;
            } else if (i2 == 1) {
                if (child.getMeasuredWidth() != getMeasuredWidth()) {
                    z = true;
                }
                remeasure = z;
            }
            if (remeasure) {
                child.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(heightMeasureSpec, getPaddingTop() + getPaddingBottom(), child.getLayoutParams().height));
            }
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۱۶۸۶d(int position) {
        Ci view = (Ci) this.f۹۷۲۶f.getChildAt(position);
        this.f۹۷۲۶f.removeViewAt(position);
        if (view != null) {
            view.m۱۱۷۵۶a();
            this.f۹۷۲۲P.m۱۰۶۳۵a(view);
        }
        requestLayout();
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۱۶۸۵c(int newPosition) {
        if (newPosition != -1) {
            if (getWindowToken() == null || !Cu.m۱۳۰۲۸y(this) || this.f۹۷۲۶f.m۱۱۷۲۵a()) {
                m۱۱۶۹۸a(newPosition, 0.0f, true);
                return;
            }
            int startScrollX = getScrollX();
            int targetScrollX = m۱۱۶۷۷a(newPosition, 0.0f);
            if (startScrollX != targetScrollX) {
                m۱۱۶۹۲g();
                this.f۹۷۱۵I.setIntValues(startScrollX, targetScrollX);
                this.f۹۷۱۵I.start();
            }
            this.f۹۷۲۶f.m۱۱۷۲۴a(newPosition, this.f۹۷۴۶z);
        }
    }

    /* renamed from: g  reason: contains not printable characters */
    private void m۱۱۶۹۲g() {
        if (this.f۹۷۱۵I == null) {
            this.f۹۷۱۵I = new ValueAnimator();
            this.f۹۷۱۵I.setInterpolator(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ca.f۸۲۵۲b);
            this.f۹۷۱۵I.setDuration((long) this.f۹۷۴۶z);
            this.f۹۷۱۵I.addUpdateListener(new Ca());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.widget.TabLayout$a  reason: invalid class name */
    public class Ca implements ValueAnimator.AnimatorUpdateListener {
        Ca() {
        }

        public void onAnimationUpdate(ValueAnimator animator) {
            TabLayout.this.scrollTo(((Integer) animator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener listener) {
        m۱۱۶۹۲g();
        this.f۹۷۱۵I.addListener(listener);
    }

    private void setSelectedTabView(int position) {
        int tabCount = this.f۹۷۲۶f.getChildCount();
        if (position < tabCount) {
            int i = 0;
            while (i < tabCount) {
                View child = this.f۹۷۲۶f.getChildAt(i);
                boolean z = false;
                child.setSelected(i == position);
                if (i == position) {
                    z = true;
                }
                child.setActivated(z);
                i++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۱۷۱۳c(Cg tab) {
        m۱۱۷۱۰b(tab, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۷۱۰b(Cg tab, boolean updateIndicator) {
        Cg currentTab = this.f۹۷۲۴d;
        if (currentTab != tab) {
            int newPosition = tab != null ? tab.m۱۱۷۳۸c() : -1;
            if (updateIndicator) {
                if ((currentTab == null || currentTab.m۱۱۷۳۸c() == -1) && newPosition != -1) {
                    m۱۱۶۹۸a(newPosition, 0.0f, true);
                } else {
                    m۱۱۶۸۵c(newPosition);
                }
                if (newPosition != -1) {
                    setSelectedTabView(newPosition);
                }
            }
            this.f۹۷۲۴d = tab;
            if (currentTab != null) {
                m۱۱۶۹۵h(currentTab);
            }
            if (tab != null) {
                m۱۱۶۹۳g(tab);
            }
        } else if (currentTab != null) {
            m۱۱۶۹۱f(tab);
            m۱۱۶۸۵c(tab.m۱۱۷۳۸c());
        }
    }

    /* renamed from: g  reason: contains not printable characters */
    private void m۱۱۶۹۳g(Cg tab) {
        for (int i = this.f۹۷۱۳G.size() - 1; i >= 0; i--) {
            this.f۹۷۱۳G.get(i).m۱۱۷۱۷a(tab);
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    private void m۱۱۶۹۵h(Cg tab) {
        for (int i = this.f۹۷۱۳G.size() - 1; i >= 0; i--) {
            this.f۹۷۱۳G.get(i).m۱۱۷۱۹c(tab);
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۱۶۹۱f(Cg tab) {
        for (int i = this.f۹۷۱۳G.size() - 1; i >= 0; i--) {
            this.f۹۷۱۳G.get(i).m۱۱۷۱۸b(tab);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۱۶۷۷a(int position, float positionOffset) {
        int nextWidth = 0;
        if (this.f۹۷۰۸B != 0) {
            return 0;
        }
        View selectedChild = this.f۹۷۲۶f.getChildAt(position);
        View nextChild = position + 1 < this.f۹۷۲۶f.getChildCount() ? this.f۹۷۲۶f.getChildAt(position + 1) : null;
        int selectedWidth = selectedChild != null ? selectedChild.getWidth() : 0;
        if (nextChild != null) {
            nextWidth = nextChild.getWidth();
        }
        int scrollBase = (selectedChild.getLeft() + (selectedWidth / 2)) - (getWidth() / 2);
        int scrollOffset = (int) (((float) (selectedWidth + nextWidth)) * 0.5f * positionOffset);
        return Cu.m۱۳۰۱۴k(this) == 0 ? scrollBase + scrollOffset : scrollBase - scrollOffset;
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۱۶۸۹e() {
        int paddingStart = 0;
        if (this.f۹۷۰۸B == 0) {
            paddingStart = Math.max(0, this.f۹۷۴۴x - this.f۹۷۲۷g);
        }
        Cu.m۱۲۹۸۰a(this.f۹۷۲۶f, paddingStart, 0, 0, 0);
        int i = this.f۹۷۰۸B;
        if (i == 0) {
            this.f۹۷۲۶f.setGravity(8388611);
        } else if (i == 1) {
            this.f۹۷۲۶f.setGravity(1);
        }
        m۱۱۷۰۶a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۷۰۶a(boolean requestLayout) {
        for (int i = 0; i < this.f۹۷۲۶f.getChildCount(); i++) {
            View child = this.f۹۷۲۶f.getChildAt(i);
            child.setMinimumWidth(getTabMinWidth());
            m۱۱۶۸۴a((LinearLayout.LayoutParams) child.getLayoutParams());
            if (requestLayout) {
                child.requestLayout();
            }
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$g  reason: invalid class name */
    public static class Cg {

        /* renamed from: a  reason: contains not printable characters */
        private Drawable f۹۷۶۸a;

        /* renamed from: b  reason: contains not printable characters */
        private CharSequence f۹۷۶۹b;

        /* renamed from: c  reason: contains not printable characters */
        private CharSequence f۹۷۷۰c;

        /* renamed from: d  reason: contains not printable characters */
        private int f۹۷۷۱d = -1;

        /* renamed from: e  reason: contains not printable characters */
        private View f۹۷۷۲e;

        /* renamed from: f  reason: contains not printable characters */
        public TabLayout f۹۷۷۳f;

        /* renamed from: g  reason: contains not printable characters */
        public Ci f۹۷۷۴g;

        /* renamed from: a  reason: contains not printable characters */
        public View m۱۱۷۳۴a() {
            return this.f۹۷۷۲e;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cg m۱۱۷۳۲a(View view) {
            this.f۹۷۷۲e = view;
            m۱۱۷۴۳h();
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cg m۱۱۷۳۰a(int resId) {
            m۱۱۷۳۲a(LayoutInflater.from(this.f۹۷۷۴g.getContext()).inflate(resId, (ViewGroup) this.f۹۷۷۴g, false));
            return this;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Drawable m۱۱۷۳۵b() {
            return this.f۹۷۶۸a;
        }

        /* renamed from: c  reason: contains not printable characters */
        public int m۱۱۷۳۸c() {
            return this.f۹۷۷۱d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۱۷۳۷b(int position) {
            this.f۹۷۷۱d = position;
        }

        /* renamed from: d  reason: contains not printable characters */
        public CharSequence m۱۱۷۳۹d() {
            return this.f۹۷۶۹b;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cg m۱۱۷۳۱a(Drawable icon) {
            this.f۹۷۶۸a = icon;
            m۱۱۷۴۳h();
            return this;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Cg m۱۱۷۳۶b(CharSequence text) {
            if (TextUtils.isEmpty(this.f۹۷۷۰c) && !TextUtils.isEmpty(text)) {
                this.f۹۷۷۴g.setContentDescription(text);
            }
            this.f۹۷۶۹b = text;
            m۱۱۷۴۳h();
            return this;
        }

        /* renamed from: g  reason: contains not printable characters */
        public void m۱۱۷۴۲g() {
            TabLayout tabLayout = this.f۹۷۷۳f;
            if (tabLayout != null) {
                tabLayout.m۱۱۷۱۳c(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: e  reason: contains not printable characters */
        public boolean m۱۱۷۴۰e() {
            TabLayout tabLayout = this.f۹۷۷۳f;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f۹۷۷۱d;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cg m۱۱۷۳۳a(CharSequence contentDesc) {
            this.f۹۷۷۰c = contentDesc;
            m۱۱۷۴۳h();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h  reason: contains not printable characters */
        public void m۱۱۷۴۳h() {
            Ci iVar = this.f۹۷۷۴g;
            if (iVar != null) {
                iVar.m۱۱۷۵۸b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f  reason: contains not printable characters */
        public void m۱۱۷۴۱f() {
            this.f۹۷۷۳f = null;
            this.f۹۷۷۴g = null;
            this.f۹۷۶۸a = null;
            this.f۹۷۶۹b = null;
            this.f۹۷۷۰c = null;
            this.f۹۷۷۱d = -1;
            this.f۹۷۷۲e = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.widget.TabLayout$i  reason: invalid class name */
    public class Ci extends LinearLayout {

        /* renamed from: c  reason: contains not printable characters */
        private Cg f۹۷۷۸c;

        /* renamed from: d  reason: contains not printable characters */
        private TextView f۹۷۷۹d;

        /* renamed from: e  reason: contains not printable characters */
        private ImageView f۹۷۸۰e;

        /* renamed from: f  reason: contains not printable characters */
        private View f۹۷۸۱f;

        /* renamed from: g  reason: contains not printable characters */
        private TextView f۹۷۸۲g;

        /* renamed from: h  reason: contains not printable characters */
        private ImageView f۹۷۸۳h;

        /* renamed from: i  reason: contains not printable characters */
        private Drawable f۹۷۸۴i;

        /* renamed from: j  reason: contains not printable characters */
        private int f۹۷۸۵j = 2;

        public Ci(Context context) {
            super(context);
            m۱۱۷۵۰a(context);
            Cu.m۱۲۹۸۰a(this, TabLayout.this.f۹۷۲۷g, TabLayout.this.f۹۷۲۸h, TabLayout.this.f۹۷۲۹i, TabLayout.this.f۹۷۳۰j);
            setGravity(17);
            setOrientation(!TabLayout.this.f۹۷۰۹C ? 1 : 0);
            setClickable(true);
            Cu.m۱۲۹۸۸a(this, Cr.m۱۲۹۶۷a(getContext(), 1002));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a  reason: contains not printable characters */
        private void m۱۱۷۵۰a(Context context) {
            Drawable background;
            int i = TabLayout.this.f۹۷۳۹s;
            GradientDrawable gradientDrawable = null;
            if (i != 0) {
                this.f۹۷۸۴i = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۳c(context, i);
                Drawable drawable = this.f۹۷۸۴i;
                if (drawable != null && drawable.isStateful()) {
                    this.f۹۷۸۴i.setState(getDrawableState());
                }
            } else {
                this.f۹۷۸۴i = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (TabLayout.this.f۹۷۳۴n != null) {
                GradientDrawable maskDrawable = new GradientDrawable();
                maskDrawable.setCornerRadius(1.0E-5f);
                maskDrawable.setColor(-1);
                ColorStateList rippleColor = p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۵q.Ca.m۱۰۰۳۴a(TabLayout.this.f۹۷۳۴n);
                if (Build.VERSION.SDK_INT >= 21) {
                    GradientDrawable gradientDrawable3 = TabLayout.this.f۹۷۱۱E ? null : gradientDrawable2;
                    if (!TabLayout.this.f۹۷۱۱E) {
                        gradientDrawable = maskDrawable;
                    }
                    background = new RippleDrawable(rippleColor, gradientDrawable3, gradientDrawable);
                } else {
                    Drawable rippleDrawable = android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۲۲h(maskDrawable);
                    android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(rippleDrawable, rippleColor);
                    background = new LayerDrawable(new Drawable[]{gradientDrawable2, rippleDrawable});
                }
            } else {
                background = gradientDrawable2;
            }
            Cu.m۱۲۹۸۴a(this, background);
            TabLayout.this.invalidate();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a  reason: contains not printable characters */
        private void m۱۱۷۵۱a(Canvas canvas) {
            Drawable drawable = this.f۹۷۸۴i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f۹۷۸۴i.draw(canvas);
            }
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            boolean changed = false;
            int[] state = getDrawableState();
            Drawable drawable = this.f۹۷۸۴i;
            if (drawable != null && drawable.isStateful()) {
                changed = false | this.f۹۷۸۴i.setState(state);
            }
            if (changed) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public boolean performClick() {
            boolean handled = super.performClick();
            if (this.f۹۷۷۸c == null) {
                return handled;
            }
            if (!handled) {
                playSoundEffect(0);
            }
            this.f۹۷۷۸c.m۱۱۷۴۲g();
            return true;
        }

        public void setSelected(boolean selected) {
            boolean changed = isSelected() != selected;
            super.setSelected(selected);
            if (changed && selected && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f۹۷۷۹d;
            if (textView != null) {
                textView.setSelected(selected);
            }
            ImageView imageView = this.f۹۷۸۰e;
            if (imageView != null) {
                imageView.setSelected(selected);
            }
            View view = this.f۹۷۸۱f;
            if (view != null) {
                view.setSelected(selected);
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
            super.onInitializeAccessibilityEvent(event);
            event.setClassName(AbstractCa.AbstractCc.class.getName());
        }

        @TargetApi(14)
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info2) {
            super.onInitializeAccessibilityNodeInfo(info2);
            info2.setClassName(AbstractCa.AbstractCc.class.getName());
        }

        public void onMeasure(int origWidthMeasureSpec, int origHeightMeasureSpec) {
            int widthMeasureSpec;
            Layout layout;
            int specWidthSize = View.MeasureSpec.getSize(origWidthMeasureSpec);
            int specWidthMode = View.MeasureSpec.getMode(origWidthMeasureSpec);
            int maxWidth = TabLayout.this.getTabMaxWidth();
            if (maxWidth <= 0 || (specWidthMode != 0 && specWidthSize <= maxWidth)) {
                widthMeasureSpec = origWidthMeasureSpec;
            } else {
                widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f۹۷۴۰t, Integer.MIN_VALUE);
            }
            super.onMeasure(widthMeasureSpec, origHeightMeasureSpec);
            if (this.f۹۷۷۹d != null) {
                float textSize = TabLayout.this.f۹۷۳۷q;
                int maxLines = this.f۹۷۸۵j;
                ImageView imageView = this.f۹۷۸۰e;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f۹۷۷۹d;
                    if (textView != null && textView.getLineCount() > 1) {
                        textSize = TabLayout.this.f۹۷۳۸r;
                    }
                } else {
                    maxLines = 1;
                }
                float curTextSize = this.f۹۷۷۹d.getTextSize();
                int curLineCount = this.f۹۷۷۹d.getLineCount();
                int curMaxLines = Cp.m۱۳۳۱۱d(this.f۹۷۷۹d);
                if (textSize != curTextSize || (curMaxLines >= 0 && maxLines != curMaxLines)) {
                    boolean updateTextView = true;
                    if (TabLayout.this.f۹۷۰۸B == 1 && textSize > curTextSize && curLineCount == 1 && ((layout = this.f۹۷۷۹d.getLayout()) == null || m۱۱۷۴۸a(layout, 0, textSize) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        updateTextView = false;
                    }
                    if (updateTextView) {
                        this.f۹۷۷۹d.setTextSize(0, textSize);
                        this.f۹۷۷۹d.setMaxLines(maxLines);
                        super.onMeasure(widthMeasureSpec, origHeightMeasureSpec);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۷۵۷a(Cg tab) {
            if (tab != this.f۹۷۷۸c) {
                this.f۹۷۷۸c = tab;
                m۱۱۷۵۸b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۷۵۶a() {
            m۱۱۷۵۷a((Cg) null);
            setSelected(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public final void m۱۱۷۵۸b() {
            Cg tab = this.f۹۷۷۸c;
            Drawable icon = null;
            View custom = tab != null ? tab.m۱۱۷۳۴a() : null;
            if (custom != null) {
                ViewParent customParent = custom.getParent();
                if (customParent != this) {
                    if (customParent != null) {
                        ((ViewGroup) customParent).removeView(custom);
                    }
                    addView(custom);
                }
                this.f۹۷۸۱f = custom;
                TextView textView = this.f۹۷۷۹d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f۹۷۸۰e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f۹۷۸۰e.setImageDrawable(null);
                }
                this.f۹۷۸۲g = (TextView) custom.findViewById(16908308);
                TextView textView2 = this.f۹۷۸۲g;
                if (textView2 != null) {
                    this.f۹۷۸۵j = Cp.m۱۳۳۱۱d(textView2);
                }
                this.f۹۷۸۳h = (ImageView) custom.findViewById(16908294);
            } else {
                View view = this.f۹۷۸۱f;
                if (view != null) {
                    removeView(view);
                    this.f۹۷۸۱f = null;
                }
                this.f۹۷۸۲g = null;
                this.f۹۷۸۳h = null;
            }
            boolean z = false;
            if (this.f۹۷۸۱f == null) {
                if (this.f۹۷۸۰e == null) {
                    ImageView iconView = (ImageView) LayoutInflater.from(getContext()).inflate(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ch.design_layout_tab_icon, (ViewGroup) this, false);
                    addView(iconView, 0);
                    this.f۹۷۸۰e = iconView;
                }
                if (!(tab == null || tab.m۱۱۷۳۵b() == null)) {
                    icon = android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۲۲h(tab.m۱۱۷۳۵b()).mutate();
                }
                if (icon != null) {
                    android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(icon, TabLayout.this.f۹۷۳۳m);
                    PorterDuff.Mode mode = TabLayout.this.f۹۷۳۶p;
                    if (mode != null) {
                        android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۱a(icon, mode);
                    }
                }
                if (this.f۹۷۷۹d == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ch.design_layout_tab_text, (ViewGroup) this, false);
                    addView(textView3);
                    this.f۹۷۷۹d = textView3;
                    this.f۹۷۸۵j = Cp.m۱۳۳۱۱d(this.f۹۷۷۹d);
                }
                Cp.m۱۳۳۱۲d(this.f۹۷۷۹d, TabLayout.this.f۹۷۳۱k);
                ColorStateList colorStateList = TabLayout.this.f۹۷۳۲l;
                if (colorStateList != null) {
                    this.f۹۷۷۹d.setTextColor(colorStateList);
                }
                m۱۱۷۵۴a(this.f۹۷۷۹d, this.f۹۷۸۰e);
            } else if (!(this.f۹۷۸۲g == null && this.f۹۷۸۳h == null)) {
                m۱۱۷۵۴a(this.f۹۷۸۲g, this.f۹۷۸۳h);
            }
            if (tab != null && !TextUtils.isEmpty(tab.f۹۷۷۰c)) {
                setContentDescription(tab.f۹۷۷۰c);
            }
            if (tab != null && tab.m۱۱۷۴۰e()) {
                z = true;
            }
            setSelected(z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public final void m۱۱۷۵۹c() {
            setOrientation(!TabLayout.this.f۹۷۰۹C ? 1 : 0);
            if (this.f۹۷۸۲g == null && this.f۹۷۸۳h == null) {
                m۱۱۷۵۴a(this.f۹۷۷۹d, this.f۹۷۸۰e);
            } else {
                m۱۱۷۵۴a(this.f۹۷۸۲g, this.f۹۷۸۳h);
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۱۷۵۴a(TextView textView, ImageView iconView) {
            Cg gVar = this.f۹۷۷۸c;
            CharSequence charSequence = null;
            Drawable icon = (gVar == null || gVar.m۱۱۷۳۵b() == null) ? null : android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۲۲h(this.f۹۷۷۸c.m۱۱۷۳۵b()).mutate();
            Cg gVar2 = this.f۹۷۷۸c;
            CharSequence text = gVar2 != null ? gVar2.m۱۱۷۳۹d() : null;
            if (iconView != null) {
                if (icon != null) {
                    iconView.setImageDrawable(icon);
                    iconView.setVisibility(0);
                    setVisibility(0);
                } else {
                    iconView.setVisibility(8);
                    iconView.setImageDrawable(null);
                }
            }
            boolean hasText = !TextUtils.isEmpty(text);
            if (textView != null) {
                if (hasText) {
                    textView.setText(text);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (iconView != null) {
                ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) iconView.getLayoutParams();
                int iconMargin = 0;
                if (hasText && iconView.getVisibility() == 0) {
                    iconMargin = TabLayout.this.m۱۱۶۹۶a(8);
                }
                if (TabLayout.this.f۹۷۰۹C) {
                    if (iconMargin != android.support.p۰۴۳v4.view.Cg.m۱۲۹۱۳a(lp)) {
                        android.support.p۰۴۳v4.view.Cg.m۱۲۹۱۴a(lp, iconMargin);
                        lp.bottomMargin = 0;
                        iconView.setLayoutParams(lp);
                        iconView.requestLayout();
                    }
                } else if (iconMargin != lp.bottomMargin) {
                    lp.bottomMargin = iconMargin;
                    android.support.p۰۴۳v4.view.Cg.m۱۲۹۱۴a(lp, 0);
                    iconView.setLayoutParams(lp);
                    iconView.requestLayout();
                }
            }
            Cg gVar3 = this.f۹۷۷۸c;
            CharSequence contentDesc = gVar3 != null ? gVar3.f۹۷۷۰c : null;
            if (!hasText) {
                charSequence = contentDesc;
            }
            Cl1.m۱۵۴۱۷a(this, charSequence);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: d  reason: contains not printable characters */
        private int m۱۱۷۵۵d() {
            boolean initialized = false;
            int left = 0;
            int right = 0;
            View[] viewArr = {this.f۹۷۷۹d, this.f۹۷۸۰e, this.f۹۷۸۱f};
            for (View view : viewArr) {
                if (view != null && view.getVisibility() == 0) {
                    int left2 = view.getLeft();
                    if (initialized) {
                        left2 = Math.min(left, left2);
                    }
                    left = left2;
                    int right2 = view.getRight();
                    if (initialized) {
                        right2 = Math.max(right, right2);
                    }
                    right = right2;
                    initialized = true;
                }
            }
            return right - left;
        }

        /* renamed from: a  reason: contains not printable characters */
        private float m۱۱۷۴۸a(Layout layout, int line, float textSize) {
            return layout.getLineWidth(line) * (textSize / layout.getPaint().getTextSize());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.design.widget.TabLayout$f  reason: invalid class name */
    public class Cf extends LinearLayout {

        /* renamed from: c  reason: contains not printable characters */
        private int f۹۷۵۱c;

        /* renamed from: d  reason: contains not printable characters */
        private final Paint f۹۷۵۲d;

        /* renamed from: e  reason: contains not printable characters */
        private final GradientDrawable f۹۷۵۳e;

        /* renamed from: f  reason: contains not printable characters */
        int f۹۷۵۴f = -1;

        /* renamed from: g  reason: contains not printable characters */
        float f۹۷۵۵g;

        /* renamed from: h  reason: contains not printable characters */
        private int f۹۷۵۶h = -1;

        /* renamed from: i  reason: contains not printable characters */
        private int f۹۷۵۷i = -1;

        /* renamed from: j  reason: contains not printable characters */
        private int f۹۷۵۸j = -1;

        /* renamed from: k  reason: contains not printable characters */
        private ValueAnimator f۹۷۵۹k;

        Cf(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f۹۷۵۲d = new Paint();
            this.f۹۷۵۳e = new GradientDrawable();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۷۲۲a(int color) {
            if (this.f۹۷۵۲d.getColor() != color) {
                this.f۹۷۵۲d.setColor(color);
                Cu.m۱۲۹۷۰B(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۱۷۲۶b(int height) {
            if (this.f۹۷۵۱c != height) {
                this.f۹۷۵۱c = height;
                Cu.m۱۲۹۷۰B(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۷۲۵a() {
            int z = getChildCount();
            for (int i = 0; i < z; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۷۲۳a(int position, float positionOffset) {
            ValueAnimator valueAnimator = this.f۹۷۵۹k;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f۹۷۵۹k.cancel();
            }
            this.f۹۷۵۴f = position;
            this.f۹۷۵۵g = positionOffset;
            m۱۱۷۲۱b();
        }

        public void onRtlPropertiesChanged(int layoutDirection) {
            super.onRtlPropertiesChanged(layoutDirection);
            if (Build.VERSION.SDK_INT < 23 && this.f۹۷۵۶h != layoutDirection) {
                requestLayout();
                this.f۹۷۵۶h = layoutDirection;
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            if (View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                if (tabLayout.f۹۷۰۸B == 1 && tabLayout.f۹۷۴۵y == 1) {
                    int count = getChildCount();
                    int largestTabWidth = 0;
                    for (int i = 0; i < count; i++) {
                        View child = getChildAt(i);
                        if (child.getVisibility() == 0) {
                            largestTabWidth = Math.max(largestTabWidth, child.getMeasuredWidth());
                        }
                    }
                    if (largestTabWidth > 0) {
                        boolean remeasure = false;
                        if (largestTabWidth * count <= getMeasuredWidth() - (TabLayout.this.m۱۱۶۹۶a(16) * 2)) {
                            for (int i2 = 0; i2 < count; i2++) {
                                LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) getChildAt(i2).getLayoutParams();
                                if (lp.width != largestTabWidth || lp.weight != 0.0f) {
                                    lp.width = largestTabWidth;
                                    lp.weight = 0.0f;
                                    remeasure = true;
                                }
                            }
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f۹۷۴۵y = 0;
                            tabLayout2.m۱۱۷۰۶a(false);
                            remeasure = true;
                        }
                        if (remeasure) {
                            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean changed, int l, int t, int r, int b) {
            super.onLayout(changed, l, t, r, b);
            ValueAnimator valueAnimator = this.f۹۷۵۹k;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m۱۱۷۲۱b();
                return;
            }
            this.f۹۷۵۹k.cancel();
            m۱۱۷۲۴a(this.f۹۷۵۴f, Math.round((1.0f - this.f۹۷۵۹k.getAnimatedFraction()) * ((float) this.f۹۷۵۹k.getDuration())));
        }

        /* renamed from: b  reason: contains not printable characters */
        private void m۱۱۷۲۱b() {
            int right;
            int left;
            View selectedTitle = getChildAt(this.f۹۷۵۴f);
            if (selectedTitle == null || selectedTitle.getWidth() <= 0) {
                left = -1;
                right = -1;
            } else {
                left = selectedTitle.getLeft();
                right = selectedTitle.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.f۹۷۱۰D && (selectedTitle instanceof Ci)) {
                    m۱۱۷۲۰a((Ci) selectedTitle, tabLayout.f۹۷۲۵e);
                    left = (int) TabLayout.this.f۹۷۲۵e.left;
                    right = (int) TabLayout.this.f۹۷۲۵e.right;
                }
                if (this.f۹۷۵۵g > 0.0f && this.f۹۷۵۴f < getChildCount() - 1) {
                    View nextTitle = getChildAt(this.f۹۷۵۴f + 1);
                    int nextTitleLeft = nextTitle.getLeft();
                    int nextTitleRight = nextTitle.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.f۹۷۱۰D && (nextTitle instanceof Ci)) {
                        m۱۱۷۲۰a((Ci) nextTitle, tabLayout2.f۹۷۲۵e);
                        nextTitleLeft = (int) TabLayout.this.f۹۷۲۵e.left;
                        nextTitleRight = (int) TabLayout.this.f۹۷۲۵e.right;
                    }
                    float f = this.f۹۷۵۵g;
                    left = (int) ((((float) nextTitleLeft) * f) + ((1.0f - f) * ((float) left)));
                    right = (int) ((((float) nextTitleRight) * f) + ((1.0f - f) * ((float) right)));
                }
            }
            m۱۱۷۲۷b(left, right);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۱۷۲۷b(int left, int right) {
            if (left != this.f۹۷۵۷i || right != this.f۹۷۵۸j) {
                this.f۹۷۵۷i = left;
                this.f۹۷۵۸j = right;
                Cu.m۱۲۹۷۰B(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۷۲۴a(int position, int duration) {
            int targetRight;
            int targetLeft;
            ValueAnimator valueAnimator = this.f۹۷۵۹k;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f۹۷۵۹k.cancel();
            }
            View targetView = getChildAt(position);
            if (targetView == null) {
                m۱۱۷۲۱b();
                return;
            }
            int targetLeft2 = targetView.getLeft();
            int targetRight2 = targetView.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f۹۷۱۰D || !(targetView instanceof Ci)) {
                targetLeft = targetLeft2;
                targetRight = targetRight2;
            } else {
                m۱۱۷۲۰a((Ci) targetView, tabLayout.f۹۷۲۵e);
                targetLeft = (int) TabLayout.this.f۹۷۲۵e.left;
                targetRight = (int) TabLayout.this.f۹۷۲۵e.right;
            }
            int startLeft = this.f۹۷۵۷i;
            int startRight = this.f۹۷۵۸j;
            if (startLeft != targetLeft || startRight != targetRight) {
                ValueAnimator animator = new ValueAnimator();
                this.f۹۷۵۹k = animator;
                animator.setInterpolator(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ca.f۸۲۵۲b);
                animator.setDuration((long) duration);
                animator.setFloatValues(0.0f, 1.0f);
                animator.addUpdateListener(new Ca(startLeft, targetLeft, startRight, targetRight));
                animator.addListener(new Cb(position));
                animator.start();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.design.widget.TabLayout$f$a  reason: invalid class name */
        public class Ca implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: contains not printable characters */
            final /* synthetic */ int f۹۷۶۱a;

            /* renamed from: b  reason: contains not printable characters */
            final /* synthetic */ int f۹۷۶۲b;

            /* renamed from: c  reason: contains not printable characters */
            final /* synthetic */ int f۹۷۶۳c;

            /* renamed from: d  reason: contains not printable characters */
            final /* synthetic */ int f۹۷۶۴d;

            Ca(int i, int i2, int i3, int i4) {
                this.f۹۷۶۱a = i;
                this.f۹۷۶۲b = i2;
                this.f۹۷۶۳c = i3;
                this.f۹۷۶۴d = i4;
            }

            public void onAnimationUpdate(ValueAnimator animator) {
                float fraction = animator.getAnimatedFraction();
                Cf.this.m۱۱۷۲۷b(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ca.m۹۹۴۴a(this.f۹۷۶۱a, this.f۹۷۶۲b, fraction), p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ca.m۹۹۴۴a(this.f۹۷۶۳c, this.f۹۷۶۴d, fraction));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.design.widget.TabLayout$f$b  reason: invalid class name */
        public class Cb extends AnimatorListenerAdapter {

            /* renamed from: a  reason: contains not printable characters */
            final /* synthetic */ int f۹۷۶۶a;

            Cb(int i) {
                this.f۹۷۶۶a = i;
            }

            public void onAnimationEnd(Animator animator) {
                Cf fVar = Cf.this;
                fVar.f۹۷۵۴f = this.f۹۷۶۶a;
                fVar.f۹۷۵۵g = 0.0f;
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۱۷۲۰a(Ci tabView, RectF contentBounds) {
            int tabViewContentWidth = tabView.m۱۱۷۵۵d();
            if (tabViewContentWidth < TabLayout.this.m۱۱۶۹۶a(24)) {
                tabViewContentWidth = TabLayout.this.m۱۱۶۹۶a(24);
            }
            int tabViewCenter = (tabView.getLeft() + tabView.getRight()) / 2;
            contentBounds.set((float) (tabViewCenter - (tabViewContentWidth / 2)), 0.0f, (float) ((tabViewContentWidth / 2) + tabViewCenter), 0.0f);
        }

        public void draw(Canvas canvas) {
            int indicatorHeight = 0;
            Drawable drawable = TabLayout.this.f۹۷۳۵o;
            if (drawable != null) {
                indicatorHeight = drawable.getIntrinsicHeight();
            }
            if (this.f۹۷۵۱c >= 0) {
                indicatorHeight = this.f۹۷۵۱c;
            }
            int indicatorTop = 0;
            int indicatorBottom = 0;
            int i = TabLayout.this.f۹۷۰۷A;
            if (i == 0) {
                indicatorTop = getHeight() - indicatorHeight;
                indicatorBottom = getHeight();
            } else if (i == 1) {
                indicatorTop = (getHeight() - indicatorHeight) / 2;
                indicatorBottom = (getHeight() + indicatorHeight) / 2;
            } else if (i == 2) {
                indicatorTop = 0;
                indicatorBottom = indicatorHeight;
            } else if (i == 3) {
                indicatorTop = 0;
                indicatorBottom = getHeight();
            }
            int i2 = this.f۹۷۵۷i;
            if (i2 >= 0 && this.f۹۷۵۸j > i2) {
                Drawable drawable2 = TabLayout.this.f۹۷۳۵o;
                if (drawable2 == null) {
                    drawable2 = this.f۹۷۵۳e;
                }
                Drawable selectedIndicator = android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۲۲h(drawable2);
                selectedIndicator.setBounds(this.f۹۷۵۷i, indicatorTop, this.f۹۷۵۸j, indicatorBottom);
                Paint paint = this.f۹۷۵۲d;
                if (paint != null) {
                    if (Build.VERSION.SDK_INT == 21) {
                        selectedIndicator.setColorFilter(paint.getColor(), PorterDuff.Mode.SRC_IN);
                    } else {
                        android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۶b(selectedIndicator, paint.getColor());
                    }
                }
                selectedIndicator.draw(canvas);
            }
            super.draw(canvas);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static ColorStateList m۱۱۶۷۸a(int defaultColor, int selectedColor) {
        int[][] states = new int[2][];
        int[] colors = new int[2];
        states[0] = HorizontalScrollView.SELECTED_STATE_SET;
        colors[0] = selectedColor;
        int i = 0 + 1;
        states[i] = HorizontalScrollView.EMPTY_STATE_SET;
        colors[i] = defaultColor;
        int i2 = i + 1;
        return new ColorStateList(states, colors);
    }

    private int getDefaultHeight() {
        boolean hasIconAndText = false;
        int i = 0;
        int count = this.f۹۷۲۳c.size();
        while (true) {
            if (i < count) {
                Cg tab = this.f۹۷۲۳c.get(i);
                if (tab != null && tab.m۱۱۷۳۵b() != null && !TextUtils.isEmpty(tab.m۱۱۷۳۹d())) {
                    hasIconAndText = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return (!hasIconAndText || this.f۹۷۰۹C) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f۹۷۴۱u;
        if (i != -1) {
            return i;
        }
        if (this.f۹۷۰۸B == 0) {
            return this.f۹۷۴۳w;
        }
        return 0;
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.f۹۷۴۰t;
    }

    /* renamed from: android.support.design.widget.TabLayout$h  reason: invalid class name */
    public static class Ch implements ViewPager.AbstractCj {

        /* renamed from: c  reason: contains not printable characters */
        private final WeakReference<TabLayout> f۹۷۷۵c;

        /* renamed from: d  reason: contains not printable characters */
        private int f۹۷۷۶d;

        /* renamed from: e  reason: contains not printable characters */
        private int f۹۷۷۷e;

        public Ch(TabLayout tabLayout) {
            this.f۹۷۷۵c = new WeakReference<>(tabLayout);
        }

        @Override // android.support.p۰۴۳v4.view.ViewPager.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۷۴۵a(int state) {
            this.f۹۷۷۶d = this.f۹۷۷۷e;
            this.f۹۷۷۷e = state;
        }

        @Override // android.support.p۰۴۳v4.view.ViewPager.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۷۴۶a(int position, float positionOffset, int positionOffsetPixels) {
            TabLayout tabLayout = this.f۹۷۷۵c.get();
            if (tabLayout != null) {
                boolean updateIndicator = false;
                boolean updateText = this.f۹۷۷۷e != 2 || this.f۹۷۷۶d == 1;
                if (!(this.f۹۷۷۷e == 2 && this.f۹۷۷۶d == 0)) {
                    updateIndicator = true;
                }
                tabLayout.m۱۱۶۹۹a(position, positionOffset, updateText, updateIndicator);
            }
        }

        @Override // android.support.p۰۴۳v4.view.ViewPager.AbstractCj
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۱۷۴۷b(int position) {
            TabLayout tabLayout = this.f۹۷۷۵c.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != position && position < tabLayout.getTabCount()) {
                int i = this.f۹۷۷۷e;
                tabLayout.m۱۱۷۱۰b(tabLayout.m۱۱۷۰۸b(position), i == 0 || (i == 2 && this.f۹۷۷۶d == 0));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۷۴۴a() {
            this.f۹۷۷۷e = 0;
            this.f۹۷۷۶d = 0;
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$j  reason: invalid class name */
    public static class Cj implements AbstractCd {

        /* renamed from: a  reason: contains not printable characters */
        private final ViewPager f۹۷۸۷a;

        public Cj(ViewPager viewPager) {
            this.f۹۷۸۷a = viewPager;
        }

        @Override // android.support.design.widget.TabLayout.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۷۶۰a(Cg tab) {
            this.f۹۷۸۷a.setCurrentItem(tab.m۱۱۷۳۸c());
        }

        @Override // android.support.design.widget.TabLayout.AbstractCc
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۱۷۶۲c(Cg tab) {
        }

        @Override // android.support.design.widget.TabLayout.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۱۷۶۱b(Cg tab) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.design.widget.TabLayout$e  reason: invalid class name */
    public class Ce extends DataSetObserver {
        Ce() {
        }

        public void onChanged() {
            TabLayout.this.m۱۱۷۱۲c();
        }

        public void onInvalidated() {
            TabLayout.this.m۱۱۷۱۲c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.design.widget.TabLayout$b  reason: invalid class name */
    public class Cb implements ViewPager.AbstractCi {

        /* renamed from: a  reason: contains not printable characters */
        private boolean f۹۷۴۸a;

        Cb() {
        }

        @Override // android.support.p۰۴۳v4.view.ViewPager.AbstractCi
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۷۱۵a(ViewPager viewPager, AbstractCq oldAdapter, AbstractCq newAdapter) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f۹۷۱۶J == viewPager) {
                tabLayout.m۱۱۷۰۵a(newAdapter, this.f۹۷۴۸a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۷۱۶a(boolean autoRefresh) {
            this.f۹۷۴۸a = autoRefresh;
        }
    }
}
