package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.p۰۴۳v4.view.Cb;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.view.p۰۴۵d0.Cc;
import android.support.p۰۴۳v4.widget.Cp;
import android.support.p۰۴۷v7.view.menu.AbstractCq;
import android.support.p۰۴۷v7.view.menu.Ck;
import android.support.p۰۴۷v7.widget.Cl1;
import android.support.p۰۴۷v7.widget.Co0;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cd;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Ce;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cf;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Ch;

public class NavigationMenuItemView extends Ca implements AbstractCq.AbstractCa {

    /* renamed from: H  reason: contains not printable characters */
    private static final int[] f۹۴۶۸H = {16842912};

    /* renamed from: A  reason: contains not printable characters */
    private final CheckedTextView f۹۴۶۹A;

    /* renamed from: B  reason: contains not printable characters */
    private FrameLayout f۹۴۷۰B;

    /* renamed from: C  reason: contains not printable characters */
    private Ck f۹۴۷۱C;

    /* renamed from: D  reason: contains not printable characters */
    private ColorStateList f۹۴۷۲D;

    /* renamed from: E  reason: contains not printable characters */
    private boolean f۹۴۷۳E;

    /* renamed from: F  reason: contains not printable characters */
    private Drawable f۹۴۷۴F;

    /* renamed from: G  reason: contains not printable characters */
    private final Cb f۹۴۷۵G;

    /* renamed from: x  reason: contains not printable characters */
    private final int f۹۴۷۶x;

    /* renamed from: y  reason: contains not printable characters */
    private boolean f۹۴۷۷y;

    /* renamed from: z  reason: contains not printable characters */
    boolean f۹۴۷۸z;

    /* renamed from: android.support.design.internal.NavigationMenuItemView$a  reason: invalid class name */
    class Ca extends Cb {
        Ca() {
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۲۹۸a(View host, Cc info2) {
            super.m۱۲۷۹۷a(host, info2);
            info2.m۱۲۸۵۲b(NavigationMenuItemView.this.f۹۴۷۸z);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۹۴۷۵G = new Ca();
        setOrientation(0);
        LayoutInflater.from(context).inflate(Ch.design_navigation_menu_item, (ViewGroup) this, true);
        this.f۹۴۷۶x = context.getResources().getDimensionPixelSize(Cd.design_navigation_icon_size);
        this.f۹۴۶۹A = (CheckedTextView) findViewById(Cf.design_menu_item_text);
        this.f۹۴۶۹A.setDuplicateParentStateEnabled(true);
        Cu.m۱۲۹۸۵a(this.f۹۴۶۹A, this.f۹۴۷۵G);
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCq.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۲۹۵a(Ck itemData, int menuType) {
        this.f۹۴۷۱C = itemData;
        setVisibility(itemData.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            Cu.m۱۲۹۸۴a(this, m۱۱۲۹۳f());
        }
        setCheckable(itemData.isCheckable());
        setChecked(itemData.isChecked());
        setEnabled(itemData.isEnabled());
        setTitle(itemData.getTitle());
        setIcon(itemData.getIcon());
        setActionView(itemData.getActionView());
        setContentDescription(itemData.getContentDescription());
        Cl1.m۱۵۴۱۷a(this, itemData.getTooltipText());
        m۱۱۲۹۲e();
    }

    /* renamed from: g  reason: contains not printable characters */
    private boolean m۱۱۲۹۴g() {
        return this.f۹۴۷۱C.getTitle() == null && this.f۹۴۷۱C.getIcon() == null && this.f۹۴۷۱C.getActionView() != null;
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۱۲۹۲e() {
        if (m۱۱۲۹۴g()) {
            this.f۹۴۶۹A.setVisibility(8);
            FrameLayout frameLayout = this.f۹۴۷۰B;
            if (frameLayout != null) {
                Co0.Ca params = (Co0.Ca) frameLayout.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) params).width = -1;
                this.f۹۴۷۰B.setLayoutParams(params);
                return;
            }
            return;
        }
        this.f۹۴۶۹A.setVisibility(0);
        FrameLayout frameLayout2 = this.f۹۴۷۰B;
        if (frameLayout2 != null) {
            Co0.Ca params2 = (Co0.Ca) frameLayout2.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) params2).width = -2;
            this.f۹۴۷۰B.setLayoutParams(params2);
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۱۲۹۷d() {
        FrameLayout frameLayout = this.f۹۴۷۰B;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f۹۴۶۹A.setCompoundDrawables(null, null, null, null);
    }

    private void setActionView(View actionView) {
        if (actionView != null) {
            if (this.f۹۴۷۰B == null) {
                this.f۹۴۷۰B = (FrameLayout) ((ViewStub) findViewById(Cf.design_menu_item_action_area_stub)).inflate();
            }
            this.f۹۴۷۰B.removeAllViews();
            this.f۹۴۷۰B.addView(actionView);
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private StateListDrawable m۱۱۲۹۳f() {
        TypedValue value = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorControlHighlight, value, true)) {
            return null;
        }
        StateListDrawable drawable = new StateListDrawable();
        drawable.addState(f۹۴۶۸H, new ColorDrawable(value.data));
        drawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return drawable;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCq.AbstractCa
    public Ck getItemData() {
        return this.f۹۴۷۱C;
    }

    public void setTitle(CharSequence title) {
        this.f۹۴۶۹A.setText(title);
    }

    public void setCheckable(boolean checkable) {
        refreshDrawableState();
        if (this.f۹۴۷۸z != checkable) {
            this.f۹۴۷۸z = checkable;
            this.f۹۴۷۵G.m۱۲۷۹۶a(this.f۹۴۶۹A, 2048);
        }
    }

    public void setChecked(boolean checked) {
        refreshDrawableState();
        this.f۹۴۶۹A.setChecked(checked);
    }

    public void setIcon(Drawable icon) {
        if (icon != null) {
            if (this.f۹۴۷۳E) {
                Drawable.ConstantState state = icon.getConstantState();
                icon = android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۲۲h(state == null ? icon : state.newDrawable()).mutate();
                android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(icon, this.f۹۴۷۲D);
            }
            int i = this.f۹۴۷۶x;
            icon.setBounds(0, 0, i, i);
        } else if (this.f۹۴۷۷y) {
            if (this.f۹۴۷۴F == null) {
                this.f۹۴۷۴F = android.support.p۰۴۳v4.content.p۰۴۴e.Cf.m۱۲۶۸۴a(getResources(), Ce.navigation_empty_icon, getContext().getTheme());
                Drawable drawable = this.f۹۴۷۴F;
                if (drawable != null) {
                    int i2 = this.f۹۴۷۶x;
                    drawable.setBounds(0, 0, i2, i2);
                }
            }
            icon = this.f۹۴۷۴F;
        }
        Cp.m۱۳۳۰۵a(this.f۹۴۶۹A, icon, null, null, null);
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCq.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۲۹۶a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int extraSpace) {
        int[] drawableState = super.onCreateDrawableState(extraSpace + 1);
        Ck kVar = this.f۹۴۷۱C;
        if (kVar != null && kVar.isCheckable() && this.f۹۴۷۱C.isChecked()) {
            ViewGroup.mergeDrawableStates(drawableState, f۹۴۶۸H);
        }
        return drawableState;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList tintList) {
        this.f۹۴۷۲D = tintList;
        this.f۹۴۷۳E = this.f۹۴۷۲D != null;
        Ck kVar = this.f۹۴۷۱C;
        if (kVar != null) {
            setIcon(kVar.getIcon());
        }
    }

    public void setTextAppearance(int textAppearance) {
        Cp.m۱۳۳۱۲d(this.f۹۴۶۹A, textAppearance);
    }

    public void setTextColor(ColorStateList colors) {
        this.f۹۴۶۹A.setTextColor(colors);
    }

    public void setNeedsEmptyIcon(boolean needsEmptyIcon) {
        this.f۹۴۷۷y = needsEmptyIcon;
    }

    public void setHorizontalPadding(int padding) {
        setPadding(padding, 0, padding, 0);
    }

    public void setIconPadding(int padding) {
        this.f۹۴۶۹A.setCompoundDrawablePadding(padding);
    }
}
