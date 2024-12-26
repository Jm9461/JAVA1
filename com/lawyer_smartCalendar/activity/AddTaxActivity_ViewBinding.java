package com.lawyer_smartCalendar.activity;

import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.p۱۲۴a.Ca;
import com.lawyer_smartCalendar.R;
import com.rey.material.widget.Button;

public class AddTaxActivity_ViewBinding implements Unbinder {
    public AddTaxActivity_ViewBinding(AddTaxActivity target, View source) {
        target.input_year = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_year, "field 'input_year'", EditText.class);
        target.input_Income = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_Income, "field 'input_Income'", EditText.class);
        target.input_tax = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_tax, "field 'input_tax'", EditText.class);
        target.input_net_income = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_net_income, "field 'input_net_income'", EditText.class);
        target.input_comment = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_comment, "field 'input_comment'", EditText.class);
        target.btn_add_tax = (Button) Ca.m۱۶۵۹۲b(source, R.id.btn_add_tax, "field 'btn_add_tax'", Button.class);
    }
}
