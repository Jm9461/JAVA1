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
import com.lawyer_smartCalendar.p۱۳۲c.View$OnClickListenerCb;
import com.lawyer_smartCalendar.p۱۳۳d.Cc;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ch;
import java.util.List;
import java.util.Locale;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;

/* renamed from: com.lawyer_smartCalendar.a.k  reason: invalid class name */
public class Ck extends RecyclerView.AbstractCg<Ca> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۳۸۹۵c;

    /* renamed from: d  reason: contains not printable characters */
    private List<Cc> f۱۳۸۹۶d;

    /* renamed from: e  reason: contains not printable characters */
    private Cf f۱۳۸۹۷e;

    /* renamed from: f  reason: contains not printable characters */
    View$OnClickListenerCb f۱۳۸۹۸f;

    /* renamed from: g  reason: contains not printable characters */
    private EnumCe f۱۳۸۹۹g = EnumCe.END;

    /* renamed from: com.lawyer_smartCalendar.a.k$a  reason: invalid class name */
    public class Ca extends RecyclerView.AbstractCd0 {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۳۹۰۰v;

        /* renamed from: w  reason: contains not printable characters */
        TextView f۱۳۹۰۱w;

        /* renamed from: x  reason: contains not printable characters */
        TextView f۱۳۹۰۲x;

        /* renamed from: y  reason: contains not printable characters */
        ImageView f۱۳۹۰۳y;

        public Ca(View convertView) {
            super(convertView);
            this.f۱۳۹۰۰v = (TextView) convertView.findViewById(R.id.textView_client_name);
            this.f۱۳۹۰۲x = (TextView) convertView.findViewById(R.id.client_name_character);
            this.f۱۳۹۰۱w = (TextView) convertView.findViewById(R.id.textView_client_phone);
            this.f۱۳۹۰۳y = (ImageView) convertView.findViewById(R.id.img_more);
            convertView.setOnClickListener(new View$OnClickListenerCa(Ck.this));
            this.f۱۳۹۰۳y.setOnClickListener(new View$OnClickListenerCb(Ck.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.k$a$a  reason: invalid class name */
        class View$OnClickListenerCa implements View.OnClickListener {
            View$OnClickListenerCa(Ck kVar) {
            }

            public void onClick(View view) {
                Intent frmClientDetail = new Intent(Ck.this.f۱۳۸۹۵c, ClientDetailActivity.class);
                frmClientDetail.putExtra("id", ((Cc) Ck.this.f۱۳۸۹۶d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۰d() + "");
                Ck.this.f۱۳۸۹۸f.m۱۷۴۹۹b(frmClientDetail);
            }
        }

        /* renamed from: com.lawyer_smartCalendar.a.k$a$b  reason: invalid class name */
        class View$OnClickListenerCb implements View.OnClickListener {
            View$OnClickListenerCb(Ck kVar) {
            }

            public void onClick(View view) {
                Cu0 popup = new Cu0(Ck.this.f۱۳۸۹۵c, Ca.this.f۱۳۹۰۳y);
                popup.m۱۵۶۳۳b().inflate(R.menu.client_more_menu, popup.m۱۵۶۳۱a());
                popup.m۱۵۶۳۲a(new Ca());
                popup.m۱۵۶۳۴c();
            }

            /* renamed from: com.lawyer_smartCalendar.a.k$a$b$a  reason: invalid class name */
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
                            if (!((Cc) Ck.this.f۱۳۸۹۶d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۸h().equals("")) {
                                Ck.this.f۱۳۸۹۵c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("sms:" + ((Cc) Ck.this.f۱۳۸۹۶d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۸h())));
                                return true;
                            }
                            new Ch().m۱۷۷۵۳a(Ck.this.f۱۳۸۹۵c, "warning", "شماره تلفن همراه ثبت نشده است.");
                            return true;
                        } else if (!((Cc) Ck.this.f۱۳۸۹۶d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۳۶b().equals("")) {
                            Intent emailIntent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:" + ((Cc) Ck.this.f۱۳۸۹۶d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۳۶b()));
                            Context context = Ck.this.f۱۳۸۹۵c;
                            context.startActivity(Intent.createChooser(emailIntent, "تماس با پست الکترونیک : " + ((Cc) Ck.this.f۱۳۸۹۶d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۴f()));
                            return true;
                        } else {
                            new Ch().m۱۷۷۵۳a(Ck.this.f۱۳۸۹۵c, "warning", "آدرس پست الکترونیک ثبت نشده است.");
                            return true;
                        }
                    } else if (((Cc) Ck.this.f۱۳۸۹۶d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۵۰i().equals("real")) {
                        View$OnClickListenerCf.Cd dVar = new View$OnClickListenerCf.Cd(Ck.this.f۱۳۸۹۵c);
                        dVar.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                        dVar.m۱۵۸۶۸d(Ck.this.f۱۳۸۹۹g);
                        dVar.m۱۵۸۵۸b(Ck.this.f۱۳۸۹۹g);
                        dVar.m۱۵۸۶۳c(Ck.this.f۱۳۸۹۹g);
                        dVar.m۱۵۸۵۸b(Ck.this.f۱۳۸۹۹g);
                        dVar.m۱۵۸۷۱e("تماس با موکل");
                        dVar.m۱۵۸۴۱a(R.array.client_call);
                        dVar.m۱۵۸۴۲a(-1, new Ca());
                        dVar.m۱۵۸۶۶c();
                        return true;
                    } else if (!((Cc) Ck.this.f۱۳۸۹۶d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۲e().equals("")) {
                        Intent intent2 = new Intent("android.intent.action.DIAL");
                        intent2.setData(Uri.parse("tel:" + ((Cc) Ck.this.f۱۳۸۹۶d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۲e()));
                        Ck.this.f۱۳۸۹۵c.startActivity(intent2);
                        return true;
                    } else {
                        new Ch().m۱۷۷۵۳a(Ck.this.f۱۳۸۹۵c, "warning", "شماره تلفن ثابت ثبت نشده است.");
                        return true;
                    }
                }

                /* renamed from: com.lawyer_smartCalendar.a.k$a$b$a$a  reason: invalid class name */
                class Ca implements View$OnClickListenerCf.AbstractCj {
                    Ca() {
                    }

                    @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCj
                    /* renamed from: a  reason: contains not printable characters */
                    public boolean m۱۷۱۷۲a(View$OnClickListenerCf dialog, View view, int which, CharSequence text) {
                        if (which != 0) {
                            if (which == 1) {
                                if (!((Cc) Ck.this.f۱۳۸۹۶d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۲e().equals("")) {
                                    Intent intent2 = new Intent("android.intent.action.DIAL");
                                    intent2.setData(Uri.parse("tel:" + ((Cc) Ck.this.f۱۳۸۹۶d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۲e()));
                                    Ck.this.f۱۳۸۹۵c.startActivity(intent2);
                                } else {
                                    new Ch().m۱۷۷۵۳a(Ck.this.f۱۳۸۹۵c, "warning", "شماره تلفن ثابت ثبت نشده است.");
                                }
                            }
                        } else if (!((Cc) Ck.this.f۱۳۸۹۶d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۸h().equals("")) {
                            Intent intent = new Intent("android.intent.action.DIAL");
                            intent.setData(Uri.parse("tel:" + ((Cc) Ck.this.f۱۳۸۹۶d.get(Ca.this.m۱۴۳۹۰f())).m۱۷۶۴۸h()));
                            Ck.this.f۱۳۸۹۵c.startActivity(intent);
                        } else {
                            new Ch().m۱۷۷۵۳a(Ck.this.f۱۳۸۹۵c, "warning", "شماره تلفن همراه ثبت نشده است.");
                        }
                        return true;
                    }
                }
            }
        }
    }

    public Ck(Context Activity, View$OnClickListenerCb fragmentTab2, List<Cc> list) {
        m۱۴۴۳۸a(true);
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

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۷۱۶۹b(ViewGroup parent, int viewType) {
        return new Ca(LayoutInflater.from(parent.getContext()).inflate(R.layout.client_list_item, parent, false));
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۱۷۱b(Ca holder, int pos) {
        holder.f۱۳۹۰۰v.setText(this.f۱۳۸۹۶d.get(pos).m۱۷۶۴۴f());
        char[] character = this.f۱۳۸۹۶d.get(pos).m۱۷۶۴۴f().toCharArray();
        TextView textView = holder.f۱۳۹۰۲x;
        textView.setText(character[0] + "");
        holder.f۱۳۹۰۰v.setTypeface(this.f۱۳۸۹۷e.m۱۷۷۴۶a());
        holder.f۱۳۹۰۲x.setTypeface(this.f۱۳۸۹۷e.m۱۷۷۴۸b());
        if (this.f۱۳۸۹۶d.get(pos).m۱۷۶۵۰i().equals("real")) {
            if (!this.f۱۳۸۹۶d.get(pos).m۱۷۶۴۸h().equals("")) {
                holder.f۱۳۹۰۱w.setText(this.f۱۳۸۹۶d.get(pos).m۱۷۶۴۸h());
            } else {
                holder.f۱۳۹۰۱w.setText("-");
            }
        } else if (!this.f۱۳۸۹۶d.get(pos).m۱۷۶۴۲e().equals("")) {
            holder.f۱۳۹۰۱w.setText(this.f۱۳۸۹۶d.get(pos).m۱۷۶۴۲e());
        } else {
            holder.f۱۳۹۰۱w.setText("-");
        }
        holder.f۱۳۹۰۱w.setTypeface(this.f۱۳۸۹۷e.m۱۷۷۴۶a());
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۱۶۵a() {
        return this.f۱۳۸۹۶d.size();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۷۱۶۶a(int position) {
        return (long) position;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۱۶۸b(int position) {
        return position;
    }
}
