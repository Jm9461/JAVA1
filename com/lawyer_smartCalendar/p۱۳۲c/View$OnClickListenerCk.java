package com.lawyer_smartCalendar.p۱۳۲c;

import android.os.Bundle;
import android.support.p۰۴۳v4.app.ComponentCallbacksCf;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.activity.ClientDetailActivity;
import com.lawyer_smartCalendar.p۱۳۳d.Cc;
import com.lawyer_smartCalendar.utils.Cf;
import com.lawyer_smartCalendar.utils.Ci;

/* renamed from: com.lawyer_smartCalendar.c.k  reason: invalid class name */
public class View$OnClickListenerCk extends ComponentCallbacksCf implements View.OnClickListener {

    /* renamed from: a0  reason: contains not printable characters */
    private TextView f۱۴۵۸۶a0;

    /* renamed from: b0  reason: contains not printable characters */
    private TextView f۱۴۵۸۷b0;

    /* renamed from: c0  reason: contains not printable characters */
    private TextView f۱۴۵۸۸c0;

    /* renamed from: d0  reason: contains not printable characters */
    private TextView f۱۴۵۸۹d0;

    /* renamed from: e0  reason: contains not printable characters */
    private TextView f۱۴۵۹۰e0;

    /* renamed from: f0  reason: contains not printable characters */
    private TextView f۱۴۵۹۱f0;

    /* renamed from: g0  reason: contains not printable characters */
    private TextView f۱۴۵۹۲g0;

    /* renamed from: h0  reason: contains not printable characters */
    private TextView f۱۴۵۹۳h0;

    /* renamed from: i0  reason: contains not printable characters */
    private TextView f۱۴۵۹۴i0;

    /* renamed from: j0  reason: contains not printable characters */
    private TextView f۱۴۵۹۵j0;

    /* renamed from: k0  reason: contains not printable characters */
    private TextView f۱۴۵۹۶k0;

    /* renamed from: l0  reason: contains not printable characters */
    private TextView f۱۴۵۹۷l0;

    /* renamed from: m0  reason: contains not printable characters */
    private TextView f۱۴۵۹۸m0;

    /* renamed from: n0  reason: contains not printable characters */
    private TextView f۱۴۵۹۹n0;

    /* renamed from: o0  reason: contains not printable characters */
    private TextView f۱۴۶۰۰o0;

    /* renamed from: p0  reason: contains not printable characters */
    private Ci f۱۴۶۰۱p0;

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۷۵۴۲a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.client_detail_fragment, container, false);
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۴۳a(View view, Bundle savedInstanceState) {
        super.m۱۲۱۷۶a(view, savedInstanceState);
        this.f۱۴۶۰۱p0 = new Ci(m۱۲۱۹۷d());
        this.f۱۴۵۸۶a0 = (TextView) view.findViewById(R.id.txt_title4);
        this.f۱۴۵۸۷b0 = (TextView) view.findViewById(R.id.txt_title5);
        this.f۱۴۵۸۸c0 = (TextView) view.findViewById(R.id.txt_title6);
        this.f۱۴۵۸۹d0 = (TextView) view.findViewById(R.id.txt_title8);
        this.f۱۴۵۹۰e0 = (TextView) view.findViewById(R.id.txt_title9);
        this.f۱۴۵۹۱f0 = (TextView) view.findViewById(R.id.txt_title10);
        this.f۱۴۵۹۲g0 = (TextView) view.findViewById(R.id.txt_title11);
        this.f۱۴۵۹۳h0 = (TextView) view.findViewById(R.id.txt_title12);
        this.f۱۴۵۹۴i0 = (TextView) view.findViewById(R.id.txt_value4);
        this.f۱۴۵۹۵j0 = (TextView) view.findViewById(R.id.txt_value5);
        this.f۱۴۵۹۶k0 = (TextView) view.findViewById(R.id.txt_value6);
        this.f۱۴۵۹۷l0 = (TextView) view.findViewById(R.id.txt_value8);
        this.f۱۴۵۹۸m0 = (TextView) view.findViewById(R.id.txt_value9);
        this.f۱۴۵۹۹n0 = (TextView) view.findViewById(R.id.txt_value10);
        this.f۱۴۶۰۰o0 = (TextView) view.findViewById(R.id.txt_value11);
        Cf font = new Cf(m۱۲۱۹۷d());
        this.f۱۴۵۸۶a0.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۵۸۷b0.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۵۸۸c0.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۵۸۹d0.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۵۹۰e0.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۵۹۱f0.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۵۹۲g0.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۵۹۳h0.setTypeface(font.m۱۷۷۴۸b());
        this.f۱۴۵۹۴i0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۵۹۵j0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۵۹۶k0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۵۹۷l0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۵۹۸m0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۵۹۹n0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۶۰۰o0.setTypeface(font.m۱۷۷۴۶a());
        this.f۱۴۶۰۱p0.m۱۷۸۱۱n();
        Ci iVar = this.f۱۴۶۰۱p0;
        Cc client = iVar.m۱۷۸۱۲o(((ClientDetailActivity) m۱۲۱۹۷d()).f۱۴۲۲۳s + "");
        this.f۱۴۶۰۱p0.close();
        if (!client.m۱۷۶۴۴f().equals("")) {
            this.f۱۴۵۹۴i0.setText(client.m۱۷۶۴۴f());
        }
        if (!client.m۱۷۶۳۸c().equals("")) {
            this.f۱۴۵۹۵j0.setText(client.m۱۷۶۳۸c());
        }
        if (!client.m۱۷۶۴۶g().equals("")) {
            this.f۱۴۵۹۶k0.setText(client.m۱۷۶۴۶g());
        }
        if (!client.m۱۷۶۴۸h().equals("")) {
            this.f۱۴۵۹۷l0.setText(client.m۱۷۶۴۸h());
        }
        if (!client.m۱۷۶۴۲e().equals("")) {
            this.f۱۴۵۹۸m0.setText(client.m۱۷۶۴۲e());
        }
        if (!client.m۱۷۶۳۶b().equals("")) {
            this.f۱۴۵۹۹n0.setText(client.m۱۷۶۳۶b());
        }
        if (!client.m۱۷۶۳۳a().equals("")) {
            this.f۱۴۶۰۰o0.setText(client.m۱۷۶۳۳a());
        }
        if (client.m۱۷۶۵۰i().equals("legal")) {
            this.f۱۴۵۸۷b0.setVisibility(8);
            this.f۱۴۵۸۸c0.setVisibility(8);
            this.f۱۴۵۸۹d0.setVisibility(8);
            this.f۱۴۵۹۵j0.setVisibility(8);
            this.f۱۴۵۹۶k0.setVisibility(8);
            this.f۱۴۵۹۷l0.setVisibility(8);
            ((ViewGroup) ((ViewGroup) this.f۱۴۵۹۵j0.getParent()).getParent()).removeView((ViewGroup) this.f۱۴۵۹۵j0.getParent());
            ((ViewGroup) ((ViewGroup) this.f۱۴۵۹۶k0.getParent()).getParent()).removeView((ViewGroup) this.f۱۴۵۹۶k0.getParent());
            ((ViewGroup) ((ViewGroup) this.f۱۴۵۹۷l0.getParent()).getParent()).removeView((ViewGroup) this.f۱۴۵۹۷l0.getParent());
        }
    }

    public void onClick(View view) {
        view.getId();
    }
}
