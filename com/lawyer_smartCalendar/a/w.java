package com.lawyer_smartCalendar.a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.NoteDetailActivity;
import com.lawyer_smartCalendar.c.o;
import com.lawyer_smartCalendar.d.f;
import java.util.Calendar;
import java.util.List;

public class w extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۳۰۵۷c;

    /* renamed from: d  reason: collision with root package name */
    private List<f> f۳۰۵۸d;

    /* renamed from: e  reason: collision with root package name */
    private com.lawyer_smartCalendar.utils.f f۳۰۵۹e = new com.lawyer_smartCalendar.utils.f(this.f۳۰۵۷c);

    /* renamed from: f  reason: collision with root package name */
    private Calendar f۳۰۶۰f = Calendar.getInstance();

    /* renamed from: g  reason: collision with root package name */
    private o f۳۰۶۱g;

    public class a extends RecyclerView.d0 {
        TextView v;
        TextView w;
        TextView x;
        TextView y;

        public a(View convertView) {
            super(convertView);
            this.v = (TextView) convertView.findViewById(R.id.textView_note_title);
            this.w = (TextView) convertView.findViewById(R.id.textView_note_type);
            this.x = (TextView) convertView.findViewById(R.id.textView_note_date);
            this.y = (TextView) convertView.findViewById(R.id.textView_note_hour);
            convertView.setOnClickListener(new View$OnClickListenerC۰۱۰۲a(w.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.w$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۱۰۲a implements View.OnClickListener {
            View$OnClickListenerC۰۱۰۲a(w wVar) {
            }

            public void onClick(View view) {
                Intent frmNote = new Intent(w.this.f۳۰۵۷c, NoteDetailActivity.class);
                frmNote.putExtra("id", ((f) w.this.f۳۰۵۸d.get(a.this.f())).e() + "");
                w.this.f۳۰۶۱g.b(frmNote);
            }
        }
    }

    public w(Context Activity, o fragmentTab1, List<f> list) {
        a(true);
        this.f۳۰۵۷c = Activity;
        this.f۳۰۵۸d = list;
        this.f۳۰۶۱g = fragmentTab1;
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(parent.getContext()).inflate(R.layout.note_list_item, parent, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009a, code lost:
        if (r3.equals("ClientCase") != false) goto L_0x009e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.lawyer_smartCalendar.a.w.a r10, int r11) {
        /*
        // Method dump skipped, instructions count: 325
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.a.w.b(com.lawyer_smartCalendar.a.w$a, int):void");
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۳۰۵۸d.size();
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
