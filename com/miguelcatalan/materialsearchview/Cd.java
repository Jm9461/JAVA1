package com.miguelcatalan.materialsearchview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.miguelcatalan.materialsearchview.d  reason: invalid class name */
public class Cd extends BaseAdapter implements Filterable {

    /* renamed from: c  reason: contains not printable characters */
    private ArrayList<String> f۱۴۸۳۵c = new ArrayList<>();

    /* renamed from: d  reason: contains not printable characters */
    private String[] f۱۴۸۳۶d;

    /* renamed from: e  reason: contains not printable characters */
    private Drawable f۱۴۸۳۷e;

    /* renamed from: f  reason: contains not printable characters */
    private LayoutInflater f۱۴۸۳۸f;

    /* renamed from: g  reason: contains not printable characters */
    private boolean f۱۴۸۳۹g;

    public Cd(Context context, String[] suggestions, Drawable suggestionIcon, boolean ellipsize) {
        this.f۱۴۸۳۸f = LayoutInflater.from(context);
        this.f۱۴۸۳۶d = suggestions;
        this.f۱۴۸۳۷e = suggestionIcon;
        this.f۱۴۸۳۹g = ellipsize;
    }

    /* renamed from: com.miguelcatalan.materialsearchview.d$a  reason: invalid class name */
    class Ca extends Filter {
        Ca() {
        }

        /* access modifiers changed from: protected */
        public Filter.FilterResults performFiltering(CharSequence constraint) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (!TextUtils.isEmpty(constraint)) {
                List<String> searchData = new ArrayList<>();
                String[] strArr = Cd.this.f۱۴۸۳۶d;
                for (String string : strArr) {
                    if (string.toLowerCase().startsWith(constraint.toString().toLowerCase())) {
                        searchData.add(string);
                    }
                }
                filterResults.values = searchData;
                filterResults.count = searchData.size();
            }
            return filterResults;
        }

        /* access modifiers changed from: protected */
        public void publishResults(CharSequence constraint, Filter.FilterResults results) {
            Object obj = results.values;
            if (obj != null) {
                Cd.this.f۱۴۸۳۵c = (ArrayList) obj;
                Cd.this.notifyDataSetChanged();
            }
        }
    }

    public Filter getFilter() {
        return new Ca();
    }

    public int getCount() {
        return this.f۱۴۸۳۵c.size();
    }

    public Object getItem(int position) {
        return this.f۱۴۸۳۵c.get(position);
    }

    public long getItemId(int position) {
        return (long) position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Cb viewHolder;
        if (convertView == null) {
            convertView = this.f۱۴۸۳۸f.inflate(Cb.suggest_item, parent, false);
            viewHolder = new Cb(this, convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (Cb) convertView.getTag();
        }
        viewHolder.f۱۴۸۴۱a.setText((String) getItem(position));
        if (this.f۱۴۸۳۹g) {
            viewHolder.f۱۴۸۴۱a.setSingleLine();
            viewHolder.f۱۴۸۴۱a.setEllipsize(TextUtils.TruncateAt.END);
        }
        return convertView;
    }

    /* renamed from: com.miguelcatalan.materialsearchview.d$b  reason: invalid class name */
    private class Cb {

        /* renamed from: a  reason: contains not printable characters */
        TextView f۱۴۸۴۱a;

        /* renamed from: b  reason: contains not printable characters */
        ImageView f۱۴۸۴۲b;

        public Cb(Cd dVar, View convertView) {
            this.f۱۴۸۴۱a = (TextView) convertView.findViewById(Ca.suggestion_text);
            if (dVar.f۱۴۸۳۷e != null) {
                this.f۱۴۸۴۲b = (ImageView) convertView.findViewById(Ca.suggestion_icon);
                this.f۱۴۸۴۲b.setImageDrawable(dVar.f۱۴۸۳۷e);
            }
        }
    }
}
