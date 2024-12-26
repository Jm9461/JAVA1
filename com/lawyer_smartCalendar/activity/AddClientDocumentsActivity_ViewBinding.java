package com.lawyer_smartCalendar.activity;

import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.p۱۲۴a.Ca;
import com.lawyer_smartCalendar.R;
import com.rey.material.widget.Button;

public class AddClientDocumentsActivity_ViewBinding implements Unbinder {
    public AddClientDocumentsActivity_ViewBinding(AddClientDocumentsActivity target, View source) {
        target.input_client_name = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_client_name, "field 'input_client_name'", EditText.class);
        target.input_case = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_case, "field 'input_case'", EditText.class);
        target.input_document_type = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_document_type, "field 'input_document_type'", EditText.class);
        target.input_date_received = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_date_received, "field 'input_date_received'", EditText.class);
        target.input_date_delivered = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_date_delivered, "field 'input_date_delivered'", EditText.class);
        target.input_document_note = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_document_note, "field 'input_document_note'", EditText.class);
        target.img_clear_date = (ImageView) Ca.m۱۶۵۹۲b(source, R.id.img_clear_date, "field 'img_clear_date'", ImageView.class);
        target.btn_add_document = (Button) Ca.m۱۶۵۹۲b(source, R.id.btn_add_document, "field 'btn_add_document'", Button.class);
        target.btn_add_image = (Button) Ca.m۱۶۵۹۲b(source, R.id.btn_add_image, "field 'btn_add_image'", Button.class);
        target.recyclerView = (RecyclerView) Ca.m۱۶۵۹۲b(source, R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    }
}
