package b.a.a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
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
import b.a.a.f;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class a extends RecyclerView.g<b> {

    /* renamed from: c  reason: collision with root package name */
    private final f f۲۳۳۰c;

    /* renamed from: d  reason: collision with root package name */
    private final int f۲۳۳۱d;

    /* renamed from: e  reason: collision with root package name */
    private final e f۲۳۳۲e;

    /* renamed from: f  reason: collision with root package name */
    private c f۲۳۳۳f;

    /* access modifiers changed from: package-private */
    public interface c {
        boolean a(f fVar, View view, int i, CharSequence charSequence, boolean z);
    }

    a(f dialog, int layout) {
        this.f۲۳۳۰c = dialog;
        this.f۲۳۳۱d = layout;
        this.f۲۳۳۲e = dialog.f۲۳۴۷e.f۲۳۶۲f;
    }

    /* access modifiers changed from: package-private */
    public void a(c callback) {
        this.f۲۳۳۳f = callback;
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public b b(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(this.f۲۳۳۱d, parent, false);
        b.a.a.r.a.a(view, this.f۲۳۳۰c.f());
        return new b(view, this);
    }

    /* renamed from: a */
    public void b(b holder, int index) {
        View view = holder.f۱۸۴۱c;
        boolean disabled = b.a.a.r.a.a(Integer.valueOf(index), this.f۲۳۳۰c.f۲۳۴۷e.Q);
        int itemTextColor = disabled ? b.a.a.r.a.a(this.f۲۳۳۰c.f۲۳۴۷e.h0, 0.4f) : this.f۲۳۳۰c.f۲۳۴۷e.h0;
        holder.f۱۸۴۱c.setEnabled(!disabled);
        int i = C۰۰۴۱a.f۲۳۳۴a[this.f۲۳۳۰c.u.ordinal()];
        if (i == 1) {
            RadioButton radio = (RadioButton) holder.v;
            boolean selected = this.f۲۳۳۰c.f۲۳۴۷e.O == index;
            f.d dVar = this.f۲۳۳۰c.f۲۳۴۷e;
            ColorStateList colorStateList = dVar.u;
            if (colorStateList != null) {
                com.afollestad.materialdialogs.internal.c.a(radio, colorStateList);
            } else {
                com.afollestad.materialdialogs.internal.c.a(radio, dVar.t);
            }
            radio.setChecked(selected);
            radio.setEnabled(!disabled);
        } else if (i == 2) {
            CheckBox checkbox = (CheckBox) holder.v;
            boolean selected2 = this.f۲۳۳۰c.v.contains(Integer.valueOf(index));
            f.d dVar2 = this.f۲۳۳۰c.f۲۳۴۷e;
            ColorStateList colorStateList2 = dVar2.u;
            if (colorStateList2 != null) {
                com.afollestad.materialdialogs.internal.c.a(checkbox, colorStateList2);
            } else {
                com.afollestad.materialdialogs.internal.c.a(checkbox, dVar2.t);
            }
            checkbox.setChecked(selected2);
            checkbox.setEnabled(!disabled);
        }
        holder.w.setText(this.f۲۳۳۰c.f۲۳۴۷e.l.get(index));
        holder.w.setTextColor(itemTextColor);
        f fVar = this.f۲۳۳۰c;
        fVar.a(holder.w, fVar.f۲۳۴۷e.S);
        a((ViewGroup) view);
        int[] iArr = this.f۲۳۳۰c.f۲۳۴۷e.v0;
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
    /* renamed from: b.a.a.a$a  reason: collision with other inner class name */
    public static /* synthetic */ class C۰۰۴۱a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f۲۳۳۴a = new int[f.l.values().length];

        static {
            try {
                f۲۳۳۴a[f.l.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۲۳۳۴a[f.l.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        ArrayList<CharSequence> arrayList = this.f۲۳۳۰c.f۲۳۴۷e.l;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @TargetApi(17)
    private void a(ViewGroup view) {
        ((LinearLayout) view).setGravity(this.f۲۳۳۲e.a() | 16);
        if (view.getChildCount() != 2) {
            return;
        }
        if (this.f۲۳۳۲e == e.END && !e() && (view.getChildAt(0) instanceof CompoundButton)) {
            CompoundButton first = (CompoundButton) view.getChildAt(0);
            view.removeView(first);
            TextView second = (TextView) view.getChildAt(0);
            view.removeView(second);
            second.setPadding(second.getPaddingRight(), second.getPaddingTop(), second.getPaddingLeft(), second.getPaddingBottom());
            view.addView(second);
            view.addView(first);
        } else if (this.f۲۳۳۲e == e.START && e() && (view.getChildAt(1) instanceof CompoundButton)) {
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
    private boolean e() {
        if (Build.VERSION.SDK_INT >= 17 && this.f۲۳۳۰c.c().b().getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static class b extends RecyclerView.d0 implements View.OnClickListener, View.OnLongClickListener {
        final CompoundButton v;
        final TextView w;
        final a x;

        b(View itemView, a adapter) {
            super(itemView);
            this.v = (CompoundButton) itemView.findViewById(k.md_control);
            this.w = (TextView) itemView.findViewById(k.md_title);
            this.x = adapter;
            itemView.setOnClickListener(this);
            if (adapter.f۲۳۳۰c.f۲۳۴۷e.F != null) {
                itemView.setOnLongClickListener(this);
            }
        }

        public void onClick(View view) {
            if (this.x.f۲۳۳۳f != null && f() != -1) {
                CharSequence text = null;
                if (this.x.f۲۳۳۰c.f۲۳۴۷e.l != null && f() < this.x.f۲۳۳۰c.f۲۳۴۷e.l.size()) {
                    text = this.x.f۲۳۳۰c.f۲۳۴۷e.l.get(f());
                }
                this.x.f۲۳۳۳f.a(this.x.f۲۳۳۰c, view, f(), text, false);
            }
        }

        public boolean onLongClick(View view) {
            if (this.x.f۲۳۳۳f == null || f() == -1) {
                return false;
            }
            CharSequence text = null;
            if (this.x.f۲۳۳۰c.f۲۳۴۷e.l != null && f() < this.x.f۲۳۳۰c.f۲۳۴۷e.l.size()) {
                text = this.x.f۲۳۳۰c.f۲۳۴۷e.l.get(f());
            }
            return this.x.f۲۳۳۳f.a(this.x.f۲۳۳۰c, view, f(), text, true);
        }
    }
}
