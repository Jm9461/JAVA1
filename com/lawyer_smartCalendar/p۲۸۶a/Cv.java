package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.andexert.library.RippleView;

/* renamed from: com.lawyer_smartCalendar.a.v, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cv extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۹۹۹c;

    /* renamed from: d, reason: contains not printable characters */
    private String[][] f۱۴۰۰۰d;

    /* renamed from: e, reason: contains not printable characters */
    private RippleView f۱۴۰۰۱e;

    /* renamed from: com.lawyer_smartCalendar.a.v$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۴۰۰۲v;

        public a(View convertView) {
            super(convertView);
            this.f۱۴۰۰۲v = (TextView) convertView.findViewById(2131296863);
            Cv.this.f۱۴۰۰۱e = (RippleView) convertView.findViewById(2131296693);
            Cv.this.f۱۴۰۰۱e.setOnRippleCompleteListener(new C۱۴۶۵a(Cv.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.v$a$a, reason: collision with other inner class name */
        class C۱۴۶۵a implements RippleView.InterfaceCc {
            C۱۴۶۵a(Cv cv) {
            }

            @Override // com.andexert.library.RippleView.InterfaceCc
            /* renamed from: a, reason: contains not printable characters */
            public void mo۱۵۱۹۳a(RippleView rippleView) {
                Intent openUrlIntent = new Intent("android.intent.action.VIEW", Uri.parse(Cv.this.f۱۴۰۰۰d[a.this.m۱۲۳۲۰f()][2]));
                Cv.this.f۱۳۹۹۹c.startActivity(openUrlIntent);
            }
        }
    }

    public Cv(Context Activity, String[][] linkList) {
        m۱۲۳۶۸a(true);
        this.f۱۳۹۹۹c = Activity;
        this.f۱۴۰۰۰d = linkList;
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(2131492981, parent, false);
        return new a(itemView);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo۱۷۶۶۱b(a holder, int pos) {
        holder.f۱۴۰۰۲v.setText(this.f۱۴۰۰۰d[pos][1]);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۴۰۰۰d.length;
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public long mo۱۵۲۰۷a(int position) {
        return position;
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: contains not printable characters */
    public int mo۱۷۶۵۸b(int position) {
        return position;
    }
}
