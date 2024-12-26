package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.InterfaceCp;
import android.support.v7.view.menu.InterfaceCq;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCb implements InterfaceCp {

    /* renamed from: c, reason: contains not printable characters */
    protected Context f۱۱۱۹۴c;

    /* renamed from: d, reason: contains not printable characters */
    protected Context f۱۱۱۹۵d;

    /* renamed from: e, reason: contains not printable characters */
    protected Ch f۱۱۱۹۶e;

    /* renamed from: f, reason: contains not printable characters */
    protected LayoutInflater f۱۱۱۹۷f;

    /* renamed from: g, reason: contains not printable characters */
    private InterfaceCp.a f۱۱۱۹۸g;

    /* renamed from: h, reason: contains not printable characters */
    private int f۱۱۱۹۹h;

    /* renamed from: i, reason: contains not printable characters */
    private int f۱۱۲۰۰i;

    /* renamed from: j, reason: contains not printable characters */
    protected InterfaceCq f۱۱۲۰۱j;

    /* renamed from: k, reason: contains not printable characters */
    private int f۱۱۲۰۲k;

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۲۹۵۰a(Ck ck, InterfaceCq.a aVar);

    /* renamed from: a, reason: contains not printable characters */
    public abstract boolean mo۱۲۹۵۳a(int i, Ck ck);

    public AbstractCb(Context context, int menuLayoutRes, int itemLayoutRes) {
        this.f۱۱۱۹۴c = context;
        this.f۱۱۱۹۷f = LayoutInflater.from(context);
        this.f۱۱۱۹۹h = menuLayoutRes;
        this.f۱۱۲۰۰i = itemLayoutRes;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۲۹۴۵a(Context context, Ch menu) {
        this.f۱۱۱۹۵d = context;
        LayoutInflater.from(this.f۱۱۱۹۵d);
        this.f۱۱۱۹۶e = menu;
    }

    /* renamed from: b, reason: contains not printable characters */
    public InterfaceCq mo۱۲۹۵۶b(ViewGroup root) {
        if (this.f۱۱۲۰۱j == null) {
            this.f۱۱۲۰۱j = (InterfaceCq) this.f۱۱۱۹۷f.inflate(this.f۱۱۱۹۹h, root, false);
            this.f۱۱۲۰۱j.mo۱۱۹۸۴a(this.f۱۱۱۹۶e);
            mo۱۲۹۵۲a(true);
        }
        return this.f۱۱۲۰۱j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۲۹۵۲a(boolean cleared) {
        ViewGroup parent = (ViewGroup) this.f۱۱۲۰۱j;
        if (parent == null) {
            return;
        }
        int childIndex = 0;
        Ch ch = this.f۱۱۱۹۶e;
        if (ch != null) {
            ch.m۱۱۷۸۸b();
            ArrayList<Ck> arrayList = this.f۱۱۱۹۶e.m۱۱۸۱۲n();
            int itemCount = arrayList.size();
            for (int i = 0; i < itemCount; i++) {
                Ck item = arrayList.get(i);
                if (mo۱۲۹۵۳a(childIndex, item)) {
                    View childAt = parent.getChildAt(childIndex);
                    Ck oldItem = childAt instanceof InterfaceCq.a ? ((InterfaceCq.a) childAt).getItemData() : null;
                    View itemView = mo۱۲۹۴۴a(item, childAt, parent);
                    if (item != oldItem) {
                        itemView.setPressed(false);
                        itemView.jumpDrawablesToCurrentState();
                    }
                    if (itemView != childAt) {
                        m۱۱۶۹۶a(itemView, childIndex);
                    }
                    childIndex++;
                }
            }
        }
        while (childIndex < parent.getChildCount()) {
            if (!mo۱۲۹۵۵a(parent, childIndex)) {
                childIndex++;
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    protected void m۱۱۶۹۶a(View itemView, int childIndex) {
        ViewGroup currentParent = (ViewGroup) itemView.getParent();
        if (currentParent != null) {
            currentParent.removeView(itemView);
        }
        ((ViewGroup) this.f۱۱۲۰۱j).addView(itemView, childIndex);
    }

    /* renamed from: a, reason: contains not printable characters */
    protected boolean mo۱۲۹۵۵a(ViewGroup parent, int childIndex) {
        parent.removeViewAt(childIndex);
        return true;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۹۲۳a(InterfaceCp.a cb) {
        this.f۱۱۱۹۸g = cb;
    }

    /* renamed from: d, reason: contains not printable characters */
    public InterfaceCp.a m۱۱۷۰۴d() {
        return this.f۱۱۱۹۸g;
    }

    /* renamed from: a, reason: contains not printable characters */
    public InterfaceCq.a m۱۱۶۸۹a(ViewGroup parent) {
        return (InterfaceCq.a) this.f۱۱۱۹۷f.inflate(this.f۱۱۲۰۰i, parent, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: contains not printable characters */
    public View mo۱۲۹۴۴a(Ck item, View view, ViewGroup parent) {
        InterfaceCq.a itemView;
        if (view instanceof InterfaceCq.a) {
            itemView = (InterfaceCq.a) view;
        } else {
            itemView = m۱۱۶۸۹a(parent);
        }
        mo۱۲۹۵۰a(item, itemView);
        return (View) itemView;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۲۹۴۹a(Ch menu, boolean allMenusAreClosing) {
        InterfaceCp.a aVar = this.f۱۱۱۹۸g;
        if (aVar != null) {
            aVar.mo۱۲۹۷۶a(menu, allMenusAreClosing);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۲۹۵۴a(SubMenuCv menu) {
        InterfaceCp.a aVar = this.f۱۱۱۹۸g;
        if (aVar != null) {
            return aVar.mo۱۲۹۷۷a(menu);
        }
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

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۲۸۷۷a() {
        return this.f۱۱۲۰۲k;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۶۹۱a(int id) {
        this.f۱۱۲۰۲k = id;
    }
}
