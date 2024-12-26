package android.support.p۰۴۷v7.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.p۰۴۷v7.view.menu.AbstractCp;
import android.support.p۰۴۷v7.view.menu.AbstractCq;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cg;

/* renamed from: android.support.v7.view.menu.f  reason: invalid class name */
public class Cf implements AbstractCp, AdapterView.OnItemClickListener {

    /* renamed from: c  reason: contains not printable characters */
    Context f۱۱۲۴۴c;

    /* renamed from: d  reason: contains not printable characters */
    LayoutInflater f۱۱۲۴۵d;

    /* renamed from: e  reason: contains not printable characters */
    Ch f۱۱۲۴۶e;

    /* renamed from: f  reason: contains not printable characters */
    ExpandedMenuView f۱۱۲۴۷f;

    /* renamed from: g  reason: contains not printable characters */
    int f۱۱۲۴۸g;

    /* renamed from: h  reason: contains not printable characters */
    int f۱۱۲۴۹h;

    /* renamed from: i  reason: contains not printable characters */
    int f۱۱۲۵۰i;

    /* renamed from: j  reason: contains not printable characters */
    private AbstractCp.AbstractCa f۱۱۲۵۱j;

    /* renamed from: k  reason: contains not printable characters */
    Ca f۱۱۲۵۲k;

    /* renamed from: l  reason: contains not printable characters */
    private int f۱۱۲۵۳l;

    public Cf(Context context, int itemLayoutRes) {
        this(itemLayoutRes, 0);
        this.f۱۱۲۴۴c = context;
        this.f۱۱۲۴۵d = LayoutInflater.from(this.f۱۱۲۴۴c);
    }

    public Cf(int itemLayoutRes, int themeRes) {
        this.f۱۱۲۵۰i = itemLayoutRes;
        this.f۱۱۲۴۹h = themeRes;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۸۱۱a(Context context, Ch menu) {
        int i = this.f۱۱۲۴۹h;
        if (i != 0) {
            this.f۱۱۲۴۴c = new ContextThemeWrapper(context, i);
            this.f۱۱۲۴۵d = LayoutInflater.from(this.f۱۱۲۴۴c);
        } else if (this.f۱۱۲۴۴c != null) {
            this.f۱۱۲۴۴c = context;
            if (this.f۱۱۲۴۵d == null) {
                this.f۱۱۲۴۵d = LayoutInflater.from(this.f۱۱۲۴۴c);
            }
        }
        this.f۱۱۲۴۶e = menu;
        Ca aVar = this.f۱۱۲۵۲k;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCq m۱۳۸۱۰a(ViewGroup root) {
        if (this.f۱۱۲۴۷f == null) {
            this.f۱۱۲۴۷f = (ExpandedMenuView) this.f۱۱۲۴۵d.inflate(Cg.abc_expanded_menu_layout, root, false);
            if (this.f۱۱۲۵۲k == null) {
                this.f۱۱۲۵۲k = new Ca();
            }
            this.f۱۱۲۴۷f.setAdapter((ListAdapter) this.f۱۱۲۵۲k);
            this.f۱۱۲۴۷f.setOnItemClickListener(this);
        }
        return this.f۱۱۲۴۷f;
    }

    /* renamed from: d  reason: contains not printable characters */
    public ListAdapter m۱۳۸۲۳d() {
        if (this.f۱۱۲۵۲k == null) {
            this.f۱۱۲۵۲k = new Ca();
        }
        return this.f۱۱۲۵۲k;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۸۱۶a(boolean cleared) {
        Ca aVar = this.f۱۱۲۵۲k;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۸۱۵a(AbstractCp.AbstractCa cb) {
        this.f۱۱۲۵۱j = cb;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۸۱۸a(SubMenuCv subMenu) {
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        new DialogInterface$OnKeyListenerCi(subMenu).m۱۳۸۹۲a((IBinder) null);
        AbstractCp.AbstractCa aVar = this.f۱۱۲۵۱j;
        if (aVar == null) {
            return true;
        }
        aVar.m۱۳۹۷۸a(subMenu);
        return true;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۸۱۴a(Ch menu, boolean allMenusAreClosing) {
        AbstractCp.AbstractCa aVar = this.f۱۱۲۵۱j;
        if (aVar != null) {
            aVar.m۱۳۹۷۷a(menu, allMenusAreClosing);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        this.f۱۱۲۴۶e.m۱۳۸۵۶a(this.f۱۱۲۵۲k.getItem(position), this, 0);
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۸۲۰b() {
        return false;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۸۲۱b(Ch menu, Ck item) {
        return false;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۸۱۷a(Ch menu, Ck item) {
        return false;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۸۱۹b(Bundle outState) {
        SparseArray<Parcelable> viewStates = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f۱۱۲۴۷f;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(viewStates);
        }
        outState.putSparseParcelableArray("android:menu:list", viewStates);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۸۱۲a(Bundle inState) {
        SparseArray<Parcelable> viewStates = inState.getSparseParcelableArray("android:menu:list");
        if (viewStates != null) {
            this.f۱۱۲۴۷f.restoreHierarchyState(viewStates);
        }
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۳۸۰۹a() {
        return this.f۱۱۲۵۳l;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: c  reason: contains not printable characters */
    public Parcelable m۱۳۸۲۲c() {
        if (this.f۱۱۲۴۷f == null) {
            return null;
        }
        Bundle state = new Bundle();
        m۱۳۸۱۹b(state);
        return state;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۸۱۳a(Parcelable state) {
        m۱۳۸۱۲a((Bundle) state);
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.view.menu.f$a  reason: invalid class name */
    public class Ca extends BaseAdapter {

        /* renamed from: c  reason: contains not printable characters */
        private int f۱۱۲۵۴c = -1;

        public Ca() {
            m۱۳۸۲۴a();
        }

        public int getCount() {
            int count = Cf.this.f۱۱۲۴۶e.m۱۳۸۷۸j().size() - Cf.this.f۱۱۲۴۸g;
            if (this.f۱۱۲۵۴c < 0) {
                return count;
            }
            return count - 1;
        }

        public Ck getItem(int position) {
            ArrayList<MenuItemImpl> items = Cf.this.f۱۱۲۴۶e.m۱۳۸۷۸j();
            int position2 = position + Cf.this.f۱۱۲۴۸g;
            int i = this.f۱۱۲۵۴c;
            if (i >= 0 && position2 >= i) {
                position2++;
            }
            return (Ck) items.get(position2);
        }

        public long getItemId(int position) {
            return (long) position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                Cf fVar = Cf.this;
                convertView = fVar.f۱۱۲۴۵d.inflate(fVar.f۱۱۲۵۰i, parent, false);
            }
            ((AbstractCq.AbstractCa) convertView).m۱۳۹۸۰a(getItem(position), 0);
            return convertView;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۸۲۴a() {
            Ck expandedItem = Cf.this.f۱۱۲۴۶e.m۱۳۸۷۴f();
            if (expandedItem != null) {
                ArrayList<MenuItemImpl> items = Cf.this.f۱۱۲۴۶e.m۱۳۸۷۸j();
                int count = items.size();
                for (int i = 0; i < count; i++) {
                    if (((Ck) items.get(i)) == expandedItem) {
                        this.f۱۱۲۵۴c = i;
                        return;
                    }
                }
            }
            this.f۱۱۲۵۴c = -1;
        }

        public void notifyDataSetChanged() {
            m۱۳۸۲۴a();
            super.notifyDataSetChanged();
        }
    }
}
