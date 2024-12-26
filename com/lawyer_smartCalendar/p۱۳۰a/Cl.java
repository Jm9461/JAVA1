package com.lawyer_smartCalendar.p۱۳۰a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
import com.lawyer_smartCalendar.activity.ClientDetailActivity;
import com.lawyer_smartCalendar.activity.SearchActivity;
import com.lawyer_smartCalendar.p۱۳۳d.Cc;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ch;
import java.util.List;
import java.util.Locale;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;

/* renamed from: com.lawyer_smartCalendar.a.l  reason: invalid class name */
public class Cl extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۹۰۹c;

    /* renamed from: d  reason: contains not printable characters */
    private List<Cc> f۱۳۹۱۰d;

    /* renamed from: e  reason: contains not printable characters */
    private Cf f۱۳۹۱۱e;

    /* renamed from: f  reason: contains not printable characters */
    private EnumCe f۱۳۹۱۲f = EnumCe.END;

    /* renamed from: com.lawyer_smartCalendar.a.l$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۳۹۱۳v;

        /* renamed from: w  reason: contains not printable characters */
        TextView f۱۳۹۱۴w;

        /* renamed from: x  reason: contains not printable characters */
        TextView f۱۳۹۱۵x;

        /* renamed from: y  reason: contains not printable characters */
        ImageView f۱۳۹۱۶y;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۳۹۱۳v = (TextView) convertView.findViewById(R.id.textView_client_name);
            this.f۱۳۹۱۵x = (TextView) convertView.findViewById(R.id.client_name_character);
            this.f۱۳۹۱۴w = (TextView) convertView.findViewById(R.id.textView_client_phone);
            this.f۱۳۹۱۶y = (ImageView) convertView.findViewById(R.id.img_more);
            convertView.setOnClickListener(new View$OnClickListenerCa(Cl.this));
            this.f۱۳۹۱۶y.setOnClickListener(new View$OnClickListenerCb(Cl.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.l$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Cl lVar) {
            }

            public void onClick(View view) {
                Intent frmClientDetail = new Intent(Cl.this.f۱۳۹۰۹c, ClientDetailActivity.class);
                frmClientDetail.putExtra("id", ((Cc) Cl.this.f۱۳۹۱۰d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۰d() + "");
                ((SearchActivity) Cl.this.f۱۳۹۰۹c).m۱۷۴۶۸c(frmClientDetail);
            }
        }

        /* renamed from: com.lawyer_smartCalendar.a.l$a$b  reason: invalid class name */
        class View$OnClickListenerCb implements View.OnClickListener {
            View$OnClickListenerCb(Cl lVar) {
            }

            public void onClick(View view) {
                Cu0 popup = new Cu0(Cl.this.f۱۳۹۰۹c, Ca.this.f۱۳۹۱۶y);
                popup.m۱۵۶۳۳b().inflate(R.menu.client_more_menu, popup.m۱۵۶۳۱a());
                popup.m۱۵۶۳۲a(new Ca());
                popup.m۱۵۶۳۴c();
            }

            /* renamed from: com.lawyer_smartCalendar.a.l$a$b$a  reason: invalid class name */
            class Ca implements Cu0.AbstractCd {
                Ca() {
                }

                @Override // android.support.p۰۴۷v7.widget.Cu0.AbstractCd
                public boolean onMenuItemClick(MenuItem item) {
                    int itemId = item.getItemId();
                    if (itemId != R.id.call) {
                        if (itemId != R.id.email) {
                            if (itemId != R.id.message) {
                                return true;
                            }
                            if (!((Cc) Cl.this.f۱۳۹۱۰d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۸h().equals("")) {
                                Cl.this.f۱۳۹۰۹c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("sms:" + ((Cc) Cl.this.f۱۳۹۱۰d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۸h())));
                                return true;
                            }
                            new Ch().m۱۷۷۵۳a(Cl.this.f۱۳۹۰۹c, "warning", "شماره تلفن همراه ثبت نشده است.");
                            return true;
                        } else if (!((Cc) Cl.this.f۱۳۹۱۰d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۳۶b().equals("")) {
                            Intent emailIntent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:" + ((Cc) Cl.this.f۱۳۹۱۰d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۳۶b()));
                            Context context = Cl.this.f۱۳۹۰۹c;
                            context.startActivity(Intent.createChooser(emailIntent, "تماس با پست الکترونیک : " + ((Cc) Cl.this.f۱۳۹۱۰d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۴f()));
                            return true;
                        } else {
                            new Ch().m۱۷۷۵۳a(Cl.this.f۱۳۹۰۹c, "warning", "آدرس پست الکترونیک ثبت نشده است.");
                            return true;
                        }
                    } else if (((Cc) Cl.this.f۱۳۹۱۰d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۵۰i().equals("real")) {
                        View$OnClickListenerCf.Cd dVar = new View$OnClickListenerCf.Cd(Cl.this.f۱۳۹۰۹c);
                        dVar.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                        dVar.m۱۵۸۶۸d(Cl.this.f۱۳۹۱۲f);
                        dVar.m۱۵۸۵۸b(Cl.this.f۱۳۹۱۲f);
                        dVar.m۱۵۸۶۳c(Cl.this.f۱۳۹۱۲f);
                        dVar.m۱۵۸۵۸b(Cl.this.f۱۳۹۱۲f);
                        dVar.m۱۵۸۷۱e("تماس با موکل");
                        dVar.m۱۵۸۴۱a(R.array.client_call);
                        dVar.m۱۵۸۴۲a(-1, new Ca());
                        dVar.m۱۵۸۶۶c();
                        return true;
                    } else if (!((Cc) Cl.this.f۱۳۹۱۰d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۲e().equals("")) {
                        Intent intent2 = new Intent("android.intent.action.DIAL");
                        intent2.setData(Uri.parse("tel:" + ((Cc) Cl.this.f۱۳۹۱۰d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۲e()));
                        Cl.this.f۱۳۹۰۹c.startActivity(intent2);
                        return true;
                    } else {
                        new Ch().m۱۷۷۵۳a(Cl.this.f۱۳۹۰۹c, "warning", "شماره تلفن ثابت ثبت نشده است.");
                        return true;
                    }
                }

                /* renamed from: com.lawyer_smartCalendar.a.l$a$b$a$a  reason: invalid class name */
                class Ca implements View$OnClickListenerCf.AbstractCj {
                    Ca() {
                    }

                    @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCj
                    /* renamed from: a  reason: contains not printable characters */
                    public boolean m۱۷۱۸۳a(View$OnClickListenerCf dialog, View view, int which, CharSequence text) {
                        if (which != 0) {
                            if (which == 1) {
                                if (!((Cc) Cl.this.f۱۳۹۱۰d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۲e().equals("")) {
                                    Intent intent2 = new Intent("android.intent.action.DIAL");
                                    intent2.setData(Uri.parse("tel:" + ((Cc) Cl.this.f۱۳۹۱۰d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۲e()));
                                    Cl.this.f۱۳۹۰۹c.startActivity(intent2);
                                } else {
                                    new Ch().m۱۷۷۵۳a(Cl.this.f۱۳۹۰۹c, "warning", "شماره تلفن ثابت ثبت نشده است.");
                                }
                            }
                        } else if (!((Cc) Cl.this.f۱۳۹۱۰d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۸h().equals("")) {
                            Intent intent = new Intent("android.intent.action.DIAL");
                            intent.setData(Uri.parse("tel:" + ((Cc) Cl.this.f۱۳۹۱۰d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۸h()));
                            Cl.this.f۱۳۹۰۹c.startActivity(intent);
                        } else {
                            new Ch().m۱۷۷۵۳a(Cl.this.f۱۳۹۰۹c, "warning", "شماره تلفن همراه ثبت نشده است.");
                        }
                        return true;
                    }
                }
            }
        }
    }

    public Cl(Context Activity, List<Cc> list) {
        m۱۴۴۳۸a(true);
        this.f۱۳۹۰۹c = Activity;
        this.f۱۳۹۱۰d = list;
        this.f۱۳۹۱۱e = new Cf(this.f۱۳۹۰۹c);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            this.f۱۳۹۱۲f = EnumCe.END;
        } else {
            this.f۱۳۹۱۲f = EnumCe.START;
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۱۸۰b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.client_list_item, parent, false));
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۱۸۲b(Ca holder, int pos) {
        holder.f۱۳۹۱۳v.setText(this.f۱۳۹۱۰d.get(pos).m۱۷۶۴۴f());
        char[] character = this.f۱۳۹۱۰d.get(pos).m۱۷۶۴۴f().toCharArray();
        TextView textView = holder.f۱۳۹۱۵x;
        textView.setText(character[0] + "");
        holder.f۱۳۹۱۳v.setTypeface(this.f۱۳۹۱۱e.m۱۷۷۴۶a());
        holder.f۱۳۹۱۵x.setTypeface(this.f۱۳۹۱۱e.m۱۷۷۴۸b());
        if (this.f۱۳۹۱۰d.get(pos).m۱۷۶۵۰i().equals("real")) {
            if (!this.f۱۳۹۱۰d.get(pos).m۱۷۶۴۸h().equals("")) {
                holder.f۱۳۹۱۴w.setText(this.f۱۳۹۱۰d.get(pos).m۱۷۶۴۸h());
            } else {
                holder.f۱۳۹۱۴w.setText("-");
            }
        } else if (!this.f۱۳۹۱۰d.get(pos).m۱۷۶۴۲e().equals("")) {
            holder.f۱۳۹۱۴w.setText(this.f۱۳۹۱۰d.get(pos).m۱۷۶۴۲e());
        } else {
            holder.f۱۳۹۱۴w.setText("-");
        }
        holder.f۱۳۹۱۴w.setTypeface(this.f۱۳۹۱۱e.m۱۷۷۴۶a());
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۱۷۶a() {
        return this.f۱۳۹۱۰d.size();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۱۷۷a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۱۷۹b(int position) {
        return position;
    }
}
