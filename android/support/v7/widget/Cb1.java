package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AbstractCa;
import android.support.v7.widget.Co0;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca;

/* renamed from: android.support.v7.widget.b1, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb1 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: c, reason: contains not printable characters */
    Runnable f۱۱۹۱۴c;

    /* renamed from: d, reason: contains not printable characters */
    private c f۱۱۹۱۵d;

    /* renamed from: e, reason: contains not printable characters */
    Co0 f۱۱۹۱۶e;

    /* renamed from: f, reason: contains not printable characters */
    private Spinner f۱۱۹۱۷f;

    /* renamed from: g, reason: contains not printable characters */
    private boolean f۱۱۹۱۸g;

    /* renamed from: h, reason: contains not printable characters */
    int f۱۱۹۱۹h;

    /* renamed from: i, reason: contains not printable characters */
    int f۱۱۹۲۰i;

    /* renamed from: j, reason: contains not printable characters */
    private int f۱۱۹۲۱j;

    /* renamed from: k, reason: contains not printable characters */
    private int f۱۱۹۲۲k;

    static {
        new DecelerateInterpolator();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        boolean lockedExpanded = widthMode == 1073741824;
        setFillViewport(lockedExpanded);
        int childCount = this.f۱۱۹۱۶e.getChildCount();
        if (childCount > 1 && (widthMode == 1073741824 || widthMode == Integer.MIN_VALUE)) {
            if (childCount <= 2) {
                this.f۱۱۹۱۹h = View.MeasureSpec.getSize(widthMeasureSpec) / 2;
            } else {
                this.f۱۱۹۱۹h = (int) (View.MeasureSpec.getSize(widthMeasureSpec) * 0.4f);
            }
            this.f۱۱۹۱۹h = Math.min(this.f۱۱۹۱۹h, this.f۱۱۹۲۰i);
        } else {
            this.f۱۱۹۱۹h = -1;
        }
        int heightMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f۱۱۹۲۱j, 1073741824);
        boolean canCollapse = !lockedExpanded && this.f۱۱۹۱۸g;
        if (canCollapse) {
            this.f۱۱۹۱۶e.measure(0, heightMeasureSpec2);
            if (this.f۱۱۹۱۶e.getMeasuredWidth() > View.MeasureSpec.getSize(widthMeasureSpec)) {
                m۱۲۹۳۰c();
            } else {
                m۱۲۹۳۱d();
            }
        } else {
            m۱۲۹۳۱d();
        }
        int oldWidth = getMeasuredWidth();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec2);
        int newWidth = getMeasuredWidth();
        if (lockedExpanded && oldWidth != newWidth) {
            setTabSelected(this.f۱۱۹۲۲k);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private boolean m۱۲۹۲۹b() {
        Spinner spinner = this.f۱۱۹۱۷f;
        return spinner != null && spinner.getParent() == this;
    }

    public void setAllowCollapse(boolean allowCollapse) {
        this.f۱۱۹۱۸g = allowCollapse;
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۱۲۹۳۰c() {
        if (m۱۲۹۲۹b()) {
            return;
        }
        if (this.f۱۱۹۱۷f == null) {
            this.f۱۱۹۱۷f = m۱۲۹۲۸a();
        }
        removeView(this.f۱۱۹۱۶e);
        addView(this.f۱۱۹۱۷f, new ViewGroup.LayoutParams(-2, -1));
        if (this.f۱۱۹۱۷f.getAdapter() == null) {
            this.f۱۱۹۱۷f.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f۱۱۹۱۴c;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f۱۱۹۱۴c = null;
        }
        this.f۱۱۹۱۷f.setSelection(this.f۱۱۹۲۲k);
    }

    /* renamed from: d, reason: contains not printable characters */
    private boolean m۱۲۹۳۱d() {
        if (!m۱۲۹۲۹b()) {
            return false;
        }
        removeView(this.f۱۱۹۱۷f);
        addView(this.f۱۱۹۱۶e, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f۱۱۹۱۷f.getSelectedItemPosition());
        return false;
    }

    public void setTabSelected(int position) {
        this.f۱۱۹۲۲k = position;
        int tabCount = this.f۱۱۹۱۶e.getChildCount();
        int i = 0;
        while (i < tabCount) {
            View child = this.f۱۱۹۱۶e.getChildAt(i);
            boolean isSelected = i == position;
            child.setSelected(isSelected);
            if (isSelected) {
                m۱۲۹۳۳a(position);
            }
            i++;
        }
        Spinner spinner = this.f۱۱۹۱۷f;
        if (spinner != null && position >= 0) {
            spinner.setSelection(position);
        }
    }

    public void setContentHeight(int contentHeight) {
        this.f۱۱۹۲۱j = contentHeight;
        requestLayout();
    }

    /* renamed from: a, reason: contains not printable characters */
    private Spinner m۱۲۹۲۸a() {
        Spinner spinner = new Cv(getContext(), null, Ca.actionDropDownStyle);
        spinner.setLayoutParams(new Co0.a(-2, -1));
        spinner.setOnItemSelectedListener(this);
        return spinner;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.Ca abp = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.Ca.m۸۶۹۵a(getContext());
        setContentHeight(abp.m۸۷۰۰e());
        this.f۱۱۹۲۰i = abp.m۸۶۹۹d();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۲۹۳۳a(int position) {
        View tabView = this.f۱۱۹۱۶e.getChildAt(position);
        Runnable runnable = this.f۱۱۹۱۴c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f۱۱۹۱۴c = new a(tabView);
        post(this.f۱۱۹۱۴c);
    }

    /* renamed from: android.support.v7.widget.b1$a */
    class a implements Runnable {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ View f۱۱۹۲۳c;

        a(View view) {
            this.f۱۱۹۲۳c = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            int scrollPos = this.f۱۱۹۲۳c.getLeft() - ((Cb1.this.getWidth() - this.f۱۱۹۲۳c.getWidth()) / 2);
            Cb1.this.smoothScrollTo(scrollPos, 0);
            Cb1.this.f۱۱۹۱۴c = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f۱۱۹۱۴c;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f۱۱۹۱۴c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    d m۱۲۹۳۲a(AbstractCa.c tab, boolean forAdapter) {
        d tabView = new d(getContext(), tab, forAdapter);
        if (forAdapter) {
            tabView.setBackgroundDrawable(null);
            tabView.setLayoutParams(new AbsListView.LayoutParams(-1, this.f۱۱۹۲۱j));
        } else {
            tabView.setFocusable(true);
            if (this.f۱۱۹۱۵d == null) {
                this.f۱۱۹۱۵d = new c();
            }
            tabView.setOnClickListener(this.f۱۱۹۱۵d);
        }
        return tabView;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        d tabView = (d) view;
        tabView.m۱۲۹۳۴a().m۱۱۳۶۸e();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    /* renamed from: android.support.v7.widget.b1$d */
    private class d extends LinearLayout {

        /* renamed from: c, reason: contains not printable characters */
        private final int[] f۱۱۹۲۷c;

        /* renamed from: d, reason: contains not printable characters */
        private AbstractCa.c f۱۱۹۲۸d;

        /* renamed from: e, reason: contains not printable characters */
        private TextView f۱۱۹۲۹e;

        /* renamed from: f, reason: contains not printable characters */
        private ImageView f۱۱۹۳۰f;

        /* renamed from: g, reason: contains not printable characters */
        private View f۱۱۹۳۱g;

        public d(Context context, AbstractCa.c tab, boolean forList) {
            super(context, null, Ca.actionBarTabStyle);
            this.f۱۱۹۲۷c = new int[]{R.attr.background};
            this.f۱۱۹۲۸d = tab;
            Cj1 a2 = Cj1.m۱۳۲۷۵a(context, null, this.f۱۱۹۲۷c, Ca.actionBarTabStyle, 0);
            if (a2.m۱۳۲۹۴g(0)) {
                setBackgroundDrawable(a2.m۱۳۲۸۴b(0));
            }
            a2.m۱۳۲۸۰a();
            if (forList) {
                setGravity(8388627);
            }
            m۱۲۹۳۶b();
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۱۲۹۳۵a(AbstractCa.c tab) {
            this.f۱۱۹۲۸d = tab;
            m۱۲۹۳۶b();
        }

        @Override // android.view.View
        public void setSelected(boolean selected) {
            boolean changed = isSelected() != selected;
            super.setSelected(selected);
            if (changed && selected) {
                sendAccessibilityEvent(4);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
            super.onInitializeAccessibilityEvent(event);
            event.setClassName(AbstractCa.c.class.getName());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info2) {
            super.onInitializeAccessibilityNodeInfo(info2);
            info2.setClassName(AbstractCa.c.class.getName());
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            if (Cb1.this.f۱۱۹۱۹h > 0) {
                int measuredWidth = getMeasuredWidth();
                int i = Cb1.this.f۱۱۹۱۹h;
                if (measuredWidth > i) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), heightMeasureSpec);
                }
            }
        }

        /* renamed from: b, reason: contains not printable characters */
        public void m۱۲۹۳۶b() {
            AbstractCa.c tab = this.f۱۱۹۲۸d;
            View custom = tab.m۱۱۳۶۵b();
            if (custom != null) {
                ViewParent customParent = custom.getParent();
                if (customParent != this) {
                    if (customParent != null) {
                        ((ViewGroup) customParent).removeView(custom);
                    }
                    addView(custom);
                }
                this.f۱۱۹۳۱g = custom;
                TextView textView = this.f۱۱۹۲۹e;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f۱۱۹۳۰f;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f۱۱۹۳۰f.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f۱۱۹۳۱g;
            if (view != null) {
                removeView(view);
                this.f۱۱۹۳۱g = null;
            }
            Drawable icon = tab.m۱۱۳۶۶c();
            CharSequence text = tab.m۱۱۳۶۷d();
            if (icon != null) {
                if (this.f۱۱۹۳۰f == null) {
                    ImageView iconView = new Co(getContext());
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-2, -2);
                    lp.gravity = 16;
                    iconView.setLayoutParams(lp);
                    addView(iconView, 0);
                    this.f۱۱۹۳۰f = iconView;
                }
                this.f۱۱۹۳۰f.setImageDrawable(icon);
                this.f۱۱۹۳۰f.setVisibility(0);
            } else {
                ImageView imageView2 = this.f۱۱۹۳۰f;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f۱۱۹۳۰f.setImageDrawable(null);
                }
            }
            boolean hasText = !TextUtils.isEmpty(text);
            if (hasText) {
                if (this.f۱۱۹۲۹e == null) {
                    TextView textView2 = new AppCompatTextView(getContext(), null, Ca.actionBarTabTextStyle);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(-2, -2);
                    lp2.gravity = 16;
                    textView2.setLayoutParams(lp2);
                    addView(textView2);
                    this.f۱۱۹۲۹e = textView2;
                }
                this.f۱۱۹۲۹e.setText(text);
                this.f۱۱۹۲۹e.setVisibility(0);
            } else {
                TextView textView3 = this.f۱۱۹۲۹e;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                    this.f۱۱۹۲۹e.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f۱۱۹۳۰f;
            if (imageView3 != null) {
                imageView3.setContentDescription(tab.m۱۱۳۶۴a());
            }
            Cl1.m۱۳۳۴۷a(this, hasText ? null : tab.m۱۱۳۶۴a());
        }

        /* renamed from: a, reason: contains not printable characters */
        public AbstractCa.c m۱۲۹۳۴a() {
            return this.f۱۱۹۲۸d;
        }
    }

    /* renamed from: android.support.v7.widget.b1$b */
    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return Cb1.this.f۱۱۹۱۶e.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int position) {
            return ((d) Cb1.this.f۱۱۹۱۶e.getChildAt(position)).m۱۲۹۳۴a();
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                return Cb1.this.m۱۲۹۳۲a((AbstractCa.c) getItem(position), true);
            }
            ((d) convertView).m۱۲۹۳۵a((AbstractCa.c) getItem(position));
            return convertView;
        }
    }

    /* renamed from: android.support.v7.widget.b1$c */
    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d tabView = (d) view;
            tabView.m۱۲۹۳۴a().m۱۱۳۶۸e();
            int tabCount = Cb1.this.f۱۱۹۱۶e.getChildCount();
            for (int i = 0; i < tabCount; i++) {
                View child = Cb1.this.f۱۱۹۱۶e.getChildAt(i);
                child.setSelected(child == view);
            }
        }
    }
}
