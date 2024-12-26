package p۰۵۲b.p۰۵۳a.p۰۵۴a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.support.p۰۴۷v7.widget.LinearLayoutManager;
import android.support.p۰۴۷v7.widget.RecyclerView;
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
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.Ca;

/* renamed from: b.a.a.f  reason: invalid class name */
public class View$OnClickListenerCf extends DialogCc implements View.OnClickListener, Ca.AbstractCc {

    /* renamed from: e  reason: contains not printable characters */
    protected final Cd f۱۲۴۶۷e;

    /* renamed from: f  reason: contains not printable characters */
    protected ImageView f۱۲۴۶۸f;

    /* renamed from: g  reason: contains not printable characters */
    protected TextView f۱۲۴۶۹g;

    /* renamed from: h  reason: contains not printable characters */
    protected TextView f۱۲۴۷۰h;

    /* renamed from: i  reason: contains not printable characters */
    EditText f۱۲۴۷۱i;

    /* renamed from: j  reason: contains not printable characters */
    RecyclerView f۱۲۴۷۲j;

    /* renamed from: k  reason: contains not printable characters */
    View f۱۲۴۷۳k;

    /* renamed from: l  reason: contains not printable characters */
    FrameLayout f۱۲۴۷۴l;

    /* renamed from: m  reason: contains not printable characters */
    ProgressBar f۱۲۴۷۵m;

    /* renamed from: n  reason: contains not printable characters */
    TextView f۱۲۴۷۶n;

    /* renamed from: o  reason: contains not printable characters */
    TextView f۱۲۴۷۷o;

    /* renamed from: p  reason: contains not printable characters */
    TextView f۱۲۴۷۸p;

    /* renamed from: q  reason: contains not printable characters */
    CheckBox f۱۲۴۷۹q;

    /* renamed from: r  reason: contains not printable characters */
    MDButton f۱۲۴۸۰r;

    /* renamed from: s  reason: contains not printable characters */
    MDButton f۱۲۴۸۱s;

    /* renamed from: t  reason: contains not printable characters */
    MDButton f۱۲۴۸۲t;

    /* renamed from: u  reason: contains not printable characters */
    EnumCl f۱۲۴۸۳u;

    /* renamed from: v  reason: contains not printable characters */
    List<Integer> f۱۲۴۸۴v;

    @Deprecated
    /* renamed from: b.a.a.f$e  reason: invalid class name */
    public static abstract class AbstractCe {
        @Deprecated
        /* renamed from: a  reason: contains not printable characters */
        public abstract void m۱۵۸۷۷a(View$OnClickListenerCf fVar);

        @Deprecated
        /* renamed from: b  reason: contains not printable characters */
        public abstract void m۱۵۸۷۸b(View$OnClickListenerCf fVar);

        @Deprecated
        /* renamed from: c  reason: contains not printable characters */
        public abstract void m۱۵۸۷۹c(View$OnClickListenerCf fVar);

        @Deprecated
        /* renamed from: d  reason: contains not printable characters */
        public abstract void m۱۵۸۸۰d(View$OnClickListenerCf fVar);
    }

    /* renamed from: b.a.a.f$g  reason: invalid class name */
    public interface AbstractCg {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۵۸۸۱a(View$OnClickListenerCf fVar, CharSequence charSequence);
    }

    /* renamed from: b.a.a.f$h  reason: invalid class name */
    public interface AbstractCh {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۵۸۸۲a(View$OnClickListenerCf fVar, View view, int i, CharSequence charSequence);
    }

    /* renamed from: b.a.a.f$i  reason: invalid class name */
    public interface AbstractCi {
        /* renamed from: a  reason: contains not printable characters */
        boolean m۱۵۸۸۳a(View$OnClickListenerCf fVar, Integer[] numArr, CharSequence[] charSequenceArr);
    }

    /* renamed from: b.a.a.f$j  reason: invalid class name */
    public interface AbstractCj {
        /* renamed from: a  reason: contains not printable characters */
        boolean m۱۵۸۸۴a(View$OnClickListenerCf fVar, View view, int i, CharSequence charSequence);
    }

    /* renamed from: b.a.a.f$k  reason: invalid class name */
    public interface AbstractCk {
        /* renamed from: a  reason: contains not printable characters */
        boolean m۱۵۸۸۵a(View$OnClickListenerCf fVar, View view, int i, CharSequence charSequence);
    }

    /* renamed from: b.a.a.f$m  reason: invalid class name */
    public interface AbstractCm {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۵۸۸۷a(View$OnClickListenerCf fVar, EnumCb bVar);
    }

    @SuppressLint({"InflateParams"})
    protected View$OnClickListenerCf(Cd builder) {
        super(builder.f۱۲۵۳۲a, Cd.m۱۵۸۱۸b(builder));
        new Handler();
        this.f۱۲۴۶۷e = builder;
        this.f۱۲۴۵۹c = (MDRootLayout) LayoutInflater.from(builder.f۱۲۵۳۲a).inflate(Cd.m۱۵۸۱۵a(builder), (ViewGroup) null);
        Cd.m۱۵۸۱۷a(this);
    }

    /* renamed from: c  reason: contains not printable characters */
    public final Cd m۱۵۸۳۳c() {
        return this.f۱۲۴۶۷e;
    }

    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۵۸۲۸a(TextView target, Typeface t) {
        if (t != null) {
            target.setPaintFlags(target.getPaintFlags() | 128);
            target.setTypeface(t);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public final void m۱۵۸۳۲b() {
        RecyclerView recyclerView = this.f۱۲۴۷۲j;
        if (recyclerView != null) {
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerCa());
        }
    }

    /* renamed from: b.a.a.f$a  reason: invalid class name */
    class ViewTreeObserver$OnGlobalLayoutListenerCa implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerCa() {
        }

        public void onGlobalLayout() {
            int selectedIndex;
            if (Build.VERSION.SDK_INT < 16) {
                View$OnClickListenerCf.this.f۱۲۴۷۲j.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else {
                View$OnClickListenerCf.this.f۱۲۴۷۲j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            EnumCl lVar = View$OnClickListenerCf.this.f۱۲۴۸۳u;
            if (lVar == EnumCl.SINGLE || lVar == EnumCl.MULTI) {
                View$OnClickListenerCf fVar = View$OnClickListenerCf.this;
                if (fVar.f۱۲۴۸۳u == EnumCl.SINGLE) {
                    Cd dVar = fVar.f۱۲۴۶۷e;
                    if (dVar.f۱۲۵۱۹O >= 0) {
                        selectedIndex = dVar.f۱۲۵۱۹O;
                    } else {
                        return;
                    }
                } else {
                    List<Integer> list = fVar.f۱۲۴۸۴v;
                    if (list != null && list.size() != 0) {
                        Collections.sort(View$OnClickListenerCf.this.f۱۲۴۸۴v);
                        selectedIndex = View$OnClickListenerCf.this.f۱۲۴۸۴v.get(0).intValue();
                    } else {
                        return;
                    }
                }
                View$OnClickListenerCf.this.f۱۲۴۷۲j.post(new RunnableCa(selectedIndex));
            }
        }

        /* renamed from: b.a.a.f$a$a  reason: invalid class name */
        class RunnableCa implements Runnable {

            /* renamed from: c  reason: contains not printable characters */
            final /* synthetic */ int f۱۲۴۸۶c;

            RunnableCa(int i) {
                this.f۱۲۴۸۶c = i;
            }

            public void run() {
                View$OnClickListenerCf.this.f۱۲۴۷۲j.requestFocus();
                View$OnClickListenerCf.this.f۱۲۴۶۷e.f۱۲۵۳۰Y.m۱۴۶۰۵h(this.f۱۲۴۸۶c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h  reason: contains not printable characters */
    public final void m۱۵۸۳۸h() {
        if (this.f۱۲۴۷۲j != null) {
            ArrayList<CharSequence> arrayList = this.f۱۲۴۶۷e.f۱۲۵۵۴l;
            if ((arrayList != null && arrayList.size() != 0) || this.f۱۲۴۶۷e.f۱۲۵۲۹X != null) {
                Cd dVar = this.f۱۲۴۶۷e;
                if (dVar.f۱۲۵۳۰Y == null) {
                    dVar.f۱۲۵۳۰Y = new LinearLayoutManager(getContext());
                }
                if (this.f۱۲۴۷۲j.getLayoutManager() == null) {
                    this.f۱۲۴۷۲j.setLayoutManager(this.f۱۲۴۶۷e.f۱۲۵۳۰Y);
                }
                this.f۱۲۴۷۲j.setAdapter(this.f۱۲۴۶۷e.f۱۲۵۲۹X);
                if (this.f۱۲۴۸۳u != null) {
                    ((Ca) this.f۱۲۴۶۷e.f۱۲۵۲۹X).m۱۵۸۰۸a(this);
                }
            }
        }
    }

    @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.Ca.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۵۸۳۱a(View$OnClickListenerCf dialog, View view, int position, CharSequence text, boolean longPress) {
        Cd dVar;
        AbstractCk kVar;
        Cd dVar2;
        AbstractCh hVar;
        if (!view.isEnabled()) {
            return false;
        }
        EnumCl lVar = this.f۱۲۴۸۳u;
        if (lVar == null || lVar == EnumCl.REGULAR) {
            if (this.f۱۲۴۶۷e.f۱۲۵۲۳R) {
                dismiss();
            }
            if (!longPress && (hVar = (dVar2 = this.f۱۲۴۶۷e).f۱۲۴۹۹E) != null) {
                hVar.m۱۵۸۸۲a(this, view, position, dVar2.f۱۲۵۵۴l.get(position));
            }
            if (longPress && (kVar = (dVar = this.f۱۲۴۶۷e).f۱۲۵۰۱F) != null) {
                return kVar.m۱۵۸۸۵a(this, view, position, dVar.f۱۲۵۵۴l.get(position));
            }
        } else if (lVar == EnumCl.MULTI) {
            CheckBox cb = (CheckBox) view.findViewById(Ck.md_control);
            if (!cb.isEnabled()) {
                return false;
            }
            if (!this.f۱۲۴۸۴v.contains(Integer.valueOf(position))) {
                this.f۱۲۴۸۴v.add(Integer.valueOf(position));
                if (!this.f۱۲۴۶۷e.f۱۲۵۰۷I) {
                    cb.setChecked(true);
                } else if (m۱۵۸۲۴j()) {
                    cb.setChecked(true);
                } else {
                    this.f۱۲۴۸۴v.remove(Integer.valueOf(position));
                }
            } else {
                this.f۱۲۴۸۴v.remove(Integer.valueOf(position));
                if (!this.f۱۲۴۶۷e.f۱۲۵۰۷I) {
                    cb.setChecked(false);
                } else if (m۱۵۸۲۴j()) {
                    cb.setChecked(false);
                } else {
                    this.f۱۲۴۸۴v.add(Integer.valueOf(position));
                }
            }
        } else if (lVar == EnumCl.SINGLE) {
            RadioButton radio = (RadioButton) view.findViewById(Ck.md_control);
            if (!radio.isEnabled()) {
                return false;
            }
            boolean allowSelection = true;
            Cd dVar3 = this.f۱۲۴۶۷e;
            int oldSelected = dVar3.f۱۲۵۱۹O;
            if (!dVar3.f۱۲۵۲۳R || dVar3.f۱۲۵۵۶m != null) {
                Cd dVar4 = this.f۱۲۴۶۷e;
                if (dVar4.f۱۲۵۰۹J) {
                    dVar4.f۱۲۵۱۹O = position;
                    allowSelection = m۱۵۸۲۳b(view);
                    this.f۱۲۴۶۷e.f۱۲۵۱۹O = oldSelected;
                }
            } else {
                dismiss();
                allowSelection = false;
                this.f۱۲۴۶۷e.f۱۲۵۱۹O = position;
                m۱۵۸۲۳b(view);
            }
            if (allowSelection) {
                this.f۱۲۴۶۷e.f۱۲۵۱۹O = position;
                radio.setChecked(true);
                this.f۱۲۴۶۷e.f۱۲۵۲۹X.m۱۴۴۴۷c(oldSelected);
                this.f۱۲۴۶۷e.f۱۲۵۲۹X.m۱۴۴۴۷c(position);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public final Drawable m۱۵۸۳۶f() {
        Cd dVar = this.f۱۲۴۶۷e;
        if (dVar.f۱۲۵۱۲K0 != 0) {
            return android.support.p۰۴۳v4.content.p۰۴۴e.Cf.m۱۲۶۸۴a(dVar.f۱۲۵۳۲a.getResources(), this.f۱۲۴۶۷e.f۱۲۵۱۲K0, null);
        }
        Drawable d = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۸g(dVar.f۱۲۵۳۲a, Cg.md_list_selector);
        if (d != null) {
            return d;
        }
        return p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۸g(getContext(), Cg.md_list_selector);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Drawable m۱۵۸۲۵a(EnumCb which, boolean isStacked) {
        if (isStacked) {
            Cd dVar = this.f۱۲۴۶۷e;
            if (dVar.f۱۲۵۱۴L0 != 0) {
                return android.support.p۰۴۳v4.content.p۰۴۴e.Cf.m۱۲۶۸۴a(dVar.f۱۲۵۳۲a.getResources(), this.f۱۲۴۶۷e.f۱۲۵۱۴L0, null);
            }
            Drawable d = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۸g(dVar.f۱۲۵۳۲a, Cg.md_btn_stacked_selector);
            if (d != null) {
                return d;
            }
            return p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۸g(getContext(), Cg.md_btn_stacked_selector);
        }
        int i = Cc.f۱۲۴۸۹a[which.ordinal()];
        if (i == 1) {
            Cd dVar2 = this.f۱۲۴۶۷e;
            if (dVar2.f۱۲۵۱۸N0 != 0) {
                return android.support.p۰۴۳v4.content.p۰۴۴e.Cf.m۱۲۶۸۴a(dVar2.f۱۲۵۳۲a.getResources(), this.f۱۲۴۶۷e.f۱۲۵۱۸N0, null);
            }
            Drawable d2 = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۸g(dVar2.f۱۲۵۳۲a, Cg.md_btn_neutral_selector);
            if (d2 != null) {
                return d2;
            }
            Drawable d3 = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۸g(getContext(), Cg.md_btn_neutral_selector);
            if (Build.VERSION.SDK_INT >= 21) {
                p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Cb.m۱۵۹۱۰a(d3, this.f۱۲۴۶۷e.f۱۲۵۴۶h);
            }
            return d3;
        } else if (i != 2) {
            Cd dVar3 = this.f۱۲۴۶۷e;
            if (dVar3.f۱۲۵۱۶M0 != 0) {
                return android.support.p۰۴۳v4.content.p۰۴۴e.Cf.m۱۲۶۸۴a(dVar3.f۱۲۵۳۲a.getResources(), this.f۱۲۴۶۷e.f۱۲۵۱۶M0, null);
            }
            Drawable d4 = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۸g(dVar3.f۱۲۵۳۲a, Cg.md_btn_positive_selector);
            if (d4 != null) {
                return d4;
            }
            Drawable d5 = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۸g(getContext(), Cg.md_btn_positive_selector);
            if (Build.VERSION.SDK_INT >= 21) {
                p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Cb.m۱۵۹۱۰a(d5, this.f۱۲۴۶۷e.f۱۲۵۴۶h);
            }
            return d5;
        } else {
            Cd dVar4 = this.f۱۲۴۶۷e;
            if (dVar4.f۱۲۵۲۰O0 != 0) {
                return android.support.p۰۴۳v4.content.p۰۴۴e.Cf.m۱۲۶۸۴a(dVar4.f۱۲۵۳۲a.getResources(), this.f۱۲۴۶۷e.f۱۲۵۲۰O0, null);
            }
            Drawable d6 = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۸g(dVar4.f۱۲۵۳۲a, Cg.md_btn_negative_selector);
            if (d6 != null) {
                return d6;
            }
            Drawable d7 = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۸g(getContext(), Cg.md_btn_negative_selector);
            if (Build.VERSION.SDK_INT >= 21) {
                p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Cb.m۱۵۹۱۰a(d7, this.f۱۲۴۶۷e.f۱۲۵۴۶h);
            }
            return d7;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۵۸۲۳b(View v) {
        Cd dVar = this.f۱۲۴۶۷e;
        if (dVar.f۱۲۵۰۳G == null) {
            return false;
        }
        CharSequence text = null;
        int i = dVar.f۱۲۵۱۹O;
        if (i >= 0 && i < dVar.f۱۲۵۵۴l.size()) {
            Cd dVar2 = this.f۱۲۴۶۷e;
            text = dVar2.f۱۲۵۵۴l.get(dVar2.f۱۲۵۱۹O);
        }
        Cd dVar3 = this.f۱۲۴۶۷e;
        return dVar3.f۱۲۵۰۳G.m۱۵۸۸۴a(this, v, dVar3.f۱۲۵۱۹O, text);
    }

    /* renamed from: j  reason: contains not printable characters */
    private boolean m۱۵۸۲۴j() {
        if (this.f۱۲۴۶۷e.f۱۲۵۰۵H == null) {
            return false;
        }
        Collections.sort(this.f۱۲۴۸۴v);
        List<CharSequence> selectedTitles = new ArrayList<>();
        for (Integer i : this.f۱۲۴۸۴v) {
            if (i.intValue() >= 0 && i.intValue() <= this.f۱۲۴۶۷e.f۱۲۵۵۴l.size() - 1) {
                selectedTitles.add(this.f۱۲۴۶۷e.f۱۲۵۵۴l.get(i.intValue()));
            }
        }
        AbstractCi iVar = this.f۱۲۴۶۷e.f۱۲۵۰۵H;
        List<Integer> list = this.f۱۲۴۸۴v;
        return iVar.m۱۵۸۸۳a(this, (Integer[]) list.toArray(new Integer[list.size()]), (CharSequence[]) selectedTitles.toArray(new CharSequence[selectedTitles.size()]));
    }

    public final void onClick(View v) {
        EditText editText;
        EnumCb tag = (EnumCb) v.getTag();
        int i = Cc.f۱۲۴۸۹a[tag.ordinal()];
        if (i == 1) {
            AbstractCe eVar = this.f۱۲۴۶۷e.f۱۲۵۸۲z;
            if (eVar != null) {
                eVar.m۱۵۸۷۷a(this);
                this.f۱۲۴۶۷e.f۱۲۵۸۲z.m۱۵۸۷۹c(this);
            }
            AbstractCm mVar = this.f۱۲۴۶۷e.f۱۲۴۹۵C;
            if (mVar != null) {
                mVar.m۱۵۸۸۷a(this, tag);
            }
            if (this.f۱۲۴۶۷e.f۱۲۵۲۳R) {
                dismiss();
            }
        } else if (i == 2) {
            AbstractCe eVar2 = this.f۱۲۴۶۷e.f۱۲۵۸۲z;
            if (eVar2 != null) {
                eVar2.m۱۵۸۷۷a(this);
                this.f۱۲۴۶۷e.f۱۲۵۸۲z.m۱۵۸۷۸b(this);
            }
            AbstractCm mVar2 = this.f۱۲۴۶۷e.f۱۲۴۹۳B;
            if (mVar2 != null) {
                mVar2.m۱۵۸۸۷a(this, tag);
            }
            if (this.f۱۲۴۶۷e.f۱۲۵۲۳R) {
                cancel();
            }
        } else if (i == 3) {
            AbstractCe eVar3 = this.f۱۲۴۶۷e.f۱۲۵۸۲z;
            if (eVar3 != null) {
                eVar3.m۱۵۸۷۷a(this);
                this.f۱۲۴۶۷e.f۱۲۵۸۲z.m۱۵۸۸۰d(this);
            }
            AbstractCm mVar3 = this.f۱۲۴۶۷e.f۱۲۴۹۱A;
            if (mVar3 != null) {
                mVar3.m۱۵۸۸۷a(this, tag);
            }
            if (!this.f۱۲۴۶۷e.f۱۲۵۰۹J) {
                m۱۵۸۲۳b(v);
            }
            if (!this.f۱۲۴۶۷e.f۱۲۵۰۷I) {
                m۱۵۸۲۴j();
            }
            Cd dVar = this.f۱۲۴۶۷e;
            AbstractCg gVar = dVar.f۱۲۵۶۱o0;
            if (!(gVar == null || (editText = this.f۱۲۴۷۱i) == null || dVar.f۱۲۵۶۷r0)) {
                gVar.m۱۵۸۸۱a(this, editText.getText());
            }
            if (this.f۱۲۴۶۷e.f۱۲۵۲۳R) {
                dismiss();
            }
        }
        AbstractCm mVar4 = this.f۱۲۴۶۷e.f۱۲۴۹۷D;
        if (mVar4 != null) {
            mVar4.m۱۵۸۸۷a(this, tag);
        }
    }

    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException e) {
            throw new Cf("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public final MDButton m۱۵۸۲۶a(EnumCb which) {
        int i = Cc.f۱۲۴۸۹a[which.ordinal()];
        if (i == 1) {
            return this.f۱۲۴۸۱s;
        }
        if (i != 2) {
            return this.f۱۲۴۸۰r;
        }
        return this.f۱۲۴۸۲t;
    }

    /* renamed from: g  reason: contains not printable characters */
    public final View m۱۵۸۳۷g() {
        return this.f۱۲۴۵۹c;
    }

    /* renamed from: e  reason: contains not printable characters */
    public final EditText m۱۵۸۳۵e() {
        return this.f۱۲۴۷۱i;
    }

    /* renamed from: d  reason: contains not printable characters */
    public final View m۱۵۸۳۴d() {
        return this.f۱۲۴۶۷e.f۱۲۵۶۸s;
    }

    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۵۸۳۰a(EnumCb which, CharSequence title) {
        int i = Cc.f۱۲۴۸۹a[which.ordinal()];
        int i2 = 8;
        if (i == 1) {
            this.f۱۲۴۶۷e.f۱۲۵۵۸n = title;
            this.f۱۲۴۸۱s.setText(title);
            MDButton mDButton = this.f۱۲۴۸۱s;
            if (title != null) {
                i2 = 0;
            }
            mDButton.setVisibility(i2);
        } else if (i != 2) {
            this.f۱۲۴۶۷e.f۱۲۵۵۶m = title;
            this.f۱۲۴۸۰r.setText(title);
            MDButton mDButton2 = this.f۱۲۴۸۰r;
            if (title != null) {
                i2 = 0;
            }
            mDButton2.setVisibility(i2);
        } else {
            this.f۱۲۴۶۷e.f۱۲۵۶۰o = title;
            this.f۱۲۴۸۲t.setText(title);
            MDButton mDButton3 = this.f۱۲۴۸۲t;
            if (title != null) {
                i2 = 0;
            }
            mDButton3.setVisibility(i2);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۵۸۲۹a(EnumCb which, int titleRes) {
        m۱۵۸۳۰a(which, getContext().getText(titleRes));
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence newTitle) {
        this.f۱۲۴۶۹g.setText(newTitle);
    }

    @Override // android.app.Dialog
    public final void setTitle(int newTitleRes) {
        setTitle(this.f۱۲۴۶۷e.f۱۲۵۳۲a.getString(newTitleRes));
    }

    @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.DialogCc
    public final void onShow(DialogInterface dialog) {
        if (this.f۱۲۴۷۱i != null) {
            p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۳b(this, this.f۱۲۴۶۷e);
            if (this.f۱۲۴۷۱i.getText().length() > 0) {
                EditText editText = this.f۱۲۴۷۱i;
                editText.setSelection(editText.getText().length());
            }
        }
        super.onShow(dialog);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i  reason: contains not printable characters */
    public void m۱۵۸۳۹i() {
        EditText editText = this.f۱۲۴۷۱i;
        if (editText != null) {
            editText.addTextChangedListener(new Cb());
        }
    }

    /* renamed from: b.a.a.f$b  reason: invalid class name */
    class Cb implements TextWatcher {
        Cb() {
        }

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
            int length = s.toString().length();
            boolean emptyDisabled = false;
            if (!View$OnClickListenerCf.this.f۱۲۴۶۷e.f۱۲۵۶۳p0) {
                boolean z = true;
                emptyDisabled = length == 0;
                View positiveAb = View$OnClickListenerCf.this.m۱۵۸۲۶a(EnumCb.POSITIVE);
                if (emptyDisabled) {
                    z = false;
                }
                positiveAb.setEnabled(z);
            }
            View$OnClickListenerCf.this.m۱۵۸۲۷a(length, emptyDisabled);
            View$OnClickListenerCf fVar = View$OnClickListenerCf.this;
            Cd dVar = fVar.f۱۲۴۶۷e;
            if (dVar.f۱۲۵۶۷r0) {
                dVar.f۱۲۵۶۱o0.m۱۵۸۸۱a(fVar, s);
            }
        }

        public void afterTextChanged(Editable s) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۸۲۷a(int currentLength, boolean emptyDisabled) {
        int i;
        TextView textView = this.f۱۲۴۷۸p;
        if (textView != null) {
            boolean z = true;
            if (this.f۱۲۴۶۷e.f۱۲۵۷۱t0 > 0) {
                textView.setText(String.format(Locale.getDefault(), "%d/%d", Integer.valueOf(currentLength), Integer.valueOf(this.f۱۲۴۶۷e.f۱۲۵۷۱t0)));
                this.f۱۲۴۷۸p.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            boolean isDisabled = (emptyDisabled && currentLength == 0) || ((i = this.f۱۲۴۶۷e.f۱۲۵۷۱t0) > 0 && currentLength > i) || currentLength < this.f۱۲۴۶۷e.f۱۲۵۶۹s0;
            Cd dVar = this.f۱۲۴۶۷e;
            int colorText = isDisabled ? dVar.f۱۲۵۷۳u0 : dVar.f۱۲۵۵۰j;
            Cd dVar2 = this.f۱۲۴۶۷e;
            int colorWidget = isDisabled ? dVar2.f۱۲۵۷۳u0 : dVar2.f۱۲۵۷۰t;
            if (this.f۱۲۴۶۷e.f۱۲۵۷۱t0 > 0) {
                this.f۱۲۴۷۸p.setTextColor(colorText);
            }
            com.afollestad.materialdialogs.internal.Cc.m۱۶۷۷۲b(this.f۱۲۴۷۱i, colorWidget);
            View positiveAb = m۱۵۸۲۶a(EnumCb.POSITIVE);
            if (isDisabled) {
                z = false;
            }
            positiveAb.setEnabled(z);
        }
    }

    public void dismiss() {
        if (this.f۱۲۴۷۱i != null) {
            p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۸۹۶a(this, this.f۱۲۴۶۷e);
        }
        super.dismiss();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.a.f$c  reason: invalid class name */
    public static /* synthetic */ class Cc {

        /* renamed from: a  reason: contains not printable characters */
        static final /* synthetic */ int[] f۱۲۴۸۹a = new int[EnumCb.values().length];

        /* renamed from: b  reason: contains not printable characters */
        static final /* synthetic */ int[] f۱۲۴۹۰b = new int[EnumCl.values().length];

        static {
            try {
                f۱۲۴۹۰b[EnumCl.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f۱۲۴۹۰b[EnumCl.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۱۲۴۹۰b[EnumCl.MULTI.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f۱۲۴۸۹a[EnumCb.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f۱۲۴۸۹a[EnumCb.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f۱۲۴۸۹a[EnumCb.POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError e6) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.a.f$l  reason: invalid class name */
    public enum EnumCl {
        REGULAR,
        SINGLE,
        MULTI;

        /* renamed from: a  reason: contains not printable characters */
        public static int m۱۵۸۸۶a(EnumCl type) {
            int i = Cc.f۱۲۴۹۰b[type.ordinal()];
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

    /* access modifiers changed from: private */
    /* renamed from: b.a.a.f$f  reason: invalid class name */
    public static class Cf extends WindowManager.BadTokenException {
        Cf(String message) {
            super(message);
        }
    }

    /* renamed from: b.a.a.f$d  reason: invalid class name */
    public static class Cd {

        /* renamed from: A  reason: contains not printable characters */
        protected AbstractCm f۱۲۴۹۱A;

        /* renamed from: A0  reason: contains not printable characters */
        protected NumberFormat f۱۲۴۹۲A0;

        /* renamed from: B  reason: contains not printable characters */
        protected AbstractCm f۱۲۴۹۳B;

        /* renamed from: B0  reason: contains not printable characters */
        protected boolean f۱۲۴۹۴B0;

        /* renamed from: C  reason: contains not printable characters */
        protected AbstractCm f۱۲۴۹۵C;

        /* renamed from: C0  reason: contains not printable characters */
        protected boolean f۱۲۴۹۶C0;

        /* renamed from: D  reason: contains not printable characters */
        protected AbstractCm f۱۲۴۹۷D;

        /* renamed from: D0  reason: contains not printable characters */
        protected boolean f۱۲۴۹۸D0;

        /* renamed from: E  reason: contains not printable characters */
        protected AbstractCh f۱۲۴۹۹E;

        /* renamed from: E0  reason: contains not printable characters */
        protected boolean f۱۲۵۰۰E0;

        /* renamed from: F  reason: contains not printable characters */
        protected AbstractCk f۱۲۵۰۱F;

        /* renamed from: F0  reason: contains not printable characters */
        protected boolean f۱۲۵۰۲F0;

        /* renamed from: G  reason: contains not printable characters */
        protected AbstractCj f۱۲۵۰۳G;

        /* renamed from: G0  reason: contains not printable characters */
        protected boolean f۱۲۵۰۴G0;

        /* renamed from: H  reason: contains not printable characters */
        protected AbstractCi f۱۲۵۰۵H;

        /* renamed from: H0  reason: contains not printable characters */
        protected boolean f۱۲۵۰۶H0;

        /* renamed from: I  reason: contains not printable characters */
        protected boolean f۱۲۵۰۷I;

        /* renamed from: I0  reason: contains not printable characters */
        protected boolean f۱۲۵۰۸I0;

        /* renamed from: J  reason: contains not printable characters */
        protected boolean f۱۲۵۰۹J;

        /* renamed from: J0  reason: contains not printable characters */
        protected boolean f۱۲۵۱۰J0;

        /* renamed from: K  reason: contains not printable characters */
        protected EnumCp f۱۲۵۱۱K;

        /* renamed from: K0  reason: contains not printable characters */
        protected int f۱۲۵۱۲K0;

        /* renamed from: L  reason: contains not printable characters */
        protected boolean f۱۲۵۱۳L;

        /* renamed from: L0  reason: contains not printable characters */
        protected int f۱۲۵۱۴L0;

        /* renamed from: M  reason: contains not printable characters */
        protected boolean f۱۲۵۱۵M;

        /* renamed from: M0  reason: contains not printable characters */
        protected int f۱۲۵۱۶M0;

        /* renamed from: N  reason: contains not printable characters */
        protected float f۱۲۵۱۷N;

        /* renamed from: N0  reason: contains not printable characters */
        protected int f۱۲۵۱۸N0;

        /* renamed from: O  reason: contains not printable characters */
        protected int f۱۲۵۱۹O;

        /* renamed from: O0  reason: contains not printable characters */
        protected int f۱۲۵۲۰O0;

        /* renamed from: P  reason: contains not printable characters */
        protected Integer[] f۱۲۵۲۱P;

        /* renamed from: Q  reason: contains not printable characters */
        protected Integer[] f۱۲۵۲۲Q;

        /* renamed from: R  reason: contains not printable characters */
        protected boolean f۱۲۵۲۳R;

        /* renamed from: S  reason: contains not printable characters */
        protected Typeface f۱۲۵۲۴S;

        /* renamed from: T  reason: contains not printable characters */
        protected Typeface f۱۲۵۲۵T;

        /* renamed from: U  reason: contains not printable characters */
        protected Drawable f۱۲۵۲۶U;

        /* renamed from: V  reason: contains not printable characters */
        protected boolean f۱۲۵۲۷V;

        /* renamed from: W  reason: contains not printable characters */
        protected int f۱۲۵۲۸W;

        /* renamed from: X  reason: contains not printable characters */
        protected RecyclerView.AbstractCg<?> f۱۲۵۲۹X;

        /* renamed from: Y  reason: contains not printable characters */
        protected RecyclerView.AbstractCo f۱۲۵۳۰Y;

        /* renamed from: Z  reason: contains not printable characters */
        protected DialogInterface.OnDismissListener f۱۲۵۳۱Z;

        /* renamed from: a  reason: contains not printable characters */
        protected final Context f۱۲۵۳۲a;

        /* renamed from: a0  reason: contains not printable characters */
        protected DialogInterface.OnCancelListener f۱۲۵۳۳a0;

        /* renamed from: b  reason: contains not printable characters */
        protected CharSequence f۱۲۵۳۴b;

        /* renamed from: b0  reason: contains not printable characters */
        protected DialogInterface.OnKeyListener f۱۲۵۳۵b0;

        /* renamed from: c  reason: contains not printable characters */
        protected EnumCe f۱۲۵۳۶c;

        /* renamed from: c0  reason: contains not printable characters */
        protected DialogInterface.OnShowListener f۱۲۵۳۷c0;

        /* renamed from: d  reason: contains not printable characters */
        protected EnumCe f۱۲۵۳۸d;

        /* renamed from: d0  reason: contains not printable characters */
        protected EnumCo f۱۲۵۳۹d0;

        /* renamed from: e  reason: contains not printable characters */
        protected EnumCe f۱۲۵۴۰e = EnumCe.END;

        /* renamed from: e0  reason: contains not printable characters */
        protected boolean f۱۲۵۴۱e0;

        /* renamed from: f  reason: contains not printable characters */
        protected EnumCe f۱۲۵۴۲f;

        /* renamed from: f0  reason: contains not printable characters */
        protected int f۱۲۵۴۳f0;

        /* renamed from: g  reason: contains not printable characters */
        protected EnumCe f۱۲۵۴۴g;

        /* renamed from: g0  reason: contains not printable characters */
        protected int f۱۲۵۴۵g0;

        /* renamed from: h  reason: contains not printable characters */
        protected int f۱۲۵۴۶h;

        /* renamed from: h0  reason: contains not printable characters */
        protected int f۱۲۵۴۷h0;

        /* renamed from: i  reason: contains not printable characters */
        protected int f۱۲۵۴۸i;

        /* renamed from: i0  reason: contains not printable characters */
        protected boolean f۱۲۵۴۹i0;

        /* renamed from: j  reason: contains not printable characters */
        protected int f۱۲۵۵۰j;

        /* renamed from: j0  reason: contains not printable characters */
        protected boolean f۱۲۵۵۱j0;

        /* renamed from: k  reason: contains not printable characters */
        protected CharSequence f۱۲۵۵۲k;

        /* renamed from: k0  reason: contains not printable characters */
        protected int f۱۲۵۵۳k0;

        /* renamed from: l  reason: contains not printable characters */
        protected ArrayList<CharSequence> f۱۲۵۵۴l;

        /* renamed from: l0  reason: contains not printable characters */
        protected int f۱۲۵۵۵l0;

        /* renamed from: m  reason: contains not printable characters */
        protected CharSequence f۱۲۵۵۶m;

        /* renamed from: m0  reason: contains not printable characters */
        protected CharSequence f۱۲۵۵۷m0;

        /* renamed from: n  reason: contains not printable characters */
        protected CharSequence f۱۲۵۵۸n;

        /* renamed from: n0  reason: contains not printable characters */
        protected CharSequence f۱۲۵۵۹n0;

        /* renamed from: o  reason: contains not printable characters */
        protected CharSequence f۱۲۵۶۰o;

        /* renamed from: o0  reason: contains not printable characters */
        protected AbstractCg f۱۲۵۶۱o0;

        /* renamed from: p  reason: contains not printable characters */
        protected boolean f۱۲۵۶۲p;

        /* renamed from: p0  reason: contains not printable characters */
        protected boolean f۱۲۵۶۳p0;

        /* renamed from: q  reason: contains not printable characters */
        protected boolean f۱۲۵۶۴q;

        /* renamed from: q0  reason: contains not printable characters */
        protected int f۱۲۵۶۵q0;

        /* renamed from: r  reason: contains not printable characters */
        protected boolean f۱۲۵۶۶r;

        /* renamed from: r0  reason: contains not printable characters */
        protected boolean f۱۲۵۶۷r0;

        /* renamed from: s  reason: contains not printable characters */
        protected View f۱۲۵۶۸s;

        /* renamed from: s0  reason: contains not printable characters */
        protected int f۱۲۵۶۹s0;

        /* renamed from: t  reason: contains not printable characters */
        protected int f۱۲۵۷۰t;

        /* renamed from: t0  reason: contains not printable characters */
        protected int f۱۲۵۷۱t0;

        /* renamed from: u  reason: contains not printable characters */
        protected ColorStateList f۱۲۵۷۲u;

        /* renamed from: u0  reason: contains not printable characters */
        protected int f۱۲۵۷۳u0;

        /* renamed from: v  reason: contains not printable characters */
        protected ColorStateList f۱۲۵۷۴v;

        /* renamed from: v0  reason: contains not printable characters */
        protected int[] f۱۲۵۷۵v0;

        /* renamed from: w  reason: contains not printable characters */
        protected ColorStateList f۱۲۵۷۶w;

        /* renamed from: w0  reason: contains not printable characters */
        protected CharSequence f۱۲۵۷۷w0;

        /* renamed from: x  reason: contains not printable characters */
        protected ColorStateList f۱۲۵۷۸x;

        /* renamed from: x0  reason: contains not printable characters */
        protected boolean f۱۲۵۷۹x0;

        /* renamed from: y  reason: contains not printable characters */
        protected ColorStateList f۱۲۵۸۰y;

        /* renamed from: y0  reason: contains not printable characters */
        protected CompoundButton.OnCheckedChangeListener f۱۲۵۸۱y0;

        /* renamed from: z  reason: contains not printable characters */
        protected AbstractCe f۱۲۵۸۲z;

        /* renamed from: z0  reason: contains not printable characters */
        protected String f۱۲۵۸۳z0;

        public Cd(Context context) {
            EnumCe eVar = EnumCe.START;
            this.f۱۲۵۳۶c = eVar;
            this.f۱۲۵۳۸d = eVar;
            EnumCe eVar2 = EnumCe.START;
            this.f۱۲۵۴۲f = eVar2;
            this.f۱۲۵۴۴g = eVar2;
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
            this.f۱۲۵۷۰t = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۸۹۰a(context, Cg.colorAccent, p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۴c(context, Ch.md_material_blue_600));
            if (Build.VERSION.SDK_INT >= 21) {
                this.f۱۲۵۷۰t = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۸۹۰a(context, 16843829, this.f۱۲۵۷۰t);
            }
            this.f۱۲۵۷۴v = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۲b(context, this.f۱۲۵۷۰t);
            this.f۱۲۵۷۶w = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۲b(context, this.f۱۲۵۷۰t);
            this.f۱۲۵۷۸x = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۲b(context, this.f۱۲۵۷۰t);
            this.f۱۲۵۸۰y = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۲b(context, p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۸۹۰a(context, Cg.md_link_color, this.f۱۲۵۷۰t));
            this.f۱۲۵۴۶h = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۸۹۰a(context, Cg.md_btn_ripple_color, p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۸۹۰a(context, Cg.colorControlHighlight, Build.VERSION.SDK_INT >= 21 ? p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۶e(context, 16843820) : 0));
            this.f۱۲۴۹۲A0 = NumberFormat.getPercentInstance();
            this.f۱۲۵۸۳z0 = "%1d/%2d";
            this.f۱۲۵۱۱K = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۸۹۸a(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۶e(context, 16842806)) ? EnumCp.LIGHT : EnumCp.DARK;
            m۱۵۸۴۰d();
            this.f۱۲۵۳۶c = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۸۹۵a(context, Cg.md_title_gravity, this.f۱۲۵۳۶c);
            this.f۱۲۵۳۸d = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۸۹۵a(context, Cg.md_content_gravity, this.f۱۲۵۳۸d);
            this.f۱۲۵۴۰e = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۸۹۵a(context, Cg.md_btnstacked_gravity, this.f۱۲۵۴۰e);
            this.f۱۲۵۴۲f = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۸۹۵a(context, Cg.md_items_gravity, this.f۱۲۵۴۲f);
            this.f۱۲۵۴۴g = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۸۹۵a(context, Cg.md_buttons_gravity, this.f۱۲۵۴۴g);
            try {
                m۱۵۸۵۱a(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۹h(context, Cg.md_medium_font), p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۹h(context, Cg.md_regular_font));
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

        /* renamed from: b  reason: contains not printable characters */
        public final Context m۱۵۸۵۵b() {
            return this.f۱۲۵۳۲a;
        }

        /* renamed from: d  reason: contains not printable characters */
        private void m۱۵۸۴۰d() {
            if (com.afollestad.materialdialogs.internal.Cd.m۱۶۷۷۴a(false) != null) {
                com.afollestad.materialdialogs.internal.Cd s = com.afollestad.materialdialogs.internal.Cd.m۱۶۷۷۳a();
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
        }

        /* renamed from: h  reason: contains not printable characters */
        public Cd m۱۵۸۷۴h(int titleRes) {
            m۱۵۸۷۱e(this.f۱۲۵۳۲a.getText(titleRes));
            return this;
        }

        /* renamed from: e  reason: contains not printable characters */
        public Cd m۱۵۸۷۱e(CharSequence title) {
            this.f۱۲۵۳۴b = title;
            return this;
        }

        /* renamed from: d  reason: contains not printable characters */
        public Cd m۱۵۸۶۸d(EnumCe gravity) {
            this.f۱۲۵۳۶c = gravity;
            return this;
        }

        /* renamed from: i  reason: contains not printable characters */
        public Cd m۱۵۸۷۵i(int color) {
            this.f۱۲۵۴۸i = color;
            this.f۱۲۴۹۶C0 = true;
            return this;
        }

        /* renamed from: j  reason: contains not printable characters */
        public Cd m۱۵۸۷۶j(int colorRes) {
            m۱۵۸۷۵i(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۴c(this.f۱۲۵۳۲a, colorRes));
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cd m۱۵۸۵۱a(String medium, String regular) {
            if (medium != null && !medium.trim().isEmpty()) {
                this.f۱۲۵۲۵T = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Cc.m۱۵۹۱۱a(this.f۱۲۵۳۲a, medium);
                if (this.f۱۲۵۲۵T == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + medium + "\"");
                }
            }
            if (regular != null && !regular.trim().isEmpty()) {
                this.f۱۲۵۲۴S = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Cc.m۱۵۹۱۱a(this.f۱۲۵۳۲a, regular);
                if (this.f۱۲۵۲۴S == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + regular + "\"");
                }
            }
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cd m۱۵۸۵۰a(CharSequence content) {
            if (this.f۱۲۵۶۸s == null) {
                this.f۱۲۵۵۲k = content;
                return this;
            }
            throw new IllegalStateException("You cannot set content() when you're using a custom view.");
        }

        /* renamed from: b  reason: contains not printable characters */
        public Cd m۱۵۸۵۸b(EnumCe gravity) {
            this.f۱۲۵۳۸d = gravity;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cd m۱۵۸۴۱a(int itemsRes) {
            m۱۵۸۵۳a(this.f۱۲۵۳۲a.getResources().getTextArray(itemsRes));
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cd m۱۵۸۵۳a(CharSequence... items) {
            if (this.f۱۲۵۶۸s == null) {
                this.f۱۲۵۵۴l = new ArrayList<>();
                Collections.addAll(this.f۱۲۵۵۴l, items);
                return this;
            }
            throw new IllegalStateException("You cannot set items() when you're using a custom view.");
        }

        /* renamed from: c  reason: contains not printable characters */
        public Cd m۱۵۸۶۳c(EnumCe gravity) {
            this.f۱۲۵۴۲f = gravity;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cd m۱۵۸۴۷a(EnumCe gravity) {
            this.f۱۲۵۴۴g = gravity;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cd m۱۵۸۴۲a(int selectedIndex, AbstractCj callback) {
            this.f۱۲۵۱۹O = selectedIndex;
            this.f۱۲۴۹۹E = null;
            this.f۱۲۵۰۳G = callback;
            this.f۱۲۵۰۵H = null;
            return this;
        }

        /* renamed from: g  reason: contains not printable characters */
        public Cd m۱۵۸۷۳g(int positiveRes) {
            if (positiveRes == 0) {
                return this;
            }
            m۱۵۸۶۹d(this.f۱۲۵۳۲a.getText(positiveRes));
            return this;
        }

        /* renamed from: d  reason: contains not printable characters */
        public Cd m۱۵۸۶۹d(CharSequence message) {
            this.f۱۲۵۵۶m = message;
            return this;
        }

        /* renamed from: f  reason: contains not printable characters */
        public Cd m۱۵۸۷۲f(int colorRes) {
            m۱۵۸۶۲c(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۸۹۲a(this.f۱۲۵۳۲a, colorRes));
            return this;
        }

        /* renamed from: c  reason: contains not printable characters */
        public Cd m۱۵۸۶۲c(ColorStateList colorStateList) {
            this.f۱۲۵۷۴v = colorStateList;
            this.f۱۲۵۰۲F0 = true;
            return this;
        }

        /* renamed from: e  reason: contains not printable characters */
        public Cd m۱۵۸۷۰e(int neutralRes) {
            if (neutralRes == 0) {
                return this;
            }
            m۱۵۸۶۵c(this.f۱۲۵۳۲a.getText(neutralRes));
            return this;
        }

        /* renamed from: c  reason: contains not printable characters */
        public Cd m۱۵۸۶۵c(CharSequence message) {
            this.f۱۲۵۵۸n = message;
            return this;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Cd m۱۵۸۵۶b(int colorRes) {
            m۱۵۸۴۵a(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۸۹۲a(this.f۱۲۵۳۲a, colorRes));
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cd m۱۵۸۴۵a(ColorStateList colorStateList) {
            this.f۱۲۵۷۶w = colorStateList;
            this.f۱۲۵۰۶H0 = true;
            return this;
        }

        /* renamed from: c  reason: contains not printable characters */
        public Cd m۱۵۸۶۱c(int negativeRes) {
            if (negativeRes == 0) {
                return this;
            }
            m۱۵۸۶۰b(this.f۱۲۵۳۲a.getText(negativeRes));
            return this;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Cd m۱۵۸۶۰b(CharSequence message) {
            this.f۱۲۵۶۰o = message;
            return this;
        }

        /* renamed from: d  reason: contains not printable characters */
        public Cd m۱۵۸۶۷d(int color) {
            m۱۵۸۵۷b(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۲b(this.f۱۲۵۳۲a, color));
            return this;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Cd m۱۵۸۵۷b(ColorStateList colorStateList) {
            this.f۱۲۵۷۸x = colorStateList;
            this.f۱۲۵۰۴G0 = true;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cd m۱۵۸۴۳a(int layoutRes, boolean wrapInScrollView) {
            m۱۵۸۴۶a(LayoutInflater.from(this.f۱۲۵۳۲a).inflate(layoutRes, (ViewGroup) null), wrapInScrollView);
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cd m۱۵۸۴۶a(View view, boolean wrapInScrollView) {
            if (this.f۱۲۵۵۲k != null) {
                throw new IllegalStateException("You cannot use customView() when you have content set.");
            } else if (this.f۱۲۵۵۴l != null) {
                throw new IllegalStateException("You cannot use customView() when you have items set.");
            } else if (this.f۱۲۵۶۱o0 != null) {
                throw new IllegalStateException("You cannot use customView() with an input dialog");
            } else if (this.f۱۲۵۵۳k0 > -2 || this.f۱۲۵۴۹i0) {
                throw new IllegalStateException("You cannot use customView() with a progress dialog");
            } else {
                if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                this.f۱۲۵۶۸s = view;
                this.f۱۲۵۴۱e0 = wrapInScrollView;
                return this;
            }
        }

        /* renamed from: c  reason: contains not printable characters */
        public Cd m۱۵۸۶۴c(AbstractCm callback) {
            this.f۱۲۴۹۱A = callback;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cd m۱۵۸۴۸a(AbstractCm callback) {
            this.f۱۲۴۹۳B = callback;
            return this;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Cd m۱۵۸۵۹b(AbstractCm callback) {
            this.f۱۲۴۹۵C = callback;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cd m۱۵۸۴۹a(EnumCp theme) {
            this.f۱۲۵۱۱K = theme;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cd m۱۵۸۵۲a(boolean dismiss) {
            this.f۱۲۵۲۳R = dismiss;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cd m۱۵۸۴۴a(DialogInterface.OnShowListener listener) {
            this.f۱۲۵۳۷c0 = listener;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public View$OnClickListenerCf m۱۵۸۵۴a() {
            return new View$OnClickListenerCf(this);
        }

        /* renamed from: c  reason: contains not printable characters */
        public View$OnClickListenerCf m۱۵۸۶۶c() {
            View$OnClickListenerCf dialog = m۱۵۸۵۴a();
            dialog.show();
            return dialog;
        }
    }
}
