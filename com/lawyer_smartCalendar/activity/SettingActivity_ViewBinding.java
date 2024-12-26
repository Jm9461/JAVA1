package com.lawyer_smartCalendar.activity;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p۱۲۴a.Ca;
import com.lawyer_smartCalendar.R;
import com.rey.material.widget.Button;

public class SettingActivity_ViewBinding implements Unbinder {
    public SettingActivity_ViewBinding(SettingActivity target, View source) {
        target.btn_change_color = (Button) Ca.m۱۶۵۹۲b(source, R.id.btn_change_color, "field 'btn_change_color'", Button.class);
        target.btn_backup = (Button) Ca.m۱۶۵۹۲b(source, R.id.btn_backup, "field 'btn_backup'", Button.class);
        target.btn_restore = (Button) Ca.m۱۶۵۹۲b(source, R.id.btn_restore, "field 'btn_restore'", Button.class);
    }
}
