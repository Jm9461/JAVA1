package p۲۰۸b.p۲۰۹a.p۲۱۰a;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.support.v4.content.p۲۰۲e.Cf;
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
import com.afollestad.materialdialogs.internal.Cc;
import com.afollestad.materialdialogs.internal.Cd;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.Ca;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Cb;

/* renamed from: b.a.a.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class ViewOnClickListenerCf extends DialogCc implements View.OnClickListener, Ca.c {

    /* renamed from: e, reason: contains not printable characters */
    protected final d f۱۲۴۶۷e;

    /* renamed from: f, reason: contains not printable characters */
    protected ImageView f۱۲۴۶۸f;

    /* renamed from: g, reason: contains not printable characters */
    protected TextView f۱۲۴۶۹g;

    /* renamed from: h, reason: contains not printable characters */
    protected TextView f۱۲۴۷۰h;

    /* renamed from: i, reason: contains not printable characters */
    EditText f۱۲۴۷۱i;

    /* renamed from: j, reason: contains not printable characters */
    RecyclerView f۱۲۴۷۲j;

    /* renamed from: k, reason: contains not printable characters */
    View f۱۲۴۷۳k;

    /* renamed from: l, reason: contains not printable characters */
    FrameLayout f۱۲۴۷۴l;

    /* renamed from: m, reason: contains not printable characters */
    ProgressBar f۱۲۴۷۵m;

    /* renamed from: n, reason: contains not printable characters */
    TextView f۱۲۴۷۶n;

    /* renamed from: o, reason: contains not printable characters */
    TextView f۱۲۴۷۷o;

    /* renamed from: p, reason: contains not printable characters */
    TextView f۱۲۴۷۸p;

    /* renamed from: q, reason: contains not printable characters */
    CheckBox f۱۲۴۷۹q;

    /* renamed from: r, reason: contains not printable characters */
    MDButton f۱۲۴۸۰r;

    /* renamed from: s, reason: contains not printable characters */
    MDButton f۱۲۴۸۱s;

    /* renamed from: t, reason: contains not printable characters */
    MDButton f۱۲۴۸۲t;

    /* renamed from: u, reason: contains not printable characters */
    l f۱۲۴۸۳u;

    /* renamed from: v, reason: contains not printable characters */
    List<Integer> f۱۲۴۸۴v;

    @Deprecated
    /* renamed from: b.a.a.f$e */
    public static abstract class e {
        @Deprecated
        /* renamed from: a, reason: contains not printable characters */
        public abstract void m۱۳۸۰۷a(ViewOnClickListenerCf viewOnClickListenerCf);

        @Deprecated
        /* renamed from: b, reason: contains not printable characters */
        public abstract void m۱۳۸۰۸b(ViewOnClickListenerCf viewOnClickListenerCf);

        @Deprecated
        /* renamed from: c, reason: contains not printable characters */
        public abstract void m۱۳۸۰۹c(ViewOnClickListenerCf viewOnClickListenerCf);

        @Deprecated
        /* renamed from: d, reason: contains not printable characters */
        public abstract void m۱۳۸۱۰d(ViewOnClickListenerCf viewOnClickListenerCf);
    }

    /* renamed from: b.a.a.f$g */
    public interface g {
        /* renamed from: a, reason: contains not printable characters */
        void m۱۳۸۱۱a(ViewOnClickListenerCf viewOnClickListenerCf, CharSequence charSequence);
    }

    /* renamed from: b.a.a.f$h */
    public interface h {
        /* renamed from: a, reason: contains not printable characters */
        void m۱۳۸۱۲a(ViewOnClickListenerCf viewOnClickListenerCf, View view, int i, CharSequence charSequence);
    }

    /* renamed from: b.a.a.f$i */
    public interface i {
        /* renamed from: a, reason: contains not printable characters */
        boolean m۱۳۸۱۳a(ViewOnClickListenerCf viewOnClickListenerCf, Integer[] numArr, CharSequence[] charSequenceArr);
    }

    /* renamed from: b.a.a.f$j */
    public interface j {
        /* renamed from: a, reason: contains not printable characters */
        boolean mo۱۵۳۷۹a(ViewOnClickListenerCf viewOnClickListenerCf, View view, int i, CharSequence charSequence);
    }

    /* renamed from: b.a.a.f$k */
    public interface k {
        /* renamed from: a, reason: contains not printable characters */
        boolean m۱۳۸۱۵a(ViewOnClickListenerCf viewOnClickListenerCf, View view, int i, CharSequence charSequence);
    }

    /* renamed from: b.a.a.f$m */
    public interface m {
        /* renamed from: a, reason: contains not printable characters */
        void mo۱۵۴۰۰a(ViewOnClickListenerCf viewOnClickListenerCf, EnumCb enumCb);
    }

    @SuppressLint({"InflateParams"})
    protected ViewOnClickListenerCf(d builder) {
        super(builder.f۱۲۵۳۲a, Cd.m۱۳۷۴۸b(builder));
        new Handler();
        this.f۱۲۴۶۷e = builder;
        LayoutInflater inflater = LayoutInflater.from(builder.f۱۲۵۳۲a);
        this.f۱۲۴۵۹c = (MDRootLayout) inflater.inflate(Cd.m۱۳۷۴۵a(builder), (ViewGroup) null);
        Cd.m۱۳۷۴۷a(this);
    }

    /* renamed from: c, reason: contains not printable characters */
    public final d m۱۳۷۶۳c() {
        return this.f۱۲۴۶۷e;
    }

    /* renamed from: a, reason: contains not printable characters */
    public final void m۱۳۷۵۸a(TextView target, Typeface t) {
        if (t == null) {
            return;
        }
        int flags = target.getPaintFlags() | 128;
        target.setPaintFlags(flags);
        target.setTypeface(t);
    }

    /* renamed from: b, reason: contains not printable characters */
    final void m۱۳۷۶۲b() {
        RecyclerView recyclerView = this.f۱۲۴۷۲j;
        if (recyclerView == null) {
            return;
        }
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    /* renamed from: b.a.a.f$a */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int selectedIndex;
            if (Build.VERSION.SDK_INT < 16) {
                ViewOnClickListenerCf.this.f۱۲۴۷۲j.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else {
                ViewOnClickListenerCf.this.f۱۲۴۷۲j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            l lVar = ViewOnClickListenerCf.this.f۱۲۴۸۳u;
            if (lVar == l.SINGLE || lVar == l.MULTI) {
                ViewOnClickListenerCf viewOnClickListenerCf = ViewOnClickListenerCf.this;
                if (viewOnClickListenerCf.f۱۲۴۸۳u == l.SINGLE) {
                    d dVar = viewOnClickListenerCf.f۱۲۴۶۷e;
                    if (dVar.f۱۲۵۱۹O < 0) {
                        return;
                    } else {
                        selectedIndex = dVar.f۱۲۵۱۹O;
                    }
                } else {
                    List<Integer> list = viewOnClickListenerCf.f۱۲۴۸۴v;
                    if (list == null || list.size() == 0) {
                        return;
                    }
                    Collections.sort(ViewOnClickListenerCf.this.f۱۲۴۸۴v);
                    selectedIndex = ViewOnClickListenerCf.this.f۱۲۴۸۴v.get(0).intValue();
                }
                int fSelectedIndex = selectedIndex;
                ViewOnClickListenerCf.this.f۱۲۴۷۲j.post(new RunnableC۱۴۳۰a(fSelectedIndex));
            }
        }

        /* renamed from: b.a.a.f$a$a, reason: collision with other inner class name */
        class RunnableC۱۴۳۰a implements Runnable {

            /* renamed from: c, reason: contains not printable characters */
            final /* synthetic */ int f۱۲۴۸۶c;

            RunnableC۱۴۳۰a(int i) {
                this.f۱۲۴۸۶c = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                ViewOnClickListenerCf.this.f۱۲۴۷۲j.requestFocus();
                ViewOnClickListenerCf.this.f۱۲۴۶۷e.f۱۲۵۳۰Y.mo۱۲۷۸۷h(this.f۱۲۴۸۶c);
            }
        }
    }

    /* renamed from: h, reason: contains not printable characters */
    final void m۱۳۷۶۸h() {
        if (this.f۱۲۴۷۲j == null) {
            return;
        }
        ArrayList<CharSequence> arrayList = this.f۱۲۴۶۷e.f۱۲۵۵۴l;
        if ((arrayList == null || arrayList.size() == 0) && this.f۱۲۴۶۷e.f۱۲۵۲۹X == null) {
            return;
        }
        d dVar = this.f۱۲۴۶۷e;
        if (dVar.f۱۲۵۳۰Y == null) {
            dVar.f۱۲۵۳۰Y = new LinearLayoutManager(getContext());
        }
        if (this.f۱۲۴۷۲j.getLayoutManager() == null) {
            this.f۱۲۴۷۲j.setLayoutManager(this.f۱۲۴۶۷e.f۱۲۵۳۰Y);
        }
        this.f۱۲۴۷۲j.setAdapter(this.f۱۲۴۶۷e.f۱۲۵۲۹X);
        if (this.f۱۲۴۸۳u != null) {
            ((Ca) this.f۱۲۴۶۷e.f۱۲۵۲۹X).m۱۳۷۳۸a(this);
        }
    }

    @Override // p۲۰۸b.p۲۰۹a.p۲۱۰a.Ca.c
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۳۷۶۱a(ViewOnClickListenerCf dialog, View view, int position, CharSequence text, boolean longPress) {
        d dVar;
        k kVar;
        d dVar2;
        h hVar;
        if (!view.isEnabled()) {
            return false;
        }
        l lVar = this.f۱۲۴۸۳u;
        if (lVar == null || lVar == l.REGULAR) {
            if (this.f۱۲۴۶۷e.f۱۲۵۲۳R) {
                dismiss();
            }
            if (!longPress && (hVar = (dVar2 = this.f۱۲۴۶۷e).f۱۲۴۹۹E) != null) {
                hVar.m۱۳۸۱۲a(this, view, position, dVar2.f۱۲۵۵۴l.get(position));
            }
            if (longPress && (kVar = (dVar = this.f۱۲۴۶۷e).f۱۲۵۰۱F) != null) {
                return kVar.m۱۳۸۱۵a(this, view, position, dVar.f۱۲۵۵۴l.get(position));
            }
        } else if (lVar == l.MULTI) {
            CheckBox cb = (CheckBox) view.findViewById(Ck.md_control);
            if (!cb.isEnabled()) {
                return false;
            }
            boolean shouldBeChecked = !this.f۱۲۴۸۴v.contains(Integer.valueOf(position));
            if (shouldBeChecked) {
                this.f۱۲۴۸۴v.add(Integer.valueOf(position));
                if (this.f۱۲۴۶۷e.f۱۲۵۰۷I) {
                    if (m۱۳۷۵۴j()) {
                        cb.setChecked(true);
                    } else {
                        this.f۱۲۴۸۴v.remove(Integer.valueOf(position));
                    }
                } else {
                    cb.setChecked(true);
                }
            } else {
                this.f۱۲۴۸۴v.remove(Integer.valueOf(position));
                if (this.f۱۲۴۶۷e.f۱۲۵۰۷I) {
                    if (m۱۳۷۵۴j()) {
                        cb.setChecked(false);
                    } else {
                        this.f۱۲۴۸۴v.add(Integer.valueOf(position));
                    }
                } else {
                    cb.setChecked(false);
                }
            }
        } else if (lVar == l.SINGLE) {
            RadioButton radio = (RadioButton) view.findViewById(Ck.md_control);
            if (!radio.isEnabled()) {
                return false;
            }
            boolean allowSelection = true;
            d dVar3 = this.f۱۲۴۶۷e;
            int oldSelected = dVar3.f۱۲۵۱۹O;
            if (dVar3.f۱۲۵۲۳R && dVar3.f۱۲۵۵۶m == null) {
                dismiss();
                allowSelection = false;
                this.f۱۲۴۶۷e.f۱۲۵۱۹O = position;
                m۱۳۷۵۳b(view);
            } else {
                d dVar4 = this.f۱۲۴۶۷e;
                if (dVar4.f۱۲۵۰۹J) {
                    dVar4.f۱۲۵۱۹O = position;
                    allowSelection = m۱۳۷۵۳b(view);
                    this.f۱۲۴۶۷e.f۱۲۵۱۹O = oldSelected;
                }
            }
            if (allowSelection) {
                this.f۱۲۴۶۷e.f۱۲۵۱۹O = position;
                radio.setChecked(true);
                this.f۱۲۴۶۷e.f۱۲۵۲۹X.m۱۲۳۷۷c(oldSelected);
                this.f۱۲۴۶۷e.f۱۲۵۲۹X.m۱۲۳۷۷c(position);
            }
        }
        return true;
    }

    /* renamed from: f, reason: contains not printable characters */
    final Drawable m۱۳۷۶۶f() {
        d dVar = this.f۱۲۴۶۷e;
        if (dVar.f۱۲۵۱۲K0 != 0) {
            return Cf.m۱۰۶۱۴a(dVar.f۱۲۵۳۲a.getResources(), this.f۱۲۴۶۷e.f۱۲۵۱۲K0, null);
        }
        Drawable d2 = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۸g(dVar.f۱۲۵۳۲a, Cg.md_list_selector);
        if (d2 != null) {
            return d2;
        }
        return p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۸g(getContext(), Cg.md_list_selector);
    }

    /* renamed from: a, reason: contains not printable characters */
    Drawable m۱۳۷۵۵a(EnumCb which, boolean isStacked) {
        if (isStacked) {
            d dVar = this.f۱۲۴۶۷e;
            if (dVar.f۱۲۵۱۴L0 != 0) {
                return Cf.m۱۰۶۱۴a(dVar.f۱۲۵۳۲a.getResources(), this.f۱۲۴۶۷e.f۱۲۵۱۴L0, null);
            }
            Drawable d2 = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۸g(dVar.f۱۲۵۳۲a, Cg.md_btn_stacked_selector);
            if (d2 != null) {
                return d2;
            }
            return p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۸g(getContext(), Cg.md_btn_stacked_selector);
        }
        int i2 = c.f۱۲۴۸۹a[which.ordinal()];
        if (i2 == 1) {
            d dVar2 = this.f۱۲۴۶۷e;
            if (dVar2.f۱۲۵۱۸N0 != 0) {
                return Cf.m۱۰۶۱۴a(dVar2.f۱۲۵۳۲a.getResources(), this.f۱۲۴۶۷e.f۱۲۵۱۸N0, null);
            }
            Drawable d3 = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۸g(dVar2.f۱۲۵۳۲a, Cg.md_btn_neutral_selector);
            if (d3 != null) {
                return d3;
            }
            Drawable d4 = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۸g(getContext(), Cg.md_btn_neutral_selector);
            if (Build.VERSION.SDK_INT >= 21) {
                Cb.m۱۳۸۴۰a(d4, this.f۱۲۴۶۷e.f۱۲۵۴۶h);
            }
            return d4;
        }
        if (i2 != 2) {
            d dVar3 = this.f۱۲۴۶۷e;
            if (dVar3.f۱۲۵۱۶M0 != 0) {
                return Cf.m۱۰۶۱۴a(dVar3.f۱۲۵۳۲a.getResources(), this.f۱۲۴۶۷e.f۱۲۵۱۶M0, null);
            }
            Drawable d5 = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۸g(dVar3.f۱۲۵۳۲a, Cg.md_btn_positive_selector);
            if (d5 != null) {
                return d5;
            }
            Drawable d6 = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۸g(getContext(), Cg.md_btn_positive_selector);
            if (Build.VERSION.SDK_INT >= 21) {
                Cb.m۱۳۸۴۰a(d6, this.f۱۲۴۶۷e.f۱۲۵۴۶h);
            }
            return d6;
        }
        d dVar4 = this.f۱۲۴۶۷e;
        if (dVar4.f۱۲۵۲۰O0 != 0) {
            return Cf.m۱۰۶۱۴a(dVar4.f۱۲۵۳۲a.getResources(), this.f۱۲۴۶۷e.f۱۲۵۲۰O0, null);
        }
        Drawable d7 = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۸g(dVar4.f۱۲۵۳۲a, Cg.md_btn_negative_selector);
        if (d7 != null) {
            return d7;
        }
        Drawable d8 = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۸g(getContext(), Cg.md_btn_negative_selector);
        if (Build.VERSION.SDK_INT >= 21) {
            Cb.m۱۳۸۴۰a(d8, this.f۱۲۴۶۷e.f۱۲۵۴۶h);
        }
        return d8;
    }

    /* renamed from: b, reason: contains not printable characters */
    private boolean m۱۳۷۵۳b(View v) {
        d dVar = this.f۱۲۴۶۷e;
        if (dVar.f۱۲۵۰۳G == null) {
            return false;
        }
        CharSequence text = null;
        int i2 = dVar.f۱۲۵۱۹O;
        if (i2 >= 0 && i2 < dVar.f۱۲۵۵۴l.size()) {
            d dVar2 = this.f۱۲۴۶۷e;
            text = dVar2.f۱۲۵۵۴l.get(dVar2.f۱۲۵۱۹O);
        }
        d dVar3 = this.f۱۲۴۶۷e;
        return dVar3.f۱۲۵۰۳G.mo۱۵۳۷۹a(this, v, dVar3.f۱۲۵۱۹O, text);
    }

    /* renamed from: j, reason: contains not printable characters */
    private boolean m۱۳۷۵۴j() {
        if (this.f۱۲۴۶۷e.f۱۲۵۰۵H == null) {
            return false;
        }
        Collections.sort(this.f۱۲۴۸۴v);
        List<CharSequence> selectedTitles = new ArrayList<>();
        for (Integer i2 : this.f۱۲۴۸۴v) {
            if (i2.intValue() >= 0 && i2.intValue() <= this.f۱۲۴۶۷e.f۱۲۵۵۴l.size() - 1) {
                selectedTitles.add(this.f۱۲۴۶۷e.f۱۲۵۵۴l.get(i2.intValue()));
            }
        }
        i iVar = this.f۱۲۴۶۷e.f۱۲۵۰۵H;
        List<Integer> list = this.f۱۲۴۸۴v;
        return iVar.m۱۳۸۱۳a(this, (Integer[]) list.toArray(new Integer[list.size()]), (CharSequence[]) selectedTitles.toArray(new CharSequence[selectedTitles.size()]));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        EditText editText;
        EnumCb tag = (EnumCb) v.getTag();
        int i2 = c.f۱۲۴۸۹a[tag.ordinal()];
        if (i2 == 1) {
            e eVar = this.f۱۲۴۶۷e.f۱۲۵۸۲z;
            if (eVar != null) {
                eVar.m۱۳۸۰۷a(this);
                this.f۱۲۴۶۷e.f۱۲۵۸۲z.m۱۳۸۰۹c(this);
            }
            m mVar = this.f۱۲۴۶۷e.f۱۲۴۹۵C;
            if (mVar != null) {
                mVar.mo۱۵۴۰۰a(this, tag);
            }
            if (this.f۱۲۴۶۷e.f۱۲۵۲۳R) {
                dismiss();
            }
        } else if (i2 == 2) {
            e eVar2 = this.f۱۲۴۶۷e.f۱۲۵۸۲z;
            if (eVar2 != null) {
                eVar2.m۱۳۸۰۷a(this);
                this.f۱۲۴۶۷e.f۱۲۵۸۲z.m۱۳۸۰۸b(this);
            }
            m mVar2 = this.f۱۲۴۶۷e.f۱۲۴۹۳B;
            if (mVar2 != null) {
                mVar2.mo۱۵۴۰۰a(this, tag);
            }
            if (this.f۱۲۴۶۷e.f۱۲۵۲۳R) {
                cancel();
            }
        } else if (i2 == 3) {
            e eVar3 = this.f۱۲۴۶۷e.f۱۲۵۸۲z;
            if (eVar3 != null) {
                eVar3.m۱۳۸۰۷a(this);
                this.f۱۲۴۶۷e.f۱۲۵۸۲z.m۱۳۸۱۰d(this);
            }
            m mVar3 = this.f۱۲۴۶۷e.f۱۲۴۹۱A;
            if (mVar3 != null) {
                mVar3.mo۱۵۴۰۰a(this, tag);
            }
            if (!this.f۱۲۴۶۷e.f۱۲۵۰۹J) {
                m۱۳۷۵۳b(v);
            }
            if (!this.f۱۲۴۶۷e.f۱۲۵۰۷I) {
                m۱۳۷۵۴j();
            }
            d dVar = this.f۱۲۴۶۷e;
            g gVar = dVar.f۱۲۵۶۱o0;
            if (gVar != null && (editText = this.f۱۲۴۷۱i) != null && !dVar.f۱۲۵۶۷r0) {
                gVar.m۱۳۸۱۱a(this, editText.getText());
            }
            if (this.f۱۲۴۶۷e.f۱۲۵۲۳R) {
                dismiss();
            }
        }
        m mVar4 = this.f۱۲۴۶۷e.f۱۲۴۹۷D;
        if (mVar4 != null) {
            mVar4.mo۱۵۴۰۰a(this, tag);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException e2) {
            throw new f("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public final MDButton m۱۳۷۵۶a(EnumCb which) {
        int i2 = c.f۱۲۴۸۹a[which.ordinal()];
        if (i2 == 1) {
            return this.f۱۲۴۸۱s;
        }
        if (i2 != 2) {
            return this.f۱۲۴۸۰r;
        }
        return this.f۱۲۴۸۲t;
    }

    /* renamed from: g, reason: contains not printable characters */
    public final View m۱۳۷۶۷g() {
        return this.f۱۲۴۵۹c;
    }

    /* renamed from: e, reason: contains not printable characters */
    public final EditText m۱۳۷۶۵e() {
        return this.f۱۲۴۷۱i;
    }

    /* renamed from: d, reason: contains not printable characters */
    public final View m۱۳۷۶۴d() {
        return this.f۱۲۴۶۷e.f۱۲۵۶۸s;
    }

    /* renamed from: a, reason: contains not printable characters */
    public final void m۱۳۷۶۰a(EnumCb which, CharSequence title) {
        int i2 = c.f۱۲۴۸۹a[which.ordinal()];
        if (i2 == 1) {
            this.f۱۲۴۶۷e.f۱۲۵۵۸n = title;
            this.f۱۲۴۸۱s.setText(title);
            this.f۱۲۴۸۱s.setVisibility(title != null ? 0 : 8);
        } else if (i2 != 2) {
            this.f۱۲۴۶۷e.f۱۲۵۵۶m = title;
            this.f۱۲۴۸۰r.setText(title);
            this.f۱۲۴۸۰r.setVisibility(title != null ? 0 : 8);
        } else {
            this.f۱۲۴۶۷e.f۱۲۵۶۰o = title;
            this.f۱۲۴۸۲t.setText(title);
            this.f۱۲۴۸۲t.setVisibility(title != null ? 0 : 8);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public final void m۱۳۷۵۹a(EnumCb which, int titleRes) {
        m۱۳۷۶۰a(which, getContext().getText(titleRes));
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence newTitle) {
        this.f۱۲۴۶۹g.setText(newTitle);
    }

    @Override // android.app.Dialog
    public final void setTitle(int newTitleRes) {
        setTitle(this.f۱۲۴۶۷e.f۱۲۵۳۲a.getString(newTitleRes));
    }

    @Override // p۲۰۸b.p۲۰۹a.p۲۱۰a.DialogCc, android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialog) {
        if (this.f۱۲۴۷۱i != null) {
            p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۳b(this, this.f۱۲۴۶۷e);
            if (this.f۱۲۴۷۱i.getText().length() > 0) {
                EditText editText = this.f۱۲۴۷۱i;
                editText.setSelection(editText.getText().length());
            }
        }
        super.onShow(dialog);
    }

    /* renamed from: i, reason: contains not printable characters */
    void m۱۳۷۶۹i() {
        EditText editText = this.f۱۲۴۷۱i;
        if (editText == null) {
            return;
        }
        editText.addTextChangedListener(new b());
    }

    /* renamed from: b.a.a.f$b */
    class b implements TextWatcher {
        b() {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            int length = s.toString().length();
            boolean emptyDisabled = false;
            if (!ViewOnClickListenerCf.this.f۱۲۴۶۷e.f۱۲۵۶۳p0) {
                emptyDisabled = length == 0;
                View positiveAb = ViewOnClickListenerCf.this.m۱۳۷۵۶a(EnumCb.POSITIVE);
                positiveAb.setEnabled(emptyDisabled ? false : true);
            }
            ViewOnClickListenerCf.this.m۱۳۷۵۷a(length, emptyDisabled);
            ViewOnClickListenerCf viewOnClickListenerCf = ViewOnClickListenerCf.this;
            d dVar = viewOnClickListenerCf.f۱۲۴۶۷e;
            if (dVar.f۱۲۵۶۷r0) {
                dVar.f۱۲۵۶۱o0.m۱۳۸۱۱a(viewOnClickListenerCf, s);
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۷۵۷a(int currentLength, boolean emptyDisabled) {
        int i2;
        TextView textView = this.f۱۲۴۷۸p;
        if (textView != null) {
            if (this.f۱۲۴۶۷e.f۱۲۵۷۱t0 > 0) {
                textView.setText(String.format(Locale.getDefault(), "%d/%d", Integer.valueOf(currentLength), Integer.valueOf(this.f۱۲۴۶۷e.f۱۲۵۷۱t0)));
                this.f۱۲۴۷۸p.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            boolean isDisabled = (emptyDisabled && currentLength == 0) || ((i2 = this.f۱۲۴۶۷e.f۱۲۵۷۱t0) > 0 && currentLength > i2) || currentLength < this.f۱۲۴۶۷e.f۱۲۵۶۹s0;
            d dVar = this.f۱۲۴۶۷e;
            int colorText = isDisabled ? dVar.f۱۲۵۷۳u0 : dVar.f۱۲۵۵۰j;
            d dVar2 = this.f۱۲۴۶۷e;
            int colorWidget = isDisabled ? dVar2.f۱۲۵۷۳u0 : dVar2.f۱۲۵۷۰t;
            if (this.f۱۲۴۶۷e.f۱۲۵۷۱t0 > 0) {
                this.f۱۲۴۷۸p.setTextColor(colorText);
            }
            Cc.m۱۴۶۹۶b(this.f۱۲۴۷۱i, colorWidget);
            View positiveAb = m۱۳۷۵۶a(EnumCb.POSITIVE);
            positiveAb.setEnabled(isDisabled ? false : true);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.f۱۲۴۷۱i != null) {
            p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۲۶a(this, this.f۱۲۴۶۷e);
        }
        super.dismiss();
    }

    /* renamed from: b.a.a.f$c */
    static /* synthetic */ class c {

        /* renamed from: a, reason: contains not printable characters */
        static final /* synthetic */ int[] f۱۲۴۸۹a;

        /* renamed from: b, reason: contains not printable characters */
        static final /* synthetic */ int[] f۱۲۴۹۰b = new int[l.values().length];

        static {
            try {
                f۱۲۴۹۰b[l.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۱۲۴۹۰b[l.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f۱۲۴۹۰b[l.MULTI.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            f۱۲۴۸۹a = new int[EnumCb.values().length];
            try {
                f۱۲۴۸۹a[EnumCb.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f۱۲۴۸۹a[EnumCb.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f۱۲۴۸۹a[EnumCb.POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    /* renamed from: b.a.a.f$l */
    enum l {
        REGULAR,
        SINGLE,
        MULTI;

        /* renamed from: a, reason: contains not printable characters */
        public static int m۱۳۸۱۶a(l type) {
            int i = c.f۱۲۴۹۰b[type.ordinal()];
            if (i == 1) {
                return Cl.md_listitem;
            }
            if (i == 2) {
                return Cl.md_listitem_singlechoice;
            }
            if (i == 3) {
                return Cl.md_listitem_multichoice;
            }
            throw new IllegalArgumentException("Not a valid list type");
        }
    }

    /* renamed from: b.a.a.f$f */
    private static class f extends WindowManager.BadTokenException {
        f(String message) {
            super(message);
        }
    }

    /* renamed from: b.a.a.f$d */
    public static class d {

        /* renamed from: A, reason: contains not printable characters */
        protected m f۱۲۴۹۱A;

        /* renamed from: A0, reason: contains not printable characters */
        protected NumberFormat f۱۲۴۹۲A0;

        /* renamed from: B, reason: contains not printable characters */
        protected m f۱۲۴۹۳B;

        /* renamed from: B0, reason: contains not printable characters */
        protected boolean f۱۲۴۹۴B0;

        /* renamed from: C, reason: contains not printable characters */
        protected m f۱۲۴۹۵C;

        /* renamed from: C0, reason: contains not printable characters */
        protected boolean f۱۲۴۹۶C0;

        /* renamed from: D, reason: contains not printable characters */
        protected m f۱۲۴۹۷D;

        /* renamed from: D0, reason: contains not printable characters */
        protected boolean f۱۲۴۹۸D0;

        /* renamed from: E, reason: contains not printable characters */
        protected h f۱۲۴۹۹E;

        /* renamed from: E0, reason: contains not printable characters */
        protected boolean f۱۲۵۰۰E0;

        /* renamed from: F, reason: contains not printable characters */
        protected k f۱۲۵۰۱F;

        /* renamed from: F0, reason: contains not printable characters */
        protected boolean f۱۲۵۰۲F0;

        /* renamed from: G, reason: contains not printable characters */
        protected j f۱۲۵۰۳G;

        /* renamed from: G0, reason: contains not printable characters */
        protected boolean f۱۲۵۰۴G0;

        /* renamed from: H, reason: contains not printable characters */
        protected i f۱۲۵۰۵H;

        /* renamed from: H0, reason: contains not printable characters */
        protected boolean f۱۲۵۰۶H0;

        /* renamed from: I, reason: contains not printable characters */
        protected boolean f۱۲۵۰۷I;

        /* renamed from: I0, reason: contains not printable characters */
        protected boolean f۱۲۵۰۸I0;

        /* renamed from: J, reason: contains not printable characters */
        protected boolean f۱۲۵۰۹J;

        /* renamed from: J0, reason: contains not printable characters */
        protected boolean f۱۲۵۱۰J0;

        /* renamed from: K, reason: contains not printable characters */
        protected EnumCp f۱۲۵۱۱K;

        /* renamed from: K0, reason: contains not printable characters */
        protected int f۱۲۵۱۲K0;

        /* renamed from: L, reason: contains not printable characters */
        protected boolean f۱۲۵۱۳L;

        /* renamed from: L0, reason: contains not printable characters */
        protected int f۱۲۵۱۴L0;

        /* renamed from: M, reason: contains not printable characters */
        protected boolean f۱۲۵۱۵M;

        /* renamed from: M0, reason: contains not printable characters */
        protected int f۱۲۵۱۶M0;

        /* renamed from: N, reason: contains not printable characters */
        protected float f۱۲۵۱۷N;

        /* renamed from: N0, reason: contains not printable characters */
        protected int f۱۲۵۱۸N0;

        /* renamed from: O, reason: contains not printable characters */
        protected int f۱۲۵۱۹O;

        /* renamed from: O0, reason: contains not printable characters */
        protected int f۱۲۵۲۰O0;

        /* renamed from: P, reason: contains not printable characters */
        protected Integer[] f۱۲۵۲۱P;

        /* renamed from: Q, reason: contains not printable characters */
        protected Integer[] f۱۲۵۲۲Q;

        /* renamed from: R, reason: contains not printable characters */
        protected boolean f۱۲۵۲۳R;

        /* renamed from: S, reason: contains not printable characters */
        protected Typeface f۱۲۵۲۴S;

        /* renamed from: T, reason: contains not printable characters */
        protected Typeface f۱۲۵۲۵T;

        /* renamed from: U, reason: contains not printable characters */
        protected Drawable f۱۲۵۲۶U;

        /* renamed from: V, reason: contains not printable characters */
        protected boolean f۱۲۵۲۷V;

        /* renamed from: W, reason: contains not printable characters */
        protected int f۱۲۵۲۸W;

        /* renamed from: X, reason: contains not printable characters */
        protected RecyclerView.AbstractCg<?> f۱۲۵۲۹X;

        /* renamed from: Y, reason: contains not printable characters */
        protected RecyclerView.AbstractCo f۱۲۵۳۰Y;

        /* renamed from: Z, reason: contains not printable characters */
        protected DialogInterface.OnDismissListener f۱۲۵۳۱Z;

        /* renamed from: a, reason: contains not printable characters */
        protected final Context f۱۲۵۳۲a;

        /* renamed from: a0, reason: contains not printable characters */
        protected DialogInterface.OnCancelListener f۱۲۵۳۳a0;

        /* renamed from: b, reason: contains not printable characters */
        protected CharSequence f۱۲۵۳۴b;

        /* renamed from: b0, reason: contains not printable characters */
        protected DialogInterface.OnKeyListener f۱۲۵۳۵b0;

        /* renamed from: c, reason: contains not printable characters */
        protected EnumCe f۱۲۵۳۶c;

        /* renamed from: c0, reason: contains not printable characters */
        protected DialogInterface.OnShowListener f۱۲۵۳۷c0;

        /* renamed from: d, reason: contains not printable characters */
        protected EnumCe f۱۲۵۳۸d;

        /* renamed from: d0, reason: contains not printable characters */
        protected EnumCo f۱۲۵۳۹d0;

        /* renamed from: e, reason: contains not printable characters */
        protected EnumCe f۱۲۵۴۰e;

        /* renamed from: e0, reason: contains not printable characters */
        protected boolean f۱۲۵۴۱e0;

        /* renamed from: f, reason: contains not printable characters */
        protected EnumCe f۱۲۵۴۲f;

        /* renamed from: f0, reason: contains not printable characters */
        protected int f۱۲۵۴۳f0;

        /* renamed from: g, reason: contains not printable characters */
        protected EnumCe f۱۲۵۴۴g;

        /* renamed from: g0, reason: contains not printable characters */
        protected int f۱۲۵۴۵g0;

        /* renamed from: h, reason: contains not printable characters */
        protected int f۱۲۵۴۶h;

        /* renamed from: h0, reason: contains not printable characters */
        protected int f۱۲۵۴۷h0;

        /* renamed from: i, reason: contains not printable characters */
        protected int f۱۲۵۴۸i;

        /* renamed from: i0, reason: contains not printable characters */
        protected boolean f۱۲۵۴۹i0;

        /* renamed from: j, reason: contains not printable characters */
        protected int f۱۲۵۵۰j;

        /* renamed from: j0, reason: contains not printable characters */
        protected boolean f۱۲۵۵۱j0;

        /* renamed from: k, reason: contains not printable characters */
        protected CharSequence f۱۲۵۵۲k;

        /* renamed from: k0, reason: contains not printable characters */
        protected int f۱۲۵۵۳k0;

        /* renamed from: l, reason: contains not printable characters */
        protected ArrayList<CharSequence> f۱۲۵۵۴l;

        /* renamed from: l0, reason: contains not printable characters */
        protected int f۱۲۵۵۵l0;

        /* renamed from: m, reason: contains not printable characters */
        protected CharSequence f۱۲۵۵۶m;

        /* renamed from: m0, reason: contains not printable characters */
        protected CharSequence f۱۲۵۵۷m0;

        /* renamed from: n, reason: contains not printable characters */
        protected CharSequence f۱۲۵۵۸n;

        /* renamed from: n0, reason: contains not printable characters */
        protected CharSequence f۱۲۵۵۹n0;

        /* renamed from: o, reason: contains not printable characters */
        protected CharSequence f۱۲۵۶۰o;

        /* renamed from: o0, reason: contains not printable characters */
        protected g f۱۲۵۶۱o0;

        /* renamed from: p, reason: contains not printable characters */
        protected boolean f۱۲۵۶۲p;

        /* renamed from: p0, reason: contains not printable characters */
        protected boolean f۱۲۵۶۳p0;

        /* renamed from: q, reason: contains not printable characters */
        protected boolean f۱۲۵۶۴q;

        /* renamed from: q0, reason: contains not printable characters */
        protected int f۱۲۵۶۵q0;

        /* renamed from: r, reason: contains not printable characters */
        protected boolean f۱۲۵۶۶r;

        /* renamed from: r0, reason: contains not printable characters */
        protected boolean f۱۲۵۶۷r0;

        /* renamed from: s, reason: contains not printable characters */
        protected View f۱۲۵۶۸s;

        /* renamed from: s0, reason: contains not printable characters */
        protected int f۱۲۵۶۹s0;

        /* renamed from: t, reason: contains not printable characters */
        protected int f۱۲۵۷۰t;

        /* renamed from: t0, reason: contains not printable characters */
        protected int f۱۲۵۷۱t0;

        /* renamed from: u, reason: contains not printable characters */
        protected ColorStateList f۱۲۵۷۲u;

        /* renamed from: u0, reason: contains not printable characters */
        protected int f۱۲۵۷۳u0;

        /* renamed from: v, reason: contains not printable characters */
        protected ColorStateList f۱۲۵۷۴v;

        /* renamed from: v0, reason: contains not printable characters */
        protected int[] f۱۲۵۷۵v0;

        /* renamed from: w, reason: contains not printable characters */
        protected ColorStateList f۱۲۵۷۶w;

        /* renamed from: w0, reason: contains not printable characters */
        protected CharSequence f۱۲۵۷۷w0;

        /* renamed from: x, reason: contains not printable characters */
        protected ColorStateList f۱۲۵۷۸x;

        /* renamed from: x0, reason: contains not printable characters */
        protected boolean f۱۲۵۷۹x0;

        /* renamed from: y, reason: contains not printable characters */
        protected ColorStateList f۱۲۵۸۰y;

        /* renamed from: y0, reason: contains not printable characters */
        protected CompoundButton.OnCheckedChangeListener f۱۲۵۸۱y0;

        /* renamed from: z, reason: contains not printable characters */
        protected e f۱۲۵۸۲z;

        /* renamed from: z0, reason: contains not printable characters */
        protected String f۱۲۵۸۳z0;

        public d(Context context) {
            EnumCe enumCe = EnumCe.START;
            this.f۱۲۵۳۶c = enumCe;
            this.f۱۲۵۳۸d = enumCe;
            this.f۱۲۵۴۰e = EnumCe.END;
            EnumCe enumCe2 = EnumCe.START;
            this.f۱۲۵۴۲f = enumCe2;
            this.f۱۲۵۴۴g = enumCe2;
            this.f۱۲۵۴۶h = 0;
            this.f۱۲۵۴۸i = -1;
            this.f۱۲۵۵۰j = -1;
            this.f۱۲۵۰۷I = false;
            this.f۱۲۵۰۹J = false;
            this.f۱۲۵۱۱K = EnumCp.LIGHT;
            this.f۱۲۵۱۳L = true;
            this.f۱۲۵۱۵M = true;
            this.f۱۲۵۱۷N = 1.2f;
            this.f۱۲۵۱۹O = -1;
            this.f۱۲۵۲۱P = null;
            this.f۱۲۵۲۲Q = null;
            this.f۱۲۵۲۳R = true;
            this.f۱۲۵۲۸W = -1;
            this.f۱۲۵۵۳k0 = -2;
            this.f۱۲۵۵۵l0 = 0;
            this.f۱۲۵۶۵q0 = -1;
            this.f۱۲۵۶۹s0 = -1;
            this.f۱۲۵۷۱t0 = -1;
            this.f۱۲۵۷۳u0 = 0;
            this.f۱۲۴۹۶C0 = false;
            this.f۱۲۴۹۸D0 = false;
            this.f۱۲۵۰۰E0 = false;
            this.f۱۲۵۰۲F0 = false;
            this.f۱۲۵۰۴G0 = false;
            this.f۱۲۵۰۶H0 = false;
            this.f۱۲۵۰۸I0 = false;
            this.f۱۲۵۱۰J0 = false;
            this.f۱۲۵۳۲a = context;
            int materialBlue = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۴c(context, Ch.md_material_blue_600);
            this.f۱۲۵۷۰t = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۲۰a(context, Cg.colorAccent, materialBlue);
            if (Build.VERSION.SDK_INT >= 21) {
                this.f۱۲۵۷۰t = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۲۰a(context, R.attr.colorAccent, this.f۱۲۵۷۰t);
            }
            this.f۱۲۵۷۴v = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۲b(context, this.f۱۲۵۷۰t);
            this.f۱۲۵۷۶w = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۲b(context, this.f۱۲۵۷۰t);
            this.f۱۲۵۷۸x = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۲b(context, this.f۱۲۵۷۰t);
            this.f۱۲۵۸۰y = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۲b(context, p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۲۰a(context, Cg.md_link_color, this.f۱۲۵۷۰t));
            int fallback = Build.VERSION.SDK_INT >= 21 ? p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۶e(context, R.attr.colorControlHighlight) : 0;
            this.f۱۲۵۴۶h = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۲۰a(context, Cg.md_btn_ripple_color, p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۲۰a(context, Cg.colorControlHighlight, fallback));
            this.f۱۲۴۹۲A0 = NumberFormat.getPercentInstance();
            this.f۱۲۵۸۳z0 = "%1d/%2d";
            int primaryTextColor = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۶e(context, R.attr.textColorPrimary);
            this.f۱۲۵۱۱K = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۲۸a(primaryTextColor) ? EnumCp.LIGHT : EnumCp.DARK;
            m۱۳۷۷۰d();
            this.f۱۲۵۳۶c = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۲۵a(context, Cg.md_title_gravity, this.f۱۲۵۳۶c);
            this.f۱۲۵۳۸d = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۲۵a(context, Cg.md_content_gravity, this.f۱۲۵۳۸d);
            this.f۱۲۵۴۰e = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۲۵a(context, Cg.md_btnstacked_gravity, this.f۱۲۵۴۰e);
            this.f۱۲۵۴۲f = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۲۵a(context, Cg.md_items_gravity, this.f۱۲۵۴۲f);
            this.f۱۲۵۴۴g = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۲۵a(context, Cg.md_buttons_gravity, this.f۱۲۵۴۴g);
            String mediumFont = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۹h(context, Cg.md_medium_font);
            String regularFont = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۹h(context, Cg.md_regular_font);
            try {
                m۱۳۷۸۱a(mediumFont, regularFont);
            } catch (Throwable th) {
            }
            if (this.f۱۲۵۲۵T == null) {
                try {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f۱۲۵۲۵T = Typeface.create("sans-serif-medium", 0);
                    } else {
                        this.f۱۲۵۲۵T = Typeface.create("sans-serif", 1);
                    }
                } catch (Throwable th2) {
                    this.f۱۲۵۲۵T = Typeface.DEFAULT_BOLD;
                }
            }
            if (this.f۱۲۵۲۴S == null) {
                try {
                    this.f۱۲۵۲۴S = Typeface.create("sans-serif", 0);
                } catch (Throwable th3) {
                    this.f۱۲۵۲۴S = Typeface.SANS_SERIF;
                    if (this.f۱۲۵۲۴S == null) {
                        this.f۱۲۵۲۴S = Typeface.DEFAULT;
                    }
                }
            }
        }

        /* renamed from: b, reason: contains not printable characters */
        public final Context m۱۳۷۸۵b() {
            return this.f۱۲۵۳۲a;
        }

        /* renamed from: d, reason: contains not printable characters */
        private void m۱۳۷۷۰d() {
            if (Cd.m۱۴۶۹۸a(false) == null) {
                return;
            }
            Cd s = Cd.m۱۴۶۹۷a();
            if (s.f۱۳۳۲۵a) {
                this.f۱۲۵۱۱K = EnumCp.DARK;
            }
            int i = s.f۱۳۳۲۶b;
            if (i != 0) {
                this.f۱۲۵۴۸i = i;
            }
            int i2 = s.f۱۳۳۲۷c;
            if (i2 != 0) {
                this.f۱۲۵۵۰j = i2;
            }
            ColorStateList colorStateList = s.f۱۳۳۲۸d;
            if (colorStateList != null) {
                this.f۱۲۵۷۴v = colorStateList;
            }
            ColorStateList colorStateList2 = s.f۱۳۳۲۹e;
            if (colorStateList2 != null) {
                this.f۱۲۵۷۸x = colorStateList2;
            }
            ColorStateList colorStateList3 = s.f۱۳۳۳۰f;
            if (colorStateList3 != null) {
                this.f۱۲۵۷۶w = colorStateList3;
            }
            int i3 = s.f۱۳۳۳۲h;
            if (i3 != 0) {
                this.f۱۲۵۴۷h0 = i3;
            }
            Drawable drawable = s.f۱۳۳۳۳i;
            if (drawable != null) {
                this.f۱۲۵۲۶U = drawable;
            }
            int i4 = s.f۱۳۳۳۴j;
            if (i4 != 0) {
                this.f۱۲۵۴۵g0 = i4;
            }
            int i5 = s.f۱۳۳۳۵k;
            if (i5 != 0) {
                this.f۱۲۵۴۳f0 = i5;
            }
            int i6 = s.f۱۳۳۳۸n;
            if (i6 != 0) {
                this.f۱۲۵۱۴L0 = i6;
            }
            int i7 = s.f۱۳۳۳۷m;
            if (i7 != 0) {
                this.f۱۲۵۱۲K0 = i7;
            }
            int i8 = s.f۱۳۳۳۹o;
            if (i8 != 0) {
                this.f۱۲۵۱۶M0 = i8;
            }
            int i9 = s.f۱۳۳۴۰p;
            if (i9 != 0) {
                this.f۱۲۵۱۸N0 = i9;
            }
            int i10 = s.f۱۳۳۴۱q;
            if (i10 != 0) {
                this.f۱۲۵۲۰O0 = i10;
            }
            int i11 = s.f۱۳۳۳۱g;
            if (i11 != 0) {
                this.f۱۲۵۷۰t = i11;
            }
            ColorStateList colorStateList4 = s.f۱۳۳۳۶l;
            if (colorStateList4 != null) {
                this.f۱۲۵۸۰y = colorStateList4;
            }
            this.f۱۲۵۳۶c = s.f۱۳۳۴۲r;
            this.f۱۲۵۳۸d = s.f۱۳۳۴۳s;
            this.f۱۲۵۴۰e = s.f۱۳۳۴۴t;
            this.f۱۲۵۴۲f = s.f۱۳۳۴۵u;
            this.f۱۲۵۴۴g = s.f۱۳۳۴۶v;
        }

        /* renamed from: h, reason: contains not printable characters */
        public d m۱۳۸۰۴h(int titleRes) {
            m۱۳۸۰۱e(this.f۱۲۵۳۲a.getText(titleRes));
            return this;
        }

        /* renamed from: e, reason: contains not printable characters */
        public d m۱۳۸۰۱e(CharSequence title) {
            this.f۱۲۵۳۴b = title;
            return this;
        }

        /* renamed from: d, reason: contains not printable characters */
        public d m۱۳۷۹۸d(EnumCe gravity) {
            this.f۱۲۵۳۶c = gravity;
            return this;
        }

        /* renamed from: i, reason: contains not printable characters */
        public d m۱۳۸۰۵i(int color) {
            this.f۱۲۵۴۸i = color;
            this.f۱۲۴۹۶C0 = true;
            return this;
        }

        /* renamed from: j, reason: contains not printable characters */
        public d m۱۳۸۰۶j(int colorRes) {
            m۱۳۸۰۵i(p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۴c(this.f۱۲۵۳۲a, colorRes));
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public d m۱۳۷۸۱a(String medium, String regular) {
            if (medium != null && !medium.trim().isEmpty()) {
                this.f۱۲۵۲۵T = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Cc.m۱۳۸۴۱a(this.f۱۲۵۳۲a, medium);
                if (this.f۱۲۵۲۵T == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + medium + "\"");
                }
            }
            if (regular != null && !regular.trim().isEmpty()) {
                this.f۱۲۵۲۴S = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Cc.m۱۳۸۴۱a(this.f۱۲۵۳۲a, regular);
                if (this.f۱۲۵۲۴S == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + regular + "\"");
                }
            }
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public d m۱۳۷۸۰a(CharSequence content) {
            if (this.f۱۲۵۶۸s != null) {
                throw new IllegalStateException("You cannot set content() when you're using a custom view.");
            }
            this.f۱۲۵۵۲k = content;
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        public d m۱۳۷۸۸b(EnumCe gravity) {
            this.f۱۲۵۳۸d = gravity;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public d m۱۳۷۷۱a(int itemsRes) {
            m۱۳۷۸۳a(this.f۱۲۵۳۲a.getResources().getTextArray(itemsRes));
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public d m۱۳۷۸۳a(CharSequence... items) {
            if (this.f۱۲۵۶۸s != null) {
                throw new IllegalStateException("You cannot set items() when you're using a custom view.");
            }
            this.f۱۲۵۵۴l = new ArrayList<>();
            Collections.addAll(this.f۱۲۵۵۴l, items);
            return this;
        }

        /* renamed from: c, reason: contains not printable characters */
        public d m۱۳۷۹۳c(EnumCe gravity) {
            this.f۱۲۵۴۲f = gravity;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public d m۱۳۷۷۷a(EnumCe gravity) {
            this.f۱۲۵۴۴g = gravity;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public d m۱۳۷۷۲a(int selectedIndex, j callback) {
            this.f۱۲۵۱۹O = selectedIndex;
            this.f۱۲۴۹۹E = null;
            this.f۱۲۵۰۳G = callback;
            this.f۱۲۵۰۵H = null;
            return this;
        }

        /* renamed from: g, reason: contains not printable characters */
        public d m۱۳۸۰۳g(int positiveRes) {
            if (positiveRes == 0) {
                return this;
            }
            m۱۳۷۹۹d(this.f۱۲۵۳۲a.getText(positiveRes));
            return this;
        }

        /* renamed from: d, reason: contains not printable characters */
        public d m۱۳۷۹۹d(CharSequence message) {
            this.f۱۲۵۵۶m = message;
            return this;
        }

        /* renamed from: f, reason: contains not printable characters */
        public d m۱۳۸۰۲f(int colorRes) {
            m۱۳۷۹۲c(p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۲۲a(this.f۱۲۵۳۲a, colorRes));
            return this;
        }

        /* renamed from: c, reason: contains not printable characters */
        public d m۱۳۷۹۲c(ColorStateList colorStateList) {
            this.f۱۲۵۷۴v = colorStateList;
            this.f۱۲۵۰۲F0 = true;
            return this;
        }

        /* renamed from: e, reason: contains not printable characters */
        public d m۱۳۸۰۰e(int neutralRes) {
            if (neutralRes == 0) {
                return this;
            }
            m۱۳۷۹۵c(this.f۱۲۵۳۲a.getText(neutralRes));
            return this;
        }

        /* renamed from: c, reason: contains not printable characters */
        public d m۱۳۷۹۵c(CharSequence message) {
            this.f۱۲۵۵۸n = message;
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        public d m۱۳۷۸۶b(int colorRes) {
            m۱۳۷۷۵a(p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۲۲a(this.f۱۲۵۳۲a, colorRes));
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public d m۱۳۷۷۵a(ColorStateList colorStateList) {
            this.f۱۲۵۷۶w = colorStateList;
            this.f۱۲۵۰۶H0 = true;
            return this;
        }

        /* renamed from: c, reason: contains not printable characters */
        public d m۱۳۷۹۱c(int negativeRes) {
            if (negativeRes == 0) {
                return this;
            }
            m۱۳۷۹۰b(this.f۱۲۵۳۲a.getText(negativeRes));
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        public d m۱۳۷۹۰b(CharSequence message) {
            this.f۱۲۵۶۰o = message;
            return this;
        }

        /* renamed from: d, reason: contains not printable characters */
        public d m۱۳۷۹۷d(int color) {
            m۱۳۷۸۷b(p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۲b(this.f۱۲۵۳۲a, color));
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        public d m۱۳۷۸۷b(ColorStateList colorStateList) {
            this.f۱۲۵۷۸x = colorStateList;
            this.f۱۲۵۰۴G0 = true;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public d m۱۳۷۷۳a(int layoutRes, boolean wrapInScrollView) {
            LayoutInflater li = LayoutInflater.from(this.f۱۲۵۳۲a);
            m۱۳۷۷۶a(li.inflate(layoutRes, (ViewGroup) null), wrapInScrollView);
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public d m۱۳۷۷۶a(View view, boolean wrapInScrollView) {
            if (this.f۱۲۵۵۲k != null) {
                throw new IllegalStateException("You cannot use customView() when you have content set.");
            }
            if (this.f۱۲۵۵۴l != null) {
                throw new IllegalStateException("You cannot use customView() when you have items set.");
            }
            if (this.f۱۲۵۶۱o0 != null) {
                throw new IllegalStateException("You cannot use customView() with an input dialog");
            }
            if (this.f۱۲۵۵۳k0 > -2 || this.f۱۲۵۴۹i0) {
                throw new IllegalStateException("You cannot use customView() with a progress dialog");
            }
            if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f۱۲۵۶۸s = view;
            this.f۱۲۵۴۱e0 = wrapInScrollView;
            return this;
        }

        /* renamed from: c, reason: contains not printable characters */
        public d m۱۳۷۹۴c(m callback) {
            this.f۱۲۴۹۱A = callback;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public d m۱۳۷۷۸a(m callback) {
            this.f۱۲۴۹۳B = callback;
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        public d m۱۳۷۸۹b(m callback) {
            this.f۱۲۴۹۵C = callback;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public d m۱۳۷۷۹a(EnumCp theme) {
            this.f۱۲۵۱۱K = theme;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public d m۱۳۷۸۲a(boolean dismiss) {
            this.f۱۲۵۲۳R = dismiss;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public d m۱۳۷۷۴a(DialogInterface.OnShowListener listener) {
            this.f۱۲۵۳۷c0 = listener;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public ViewOnClickListenerCf m۱۳۷۸۴a() {
            return new ViewOnClickListenerCf(this);
        }

        /* renamed from: c, reason: contains not printable characters */
        public ViewOnClickListenerCf m۱۳۷۹۶c() {
            ViewOnClickListenerCf dialog = m۱۳۷۸۴a();
            dialog.show();
            return dialog;
        }
    }
}
