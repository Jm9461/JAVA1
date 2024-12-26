package com.lawyer_smartCalendar.activity;

import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.p۱۲۴a.Ca;
import com.lawyer_smartCalendar.R;
import com.rey.material.widget.Button;

public class AddProceedingsTimesActivity_ViewBinding implements Unbinder {
    public AddProceedingsTimesActivity_ViewBinding(AddProceedingsTimesActivity target, View source) {
        target.input_client_name = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_client_name, "field 'input_client_name'", EditText.class);
        target.input_case = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_case, "field 'input_case'", EditText.class);
        target.input_subject = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_subject, "field 'input_subject'", EditText.class);
        target.input_result = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_result, "field 'input_result'", EditText.class);
        target.input_date = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_date, "field 'input_date'", EditText.class);
        target.input_date_hour = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_date_hour, "field 'input_date_hour'", EditText.class);
        target.input_reminder = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_reminder, "field 'input_reminder'", EditText.class);
        target.input_reminder_count = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_reminder_count, "field 'input_reminder_count'", EditText.class);
        target.btn_add_time = (Button) Ca.m۱۶۵۹۲b(source, R.id.btn_add_time, "field 'btn_add_time'", Button.class);
    }
}
