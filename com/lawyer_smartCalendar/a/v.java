package com.lawyer_smartCalendar.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.andexert.library.RippleView;
import com.lawyer_smartCalendar.R;

public class v extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۳۰۵۳c;

    /* renamed from: d  reason: collision with root package name */
    private String[][] f۳۰۵۴d;

    /* renamed from: e  reason: collision with root package name */
    private RippleView f۳۰۵۵e;

    public class a extends RecyclerView.d0 {
        TextView v;

        public a(View convertView) {
            super(convertView);
            this.v = (TextView) convertView.findViewById(R.id.txt_link_title);
            v.this.f۳۰۵۵e = (RippleView) convertView.findViewById(R.id.rippleView);
            v.this.f۳۰۵۵e.setOnRippleCompleteListener(new C۰۱۰۱a(v.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.v$a$a  reason: collision with other inner class name */
        class C۰۱۰۱a implements RippleView.c {
            C۰۱۰۱a(v vVar) {
            }

            @Override // com.andexert.library.RippleView.c
            public void a(RippleView rippleView) {
                v.this.f۳۰۵۳c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(v.this.f۳۰۵۴d[a.this.f()][2])));
            }
        }
    }

    public v(Context Activity, String[][] linkList) {
        a(true);
        this.f۳۰۵۳c = Activity;
        this.f۳۰۵۴d = linkList;
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(parent.getContext()).inflate(R.layout.link_list_item, parent, false));
    }

    /* renamed from: a */
    public void b(a holder, int pos) {
        holder.v.setText(this.f۳۰۵۴d[pos][1]);
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۳۰۵۴d.length;
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public long a(int position) {
        return (long) position;
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int b(int position) {
        return position;
    }
}
