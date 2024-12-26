package android.support.v7.view.menu;

import android.support.v7.view.menu.InterfaceCq;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cg extends BaseAdapter {

    /* renamed from: c, reason: contains not printable characters */
    Ch f۱۱۲۵۶c;

    /* renamed from: d, reason: contains not printable characters */
    private int f۱۱۲۵۷d = -1;

    /* renamed from: e, reason: contains not printable characters */
    private boolean f۱۱۲۵۸e;

    /* renamed from: f, reason: contains not printable characters */
    private final boolean f۱۱۲۵۹f;

    /* renamed from: g, reason: contains not printable characters */
    private final LayoutInflater f۱۱۲۶۰g;

    /* renamed from: h, reason: contains not printable characters */
    private final int f۱۱۲۶۱h;

    public Cg(Ch menu, LayoutInflater inflater, boolean overflowOnly, int itemLayoutRes) {
        this.f۱۱۲۵۹f = overflowOnly;
        this.f۱۱۲۶۰g = inflater;
        this.f۱۱۲۵۶c = menu;
        this.f۱۱۲۶۱h = itemLayoutRes;
        m۱۱۷۵۵a();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۷۵۶a(boolean forceShow) {
        this.f۱۱۲۵۸e = forceShow;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<Ck> arrayList = this.f۱۱۲۵۹f ? this.f۱۱۲۵۶c.m۱۱۸۰۸j() : this.f۱۱۲۵۶c.m۱۱۸۱۲n();
        if (this.f۱۱۲۵۷d < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    /* renamed from: b, reason: contains not printable characters */
    public Ch m۱۱۷۵۷b() {
        return this.f۱۱۲۵۶c;
    }

    @Override // android.widget.Adapter
    public Ck getItem(int position) {
        ArrayList<Ck> arrayList = this.f۱۱۲۵۹f ? this.f۱۱۲۵۶c.m۱۱۸۰۸j() : this.f۱۱۲۵۶c.m۱۱۸۱۲n();
        int i = this.f۱۱۲۵۷d;
        if (i >= 0 && position >= i) {
            position++;
        }
        return arrayList.get(position);
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = this.f۱۱۲۶۰g.inflate(this.f۱۱۲۶۱h, parent, false);
        }
        int currGroupId = getItem(position).getGroupId();
        int prevGroupId = position + (-1) >= 0 ? getItem(position - 1).getGroupId() : currGroupId;
        ((ListMenuItemView) convertView).setGroupDividerEnabled(this.f۱۱۲۵۶c.mo۱۱۹۴۳o() && currGroupId != prevGroupId);
        InterfaceCq.a itemView = (InterfaceCq.a) convertView;
        if (this.f۱۱۲۵۸e) {
            ((ListMenuItemView) convertView).setForceShowIcon(true);
        }
        itemView.mo۱۱۹۱۰a(getItem(position), 0);
        return convertView;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۱۷۵۵a() {
        Ck expandedItem = this.f۱۱۲۵۶c.m۱۱۸۰۴f();
        if (expandedItem != null) {
            ArrayList<Ck> arrayList = this.f۱۱۲۵۶c.m۱۱۸۰۸j();
            int count = arrayList.size();
            for (int i = 0; i < count; i++) {
                Ck item = arrayList.get(i);
                if (item == expandedItem) {
                    this.f۱۱۲۵۷d = i;
                    return;
                }
            }
        }
        this.f۱۱۲۵۷d = -1;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m۱۱۷۵۵a();
        super.notifyDataSetChanged();
    }
}
