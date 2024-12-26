package com.afollestad.materialdialogs.color;

import android.R;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.AbstractCk;
import android.support.v4.app.AbstractCq;
import android.support.v4.app.ActivityCg;
import android.support.v4.app.ComponentCallbacksCf;
import android.support.v4.app.DialogInterfaceOnCancelListenerCe;
import android.support.v4.content.p۲۰۲e.Cf;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.SeekBar;
import android.widget.TextView;
import com.afollestad.materialdialogs.internal.Cc;
import java.io.Serializable;
import java.util.Locale;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.EnumCb;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.EnumCp;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.ViewOnClickListenerCf;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۱q.Cb;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۱q.Cd;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۱q.Ce;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca;

/* renamed from: com.afollestad.materialdialogs.color.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class ViewOnClickListenerCb extends DialogInterfaceOnCancelListenerCe implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: A0, reason: contains not printable characters */
    private SeekBar.OnSeekBarChangeListener f۱۳۲۳۷A0;

    /* renamed from: B0, reason: contains not printable characters */
    private int f۱۳۲۳۸B0;

    /* renamed from: j0, reason: contains not printable characters */
    private int[] f۱۳۲۳۹j0;

    /* renamed from: k0, reason: contains not printable characters */
    private int[][] f۱۳۲۴۰k0;

    /* renamed from: l0, reason: contains not printable characters */
    private int f۱۳۲۴۱l0;

    /* renamed from: m0, reason: contains not printable characters */
    private h f۱۳۲۴۲m0;

    /* renamed from: n0, reason: contains not printable characters */
    private GridView f۱۳۲۴۳n0;

    /* renamed from: o0, reason: contains not printable characters */
    private View f۱۳۲۴۴o0;

    /* renamed from: p0, reason: contains not printable characters */
    private EditText f۱۳۲۴۵p0;

    /* renamed from: q0, reason: contains not printable characters */
    private View f۱۳۲۴۶q0;

    /* renamed from: r0, reason: contains not printable characters */
    private TextWatcher f۱۳۲۴۷r0;

    /* renamed from: s0, reason: contains not printable characters */
    private SeekBar f۱۳۲۴۸s0;

    /* renamed from: t0, reason: contains not printable characters */
    private TextView f۱۳۲۴۹t0;

    /* renamed from: u0, reason: contains not printable characters */
    private SeekBar f۱۳۲۵۰u0;

    /* renamed from: v0, reason: contains not printable characters */
    private TextView f۱۳۲۵۱v0;

    /* renamed from: w0, reason: contains not printable characters */
    private SeekBar f۱۳۲۵۲w0;

    /* renamed from: x0, reason: contains not printable characters */
    private TextView f۱۳۲۵۳x0;

    /* renamed from: y0, reason: contains not printable characters */
    private SeekBar f۱۳۲۵۴y0;

    /* renamed from: z0, reason: contains not printable characters */
    private TextView f۱۳۲۵۵z0;

    /* renamed from: com.afollestad.materialdialogs.color.b$h */
    public interface h {
        /* renamed from: a, reason: contains not printable characters */
        void mo۱۵۳۹۵a(ViewOnClickListenerCb viewOnClickListenerCb);

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۵۳۹۶a(ViewOnClickListenerCb viewOnClickListenerCb, int i);
    }

    /* renamed from: h0, reason: contains not printable characters */
    private void m۱۴۶۱۹h0() {
        g builder = m۱۴۶۲۱i0();
        int[] iArr = builder.f۱۳۲۷۲m;
        if (iArr != null) {
            this.f۱۳۲۳۹j0 = iArr;
            this.f۱۳۲۴۰k0 = builder.f۱۳۲۷۳n;
        } else if (builder.f۱۳۲۷۵p) {
            this.f۱۳۲۳۹j0 = Cc.f۱۳۲۸۳c;
            this.f۱۳۲۴۰k0 = Cc.f۱۳۲۸۴d;
        } else {
            this.f۱۳۲۳۹j0 = Cc.f۱۳۲۸۱a;
            this.f۱۳۲۴۰k0 = Cc.f۱۳۲۸۲b;
        }
    }

    @Override // android.support.v4.app.DialogInterfaceOnCancelListenerCe, android.support.v4.app.ComponentCallbacksCf
    /* renamed from: e, reason: contains not printable characters */
    public void mo۱۴۶۴۴e(Bundle outState) {
        super.mo۱۴۶۴۴e(outState);
        outState.putInt("top_index", m۱۴۶۳۴o0());
        outState.putBoolean("in_sub", m۱۴۶۳۰m0());
        outState.putInt("sub_index", m۱۴۶۳۲n0());
        View view = this.f۱۳۲۴۴o0;
        outState.putBoolean("in_custom", view != null && view.getVisibility() == 0);
    }

    @Override // android.support.v4.app.DialogInterfaceOnCancelListenerCe, android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۴۶۴۳a(Context context) {
        super.mo۱۴۶۴۳a(context);
        if (m۱۰۱۲۷d() instanceof h) {
            this.f۱۳۲۴۲m0 = (h) m۱۰۱۲۷d();
        } else {
            if (m۱۰۱۶۱t() instanceof h) {
                this.f۱۳۲۴۲m0 = (h) m۱۰۱۶۱t();
                return;
            }
            throw new IllegalStateException("ColorChooserDialog needs to be shown from an Activity/Fragment implementing ColorCallback.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0, reason: contains not printable characters */
    public boolean m۱۴۶۳۰m0() {
        return m۱۰۱۴۵i().getBoolean("in_sub", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j, reason: contains not printable characters */
    public void m۱۴۶۲۳j(boolean value) {
        m۱۰۱۴۵i().putBoolean("in_sub", value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0, reason: contains not printable characters */
    public int m۱۴۶۳۴o0() {
        return m۱۰۱۴۵i().getInt("top_index", -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f, reason: contains not printable characters */
    public void m۱۴۶۱۶f(int value) {
        if (value > -1) {
            m۱۴۶۰۷b(value, this.f۱۳۲۳۹j0[value]);
        }
        m۱۰۱۴۵i().putInt("top_index", value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0, reason: contains not printable characters */
    public int m۱۴۶۳۲n0() {
        if (this.f۱۳۲۴۰k0 == null) {
            return -1;
        }
        return m۱۰۱۴۵i().getInt("sub_index", -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: contains not printable characters */
    public void m۱۴۶۱۴e(int value) {
        if (this.f۱۳۲۴۰k0 == null) {
            return;
        }
        m۱۰۱۴۵i().putInt("sub_index", value);
    }

    /* renamed from: g0, reason: contains not printable characters */
    public int m۱۴۶۴۵g0() {
        int title;
        g builder = m۱۴۶۲۱i0();
        if (m۱۴۶۳۰m0()) {
            title = builder.f۱۳۲۶۵f;
        } else {
            title = builder.f۱۳۲۶۴e;
        }
        if (title == 0) {
            int title2 = builder.f۱۳۲۶۴e;
            return title2;
        }
        return title;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        if (v.getTag() != null) {
            String[] tag = ((String) v.getTag()).split(":");
            int index = Integer.parseInt(tag[0]);
            ViewOnClickListenerCf dialog = (ViewOnClickListenerCf) m۱۰۰۴۶e0();
            g builder = m۱۴۶۲۱i0();
            if (m۱۴۶۳۰m0()) {
                m۱۴۶۱۴e(index);
            } else {
                m۱۴۶۱۶f(index);
                int[][] iArr = this.f۱۳۲۴۰k0;
                if (iArr != null && index < iArr.length) {
                    dialog.m۱۳۷۵۹a(EnumCb.NEGATIVE, builder.f۱۳۲۶۸i);
                    m۱۴۶۲۳j(true);
                }
            }
            if (builder.f۱۳۲۷۷r) {
                this.f۱۳۲۳۸B0 = m۱۴۶۲۴j0();
            }
            m۱۴۶۲۸l0();
            m۱۴۶۲۶k0();
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View v) {
        if (v.getTag() != null) {
            String[] tag = ((String) v.getTag()).split(":");
            int color = Integer.parseInt(tag[1]);
            ((Ca) v).m۱۴۶۰۰a(color);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0, reason: contains not printable characters */
    public void m۱۴۶۲۸l0() {
        ViewOnClickListenerCf dialog = (ViewOnClickListenerCf) m۱۰۰۴۶e0();
        if (dialog == null) {
            return;
        }
        g builder = m۱۴۶۲۱i0();
        if (builder.f۱۳۲۷۶q) {
            int selectedColor = m۱۴۶۲۴j0();
            if (Color.alpha(selectedColor) < 64 || (Color.red(selectedColor) > 247 && Color.green(selectedColor) > 247 && Color.blue(selectedColor) > 247)) {
                selectedColor = Color.parseColor("#DEDEDE");
            }
            if (m۱۴۶۲۱i0().f۱۳۲۷۶q) {
                dialog.m۱۳۷۵۶a(EnumCb.POSITIVE).setTextColor(selectedColor);
                dialog.m۱۳۷۵۶a(EnumCb.NEGATIVE).setTextColor(selectedColor);
                dialog.m۱۳۷۵۶a(EnumCb.NEUTRAL).setTextColor(selectedColor);
            }
            if (this.f۱۳۲۵۰u0 != null) {
                if (this.f۱۳۲۴۸s0.getVisibility() == 0) {
                    Cc.m۱۴۶۹۵a(this.f۱۳۲۴۸s0, selectedColor);
                }
                Cc.m۱۴۶۹۵a(this.f۱۳۲۵۰u0, selectedColor);
                Cc.m۱۴۶۹۵a(this.f۱۳۲۵۲w0, selectedColor);
                Cc.m۱۴۶۹۵a(this.f۱۳۲۵۴y0, selectedColor);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0, reason: contains not printable characters */
    public int m۱۴۶۲۴j0() {
        View view = this.f۱۳۲۴۴o0;
        if (view != null && view.getVisibility() == 0) {
            return this.f۱۳۲۳۸B0;
        }
        int color = 0;
        if (m۱۴۶۳۲n0() > -1) {
            color = this.f۱۳۲۴۰k0[m۱۴۶۳۴o0()][m۱۴۶۳۲n0()];
        } else if (m۱۴۶۳۴o0() > -1) {
            color = this.f۱۳۲۳۹j0[m۱۴۶۳۴o0()];
        }
        if (color == 0) {
            int fallback = 0;
            if (Build.VERSION.SDK_INT >= 21) {
                fallback = Ca.m۱۳۸۳۶e(m۱۰۱۲۷d(), R.attr.colorAccent);
            }
            int color2 = Ca.m۱۳۸۲۰a(m۱۰۱۲۷d(), p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۱q.Ca.colorAccent, fallback);
            return color2;
        }
        return color;
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۴۶۰۷b(int topIndex, int color) {
        int[][] iArr = this.f۱۳۲۴۰k0;
        if (iArr == null || iArr.length - 1 < topIndex) {
            return;
        }
        int[] subColors = iArr[topIndex];
        for (int subIndex = 0; subIndex < subColors.length; subIndex++) {
            if (subColors[subIndex] == color) {
                m۱۴۶۱۴e(subIndex);
                return;
            }
        }
    }

    @Override // android.support.v4.app.DialogInterfaceOnCancelListenerCe
    /* renamed from: n, reason: contains not printable characters */
    public Dialog mo۱۴۶۴۶n(Bundle savedInstanceState) {
        int preselectColor;
        if (m۱۰۱۴۵i() == null || !m۱۰۱۴۵i().containsKey("builder")) {
            throw new IllegalStateException("ColorChooserDialog should be created using its Builder interface.");
        }
        m۱۴۶۱۹h0();
        boolean foundPreselectColor = false;
        if (savedInstanceState != null) {
            foundPreselectColor = !savedInstanceState.getBoolean("in_custom", false);
            preselectColor = m۱۴۶۲۴j0();
        } else if (m۱۴۶۲۱i0().f۱۳۲۷۹t) {
            preselectColor = m۱۴۶۲۱i0().f۱۳۲۶۶g;
            if (preselectColor != 0) {
                int topIndex = 0;
                while (true) {
                    int[] iArr = this.f۱۳۲۳۹j0;
                    if (topIndex >= iArr.length) {
                        break;
                    }
                    if (iArr[topIndex] == preselectColor) {
                        foundPreselectColor = true;
                        m۱۴۶۱۶f(topIndex);
                        if (m۱۴۶۲۱i0().f۱۳۲۷۵p) {
                            m۱۴۶۱۴e(2);
                        } else if (this.f۱۳۲۴۰k0 != null) {
                            m۱۴۶۰۷b(topIndex, preselectColor);
                        } else {
                            m۱۴۶۱۴e(5);
                        }
                    } else {
                        if (this.f۱۳۲۴۰k0 != null) {
                            int subIndex = 0;
                            while (true) {
                                int[][] iArr2 = this.f۱۳۲۴۰k0;
                                if (subIndex >= iArr2[topIndex].length) {
                                    break;
                                }
                                if (iArr2[topIndex][subIndex] != preselectColor) {
                                    subIndex++;
                                } else {
                                    foundPreselectColor = true;
                                    m۱۴۶۱۶f(topIndex);
                                    m۱۴۶۱۴e(subIndex);
                                    break;
                                }
                            }
                            if (foundPreselectColor) {
                                break;
                            }
                        }
                        topIndex++;
                    }
                }
            }
        } else {
            preselectColor = -16777216;
            foundPreselectColor = true;
        }
        this.f۱۳۲۴۱l0 = m۱۰۱۶۳v().getDimensionPixelSize(Cb.md_colorchooser_circlesize);
        g builder = m۱۴۶۲۱i0();
        ViewOnClickListenerCf.d dVar = new ViewOnClickListenerCf.d(m۱۰۱۲۷d());
        dVar.m۱۳۸۰۴h(m۱۴۶۴۵g0());
        dVar.m۱۳۷۸۲a(false);
        dVar.m۱۳۷۷۳a(Ce.md_dialog_colorchooser, false);
        dVar.m۱۳۷۹۱c(builder.f۱۳۲۶۹j);
        dVar.m۱۳۸۰۳g(builder.f۱۳۲۶۷h);
        dVar.m۱۳۸۰۰e(builder.f۱۳۲۷۷r ? builder.f۱۳۲۷۰k : 0);
        dVar.m۱۳۷۸۱a(builder.f۱۳۲۶۲c, builder.f۱۳۲۶۳d);
        dVar.m۱۳۷۹۴c(new d());
        dVar.m۱۳۷۷۸a(new c());
        dVar.m۱۳۷۸۹b(new b());
        ViewOnClickListenerCf.d bd = dVar.m۱۳۷۷۴a(new a());
        EnumCp enumCp = builder.f۱۳۲۷۴o;
        if (enumCp != null) {
            bd.m۱۳۷۷۹a(enumCp);
        }
        ViewOnClickListenerCf dialog = bd.m۱۳۷۸۴a();
        View v = dialog.m۱۳۷۶۴d();
        this.f۱۳۲۴۳n0 = (GridView) v.findViewById(Cd.md_grid);
        if (builder.f۱۳۲۷۷r) {
            this.f۱۳۲۳۸B0 = preselectColor;
            this.f۱۳۲۴۴o0 = v.findViewById(Cd.md_colorChooserCustomFrame);
            this.f۱۳۲۴۵p0 = (EditText) v.findViewById(Cd.md_hexInput);
            this.f۱۳۲۴۶q0 = v.findViewById(Cd.md_colorIndicator);
            this.f۱۳۲۴۸s0 = (SeekBar) v.findViewById(Cd.md_colorA);
            this.f۱۳۲۴۹t0 = (TextView) v.findViewById(Cd.md_colorAValue);
            this.f۱۳۲۵۰u0 = (SeekBar) v.findViewById(Cd.md_colorR);
            this.f۱۳۲۵۱v0 = (TextView) v.findViewById(Cd.md_colorRValue);
            this.f۱۳۲۵۲w0 = (SeekBar) v.findViewById(Cd.md_colorG);
            this.f۱۳۲۵۳x0 = (TextView) v.findViewById(Cd.md_colorGValue);
            this.f۱۳۲۵۴y0 = (SeekBar) v.findViewById(Cd.md_colorB);
            this.f۱۳۲۵۵z0 = (TextView) v.findViewById(Cd.md_colorBValue);
            if (!builder.f۱۳۲۷۸s) {
                v.findViewById(Cd.md_colorALabel).setVisibility(8);
                this.f۱۳۲۴۸s0.setVisibility(8);
                this.f۱۳۲۴۹t0.setVisibility(8);
                this.f۱۳۲۴۵p0.setHint("2196F3");
                this.f۱۳۲۴۵p0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
            } else {
                this.f۱۳۲۴۵p0.setHint("FF2196F3");
                this.f۱۳۲۴۵p0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8)});
            }
            if (!foundPreselectColor) {
                m۱۴۶۰۱a(dialog);
            }
        }
        m۱۴۶۲۶k0();
        return dialog;
    }

    /* renamed from: com.afollestad.materialdialogs.color.b$d */
    class d implements ViewOnClickListenerCf.m {
        d() {
        }

        @Override // p۲۰۸b.p۲۰۹a.p۲۱۰a.ViewOnClickListenerCf.m
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۵۴۰۰a(ViewOnClickListenerCf dialog, EnumCb which) {
            h hVar = ViewOnClickListenerCb.this.f۱۳۲۴۲m0;
            ViewOnClickListenerCb viewOnClickListenerCb = ViewOnClickListenerCb.this;
            hVar.mo۱۵۳۹۶a(viewOnClickListenerCb, viewOnClickListenerCb.m۱۴۶۲۴j0());
            ViewOnClickListenerCb.this.m۱۰۰۴۴d0();
        }
    }

    /* renamed from: com.afollestad.materialdialogs.color.b$c */
    class c implements ViewOnClickListenerCf.m {
        c() {
        }

        @Override // p۲۰۸b.p۲۰۹a.p۲۱۰a.ViewOnClickListenerCf.m
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۵۴۰۰a(ViewOnClickListenerCf dialog, EnumCb which) {
            if (ViewOnClickListenerCb.this.m۱۴۶۳۰m0()) {
                dialog.m۱۳۷۵۹a(EnumCb.NEGATIVE, ViewOnClickListenerCb.this.m۱۴۶۲۱i0().f۱۳۲۶۹j);
                ViewOnClickListenerCb.this.m۱۴۶۲۳j(false);
                ViewOnClickListenerCb.this.m۱۴۶۱۴e(-1);
                ViewOnClickListenerCb.this.m۱۴۶۲۶k0();
                return;
            }
            dialog.cancel();
        }
    }

    /* renamed from: com.afollestad.materialdialogs.color.b$b */
    class b implements ViewOnClickListenerCf.m {
        b() {
        }

        @Override // p۲۰۸b.p۲۰۹a.p۲۱۰a.ViewOnClickListenerCf.m
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۵۴۰۰a(ViewOnClickListenerCf dialog, EnumCb which) {
            ViewOnClickListenerCb.this.m۱۴۶۰۱a(dialog);
        }
    }

    /* renamed from: com.afollestad.materialdialogs.color.b$a */
    class a implements DialogInterface.OnShowListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialog) {
            ViewOnClickListenerCb.this.m۱۴۶۲۸l0();
        }
    }

    @Override // android.support.v4.app.DialogInterfaceOnCancelListenerCe, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        h hVar = this.f۱۳۲۴۲m0;
        if (hVar != null) {
            hVar.mo۱۵۳۹۵a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۶۰۱a(ViewOnClickListenerCf dialog) {
        if (dialog == null) {
            dialog = (ViewOnClickListenerCf) m۱۰۰۴۶e0();
        }
        if (this.f۱۳۲۴۳n0.getVisibility() == 0) {
            dialog.setTitle(m۱۴۶۲۱i0().f۱۳۲۷۰k);
            dialog.m۱۳۷۵۹a(EnumCb.NEUTRAL, m۱۴۶۲۱i0().f۱۳۲۷۱l);
            dialog.m۱۳۷۵۹a(EnumCb.NEGATIVE, m۱۴۶۲۱i0().f۱۳۲۶۹j);
            this.f۱۳۲۴۳n0.setVisibility(4);
            this.f۱۳۲۴۴o0.setVisibility(0);
            this.f۱۳۲۴۷r0 = new e();
            this.f۱۳۲۴۵p0.addTextChangedListener(this.f۱۳۲۴۷r0);
            this.f۱۳۲۳۷A0 = new f();
            this.f۱۳۲۵۰u0.setOnSeekBarChangeListener(this.f۱۳۲۳۷A0);
            this.f۱۳۲۵۲w0.setOnSeekBarChangeListener(this.f۱۳۲۳۷A0);
            this.f۱۳۲۵۴y0.setOnSeekBarChangeListener(this.f۱۳۲۳۷A0);
            if (this.f۱۳۲۴۸s0.getVisibility() == 0) {
                this.f۱۳۲۴۸s0.setOnSeekBarChangeListener(this.f۱۳۲۳۷A0);
                this.f۱۳۲۴۵p0.setText(String.format("%08X", Integer.valueOf(this.f۱۳۲۳۸B0)));
                return;
            } else {
                this.f۱۳۲۴۵p0.setText(String.format("%06X", Integer.valueOf(16777215 & this.f۱۳۲۳۸B0)));
                return;
            }
        }
        dialog.setTitle(m۱۴۶۲۱i0().f۱۳۲۶۴e);
        dialog.m۱۳۷۵۹a(EnumCb.NEUTRAL, m۱۴۶۲۱i0().f۱۳۲۷۰k);
        if (m۱۴۶۳۰m0()) {
            dialog.m۱۳۷۵۹a(EnumCb.NEGATIVE, m۱۴۶۲۱i0().f۱۳۲۶۸i);
        } else {
            dialog.m۱۳۷۵۹a(EnumCb.NEGATIVE, m۱۴۶۲۱i0().f۱۳۲۶۹j);
        }
        this.f۱۳۲۴۳n0.setVisibility(0);
        this.f۱۳۲۴۴o0.setVisibility(8);
        this.f۱۳۲۴۵p0.removeTextChangedListener(this.f۱۳۲۴۷r0);
        this.f۱۳۲۴۷r0 = null;
        this.f۱۳۲۵۰u0.setOnSeekBarChangeListener(null);
        this.f۱۳۲۵۲w0.setOnSeekBarChangeListener(null);
        this.f۱۳۲۵۴y0.setOnSeekBarChangeListener(null);
        this.f۱۳۲۳۷A0 = null;
    }

    /* renamed from: com.afollestad.materialdialogs.color.b$e */
    class e implements TextWatcher {
        e() {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            try {
                ViewOnClickListenerCb.this.f۱۳۲۳۸B0 = Color.parseColor("#" + s.toString());
            } catch (IllegalArgumentException e2) {
                ViewOnClickListenerCb.this.f۱۳۲۳۸B0 = -16777216;
            }
            ViewOnClickListenerCb.this.f۱۳۲۴۶q0.setBackgroundColor(ViewOnClickListenerCb.this.f۱۳۲۳۸B0);
            if (ViewOnClickListenerCb.this.f۱۳۲۴۸s0.getVisibility() == 0) {
                int alpha = Color.alpha(ViewOnClickListenerCb.this.f۱۳۲۳۸B0);
                ViewOnClickListenerCb.this.f۱۳۲۴۸s0.setProgress(alpha);
                ViewOnClickListenerCb.this.f۱۳۲۴۹t0.setText(String.format(Locale.US, "%d", Integer.valueOf(alpha)));
            }
            int red = Color.red(ViewOnClickListenerCb.this.f۱۳۲۳۸B0);
            ViewOnClickListenerCb.this.f۱۳۲۵۰u0.setProgress(red);
            int green = Color.green(ViewOnClickListenerCb.this.f۱۳۲۳۸B0);
            ViewOnClickListenerCb.this.f۱۳۲۵۲w0.setProgress(green);
            int blue = Color.blue(ViewOnClickListenerCb.this.f۱۳۲۳۸B0);
            ViewOnClickListenerCb.this.f۱۳۲۵۴y0.setProgress(blue);
            ViewOnClickListenerCb.this.m۱۴۶۲۳j(false);
            ViewOnClickListenerCb.this.m۱۴۶۱۶f(-1);
            ViewOnClickListenerCb.this.m۱۴۶۱۴e(-1);
            ViewOnClickListenerCb.this.m۱۴۶۲۸l0();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
        }
    }

    /* renamed from: com.afollestad.materialdialogs.color.b$f */
    class f implements SeekBar.OnSeekBarChangeListener {
        f() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        @SuppressLint({"DefaultLocale"})
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            if (fromUser) {
                if (ViewOnClickListenerCb.this.m۱۴۶۲۱i0().f۱۳۲۷۸s) {
                    int color = Color.argb(ViewOnClickListenerCb.this.f۱۳۲۴۸s0.getProgress(), ViewOnClickListenerCb.this.f۱۳۲۵۰u0.getProgress(), ViewOnClickListenerCb.this.f۱۳۲۵۲w0.getProgress(), ViewOnClickListenerCb.this.f۱۳۲۵۴y0.getProgress());
                    ViewOnClickListenerCb.this.f۱۳۲۴۵p0.setText(String.format("%08X", Integer.valueOf(color)));
                } else {
                    int color2 = Color.rgb(ViewOnClickListenerCb.this.f۱۳۲۵۰u0.getProgress(), ViewOnClickListenerCb.this.f۱۳۲۵۲w0.getProgress(), ViewOnClickListenerCb.this.f۱۳۲۵۴y0.getProgress());
                    ViewOnClickListenerCb.this.f۱۳۲۴۵p0.setText(String.format("%06X", Integer.valueOf(16777215 & color2)));
                }
            }
            ViewOnClickListenerCb.this.f۱۳۲۴۹t0.setText(String.format("%d", Integer.valueOf(ViewOnClickListenerCb.this.f۱۳۲۴۸s0.getProgress())));
            ViewOnClickListenerCb.this.f۱۳۲۵۱v0.setText(String.format("%d", Integer.valueOf(ViewOnClickListenerCb.this.f۱۳۲۵۰u0.getProgress())));
            ViewOnClickListenerCb.this.f۱۳۲۵۳x0.setText(String.format("%d", Integer.valueOf(ViewOnClickListenerCb.this.f۱۳۲۵۲w0.getProgress())));
            ViewOnClickListenerCb.this.f۱۳۲۵۵z0.setText(String.format("%d", Integer.valueOf(ViewOnClickListenerCb.this.f۱۳۲۵۴y0.getProgress())));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0, reason: contains not printable characters */
    public void m۱۴۶۲۶k0() {
        if (this.f۱۳۲۴۳n0.getAdapter() == null) {
            this.f۱۳۲۴۳n0.setAdapter((ListAdapter) new i());
            this.f۱۳۲۴۳n0.setSelector(Cf.m۱۰۶۱۴a(m۱۰۱۶۳v(), p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۱q.Cc.md_transparent, null));
        } else {
            ((BaseAdapter) this.f۱۳۲۴۳n0.getAdapter()).notifyDataSetChanged();
        }
        if (m۱۰۰۴۶e0() != null) {
            m۱۰۰۴۶e0().setTitle(m۱۴۶۴۵g0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0, reason: contains not printable characters */
    public g m۱۴۶۲۱i0() {
        if (m۱۰۱۴۵i() == null || !m۱۰۱۴۵i().containsKey("builder")) {
            return null;
        }
        return (g) m۱۰۱۴۵i().getSerializable("builder");
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۴۶۰۸b(AbstractCk fragmentManager, String tag) {
        ComponentCallbacksCf frag = fragmentManager.mo۱۰۳۰۴a(tag);
        if (frag != null) {
            ((DialogInterfaceOnCancelListenerCe) frag).m۱۰۰۴۴d0();
            AbstractCq abstractCq = fragmentManager.mo۱۰۳۰۶a();
            abstractCq.mo۱۰۴۰۸a(frag);
            abstractCq.mo۱۰۴۰۵a();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public ViewOnClickListenerCb m۱۴۶۴۲a(AbstractCk fragmentManager) {
        String tag;
        g builder = m۱۴۶۲۱i0();
        if (builder.f۱۳۲۷۲m != null) {
            tag = "[MD_COLOR_CHOOSER]";
        } else if (builder.f۱۳۲۷۵p) {
            tag = "[MD_COLOR_CHOOSER]";
        } else {
            tag = "[MD_COLOR_CHOOSER]";
        }
        m۱۴۶۰۸b(fragmentManager, tag);
        m۱۰۰۴۰a(fragmentManager, tag);
        return this;
    }

    /* renamed from: com.afollestad.materialdialogs.color.b$g */
    public static class g implements Serializable {

        /* renamed from: c, reason: contains not printable characters */
        String f۱۳۲۶۲c;

        /* renamed from: d, reason: contains not printable characters */
        String f۱۳۲۶۳d;

        /* renamed from: e, reason: contains not printable characters */
        final int f۱۳۲۶۴e;

        /* renamed from: f, reason: contains not printable characters */
        int f۱۳۲۶۵f;

        /* renamed from: g, reason: contains not printable characters */
        int f۱۳۲۶۶g;

        /* renamed from: m, reason: contains not printable characters */
        int[] f۱۳۲۷۲m;

        /* renamed from: n, reason: contains not printable characters */
        int[][] f۱۳۲۷۳n;

        /* renamed from: o, reason: contains not printable characters */
        EnumCp f۱۳۲۷۴o;

        /* renamed from: h, reason: contains not printable characters */
        int f۱۳۲۶۷h = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۱q.Cf.md_done_label;

        /* renamed from: i, reason: contains not printable characters */
        int f۱۳۲۶۸i = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۱q.Cf.md_back_label;

        /* renamed from: j, reason: contains not printable characters */
        int f۱۳۲۶۹j = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۱q.Cf.md_cancel_label;

        /* renamed from: k, reason: contains not printable characters */
        int f۱۳۲۷۰k = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۱q.Cf.md_custom_label;

        /* renamed from: l, reason: contains not printable characters */
        int f۱۳۲۷۱l = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۱q.Cf.md_presets_label;

        /* renamed from: p, reason: contains not printable characters */
        boolean f۱۳۲۷۵p = false;

        /* renamed from: q, reason: contains not printable characters */
        boolean f۱۳۲۷۶q = true;

        /* renamed from: r, reason: contains not printable characters */
        boolean f۱۳۲۷۷r = true;

        /* renamed from: s, reason: contains not printable characters */
        boolean f۱۳۲۷۸s = true;

        /* renamed from: t, reason: contains not printable characters */
        boolean f۱۳۲۷۹t = false;

        public g(Context context, int title) {
            this.f۱۳۲۶۴e = title;
        }

        /* renamed from: a, reason: contains not printable characters */
        public g m۱۴۶۵۱a(String medium, String regular) {
            this.f۱۳۲۶۲c = medium;
            this.f۱۳۲۶۳d = regular;
            return this;
        }

        /* renamed from: c, reason: contains not printable characters */
        public g m۱۴۶۵۹c(int preselect) {
            this.f۱۳۲۶۶g = preselect;
            this.f۱۳۲۷۹t = true;
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        public g m۱۴۶۵۷b(int text) {
            this.f۱۳۲۶۷h = text;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public g m۱۴۶۵۰a(int text) {
            this.f۱۳۲۶۹j = text;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public g m۱۴۶۵۳a(int[] topLevel, int[][] subLevel) {
            this.f۱۳۲۷۲m = topLevel;
            this.f۱۳۲۷۳n = subLevel;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public g m۱۴۶۵۲a(boolean allow) {
            this.f۱۳۲۷۷r = allow;
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        public g m۱۴۶۵۸b(boolean allow) {
            this.f۱۳۲۷۸s = allow;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public ViewOnClickListenerCb m۱۴۶۵۴a() {
            ViewOnClickListenerCb dialog = new ViewOnClickListenerCb();
            Bundle args = new Bundle();
            args.putSerializable("builder", this);
            dialog.m۱۰۱۵۴m(args);
            return dialog;
        }

        /* renamed from: a, reason: contains not printable characters */
        public ViewOnClickListenerCb m۱۴۶۵۶a(AbstractCk fragmentManager) {
            ViewOnClickListenerCb dialog = m۱۴۶۵۴a();
            dialog.m۱۴۶۴۲a(fragmentManager);
            return dialog;
        }

        /* renamed from: a, reason: contains not printable characters */
        public ViewOnClickListenerCb m۱۴۶۵۵a(ActivityCg fragmentActivity) {
            return m۱۴۶۵۶a(fragmentActivity.m۱۰۱۹۲e());
        }
    }

    /* renamed from: com.afollestad.materialdialogs.color.b$i */
    private class i extends BaseAdapter {
        i() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ViewOnClickListenerCb.this.m۱۴۶۳۰m0() ? ViewOnClickListenerCb.this.f۱۳۲۴۰k0[ViewOnClickListenerCb.this.m۱۴۶۳۴o0()].length : ViewOnClickListenerCb.this.f۱۳۲۳۹j0.length;
        }

        @Override // android.widget.Adapter
        public Object getItem(int position) {
            return ViewOnClickListenerCb.this.m۱۴۶۳۰m0() ? Integer.valueOf(ViewOnClickListenerCb.this.f۱۳۲۴۰k0[ViewOnClickListenerCb.this.m۱۴۶۳۴o0()][position]) : Integer.valueOf(ViewOnClickListenerCb.this.f۱۳۲۳۹j0[position]);
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.Adapter
        @SuppressLint({"DefaultLocale"})
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = new Ca(ViewOnClickListenerCb.this.m۱۰۱۴۹k());
                convertView.setLayoutParams(new AbsListView.LayoutParams(ViewOnClickListenerCb.this.f۱۳۲۴۱l0, ViewOnClickListenerCb.this.f۱۳۲۴۱l0));
            }
            Ca child = (Ca) convertView;
            int color = ViewOnClickListenerCb.this.m۱۴۶۳۰m0() ? ViewOnClickListenerCb.this.f۱۳۲۴۰k0[ViewOnClickListenerCb.this.m۱۴۶۳۴o0()][position] : ViewOnClickListenerCb.this.f۱۳۲۳۹j0[position];
            child.setBackgroundColor(color);
            if (ViewOnClickListenerCb.this.m۱۴۶۳۰m0()) {
                child.setSelected(ViewOnClickListenerCb.this.m۱۴۶۳۲n0() == position);
            } else {
                child.setSelected(ViewOnClickListenerCb.this.m۱۴۶۳۴o0() == position);
            }
            child.setTag(String.format("%d:%d", Integer.valueOf(position), Integer.valueOf(color)));
            child.setOnClickListener(ViewOnClickListenerCb.this);
            child.setOnLongClickListener(ViewOnClickListenerCb.this);
            return convertView;
        }
    }
}
