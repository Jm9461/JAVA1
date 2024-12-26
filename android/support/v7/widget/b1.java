package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.app.a;
import android.support.v7.widget.o0;
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

public class b1 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: c  reason: collision with root package name */
    Runnable f۱۹۷۸c;

    /* renamed from: d  reason: collision with root package name */
    private c f۱۹۷۹d;

    /* renamed from: e  reason: collision with root package name */
    o0 f۱۹۸۰e;

    /* renamed from: f  reason: collision with root package name */
    private Spinner f۱۹۸۱f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f۱۹۸۲g;

    /* renamed from: h  reason: collision with root package name */
    int f۱۹۸۳h;
    int i;
    private int j;
    private int k;

    static {
        new DecelerateInterpolator();
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        boolean canCollapse = true;
        boolean lockedExpanded = widthMode == 1073741824;
        setFillViewport(lockedExpanded);
        int childCount = this.f۱۹۸۰e.getChildCount();
        if (childCount <= 1 || !(widthMode == 1073741824 || widthMode == Integer.MIN_VALUE)) {
            this.f۱۹۸۳h = -1;
        } else {
            if (childCount > 2) {
                this.f۱۹۸۳h = (int) (((float) View.MeasureSpec.getSize(widthMeasureSpec)) * 0.4f);
            } else {
                this.f۱۹۸۳h = View.MeasureSpec.getSize(widthMeasureSpec) / 2;
            }
            this.f۱۹۸۳h = Math.min(this.f۱۹۸۳h, this.i);
        }
        int heightMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.j, 1073741824);
        if (lockedExpanded || !this.f۱۹۸۲g) {
            canCollapse = false;
        }
        if (canCollapse) {
            this.f۱۹۸۰e.measure(0, heightMeasureSpec2);
            if (this.f۱۹۸۰e.getMeasuredWidth() > View.MeasureSpec.getSize(widthMeasureSpec)) {
                c();
            } else {
                d();
            }
        } else {
            d();
        }
        int oldWidth = getMeasuredWidth();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec2);
        int newWidth = getMeasuredWidth();
        if (lockedExpanded && oldWidth != newWidth) {
            setTabSelected(this.k);
        }
    }

    private boolean b() {
        Spinner spinner = this.f۱۹۸۱f;
        return spinner != null && spinner.getParent() == this;
    }

    public void setAllowCollapse(boolean allowCollapse) {
        this.f۱۹۸۲g = allowCollapse;
    }

    private void c() {
        if (!b()) {
            if (this.f۱۹۸۱f == null) {
                this.f۱۹۸۱f = a();
            }
            removeView(this.f۱۹۸۰e);
            addView(this.f۱۹۸۱f, new ViewGroup.LayoutParams(-2, -1));
            if (this.f۱۹۸۱f.getAdapter() == null) {
                this.f۱۹۸۱f.setAdapter((SpinnerAdapter) new b());
            }
            Runnable runnable = this.f۱۹۷۸c;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f۱۹۷۸c = null;
            }
            this.f۱۹۸۱f.setSelection(this.k);
        }
    }

    private boolean d() {
        if (!b()) {
            return false;
        }
        removeView(this.f۱۹۸۱f);
        addView(this.f۱۹۸۰e, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f۱۹۸۱f.getSelectedItemPosition());
        return false;
    }

    public void setTabSelected(int position) {
        this.k = position;
        int tabCount = this.f۱۹۸۰e.getChildCount();
        int i2 = 0;
        while (i2 < tabCount) {
            View child = this.f۱۹۸۰e.getChildAt(i2);
            boolean isSelected = i2 == position;
            child.setSelected(isSelected);
            if (isSelected) {
                a(position);
            }
            i2++;
        }
        Spinner spinner = this.f۱۹۸۱f;
        if (spinner != null && position >= 0) {
            spinner.setSelection(position);
        }
    }

    public void setContentHeight(int contentHeight) {
        this.j = contentHeight;
        requestLayout();
    }

    private Spinner a() {
        Spinner spinner = new v(getContext(), null, a.b.h.a.a.actionDropDownStyle);
        spinner.setLayoutParams(new o0.a(-2, -1));
        spinner.setOnItemSelectedListener(this);
        return spinner;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        a.b.h.f.a abp = a.b.h.f.a.a(getContext());
        setContentHeight(abp.e());
        this.i = abp.d();
    }

    public void a(int position) {
        View tabView = this.f۱۹۸۰e.getChildAt(position);
        Runnable runnable = this.f۱۹۷۸c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f۱۹۷۸c = new a(tabView);
        post(this.f۱۹۷۸c);
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f۱۹۸۴c;

        a(View view) {
            this.f۱۹۸۴c = view;
        }

        public void run() {
            b1.this.smoothScrollTo(this.f۱۹۸۴c.getLeft() - ((b1.this.getWidth() - this.f۱۹۸۴c.getWidth()) / 2), 0);
            b1.this.f۱۹۷۸c = null;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f۱۹۷۸c;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f۱۹۷۸c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    public d a(a.c tab, boolean forAdapter) {
        d tabView = new d(getContext(), tab, forAdapter);
        if (forAdapter) {
            tabView.setBackgroundDrawable(null);
            tabView.setLayoutParams(new AbsListView.LayoutParams(-1, this.j));
        } else {
            tabView.setFocusable(true);
            if (this.f۱۹۷۹d == null) {
                this.f۱۹۷۹d = new c();
            }
            tabView.setOnClickListener(this.f۱۹۷۹d);
        }
        return tabView;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        ((d) view).a().e();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    /* access modifiers changed from: private */
    public class d extends LinearLayout {

        /* renamed from: c  reason: collision with root package name */
        private final int[] f۱۹۸۸c = {16842964};

        /* renamed from: d  reason: collision with root package name */
        private a.c f۱۹۸۹d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f۱۹۹۰e;

        /* renamed from: f  reason: collision with root package name */
        private ImageView f۱۹۹۱f;

        /* renamed from: g  reason: collision with root package name */
        private View f۱۹۹۲g;

        public d(Context context, a.c tab, boolean forList) {
            super(context, null, a.b.h.a.a.actionBarTabStyle);
            this.f۱۹۸۹d = tab;
            j1 a2 = j1.a(context, null, this.f۱۹۸۸c, a.b.h.a.a.actionBarTabStyle, 0);
            if (a2.g(0)) {
                setBackgroundDrawable(a2.b(0));
            }
            a2.a();
            if (forList) {
                setGravity(8388627);
            }
            b();
        }

        public void a(a.c tab) {
            this.f۱۹۸۹d = tab;
            b();
        }

        public void setSelected(boolean selected) {
            boolean changed = isSelected() != selected;
            super.setSelected(selected);
            if (changed && selected) {
                sendAccessibilityEvent(4);
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
            super.onInitializeAccessibilityEvent(event);
            event.setClassName(a.c.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info2) {
            super.onInitializeAccessibilityNodeInfo(info2);
            info2.setClassName(a.c.class.getName());
        }

        public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            int i;
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            if (b1.this.f۱۹۸۳h > 0 && getMeasuredWidth() > (i = b1.this.f۱۹۸۳h)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), heightMeasureSpec);
            }
        }

        public void b() {
            a.c tab = this.f۱۹۸۹d;
            View custom = tab.b();
            CharSequence charSequence = null;
            if (custom != null) {
                ViewParent customParent = custom.getParent();
                if (customParent != this) {
                    if (customParent != null) {
                        ((ViewGroup) customParent).removeView(custom);
                    }
                    addView(custom);
                }
                this.f۱۹۹۲g = custom;
                TextView textView = this.f۱۹۹۰e;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f۱۹۹۱f;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f۱۹۹۱f.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f۱۹۹۲g;
            if (view != null) {
                removeView(view);
                this.f۱۹۹۲g = null;
            }
            Drawable icon = tab.c();
            CharSequence text = tab.d();
            if (icon != null) {
                if (this.f۱۹۹۱f == null) {
                    ImageView iconView = new o(getContext());
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-2, -2);
                    lp.gravity = 16;
                    iconView.setLayoutParams(lp);
                    addView(iconView, 0);
                    this.f۱۹۹۱f = iconView;
                }
                this.f۱۹۹۱f.setImageDrawable(icon);
                this.f۱۹۹۱f.setVisibility(0);
            } else {
                ImageView imageView2 = this.f۱۹۹۱f;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f۱۹۹۱f.setImageDrawable(null);
                }
            }
            boolean hasText = !TextUtils.isEmpty(text);
            if (hasText) {
                if (this.f۱۹۹۰e == null) {
                    TextView textView2 = new AppCompatTextView(getContext(), null, a.b.h.a.a.actionBarTabTextStyle);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(-2, -2);
                    lp2.gravity = 16;
                    textView2.setLayoutParams(lp2);
                    addView(textView2);
                    this.f۱۹۹۰e = textView2;
                }
                this.f۱۹۹۰e.setText(text);
                this.f۱۹۹۰e.setVisibility(0);
            } else {
                TextView textView3 = this.f۱۹۹۰e;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                    this.f۱۹۹۰e.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f۱۹۹۱f;
            if (imageView3 != null) {
                imageView3.setContentDescription(tab.a());
            }
            if (!hasText) {
                charSequence = tab.a();
            }
            l1.a(this, charSequence);
        }

        public a.c a() {
            return this.f۱۹۸۹d;
        }
    }

    /* access modifiers changed from: private */
    public class b extends BaseAdapter {
        b() {
        }

        public int getCount() {
            return b1.this.f۱۹۸۰e.getChildCount();
        }

        public Object getItem(int position) {
            return ((d) b1.this.f۱۹۸۰e.getChildAt(position)).a();
        }

        public long getItemId(int position) {
            return (long) position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                return b1.this.a((a.c) getItem(position), true);
            }
            ((d) convertView).a((a.c) getItem(position));
            return convertView;
        }
    }

    /* access modifiers changed from: private */
    public class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            ((d) view).a().e();
            int tabCount = b1.this.f۱۹۸۰e.getChildCount();
            for (int i = 0; i < tabCount; i++) {
                View child = b1.this.f۱۹۸۰e.getChildAt(i);
                child.setSelected(child == view);
            }
        }
    }
}
