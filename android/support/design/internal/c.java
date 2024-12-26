package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.c0;
import android.support.v4.view.u;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.q;
import android.support.v7.view.menu.v;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class c implements p {

    /* renamed from: c  reason: collision with root package name */
    private NavigationMenuView f۷۳۴c;

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f۷۳۵d;

    /* renamed from: e  reason: collision with root package name */
    private p.a f۷۳۶e;

    /* renamed from: f  reason: collision with root package name */
    android.support.v7.view.menu.h f۷۳۷f;

    /* renamed from: g  reason: collision with root package name */
    private int f۷۳۸g;

    /* renamed from: h  reason: collision with root package name */
    C۰۰۲۳c f۷۳۹h;
    LayoutInflater i;
    int j;
    boolean k;
    ColorStateList l;
    ColorStateList m;
    Drawable n;
    int o;
    int p;
    private int q;
    int r;
    final View.OnClickListener s = new a();

    /* access modifiers changed from: private */
    public interface e {
    }

    @Override // android.support.v7.view.menu.p
    public void a(Context context, android.support.v7.view.menu.h menu) {
        this.i = LayoutInflater.from(context);
        this.f۷۳۷f = menu;
        this.r = context.getResources().getDimensionPixelOffset(a.b.c.d.design_navigation_separator_vertical_padding);
    }

    public q a(ViewGroup root) {
        if (this.f۷۳۴c == null) {
            this.f۷۳۴c = (NavigationMenuView) this.i.inflate(a.b.c.h.design_navigation_menu, root, false);
            if (this.f۷۳۹h == null) {
                this.f۷۳۹h = new C۰۰۲۳c();
            }
            this.f۷۳۵d = (LinearLayout) this.i.inflate(a.b.c.h.design_navigation_item_header, (ViewGroup) this.f۷۳۴c, false);
            this.f۷۳۴c.setAdapter(this.f۷۳۹h);
        }
        return this.f۷۳۴c;
    }

    @Override // android.support.v7.view.menu.p
    public void a(boolean cleared) {
        C۰۰۲۳c cVar = this.f۷۳۹h;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override // android.support.v7.view.menu.p
    public boolean a(v subMenu) {
        return false;
    }

    @Override // android.support.v7.view.menu.p
    public void a(android.support.v7.view.menu.h menu, boolean allMenusAreClosing) {
        p.a aVar = this.f۷۳۶e;
        if (aVar != null) {
            aVar.a(menu, allMenusAreClosing);
        }
    }

    @Override // android.support.v7.view.menu.p
    public boolean b() {
        return false;
    }

    @Override // android.support.v7.view.menu.p
    public boolean b(android.support.v7.view.menu.h menu, android.support.v7.view.menu.k item) {
        return false;
    }

    @Override // android.support.v7.view.menu.p
    public boolean a(android.support.v7.view.menu.h menu, android.support.v7.view.menu.k item) {
        return false;
    }

    @Override // android.support.v7.view.menu.p
    public int a() {
        return this.f۷۳۸g;
    }

    public void b(int id) {
        this.f۷۳۸g = id;
    }

    @Override // android.support.v7.view.menu.p
    public Parcelable c() {
        Bundle state = new Bundle();
        if (this.f۷۳۴c != null) {
            SparseArray<Parcelable> hierarchy = new SparseArray<>();
            this.f۷۳۴c.saveHierarchyState(hierarchy);
            state.putSparseParcelableArray("android:menu:list", hierarchy);
        }
        C۰۰۲۳c cVar = this.f۷۳۹h;
        if (cVar != null) {
            state.putBundle("android:menu:adapter", cVar.e());
        }
        if (this.f۷۳۵d != null) {
            SparseArray<Parcelable> header = new SparseArray<>();
            this.f۷۳۵d.saveHierarchyState(header);
            state.putSparseParcelableArray("android:menu:header", header);
        }
        return state;
    }

    @Override // android.support.v7.view.menu.p
    public void a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle state = (Bundle) parcelable;
            SparseArray<Parcelable> hierarchy = state.getSparseParcelableArray("android:menu:list");
            if (hierarchy != null) {
                this.f۷۳۴c.restoreHierarchyState(hierarchy);
            }
            Bundle adapterState = state.getBundle("android:menu:adapter");
            if (adapterState != null) {
                this.f۷۳۹h.a(adapterState);
            }
            SparseArray<Parcelable> header = state.getSparseParcelableArray("android:menu:header");
            if (header != null) {
                this.f۷۳۵d.restoreHierarchyState(header);
            }
        }
    }

    public void a(android.support.v7.view.menu.k item) {
        this.f۷۳۹h.a(item);
    }

    public android.support.v7.view.menu.k d() {
        return this.f۷۳۹h.f();
    }

    public View a(int res) {
        View view = this.i.inflate(res, (ViewGroup) this.f۷۳۵d, false);
        a(view);
        return view;
    }

    public void a(View view) {
        this.f۷۳۵d.addView(view);
        NavigationMenuView navigationMenuView = this.f۷۳۴c;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public int e() {
        return this.f۷۳۵d.getChildCount();
    }

    public ColorStateList j() {
        return this.m;
    }

    public void a(ColorStateList tint) {
        this.m = tint;
        a(false);
    }

    public ColorStateList i() {
        return this.l;
    }

    public void b(ColorStateList textColor) {
        this.l = textColor;
        a(false);
    }

    public void e(int resId) {
        this.j = resId;
        this.k = true;
        a(false);
    }

    public Drawable f() {
        return this.n;
    }

    public void a(Drawable itemBackground) {
        this.n = itemBackground;
        a(false);
    }

    public int g() {
        return this.o;
    }

    public void c(int itemHorizontalPadding) {
        this.o = itemHorizontalPadding;
        a(false);
    }

    public int h() {
        return this.p;
    }

    public void d(int itemIconPadding) {
        this.p = itemIconPadding;
        a(false);
    }

    public void b(boolean updateSuspended) {
        C۰۰۲۳c cVar = this.f۷۳۹h;
        if (cVar != null) {
            cVar.b(updateSuspended);
        }
    }

    public void a(c0 insets) {
        int top = insets.e();
        if (this.q != top) {
            this.q = top;
            if (this.f۷۳۵d.getChildCount() == 0) {
                NavigationMenuView navigationMenuView = this.f۷۳۴c;
                navigationMenuView.setPadding(0, this.q, 0, navigationMenuView.getPaddingBottom());
            }
        }
        u.a(this.f۷۳۵d, insets);
    }

    private static abstract class k extends RecyclerView.d0 {
        public k(View itemView) {
            super(itemView);
        }
    }

    /* access modifiers changed from: private */
    public static class h extends k {
        public h(LayoutInflater inflater, ViewGroup parent, View.OnClickListener listener) {
            super(inflater.inflate(a.b.c.h.design_navigation_item, parent, false));
            this.f۱۸۴۱c.setOnClickListener(listener);
        }
    }

    /* access modifiers changed from: private */
    public static class j extends k {
        public j(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(a.b.c.h.design_navigation_item_subheader, parent, false));
        }
    }

    /* access modifiers changed from: private */
    public static class i extends k {
        public i(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(a.b.c.h.design_navigation_item_separator, parent, false));
        }
    }

    /* access modifiers changed from: private */
    public static class b extends k {
        public b(View itemView) {
            super(itemView);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View v) {
            c.this.b(true);
            android.support.v7.view.menu.k item = ((NavigationMenuItemView) v).getItemData();
            c cVar = c.this;
            boolean result = cVar.f۷۳۷f.a(item, cVar, 0);
            if (item != null && item.isCheckable() && result) {
                c.this.f۷۳۹h.a(item);
            }
            c.this.b(false);
            c.this.a(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.design.internal.c$c  reason: collision with other inner class name */
    public class C۰۰۲۳c extends RecyclerView.g<k> {

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList<e> f۷۴۱c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        private android.support.v7.view.menu.k f۷۴۲d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f۷۴۳e;

        C۰۰۲۳c() {
            h();
        }

        @Override // android.support.v7.widget.RecyclerView.g
        public long a(int position) {
            return (long) position;
        }

        @Override // android.support.v7.widget.RecyclerView.g
        public int a() {
            return this.f۷۴۱c.size();
        }

        @Override // android.support.v7.widget.RecyclerView.g
        public int b(int position) {
            e item = this.f۷۴۱c.get(position);
            if (item instanceof f) {
                return 2;
            }
            if (item instanceof d) {
                return 3;
            }
            if (!(item instanceof g)) {
                throw new RuntimeException("Unknown item type.");
            } else if (((g) item).a().hasSubMenu()) {
                return 1;
            } else {
                return 0;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.g
        public k b(ViewGroup parent, int viewType) {
            if (viewType == 0) {
                c cVar = c.this;
                return new h(cVar.i, parent, cVar.s);
            } else if (viewType == 1) {
                return new j(c.this.i, parent);
            } else {
                if (viewType == 2) {
                    return new i(c.this.i, parent);
                }
                if (viewType != 3) {
                    return null;
                }
                return new b(c.this.f۷۳۵d);
            }
        }

        /* renamed from: a */
        public void b(k holder, int position) {
            int b2 = b(position);
            if (b2 == 0) {
                NavigationMenuItemView itemView = (NavigationMenuItemView) holder.f۱۸۴۱c;
                itemView.setIconTintList(c.this.m);
                c cVar = c.this;
                if (cVar.k) {
                    itemView.setTextAppearance(cVar.j);
                }
                ColorStateList colorStateList = c.this.l;
                if (colorStateList != null) {
                    itemView.setTextColor(colorStateList);
                }
                Drawable drawable = c.this.n;
                u.a(itemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                g item = (g) this.f۷۴۱c.get(position);
                itemView.setNeedsEmptyIcon(item.f۷۴۸b);
                itemView.setHorizontalPadding(c.this.o);
                itemView.setIconPadding(c.this.p);
                itemView.a(item.a(), 0);
            } else if (b2 == 1) {
                ((TextView) holder.f۱۸۴۱c).setText(((g) this.f۷۴۱c.get(position)).a().getTitle());
            } else if (b2 == 2) {
                f item2 = (f) this.f۷۴۱c.get(position);
                holder.f۱۸۴۱c.setPadding(0, item2.b(), 0, item2.a());
            }
        }

        /* renamed from: a */
        public void d(k holder) {
            if (holder instanceof h) {
                ((NavigationMenuItemView) holder.f۱۸۴۱c).d();
            }
        }

        public void g() {
            h();
            d();
        }

        private void h() {
            if (!this.f۷۴۳e) {
                this.f۷۴۳e = true;
                this.f۷۴۱c.clear();
                this.f۷۴۱c.add(new d());
                int currentGroupId = -1;
                int currentGroupStart = 0;
                boolean currentGroupHasIcon = false;
                int i = 0;
                int totalSize = c.this.f۷۳۷f.n().size();
                while (true) {
                    boolean z = false;
                    if (i < totalSize) {
                        android.support.v7.view.menu.k item = c.this.f۷۳۷f.n().get(i);
                        if (item.isChecked()) {
                            a(item);
                        }
                        if (item.isCheckable()) {
                            item.c(false);
                        }
                        if (item.hasSubMenu()) {
                            SubMenu subMenu = item.getSubMenu();
                            if (subMenu.hasVisibleItems()) {
                                if (i != 0) {
                                    this.f۷۴۱c.add(new f(c.this.r, 0));
                                }
                                this.f۷۴۱c.add(new g(item));
                                boolean subMenuHasIcon = false;
                                int subMenuStart = this.f۷۴۱c.size();
                                int size = subMenu.size();
                                for (int j = 0; j < size; j++) {
                                    android.support.v7.view.menu.k subMenuItem = (android.support.v7.view.menu.k) subMenu.getItem(j);
                                    if (subMenuItem.isVisible()) {
                                        if (!subMenuHasIcon && subMenuItem.getIcon() != null) {
                                            subMenuHasIcon = true;
                                        }
                                        if (subMenuItem.isCheckable()) {
                                            subMenuItem.c(false);
                                        }
                                        if (item.isChecked()) {
                                            a(item);
                                        }
                                        this.f۷۴۱c.add(new g(subMenuItem));
                                    }
                                }
                                if (subMenuHasIcon) {
                                    a(subMenuStart, this.f۷۴۱c.size());
                                }
                            }
                        } else {
                            int groupId = item.getGroupId();
                            if (groupId != currentGroupId) {
                                currentGroupStart = this.f۷۴۱c.size();
                                if (item.getIcon() != null) {
                                    z = true;
                                }
                                currentGroupHasIcon = z;
                                if (i != 0) {
                                    currentGroupStart++;
                                    ArrayList<e> arrayList = this.f۷۴۱c;
                                    int i2 = c.this.r;
                                    arrayList.add(new f(i2, i2));
                                }
                            } else if (!currentGroupHasIcon && item.getIcon() != null) {
                                currentGroupHasIcon = true;
                                a(currentGroupStart, this.f۷۴۱c.size());
                            }
                            g textItem = new g(item);
                            textItem.f۷۴۸b = currentGroupHasIcon;
                            this.f۷۴۱c.add(textItem);
                            currentGroupId = groupId;
                        }
                        i++;
                    } else {
                        this.f۷۴۳e = false;
                        return;
                    }
                }
            }
        }

        private void a(int startIndex, int endIndex) {
            for (int i = startIndex; i < endIndex; i++) {
                ((g) this.f۷۴۱c.get(i)).f۷۴۸b = true;
            }
        }

        public void a(android.support.v7.view.menu.k checkedItem) {
            if (this.f۷۴۲d != checkedItem && checkedItem.isCheckable()) {
                android.support.v7.view.menu.k kVar = this.f۷۴۲d;
                if (kVar != null) {
                    kVar.setChecked(false);
                }
                this.f۷۴۲d = checkedItem;
                checkedItem.setChecked(true);
            }
        }

        public android.support.v7.view.menu.k f() {
            return this.f۷۴۲d;
        }

        public Bundle e() {
            Bundle state = new Bundle();
            android.support.v7.view.menu.k kVar = this.f۷۴۲d;
            if (kVar != null) {
                state.putInt("android:menu:checked", kVar.getItemId());
            }
            SparseArray<ParcelableSparseArray> actionViewStates = new SparseArray<>();
            int size = this.f۷۴۱c.size();
            for (int i = 0; i < size; i++) {
                e navigationMenuItem = this.f۷۴۱c.get(i);
                if (navigationMenuItem instanceof g) {
                    android.support.v7.view.menu.k item = ((g) navigationMenuItem).a();
                    View actionView = item != null ? item.getActionView() : null;
                    if (actionView != null) {
                        e container = new e();
                        actionView.saveHierarchyState(container);
                        actionViewStates.put(item.getItemId(), container);
                    }
                }
            }
            state.putSparseParcelableArray("android:menu:action_views", actionViewStates);
            return state;
        }

        public void a(Bundle state) {
            android.support.v7.view.menu.k item;
            View actionView;
            e container;
            android.support.v7.view.menu.k menuItem;
            int checkedItem = state.getInt("android:menu:checked", 0);
            if (checkedItem != 0) {
                this.f۷۴۳e = true;
                int i = 0;
                int size = this.f۷۴۱c.size();
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    e item2 = this.f۷۴۱c.get(i);
                    if ((item2 instanceof g) && (menuItem = ((g) item2).a()) != null && menuItem.getItemId() == checkedItem) {
                        a(menuItem);
                        break;
                    }
                    i++;
                }
                this.f۷۴۳e = false;
                h();
            }
            SparseArray<ParcelableSparseArray> actionViewStates = state.getSparseParcelableArray("android:menu:action_views");
            if (actionViewStates != null) {
                int size2 = this.f۷۴۱c.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    e navigationMenuItem = this.f۷۴۱c.get(i2);
                    if (!(!(navigationMenuItem instanceof g) || (item = ((g) navigationMenuItem).a()) == null || (actionView = item.getActionView()) == null || (container = (e) actionViewStates.get(item.getItemId())) == null)) {
                        actionView.restoreHierarchyState(container);
                    }
                }
            }
        }

        public void b(boolean updateSuspended) {
            this.f۷۴۳e = updateSuspended;
        }
    }

    /* access modifiers changed from: private */
    public static class g implements e {

        /* renamed from: a  reason: collision with root package name */
        private final android.support.v7.view.menu.k f۷۴۷a;

        /* renamed from: b  reason: collision with root package name */
        boolean f۷۴۸b;

        g(android.support.v7.view.menu.k item) {
            this.f۷۴۷a = item;
        }

        public android.support.v7.view.menu.k a() {
            return this.f۷۴۷a;
        }
    }

    /* access modifiers changed from: private */
    public static class f implements e {

        /* renamed from: a  reason: collision with root package name */
        private final int f۷۴۵a;

        /* renamed from: b  reason: collision with root package name */
        private final int f۷۴۶b;

        public f(int paddingTop, int paddingBottom) {
            this.f۷۴۵a = paddingTop;
            this.f۷۴۶b = paddingBottom;
        }

        public int b() {
            return this.f۷۴۵a;
        }

        public int a() {
            return this.f۷۴۶b;
        }
    }

    /* access modifiers changed from: private */
    public static class d implements e {
        d() {
        }
    }
}
