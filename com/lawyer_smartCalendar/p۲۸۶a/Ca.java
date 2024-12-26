package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.Cu0;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.lawyer_smartCalendar.activity.AddCityBankAccountActivity;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCe;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;
import java.util.Locale;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.EnumCb;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.EnumCe;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.ViewOnClickListenerCf;

/* renamed from: com.lawyer_smartCalendar.a.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    public Context f۱۳۷۴۳c;

    /* renamed from: d, reason: contains not printable characters */
    public List<com.lawyer_smartCalendar.p۲۸۹d.Ca> f۱۳۷۴۴d;

    /* renamed from: e, reason: contains not printable characters */
    public ViewOnClickListenerCe f۱۳۷۴۵e;

    /* renamed from: f, reason: contains not printable characters */
    private Ci f۱۳۷۴۶f;

    /* renamed from: g, reason: contains not printable characters */
    private EnumCe f۱۳۷۴۷g;

    /* renamed from: com.lawyer_smartCalendar.a.a$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: A, reason: contains not printable characters */
        TextView f۱۳۷۴۸A;

        /* renamed from: B, reason: contains not printable characters */
        ImageView f۱۳۷۴۹B;

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۳۷۵۱v;

        /* renamed from: w, reason: contains not printable characters */
        TextView f۱۳۷۵۲w;

        /* renamed from: x, reason: contains not printable characters */
        TextView f۱۳۷۵۳x;

        /* renamed from: y, reason: contains not printable characters */
        TextView f۱۳۷۵۴y;

        /* renamed from: z, reason: contains not printable characters */
        TextView f۱۳۷۵۵z;

        public a(View convertView) {
            super(convertView);
            this.f۱۳۷۵۱v = (TextView) convertView.findViewById(2131296856);
            this.f۱۳۷۵۲w = (TextView) convertView.findViewById(2131296857);
            this.f۱۳۷۵۴y = (TextView) convertView.findViewById(2131296865);
            this.f۱۳۷۵۳x = (TextView) convertView.findViewById(2131296866);
            this.f۱۳۷۵۵z = (TextView) convertView.findViewById(2131296864);
            this.f۱۳۷۴۸A = (TextView) convertView.findViewById(2131296867);
            this.f۱۳۷۴۹B = (ImageView) convertView.findViewById(2131296479);
            this.f۱۳۷۴۹B.setOnClickListener(new ViewOnClickListenerC۱۴۳۲a(Ca.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.a$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۳۲a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۳۲a(Ca ca) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a aVar = a.this;
                Cu0 popup = new Cu0(Ca.this.f۱۳۷۴۳c, aVar.f۱۳۷۴۹B);
                popup.m۱۳۵۶۳b().inflate(2131558401, popup.m۱۳۵۶۱a());
                popup.m۱۳۵۶۲a(new C۱۴۳۳a());
                popup.m۱۳۵۶۴c();
            }

            /* renamed from: com.lawyer_smartCalendar.a.a$a$a$a, reason: collision with other inner class name */
            class C۱۴۳۳a implements Cu0.d {
                C۱۴۳۳a() {
                }

                @Override // android.support.v7.widget.Cu0.d
                public boolean onMenuItemClick(MenuItem item) {
                    int itemId = item.getItemId();
                    if (itemId == 2131296407) {
                        ViewOnClickListenerCf.d dVar = new ViewOnClickListenerCf.d(Ca.this.f۱۳۷۴۳c);
                        dVar.m۱۳۷۸۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                        dVar.m۱۳۷۹۸d(Ca.this.f۱۳۷۴۷g);
                        dVar.m۱۳۷۸۸b(Ca.this.f۱۳۷۴۷g);
                        dVar.m۱۳۷۷۷a(Ca.this.f۱۳۷۴۷g);
                        dVar.m۱۳۸۰۶j(2131099708);
                        dVar.m۱۳۷۸۰a("آیا برای حذف این مورد اطمینان دارید؟");
                        dVar.m۱۳۸۰۲f(2131099728);
                        dVar.m۱۳۷۸۶b(2131099730);
                        dVar.m۱۳۷۹۹d("انصراف");
                        dVar.m۱۳۷۹۰b("حذف");
                        dVar.m۱۳۷۹۴c(new b(this));
                        dVar.m۱۳۷۷۸a(new C۱۴۳۴a());
                        dVar.m۱۳۷۹۶c();
                        return true;
                    }
                    if (itemId == 2131296424) {
                        Intent frm_edit = new Intent(Ca.this.f۱۳۷۴۳c, (Class<?>) AddCityBankAccountActivity.class);
                        StringBuilder sb = new StringBuilder();
                        a aVar = a.this;
                        sb.append(Ca.this.f۱۳۷۴۴d.get(aVar.m۱۲۳۲۰f()).m۱۵۵۲۲c());
                        sb.append("");
                        frm_edit.putExtra("id", sb.toString());
                        frm_edit.putExtra("frmMode", "edit");
                        Ca.this.f۱۳۷۴۵e.m۱۵۴۳۸b(frm_edit);
                        return true;
                    }
                    if (itemId == 2131296730) {
                        Ca.this.f۱۳۷۴۶f.m۱۵۷۳۳n();
                        Ci ci = Ca.this.f۱۳۷۴۶f;
                        StringBuilder sb2 = new StringBuilder();
                        a aVar2 = a.this;
                        sb2.append(Ca.this.f۱۳۷۴۴d.get(aVar2.m۱۲۳۲۰f()).m۱۵۵۲۰b());
                        sb2.append("");
                        String cityName = ci.m۱۵۷۲۸l(sb2.toString());
                        Ci ci2 = Ca.this.f۱۳۷۴۶f;
                        StringBuilder sb3 = new StringBuilder();
                        a aVar3 = a.this;
                        sb3.append(Ca.this.f۱۳۷۴۴d.get(aVar3.m۱۲۳۲۰f()).m۱۵۵۱۷a());
                        sb3.append("");
                        String accountNumberTitle = ci2.m۱۵۷۲۲i(sb3.toString());
                        Ca.this.f۱۳۷۴۶f.close();
                        String shareVal = "نوع شماره حساب : " + accountNumberTitle + "\n";
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(shareVal + "داگستری شهرستان : " + cityName + "\n");
                        sb4.append("شماره حساب : ");
                        a aVar4 = a.this;
                        sb4.append(Ca.this.f۱۳۷۴۴d.get(aVar4.m۱۲۳۲۰f()).m۱۵۵۲۴d());
                        sb4.append("\n");
                        String shareVal2 = sb4.toString();
                        Intent shareIntent = new Intent();
                        shareIntent.setAction("android.intent.action.SEND");
                        shareIntent.setType("text/plain");
                        shareIntent.putExtra("android.intent.extra.TEXT", shareVal2);
                        Ca.this.f۱۳۷۴۳c.startActivity(Intent.createChooser(shareIntent, "اشتراک گذاری شماره حساب"));
                        return true;
                    }
                    return true;
                }

                /* renamed from: com.lawyer_smartCalendar.a.a$a$a$a$b */
                class b implements ViewOnClickListenerCf.m {
                    b(C۱۴۳۳a this$3) {
                    }

                    @Override // p۲۰۸b.p۲۰۹a.p۲۱۰a.ViewOnClickListenerCf.m
                    /* renamed from: a, reason: contains not printable characters */
                    public void mo۱۵۴۰۰a(ViewOnClickListenerCf dialog, EnumCb which) {
                        dialog.dismiss();
                    }
                }

                /* renamed from: com.lawyer_smartCalendar.a.a$a$a$a$a, reason: collision with other inner class name */
                class C۱۴۳۴a implements ViewOnClickListenerCf.m {
                    C۱۴۳۴a() {
                    }

                    @Override // p۲۰۸b.p۲۰۹a.p۲۱۰a.ViewOnClickListenerCf.m
                    /* renamed from: a, reason: contains not printable characters */
                    public void mo۱۵۴۰۰a(ViewOnClickListenerCf dialog, EnumCb which) {
                        Ca.this.f۱۳۷۴۶f.m۱۵۷۳۳n();
                        Ci ci = Ca.this.f۱۳۷۴۶f;
                        StringBuilder sb = new StringBuilder();
                        a aVar = a.this;
                        sb.append(Ca.this.f۱۳۷۴۴d.get(aVar.m۱۲۳۲۰f()).m۱۵۵۲۲c());
                        sb.append("");
                        ci.m۱۵۷۰۷b(sb.toString());
                        Ca.this.f۱۳۷۴۶f.close();
                        Ca.this.f۱۳۷۴۵e.m۱۵۴۳۹d0();
                    }
                }
            }
        }
    }

    public Ca(Context Activity, ViewOnClickListenerCe fragmentTab1, List<com.lawyer_smartCalendar.p۲۸۹d.Ca> list) {
        this.f۱۳۷۴۷g = EnumCe.END;
        this.f۱۳۷۴۳c = Activity;
        this.f۱۳۷۴۴d = list;
        this.f۱۳۷۴۵e = fragmentTab1;
        new Cf(this.f۱۳۷۴۳c);
        this.f۱۳۷۴۶f = new Ci(this.f۱۳۷۴۳c);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            this.f۱۳۷۴۷g = EnumCe.END;
        } else {
            this.f۱۳۷۴۷g = EnumCe.START;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(2131492893, parent, false);
        return new a(itemView);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo۱۷۶۶۱b(a holder, int pos) {
        this.f۱۳۷۴۶f.m۱۵۷۳۳n();
        String city_name = this.f۱۳۷۴۶f.m۱۵۷۲۸l(this.f۱۳۷۴۴d.get(pos).m۱۵۵۲۰b() + "");
        String account_type = this.f۱۳۷۴۶f.m۱۵۷۲۲i(this.f۱۳۷۴۴d.get(pos).m۱۵۵۱۷a() + "");
        this.f۱۳۷۴۶f.close();
        holder.f۱۳۷۵۱v.setTypeface(new Cf(this.f۱۳۷۴۳c).m۱۵۶۷۰b());
        holder.f۱۳۷۵۲w.setTypeface(new Cf(this.f۱۳۷۴۳c).m۱۵۶۶۸a());
        holder.f۱۳۷۵۲w.setText(city_name);
        holder.f۱۳۷۵۴y.setTypeface(new Cf(this.f۱۳۷۴۳c).m۱۵۶۷۰b());
        holder.f۱۳۷۵۳x.setTypeface(new Cf(this.f۱۳۷۴۳c).m۱۵۶۶۸a());
        holder.f۱۳۷۵۳x.setText(account_type);
        holder.f۱۳۷۵۵z.setTypeface(new Cf(this.f۱۳۷۴۳c).m۱۵۶۷۰b());
        holder.f۱۳۷۴۸A.setTypeface(new Cf(this.f۱۳۷۴۳c).m۱۵۶۶۸a());
        holder.f۱۳۷۴۸A.setText(this.f۱۳۷۴۴d.get(pos).m۱۵۵۲۴d());
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۷۴۴d.size();
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
