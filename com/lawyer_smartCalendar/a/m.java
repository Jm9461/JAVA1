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
import com.lawyer_smartCalendar.c.l;
import com.lawyer_smartCalendar.d.f;
import java.util.Calendar;
import java.util.List;

public class m extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۳۰۱۱c;

    /* renamed from: d  reason: collision with root package name */
    private List<f> f۳۰۱۲d;

    /* renamed from: e  reason: collision with root package name */
    private com.lawyer_smartCalendar.utils.f f۳۰۱۳e = new com.lawyer_smartCalendar.utils.f(this.f۳۰۱۱c);

    /* renamed from: f  reason: collision with root package name */
    private Calendar f۳۰۱۴f = Calendar.getInstance();

    /* renamed from: g  reason: collision with root package name */
    private l f۳۰۱۵g;

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
            convertView.setOnClickListener(new View$OnClickListenerC۰۰۹۲a(m.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.m$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۰۹۲a implements View.OnClickListener {
            View$OnClickListenerC۰۰۹۲a(m mVar) {
            }

            public void onClick(View view) {
                Intent frmNote = new Intent(m.this.f۳۰۱۱c, NoteDetailActivity.class);
                frmNote.putExtra("id", ((f) m.this.f۳۰۱۲d.get(a.this.f())).e() + "");
                m.this.f۳۰۱۵g.b(frmNote);
            }
        }
    }

    public m(Context Activity, l fragmentTab1, List<f> list) {
        a(true);
        this.f۳۰۱۱c = Activity;
        this.f۳۰۱۲d = list;
        this.f۳۰۱۵g = fragmentTab1;
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(parent.getContext()).inflate(R.layout.note_list_item, parent, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008a, code lost:
        if (r3.equals("ClientCase") != false) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.lawyer_smartCalendar.a.m.a r9, int r10) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.a.m.b(com.lawyer_smartCalendar.a.m$a, int):void");
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۳۰۱۲d.size();
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
