package com.lawyer_smartCalendar.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import butterknife.ButterKnife;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.utils.Ch;
import com.rey.material.widget.Button;
import com.squareup.picasso.Ct;
import com.squareup.picasso.Cx;
import java.io.File;
import java.util.Locale;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;
import p۱۵۱h.p۱۵۲a.p۱۵۳a.Ca;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class ProfileActivity extends ActivityCe implements View.OnClickListener {
    Button btn_edit_profile;
    EditText editText_address;
    EditText editText_email;
    EditText editText_landline_phone;
    EditText editText_name;
    EditText editText_phone;
    FloatingActionButton img_add_avatar;
    ImageView img_lawyer_pic;

    /* renamed from: r  reason: contains not printable characters */
    private Uri f۱۴۴۵۱r;
    RadioButton radio_lagalBase_one;
    RadioButton radio_lagalBase_two;

    /* renamed from: s  reason: contains not printable characters */
    private EnumCe f۱۴۴۵۲s = EnumCe.END;

    public boolean onOptionsItemSelected(MenuItem item) {
        String shareVal;
        if (item.getItemId() != R.id.action_share) {
            return super.onOptionsItemSelected(item);
        }
        if (p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۱a("Profile_legal_base", 1) == 1) {
            shareVal = "" + "وکیل پایه یک دادگستری\n";
        } else {
            shareVal = "" + "کارآموز وکالت دو دادگستری\n";
        }
        Intent shareIntent = new Intent();
        shareIntent.setAction("android.intent.action.SEND");
        shareIntent.setType("text/plain");
        shareIntent.putExtra("android.intent.extra.TEXT", ((((shareVal + "نام و نام خانوادگی : " + p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۳a("Profile_name", "") + "\n") + "تلفن همراه : " + p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۳a("Profile_phone", "") + "\n") + "تلفن ثابت : " + p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۳a("Profile_landline_phone", "") + "\n") + "آدرس پست الکترونیک : " + p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۳a("Profile_address", "") + "\n") + "آدرس : " + p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۳a("Profile_email", "") + "\n");
        startActivity(Intent.createChooser(shareIntent, "اشتراک گذاری اطلاعات وکیل"));
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.share_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override // android.support.p۰۴۳v4.app.Ca.AbstractCb, android.support.p۰۴۳v4.app.ActivityCg
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        p۰۵۲b.p۰۶۲c.p۰۶۳a.Ca.m۱۵۹۱۷a().m۱۵۹۲۰a(permissions, grantResults);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        p۱۵۱h.p۱۵۲a.p۱۵۳a.Ca.m۱۹۶۲۰a(requestCode, resultCode, data, this, new Ca());
    }

    /* renamed from: com.lawyer_smartCalendar.activity.ProfileActivity$a  reason: invalid class name */
    class Ca implements Ca.AbstractCb {
        Ca() {
        }

        @Override // p۱۵۱h.p۱۵۲a.p۱۵۳a.Ca.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۵۶a(Exception e, Ca.EnumCd source, int type) {
            e.printStackTrace();
        }

        @Override // p۱۵۱h.p۱۵۲a.p۱۵۳a.Ca.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۵۵a(File imageFile, Ca.EnumCd source, int type) {
            ProfileActivity.this.f۱۴۴۵۱r = Uri.parse(imageFile.getPath());
            Cx a = Ct.m۱۸۳۹۵b().m۱۸۳۹۹a(imageFile);
            a.m۱۸۴۳۸c();
            a.m۱۸۴۳۳a();
            a.m۱۸۴۳۵a(ProfileActivity.this.img_lawyer_pic);
        }

        @Override // p۱۵۱h.p۱۵۲a.p۱۵۳a.Ca.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۵۴a(Ca.EnumCd source, int type) {
            File photoFile;
            if ((source == Ca.EnumCd.CAMERA || source == Ca.EnumCd.GALLERY) && (photoFile = p۱۵۱h.p۱۵۲a.p۱۵۳a.Ca.m۱۹۶۳۳d(ProfileActivity.this)) != null) {
                photoFile.delete();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onCreate(Bundle savedInstanceState) {
        setTheme(com.lawyer_smartCalendar.utils.Cc.m۱۷۷۳۹b());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.m۱۶۵۸۶a(this);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            this.f۱۴۴۵۲s = EnumCe.END;
        } else {
            this.f۱۴۴۵۲s = EnumCe.START;
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.m۱۴۹۳۱a(0, 0);
        m۱۳۴۸۱a(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_forward_white_24dp);
        toolbar.setNavigationOnClickListener(new View$OnClickListenerCb());
        this.btn_edit_profile.setOnClickListener(this);
        this.btn_edit_profile.setBackgroundColor(Color.parseColor(com.lawyer_smartCalendar.utils.Cc.m۱۷۷۴۱d()));
        this.img_add_avatar.setOnClickListener(this);
        this.radio_lagalBase_one.setOnCheckedChangeListener(new Cc());
        this.radio_lagalBase_two.setOnCheckedChangeListener(new Cd());
        this.editText_name.setText(p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۳a("Profile_name", ""));
        this.editText_phone.setText(p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۳a("Profile_phone", ""));
        this.editText_landline_phone.setText(p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۳a("Profile_landline_phone", ""));
        this.editText_address.setText(p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۳a("Profile_address", ""));
        this.editText_email.setText(p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۳a("Profile_email", ""));
        if (p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۱a("Profile_legal_base", 1) == 1) {
            this.radio_lagalBase_one.setChecked(true);
        } else {
            this.radio_lagalBase_two.setChecked(true);
        }
        String profileImageAddress = p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۳a("Profile_image", "");
        if (!profileImageAddress.equals("")) {
            Cx a = Ct.m۱۸۳۹۵b().m۱۸۳۹۹a(new File(profileImageAddress));
            a.m۱۸۴۳۸c();
            a.m۱۸۴۳۳a();
            a.m۱۸۴۳۵a(this.img_lawyer_pic);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.ProfileActivity$b  reason: invalid class name */
    class View$OnClickListenerCb implements View.OnClickListener {
        View$OnClickListenerCb() {
        }

        public void onClick(View view) {
            ProfileActivity.this.finish();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.ProfileActivity$c  reason: invalid class name */
    class Cc implements CompoundButton.OnCheckedChangeListener {
        Cc() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean value) {
            if (value) {
                ProfileActivity.this.radio_lagalBase_two.setChecked(false);
            } else {
                ProfileActivity.this.radio_lagalBase_two.setChecked(true);
            }
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.ProfileActivity$d  reason: invalid class name */
    class Cd implements CompoundButton.OnCheckedChangeListener {
        Cd() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean value) {
            if (value) {
                ProfileActivity.this.radio_lagalBase_one.setChecked(false);
            } else {
                ProfileActivity.this.radio_lagalBase_one.setChecked(true);
            }
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.btn_edit_profile) {
            if (id == R.id.img_add_avatar) {
                View$OnClickListenerCf.Cd dVar = new View$OnClickListenerCf.Cd(this);
                dVar.m۱۵۸۵۱a("IRANSansMobile.ttf", "IRANSansMobile.ttf");
                dVar.m۱۵۸۶۸d(this.f۱۴۴۵۲s);
                dVar.m۱۵۸۵۸b(this.f۱۴۴۵۲s);
                dVar.m۱۵۸۶۳c(this.f۱۴۴۵۲s);
                dVar.m۱۵۸۵۸b(this.f۱۴۴۵۲s);
                dVar.m۱۵۸۷۱e("انتخاب تصویر");
                dVar.m۱۵۸۴۱a(R.array.select_image_items);
                dVar.m۱۵۸۴۲a(-1, new Ce());
                dVar.m۱۵۸۶۶c();
            }
        } else if (this.editText_name.getText().toString().equals("")) {
            new Ch().m۱۷۷۵۳a(this, "error", "نام و نام خانوادگی نمی تواند خالی باشد.");
        } else if (this.editText_phone.getText().toString().equals("") || this.editText_phone.getText().toString().length() >= 11) {
            Uri uri = this.f۱۴۴۵۱r;
            if (uri != null) {
                p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۸b("Profile_image", uri.toString());
            }
            p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۸b("Profile_name", this.editText_name.getText().toString());
            if (this.radio_lagalBase_one.isChecked()) {
                p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۷b("Profile_legal_base", 1);
            } else {
                p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۷b("Profile_legal_base", 2);
            }
            p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۸b("Profile_phone", this.editText_phone.getText().toString());
            p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۸b("Profile_landline_phone", this.editText_landline_phone.getEditableText().toString());
            p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۸b("Profile_address", this.editText_address.getEditableText().toString());
            p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۸b("Profile_email", this.editText_email.getEditableText().toString());
            p۰۵۲b.p۱۰۸i.p۱۰۹a.p۱۱۰a.Ca.m۱۶۴۱۹b("Profile_has_info", true);
            new Ch().m۱۷۷۵۳a(this, "success", "با موفقیت ویرایش شد.");
            com.lawyer_smartCalendar.utils.Ce.f۱۴۷۸۲a.m۱۷۴۳۳m();
            finish();
        } else {
            new Ch().m۱۷۷۵۳a(this, "error", "شماره تلفن باید 11 رقمی باشد.");
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.ProfileActivity$e  reason: invalid class name */
    class Ce implements View$OnClickListenerCf.AbstractCj {
        Ce() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۷۴۵۷a(View$OnClickListenerCf dialog, View view, int which, CharSequence text) {
            if (which == 0) {
                p۱۵۱h.p۱۵۲a.p۱۵۳a.Ca.m۱۹۶۲۹b((Activity) ProfileActivity.this, 0);
            } else if (which == 1) {
                p۱۵۱h.p۱۵۲a.p۱۵۳a.Ca.m۱۹۶۲۱a((Activity) ProfileActivity.this, 0);
            }
            return true;
        }
    }
}