package com.lawyer_smartCalendar.utils;

import android.app.Application;
import com.lawyer_smartCalendar.R;
import p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyConfig;

public class CustomApplication extends Application {
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder().setDefaultFontPath("fonts/IRANSansMobile_Light.ttf").setFontAttrId(R.attr.fontPath).build());
        Ca.Ca aVar = new Ca.Ca();
        aVar.m۱۶۴۲۱a(this);
        aVar.m۱۶۴۲۰a(0);
        aVar.m۱۶۴۲۲a(getPackageName());
        aVar.m۱۶۴۲۳a(true);
        aVar.m۱۶۴۲۴a();
    }
}
