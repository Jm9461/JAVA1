package com.mohamadamin.persianmaterialdatetimepicker.date;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mohamadamin.persianmaterialdatetimepicker.Ca;
import com.mohamadamin.persianmaterialdatetimepicker.Ce;
import com.mohamadamin.persianmaterialdatetimepicker.Cf;
import com.mohamadamin.persianmaterialdatetimepicker.Cg;
import com.mohamadamin.persianmaterialdatetimepicker.Ch;
import com.mohamadamin.persianmaterialdatetimepicker.Ci;
import com.mohamadamin.persianmaterialdatetimepicker.date.AbstractCd;
import com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Cb;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.mohamadamin.persianmaterialdatetimepicker.date.b  reason: invalid class name */
public class DialogFragmentCb extends DialogFragment implements View.OnClickListener, AbstractCa {

    /* renamed from: A  reason: contains not printable characters */
    private String f۱۴۸۶۷A;

    /* renamed from: B  reason: contains not printable characters */
    private String f۱۴۸۶۸B;

    /* renamed from: C  reason: contains not printable characters */
    private String f۱۴۸۶۹C;

    /* renamed from: D  reason: contains not printable characters */
    private String f۱۴۸۷۰D;

    /* renamed from: c  reason: contains not printable characters */
    private final Cb f۱۴۸۷۱c = new Cb();

    /* renamed from: d  reason: contains not printable characters */
    private AbstractCd f۱۴۸۷۲d;

    /* renamed from: e  reason: contains not printable characters */
    private HashSet<AbstractCc> f۱۴۸۷۳e = new HashSet<>();

    /* renamed from: f  reason: contains not printable characters */
    private DialogInterface.OnCancelListener f۱۴۸۷۴f;

    /* renamed from: g  reason: contains not printable characters */
    private DialogInterface.OnDismissListener f۱۴۸۷۵g;

    /* renamed from: h  reason: contains not printable characters */
    private AccessibleDateAnimator f۱۴۸۷۶h;

    /* renamed from: i  reason: contains not printable characters */
    private TextView f۱۴۸۷۷i;

    /* renamed from: j  reason: contains not printable characters */
    private LinearLayout f۱۴۸۷۸j;

    /* renamed from: k  reason: contains not printable characters */
    private TextView f۱۴۸۷۹k;

    /* renamed from: l  reason: contains not printable characters */
    private TextView f۱۴۸۸۰l;

    /* renamed from: m  reason: contains not printable characters */
    private TextView f۱۴۸۸۱m;

    /* renamed from: n  reason: contains not printable characters */
    private AbstractCc f۱۴۸۸۲n;

    /* renamed from: o  reason: contains not printable characters */
    private Ci f۱۴۸۸۳o;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۴۸۸۴p = -1;

    /* renamed from: q  reason: contains not printable characters */
    private int f۱۴۸۸۵q = 7;

    /* renamed from: r  reason: contains not printable characters */
    private int f۱۴۸۸۶r = 1350;

    /* renamed from: s  reason: contains not printable characters */
    private int f۱۴۸۸۷s = 1450;

    /* renamed from: t  reason: contains not printable characters */
    private Cb f۱۴۸۸۸t;

    /* renamed from: u  reason: contains not printable characters */
    private Cb f۱۴۸۸۹u;

    /* renamed from: v  reason: contains not printable characters */
    private Cb[] f۱۴۸۹۰v;

    /* renamed from: w  reason: contains not printable characters */
    private Cb[] f۱۴۸۹۱w;

    /* renamed from: x  reason: contains not printable characters */
    private boolean f۱۴۸۹۲x;

    /* renamed from: y  reason: contains not printable characters */
    private Ca f۱۴۸۹۳y;

    /* renamed from: z  reason: contains not printable characters */
    private boolean f۱۴۸۹۴z = true;

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.date.b$c  reason: invalid class name */
    public interface AbstractCc {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۷۹۳۰a();
    }

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.date.b$d  reason: invalid class name */
    public interface AbstractCd {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۷۹۳۱a(DialogFragmentCb bVar, int i, int i2, int i3);
    }

    /* renamed from: b  reason: contains not printable characters */
    public static DialogFragmentCb m۱۷۹۱۲b(AbstractCd callBack, int year, int monthOfYear, int dayOfMonth) {
        DialogFragmentCb ret = new DialogFragmentCb();
        ret.m۱۷۹۲۰a(callBack, year, monthOfYear, dayOfMonth);
        return ret;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۹۲۰a(AbstractCd callBack, int year, int monthOfYear, int dayOfMonth) {
        this.f۱۴۸۷۲d = callBack;
        this.f۱۴۸۷۱c.m۱۸۰۰۶a(year, monthOfYear, dayOfMonth);
        this.f۱۴۸۹۲x = false;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().getWindow().setSoftInputMode(3);
        if (savedInstanceState != null) {
            this.f۱۴۸۷۱c.m۱۸۰۰۶a(savedInstanceState.getInt("year"), savedInstanceState.getInt("month"), savedInstanceState.getInt("day"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: android.os.Bundle */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.mohamadamin.persianmaterialdatetimepicker.j.b[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.mohamadamin.persianmaterialdatetimepicker.j.b[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSaveInstanceState(android.os.Bundle r4) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mohamadamin.persianmaterialdatetimepicker.date.DialogFragmentCb.onSaveInstanceState(android.os.Bundle):void");
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("DatePickerDialog", "onCreateView: ");
        getDialog().getWindow().requestFeature(1);
        View view = inflater.inflate(Cf.mdtp_date_picker_dialog, (ViewGroup) null);
        this.f۱۴۸۷۷i = (TextView) view.findViewById(Ce.date_picker_header);
        this.f۱۴۸۷۸j = (LinearLayout) view.findViewById(Ce.date_picker_month_and_day);
        this.f۱۴۸۷۸j.setOnClickListener(this);
        this.f۱۴۸۷۹k = (TextView) view.findViewById(Ce.date_picker_month);
        this.f۱۴۸۸۰l = (TextView) view.findViewById(Ce.date_picker_day);
        this.f۱۴۸۸۱m = (TextView) view.findViewById(Ce.date_picker_year);
        this.f۱۴۸۸۱m.setOnClickListener(this);
        int listPosition = -1;
        int listPositionOffset = 0;
        int currentView = 0;
        if (savedInstanceState != null) {
            this.f۱۴۸۸۵q = savedInstanceState.getInt("week_start");
            this.f۱۴۸۸۶r = savedInstanceState.getInt("year_start");
            this.f۱۴۸۸۷s = savedInstanceState.getInt("year_end");
            currentView = savedInstanceState.getInt("current_view");
            listPosition = savedInstanceState.getInt("list_position");
            listPositionOffset = savedInstanceState.getInt("list_position_offset");
            this.f۱۴۸۸۸t = (Cb) savedInstanceState.getSerializable("min_date");
            this.f۱۴۸۸۹u = (Cb) savedInstanceState.getSerializable("max_date");
            this.f۱۴۸۹۰v = (Cb[]) savedInstanceState.getSerializable("highlighted_days");
            this.f۱۴۸۹۱w = (Cb[]) savedInstanceState.getSerializable("selectable_days");
            this.f۱۴۸۹۲x = savedInstanceState.getBoolean("theme_dark");
        }
        Activity activity = getActivity();
        this.f۱۴۸۸۲n = new Cf(activity, this);
        this.f۱۴۸۸۳o = new Ci(activity, this);
        Resources res = getResources();
        this.f۱۴۸۶۷A = res.getString(Cg.mdtp_day_picker_description);
        this.f۱۴۸۶۸B = res.getString(Cg.mdtp_select_day);
        this.f۱۴۸۶۹C = res.getString(Cg.mdtp_year_picker_description);
        this.f۱۴۸۷۰D = res.getString(Cg.mdtp_select_year);
        view.setBackgroundColor(activity.getResources().getColor(this.f۱۴۸۹۲x ? com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_date_picker_view_animator_dark_theme : com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_date_picker_view_animator));
        this.f۱۴۸۷۶h = (AccessibleDateAnimator) view.findViewById(Ce.animator);
        this.f۱۴۸۷۶h.addView(this.f۱۴۸۸۲n);
        this.f۱۴۸۷۶h.addView(this.f۱۴۸۸۳o);
        this.f۱۴۸۷۶h.setDateMillis(this.f۱۴۸۷۱c.getTimeInMillis());
        Animation animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(300);
        this.f۱۴۸۷۶h.setInAnimation(animation);
        Animation animation2 = new AlphaAnimation(1.0f, 0.0f);
        animation2.setDuration(300);
        this.f۱۴۸۷۶h.setOutAnimation(animation2);
        Button okButton = (Button) view.findViewById(Ce.f۱۴۹۷۰ok);
        okButton.setOnClickListener(new View$OnClickListenerCa());
        okButton.setTypeface(Ch.m۱۷۹۹۳a(activity, "Roboto-Medium"));
        Button cancelButton = (Button) view.findViewById(Ce.cancel);
        cancelButton.setOnClickListener(new View$OnClickListenerCb());
        cancelButton.setTypeface(Ch.m۱۷۹۹۳a(activity, "Roboto-Medium"));
        cancelButton.setVisibility(isCancelable() ? 0 : 8);
        m۱۷۹۱۱a(false);
        m۱۷۹۱۴b(currentView);
        if (listPosition != -1) {
            if (currentView == 0) {
                this.f۱۴۸۸۲n.m۱۷۹۳۷a(listPosition);
            } else if (currentView == 1) {
                this.f۱۴۸۸۳o.m۱۷۹۹۲a(listPosition, listPositionOffset);
            }
        }
        this.f۱۴۸۹۳y = new Ca(activity);
        return view;
    }

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.date.b$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {
        View$OnClickListenerCa() {
        }

        public void onClick(View v) {
            DialogFragmentCb.this.m۱۷۹۲۷h();
            if (DialogFragmentCb.this.f۱۴۸۷۲d != null) {
                AbstractCd dVar = DialogFragmentCb.this.f۱۴۸۷۲d;
                DialogFragmentCb bVar = DialogFragmentCb.this;
                dVar.m۱۷۹۳۱a(bVar, bVar.f۱۴۸۷۱c.m۱۸۰۱۳h(), DialogFragmentCb.this.f۱۴۸۷۱c.m۱۸۰۰۹d(), DialogFragmentCb.this.f۱۴۸۷۱c.m۱۸۰۰۷b());
            }
            DialogFragmentCb.this.dismiss();
        }
    }

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.date.b$b  reason: invalid class name */
    class View$OnClickListenerCb implements View.OnClickListener {
        View$OnClickListenerCb() {
        }

        public void onClick(View v) {
            DialogFragmentCb.this.m۱۷۹۲۷h();
            DialogFragmentCb.this.getDialog().cancel();
        }
    }

    public void onResume() {
        super.onResume();
        this.f۱۴۸۹۳y.m۱۷۸۹۱a();
    }

    public void onPause() {
        super.onPause();
        this.f۱۴۸۹۳y.m۱۷۸۹۲b();
    }

    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        DialogInterface.OnCancelListener onCancelListener = this.f۱۴۸۷۴f;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialog);
        }
    }

    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        DialogInterface.OnDismissListener onDismissListener = this.f۱۴۸۷۵g;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialog);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۷۹۱۴b(int viewIndex) {
        if (viewIndex == 0) {
            ObjectAnimator pulseAnimator = Ci.m۱۷۹۹۵a(this.f۱۴۸۷۸j, 0.9f, 1.05f);
            if (this.f۱۴۸۹۴z) {
                pulseAnimator.setStartDelay(500);
                this.f۱۴۸۹۴z = false;
            }
            this.f۱۴۸۸۲n.m۱۷۹۳۶a();
            if (this.f۱۴۸۸۴p != viewIndex) {
                this.f۱۴۸۷۸j.setSelected(true);
                this.f۱۴۸۸۱m.setSelected(false);
                this.f۱۴۸۷۶h.setDisplayedChild(0);
                this.f۱۴۸۸۴p = viewIndex;
            }
            pulseAnimator.start();
            String dayString = com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۱b(this.f۱۴۸۷۱c.m۱۸۰۰۸c());
            AccessibleDateAnimator accessibleDateAnimator = this.f۱۴۸۷۶h;
            accessibleDateAnimator.setContentDescription(this.f۱۴۸۶۷A + ": " + dayString);
            Ci.m۱۷۹۹۶a(this.f۱۴۸۷۶h, this.f۱۴۸۶۸B);
        } else if (viewIndex == 1) {
            ObjectAnimator pulseAnimator2 = Ci.m۱۷۹۹۵a(this.f۱۴۸۸۱m, 0.85f, 1.1f);
            if (this.f۱۴۸۹۴z) {
                pulseAnimator2.setStartDelay(500);
                this.f۱۴۸۹۴z = false;
            }
            this.f۱۴۸۸۳o.m۱۷۹۹۰a();
            if (this.f۱۴۸۸۴p != viewIndex) {
                this.f۱۴۸۷۸j.setSelected(false);
                this.f۱۴۸۸۱m.setSelected(true);
                this.f۱۴۸۷۶h.setDisplayedChild(1);
                this.f۱۴۸۸۴p = viewIndex;
            }
            pulseAnimator2.start();
            String yearString = com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۱b(String.valueOf(this.f۱۴۸۷۱c.m۱۸۰۱۳h()));
            AccessibleDateAnimator accessibleDateAnimator2 = this.f۱۴۸۷۶h;
            accessibleDateAnimator2.setContentDescription(this.f۱۴۸۶۹C + ": " + yearString);
            Ci.m۱۷۹۹۶a(this.f۱۴۸۷۶h, this.f۱۴۸۷۰D);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۷۹۱۱a(boolean announce) {
        TextView textView = this.f۱۴۸۷۷i;
        if (textView != null) {
            textView.setText(this.f۱۴۸۷۱c.m۱۸۰۱۲g());
        }
        this.f۱۴۸۷۹k.setText(com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۱b(this.f۱۴۸۷۱c.m۱۸۰۱۰e()));
        this.f۱۴۸۸۰l.setText(com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۱b(String.valueOf(this.f۱۴۸۷۱c.m۱۸۰۰۷b())));
        this.f۱۴۸۸۱m.setText(com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۱b(String.valueOf(this.f۱۴۸۷۱c.m۱۸۰۱۳h())));
        this.f۱۴۸۷۶h.setDateMillis(this.f۱۴۸۷۱c.getTimeInMillis());
        this.f۱۴۸۷۸j.setContentDescription(com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۱b(this.f۱۴۸۷۱c.m۱۸۰۱۰e() + " " + this.f۱۴۸۷۱c.m۱۸۰۰۷b()));
        if (announce) {
            Ci.m۱۷۹۹۶a(this.f۱۴۸۷۶h, com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۱b(this.f۱۴۸۷۱c.m۱۸۰۰۸c()));
        }
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.AbstractCa
    /* renamed from: f  reason: contains not printable characters */
    public boolean m۱۷۹۲۵f() {
        return this.f۱۴۸۹۲x;
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.AbstractCa
    /* renamed from: j  reason: contains not printable characters */
    public Cb m۱۷۹۲۹j() {
        return this.f۱۴۸۸۸t;
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.AbstractCa
    /* renamed from: c  reason: contains not printable characters */
    public Cb m۱۷۹۲۲c() {
        return this.f۱۴۸۸۹u;
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.AbstractCa
    /* renamed from: g  reason: contains not printable characters */
    public Cb[] m۱۷۹۲۶g() {
        return this.f۱۴۸۹۰v;
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.AbstractCa
    /* renamed from: d  reason: contains not printable characters */
    public Cb[] m۱۷۹۲۳d() {
        return this.f۱۴۸۹۱w;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۷۹۱۰a(int month, int year) {
    }

    public void onClick(View v) {
        m۱۷۹۲۷h();
        if (v.getId() == Ce.date_picker_year) {
            m۱۷۹۱۴b(1);
        } else if (v.getId() == Ce.date_picker_month_and_day) {
            m۱۷۹۱۴b(0);
        }
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۹۱۷a(int year) {
        m۱۷۹۱۰a(this.f۱۴۸۷۱c.m۱۸۰۰۹d(), year);
        Cb bVar = this.f۱۴۸۷۱c;
        bVar.m۱۸۰۰۶a(year, bVar.m۱۸۰۰۹d(), this.f۱۴۸۷۱c.m۱۸۰۰۷b());
        m۱۷۹۱۵k();
        m۱۷۹۱۴b(0);
        m۱۷۹۱۱a(true);
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۹۱۸a(int year, int month, int day) {
        this.f۱۴۸۷۱c.m۱۸۰۰۶a(year, month, day);
        m۱۷۹۱۵k();
        m۱۷۹۱۱a(true);
    }

    /* renamed from: k  reason: contains not printable characters */
    private void m۱۷۹۱۵k() {
        Iterator i$ = this.f۱۴۸۷۳e.iterator();
        while (i$.hasNext()) {
            i$.next().m۱۷۹۳۰a();
        }
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.AbstractCa
    /* renamed from: e  reason: contains not printable characters */
    public AbstractCd.Ca m۱۷۹۲۴e() {
        return new AbstractCd.Ca(this.f۱۴۸۷۱c);
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۷۹۱۶a() {
        Cb[] bVarArr = this.f۱۴۸۹۱w;
        if (bVarArr != null) {
            return bVarArr[0].m۱۸۰۱۳h();
        }
        Cb bVar = this.f۱۴۸۸۸t;
        return (bVar == null || bVar.m۱۸۰۱۳h() <= this.f۱۴۸۸۶r) ? this.f۱۴۸۸۶r : this.f۱۴۸۸۸t.m۱۸۰۱۳h();
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.AbstractCa
    /* renamed from: i  reason: contains not printable characters */
    public int m۱۷۹۲۸i() {
        Cb[] bVarArr = this.f۱۴۸۹۱w;
        if (bVarArr != null) {
            return bVarArr[bVarArr.length - 1].m۱۸۰۱۳h();
        }
        Cb bVar = this.f۱۴۸۸۹u;
        return (bVar == null || bVar.m۱۸۰۱۳h() >= this.f۱۴۸۸۷s) ? this.f۱۴۸۸۷s : this.f۱۴۸۸۹u.m۱۸۰۱۳h();
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۷۹۲۱b() {
        return this.f۱۴۸۸۵q;
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۹۱۹a(AbstractCc listener) {
        this.f۱۴۸۷۳e.add(listener);
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.AbstractCa
    /* renamed from: h  reason: contains not printable characters */
    public void m۱۷۹۲۷h() {
        this.f۱۴۸۹۳y.m۱۷۸۹۳c();
    }
}
