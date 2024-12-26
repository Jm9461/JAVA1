package com.lawyer_smartCalendar.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
import com.lawyer_smartCalendar.activity.ClientDetailActivity;
import com.lawyer_smartCalendar.c.b;
import com.lawyer_smartCalendar.d.c;
import com.lawyer_smartCalendar.utils.f;
import com.lawyer_smartCalendar.utils.h;
import java.util.List;
import java.util.Locale;

public class k extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۲۹۹۴c;

    /* renamed from: d  reason: collision with root package name */
    private List<c> f۲۹۹۵d;

    /* renamed from: e  reason: collision with root package name */
    private f f۲۹۹۶e;

    /* renamed from: f  reason: collision with root package name */
    b f۲۹۹۷f;

    /* renamed from: g  reason: collision with root package name */
    private e f۲۹۹۸g = e.END;

    public class a extends RecyclerView.d0 {
        TextView v;
        TextView w;
        TextView x;
        ImageView y;

        public a(View convertView) {
            super(convertView);
            this.v = (TextView) convertView.findViewById(R.id.textView_client_name);
            this.x = (TextView) convertView.findViewById(R.id.client_name_character);
            this.w = (TextView) convertView.findViewById(R.id.textView_client_phone);
            this.y = (ImageView) convertView.findViewById(R.id.img_more);
            convertView.setOnClickListener(new View$OnClickListenerC۰۰۸۶a(k.this));
            this.y.setOnClickListener(new b(k.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.k$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۰۸۶a implements View.OnClickListener {
            View$OnClickListenerC۰۰۸۶a(k kVar) {
            }

            public void onClick(View view) {
                Intent frmClientDetail = new Intent(k.this.f۲۹۹۴c, ClientDetailActivity.class);
                frmClientDetail.putExtra("id", ((c) k.this.f۲۹۹۵d.get(a.this.f())).d() + "");
                k.this.f۲۹۹۷f.b(frmClientDetail);
            }
        }

        class b implements View.OnClickListener {
            b(k kVar) {
            }

            public void onClick(View view) {
                u0 popup = new u0(k.this.f۲۹۹۴c, a.this.y);
                popup.b().inflate(R.menu.client_more_menu, popup.a());
                popup.a(new C۰۰۸۷a());
                popup.c();
            }

            /* renamed from: com.lawyer_smartCalendar.a.k$a$b$a  reason: collision with other inner class name */
            class C۰۰۸۷a implements u0.d {
                C۰۰۸۷a() {
                }

                @Override // android.support.v7.widget.u0.d
                public boolean onMenuItemClick(MenuItem item) {
                    int itemId = item.getItemId();
                    if (itemId != R.id.call) {
                        if (itemId != R.id.email) {
                            if (itemId != R.id.message) {
                                return true;
                            }
                            if (!((c) k.this.f۲۹۹۵d.get(a.this.f())).h().equals("")) {
                                k.this.f۲۹۹۴c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("sms:" + ((c) k.this.f۲۹۹۵d.get(a.this.f())).h())));
                                return true;
                            }
                            new h().a(k.this.f۲۹۹۴c, "warning", "شماره تلفن همراه ثبت نشده است.");
                            return true;
                        } else if (!((c) k.this.f۲۹۹۵d.get(a.this.f())).b().equals("")) {
                            Intent emailIntent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:" + ((c) k.this.f۲۹۹۵d.get(a.this.f())).b()));
                            Context context = k.this.f۲۹۹۴c;
                            context.startActivity(Intent.createChooser(emailIntent, "تماس با پست الکترونیک : " + ((c) k.this.f۲۹۹۵d.get(a.this.f())).f()));
                            return true;
                        } else {
                            new h().a(k.this.f۲۹۹۴c, "warning", "آدرس پست الکترونیک ثبت نشده است.");
                            return true;
                        }
                    } else if (((c) k.this.f۲۹۹۵d.get(a.this.f())).i().equals("real")) {
                        f.d dVar = new f.d(k.this.f۲۹۹۴c);
                        dVar.a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                        dVar.d(k.this.f۲۹۹۸g);
                        dVar.b(k.this.f۲۹۹۸g);
                        dVar.c(k.this.f۲۹۹۸g);
                        dVar.b(k.this.f۲۹۹۸g);
                        dVar.e("تماس با موکل");
                        dVar.a(R.array.client_call);
                        dVar.a(-1, new C۰۰۸۸a());
                        dVar.c();
                        return true;
                    } else if (!((c) k.this.f۲۹۹۵d.get(a.this.f())).e().equals("")) {
                        Intent intent2 = new Intent("android.intent.action.DIAL");
                        intent2.setData(Uri.parse("tel:" + ((c) k.this.f۲۹۹۵d.get(a.this.f())).e()));
                        k.this.f۲۹۹۴c.startActivity(intent2);
                        return true;
                    } else {
                        new h().a(k.this.f۲۹۹۴c, "warning", "شماره تلفن ثابت ثبت نشده است.");
                        return true;
                    }
                }

                /* renamed from: com.lawyer_smartCalendar.a.k$a$b$a$a  reason: collision with other inner class name */
                class C۰۰۸۸a implements f.j {
                    C۰۰۸۸a() {
                    }

                    @Override // b.a.a.f.j
                    public boolean a(b.a.a.f dialog, View view, int which, CharSequence text) {
                        if (which != 0) {
                            if (which == 1) {
                                if (!((c) k.this.f۲۹۹۵d.get(a.this.f())).e().equals("")) {
                                    Intent intent2 = new Intent("android.intent.action.DIAL");
                                    intent2.setData(Uri.parse("tel:" + ((c) k.this.f۲۹۹۵d.get(a.this.f())).e()));
                                    k.this.f۲۹۹۴c.startActivity(intent2);
                                } else {
                                    new h().a(k.this.f۲۹۹۴c, "warning", "شماره تلفن ثابت ثبت نشده است.");
                                }
                            }
                        } else if (!((c) k.this.f۲۹۹۵d.get(a.this.f())).h().equals("")) {
                            Intent intent = new Intent("android.intent.action.DIAL");
                            intent.setData(Uri.parse("tel:" + ((c) k.this.f۲۹۹۵d.get(a.this.f())).h()));
                            k.this.f۲۹۹۴c.startActivity(intent);
                        } else {
                            new h().a(k.this.f۲۹۹۴c, "warning", "شماره تلفن همراه ثبت نشده است.");
                        }
                        return true;
                    }
                }
            }
        }
    }

    public k(Context Activity, b fragmentTab2, List<c> list) {
        a(true);
        this.f۲۹۹۴c = Activity;
        this.f۲۹۹۵d = list;
        this.f۲۹۹۷f = fragmentTab2;
        this.f۲۹۹۶e = new com.lawyer_smartCalendar.utils.f(this.f۲۹۹۴c);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            this.f۲۹۹۸g = e.END;
        } else {
            this.f۲۹۹۸g = e.START;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(parent.getContext()).inflate(R.layout.client_list_item, parent, false));
    }

    /* renamed from: a */
    public void b(a holder, int pos) {
        holder.v.setText(this.f۲۹۹۵d.get(pos).f());
        char[] character = this.f۲۹۹۵d.get(pos).f().toCharArray();
        TextView textView = holder.x;
        textView.setText(character[0] + "");
        holder.v.setTypeface(this.f۲۹۹۶e.a());
        holder.x.setTypeface(this.f۲۹۹۶e.b());
        if (this.f۲۹۹۵d.get(pos).i().equals("real")) {
            if (!this.f۲۹۹۵d.get(pos).h().equals("")) {
                holder.w.setText(this.f۲۹۹۵d.get(pos).h());
            } else {
                holder.w.setText("-");
            }
        } else if (!this.f۲۹۹۵d.get(pos).e().equals("")) {
            holder.w.setText(this.f۲۹۹۵d.get(pos).e());
        } else {
            holder.w.setText("-");
        }
        holder.w.setTypeface(this.f۲۹۹۶e.a());
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۲۹۹۵d.size();
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
