package p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۷c;

import android.content.Context;
import android.os.Build;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import p۱۵۵ir.mirrajabi.persiancalendar.Cc;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.Ca;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۶۱g.Cd;

/* renamed from: ir.mirrajabi.persiancalendar.f.c.b  reason: invalid class name */
public class Cb extends RecyclerView.AbstractCg<View$OnClickListenerCa> {

    /* renamed from: c  reason: contains not printable characters */
    private Context f۱۶۴۰۳c;

    /* renamed from: d  reason: contains not printable characters */
    private p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۹e.Cb f۱۶۴۰۴d;

    /* renamed from: e  reason: contains not printable characters */
    private List<Cd> f۱۶۴۰۵e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۶۴۰۶f = -1;

    /* renamed from: g  reason: contains not printable characters */
    private p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.Cb f۱۶۴۰۷g;

    /* renamed from: h  reason: contains not printable characters */
    private final int f۱۶۴۰۸h;

    /* renamed from: i  reason: contains not printable characters */
    private final int f۱۶۴۰۹i;

    public Cb(Context context, p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۹e.Cb monthFragment, List<Cd> list) {
        this.f۱۶۴۰۸h = list.get(0).m۱۹۷۷۲a();
        this.f۱۶۴۰۹i = list.size();
        this.f۱۶۴۰۴d = monthFragment;
        this.f۱۶۴۰۳c = context;
        this.f۱۶۴۰۵e = list;
        this.f۱۶۴۰۷g = p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.Cb.m۱۹۶۶۸a(context);
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۹۷۴۰e() {
        this.f۱۶۴۰۶f = -1;
        m۱۴۴۵۰d();
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۹۷۳۹d(int dayOfMonth) {
        this.f۱۶۴۰۶f = dayOfMonth + 6 + this.f۱۶۴۰۸h;
        m۱۴۴۵۰d();
    }

    /* renamed from: ir.mirrajabi.persiancalendar.f.c.b$a  reason: invalid class name */
    public class View$OnClickListenerCa extends RecyclerView.AbstractCd0 implements View.OnClickListener, View.OnLongClickListener {

        /* renamed from: v  reason: contains not printable characters */
        TextView f۱۶۴۱۰v;

        /* renamed from: w  reason: contains not printable characters */
        View f۱۶۴۱۱w;

        /* renamed from: x  reason: contains not printable characters */
        View f۱۶۴۱۲x;

        /* renamed from: y  reason: contains not printable characters */
        View f۱۶۴۱۳y;

        public View$OnClickListenerCa(View itemView) {
            super(itemView);
            this.f۱۶۴۱۰v = (TextView) itemView.findViewById(p۱۵۵ir.mirrajabi.persiancalendar.Cb.num);
            this.f۱۶۴۱۱w = itemView.findViewById(p۱۵۵ir.mirrajabi.persiancalendar.Cb.today);
            this.f۱۶۴۱۲x = itemView.findViewById(p۱۵۵ir.mirrajabi.persiancalendar.Cb.select_day);
            this.f۱۶۴۱۳y = itemView.findViewById(p۱۵۵ir.mirrajabi.persiancalendar.Cb.event);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }

        public void onClick(View v) {
            int position = m۱۴۳۹۰f();
            int position2 = position + (6 - ((position % 7) * 2));
            if (Cb.this.f۱۶۴۰۹i >= (position2 - 6) - Cb.this.f۱۶۴۰۸h && (position2 - 7) - Cb.this.f۱۶۴۰۸h >= 0) {
                Cb.this.f۱۶۴۰۴d.m۱۹۷۵۴a(((Cd) Cb.this.f۱۶۴۰۵e.get((position2 - 7) - Cb.this.f۱۶۴۰۸h)).m۱۹۷۸۰c());
                Cb.this.f۱۶۴۰۶f = position2;
                Cb.this.m۱۴۴۵۰d();
            }
        }

        public boolean onLongClick(View v) {
            int position = m۱۴۳۹۰f();
            int position2 = position + (6 - ((position % 7) * 2));
            if (Cb.this.f۱۶۴۰۹i >= (position2 - 6) - Cb.this.f۱۶۴۰۸h && Build.VERSION.SDK_INT >= 14) {
                try {
                    Cb.this.f۱۶۴۰۴d.m۱۹۷۵۵b(((Cd) Cb.this.f۱۶۴۰۵e.get((position2 - 7) - Cb.this.f۱۶۴۰۸h)).m۱۹۷۸۰c());
                } catch (Exception e) {
                }
            }
            return false;
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public View$OnClickListenerCa m۱۹۷۳۶b(ViewGroup parent, int viewType) {
        return new View$OnClickListenerCa(LayoutInflater.from(this.f۱۶۴۰۳c).inflate(Cc.item_day, parent, false));
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۷۳۸b(View$OnClickListenerCa holder, int position) {
        holder.f۱۶۴۱۱w.setBackgroundResource(this.f۱۶۴۰۷g.m۱۹۷۲۲p());
        holder.f۱۶۴۱۲x.setBackgroundResource(this.f۱۶۴۰۷g.m۱۹۷۲۰n());
        holder.f۱۶۴۱۳y.setBackgroundColor(this.f۱۶۴۰۷g.m۱۹۶۹۸c());
        int position2 = position + (6 - ((position % 7) * 2));
        if (this.f۱۶۴۰۹i >= (position2 - 6) - this.f۱۶۴۰۸h) {
            if (!m۱۹۷۳۲e(position2)) {
                if ((position2 - 7) - this.f۱۶۴۰۸h >= 0) {
                    TextView textView = holder.f۱۶۴۱۰v;
                    List<Cd> list = this.f۱۶۴۰۵e;
                    textView.setText(list.get((position2 - 7) - list.get(0).m۱۹۷۷۲a()).m۱۹۷۷۸b());
                    holder.f۱۶۴۱۰v.setVisibility(0);
                    holder.f۱۶۴۱۰v.setTextSize(0, this.f۱۶۴۰۷g.m۱۹۷۱۰h());
                    if (this.f۱۶۴۰۵e.get((position2 - 7) - this.f۱۶۴۰۸h).m۱۹۷۸۲e()) {
                        holder.f۱۶۴۱۰v.setTextColor(this.f۱۶۴۰۷g.m۱۹۷۰۲d());
                    } else {
                        holder.f۱۶۴۱۰v.setTextColor(this.f۱۶۴۰۷g.m۱۹۷۰۶f());
                    }
                    Cd day = this.f۱۶۴۰۵e.get((position2 - 7) - this.f۱۶۴۰۸h);
                    if (!day.m۱۹۷۸۱d()) {
                        holder.f۱۶۴۱۳y.setVisibility(8);
                    } else if (day.m۱۹۷۸۳f() && this.f۱۶۴۰۷g.m۱۹۷۲۳q()) {
                        holder.f۱۶۴۱۳y.setVisibility(0);
                    } else if (day.m۱۹۷۸۳f() || !this.f۱۶۴۰۷g.m۱۹۷۲۴r()) {
                        holder.f۱۶۴۱۳y.setVisibility(8);
                    } else {
                        holder.f۱۶۴۱۳y.setVisibility(0);
                    }
                    if (this.f۱۶۴۰۵e.get((position2 - 7) - this.f۱۶۴۰۸h).m۱۹۷۸۴g()) {
                        holder.f۱۶۴۱۱w.setVisibility(0);
                    } else {
                        holder.f۱۶۴۱۱w.setVisibility(8);
                    }
                    if (position2 == this.f۱۶۴۰۶f) {
                        holder.f۱۶۴۱۲x.setVisibility(0);
                        if (this.f۱۶۴۰۵e.get((position2 - 7) - this.f۱۶۴۰۸h).m۱۹۷۸۲e()) {
                            holder.f۱۶۴۱۰v.setTextColor(this.f۱۶۴۰۷g.m۱۹۷۰۴e());
                        } else {
                            holder.f۱۶۴۱۰v.setTextColor(this.f۱۶۴۰۷g.m۱۹۷۰۸g());
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
                this.f۱۶۴۰۷g.m۱۹۶۹۷b(holder.f۱۶۴۱۰v);
                return;
            }
            holder.f۱۶۴۱۰v.setText(Ca.f۱۶۳۷۳a[position2]);
            holder.f۱۶۴۱۰v.setTextColor(this.f۱۶۴۰۷g.m۱۹۶۹۰b());
            holder.f۱۶۴۱۰v.setTextSize(0, this.f۱۶۴۰۷g.m۱۹۷۱۲i());
            holder.f۱۶۴۱۰v.setTypeface(this.f۱۶۴۰۷g.m۱۹۷۱۴j());
            holder.f۱۶۴۱۱w.setVisibility(8);
            holder.f۱۶۴۱۲x.setVisibility(8);
            holder.f۱۶۴۱۳y.setVisibility(8);
            holder.f۱۶۴۱۰v.setVisibility(0);
            this.f۱۶۴۰۷g.m۱۹۶۸۸a(holder.f۱۶۴۱۰v);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۹۷۳۳a() {
        return 49;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCg
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۹۷۳۵b(int position) {
        if (m۱۹۷۳۲e(position)) {
            return 0;
        }
        return 1;
    }

    /* renamed from: e  reason: contains not printable characters */
    private boolean m۱۹۷۳۲e(int position) {
        return position < 7;
    }
}
