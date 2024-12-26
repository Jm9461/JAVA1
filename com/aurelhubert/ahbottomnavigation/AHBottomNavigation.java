package com.aurelhubert.ahbottomnavigation;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.support.p۰۴۳v4.view.Cu;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.aurelhubert.ahbottomnavigation.p۱۲۹i.Ca;
import com.aurelhubert.ahbottomnavigation.p۱۲۹i.Cb;
import java.util.ArrayList;
import java.util.List;

public class AHBottomNavigation extends FrameLayout {

    /* renamed from: c0  reason: contains not printable characters */
    private static String f۱۳۳۷۹c0 = "AHBottomNavigation";

    /* renamed from: A  reason: contains not printable characters */
    private int f۱۳۳۸۰A;

    /* renamed from: B  reason: contains not printable characters */
    private int f۱۳۳۸۱B;

    /* renamed from: C  reason: contains not printable characters */
    private int f۱۳۳۸۲C;

    /* renamed from: D  reason: contains not printable characters */
    private int f۱۳۳۸۳D;

    /* renamed from: E  reason: contains not printable characters */
    private int f۱۳۳۸۴E;

    /* renamed from: F  reason: contains not printable characters */
    private int f۱۳۳۸۵F;

    /* renamed from: G  reason: contains not printable characters */
    private int f۱۳۳۸۶G;

    /* renamed from: H  reason: contains not printable characters */
    private int f۱۳۳۸۷H;

    /* renamed from: I  reason: contains not printable characters */
    private float f۱۳۳۸۸I;

    /* renamed from: J  reason: contains not printable characters */
    private float f۱۳۳۸۹J;

    /* renamed from: K  reason: contains not printable characters */
    private int f۱۳۳۹۰K;

    /* renamed from: L  reason: contains not printable characters */
    private int f۱۳۳۹۱L;

    /* renamed from: M  reason: contains not printable characters */
    private float f۱۳۳۹۲M;

    /* renamed from: N  reason: contains not printable characters */
    private float f۱۳۳۹۳N;

    /* renamed from: O  reason: contains not printable characters */
    private boolean f۱۳۳۹۴O;

    /* renamed from: P  reason: contains not printable characters */
    private EnumCh f۱۳۳۹۵P;

    /* renamed from: Q  reason: contains not printable characters */
    private int f۱۳۳۹۶Q;

    /* renamed from: R  reason: contains not printable characters */
    private int f۱۳۳۹۷R;

    /* renamed from: S  reason: contains not printable characters */
    private Drawable f۱۳۳۹۸S;

    /* renamed from: T  reason: contains not printable characters */
    private Typeface f۱۳۳۹۹T;

    /* renamed from: U  reason: contains not printable characters */
    private int f۱۳۴۰۰U;

    /* renamed from: V  reason: contains not printable characters */
    private int f۱۳۴۰۱V;

    /* renamed from: W  reason: contains not printable characters */
    private int f۱۳۴۰۲W;

    /* renamed from: a0  reason: contains not printable characters */
    private int f۱۳۴۰۳a0;

    /* renamed from: b0  reason: contains not printable characters */
    private long f۱۳۴۰۴b0;

    /* renamed from: c  reason: contains not printable characters */
    private AbstractCg f۱۳۴۰۵c;

    /* renamed from: d  reason: contains not printable characters */
    private AbstractCf f۱۳۴۰۶d;

    /* renamed from: e  reason: contains not printable characters */
    private Context f۱۳۴۰۷e;

    /* renamed from: f  reason: contains not printable characters */
    private Resources f۱۳۴۰۸f;

    /* renamed from: g  reason: contains not printable characters */
    private ArrayList<Ca> f۱۳۴۰۹g;

    /* renamed from: h  reason: contains not printable characters */
    private ArrayList<View> f۱۳۴۱۰h;

    /* renamed from: i  reason: contains not printable characters */
    private AHBottomNavigationBehavior<AHBottomNavigation> f۱۳۴۱۱i;

    /* renamed from: j  reason: contains not printable characters */
    private LinearLayout f۱۳۴۱۲j;

    /* renamed from: k  reason: contains not printable characters */
    private View f۱۳۴۱۳k;

    /* renamed from: l  reason: contains not printable characters */
    private Animator f۱۳۴۱۴l;

    /* renamed from: m  reason: contains not printable characters */
    private boolean f۱۳۴۱۵m;

    /* renamed from: n  reason: contains not printable characters */
    private boolean f۱۳۴۱۶n;

    /* renamed from: o  reason: contains not printable characters */
    private boolean f۱۳۴۱۷o;

    /* renamed from: p  reason: contains not printable characters */
    private List<Ca> f۱۳۴۱۸p;

    /* renamed from: q  reason: contains not printable characters */
    private Boolean[] f۱۳۴۱۹q;

    /* renamed from: r  reason: contains not printable characters */
    private boolean f۱۳۴۲۰r;

    /* renamed from: s  reason: contains not printable characters */
    private int f۱۳۴۲۱s;

    /* renamed from: t  reason: contains not printable characters */
    private int f۱۳۴۲۲t;

    /* renamed from: u  reason: contains not printable characters */
    private boolean f۱۳۴۲۳u;

    /* renamed from: v  reason: contains not printable characters */
    private boolean f۱۳۴۲۴v;

    /* renamed from: w  reason: contains not printable characters */
    private boolean f۱۳۴۲۵w;

    /* renamed from: x  reason: contains not printable characters */
    private boolean f۱۳۴۲۶x;

    /* renamed from: y  reason: contains not printable characters */
    private Typeface f۱۳۴۲۷y;

    /* renamed from: z  reason: contains not printable characters */
    private int f۱۳۴۲۸z;

    /* renamed from: com.aurelhubert.ahbottomnavigation.AHBottomNavigation$f  reason: invalid class name */
    public interface AbstractCf {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۶۸۰۰a(int i);
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.AHBottomNavigation$g  reason: invalid class name */
    public interface AbstractCg {
        /* renamed from: a  reason: contains not printable characters */
        boolean m۱۶۸۰۱a(int i, boolean z);
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.AHBottomNavigation$h  reason: invalid class name */
    public enum EnumCh {
        SHOW_WHEN_ACTIVE,
        ALWAYS_SHOW,
        ALWAYS_HIDE
    }

    public AHBottomNavigation(Context context) {
        super(context);
        this.f۱۳۴۰۹g = new ArrayList<>();
        this.f۱۳۴۱۰h = new ArrayList<>();
        this.f۱۳۴۱۵m = false;
        this.f۱۳۴۱۶n = false;
        this.f۱۳۴۱۸p = Ca.m۱۶۸۵۵a(5);
        this.f۱۳۴۱۹q = new Boolean[]{true, true, true, true, true};
        this.f۱۳۴۲۰r = false;
        this.f۱۳۴۲۱s = 0;
        this.f۱۳۴۲۲t = 0;
        this.f۱۳۴۲۳u = true;
        this.f۱۳۴۲۴v = false;
        this.f۱۳۴۲۵w = false;
        this.f۱۳۴۲۶x = true;
        this.f۱۳۴۲۸z = -1;
        this.f۱۳۳۸۰A = 0;
        this.f۱۳۳۹۱L = 0;
        this.f۱۳۳۹۴O = false;
        this.f۱۳۳۹۵P = EnumCh.SHOW_WHEN_ACTIVE;
        m۱۶۷۸۵a(context, (AttributeSet) null);
    }

    public AHBottomNavigation(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f۱۳۴۰۹g = new ArrayList<>();
        this.f۱۳۴۱۰h = new ArrayList<>();
        this.f۱۳۴۱۵m = false;
        this.f۱۳۴۱۶n = false;
        this.f۱۳۴۱۸p = Ca.m۱۶۸۵۵a(5);
        this.f۱۳۴۱۹q = new Boolean[]{true, true, true, true, true};
        this.f۱۳۴۲۰r = false;
        this.f۱۳۴۲۱s = 0;
        this.f۱۳۴۲۲t = 0;
        this.f۱۳۴۲۳u = true;
        this.f۱۳۴۲۴v = false;
        this.f۱۳۴۲۵w = false;
        this.f۱۳۴۲۶x = true;
        this.f۱۳۴۲۸z = -1;
        this.f۱۳۳۸۰A = 0;
        this.f۱۳۳۹۱L = 0;
        this.f۱۳۳۹۴O = false;
        this.f۱۳۳۹۵P = EnumCh.SHOW_WHEN_ACTIVE;
        m۱۶۷۸۵a(context, attrs);
    }

    public AHBottomNavigation(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۱۳۴۰۹g = new ArrayList<>();
        this.f۱۳۴۱۰h = new ArrayList<>();
        this.f۱۳۴۱۵m = false;
        this.f۱۳۴۱۶n = false;
        this.f۱۳۴۱۸p = Ca.m۱۶۸۵۵a(5);
        this.f۱۳۴۱۹q = new Boolean[]{true, true, true, true, true};
        this.f۱۳۴۲۰r = false;
        this.f۱۳۴۲۱s = 0;
        this.f۱۳۴۲۲t = 0;
        this.f۱۳۴۲۳u = true;
        this.f۱۳۴۲۴v = false;
        this.f۱۳۴۲۵w = false;
        this.f۱۳۴۲۶x = true;
        this.f۱۳۴۲۸z = -1;
        this.f۱۳۳۸۰A = 0;
        this.f۱۳۳۹۱L = 0;
        this.f۱۳۳۹۴O = false;
        this.f۱۳۳۹۵P = EnumCh.SHOW_WHEN_ACTIVE;
        m۱۶۷۸۵a(context, attrs);
    }

    public void setSoundEffectsEnabled(boolean soundEffectsEnabled) {
        super.setSoundEffectsEnabled(soundEffectsEnabled);
        this.f۱۳۴۲۶x = soundEffectsEnabled;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        m۱۶۷۹۰b();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (!this.f۱۳۴۲۰r) {
            setBehaviorTranslationEnabled(this.f۱۳۴۲۳u);
            this.f۱۳۴۲۰r = true;
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putInt("current_item", this.f۱۳۴۲۱s);
        bundle.putParcelableArrayList("notifications", new ArrayList<>(this.f۱۳۴۱۸p));
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable state) {
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            this.f۱۳۴۲۱s = bundle.getInt("current_item");
            this.f۱۳۴۱۸p = bundle.getParcelableArrayList("notifications");
            state = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(state);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۷۸۵a(Context context, AttributeSet attrs) {
        this.f۱۳۴۰۷e = context;
        this.f۱۳۴۰۸f = this.f۱۳۴۰۷e.getResources();
        this.f۱۳۳۸۳D = android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, Cc.colorBottomNavigationAccent);
        this.f۱۳۳۸۵F = android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, Cc.colorBottomNavigationInactive);
        this.f۱۳۳۸۴E = android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, Cc.colorBottomNavigationDisable);
        this.f۱۳۳۸۶G = android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, Cc.colorBottomNavigationActiveColored);
        this.f۱۳۳۸۷H = android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, Cc.colorBottomNavigationInactiveColored);
        if (attrs != null) {
            TypedArray ta = context.obtainStyledAttributes(attrs, Ch.AHBottomNavigationBehavior_Params, 0, 0);
            try {
                this.f۱۳۴۱۶n = ta.getBoolean(Ch.AHBottomNavigationBehavior_Params_selectedBackgroundVisible, false);
                this.f۱۳۴۱۷o = ta.getBoolean(Ch.AHBottomNavigationBehavior_Params_translucentNavigationEnabled, false);
                this.f۱۳۳۸۳D = ta.getColor(Ch.AHBottomNavigationBehavior_Params_accentColor, android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, Cc.colorBottomNavigationAccent));
                this.f۱۳۳۸۵F = ta.getColor(Ch.AHBottomNavigationBehavior_Params_inactiveColor, android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, Cc.colorBottomNavigationInactive));
                this.f۱۳۳۸۴E = ta.getColor(Ch.AHBottomNavigationBehavior_Params_disableColor, android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, Cc.colorBottomNavigationDisable));
                this.f۱۳۳۸۶G = ta.getColor(Ch.AHBottomNavigationBehavior_Params_coloredActive, android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, Cc.colorBottomNavigationActiveColored));
                this.f۱۳۳۸۷H = ta.getColor(Ch.AHBottomNavigationBehavior_Params_coloredInactive, android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, Cc.colorBottomNavigationInactiveColored));
                this.f۱۳۴۱۵m = ta.getBoolean(Ch.AHBottomNavigationBehavior_Params_colored, false);
            } finally {
                ta.recycle();
            }
        }
        this.f۱۳۳۹۶Q = android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, 17170443);
        this.f۱۳۳۹۰K = (int) this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_height);
        this.f۱۳۳۸۱B = this.f۱۳۳۸۳D;
        this.f۱۳۳۸۲C = this.f۱۳۳۸۵F;
        this.f۱۳۴۰۰U = (int) this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_notification_margin_left_active);
        this.f۱۳۴۰۱V = (int) this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_notification_margin_left);
        this.f۱۳۴۰۲W = (int) this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_notification_margin_top_active);
        this.f۱۳۴۰۳a0 = (int) this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_notification_margin_top);
        this.f۱۳۴۰۴b0 = 150;
        Cu.m۱۲۹۷۷a(this, this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_elevation));
        setClipToPadding(false);
        setLayoutParams(new ViewGroup.LayoutParams(-1, this.f۱۳۳۹۰K));
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۷۹۰b() {
        if (this.f۱۳۴۰۹g.size() < 3) {
            Log.w(f۱۳۳۷۹c0, "The items list should have at least 3 items");
        } else if (this.f۱۳۴۰۹g.size() > 5) {
            Log.w(f۱۳۳۷۹c0, "The items list should not have more than 5 items");
        }
        int layoutHeight = (int) this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_height);
        removeAllViews();
        this.f۱۳۴۱۰h.clear();
        this.f۱۳۴۱۳k = new View(this.f۱۳۴۰۷e);
        if (Build.VERSION.SDK_INT >= 21) {
            addView(this.f۱۳۴۱۳k, new FrameLayout.LayoutParams(-1, m۱۶۷۸۳a(layoutHeight)));
            this.f۱۳۳۹۰K = layoutHeight;
        }
        this.f۱۳۴۱۲j = new LinearLayout(this.f۱۳۴۰۷e);
        this.f۱۳۴۱۲j.setOrientation(0);
        this.f۱۳۴۱۲j.setGravity(17);
        addView(this.f۱۳۴۱۲j, new FrameLayout.LayoutParams(-1, layoutHeight));
        if (this.f۱۳۳۹۵P == EnumCh.ALWAYS_HIDE || !(this.f۱۳۴۰۹g.size() == 3 || this.f۱۳۳۹۵P == EnumCh.ALWAYS_SHOW)) {
            m۱۶۷۹۲b(this.f۱۳۴۱۲j);
        } else {
            m۱۶۷۸۶a(this.f۱۳۴۱۲j);
        }
        post(new RunnableCa());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.aurelhubert.ahbottomnavigation.AHBottomNavigation$a  reason: invalid class name */
    public class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            AHBottomNavigation.this.requestLayout();
        }
    }

    @SuppressLint({"NewApi"})
    @TargetApi(21)
    /* renamed from: a  reason: contains not printable characters */
    private int m۱۶۷۸۳a(int layoutHeight) {
        if (!this.f۱۳۴۱۷o) {
            return layoutHeight;
        }
        int resourceId = getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (resourceId > 0) {
            this.f۱۳۳۹۱L = this.f۱۳۴۰۸f.getDimensionPixelSize(resourceId);
        }
        TypedArray typedValue = getContext().getTheme().obtainStyledAttributes(new int[]{16842973, 16843760});
        typedValue.getBoolean(0, false);
        boolean translucentNavigation = typedValue.getBoolean(1, true);
        if (m۱۶۷۹۹a() && translucentNavigation) {
            layoutHeight += this.f۱۳۳۹۱L;
        }
        typedValue.recycle();
        return layoutHeight;
    }

    @SuppressLint({"NewApi"})
    @TargetApi(21)
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۶۷۹۹a() {
        Display d = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics realDisplayMetrics = new DisplayMetrics();
        d.getRealMetrics(realDisplayMetrics);
        int realHeight = realDisplayMetrics.heightPixels;
        int realWidth = realDisplayMetrics.widthPixels;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        d.getMetrics(displayMetrics);
        return realWidth > displayMetrics.widthPixels || realHeight > displayMetrics.heightPixels;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۷۸۶a(LinearLayout linearLayout) {
        float inactiveSize;
        int activePaddingTop;
        boolean z;
        LayoutInflater inflater = (LayoutInflater) this.f۱۳۴۰۷e.getSystemService("layout_inflater");
        float height = this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_height);
        float minWidth = this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_min_width);
        float maxWidth = this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_max_width);
        if (this.f۱۳۳۹۵P == EnumCh.ALWAYS_SHOW && this.f۱۳۴۰۹g.size() > 3) {
            minWidth = this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_small_inactive_min_width);
            maxWidth = this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_small_inactive_max_width);
        }
        int layoutWidth = getWidth();
        if (layoutWidth == 0) {
            return;
        }
        if (this.f۱۳۴۰۹g.size() != 0) {
            float itemWidth = (float) (layoutWidth / this.f۱۳۴۰۹g.size());
            if (itemWidth < minWidth) {
                itemWidth = minWidth;
            } else if (itemWidth > maxWidth) {
                itemWidth = maxWidth;
            }
            float activeSize = this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_text_size_active);
            float inactiveSize2 = this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_text_size_inactive);
            int activePaddingTop2 = (int) this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_margin_top_active);
            if (this.f۱۳۳۸۸I != 0.0f && this.f۱۳۳۸۹J != 0.0f) {
                activeSize = this.f۱۳۳۸۸I;
                inactiveSize2 = this.f۱۳۳۸۹J;
            } else if (this.f۱۳۳۹۵P == EnumCh.ALWAYS_SHOW && this.f۱۳۴۰۹g.size() > 3) {
                activeSize = this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_text_size_forced_active);
                inactiveSize2 = this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_text_size_forced_inactive);
            }
            int i = 0;
            while (i < this.f۱۳۴۰۹g.size()) {
                boolean current = this.f۱۳۴۲۱s == i;
                Ca item = this.f۱۳۴۰۹g.get(i);
                View view = inflater.inflate(Cg.bottom_navigation_item, (ViewGroup) this, false);
                FrameLayout container = (FrameLayout) view.findViewById(Cf.bottom_navigation_container);
                ImageView icon = (ImageView) view.findViewById(Cf.bottom_navigation_item_icon);
                TextView title = (TextView) view.findViewById(Cf.bottom_navigation_item_title);
                TextView notification = (TextView) view.findViewById(Cf.bottom_navigation_notification);
                icon.setImageDrawable(item.m۱۶۸۴۴b(this.f۱۳۴۰۷e));
                title.setText(item.m۱۶۸۴۵c(this.f۱۳۴۰۷e));
                Typeface typeface = this.f۱۳۴۲۷y;
                if (typeface != null) {
                    title.setTypeface(typeface);
                }
                if (this.f۱۳۳۹۵P != EnumCh.ALWAYS_SHOW || this.f۱۳۴۰۹g.size() <= 3) {
                    inactiveSize = inactiveSize2;
                } else {
                    inactiveSize = inactiveSize2;
                    container.setPadding(0, container.getPaddingTop(), 0, container.getPaddingBottom());
                }
                if (current) {
                    if (this.f۱۳۴۱۶n) {
                        z = true;
                        view.setSelected(true);
                    } else {
                        z = true;
                    }
                    icon.setSelected(z);
                    if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) icon.getLayoutParams();
                        p.setMargins(p.leftMargin, activePaddingTop2, p.rightMargin, p.bottomMargin);
                        ViewGroup.MarginLayoutParams paramsNotification = (ViewGroup.MarginLayoutParams) notification.getLayoutParams();
                        activePaddingTop = activePaddingTop2;
                        paramsNotification.setMargins(this.f۱۳۴۰۰U, paramsNotification.topMargin, paramsNotification.rightMargin, paramsNotification.bottomMargin);
                        view.requestLayout();
                    } else {
                        activePaddingTop = activePaddingTop2;
                    }
                } else {
                    activePaddingTop = activePaddingTop2;
                    icon.setSelected(false);
                    ViewGroup.MarginLayoutParams paramsNotification2 = (ViewGroup.MarginLayoutParams) notification.getLayoutParams();
                    paramsNotification2.setMargins(this.f۱۳۴۰۱V, paramsNotification2.topMargin, paramsNotification2.rightMargin, paramsNotification2.bottomMargin);
                }
                if (!this.f۱۳۴۱۵m) {
                    int i2 = this.f۱۳۳۸۰A;
                    if (i2 != 0) {
                        setBackgroundResource(i2);
                    } else {
                        setBackgroundColor(this.f۱۳۴۲۸z);
                    }
                } else if (current) {
                    setBackgroundColor(item.m۱۶۸۴۳a(this.f۱۳۴۰۷e));
                    this.f۱۳۴۲۲t = item.m۱۶۸۴۳a(this.f۱۳۴۰۷e);
                }
                title.setTextSize(0, current ? activeSize : inactiveSize);
                if (this.f۱۳۴۱۹q[i].booleanValue()) {
                    view.setOnClickListener(new View$OnClickListenerCb(i));
                    icon.setImageDrawable(Cb.m۱۶۸۴۶a(this.f۱۳۴۰۹g.get(i).m۱۶۸۴۴b(this.f۱۳۴۰۷e), current ? this.f۱۳۳۸۱B : this.f۱۳۳۸۲C, this.f۱۳۳۹۴O));
                    title.setTextColor(current ? this.f۱۳۳۸۱B : this.f۱۳۳۸۲C);
                    view.setSoundEffectsEnabled(this.f۱۳۴۲۶x);
                } else {
                    icon.setImageDrawable(Cb.m۱۶۸۴۶a(this.f۱۳۴۰۹g.get(i).m۱۶۸۴۴b(this.f۱۳۴۰۷e), this.f۱۳۳۸۴E, this.f۱۳۳۹۴O));
                    title.setTextColor(this.f۱۳۳۸۴E);
                }
                linearLayout.addView(view, new FrameLayout.LayoutParams((int) itemWidth, (int) height));
                this.f۱۳۴۱۰h.add(view);
                i++;
                inflater = inflater;
                minWidth = minWidth;
                maxWidth = maxWidth;
                layoutWidth = layoutWidth;
                activeSize = activeSize;
                inactiveSize2 = inactiveSize;
                activePaddingTop2 = activePaddingTop;
            }
            m۱۶۷۸۸a(true, -1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.aurelhubert.ahbottomnavigation.AHBottomNavigation$b  reason: invalid class name */
    public class View$OnClickListenerCb implements View.OnClickListener {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ int f۱۳۴۳۰c;

        View$OnClickListenerCb(int i) {
            this.f۱۳۴۳۰c = i;
        }

        public void onClick(View v) {
            AHBottomNavigation.this.m۱۶۷۹۱b(this.f۱۳۴۳۰c, true);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۷۹۲b(LinearLayout linearLayout) {
        int activeMarginTop;
        int layoutWidth;
        float maxWidth;
        boolean z;
        LayoutInflater inflater = (LayoutInflater) this.f۱۳۴۰۷e.getSystemService("layout_inflater");
        float height = this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_height);
        float minWidth = this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_small_inactive_min_width);
        float maxWidth2 = this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_small_inactive_max_width);
        int layoutWidth2 = getWidth();
        if (layoutWidth2 == 0) {
            return;
        }
        if (this.f۱۳۴۰۹g.size() != 0) {
            float itemWidth = (float) (layoutWidth2 / this.f۱۳۴۰۹g.size());
            if (itemWidth < minWidth) {
                itemWidth = minWidth;
            } else if (itemWidth > maxWidth2) {
                itemWidth = maxWidth2;
            }
            int activeMarginTop2 = (int) this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_small_margin_top_active);
            float difference = this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_small_selected_width_difference);
            this.f۱۳۳۹۲M = (((float) this.f۱۳۴۰۹g.size()) * difference) + itemWidth;
            float itemWidth2 = itemWidth - difference;
            this.f۱۳۳۹۳N = itemWidth2;
            int i = 0;
            while (i < this.f۱۳۴۰۹g.size()) {
                Ca item = this.f۱۳۴۰۹g.get(i);
                View view = inflater.inflate(Cg.bottom_navigation_small_item, (ViewGroup) this, false);
                ImageView icon = (ImageView) view.findViewById(Cf.bottom_navigation_small_item_icon);
                TextView title = (TextView) view.findViewById(Cf.bottom_navigation_small_item_title);
                TextView notification = (TextView) view.findViewById(Cf.bottom_navigation_notification);
                icon.setImageDrawable(item.m۱۶۸۴۴b(this.f۱۳۴۰۷e));
                if (this.f۱۳۳۹۵P != EnumCh.ALWAYS_HIDE) {
                    title.setText(item.m۱۶۸۴۵c(this.f۱۳۴۰۷e));
                }
                float f = this.f۱۳۳۸۸I;
                if (f != 0.0f) {
                    title.setTextSize(0, f);
                }
                Typeface typeface = this.f۱۳۴۲۷y;
                if (typeface != null) {
                    title.setTypeface(typeface);
                }
                if (i == this.f۱۳۴۲۱s) {
                    if (this.f۱۳۴۱۶n) {
                        z = true;
                        view.setSelected(true);
                    } else {
                        z = true;
                    }
                    icon.setSelected(z);
                    if (this.f۱۳۳۹۵P == EnumCh.ALWAYS_HIDE) {
                        maxWidth = maxWidth2;
                        layoutWidth = layoutWidth2;
                        activeMarginTop = activeMarginTop2;
                    } else if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) icon.getLayoutParams();
                        maxWidth = maxWidth2;
                        layoutWidth = layoutWidth2;
                        p.setMargins(p.leftMargin, activeMarginTop2, p.rightMargin, p.bottomMargin);
                        ViewGroup.MarginLayoutParams paramsNotification = (ViewGroup.MarginLayoutParams) notification.getLayoutParams();
                        activeMarginTop = activeMarginTop2;
                        paramsNotification.setMargins(this.f۱۳۴۰۰U, this.f۱۳۴۰۲W, paramsNotification.rightMargin, paramsNotification.bottomMargin);
                        view.requestLayout();
                    } else {
                        maxWidth = maxWidth2;
                        layoutWidth = layoutWidth2;
                        activeMarginTop = activeMarginTop2;
                    }
                } else {
                    maxWidth = maxWidth2;
                    layoutWidth = layoutWidth2;
                    activeMarginTop = activeMarginTop2;
                    icon.setSelected(false);
                    ViewGroup.MarginLayoutParams paramsNotification2 = (ViewGroup.MarginLayoutParams) notification.getLayoutParams();
                    paramsNotification2.setMargins(this.f۱۳۴۰۱V, this.f۱۳۴۰۳a0, paramsNotification2.rightMargin, paramsNotification2.bottomMargin);
                }
                if (!this.f۱۳۴۱۵m) {
                    int i2 = this.f۱۳۳۸۰A;
                    if (i2 != 0) {
                        setBackgroundResource(i2);
                    } else {
                        setBackgroundColor(this.f۱۳۴۲۸z);
                    }
                } else if (i == this.f۱۳۴۲۱s) {
                    setBackgroundColor(item.m۱۶۸۴۳a(this.f۱۳۴۰۷e));
                    this.f۱۳۴۲۲t = item.m۱۶۸۴۳a(this.f۱۳۴۰۷e);
                }
                if (this.f۱۳۴۱۹q[i].booleanValue()) {
                    icon.setImageDrawable(Cb.m۱۶۸۴۶a(this.f۱۳۴۰۹g.get(i).m۱۶۸۴۴b(this.f۱۳۴۰۷e), this.f۱۳۴۲۱s == i ? this.f۱۳۳۸۱B : this.f۱۳۳۸۲C, this.f۱۳۳۹۴O));
                    title.setTextColor(this.f۱۳۴۲۱s == i ? this.f۱۳۳۸۱B : this.f۱۳۳۸۲C);
                    title.setAlpha(this.f۱۳۴۲۱s == i ? 1.0f : 0.0f);
                    view.setOnClickListener(new View$OnClickListenerCc(i));
                    view.setSoundEffectsEnabled(this.f۱۳۴۲۶x);
                } else {
                    icon.setImageDrawable(Cb.m۱۶۸۴۶a(this.f۱۳۴۰۹g.get(i).m۱۶۸۴۴b(this.f۱۳۴۰۷e), this.f۱۳۳۸۴E, this.f۱۳۳۹۴O));
                    title.setTextColor(this.f۱۳۳۸۴E);
                    title.setAlpha(0.0f);
                }
                int width = i == this.f۱۳۴۲۱s ? (int) this.f۱۳۳۹۲M : (int) itemWidth2;
                if (this.f۱۳۳۹۵P == EnumCh.ALWAYS_HIDE) {
                    double d = (double) itemWidth2;
                    Double.isNaN(d);
                    width = (int) (d * 1.16d);
                }
                linearLayout.addView(view, new FrameLayout.LayoutParams(width, (int) height));
                this.f۱۳۴۱۰h.add(view);
                i++;
                inflater = inflater;
                minWidth = minWidth;
                maxWidth2 = maxWidth;
                layoutWidth2 = layoutWidth;
                activeMarginTop2 = activeMarginTop;
            }
            m۱۶۷۸۸a(true, -1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.aurelhubert.ahbottomnavigation.AHBottomNavigation$c  reason: invalid class name */
    public class View$OnClickListenerCc implements View.OnClickListener {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ int f۱۳۴۳۲c;

        View$OnClickListenerCc(int i) {
            this.f۱۳۴۳۲c = i;
        }

        public void onClick(View v) {
            AHBottomNavigation.this.m۱۶۷۹۵c(this.f۱۳۴۳۲c, true);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۷۹۱b(int itemIndex, boolean useCallback) {
        boolean z = true;
        if (this.f۱۳۴۲۱s == itemIndex) {
            AbstractCg gVar = this.f۱۳۴۰۵c;
            if (gVar != null && useCallback) {
                gVar.m۱۶۸۰۱a(itemIndex, true);
                return;
            }
            return;
        }
        AbstractCg gVar2 = this.f۱۳۴۰۵c;
        if (gVar2 == null || !useCallback || gVar2.m۱۶۸۰۱a(itemIndex, false)) {
            int activeMarginTop = (int) this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_margin_top_active);
            int inactiveMarginTop = (int) this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_margin_top_inactive);
            float activeSize = this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_text_size_active);
            float inactiveSize = this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_text_size_inactive);
            if (this.f۱۳۳۸۸I != 0.0f && this.f۱۳۳۸۹J != 0.0f) {
                activeSize = this.f۱۳۳۸۸I;
                inactiveSize = this.f۱۳۳۸۹J;
            } else if (this.f۱۳۳۹۵P == EnumCh.ALWAYS_SHOW && this.f۱۳۴۰۹g.size() > 3) {
                activeSize = this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_text_size_forced_active);
                inactiveSize = this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_text_size_forced_inactive);
            }
            int i = 0;
            while (i < this.f۱۳۴۱۰h.size()) {
                View view = this.f۱۳۴۱۰h.get(i);
                if (this.f۱۳۴۱۶n) {
                    view.setSelected(i == itemIndex);
                }
                if (i == itemIndex) {
                    TextView title = (TextView) view.findViewById(Cf.bottom_navigation_item_title);
                    ImageView icon = (ImageView) view.findViewById(Cf.bottom_navigation_item_icon);
                    icon.setSelected(z);
                    Cb.m۱۶۸۵۳b((View) icon, inactiveMarginTop, activeMarginTop);
                    Cb.m۱۶۸۴۹a((View) ((TextView) view.findViewById(Cf.bottom_navigation_notification)), this.f۱۳۴۰۱V, this.f۱۳۴۰۰U);
                    Cb.m۱۶۸۵۱a(title, this.f۱۳۳۸۲C, this.f۱۳۳۸۱B);
                    Cb.m۱۶۸۵۰a(title, inactiveSize, activeSize);
                    Cb.m۱۶۸۴۷a(this.f۱۳۴۰۷e, this.f۱۳۴۰۹g.get(itemIndex).m۱۶۸۴۴b(this.f۱۳۴۰۷e), icon, this.f۱۳۳۸۲C, this.f۱۳۳۸۱B, this.f۱۳۳۹۴O);
                    if (Build.VERSION.SDK_INT >= 21 && this.f۱۳۴۱۵m) {
                        int finalRadius = Math.max(getWidth(), getHeight());
                        int cx = ((int) view.getX()) + (view.getWidth() / 2);
                        int cy = view.getHeight() / 2;
                        Animator animator = this.f۱۳۴۱۴l;
                        if (animator != null && animator.isRunning()) {
                            this.f۱۳۴۱۴l.cancel();
                            setBackgroundColor(this.f۱۳۴۰۹g.get(itemIndex).m۱۶۸۴۳a(this.f۱۳۴۰۷e));
                            this.f۱۳۴۱۳k.setBackgroundColor(0);
                        }
                        this.f۱۳۴۱۴l = ViewAnimationUtils.createCircularReveal(this.f۱۳۴۱۳k, cx, cy, 0.0f, (float) finalRadius);
                        this.f۱۳۴۱۴l.setStartDelay(5);
                        this.f۱۳۴۱۴l.addListener(new Cd(itemIndex));
                        this.f۱۳۴۱۴l.start();
                    } else if (this.f۱۳۴۱۵m) {
                        Cb.m۱۶۸۵۴c(this, this.f۱۳۴۲۲t, this.f۱۳۴۰۹g.get(itemIndex).m۱۶۸۴۳a(this.f۱۳۴۰۷e));
                    } else {
                        int i2 = this.f۱۳۳۸۰A;
                        if (i2 != 0) {
                            setBackgroundResource(i2);
                        } else {
                            setBackgroundColor(this.f۱۳۴۲۸z);
                        }
                        this.f۱۳۴۱۳k.setBackgroundColor(0);
                    }
                } else if (i == this.f۱۳۴۲۱s) {
                    TextView title2 = (TextView) view.findViewById(Cf.bottom_navigation_item_title);
                    ImageView icon2 = (ImageView) view.findViewById(Cf.bottom_navigation_item_icon);
                    icon2.setSelected(false);
                    Cb.m۱۶۸۵۳b((View) icon2, activeMarginTop, inactiveMarginTop);
                    Cb.m۱۶۸۴۹a((View) ((TextView) view.findViewById(Cf.bottom_navigation_notification)), this.f۱۳۴۰۰U, this.f۱۳۴۰۱V);
                    Cb.m۱۶۸۵۱a(title2, this.f۱۳۳۸۱B, this.f۱۳۳۸۲C);
                    Cb.m۱۶۸۵۰a(title2, activeSize, inactiveSize);
                    Cb.m۱۶۸۴۷a(this.f۱۳۴۰۷e, this.f۱۳۴۰۹g.get(this.f۱۳۴۲۱s).m۱۶۸۴۴b(this.f۱۳۴۰۷e), icon2, this.f۱۳۳۸۱B, this.f۱۳۳۸۲C, this.f۱۳۳۹۴O);
                }
                i++;
                z = true;
            }
            this.f۱۳۴۲۱s = itemIndex;
            int i3 = this.f۱۳۴۲۱s;
            if (i3 > 0 && i3 < this.f۱۳۴۰۹g.size()) {
                this.f۱۳۴۲۲t = this.f۱۳۴۰۹g.get(this.f۱۳۴۲۱s).m۱۶۸۴۳a(this.f۱۳۴۰۷e);
            } else if (this.f۱۳۴۲۱s == -1) {
                int i4 = this.f۱۳۳۸۰A;
                if (i4 != 0) {
                    setBackgroundResource(i4);
                } else {
                    setBackgroundColor(this.f۱۳۴۲۸z);
                }
                this.f۱۳۴۱۳k.setBackgroundColor(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.aurelhubert.ahbottomnavigation.AHBottomNavigation$d  reason: invalid class name */
    public class Cd implements Animator.AnimatorListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ int f۱۳۴۳۴a;

        Cd(int i) {
            this.f۱۳۴۳۴a = i;
        }

        public void onAnimationStart(Animator animation) {
            AHBottomNavigation.this.f۱۳۴۱۳k.setBackgroundColor(((Ca) AHBottomNavigation.this.f۱۳۴۰۹g.get(this.f۱۳۴۳۴a)).m۱۶۸۴۳a(AHBottomNavigation.this.f۱۳۴۰۷e));
        }

        public void onAnimationEnd(Animator animation) {
            AHBottomNavigation aHBottomNavigation = AHBottomNavigation.this;
            aHBottomNavigation.setBackgroundColor(((Ca) aHBottomNavigation.f۱۳۴۰۹g.get(this.f۱۳۴۳۴a)).m۱۶۸۴۳a(AHBottomNavigation.this.f۱۳۴۰۷e));
            AHBottomNavigation.this.f۱۳۴۱۳k.setBackgroundColor(0);
        }

        public void onAnimationCancel(Animator animation) {
        }

        public void onAnimationRepeat(Animator animation) {
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c  reason: contains not printable characters */
    private void m۱۶۷۹۵c(int itemIndex, boolean useCallback) {
        boolean z = true;
        if (this.f۱۳۴۲۱s == itemIndex) {
            AbstractCg gVar = this.f۱۳۴۰۵c;
            if (gVar != null && useCallback) {
                gVar.m۱۶۸۰۱a(itemIndex, true);
                return;
            }
            return;
        }
        AbstractCg gVar2 = this.f۱۳۴۰۵c;
        if (gVar2 == null || !useCallback || gVar2.m۱۶۸۰۱a(itemIndex, false)) {
            int activeMarginTop = (int) this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_small_margin_top_active);
            int inactiveMargin = (int) this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_small_margin_top);
            int i = 0;
            while (i < this.f۱۳۴۱۰h.size()) {
                View view = this.f۱۳۴۱۰h.get(i);
                if (this.f۱۳۴۱۶n) {
                    view.setSelected(i == itemIndex);
                }
                if (i == itemIndex) {
                    FrameLayout container = (FrameLayout) view.findViewById(Cf.bottom_navigation_small_container);
                    TextView title = (TextView) view.findViewById(Cf.bottom_navigation_small_item_title);
                    ImageView icon = (ImageView) view.findViewById(Cf.bottom_navigation_small_item_icon);
                    TextView notification = (TextView) view.findViewById(Cf.bottom_navigation_notification);
                    icon.setSelected(z);
                    if (this.f۱۳۳۹۵P != EnumCh.ALWAYS_HIDE) {
                        Cb.m۱۶۸۵۳b((View) icon, inactiveMargin, activeMarginTop);
                        Cb.m۱۶۸۴۹a((View) notification, this.f۱۳۴۰۱V, this.f۱۳۴۰۰U);
                        Cb.m۱۶۸۵۳b((View) notification, this.f۱۳۴۰۳a0, this.f۱۳۴۰۲W);
                        Cb.m۱۶۸۵۱a(title, this.f۱۳۳۸۲C, this.f۱۳۳۸۱B);
                        Cb.m۱۶۸۵۲b(container, this.f۱۳۳۹۳N, this.f۱۳۳۹۲M);
                    }
                    Cb.m۱۶۸۴۸a((View) title, 0.0f, 1.0f);
                    Cb.m۱۶۸۴۷a(this.f۱۳۴۰۷e, this.f۱۳۴۰۹g.get(itemIndex).m۱۶۸۴۴b(this.f۱۳۴۰۷e), icon, this.f۱۳۳۸۲C, this.f۱۳۳۸۱B, this.f۱۳۳۹۴O);
                    if (Build.VERSION.SDK_INT >= 21 && this.f۱۳۴۱۵m) {
                        int finalRadius = Math.max(getWidth(), getHeight());
                        int cx = ((int) this.f۱۳۴۱۰h.get(itemIndex).getX()) + (this.f۱۳۴۱۰h.get(itemIndex).getWidth() / 2);
                        int cy = this.f۱۳۴۱۰h.get(itemIndex).getHeight() / 2;
                        Animator animator = this.f۱۳۴۱۴l;
                        if (animator != null && animator.isRunning()) {
                            this.f۱۳۴۱۴l.cancel();
                            setBackgroundColor(this.f۱۳۴۰۹g.get(itemIndex).m۱۶۸۴۳a(this.f۱۳۴۰۷e));
                            this.f۱۳۴۱۳k.setBackgroundColor(0);
                        }
                        this.f۱۳۴۱۴l = ViewAnimationUtils.createCircularReveal(this.f۱۳۴۱۳k, cx, cy, 0.0f, (float) finalRadius);
                        this.f۱۳۴۱۴l.setStartDelay(5);
                        this.f۱۳۴۱۴l.addListener(new Ce(itemIndex));
                        this.f۱۳۴۱۴l.start();
                    } else if (this.f۱۳۴۱۵m) {
                        Cb.m۱۶۸۵۴c(this, this.f۱۳۴۲۲t, this.f۱۳۴۰۹g.get(itemIndex).m۱۶۸۴۳a(this.f۱۳۴۰۷e));
                    } else {
                        int i2 = this.f۱۳۳۸۰A;
                        if (i2 != 0) {
                            setBackgroundResource(i2);
                        } else {
                            setBackgroundColor(this.f۱۳۴۲۸z);
                        }
                        this.f۱۳۴۱۳k.setBackgroundColor(0);
                    }
                } else if (i == this.f۱۳۴۲۱s) {
                    View container2 = view.findViewById(Cf.bottom_navigation_small_container);
                    TextView title2 = (TextView) view.findViewById(Cf.bottom_navigation_small_item_title);
                    ImageView icon2 = (ImageView) view.findViewById(Cf.bottom_navigation_small_item_icon);
                    TextView notification2 = (TextView) view.findViewById(Cf.bottom_navigation_notification);
                    icon2.setSelected(false);
                    if (this.f۱۳۳۹۵P != EnumCh.ALWAYS_HIDE) {
                        Cb.m۱۶۸۵۳b((View) icon2, activeMarginTop, inactiveMargin);
                        Cb.m۱۶۸۴۹a((View) notification2, this.f۱۳۴۰۰U, this.f۱۳۴۰۱V);
                        Cb.m۱۶۸۵۳b((View) notification2, this.f۱۳۴۰۲W, this.f۱۳۴۰۳a0);
                        Cb.m۱۶۸۵۱a(title2, this.f۱۳۳۸۱B, this.f۱۳۳۸۲C);
                        Cb.m۱۶۸۵۲b(container2, this.f۱۳۳۹۲M, this.f۱۳۳۹۳N);
                    }
                    Cb.m۱۶۸۴۸a((View) title2, 1.0f, 0.0f);
                    Cb.m۱۶۸۴۷a(this.f۱۳۴۰۷e, this.f۱۳۴۰۹g.get(this.f۱۳۴۲۱s).m۱۶۸۴۴b(this.f۱۳۴۰۷e), icon2, this.f۱۳۳۸۱B, this.f۱۳۳۸۲C, this.f۱۳۳۹۴O);
                }
                i++;
                z = true;
            }
            this.f۱۳۴۲۱s = itemIndex;
            int i3 = this.f۱۳۴۲۱s;
            if (i3 > 0 && i3 < this.f۱۳۴۰۹g.size()) {
                this.f۱۳۴۲۲t = this.f۱۳۴۰۹g.get(this.f۱۳۴۲۱s).m۱۶۸۴۳a(this.f۱۳۴۰۷e);
            } else if (this.f۱۳۴۲۱s == -1) {
                int i4 = this.f۱۳۳۸۰A;
                if (i4 != 0) {
                    setBackgroundResource(i4);
                } else {
                    setBackgroundColor(this.f۱۳۴۲۸z);
                }
                this.f۱۳۴۱۳k.setBackgroundColor(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.aurelhubert.ahbottomnavigation.AHBottomNavigation$e  reason: invalid class name */
    public class Ce implements Animator.AnimatorListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ int f۱۳۴۳۶a;

        Ce(int i) {
            this.f۱۳۴۳۶a = i;
        }

        public void onAnimationStart(Animator animation) {
            AHBottomNavigation.this.f۱۳۴۱۳k.setBackgroundColor(((Ca) AHBottomNavigation.this.f۱۳۴۰۹g.get(this.f۱۳۴۳۶a)).m۱۶۸۴۳a(AHBottomNavigation.this.f۱۳۴۰۷e));
        }

        public void onAnimationEnd(Animator animation) {
            AHBottomNavigation aHBottomNavigation = AHBottomNavigation.this;
            aHBottomNavigation.setBackgroundColor(((Ca) aHBottomNavigation.f۱۳۴۰۹g.get(this.f۱۳۴۳۶a)).m۱۶۸۴۳a(AHBottomNavigation.this.f۱۳۴۰۷e));
            AHBottomNavigation.this.f۱۳۴۱۳k.setBackgroundColor(0);
        }

        public void onAnimationCancel(Animator animation) {
        }

        public void onAnimationRepeat(Animator animation) {
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۷۸۸a(boolean updateStyle, int itemPosition) {
        int i = 0;
        while (i < this.f۱۳۴۱۰h.size() && i < this.f۱۳۴۱۸p.size()) {
            if (itemPosition == -1 || itemPosition == i) {
                Ca notificationItem = this.f۱۳۴۱۸p.get(i);
                int currentTextColor = Cb.m۱۶۸۶۱b(notificationItem, this.f۱۳۳۹۶Q);
                int currentBackgroundColor = Cb.m۱۶۸۶۰a(notificationItem, this.f۱۳۳۹۷R);
                TextView notification = (TextView) this.f۱۳۴۱۰h.get(i).findViewById(Cf.bottom_navigation_notification);
                boolean animate = !notification.getText().toString().equals(String.valueOf(notificationItem.m۱۶۸۵۷b()));
                if (updateStyle) {
                    notification.setTextColor(currentTextColor);
                    Typeface typeface = this.f۱۳۳۹۹T;
                    if (typeface != null) {
                        notification.setTypeface(typeface);
                    } else {
                        notification.setTypeface(null, 1);
                    }
                    Drawable drawable = this.f۱۳۳۹۸S;
                    if (drawable != null) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            notification.setBackground(drawable.getConstantState().newDrawable());
                        } else {
                            notification.setBackgroundDrawable(drawable);
                        }
                    } else if (currentBackgroundColor != 0) {
                        Drawable defautlDrawable = android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۶c(this.f۱۳۴۰۷e, Ce.notification_background);
                        if (Build.VERSION.SDK_INT >= 16) {
                            notification.setBackground(Cb.m۱۶۸۴۶a(defautlDrawable, currentBackgroundColor, this.f۱۳۳۹۴O));
                        } else {
                            notification.setBackgroundDrawable(Cb.m۱۶۸۴۶a(defautlDrawable, currentBackgroundColor, this.f۱۳۳۹۴O));
                        }
                    }
                }
                if (notificationItem.m۱۶۸۵۹d() && notification.getText().length() > 0) {
                    notification.setText("");
                    if (animate) {
                        notification.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(this.f۱۳۴۰۴b0).start();
                    }
                } else if (!notificationItem.m۱۶۸۵۹d()) {
                    notification.setText(String.valueOf(notificationItem.m۱۶۸۵۷b()));
                    if (animate) {
                        notification.setScaleX(0.0f);
                        notification.setScaleY(0.0f);
                        notification.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(new OvershootInterpolator()).setDuration(this.f۱۳۴۰۴b0).start();
                    }
                }
            }
            i++;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۷۹۸a(Ca item) {
        if (this.f۱۳۴۰۹g.size() > 5) {
            Log.w(f۱۳۳۷۹c0, "The items list should not have more than 5 items");
        }
        this.f۱۳۴۰۹g.add(item);
        m۱۶۷۹۰b();
    }

    public int getItemsCount() {
        return this.f۱۳۴۰۹g.size();
    }

    public void setColored(boolean colored) {
        this.f۱۳۴۱۵m = colored;
        this.f۱۳۳۸۱B = colored ? this.f۱۳۳۸۶G : this.f۱۳۳۸۳D;
        this.f۱۳۳۸۲C = colored ? this.f۱۳۳۸۷H : this.f۱۳۳۸۵F;
        m۱۶۷۹۰b();
    }

    public int getDefaultBackgroundColor() {
        return this.f۱۳۴۲۸z;
    }

    public void setDefaultBackgroundColor(int defaultBackgroundColor) {
        this.f۱۳۴۲۸z = defaultBackgroundColor;
        m۱۶۷۹۰b();
    }

    public void setDefaultBackgroundResource(int defaultBackgroundResource) {
        this.f۱۳۳۸۰A = defaultBackgroundResource;
        m۱۶۷۹۰b();
    }

    public int getAccentColor() {
        return this.f۱۳۳۸۱B;
    }

    public void setAccentColor(int accentColor) {
        this.f۱۳۳۸۳D = accentColor;
        this.f۱۳۳۸۱B = accentColor;
        m۱۶۷۹۰b();
    }

    public int getInactiveColor() {
        return this.f۱۳۳۸۲C;
    }

    public void setInactiveColor(int inactiveColor) {
        this.f۱۳۳۸۵F = inactiveColor;
        this.f۱۳۳۸۲C = inactiveColor;
        m۱۶۷۹۰b();
    }

    public void setSelectedBackgroundVisible(boolean visible) {
        this.f۱۳۴۱۶n = visible;
        m۱۶۷۹۰b();
    }

    public void setTitleTypeface(Typeface typeface) {
        this.f۱۳۴۲۷y = typeface;
        m۱۶۷۹۰b();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۷۹۶a(float activeSize, float inactiveSize) {
        this.f۱۳۳۸۸I = activeSize;
        this.f۱۳۳۸۹J = inactiveSize;
        m۱۶۷۹۰b();
    }

    public int getCurrentItem() {
        return this.f۱۳۴۲۱s;
    }

    public void setCurrentItem(int position) {
        m۱۶۷۹۷a(position, true);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۷۹۷a(int position, boolean useCallback) {
        if (position >= this.f۱۳۴۰۹g.size()) {
            String str = f۱۳۳۷۹c0;
            Log.w(str, "The position is out of bounds of the items (" + this.f۱۳۴۰۹g.size() + " elements)");
        } else if (this.f۱۳۳۹۵P == EnumCh.ALWAYS_HIDE || !(this.f۱۳۴۰۹g.size() == 3 || this.f۱۳۳۹۵P == EnumCh.ALWAYS_SHOW)) {
            m۱۶۷۹۵c(position, useCallback);
        } else {
            m۱۶۷۹۱b(position, useCallback);
        }
    }

    public void setBehaviorTranslationEnabled(boolean behaviorTranslationEnabled) {
        this.f۱۳۴۲۳u = behaviorTranslationEnabled;
        if (getParent() instanceof CoordinatorLayout) {
            ViewGroup.LayoutParams params = getLayoutParams();
            AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.f۱۳۴۱۱i;
            if (aHBottomNavigationBehavior == null) {
                this.f۱۳۴۱۱i = new AHBottomNavigationBehavior<>(behaviorTranslationEnabled, this.f۱۳۳۹۱L);
            } else {
                aHBottomNavigationBehavior.m۱۶۸۱۷a(behaviorTranslationEnabled, this.f۱۳۳۹۱L);
            }
            AbstractCf fVar = this.f۱۳۴۰۶d;
            if (fVar != null) {
                this.f۱۳۴۱۱i.m۱۶۸۱۶a(fVar);
            }
            ((CoordinatorLayout.Cf) params).m۱۱۵۹۴a(this.f۱۳۴۱۱i);
            if (this.f۱۳۴۲۴v) {
                this.f۱۳۴۲۴v = false;
                this.f۱۳۴۱۱i.m۱۶۸۱۴a(this, this.f۱۳۳۹۰K, this.f۱۳۴۲۵w);
            }
        }
    }

    public void setTranslucentNavigationEnabled(boolean translucentNavigationEnabled) {
        this.f۱۳۴۱۷o = translucentNavigationEnabled;
    }

    public void setForceTint(boolean forceTint) {
        this.f۱۳۳۹۴O = forceTint;
        m۱۶۷۹۰b();
    }

    public EnumCh getTitleState() {
        return this.f۱۳۳۹۵P;
    }

    public void setTitleState(EnumCh titleState) {
        this.f۱۳۳۹۵P = titleState;
        m۱۶۷۹۰b();
    }

    public void setOnTabSelectedListener(AbstractCg tabSelectedListener) {
        this.f۱۳۴۰۵c = tabSelectedListener;
    }

    public void setOnNavigationPositionListener(AbstractCf navigationPositionListener) {
        this.f۱۳۴۰۶d = navigationPositionListener;
        AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.f۱۳۴۱۱i;
        if (aHBottomNavigationBehavior != null) {
            aHBottomNavigationBehavior.m۱۶۸۱۶a(navigationPositionListener);
        }
    }

    public void setNotificationTextColor(int textColor) {
        this.f۱۳۳۹۶Q = textColor;
        m۱۶۷۸۸a(true, -1);
    }

    public void setNotificationTextColorResource(int textColor) {
        this.f۱۳۳۹۶Q = android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(this.f۱۳۴۰۷e, textColor);
        m۱۶۷۸۸a(true, -1);
    }

    public void setNotificationBackground(Drawable drawable) {
        this.f۱۳۳۹۸S = drawable;
        m۱۶۷۸۸a(true, -1);
    }

    public void setNotificationBackgroundColor(int color) {
        this.f۱۳۳۹۷R = color;
        m۱۶۷۸۸a(true, -1);
    }

    public void setNotificationBackgroundColorResource(int color) {
        this.f۱۳۳۹۷R = android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(this.f۱۳۴۰۷e, color);
        m۱۶۷۸۸a(true, -1);
    }

    public void setNotificationTypeface(Typeface typeface) {
        this.f۱۳۳۹۹T = typeface;
        m۱۶۷۸۸a(true, -1);
    }

    public void setNotificationAnimationDuration(long notificationAnimationDuration) {
        this.f۱۳۴۰۴b0 = notificationAnimationDuration;
        m۱۶۷۸۸a(true, -1);
    }

    public void setUseElevation(boolean useElevation) {
        Cu.m۱۲۹۷۷a(this, useElevation ? this.f۱۳۴۰۸f.getDimension(Cd.bottom_navigation_elevation) : 0.0f);
        setClipToPadding(false);
    }

    public void setItemDisableColor(int itemDisableColor) {
        this.f۱۳۳۸۴E = itemDisableColor;
    }
}
