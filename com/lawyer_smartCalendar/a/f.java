package com.lawyer_smartCalendar.a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.CaseDetailActivity;
import com.lawyer_smartCalendar.activity.SearchActivity;
import com.lawyer_smartCalendar.d.b;
import com.lawyer_smartCalendar.utils.i;
import java.util.List;

public class f extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۲۹۶۰c;

    /* renamed from: d  reason: collision with root package name */
    private List<b> f۲۹۶۱d;

    /* renamed from: e  reason: collision with root package name */
    private i f۲۹۶۲e = new i(this.f۲۹۶۰c);

    /* renamed from: f  reason: collision with root package name */
    private com.lawyer_smartCalendar.utils.f f۲۹۶۳f = new com.lawyer_smartCalendar.utils.f(this.f۲۹۶۰c);

    public class a extends RecyclerView.d0 {
        TextView v;
        TextView w;
        TextView x;
        TextView y;
        LinearLayout z;

        public a(View convertView) {
            super(convertView);
            this.w = (TextView) convertView.findViewById(R.id.txt_client);
            this.x = (TextView) convertView.findViewById(R.id.txt_date);
            this.y = (TextView) convertView.findViewById(R.id.txt_state);
            this.v = (TextView) convertView.findViewById(R.id.txt_title);
            this.z = (LinearLayout) convertView.findViewById(R.id.layout_state);
            convertView.setOnClickListener(new View$OnClickListenerC۰۰۷۸a(f.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.f$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۰۷۸a implements View.OnClickListener {
            View$OnClickListenerC۰۰۷۸a(f fVar) {
            }

            public void onClick(View view) {
                Intent frm_case_detail = new Intent(f.this.f۲۹۶۰c, CaseDetailActivity.class);
                frm_case_detail.putExtra("id", ((b) f.this.f۲۹۶۱d.get(a.this.f())).k() + "");
                ((SearchActivity) f.this.f۲۹۶۰c).c(frm_case_detail);
            }
        }
    }

    public f(Context Activity, List<b> list) {
        a(true);
        this.f۲۹۶۰c = Activity;
        this.f۲۹۶۱d = list;
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(parent.getContext()).inflate(R.layout.case_list_item, parent, false));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cd, code lost:
        if (r4.equals("Stream") != false) goto L_0x00d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.lawyer_smartCalendar.a.f.a r10, int r11) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.a.f.b(com.lawyer_smartCalendar.a.f$a, int):void");
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۲۹۶۱d.size();
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
