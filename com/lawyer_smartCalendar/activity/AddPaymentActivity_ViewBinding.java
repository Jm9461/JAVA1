package com.lawyer_smartCalendar.activity;

import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import butterknife.Unbinder;
import butterknife.p۱۲۴a.Ca;
import com.lawyer_smartCalendar.R;
import com.rey.material.widget.Button;

public class AddPaymentActivity_ViewBinding implements Unbinder {
    public AddPaymentActivity_ViewBinding(AddPaymentActivity target, View source) {
        target.input_date = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_date, "field 'input_date'", EditText.class);
        target.input_client_name = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_client_name, "field 'input_client_name'", EditText.class);
        target.input_case = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_case, "field 'input_case'", EditText.class);
        target.input_pay_type = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_pay_type, "field 'input_pay_type'", EditText.class);
        target.input_honorariumTotal = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_honorariumTotal, "field 'input_honorariumTotal'", EditText.class);
        target.input_detail = (EditText) Ca.m۱۶۵۹۲b(source, R.id.input_detail, "field 'input_detail'", EditText.class);
        target.btn_add_installment = (Button) Ca.m۱۶۵۹۲b(source, R.id.btn_add_installment, "field 'btn_add_installment'", Button.class);
        target.layout_ScrollView = (ScrollView) Ca.m۱۶۵۹۲b(source, R.id.layout_ScrollView, "field 'layout_ScrollView'", ScrollView.class);
        target.btn_add_honorarium = (Button) Ca.m۱۶۵۹۲b(source, R.id.btn_add_honorarium, "field 'btn_add_honorarium'", Button.class);
        target.recyclerView = (RecyclerView) Ca.m۱۶۵۹۲b(source, R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    }
}
