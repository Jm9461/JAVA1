package com.lawyer_smartCalendar.a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.u0;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b.a.a.e;
import b.a.a.f;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.AddTaxActivity;
import com.lawyer_smartCalendar.c.s;
import com.lawyer_smartCalendar.d.j;
import com.lawyer_smartCalendar.utils.c;
import com.lawyer_smartCalendar.utils.i;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class f0 extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    public Context f۲۹۶۵c;

    /* renamed from: d  reason: collision with root package name */
    public List<j> f۲۹۶۶d;

    /* renamed from: e  reason: collision with root package name */
    public s f۲۹۶۷e;

    /* renamed from: f  reason: collision with root package name */
    private i f۲۹۶۸f;

    /* renamed from: g  reason: collision with root package name */
    private e f۲۹۶۹g = e.END;

    public class a extends RecyclerView.d0 {
        TextView A;
        TextView B;
        TextView C;
        TextView D;
        TextView E;
        ImageView v;
        TextView w;
        TextView x;
        TextView y;
        TextView z;

        public a(View convertView) {
            super(convertView);
            this.w = (TextView) convertView.findViewById(R.id.textView_year_title);
            this.x = (TextView) convertView.findViewById(R.id.textView_year_value);
            this.y = (TextView) convertView.findViewById(R.id.textView_income_title);
            this.z = (TextView) convertView.findViewById(R.id.textView_income_value);
            this.A = (TextView) convertView.findViewById(R.id.textView_tax_title);
            this.B = (TextView) convertView.findViewById(R.id.textView_tax_value);
            this.C = (TextView) convertView.findViewById(R.id.textView_sum_title);
            this.D = (TextView) convertView.findViewById(R.id.textView_sum_value);
            this.E = (TextView) convertView.findViewById(R.id.textView_note_value);
            this.v = (ImageView) convertView.findViewById(R.id.img_more);
            this.v.setOnClickListener(new View$OnClickListenerC۰۰۷۹a(f0.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.f0$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۰۷۹a implements View.OnClickListener {
            View$OnClickListenerC۰۰۷۹a(f0 f0Var) {
            }

            public void onClick(View view) {
                a aVar = a.this;
                u0 popup = new u0(f0.this.f۲۹۶۵c, aVar.v);
                popup.b().inflate(R.menu.account_number_more_menu, popup.a());
                popup.a(new C۰۰۸۰a());
                popup.c();
            }

            /* renamed from: com.lawyer_smartCalendar.a.f0$a$a$a  reason: collision with other inner class name */
            class C۰۰۸۰a implements u0.d {
                C۰۰۸۰a() {
                }

                @Override // android.support.v7.widget.u0.d
                public boolean onMenuItemClick(MenuItem item) {
                    int itemId = item.getItemId();
                    if (itemId == R.id.delete) {
                        f.d dVar = new f.d(f0.this.f۲۹۶۵c);
                        dVar.a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                        dVar.d(f0.this.f۲۹۶۹g);
                        dVar.b(f0.this.f۲۹۶۹g);
                        dVar.a(f0.this.f۲۹۶۹g);
                        dVar.j(R.color.colorPrimaryDark);
                        dVar.a("آیا برای حذف این مورد اطمینان دارید؟");
                        dVar.f(R.color.dialogCancelColor);
                        dVar.b(R.color.dialog_delete_color);
                        dVar.d("انصراف");
                        dVar.b("حذف");
                        dVar.c(new b(this));
                        dVar.a(new C۰۰۸۱a());
                        dVar.c();
                        return true;
                    } else if (itemId != R.id.edit) {
                        return true;
                    } else {
                        Intent frm_edit = new Intent(f0.this.f۲۹۶۵c, AddTaxActivity.class);
                        StringBuilder sb = new StringBuilder();
                        a aVar = a.this;
                        sb.append(f0.this.f۲۹۶۶d.get(aVar.f()).a());
                        sb.append("");
                        frm_edit.putExtra("id", sb.toString());
                        frm_edit.putExtra("frmMode", "edit");
                        f0.this.f۲۹۶۷e.b(frm_edit);
                        return true;
                    }
                }

                /* renamed from: com.lawyer_smartCalendar.a.f0$a$a$a$b */
                class b implements f.m {
                    b(C۰۰۸۰a this$3) {
                    }

                    @Override // b.a.a.f.m
                    public void a(f dialog, b.a.a.b which) {
                        dialog.dismiss();
                    }
                }

                /* renamed from: com.lawyer_smartCalendar.a.f0$a$a$a$a  reason: collision with other inner class name */
                class C۰۰۸۱a implements f.m {
                    C۰۰۸۱a() {
                    }

                    @Override // b.a.a.f.m
                    public void a(f dialog, b.a.a.b which) {
                        f0.this.f۲۹۶۸f.n();
                        i iVar = f0.this.f۲۹۶۸f;
                        StringBuilder sb = new StringBuilder();
                        a aVar = a.this;
                        sb.append(f0.this.f۲۹۶۶d.get(aVar.f()).a());
                        sb.append("");
                        iVar.g(sb.toString());
                        f0.this.f۲۹۶۸f.close();
                        f0.this.f۲۹۶۷e.d0();
                    }
                }
            }
        }
    }

    public f0(Context Activity, s fragmentTab1, List<j> list) {
        new HashMap();
        this.f۲۹۶۵c = Activity;
        this.f۲۹۶۶d = list;
        this.f۲۹۶۷e = fragmentTab1;
        new com.lawyer_smartCalendar.utils.f(this.f۲۹۶۵c);
        Calendar.getInstance();
        this.f۲۹۶۸f = new i(this.f۲۹۶۵c);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            this.f۲۹۶۹g = e.END;
        } else {
            this.f۲۹۶۹g = e.START;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(parent.getContext()).inflate(R.layout.tax_list_item_detail, parent, false));
    }

    /* renamed from: a */
    public void b(a holder, int pos) {
        DecimalFormat formatter = new DecimalFormat("#,###,###,###,###,###,###");
        holder.w.setTypeface(new com.lawyer_smartCalendar.utils.f(this.f۲۹۶۵c).b());
        holder.w.setTextColor(Color.parseColor(c.d()));
        holder.x.setTypeface(new com.lawyer_smartCalendar.utils.f(this.f۲۹۶۵c).a());
        TextView textView = holder.x;
        textView.setText(this.f۲۹۶۶d.get(pos).f() + "");
        holder.y.setTextColor(Color.parseColor(c.d()));
        holder.y.setTypeface(new com.lawyer_smartCalendar.utils.f(this.f۲۹۶۵c).b());
        TextView textView2 = holder.z;
        textView2.setText(formatter.format(this.f۲۹۶۶d.get(pos).b()) + " تومان");
        holder.A.setTypeface(new com.lawyer_smartCalendar.utils.f(this.f۲۹۶۵c).b());
        holder.A.setTextColor(Color.parseColor(c.d()));
        TextView textView3 = holder.B;
        textView3.setText(formatter.format(this.f۲۹۶۶d.get(pos).c()) + " تومان");
        holder.C.setTypeface(new com.lawyer_smartCalendar.utils.f(this.f۲۹۶۵c).b());
        holder.C.setTextColor(Color.parseColor(c.d()));
        TextView textView4 = holder.D;
        textView4.setText(formatter.format(this.f۲۹۶۶d.get(pos).e()) + " تومان");
        if (!this.f۲۹۶۶d.get(pos).d().equals("")) {
            TextView textView5 = holder.E;
            textView5.setText(this.f۲۹۶۶d.get(pos).d() + "");
            return;
        }
        holder.E.setVisibility(8);
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۲۹۶۶d.size();
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
