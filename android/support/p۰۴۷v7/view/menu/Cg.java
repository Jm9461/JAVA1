package android.support.p۰۴۷v7.view.menu;

import android.support.p۰۴۷v7.view.menu.AbstractCq;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.g  reason: invalid class name */
public class Cg extends BaseAdapter {

    /* renamed from: c  reason: contains not printable characters */
    Ch f۱۱۲۵۶c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۱۲۵۷d = -1;

    /* renamed from: e  reason: contains not printable characters */
    private boolean f۱۱۲۵۸e;

    /* renamed from: f  reason: contains not printable characters */
    private final boolean f۱۱۲۵۹f;

    /* renamed from: g  reason: contains not printable characters */
    private final LayoutInflater f۱۱۲۶۰g;

    /* renamed from: h  reason: contains not printable characters */
    private final int f۱۱۲۶۱h;

    public Cg(Ch menu, LayoutInflater inflater, boolean overflowOnly, int itemLayoutRes) {
        this.f۱۱۲۵۹f = overflowOnly;
        this.f۱۱۲۶۰g = inflater;
        this.f۱۱۲۵۶c = menu;
        this.f۱۱۲۶۱h = itemLayoutRes;
        m۱۳۸۲۵a();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۸۲۶a(boolean forceShow) {
        this.f۱۱۲۵۸e = forceShow;
    }

    public int getCount() {
        ArrayList<MenuItemImpl> items = this.f۱۱۲۵۹f ? this.f۱۱۲۵۶c.m۱۳۸۷۸j() : this.f۱۱۲۵۶c.m۱۳۸۸۲n();
        if (this.f۱۱۲۵۷d < 0) {
            return items.size();
        }
        return items.size() - 1;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Ch m۱۳۸۲۷b() {
        return this.f۱۱۲۵۶c;
    }

    public Ck getItem(int position) {
        ArrayList<MenuItemImpl> items = this.f۱۱۲۵۹f ? this.f۱۱۲۵۶c.m۱۳۸۷۸j() : this.f۱۱۲۵۶c.m۱۳۸۸۲n();
        int i = this.f۱۱۲۵۷d;
        if (i >= 0 && position >= i) {
            position++;
        }
        return (Ck) items.get(position);
    }

    public long getItemId(int position) {
        return (long) position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = this.f۱۱۲۶۰g.inflate(this.f۱۱۲۶۱h, parent, false);
        }
        int currGroupId = getItem(position).getGroupId();
        ((ListMenuItemView) convertView).setGroupDividerEnabled(this.f۱۱۲۵۶c.m۱۳۸۸۳o() && currGroupId != (position + -1 >= 0 ? getItem(position + -1).getGroupId() : currGroupId));
        AbstractCq.AbstractCa itemView = (AbstractCq.AbstractCa) convertView;
        if (this.f۱۱۲۵۸e) {
            ((ListMenuItemView) convertView).setForceShowIcon(true);
        }
        itemView.m۱۳۹۸۰a(getItem(position), 0);
        return convertView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۸۲۵a() {
        Ck expandedItem = this.f۱۱۲۵۶c.m۱۳۸۷۴f();
        if (expandedItem != null) {
            ArrayList<MenuItemImpl> items = this.f۱۱۲۵۶c.m۱۳۸۷۸j();
            int count = items.size();
            for (int i = 0; i < count; i++) {
                if (((Ck) items.get(i)) == expandedItem) {
                    this.f۱۱۲۵۷d = i;
                    return;
                }
            }
        }
        this.f۱۱۲۵۷d = -1;
    }

    public void notifyDataSetChanged() {
        m۱۳۸۲۵a();
        super.notifyDataSetChanged();
    }
}
