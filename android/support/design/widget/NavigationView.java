package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.internal.Cb;
import android.support.design.internal.Cf;
import android.support.design.internal.Cg;
import android.support.p۰۴۳v4.view.AbstractCa;
import android.support.p۰۴۳v4.view.Cc0;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۷v7.view.menu.Ch;
import android.support.p۰۴۷v7.widget.Cj1;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cj;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck;

public class NavigationView extends Cf {

    /* renamed from: k  reason: contains not printable characters */
    private static final int[] f۹۶۷۷k = {16842912};

    /* renamed from: l  reason: contains not printable characters */
    private static final int[] f۹۶۷۸l = {-16842910};

    /* renamed from: f  reason: contains not printable characters */
    private final Cb f۹۶۷۹f;

    /* renamed from: g  reason: contains not printable characters */
    private final android.support.design.internal.Cc f۹۶۸۰g;

    /* renamed from: h  reason: contains not printable characters */
    AbstractCb f۹۶۸۱h;

    /* renamed from: i  reason: contains not printable characters */
    private final int f۹۶۸۲i;

    /* renamed from: j  reason: contains not printable characters */
    private MenuInflater f۹۶۸۳j;

    /* renamed from: android.support.design.widget.NavigationView$b  reason: invalid class name */
    public interface AbstractCb {
        /* renamed from: a  reason: contains not printable characters */
        boolean m۱۱۶۵۳a(MenuItem menuItem);
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attrs) {
        this(context, attrs, p۰۰۰a.p۰۰۵b.p۰۰۸c.Cb.navigationViewStyle);
    }

    public NavigationView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        ColorStateList itemIconTint;
        this.f۹۶۸۰g = new android.support.design.internal.Cc();
        this.f۹۶۷۹f = new Cb(context);
        Cj1 a = Cg.m۱۱۳۶۱d(context, attrs, Ck.NavigationView, defStyleAttr, Cj.Widget_Design_NavigationView, new int[0]);
        Cu.m۱۲۹۸۴a(this, a.m۱۵۳۵۴b(Ck.NavigationView_android_background));
        if (a.m۱۵۳۶۴g(Ck.NavigationView_elevation)) {
            Cu.m۱۲۹۷۷a(this, (float) a.m۱۵۳۵۵c(Ck.NavigationView_elevation, 0));
        }
        Cu.m۱۲۹۹۲a(this, a.m۱۵۳۵۱a(Ck.NavigationView_android_fitsSystemWindows, false));
        this.f۹۶۸۲i = a.m۱۵۳۵۵c(Ck.NavigationView_android_maxWidth, 0);
        if (a.m۱۵۳۶۴g(Ck.NavigationView_itemIconTint)) {
            itemIconTint = a.m۱۵۳۴۸a(Ck.NavigationView_itemIconTint);
        } else {
            itemIconTint = m۱۱۶۴۷c(16842808);
        }
        boolean textAppearanceSet = false;
        int textAppearance = 0;
        if (a.m۱۵۳۶۴g(Ck.NavigationView_itemTextAppearance)) {
            textAppearance = a.m۱۵۳۶۳g(Ck.NavigationView_itemTextAppearance, 0);
            textAppearanceSet = true;
        }
        ColorStateList itemTextColor = a.m۱۵۳۶۴g(Ck.NavigationView_itemTextColor) ? a.m۱۵۳۴۸a(Ck.NavigationView_itemTextColor) : null;
        if (!textAppearanceSet && itemTextColor == null) {
            itemTextColor = m۱۱۶۴۷c(16842806);
        }
        Drawable itemBackground = a.m۱۵۳۵۴b(Ck.NavigationView_itemBackground);
        if (a.m۱۵۳۶۴g(Ck.NavigationView_itemHorizontalPadding)) {
            this.f۹۶۸۰g.m۱۱۳۲۰c(a.m۱۵۳۵۵c(Ck.NavigationView_itemHorizontalPadding, 0));
        }
        int itemIconPadding = a.m۱۵۳۵۵c(Ck.NavigationView_itemIconPadding, 0);
        this.f۹۶۷۹f.m۱۳۸۴۷a(new Ca());
        this.f۹۶۸۰g.m۱۱۳۱۴b(1);
        this.f۹۶۸۰g.m۱۱۳۰۳a(context, this.f۹۶۷۹f);
        this.f۹۶۸۰g.m۱۱۳۰۴a(itemIconTint);
        if (textAppearanceSet) {
            this.f۹۶۸۰g.m۱۱۳۲۴e(textAppearance);
        }
        this.f۹۶۸۰g.m۱۱۳۱۵b(itemTextColor);
        this.f۹۶۸۰g.m۱۱۳۰۵a(itemBackground);
        this.f۹۶۸۰g.m۱۱۳۲۲d(itemIconPadding);
        this.f۹۶۷۹f.m۱۳۸۴۸a(this.f۹۶۸۰g);
        addView((View) this.f۹۶۸۰g.m۱۱۳۰۱a((ViewGroup) this));
        if (a.m۱۵۳۶۴g(Ck.NavigationView_menu)) {
            m۱۱۶۵۰b(a.m۱۵۳۶۳g(Ck.NavigationView_menu, 0));
        }
        if (a.m۱۵۳۶۴g(Ck.NavigationView_headerLayout)) {
            m۱۱۶۴۸a(a.m۱۵۳۶۳g(Ck.NavigationView_headerLayout, 0));
        }
        a.m۱۵۳۵۰a();
    }

    /* renamed from: android.support.design.widget.NavigationView$a  reason: invalid class name */
    class Ca implements Ch.AbstractCa {
        Ca() {
        }

        @Override // android.support.p۰۴۷v7.view.menu.Ch.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۶۵۲a(Ch menu, MenuItem item) {
            AbstractCb bVar = NavigationView.this.f۹۶۸۱h;
            return bVar != null && bVar.m۱۱۶۵۳a(item);
        }

        @Override // android.support.p۰۴۷v7.view.menu.Ch.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۶۵۱a(Ch menu) {
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Cc state = new Cc(super.onSaveInstanceState());
        state.f۹۶۸۵e = new Bundle();
        this.f۹۶۷۹f.m۱۳۸۷۰d(state.f۹۶۸۵e);
        return state;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable savedState) {
        if (!(savedState instanceof Cc)) {
            super.onRestoreInstanceState(savedState);
            return;
        }
        Cc state = (Cc) savedState;
        super.onRestoreInstanceState(state.m۱۲۷۹۱a());
        this.f۹۶۷۹f.m۱۳۸۵۹b(state.f۹۶۸۵e);
    }

    public void setNavigationItemSelectedListener(AbstractCb listener) {
        this.f۹۶۸۱h = listener;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthSpec, int heightSpec) {
        int mode = View.MeasureSpec.getMode(widthSpec);
        if (mode == Integer.MIN_VALUE) {
            widthSpec = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(widthSpec), this.f۹۶۸۲i), 1073741824);
        } else if (mode == 0) {
            widthSpec = View.MeasureSpec.makeMeasureSpec(this.f۹۶۸۲i, 1073741824);
        } else if (mode != 1073741824) {
        }
        super.onMeasure(widthSpec, heightSpec);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.design.internal.Cf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۶۴۹a(Cc0 insets) {
        this.f۹۶۸۰g.m۱۱۳۰۷a(insets);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۶۵۰b(int resId) {
        this.f۹۶۸۰g.m۱۱۳۱۶b(true);
        getMenuInflater().inflate(resId, this.f۹۶۷۹f);
        this.f۹۶۸۰g.m۱۱۳۱۶b(false);
        this.f۹۶۸۰g.m۱۱۳۱۱a(false);
    }

    public Menu getMenu() {
        return this.f۹۶۷۹f;
    }

    /* renamed from: a  reason: contains not printable characters */
    public View m۱۱۶۴۸a(int res) {
        return this.f۹۶۸۰g.m۱۱۳۰۲a(res);
    }

    public int getHeaderCount() {
        return this.f۹۶۸۰g.m۱۱۳۲۳e();
    }

    public ColorStateList getItemIconTintList() {
        return this.f۹۶۸۰g.m۱۱۳۲۹j();
    }

    public void setItemIconTintList(ColorStateList tint) {
        this.f۹۶۸۰g.m۱۱۳۰۴a(tint);
    }

    public ColorStateList getItemTextColor() {
        return this.f۹۶۸۰g.m۱۱۳۲۸i();
    }

    public void setItemTextColor(ColorStateList textColor) {
        this.f۹۶۸۰g.m۱۱۳۱۵b(textColor);
    }

    public Drawable getItemBackground() {
        return this.f۹۶۸۰g.m۱۱۳۲۵f();
    }

    public void setItemBackgroundResource(int resId) {
        setItemBackground(android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۶c(getContext(), resId));
    }

    public void setItemBackground(Drawable itemBackground) {
        this.f۹۶۸۰g.m۱۱۳۰۵a(itemBackground);
    }

    public int getItemHorizontalPadding() {
        return this.f۹۶۸۰g.m۱۱۳۲۶g();
    }

    public void setItemHorizontalPadding(int padding) {
        this.f۹۶۸۰g.m۱۱۳۲۰c(padding);
    }

    public void setItemHorizontalPaddingResource(int paddingResource) {
        this.f۹۶۸۰g.m۱۱۳۲۰c(getResources().getDimensionPixelSize(paddingResource));
    }

    public int getItemIconPadding() {
        return this.f۹۶۸۰g.m۱۱۳۲۷h();
    }

    public void setItemIconPadding(int padding) {
        this.f۹۶۸۰g.m۱۱۳۲۲d(padding);
    }

    public void setItemIconPaddingResource(int paddingResource) {
        this.f۹۶۸۰g.m۱۱۳۲۲d(getResources().getDimensionPixelSize(paddingResource));
    }

    public void setCheckedItem(int id) {
        MenuItem item = this.f۹۶۷۹f.findItem(id);
        if (item != null) {
            this.f۹۶۸۰g.m۱۱۳۰۹a((android.support.p۰۴۷v7.view.menu.Ck) item);
        }
    }

    public void setCheckedItem(MenuItem checkedItem) {
        MenuItem item = this.f۹۶۷۹f.findItem(checkedItem.getItemId());
        if (item != null) {
            this.f۹۶۸۰g.m۱۱۳۰۹a((android.support.p۰۴۷v7.view.menu.Ck) item);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public MenuItem getCheckedItem() {
        return this.f۹۶۸۰g.m۱۱۳۲۱d();
    }

    public void setItemTextAppearance(int resId) {
        this.f۹۶۸۰g.m۱۱۳۲۴e(resId);
    }

    private MenuInflater getMenuInflater() {
        if (this.f۹۶۸۳j == null) {
            this.f۹۶۸۳j = new p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Cg(getContext());
        }
        return this.f۹۶۸۳j;
    }

    /* renamed from: c  reason: contains not printable characters */
    private ColorStateList m۱۱۶۴۷c(int baseColorThemeAttr) {
        TypedValue value = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(baseColorThemeAttr, value, true)) {
            return null;
        }
        ColorStateList baseColor = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۲b(getContext(), value.resourceId);
        if (!getContext().getTheme().resolveAttribute(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.colorPrimary, value, true)) {
            return null;
        }
        int colorPrimary = value.data;
        int defaultColor = baseColor.getDefaultColor();
        return new ColorStateList(new int[][]{f۹۶۷۸l, f۹۶۷۷k, FrameLayout.EMPTY_STATE_SET}, new int[]{baseColor.getColorForState(f۹۶۷۸l, defaultColor), colorPrimary, defaultColor});
    }

    /* renamed from: android.support.design.widget.NavigationView$c  reason: invalid class name */
    public static class Cc extends AbstractCa {
        public static final Parcelable.Creator<Cc> CREATOR = new Ca();

        /* renamed from: e  reason: contains not printable characters */
        public Bundle f۹۶۸۵e;

        public Cc(Parcel in, ClassLoader loader) {
            super(in, loader);
            this.f۹۶۸۵e = in.readBundle(loader);
        }

        public Cc(Parcelable superState) {
            super(superState);
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCa
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeBundle(this.f۹۶۸۵e);
        }

        /* renamed from: android.support.design.widget.NavigationView$c$a  reason: invalid class name */
        static class Ca implements Parcelable.ClassLoaderCreator<Cc> {
            Ca() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public Cc createFromParcel(Parcel in, ClassLoader loader) {
                return new Cc(in, loader);
            }

            @Override // android.os.Parcelable.Creator
            public Cc createFromParcel(Parcel in) {
                return new Cc(in, null);
            }

            @Override // android.os.Parcelable.Creator
            public Cc[] newArray(int size) {
                return new Cc[size];
            }
        }
    }
}
