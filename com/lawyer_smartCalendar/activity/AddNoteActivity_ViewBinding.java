package com.lawyer_smartCalendar.activity;

import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.p۱۲۴a.Ca;
import com.lawyer_smartCalendar.R;
import com.rey.material.widget.Button;

public class AddNoteActivity_ViewBinding implements Unbinder {
    public AddNoteActivity_ViewBinding(AddNoteActivity target, View source) {
        target.TextInputLayout_client = (LinearLayout) Ca.m۱۶۵۹۲b(source, R.id.TextInputLayout_client, "field 'TextInputLayout_client'", LinearLayout.class);
        target.TextInputLayout_case = (LinearLayout) Ca.m۱۶۵۹۲b(source, R.id.TextInputLayout_case, "field 'TextInputLayout_case'", LinearLayout.class);
        target.input_note_title = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_note_title, "field 'input_note_title'", EditText.class);
        target.input_client_name = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_client_name, "field 'input_client_name'", EditText.class);
        target.input_case = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_case, "field 'input_case'", EditText.class);
        target.input_note_type = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_note_type, "field 'input_note_type'", EditText.class);
        target.input_note_date = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_note_date, "field 'input_note_date'", EditText.class);
        target.input_date_hour = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_date_hour, "field 'input_date_hour'", EditText.class);
        target.input_note_body = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_note_body, "field 'input_note_body'", EditText.class);
        target.btn_add_note = (Button) Ca.m۱۶۵۹۲b(source, R.id.btn_add_note, "field 'btn_add_note'", Button.class);
        target.btn_add_audio = (Button) Ca.m۱۶۵۹۲b(source, R.id.btn_add_audio, "field 'btn_add_audio'", Button.class);
        target.recyclerView = (RecyclerView) Ca.m۱۶۵۹۲b(source, R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    }
}
