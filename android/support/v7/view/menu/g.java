package android.support.v7.view.menu;

import android.support.v7.view.menu.q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public class g extends BaseAdapter {

    /* renamed from: c  reason: collision with root package name */
    h f۱۶۹۴c;

    /* renamed from: d  reason: collision with root package name */
    private int f۱۶۹۵d = -1;

    /* renamed from: e  reason: collision with root package name */
    private boolean f۱۶۹۶e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f۱۶۹۷f;

    /* renamed from: g  reason: collision with root package name */
    private final LayoutInflater f۱۶۹۸g;

    /* renamed from: h  reason: collision with root package name */
    private final int f۱۶۹۹h;

    public g(h menu, LayoutInflater inflater, boolean overflowOnly, int itemLayoutRes) {
        this.f۱۶۹۷f = overflowOnly;
        this.f۱۶۹۸g = inflater;
        this.f۱۶۹۴c = menu;
        this.f۱۶۹۹h = itemLayoutRes;
        a();
    }

    public void a(boolean forceShow) {
        this.f۱۶۹۶e = forceShow;
    }

    public int getCount() {
        ArrayList<MenuItemImpl> items = this.f۱۶۹۷f ? this.f۱۶۹۴c.j() : this.f۱۶۹۴c.n();
        if (this.f۱۶۹۵d < 0) {
            return items.size();
        }
        return items.size() - 1;
    }

    public h b() {
        return this.f۱۶۹۴c;
    }

    public k getItem(int position) {
        ArrayList<MenuItemImpl> items = this.f۱۶۹۷f ? this.f۱۶۹۴c.j() : this.f۱۶۹۴c.n();
        int i = this.f۱۶۹۵d;
        if (i >= 0 && position >= i) {
            position++;
        }
        return (k) items.get(position);
    }

    public long getItemId(int position) {
        return (long) position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = this.f۱۶۹۸g.inflate(this.f۱۶۹۹h, parent, false);
        }
        int currGroupId = getItem(position).getGroupId();
        ((ListMenuItemView) convertView).setGroupDividerEnabled(this.f۱۶۹۴c.o() && currGroupId != (position + -1 >= 0 ? getItem(position + -1).getGroupId() : currGroupId));
        q.a itemView = (q.a) convertView;
        if (this.f۱۶۹۶e) {
            ((ListMenuItemView) convertView).setForceShowIcon(true);
        }
        itemView.a(getItem(position), 0);
        return convertView;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        k expandedItem = this.f۱۶۹۴c.f();
        if (expandedItem != null) {
            ArrayList<MenuItemImpl> items = this.f۱۶۹۴c.j();
            int count = items.size();
            for (int i = 0; i < count; i++) {
                if (((k) items.get(i)) == expandedItem) {
                    this.f۱۶۹۵d = i;
                    return;
                }
            }
        }
        this.f۱۶۹۵d = -1;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
