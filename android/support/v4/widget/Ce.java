package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: android.support.v4.widget.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ce extends Filter {

    /* renamed from: a, reason: contains not printable characters */
    a f۱۰۷۷۶a;

    /* renamed from: android.support.v4.widget.e$a */
    interface a {
        /* renamed from: a, reason: contains not printable characters */
        Cursor mo۱۱۱۶۴a();

        /* renamed from: a, reason: contains not printable characters */
        Cursor mo۱۳۱۰۴a(CharSequence charSequence);

        /* renamed from: a, reason: contains not printable characters */
        CharSequence mo۱۳۱۰۶a(Cursor cursor);

        /* renamed from: b, reason: contains not printable characters */
        void mo۱۳۱۱۰b(Cursor cursor);
    }

    Ce(a client) {
        this.f۱۰۷۷۶a = client;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object resultValue) {
        return this.f۱۰۷۷۶a.mo۱۳۱۰۶a((Cursor) resultValue);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence constraint) {
        Cursor cursor = this.f۱۰۷۷۶a.mo۱۳۱۰۴a(constraint);
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

    @Override // android.widget.Filter
    protected void publishResults(CharSequence constraint, Filter.FilterResults results) {
        Cursor oldCursor = this.f۱۰۷۷۶a.mo۱۱۱۶۴a();
        Object obj = results.values;
        if (obj != null && obj != oldCursor) {
            this.f۱۰۷۷۶a.mo۱۳۱۱۰b((Cursor) obj);
        }
    }
}
