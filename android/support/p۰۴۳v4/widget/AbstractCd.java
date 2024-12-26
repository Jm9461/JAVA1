package android.support.p۰۴۳v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.p۰۴۳v4.widget.Ce;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: android.support.v4.widget.d  reason: invalid class name */
public abstract class AbstractCd extends BaseAdapter implements Filterable, Ce.AbstractCa {

    /* renamed from: c  reason: contains not printable characters */
    protected boolean f۱۰۷۶۶c;

    /* renamed from: d  reason: contains not printable characters */
    protected boolean f۱۰۷۶۷d;

    /* renamed from: e  reason: contains not printable characters */
    protected Cursor f۱۰۷۶۸e;

    /* renamed from: f  reason: contains not printable characters */
    protected Context f۱۰۷۶۹f;

    /* renamed from: g  reason: contains not printable characters */
    protected int f۱۰۷۷۰g;

    /* renamed from: h  reason: contains not printable characters */
    protected Ca f۱۰۷۷۱h;

    /* renamed from: i  reason: contains not printable characters */
    protected DataSetObserver f۱۰۷۷۲i;

    /* renamed from: j  reason: contains not printable characters */
    protected Ce f۱۰۷۷۳j;

    /* renamed from: a  reason: contains not printable characters */
    public abstract View m۱۳۲۲۶a(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.support.p۰۴۳v4.widget.Ce.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public abstract CharSequence m۱۳۲۲۷a(Cursor cursor);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۳۲۲۹a(View view, Context context, Cursor cursor);

    /* renamed from: b  reason: contains not printable characters */
    public abstract View m۱۳۲۳۰b(Context context, Cursor cursor, ViewGroup viewGroup);

    public AbstractCd(Context context, Cursor c, boolean autoRequery) {
        m۱۳۲۲۸a(context, c, autoRequery ? 1 : 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۲۲۸a(Context context, Cursor c, int flags) {
        boolean cursorPresent = false;
        if ((flags & 1) == 1) {
            flags |= 2;
            this.f۱۰۷۶۷d = true;
        } else {
            this.f۱۰۷۶۷d = false;
        }
        if (c != null) {
            cursorPresent = true;
        }
        this.f۱۰۷۶۸e = c;
        this.f۱۰۷۶۶c = cursorPresent;
        this.f۱۰۷۶۹f = context;
        this.f۱۰۷۷۰g = cursorPresent ? c.getColumnIndexOrThrow("_id") : -1;
        if ((flags & 2) == 2) {
            this.f۱۰۷۷۱h = new Ca();
            this.f۱۰۷۷۲i = new Cb();
        } else {
            this.f۱۰۷۷۱h = null;
            this.f۱۰۷۷۲i = null;
        }
        if (cursorPresent) {
            Ca aVar = this.f۱۰۷۷۱h;
            if (aVar != null) {
                c.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f۱۰۷۷۲i;
            if (dataSetObserver != null) {
                c.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // android.support.p۰۴۳v4.widget.Ce.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public Cursor m۱۳۲۲۵a() {
        return this.f۱۰۷۶۸e;
    }

    public int getCount() {
        Cursor cursor;
        if (!this.f۱۰۷۶۶c || (cursor = this.f۱۰۷۶۸e) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public Object getItem(int position) {
        Cursor cursor;
        if (!this.f۱۰۷۶۶c || (cursor = this.f۱۰۷۶۸e) == null) {
            return null;
        }
        cursor.moveToPosition(position);
        return this.f۱۰۷۶۸e;
    }

    public long getItemId(int position) {
        Cursor cursor;
        if (!this.f۱۰۷۶۶c || (cursor = this.f۱۰۷۶۸e) == null || !cursor.moveToPosition(position)) {
            return 0;
        }
        return this.f۱۰۷۶۸e.getLong(this.f۱۰۷۷۰g);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        if (!this.f۱۰۷۶۶c) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f۱۰۷۶۸e.moveToPosition(position)) {
            if (convertView == null) {
                v = m۱۳۲۳۰b(this.f۱۰۷۶۹f, this.f۱۰۷۶۸e, parent);
            } else {
                v = convertView;
            }
            m۱۳۲۲۹a(v, this.f۱۰۷۶۹f, this.f۱۰۷۶۸e);
            return v;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + position);
        }
    }

    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View v;
        if (!this.f۱۰۷۶۶c) {
            return null;
        }
        this.f۱۰۷۶۸e.moveToPosition(position);
        if (convertView == null) {
            v = m۱۳۲۲۶a(this.f۱۰۷۶۹f, this.f۱۰۷۶۸e, parent);
        } else {
            v = convertView;
        }
        m۱۳۲۲۹a(v, this.f۱۰۷۶۹f, this.f۱۰۷۶۸e);
        return v;
    }

    @Override // android.support.p۰۴۳v4.widget.Ce.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۲۳۲b(Cursor cursor) {
        Cursor old = m۱۳۲۳۳c(cursor);
        if (old != null) {
            old.close();
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public Cursor m۱۳۲۳۳c(Cursor newCursor) {
        if (newCursor == this.f۱۰۷۶۸e) {
            return null;
        }
        Cursor oldCursor = this.f۱۰۷۶۸e;
        if (oldCursor != null) {
            Ca aVar = this.f۱۰۷۷۱h;
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
            Ca aVar2 = this.f۱۰۷۷۱h;
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

    public Filter getFilter() {
        if (this.f۱۰۷۷۳j == null) {
            this.f۱۰۷۷۳j = new Ce(this);
        }
        return this.f۱۰۷۷۳j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۲۳۱b() {
        Cursor cursor;
        if (this.f۱۰۷۶۷d && (cursor = this.f۱۰۷۶۸e) != null && !cursor.isClosed()) {
            this.f۱۰۷۶۶c = this.f۱۰۷۶۸e.requery();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.d$a  reason: invalid class name */
    public class Ca extends ContentObserver {
        Ca() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean selfChange) {
            AbstractCd.this.m۱۳۲۳۱b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.widget.d$b  reason: invalid class name */
    public class Cb extends DataSetObserver {
        Cb() {
        }

        public void onChanged() {
            AbstractCd dVar = AbstractCd.this;
            dVar.f۱۰۷۶۶c = true;
            dVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            AbstractCd dVar = AbstractCd.this;
            dVar.f۱۰۷۶۶c = false;
            dVar.notifyDataSetInvalidated();
        }
    }
}
