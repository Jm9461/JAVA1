package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;

class e extends Filter {

    /* renamed from: a  reason: collision with root package name */
    a f۱۴۴۷a;

    interface a {
        Cursor a();

        Cursor a(CharSequence charSequence);

        CharSequence a(Cursor cursor);

        void b(Cursor cursor);
    }

    e(a client) {
        this.f۱۴۴۷a = client;
    }

    public CharSequence convertResultToString(Object resultValue) {
        return this.f۱۴۴۷a.a((Cursor) resultValue);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence constraint) {
        Cursor cursor = this.f۱۴۴۷a.a(constraint);
        Filter.FilterResults results = new Filter.FilterResults();
        if (cursor != null) {
            results.count = cursor.getCount();
            results.values = cursor;
        } else {
            results.count = 0;
            results.values = null;
        }
        return results;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence constraint, Filter.FilterResults results) {
        Cursor oldCursor = this.f۱۴۴۷a.a();
        Object obj = results.values;
        if (obj != null && obj != oldCursor) {
            this.f۱۴۴۷a.b((Cursor) obj);
        }
    }
}
