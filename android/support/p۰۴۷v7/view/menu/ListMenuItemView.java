package android.support.p۰۴۷v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۷v7.view.menu.AbstractCq;
import android.support.p۰۴۷v7.widget.Cj1;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cg;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;

/* renamed from: android.support.v7.view.menu.ListMenuItemView */
public class ListMenuItemView extends LinearLayout implements AbstractCq.AbstractCa, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: c  reason: contains not printable characters */
    private Ck f۱۱۱۵۸c;

    /* renamed from: d  reason: contains not printable characters */
    private ImageView f۱۱۱۵۹d;

    /* renamed from: e  reason: contains not printable characters */
    private RadioButton f۱۱۱۶۰e;

    /* renamed from: f  reason: contains not printable characters */
    private TextView f۱۱۱۶۱f;

    /* renamed from: g  reason: contains not printable characters */
    private CheckBox f۱۱۱۶۲g;

    /* renamed from: h  reason: contains not printable characters */
    private TextView f۱۱۱۶۳h;

    /* renamed from: i  reason: contains not printable characters */
    private ImageView f۱۱۱۶۴i;

    /* renamed from: j  reason: contains not printable characters */
    private ImageView f۱۱۱۶۵j;

    /* renamed from: k  reason: contains not printable characters */
    private LinearLayout f۱۱۱۶۶k;

    /* renamed from: l  reason: contains not printable characters */
    private Drawable f۱۱۱۶۷l;

    /* renamed from: m  reason: contains not printable characters */
    private int f۱۱۱۶۸m;

    /* renamed from: n  reason: contains not printable characters */
    private Context f۱۱۱۶۹n;

    /* renamed from: o  reason: contains not printable characters */
    private boolean f۱۱۱۷۰o;

    /* renamed from: p  reason: contains not printable characters */
    private Drawable f۱۱۱۷۱p;

    /* renamed from: q  reason: contains not printable characters */
    private boolean f۱۱۱۷۲q;

    /* renamed from: r  reason: contains not printable characters */
    private LayoutInflater f۱۱۱۷۳r;

    /* renamed from: s  reason: contains not printable characters */
    private boolean f۱۱۱۷۴s;

    public ListMenuItemView(Context context, AttributeSet attrs) {
        this(context, attrs, Ca.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs);
        Cj1 a = Cj1.m۱۵۳۴۵a(getContext(), attrs, Cj.MenuView, defStyleAttr, 0);
        this.f۱۱۱۶۷l = a.m۱۵۳۵۴b(Cj.MenuView_android_itemBackground);
        this.f۱۱۱۶۸m = a.m۱۵۳۶۳g(Cj.MenuView_android_itemTextAppearance, -1);
        this.f۱۱۱۷۰o = a.m۱۵۳۵۱a(Cj.MenuView_preserveIconSpacing, false);
        this.f۱۱۱۶۹n = context;
        this.f۱۱۱۷۱p = a.m۱۵۳۵۴b(Cj.MenuView_subMenuArrow);
        TypedArray b = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, Ca.dropDownListViewStyle, 0);
        this.f۱۱۱۷۲q = b.hasValue(0);
        a.m۱۵۳۵۰a();
        b.recycle();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        Cu.m۱۲۹۸۴a(this, this.f۱۱۱۶۷l);
        this.f۱۱۱۶۱f = (TextView) findViewById(Cf.title);
        int i = this.f۱۱۱۶۸m;
        if (i != -1) {
            this.f۱۱۱۶۱f.setTextAppearance(this.f۱۱۱۶۹n, i);
        }
        this.f۱۱۱۶۳h = (TextView) findViewById(Cf.shortcut);
        this.f۱۱۱۶۴i = (ImageView) findViewById(Cf.submenuarrow);
        ImageView imageView = this.f۱۱۱۶۴i;
        if (imageView != null) {
            imageView.setImageDrawable(this.f۱۱۱۷۱p);
        }
        this.f۱۱۱۶۵j = (ImageView) findViewById(Cf.group_divider);
        this.f۱۱۱۶۶k = (LinearLayout) findViewById(Cf.content);
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCq.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۷۵۲a(Ck itemData, int menuType) {
        this.f۱۱۱۵۸c = itemData;
        setVisibility(itemData.isVisible() ? 0 : 8);
        setTitle(itemData.m۱۳۸۹۹a(this));
        setCheckable(itemData.isCheckable());
        m۱۳۷۵۳a(itemData.m۱۳۹۱۸m(), itemData.m۱۳۹۰۷d());
        setIcon(itemData.getIcon());
        setEnabled(itemData.isEnabled());
        setSubMenuArrowVisible(itemData.hasSubMenu());
        setContentDescription(itemData.getContentDescription());
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۳۷۴۷a(View v) {
        m۱۳۷۴۸a(v, -1);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۳۷۴۸a(View v, int index) {
        LinearLayout linearLayout = this.f۱۱۱۶۶k;
        if (linearLayout != null) {
            linearLayout.addView(v, index);
        } else {
            addView(v, index);
        }
    }

    public void setForceShowIcon(boolean forceShow) {
        this.f۱۱۱۷۴s = forceShow;
        this.f۱۱۱۷۰o = forceShow;
    }

    public void setTitle(CharSequence title) {
        if (title != null) {
            this.f۱۱۱۶۱f.setText(title);
            if (this.f۱۱۱۶۱f.getVisibility() != 0) {
                this.f۱۱۱۶۱f.setVisibility(0);
            }
        } else if (this.f۱۱۱۶۱f.getVisibility() != 8) {
            this.f۱۱۱۶۱f.setVisibility(8);
        }
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCq.AbstractCa
    public Ck getItemData() {
        return this.f۱۱۱۵۸c;
    }

    public void setCheckable(boolean checkable) {
        CompoundButton otherCompoundButton;
        CompoundButton compoundButton;
        if (checkable || this.f۱۱۱۶۰e != null || this.f۱۱۱۶۲g != null) {
            if (this.f۱۱۱۵۸c.m۱۳۹۱۴i()) {
                if (this.f۱۱۱۶۰e == null) {
                    m۱۳۷۵۱d();
                }
                compoundButton = this.f۱۱۱۶۰e;
                otherCompoundButton = this.f۱۱۱۶۲g;
            } else {
                if (this.f۱۱۱۶۲g == null) {
                    m۱۳۷۴۹b();
                }
                compoundButton = this.f۱۱۱۶۲g;
                otherCompoundButton = this.f۱۱۱۶۰e;
            }
            if (checkable) {
                compoundButton.setChecked(this.f۱۱۱۵۸c.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (otherCompoundButton != null && otherCompoundButton.getVisibility() != 8) {
                    otherCompoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f۱۱۱۶۲g;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f۱۱۱۶۰e;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean checked) {
        CompoundButton compoundButton;
        if (this.f۱۱۱۵۸c.m۱۳۹۱۴i()) {
            if (this.f۱۱۱۶۰e == null) {
                m۱۳۷۵۱d();
            }
            compoundButton = this.f۱۱۱۶۰e;
        } else {
            if (this.f۱۱۱۶۲g == null) {
                m۱۳۷۴۹b();
            }
            compoundButton = this.f۱۱۱۶۲g;
        }
        compoundButton.setChecked(checked);
    }

    private void setSubMenuArrowVisible(boolean hasSubmenu) {
        ImageView imageView = this.f۱۱۱۶۴i;
        if (imageView != null) {
            imageView.setVisibility(hasSubmenu ? 0 : 8);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۷۵۳a(boolean showShortcut, char shortcutKey) {
        int newVisibility = (!showShortcut || !this.f۱۱۱۵۸c.m۱۳۹۱۸m()) ? 8 : 0;
        if (newVisibility == 0) {
            this.f۱۱۱۶۳h.setText(this.f۱۱۱۵۸c.m۱۳۹۰۹e());
        }
        if (this.f۱۱۱۶۳h.getVisibility() != newVisibility) {
            this.f۱۱۱۶۳h.setVisibility(newVisibility);
        }
    }

    public void setIcon(Drawable icon) {
        boolean showIcon = this.f۱۱۱۵۸c.m۱۳۹۱۷l() || this.f۱۱۱۷۴s;
        if (!showIcon && !this.f۱۱۱۷۰o) {
            return;
        }
        if (this.f۱۱۱۵۹d != null || icon != null || this.f۱۱۱۷۰o) {
            if (this.f۱۱۱۵۹d == null) {
                m۱۳۷۵۰c();
            }
            if (icon != null || this.f۱۱۱۷۰o) {
                this.f۱۱۱۵۹d.setImageDrawable(showIcon ? icon : null);
                if (this.f۱۱۱۵۹d.getVisibility() != 0) {
                    this.f۱۱۱۵۹d.setVisibility(0);
                    return;
                }
                return;
            }
            this.f۱۱۱۵۹d.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f۱۱۱۵۹d != null && this.f۱۱۱۷۰o) {
            ViewGroup.LayoutParams lp = getLayoutParams();
            LinearLayout.LayoutParams iconLp = (LinearLayout.LayoutParams) this.f۱۱۱۵۹d.getLayoutParams();
            if (lp.height > 0 && iconLp.width <= 0) {
                iconLp.width = lp.height;
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۳۷۵۰c() {
        this.f۱۱۱۵۹d = (ImageView) getInflater().inflate(Cg.abc_list_menu_item_icon, (ViewGroup) this, false);
        m۱۳۷۴۸a(this.f۱۱۱۵۹d, 0);
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۳۷۵۱d() {
        this.f۱۱۱۶۰e = (RadioButton) getInflater().inflate(Cg.abc_list_menu_item_radio, (ViewGroup) this, false);
        m۱۳۷۴۷a(this.f۱۱۱۶۰e);
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۳۷۴۹b() {
        this.f۱۱۱۶۲g = (CheckBox) getInflater().inflate(Cg.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        m۱۳۷۴۷a(this.f۱۱۱۶۲g);
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCq.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۷۵۴a() {
        return false;
    }

    private LayoutInflater getInflater() {
        if (this.f۱۱۱۷۳r == null) {
            this.f۱۱۱۷۳r = LayoutInflater.from(getContext());
        }
        return this.f۱۱۱۷۳r;
    }

    public void setGroupDividerEnabled(boolean groupDividerEnabled) {
        ImageView imageView = this.f۱۱۱۶۵j;
        if (imageView != null) {
            imageView.setVisibility((this.f۱۱۱۷۲q || !groupDividerEnabled) ? 8 : 0);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f۱۱۱۶۵j;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) this.f۱۱۱۶۵j.getLayoutParams();
            rect.top += this.f۱۱۱۶۵j.getHeight() + lp.topMargin + lp.bottomMargin;
        }
    }
}
