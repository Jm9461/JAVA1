package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p۰۴۳v4.view.Cc0;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۷v7.view.menu.AbstractCp;
import android.support.p۰۴۷v7.view.menu.AbstractCq;
import android.support.p۰۴۷v7.view.menu.Ck;
import android.support.p۰۴۷v7.view.menu.SubMenuCv;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: android.support.design.internal.c  reason: invalid class name */
public class Cc implements AbstractCp {

    /* renamed from: c  reason: contains not printable characters */
    private NavigationMenuView f۹۴۸۶c;

    /* renamed from: d  reason: contains not printable characters */
    LinearLayout f۹۴۸۷d;

    /* renamed from: e  reason: contains not printable characters */
    private AbstractCp.AbstractCa f۹۴۸۸e;

    /* renamed from: f  reason: contains not printable characters */
    android.support.p۰۴۷v7.view.menu.Ch f۹۴۸۹f;

    /* renamed from: g  reason: contains not printable characters */
    private int f۹۴۹۰g;

    /* renamed from: h  reason: contains not printable characters */
    Cc f۹۴۹۱h;

    /* renamed from: i  reason: contains not printable characters */
    LayoutInflater f۹۴۹۲i;

    /* renamed from: j  reason: contains not printable characters */
    int f۹۴۹۳j;

    /* renamed from: k  reason: contains not printable characters */
    boolean f۹۴۹۴k;

    /* renamed from: l  reason: contains not printable characters */
    ColorStateList f۹۴۹۵l;

    /* renamed from: m  reason: contains not printable characters */
    ColorStateList f۹۴۹۶m;

    /* renamed from: n  reason: contains not printable characters */
    Drawable f۹۴۹۷n;

    /* renamed from: o  reason: contains not printable characters */
    int f۹۴۹۸o;

    /* renamed from: p  reason: contains not printable characters */
    int f۹۴۹۹p;

    /* renamed from: q  reason: contains not printable characters */
    private int f۹۵۰۰q;

    /* renamed from: r  reason: contains not printable characters */
    int f۹۵۰۱r;

    /* renamed from: s  reason: contains not printable characters */
    final View.OnClickListener f۹۵۰۲s = new View$OnClickListenerCa();

    /* access modifiers changed from: private */
    /* renamed from: android.support.design.internal.c$e  reason: invalid class name */
    public interface AbstractCe {
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۳۰۳a(Context context, android.support.p۰۴۷v7.view.menu.Ch menu) {
        this.f۹۴۹۲i = LayoutInflater.from(context);
        this.f۹۴۸۹f = menu;
        this.f۹۵۰۱r = context.getResources().getDimensionPixelOffset(p۰۰۰a.p۰۰۵b.p۰۰۸c.Cd.design_navigation_separator_vertical_padding);
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCq m۱۱۳۰۱a(ViewGroup root) {
        if (this.f۹۴۸۶c == null) {
            this.f۹۴۸۶c = (NavigationMenuView) this.f۹۴۹۲i.inflate(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ch.design_navigation_menu, root, false);
            if (this.f۹۴۹۱h == null) {
                this.f۹۴۹۱h = new Cc();
            }
            this.f۹۴۸۷d = (LinearLayout) this.f۹۴۹۲i.inflate(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ch.design_navigation_item_header, (ViewGroup) this.f۹۴۸۶c, false);
            this.f۹۴۸۶c.setAdapter(this.f۹۴۹۱h);
        }
        return this.f۹۴۸۶c;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۳۱۱a(boolean cleared) {
        Cc cVar = this.f۹۴۹۱h;
        if (cVar != null) {
            cVar.m۱۱۳۴۶g();
        }
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۳۱۳a(SubMenuCv subMenu) {
        return false;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۳۰۸a(android.support.p۰۴۷v7.view.menu.Ch menu, boolean allMenusAreClosing) {
        AbstractCp.AbstractCa aVar = this.f۹۴۸۸e;
        if (aVar != null) {
            aVar.m۱۳۹۷۷a(menu, allMenusAreClosing);
        }
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۱۳۱۷b() {
        return false;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۱۳۱۸b(android.support.p۰۴۷v7.view.menu.Ch menu, Ck item) {
        return false;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۳۱۲a(android.support.p۰۴۷v7.view.menu.Ch menu, Ck item) {
        return false;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۱۳۰۰a() {
        return this.f۹۴۹۰g;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۳۱۴b(int id) {
        this.f۹۴۹۰g = id;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: c  reason: contains not printable characters */
    public Parcelable m۱۱۳۱۹c() {
        Bundle state = new Bundle();
        if (this.f۹۴۸۶c != null) {
            SparseArray<Parcelable> hierarchy = new SparseArray<>();
            this.f۹۴۸۶c.saveHierarchyState(hierarchy);
            state.putSparseParcelableArray("android:menu:list", hierarchy);
        }
        Cc cVar = this.f۹۴۹۱h;
        if (cVar != null) {
            state.putBundle("android:menu:adapter", cVar.m۱۱۳۴۴e());
        }
        if (this.f۹۴۸۷d != null) {
            SparseArray<Parcelable> header = new SparseArray<>();
            this.f۹۴۸۷d.saveHierarchyState(header);
            state.putSparseParcelableArray("android:menu:header", header);
        }
        return state;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۳۰۶a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle state = (Bundle) parcelable;
            SparseArray<Parcelable> hierarchy = state.getSparseParcelableArray("android:menu:list");
            if (hierarchy != null) {
                this.f۹۴۸۶c.restoreHierarchyState(hierarchy);
            }
            Bundle adapterState = state.getBundle("android:menu:adapter");
            if (adapterState != null) {
                this.f۹۴۹۱h.m۱۱۳۳۴a(adapterState);
            }
            SparseArray<Parcelable> header = state.getSparseParcelableArray("android:menu:header");
            if (header != null) {
                this.f۹۴۸۷d.restoreHierarchyState(header);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۳۰۹a(Ck item) {
        this.f۹۴۹۱h.m۱۱۳۳۷a(item);
    }

    /* renamed from: d  reason: contains not printable characters */
    public Ck m۱۱۳۲۱d() {
        return this.f۹۴۹۱h.m۱۱۳۴۵f();
    }

    /* renamed from: a  reason: contains not printable characters */
    public View m۱۱۳۰۲a(int res) {
        View view = this.f۹۴۹۲i.inflate(res, (ViewGroup) this.f۹۴۸۷d, false);
        m۱۱۳۱۰a(view);
        return view;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۳۱۰a(View view) {
        this.f۹۴۸۷d.addView(view);
        NavigationMenuView navigationMenuView = this.f۹۴۸۶c;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: e  reason: contains not printable characters */
    public int m۱۱۳۲۳e() {
        return this.f۹۴۸۷d.getChildCount();
    }

    /* renamed from: j  reason: contains not printable characters */
    public ColorStateList m۱۱۳۲۹j() {
        return this.f۹۴۹۶m;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۳۰۴a(ColorStateList tint) {
        this.f۹۴۹۶m = tint;
        m۱۱۳۱۱a(false);
    }

    /* renamed from: i  reason: contains not printable characters */
    public ColorStateList m۱۱۳۲۸i() {
        return this.f۹۴۹۵l;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۳۱۵b(ColorStateList textColor) {
        this.f۹۴۹۵l = textColor;
        m۱۱۳۱۱a(false);
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۱۳۲۴e(int resId) {
        this.f۹۴۹۳j = resId;
        this.f۹۴۹۴k = true;
        m۱۱۳۱۱a(false);
    }

    /* renamed from: f  reason: contains not printable characters */
    public Drawable m۱۱۳۲۵f() {
        return this.f۹۴۹۷n;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۳۰۵a(Drawable itemBackground) {
        this.f۹۴۹۷n = itemBackground;
        m۱۱۳۱۱a(false);
    }

    /* renamed from: g  reason: contains not printable characters */
    public int m۱۱۳۲۶g() {
        return this.f۹۴۹۸o;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۱۳۲۰c(int itemHorizontalPadding) {
        this.f۹۴۹۸o = itemHorizontalPadding;
        m۱۱۳۱۱a(false);
    }

    /* renamed from: h  reason: contains not printable characters */
    public int m۱۱۳۲۷h() {
        return this.f۹۴۹۹p;
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۱۳۲۲d(int itemIconPadding) {
        this.f۹۴۹۹p = itemIconPadding;
        m۱۱۳۱۱a(false);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۳۱۶b(boolean updateSuspended) {
        Cc cVar = this.f۹۴۹۱h;
        if (cVar != null) {
            cVar.m۱۱۳۴۲b(updateSuspended);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۳۰۷a(Cc0 insets) {
        int top = insets.m۱۲۸۲۲e();
        if (this.f۹۵۰۰q != top) {
            this.f۹۵۰۰q = top;
            if (this.f۹۴۸۷d.getChildCount() == 0) {
                NavigationMenuView navigationMenuView = this.f۹۴۸۶c;
                navigationMenuView.setPadding(0, this.f۹۵۰۰q, 0, navigationMenuView.getPaddingBottom());
            }
        }
        Cu.m۱۲۹۷۵a(this.f۹۴۸۷d, insets);
    }

    /* renamed from: android.support.design.internal.c$k  reason: invalid class name */
    private static abstract class AbstractCk extends RecyclerView.AbstractCd0 {
        public AbstractCk(View itemView) {
            super(itemView);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.design.internal.c$h  reason: invalid class name */
    public static class Ch extends AbstractCk {
        public Ch(LayoutInflater inflater, ViewGroup parent, View.OnClickListener listener) {
            super(inflater.inflate(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ch.design_navigation_item, parent, false));
            this.f۱۱۶۳۷c.setOnClickListener(listener);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.design.internal.c$j  reason: invalid class name */
    public static class Cj extends AbstractCk {
        public Cj(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ch.design_navigation_item_subheader, parent, false));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.design.internal.c$i  reason: invalid class name */
    public static class Ci extends AbstractCk {
        public Ci(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(p۰۰۰a.p۰۰۵b.p۰۰۸c.Ch.design_navigation_item_separator, parent, false));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.design.internal.c$b  reason: invalid class name */
    public static class Cb extends AbstractCk {
        public Cb(View itemView) {
            super(itemView);
        }
    }

    /* renamed from: android.support.design.internal.c$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {
        View$OnClickListenerCa() {
        }

        public void onClick(View v) {
            Cc.this.m۱۱۳۱۶b(true);
            Ck item = ((NavigationMenuItemView) v).getItemData();
            Cc cVar = Cc.this;
            boolean result = cVar.f۹۴۸۹f.m۱۳۸۵۶a(item, cVar, 0);
            if (item != null && item.isCheckable() && result) {
                Cc.this.f۹۴۹۱h.m۱۱۳۳۷a(item);
            }
            Cc.this.m۱۱۳۱۶b(false);
            Cc.this.m۱۱۳۱۱a(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.design.internal.c$c  reason: invalid class name */
    public class Cc extends RecyclerView.AbstractCg<AbstractCk> {

        /* renamed from: c  reason: contains not printable characters */
        private final ArrayList<AbstractCe> f۹۵۰۴c = new ArrayList<>();

        /* renamed from: d  reason: contains not printable characters */
        private Ck f۹۵۰۵d;

        /* renamed from: e  reason: contains not printable characters */
        private boolean f۹۵۰۶e;

        Cc() {
            m۱۱۳۳۱h();
        }

        @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
        /* renamed from: a  reason: contains not printable characters */
        public long m۱۱۳۳۳a(int position) {
            return (long) position;
        }

        @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۱۳۳۲a() {
            return this.f۹۵۰۴c.size();
        }

        @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
        /* renamed from: b  reason: contains not printable characters */
        public int m۱۱۳۳۸b(int position) {
            AbstractCe item = this.f۹۵۰۴c.get(position);
            if (item instanceof Cf) {
                return 2;
            }
            if (item instanceof Cd) {
                return 3;
            }
            if (!(item instanceof Cg)) {
                throw new RuntimeException("Unknown item type.");
            } else if (((Cg) item).m۱۱۳۴۹a().hasSubMenu()) {
                return 1;
            } else {
                return 0;
            }
        }

        @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
        /* renamed from: b  reason: contains not printable characters */
        public AbstractCk m۱۱۳۴۰b(ViewGroup parent, int viewType) {
            if (viewType == 0) {
                Cc cVar = Cc.this;
                return new Ch(cVar.f۹۴۹۲i, parent, cVar.f۹۵۰۲s);
            } else if (viewType == 1) {
                return new Cj(Cc.this.f۹۴۹۲i, parent);
            } else {
                if (viewType == 2) {
                    return new Ci(Cc.this.f۹۴۹۲i, parent);
                }
                if (viewType != 3) {
                    return null;
                }
                return new Cb(Cc.this.f۹۴۸۷d);
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۳۴۱b(AbstractCk holder, int position) {
            int b = m۱۱۳۳۸b(position);
            if (b == 0) {
                NavigationMenuItemView itemView = (NavigationMenuItemView) holder.f۱۱۶۳۷c;
                itemView.setIconTintList(Cc.this.f۹۴۹۶m);
                Cc cVar = Cc.this;
                if (cVar.f۹۴۹۴k) {
                    itemView.setTextAppearance(cVar.f۹۴۹۳j);
                }
                ColorStateList colorStateList = Cc.this.f۹۴۹۵l;
                if (colorStateList != null) {
                    itemView.setTextColor(colorStateList);
                }
                Drawable drawable = Cc.this.f۹۴۹۷n;
                Cu.m۱۲۹۸۴a(itemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                Cg item = (Cg) this.f۹۵۰۴c.get(position);
                itemView.setNeedsEmptyIcon(item.f۹۵۱۱b);
                itemView.setHorizontalPadding(Cc.this.f۹۴۹۸o);
                itemView.setIconPadding(Cc.this.f۹۴۹۹p);
                itemView.m۱۱۲۹۵a(item.m۱۱۳۴۹a(), 0);
            } else if (b == 1) {
                ((TextView) holder.f۱۱۶۳۷c).setText(((Cg) this.f۹۵۰۴c.get(position)).m۱۱۳۴۹a().getTitle());
            } else if (b == 2) {
                Cf item2 = (Cf) this.f۹۵۰۴c.get(position);
                holder.f۱۱۶۳۷c.setPadding(0, item2.m۱۱۳۴۸b(), 0, item2.m۱۱۳۴۷a());
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۳۴۳d(AbstractCk holder) {
            if (holder instanceof Ch) {
                ((NavigationMenuItemView) holder.f۱۱۶۳۷c).m۱۱۲۹۷d();
            }
        }

        /* renamed from: g  reason: contains not printable characters */
        public void m۱۱۳۴۶g() {
            m۱۱۳۳۱h();
            m۱۴۴۵۰d();
        }

        /* renamed from: h  reason: contains not printable characters */
        private void m۱۱۳۳۱h() {
            if (!this.f۹۵۰۶e) {
                this.f۹۵۰۶e = true;
                this.f۹۵۰۴c.clear();
                this.f۹۵۰۴c.add(new Cd());
                int currentGroupId = -1;
                int currentGroupStart = 0;
                boolean currentGroupHasIcon = false;
                int i = 0;
                int totalSize = Cc.this.f۹۴۸۹f.m۱۳۸۸۲n().size();
                while (true) {
                    boolean z = false;
                    if (i < totalSize) {
                        Ck item = Cc.this.f۹۴۸۹f.m۱۳۸۸۲n().get(i);
                        if (item.isChecked()) {
                            m۱۱۳۳۷a(item);
                        }
                        if (item.isCheckable()) {
                            item.m۱۳۹۰۶c(false);
                        }
                        if (item.hasSubMenu()) {
                            SubMenu subMenu = item.getSubMenu();
                            if (subMenu.hasVisibleItems()) {
                                if (i != 0) {
                                    this.f۹۵۰۴c.add(new Cf(Cc.this.f۹۵۰۱r, 0));
                                }
                                this.f۹۵۰۴c.add(new Cg(item));
                                boolean subMenuHasIcon = false;
                                int subMenuStart = this.f۹۵۰۴c.size();
                                int size = subMenu.size();
                                for (int j = 0; j < size; j++) {
                                    Ck subMenuItem = (Ck) subMenu.getItem(j);
                                    if (subMenuItem.isVisible()) {
                                        if (!subMenuHasIcon && subMenuItem.getIcon() != null) {
                                            subMenuHasIcon = true;
                                        }
                                        if (subMenuItem.isCheckable()) {
                                            subMenuItem.m۱۳۹۰۶c(false);
                                        }
                                        if (item.isChecked()) {
                                            m۱۱۳۳۷a(item);
                                        }
                                        this.f۹۵۰۴c.add(new Cg(subMenuItem));
                                    }
                                }
                                if (subMenuHasIcon) {
                                    m۱۱۳۳۰a(subMenuStart, this.f۹۵۰۴c.size());
                                }
                            }
                        } else {
                            int groupId = item.getGroupId();
                            if (groupId != currentGroupId) {
                                currentGroupStart = this.f۹۵۰۴c.size();
                                if (item.getIcon() != null) {
                                    z = true;
                                }
                                currentGroupHasIcon = z;
                                if (i != 0) {
                                    currentGroupStart++;
                                    ArrayList<AbstractCe> arrayList = this.f۹۵۰۴c;
                                    int i2 = Cc.this.f۹۵۰۱r;
                                    arrayList.add(new Cf(i2, i2));
                                }
                            } else if (!currentGroupHasIcon && item.getIcon() != null) {
                                currentGroupHasIcon = true;
                                m۱۱۳۳۰a(currentGroupStart, this.f۹۵۰۴c.size());
                            }
                            Cg textItem = new Cg(item);
                            textItem.f۹۵۱۱b = currentGroupHasIcon;
                            this.f۹۵۰۴c.add(textItem);
                            currentGroupId = groupId;
                        }
                        i++;
                    } else {
                        this.f۹۵۰۶e = false;
                        return;
                    }
                }
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۱۳۳۰a(int startIndex, int endIndex) {
            for (int i = startIndex; i < endIndex; i++) {
                ((Cg) this.f۹۵۰۴c.get(i)).f۹۵۱۱b = true;
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۳۳۷a(Ck checkedItem) {
            if (this.f۹۵۰۵d != checkedItem && checkedItem.isCheckable()) {
                Ck kVar = this.f۹۵۰۵d;
                if (kVar != null) {
                    kVar.setChecked(false);
                }
                this.f۹۵۰۵d = checkedItem;
                checkedItem.setChecked(true);
            }
        }

        /* renamed from: f  reason: contains not printable characters */
        public Ck m۱۱۳۴۵f() {
            return this.f۹۵۰۵d;
        }

        /* renamed from: e  reason: contains not printable characters */
        public Bundle m۱۱۳۴۴e() {
            Bundle state = new Bundle();
            Ck kVar = this.f۹۵۰۵d;
            if (kVar != null) {
                state.putInt("android:menu:checked", kVar.getItemId());
            }
            SparseArray<ParcelableSparseArray> actionViewStates = new SparseArray<>();
            int size = this.f۹۵۰۴c.size();
            for (int i = 0; i < size; i++) {
                AbstractCe navigationMenuItem = this.f۹۵۰۴c.get(i);
                if (navigationMenuItem instanceof Cg) {
                    Ck item = ((Cg) navigationMenuItem).m۱۱۳۴۹a();
                    View actionView = item != null ? item.getActionView() : null;
                    if (actionView != null) {
                        Ce container = new Ce();
                        actionView.saveHierarchyState(container);
                        actionViewStates.put(item.getItemId(), container);
                    }
                }
            }
            state.putSparseParcelableArray("android:menu:action_views", actionViewStates);
            return state;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۳۳۴a(Bundle state) {
            Ck item;
            View actionView;
            Ce container;
            Ck menuItem;
            int checkedItem = state.getInt("android:menu:checked", 0);
            if (checkedItem != 0) {
                this.f۹۵۰۶e = true;
                int i = 0;
                int size = this.f۹۵۰۴c.size();
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    AbstractCe item2 = this.f۹۵۰۴c.get(i);
                    if ((item2 instanceof Cg) && (menuItem = ((Cg) item2).m۱۱۳۴۹a()) != null && menuItem.getItemId() == checkedItem) {
                        m۱۱۳۳۷a(menuItem);
                        break;
                    }
                    i++;
                }
                this.f۹۵۰۶e = false;
                m۱۱۳۳۱h();
            }
            SparseArray<ParcelableSparseArray> actionViewStates = state.getSparseParcelableArray("android:menu:action_views");
            if (actionViewStates != null) {
                int size2 = this.f۹۵۰۴c.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    AbstractCe navigationMenuItem = this.f۹۵۰۴c.get(i2);
                    if (!(!(navigationMenuItem instanceof Cg) || (item = ((Cg) navigationMenuItem).m۱۱۳۴۹a()) == null || (actionView = item.getActionView()) == null || (container = (Ce) actionViewStates.get(item.getItemId())) == null)) {
                        actionView.restoreHierarchyState(container);
                    }
                }
            }
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۱۳۴۲b(boolean updateSuspended) {
            this.f۹۵۰۶e = updateSuspended;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.design.internal.c$g  reason: invalid class name */
    public static class Cg implements AbstractCe {

        /* renamed from: a  reason: contains not printable characters */
        private final Ck f۹۵۱۰a;

        /* renamed from: b  reason: contains not printable characters */
        boolean f۹۵۱۱b;

        Cg(Ck item) {
            this.f۹۵۱۰a = item;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ck m۱۱۳۴۹a() {
            return this.f۹۵۱۰a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.design.internal.c$f  reason: invalid class name */
    public static class Cf implements AbstractCe {

        /* renamed from: a  reason: contains not printable characters */
        private final int f۹۵۰۸a;

        /* renamed from: b  reason: contains not printable characters */
        private final int f۹۵۰۹b;

        public Cf(int paddingTop, int paddingBottom) {
            this.f۹۵۰۸a = paddingTop;
            this.f۹۵۰۹b = paddingBottom;
        }

        /* renamed from: b  reason: contains not printable characters */
        public int m۱۱۳۴۸b() {
            return this.f۹۵۰۸a;
        }

        /* renamed from: a  reason: contains not printable characters */
        public int m۱۱۳۴۷a() {
            return this.f۹۵۰۹b;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.design.internal.c$d  reason: invalid class name */
    public static class Cd implements AbstractCe {
        Cd() {
        }
    }
}
