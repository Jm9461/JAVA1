package android.support.v7.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.v7.view.menu.InterfaceCp;
import android.support.v7.view.menu.InterfaceCq;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cg;

/* renamed from: android.support.v7.view.menu.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cf implements InterfaceCp, AdapterView.OnItemClickListener {

    /* renamed from: c, reason: contains not printable characters */
    Context f۱۱۲۴۴c;

    /* renamed from: d, reason: contains not printable characters */
    LayoutInflater f۱۱۲۴۵d;

    /* renamed from: e, reason: contains not printable characters */
    Ch f۱۱۲۴۶e;

    /* renamed from: f, reason: contains not printable characters */
    ExpandedMenuView f۱۱۲۴۷f;

    /* renamed from: g, reason: contains not printable characters */
    int f۱۱۲۴۸g;

    /* renamed from: h, reason: contains not printable characters */
    int f۱۱۲۴۹h;

    /* renamed from: i, reason: contains not printable characters */
    int f۱۱۲۵۰i;

    /* renamed from: j, reason: contains not printable characters */
    private InterfaceCp.a f۱۱۲۵۱j;

    /* renamed from: k, reason: contains not printable characters */
    a f۱۱۲۵۲k;

    /* renamed from: l, reason: contains not printable characters */
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

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۲۹۴۵a(Context context, Ch menu) {
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
        a aVar = this.f۱۱۲۵۲k;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public InterfaceCq m۱۱۷۴۰a(ViewGroup root) {
        if (this.f۱۱۲۴۷f == null) {
            this.f۱۱۲۴۷f = (ExpandedMenuView) this.f۱۱۲۴۵d.inflate(Cg.abc_expanded_menu_layout, root, false);
            if (this.f۱۱۲۵۲k == null) {
                this.f۱۱۲۵۲k = new a();
            }
            this.f۱۱۲۴۷f.setAdapter((ListAdapter) this.f۱۱۲۵۲k);
            this.f۱۱۲۴۷f.setOnItemClickListener(this);
        }
        return this.f۱۱۲۴۷f;
    }

    /* renamed from: d, reason: contains not printable characters */
    public ListAdapter m۱۱۷۵۳d() {
        if (this.f۱۱۲۵۲k == null) {
            this.f۱۱۲۵۲k = new a();
        }
        return this.f۱۱۲۵۲k;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۲۹۵۲a(boolean cleared) {
        a aVar = this.f۱۱۲۵۲k;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۹۲۳a(InterfaceCp.a cb) {
        this.f۱۱۲۵۱j = cb;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۲۹۵۴a(SubMenuCv subMenu) {
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerCi(subMenu).m۱۱۸۲۲a((IBinder) null);
        InterfaceCp.a aVar = this.f۱۱۲۵۱j;
        if (aVar != null) {
            aVar.mo۱۲۹۷۷a(subMenu);
            return true;
        }
        return true;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۲۹۴۹a(Ch menu, boolean allMenusAreClosing) {
        InterfaceCp.a aVar = this.f۱۱۲۵۱j;
        if (aVar != null) {
            aVar.mo۱۲۹۷۶a(menu, allMenusAreClosing);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        this.f۱۱۲۴۶e.m۱۱۷۸۶a(this.f۱۱۲۵۲k.getItem(position), this, 0);
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: b, reason: contains not printable characters */
    public boolean mo۱۲۹۵۸b() {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: b, reason: contains not printable characters */
    public boolean mo۱۲۸۸۵b(Ch menu, Ck item) {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۲۸۸۲a(Ch menu, Ck item) {
        return false;
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۱۷۴۹b(Bundle outState) {
        SparseArray<Parcelable> viewStates = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f۱۱۲۴۷f;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(viewStates);
        }
        outState.putSparseParcelableArray("android:menu:list", viewStates);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۷۴۲a(Bundle inState) {
        SparseArray<Parcelable> viewStates = inState.getSparseParcelableArray("android:menu:list");
        if (viewStates != null) {
            this.f۱۱۲۴۷f.restoreHierarchyState(viewStates);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۲۸۷۷a() {
        return this.f۱۱۲۵۳l;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: c, reason: contains not printable characters */
    public Parcelable mo۱۲۹۵۹c() {
        if (this.f۱۱۲۴۷f == null) {
            return null;
        }
        Bundle state = new Bundle();
        m۱۱۷۴۹b(state);
        return state;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۲۹۴۸a(Parcelable state) {
        m۱۱۷۴۲a((Bundle) state);
    }

    /* renamed from: android.support.v7.view.menu.f$a */
    private class a extends BaseAdapter {

        /* renamed from: c, reason: contains not printable characters */
        private int f۱۱۲۵۴c = -1;

        public a() {
            m۱۱۷۵۴a();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int count = Cf.this.f۱۱۲۴۶e.m۱۱۸۰۸j().size() - Cf.this.f۱۱۲۴۸g;
            if (this.f۱۱۲۵۴c < 0) {
                return count;
            }
            return count - 1;
        }

        @Override // android.widget.Adapter
        public Ck getItem(int position) {
            ArrayList<Ck> arrayList = Cf.this.f۱۱۲۴۶e.m۱۱۸۰۸j();
            int position2 = position + Cf.this.f۱۱۲۴۸g;
            int i = this.f۱۱۲۵۴c;
            if (i >= 0 && position2 >= i) {
                position2++;
            }
            return arrayList.get(position2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                Cf cf = Cf.this;
                convertView = cf.f۱۱۲۴۵d.inflate(cf.f۱۱۲۵۰i, parent, false);
            }
            InterfaceCq.a itemView = (InterfaceCq.a) convertView;
            itemView.mo۱۱۹۱۰a(getItem(position), 0);
            return convertView;
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۱۱۷۵۴a() {
            Ck expandedItem = Cf.this.f۱۱۲۴۶e.m۱۱۸۰۴f();
            if (expandedItem != null) {
                ArrayList<Ck> arrayList = Cf.this.f۱۱۲۴۶e.m۱۱۸۰۸j();
                int count = arrayList.size();
                for (int i = 0; i < count; i++) {
                    Ck item = arrayList.get(i);
                    if (item == expandedItem) {
                        this.f۱۱۲۵۴c = i;
                        return;
                    }
                }
            }
            this.f۱۱۲۵۴c = -1;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m۱۱۷۵۴a();
            super.notifyDataSetChanged();
        }
    }
}
