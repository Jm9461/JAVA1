package android.support.v7.view.menu;

import a.b.h.a.j;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.q;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.l0;
import android.support.v7.widget.l1;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class ActionMenuItemView extends AppCompatTextView implements q.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: f  reason: collision with root package name */
    k f۱۶۴۱f;

    /* renamed from: g  reason: collision with root package name */
    private CharSequence f۱۶۴۲g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f۱۶۴۳h;
    h.b i;
    private l0 j;
    b k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;

    public static abstract class b {
        public abstract t a();
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
        this.l = e();
        TypedArray a2 = context.obtainStyledAttributes(attrs, j.ActionMenuItemView, defStyle, 0);
        this.n = a2.getDimensionPixelSize(j.ActionMenuItemView_android_minWidth, 0);
        a2.recycle();
        this.p = (int) ((32.0f * res.getDisplayMetrics().density) + 0.5f);
        setOnClickListener(this);
        this.o = -1;
        setSaveEnabled(false);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.l = e();
        f();
    }

    private boolean e() {
        Configuration config = getContext().getResources().getConfiguration();
        int widthDp = config.screenWidthDp;
        return widthDp >= 480 || (widthDp >= 640 && config.screenHeightDp >= 480) || config.orientation == 2;
    }

    public void setPadding(int l2, int t, int r, int b2) {
        this.o = l2;
        super.setPadding(l2, t, r, b2);
    }

    @Override // android.support.v7.view.menu.q.a
    public k getItemData() {
        return this.f۱۶۴۱f;
    }

    @Override // android.support.v7.view.menu.q.a
    public void a(k itemData, int menuType) {
        this.f۱۶۴۱f = itemData;
        setIcon(itemData.getIcon());
        setTitle(itemData.a(this));
        setId(itemData.getItemId());
        setVisibility(itemData.isVisible() ? 0 : 8);
        setEnabled(itemData.isEnabled());
        if (itemData.hasSubMenu() && this.j == null) {
            this.j = new a();
        }
    }

    public boolean onTouchEvent(MotionEvent e2) {
        l0 l0Var;
        if (!this.f۱۶۴۱f.hasSubMenu() || (l0Var = this.j) == null || !l0Var.onTouch(this, e2)) {
            return super.onTouchEvent(e2);
        }
        return true;
    }

    public void onClick(View v) {
        h.b bVar = this.i;
        if (bVar != null) {
            bVar.a(this.f۱۶۴۱f);
        }
    }

    public void setItemInvoker(h.b invoker) {
        this.i = invoker;
    }

    public void setPopupCallback(b popupCallback) {
        this.k = popupCallback;
    }

    @Override // android.support.v7.view.menu.q.a
    public boolean a() {
        return true;
    }

    public void setCheckable(boolean checkable) {
    }

    public void setChecked(boolean checked) {
    }

    public void setExpandedFormat(boolean expandedFormat) {
        if (this.m != expandedFormat) {
            this.m = expandedFormat;
            k kVar = this.f۱۶۴۱f;
            if (kVar != null) {
                kVar.b();
            }
        }
    }

    private void f() {
        boolean z = true;
        boolean visible = !TextUtils.isEmpty(this.f۱۶۴۲g);
        if (this.f۱۶۴۳h != null && (!this.f۱۶۴۱f.n() || (!this.l && !this.m))) {
            z = false;
        }
        boolean visible2 = visible & z;
        CharSequence charSequence = null;
        setText(visible2 ? this.f۱۶۴۲g : null);
        CharSequence contentDescription = this.f۱۶۴۱f.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(visible2 ? null : this.f۱۶۴۱f.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f۱۶۴۱f.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!visible2) {
                charSequence = this.f۱۶۴۱f.getTitle();
            }
            l1.a(this, charSequence);
            return;
        }
        l1.a(this, tooltipText);
    }

    public void setIcon(Drawable icon) {
        this.f۱۶۴۳h = icon;
        if (icon != null) {
            int width = icon.getIntrinsicWidth();
            int height = icon.getIntrinsicHeight();
            int i2 = this.p;
            if (width > i2) {
                float scale = ((float) i2) / ((float) width);
                width = this.p;
                height = (int) (((float) height) * scale);
            }
            int i3 = this.p;
            if (height > i3) {
                float scale2 = ((float) i3) / ((float) height);
                height = this.p;
                width = (int) (((float) width) * scale2);
            }
            icon.setBounds(0, 0, width, height);
        }
        setCompoundDrawables(icon, null, null, null);
        f();
    }

    public boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence title) {
        this.f۱۶۴۲g = title;
        f();
    }

    @Override // android.support.v7.widget.ActionMenuView.a
    public boolean c() {
        return d() && this.f۱۶۴۱f.getIcon() == null;
    }

    @Override // android.support.v7.widget.ActionMenuView.a
    public boolean b() {
        return d();
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatTextView
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i2;
        boolean textVisible = d();
        if (textVisible && (i2 = this.o) >= 0) {
            super.setPadding(i2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int oldMeasuredWidth = getMeasuredWidth();
        int targetWidth = widthMode == Integer.MIN_VALUE ? Math.min(widthSize, this.n) : this.n;
        if (widthMode != 1073741824 && this.n > 0 && oldMeasuredWidth < targetWidth) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(targetWidth, 1073741824), heightMeasureSpec);
        }
        if (!textVisible && this.f۱۶۴۳h != null) {
            super.setPadding((getMeasuredWidth() - this.f۱۶۴۳h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    private class a extends l0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // android.support.v7.widget.l0
        public t a() {
            b bVar = ActionMenuItemView.this.k;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        @Override // android.support.v7.widget.l0
        public boolean b() {
            t popup;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            h.b bVar = actionMenuItemView.i;
            if (bVar == null || !bVar.a(actionMenuItemView.f۱۶۴۱f) || (popup = a()) == null || !popup.e()) {
                return false;
            }
            return true;
        }
    }

    public void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(null);
    }
}
