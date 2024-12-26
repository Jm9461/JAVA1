package com.afollestad.materialdialogs.color;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.k;
import android.support.v4.app.q;
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
import b.a.a.f;
import b.a.a.p;
import java.io.Serializable;
import java.util.Locale;

public class b extends android.support.v4.app.e implements View.OnClickListener, View.OnLongClickListener {
    private SeekBar.OnSeekBarChangeListener A0;
    private int B0;
    private int[] j0;
    private int[][] k0;
    private int l0;
    private h m0;
    private GridView n0;
    private View o0;
    private EditText p0;
    private View q0;
    private TextWatcher r0;
    private SeekBar s0;
    private TextView t0;
    private SeekBar u0;
    private TextView v0;
    private SeekBar w0;
    private TextView x0;
    private SeekBar y0;
    private TextView z0;

    public interface h {
        void a(b bVar);

        void a(b bVar, int i);
    }

    private void h0() {
        g builder = i0();
        int[] iArr = builder.m;
        if (iArr != null) {
            this.j0 = iArr;
            this.k0 = builder.n;
        } else if (builder.p) {
            this.j0 = c.f۲۷۲۶c;
            this.k0 = c.f۲۷۲۷d;
        } else {
            this.j0 = c.f۲۷۲۴a;
            this.k0 = c.f۲۷۲۵b;
        }
    }

    @Override // android.support.v4.app.f, android.support.v4.app.e
    public void e(Bundle outState) {
        super.e(outState);
        outState.putInt("top_index", o0());
        outState.putBoolean("in_sub", m0());
        outState.putInt("sub_index", n0());
        View view = this.o0;
        outState.putBoolean("in_custom", view != null && view.getVisibility() == 0);
    }

    @Override // android.support.v4.app.f, android.support.v4.app.e
    public void a(Context context) {
        super.a(context);
        if (d() instanceof h) {
            this.m0 = (h) d();
        } else if (t() instanceof h) {
            this.m0 = (h) t();
        } else {
            throw new IllegalStateException("ColorChooserDialog needs to be shown from an Activity/Fragment implementing ColorCallback.");
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean m0() {
        return i().getBoolean("in_sub", false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void j(boolean value) {
        i().putBoolean("in_sub", value);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int o0() {
        return i().getInt("top_index", -1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void f(int value) {
        if (value > -1) {
            b(value, this.j0[value]);
        }
        i().putInt("top_index", value);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int n0() {
        if (this.k0 == null) {
            return -1;
        }
        return i().getInt("sub_index", -1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void e(int value) {
        if (this.k0 != null) {
            i().putInt("sub_index", value);
        }
    }

    public int g0() {
        int title;
        g builder = i0();
        if (m0()) {
            title = builder.f۲۷۲۰f;
        } else {
            title = builder.f۲۷۱۹e;
        }
        if (title == 0) {
            return builder.f۲۷۱۹e;
        }
        return title;
    }

    public void onClick(View v) {
        if (v.getTag() != null) {
            int index = Integer.parseInt(((String) v.getTag()).split(":")[0]);
            b.a.a.f dialog = (b.a.a.f) e0();
            g builder = i0();
            if (m0()) {
                e(index);
            } else {
                f(index);
                int[][] iArr = this.k0;
                if (iArr != null && index < iArr.length) {
                    dialog.a(b.a.a.b.NEGATIVE, builder.i);
                    j(true);
                }
            }
            if (builder.r) {
                this.B0 = j0();
            }
            l0();
            k0();
        }
    }

    public boolean onLongClick(View v) {
        if (v.getTag() == null) {
            return false;
        }
        ((a) v).a(Integer.parseInt(((String) v.getTag()).split(":")[1]));
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void l0() {
        b.a.a.f dialog = (b.a.a.f) e0();
        if (dialog != null && i0().q) {
            int selectedColor = j0();
            if (Color.alpha(selectedColor) < 64 || (Color.red(selectedColor) > 247 && Color.green(selectedColor) > 247 && Color.blue(selectedColor) > 247)) {
                selectedColor = Color.parseColor("#DEDEDE");
            }
            if (i0().q) {
                dialog.a(b.a.a.b.POSITIVE).setTextColor(selectedColor);
                dialog.a(b.a.a.b.NEGATIVE).setTextColor(selectedColor);
                dialog.a(b.a.a.b.NEUTRAL).setTextColor(selectedColor);
            }
            if (this.u0 != null) {
                if (this.s0.getVisibility() == 0) {
                    com.afollestad.materialdialogs.internal.c.a(this.s0, selectedColor);
                }
                com.afollestad.materialdialogs.internal.c.a(this.u0, selectedColor);
                com.afollestad.materialdialogs.internal.c.a(this.w0, selectedColor);
                com.afollestad.materialdialogs.internal.c.a(this.y0, selectedColor);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int j0() {
        View view = this.o0;
        if (view != null && view.getVisibility() == 0) {
            return this.B0;
        }
        int color = 0;
        if (n0() > -1) {
            color = this.k0[o0()][n0()];
        } else if (o0() > -1) {
            color = this.j0[o0()];
        }
        if (color != 0) {
            return color;
        }
        int fallback = 0;
        if (Build.VERSION.SDK_INT >= 21) {
            fallback = b.a.a.r.a.e(d(), 16843829);
        }
        return b.a.a.r.a.a(d(), b.a.a.q.a.colorAccent, fallback);
    }

    private void b(int topIndex, int color) {
        int[][] iArr = this.k0;
        if (iArr != null && iArr.length - 1 >= topIndex) {
            int[] subColors = iArr[topIndex];
            for (int subIndex = 0; subIndex < subColors.length; subIndex++) {
                if (subColors[subIndex] == color) {
                    e(subIndex);
                    return;
                }
            }
        }
    }

    @Override // android.support.v4.app.e
    public Dialog n(Bundle savedInstanceState) {
        int preselectColor;
        if (i() == null || !i().containsKey("builder")) {
            throw new IllegalStateException("ColorChooserDialog should be created using its Builder interface.");
        }
        h0();
        boolean foundPreselectColor = false;
        if (savedInstanceState != null) {
            foundPreselectColor = !savedInstanceState.getBoolean("in_custom", false);
            preselectColor = j0();
        } else if (i0().t) {
            preselectColor = i0().f۲۷۲۱g;
            if (preselectColor != 0) {
                int topIndex = 0;
                while (true) {
                    int[] iArr = this.j0;
                    if (topIndex >= iArr.length) {
                        break;
                    } else if (iArr[topIndex] == preselectColor) {
                        foundPreselectColor = true;
                        f(topIndex);
                        if (i0().p) {
                            e(2);
                        } else if (this.k0 != null) {
                            b(topIndex, preselectColor);
                        } else {
                            e(5);
                        }
                    } else {
                        if (this.k0 != null) {
                            int subIndex = 0;
                            while (true) {
                                int[][] iArr2 = this.k0;
                                if (subIndex >= iArr2[topIndex].length) {
                                    break;
                                } else if (iArr2[topIndex][subIndex] == preselectColor) {
                                    foundPreselectColor = true;
                                    f(topIndex);
                                    e(subIndex);
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
        this.l0 = v().getDimensionPixelSize(b.a.a.q.b.md_colorchooser_circlesize);
        g builder = i0();
        f.d dVar = new f.d(d());
        dVar.h(g0());
        dVar.a(false);
        dVar.a(b.a.a.q.e.md_dialog_colorchooser, false);
        dVar.c(builder.j);
        dVar.g(builder.f۲۷۲۲h);
        dVar.e(builder.r ? builder.k : 0);
        dVar.a(builder.f۲۷۱۷c, builder.f۲۷۱۸d);
        dVar.c(new d());
        dVar.a(new c());
        dVar.b(new C۰۰۶۲b());
        f.d bd = dVar.a(new a());
        p pVar = builder.o;
        if (pVar != null) {
            bd.a(pVar);
        }
        b.a.a.f dialog = bd.a();
        View v = dialog.d();
        this.n0 = (GridView) v.findViewById(b.a.a.q.d.md_grid);
        if (builder.r) {
            this.B0 = preselectColor;
            this.o0 = v.findViewById(b.a.a.q.d.md_colorChooserCustomFrame);
            this.p0 = (EditText) v.findViewById(b.a.a.q.d.md_hexInput);
            this.q0 = v.findViewById(b.a.a.q.d.md_colorIndicator);
            this.s0 = (SeekBar) v.findViewById(b.a.a.q.d.md_colorA);
            this.t0 = (TextView) v.findViewById(b.a.a.q.d.md_colorAValue);
            this.u0 = (SeekBar) v.findViewById(b.a.a.q.d.md_colorR);
            this.v0 = (TextView) v.findViewById(b.a.a.q.d.md_colorRValue);
            this.w0 = (SeekBar) v.findViewById(b.a.a.q.d.md_colorG);
            this.x0 = (TextView) v.findViewById(b.a.a.q.d.md_colorGValue);
            this.y0 = (SeekBar) v.findViewById(b.a.a.q.d.md_colorB);
            this.z0 = (TextView) v.findViewById(b.a.a.q.d.md_colorBValue);
            if (!builder.s) {
                v.findViewById(b.a.a.q.d.md_colorALabel).setVisibility(8);
                this.s0.setVisibility(8);
                this.t0.setVisibility(8);
                this.p0.setHint("2196F3");
                this.p0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
            } else {
                this.p0.setHint("FF2196F3");
                this.p0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8)});
            }
            if (!foundPreselectColor) {
                a(dialog);
            }
        }
        k0();
        return dialog;
    }

    class d implements f.m {
        d() {
        }

        @Override // b.a.a.f.m
        public void a(b.a.a.f dialog, b.a.a.b which) {
            h hVar = b.this.m0;
            b bVar = b.this;
            hVar.a(bVar, bVar.j0());
            b.this.d0();
        }
    }

    class c implements f.m {
        c() {
        }

        @Override // b.a.a.f.m
        public void a(b.a.a.f dialog, b.a.a.b which) {
            if (b.this.m0()) {
                dialog.a(b.a.a.b.NEGATIVE, b.this.i0().j);
                b.this.j((b) false);
                b.this.e((b) -1);
                b.this.k0();
                return;
            }
            dialog.cancel();
        }
    }

    /* renamed from: com.afollestad.materialdialogs.color.b$b  reason: collision with other inner class name */
    class C۰۰۶۲b implements f.m {
        C۰۰۶۲b() {
        }

        @Override // b.a.a.f.m
        public void a(b.a.a.f dialog, b.a.a.b which) {
            b.this.a((b) dialog);
        }
    }

    class a implements DialogInterface.OnShowListener {
        a() {
        }

        public void onShow(DialogInterface dialog) {
            b.this.l0();
        }
    }

    @Override // android.support.v4.app.e
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        h hVar = this.m0;
        if (hVar != null) {
            hVar.a(this);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(b.a.a.f dialog) {
        if (dialog == null) {
            dialog = (b.a.a.f) e0();
        }
        if (this.n0.getVisibility() == 0) {
            dialog.setTitle(i0().k);
            dialog.a(b.a.a.b.NEUTRAL, i0().l);
            dialog.a(b.a.a.b.NEGATIVE, i0().j);
            this.n0.setVisibility(4);
            this.o0.setVisibility(0);
            this.r0 = new e();
            this.p0.addTextChangedListener(this.r0);
            this.A0 = new f();
            this.u0.setOnSeekBarChangeListener(this.A0);
            this.w0.setOnSeekBarChangeListener(this.A0);
            this.y0.setOnSeekBarChangeListener(this.A0);
            if (this.s0.getVisibility() == 0) {
                this.s0.setOnSeekBarChangeListener(this.A0);
                this.p0.setText(String.format("%08X", Integer.valueOf(this.B0)));
                return;
            }
            this.p0.setText(String.format("%06X", Integer.valueOf(16777215 & this.B0)));
            return;
        }
        dialog.setTitle(i0().f۲۷۱۹e);
        dialog.a(b.a.a.b.NEUTRAL, i0().k);
        if (m0()) {
            dialog.a(b.a.a.b.NEGATIVE, i0().i);
        } else {
            dialog.a(b.a.a.b.NEGATIVE, i0().j);
        }
        this.n0.setVisibility(0);
        this.o0.setVisibility(8);
        this.p0.removeTextChangedListener(this.r0);
        this.r0 = null;
        this.u0.setOnSeekBarChangeListener(null);
        this.w0.setOnSeekBarChangeListener(null);
        this.y0.setOnSeekBarChangeListener(null);
        this.A0 = null;
    }

    /* access modifiers changed from: package-private */
    public class e implements TextWatcher {
        e() {
        }

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
            try {
                b bVar = b.this;
                bVar.B0 = Color.parseColor("#" + s.toString());
            } catch (IllegalArgumentException e2) {
                b.this.B0 = -16777216;
            }
            b.this.q0.setBackgroundColor(b.this.B0);
            if (b.this.s0.getVisibility() == 0) {
                int alpha = Color.alpha(b.this.B0);
                b.this.s0.setProgress(alpha);
                b.this.t0.setText(String.format(Locale.US, "%d", Integer.valueOf(alpha)));
            }
            b.this.u0.setProgress(Color.red(b.this.B0));
            b.this.w0.setProgress(Color.green(b.this.B0));
            b.this.y0.setProgress(Color.blue(b.this.B0));
            b.this.j((b) false);
            b.this.f((b) -1);
            b.this.e((b) -1);
            b.this.l0();
        }

        public void afterTextChanged(Editable s) {
        }
    }

    /* access modifiers changed from: package-private */
    public class f implements SeekBar.OnSeekBarChangeListener {
        f() {
        }

        @SuppressLint({"DefaultLocale"})
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            if (fromUser) {
                if (b.this.i0().s) {
                    int color = Color.argb(b.this.s0.getProgress(), b.this.u0.getProgress(), b.this.w0.getProgress(), b.this.y0.getProgress());
                    b.this.p0.setText(String.format("%08X", Integer.valueOf(color)));
                } else {
                    int color2 = Color.rgb(b.this.u0.getProgress(), b.this.w0.getProgress(), b.this.y0.getProgress());
                    b.this.p0.setText(String.format("%06X", Integer.valueOf(16777215 & color2)));
                }
            }
            b.this.t0.setText(String.format("%d", Integer.valueOf(b.this.s0.getProgress())));
            b.this.v0.setText(String.format("%d", Integer.valueOf(b.this.u0.getProgress())));
            b.this.x0.setText(String.format("%d", Integer.valueOf(b.this.w0.getProgress())));
            b.this.z0.setText(String.format("%d", Integer.valueOf(b.this.y0.getProgress())));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void k0() {
        if (this.n0.getAdapter() == null) {
            this.n0.setAdapter((ListAdapter) new i());
            this.n0.setSelector(android.support.v4.content.e.f.a(v(), b.a.a.q.c.md_transparent, null));
        } else {
            ((BaseAdapter) this.n0.getAdapter()).notifyDataSetChanged();
        }
        if (e0() != null) {
            e0().setTitle(g0());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private g i0() {
        if (i() == null || !i().containsKey("builder")) {
            return null;
        }
        return (g) i().getSerializable("builder");
    }

    private void b(k fragmentManager, String tag) {
        android.support.v4.app.f frag = fragmentManager.a(tag);
        if (frag != null) {
            ((android.support.v4.app.e) frag).d0();
            q a2 = fragmentManager.a();
            a2.a(frag);
            a2.a();
        }
    }

    public b a(k fragmentManager) {
        String tag;
        g builder = i0();
        if (builder.m != null) {
            tag = "[MD_COLOR_CHOOSER]";
        } else if (builder.p) {
            tag = "[MD_COLOR_CHOOSER]";
        } else {
            tag = "[MD_COLOR_CHOOSER]";
        }
        b(fragmentManager, tag);
        a(fragmentManager, tag);
        return this;
    }

    public static class g implements Serializable {

        /* renamed from: c  reason: collision with root package name */
        String f۲۷۱۷c;

        /* renamed from: d  reason: collision with root package name */
        String f۲۷۱۸d;

        /* renamed from: e  reason: collision with root package name */
        final int f۲۷۱۹e;

        /* renamed from: f  reason: collision with root package name */
        int f۲۷۲۰f;

        /* renamed from: g  reason: collision with root package name */
        int f۲۷۲۱g;

        /* renamed from: h  reason: collision with root package name */
        int f۲۷۲۲h = b.a.a.q.f.md_done_label;
        int i = b.a.a.q.f.md_back_label;
        int j = b.a.a.q.f.md_cancel_label;
        int k = b.a.a.q.f.md_custom_label;
        int l = b.a.a.q.f.md_presets_label;
        int[] m;
        int[][] n;
        p o;
        boolean p = false;
        boolean q = true;
        boolean r = true;
        boolean s = true;
        boolean t = false;

        public g(Context context, int title) {
            this.f۲۷۱۹e = title;
        }

        public g a(String medium, String regular) {
            this.f۲۷۱۷c = medium;
            this.f۲۷۱۸d = regular;
            return this;
        }

        public g c(int preselect) {
            this.f۲۷۲۱g = preselect;
            this.t = true;
            return this;
        }

        public g b(int text) {
            this.f۲۷۲۲h = text;
            return this;
        }

        public g a(int text) {
            this.j = text;
            return this;
        }

        public g a(int[] topLevel, int[][] subLevel) {
            this.m = topLevel;
            this.n = subLevel;
            return this;
        }

        public g a(boolean allow) {
            this.r = allow;
            return this;
        }

        public g b(boolean allow) {
            this.s = allow;
            return this;
        }

        public b a() {
            b dialog = new b();
            Bundle args = new Bundle();
            args.putSerializable("builder", this);
            dialog.m(args);
            return dialog;
        }

        public b a(k fragmentManager) {
            b dialog = a();
            dialog.a(fragmentManager);
            return dialog;
        }

        public b a(android.support.v4.app.g fragmentActivity) {
            return a(fragmentActivity.e());
        }
    }

    /* access modifiers changed from: private */
    public class i extends BaseAdapter {
        i() {
        }

        public int getCount() {
            if (b.this.m0()) {
                return b.this.k0[b.this.o0()].length;
            }
            return b.this.j0.length;
        }

        public Object getItem(int position) {
            if (b.this.m0()) {
                return Integer.valueOf(b.this.k0[b.this.o0()][position]);
            }
            return Integer.valueOf(b.this.j0[position]);
        }

        public long getItemId(int position) {
            return (long) position;
        }

        @SuppressLint({"DefaultLocale"})
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = new a(b.this.k());
                convertView.setLayoutParams(new AbsListView.LayoutParams(b.this.l0, b.this.l0));
            }
            a child = (a) convertView;
            int color = b.this.m0() ? b.this.k0[b.this.o0()][position] : b.this.j0[position];
            child.setBackgroundColor(color);
            if (b.this.m0()) {
                child.setSelected(b.this.n0() == position);
            } else {
                child.setSelected(b.this.o0() == position);
            }
            child.setTag(String.format("%d:%d", Integer.valueOf(position), Integer.valueOf(color)));
            child.setOnClickListener(b.this);
            child.setOnLongClickListener(b.this);
            return convertView;
        }
    }
}
