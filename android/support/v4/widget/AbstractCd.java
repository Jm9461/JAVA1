package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.v4.widget.Ce;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: android.support.v4.widget.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCd extends BaseAdapter implements Filterable, Ce.a {

    /* renamed from: c, reason: contains not printable characters */
    protected boolean f۱۰۷۶۶c;

    /* renamed from: d, reason: contains not printable characters */
    protected boolean f۱۰۷۶۷d;

    /* renamed from: e, reason: contains not printable characters */
    protected Cursor f۱۰۷۶۸e;

    /* renamed from: f, reason: contains not printable characters */
    protected Context f۱۰۷۶۹f;

    /* renamed from: g, reason: contains not printable characters */
    protected int f۱۰۷۷۰g;

    /* renamed from: h, reason: contains not printable characters */
    protected a f۱۰۷۷۱h;

    /* renamed from: i, reason: contains not printable characters */
    protected DataSetObserver f۱۰۷۷۲i;

    /* renamed from: j, reason: contains not printable characters */
    protected Ce f۱۰۷۷۳j;

    /* renamed from: a, reason: contains not printable characters */
    public abstract View mo۱۱۲۲۶a(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.support.v4.widget.Ce.a
    /* renamed from: a, reason: contains not printable characters */
    public abstract CharSequence mo۱۳۱۰۶a(Cursor cursor);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۳۱۰۸a(View view, Context context, Cursor cursor);

    /* renamed from: b, reason: contains not printable characters */
    public abstract View mo۱۳۱۰۹b(Context context, Cursor cursor, ViewGroup viewGroup);

    public AbstractCd(Context context, Cursor c2, boolean autoRequery) {
        m۱۱۱۵۸a(context, c2, autoRequery ? 1 : 2);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۱۱۵۸a(Context context, Cursor c2, int flags) {
        if ((flags & 1) == 1) {
            flags |= 2;
            this.f۱۰۷۶۷d = true;
        } else {
            this.f۱۰۷۶۷d = false;
        }
        boolean cursorPresent = c2 != null;
        this.f۱۰۷۶۸e = c2;
        this.f۱۰۷۶۶c = cursorPresent;
        this.f۱۰۷۶۹f = context;
        this.f۱۰۷۷۰g = cursorPresent ? c2.getColumnIndexOrThrow("_id") : -1;
        if ((flags & 2) == 2) {
            this.f۱۰۷۷۱h = new a();
            this.f۱۰۷۷۲i = new b();
        } else {
            this.f۱۰۷۷۱h = null;
            this.f۱۰۷۷۲i = null;
        }
        if (cursorPresent) {
            a aVar = this.f۱۰۷۷۱h;
            if (aVar != null) {
                c2.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f۱۰۷۷۲i;
            if (dataSetObserver != null) {
                c2.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // android.support.v4.widget.Ce.a
    /* renamed from: a, reason: contains not printable characters */
    public Cursor mo۱۱۱۶۴a() {
        return this.f۱۰۷۶۸e;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (this.f۱۰۷۶۶c && (cursor = this.f۱۰۷۶۸e) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int position) {
        Cursor cursor;
        if (this.f۱۰۷۶۶c && (cursor = this.f۱۰۷۶۸e) != null) {
            cursor.moveToPosition(position);
            return this.f۱۰۷۶۸e;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        Cursor cursor;
        if (this.f۱۰۷۶۶c && (cursor = this.f۱۰۷۶۸e) != null && cursor.moveToPosition(position)) {
            return this.f۱۰۷۶۸e.getLong(this.f۱۰۷۷۰g);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        if (!this.f۱۰۷۶۶c) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f۱۰۷۶۸e.moveToPosition(position)) {
            throw new IllegalStateException("couldn't move cursor to position " + position);
        }
        if (convertView == null) {
            v = mo۱۳۱۰۹b(this.f۱۰۷۶۹f, this.f۱۰۷۶۸e, parent);
        } else {
            v = convertView;
        }
        mo۱۳۱۰۸a(v, this.f۱۰۷۶۹f, this.f۱۰۷۶۸e);
        return v;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View v;
        if (this.f۱۰۷۶۶c) {
            this.f۱۰۷۶۸e.moveToPosition(position);
            if (convertView == null) {
                v = mo۱۱۲۲۶a(this.f۱۰۷۶۹f, this.f۱۰۷۶۸e, parent);
            } else {
                v = convertView;
            }
            mo۱۳۱۰۸a(v, this.f۱۰۷۶۹f, this.f۱۰۷۶۸e);
            return v;
        }
        return null;
    }

    @Override // android.support.v4.widget.Ce.a
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۳۱۱۰b(Cursor cursor) {
        Cursor old = m۱۱۱۶۳c(cursor);
        if (old != null) {
            old.close();
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public Cursor m۱۱۱۶۳c(Cursor newCursor) {
        if (newCursor == this.f۱۰۷۶۸e) {
            return null;
        }
        Cursor oldCursor = this.f۱۰۷۶۸e;
        if (oldCursor != null) {
            a aVar = this.f۱۰۷۷۱h;
            if (aVar != null) {
                oldCursor.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f۱۰۷۷۲i;
            if (dataSetObserver != null) {
                oldCursor.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f۱۰۷۶۸e = newCursor;
        if (newCursor != null) {
            a aVar2 = this.f۱۰۷۷۱h;
            if (aVar2 != null) {
                newCursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f۱۰۷۷۲i;
            if (dataSetObserver2 != null) {
                newCursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f۱۰۷۷۰g = newCursor.getColumnIndexOrThrow("_id");
            this.f۱۰۷۶۶c = true;
            notifyDataSetChanged();
        } else {
            this.f۱۰۷۷۰g = -1;
            this.f۱۰۷۶۶c = false;
            notifyDataSetInvalidated();
        }
        return oldCursor;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f۱۰۷۷۳j == null) {
            this.f۱۰۷۷۳j = new Ce(this);
        }
        return this.f۱۰۷۷۳j;
    }

    /* renamed from: b, reason: contains not printable characters */
    protected void m۱۱۱۶۱b() {
        Cursor cursor;
        if (this.f۱۰۷۶۷d && (cursor = this.f۱۰۷۶۸e) != null && !cursor.isClosed()) {
            this.f۱۰۷۶۶c = this.f۱۰۷۶۸e.requery();
        }
    }

    /* renamed from: android.support.v4.widget.d$a */
    private class a extends ContentObserver {
        a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange) {
            AbstractCd.this.m۱۱۱۶۱b();
        }
    }

    /* renamed from: android.support.v4.widget.d$b */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractCd abstractCd = AbstractCd.this;
            abstractCd.f۱۰۷۶۶c = true;
            abstractCd.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractCd abstractCd = AbstractCd.this;
            abstractCd.f۱۰۷۶۶c = false;
            abstractCd.notifyDataSetInvalidated();
        }
    }
}
