package com.mohamadamin.persianmaterialdatetimepicker.time;

import android.animation.ObjectAnimator;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mohamadamin.persianmaterialdatetimepicker.Ca;
import com.mohamadamin.persianmaterialdatetimepicker.Cb;
import com.mohamadamin.persianmaterialdatetimepicker.Cd;
import com.mohamadamin.persianmaterialdatetimepicker.Ce;
import com.mohamadamin.persianmaterialdatetimepicker.Cf;
import com.mohamadamin.persianmaterialdatetimepicker.Ch;
import com.mohamadamin.persianmaterialdatetimepicker.Ci;
import com.mohamadamin.persianmaterialdatetimepicker.time.RadialPickerLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.mohamadamin.persianmaterialdatetimepicker.time.e  reason: invalid class name */
public class DialogFragmentCe extends DialogFragment implements RadialPickerLayout.AbstractCc {

    /* renamed from: A  reason: contains not printable characters */
    private String f۱۵۰۹۹A;

    /* renamed from: B  reason: contains not printable characters */
    private boolean f۱۵۱۰۰B;

    /* renamed from: C  reason: contains not printable characters */
    private ArrayList<Integer> f۱۵۱۰۱C;

    /* renamed from: D  reason: contains not printable characters */
    private Cg f۱۵۱۰۲D;

    /* renamed from: E  reason: contains not printable characters */
    private int f۱۵۱۰۳E;

    /* renamed from: F  reason: contains not printable characters */
    private int f۱۵۱۰۴F;

    /* renamed from: G  reason: contains not printable characters */
    private String f۱۵۱۰۵G;

    /* renamed from: H  reason: contains not printable characters */
    private String f۱۵۱۰۶H;

    /* renamed from: I  reason: contains not printable characters */
    private String f۱۵۱۰۷I;

    /* renamed from: J  reason: contains not printable characters */
    private String f۱۵۱۰۸J;

    /* renamed from: c  reason: contains not printable characters */
    private AbstractCh f۱۵۱۰۹c;

    /* renamed from: d  reason: contains not printable characters */
    private DialogInterface.OnCancelListener f۱۵۱۱۰d;

    /* renamed from: e  reason: contains not printable characters */
    private DialogInterface.OnDismissListener f۱۵۱۱۱e;

    /* renamed from: f  reason: contains not printable characters */
    private Ca f۱۵۱۱۲f;

    /* renamed from: g  reason: contains not printable characters */
    private Button f۱۵۱۱۳g;

    /* renamed from: h  reason: contains not printable characters */
    private TextView f۱۵۱۱۴h;

    /* renamed from: i  reason: contains not printable characters */
    private TextView f۱۵۱۱۵i;

    /* renamed from: j  reason: contains not printable characters */
    private TextView f۱۵۱۱۶j;

    /* renamed from: k  reason: contains not printable characters */
    private TextView f۱۵۱۱۷k;

    /* renamed from: l  reason: contains not printable characters */
    private TextView f۱۵۱۱۸l;

    /* renamed from: m  reason: contains not printable characters */
    private View f۱۵۱۱۹m;

    /* renamed from: n  reason: contains not printable characters */
    private RadialPickerLayout f۱۵۱۲۰n;

    /* renamed from: o  reason: contains not printable characters */
    private int f۱۵۱۲۱o;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۵۱۲۲p;

    /* renamed from: q  reason: contains not printable characters */
    private String f۱۵۱۲۳q;

    /* renamed from: r  reason: contains not printable characters */
    private String f۱۵۱۲۴r;

    /* renamed from: s  reason: contains not printable characters */
    private boolean f۱۵۱۲۵s;

    /* renamed from: t  reason: contains not printable characters */
    private int f۱۵۱۲۶t;

    /* renamed from: u  reason: contains not printable characters */
    private int f۱۵۱۲۷u;

    /* renamed from: v  reason: contains not printable characters */
    private boolean f۱۵۱۲۸v;

    /* renamed from: w  reason: contains not printable characters */
    private String f۱۵۱۲۹w;

    /* renamed from: x  reason: contains not printable characters */
    private boolean f۱۵۱۳۰x;

    /* renamed from: y  reason: contains not printable characters */
    private char f۱۵۱۳۱y;

    /* renamed from: z  reason: contains not printable characters */
    private String f۱۵۱۳۲z;

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.time.e$h  reason: invalid class name */
    public interface AbstractCh {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۸۰۸۴a(RadialPickerLayout radialPickerLayout, int i, int i2);
    }

    /* renamed from: b  reason: contains not printable characters */
    public static DialogFragmentCe m۱۸۰۶۴b(AbstractCh callback, int hourOfDay, int minute, boolean is24HourMode) {
        DialogFragmentCe ret = new DialogFragmentCe();
        ret.m۱۸۰۸۰a(callback, hourOfDay, minute, is24HourMode);
        return ret;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۸۰a(AbstractCh callback, int hourOfDay, int minute, boolean is24HourMode) {
        this.f۱۵۱۰۹c = callback;
        this.f۱۵۱۲۶t = hourOfDay;
        this.f۱۵۱۲۷u = minute;
        this.f۱۵۱۲۸v = is24HourMode;
        this.f۱۵۱۰۰B = false;
        this.f۱۵۱۲۹w = "";
        this.f۱۵۱۳۰x = false;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("hour_of_day") && savedInstanceState.containsKey("minute") && savedInstanceState.containsKey("is_24_hour_view")) {
            this.f۱۵۱۲۶t = savedInstanceState.getInt("hour_of_day");
            this.f۱۵۱۲۷u = savedInstanceState.getInt("minute");
            this.f۱۵۱۲۸v = savedInstanceState.getBoolean("is_24_hour_view");
            this.f۱۵۱۰۰B = savedInstanceState.getBoolean("in_kb_mode");
            this.f۱۵۱۲۹w = savedInstanceState.getString("dialog_title");
            this.f۱۵۱۳۰x = savedInstanceState.getBoolean("dark_theme");
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getDialog().getWindow().requestFeature(1);
        View view = inflater.inflate(Cf.mdtp_time_picker_dialog, (ViewGroup) null);
        View$OnKeyListenerCf keyboardListener = new View$OnKeyListenerCf(this, null);
        view.findViewById(Ce.time_picker_dialog).setOnKeyListener(keyboardListener);
        Resources res = getResources();
        this.f۱۵۱۰۵G = res.getString(com.mohamadamin.persianmaterialdatetimepicker.Cg.mdtp_hour_picker_description);
        this.f۱۵۱۰۶H = res.getString(com.mohamadamin.persianmaterialdatetimepicker.Cg.mdtp_select_hours);
        this.f۱۵۱۰۷I = res.getString(com.mohamadamin.persianmaterialdatetimepicker.Cg.mdtp_minute_picker_description);
        this.f۱۵۱۰۸J = res.getString(com.mohamadamin.persianmaterialdatetimepicker.Cg.mdtp_select_minutes);
        this.f۱۵۱۲۱o = res.getColor(Cb.mdtp_white);
        this.f۱۵۱۲۲p = res.getColor(Cb.mdtp_accent_color_focused);
        this.f۱۵۱۱۴h = (TextView) view.findViewById(Ce.hours);
        this.f۱۵۱۱۴h.setOnKeyListener(keyboardListener);
        this.f۱۵۱۱۵i = (TextView) view.findViewById(Ce.hour_space);
        this.f۱۵۱۱۷k = (TextView) view.findViewById(Ce.minutes_space);
        this.f۱۵۱۱۶j = (TextView) view.findViewById(Ce.minutes);
        this.f۱۵۱۱۶j.setOnKeyListener(keyboardListener);
        this.f۱۵۱۱۸l = (TextView) view.findViewById(Ce.ampm_label);
        this.f۱۵۱۱۸l.setOnKeyListener(keyboardListener);
        this.f۱۵۱۲۳q = "قبل‌ازظهر";
        this.f۱۵۱۲۴r = "بعدازظهر";
        this.f۱۵۱۱۲f = new Ca(getActivity());
        this.f۱۵۱۲۰n = (RadialPickerLayout) view.findViewById(Ce.time_picker);
        this.f۱۵۱۲۰n.setOnValueSelectedListener(this);
        this.f۱۵۱۲۰n.setOnKeyListener(keyboardListener);
        this.f۱۵۱۲۰n.m۱۸۰۳۵a(getActivity(), this.f۱۵۱۱۲f, this.f۱۵۱۲۶t, this.f۱۵۱۲۷u, this.f۱۵۱۲۸v);
        int currentItemShowing = 0;
        if (savedInstanceState != null && savedInstanceState.containsKey("current_item_showing")) {
            currentItemShowing = savedInstanceState.getInt("current_item_showing");
        }
        m۱۸۰۵۴a(currentItemShowing, false, true, true);
        this.f۱۵۱۲۰n.invalidate();
        this.f۱۵۱۱۴h.setOnClickListener(new View$OnClickListenerCa());
        this.f۱۵۱۱۶j.setOnClickListener(new View$OnClickListenerCb());
        this.f۱۵۱۱۳g = (Button) view.findViewById(Ce.f۱۴۹۷۰ok);
        this.f۱۵۱۱۳g.setOnClickListener(new View$OnClickListenerCc());
        this.f۱۵۱۱۳g.setOnKeyListener(keyboardListener);
        this.f۱۵۱۱۳g.setTypeface(Ch.m۱۷۹۹۳a(getDialog().getContext(), "Roboto-Medium"));
        Button mCancelButton = (Button) view.findViewById(Ce.cancel);
        mCancelButton.setOnClickListener(new View$OnClickListenerCd());
        mCancelButton.setTypeface(Ch.m۱۷۹۹۳a(getDialog().getContext(), "Roboto-Medium"));
        mCancelButton.setVisibility(isCancelable() ? 0 : 8);
        this.f۱۵۱۱۹m = view.findViewById(Ce.ampm_hitspace);
        if (this.f۱۵۱۲۸v) {
            this.f۱۵۱۱۸l.setVisibility(8);
            RelativeLayout.LayoutParams paramsSeparator = new RelativeLayout.LayoutParams(-2, -2);
            paramsSeparator.addRule(13);
            ((TextView) view.findViewById(Ce.separator)).setLayoutParams(paramsSeparator);
        } else {
            this.f۱۵۱۱۸l.setVisibility(0);
            m۱۸۰۷۷g(this.f۱۵۱۲۶t < 12 ? 0 : 1);
            this.f۱۵۱۱۹m.setOnClickListener(new View$OnClickListenerCe());
        }
        this.f۱۵۱۲۵s = true;
        m۱۸۰۵۳a(this.f۱۵۱۲۶t, true);
        m۱۸۰۷۴e(this.f۱۵۱۲۷u);
        this.f۱۵۱۳۲z = res.getString(com.mohamadamin.persianmaterialdatetimepicker.Cg.mdtp_time_placeholder);
        this.f۱۵۰۹۹A = res.getString(com.mohamadamin.persianmaterialdatetimepicker.Cg.mdtp_deleted_key);
        this.f۱۵۱۳۱y = this.f۱۵۱۳۲z.charAt(0);
        this.f۱۵۱۰۴F = -1;
        this.f۱۵۱۰۳E = -1;
        m۱۸۰۷۰c();
        if (this.f۱۵۱۰۰B) {
            this.f۱۵۱۰۱C = savedInstanceState.getIntegerArrayList("typed_times");
            m۱۸۰۷۶f(-1);
            this.f۱۵۱۱۴h.invalidate();
        } else if (this.f۱۵۱۰۱C == null) {
            this.f۱۵۱۰۱C = new ArrayList<>();
        }
        TextView timePickerHeader = (TextView) view.findViewById(Ce.time_picker_header);
        if (!this.f۱۵۱۲۹w.isEmpty()) {
            timePickerHeader.setVisibility(0);
            timePickerHeader.setText(this.f۱۵۱۲۹w);
        }
        this.f۱۵۱۲۰n.m۱۸۰۳۶a(getActivity().getApplicationContext(), this.f۱۵۱۳۰x);
        res.getColor(Cb.mdtp_white);
        res.getColor(Cb.mdtp_accent_color);
        int circleBackground = res.getColor(Cb.mdtp_circle_background);
        res.getColor(Cb.mdtp_line_background);
        res.getColor(Cb.mdtp_numbers_text_color);
        res.getColorStateList(Cb.mdtp_done_text_color);
        int i = Cd.mdtp_done_background_color;
        int backgroundColor = res.getColor(Cb.mdtp_background_color);
        int darkBackgroundColor = res.getColor(Cb.mdtp_light_gray);
        res.getColor(Cb.mdtp_dark_gray);
        int lightGray = res.getColor(Cb.mdtp_light_gray);
        res.getColor(Cb.mdtp_line_dark);
        res.getColorStateList(Cb.mdtp_done_text_color_dark);
        int i2 = Cd.mdtp_done_background_color_dark;
        this.f۱۵۱۲۰n.setBackgroundColor(this.f۱۵۱۳۰x ? lightGray : circleBackground);
        view.findViewById(Ce.time_picker_dialog).setBackgroundColor(this.f۱۵۱۳۰x ? darkBackgroundColor : backgroundColor);
        return view;
    }

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.time.e$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {
        View$OnClickListenerCa() {
        }

        public void onClick(View v) {
            DialogFragmentCe.this.m۱۸۰۵۴a((DialogFragmentCe) 0, true, false, true);
            DialogFragmentCe.this.m۱۸۰۷۸a();
        }
    }

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.time.e$b  reason: invalid class name */
    class View$OnClickListenerCb implements View.OnClickListener {
        View$OnClickListenerCb() {
        }

        public void onClick(View v) {
            DialogFragmentCe.this.m۱۸۰۵۴a((DialogFragmentCe) 1, true, false, true);
            DialogFragmentCe.this.m۱۸۰۷۸a();
        }
    }

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.time.e$c  reason: invalid class name */
    class View$OnClickListenerCc implements View.OnClickListener {
        View$OnClickListenerCc() {
        }

        public void onClick(View v) {
            if (!DialogFragmentCe.this.f۱۵۱۰۰B || !DialogFragmentCe.this.m۱۸۰۷۲d()) {
                DialogFragmentCe.this.m۱۸۰۷۸a();
            } else {
                DialogFragmentCe.this.m۱۸۰۵۸a((DialogFragmentCe) false);
            }
            if (DialogFragmentCe.this.f۱۵۱۰۹c != null) {
                DialogFragmentCe.this.f۱۵۱۰۹c.m۱۸۰۸۴a(DialogFragmentCe.this.f۱۵۱۲۰n, DialogFragmentCe.this.f۱۵۱۲۰n.getHours(), DialogFragmentCe.this.f۱۵۱۲۰n.getMinutes());
            }
            DialogFragmentCe.this.dismiss();
        }
    }

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.time.e$d  reason: invalid class name */
    class View$OnClickListenerCd implements View.OnClickListener {
        View$OnClickListenerCd() {
        }

        public void onClick(View v) {
            DialogFragmentCe.this.m۱۸۰۷۸a();
            DialogFragmentCe.this.getDialog().cancel();
        }
    }

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.time.e$e  reason: invalid class name */
    class View$OnClickListenerCe implements View.OnClickListener {
        View$OnClickListenerCe() {
        }

        public void onClick(View v) {
            DialogFragmentCe.this.m۱۸۰۷۸a();
            int amOrPm = DialogFragmentCe.this.f۱۵۱۲۰n.getIsCurrentlyAmOrPm();
            if (amOrPm == 0) {
                amOrPm = 1;
            } else if (amOrPm == 1) {
                amOrPm = 0;
            }
            DialogFragmentCe.this.m۱۸۰۷۷g(amOrPm);
            DialogFragmentCe.this.f۱۵۱۲۰n.setAmOrPm(amOrPm);
        }
    }

    public void onResume() {
        super.onResume();
        this.f۱۵۱۱۲f.m۱۷۸۹۱a();
    }

    public void onPause() {
        super.onPause();
        this.f۱۵۱۱۲f.m۱۷۸۹۲b();
    }

    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        DialogInterface.OnCancelListener onCancelListener = this.f۱۵۱۱۰d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialog);
        }
    }

    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        DialogInterface.OnDismissListener onDismissListener = this.f۱۵۱۱۱e;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialog);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۷۸a() {
        this.f۱۵۱۱۲f.m۱۷۸۹۳c();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g  reason: contains not printable characters */
    private void m۱۸۰۷۷g(int amOrPm) {
        if (amOrPm == 0) {
            this.f۱۵۱۱۸l.setText(this.f۱۵۱۲۳q);
            Ci.m۱۷۹۹۶a(this.f۱۵۱۲۰n, this.f۱۵۱۲۳q);
            this.f۱۵۱۱۹m.setContentDescription(this.f۱۵۱۲۳q);
        } else if (amOrPm == 1) {
            this.f۱۵۱۱۸l.setText(this.f۱۵۱۲۴r);
            Ci.m۱۷۹۹۶a(this.f۱۵۱۲۰n, this.f۱۵۱۲۴r);
            this.f۱۵۱۱۹m.setContentDescription(this.f۱۵۱۲۴r);
        } else {
            this.f۱۵۱۱۸l.setText(this.f۱۵۱۳۲z);
        }
    }

    public void onSaveInstanceState(Bundle outState) {
        RadialPickerLayout radialPickerLayout = this.f۱۵۱۲۰n;
        if (radialPickerLayout != null) {
            outState.putInt("hour_of_day", radialPickerLayout.getHours());
            outState.putInt("minute", this.f۱۵۱۲۰n.getMinutes());
            outState.putBoolean("is_24_hour_view", this.f۱۵۱۲۸v);
            outState.putInt("current_item_showing", this.f۱۵۱۲۰n.getCurrentItemShowing());
            outState.putBoolean("in_kb_mode", this.f۱۵۱۰۰B);
            if (this.f۱۵۱۰۰B) {
                outState.putIntegerArrayList("typed_times", this.f۱۵۱۰۱C);
            }
            outState.putString("dialog_title", this.f۱۵۱۲۹w);
            outState.putBoolean("dark_theme", this.f۱۵۱۳۰x);
        }
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.time.RadialPickerLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۷۹a(int pickerIndex, int newValue, boolean autoAdvance) {
        if (pickerIndex == 0) {
            m۱۸۰۵۳a(newValue, false);
            String announcement = String.format("%d", Integer.valueOf(newValue));
            if (!this.f۱۵۱۲۵s || !autoAdvance) {
                this.f۱۵۱۲۰n.setContentDescription(this.f۱۵۱۰۵G + ": " + newValue);
            } else {
                m۱۸۰۵۴a(1, true, true, false);
                announcement = announcement + ". " + this.f۱۵۱۰۸J;
            }
            Ci.m۱۷۹۹۶a(this.f۱۵۱۲۰n, announcement);
        } else if (pickerIndex == 1) {
            m۱۸۰۷۴e(newValue);
            this.f۱۵۱۲۰n.setContentDescription(this.f۱۵۱۰۷I + ": " + newValue);
        } else if (pickerIndex == 2) {
            m۱۸۰۷۷g(newValue);
        } else if (pickerIndex == 3) {
            if (!m۱۸۰۷۲d()) {
                this.f۱۵۱۰۱C.clear();
            }
            m۱۸۰۵۸a(true);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۰۵۳a(int value, boolean announce) {
        String format;
        if (this.f۱۵۱۲۸v) {
            format = "%02d";
        } else {
            format = "%d";
            value %= 12;
            if (value == 0) {
                value = 12;
            }
        }
        String text = com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۱b(String.format(format, Integer.valueOf(value)));
        this.f۱۵۱۱۴h.setText(text);
        this.f۱۵۱۱۵i.setText(text);
        if (announce) {
            Ci.m۱۷۹۹۶a(this.f۱۵۱۲۰n, text);
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۸۰۷۴e(int value) {
        if (value == 60) {
            value = 0;
        }
        CharSequence text = com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۱b(String.format(Locale.getDefault(), "%02d", Integer.valueOf(value)));
        Ci.m۱۷۹۹۶a(this.f۱۵۱۲۰n, text);
        this.f۱۵۱۱۶j.setText(text);
        this.f۱۵۱۱۷k.setText(text);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۰۵۴a(int index, boolean animateCircle, boolean delayLabelAnimate, boolean announce) {
        TextView labelToAnimate;
        this.f۱۵۱۲۰n.m۱۸۰۳۴a(index, animateCircle);
        if (index == 0) {
            int hours = this.f۱۵۱۲۰n.getHours();
            if (!this.f۱۵۱۲۸v) {
                hours %= 12;
            }
            RadialPickerLayout radialPickerLayout = this.f۱۵۱۲۰n;
            radialPickerLayout.setContentDescription(this.f۱۵۱۰۵G + ": " + hours);
            if (announce) {
                Ci.m۱۷۹۹۶a(this.f۱۵۱۲۰n, this.f۱۵۱۰۶H);
            }
            labelToAnimate = this.f۱۵۱۱۴h;
        } else {
            int minutes = this.f۱۵۱۲۰n.getMinutes();
            RadialPickerLayout radialPickerLayout2 = this.f۱۵۱۲۰n;
            radialPickerLayout2.setContentDescription(this.f۱۵۱۰۷I + ": " + minutes);
            if (announce) {
                Ci.m۱۷۹۹۶a(this.f۱۵۱۲۰n, this.f۱۵۱۰۸J);
            }
            labelToAnimate = this.f۱۵۱۱۶j;
        }
        int hourColor = index == 0 ? this.f۱۵۱۲۱o : this.f۱۵۱۲۲p;
        int minuteColor = index == 1 ? this.f۱۵۱۲۱o : this.f۱۵۱۲۲p;
        this.f۱۵۱۱۴h.setTextColor(hourColor);
        this.f۱۵۱۱۶j.setTextColor(minuteColor);
        ObjectAnimator pulseAnimator = Ci.m۱۷۹۹۵a(labelToAnimate, 0.85f, 1.1f);
        if (delayLabelAnimate) {
            pulseAnimator.setStartDelay(300);
        }
        pulseAnimator.start();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d  reason: contains not printable characters */
    private boolean m۱۸۰۷۳d(int keyCode) {
        String deletedKeyStr;
        if (keyCode == 111 || keyCode == 4) {
            if (isCancelable()) {
                dismiss();
            }
            return true;
        }
        if (keyCode == 61) {
            if (this.f۱۵۱۰۰B) {
                if (m۱۸۰۷۲d()) {
                    m۱۸۰۵۸a(true);
                }
                return true;
            }
        } else if (keyCode == 66) {
            if (this.f۱۵۱۰۰B) {
                if (!m۱۸۰۷۲d()) {
                    return true;
                }
                m۱۸۰۵۸a(false);
            }
            AbstractCh hVar = this.f۱۵۱۰۹c;
            if (hVar != null) {
                RadialPickerLayout radialPickerLayout = this.f۱۵۱۲۰n;
                hVar.m۱۸۰۸۴a(radialPickerLayout, radialPickerLayout.getHours(), this.f۱۵۱۲۰n.getMinutes());
            }
            dismiss();
            return true;
        } else if (keyCode == 67) {
            if (this.f۱۵۱۰۰B && !this.f۱۵۱۰۱C.isEmpty()) {
                int deleted = m۱۸۰۶۲b();
                if (deleted == m۱۸۰۶۳b(0)) {
                    deletedKeyStr = this.f۱۵۱۲۳q;
                } else if (deleted == m۱۸۰۶۳b(1)) {
                    deletedKeyStr = this.f۱۵۱۲۴r;
                } else {
                    deletedKeyStr = String.format("%d", Integer.valueOf(m۱۸۰۶۸c(deleted)));
                }
                Ci.m۱۷۹۹۶a(this.f۱۵۱۲۰n, String.format(this.f۱۵۰۹۹A, deletedKeyStr));
                m۱۸۰۶۵b(true);
            }
        } else if (keyCode == 7 || keyCode == 8 || keyCode == 9 || keyCode == 10 || keyCode == 11 || keyCode == 12 || keyCode == 13 || keyCode == 14 || keyCode == 15 || keyCode == 16 || (!this.f۱۵۱۲۸v && (keyCode == m۱۸۰۶۳b(0) || keyCode == m۱۸۰۶۳b(1)))) {
            if (this.f۱۵۱۰۰B) {
                if (m۱۸۰۵۹a(keyCode)) {
                    m۱۸۰۶۵b(false);
                }
                return true;
            } else if (this.f۱۵۱۲۰n == null) {
                Log.e("TimePickerDialog", "Unable to initiate keyboard mode, TimePicker was null.");
                return true;
            } else {
                this.f۱۵۱۰۱C.clear();
                m۱۸۰۷۶f(keyCode);
                return true;
            }
        }
        return false;
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۸۰۷۶f(int keyCode) {
        if (!this.f۱۵۱۲۰n.m۱۸۰۳۷a(false)) {
            return;
        }
        if (keyCode == -1 || m۱۸۰۵۹a(keyCode)) {
            this.f۱۵۱۰۰B = true;
            this.f۱۵۱۱۳g.setEnabled(false);
            m۱۸۰۶۵b(false);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۸۰۵۹a(int keyCode) {
        if ((this.f۱۵۱۲۸v && this.f۱۵۱۰۱C.size() == 4) || (!this.f۱۵۱۲۸v && m۱۸۰۷۲d())) {
            return false;
        }
        this.f۱۵۱۰۱C.add(Integer.valueOf(keyCode));
        if (!m۱۸۰۷۵e()) {
            m۱۸۰۶۲b();
            return false;
        }
        int val = m۱۸۰۶۸c(keyCode);
        Ci.m۱۷۹۹۶a(this.f۱۵۱۲۰n, String.format("%d", Integer.valueOf(val)));
        if (m۱۸۰۷۲d()) {
            if (!this.f۱۵۱۲۸v && this.f۱۵۱۰۱C.size() <= 3) {
                ArrayList<Integer> arrayList = this.f۱۵۱۰۱C;
                arrayList.add(arrayList.size() - 1, 7);
                ArrayList<Integer> arrayList2 = this.f۱۵۱۰۱C;
                arrayList2.add(arrayList2.size() - 1, 7);
            }
            this.f۱۵۱۱۳g.setEnabled(true);
        }
        return true;
    }

    /* renamed from: e  reason: contains not printable characters */
    private boolean m۱۸۰۷۵e() {
        Cg node = this.f۱۵۱۰۲D;
        Iterator i$ = this.f۱۵۱۰۱C.iterator();
        while (i$.hasNext()) {
            node = node.m۱۸۰۸۱a(i$.next().intValue());
            if (node == null) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d  reason: contains not printable characters */
    private boolean m۱۸۰۷۲d() {
        if (this.f۱۵۱۲۸v) {
            int[] values = m۱۸۰۶۱a((Boolean[]) null);
            if (values[0] < 0 || values[1] < 0 || values[1] >= 60) {
                return false;
            }
            return true;
        } else if (this.f۱۵۱۰۱C.contains(Integer.valueOf(m۱۸۰۶۳b(0))) || this.f۱۵۱۰۱C.contains(Integer.valueOf(m۱۸۰۶۳b(1)))) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۸۰۶۲b() {
        ArrayList<Integer> arrayList = this.f۱۵۱۰۱C;
        int deleted = arrayList.remove(arrayList.size() - 1).intValue();
        if (!m۱۸۰۷۲d()) {
            this.f۱۵۱۱۳g.setEnabled(false);
        }
        return deleted;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۰۵۸a(boolean updateDisplays) {
        this.f۱۵۱۰۰B = false;
        if (!this.f۱۵۱۰۱C.isEmpty()) {
            int[] values = m۱۸۰۶۱a((Boolean[]) null);
            this.f۱۵۱۲۰n.m۱۸۰۳۳a(values[0], values[1]);
            if (!this.f۱۵۱۲۸v) {
                this.f۱۵۱۲۰n.setAmOrPm(values[2]);
            }
            this.f۱۵۱۰۱C.clear();
        }
        if (updateDisplays) {
            m۱۸۰۶۵b(false);
            this.f۱۵۱۲۰n.m۱۸۰۳۷a(true);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۸۰۶۵b(boolean allowEmptyDisplay) {
        int i = 0;
        if (allowEmptyDisplay || !this.f۱۵۱۰۱C.isEmpty()) {
            Boolean[] enteredZeros = {false, false};
            int[] values = m۱۸۰۶۱a(enteredZeros);
            String minuteFormat = "%02d";
            String hourFormat = enteredZeros[0].booleanValue() ? minuteFormat : "%2d";
            if (!enteredZeros[1].booleanValue()) {
                minuteFormat = "%2d";
            }
            String hourStr = values[0] == -1 ? this.f۱۵۱۳۲z : String.format(hourFormat, Integer.valueOf(values[0])).replace(' ', this.f۱۵۱۳۱y);
            String minuteStr = values[1] == -1 ? this.f۱۵۱۳۲z : String.format(minuteFormat, Integer.valueOf(values[1])).replace(' ', this.f۱۵۱۳۱y);
            this.f۱۵۱۱۴h.setText(com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۱b(hourStr));
            this.f۱۵۱۱۵i.setText(com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۱b(hourStr));
            this.f۱۵۱۱۴h.setTextColor(this.f۱۵۱۲۲p);
            this.f۱۵۱۱۶j.setText(com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۱b(minuteStr));
            this.f۱۵۱۱۷k.setText(com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۱b(minuteStr));
            this.f۱۵۱۱۶j.setTextColor(this.f۱۵۱۲۲p);
            if (!this.f۱۵۱۲۸v) {
                m۱۸۰۷۷g(values[2]);
                return;
            }
            return;
        }
        int hour = this.f۱۵۱۲۰n.getHours();
        int minute = this.f۱۵۱۲۰n.getMinutes();
        m۱۸۰۵۳a(hour, true);
        m۱۸۰۷۴e(minute);
        if (!this.f۱۵۱۲۸v) {
            if (hour >= 12) {
                i = 1;
            }
            m۱۸۰۷۷g(i);
        }
        m۱۸۰۵۴a(this.f۱۵۱۲۰n.getCurrentItemShowing(), true, true, true);
        this.f۱۵۱۱۳g.setEnabled(true);
    }

    /* renamed from: c  reason: contains not printable characters */
    private static int m۱۸۰۶۸c(int keyCode) {
        switch (keyCode) {
            case 7:
                return 0;
            case 8:
                return 1;
            case 9:
                return 2;
            case 10:
                return 3;
            case 11:
                return 4;
            case 12:
                return 5;
            case 13:
                return 6;
            case 14:
                return 7;
            case 15:
                return 8;
            case 16:
                return 9;
            default:
                return -1;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private int[] m۱۸۰۶۱a(Boolean[] enteredZeros) {
        int amOrPm = -1;
        int startIndex = 1;
        if (!this.f۱۵۱۲۸v && m۱۸۰۷۲d()) {
            ArrayList<Integer> arrayList = this.f۱۵۱۰۱C;
            int keyCode = arrayList.get(arrayList.size() - 1).intValue();
            if (keyCode == m۱۸۰۶۳b(0)) {
                amOrPm = 0;
            } else if (keyCode == m۱۸۰۶۳b(1)) {
                amOrPm = 1;
            }
            startIndex = 2;
        }
        int minute = -1;
        int hour = -1;
        for (int i = startIndex; i <= this.f۱۵۱۰۱C.size(); i++) {
            ArrayList<Integer> arrayList2 = this.f۱۵۱۰۱C;
            int val = m۱۸۰۶۸c(arrayList2.get(arrayList2.size() - i).intValue());
            if (i == startIndex) {
                minute = val;
            } else if (i == startIndex + 1) {
                minute += val * 10;
                if (enteredZeros != null && val == 0) {
                    enteredZeros[1] = true;
                }
            } else if (i == startIndex + 2) {
                hour = val;
            } else if (i == startIndex + 3) {
                hour += val * 10;
                if (enteredZeros != null && val == 0) {
                    enteredZeros[0] = true;
                }
            }
        }
        return new int[]{hour, minute, amOrPm};
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۸۰۶۳b(int amOrPm) {
        if (this.f۱۵۱۰۳E == -1 || this.f۱۵۱۰۴F == -1) {
            KeyCharacterMap kcm = KeyCharacterMap.load(-1);
            int i = 0;
            while (true) {
                if (i >= Math.max(this.f۱۵۱۲۳q.length(), this.f۱۵۱۲۴r.length())) {
                    break;
                }
                char amChar = "AM".toLowerCase(Locale.getDefault()).charAt(i);
                char pmChar = "PM".toLowerCase(Locale.getDefault()).charAt(i);
                if (amChar != pmChar) {
                    KeyEvent[] events = kcm.getEvents(new char[]{amChar, pmChar});
                    if (events == null || events.length != 4) {
                        Log.e("TimePickerDialog", "Unable to find keycodes for AM and PM.");
                    } else {
                        this.f۱۵۱۰۳E = events[0].getKeyCode();
                        this.f۱۵۱۰۴F = events[2].getKeyCode();
                    }
                } else {
                    i++;
                }
            }
        }
        if (amOrPm == 0) {
            return this.f۱۵۱۰۳E;
        }
        if (amOrPm == 1) {
            return this.f۱۵۱۰۴F;
        }
        return -1;
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۸۰۷۰c() {
        this.f۱۵۱۰۲D = new Cg(new int[0]);
        if (this.f۱۵۱۲۸v) {
            Cg minuteFirstDigit = new Cg(7, 8, 9, 10, 11, 12);
            Cg minuteSecondDigit = new Cg(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
            minuteFirstDigit.m۱۸۰۸۲a(minuteSecondDigit);
            Cg firstDigit = new Cg(7, 8);
            this.f۱۵۱۰۲D.m۱۸۰۸۲a(firstDigit);
            Cg secondDigit = new Cg(7, 8, 9, 10, 11, 12);
            firstDigit.m۱۸۰۸۲a(secondDigit);
            secondDigit.m۱۸۰۸۲a(minuteFirstDigit);
            secondDigit.m۱۸۰۸۲a(new Cg(13, 14, 15, 16));
            Cg secondDigit2 = new Cg(13, 14, 15, 16);
            firstDigit.m۱۸۰۸۲a(secondDigit2);
            secondDigit2.m۱۸۰۸۲a(minuteFirstDigit);
            Cg firstDigit2 = new Cg(9);
            this.f۱۵۱۰۲D.m۱۸۰۸۲a(firstDigit2);
            Cg secondDigit3 = new Cg(7, 8, 9, 10);
            firstDigit2.m۱۸۰۸۲a(secondDigit3);
            secondDigit3.m۱۸۰۸۲a(minuteFirstDigit);
            Cg secondDigit4 = new Cg(11, 12);
            firstDigit2.m۱۸۰۸۲a(secondDigit4);
            secondDigit4.m۱۸۰۸۲a(minuteSecondDigit);
            Cg firstDigit3 = new Cg(10, 11, 12, 13, 14, 15, 16);
            this.f۱۵۱۰۲D.m۱۸۰۸۲a(firstDigit3);
            firstDigit3.m۱۸۰۸۲a(minuteFirstDigit);
            return;
        }
        Cg ampm = new Cg(m۱۸۰۶۳b(0), m۱۸۰۶۳b(1));
        Cg firstDigit4 = new Cg(8);
        this.f۱۵۱۰۲D.m۱۸۰۸۲a(firstDigit4);
        firstDigit4.m۱۸۰۸۲a(ampm);
        Cg secondDigit5 = new Cg(7, 8, 9);
        firstDigit4.m۱۸۰۸۲a(secondDigit5);
        secondDigit5.m۱۸۰۸۲a(ampm);
        Cg thirdDigit = new Cg(7, 8, 9, 10, 11, 12);
        secondDigit5.m۱۸۰۸۲a(thirdDigit);
        thirdDigit.m۱۸۰۸۲a(ampm);
        Cg fourthDigit = new Cg(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        thirdDigit.m۱۸۰۸۲a(fourthDigit);
        fourthDigit.m۱۸۰۸۲a(ampm);
        Cg thirdDigit2 = new Cg(13, 14, 15, 16);
        secondDigit5.m۱۸۰۸۲a(thirdDigit2);
        thirdDigit2.m۱۸۰۸۲a(ampm);
        Cg secondDigit6 = new Cg(10, 11, 12);
        firstDigit4.m۱۸۰۸۲a(secondDigit6);
        Cg thirdDigit3 = new Cg(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        secondDigit6.m۱۸۰۸۲a(thirdDigit3);
        thirdDigit3.m۱۸۰۸۲a(ampm);
        Cg firstDigit5 = new Cg(9, 10, 11, 12, 13, 14, 15, 16);
        this.f۱۵۱۰۲D.m۱۸۰۸۲a(firstDigit5);
        firstDigit5.m۱۸۰۸۲a(ampm);
        Cg secondDigit7 = new Cg(7, 8, 9, 10, 11, 12);
        firstDigit5.m۱۸۰۸۲a(secondDigit7);
        Cg thirdDigit4 = new Cg(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        secondDigit7.m۱۸۰۸۲a(thirdDigit4);
        thirdDigit4.m۱۸۰۸۲a(ampm);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.time.e$g  reason: invalid class name */
    public static class Cg {

        /* renamed from: a  reason: contains not printable characters */
        private int[] f۱۵۱۳۹a;

        /* renamed from: b  reason: contains not printable characters */
        private ArrayList<Cg> f۱۵۱۴۰b = new ArrayList<>();

        public Cg(int... legalKeys) {
            this.f۱۵۱۳۹a = legalKeys;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۰۸۲a(Cg child) {
            this.f۱۵۱۴۰b.add(child);
        }

        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۸۰۸۳b(int key) {
            int i = 0;
            while (true) {
                int[] iArr = this.f۱۵۱۳۹a;
                if (i >= iArr.length) {
                    return false;
                }
                if (iArr[i] == key) {
                    return true;
                }
                i++;
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cg m۱۸۰۸۱a(int key) {
            ArrayList<Cg> arrayList = this.f۱۵۱۴۰b;
            if (arrayList == null) {
                return null;
            }
            Iterator i$ = arrayList.iterator();
            while (i$.hasNext()) {
                Cg child = i$.next();
                if (child.m۱۸۰۸۳b(key)) {
                    return child;
                }
            }
            return null;
        }
    }

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.time.e$f  reason: invalid class name */
    private class View$OnKeyListenerCf implements View.OnKeyListener {
        private View$OnKeyListenerCf() {
        }

        /* synthetic */ View$OnKeyListenerCf(DialogFragmentCe x0, View$OnClickListenerCa x1) {
            this();
        }

        public boolean onKey(View v, int keyCode, KeyEvent event) {
            if (event.getAction() == 1) {
                return DialogFragmentCe.this.m۱۸۰۷۳d((DialogFragmentCe) keyCode);
            }
            return false;
        }
    }
}
