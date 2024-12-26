package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class b implements p {

    /* renamed from: c  reason: collision with root package name */
    protected Context f۱۶۶۱c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f۱۶۶۲d;

    /* renamed from: e  reason: collision with root package name */
    protected h f۱۶۶۳e;

    /* renamed from: f  reason: collision with root package name */
    protected LayoutInflater f۱۶۶۴f;

    /* renamed from: g  reason: collision with root package name */
    private p.a f۱۶۶۵g;

    /* renamed from: h  reason: collision with root package name */
    private int f۱۶۶۶h;
    private int i;
    protected q j;
    private int k;

    public abstract void a(k kVar, q.a aVar);

    public abstract boolean a(int i2, k kVar);

    public b(Context context, int menuLayoutRes, int itemLayoutRes) {
        this.f۱۶۶۱c = context;
        this.f۱۶۶۴f = LayoutInflater.from(context);
        this.f۱۶۶۶h = menuLayoutRes;
        this.i = itemLayoutRes;
    }

    @Override // android.support.v7.view.menu.p
    public void a(Context context, h menu) {
        this.f۱۶۶۲d = context;
        LayoutInflater.from(this.f۱۶۶۲d);
        this.f۱۶۶۳e = menu;
    }

    public q b(ViewGroup root) {
        if (this.j == null) {
            this.j = (q) this.f۱۶۶۴f.inflate(this.f۱۶۶۶h, root, false);
            this.j.a(this.f۱۶۶۳e);
            a(true);
        }
        return this.j;
    }

    @Override // android.support.v7.view.menu.p
    public void a(boolean cleared) {
        ViewGroup parent = (ViewGroup) this.j;
        if (parent != null) {
            int childIndex = 0;
            h hVar = this.f۱۶۶۳e;
            if (hVar != null) {
                hVar.b();
                ArrayList<MenuItemImpl> visibleItems = this.f۱۶۶۳e.n();
                int itemCount = visibleItems.size();
                for (int i2 = 0; i2 < itemCount; i2++) {
                    k item = (k) visibleItems.get(i2);
                    if (a(childIndex, item)) {
                        View convertView = parent.getChildAt(childIndex);
                        k oldItem = convertView instanceof q.a ? ((q.a) convertView).getItemData() : null;
                        View itemView = a(item, convertView, parent);
                        if (item != oldItem) {
                            itemView.setPressed(false);
                            itemView.jumpDrawablesToCurrentState();
                        }
                        if (itemView != convertView) {
                            a(itemView, childIndex);
                        }
                        childIndex++;
                    }
                }
            }
            while (childIndex < parent.getChildCount()) {
                if (!a(parent, childIndex)) {
                    childIndex++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(View itemView, int childIndex) {
        ViewGroup currentParent = (ViewGroup) itemView.getParent();
        if (currentParent != null) {
            currentParent.removeView(itemView);
        }
        ((ViewGroup) this.j).addView(itemView, childIndex);
    }

    /* access modifiers changed from: protected */
    public boolean a(ViewGroup parent, int childIndex) {
        parent.removeViewAt(childIndex);
        return true;
    }

    @Override // android.support.v7.view.menu.p
    public void a(p.a cb) {
        this.f۱۶۶۵g = cb;
    }

    public p.a d() {
        return this.f۱۶۶۵g;
    }

    public q.a a(ViewGroup parent) {
        return (q.a) this.f۱۶۶۴f.inflate(this.i, parent, false);
    }

    public View a(k item, View convertView, ViewGroup parent) {
        q.a itemView;
        if (convertView instanceof q.a) {
            itemView = (q.a) convertView;
        } else {
            itemView = a(parent);
        }
        a(item, itemView);
        return (View) itemView;
    }

    @Override // android.support.v7.view.menu.p
    public void a(h menu, boolean allMenusAreClosing) {
        p.a aVar = this.f۱۶۶۵g;
        if (aVar != null) {
            aVar.a(menu, allMenusAreClosing);
        }
    }

    @Override // android.support.v7.view.menu.p
    public boolean a(v menu) {
        p.a aVar = this.f۱۶۶۵g;
        if (aVar != null) {
            return aVar.a(menu);
        }
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

    @Override // android.support.v7.view.menu.p
    public int a() {
        return this.k;
    }

    public void a(int id) {
        this.k = id;
    }
}
