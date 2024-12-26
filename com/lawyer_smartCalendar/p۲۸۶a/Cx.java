package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.activity.NoteDetailActivity;
import com.lawyer_smartCalendar.activity.SearchActivity;
import com.lawyer_smartCalendar.p۲۸۹d.Cf;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.x, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cx extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۴۰۱۶c;

    /* renamed from: d, reason: contains not printable characters */
    private List<Cf> f۱۴۰۱۷d;

    /* renamed from: e, reason: contains not printable characters */
    private com.lawyer_smartCalendar.utils.Cf f۱۴۰۱۸e;

    /* renamed from: f, reason: contains not printable characters */
    private Calendar f۱۴۰۱۹f;

    /* renamed from: com.lawyer_smartCalendar.a.x$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۴۰۲۰v;

        /* renamed from: w, reason: contains not printable characters */
        TextView f۱۴۰۲۱w;

        /* renamed from: x, reason: contains not printable characters */
        TextView f۱۴۰۲۲x;

        /* renamed from: y, reason: contains not printable characters */
        TextView f۱۴۰۲۳y;

        public a(View convertView) {
            super(convertView);
            this.f۱۴۰۲۰v = (TextView) convertView.findViewById(2131296800);
            this.f۱۴۰۲۱w = (TextView) convertView.findViewById(2131296801);
            this.f۱۴۰۲۲x = (TextView) convertView.findViewById(2131296798);
            this.f۱۴۰۲۳y = (TextView) convertView.findViewById(2131296799);
            convertView.setOnClickListener(new ViewOnClickListenerC۱۴۶۷a(Cx.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.x$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۶۷a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۶۷a(Cx cx) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent frmNote = new Intent(Cx.this.f۱۴۰۱۶c, (Class<?>) NoteDetailActivity.class);
                frmNote.putExtra("id", ((Cf) Cx.this.f۱۴۰۱۷d.get(a.this.m۱۲۳۲۰f())).m۱۵۶۰۷e() + "");
                ((SearchActivity) Cx.this.f۱۴۰۱۶c).m۱۵۳۹۰c(frmNote);
            }
        }
    }

    public Cx(Context Activity, List<Cf> list) {
        m۱۲۳۶۸a(true);
        this.f۱۴۰۱۶c = Activity;
        this.f۱۴۰۱۷d = list;
        this.f۱۴۰۱۸e = new com.lawyer_smartCalendar.utils.Cf(this.f۱۴۰۱۶c);
        this.f۱۴۰۱۹f = Calendar.getInstance();
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(2131493025, parent, false);
        return new a(itemView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
    
        if (r3.equals("ClientCase") != false) goto L۲۳;
     */
    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo۱۷۶۶۱b(com.lawyer_smartCalendar.p۲۸۶a.Cx.a r10, int r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۲۸۶a.Cx.mo۱۷۶۶۱b(com.lawyer_smartCalendar.a.x$a, int):void");
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۴۰۱۷d.size();
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
