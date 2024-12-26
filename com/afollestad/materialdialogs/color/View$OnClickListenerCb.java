package com.afollestad.materialdialogs.color;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.p۰۴۳v4.app.AbstractCk;
import android.support.p۰۴۳v4.app.AbstractCq;
import android.support.p۰۴۳v4.app.ActivityCg;
import android.support.p۰۴۳v4.app.ComponentCallbacksCf;
import android.support.p۰۴۳v4.app.DialogInterface$OnCancelListenerCe;
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
import java.io.Serializable;
import java.util.Locale;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCb;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCp;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca;

/* renamed from: com.afollestad.materialdialogs.color.b  reason: invalid class name */
public class View$OnClickListenerCb extends DialogInterface$OnCancelListenerCe implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: A0  reason: contains not printable characters */
    private SeekBar.OnSeekBarChangeListener f۱۳۲۳۷A0;

    /* renamed from: B0  reason: contains not printable characters */
    private int f۱۳۲۳۸B0;

    /* renamed from: j0  reason: contains not printable characters */
    private int[] f۱۳۲۳۹j0;

    /* renamed from: k0  reason: contains not printable characters */
    private int[][] f۱۳۲۴۰k0;

    /* renamed from: l0  reason: contains not printable characters */
    private int f۱۳۲۴۱l0;

    /* renamed from: m0  reason: contains not printable characters */
    private AbstractCh f۱۳۲۴۲m0;

    /* renamed from: n0  reason: contains not printable characters */
    private GridView f۱۳۲۴۳n0;

    /* renamed from: o0  reason: contains not printable characters */
    private View f۱۳۲۴۴o0;

    /* renamed from: p0  reason: contains not printable characters */
    private EditText f۱۳۲۴۵p0;

    /* renamed from: q0  reason: contains not printable characters */
    private View f۱۳۲۴۶q0;

    /* renamed from: r0  reason: contains not printable characters */
    private TextWatcher f۱۳۲۴۷r0;

    /* renamed from: s0  reason: contains not printable characters */
    private SeekBar f۱۳۲۴۸s0;

    /* renamed from: t0  reason: contains not printable characters */
    private TextView f۱۳۲۴۹t0;

    /* renamed from: u0  reason: contains not printable characters */
    private SeekBar f۱۳۲۵۰u0;

    /* renamed from: v0  reason: contains not printable characters */
    private TextView f۱۳۲۵۱v0;

    /* renamed from: w0  reason: contains not printable characters */
    private SeekBar f۱۳۲۵۲w0;

    /* renamed from: x0  reason: contains not printable characters */
    private TextView f۱۳۲۵۳x0;

    /* renamed from: y0  reason: contains not printable characters */
    private SeekBar f۱۳۲۵۴y0;

    /* renamed from: z0  reason: contains not printable characters */
    private TextView f۱۳۲۵۵z0;

    /* renamed from: com.afollestad.materialdialogs.color.b$h  reason: invalid class name */
    public interface AbstractCh {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۶۷۳۶a(View$OnClickListenerCb bVar);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۶۷۳۷a(View$OnClickListenerCb bVar, int i);
    }

    /* renamed from: h0  reason: contains not printable characters */
    private void m۱۶۶۹۵h0() {
        Cg builder = m۱۶۶۹۷i0();
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

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf, android.support.p۰۴۳v4.app.DialogInterface$OnCancelListenerCe
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۶۷۲۰e(Bundle outState) {
        super.m۱۲۱۱۵e(outState);
        outState.putInt("top_index", m۱۶۷۱۰o0());
        outState.putBoolean("in_sub", m۱۶۷۰۶m0());
        outState.putInt("sub_index", m۱۶۷۰۸n0());
        View view = this.f۱۳۲۴۴o0;
        outState.putBoolean("in_custom", view != null && view.getVisibility() == 0);
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf, android.support.p۰۴۳v4.app.DialogInterface$OnCancelListenerCe
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۷۱۹a(Context context) {
        super.m۱۲۱۰۹a(context);
        if (m۱۲۱۹۷d() instanceof AbstractCh) {
            this.f۱۳۲۴۲m0 = (AbstractCh) m۱۲۱۹۷d();
        } else if (m۱۲۲۳۱t() instanceof AbstractCh) {
            this.f۱۳۲۴۲m0 = (AbstractCh) m۱۲۲۳۱t();
        } else {
            throw new IllegalStateException("ColorChooserDialog needs to be shown from an Activity/Fragment implementing ColorCallback.");
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: m0  reason: contains not printable characters */
    private boolean m۱۶۷۰۶m0() {
        return m۱۲۲۱۵i().getBoolean("in_sub", false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: j  reason: contains not printable characters */
    private void m۱۶۶۹۹j(boolean value) {
        m۱۲۲۱۵i().putBoolean("in_sub", value);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: o0  reason: contains not printable characters */
    private int m۱۶۷۱۰o0() {
        return m۱۲۲۱۵i().getInt("top_index", -1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f  reason: contains not printable characters */
    private void m۱۶۶۹۲f(int value) {
        if (value > -1) {
            m۱۶۶۸۳b(value, this.f۱۳۲۳۹j0[value]);
        }
        m۱۲۲۱۵i().putInt("top_index", value);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: n0  reason: contains not printable characters */
    private int m۱۶۷۰۸n0() {
        if (this.f۱۳۲۴۰k0 == null) {
            return -1;
        }
        return m۱۲۲۱۵i().getInt("sub_index", -1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e  reason: contains not printable characters */
    private void m۱۶۶۹۰e(int value) {
        if (this.f۱۳۲۴۰k0 != null) {
            m۱۲۲۱۵i().putInt("sub_index", value);
        }
    }

    /* renamed from: g0  reason: contains not printable characters */
    public int m۱۶۷۲۱g0() {
        int title;
        Cg builder = m۱۶۶۹۷i0();
        if (m۱۶۷۰۶m0()) {
            title = builder.f۱۳۲۶۵f;
        } else {
            title = builder.f۱۳۲۶۴e;
        }
        if (title == 0) {
            return builder.f۱۳۲۶۴e;
        }
        return title;
    }

    public void onClick(View v) {
        if (v.getTag() != null) {
            int index = Integer.parseInt(((String) v.getTag()).split(":")[0]);
            View$OnClickListenerCf dialog = (View$OnClickListenerCf) m۱۲۱۱۶e0();
            Cg builder = m۱۶۶۹۷i0();
            if (m۱۶۷۰۶m0()) {
                m۱۶۶۹۰e(index);
            } else {
                m۱۶۶۹۲f(index);
                int[][] iArr = this.f۱۳۲۴۰k0;
                if (iArr != null && index < iArr.length) {
                    dialog.m۱۵۸۲۹a(EnumCb.NEGATIVE, builder.f۱۳۲۶۸i);
                    m۱۶۶۹۹j(true);
                }
            }
            if (builder.f۱۳۲۷۷r) {
                this.f۱۳۲۳۸B0 = m۱۶۷۰۰j0();
            }
            m۱۶۷۰۴l0();
            m۱۶۷۰۲k0();
        }
    }

    public boolean onLongClick(View v) {
        if (v.getTag() == null) {
            return false;
        }
        ((Ca) v).m۱۶۶۷۶a(Integer.parseInt(((String) v.getTag()).split(":")[1]));
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: l0  reason: contains not printable characters */
    private void m۱۶۷۰۴l0() {
        View$OnClickListenerCf dialog = (View$OnClickListenerCf) m۱۲۱۱۶e0();
        if (dialog != null && m۱۶۶۹۷i0().f۱۳۲۷۶q) {
            int selectedColor = m۱۶۷۰۰j0();
            if (Color.alpha(selectedColor) < 64 || (Color.red(selectedColor) > 247 && Color.green(selectedColor) > 247 && Color.blue(selectedColor) > 247)) {
                selectedColor = Color.parseColor("#DEDEDE");
            }
            if (m۱۶۶۹۷i0().f۱۳۲۷۶q) {
                dialog.m۱۵۸۲۶a(EnumCb.POSITIVE).setTextColor(selectedColor);
                dialog.m۱۵۸۲۶a(EnumCb.NEGATIVE).setTextColor(selectedColor);
                dialog.m۱۵۸۲۶a(EnumCb.NEUTRAL).setTextColor(selectedColor);
            }
            if (this.f۱۳۲۵۰u0 != null) {
                if (this.f۱۳۲۴۸s0.getVisibility() == 0) {
                    com.afollestad.materialdialogs.internal.Cc.m۱۶۷۷۱a(this.f۱۳۲۴۸s0, selectedColor);
                }
                com.afollestad.materialdialogs.internal.Cc.m۱۶۷۷۱a(this.f۱۳۲۵۰u0, selectedColor);
                com.afollestad.materialdialogs.internal.Cc.m۱۶۷۷۱a(this.f۱۳۲۵۲w0, selectedColor);
                com.afollestad.materialdialogs.internal.Cc.m۱۶۷۷۱a(this.f۱۳۲۵۴y0, selectedColor);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: j0  reason: contains not printable characters */
    private int m۱۶۷۰۰j0() {
        View view = this.f۱۳۲۴۴o0;
        if (view != null && view.getVisibility() == 0) {
            return this.f۱۳۲۳۸B0;
        }
        int color = 0;
        if (m۱۶۷۰۸n0() > -1) {
            color = this.f۱۳۲۴۰k0[m۱۶۷۱۰o0()][m۱۶۷۰۸n0()];
        } else if (m۱۶۷۱۰o0() > -1) {
            color = this.f۱۳۲۳۹j0[m۱۶۷۱۰o0()];
        }
        if (color != 0) {
            return color;
        }
        int fallback = 0;
        if (Build.VERSION.SDK_INT >= 21) {
            fallback = Ca.m۱۵۹۰۶e(m۱۲۱۹۷d(), 16843829);
        }
        return Ca.m۱۵۸۹۰a(m۱۲۱۹۷d(), p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Ca.colorAccent, fallback);
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۶۸۳b(int topIndex, int color) {
        int[][] iArr = this.f۱۳۲۴۰k0;
        if (iArr != null && iArr.length - 1 >= topIndex) {
            int[] subColors = iArr[topIndex];
            for (int subIndex = 0; subIndex < subColors.length; subIndex++) {
                if (subColors[subIndex] == color) {
                    m۱۶۶۹۰e(subIndex);
                    return;
                }
            }
        }
    }

    @Override // android.support.p۰۴۳v4.app.DialogInterface$OnCancelListenerCe
    /* renamed from: n  reason: contains not printable characters */
    public Dialog m۱۶۷۲۲n(Bundle savedInstanceState) {
        int preselectColor;
        if (m۱۲۲۱۵i() == null || !m۱۲۲۱۵i().containsKey("builder")) {
            throw new IllegalStateException("ColorChooserDialog should be created using its Builder interface.");
        }
        m۱۶۶۹۵h0();
        boolean foundPreselectColor = false;
        if (savedInstanceState != null) {
            foundPreselectColor = !savedInstanceState.getBoolean("in_custom", false);
            preselectColor = m۱۶۷۰۰j0();
        } else if (m۱۶۶۹۷i0().f۱۳۲۷۹t) {
            preselectColor = m۱۶۶۹۷i0().f۱۳۲۶۶g;
            if (preselectColor != 0) {
                int topIndex = 0;
                while (true) {
                    int[] iArr = this.f۱۳۲۳۹j0;
                    if (topIndex >= iArr.length) {
                        break;
                    } else if (iArr[topIndex] == preselectColor) {
                        foundPreselectColor = true;
                        m۱۶۶۹۲f(topIndex);
                        if (m۱۶۶۹۷i0().f۱۳۲۷۵p) {
                            m۱۶۶۹۰e(2);
                        } else if (this.f۱۳۲۴۰k0 != null) {
                            m۱۶۶۸۳b(topIndex, preselectColor);
                        } else {
                            m۱۶۶۹۰e(5);
                        }
                    } else {
                        if (this.f۱۳۲۴۰k0 != null) {
                            int subIndex = 0;
                            while (true) {
                                int[][] iArr2 = this.f۱۳۲۴۰k0;
                                if (subIndex >= iArr2[topIndex].length) {
                                    break;
                                } else if (iArr2[topIndex][subIndex] == preselectColor) {
                                    foundPreselectColor = true;
                                    m۱۶۶۹۲f(topIndex);
                                    m۱۶۶۹۰e(subIndex);
                                    break;
                                } else {
                                    subIndex++;
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
        this.f۱۳۲۴۱l0 = m۱۲۲۳۳v().getDimensionPixelSize(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cb.md_colorchooser_circlesize);
        Cg builder = m۱۶۶۹۷i0();
        View$OnClickListenerCf.Cd dVar = new View$OnClickListenerCf.Cd(m۱۲۱۹۷d());
        dVar.m۱۵۸۷۴h(m۱۶۷۲۱g0());
        dVar.m۱۵۸۵۲a(false);
        dVar.m۱۵۸۴۳a(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Ce.md_dialog_colorchooser, false);
        dVar.m۱۵۸۶۱c(builder.f۱۳۲۶۹j);
        dVar.m۱۵۸۷۳g(builder.f۱۳۲۶۷h);
        dVar.m۱۵۸۷۰e(builder.f۱۳۲۷۷r ? builder.f۱۳۲۷۰k : 0);
        dVar.m۱۵۸۵۱a(builder.f۱۳۲۶۲c, builder.f۱۳۲۶۳d);
        dVar.m۱۵۸۶۴c(new Cd());
        dVar.m۱۵۸۴۸a(new Cc());
        dVar.m۱۵۸۵۹b(new Cb());
        View$OnClickListenerCf.Cd bd = dVar.m۱۵۸۴۴a(new DialogInterface$OnShowListenerCa());
        EnumCp pVar = builder.f۱۳۲۷۴o;
        if (pVar != null) {
            bd.m۱۵۸۴۹a(pVar);
        }
        View$OnClickListenerCf dialog = bd.m۱۵۸۵۴a();
        View v = dialog.m۱۵۸۳۴d();
        this.f۱۳۲۴۳n0 = (GridView) v.findViewById(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cd.md_grid);
        if (builder.f۱۳۲۷۷r) {
            this.f۱۳۲۳۸B0 = preselectColor;
            this.f۱۳۲۴۴o0 = v.findViewById(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cd.md_colorChooserCustomFrame);
            this.f۱۳۲۴۵p0 = (EditText) v.findViewById(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cd.md_hexInput);
            this.f۱۳۲۴۶q0 = v.findViewById(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cd.md_colorIndicator);
            this.f۱۳۲۴۸s0 = (SeekBar) v.findViewById(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cd.md_colorA);
            this.f۱۳۲۴۹t0 = (TextView) v.findViewById(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cd.md_colorAValue);
            this.f۱۳۲۵۰u0 = (SeekBar) v.findViewById(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cd.md_colorR);
            this.f۱۳۲۵۱v0 = (TextView) v.findViewById(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cd.md_colorRValue);
            this.f۱۳۲۵۲w0 = (SeekBar) v.findViewById(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cd.md_colorG);
            this.f۱۳۲۵۳x0 = (TextView) v.findViewById(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cd.md_colorGValue);
            this.f۱۳۲۵۴y0 = (SeekBar) v.findViewById(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cd.md_colorB);
            this.f۱۳۲۵۵z0 = (TextView) v.findViewById(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cd.md_colorBValue);
            if (!builder.f۱۳۲۷۸s) {
                v.findViewById(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cd.md_colorALabel).setVisibility(8);
                this.f۱۳۲۴۸s0.setVisibility(8);
                this.f۱۳۲۴۹t0.setVisibility(8);
                this.f۱۳۲۴۵p0.setHint("2196F3");
                this.f۱۳۲۴۵p0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
            } else {
                this.f۱۳۲۴۵p0.setHint("FF2196F3");
                this.f۱۳۲۴۵p0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8)});
            }
            if (!foundPreselectColor) {
                m۱۶۶۷۷a(dialog);
            }
        }
        m۱۶۷۰۲k0();
        return dialog;
    }

    /* renamed from: com.afollestad.materialdialogs.color.b$d  reason: invalid class name */
    class Cd implements View$OnClickListenerCf.AbstractCm {
        Cd() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۷۲۵a(View$OnClickListenerCf dialog, EnumCb which) {
            AbstractCh hVar = View$OnClickListenerCb.this.f۱۳۲۴۲m0;
            View$OnClickListenerCb bVar = View$OnClickListenerCb.this;
            hVar.m۱۶۷۳۷a(bVar, bVar.m۱۶۷۰۰j0());
            View$OnClickListenerCb.this.m۱۲۱۱۴d0();
        }
    }

    /* renamed from: com.afollestad.materialdialogs.color.b$c  reason: invalid class name */
    class Cc implements View$OnClickListenerCf.AbstractCm {
        Cc() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۷۲۴a(View$OnClickListenerCf dialog, EnumCb which) {
            if (View$OnClickListenerCb.this.m۱۶۷۰۶m0()) {
                dialog.m۱۵۸۲۹a(EnumCb.NEGATIVE, View$OnClickListenerCb.this.m۱۶۶۹۷i0().f۱۳۲۶۹j);
                View$OnClickListenerCb.this.m۱۶۶۹۹j((View$OnClickListenerCb) false);
                View$OnClickListenerCb.this.m۱۶۶۹۰e((View$OnClickListenerCb) -1);
                View$OnClickListenerCb.this.m۱۶۷۰۲k0();
                return;
            }
            dialog.cancel();
        }
    }

    /* renamed from: com.afollestad.materialdialogs.color.b$b  reason: invalid class name */
    class Cb implements View$OnClickListenerCf.AbstractCm {
        Cb() {
        }

        @Override // p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf.AbstractCm
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۷۲۳a(View$OnClickListenerCf dialog, EnumCb which) {
            View$OnClickListenerCb.this.m۱۶۶۷۷a((View$OnClickListenerCb) dialog);
        }
    }

    /* renamed from: com.afollestad.materialdialogs.color.b$a  reason: invalid class name */
    class DialogInterface$OnShowListenerCa implements DialogInterface.OnShowListener {
        DialogInterface$OnShowListenerCa() {
        }

        public void onShow(DialogInterface dialog) {
            View$OnClickListenerCb.this.m۱۶۷۰۴l0();
        }
    }

    @Override // android.support.p۰۴۳v4.app.DialogInterface$OnCancelListenerCe
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        AbstractCh hVar = this.f۱۳۲۴۲m0;
        if (hVar != null) {
            hVar.m۱۶۷۳۶a(this);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۶۷۷a(View$OnClickListenerCf dialog) {
        if (dialog == null) {
            dialog = (View$OnClickListenerCf) m۱۲۱۱۶e0();
        }
        if (this.f۱۳۲۴۳n0.getVisibility() == 0) {
            dialog.setTitle(m۱۶۶۹۷i0().f۱۳۲۷۰k);
            dialog.m۱۵۸۲۹a(EnumCb.NEUTRAL, m۱۶۶۹۷i0().f۱۳۲۷۱l);
            dialog.m۱۵۸۲۹a(EnumCb.NEGATIVE, m۱۶۶۹۷i0().f۱۳۲۶۹j);
            this.f۱۳۲۴۳n0.setVisibility(4);
            this.f۱۳۲۴۴o0.setVisibility(0);
            this.f۱۳۲۴۷r0 = new Ce();
            this.f۱۳۲۴۵p0.addTextChangedListener(this.f۱۳۲۴۷r0);
            this.f۱۳۲۳۷A0 = new Cf();
            this.f۱۳۲۵۰u0.setOnSeekBarChangeListener(this.f۱۳۲۳۷A0);
            this.f۱۳۲۵۲w0.setOnSeekBarChangeListener(this.f۱۳۲۳۷A0);
            this.f۱۳۲۵۴y0.setOnSeekBarChangeListener(this.f۱۳۲۳۷A0);
            if (this.f۱۳۲۴۸s0.getVisibility() == 0) {
                this.f۱۳۲۴۸s0.setOnSeekBarChangeListener(this.f۱۳۲۳۷A0);
                this.f۱۳۲۴۵p0.setText(String.format("%08X", Integer.valueOf(this.f۱۳۲۳۸B0)));
                return;
            }
            this.f۱۳۲۴۵p0.setText(String.format("%06X", Integer.valueOf(16777215 & this.f۱۳۲۳۸B0)));
            return;
        }
        dialog.setTitle(m۱۶۶۹۷i0().f۱۳۲۶۴e);
        dialog.m۱۵۸۲۹a(EnumCb.NEUTRAL, m۱۶۶۹۷i0().f۱۳۲۷۰k);
        if (m۱۶۷۰۶m0()) {
            dialog.m۱۵۸۲۹a(EnumCb.NEGATIVE, m۱۶۶۹۷i0().f۱۳۲۶۸i);
        } else {
            dialog.m۱۵۸۲۹a(EnumCb.NEGATIVE, m۱۶۶۹۷i0().f۱۳۲۶۹j);
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.afollestad.materialdialogs.color.b$e  reason: invalid class name */
    public class Ce implements TextWatcher {
        Ce() {
        }

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
            try {
                View$OnClickListenerCb bVar = View$OnClickListenerCb.this;
                bVar.f۱۳۲۳۸B0 = Color.parseColor("#" + s.toString());
            } catch (IllegalArgumentException e) {
                View$OnClickListenerCb.this.f۱۳۲۳۸B0 = -16777216;
            }
            View$OnClickListenerCb.this.f۱۳۲۴۶q0.setBackgroundColor(View$OnClickListenerCb.this.f۱۳۲۳۸B0);
            if (View$OnClickListenerCb.this.f۱۳۲۴۸s0.getVisibility() == 0) {
                int alpha = Color.alpha(View$OnClickListenerCb.this.f۱۳۲۳۸B0);
                View$OnClickListenerCb.this.f۱۳۲۴۸s0.setProgress(alpha);
                View$OnClickListenerCb.this.f۱۳۲۴۹t0.setText(String.format(Locale.US, "%d", Integer.valueOf(alpha)));
            }
            View$OnClickListenerCb.this.f۱۳۲۵۰u0.setProgress(Color.red(View$OnClickListenerCb.this.f۱۳۲۳۸B0));
            View$OnClickListenerCb.this.f۱۳۲۵۲w0.setProgress(Color.green(View$OnClickListenerCb.this.f۱۳۲۳۸B0));
            View$OnClickListenerCb.this.f۱۳۲۵۴y0.setProgress(Color.blue(View$OnClickListenerCb.this.f۱۳۲۳۸B0));
            View$OnClickListenerCb.this.m۱۶۶۹۹j((View$OnClickListenerCb) false);
            View$OnClickListenerCb.this.m۱۶۶۹۲f((View$OnClickListenerCb) -1);
            View$OnClickListenerCb.this.m۱۶۶۹۰e((View$OnClickListenerCb) -1);
            View$OnClickListenerCb.this.m۱۶۷۰۴l0();
        }

        public void afterTextChanged(Editable s) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.afollestad.materialdialogs.color.b$f  reason: invalid class name */
    public class Cf implements SeekBar.OnSeekBarChangeListener {
        Cf() {
        }

        @SuppressLint({"DefaultLocale"})
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            if (fromUser) {
                if (View$OnClickListenerCb.this.m۱۶۶۹۷i0().f۱۳۲۷۸s) {
                    int color = Color.argb(View$OnClickListenerCb.this.f۱۳۲۴۸s0.getProgress(), View$OnClickListenerCb.this.f۱۳۲۵۰u0.getProgress(), View$OnClickListenerCb.this.f۱۳۲۵۲w0.getProgress(), View$OnClickListenerCb.this.f۱۳۲۵۴y0.getProgress());
                    View$OnClickListenerCb.this.f۱۳۲۴۵p0.setText(String.format("%08X", Integer.valueOf(color)));
                } else {
                    int color2 = Color.rgb(View$OnClickListenerCb.this.f۱۳۲۵۰u0.getProgress(), View$OnClickListenerCb.this.f۱۳۲۵۲w0.getProgress(), View$OnClickListenerCb.this.f۱۳۲۵۴y0.getProgress());
                    View$OnClickListenerCb.this.f۱۳۲۴۵p0.setText(String.format("%06X", Integer.valueOf(16777215 & color2)));
                }
            }
            View$OnClickListenerCb.this.f۱۳۲۴۹t0.setText(String.format("%d", Integer.valueOf(View$OnClickListenerCb.this.f۱۳۲۴۸s0.getProgress())));
            View$OnClickListenerCb.this.f۱۳۲۵۱v0.setText(String.format("%d", Integer.valueOf(View$OnClickListenerCb.this.f۱۳۲۵۰u0.getProgress())));
            View$OnClickListenerCb.this.f۱۳۲۵۳x0.setText(String.format("%d", Integer.valueOf(View$OnClickListenerCb.this.f۱۳۲۵۲w0.getProgress())));
            View$OnClickListenerCb.this.f۱۳۲۵۵z0.setText(String.format("%d", Integer.valueOf(View$OnClickListenerCb.this.f۱۳۲۵۴y0.getProgress())));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: k0  reason: contains not printable characters */
    private void m۱۶۷۰۲k0() {
        if (this.f۱۳۲۴۳n0.getAdapter() == null) {
            this.f۱۳۲۴۳n0.setAdapter((ListAdapter) new Ci());
            this.f۱۳۲۴۳n0.setSelector(android.support.p۰۴۳v4.content.p۰۴۴e.Cf.m۱۲۶۸۴a(m۱۲۲۳۳v(), p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cc.md_transparent, null));
        } else {
            ((BaseAdapter) this.f۱۳۲۴۳n0.getAdapter()).notifyDataSetChanged();
        }
        if (m۱۲۱۱۶e0() != null) {
            m۱۲۱۱۶e0().setTitle(m۱۶۷۲۱g0());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: i0  reason: contains not printable characters */
    private Cg m۱۶۶۹۷i0() {
        if (m۱۲۲۱۵i() == null || !m۱۲۲۱۵i().containsKey("builder")) {
            return null;
        }
        return (Cg) m۱۲۲۱۵i().getSerializable("builder");
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۶۸۴b(AbstractCk fragmentManager, String tag) {
        ComponentCallbacksCf frag = fragmentManager.m۱۲۳۱۹a(tag);
        if (frag != null) {
            ((DialogInterface$OnCancelListenerCe) frag).m۱۲۱۱۴d0();
            AbstractCq a = fragmentManager.m۱۲۳۲۰a();
            a.m۱۲۴۷۸a(frag);
            a.m۱۲۴۷۵a();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public View$OnClickListenerCb m۱۶۷۱۸a(AbstractCk fragmentManager) {
        String tag;
        Cg builder = m۱۶۶۹۷i0();
        if (builder.f۱۳۲۷۲m != null) {
            tag = "[MD_COLOR_CHOOSER]";
        } else if (builder.f۱۳۲۷۵p) {
            tag = "[MD_COLOR_CHOOSER]";
        } else {
            tag = "[MD_COLOR_CHOOSER]";
        }
        m۱۶۶۸۴b(fragmentManager, tag);
        m۱۲۱۱۰a(fragmentManager, tag);
        return this;
    }

    /* renamed from: com.afollestad.materialdialogs.color.b$g  reason: invalid class name */
    public static class Cg implements Serializable {

        /* renamed from: c  reason: contains not printable characters */
        String f۱۳۲۶۲c;

        /* renamed from: d  reason: contains not printable characters */
        String f۱۳۲۶۳d;

        /* renamed from: e  reason: contains not printable characters */
        final int f۱۳۲۶۴e;

        /* renamed from: f  reason: contains not printable characters */
        int f۱۳۲۶۵f;

        /* renamed from: g  reason: contains not printable characters */
        int f۱۳۲۶۶g;

        /* renamed from: h  reason: contains not printable characters */
        int f۱۳۲۶۷h = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cf.md_done_label;

        /* renamed from: i  reason: contains not printable characters */
        int f۱۳۲۶۸i = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cf.md_back_label;

        /* renamed from: j  reason: contains not printable characters */
        int f۱۳۲۶۹j = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cf.md_cancel_label;

        /* renamed from: k  reason: contains not printable characters */
        int f۱۳۲۷۰k = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cf.md_custom_label;

        /* renamed from: l  reason: contains not printable characters */
        int f۱۳۲۷۱l = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۵q.Cf.md_presets_label;

        /* renamed from: m  reason: contains not printable characters */
        int[] f۱۳۲۷۲m;

        /* renamed from: n  reason: contains not printable characters */
        int[][] f۱۳۲۷۳n;

        /* renamed from: o  reason: contains not printable characters */
        EnumCp f۱۳۲۷۴o;

        /* renamed from: p  reason: contains not printable characters */
        boolean f۱۳۲۷۵p = false;

        /* renamed from: q  reason: contains not printable characters */
        boolean f۱۳۲۷۶q = true;

        /* renamed from: r  reason: contains not printable characters */
        boolean f۱۳۲۷۷r = true;

        /* renamed from: s  reason: contains not printable characters */
        boolean f۱۳۲۷۸s = true;

        /* renamed from: t  reason: contains not printable characters */
        boolean f۱۳۲۷۹t = false;

        public Cg(Context context, int title) {
            this.f۱۳۲۶۴e = title;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cg m۱۶۷۲۷a(String medium, String regular) {
            this.f۱۳۲۶۲c = medium;
            this.f۱۳۲۶۳d = regular;
            return this;
        }

        /* renamed from: c  reason: contains not printable characters */
        public Cg m۱۶۷۳۵c(int preselect) {
            this.f۱۳۲۶۶g = preselect;
            this.f۱۳۲۷۹t = true;
            return this;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Cg m۱۶۷۳۳b(int text) {
            this.f۱۳۲۶۷h = text;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cg m۱۶۷۲۶a(int text) {
            this.f۱۳۲۶۹j = text;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cg m۱۶۷۲۹a(int[] topLevel, int[][] subLevel) {
            this.f۱۳۲۷۲m = topLevel;
            this.f۱۳۲۷۳n = subLevel;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cg m۱۶۷۲۸a(boolean allow) {
            this.f۱۳۲۷۷r = allow;
            return this;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Cg m۱۶۷۳۴b(boolean allow) {
            this.f۱۳۲۷۸s = allow;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public View$OnClickListenerCb m۱۶۷۳۰a() {
            View$OnClickListenerCb dialog = new View$OnClickListenerCb();
            Bundle args = new Bundle();
            args.putSerializable("builder", this);
            dialog.m۱۲۲۲۴m(args);
            return dialog;
        }

        /* renamed from: a  reason: contains not printable characters */
        public View$OnClickListenerCb m۱۶۷۳۲a(AbstractCk fragmentManager) {
            View$OnClickListenerCb dialog = m۱۶۷۳۰a();
            dialog.m۱۶۷۱۸a(fragmentManager);
            return dialog;
        }

        /* renamed from: a  reason: contains not printable characters */
        public View$OnClickListenerCb m۱۶۷۳۱a(ActivityCg fragmentActivity) {
            return m۱۶۷۳۲a(fragmentActivity.m۱۲۲۶۲e());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.afollestad.materialdialogs.color.b$i  reason: invalid class name */
    public class Ci extends BaseAdapter {
        Ci() {
        }

        public int getCount() {
            if (View$OnClickListenerCb.this.m۱۶۷۰۶m0()) {
                return View$OnClickListenerCb.this.f۱۳۲۴۰k0[View$OnClickListenerCb.this.m۱۶۷۱۰o0()].length;
            }
            return View$OnClickListenerCb.this.f۱۳۲۳۹j0.length;
        }

        public Object getItem(int position) {
            if (View$OnClickListenerCb.this.m۱۶۷۰۶m0()) {
                return Integer.valueOf(View$OnClickListenerCb.this.f۱۳۲۴۰k0[View$OnClickListenerCb.this.m۱۶۷۱۰o0()][position]);
            }
            return Integer.valueOf(View$OnClickListenerCb.this.f۱۳۲۳۹j0[position]);
        }

        public long getItemId(int position) {
            return (long) position;
        }

        @SuppressLint({"DefaultLocale"})
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = new Ca(View$OnClickListenerCb.this.m۱۲۲۱۹k());
                convertView.setLayoutParams(new AbsListView.LayoutParams(View$OnClickListenerCb.this.f۱۳۲۴۱l0, View$OnClickListenerCb.this.f۱۳۲۴۱l0));
            }
            Ca child = (Ca) convertView;
            int color = View$OnClickListenerCb.this.m۱۶۷۰۶m0() ? View$OnClickListenerCb.this.f۱۳۲۴۰k0[View$OnClickListenerCb.this.m۱۶۷۱۰o0()][position] : View$OnClickListenerCb.this.f۱۳۲۳۹j0[position];
            child.setBackgroundColor(color);
            if (View$OnClickListenerCb.this.m۱۶۷۰۶m0()) {
                child.setSelected(View$OnClickListenerCb.this.m۱۶۷۰۸n0() == position);
            } else {
                child.setSelected(View$OnClickListenerCb.this.m۱۶۷۱۰o0() == position);
            }
            child.setTag(String.format("%d:%d", Integer.valueOf(position), Integer.valueOf(color)));
            child.setOnClickListener(View$OnClickListenerCb.this);
            child.setOnLongClickListener(View$OnClickListenerCb.this);
            return convertView;
        }
    }
}
