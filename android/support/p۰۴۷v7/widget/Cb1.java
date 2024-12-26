package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۷v7.app.AbstractCa;
import android.support.p۰۴۷v7.widget.Co0;
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
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca;

/* renamed from: android.support.v7.widget.b1  reason: invalid class name */
public class Cb1 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: c  reason: contains not printable characters */
    Runnable f۱۱۹۱۴c;

    /* renamed from: d  reason: contains not printable characters */
    private View$OnClickListenerCc f۱۱۹۱۵d;

    /* renamed from: e  reason: contains not printable characters */
    Co0 f۱۱۹۱۶e;

    /* renamed from: f  reason: contains not printable characters */
    private Spinner f۱۱۹۱۷f;

    /* renamed from: g  reason: contains not printable characters */
    private boolean f۱۱۹۱۸g;

    /* renamed from: h  reason: contains not printable characters */
    int f۱۱۹۱۹h;

    /* renamed from: i  reason: contains not printable characters */
    int f۱۱۹۲۰i;

    /* renamed from: j  reason: contains not printable characters */
    private int f۱۱۹۲۱j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۱۱۹۲۲k;

    static {
        new DecelerateInterpolator();
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        boolean canCollapse = true;
        boolean lockedExpanded = widthMode == 1073741824;
        setFillViewport(lockedExpanded);
        int childCount = this.f۱۱۹۱۶e.getChildCount();
        if (childCount <= 1 || !(widthMode == 1073741824 || widthMode == Integer.MIN_VALUE)) {
            this.f۱۱۹۱۹h = -1;
        } else {
            if (childCount > 2) {
                this.f۱۱۹۱۹h = (int) (((float) View.MeasureSpec.getSize(widthMeasureSpec)) * 0.4f);
            } else {
                this.f۱۱۹۱۹h = View.MeasureSpec.getSize(widthMeasureSpec) / 2;
            }
            this.f۱۱۹۱۹h = Math.min(this.f۱۱۹۱۹h, this.f۱۱۹۲۰i);
        }
        int heightMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f۱۱۹۲۱j, 1073741824);
        if (lockedExpanded || !this.f۱۱۹۱۸g) {
            canCollapse = false;
        }
        if (canCollapse) {
            this.f۱۱۹۱۶e.measure(0, heightMeasureSpec2);
            if (this.f۱۱۹۱۶e.getMeasuredWidth() > View.MeasureSpec.getSize(widthMeasureSpec)) {
                m۱۵۰۰۰c();
            } else {
                m۱۵۰۰۱d();
            }
        } else {
            m۱۵۰۰۱d();
        }
        int oldWidth = getMeasuredWidth();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec2);
        int newWidth = getMeasuredWidth();
        if (lockedExpanded && oldWidth != newWidth) {
            setTabSelected(this.f۱۱۹۲۲k);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۴۹۹۹b() {
        Spinner spinner = this.f۱۱۹۱۷f;
        return spinner != null && spinner.getParent() == this;
    }

    public void setAllowCollapse(boolean allowCollapse) {
        this.f۱۱۹۱۸g = allowCollapse;
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۵۰۰۰c() {
        if (!m۱۴۹۹۹b()) {
            if (this.f۱۱۹۱۷f == null) {
                this.f۱۱۹۱۷f = m۱۴۹۹۸a();
            }
            removeView(this.f۱۱۹۱۶e);
            addView(this.f۱۱۹۱۷f, new ViewGroup.LayoutParams(-2, -1));
            if (this.f۱۱۹۱۷f.getAdapter() == null) {
                this.f۱۱۹۱۷f.setAdapter((SpinnerAdapter) new Cb());
            }
            Runnable runnable = this.f۱۱۹۱۴c;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f۱۱۹۱۴c = null;
            }
            this.f۱۱۹۱۷f.setSelection(this.f۱۱۹۲۲k);
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private boolean m۱۵۰۰۱d() {
        if (!m۱۴۹۹۹b()) {
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
                m۱۵۰۰۳a(position);
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

    /* renamed from: a  reason: contains not printable characters */
    private Spinner m۱۴۹۹۸a() {
        Spinner spinner = new Cv(getContext(), null, Ca.actionDropDownStyle);
        spinner.setLayoutParams(new Co0.Ca(-2, -1));
        spinner.setOnItemSelectedListener(this);
        return spinner;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Ca abp = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Ca.m۱۰۷۶۴a(getContext());
        setContentHeight(abp.m۱۰۷۶۹e());
        this.f۱۱۹۲۰i = abp.m۱۰۷۶۸d();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۰۰۳a(int position) {
        View tabView = this.f۱۱۹۱۶e.getChildAt(position);
        Runnable runnable = this.f۱۱۹۱۴c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f۱۱۹۱۴c = new RunnableCa(tabView);
        post(this.f۱۱۹۱۴c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.b1$a  reason: invalid class name */
    public class RunnableCa implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ View f۱۱۹۲۳c;

        RunnableCa(View view) {
            this.f۱۱۹۲۳c = view;
        }

        public void run() {
            Cb1.this.smoothScrollTo(this.f۱۱۹۲۳c.getLeft() - ((Cb1.this.getWidth() - this.f۱۱۹۲۳c.getWidth()) / 2), 0);
            Cb1.this.f۱۱۹۱۴c = null;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f۱۱۹۱۴c;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f۱۱۹۱۴c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Cd m۱۵۰۰۲a(AbstractCa.AbstractCc tab, boolean forAdapter) {
        Cd tabView = new Cd(getContext(), tab, forAdapter);
        if (forAdapter) {
            tabView.setBackgroundDrawable(null);
            tabView.setLayoutParams(new AbsListView.LayoutParams(-1, this.f۱۱۹۲۱j));
        } else {
            tabView.setFocusable(true);
            if (this.f۱۱۹۱۵d == null) {
                this.f۱۱۹۱۵d = new View$OnClickListenerCc();
            }
            tabView.setOnClickListener(this.f۱۱۹۱۵d);
        }
        return tabView;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        ((Cd) view).m۱۵۰۰۴a().m۱۳۴۳۸e();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.b1$d  reason: invalid class name */
    public class Cd extends LinearLayout {

        /* renamed from: c  reason: contains not printable characters */
        private final int[] f۱۱۹۲۷c = {16842964};

        /* renamed from: d  reason: contains not printable characters */
        private AbstractCa.AbstractCc f۱۱۹۲۸d;

        /* renamed from: e  reason: contains not printable characters */
        private TextView f۱۱۹۲۹e;

        /* renamed from: f  reason: contains not printable characters */
        private ImageView f۱۱۹۳۰f;

        /* renamed from: g  reason: contains not printable characters */
        private View f۱۱۹۳۱g;

        public Cd(Context context, AbstractCa.AbstractCc tab, boolean forList) {
            super(context, null, Ca.actionBarTabStyle);
            this.f۱۱۹۲۸d = tab;
            Cj1 a = Cj1.m۱۵۳۴۵a(context, null, this.f۱۱۹۲۷c, Ca.actionBarTabStyle, 0);
            if (a.m۱۵۳۶۴g(0)) {
                setBackgroundDrawable(a.m۱۵۳۵۴b(0));
            }
            a.m۱۵۳۵۰a();
            if (forList) {
                setGravity(8388627);
            }
            m۱۵۰۰۶b();
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۰۰۵a(AbstractCa.AbstractCc tab) {
            this.f۱۱۹۲۸d = tab;
            m۱۵۰۰۶b();
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
            event.setClassName(AbstractCa.AbstractCc.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info2) {
            super.onInitializeAccessibilityNodeInfo(info2);
            info2.setClassName(AbstractCa.AbstractCc.class.getName());
        }

        public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            int i;
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            if (Cb1.this.f۱۱۹۱۹h > 0 && getMeasuredWidth() > (i = Cb1.this.f۱۱۹۱۹h)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), heightMeasureSpec);
            }
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۵۰۰۶b() {
            AbstractCa.AbstractCc tab = this.f۱۱۹۲۸d;
            View custom = tab.m۱۳۴۳۵b();
            CharSequence charSequence = null;
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
            Drawable icon = tab.m۱۳۴۳۶c();
            CharSequence text = tab.m۱۳۴۳۷d();
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
                imageView3.setContentDescription(tab.m۱۳۴۳۴a());
            }
            if (!hasText) {
                charSequence = tab.m۱۳۴۳۴a();
            }
            Cl1.m۱۵۴۱۷a(this, charSequence);
        }

        /* renamed from: a  reason: contains not printable characters */
        public AbstractCa.AbstractCc m۱۵۰۰۴a() {
            return this.f۱۱۹۲۸d;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.b1$b  reason: invalid class name */
    public class Cb extends BaseAdapter {
        Cb() {
        }

        public int getCount() {
            return Cb1.this.f۱۱۹۱۶e.getChildCount();
        }

        public Object getItem(int position) {
            return ((Cd) Cb1.this.f۱۱۹۱۶e.getChildAt(position)).m۱۵۰۰۴a();
        }

        public long getItemId(int position) {
            return (long) position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                return Cb1.this.m۱۵۰۰۲a((AbstractCa.AbstractCc) getItem(position), true);
            }
            ((Cd) convertView).m۱۵۰۰۵a((AbstractCa.AbstractCc) getItem(position));
            return convertView;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.b1$c  reason: invalid class name */
    public class View$OnClickListenerCc implements View.OnClickListener {
        View$OnClickListenerCc() {
        }

        public void onClick(View view) {
            ((Cd) view).m۱۵۰۰۴a().m۱۳۴۳۸e();
            int tabCount = Cb1.this.f۱۱۹۱۶e.getChildCount();
            for (int i = 0; i < tabCount; i++) {
                View child = Cb1.this.f۱۱۹۱۶e.getChildAt(i);
                child.setSelected(child == view);
            }
        }
    }
}
