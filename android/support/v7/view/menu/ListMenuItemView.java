package android.support.v7.view.menu;

import a.b.h.a.a;
import a.b.h.a.f;
import a.b.h.a.g;
import a.b.h.a.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.u;
import android.support.v7.view.menu.q;
import android.support.v7.widget.j1;
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

public class ListMenuItemView extends LinearLayout implements q.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: c  reason: collision with root package name */
    private k f۱۶۴۷c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f۱۶۴۸d;

    /* renamed from: e  reason: collision with root package name */
    private RadioButton f۱۶۴۹e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f۱۶۵۰f;

    /* renamed from: g  reason: collision with root package name */
    private CheckBox f۱۶۵۱g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f۱۶۵۲h;
    private ImageView i;
    private ImageView j;
    private LinearLayout k;
    private Drawable l;
    private int m;
    private Context n;
    private boolean o;
    private Drawable p;
    private boolean q;
    private LayoutInflater r;
    private boolean s;

    public ListMenuItemView(Context context, AttributeSet attrs) {
        this(context, attrs, a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs);
        j1 a2 = j1.a(getContext(), attrs, j.MenuView, defStyleAttr, 0);
        this.l = a2.b(j.MenuView_android_itemBackground);
        this.m = a2.g(j.MenuView_android_itemTextAppearance, -1);
        this.o = a2.a(j.MenuView_preserveIconSpacing, false);
        this.n = context;
        this.p = a2.b(j.MenuView_subMenuArrow);
        TypedArray b2 = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, a.dropDownListViewStyle, 0);
        this.q = b2.hasValue(0);
        a2.a();
        b2.recycle();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        u.a(this, this.l);
        this.f۱۶۵۰f = (TextView) findViewById(f.title);
        int i2 = this.m;
        if (i2 != -1) {
            this.f۱۶۵۰f.setTextAppearance(this.n, i2);
        }
        this.f۱۶۵۲h = (TextView) findViewById(f.shortcut);
        this.i = (ImageView) findViewById(f.submenuarrow);
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setImageDrawable(this.p);
        }
        this.j = (ImageView) findViewById(f.group_divider);
        this.k = (LinearLayout) findViewById(f.content);
    }

    @Override // android.support.v7.view.menu.q.a
    public void a(k itemData, int menuType) {
        this.f۱۶۴۷c = itemData;
        setVisibility(itemData.isVisible() ? 0 : 8);
        setTitle(itemData.a(this));
        setCheckable(itemData.isCheckable());
        a(itemData.m(), itemData.d());
        setIcon(itemData.getIcon());
        setEnabled(itemData.isEnabled());
        setSubMenuArrowVisible(itemData.hasSubMenu());
        setContentDescription(itemData.getContentDescription());
    }

    private void a(View v) {
        a(v, -1);
    }

    private void a(View v, int index) {
        LinearLayout linearLayout = this.k;
        if (linearLayout != null) {
            linearLayout.addView(v, index);
        } else {
            addView(v, index);
        }
    }

    public void setForceShowIcon(boolean forceShow) {
        this.s = forceShow;
        this.o = forceShow;
    }

    public void setTitle(CharSequence title) {
        if (title != null) {
            this.f۱۶۵۰f.setText(title);
            if (this.f۱۶۵۰f.getVisibility() != 0) {
                this.f۱۶۵۰f.setVisibility(0);
            }
        } else if (this.f۱۶۵۰f.getVisibility() != 8) {
            this.f۱۶۵۰f.setVisibility(8);
        }
    }

    @Override // android.support.v7.view.menu.q.a
    public k getItemData() {
        return this.f۱۶۴۷c;
    }

    public void setCheckable(boolean checkable) {
        CompoundButton otherCompoundButton;
        CompoundButton compoundButton;
        if (checkable || this.f۱۶۴۹e != null || this.f۱۶۵۱g != null) {
            if (this.f۱۶۴۷c.i()) {
                if (this.f۱۶۴۹e == null) {
                    d();
                }
                compoundButton = this.f۱۶۴۹e;
                otherCompoundButton = this.f۱۶۵۱g;
            } else {
                if (this.f۱۶۵۱g == null) {
                    b();
                }
                compoundButton = this.f۱۶۵۱g;
                otherCompoundButton = this.f۱۶۴۹e;
            }
            if (checkable) {
                compoundButton.setChecked(this.f۱۶۴۷c.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (otherCompoundButton != null && otherCompoundButton.getVisibility() != 8) {
                    otherCompoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f۱۶۵۱g;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f۱۶۴۹e;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean checked) {
        CompoundButton compoundButton;
        if (this.f۱۶۴۷c.i()) {
            if (this.f۱۶۴۹e == null) {
                d();
            }
            compoundButton = this.f۱۶۴۹e;
        } else {
            if (this.f۱۶۵۱g == null) {
                b();
            }
            compoundButton = this.f۱۶۵۱g;
        }
        compoundButton.setChecked(checked);
    }

    private void setSubMenuArrowVisible(boolean hasSubmenu) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility(hasSubmenu ? 0 : 8);
        }
    }

    public void a(boolean showShortcut, char shortcutKey) {
        int newVisibility = (!showShortcut || !this.f۱۶۴۷c.m()) ? 8 : 0;
        if (newVisibility == 0) {
            this.f۱۶۵۲h.setText(this.f۱۶۴۷c.e());
        }
        if (this.f۱۶۵۲h.getVisibility() != newVisibility) {
            this.f۱۶۵۲h.setVisibility(newVisibility);
        }
    }

    public void setIcon(Drawable icon) {
        boolean showIcon = this.f۱۶۴۷c.l() || this.s;
        if (!showIcon && !this.o) {
            return;
        }
        if (this.f۱۶۴۸d != null || icon != null || this.o) {
            if (this.f۱۶۴۸d == null) {
                c();
            }
            if (icon != null || this.o) {
                this.f۱۶۴۸d.setImageDrawable(showIcon ? icon : null);
                if (this.f۱۶۴۸d.getVisibility() != 0) {
                    this.f۱۶۴۸d.setVisibility(0);
                    return;
                }
                return;
            }
            this.f۱۶۴۸d.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f۱۶۴۸d != null && this.o) {
            ViewGroup.LayoutParams lp = getLayoutParams();
            LinearLayout.LayoutParams iconLp = (LinearLayout.LayoutParams) this.f۱۶۴۸d.getLayoutParams();
            if (lp.height > 0 && iconLp.width <= 0) {
                iconLp.width = lp.height;
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    private void c() {
        this.f۱۶۴۸d = (ImageView) getInflater().inflate(g.abc_list_menu_item_icon, (ViewGroup) this, false);
        a(this.f۱۶۴۸d, 0);
    }

    private void d() {
        this.f۱۶۴۹e = (RadioButton) getInflater().inflate(g.abc_list_menu_item_radio, (ViewGroup) this, false);
        a(this.f۱۶۴۹e);
    }

    private void b() {
        this.f۱۶۵۱g = (CheckBox) getInflater().inflate(g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        a(this.f۱۶۵۱g);
    }

    @Override // android.support.v7.view.menu.q.a
    public boolean a() {
        return false;
    }

    private LayoutInflater getInflater() {
        if (this.r == null) {
            this.r = LayoutInflater.from(getContext());
        }
        return this.r;
    }

    public void setGroupDividerEnabled(boolean groupDividerEnabled) {
        ImageView imageView = this.j;
        if (imageView != null) {
            imageView.setVisibility((this.q || !groupDividerEnabled) ? 8 : 0);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.j;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) this.j.getLayoutParams();
            rect.top += this.j.getHeight() + lp.topMargin + lp.bottomMargin;
        }
    }
}
