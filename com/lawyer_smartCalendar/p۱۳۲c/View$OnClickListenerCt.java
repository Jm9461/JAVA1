package com.lawyer_smartCalendar.p۱۳۲c;

import android.os.Bundle;
import android.support.p۰۴۳v4.app.ComponentCallbacksCf;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.lawyer_smartCalendar.R;

/* renamed from: com.lawyer_smartCalendar.c.t  reason: invalid class name */
public class View$OnClickListenerCt extends ComponentCallbacksCf implements View.OnClickListener {
    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۷۵۷۸a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.test, container, false);
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۵۷۹a(View view, Bundle savedInstanceState) {
        super.m۱۲۱۷۶a(view, savedInstanceState);
    }

    public void onClick(View view) {
        view.getId();
    }
}
