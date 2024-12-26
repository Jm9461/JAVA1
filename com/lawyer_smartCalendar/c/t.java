package com.lawyer_smartCalendar.c;

import android.os.Bundle;
import android.support.v4.app.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.lawyer_smartCalendar.R;

public class t extends f implements View.OnClickListener {
    @Override // android.support.v4.app.f
    public View a(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.test, container, false);
    }

    @Override // android.support.v4.app.f
    public void a(View view, Bundle savedInstanceState) {
        super.a(view, savedInstanceState);
    }

    public void onClick(View view) {
        view.getId();
    }
}
