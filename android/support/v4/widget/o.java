package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class o extends d {
    private int k;
    private int l;
    private LayoutInflater m;

    @Deprecated
    public o(Context context, int layout, Cursor c2, boolean autoRequery) {
        super(context, c2, autoRequery);
        this.l = layout;
        this.k = layout;
        this.m = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // android.support.v4.widget.d
    public View b(Context context, Cursor cursor, ViewGroup parent) {
        return this.m.inflate(this.k, parent, false);
    }

    @Override // android.support.v4.widget.d
    public View a(Context context, Cursor cursor, ViewGroup parent) {
        return this.m.inflate(this.l, parent, false);
    }
}
