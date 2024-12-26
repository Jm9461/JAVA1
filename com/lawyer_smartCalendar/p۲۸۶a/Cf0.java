package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.Cu0;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.lawyer_smartCalendar.activity.AddTaxActivity;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCs;
import com.lawyer_smartCalendar.p۲۸۹d.Cj;
import com.lawyer_smartCalendar.utils.Cc;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ci;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.EnumCb;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.EnumCe;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.ViewOnClickListenerCf;

/* renamed from: com.lawyer_smartCalendar.a.f0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cf0 extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    public Context f۱۳۸۳۸c;

    /* renamed from: d, reason: contains not printable characters */
    public List<Cj> f۱۳۸۳۹d;

    /* renamed from: e, reason: contains not printable characters */
    public ViewOnClickListenerCs f۱۳۸۴۰e;

    /* renamed from: f, reason: contains not printable characters */
    private Ci f۱۳۸۴۱f;

    /* renamed from: g, reason: contains not printable characters */
    private EnumCe f۱۳۸۴۲g;

    /* renamed from: com.lawyer_smartCalendar.a.f0$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: A, reason: contains not printable characters */
        TextView f۱۳۸۴۳A;

        /* renamed from: B, reason: contains not printable characters */
        TextView f۱۳۸۴۴B;

        /* renamed from: C, reason: contains not printable characters */
        TextView f۱۳۸۴۵C;

        /* renamed from: D, reason: contains not printable characters */
        TextView f۱۳۸۴۶D;

        /* renamed from: E, reason: contains not printable characters */
        TextView f۱۳۸۴۷E;

        /* renamed from: v, reason: contains not printable characters */
        ImageView f۱۳۸۴۹v;

        /* renamed from: w, reason: contains not printable characters */
        TextView f۱۳۸۵۰w;

        /* renamed from: x, reason: contains not printable characters */
        TextView f۱۳۸۵۱x;

        /* renamed from: y, reason: contains not printable characters */
        TextView f۱۳۸۵۲y;

        /* renamed from: z, reason: contains not printable characters */
        TextView f۱۳۸۵۳z;

        public a(View convertView) {
            super(convertView);
            this.f۱۳۸۵۰w = (TextView) convertView.findViewById(2131296817);
            this.f۱۳۸۵۱x = (TextView) convertView.findViewById(2131296818);
            this.f۱۳۸۵۲y = (TextView) convertView.findViewById(2131296795);
            this.f۱۳۸۵۳z = (TextView) convertView.findViewById(2131296796);
            this.f۱۳۸۴۳A = (TextView) convertView.findViewById(2131296812);
            this.f۱۳۸۴۴B = (TextView) convertView.findViewById(2131296813);
            this.f۱۳۸۴۵C = (TextView) convertView.findViewById(2131296810);
            this.f۱۳۸۴۶D = (TextView) convertView.findViewById(2131296811);
            this.f۱۳۸۴۷E = (TextView) convertView.findViewById(2131296802);
            this.f۱۳۸۴۹v = (ImageView) convertView.findViewById(2131296479);
            this.f۱۳۸۴۹v.setOnClickListener(new ViewOnClickListenerC۱۴۴۳a(Cf0.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.f0$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۴۳a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۴۳a(Cf0 cf0) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a aVar = a.this;
                Cu0 popup = new Cu0(Cf0.this.f۱۳۸۳۸c, aVar.f۱۳۸۴۹v);
                popup.m۱۳۵۶۳b().inflate(2131558401, popup.m۱۳۵۶۱a());
                popup.m۱۳۵۶۲a(new C۱۴۴۴a());
                popup.m۱۳۵۶۴c();
            }

            /* renamed from: com.lawyer_smartCalendar.a.f0$a$a$a, reason: collision with other inner class name */
            class C۱۴۴۴a implements Cu0.d {
                C۱۴۴۴a() {
                }

                @Override // android.support.v7.widget.Cu0.d
                public boolean onMenuItemClick(MenuItem item) {
                    int itemId = item.getItemId();
                    if (itemId != 2131296407) {
                        if (itemId == 2131296424) {
                            Intent frm_edit = new Intent(Cf0.this.f۱۳۸۳۸c, (Class<?>) AddTaxActivity.class);
                            StringBuilder sb = new StringBuilder();
                            a aVar = a.this;
                            sb.append(Cf0.this.f۱۳۸۳۹d.get(aVar.m۱۲۳۲۰f()).m۱۵۶۴۸a());
                            sb.append("");
                            frm_edit.putExtra("id", sb.toString());
                            frm_edit.putExtra("frmMode", "edit");
                            Cf0.this.f۱۳۸۴۰e.m۱۵۴۹۸b(frm_edit);
                            return true;
                        }
                        return true;
                    }
                    ViewOnClickListenerCf.d dVar = new ViewOnClickListenerCf.d(Cf0.this.f۱۳۸۳۸c);
                    dVar.m۱۳۷۸۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                    dVar.m۱۳۷۹۸d(Cf0.this.f۱۳۸۴۲g);
                    dVar.m۱۳۷۸۸b(Cf0.this.f۱۳۸۴۲g);
                    dVar.m۱۳۷۷۷a(Cf0.this.f۱۳۸۴۲g);
                    dVar.m۱۳۸۰۶j(2131099708);
                    dVar.m۱۳۷۸۰a("آیا برای حذف این مورد اطمینان دارید؟");
                    dVar.m۱۳۸۰۲f(2131099728);
                    dVar.m۱۳۷۸۶b(2131099730);
                    dVar.m۱۳۷۹۹d("انصراف");
                    dVar.m۱۳۷۹۰b("حذف");
                    dVar.m۱۳۷۹۴c(new b(this));
                    dVar.m۱۳۷۷۸a(new C۱۴۴۵a());
                    dVar.m۱۳۷۹۶c();
                    return true;
                }

                /* renamed from: com.lawyer_smartCalendar.a.f0$a$a$a$b */
                class b implements ViewOnClickListenerCf.m {
                    b(C۱۴۴۴a this$3) {
                    }

                    @Override // p۲۰۸b.p۲۰۹a.p۲۱۰a.ViewOnClickListenerCf.m
                    /* renamed from: a, reason: contains not printable characters */
                    public void mo۱۵۴۰۰a(ViewOnClickListenerCf dialog, EnumCb which) {
                        dialog.dismiss();
                    }
                }

                /* renamed from: com.lawyer_smartCalendar.a.f0$a$a$a$a, reason: collision with other inner class name */
                class C۱۴۴۵a implements ViewOnClickListenerCf.m {
                    C۱۴۴۵a() {
                    }

                    @Override // p۲۰۸b.p۲۰۹a.p۲۱۰a.ViewOnClickListenerCf.m
                    /* renamed from: a, reason: contains not printable characters */
                    public void mo۱۵۴۰۰a(ViewOnClickListenerCf dialog, EnumCb which) {
                        Cf0.this.f۱۳۸۴۱f.m۱۵۷۳۳n();
                        Ci ci = Cf0.this.f۱۳۸۴۱f;
                        StringBuilder sb = new StringBuilder();
                        a aVar = a.this;
                        sb.append(Cf0.this.f۱۳۸۳۹d.get(aVar.m۱۲۳۲۰f()).m۱۵۶۴۸a());
                        sb.append("");
                        ci.m۱۵۷۱۸g(sb.toString());
                        Cf0.this.f۱۳۸۴۱f.close();
                        Cf0.this.f۱۳۸۴۰e.m۱۵۴۹۹d0();
                    }
                }
            }
        }
    }

    public Cf0(Context Activity, ViewOnClickListenerCs fragmentTab1, List<Cj> list) {
        new HashMap();
        this.f۱۳۸۴۲g = EnumCe.END;
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

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(2131493046, parent, false);
        return new a(itemView);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo۱۷۶۶۱b(a holder, int pos) {
        DecimalFormat formatter = new DecimalFormat("#,###,###,###,###,###,###");
        holder.f۱۳۸۵۰w.setTypeface(new Cf(this.f۱۳۸۳۸c).m۱۵۶۷۰b());
        holder.f۱۳۸۵۰w.setTextColor(Color.parseColor(Cc.m۱۵۶۶۳d()));
        holder.f۱۳۸۵۱x.setTypeface(new Cf(this.f۱۳۸۳۸c).m۱۵۶۶۸a());
        holder.f۱۳۸۵۱x.setText(this.f۱۳۸۳۹d.get(pos).m۱۵۶۵۹f() + "");
        holder.f۱۳۸۵۲y.setTextColor(Color.parseColor(Cc.m۱۵۶۶۳d()));
        holder.f۱۳۸۵۲y.setTypeface(new Cf(this.f۱۳۸۳۸c).m۱۵۶۷۰b());
        holder.f۱۳۸۵۳z.setText(formatter.format(this.f۱۳۸۳۹d.get(pos).m۱۵۶۵۲b()) + " تومان");
        holder.f۱۳۸۴۳A.setTypeface(new Cf(this.f۱۳۸۳۸c).m۱۵۶۷۰b());
        holder.f۱۳۸۴۳A.setTextColor(Color.parseColor(Cc.m۱۵۶۶۳d()));
        holder.f۱۳۸۴۴B.setText(formatter.format(this.f۱۳۸۳۹d.get(pos).m۱۵۶۵۵c()) + " تومان");
        holder.f۱۳۸۴۵C.setTypeface(new Cf(this.f۱۳۸۳۸c).m۱۵۶۷۰b());
        holder.f۱۳۸۴۵C.setTextColor(Color.parseColor(Cc.m۱۵۶۶۳d()));
        holder.f۱۳۸۴۶D.setText(formatter.format(this.f۱۳۸۳۹d.get(pos).m۱۵۶۵۸e()) + " تومان");
        if (!this.f۱۳۸۳۹d.get(pos).m۱۵۶۵۷d().equals("")) {
            holder.f۱۳۸۴۷E.setText(this.f۱۳۸۳۹d.get(pos).m۱۵۶۵۷d() + "");
            return;
        }
        holder.f۱۳۸۴۷E.setVisibility(8);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۸۳۹d.size();
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
