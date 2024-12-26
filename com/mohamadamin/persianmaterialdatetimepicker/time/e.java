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
import com.mohamadamin.persianmaterialdatetimepicker.i;
import com.mohamadamin.persianmaterialdatetimepicker.time.RadialPickerLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class e extends DialogFragment implements RadialPickerLayout.c {
    private String A;
    private boolean B;
    private ArrayList<Integer> C;
    private g D;
    private int E;
    private int F;
    private String G;
    private String H;
    private String I;
    private String J;

    /* renamed from: c  reason: collision with root package name */
    private h f۳۴۰۲c;

    /* renamed from: d  reason: collision with root package name */
    private DialogInterface.OnCancelListener f۳۴۰۳d;

    /* renamed from: e  reason: collision with root package name */
    private DialogInterface.OnDismissListener f۳۴۰۴e;

    /* renamed from: f  reason: collision with root package name */
    private com.mohamadamin.persianmaterialdatetimepicker.a f۳۴۰۵f;

    /* renamed from: g  reason: collision with root package name */
    private Button f۳۴۰۶g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f۳۴۰۷h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private View m;
    private RadialPickerLayout n;
    private int o;
    private int p;
    private String q;
    private String r;
    private boolean s;
    private int t;
    private int u;
    private boolean v;
    private String w;
    private boolean x;
    private char y;
    private String z;

    public interface h {
        void a(RadialPickerLayout radialPickerLayout, int i, int i2);
    }

    public static e b(h callback, int hourOfDay, int minute, boolean is24HourMode) {
        e ret = new e();
        ret.a(callback, hourOfDay, minute, is24HourMode);
        return ret;
    }

    public void a(h callback, int hourOfDay, int minute, boolean is24HourMode) {
        this.f۳۴۰۲c = callback;
        this.t = hourOfDay;
        this.u = minute;
        this.v = is24HourMode;
        this.B = false;
        this.w = "";
        this.x = false;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("hour_of_day") && savedInstanceState.containsKey("minute") && savedInstanceState.containsKey("is_24_hour_view")) {
            this.t = savedInstanceState.getInt("hour_of_day");
            this.u = savedInstanceState.getInt("minute");
            this.v = savedInstanceState.getBoolean("is_24_hour_view");
            this.B = savedInstanceState.getBoolean("in_kb_mode");
            this.w = savedInstanceState.getString("dialog_title");
            this.x = savedInstanceState.getBoolean("dark_theme");
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getDialog().getWindow().requestFeature(1);
        View view = inflater.inflate(com.mohamadamin.persianmaterialdatetimepicker.f.mdtp_time_picker_dialog, (ViewGroup) null);
        f keyboardListener = new f(this, null);
        view.findViewById(com.mohamadamin.persianmaterialdatetimepicker.e.time_picker_dialog).setOnKeyListener(keyboardListener);
        Resources res = getResources();
        this.G = res.getString(com.mohamadamin.persianmaterialdatetimepicker.g.mdtp_hour_picker_description);
        this.H = res.getString(com.mohamadamin.persianmaterialdatetimepicker.g.mdtp_select_hours);
        this.I = res.getString(com.mohamadamin.persianmaterialdatetimepicker.g.mdtp_minute_picker_description);
        this.J = res.getString(com.mohamadamin.persianmaterialdatetimepicker.g.mdtp_select_minutes);
        this.o = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_white);
        this.p = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_accent_color_focused);
        this.f۳۴۰۷h = (TextView) view.findViewById(com.mohamadamin.persianmaterialdatetimepicker.e.hours);
        this.f۳۴۰۷h.setOnKeyListener(keyboardListener);
        this.i = (TextView) view.findViewById(com.mohamadamin.persianmaterialdatetimepicker.e.hour_space);
        this.k = (TextView) view.findViewById(com.mohamadamin.persianmaterialdatetimepicker.e.minutes_space);
        this.j = (TextView) view.findViewById(com.mohamadamin.persianmaterialdatetimepicker.e.minutes);
        this.j.setOnKeyListener(keyboardListener);
        this.l = (TextView) view.findViewById(com.mohamadamin.persianmaterialdatetimepicker.e.ampm_label);
        this.l.setOnKeyListener(keyboardListener);
        this.q = "قبل‌ازظهر";
        this.r = "بعدازظهر";
        this.f۳۴۰۵f = new com.mohamadamin.persianmaterialdatetimepicker.a(getActivity());
        this.n = (RadialPickerLayout) view.findViewById(com.mohamadamin.persianmaterialdatetimepicker.e.time_picker);
        this.n.setOnValueSelectedListener(this);
        this.n.setOnKeyListener(keyboardListener);
        this.n.a(getActivity(), this.f۳۴۰۵f, this.t, this.u, this.v);
        int currentItemShowing = 0;
        if (savedInstanceState != null && savedInstanceState.containsKey("current_item_showing")) {
            currentItemShowing = savedInstanceState.getInt("current_item_showing");
        }
        a(currentItemShowing, false, true, true);
        this.n.invalidate();
        this.f۳۴۰۷h.setOnClickListener(new a());
        this.j.setOnClickListener(new b());
        this.f۳۴۰۶g = (Button) view.findViewById(com.mohamadamin.persianmaterialdatetimepicker.e.ok);
        this.f۳۴۰۶g.setOnClickListener(new c());
        this.f۳۴۰۶g.setOnKeyListener(keyboardListener);
        this.f۳۴۰۶g.setTypeface(com.mohamadamin.persianmaterialdatetimepicker.h.a(getDialog().getContext(), "Roboto-Medium"));
        Button mCancelButton = (Button) view.findViewById(com.mohamadamin.persianmaterialdatetimepicker.e.cancel);
        mCancelButton.setOnClickListener(new d());
        mCancelButton.setTypeface(com.mohamadamin.persianmaterialdatetimepicker.h.a(getDialog().getContext(), "Roboto-Medium"));
        mCancelButton.setVisibility(isCancelable() ? 0 : 8);
        this.m = view.findViewById(com.mohamadamin.persianmaterialdatetimepicker.e.ampm_hitspace);
        if (this.v) {
            this.l.setVisibility(8);
            RelativeLayout.LayoutParams paramsSeparator = new RelativeLayout.LayoutParams(-2, -2);
            paramsSeparator.addRule(13);
            ((TextView) view.findViewById(com.mohamadamin.persianmaterialdatetimepicker.e.separator)).setLayoutParams(paramsSeparator);
        } else {
            this.l.setVisibility(0);
            g(this.t < 12 ? 0 : 1);
            this.m.setOnClickListener(new View$OnClickListenerC۰۱۰۹e());
        }
        this.s = true;
        a(this.t, true);
        e(this.u);
        this.z = res.getString(com.mohamadamin.persianmaterialdatetimepicker.g.mdtp_time_placeholder);
        this.A = res.getString(com.mohamadamin.persianmaterialdatetimepicker.g.mdtp_deleted_key);
        this.y = this.z.charAt(0);
        this.F = -1;
        this.E = -1;
        c();
        if (this.B) {
            this.C = savedInstanceState.getIntegerArrayList("typed_times");
            f(-1);
            this.f۳۴۰۷h.invalidate();
        } else if (this.C == null) {
            this.C = new ArrayList<>();
        }
        TextView timePickerHeader = (TextView) view.findViewById(com.mohamadamin.persianmaterialdatetimepicker.e.time_picker_header);
        if (!this.w.isEmpty()) {
            timePickerHeader.setVisibility(0);
            timePickerHeader.setText(this.w);
        }
        this.n.a(getActivity().getApplicationContext(), this.x);
        res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_white);
        res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_accent_color);
        int circleBackground = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_circle_background);
        res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_line_background);
        res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_numbers_text_color);
        res.getColorStateList(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_done_text_color);
        int i2 = com.mohamadamin.persianmaterialdatetimepicker.d.mdtp_done_background_color;
        int backgroundColor = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_background_color);
        int darkBackgroundColor = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_light_gray);
        res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_dark_gray);
        int lightGray = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_light_gray);
        res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_line_dark);
        res.getColorStateList(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_done_text_color_dark);
        int i3 = com.mohamadamin.persianmaterialdatetimepicker.d.mdtp_done_background_color_dark;
        this.n.setBackgroundColor(this.x ? lightGray : circleBackground);
        view.findViewById(com.mohamadamin.persianmaterialdatetimepicker.e.time_picker_dialog).setBackgroundColor(this.x ? darkBackgroundColor : backgroundColor);
        return view;
    }

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View v) {
            e.this.a((e) 0, true, false, true);
            e.this.a();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View v) {
            e.this.a((e) 1, true, false, true);
            e.this.a();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View v) {
            if (!e.this.B || !e.this.d()) {
                e.this.a();
            } else {
                e.this.a((e) false);
            }
            if (e.this.f۳۴۰۲c != null) {
                e.this.f۳۴۰۲c.a(e.this.n, e.this.n.getHours(), e.this.n.getMinutes());
            }
            e.this.dismiss();
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        public void onClick(View v) {
            e.this.a();
            e.this.getDialog().cancel();
        }
    }

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.time.e$e  reason: collision with other inner class name */
    class View$OnClickListenerC۰۱۰۹e implements View.OnClickListener {
        View$OnClickListenerC۰۱۰۹e() {
        }

        public void onClick(View v) {
            e.this.a();
            int amOrPm = e.this.n.getIsCurrentlyAmOrPm();
            if (amOrPm == 0) {
                amOrPm = 1;
            } else if (amOrPm == 1) {
                amOrPm = 0;
            }
            e.this.g(amOrPm);
            e.this.n.setAmOrPm(amOrPm);
        }
    }

    public void onResume() {
        super.onResume();
        this.f۳۴۰۵f.a();
    }

    public void onPause() {
        super.onPause();
        this.f۳۴۰۵f.b();
    }

    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        DialogInterface.OnCancelListener onCancelListener = this.f۳۴۰۳d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialog);
        }
    }

    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        DialogInterface.OnDismissListener onDismissListener = this.f۳۴۰۴e;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialog);
        }
    }

    public void a() {
        this.f۳۴۰۵f.c();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void g(int amOrPm) {
        if (amOrPm == 0) {
            this.l.setText(this.q);
            i.a(this.n, this.q);
            this.m.setContentDescription(this.q);
        } else if (amOrPm == 1) {
            this.l.setText(this.r);
            i.a(this.n, this.r);
            this.m.setContentDescription(this.r);
        } else {
            this.l.setText(this.z);
        }
    }

    public void onSaveInstanceState(Bundle outState) {
        RadialPickerLayout radialPickerLayout = this.n;
        if (radialPickerLayout != null) {
            outState.putInt("hour_of_day", radialPickerLayout.getHours());
            outState.putInt("minute", this.n.getMinutes());
            outState.putBoolean("is_24_hour_view", this.v);
            outState.putInt("current_item_showing", this.n.getCurrentItemShowing());
            outState.putBoolean("in_kb_mode", this.B);
            if (this.B) {
                outState.putIntegerArrayList("typed_times", this.C);
            }
            outState.putString("dialog_title", this.w);
            outState.putBoolean("dark_theme", this.x);
        }
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.time.RadialPickerLayout.c
    public void a(int pickerIndex, int newValue, boolean autoAdvance) {
        if (pickerIndex == 0) {
            a(newValue, false);
            String announcement = String.format("%d", Integer.valueOf(newValue));
            if (!this.s || !autoAdvance) {
                this.n.setContentDescription(this.G + ": " + newValue);
            } else {
                a(1, true, true, false);
                announcement = announcement + ". " + this.J;
            }
            i.a(this.n, announcement);
        } else if (pickerIndex == 1) {
            e(newValue);
            this.n.setContentDescription(this.I + ": " + newValue);
        } else if (pickerIndex == 2) {
            g(newValue);
        } else if (pickerIndex == 3) {
            if (!d()) {
                this.C.clear();
            }
            a(true);
        }
    }

    private void a(int value, boolean announce) {
        String format;
        if (this.v) {
            format = "%02d";
        } else {
            format = "%d";
            value %= 12;
            if (value == 0) {
                value = 12;
            }
        }
        String text = com.mohamadamin.persianmaterialdatetimepicker.j.a.b(String.format(format, Integer.valueOf(value)));
        this.f۳۴۰۷h.setText(text);
        this.i.setText(text);
        if (announce) {
            i.a(this.n, text);
        }
    }

    private void e(int value) {
        if (value == 60) {
            value = 0;
        }
        CharSequence text = com.mohamadamin.persianmaterialdatetimepicker.j.a.b(String.format(Locale.getDefault(), "%02d", Integer.valueOf(value)));
        i.a(this.n, text);
        this.j.setText(text);
        this.k.setText(text);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(int index, boolean animateCircle, boolean delayLabelAnimate, boolean announce) {
        TextView labelToAnimate;
        this.n.a(index, animateCircle);
        if (index == 0) {
            int hours = this.n.getHours();
            if (!this.v) {
                hours %= 12;
            }
            RadialPickerLayout radialPickerLayout = this.n;
            radialPickerLayout.setContentDescription(this.G + ": " + hours);
            if (announce) {
                i.a(this.n, this.H);
            }
            labelToAnimate = this.f۳۴۰۷h;
        } else {
            int minutes = this.n.getMinutes();
            RadialPickerLayout radialPickerLayout2 = this.n;
            radialPickerLayout2.setContentDescription(this.I + ": " + minutes);
            if (announce) {
                i.a(this.n, this.J);
            }
            labelToAnimate = this.j;
        }
        int hourColor = index == 0 ? this.o : this.p;
        int minuteColor = index == 1 ? this.o : this.p;
        this.f۳۴۰۷h.setTextColor(hourColor);
        this.j.setTextColor(minuteColor);
        ObjectAnimator pulseAnimator = i.a(labelToAnimate, 0.85f, 1.1f);
        if (delayLabelAnimate) {
            pulseAnimator.setStartDelay(300);
        }
        pulseAnimator.start();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean d(int keyCode) {
        String deletedKeyStr;
        if (keyCode == 111 || keyCode == 4) {
            if (isCancelable()) {
                dismiss();
            }
            return true;
        }
        if (keyCode == 61) {
            if (this.B) {
                if (d()) {
                    a(true);
                }
                return true;
            }
        } else if (keyCode == 66) {
            if (this.B) {
                if (!d()) {
                    return true;
                }
                a(false);
            }
            h hVar = this.f۳۴۰۲c;
            if (hVar != null) {
                RadialPickerLayout radialPickerLayout = this.n;
                hVar.a(radialPickerLayout, radialPickerLayout.getHours(), this.n.getMinutes());
            }
            dismiss();
            return true;
        } else if (keyCode == 67) {
            if (this.B && !this.C.isEmpty()) {
                int deleted = b();
                if (deleted == b(0)) {
                    deletedKeyStr = this.q;
                } else if (deleted == b(1)) {
                    deletedKeyStr = this.r;
                } else {
                    deletedKeyStr = String.format("%d", Integer.valueOf(c(deleted)));
                }
                i.a(this.n, String.format(this.A, deletedKeyStr));
                b(true);
            }
        } else if (keyCode == 7 || keyCode == 8 || keyCode == 9 || keyCode == 10 || keyCode == 11 || keyCode == 12 || keyCode == 13 || keyCode == 14 || keyCode == 15 || keyCode == 16 || (!this.v && (keyCode == b(0) || keyCode == b(1)))) {
            if (this.B) {
                if (a(keyCode)) {
                    b(false);
                }
                return true;
            } else if (this.n == null) {
                Log.e("TimePickerDialog", "Unable to initiate keyboard mode, TimePicker was null.");
                return true;
            } else {
                this.C.clear();
                f(keyCode);
                return true;
            }
        }
        return false;
    }

    private void f(int keyCode) {
        if (!this.n.a(false)) {
            return;
        }
        if (keyCode == -1 || a(keyCode)) {
            this.B = true;
            this.f۳۴۰۶g.setEnabled(false);
            b(false);
        }
    }

    private boolean a(int keyCode) {
        if ((this.v && this.C.size() == 4) || (!this.v && d())) {
            return false;
        }
        this.C.add(Integer.valueOf(keyCode));
        if (!e()) {
            b();
            return false;
        }
        int val = c(keyCode);
        i.a(this.n, String.format("%d", Integer.valueOf(val)));
        if (d()) {
            if (!this.v && this.C.size() <= 3) {
                ArrayList<Integer> arrayList = this.C;
                arrayList.add(arrayList.size() - 1, 7);
                ArrayList<Integer> arrayList2 = this.C;
                arrayList2.add(arrayList2.size() - 1, 7);
            }
            this.f۳۴۰۶g.setEnabled(true);
        }
        return true;
    }

    private boolean e() {
        g node = this.D;
        Iterator i$ = this.C.iterator();
        while (i$.hasNext()) {
            node = node.a(i$.next().intValue());
            if (node == null) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean d() {
        if (this.v) {
            int[] values = a((Boolean[]) null);
            if (values[0] < 0 || values[1] < 0 || values[1] >= 60) {
                return false;
            }
            return true;
        } else if (this.C.contains(Integer.valueOf(b(0))) || this.C.contains(Integer.valueOf(b(1)))) {
            return true;
        } else {
            return false;
        }
    }

    private int b() {
        ArrayList<Integer> arrayList = this.C;
        int deleted = arrayList.remove(arrayList.size() - 1).intValue();
        if (!d()) {
            this.f۳۴۰۶g.setEnabled(false);
        }
        return deleted;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(boolean updateDisplays) {
        this.B = false;
        if (!this.C.isEmpty()) {
            int[] values = a((Boolean[]) null);
            this.n.a(values[0], values[1]);
            if (!this.v) {
                this.n.setAmOrPm(values[2]);
            }
            this.C.clear();
        }
        if (updateDisplays) {
            b(false);
            this.n.a(true);
        }
    }

    private void b(boolean allowEmptyDisplay) {
        int i2 = 0;
        if (allowEmptyDisplay || !this.C.isEmpty()) {
            Boolean[] enteredZeros = {false, false};
            int[] values = a(enteredZeros);
            String minuteFormat = "%02d";
            String hourFormat = enteredZeros[0].booleanValue() ? minuteFormat : "%2d";
            if (!enteredZeros[1].booleanValue()) {
                minuteFormat = "%2d";
            }
            String hourStr = values[0] == -1 ? this.z : String.format(hourFormat, Integer.valueOf(values[0])).replace(' ', this.y);
            String minuteStr = values[1] == -1 ? this.z : String.format(minuteFormat, Integer.valueOf(values[1])).replace(' ', this.y);
            this.f۳۴۰۷h.setText(com.mohamadamin.persianmaterialdatetimepicker.j.a.b(hourStr));
            this.i.setText(com.mohamadamin.persianmaterialdatetimepicker.j.a.b(hourStr));
            this.f۳۴۰۷h.setTextColor(this.p);
            this.j.setText(com.mohamadamin.persianmaterialdatetimepicker.j.a.b(minuteStr));
            this.k.setText(com.mohamadamin.persianmaterialdatetimepicker.j.a.b(minuteStr));
            this.j.setTextColor(this.p);
            if (!this.v) {
                g(values[2]);
                return;
            }
            return;
        }
        int hour = this.n.getHours();
        int minute = this.n.getMinutes();
        a(hour, true);
        e(minute);
        if (!this.v) {
            if (hour >= 12) {
                i2 = 1;
            }
            g(i2);
        }
        a(this.n.getCurrentItemShowing(), true, true, true);
        this.f۳۴۰۶g.setEnabled(true);
    }

    private static int c(int keyCode) {
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

    private int[] a(Boolean[] enteredZeros) {
        int amOrPm = -1;
        int startIndex = 1;
        if (!this.v && d()) {
            ArrayList<Integer> arrayList = this.C;
            int keyCode = arrayList.get(arrayList.size() - 1).intValue();
            if (keyCode == b(0)) {
                amOrPm = 0;
            } else if (keyCode == b(1)) {
                amOrPm = 1;
            }
            startIndex = 2;
        }
        int minute = -1;
        int hour = -1;
        for (int i2 = startIndex; i2 <= this.C.size(); i2++) {
            ArrayList<Integer> arrayList2 = this.C;
            int val = c(arrayList2.get(arrayList2.size() - i2).intValue());
            if (i2 == startIndex) {
                minute = val;
            } else if (i2 == startIndex + 1) {
                minute += val * 10;
                if (enteredZeros != null && val == 0) {
                    enteredZeros[1] = true;
                }
            } else if (i2 == startIndex + 2) {
                hour = val;
            } else if (i2 == startIndex + 3) {
                hour += val * 10;
                if (enteredZeros != null && val == 0) {
                    enteredZeros[0] = true;
                }
            }
        }
        return new int[]{hour, minute, amOrPm};
    }

    private int b(int amOrPm) {
        if (this.E == -1 || this.F == -1) {
            KeyCharacterMap kcm = KeyCharacterMap.load(-1);
            int i2 = 0;
            while (true) {
                if (i2 >= Math.max(this.q.length(), this.r.length())) {
                    break;
                }
                char amChar = "AM".toLowerCase(Locale.getDefault()).charAt(i2);
                char pmChar = "PM".toLowerCase(Locale.getDefault()).charAt(i2);
                if (amChar != pmChar) {
                    KeyEvent[] events = kcm.getEvents(new char[]{amChar, pmChar});
                    if (events == null || events.length != 4) {
                        Log.e("TimePickerDialog", "Unable to find keycodes for AM and PM.");
                    } else {
                        this.E = events[0].getKeyCode();
                        this.F = events[2].getKeyCode();
                    }
                } else {
                    i2++;
                }
            }
        }
        if (amOrPm == 0) {
            return this.E;
        }
        if (amOrPm == 1) {
            return this.F;
        }
        return -1;
    }

    private void c() {
        this.D = new g(new int[0]);
        if (this.v) {
            g minuteFirstDigit = new g(7, 8, 9, 10, 11, 12);
            g minuteSecondDigit = new g(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
            minuteFirstDigit.a(minuteSecondDigit);
            g firstDigit = new g(7, 8);
            this.D.a(firstDigit);
            g secondDigit = new g(7, 8, 9, 10, 11, 12);
            firstDigit.a(secondDigit);
            secondDigit.a(minuteFirstDigit);
            secondDigit.a(new g(13, 14, 15, 16));
            g secondDigit2 = new g(13, 14, 15, 16);
            firstDigit.a(secondDigit2);
            secondDigit2.a(minuteFirstDigit);
            g firstDigit2 = new g(9);
            this.D.a(firstDigit2);
            g secondDigit3 = new g(7, 8, 9, 10);
            firstDigit2.a(secondDigit3);
            secondDigit3.a(minuteFirstDigit);
            g secondDigit4 = new g(11, 12);
            firstDigit2.a(secondDigit4);
            secondDigit4.a(minuteSecondDigit);
            g firstDigit3 = new g(10, 11, 12, 13, 14, 15, 16);
            this.D.a(firstDigit3);
            firstDigit3.a(minuteFirstDigit);
            return;
        }
        g ampm = new g(b(0), b(1));
        g firstDigit4 = new g(8);
        this.D.a(firstDigit4);
        firstDigit4.a(ampm);
        g secondDigit5 = new g(7, 8, 9);
        firstDigit4.a(secondDigit5);
        secondDigit5.a(ampm);
        g thirdDigit = new g(7, 8, 9, 10, 11, 12);
        secondDigit5.a(thirdDigit);
        thirdDigit.a(ampm);
        g fourthDigit = new g(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        thirdDigit.a(fourthDigit);
        fourthDigit.a(ampm);
        g thirdDigit2 = new g(13, 14, 15, 16);
        secondDigit5.a(thirdDigit2);
        thirdDigit2.a(ampm);
        g secondDigit6 = new g(10, 11, 12);
        firstDigit4.a(secondDigit6);
        g thirdDigit3 = new g(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        secondDigit6.a(thirdDigit3);
        thirdDigit3.a(ampm);
        g firstDigit5 = new g(9, 10, 11, 12, 13, 14, 15, 16);
        this.D.a(firstDigit5);
        firstDigit5.a(ampm);
        g secondDigit7 = new g(7, 8, 9, 10, 11, 12);
        firstDigit5.a(secondDigit7);
        g thirdDigit4 = new g(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        secondDigit7.a(thirdDigit4);
        thirdDigit4.a(ampm);
    }

    /* access modifiers changed from: private */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        private int[] f۳۴۱۴a;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<g> f۳۴۱۵b = new ArrayList<>();

        public g(int... legalKeys) {
            this.f۳۴۱۴a = legalKeys;
        }

        public void a(g child) {
            this.f۳۴۱۵b.add(child);
        }

        public boolean b(int key) {
            int i = 0;
            while (true) {
                int[] iArr = this.f۳۴۱۴a;
                if (i >= iArr.length) {
                    return false;
                }
                if (iArr[i] == key) {
                    return true;
                }
                i++;
            }
        }

        public g a(int key) {
            ArrayList<g> arrayList = this.f۳۴۱۵b;
            if (arrayList == null) {
                return null;
            }
            Iterator i$ = arrayList.iterator();
            while (i$.hasNext()) {
                g child = i$.next();
                if (child.b(key)) {
                    return child;
                }
            }
            return null;
        }
    }

    private class f implements View.OnKeyListener {
        private f() {
        }

        /* synthetic */ f(e x0, a x1) {
            this();
        }

        public boolean onKey(View v, int keyCode, KeyEvent event) {
            if (event.getAction() == 1) {
                return e.this.d((e) keyCode);
            }
            return false;
        }
    }
}
