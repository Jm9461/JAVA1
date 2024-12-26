package com.lawyer_smartCalendar.p۱۳۰a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.p۰۴۷v7.widget.Cu0;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.AddTaxActivity;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCs;
import com.lawyer_smartCalendar.p۱۳۳d.Cj;
import com.lawyer_smartCalendar.utils.Cc;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ci;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCb;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;

/* renamed from: com.lawyer_smartCalendar.a.f0  reason: invalid class name */
public class Cf0 extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    public Context f۱۳۸۳۸c;

    /* renamed from: d  reason: contains not printable characters */
    public List<Cj> f۱۳۸۳۹d;

    /* renamed from: e  reason: contains not printable characters */
    public View$OnClickListenerCs f۱۳۸۴۰e;

    /* renamed from: f  reason: contains not printable characters */
    private Ci f۱۳۸۴۱f;

    /* renamed from: g  reason: contains not printable characters */
    private EnumCe f۱۳۸۴۲g = EnumCe.END;

    /* renamed from: com.lawyer_smartCalendar.a.f0$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: A  reason: contains not printable characters */
        TextView f۱۳۸۴۳A;

        /* renamed from: B  reason: contains not printable characters */
        TextView f۱۳۸۴۴B;

        /* renamed from: C  reason: contains not printable characters */
        TextView f۱۳۸۴۵C;

        /* renamed from: D  reason: contains not printable characters */
        TextView f۱۳۸۴۶D;

        /* renamed from: E  reason: contains not printable characters */
        TextView f۱۳۸۴۷E;

        /* renamed from: v  reason: contains not printable characters */
        ImageView f۱۳۸۴۹v;

        /* renamed from: w  reason: contains not printable characters */
        TextView f۱۳۸۵۰w;

        /* renamed from: x  reason: contains not printable characters */
        TextView f۱۳۸۵۱x;

        /* renamed from: y  reason: contains not printable characters */
        TextView f۱۳۸۵۲y;

        /* renamed from: z  reason: contains not printable characters */
        TextView f۱۳۸۵۳z;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۳۸۵۰w = (TextView) convertView.findViewById(R.id.textView_year_title);
            this.f۱۳۸۵۱x = (TextView) convertView.findViewById(R.id.textView_year_value);
            this.f۱۳۸۵۲y = (TextView) convertView.findViewById(R.id.textView_income_title);
            this.f۱۳۸۵۳z = (TextView) convertView.findViewById(R.id.textView_income_value);
            this.f۱۳۸۴۳A = (TextView) convertView.findViewById(R.id.textView_tax_title);
            this.f۱۳۸۴۴B = (TextView) convertView.findViewById(R.id.textView_tax_value);
            this.f۱۳۸۴۵C = (TextView) convertView.findViewById(R.id.textView_sum_title);
            this.f۱۳۸۴۶D = (TextView) convertView.findViewById(R.id.textView_sum_value);
            this.f۱۳۸۴۷E = (TextView) convertView.findViewById(R.id.textView_note_value);
            this.f۱۳۸۴۹v = (ImageView) convertView.findViewById(R.id.img_more);
            this.f۱۳۸۴۹v.setOnClickListener(new View$OnClickListenerCa(Cf0.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.f0$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Cf0 f0Var) {
            }

            public void onClick(View view) {
                Ca aVar = Ca.this;
                Cu0 popup = new Cu0(Cf0.this.f۱۳۸۳۸c, aVar.f۱۳۸۴۹v);
                popup.m۱۵۶۳۳b().inflate(R.menu.account_number_more_menu, popup.m۱۵۶۳۱a());
                popup.m۱۵۶۳۲a(new Ca());
                popup.m۱۵۶۳۴c();
            }

            /* renamed from: com.lawyer_smartCalendar.a.f0$a$a$a  reason: invalid class name */
            class Ca implements Cu0.AbstractCd {
                Ca() {
                }

                @Override // android.support.p۰۴۷v7.widget.Cu0.AbstractCd
                public boolean onMenuItemClick(MenuItem item) {
                    int itemId = item.getItemId();
                    if (itemId == R.id.delete) {
                        View$OnClickListenerCf.Cd dVar = new View$OnClickListenerCf.Cd(Cf0.this.f۱۳۸۳۸c);
                        dVar.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                        dVar.m۱۵۸۶۸d(Cf0.this.f۱۳۸۴۲g);
                        dVar.m۱۵۸۵۸b(Cf0.this.f۱۳۸۴۲g);
                        dVar.m۱۵۸۴۷a(Cf0.this.f۱۳۸۴۲g);
                        dVar.m۱۵۸۷۶j(R.color.colorPrimaryDark);
                        dVar.m۱۵۸۵۰a("آیا برای حذف این مورد اطمینان دارید؟");
                        dVar.m۱۵۸۷۲f(R.color.dialogCancelColor);
                        dVar.m۱۵۸۵۶b(R.color.dialog_delete_color);
                        dVar.m۱۵۸۶۹d("انصراف");
                        dVar.m۱۵۸۶۰b("حذف");
                        dVar.m۱۵۸۶۴c(new Cb(this));
                        dVar.m۱۵۸۴۸a(new Ca());
                        dVar.m۱۵۸۶۶c();
                        return true;
                    } else if (itemId != R.id.edit) {
                        return true;
                    } else {
                        Intent frm_edit = new Intent(Cf0.this.f۱۳۸۳۸c, AddTaxActivity.class);
                        StringBuilder sb = new StringBuilder();
                        Ca aVar = Ca.this;
                        sb.append(Cf0.this.f۱۳۸۳۹d.get(aVar.m۱۴۳۹۰f()).m۱۷۷۲۶a());
                        sb.append("");
                        frm_edit.putExtra("id", sb.toString());
                        frm_edit.putExtra("frmMode", "edit");
                        Cf0.this.f۱۳۸۴۰e.m۱۷۵۷۶b(frm_edit);
                        return true;
                    }
                }

                /* renamed from: com.lawyer_smartCalendar.a.f0$a$a$a$b  reason: invalid class name */
                class Cb implements View$OnClickListenerCf.AbstractCm {
                    Cb(Ca this$3) {
                    }

                    @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
                    /* renamed from: a  reason: contains not printable characters */
                    public void m۱۷۱۲۱a(View$OnClickListenerCf dialog, EnumCb which) {
                        dialog.dismiss();
                    }
                }

                /* renamed from: com.lawyer_smartCalendar.a.f0$a$a$a$a  reason: invalid class name */
                class Ca implements View$OnClickListenerCf.AbstractCm {
                    Ca() {
                    }

                    @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
                    /* renamed from: a  reason: contains not printable characters */
                    public void m۱۷۱۲۰a(View$OnClickListenerCf dialog, EnumCb which) {
                        Cf0.this.f۱۳۸۴۱f.m۱۷۸۱۱n();
                        Ci iVar = Cf0.this.f۱۳۸۴۱f;
                        StringBuilder sb = new StringBuilder();
                        Ca aVar = Ca.this;
                        sb.append(Cf0.this.f۱۳۸۳۹d.get(aVar.m۱۴۳۹۰f()).m۱۷۷۲۶a());
                        sb.append("");
                        iVar.m۱۷۷۹۶g(sb.toString());
                        Cf0.this.f۱۳۸۴۱f.close();
                        Cf0.this.f۱۳۸۴۰e.m۱۷۵۷۷d0();
                    }
                }
            }
        }
    }

    public Cf0(Context Activity, View$OnClickListenerCs fragmentTab1, List<Cj> list) {
        new HashMap();
        this.f۱۳۸۳۸c = Activity;
        this.f۱۳۸۳۹d = list;
        this.f۱۳۸۴۰e = fragmentTab1;
        new Cf(this.f۱۳۸۳۸c);
        Calendar.getInstance();
        this.f۱۳۸۴۱f = new Ci(this.f۱۳۸۳۸c);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            this.f۱۳۸۴۲g = EnumCe.END;
        } else {
            this.f۱۳۸۴۲g = EnumCe.START;
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۱۱۷b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.tax_list_item_detail, parent, false));
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۱۱۹b(Ca holder, int pos) {
        DecimalFormat formatter = new DecimalFormat("#,###,###,###,###,###,###");
        holder.f۱۳۸۵۰w.setTypeface(new Cf(this.f۱۳۸۳۸c).m۱۷۷۴۸b());
        holder.f۱۳۸۵۰w.setTextColor(Color.parseColor(Cc.m۱۷۷۴۱d()));
        holder.f۱۳۸۵۱x.setTypeface(new Cf(this.f۱۳۸۳۸c).m۱۷۷۴۶a());
        TextView textView = holder.f۱۳۸۵۱x;
        textView.setText(this.f۱۳۸۳۹d.get(pos).m۱۷۷۳۷f() + "");
        holder.f۱۳۸۵۲y.setTextColor(Color.parseColor(Cc.m۱۷۷۴۱d()));
        holder.f۱۳۸۵۲y.setTypeface(new Cf(this.f۱۳۸۳۸c).m۱۷۷۴۸b());
        TextView textView2 = holder.f۱۳۸۵۳z;
        textView2.setText(formatter.format(this.f۱۳۸۳۹d.get(pos).m۱۷۷۳۰b()) + " تومان");
        holder.f۱۳۸۴۳A.setTypeface(new Cf(this.f۱۳۸۳۸c).m۱۷۷۴۸b());
        holder.f۱۳۸۴۳A.setTextColor(Color.parseColor(Cc.m۱۷۷۴۱d()));
        TextView textView3 = holder.f۱۳۸۴۴B;
        textView3.setText(formatter.format(this.f۱۳۸۳۹d.get(pos).m۱۷۷۳۳c()) + " تومان");
        holder.f۱۳۸۴۵C.setTypeface(new Cf(this.f۱۳۸۳۸c).m۱۷۷۴۸b());
        holder.f۱۳۸۴۵C.setTextColor(Color.parseColor(Cc.m۱۷۷۴۱d()));
        TextView textView4 = holder.f۱۳۸۴۶D;
        textView4.setText(formatter.format(this.f۱۳۸۳۹d.get(pos).m۱۷۷۳۶e()) + " تومان");
        if (!this.f۱۳۸۳۹d.get(pos).m۱۷۷۳۵d().equals("")) {
            TextView textView5 = holder.f۱۳۸۴۷E;
            textView5.setText(this.f۱۳۸۳۹d.get(pos).m۱۷۷۳۵d() + "");
            return;
        }
        holder.f۱۳۸۴۷E.setVisibility(8);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۱۱۳a() {
        return this.f۱۳۸۳۹d.size();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۱۱۴a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۱۱۶b(int position) {
        return position;
    }
}
