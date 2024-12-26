package com.lawyer_smartCalendar.p۲۸۶a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.Cu0;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.lawyer_smartCalendar.activity.ClientDetailActivity;
import com.lawyer_smartCalendar.p۲۸۸c.ViewOnClickListenerCb;
import com.lawyer_smartCalendar.p۲۸۹d.Cc;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ch;
import java.util.List;
import java.util.Locale;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.EnumCe;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.ViewOnClickListenerCf;

/* renamed from: com.lawyer_smartCalendar.a.k, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ck extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۸۹۵c;

    /* renamed from: d, reason: contains not printable characters */
    private List<Cc> f۱۳۸۹۶d;

    /* renamed from: e, reason: contains not printable characters */
    private Cf f۱۳۸۹۷e;

    /* renamed from: f, reason: contains not printable characters */
    ViewOnClickListenerCb f۱۳۸۹۸f;

    /* renamed from: g, reason: contains not printable characters */
    private EnumCe f۱۳۸۹۹g;

    /* renamed from: com.lawyer_smartCalendar.a.k$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۳۹۰۰v;

        /* renamed from: w, reason: contains not printable characters */
        TextView f۱۳۹۰۱w;

        /* renamed from: x, reason: contains not printable characters */
        TextView f۱۳۹۰۲x;

        /* renamed from: y, reason: contains not printable characters */
        ImageView f۱۳۹۰۳y;

        public a(View convertView) {
            super(convertView);
            this.f۱۳۹۰۰v = (TextView) convertView.findViewById(2131296790);
            this.f۱۳۹۰۲x = (TextView) convertView.findViewById(2131296384);
            this.f۱۳۹۰۱w = (TextView) convertView.findViewById(2131296791);
            this.f۱۳۹۰۳y = (ImageView) convertView.findViewById(2131296479);
            convertView.setOnClickListener(new ViewOnClickListenerC۱۴۵۰a(Ck.this));
            this.f۱۳۹۰۳y.setOnClickListener(new b(Ck.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.k$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۵۰a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۵۰a(Ck ck) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent frmClientDetail = new Intent(Ck.this.f۱۳۸۹۵c, (Class<?>) ClientDetailActivity.class);
                frmClientDetail.putExtra("id", ((Cc) Ck.this.f۱۳۸۹۶d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۲d() + "");
                Ck.this.f۱۳۸۹۸f.m۱۵۴۲۱b(frmClientDetail);
            }
        }

        /* renamed from: com.lawyer_smartCalendar.a.k$a$b */
        class b implements View.OnClickListener {
            b(Ck ck) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Cu0 popup = new Cu0(Ck.this.f۱۳۸۹۵c, a.this.f۱۳۹۰۳y);
                popup.m۱۳۵۶۳b().inflate(2131558405, popup.m۱۳۵۶۱a());
                popup.m۱۳۵۶۲a(new C۱۴۵۱a());
                popup.m۱۳۵۶۴c();
            }

            /* renamed from: com.lawyer_smartCalendar.a.k$a$b$a, reason: collision with other inner class name */
            class C۱۴۵۱a implements Cu0.d {
                C۱۴۵۱a() {
                }

                @Override // android.support.v7.widget.Cu0.d
                public boolean onMenuItemClick(MenuItem item) {
                    int itemId = item.getItemId();
                    if (itemId == 2131296367) {
                        if (!((Cc) Ck.this.f۱۳۸۹۶d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۷۲i().equals("real")) {
                            if (((Cc) Ck.this.f۱۳۸۹۶d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۴e().equals("")) {
                                new Ch().m۱۵۶۷۵a(Ck.this.f۱۳۸۹۵c, "warning", "شماره تلفن ثابت ثبت نشده است.");
                                return true;
                            }
                            Intent intent2 = new Intent("android.intent.action.DIAL");
                            intent2.setData(Uri.parse("tel:" + ((Cc) Ck.this.f۱۳۸۹۶d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۴e()));
                            Ck.this.f۱۳۸۹۵c.startActivity(intent2);
                            return true;
                        }
                        ViewOnClickListenerCf.d dVar = new ViewOnClickListenerCf.d(Ck.this.f۱۳۸۹۵c);
                        dVar.m۱۳۷۸۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                        dVar.m۱۳۷۹۸d(Ck.this.f۱۳۸۹۹g);
                        dVar.m۱۳۷۸۸b(Ck.this.f۱۳۸۹۹g);
                        dVar.m۱۳۷۹۳c(Ck.this.f۱۳۸۹۹g);
                        dVar.m۱۳۷۸۸b(Ck.this.f۱۳۸۹۹g);
                        dVar.m۱۳۸۰۱e("تماس با موکل");
                        dVar.m۱۳۷۷۱a(2130903046);
                        dVar.m۱۳۷۷۲a(-1, new C۱۴۵۲a());
                        dVar.m۱۳۷۹۶c();
                        return true;
                    }
                    if (itemId != 2131296431) {
                        if (itemId == 2131296612) {
                            if (!((Cc) Ck.this.f۱۳۸۹۶d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۷۰h().equals("")) {
                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("sms:" + ((Cc) Ck.this.f۱۳۸۹۶d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۷۰h()));
                                Ck.this.f۱۳۸۹۵c.startActivity(intent);
                                return true;
                            }
                            new Ch().m۱۵۶۷۵a(Ck.this.f۱۳۸۹۵c, "warning", "شماره تلفن همراه ثبت نشده است.");
                            return true;
                        }
                        return true;
                    }
                    if (!((Cc) Ck.this.f۱۳۸۹۶d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۵۸b().equals("")) {
                        Intent emailIntent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:" + ((Cc) Ck.this.f۱۳۸۹۶d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۵۸b()));
                        Ck.this.f۱۳۸۹۵c.startActivity(Intent.createChooser(emailIntent, "تماس با پست الکترونیک : " + ((Cc) Ck.this.f۱۳۸۹۶d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۶f()));
                        return true;
                    }
                    new Ch().m۱۵۶۷۵a(Ck.this.f۱۳۸۹۵c, "warning", "آدرس پست الکترونیک ثبت نشده است.");
                    return true;
                }

                /* renamed from: com.lawyer_smartCalendar.a.k$a$b$a$a, reason: collision with other inner class name */
                class C۱۴۵۲a implements ViewOnClickListenerCf.j {
                    C۱۴۵۲a() {
                    }

                    @Override // p۲۰۸b.p۲۰۹a.p۲۱۰a.ViewOnClickListenerCf.j
                    /* renamed from: a, reason: contains not printable characters */
                    public boolean mo۱۵۳۷۹a(ViewOnClickListenerCf dialog, View view, int which, CharSequence text) {
                        if (which != 0) {
                            if (which == 1) {
                                if (((Cc) Ck.this.f۱۳۸۹۶d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۴e().equals("")) {
                                    new Ch().m۱۵۶۷۵a(Ck.this.f۱۳۸۹۵c, "warning", "شماره تلفن ثابت ثبت نشده است.");
                                } else {
                                    Intent intent2 = new Intent("android.intent.action.DIAL");
                                    intent2.setData(Uri.parse("tel:" + ((Cc) Ck.this.f۱۳۸۹۶d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۴e()));
                                    Ck.this.f۱۳۸۹۵c.startActivity(intent2);
                                }
                            }
                        } else if (((Cc) Ck.this.f۱۳۸۹۶d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۷۰h().equals("")) {
                            new Ch().m۱۵۶۷۵a(Ck.this.f۱۳۸۹۵c, "warning", "شماره تلفن همراه ثبت نشده است.");
                        } else {
                            Intent intent = new Intent("android.intent.action.DIAL");
                            intent.setData(Uri.parse("tel:" + ((Cc) Ck.this.f۱۳۸۹۶d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۷۰h()));
                            Ck.this.f۱۳۸۹۵c.startActivity(intent);
                        }
                        return true;
                    }
                }
            }
        }
    }

    public Ck(Context Activity, ViewOnClickListenerCb fragmentTab2, List<Cc> list) {
        this.f۱۳۸۹۹g = EnumCe.END;
        m۱۲۳۶۸a(true);
        this.f۱۳۸۹۵c = Activity;
        this.f۱۳۸۹۶d = list;
        this.f۱۳۸۹۸f = fragmentTab2;
        this.f۱۳۸۹۷e = new Cf(this.f۱۳۸۹۵c);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            this.f۱۳۸۹۹g = EnumCe.END;
        } else {
            this.f۱۳۸۹۹g = EnumCe.START;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(2131492949, parent, false);
        return new a(itemView);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo۱۷۶۶۱b(a holder, int pos) {
        holder.f۱۳۹۰۰v.setText(this.f۱۳۸۹۶d.get(pos).m۱۵۵۶۶f());
        char[] character = this.f۱۳۸۹۶d.get(pos).m۱۵۵۶۶f().toCharArray();
        holder.f۱۳۹۰۲x.setText(character[0] + "");
        holder.f۱۳۹۰۰v.setTypeface(this.f۱۳۸۹۷e.m۱۵۶۶۸a());
        holder.f۱۳۹۰۲x.setTypeface(this.f۱۳۸۹۷e.m۱۵۶۷۰b());
        if (this.f۱۳۸۹۶d.get(pos).m۱۵۵۷۲i().equals("real")) {
            if (!this.f۱۳۸۹۶d.get(pos).m۱۵۵۷۰h().equals("")) {
                holder.f۱۳۹۰۱w.setText(this.f۱۳۸۹۶d.get(pos).m۱۵۵۷۰h());
            } else {
                holder.f۱۳۹۰۱w.setText("-");
            }
        } else if (!this.f۱۳۸۹۶d.get(pos).m۱۵۵۶۴e().equals("")) {
            holder.f۱۳۹۰۱w.setText(this.f۱۳۸۹۶d.get(pos).m۱۵۵۶۴e());
        } else {
            holder.f۱۳۹۰۱w.setText("-");
        }
        holder.f۱۳۹۰۱w.setTypeface(this.f۱۳۸۹۷e.m۱۵۶۶۸a());
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۸۹۶d.size();
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
