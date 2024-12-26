package com.lawyer_smartCalendar.c;

import android.os.Bundle;
import android.support.v4.app.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.ClientDetailActivity;
import com.lawyer_smartCalendar.d.c;
import com.lawyer_smartCalendar.utils.i;

public class k extends f implements View.OnClickListener {
    private TextView a0;
    private TextView b0;
    private TextView c0;
    private TextView d0;
    private TextView e0;
    private TextView f0;
    private TextView g0;
    private TextView h0;
    private TextView i0;
    private TextView j0;
    private TextView k0;
    private TextView l0;
    private TextView m0;
    private TextView n0;
    private TextView o0;
    private i p0;

    @Override // android.support.v4.app.f
    public View a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.client_detail_fragment, container, false);
    }

    @Override // android.support.v4.app.f
    public void a(View view, Bundle savedInstanceState) {
        super.a(view, savedInstanceState);
        this.p0 = new i(d());
        this.a0 = (TextView) view.findViewById(R.id.txt_title4);
        this.b0 = (TextView) view.findViewById(R.id.txt_title5);
        this.c0 = (TextView) view.findViewById(R.id.txt_title6);
        this.d0 = (TextView) view.findViewById(R.id.txt_title8);
        this.e0 = (TextView) view.findViewById(R.id.txt_title9);
        this.f0 = (TextView) view.findViewById(R.id.txt_title10);
        this.g0 = (TextView) view.findViewById(R.id.txt_title11);
        this.h0 = (TextView) view.findViewById(R.id.txt_title12);
        this.i0 = (TextView) view.findViewById(R.id.txt_value4);
        this.j0 = (TextView) view.findViewById(R.id.txt_value5);
        this.k0 = (TextView) view.findViewById(R.id.txt_value6);
        this.l0 = (TextView) view.findViewById(R.id.txt_value8);
        this.m0 = (TextView) view.findViewById(R.id.txt_value9);
        this.n0 = (TextView) view.findViewById(R.id.txt_value10);
        this.o0 = (TextView) view.findViewById(R.id.txt_value11);
        com.lawyer_smartCalendar.utils.f font = new com.lawyer_smartCalendar.utils.f(d());
        this.a0.setTypeface(font.b());
        this.b0.setTypeface(font.b());
        this.c0.setTypeface(font.b());
        this.d0.setTypeface(font.b());
        this.e0.setTypeface(font.b());
        this.f0.setTypeface(font.b());
        this.g0.setTypeface(font.b());
        this.h0.setTypeface(font.b());
        this.i0.setTypeface(font.a());
        this.j0.setTypeface(font.a());
        this.k0.setTypeface(font.a());
        this.l0.setTypeface(font.a());
        this.m0.setTypeface(font.a());
        this.n0.setTypeface(font.a());
        this.o0.setTypeface(font.a());
        this.p0.n();
        i iVar = this.p0;
        c client = iVar.o(((ClientDetailActivity) d()).s + "");
        this.p0.close();
        if (!client.f().equals("")) {
            this.i0.setText(client.f());
        }
        if (!client.c().equals("")) {
            this.j0.setText(client.c());
        }
        if (!client.g().equals("")) {
            this.k0.setText(client.g());
        }
        if (!client.h().equals("")) {
            this.l0.setText(client.h());
        }
        if (!client.e().equals("")) {
            this.m0.setText(client.e());
        }
        if (!client.b().equals("")) {
            this.n0.setText(client.b());
        }
        if (!client.a().equals("")) {
            this.o0.setText(client.a());
        }
        if (client.i().equals("legal")) {
            this.b0.setVisibility(8);
            this.c0.setVisibility(8);
            this.d0.setVisibility(8);
            this.j0.setVisibility(8);
            this.k0.setVisibility(8);
            this.l0.setVisibility(8);
            ((ViewGroup) ((ViewGroup) this.j0.getParent()).getParent()).removeView((ViewGroup) this.j0.getParent());
            ((ViewGroup) ((ViewGroup) this.k0.getParent()).getParent()).removeView((ViewGroup) this.k0.getParent());
            ((ViewGroup) ((ViewGroup) this.l0.getParent()).getParent()).removeView((ViewGroup) this.l0.getParent());
        }
    }

    public void onClick(View view) {
        view.getId();
    }
}
