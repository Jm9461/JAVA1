package android.support.p۰۴۷v7.view.menu;

import android.content.Context;
import android.support.p۰۴۷v7.view.menu.AbstractCp;
import android.support.p۰۴۷v7.view.menu.AbstractCq;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.b  reason: invalid class name */
public abstract class AbstractCb implements AbstractCp {

    /* renamed from: c  reason: contains not printable characters */
    protected Context f۱۱۱۹۴c;

    /* renamed from: d  reason: contains not printable characters */
    protected Context f۱۱۱۹۵d;

    /* renamed from: e  reason: contains not printable characters */
    protected Ch f۱۱۱۹۶e;

    /* renamed from: f  reason: contains not printable characters */
    protected LayoutInflater f۱۱۱۹۷f;

    /* renamed from: g  reason: contains not printable characters */
    private AbstractCp.AbstractCa f۱۱۱۹۸g;

    /* renamed from: h  reason: contains not printable characters */
    private int f۱۱۱۹۹h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۱۲۰۰i;

    /* renamed from: j  reason: contains not printable characters */
    protected AbstractCq f۱۱۲۰۱j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۱۱۲۰۲k;

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۳۷۶۴a(Ck kVar, AbstractCq.AbstractCa aVar);

    /* renamed from: a  reason: contains not printable characters */
    public abstract boolean m۱۳۷۶۸a(int i, Ck kVar);

    public AbstractCb(Context context, int menuLayoutRes, int itemLayoutRes) {
        this.f۱۱۱۹۴c = context;
        this.f۱۱۱۹۷f = LayoutInflater.from(context);
        this.f۱۱۱۹۹h = menuLayoutRes;
        this.f۱۱۲۰۰i = itemLayoutRes;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۷۶۲a(Context context, Ch menu) {
        this.f۱۱۱۹۵d = context;
        LayoutInflater.from(this.f۱۱۱۹۵d);
        this.f۱۱۱۹۶e = menu;
    }

    /* renamed from: b  reason: contains not printable characters */
    public AbstractCq m۱۳۷۷۲b(ViewGroup root) {
        if (this.f۱۱۲۰۱j == null) {
            this.f۱۱۲۰۱j = (AbstractCq) this.f۱۱۱۹۷f.inflate(this.f۱۱۱۹۹h, root, false);
            this.f۱۱۲۰۱j.m۱۳۹۷۹a(this.f۱۱۱۹۶e);
            m۱۳۷۶۷a(true);
        }
        return this.f۱۱۲۰۱j;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۷۶۷a(boolean cleared) {
        ViewGroup parent = (ViewGroup) this.f۱۱۲۰۱j;
        if (parent != null) {
            int childIndex = 0;
            Ch hVar = this.f۱۱۱۹۶e;
            if (hVar != null) {
                hVar.m۱۳۸۵۸b();
                ArrayList<MenuItemImpl> visibleItems = this.f۱۱۱۹۶e.m۱۳۸۸۲n();
                int itemCount = visibleItems.size();
                for (int i = 0; i < itemCount; i++) {
                    Ck item = (Ck) visibleItems.get(i);
                    if (m۱۳۷۶۸a(childIndex, item)) {
                        View convertView = parent.getChildAt(childIndex);
                        Ck oldItem = convertView instanceof AbstractCq.AbstractCa ? ((AbstractCq.AbstractCa) convertView).getItemData() : null;
                        View itemView = m۱۳۷۶۰a(item, convertView, parent);
                        if (item != oldItem) {
                            itemView.setPressed(false);
                            itemView.jumpDrawablesToCurrentState();
                        }
                        if (itemView != convertView) {
                            m۱۳۷۶۶a(itemView, childIndex);
                        }
                        childIndex++;
                    }
                }
            }
            while (childIndex < parent.getChildCount()) {
                if (!m۱۳۷۷۱a(parent, childIndex)) {
                    childIndex++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۷۶۶a(View itemView, int childIndex) {
        ViewGroup currentParent = (ViewGroup) itemView.getParent();
        if (currentParent != null) {
            currentParent.removeView(itemView);
        }
        ((ViewGroup) this.f۱۱۲۰۱j).addView(itemView, childIndex);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۷۷۱a(ViewGroup parent, int childIndex) {
        parent.removeViewAt(childIndex);
        return true;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۷۶۵a(AbstractCp.AbstractCa cb) {
        this.f۱۱۱۹۸g = cb;
    }

    /* renamed from: d  reason: contains not printable characters */
    public AbstractCp.AbstractCa m۱۳۷۷۴d() {
        return this.f۱۱۱۹۸g;
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCq.AbstractCa m۱۳۷۵۹a(ViewGroup parent) {
        return (AbstractCq.AbstractCa) this.f۱۱۱۹۷f.inflate(this.f۱۱۲۰۰i, parent, false);
    }

    /* renamed from: a  reason: contains not printable characters */
    public View m۱۳۷۶۰a(Ck item, View convertView, ViewGroup parent) {
        AbstractCq.AbstractCa itemView;
        if (convertView instanceof AbstractCq.AbstractCa) {
            itemView = (AbstractCq.AbstractCa) convertView;
        } else {
            itemView = m۱۳۷۵۹a(parent);
        }
        m۱۳۷۶۴a(item, itemView);
        return (View) itemView;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۷۶۳a(Ch menu, boolean allMenusAreClosing) {
        AbstractCp.AbstractCa aVar = this.f۱۱۱۹۸g;
        if (aVar != null) {
            aVar.m۱۳۹۷۷a(menu, allMenusAreClosing);
        }
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۷۷۰a(SubMenuCv menu) {
        AbstractCp.AbstractCa aVar = this.f۱۱۱۹۸g;
        if (aVar != null) {
            return aVar.m۱۳۹۷۸a(menu);
        }
        return false;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۷۷۳b(Ch menu, Ck item) {
        return false;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۷۶۹a(Ch menu, Ck item) {
        return false;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۳۷۵۸a() {
        return this.f۱۱۲۰۲k;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۷۶۱a(int id) {
        this.f۱۱۲۰۲k = id;
    }
}
