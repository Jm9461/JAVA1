package android.support.v7.view.menu;

import a.b.h.a.g;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.q;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

public class f implements p, AdapterView.OnItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    Context f۱۶۸۶c;

    /* renamed from: d  reason: collision with root package name */
    LayoutInflater f۱۶۸۷d;

    /* renamed from: e  reason: collision with root package name */
    h f۱۶۸۸e;

    /* renamed from: f  reason: collision with root package name */
    ExpandedMenuView f۱۶۸۹f;

    /* renamed from: g  reason: collision with root package name */
    int f۱۶۹۰g;

    /* renamed from: h  reason: collision with root package name */
    int f۱۶۹۱h;
    int i;
    private p.a j;
    a k;
    private int l;

    public f(Context context, int itemLayoutRes) {
        this(itemLayoutRes, 0);
        this.f۱۶۸۶c = context;
        this.f۱۶۸۷d = LayoutInflater.from(this.f۱۶۸۶c);
    }

    public f(int itemLayoutRes, int themeRes) {
        this.i = itemLayoutRes;
        this.f۱۶۹۱h = themeRes;
    }

    @Override // android.support.v7.view.menu.p
    public void a(Context context, h menu) {
        int i2 = this.f۱۶۹۱h;
        if (i2 != 0) {
            this.f۱۶۸۶c = new ContextThemeWrapper(context, i2);
            this.f۱۶۸۷d = LayoutInflater.from(this.f۱۶۸۶c);
        } else if (this.f۱۶۸۶c != null) {
            this.f۱۶۸۶c = context;
            if (this.f۱۶۸۷d == null) {
                this.f۱۶۸۷d = LayoutInflater.from(this.f۱۶۸۶c);
            }
        }
        this.f۱۶۸۸e = menu;
        a aVar = this.k;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public q a(ViewGroup root) {
        if (this.f۱۶۸۹f == null) {
            this.f۱۶۸۹f = (ExpandedMenuView) this.f۱۶۸۷d.inflate(g.abc_expanded_menu_layout, root, false);
            if (this.k == null) {
                this.k = new a();
            }
            this.f۱۶۸۹f.setAdapter((ListAdapter) this.k);
            this.f۱۶۸۹f.setOnItemClickListener(this);
        }
        return this.f۱۶۸۹f;
    }

    public ListAdapter d() {
        if (this.k == null) {
            this.k = new a();
        }
        return this.k;
    }

    @Override // android.support.v7.view.menu.p
    public void a(boolean cleared) {
        a aVar = this.k;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.p
    public void a(p.a cb) {
        this.j = cb;
    }

    @Override // android.support.v7.view.menu.p
    public boolean a(v subMenu) {
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        new i(subMenu).a((IBinder) null);
        p.a aVar = this.j;
        if (aVar == null) {
            return true;
        }
        aVar.a(subMenu);
        return true;
    }

    @Override // android.support.v7.view.menu.p
    public void a(h menu, boolean allMenusAreClosing) {
        p.a aVar = this.j;
        if (aVar != null) {
            aVar.a(menu, allMenusAreClosing);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        this.f۱۶۸۸e.a(this.k.getItem(position), this, 0);
    }

    @Override // android.support.v7.view.menu.p
    public boolean b() {
        return false;
    }

    @Override // android.support.v7.view.menu.p
    public boolean b(h menu, k item) {
        return false;
    }

    @Override // android.support.v7.view.menu.p
    public boolean a(h menu, k item) {
        return false;
    }

    public void b(Bundle outState) {
        SparseArray<Parcelable> viewStates = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f۱۶۸۹f;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(viewStates);
        }
        outState.putSparseParcelableArray("android:menu:list", viewStates);
    }

    public void a(Bundle inState) {
        SparseArray<Parcelable> viewStates = inState.getSparseParcelableArray("android:menu:list");
        if (viewStates != null) {
            this.f۱۶۸۹f.restoreHierarchyState(viewStates);
        }
    }

    @Override // android.support.v7.view.menu.p
    public int a() {
        return this.l;
    }

    @Override // android.support.v7.view.menu.p
    public Parcelable c() {
        if (this.f۱۶۸۹f == null) {
            return null;
        }
        Bundle state = new Bundle();
        b(state);
        return state;
    }

    @Override // android.support.v7.view.menu.p
    public void a(Parcelable state) {
        a((Bundle) state);
    }

    /* access modifiers changed from: private */
    public class a extends BaseAdapter {

        /* renamed from: c  reason: collision with root package name */
        private int f۱۶۹۲c = -1;

        public a() {
            a();
        }

        public int getCount() {
            int count = f.this.f۱۶۸۸e.j().size() - f.this.f۱۶۹۰g;
            if (this.f۱۶۹۲c < 0) {
                return count;
            }
            return count - 1;
        }

        public k getItem(int position) {
            ArrayList<MenuItemImpl> items = f.this.f۱۶۸۸e.j();
            int position2 = position + f.this.f۱۶۹۰g;
            int i = this.f۱۶۹۲c;
            if (i >= 0 && position2 >= i) {
                position2++;
            }
            return (k) items.get(position2);
        }

        public long getItemId(int position) {
            return (long) position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                f fVar = f.this;
                convertView = fVar.f۱۶۸۷d.inflate(fVar.i, parent, false);
            }
            ((q.a) convertView).a(getItem(position), 0);
            return convertView;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            k expandedItem = f.this.f۱۶۸۸e.f();
            if (expandedItem != null) {
                ArrayList<MenuItemImpl> items = f.this.f۱۶۸۸e.j();
                int count = items.size();
                for (int i = 0; i < count; i++) {
                    if (((k) items.get(i)) == expandedItem) {
                        this.f۱۶۹۲c = i;
                        return;
                    }
                }
            }
            this.f۱۶۹۲c = -1;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }
}
