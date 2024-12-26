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
import com.lawyer_smartCalendar.activity.SearchActivity;
import com.lawyer_smartCalendar.p۲۸۹d.Cc;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ch;
import java.util.List;
import java.util.Locale;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.EnumCe;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.ViewOnClickListenerCf;

/* renamed from: com.lawyer_smartCalendar.a.l, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cl extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۳۹۰۹c;

    /* renamed from: d, reason: contains not printable characters */
    private List<Cc> f۱۳۹۱۰d;

    /* renamed from: e, reason: contains not printable characters */
    private Cf f۱۳۹۱۱e;

    /* renamed from: f, reason: contains not printable characters */
    private EnumCe f۱۳۹۱۲f;

    /* renamed from: com.lawyer_smartCalendar.a.l$a */
    public class a extends RecyclerView.AbstractCd0 {

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۳۹۱۳v;

        /* renamed from: w, reason: contains not printable characters */
        TextView f۱۳۹۱۴w;

        /* renamed from: x, reason: contains not printable characters */
        TextView f۱۳۹۱۵x;

        /* renamed from: y, reason: contains not printable characters */
        ImageView f۱۳۹۱۶y;

        public a(View convertView) {
            super(convertView);
            this.f۱۳۹۱۳v = (TextView) convertView.findViewById(2131296790);
            this.f۱۳۹۱۵x = (TextView) convertView.findViewById(2131296384);
            this.f۱۳۹۱۴w = (TextView) convertView.findViewById(2131296791);
            this.f۱۳۹۱۶y = (ImageView) convertView.findViewById(2131296479);
            convertView.setOnClickListener(new ViewOnClickListenerC۱۴۵۳a(Cl.this));
            this.f۱۳۹۱۶y.setOnClickListener(new b(Cl.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.l$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC۱۴۵۳a implements View.OnClickListener {
            ViewOnClickListenerC۱۴۵۳a(Cl cl) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent frmClientDetail = new Intent(Cl.this.f۱۳۹۰۹c, (Class<?>) ClientDetailActivity.class);
                frmClientDetail.putExtra("id", ((Cc) Cl.this.f۱۳۹۱۰d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۲d() + "");
                ((SearchActivity) Cl.this.f۱۳۹۰۹c).m۱۵۳۹۰c(frmClientDetail);
            }
        }

        /* renamed from: com.lawyer_smartCalendar.a.l$a$b */
        class b implements View.OnClickListener {
            b(Cl cl) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Cu0 popup = new Cu0(Cl.this.f۱۳۹۰۹c, a.this.f۱۳۹۱۶y);
                popup.m۱۳۵۶۳b().inflate(2131558405, popup.m۱۳۵۶۱a());
                popup.m۱۳۵۶۲a(new C۱۴۵۴a());
                popup.m۱۳۵۶۴c();
            }

            /* renamed from: com.lawyer_smartCalendar.a.l$a$b$a, reason: collision with other inner class name */
            class C۱۴۵۴a implements Cu0.d {
                C۱۴۵۴a() {
                }

                @Override // android.support.v7.widget.Cu0.d
                public boolean onMenuItemClick(MenuItem item) {
                    int itemId = item.getItemId();
                    if (itemId == 2131296367) {
                        if (!((Cc) Cl.this.f۱۳۹۱۰d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۷۲i().equals("real")) {
                            if (((Cc) Cl.this.f۱۳۹۱۰d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۴e().equals("")) {
                                new Ch().m۱۵۶۷۵a(Cl.this.f۱۳۹۰۹c, "warning", "شماره تلفن ثابت ثبت نشده است.");
                                return true;
                            }
                            Intent intent2 = new Intent("android.intent.action.DIAL");
                            intent2.setData(Uri.parse("tel:" + ((Cc) Cl.this.f۱۳۹۱۰d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۴e()));
                            Cl.this.f۱۳۹۰۹c.startActivity(intent2);
                            return true;
                        }
                        ViewOnClickListenerCf.d dVar = new ViewOnClickListenerCf.d(Cl.this.f۱۳۹۰۹c);
                        dVar.m۱۳۷۸۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                        dVar.m۱۳۷۹۸d(Cl.this.f۱۳۹۱۲f);
                        dVar.m۱۳۷۸۸b(Cl.this.f۱۳۹۱۲f);
                        dVar.m۱۳۷۹۳c(Cl.this.f۱۳۹۱۲f);
                        dVar.m۱۳۷۸۸b(Cl.this.f۱۳۹۱۲f);
                        dVar.m۱۳۸۰۱e("تماس با موکل");
                        dVar.m۱۳۷۷۱a(2130903046);
                        dVar.m۱۳۷۷۲a(-1, new C۱۴۵۵a());
                        dVar.m۱۳۷۹۶c();
                        return true;
                    }
                    if (itemId != 2131296431) {
                        if (itemId == 2131296612) {
                            if (!((Cc) Cl.this.f۱۳۹۱۰d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۷۰h().equals("")) {
                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("sms:" + ((Cc) Cl.this.f۱۳۹۱۰d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۷۰h()));
                                Cl.this.f۱۳۹۰۹c.startActivity(intent);
                                return true;
                            }
                            new Ch().m۱۵۶۷۵a(Cl.this.f۱۳۹۰۹c, "warning", "شماره تلفن همراه ثبت نشده است.");
                            return true;
                        }
                        return true;
                    }
                    if (!((Cc) Cl.this.f۱۳۹۱۰d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۵۸b().equals("")) {
                        Intent emailIntent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:" + ((Cc) Cl.this.f۱۳۹۱۰d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۵۸b()));
                        Cl.this.f۱۳۹۰۹c.startActivity(Intent.createChooser(emailIntent, "تماس با پست الکترونیک : " + ((Cc) Cl.this.f۱۳۹۱۰d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۶f()));
                        return true;
                    }
                    new Ch().m۱۵۶۷۵a(Cl.this.f۱۳۹۰۹c, "warning", "آدرس پست الکترونیک ثبت نشده است.");
                    return true;
                }

                /* renamed from: com.lawyer_smartCalendar.a.l$a$b$a$a, reason: collision with other inner class name */
                class C۱۴۵۵a implements ViewOnClickListenerCf.j {
                    C۱۴۵۵a() {
                    }

                    @Override // p۲۰۸b.p۲۰۹a.p۲۱۰a.ViewOnClickListenerCf.j
                    /* renamed from: a, reason: contains not printable characters */
                    public boolean mo۱۵۳۷۹a(ViewOnClickListenerCf dialog, View view, int which, CharSequence text) {
                        if (which != 0) {
                            if (which == 1) {
                                if (((Cc) Cl.this.f۱۳۹۱۰d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۴e().equals("")) {
                                    new Ch().m۱۵۶۷۵a(Cl.this.f۱۳۹۰۹c, "warning", "شماره تلفن ثابت ثبت نشده است.");
                                } else {
                                    Intent intent2 = new Intent("android.intent.action.DIAL");
                                    intent2.setData(Uri.parse("tel:" + ((Cc) Cl.this.f۱۳۹۱۰d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۶۴e()));
                                    Cl.this.f۱۳۹۰۹c.startActivity(intent2);
                                }
                            }
                        } else if (((Cc) Cl.this.f۱۳۹۱۰d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۷۰h().equals("")) {
                            new Ch().m۱۵۶۷۵a(Cl.this.f۱۳۹۰۹c, "warning", "شماره تلفن همراه ثبت نشده است.");
                        } else {
                            Intent intent = new Intent("android.intent.action.DIAL");
                            intent.setData(Uri.parse("tel:" + ((Cc) Cl.this.f۱۳۹۱۰d.get(a.this.m۱۲۳۲۰f())).m۱۵۵۷۰h()));
                            Cl.this.f۱۳۹۰۹c.startActivity(intent);
                        }
                        return true;
                    }
                }
            }
        }
    }

    public Cl(Context Activity, List<Cc> list) {
        this.f۱۳۹۱۲f = EnumCe.END;
        m۱۲۳۶۸a(true);
        this.f۱۳۹۰۹c = Activity;
        this.f۱۳۹۱۰d = list;
        this.f۱۳۹۱۱e = new Cf(this.f۱۳۹۰۹c);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            this.f۱۳۹۱۲f = EnumCe.END;
        } else {
            this.f۱۳۹۱۲f = EnumCe.START;
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
        holder.f۱۳۹۱۳v.setText(this.f۱۳۹۱۰d.get(pos).m۱۵۵۶۶f());
        char[] character = this.f۱۳۹۱۰d.get(pos).m۱۵۵۶۶f().toCharArray();
        holder.f۱۳۹۱۵x.setText(character[0] + "");
        holder.f۱۳۹۱۳v.setTypeface(this.f۱۳۹۱۱e.m۱۵۶۶۸a());
        holder.f۱۳۹۱۵x.setTypeface(this.f۱۳۹۱۱e.m۱۵۶۷۰b());
        if (this.f۱۳۹۱۰d.get(pos).m۱۵۵۷۲i().equals("real")) {
            if (!this.f۱۳۹۱۰d.get(pos).m۱۵۵۷۰h().equals("")) {
                holder.f۱۳۹۱۴w.setText(this.f۱۳۹۱۰d.get(pos).m۱۵۵۷۰h());
            } else {
                holder.f۱۳۹۱۴w.setText("-");
            }
        } else if (!this.f۱۳۹۱۰d.get(pos).m۱۵۵۶۴e().equals("")) {
            holder.f۱۳۹۱۴w.setText(this.f۱۳۹۱۰d.get(pos).m۱۵۵۶۴e());
        } else {
            holder.f۱۳۹۱۴w.setText("-");
        }
        holder.f۱۳۹۱۴w.setTypeface(this.f۱۳۹۱۱e.m۱۵۶۶۸a());
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return this.f۱۳۹۱۰d.size();
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
