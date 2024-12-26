package com.lawyer_smartCalendar.activity;

import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import butterknife.Unbinder;
import butterknife.p۱۲۴a.Ca;
import com.lawyer_smartCalendar.R;
import com.rey.material.widget.Button;

public class FirstProfileActivity_ViewBinding implements Unbinder {
    public FirstProfileActivity_ViewBinding(FirstProfileActivity target, View source) {
        target.editText_name = (EditText) Ca.m۱۶۵۹۲b(source, R.id.editText_name, "field 'editText_name'", EditText.class);
        target.editText_phone = (EditText) Ca.m۱۶۵۹۲b(source, R.id.editText_phone, "field 'editText_phone'", EditText.class);
        target.editText_landline_phone = (EditText) Ca.m۱۶۵۹۲b(source, R.id.editText_landline_phone, "field 'editText_landline_phone'", EditText.class);
        target.editText_email = (EditText) Ca.m۱۶۵۹۲b(source, R.id.editText_email, "field 'editText_email'", EditText.class);
        target.editText_address = (EditText) Ca.m۱۶۵۹۲b(source, R.id.editText_address, "field 'editText_address'", EditText.class);
        target.img_add_avatar = (FloatingActionButton) Ca.m۱۶۵۹۲b(source, R.id.img_add_avatar, "field 'img_add_avatar'", FloatingActionButton.class);
        target.radio_lagalBase_one = (RadioButton) Ca.m۱۶۵۹۲b(source, R.id.radioButton1, "field 'radio_lagalBase_one'", RadioButton.class);
        target.radio_lagalBase_two = (RadioButton) Ca.m۱۶۵۹۲b(source, R.id.radioButton2, "field 'radio_lagalBase_two'", RadioButton.class);
        target.btn_edit_profile = (Button) Ca.m۱۶۵۹۲b(source, R.id.btn_edit_profile, "field 'btn_edit_profile'", Button.class);
        target.img_lawyer_pic = (ImageView) Ca.m۱۶۵۹۲b(source, R.id.img_lawyer_pic, "field 'img_lawyer_pic'", ImageView.class);
    }
}
