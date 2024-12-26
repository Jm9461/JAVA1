package com.lawyer_smartCalendar.p۱۳۰a;

import android.content.Context;
import android.content.Intent;
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
import com.lawyer_smartCalendar.activity.AddCityBankAccountActivity;
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCe;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ci;
import java.util.List;
import java.util.Locale;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCb;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;

/* renamed from: com.lawyer_smartCalendar.a.a  reason: invalid class name */
public class Ca extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    public Context f۱۳۷۴۳c;

    /* renamed from: d  reason: contains not printable characters */
    public List<com.lawyer_smartCalendar.p۱۳۳d.Ca> f۱۳۷۴۴d;

    /* renamed from: e  reason: contains not printable characters */
    public View$OnClickListenerCe f۱۳۷۴۵e;

    /* renamed from: f  reason: contains not printable characters */
    private Ci f۱۳۷۴۶f;

    /* renamed from: g  reason: contains not printable characters */
    private EnumCe f۱۳۷۴۷g = EnumCe.END;

    /* renamed from: com.lawyer_smartCalendar.a.a$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: A  reason: contains not printable characters */
        TextView f۱۳۷۴۸A;

        /* renamed from: B  reason: contains not printable characters */
        ImageView f۱۳۷۴۹B;

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۳۷۵۱v;

        /* renamed from: w  reason: contains not printable characters */
        TextView f۱۳۷۵۲w;

        /* renamed from: x  reason: contains not printable characters */
        TextView f۱۳۷۵۳x;

        /* renamed from: y  reason: contains not printable characters */
        TextView f۱۳۷۵۴y;

        /* renamed from: z  reason: contains not printable characters */
        TextView f۱۳۷۵۵z;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۳۷۵۱v = (TextView) convertView.findViewById(R.id.txt_city_title);
            this.f۱۳۷۵۲w = (TextView) convertView.findViewById(R.id.txt_city_value);
            this.f۱۳۷۵۴y = (TextView) convertView.findViewById(R.id.txt_number_type_title);
            this.f۱۳۷۵۳x = (TextView) convertView.findViewById(R.id.txt_number_type_value);
            this.f۱۳۷۵۵z = (TextView) convertView.findViewById(R.id.txt_number_title);
            this.f۱۳۷۴۸A = (TextView) convertView.findViewById(R.id.txt_number_value);
            this.f۱۳۷۴۹B = (ImageView) convertView.findViewById(R.id.img_more);
            this.f۱۳۷۴۹B.setOnClickListener(new View$OnClickListenerCa(Ca.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.a$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Ca aVar) {
            }

            public void onClick(View view) {
                Ca aVar = Ca.this;
                Cu0 popup = new Cu0(Ca.this.f۱۳۷۴۳c, aVar.f۱۳۷۴۹B);
                popup.m۱۵۶۳۳b().inflate(R.menu.account_number_more_menu, popup.m۱۵۶۳۱a());
                popup.m۱۵۶۳۲a(new Ca());
                popup.m۱۵۶۳۴c();
            }

            /* renamed from: com.lawyer_smartCalendar.a.a$a$a$a  reason: invalid class name */
            class Ca implements Cu0.AbstractCd {
                Ca() {
                }

                @Override // android.support.p۰۴۷v7.widget.Cu0.AbstractCd
                public boolean onMenuItemClick(MenuItem item) {
                    int itemId = item.getItemId();
                    if (itemId == R.id.delete) {
                        View$OnClickListenerCf.Cd dVar = new View$OnClickListenerCf.Cd(Ca.this.f۱۳۷۴۳c);
                        dVar.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                        dVar.m۱۵۸۶۸d(Ca.this.f۱۳۷۴۷g);
                        dVar.m۱۵۸۵۸b(Ca.this.f۱۳۷۴۷g);
                        dVar.m۱۵۸۴۷a(Ca.this.f۱۳۷۴۷g);
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
                    } else if (itemId == R.id.edit) {
                        Intent frm_edit = new Intent(Ca.this.f۱۳۷۴۳c, AddCityBankAccountActivity.class);
                        StringBuilder sb = new StringBuilder();
                        Ca aVar = Ca.this;
                        sb.append(Ca.this.f۱۳۷۴۴d.get(aVar.m۱۴۳۹۰f()).m۱۷۶۰۰c());
                        sb.append("");
                        frm_edit.putExtra("id", sb.toString());
                        frm_edit.putExtra("frmMode", "edit");
                        Ca.this.f۱۳۷۴۵e.m۱۷۵۱۶b(frm_edit);
                        return true;
                    } else if (itemId != R.id.share) {
                        return true;
                    } else {
                        Ca.this.f۱۳۷۴۶f.m۱۷۸۱۱n();
                        Ci iVar = Ca.this.f۱۳۷۴۶f;
                        StringBuilder sb2 = new StringBuilder();
                        Ca aVar2 = Ca.this;
                        sb2.append(Ca.this.f۱۳۷۴۴d.get(aVar2.m۱۴۳۹۰f()).m۱۷۵۹۸b());
                        sb2.append("");
                        String cityName = iVar.m۱۷۸۰۶l(sb2.toString());
                        Ci iVar2 = Ca.this.f۱۳۷۴۶f;
                        StringBuilder sb3 = new StringBuilder();
                        Ca aVar3 = Ca.this;
                        sb3.append(Ca.this.f۱۳۷۴۴d.get(aVar3.m۱۴۳۹۰f()).m۱۷۵۹۵a());
                        sb3.append("");
                        String accountNumberTitle = iVar2.m۱۷۸۰۰i(sb3.toString());
                        Ca.this.f۱۳۷۴۶f.close();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(("" + "نوع شماره حساب : " + accountNumberTitle + "\n") + "داگستری شهرستان : " + cityName + "\n");
                        sb4.append("شماره حساب : ");
                        Ca aVar4 = Ca.this;
                        sb4.append(Ca.this.f۱۳۷۴۴d.get(aVar4.m۱۴۳۹۰f()).m۱۷۶۰۲d());
                        sb4.append("\n");
                        String shareVal = sb4.toString();
                        Intent shareIntent = new Intent();
                        shareIntent.setAction("android.intent.action.SEND");
                        shareIntent.setType("text/plain");
                        shareIntent.putExtra("android.intent.extra.TEXT", shareVal);
                        Ca.this.f۱۳۷۴۳c.startActivity(Intent.createChooser(shareIntent, "اشتراک گذاری شماره حساب"));
                        return true;
                    }
                }

                /* renamed from: com.lawyer_smartCalendar.a.a$a$a$a$b  reason: invalid class name */
                class Cb implements View$OnClickListenerCf.AbstractCm {
                    Cb(Ca this$3) {
                    }

                    @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
                    /* renamed from: a  reason: contains not printable characters */
                    public void m۱۷۰۳۴a(View$OnClickListenerCf dialog, EnumCb which) {
                        dialog.dismiss();
                    }
                }

                /* renamed from: com.lawyer_smartCalendar.a.a$a$a$a$a  reason: invalid class name */
                class Ca implements View$OnClickListenerCf.AbstractCm {
                    Ca() {
                    }

                    @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
                    /* renamed from: a  reason: contains not printable characters */
                    public void m۱۷۰۳۳a(View$OnClickListenerCf dialog, EnumCb which) {
                        Ca.this.f۱۳۷۴۶f.m۱۷۸۱۱n();
                        Ci iVar = Ca.this.f۱۳۷۴۶f;
                        StringBuilder sb = new StringBuilder();
                        Ca aVar = Ca.this;
                        sb.append(Ca.this.f۱۳۷۴۴d.get(aVar.m۱۴۳۹۰f()).m۱۷۶۰۰c());
                        sb.append("");
                        iVar.m۱۷۷۸۵b(sb.toString());
                        Ca.this.f۱۳۷۴۶f.close();
                        Ca.this.f۱۳۷۴۵e.m۱۷۵۱۷d0();
                    }
                }
            }
        }
    }

    public Ca(Context Activity, View$OnClickListenerCe fragmentTab1, List<com.lawyer_smartCalendar.p۱۳۳d.Ca> list) {
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

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۰۳۰b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.account_number_list_item, parent, false));
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۰۳۲b(Ca holder, int pos) {
        this.f۱۳۷۴۶f.m۱۷۸۱۱n();
        Ci iVar = this.f۱۳۷۴۶f;
        String city_name = iVar.m۱۷۸۰۶l(this.f۱۳۷۴۴d.get(pos).m۱۷۵۹۸b() + "");
        Ci iVar2 = this.f۱۳۷۴۶f;
        String account_type = iVar2.m۱۷۸۰۰i(this.f۱۳۷۴۴d.get(pos).m۱۷۵۹۵a() + "");
        this.f۱۳۷۴۶f.close();
        holder.f۱۳۷۵۱v.setTypeface(new Cf(this.f۱۳۷۴۳c).m۱۷۷۴۸b());
        holder.f۱۳۷۵۲w.setTypeface(new Cf(this.f۱۳۷۴۳c).m۱۷۷۴۶a());
        holder.f۱۳۷۵۲w.setText(city_name);
        holder.f۱۳۷۵۴y.setTypeface(new Cf(this.f۱۳۷۴۳c).m۱۷۷۴۸b());
        holder.f۱۳۷۵۳x.setTypeface(new Cf(this.f۱۳۷۴۳c).m۱۷۷۴۶a());
        holder.f۱۳۷۵۳x.setText(account_type);
        holder.f۱۳۷۵۵z.setTypeface(new Cf(this.f۱۳۷۴۳c).m۱۷۷۴۸b());
        holder.f۱۳۷۴۸A.setTypeface(new Cf(this.f۱۳۷۴۳c).m۱۷۷۴۶a());
        holder.f۱۳۷۴۸A.setText(this.f۱۳۷۴۴d.get(pos).m۱۷۶۰۲d());
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۰۲۶a() {
        return this.f۱۳۷۴۴d.size();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۰۲۷a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۰۲۹b(int position) {
        return position;
    }
}
