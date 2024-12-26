package com.devs.acr;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class ErrorReporterActivity extends Activity implements View.OnClickListener {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(Cc.activity_erroe_reporter);
        if (Build.VERSION.SDK_INT >= 11) {
            setFinishOnTouchOutside(false);
        }
        Window window = getWindow();
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setLayout(-1, -2);
        m۱۶۸۶۲a();
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۸۶۲a() {
        ((TextView) findViewById(Cb.tv_cancel)).setOnClickListener(this);
        ((TextView) findViewById(Cb.tv_report)).setOnClickListener(this);
    }

    public void onClick(View v) {
        int i = v.getId();
        if (i == Cb.tv_cancel) {
            finish();
        } else if (i == Cb.tv_report) {
            Ca.m۱۶۸۶۳a(getApplication()).m۱۶۸۷۴a(this);
            finish();
        }
    }
}
