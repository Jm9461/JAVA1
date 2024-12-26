package android.support.p۰۴۷v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.p۰۴۷v7.view.menu.AbstractCq;
import android.support.p۰۴۷v7.view.menu.Ch;
import android.support.p۰۴۷v7.widget.AbstractView$OnTouchListenerCl0;
import android.support.p۰۴۷v7.widget.ActionMenuView;
import android.support.p۰۴۷v7.widget.AppCompatTextView;
import android.support.p۰۴۷v7.widget.Cl1;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;

/* renamed from: android.support.v7.view.menu.ActionMenuItemView */
public class ActionMenuItemView extends AppCompatTextView implements AbstractCq.AbstractCa, View.OnClickListener, ActionMenuView.AbstractCa {

    /* renamed from: f  reason: contains not printable characters */
    Ck f۱۱۱۴۳f;

    /* renamed from: g  reason: contains not printable characters */
    private CharSequence f۱۱۱۴۴g;

    /* renamed from: h  reason: contains not printable characters */
    private Drawable f۱۱۱۴۵h;

    /* renamed from: i  reason: contains not printable characters */
    Ch.AbstractCb f۱۱۱۴۶i;

    /* renamed from: j  reason: contains not printable characters */
    private AbstractView$OnTouchListenerCl0 f۱۱۱۴۷j;

    /* renamed from: k  reason: contains not printable characters */
    AbstractCb f۱۱۱۴۸k;

    /* renamed from: l  reason: contains not printable characters */
    private boolean f۱۱۱۴۹l;

    /* renamed from: m  reason: contains not printable characters */
    private boolean f۱۱۱۵۰m;

    /* renamed from: n  reason: contains not printable characters */
    private int f۱۱۱۵۱n;

    /* renamed from: o  reason: contains not printable characters */
    private int f۱۱۱۵۲o;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۱۱۵۳p;

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$b  reason: invalid class name */
    public static abstract class AbstractCb {
        /* renamed from: a  reason: contains not printable characters */
        public abstract AbstractCt m۱۳۷۴۴a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Resources res = context.getResources();
        this.f۱۱۱۴۹l = m۱۳۷۳۵e();
        TypedArray a = context.obtainStyledAttributes(attrs, Cj.ActionMenuItemView, defStyle, 0);
        this.f۱۱۱۵۱n = a.getDimensionPixelSize(Cj.ActionMenuItemView_android_minWidth, 0);
        a.recycle();
        this.f۱۱۱۵۳p = (int) ((32.0f * res.getDisplayMetrics().density) + 0.5f);
        setOnClickListener(this);
        this.f۱۱۱۵۲o = -1;
        setSaveEnabled(false);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.f۱۱۱۴۹l = m۱۳۷۳۵e();
        m۱۳۷۳۶f();
    }

    /* renamed from: e  reason: contains not printable characters */
    private boolean m۱۳۷۳۵e() {
        Configuration config = getContext().getResources().getConfiguration();
        int widthDp = config.screenWidthDp;
        return widthDp >= 480 || (widthDp >= 640 && config.screenHeightDp >= 480) || config.orientation == 2;
    }

    public void setPadding(int l, int t, int r, int b) {
        this.f۱۱۱۵۲o = l;
        super.setPadding(l, t, r, b);
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCq.AbstractCa
    public Ck getItemData() {
        return this.f۱۱۱۴۳f;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCq.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۷۳۷a(Ck itemData, int menuType) {
        this.f۱۱۱۴۳f = itemData;
        setIcon(itemData.getIcon());
        setTitle(itemData.m۱۳۸۹۹a(this));
        setId(itemData.getItemId());
        setVisibility(itemData.isVisible() ? 0 : 8);
        setEnabled(itemData.isEnabled());
        if (itemData.hasSubMenu() && this.f۱۱۱۴۷j == null) {
            this.f۱۱۱۴۷j = new Ca();
        }
    }

    public boolean onTouchEvent(MotionEvent e) {
        AbstractView$OnTouchListenerCl0 l0Var;
        if (!this.f۱۱۱۴۳f.hasSubMenu() || (l0Var = this.f۱۱۱۴۷j) == null || !l0Var.onTouch(this, e)) {
            return super.onTouchEvent(e);
        }
        return true;
    }

    public void onClick(View v) {
        Ch.AbstractCb bVar = this.f۱۱۱۴۶i;
        if (bVar != null) {
            bVar.m۱۳۸۹۰a(this.f۱۱۱۴۳f);
        }
    }

    public void setItemInvoker(Ch.AbstractCb invoker) {
        this.f۱۱۱۴۶i = invoker;
    }

    public void setPopupCallback(AbstractCb popupCallback) {
        this.f۱۱۱۴۸k = popupCallback;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCq.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۷۳۸a() {
        return true;
    }

    public void setCheckable(boolean checkable) {
    }

    public void setChecked(boolean checked) {
    }

    public void setExpandedFormat(boolean expandedFormat) {
        if (this.f۱۱۱۵۰m != expandedFormat) {
            this.f۱۱۱۵۰m = expandedFormat;
            Ck kVar = this.f۱۱۱۴۳f;
            if (kVar != null) {
                kVar.m۱۳۹۰۳b();
            }
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۳۷۳۶f() {
        boolean z = true;
        boolean visible = !TextUtils.isEmpty(this.f۱۱۱۴۴g);
        if (this.f۱۱۱۴۵h != null && (!this.f۱۱۱۴۳f.m۱۳۹۱۹n() || (!this.f۱۱۱۴۹l && !this.f۱۱۱۵۰m))) {
            z = false;
        }
        boolean visible2 = visible & z;
        CharSequence charSequence = null;
        setText(visible2 ? this.f۱۱۱۴۴g : null);
        CharSequence contentDescription = this.f۱۱۱۴۳f.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(visible2 ? null : this.f۱۱۱۴۳f.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f۱۱۱۴۳f.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!visible2) {
                charSequence = this.f۱۱۱۴۳f.getTitle();
            }
            Cl1.m۱۵۴۱۷a(this, charSequence);
            return;
        }
        Cl1.m۱۵۴۱۷a(this, tooltipText);
    }

    public void setIcon(Drawable icon) {
        this.f۱۱۱۴۵h = icon;
        if (icon != null) {
            int width = icon.getIntrinsicWidth();
            int height = icon.getIntrinsicHeight();
            int i = this.f۱۱۱۵۳p;
            if (width > i) {
                float scale = ((float) i) / ((float) width);
                width = this.f۱۱۱۵۳p;
                height = (int) (((float) height) * scale);
            }
            int i2 = this.f۱۱۱۵۳p;
            if (height > i2) {
                float scale2 = ((float) i2) / ((float) height);
                height = this.f۱۱۱۵۳p;
                width = (int) (((float) width) * scale2);
            }
            icon.setBounds(0, 0, width, height);
        }
        setCompoundDrawables(icon, null, null, null);
        m۱۳۷۳۶f();
    }

    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۳۷۴۱d() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence title) {
        this.f۱۱۱۴۴g = title;
        m۱۳۷۳۶f();
    }

    @Override // android.support.p۰۴۷v7.widget.ActionMenuView.AbstractCa
    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۳۷۴۰c() {
        return m۱۳۷۴۱d() && this.f۱۱۱۴۳f.getIcon() == null;
    }

    @Override // android.support.p۰۴۷v7.widget.ActionMenuView.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۷۳۹b() {
        return m۱۳۷۴۱d();
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۷v7.widget.AppCompatTextView
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        boolean textVisible = m۱۳۷۴۱d();
        if (textVisible && (i = this.f۱۱۱۵۲o) >= 0) {
            super.setPadding(i, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int oldMeasuredWidth = getMeasuredWidth();
        int targetWidth = widthMode == Integer.MIN_VALUE ? Math.min(widthSize, this.f۱۱۱۵۱n) : this.f۱۱۱۵۱n;
        if (widthMode != 1073741824 && this.f۱۱۱۵۱n > 0 && oldMeasuredWidth < targetWidth) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(targetWidth, 1073741824), heightMeasureSpec);
        }
        if (!textVisible && this.f۱۱۱۴۵h != null) {
            super.setPadding((getMeasuredWidth() - this.f۱۱۱۴۵h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$a  reason: invalid class name */
    private class Ca extends AbstractView$OnTouchListenerCl0 {
        public Ca() {
            super(ActionMenuItemView.this);
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractView$OnTouchListenerCl0
        /* renamed from: a  reason: contains not printable characters */
        public AbstractCt m۱۳۷۴۲a() {
            AbstractCb bVar = ActionMenuItemView.this.f۱۱۱۴۸k;
            if (bVar != null) {
                return bVar.m۱۳۷۴۴a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        @Override // android.support.p۰۴۷v7.widget.AbstractView$OnTouchListenerCl0
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۳۷۴۳b() {
            AbstractCt popup;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            Ch.AbstractCb bVar = actionMenuItemView.f۱۱۱۴۶i;
            if (bVar == null || !bVar.m۱۳۸۹۰a(actionMenuItemView.f۱۱۱۴۳f) || (popup = m۱۳۷۴۲a()) == null || !popup.m۱۳۹۸۶e()) {
                return false;
            }
            return true;
        }
    }

    public void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(null);
    }
}
