package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.activity.NoteDetailActivity;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCh;
import com.lawyer_smartCalendar.p۲۸۹d.Cf;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.h, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ch extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۸۶۷c;

    /* renamed from: d, reason: contains not printable characters */
    private List<Cf> f۱۳۸۶۸d;

    /* renamed from: e, reason: contains not printable characters */
    private com.lawyer_smartCalendar.utils.Cf f۱۳۸۶۹e;

    /* renamed from: f, reason: contains not printable characters */
    private Calendar f۱۳۸۷۰f;

    /* renamed from: g, reason: contains not printable characters */
    private ViewOnClickListenerCh f۱۳۸۷۱g;

    /* renamed from: com.lawyer_smartCalendar.a.h$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۳۸۷۲v;

        /* renamed from: w, reason: contains not printable characters */
        TextView f۱۳۸۷۳w;

        /* renamed from: x, reason: contains not printable characters */
        TextView f۱۳۸۷۴x;

        /* renamed from: y, reason: contains not printable characters */
        TextView f۱۳۸۷۵y;

        public a(View convertView) {
            super(convertView);
            this.f۱۳۸۷۲v = (TextView) convertView.findViewById(2131296800);
            this.f۱۳۸۷۳w = (TextView) convertView.findViewById(2131296801);
            this.f۱۳۸۷۴x = (TextView) convertView.findViewById(2131296798);
            this.f۱۳۸۷۵y = (TextView) convertView.findViewById(2131296799);
            convertView.setOnClickListener(new ViewOnClickListenerC۱۴۴۷a(Ch.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.h$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۴۷a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۴۷a(Ch ch) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent frmNote = new Intent(Ch.this.f۱۳۸۶۷c, (Class<?>) NoteDetailActivity.class);
                frmNote.putExtra("id", ((Cf) Ch.this.f۱۳۸۶۸d.get(a.this.m۱۲۳۲۰f())).m۱۵۶۰۷e() + "");
                Ch.this.f۱۳۸۷۱g.m۱۵۴۵۰b(frmNote);
            }
        }
    }

    public Ch(Context Activity, ViewOnClickListenerCh fragmentTab1, List<Cf> list) {
        m۱۲۳۶۸a(true);
        this.f۱۳۸۶۷c = Activity;
        this.f۱۳۸۶۸d = list;
        this.f۱۳۸۷۱g = fragmentTab1;
        this.f۱۳۸۶۹e = new com.lawyer_smartCalendar.utils.Cf(this.f۱۳۸۶۷c);
        this.f۱۳۸۷۰f = Calendar.getInstance();
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(2131493025, parent, false);
        return new a(itemView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r3.equals("ClientCase") != false) goto L۱۸;
     */
    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo۱۷۶۶۱b(com.lawyer_smartCalendar.p۲۸۶a.Ch.a r9, int r10) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۲۸۶a.Ch.mo۱۷۶۶۱b(com.lawyer_smartCalendar.a.h$a, int):void");
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۸۶۸d.size();
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
