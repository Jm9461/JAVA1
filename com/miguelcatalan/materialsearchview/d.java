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

public class d extends BaseAdapter implements Filterable {

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<String> f۳۲۹۱c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private String[] f۳۲۹۲d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f۳۲۹۳e;

    /* renamed from: f  reason: collision with root package name */
    private LayoutInflater f۳۲۹۴f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f۳۲۹۵g;

    public d(Context context, String[] suggestions, Drawable suggestionIcon, boolean ellipsize) {
        this.f۳۲۹۴f = LayoutInflater.from(context);
        this.f۳۲۹۲d = suggestions;
        this.f۳۲۹۳e = suggestionIcon;
        this.f۳۲۹۵g = ellipsize;
    }

    class a extends Filter {
        a() {
        }

        /* access modifiers changed from: protected */
        public Filter.FilterResults performFiltering(CharSequence constraint) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (!TextUtils.isEmpty(constraint)) {
                List<String> searchData = new ArrayList<>();
                String[] strArr = d.this.f۳۲۹۲d;
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
                d.this.f۳۲۹۱c = (ArrayList) obj;
                d.this.notifyDataSetChanged();
            }
        }
    }

    public Filter getFilter() {
        return new a();
    }

    public int getCount() {
        return this.f۳۲۹۱c.size();
    }

    public Object getItem(int position) {
        return this.f۳۲۹۱c.get(position);
    }

    public long getItemId(int position) {
        return (long) position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        b viewHolder;
        if (convertView == null) {
            convertView = this.f۳۲۹۴f.inflate(b.suggest_item, parent, false);
            viewHolder = new b(this, convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (b) convertView.getTag();
        }
        viewHolder.f۳۲۹۷a.setText((String) getItem(position));
        if (this.f۳۲۹۵g) {
            viewHolder.f۳۲۹۷a.setSingleLine();
            viewHolder.f۳۲۹۷a.setEllipsize(TextUtils.TruncateAt.END);
        }
        return convertView;
    }

    private class b {

        /* renamed from: a  reason: collision with root package name */
        TextView f۳۲۹۷a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f۳۲۹۸b;

        public b(d dVar, View convertView) {
            this.f۳۲۹۷a = (TextView) convertView.findViewById(a.suggestion_text);
            if (dVar.f۳۲۹۳e != null) {
                this.f۳۲۹۸b = (ImageView) convertView.findViewById(a.suggestion_icon);
                this.f۳۲۹۸b.setImageDrawable(dVar.f۳۲۹۳e);
            }
        }
    }
}
