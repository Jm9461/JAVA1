package com.lawyer_smartCalendar.activity;

import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.p۱۲۴a.Ca;
import com.lawyer_smartCalendar.R;
import com.rey.material.widget.Button;

public class AddCaseActivity_ViewBinding implements Unbinder {
    public AddCaseActivity_ViewBinding(AddCaseActivity target, View source) {
        target.input_case_title = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_case_title, "field 'input_case_title'", EditText.class);
        target.input_client_name = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_client_name, "field 'input_client_name'", EditText.class);
        target.input_case_issue = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_case_issue, "field 'input_case_issue'", EditText.class);
        target.input_court_type = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_court_type, "field 'input_court_type'", EditText.class);
        target.input_case_status = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_case_status, "field 'input_case_status'", EditText.class);
        target.input_case_date = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_case_date, "field 'input_case_date'", EditText.class);
        target.input_court_city = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_court_city, "field 'input_court_city'", EditText.class);
        target.input_court_branch = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_court_branch, "field 'input_court_branch'", EditText.class);
        target.input_archive_number = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_archive_number, "field 'input_archive_number'", EditText.class);
        target.input_attorney_letter_number = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_attorney_letter_number, "field 'input_attorney_letter_number'", EditText.class);
        target.input_lawsuit_info = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_lawsuit_info, "field 'input_lawsuit_info'", EditText.class);
        target.input_case_number = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_case_number, "field 'input_case_number'", EditText.class);
        target.input_case_process = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_case_process, "field 'input_case_process'", EditText.class);
        target.input_client_title_type = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_client_title_type, "field 'input_client_title_type'", EditText.class);
        target.btn_add_case = (Button) Ca.m۱۶۵۹۲b(source, R.id.btn_add_case, "field 'btn_add_case'", Button.class);
    }
}
