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
import com.mohamadamin.persianmaterialdatetimepicker.date.d;
import com.mohamadamin.persianmaterialdatetimepicker.e;
import com.mohamadamin.persianmaterialdatetimepicker.f;
import com.mohamadamin.persianmaterialdatetimepicker.g;
import com.mohamadamin.persianmaterialdatetimepicker.h;
import com.mohamadamin.persianmaterialdatetimepicker.i;
import java.util.HashSet;
import java.util.Iterator;

public class b extends DialogFragment implements View.OnClickListener, a {
    private String A;
    private String B;
    private String C;
    private String D;

    /* renamed from: c  reason: collision with root package name */
    private final com.mohamadamin.persianmaterialdatetimepicker.j.b f۳۳۲۰c = new com.mohamadamin.persianmaterialdatetimepicker.j.b();

    /* renamed from: d  reason: collision with root package name */
    private d f۳۳۲۱d;

    /* renamed from: e  reason: collision with root package name */
    private HashSet<c> f۳۳۲۲e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private DialogInterface.OnCancelListener f۳۳۲۳f;

    /* renamed from: g  reason: collision with root package name */
    private DialogInterface.OnDismissListener f۳۳۲۴g;

    /* renamed from: h  reason: collision with root package name */
    private AccessibleDateAnimator f۳۳۲۵h;
    private TextView i;
    private LinearLayout j;
    private TextView k;
    private TextView l;
    private TextView m;
    private c n;
    private i o;
    private int p = -1;
    private int q = 7;
    private int r = 1350;
    private int s = 1450;
    private com.mohamadamin.persianmaterialdatetimepicker.j.b t;
    private com.mohamadamin.persianmaterialdatetimepicker.j.b u;
    private com.mohamadamin.persianmaterialdatetimepicker.j.b[] v;
    private com.mohamadamin.persianmaterialdatetimepicker.j.b[] w;
    private boolean x;
    private com.mohamadamin.persianmaterialdatetimepicker.a y;
    private boolean z = true;

    public interface c {
        void a();
    }

    public interface d {
        void a(b bVar, int i, int i2, int i3);
    }

    public static b b(d callBack, int year, int monthOfYear, int dayOfMonth) {
        b ret = new b();
        ret.a(callBack, year, monthOfYear, dayOfMonth);
        return ret;
    }

    public void a(d callBack, int year, int monthOfYear, int dayOfMonth) {
        this.f۳۳۲۱d = callBack;
        this.f۳۳۲۰c.a(year, monthOfYear, dayOfMonth);
        this.x = false;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().getWindow().setSoftInputMode(3);
        if (savedInstanceState != null) {
            this.f۳۳۲۰c.a(savedInstanceState.getInt("year"), savedInstanceState.getInt("month"), savedInstanceState.getInt("day"));
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
        throw new UnsupportedOperationException("Method not decompiled: com.mohamadamin.persianmaterialdatetimepicker.date.b.onSaveInstanceState(android.os.Bundle):void");
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("DatePickerDialog", "onCreateView: ");
        getDialog().getWindow().requestFeature(1);
        View view = inflater.inflate(f.mdtp_date_picker_dialog, (ViewGroup) null);
        this.i = (TextView) view.findViewById(e.date_picker_header);
        this.j = (LinearLayout) view.findViewById(e.date_picker_month_and_day);
        this.j.setOnClickListener(this);
        this.k = (TextView) view.findViewById(e.date_picker_month);
        this.l = (TextView) view.findViewById(e.date_picker_day);
        this.m = (TextView) view.findViewById(e.date_picker_year);
        this.m.setOnClickListener(this);
        int listPosition = -1;
        int listPositionOffset = 0;
        int currentView = 0;
        if (savedInstanceState != null) {
            this.q = savedInstanceState.getInt("week_start");
            this.r = savedInstanceState.getInt("year_start");
            this.s = savedInstanceState.getInt("year_end");
            currentView = savedInstanceState.getInt("current_view");
            listPosition = savedInstanceState.getInt("list_position");
            listPositionOffset = savedInstanceState.getInt("list_position_offset");
            this.t = (com.mohamadamin.persianmaterialdatetimepicker.j.b) savedInstanceState.getSerializable("min_date");
            this.u = (com.mohamadamin.persianmaterialdatetimepicker.j.b) savedInstanceState.getSerializable("max_date");
            this.v = (com.mohamadamin.persianmaterialdatetimepicker.j.b[]) savedInstanceState.getSerializable("highlighted_days");
            this.w = (com.mohamadamin.persianmaterialdatetimepicker.j.b[]) savedInstanceState.getSerializable("selectable_days");
            this.x = savedInstanceState.getBoolean("theme_dark");
        }
        Activity activity = getActivity();
        this.n = new f(activity, this);
        this.o = new i(activity, this);
        Resources res = getResources();
        this.A = res.getString(g.mdtp_day_picker_description);
        this.B = res.getString(g.mdtp_select_day);
        this.C = res.getString(g.mdtp_year_picker_description);
        this.D = res.getString(g.mdtp_select_year);
        view.setBackgroundColor(activity.getResources().getColor(this.x ? com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_date_picker_view_animator_dark_theme : com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_date_picker_view_animator));
        this.f۳۳۲۵h = (AccessibleDateAnimator) view.findViewById(e.animator);
        this.f۳۳۲۵h.addView(this.n);
        this.f۳۳۲۵h.addView(this.o);
        this.f۳۳۲۵h.setDateMillis(this.f۳۳۲۰c.getTimeInMillis());
        Animation animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(300);
        this.f۳۳۲۵h.setInAnimation(animation);
        Animation animation2 = new AlphaAnimation(1.0f, 0.0f);
        animation2.setDuration(300);
        this.f۳۳۲۵h.setOutAnimation(animation2);
        Button okButton = (Button) view.findViewById(e.ok);
        okButton.setOnClickListener(new a());
        okButton.setTypeface(h.a(activity, "Roboto-Medium"));
        Button cancelButton = (Button) view.findViewById(e.cancel);
        cancelButton.setOnClickListener(new View$OnClickListenerC۰۱۰۸b());
        cancelButton.setTypeface(h.a(activity, "Roboto-Medium"));
        cancelButton.setVisibility(isCancelable() ? 0 : 8);
        a(false);
        b(currentView);
        if (listPosition != -1) {
            if (currentView == 0) {
                this.n.a(listPosition);
            } else if (currentView == 1) {
                this.o.a(listPosition, listPositionOffset);
            }
        }
        this.y = new com.mohamadamin.persianmaterialdatetimepicker.a(activity);
        return view;
    }

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View v) {
            b.this.h();
            if (b.this.f۳۳۲۱d != null) {
                d dVar = b.this.f۳۳۲۱d;
                b bVar = b.this;
                dVar.a(bVar, bVar.f۳۳۲۰c.h(), b.this.f۳۳۲۰c.d(), b.this.f۳۳۲۰c.b());
            }
            b.this.dismiss();
        }
    }

    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.date.b$b  reason: collision with other inner class name */
    class View$OnClickListenerC۰۱۰۸b implements View.OnClickListener {
        View$OnClickListenerC۰۱۰۸b() {
        }

        public void onClick(View v) {
            b.this.h();
            b.this.getDialog().cancel();
        }
    }

    public void onResume() {
        super.onResume();
        this.y.a();
    }

    public void onPause() {
        super.onPause();
        this.y.b();
    }

    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        DialogInterface.OnCancelListener onCancelListener = this.f۳۳۲۳f;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialog);
        }
    }

    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        DialogInterface.OnDismissListener onDismissListener = this.f۳۳۲۴g;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialog);
        }
    }

    private void b(int viewIndex) {
        if (viewIndex == 0) {
            ObjectAnimator pulseAnimator = i.a(this.j, 0.9f, 1.05f);
            if (this.z) {
                pulseAnimator.setStartDelay(500);
                this.z = false;
            }
            this.n.a();
            if (this.p != viewIndex) {
                this.j.setSelected(true);
                this.m.setSelected(false);
                this.f۳۳۲۵h.setDisplayedChild(0);
                this.p = viewIndex;
            }
            pulseAnimator.start();
            String dayString = com.mohamadamin.persianmaterialdatetimepicker.j.a.b(this.f۳۳۲۰c.c());
            AccessibleDateAnimator accessibleDateAnimator = this.f۳۳۲۵h;
            accessibleDateAnimator.setContentDescription(this.A + ": " + dayString);
            i.a(this.f۳۳۲۵h, this.B);
        } else if (viewIndex == 1) {
            ObjectAnimator pulseAnimator2 = i.a(this.m, 0.85f, 1.1f);
            if (this.z) {
                pulseAnimator2.setStartDelay(500);
                this.z = false;
            }
            this.o.a();
            if (this.p != viewIndex) {
                this.j.setSelected(false);
                this.m.setSelected(true);
                this.f۳۳۲۵h.setDisplayedChild(1);
                this.p = viewIndex;
            }
            pulseAnimator2.start();
            String yearString = com.mohamadamin.persianmaterialdatetimepicker.j.a.b(String.valueOf(this.f۳۳۲۰c.h()));
            AccessibleDateAnimator accessibleDateAnimator2 = this.f۳۳۲۵h;
            accessibleDateAnimator2.setContentDescription(this.C + ": " + yearString);
            i.a(this.f۳۳۲۵h, this.D);
        }
    }

    private void a(boolean announce) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(this.f۳۳۲۰c.g());
        }
        this.k.setText(com.mohamadamin.persianmaterialdatetimepicker.j.a.b(this.f۳۳۲۰c.e()));
        this.l.setText(com.mohamadamin.persianmaterialdatetimepicker.j.a.b(String.valueOf(this.f۳۳۲۰c.b())));
        this.m.setText(com.mohamadamin.persianmaterialdatetimepicker.j.a.b(String.valueOf(this.f۳۳۲۰c.h())));
        this.f۳۳۲۵h.setDateMillis(this.f۳۳۲۰c.getTimeInMillis());
        this.j.setContentDescription(com.mohamadamin.persianmaterialdatetimepicker.j.a.b(this.f۳۳۲۰c.e() + " " + this.f۳۳۲۰c.b()));
        if (announce) {
            i.a(this.f۳۳۲۵h, com.mohamadamin.persianmaterialdatetimepicker.j.a.b(this.f۳۳۲۰c.c()));
        }
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.a
    public boolean f() {
        return this.x;
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.a
    public com.mohamadamin.persianmaterialdatetimepicker.j.b j() {
        return this.t;
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.a
    public com.mohamadamin.persianmaterialdatetimepicker.j.b c() {
        return this.u;
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.a
    public com.mohamadamin.persianmaterialdatetimepicker.j.b[] g() {
        return this.v;
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.a
    public com.mohamadamin.persianmaterialdatetimepicker.j.b[] d() {
        return this.w;
    }

    private void a(int month, int year) {
    }

    public void onClick(View v2) {
        h();
        if (v2.getId() == e.date_picker_year) {
            b(1);
        } else if (v2.getId() == e.date_picker_month_and_day) {
            b(0);
        }
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.a
    public void a(int year) {
        a(this.f۳۳۲۰c.d(), year);
        com.mohamadamin.persianmaterialdatetimepicker.j.b bVar = this.f۳۳۲۰c;
        bVar.a(year, bVar.d(), this.f۳۳۲۰c.b());
        k();
        b(0);
        a(true);
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.a
    public void a(int year, int month, int day) {
        this.f۳۳۲۰c.a(year, month, day);
        k();
        a(true);
    }

    private void k() {
        Iterator i$ = this.f۳۳۲۲e.iterator();
        while (i$.hasNext()) {
            i$.next().a();
        }
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.a
    public d.a e() {
        return new d.a(this.f۳۳۲۰c);
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.a
    public int a() {
        com.mohamadamin.persianmaterialdatetimepicker.j.b[] bVarArr = this.w;
        if (bVarArr != null) {
            return bVarArr[0].h();
        }
        com.mohamadamin.persianmaterialdatetimepicker.j.b bVar = this.t;
        return (bVar == null || bVar.h() <= this.r) ? this.r : this.t.h();
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.a
    public int i() {
        com.mohamadamin.persianmaterialdatetimepicker.j.b[] bVarArr = this.w;
        if (bVarArr != null) {
            return bVarArr[bVarArr.length - 1].h();
        }
        com.mohamadamin.persianmaterialdatetimepicker.j.b bVar = this.u;
        return (bVar == null || bVar.h() >= this.s) ? this.s : this.u.h();
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.a
    public int b() {
        return this.q;
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.a
    public void a(c listener) {
        this.f۳۳۲۲e.add(listener);
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.a
    public void h() {
        this.y.c();
    }
}
