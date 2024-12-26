package com.lawyer_smartCalendar.activity;

import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import butterknife.Unbinder;
import butterknife.p۱۲۴a.Ca;
import com.lawyer_smartCalendar.R;
import com.rey.material.widget.Button;

public class AddClientActivity_ViewBinding implements Unbinder {
    public AddClientActivity_ViewBinding(AddClientActivity target, View source) {
        target.input_client_name = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_client_name, "field 'input_client_name'", EditText.class);
        target.input_client_father_name = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_client_father_name, "field 'input_client_father_name'", EditText.class);
        target.input_client_national_code = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_client_national_code, "field 'input_client_national_code'", EditText.class);
        target.input_client_phone_number = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_client_phone_number, "field 'input_client_phone_number'", EditText.class);
        target.input_client_landline_phone = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_client_landline_phone, "field 'input_client_landline_phone'", EditText.class);
        target.input_client_email_address = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_client_email_address, "field 'input_client_email_address'", EditText.class);
        target.input_client_address = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_client_address, "field 'input_client_address'", EditText.class);
        target.btn_add_client = (Button) Ca.m۱۶۵۹۲b(source, R.id.btn_add_client, "field 'btn_add_client'", Button.class);
        target.radioButton_real = (RadioButton) Ca.m۱۶۵۹۲b(source, R.id.radioButton1, "field 'radioButton_real'", RadioButton.class);
        target.radioButton_legal = (RadioButton) Ca.m۱۶۵۹۲b(source, R.id.radioButton2, "field 'radioButton_legal'", RadioButton.class);
        target.input_layout_national_code = (TextInputLayout) Ca.m۱۶۵۹۲b(source, R.id.input_layout_national_code, "field 'input_layout_national_code'", TextInputLayout.class);
        target.input_layout_father_name = (TextInputLayout) Ca.m۱۶۵۹۲b(source, R.id.input_layout_father_name, "field 'input_layout_father_name'", TextInputLayout.class);
        target.input_layout_phone_number = (TextInputLayout) Ca.m۱۶۵۹۲b(source, R.id.input_layout_phone_number, "field 'input_layout_phone_number'", TextInputLayout.class);
        target.input_layout_client_name = (TextInputLayout) Ca.m۱۶۵۹۲b(source, R.id.input_layout_client_name, "field 'input_layout_client_name'", TextInputLayout.class);
    }
}
