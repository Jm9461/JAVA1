package b.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import b.a.a.a;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class f extends c implements View.OnClickListener, a.c {

    /* renamed from: e  reason: collision with root package name */
    protected final d f۲۳۴۷e;

    /* renamed from: f  reason: collision with root package name */
    protected ImageView f۲۳۴۸f;

    /* renamed from: g  reason: collision with root package name */
    protected TextView f۲۳۴۹g;

    /* renamed from: h  reason: collision with root package name */
    protected TextView f۲۳۵۰h;
    EditText i;
    RecyclerView j;
    View k;
    FrameLayout l;
    ProgressBar m;
    TextView n;
    TextView o;
    TextView p;
    CheckBox q;
    MDButton r;
    MDButton s;
    MDButton t;
    l u;
    List<Integer> v;

    @Deprecated
    public static abstract class e {
        @Deprecated
        public abstract void a(f fVar);

        @Deprecated
        public abstract void b(f fVar);

        @Deprecated
        public abstract void c(f fVar);

        @Deprecated
        public abstract void d(f fVar);
    }

    public interface g {
        void a(f fVar, CharSequence charSequence);
    }

    public interface h {
        void a(f fVar, View view, int i, CharSequence charSequence);
    }

    public interface i {
        boolean a(f fVar, Integer[] numArr, CharSequence[] charSequenceArr);
    }

    public interface j {
        boolean a(f fVar, View view, int i, CharSequence charSequence);
    }

    public interface k {
        boolean a(f fVar, View view, int i, CharSequence charSequence);
    }

    public interface m {
        void a(f fVar, b bVar);
    }

    @SuppressLint({"InflateParams"})
    protected f(d builder) {
        super(builder.f۲۳۵۷a, d.b(builder));
        new Handler();
        this.f۲۳۴۷e = builder;
        this.f۲۳۳۹c = (MDRootLayout) LayoutInflater.from(builder.f۲۳۵۷a).inflate(d.a(builder), (ViewGroup) null);
        d.a(this);
    }

    public final d c() {
        return this.f۲۳۴۷e;
    }

    public final void a(TextView target, Typeface t2) {
        if (t2 != null) {
            target.setPaintFlags(target.getPaintFlags() | 128);
            target.setTypeface(t2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        RecyclerView recyclerView = this.j;
        if (recyclerView != null) {
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new a());
        }
    }

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            int selectedIndex;
            if (Build.VERSION.SDK_INT < 16) {
                f.this.j.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else {
                f.this.j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            l lVar = f.this.u;
            if (lVar == l.SINGLE || lVar == l.MULTI) {
                f fVar = f.this;
                if (fVar.u == l.SINGLE) {
                    d dVar = fVar.f۲۳۴۷e;
                    if (dVar.O >= 0) {
                        selectedIndex = dVar.O;
                    } else {
                        return;
                    }
                } else {
                    List<Integer> list = fVar.v;
                    if (list != null && list.size() != 0) {
                        Collections.sort(f.this.v);
                        selectedIndex = f.this.v.get(0).intValue();
                    } else {
                        return;
                    }
                }
                f.this.j.post(new RunnableC۰۰۴۲a(selectedIndex));
            }
        }

        /* renamed from: b.a.a.f$a$a  reason: collision with other inner class name */
        class RunnableC۰۰۴۲a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f۲۳۵۲c;

            RunnableC۰۰۴۲a(int i) {
                this.f۲۳۵۲c = i;
            }

            public void run() {
                f.this.j.requestFocus();
                f.this.f۲۳۴۷e.Y.h(this.f۲۳۵۲c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        if (this.j != null) {
            ArrayList<CharSequence> arrayList = this.f۲۳۴۷e.l;
            if ((arrayList != null && arrayList.size() != 0) || this.f۲۳۴۷e.X != null) {
                d dVar = this.f۲۳۴۷e;
                if (dVar.Y == null) {
                    dVar.Y = new LinearLayoutManager(getContext());
                }
                if (this.j.getLayoutManager() == null) {
                    this.j.setLayoutManager(this.f۲۳۴۷e.Y);
                }
                this.j.setAdapter(this.f۲۳۴۷e.X);
                if (this.u != null) {
                    ((a) this.f۲۳۴۷e.X).a(this);
                }
            }
        }
    }

    @Override // b.a.a.a.c
    public boolean a(f dialog, View view, int position, CharSequence text, boolean longPress) {
        d dVar;
        k kVar;
        d dVar2;
        h hVar;
        if (!view.isEnabled()) {
            return false;
        }
        l lVar = this.u;
        if (lVar == null || lVar == l.REGULAR) {
            if (this.f۲۳۴۷e.R) {
                dismiss();
            }
            if (!longPress && (hVar = (dVar2 = this.f۲۳۴۷e).E) != null) {
                hVar.a(this, view, position, dVar2.l.get(position));
            }
            if (longPress && (kVar = (dVar = this.f۲۳۴۷e).F) != null) {
                return kVar.a(this, view, position, dVar.l.get(position));
            }
        } else if (lVar == l.MULTI) {
            CheckBox cb = (CheckBox) view.findViewById(k.md_control);
            if (!cb.isEnabled()) {
                return false;
            }
            if (!this.v.contains(Integer.valueOf(position))) {
                this.v.add(Integer.valueOf(position));
                if (!this.f۲۳۴۷e.I) {
                    cb.setChecked(true);
                } else if (j()) {
                    cb.setChecked(true);
                } else {
                    this.v.remove(Integer.valueOf(position));
                }
            } else {
                this.v.remove(Integer.valueOf(position));
                if (!this.f۲۳۴۷e.I) {
                    cb.setChecked(false);
                } else if (j()) {
                    cb.setChecked(false);
                } else {
                    this.v.add(Integer.valueOf(position));
                }
            }
        } else if (lVar == l.SINGLE) {
            RadioButton radio = (RadioButton) view.findViewById(k.md_control);
            if (!radio.isEnabled()) {
                return false;
            }
            boolean allowSelection = true;
            d dVar3 = this.f۲۳۴۷e;
            int oldSelected = dVar3.O;
            if (!dVar3.R || dVar3.m != null) {
                d dVar4 = this.f۲۳۴۷e;
                if (dVar4.J) {
                    dVar4.O = position;
                    allowSelection = b(view);
                    this.f۲۳۴۷e.O = oldSelected;
                }
            } else {
                dismiss();
                allowSelection = false;
                this.f۲۳۴۷e.O = position;
                b(view);
            }
            if (allowSelection) {
                this.f۲۳۴۷e.O = position;
                radio.setChecked(true);
                this.f۲۳۴۷e.X.c(oldSelected);
                this.f۲۳۴۷e.X.c(position);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Drawable f() {
        d dVar = this.f۲۳۴۷e;
        if (dVar.K0 != 0) {
            return android.support.v4.content.e.f.a(dVar.f۲۳۵۷a.getResources(), this.f۲۳۴۷e.K0, null);
        }
        Drawable d2 = b.a.a.r.a.g(dVar.f۲۳۵۷a, g.md_list_selector);
        if (d2 != null) {
            return d2;
        }
        return b.a.a.r.a.g(getContext(), g.md_list_selector);
    }

    /* access modifiers changed from: package-private */
    public Drawable a(b which, boolean isStacked) {
        if (isStacked) {
            d dVar = this.f۲۳۴۷e;
            if (dVar.L0 != 0) {
                return android.support.v4.content.e.f.a(dVar.f۲۳۵۷a.getResources(), this.f۲۳۴۷e.L0, null);
            }
            Drawable d2 = b.a.a.r.a.g(dVar.f۲۳۵۷a, g.md_btn_stacked_selector);
            if (d2 != null) {
                return d2;
            }
            return b.a.a.r.a.g(getContext(), g.md_btn_stacked_selector);
        }
        int i2 = c.f۲۳۵۵a[which.ordinal()];
        if (i2 == 1) {
            d dVar2 = this.f۲۳۴۷e;
            if (dVar2.N0 != 0) {
                return android.support.v4.content.e.f.a(dVar2.f۲۳۵۷a.getResources(), this.f۲۳۴۷e.N0, null);
            }
            Drawable d3 = b.a.a.r.a.g(dVar2.f۲۳۵۷a, g.md_btn_neutral_selector);
            if (d3 != null) {
                return d3;
            }
            Drawable d4 = b.a.a.r.a.g(getContext(), g.md_btn_neutral_selector);
            if (Build.VERSION.SDK_INT >= 21) {
                b.a.a.r.b.a(d4, this.f۲۳۴۷e.f۲۳۶۴h);
            }
            return d4;
        } else if (i2 != 2) {
            d dVar3 = this.f۲۳۴۷e;
            if (dVar3.M0 != 0) {
                return android.support.v4.content.e.f.a(dVar3.f۲۳۵۷a.getResources(), this.f۲۳۴۷e.M0, null);
            }
            Drawable d5 = b.a.a.r.a.g(dVar3.f۲۳۵۷a, g.md_btn_positive_selector);
            if (d5 != null) {
                return d5;
            }
            Drawable d6 = b.a.a.r.a.g(getContext(), g.md_btn_positive_selector);
            if (Build.VERSION.SDK_INT >= 21) {
                b.a.a.r.b.a(d6, this.f۲۳۴۷e.f۲۳۶۴h);
            }
            return d6;
        } else {
            d dVar4 = this.f۲۳۴۷e;
            if (dVar4.O0 != 0) {
                return android.support.v4.content.e.f.a(dVar4.f۲۳۵۷a.getResources(), this.f۲۳۴۷e.O0, null);
            }
            Drawable d7 = b.a.a.r.a.g(dVar4.f۲۳۵۷a, g.md_btn_negative_selector);
            if (d7 != null) {
                return d7;
            }
            Drawable d8 = b.a.a.r.a.g(getContext(), g.md_btn_negative_selector);
            if (Build.VERSION.SDK_INT >= 21) {
                b.a.a.r.b.a(d8, this.f۲۳۴۷e.f۲۳۶۴h);
            }
            return d8;
        }
    }

    private boolean b(View v2) {
        d dVar = this.f۲۳۴۷e;
        if (dVar.G == null) {
            return false;
        }
        CharSequence text = null;
        int i2 = dVar.O;
        if (i2 >= 0 && i2 < dVar.l.size()) {
            d dVar2 = this.f۲۳۴۷e;
            text = dVar2.l.get(dVar2.O);
        }
        d dVar3 = this.f۲۳۴۷e;
        return dVar3.G.a(this, v2, dVar3.O, text);
    }

    private boolean j() {
        if (this.f۲۳۴۷e.H == null) {
            return false;
        }
        Collections.sort(this.v);
        List<CharSequence> selectedTitles = new ArrayList<>();
        for (Integer i2 : this.v) {
            if (i2.intValue() >= 0 && i2.intValue() <= this.f۲۳۴۷e.l.size() - 1) {
                selectedTitles.add(this.f۲۳۴۷e.l.get(i2.intValue()));
            }
        }
        i iVar = this.f۲۳۴۷e.H;
        List<Integer> list = this.v;
        return iVar.a(this, (Integer[]) list.toArray(new Integer[list.size()]), (CharSequence[]) selectedTitles.toArray(new CharSequence[selectedTitles.size()]));
    }

    public final void onClick(View v2) {
        EditText editText;
        b tag = (b) v2.getTag();
        int i2 = c.f۲۳۵۵a[tag.ordinal()];
        if (i2 == 1) {
            e eVar = this.f۲۳۴۷e.z;
            if (eVar != null) {
                eVar.a(this);
                this.f۲۳۴۷e.z.c(this);
            }
            m mVar = this.f۲۳۴۷e.C;
            if (mVar != null) {
                mVar.a(this, tag);
            }
            if (this.f۲۳۴۷e.R) {
                dismiss();
            }
        } else if (i2 == 2) {
            e eVar2 = this.f۲۳۴۷e.z;
            if (eVar2 != null) {
                eVar2.a(this);
                this.f۲۳۴۷e.z.b(this);
            }
            m mVar2 = this.f۲۳۴۷e.B;
            if (mVar2 != null) {
                mVar2.a(this, tag);
            }
            if (this.f۲۳۴۷e.R) {
                cancel();
            }
        } else if (i2 == 3) {
            e eVar3 = this.f۲۳۴۷e.z;
            if (eVar3 != null) {
                eVar3.a(this);
                this.f۲۳۴۷e.z.d(this);
            }
            m mVar3 = this.f۲۳۴۷e.A;
            if (mVar3 != null) {
                mVar3.a(this, tag);
            }
            if (!this.f۲۳۴۷e.J) {
                b(v2);
            }
            if (!this.f۲۳۴۷e.I) {
                j();
            }
            d dVar = this.f۲۳۴۷e;
            g gVar = dVar.o0;
            if (!(gVar == null || (editText = this.i) == null || dVar.r0)) {
                gVar.a(this, editText.getText());
            }
            if (this.f۲۳۴۷e.R) {
                dismiss();
            }
        }
        m mVar4 = this.f۲۳۴۷e.D;
        if (mVar4 != null) {
            mVar4.a(this, tag);
        }
    }

    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException e2) {
            throw new C۰۰۴۳f("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    public final MDButton a(b which) {
        int i2 = c.f۲۳۵۵a[which.ordinal()];
        if (i2 == 1) {
            return this.s;
        }
        if (i2 != 2) {
            return this.r;
        }
        return this.t;
    }

    public final View g() {
        return this.f۲۳۳۹c;
    }

    public final EditText e() {
        return this.i;
    }

    public final View d() {
        return this.f۲۳۴۷e.s;
    }

    public final void a(b which, CharSequence title) {
        int i2 = c.f۲۳۵۵a[which.ordinal()];
        int i3 = 8;
        if (i2 == 1) {
            this.f۲۳۴۷e.n = title;
            this.s.setText(title);
            MDButton mDButton = this.s;
            if (title != null) {
                i3 = 0;
            }
            mDButton.setVisibility(i3);
        } else if (i2 != 2) {
            this.f۲۳۴۷e.m = title;
            this.r.setText(title);
            MDButton mDButton2 = this.r;
            if (title != null) {
                i3 = 0;
            }
            mDButton2.setVisibility(i3);
        } else {
            this.f۲۳۴۷e.o = title;
            this.t.setText(title);
            MDButton mDButton3 = this.t;
            if (title != null) {
                i3 = 0;
            }
            mDButton3.setVisibility(i3);
        }
    }

    public final void a(b which, int titleRes) {
        a(which, getContext().getText(titleRes));
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence newTitle) {
        this.f۲۳۴۹g.setText(newTitle);
    }

    @Override // android.app.Dialog
    public final void setTitle(int newTitleRes) {
        setTitle(this.f۲۳۴۷e.f۲۳۵۷a.getString(newTitleRes));
    }

    @Override // b.a.a.c
    public final void onShow(DialogInterface dialog) {
        if (this.i != null) {
            b.a.a.r.a.b(this, this.f۲۳۴۷e);
            if (this.i.getText().length() > 0) {
                EditText editText = this.i;
                editText.setSelection(editText.getText().length());
            }
        }
        super.onShow(dialog);
    }

    /* access modifiers changed from: package-private */
    public void i() {
        EditText editText = this.i;
        if (editText != null) {
            editText.addTextChangedListener(new b());
        }
    }

    class b implements TextWatcher {
        b() {
        }

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
            int length = s.toString().length();
            boolean emptyDisabled = false;
            if (!f.this.f۲۳۴۷e.p0) {
                boolean z = true;
                emptyDisabled = length == 0;
                View positiveAb = f.this.a(b.POSITIVE);
                if (emptyDisabled) {
                    z = false;
                }
                positiveAb.setEnabled(z);
            }
            f.this.a(length, emptyDisabled);
            f fVar = f.this;
            d dVar = fVar.f۲۳۴۷e;
            if (dVar.r0) {
                dVar.o0.a(fVar, s);
            }
        }

        public void afterTextChanged(Editable s) {
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int currentLength, boolean emptyDisabled) {
        int i2;
        TextView textView = this.p;
        if (textView != null) {
            boolean z = true;
            if (this.f۲۳۴۷e.t0 > 0) {
                textView.setText(String.format(Locale.getDefault(), "%d/%d", Integer.valueOf(currentLength), Integer.valueOf(this.f۲۳۴۷e.t0)));
                this.p.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            boolean isDisabled = (emptyDisabled && currentLength == 0) || ((i2 = this.f۲۳۴۷e.t0) > 0 && currentLength > i2) || currentLength < this.f۲۳۴۷e.s0;
            d dVar = this.f۲۳۴۷e;
            int colorText = isDisabled ? dVar.u0 : dVar.j;
            d dVar2 = this.f۲۳۴۷e;
            int colorWidget = isDisabled ? dVar2.u0 : dVar2.t;
            if (this.f۲۳۴۷e.t0 > 0) {
                this.p.setTextColor(colorText);
            }
            com.afollestad.materialdialogs.internal.c.b(this.i, colorWidget);
            View positiveAb = a(b.POSITIVE);
            if (isDisabled) {
                z = false;
            }
            positiveAb.setEnabled(z);
        }
    }

    public void dismiss() {
        if (this.i != null) {
            b.a.a.r.a.a(this, this.f۲۳۴۷e);
        }
        super.dismiss();
    }

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f۲۳۵۵a = new int[b.values().length];

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f۲۳۵۶b = new int[l.values().length];

        static {
            try {
                f۲۳۵۶b[l.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۲۳۵۶b[l.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f۲۳۵۶b[l.MULTI.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f۲۳۵۵a[b.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f۲۳۵۵a[b.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f۲۳۵۵a[b.POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public enum l {
        REGULAR,
        SINGLE,
        MULTI;

        public static int a(l type) {
            int i = c.f۲۳۵۶b[type.ordinal()];
            if (i == 1) {
                return l.md_listitem;
            }
            if (i == 2) {
                return l.md_listitem_singlechoice;
            }
            if (i == 3) {
                return l.md_listitem_multichoice;
            }
            throw new IllegalArgumentException("Not a valid list type");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.a.a.f$f  reason: collision with other inner class name */
    public static class C۰۰۴۳f extends WindowManager.BadTokenException {
        C۰۰۴۳f(String message) {
            super(message);
        }
    }

    public static class d {
        protected m A;
        protected NumberFormat A0;
        protected m B;
        protected boolean B0;
        protected m C;
        protected boolean C0;
        protected m D;
        protected boolean D0;
        protected h E;
        protected boolean E0;
        protected k F;
        protected boolean F0;
        protected j G;
        protected boolean G0;
        protected i H;
        protected boolean H0;
        protected boolean I;
        protected boolean I0;
        protected boolean J;
        protected boolean J0;
        protected p K;
        protected int K0;
        protected boolean L;
        protected int L0;
        protected boolean M;
        protected int M0;
        protected float N;
        protected int N0;
        protected int O;
        protected int O0;
        protected Integer[] P;
        protected Integer[] Q;
        protected boolean R;
        protected Typeface S;
        protected Typeface T;
        protected Drawable U;
        protected boolean V;
        protected int W;
        protected RecyclerView.g<?> X;
        protected RecyclerView.o Y;
        protected DialogInterface.OnDismissListener Z;

        /* renamed from: a  reason: collision with root package name */
        protected final Context f۲۳۵۷a;
        protected DialogInterface.OnCancelListener a0;

        /* renamed from: b  reason: collision with root package name */
        protected CharSequence f۲۳۵۸b;
        protected DialogInterface.OnKeyListener b0;

        /* renamed from: c  reason: collision with root package name */
        protected e f۲۳۵۹c;
        protected DialogInterface.OnShowListener c0;

        /* renamed from: d  reason: collision with root package name */
        protected e f۲۳۶۰d;
        protected o d0;

        /* renamed from: e  reason: collision with root package name */
        protected e f۲۳۶۱e = e.END;
        protected boolean e0;

        /* renamed from: f  reason: collision with root package name */
        protected e f۲۳۶۲f;
        protected int f0;

        /* renamed from: g  reason: collision with root package name */
        protected e f۲۳۶۳g;
        protected int g0;

        /* renamed from: h  reason: collision with root package name */
        protected int f۲۳۶۴h;
        protected int h0;
        protected int i;
        protected boolean i0;
        protected int j;
        protected boolean j0;
        protected CharSequence k;
        protected int k0;
        protected ArrayList<CharSequence> l;
        protected int l0;
        protected CharSequence m;
        protected CharSequence m0;
        protected CharSequence n;
        protected CharSequence n0;
        protected CharSequence o;
        protected g o0;
        protected boolean p;
        protected boolean p0;
        protected boolean q;
        protected int q0;
        protected boolean r;
        protected boolean r0;
        protected View s;
        protected int s0;
        protected int t;
        protected int t0;
        protected ColorStateList u;
        protected int u0;
        protected ColorStateList v;
        protected int[] v0;
        protected ColorStateList w;
        protected CharSequence w0;
        protected ColorStateList x;
        protected boolean x0;
        protected ColorStateList y;
        protected CompoundButton.OnCheckedChangeListener y0;
        protected e z;
        protected String z0;

        public d(Context context) {
            e eVar = e.START;
            this.f۲۳۵۹c = eVar;
            this.f۲۳۶۰d = eVar;
            e eVar2 = e.START;
            this.f۲۳۶۲f = eVar2;
            this.f۲۳۶۳g = eVar2;
            this.f۲۳۶۴h = 0;
            this.i = -1;
            this.j = -1;
            this.I = false;
            this.J = false;
            this.K = p.LIGHT;
            this.L = true;
            this.M = true;
            this.N = 1.2f;
            this.O = -1;
            this.P = null;
            this.Q = null;
            this.R = true;
            this.W = -1;
            this.k0 = -2;
            this.l0 = 0;
            this.q0 = -1;
            this.s0 = -1;
            this.t0 = -1;
            this.u0 = 0;
            this.C0 = false;
            this.D0 = false;
            this.E0 = false;
            this.F0 = false;
            this.G0 = false;
            this.H0 = false;
            this.I0 = false;
            this.J0 = false;
            this.f۲۳۵۷a = context;
            this.t = b.a.a.r.a.a(context, g.colorAccent, b.a.a.r.a.c(context, h.md_material_blue_600));
            if (Build.VERSION.SDK_INT >= 21) {
                this.t = b.a.a.r.a.a(context, 16843829, this.t);
            }
            this.v = b.a.a.r.a.b(context, this.t);
            this.w = b.a.a.r.a.b(context, this.t);
            this.x = b.a.a.r.a.b(context, this.t);
            this.y = b.a.a.r.a.b(context, b.a.a.r.a.a(context, g.md_link_color, this.t));
            this.f۲۳۶۴h = b.a.a.r.a.a(context, g.md_btn_ripple_color, b.a.a.r.a.a(context, g.colorControlHighlight, Build.VERSION.SDK_INT >= 21 ? b.a.a.r.a.e(context, 16843820) : 0));
            this.A0 = NumberFormat.getPercentInstance();
            this.z0 = "%1d/%2d";
            this.K = b.a.a.r.a.a(b.a.a.r.a.e(context, 16842806)) ? p.LIGHT : p.DARK;
            d();
            this.f۲۳۵۹c = b.a.a.r.a.a(context, g.md_title_gravity, this.f۲۳۵۹c);
            this.f۲۳۶۰d = b.a.a.r.a.a(context, g.md_content_gravity, this.f۲۳۶۰d);
            this.f۲۳۶۱e = b.a.a.r.a.a(context, g.md_btnstacked_gravity, this.f۲۳۶۱e);
            this.f۲۳۶۲f = b.a.a.r.a.a(context, g.md_items_gravity, this.f۲۳۶۲f);
            this.f۲۳۶۳g = b.a.a.r.a.a(context, g.md_buttons_gravity, this.f۲۳۶۳g);
            try {
                a(b.a.a.r.a.h(context, g.md_medium_font), b.a.a.r.a.h(context, g.md_regular_font));
            } catch (Throwable th) {
            }
            if (this.T == null) {
                try {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.T = Typeface.create("sans-serif-medium", 0);
                    } else {
                        this.T = Typeface.create("sans-serif", 1);
                    }
                } catch (Throwable th2) {
                    this.T = Typeface.DEFAULT_BOLD;
                }
            }
            if (this.S == null) {
                try {
                    this.S = Typeface.create("sans-serif", 0);
                } catch (Throwable th3) {
                    this.S = Typeface.SANS_SERIF;
                    if (this.S == null) {
                        this.S = Typeface.DEFAULT;
                    }
                }
            }
        }

        public final Context b() {
            return this.f۲۳۵۷a;
        }

        private void d() {
            if (com.afollestad.materialdialogs.internal.d.a(false) != null) {
                com.afollestad.materialdialogs.internal.d s2 = com.afollestad.materialdialogs.internal.d.a();
                if (s2.f۲۷۵۳a) {
                    this.K = p.DARK;
                }
                int i2 = s2.f۲۷۵۴b;
                if (i2 != 0) {
                    this.i = i2;
                }
                int i3 = s2.f۲۷۵۵c;
                if (i3 != 0) {
                    this.j = i3;
                }
                ColorStateList colorStateList = s2.f۲۷۵۶d;
                if (colorStateList != null) {
                    this.v = colorStateList;
                }
                ColorStateList colorStateList2 = s2.f۲۷۵۷e;
                if (colorStateList2 != null) {
                    this.x = colorStateList2;
                }
                ColorStateList colorStateList3 = s2.f۲۷۵۸f;
                if (colorStateList3 != null) {
                    this.w = colorStateList3;
                }
                int i4 = s2.f۲۷۶۰h;
                if (i4 != 0) {
                    this.h0 = i4;
                }
                Drawable drawable = s2.i;
                if (drawable != null) {
                    this.U = drawable;
                }
                int i5 = s2.j;
                if (i5 != 0) {
                    this.g0 = i5;
                }
                int i6 = s2.k;
                if (i6 != 0) {
                    this.f0 = i6;
                }
                int i7 = s2.n;
                if (i7 != 0) {
                    this.L0 = i7;
                }
                int i8 = s2.m;
                if (i8 != 0) {
                    this.K0 = i8;
                }
                int i9 = s2.o;
                if (i9 != 0) {
                    this.M0 = i9;
                }
                int i10 = s2.p;
                if (i10 != 0) {
                    this.N0 = i10;
                }
                int i11 = s2.q;
                if (i11 != 0) {
                    this.O0 = i11;
                }
                int i12 = s2.f۲۷۵۹g;
                if (i12 != 0) {
                    this.t = i12;
                }
                ColorStateList colorStateList4 = s2.l;
                if (colorStateList4 != null) {
                    this.y = colorStateList4;
                }
                this.f۲۳۵۹c = s2.r;
                this.f۲۳۶۰d = s2.s;
                this.f۲۳۶۱e = s2.t;
                this.f۲۳۶۲f = s2.u;
                this.f۲۳۶۳g = s2.v;
            }
        }

        public d h(int titleRes) {
            e(this.f۲۳۵۷a.getText(titleRes));
            return this;
        }

        public d e(CharSequence title) {
            this.f۲۳۵۸b = title;
            return this;
        }

        public d d(e gravity) {
            this.f۲۳۵۹c = gravity;
            return this;
        }

        public d i(int color) {
            this.i = color;
            this.C0 = true;
            return this;
        }

        public d j(int colorRes) {
            i(b.a.a.r.a.c(this.f۲۳۵۷a, colorRes));
            return this;
        }

        public d a(String medium, String regular) {
            if (medium != null && !medium.trim().isEmpty()) {
                this.T = b.a.a.r.c.a(this.f۲۳۵۷a, medium);
                if (this.T == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + medium + "\"");
                }
            }
            if (regular != null && !regular.trim().isEmpty()) {
                this.S = b.a.a.r.c.a(this.f۲۳۵۷a, regular);
                if (this.S == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + regular + "\"");
                }
            }
            return this;
        }

        public d a(CharSequence content) {
            if (this.s == null) {
                this.k = content;
                return this;
            }
            throw new IllegalStateException("You cannot set content() when you're using a custom view.");
        }

        public d b(e gravity) {
            this.f۲۳۶۰d = gravity;
            return this;
        }

        public d a(int itemsRes) {
            a(this.f۲۳۵۷a.getResources().getTextArray(itemsRes));
            return this;
        }

        public d a(CharSequence... items) {
            if (this.s == null) {
                this.l = new ArrayList<>();
                Collections.addAll(this.l, items);
                return this;
            }
            throw new IllegalStateException("You cannot set items() when you're using a custom view.");
        }

        public d c(e gravity) {
            this.f۲۳۶۲f = gravity;
            return this;
        }

        public d a(e gravity) {
            this.f۲۳۶۳g = gravity;
            return this;
        }

        public d a(int selectedIndex, j callback) {
            this.O = selectedIndex;
            this.E = null;
            this.G = callback;
            this.H = null;
            return this;
        }

        public d g(int positiveRes) {
            if (positiveRes == 0) {
                return this;
            }
            d(this.f۲۳۵۷a.getText(positiveRes));
            return this;
        }

        public d d(CharSequence message) {
            this.m = message;
            return this;
        }

        public d f(int colorRes) {
            c(b.a.a.r.a.a(this.f۲۳۵۷a, colorRes));
            return this;
        }

        public d c(ColorStateList colorStateList) {
            this.v = colorStateList;
            this.F0 = true;
            return this;
        }

        public d e(int neutralRes) {
            if (neutralRes == 0) {
                return this;
            }
            c(this.f۲۳۵۷a.getText(neutralRes));
            return this;
        }

        public d c(CharSequence message) {
            this.n = message;
            return this;
        }

        public d b(int colorRes) {
            a(b.a.a.r.a.a(this.f۲۳۵۷a, colorRes));
            return this;
        }

        public d a(ColorStateList colorStateList) {
            this.w = colorStateList;
            this.H0 = true;
            return this;
        }

        public d c(int negativeRes) {
            if (negativeRes == 0) {
                return this;
            }
            b(this.f۲۳۵۷a.getText(negativeRes));
            return this;
        }

        public d b(CharSequence message) {
            this.o = message;
            return this;
        }

        public d d(int color) {
            b(b.a.a.r.a.b(this.f۲۳۵۷a, color));
            return this;
        }

        public d b(ColorStateList colorStateList) {
            this.x = colorStateList;
            this.G0 = true;
            return this;
        }

        public d a(int layoutRes, boolean wrapInScrollView) {
            a(LayoutInflater.from(this.f۲۳۵۷a).inflate(layoutRes, (ViewGroup) null), wrapInScrollView);
            return this;
        }

        public d a(View view, boolean wrapInScrollView) {
            if (this.k != null) {
                throw new IllegalStateException("You cannot use customView() when you have content set.");
            } else if (this.l != null) {
                throw new IllegalStateException("You cannot use customView() when you have items set.");
            } else if (this.o0 != null) {
                throw new IllegalStateException("You cannot use customView() with an input dialog");
            } else if (this.k0 > -2 || this.i0) {
                throw new IllegalStateException("You cannot use customView() with a progress dialog");
            } else {
                if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                this.s = view;
                this.e0 = wrapInScrollView;
                return this;
            }
        }

        public d c(m callback) {
            this.A = callback;
            return this;
        }

        public d a(m callback) {
            this.B = callback;
            return this;
        }

        public d b(m callback) {
            this.C = callback;
            return this;
        }

        public d a(p theme) {
            this.K = theme;
            return this;
        }

        public d a(boolean dismiss) {
            this.R = dismiss;
            return this;
        }

        public d a(DialogInterface.OnShowListener listener) {
            this.c0 = listener;
            return this;
        }

        public f a() {
            return new f(this);
        }

        public f c() {
            f dialog = a();
            dialog.show();
            return dialog;
        }
    }
}
