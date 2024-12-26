package com.lawyer_smartCalendar.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.widget.ArrayAdapter;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.utils.Cc;
import com.rey.material.widget.Spinner;
import java.util.ArrayList;
import java.util.List;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class SuportActivity extends ActivityCe {
    /* access modifiers changed from: protected */
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onCreate(Bundle savedInstanceState) {
        setTheme(Cc.m۱۷۷۳۹b());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suport);
        List<String> myArraySpinner = new ArrayList<>();
        myArraySpinner.add("گزارش خطا");
        myArraySpinner.add("انتقاد");
        myArraySpinner.add("پیشنهاد");
        myArraySpinner.add("نظر");
        myArraySpinner.add("سایر");
        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<>(this, 17367048, myArraySpinner);
        spinnerArrayAdapter.setDropDownViewResource(17367049);
        ((Spinner) findViewById(R.id.spinner_label)).setAdapter(spinnerArrayAdapter);
    }
}
