package com.lawyer_smartCalendar.a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.u0;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b.a.a.f;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.AddCityBankAccountActivity;
import com.lawyer_smartCalendar.c.e;
import com.lawyer_smartCalendar.utils.i;
import java.util.List;
import java.util.Locale;

public class a extends RecyclerView.g<C۰۰۶۷a> {

    /* renamed from: c  reason: collision with root package name */
    public Context f۲۹۱۴c;

    /* renamed from: d  reason: collision with root package name */
    public List<com.lawyer_smartCalendar.d.a> f۲۹۱۵d;

    /* renamed from: e  reason: collision with root package name */
    public e f۲۹۱۶e;

    /* renamed from: f  reason: collision with root package name */
    private i f۲۹۱۷f;

    /* renamed from: g  reason: collision with root package name */
    private b.a.a.e f۲۹۱۸g = b.a.a.e.END;

    /* renamed from: com.lawyer_smartCalendar.a.a$a  reason: collision with other inner class name */
    public class C۰۰۶۷a extends RecyclerView.d0 {
        TextView A;
        ImageView B;
        TextView v;
        TextView w;
        TextView x;
        TextView y;
        TextView z;

        public C۰۰۶۷a(View convertView) {
            super(convertView);
            this.v = (TextView) convertView.findViewById(R.id.txt_city_title);
            this.w = (TextView) convertView.findViewById(R.id.txt_city_value);
            this.y = (TextView) convertView.findViewById(R.id.txt_number_type_title);
            this.x = (TextView) convertView.findViewById(R.id.txt_number_type_value);
            this.z = (TextView) convertView.findViewById(R.id.txt_number_title);
            this.A = (TextView) convertView.findViewById(R.id.txt_number_value);
            this.B = (ImageView) convertView.findViewById(R.id.img_more);
            this.B.setOnClickListener(new View$OnClickListenerC۰۰۶۸a(a.this));
        }

        /* renamed from: com.lawyer_smartCalendar.a.a$a$a  reason: collision with other inner class name */
        class View$OnClickListenerC۰۰۶۸a implements View.OnClickListener {
            View$OnClickListenerC۰۰۶۸a(a aVar) {
            }

            public void onClick(View view) {
                C۰۰۶۷a aVar = C۰۰۶۷a.this;
                u0 popup = new u0(a.this.f۲۹۱۴c, aVar.B);
                popup.b().inflate(R.menu.account_number_more_menu, popup.a());
                popup.a(new C۰۰۶۹a());
                popup.c();
            }

            /* renamed from: com.lawyer_smartCalendar.a.a$a$a$a  reason: collision with other inner class name */
            class C۰۰۶۹a implements u0.d {
                C۰۰۶۹a() {
                }

                @Override // android.support.v7.widget.u0.d
                public boolean onMenuItemClick(MenuItem item) {
                    int itemId = item.getItemId();
                    if (itemId == R.id.delete) {
                        f.d dVar = new f.d(a.this.f۲۹۱۴c);
                        dVar.a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                        dVar.d(a.this.f۲۹۱۸g);
                        dVar.b(a.this.f۲۹۱۸g);
                        dVar.a(a.this.f۲۹۱۸g);
                        dVar.j(R.color.colorPrimaryDark);
                        dVar.a("آیا برای حذف این مورد اطمینان دارید؟");
                        dVar.f(R.color.dialogCancelColor);
                        dVar.b(R.color.dialog_delete_color);
                        dVar.d("انصراف");
                        dVar.b("حذف");
                        dVar.c(new b(this));
                        dVar.a(new C۰۰۷۰a());
                        dVar.c();
                        return true;
                    } else if (itemId == R.id.edit) {
                        Intent frm_edit = new Intent(a.this.f۲۹۱۴c, AddCityBankAccountActivity.class);
                        StringBuilder sb = new StringBuilder();
                        C۰۰۶۷a aVar = C۰۰۶۷a.this;
                        sb.append(a.this.f۲۹۱۵d.get(aVar.f()).c());
                        sb.append("");
                        frm_edit.putExtra("id", sb.toString());
                        frm_edit.putExtra("frmMode", "edit");
                        a.this.f۲۹۱۶e.b(frm_edit);
                        return true;
                    } else if (itemId != R.id.share) {
                        return true;
                    } else {
                        a.this.f۲۹۱۷f.n();
                        i iVar = a.this.f۲۹۱۷f;
                        StringBuilder sb2 = new StringBuilder();
                        C۰۰۶۷a aVar2 = C۰۰۶۷a.this;
                        sb2.append(a.this.f۲۹۱۵d.get(aVar2.f()).b());
                        sb2.append("");
                        String cityName = iVar.l(sb2.toString());
                        i iVar2 = a.this.f۲۹۱۷f;
                        StringBuilder sb3 = new StringBuilder();
                        C۰۰۶۷a aVar3 = C۰۰۶۷a.this;
                        sb3.append(a.this.f۲۹۱۵d.get(aVar3.f()).a());
                        sb3.append("");
                        String accountNumberTitle = iVar2.i(sb3.toString());
                        a.this.f۲۹۱۷f.close();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(("" + "نوع شماره حساب : " + accountNumberTitle + "\n") + "داگستری شهرستان : " + cityName + "\n");
                        sb4.append("شماره حساب : ");
                        C۰۰۶۷a aVar4 = C۰۰۶۷a.this;
                        sb4.append(a.this.f۲۹۱۵d.get(aVar4.f()).d());
                        sb4.append("\n");
                        String shareVal = sb4.toString();
                        Intent shareIntent = new Intent();
                        shareIntent.setAction("android.intent.action.SEND");
                        shareIntent.setType("text/plain");
                        shareIntent.putExtra("android.intent.extra.TEXT", shareVal);
                        a.this.f۲۹۱۴c.startActivity(Intent.createChooser(shareIntent, "اشتراک گذاری شماره حساب"));
                        return true;
                    }
                }

                /* renamed from: com.lawyer_smartCalendar.a.a$a$a$a$b */
                class b implements f.m {
                    b(C۰۰۶۹a this$3) {
                    }

                    @Override // b.a.a.f.m
                    public void a(f dialog, b.a.a.b which) {
                        dialog.dismiss();
                    }
                }

                /* renamed from: com.lawyer_smartCalendar.a.a$a$a$a$a  reason: collision with other inner class name */
                class C۰۰۷۰a implements f.m {
                    C۰۰۷۰a() {
                    }

                    @Override // b.a.a.f.m
                    public void a(f dialog, b.a.a.b which) {
                        a.this.f۲۹۱۷f.n();
                        i iVar = a.this.f۲۹۱۷f;
                        StringBuilder sb = new StringBuilder();
                        C۰۰۶۷a aVar = C۰۰۶۷a.this;
                        sb.append(a.this.f۲۹۱۵d.get(aVar.f()).c());
                        sb.append("");
                        iVar.b(sb.toString());
                        a.this.f۲۹۱۷f.close();
                        a.this.f۲۹۱۶e.d0();
                    }
                }
            }
        }
    }

    public a(Context Activity, e fragmentTab1, List<com.lawyer_smartCalendar.d.a> list) {
        this.f۲۹۱۴c = Activity;
        this.f۲۹۱۵d = list;
        this.f۲۹۱۶e = fragmentTab1;
        new com.lawyer_smartCalendar.utils.f(this.f۲۹۱۴c);
        this.f۲۹۱۷f = new i(this.f۲۹۱۴c);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            this.f۲۹۱۸g = b.a.a.e.END;
        } else {
            this.f۲۹۱۸g = b.a.a.e.START;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public C۰۰۶۷a b(ViewGroup parent, int viewType) {
        return new C۰۰۶۷a(LayoutInflater.from(parent.getContext()).inflate(R.layout.account_number_list_item, parent, false));
    }

    /* renamed from: a */
    public void b(C۰۰۶۷a holder, int pos) {
        this.f۲۹۱۷f.n();
        i iVar = this.f۲۹۱۷f;
        String city_name = iVar.l(this.f۲۹۱۵d.get(pos).b() + "");
        i iVar2 = this.f۲۹۱۷f;
        String account_type = iVar2.i(this.f۲۹۱۵d.get(pos).a() + "");
        this.f۲۹۱۷f.close();
        holder.v.setTypeface(new com.lawyer_smartCalendar.utils.f(this.f۲۹۱۴c).b());
        holder.w.setTypeface(new com.lawyer_smartCalendar.utils.f(this.f۲۹۱۴c).a());
        holder.w.setText(city_name);
        holder.y.setTypeface(new com.lawyer_smartCalendar.utils.f(this.f۲۹۱۴c).b());
        holder.x.setTypeface(new com.lawyer_smartCalendar.utils.f(this.f۲۹۱۴c).a());
        holder.x.setText(account_type);
        holder.z.setTypeface(new com.lawyer_smartCalendar.utils.f(this.f۲۹۱۴c).b());
        holder.A.setTypeface(new com.lawyer_smartCalendar.utils.f(this.f۲۹۱۴c).a());
        holder.A.setText(this.f۲۹۱۵d.get(pos).d());
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return this.f۲۹۱۵d.size();
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
