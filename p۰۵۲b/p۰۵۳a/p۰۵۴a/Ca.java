package p۰۵۲b.p۰۵۳a.p۰۵۴a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.os.Build;
import android.support.p۰۴۷v7.widget.RecyclerView;
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
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.a  reason: invalid class name */
public class Ca extends RecyclerView.AbstractCg<View$OnClickListenerCb> {

    /* renamed from: c  reason: contains not printable characters */
    private final View$OnClickListenerCf f۱۲۴۴۷c;

    /* renamed from: d  reason: contains not printable characters */
    private final int f۱۲۴۴۸d;

    /* renamed from: e  reason: contains not printable characters */
    private final EnumCe f۱۲۴۴۹e;

    /* renamed from: f  reason: contains not printable characters */
    private AbstractCc f۱۲۴۵۰f;

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.a.a$c  reason: invalid class name */
    public interface AbstractCc {
        /* renamed from: a  reason: contains not printable characters */
        boolean m۱۵۸۱۲a(View$OnClickListenerCf fVar, View view, int i, CharSequence charSequence, boolean z);
    }

    Ca(View$OnClickListenerCf dialog, int layout) {
        this.f۱۲۴۴۷c = dialog;
        this.f۱۲۴۴۸d = layout;
        this.f۱۲۴۴۹e = dialog.f۱۲۴۶۷e.f۱۲۵۴۲f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۸۰۸a(AbstractCc callback) {
        this.f۱۲۴۵۰f = callback;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public View$OnClickListenerCb m۱۵۸۰۹b(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(this.f۱۲۴۴۸d, parent, false);
        p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۸۹۷a(view, this.f۱۲۴۴۷c.m۱۵۸۳۶f());
        return new View$OnClickListenerCb(view, this);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۸۱۱b(View$OnClickListenerCb holder, int index) {
        View view = holder.f۱۱۶۳۷c;
        boolean disabled = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۰a(Integer.valueOf(index), this.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۲۲Q);
        int itemTextColor = disabled ? p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۸۸۸a(this.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۴۷h0, 0.4f) : this.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۴۷h0;
        holder.f۱۱۶۳۷c.setEnabled(!disabled);
        int i = Ca.f۱۲۴۵۱a[this.f۱۲۴۴۷c.f۱۲۴۸۳u.ordinal()];
        if (i == 1) {
            RadioButton radio = (RadioButton) holder.f۱۲۴۵۲v;
            boolean selected = this.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۱۹O == index;
            View$OnClickListenerCf.Cd dVar = this.f۱۲۴۴۷c.f۱۲۴۶۷e;
            ColorStateList colorStateList = dVar.f۱۲۵۷۲u;
            if (colorStateList != null) {
                Cc.m۱۶۷۷۰a(radio, colorStateList);
            } else {
                Cc.m۱۶۷۶۹a(radio, dVar.f۱۲۵۷۰t);
            }
            radio.setChecked(selected);
            radio.setEnabled(!disabled);
        } else if (i == 2) {
            CheckBox checkbox = (CheckBox) holder.f۱۲۴۵۲v;
            boolean selected2 = this.f۱۲۴۴۷c.f۱۲۴۸۴v.contains(Integer.valueOf(index));
            View$OnClickListenerCf.Cd dVar2 = this.f۱۲۴۴۷c.f۱۲۴۶۷e;
            ColorStateList colorStateList2 = dVar2.f۱۲۵۷۲u;
            if (colorStateList2 != null) {
                Cc.m۱۶۷۶۵a(checkbox, colorStateList2);
            } else {
                Cc.m۱۶۷۶۴a(checkbox, dVar2.f۱۲۵۷۰t);
            }
            checkbox.setChecked(selected2);
            checkbox.setEnabled(!disabled);
        }
        holder.f۱۲۴۵۳w.setText(this.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۵۴l.get(index));
        holder.f۱۲۴۵۳w.setTextColor(itemTextColor);
        View$OnClickListenerCf fVar = this.f۱۲۴۴۷c;
        fVar.m۱۵۸۲۸a(holder.f۱۲۴۵۳w, fVar.f۱۲۴۶۷e.f۱۲۵۲۴S);
        m۱۵۸۰۳a((ViewGroup) view);
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
            if (group.getChildCount() != 2) {
                return;
            }
            if (group.getChildAt(0) instanceof CompoundButton) {
                group.getChildAt(0).setBackground(null);
            } else if (group.getChildAt(1) instanceof CompoundButton) {
                group.getChildAt(1).setBackground(null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.a.a$a  reason: invalid class name */
    public static /* synthetic */ class Ca {

        /* renamed from: a  reason: contains not printable characters */
        static final /* synthetic */ int[] f۱۲۴۵۱a = new int[View$OnClickListenerCf.EnumCl.values().length];

        static {
            try {
                f۱۲۴۵۱a[View$OnClickListenerCf.EnumCl.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f۱۲۴۵۱a[View$OnClickListenerCf.EnumCl.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۵۸۰۶a() {
        ArrayList<CharSequence> arrayList = this.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۵۴l;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @TargetApi(17)
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۸۰۳a(ViewGroup view) {
        ((LinearLayout) view).setGravity(this.f۱۲۴۴۹e.m۱۵۸۲۱a() | 16);
        if (view.getChildCount() != 2) {
            return;
        }
        if (this.f۱۲۴۴۹e == EnumCe.END && !m۱۵۸۰۵e() && (view.getChildAt(0) instanceof CompoundButton)) {
            CompoundButton first = (CompoundButton) view.getChildAt(0);
            view.removeView(first);
            TextView second = (TextView) view.getChildAt(0);
            view.removeView(second);
            second.setPadding(second.getPaddingRight(), second.getPaddingTop(), second.getPaddingLeft(), second.getPaddingBottom());
            view.addView(second);
            view.addView(first);
        } else if (this.f۱۲۴۴۹e == EnumCe.START && m۱۵۸۰۵e() && (view.getChildAt(1) instanceof CompoundButton)) {
            CompoundButton first2 = (CompoundButton) view.getChildAt(1);
            view.removeView(first2);
            TextView second2 = (TextView) view.getChildAt(0);
            view.removeView(second2);
            second2.setPadding(second2.getPaddingRight(), second2.getPaddingTop(), second2.getPaddingRight(), second2.getPaddingBottom());
            view.addView(first2);
            view.addView(second2);
        }
    }

    @TargetApi(17)
    /* renamed from: e  reason: contains not printable characters */
    private boolean m۱۵۸۰۵e() {
        if (Build.VERSION.SDK_INT >= 17 && this.f۱۲۴۴۷c.m۱۵۸۳۳c().m۱۵۸۵۵b().getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.a.a$b  reason: invalid class name */
    public static class View$OnClickListenerCb extends RecyclerView.AbstractCd0 implements View.OnClickListener, View.OnLongClickListener {

        /* renamed from: v  reason: contains not printable characters */
        final CompoundButton f۱۲۴۵۲v;

        /* renamed from: w  reason: contains not printable characters */
        final TextView f۱۲۴۵۳w;

        /* renamed from: x  reason: contains not printable characters */
        final Ca f۱۲۴۵۴x;

        View$OnClickListenerCb(View itemView, Ca adapter) {
            super(itemView);
            this.f۱۲۴۵۲v = (CompoundButton) itemView.findViewById(Ck.md_control);
            this.f۱۲۴۵۳w = (TextView) itemView.findViewById(Ck.md_title);
            this.f۱۲۴۵۴x = adapter;
            itemView.setOnClickListener(this);
            if (adapter.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۰۱F != null) {
                itemView.setOnLongClickListener(this);
            }
        }

        public void onClick(View view) {
            if (this.f۱۲۴۵۴x.f۱۲۴۵۰f != null && m۱۴۳۹۰f() != -1) {
                CharSequence text = null;
                if (this.f۱۲۴۵۴x.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۵۴l != null && m۱۴۳۹۰f() < this.f۱۲۴۵۴x.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۵۴l.size()) {
                    text = this.f۱۲۴۵۴x.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۵۴l.get(m۱۴۳۹۰f());
                }
                this.f۱۲۴۵۴x.f۱۲۴۵۰f.m۱۵۸۱۲a(this.f۱۲۴۵۴x.f۱۲۴۴۷c, view, m۱۴۳۹۰f(), text, false);
            }
        }

        public boolean onLongClick(View view) {
            if (this.f۱۲۴۵۴x.f۱۲۴۵۰f == null || m۱۴۳۹۰f() == -1) {
                return false;
            }
            CharSequence text = null;
            if (this.f۱۲۴۵۴x.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۵۴l != null && m۱۴۳۹۰f() < this.f۱۲۴۵۴x.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۵۴l.size()) {
                text = this.f۱۲۴۵۴x.f۱۲۴۴۷c.f۱۲۴۶۷e.f۱۲۵۵۴l.get(m۱۴۳۹۰f());
            }
            return this.f۱۲۴۵۴x.f۱۲۴۵۰f.m۱۵۸۱۲a(this.f۱۲۴۵۴x.f۱۲۴۴۷c, view, m۱۴۳۹۰f(), text, true);
        }
    }
}
