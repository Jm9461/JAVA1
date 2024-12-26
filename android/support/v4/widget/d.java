package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.v4.widget.e;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

public abstract class d extends BaseAdapter implements Filterable, e.a {

    /* renamed from: c  reason: collision with root package name */
    protected boolean f۱۴۳۹c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f۱۴۴۰d;

    /* renamed from: e  reason: collision with root package name */
    protected Cursor f۱۴۴۱e;

    /* renamed from: f  reason: collision with root package name */
    protected Context f۱۴۴۲f;

    /* renamed from: g  reason: collision with root package name */
    protected int f۱۴۴۳g;

    /* renamed from: h  reason: collision with root package name */
    protected a f۱۴۴۴h;
    protected DataSetObserver i;
    protected e j;

    public abstract View a(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.support.v4.widget.e.a
    public abstract CharSequence a(Cursor cursor);

    public abstract void a(View view, Context context, Cursor cursor);

    public abstract View b(Context context, Cursor cursor, ViewGroup viewGroup);

    public d(Context context, Cursor c2, boolean autoRequery) {
        a(context, c2, autoRequery ? 1 : 2);
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, Cursor c2, int flags) {
        boolean cursorPresent = false;
        if ((flags & 1) == 1) {
            flags |= 2;
            this.f۱۴۴۰d = true;
        } else {
            this.f۱۴۴۰d = false;
        }
        if (c2 != null) {
            cursorPresent = true;
        }
        this.f۱۴۴۱e = c2;
        this.f۱۴۳۹c = cursorPresent;
        this.f۱۴۴۲f = context;
        this.f۱۴۴۳g = cursorPresent ? c2.getColumnIndexOrThrow("_id") : -1;
        if ((flags & 2) == 2) {
            this.f۱۴۴۴h = new a();
            this.i = new b();
        } else {
            this.f۱۴۴۴h = null;
            this.i = null;
        }
        if (cursorPresent) {
            a aVar = this.f۱۴۴۴h;
            if (aVar != null) {
                c2.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.i;
            if (dataSetObserver != null) {
                c2.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // android.support.v4.widget.e.a
    public Cursor a() {
        return this.f۱۴۴۱e;
    }

    public int getCount() {
        Cursor cursor;
        if (!this.f۱۴۳۹c || (cursor = this.f۱۴۴۱e) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public Object getItem(int position) {
        Cursor cursor;
        if (!this.f۱۴۳۹c || (cursor = this.f۱۴۴۱e) == null) {
            return null;
        }
        cursor.moveToPosition(position);
        return this.f۱۴۴۱e;
    }

    public long getItemId(int position) {
        Cursor cursor;
        if (!this.f۱۴۳۹c || (cursor = this.f۱۴۴۱e) == null || !cursor.moveToPosition(position)) {
            return 0;
        }
        return this.f۱۴۴۱e.getLong(this.f۱۴۴۳g);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        if (!this.f۱۴۳۹c) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f۱۴۴۱e.moveToPosition(position)) {
            if (convertView == null) {
                v = b(this.f۱۴۴۲f, this.f۱۴۴۱e, parent);
            } else {
                v = convertView;
            }
            a(v, this.f۱۴۴۲f, this.f۱۴۴۱e);
            return v;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + position);
        }
    }

    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View v;
        if (!this.f۱۴۳۹c) {
            return null;
        }
        this.f۱۴۴۱e.moveToPosition(position);
        if (convertView == null) {
            v = a(this.f۱۴۴۲f, this.f۱۴۴۱e, parent);
        } else {
            v = convertView;
        }
        a(v, this.f۱۴۴۲f, this.f۱۴۴۱e);
        return v;
    }

    @Override // android.support.v4.widget.e.a
    public void b(Cursor cursor) {
        Cursor old = c(cursor);
        if (old != null) {
            old.close();
        }
    }

    public Cursor c(Cursor newCursor) {
        if (newCursor == this.f۱۴۴۱e) {
            return null;
        }
        Cursor oldCursor = this.f۱۴۴۱e;
        if (oldCursor != null) {
            a aVar = this.f۱۴۴۴h;
            if (aVar != null) {
                oldCursor.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.i;
            if (dataSetObserver != null) {
                oldCursor.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f۱۴۴۱e = newCursor;
        if (newCursor != null) {
            a aVar2 = this.f۱۴۴۴h;
            if (aVar2 != null) {
                newCursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.i;
            if (dataSetObserver2 != null) {
                newCursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f۱۴۴۳g = newCursor.getColumnIndexOrThrow("_id");
            this.f۱۴۳۹c = true;
            notifyDataSetChanged();
        } else {
            this.f۱۴۴۳g = -1;
            this.f۱۴۳۹c = false;
            notifyDataSetInvalidated();
        }
        return oldCursor;
    }

    public Filter getFilter() {
        if (this.j == null) {
            this.j = new e(this);
        }
        return this.j;
    }

    /* access modifiers changed from: protected */
    public void b() {
        Cursor cursor;
        if (this.f۱۴۴۰d && (cursor = this.f۱۴۴۱e) != null && !cursor.isClosed()) {
            this.f۱۴۳۹c = this.f۱۴۴۱e.requery();
        }
    }

    /* access modifiers changed from: private */
    public class a extends ContentObserver {
        a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean selfChange) {
            d.this.b();
        }
    }

    /* access modifiers changed from: private */
    public class b extends DataSetObserver {
        b() {
        }

        public void onChanged() {
            d dVar = d.this;
            dVar.f۱۴۳۹c = true;
            dVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            d dVar = d.this;
            dVar.f۱۴۳۹c = false;
            dVar.notifyDataSetInvalidated();
        }
    }
}
