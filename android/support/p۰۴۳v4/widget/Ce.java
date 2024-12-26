package android.support.p۰۴۳v4.widget;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: android.support.v4.widget.e  reason: invalid class name */
class Ce extends Filter {

    /* renamed from: a  reason: contains not printable characters */
    AbstractCa f۱۰۷۷۶a;

    /* renamed from: android.support.v4.widget.e$a  reason: invalid class name */
    interface AbstractCa {
        /* renamed from: a  reason: contains not printable characters */
        Cursor m۱۳۲۳۴a();

        /* renamed from: a  reason: contains not printable characters */
        Cursor m۱۳۲۳۵a(CharSequence charSequence);

        /* renamed from: a  reason: contains not printable characters */
        CharSequence m۱۳۲۳۶a(Cursor cursor);

        /* renamed from: b  reason: contains not printable characters */
        void m۱۳۲۳۷b(Cursor cursor);
    }

    Ce(AbstractCa client) {
        this.f۱۰۷۷۶a = client;
    }

    public CharSequence convertResultToString(Object resultValue) {
        return this.f۱۰۷۷۶a.m۱۳۲۳۶a((Cursor) resultValue);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence constraint) {
        Cursor cursor = this.f۱۰۷۷۶a.m۱۳۲۳۵a(constraint);
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
        Cursor oldCursor = this.f۱۰۷۷۶a.m۱۳۲۳۴a();
        Object obj = results.values;
        if (obj != null && obj != oldCursor) {
            this.f۱۰۷۷۶a.m۱۳۲۳۷b((Cursor) obj);
        }
    }
}
