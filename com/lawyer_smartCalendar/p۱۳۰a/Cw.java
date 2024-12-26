package com.lawyer_smartCalendar.p۱۳۰a;

import android.content.Context;
import android.content.Intent;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.NoteDetailActivity;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCo;
import com.lawyer_smartCalendar.p۱۳۳d.Cf;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.lawyer_smartCalendar.a.w  reason: invalid class name */
public class Cw extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۴۰۰۵c;

    /* renamed from: d  reason: contains not printable characters */
    private List<Cf> f۱۴۰۰۶d;

    /* renamed from: e  reason: contains not printable characters */
    private com.lawyer_smartCalendar.utils.Cf f۱۴۰۰۷e = new com.lawyer_smartCalendar.utils.Cf(this.f۱۴۰۰۵c);

    /* renamed from: f  reason: contains not printable characters */
    private Calendar f۱۴۰۰۸f = Calendar.getInstance();

    /* renamed from: g  reason: contains not printable characters */
    private View$OnClickListenerCo f۱۴۰۰۹g;

    /* renamed from: com.lawyer_smartCalendar.a.w$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۴۰۱۰v;

        /* renamed from: w  reason: contains not printable characters */
        TextView f۱۴۰۱۱w;

        /* renamed from: x  reason: contains not printable characters */
        TextView f۱۴۰۱۲x;

        /* renamed from: y  reason: contains not printable characters */
        TextView f۱۴۰۱۳y;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۴۰۱۰v = (TextView) convertView.findViewById(R.id.textView_note_title);
            this.f۱۴۰۱۱w = (TextView) convertView.findViewById(R.id.textView_note_type);
            this.f۱۴۰۱۲x = (TextView) convertView.findViewById(R.id.textView_note_date);
            this.f۱۴۰۱۳y = (TextView) convertView.findViewById(R.id.textView_note_hour);
            convertView.setOnClickListener(new View$OnClickListenerCa(Cw.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.w$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Cw wVar) {
            }

            public void onClick(View view) {
                Intent frmNote = new Intent(Cw.this.f۱۴۰۰۵c, NoteDetailActivity.class);
                frmNote.putExtra("id", ((Cf) Cw.this.f۱۴۰۰۶d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۸۵e() + "");
                Cw.this.f۱۴۰۰۹g.m۱۷۵۶۲b(frmNote);
            }
        }
    }

    public Cw(Context Activity, View$OnClickListenerCo fragmentTab1, List<Cf> list) {
        m۱۴۴۳۸a(true);
        this.f۱۴۰۰۵c = Activity;
        this.f۱۴۰۰۶d = list;
        this.f۱۴۰۰۹g = fragmentTab1;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۲۷۹b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.note_list_item, parent, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009a, code lost:
        if (r3.equals("ClientCase") != false) goto L_0x009e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b8  */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۷۲۸۱b(com.lawyer_smartCalendar.p۱۳۰a.Cw.Ca r10, int r11) {
        /*
        // Method dump skipped, instructions count: 325
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.p۱۳۰a.Cw.m۱۷۲۸۱b(com.lawyer_smartCalendar.a.w$a, int):void");
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۲۷۵a() {
        return this.f۱۴۰۰۶d.size();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۲۷۶a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۲۷۸b(int position) {
        return position;
    }
}
