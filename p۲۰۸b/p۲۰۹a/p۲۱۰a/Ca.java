package p۲۰۸b.p۲۰۹a.p۲۱۰a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.afollestad.materialdialogs.internal.Cc;
import java.util.ArrayList;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.ViewOnClickListenerCf;

/* renamed from: b.a.a.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ca extends RecyclerView.AbstractCg<b> {

    /* renamed from: c, reason: contains not printable characters */
    private final ViewOnClickListenerCf f۱۲۴۴۷c;

    /* renamed from: d, reason: contains not printable characters */
    private final int f۱۲۴۴۸d;

    /* renamed from: e, reason: contains not printable characters */
    private final EnumCe f۱۲۴۴۹e;

    /* renamed from: f, reason: contains not printable characters */
    private c f۱۲۴۵۰f;

    /* renamed from: b.a.a.a$c */
    interface c {
        /* renamed from: a, reason: contains not printable characters */
        boolean mo۱۳۷۶۱a(ViewOnClickListenerCf viewOnClickListenerCf, View view, int i, CharSequence charSequence, boolean z);
    }

    Ca(ViewOnClickListenerCf dialog, int layout) {
        this.f۱۲۴۴۷c = dialog;
        this.f۱۲۴۴۸d = layout;
        this.f۱۲۴۴۹e = dialog.f۱۲۴۶۷e.f۱۲۵۴۲f;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۷۳۸a(c callback) {
        this.f۱۲۴۵۰f = callback;
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public b mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(this.f۱۲۴۴۸d, parent, false);
        p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۲۷a(view, this.f۱۲۴۴۷c.m۱۳۷۶۶f());
        return new b(view, this);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo۱۷۶۶۱b(b holder, int index) {
        View view = holder.f۱۱۶۳۷c;
        boolean disabled = p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۳۰a(Integer.valueOf(index), this.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۲۲Q);
        int itemTextColor = disabled ? p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r.Ca.m۱۳۸۱۸a(this.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۴۷h0, 0.4f) : this.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۴۷h0;
        holder.f۱۱۶۳۷c.setEnabled(!disabled);
        int i = a.f۱۲۴۵۱a[this.f۱۲۴۴۷c.f۱۲۴۸۳u.ordinal()];
        if (i == 1) {
            RadioButton radio = (RadioButton) holder.f۱۲۴۵۲v;
            boolean selected = this.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۱۹O == index;
            ViewOnClickListenerCf.d dVar = this.f۱۲۴۴۷c.f۱۲۴۶۷e;
            ColorStateList colorStateList = dVar.f۱۲۵۷۲u;
            if (colorStateList != null) {
                Cc.m۱۴۶۹۴a(radio, colorStateList);
            } else {
                Cc.m۱۴۶۹۳a(radio, dVar.f۱۲۵۷۰t);
            }
            radio.setChecked(selected);
            radio.setEnabled(!disabled);
        } else if (i == 2) {
            CheckBox checkbox = (CheckBox) holder.f۱۲۴۵۲v;
            boolean selected2 = this.f۱۲۴۴۷c.f۱۲۴۸۴v.contains(Integer.valueOf(index));
            ViewOnClickListenerCf.d dVar2 = this.f۱۲۴۴۷c.f۱۲۴۶۷e;
            ColorStateList colorStateList2 = dVar2.f۱۲۵۷۲u;
            if (colorStateList2 != null) {
                Cc.m۱۴۶۸۹a(checkbox, colorStateList2);
            } else {
                Cc.m۱۴۶۸۸a(checkbox, dVar2.f۱۲۵۷۰t);
            }
            checkbox.setChecked(selected2);
            checkbox.setEnabled(!disabled);
        }
        holder.f۱۲۴۵۳w.setText(this.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۵۴l.get(index));
        holder.f۱۲۴۵۳w.setTextColor(itemTextColor);
        ViewOnClickListenerCf viewOnClickListenerCf = this.f۱۲۴۴۷c;
        viewOnClickListenerCf.m۱۳۷۵۸a(holder.f۱۲۴۵۳w, viewOnClickListenerCf.f۱۲۴۶۷e.f۱۲۵۲۴S);
        m۱۳۷۳۳a((ViewGroup) view);
        int[] iArr = this.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۷۵v0;
        if (iArr != null) {
            if (index < iArr.length) {
                view.setId(iArr[index]);
            } else {
                view.setId(-1);
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            ViewGroup group = (ViewGroup) view;
            if (group.getChildCount() == 2) {
                if (group.getChildAt(0) instanceof CompoundButton) {
                    group.getChildAt(0).setBackground(null);
                } else if (group.getChildAt(1) instanceof CompoundButton) {
                    group.getChildAt(1).setBackground(null);
                }
            }
        }
    }

    /* renamed from: b.a.a.a$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: contains not printable characters */
        static final /* synthetic */ int[] f۱۲۴۵۱a = new int[ViewOnClickListenerCf.l.values().length];

        static {
            try {
                f۱۲۴۵۱a[ViewOnClickListenerCf.l.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۱۲۴۵۱a[ViewOnClickListenerCf.l.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        ArrayList<CharSequence> arrayList = this.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۵۴l;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @TargetApi(17)
    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۷۳۳a(ViewGroup view) {
        LinearLayout itemRoot = (LinearLayout) view;
        int gravityInt = this.f۱۲۴۴۹e.m۱۳۷۵۱a();
        itemRoot.setGravity(gravityInt | 16);
        if (view.getChildCount() == 2) {
            if (this.f۱۲۴۴۹e == EnumCe.END && !m۱۳۷۳۵e() && (view.getChildAt(0) instanceof CompoundButton)) {
                CompoundButton first = (CompoundButton) view.getChildAt(0);
                view.removeView(first);
                TextView second = (TextView) view.getChildAt(0);
                view.removeView(second);
                second.setPadding(second.getPaddingRight(), second.getPaddingTop(), second.getPaddingLeft(), second.getPaddingBottom());
                view.addView(second);
                view.addView(first);
                return;
            }
            if (this.f۱۲۴۴۹e == EnumCe.START && m۱۳۷۳۵e() && (view.getChildAt(1) instanceof CompoundButton)) {
                CompoundButton first2 = (CompoundButton) view.getChildAt(1);
                view.removeView(first2);
                TextView second2 = (TextView) view.getChildAt(0);
                view.removeView(second2);
                second2.setPadding(second2.getPaddingRight(), second2.getPaddingTop(), second2.getPaddingRight(), second2.getPaddingBottom());
                view.addView(first2);
                view.addView(second2);
            }
        }
    }

    @TargetApi(17)
    /* renamed from: e, reason: contains not printable characters */
    private boolean m۱۳۷۳۵e() {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        Configuration config = this.f۱۲۴۴۷c.m۱۳۷۶۳c().m۱۳۷۸۵b().getResources().getConfiguration();
        return config.getLayoutDirection() == 1;
    }

    /* renamed from: b.a.a.a$b */
    static class b extends RecyclerView.AbstractCd0 implements View.OnClickListener, View.OnLongClickListener {

        /* renamed from: v, reason: contains not printable characters */
        final CompoundButton f۱۲۴۵۲v;

        /* renamed from: w, reason: contains not printable characters */
        final TextView f۱۲۴۵۳w;

        /* renamed from: x, reason: contains not printable characters */
        final Ca f۱۲۴۵۴x;

        b(View itemView, Ca adapter) {
            super(itemView);
            this.f۱۲۴۵۲v = (CompoundButton) itemView.findViewById(Ck.md_control);
            this.f۱۲۴۵۳w = (TextView) itemView.findViewById(Ck.md_title);
            this.f۱۲۴۵۴x = adapter;
            itemView.setOnClickListener(this);
            if (adapter.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۰۱F != null) {
                itemView.setOnLongClickListener(this);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f۱۲۴۵۴x.f۱۲۴۵۰f != null && m۱۲۳۲۰f() != -1) {
                CharSequence text = null;
                if (this.f۱۲۴۵۴x.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۵۴l != null && m۱۲۳۲۰f() < this.f۱۲۴۵۴x.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۵۴l.size()) {
                    text = this.f۱۲۴۵۴x.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۵۴l.get(m۱۲۳۲۰f());
                }
                this.f۱۲۴۵۴x.f۱۲۴۵۰f.mo۱۳۷۶۱a(this.f۱۲۴۵۴x.f۱۲۴۴۷c, view, m۱۲۳۲۰f(), text, false);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (this.f۱۲۴۵۴x.f۱۲۴۵۰f != null && m۱۲۳۲۰f() != -1) {
                CharSequence text = null;
                if (this.f۱۲۴۵۴x.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۵۴l != null && m۱۲۳۲۰f() < this.f۱۲۴۵۴x.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۵۴l.size()) {
                    text = this.f۱۲۴۵۴x.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۵۴l.get(m۱۲۳۲۰f());
                }
                return this.f۱۲۴۵۴x.f۱۲۴۵۰f.mo۱۳۷۶۱a(this.f۱۲۴۵۴x.f۱۲۴۴۷c, view, m۱۲۳۲۰f(), text, true);
            }
            return false;
        }
    }
}
