package com.lawyer_smartCalendar.activity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.DialogCe;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import butterknife.ButterKnife;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.p۱۳۳d.Cj;
import com.lawyer_smartCalendar.utils.Ch;
import com.lawyer_smartCalendar.utils.Ci;
import com.rey.material.widget.Button;
import com.rey.material.widget.ImageView;
import com.shawnlin.numberpicker.NumberPicker;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class AddTaxActivity extends ActivityCe implements View.OnClickListener, View.OnFocusChangeListener {
    public Button btn_add_tax;
    public EditText input_Income;
    public EditText input_comment;
    public EditText input_net_income;
    public EditText input_tax;
    public EditText input_year;

    /* renamed from: r  reason: contains not printable characters */
    private String f۱۴۲۰۵r = "";

    /* renamed from: s  reason: contains not printable characters */
    private String f۱۴۲۰۶s = "add";

    /* renamed from: t  reason: contains not printable characters */
    private Ci f۱۴۲۰۷t;

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            overridePendingTransition(17432576, 17432577);
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_add) {
            this.btn_add_tax.callOnClick();
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_add_edit, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onCreate(Bundle savedInstanceState) {
        setTheme(com.lawyer_smartCalendar.utils.Cc.m۱۷۷۳۹b());
        super.onCreate(savedInstanceState);
        overridePendingTransition(17432576, 17432577);
        setContentView(R.layout.activity_add_tax);
        ButterKnife.m۱۶۵۸۶a(this);
        this.f۱۴۲۰۷t = new Ci(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.m۱۴۹۳۱a(0, 0);
        m۱۳۴۸۱a(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_action_close);
        toolbar.setNavigationOnClickListener(new View$OnClickListenerCa());
        this.btn_add_tax.setOnClickListener(this);
        this.btn_add_tax.setVisibility(8);
        this.input_year.setOnClickListener(this);
        this.input_year.setOnFocusChangeListener(this);
        this.input_Income.addTextChangedListener(new Cb());
        this.input_tax.addTextChangedListener(new Cc());
        this.f۱۴۲۰۵r = getIntent().getStringExtra("id");
        this.f۱۴۲۰۶s = getIntent().getStringExtra("frmMode");
        if (this.f۱۴۲۰۶s.equals("edit")) {
            this.f۱۴۲۰۷t.m۱۷۸۱۱n();
            Cj tax = this.f۱۴۲۰۷t.m۱۷۷۵۶C(this.f۱۴۲۰۵r);
            this.f۱۴۲۰۷t.close();
            m۱۳۴۸۹j().m۱۳۴۱۴a("ویرایش مالیات");
            EditText editText = this.input_year;
            editText.setText(tax.m۱۷۷۳۷f() + "");
            this.input_year.setTextColor(Color.parseColor("#E65100"));
            EditText editText2 = this.input_Income;
            editText2.setText(tax.m۱۷۷۳۰b() + "");
            EditText editText3 = this.input_tax;
            editText3.setText(tax.m۱۷۷۳۳c() + "");
            EditText editText4 = this.input_net_income;
            editText4.setText(tax.m۱۷۷۳۶e() + "");
            this.input_comment.setText(tax.m۱۷۷۳۵d());
            this.input_year.setEnabled(false);
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddTaxActivity$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {
        View$OnClickListenerCa() {
        }

        public void onClick(View view) {
            AddTaxActivity.this.finish();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddTaxActivity$b  reason: invalid class name */
    class Cb implements TextWatcher {
        Cb() {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        public void afterTextChanged(Editable editable) {
            if (!AddTaxActivity.this.input_tax.getText().toString().equals("")) {
                try {
                    long net_income = Long.parseLong(AddTaxActivity.this.input_Income.getText().toString()) - Long.parseLong(AddTaxActivity.this.input_tax.getText().toString());
                    EditText editText = AddTaxActivity.this.input_net_income;
                    editText.setText(net_income + "");
                    AddTaxActivity.this.input_net_income.setError(null);
                } catch (Exception e) {
                }
            }
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddTaxActivity$c  reason: invalid class name */
    class Cc implements TextWatcher {
        Cc() {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        public void afterTextChanged(Editable editable) {
            if (!AddTaxActivity.this.input_Income.getText().toString().equals("")) {
                try {
                    long net_income = Long.parseLong(AddTaxActivity.this.input_Income.getText().toString()) - Long.parseLong(AddTaxActivity.this.input_tax.getText().toString());
                    EditText editText = AddTaxActivity.this.input_net_income;
                    editText.setText(net_income + "");
                    AddTaxActivity.this.input_net_income.setError(null);
                } catch (Exception e) {
                }
            }
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_add_tax) {
            boolean hasError = false;
            if (this.input_year.getText().toString().equals("")) {
                this.input_year.setError("سال را انتخاب کنید.");
                hasError = true;
            }
            if (this.input_Income.getText().toString().equals("0")) {
                this.input_Income.setError("مبلغ درآمد را وارد کنید.");
                hasError = true;
            }
            if (this.input_tax.getText().toString().equals("0")) {
                this.input_tax.setError("مالیات را وارد کنید.");
                hasError = true;
            }
            if (this.input_net_income.getText().toString().equals("0")) {
                this.input_net_income.setError("درآمد خالص را وارد کنید.");
                hasError = true;
            }
            if (!hasError) {
                Cj tax = new Cj();
                tax.m۱۷۷۳۱b(Integer.parseInt(this.input_year.getText().toString()));
                tax.m۱۷۷۳۴c(Long.parseLong(this.input_net_income.getText().toString()));
                tax.m۱۷۷۳۲b(Long.parseLong(this.input_tax.getText().toString()));
                tax.m۱۷۷۲۸a(Long.parseLong(this.input_Income.getText().toString()));
                tax.m۱۷۷۲۹a(this.input_comment.getText().toString());
                this.f۱۴۲۰۷t.m۱۷۸۱۱n();
                if (this.f۱۴۲۰۶s.equals("edit")) {
                    this.f۱۴۲۰۷t.m۱۷۷۷۵a(tax, this.f۱۴۲۰۵r);
                    new Ch().m۱۷۷۵۳a(this, "success", "با موفقیت ویرایش شد.");
                } else {
                    this.f۱۴۲۰۷t.m۱۷۷۷۴a(tax);
                    new Ch().m۱۷۷۵۳a(this, "success", "با موفقیت ثبت شد.");
                }
                this.f۱۴۲۰۷t.close();
                setResult(-1);
                finish();
            }
        } else if (id == R.id.input_year) {
            DialogCe dialog_year = new DialogCe(this);
            View viewYear = getLayoutInflater().inflate(R.layout.bottom_sheet_select_year, (ViewGroup) null);
            NumberPicker numberPicker = (NumberPicker) viewYear.findViewById(R.id.number_picker);
            ImageView img_add_year = (ImageView) viewYear.findViewById(R.id.img_add_year);
            if (this.input_year.getText().toString().equals("")) {
                numberPicker.setValue(1397);
            } else {
                numberPicker.setValue(Integer.parseInt(this.input_year.getText().toString()));
            }
            numberPicker.setOnValueChangedListener(new Cd(this));
            img_add_year.setOnClickListener(new View$OnClickListenerCe(numberPicker, dialog_year));
            dialog_year.setContentView(viewYear);
            dialog_year.show();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddTaxActivity$d  reason: invalid class name */
    class Cd implements NumberPicker.AbstractCe {
        Cd(AddTaxActivity this$0) {
        }

        @Override // com.shawnlin.numberpicker.NumberPicker.AbstractCe
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۰۴a(NumberPicker picker, int oldVal, int newVal) {
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.AddTaxActivity$e  reason: invalid class name */
    class View$OnClickListenerCe implements View.OnClickListener {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ NumberPicker f۱۴۲۱۱c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ DialogCe f۱۴۲۱۲d;

        View$OnClickListenerCe(NumberPicker numberPicker, DialogCe eVar) {
            this.f۱۴۲۱۱c = numberPicker;
            this.f۱۴۲۱۲d = eVar;
        }

        public void onClick(View view) {
            EditText editText = AddTaxActivity.this.input_year;
            editText.setText(this.f۱۴۲۱۱c.getValue() + "");
            AddTaxActivity.this.input_year.setTextColor(Color.parseColor("#E65100"));
            this.f۱۴۲۱۲d.dismiss();
        }
    }

    public void onFocusChange(View view, boolean Focused) {
        if (view.getId() == R.id.input_year && Focused) {
            this.input_year.setError(null);
            this.input_year.callOnClick();
        }
    }
}
