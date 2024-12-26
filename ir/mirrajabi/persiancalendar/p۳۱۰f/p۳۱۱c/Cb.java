package ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۱c;

import android.content.Context;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ir.mirrajabi.persiancalendar.Cc;
import ir.mirrajabi.persiancalendar.p۳۱۰f.Ca;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۵g.Cd;
import java.util.List;

/* renamed from: ir.mirrajabi.persiancalendar.f.c.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb extends RecyclerView.AbstractCg<a> {

    /* renamed from: c, reason: contains not printable characters */
    private Context f۱۶۴۰۳c;

    /* renamed from: d, reason: contains not printable characters */
    private ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۳e.Cb f۱۶۴۰۴d;

    /* renamed from: e, reason: contains not printable characters */
    private List<Cd> f۱۶۴۰۵e;

    /* renamed from: f, reason: contains not printable characters */
    private int f۱۶۴۰۶f = -1;

    /* renamed from: g, reason: contains not printable characters */
    private ir.mirrajabi.persiancalendar.p۳۱۰f.Cb f۱۶۴۰۷g;

    /* renamed from: h, reason: contains not printable characters */
    private final int f۱۶۴۰۸h;

    /* renamed from: i, reason: contains not printable characters */
    private final int f۱۶۴۰۹i;

    public Cb(Context context, ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۳e.Cb monthFragment, List<Cd> list) {
        this.f۱۶۴۰۸h = list.get(0).m۱۷۶۹۶a();
        this.f۱۶۴۰۹i = list.size();
        this.f۱۶۴۰۴d = monthFragment;
        this.f۱۶۴۰۳c = context;
        this.f۱۶۴۰۵e = list;
        this.f۱۶۴۰۷g = ir.mirrajabi.persiancalendar.p۳۱۰f.Cb.m۱۷۵۹۱a(context);
    }

    /* renamed from: e, reason: contains not printable characters */
    public void m۱۷۶۶۳e() {
        this.f۱۶۴۰۶f = -1;
        m۱۲۳۸۰d();
    }

    /* renamed from: d, reason: contains not printable characters */
    public void m۱۷۶۶۲d(int dayOfMonth) {
        this.f۱۶۴۰۶f = dayOfMonth + 6 + this.f۱۶۴۰۸h;
        m۱۲۳۸۰d();
    }

    /* renamed from: ir.mirrajabi.persiancalendar.f.c.b$a */
    public class a extends RecyclerView.AbstractCd0 implements View.OnClickListener, View.OnLongClickListener {

        /* renamed from: v, reason: contains not printable characters */
        TextView f۱۶۴۱۰v;

        /* renamed from: w, reason: contains not printable characters */
        View f۱۶۴۱۱w;

        /* renamed from: x, reason: contains not printable characters */
        View f۱۶۴۱۲x;

        /* renamed from: y, reason: contains not printable characters */
        View f۱۶۴۱۳y;

        public a(View itemView) {
            super(itemView);
            this.f۱۶۴۱۰v = (TextView) itemView.findViewById(ir.mirrajabi.persiancalendar.Cb.num);
            this.f۱۶۴۱۱w = itemView.findViewById(ir.mirrajabi.persiancalendar.Cb.today);
            this.f۱۶۴۱۲x = itemView.findViewById(ir.mirrajabi.persiancalendar.Cb.select_day);
            this.f۱۶۴۱۳y = itemView.findViewById(ir.mirrajabi.persiancalendar.Cb.event);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            int position = m۱۲۳۲۰f();
            int position2 = position + (6 - ((position % 7) * 2));
            if (Cb.this.f۱۶۴۰۹i >= (position2 - 6) - Cb.this.f۱۶۴۰۸h && (position2 - 7) - Cb.this.f۱۶۴۰۸h >= 0) {
                Cb.this.f۱۶۴۰۴d.m۱۷۶۷۷a(((Cd) Cb.this.f۱۶۴۰۵e.get((position2 - 7) - Cb.this.f۱۶۴۰۸h)).m۱۷۷۰۴c());
                Cb.this.f۱۶۴۰۶f = position2;
                Cb.this.m۱۲۳۸۰d();
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v) {
            int position = m۱۲۳۲۰f();
            int position2 = position + (6 - ((position % 7) * 2));
            if (Cb.this.f۱۶۴۰۹i >= (position2 - 6) - Cb.this.f۱۶۴۰۸h && Build.VERSION.SDK_INT >= 14) {
                try {
                    Cb.this.f۱۶۴۰۴d.m۱۷۶۷۸b(((Cd) Cb.this.f۱۶۴۰۵e.get((position2 - 7) - Cb.this.f۱۶۴۰۸h)).m۱۷۷۰۴c());
                } catch (Exception e2) {
                }
            }
            return false;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: avoid collision after fix types in other method and contains not printable characters */
    public a mo۱۷۶۶۰b(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(this.f۱۶۴۰۳c).inflate(Cc.item_day, parent, false);
        return new a(v);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo۱۷۶۶۱b(a holder, int position) {
        holder.f۱۶۴۱۱w.setBackgroundResource(this.f۱۶۴۰۷g.m۱۷۶۴۵p());
        holder.f۱۶۴۱۲x.setBackgroundResource(this.f۱۶۴۰۷g.m۱۷۶۴۳n());
        holder.f۱۶۴۱۳y.setBackgroundColor(this.f۱۶۴۰۷g.m۱۷۶۲۱c());
        int position2 = position + (6 - ((position % 7) * 2));
        if (this.f۱۶۴۰۹i < (position2 - 6) - this.f۱۶۴۰۸h) {
            return;
        }
        if (!m۱۷۶۵۵e(position2)) {
            if ((position2 - 7) - this.f۱۶۴۰۸h >= 0) {
                TextView textView = holder.f۱۶۴۱۰v;
                List<Cd> list = this.f۱۶۴۰۵e;
                textView.setText(list.get((position2 - 7) - list.get(0).m۱۷۶۹۶a()).m۱۷۷۰۲b());
                holder.f۱۶۴۱۰v.setVisibility(0);
                holder.f۱۶۴۱۰v.setTextSize(0, this.f۱۶۴۰۷g.m۱۷۶۳۳h());
                if (this.f۱۶۴۰۵e.get((position2 - 7) - this.f۱۶۴۰۸h).m۱۷۷۰۶e()) {
                    holder.f۱۶۴۱۰v.setTextColor(this.f۱۶۴۰۷g.m۱۷۶۲۵d());
                } else {
                    holder.f۱۶۴۱۰v.setTextColor(this.f۱۶۴۰۷g.m۱۷۶۲۹f());
                }
                Cd day = this.f۱۶۴۰۵e.get((position2 - 7) - this.f۱۶۴۰۸h);
                if (day.m۱۷۷۰۵d()) {
                    if (day.m۱۷۷۰۷f() && this.f۱۶۴۰۷g.m۱۷۶۴۶q()) {
                        holder.f۱۶۴۱۳y.setVisibility(0);
                    } else if (!day.m۱۷۷۰۷f() && this.f۱۶۴۰۷g.m۱۷۶۴۷r()) {
                        holder.f۱۶۴۱۳y.setVisibility(0);
                    } else {
                        holder.f۱۶۴۱۳y.setVisibility(8);
                    }
                } else {
                    holder.f۱۶۴۱۳y.setVisibility(8);
                }
                if (this.f۱۶۴۰۵e.get((position2 - 7) - this.f۱۶۴۰۸h).m۱۷۷۰۸g()) {
                    holder.f۱۶۴۱۱w.setVisibility(0);
                } else {
                    holder.f۱۶۴۱۱w.setVisibility(8);
                }
                if (position2 == this.f۱۶۴۰۶f) {
                    holder.f۱۶۴۱۲x.setVisibility(0);
                    if (this.f۱۶۴۰۵e.get((position2 - 7) - this.f۱۶۴۰۸h).m۱۷۷۰۶e()) {
                        holder.f۱۶۴۱۰v.setTextColor(this.f۱۶۴۰۷g.m۱۷۶۲۷e());
                    } else {
                        holder.f۱۶۴۱۰v.setTextColor(this.f۱۶۴۰۷g.m۱۷۶۳۱g());
                    }
                } else {
                    holder.f۱۶۴۱۲x.setVisibility(8);
                }
            } else {
                holder.f۱۶۴۱۱w.setVisibility(8);
                holder.f۱۶۴۱۲x.setVisibility(8);
                holder.f۱۶۴۱۰v.setVisibility(8);
                holder.f۱۶۴۱۳y.setVisibility(8);
            }
            this.f۱۶۴۰۷g.m۱۷۶۲۰b(holder.f۱۶۴۱۰v);
            return;
        }
        holder.f۱۶۴۱۰v.setText(Ca.f۱۶۳۷۳a[position2]);
        holder.f۱۶۴۱۰v.setTextColor(this.f۱۶۴۰۷g.m۱۷۶۱۳b());
        holder.f۱۶۴۱۰v.setTextSize(0, this.f۱۶۴۰۷g.m۱۷۶۳۵i());
        holder.f۱۶۴۱۰v.setTypeface(this.f۱۶۴۰۷g.m۱۷۶۳۷j());
        holder.f۱۶۴۱۱w.setVisibility(8);
        holder.f۱۶۴۱۲x.setVisibility(8);
        holder.f۱۶۴۱۳y.setVisibility(8);
        holder.f۱۶۴۱۰v.setVisibility(0);
        this.f۱۶۴۰۷g.m۱۷۶۱۱a(holder.f۱۶۴۱۰v);
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۵۶a() {
        return 49;
    }

    @Override // android.support.v7.widget.RecyclerView.AbstractCg
    /* renamed from: b, reason: contains not printable characters */
    public int mo۱۷۶۵۸b(int position) {
        if (m۱۷۶۵۵e(position)) {
            return 0;
        }
        return 1;
    }

    /* renamed from: e, reason: contains not printable characters */
    private boolean m۱۷۶۵۵e(int position) {
        return position < 7;
    }
}
