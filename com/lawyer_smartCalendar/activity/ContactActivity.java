package com.lawyer_smartCalendar.activity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.utils.Cc;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class ContactActivity extends ActivityCe implements View.OnClickListener {
    public RelativeLayout contact_gmail;
    public RelativeLayout contact_instagram;
    public RelativeLayout contact_telegram;

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            overridePendingTransition(17432576, 17432577);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onCreate(Bundle savedInstanceState) {
        setTheme(Cc.m۱۷۷۳۹b());
        super.onCreate(savedInstanceState);
        overridePendingTransition(17432576, 17432577);
        setContentView(R.layout.activity_contact);
        ButterKnife.m۱۶۵۸۶a(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.m۱۴۹۳۱a(0, 0);
        m۱۳۴۸۱a(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_forward_white_24dp);
        toolbar.setNavigationOnClickListener(new View$OnClickListenerCa());
        this.contact_gmail.setOnClickListener(this);
        this.contact_instagram.setOnClickListener(this);
        this.contact_telegram.setOnClickListener(this);
    }

    /* renamed from: com.lawyer_smartCalendar.activity.ContactActivity$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {
        View$OnClickListenerCa() {
        }

        public void onClick(View view) {
            ContactActivity.this.finish();
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.contact_gmail /*{ENCODED_INT: 2131296389}*/:
                startActivity(Intent.createChooser(new Intent("android.intent.action.SENDTO", Uri.parse("mailto:info@eazarbar.org")), "تماس با پست الکترونیک"));
                return;
            case R.id.contact_instagram /*{ENCODED_INT: 2131296390}*/:
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://instagram.com/"));
                intent.setPackage("com.instagram.android");
                try {
                    startActivity(intent);
                    return;
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://instagram.com/")));
                    return;
                }
            case R.id.contact_telegram /*{ENCODED_INT: 2131296391}*/:
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://telegram.me/")));
                return;
            default:
                return;
        }
    }
}
