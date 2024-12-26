package com.lawyer_smartCalendar.activity;

import android.view.View;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.p۱۲۴a.Ca;
import com.lawyer_smartCalendar.R;

public class ContactActivity_ViewBinding implements Unbinder {
    public ContactActivity_ViewBinding(ContactActivity target, View source) {
        target.contact_gmail = (RelativeLayout) Ca.m۱۶۵۹۲b(source, R.id.contact_gmail, "field 'contact_gmail'", RelativeLayout.class);
        target.contact_instagram = (RelativeLayout) Ca.m۱۶۵۹۲b(source, R.id.contact_instagram, "field 'contact_instagram'", RelativeLayout.class);
        target.contact_telegram = (RelativeLayout) Ca.m۱۶۵۹۲b(source, R.id.contact_telegram, "field 'contact_telegram'", RelativeLayout.class);
    }
}
