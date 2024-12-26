package com.lawyer_smartCalendar.activity;

import android.support.p۰۴۷v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.p۱۲۴a.Ca;
import com.lawyer_smartCalendar.R;
import com.rey.material.widget.Button;

public class AddCityBankAccountActivity_ViewBinding implements Unbinder {
    public AddCityBankAccountActivity_ViewBinding(AddCityBankAccountActivity target, View source) {
        target.input_select_city = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_select_city, "field 'input_select_city'", EditText.class);
        target.input_select_type = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_select_type, "field 'input_select_type'", EditText.class);
        target.input_account_number = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_account_number, "field 'input_account_number'", EditText.class);
        target.btn_add_account_number = (Button) Ca.m۱۶۵۹۲b(source, R.id.btn_add_account_number, "field 'btn_add_account_number'", Button.class);
        target.toolbar = (Toolbar) Ca.m۱۶۵۹۲b(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    }
}
