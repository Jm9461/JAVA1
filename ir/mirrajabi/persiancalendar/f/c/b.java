package ir.mirrajabi.persiancalendar.f.c;

import android.content.Context;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ir.mirrajabi.persiancalendar.c;
import ir.mirrajabi.persiancalendar.f.g.d;
import java.util.List;

public class b extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    private Context f۴۲۸۳c;

    /* renamed from: d  reason: collision with root package name */
    private ir.mirrajabi.persiancalendar.f.e.b f۴۲۸۴d;

    /* renamed from: e  reason: collision with root package name */
    private List<d> f۴۲۸۵e;

    /* renamed from: f  reason: collision with root package name */
    private int f۴۲۸۶f = -1;

    /* renamed from: g  reason: collision with root package name */
    private ir.mirrajabi.persiancalendar.f.b f۴۲۸۷g;

    /* renamed from: h  reason: collision with root package name */
    private final int f۴۲۸۸h;
    private final int i;

    public b(Context context, ir.mirrajabi.persiancalendar.f.e.b monthFragment, List<d> list) {
        this.f۴۲۸۸h = list.get(0).a();
        this.i = list.size();
        this.f۴۲۸۴d = monthFragment;
        this.f۴۲۸۳c = context;
        this.f۴۲۸۵e = list;
        this.f۴۲۸۷g = ir.mirrajabi.persiancalendar.f.b.a(context);
    }

    public void e() {
        this.f۴۲۸۶f = -1;
        d();
    }

    public void d(int dayOfMonth) {
        this.f۴۲۸۶f = dayOfMonth + 6 + this.f۴۲۸۸h;
        d();
    }

    public class a extends RecyclerView.d0 implements View.OnClickListener, View.OnLongClickListener {
        TextView v;
        View w;
        View x;
        View y;

        public a(View itemView) {
            super(itemView);
            this.v = (TextView) itemView.findViewById(ir.mirrajabi.persiancalendar.b.num);
            this.w = itemView.findViewById(ir.mirrajabi.persiancalendar.b.today);
            this.x = itemView.findViewById(ir.mirrajabi.persiancalendar.b.select_day);
            this.y = itemView.findViewById(ir.mirrajabi.persiancalendar.b.event);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }

        public void onClick(View v2) {
            int position = f();
            int position2 = position + (6 - ((position % 7) * 2));
            if (b.this.i >= (position2 - 6) - b.this.f۴۲۸۸h && (position2 - 7) - b.this.f۴۲۸۸h >= 0) {
                b.this.f۴۲۸۴d.a(((d) b.this.f۴۲۸۵e.get((position2 - 7) - b.this.f۴۲۸۸h)).c());
                b.this.f۴۲۸۶f = position2;
                b.this.d();
            }
        }

        public boolean onLongClick(View v2) {
            int position = f();
            int position2 = position + (6 - ((position % 7) * 2));
            if (b.this.i >= (position2 - 6) - b.this.f۴۲۸۸h && Build.VERSION.SDK_INT >= 14) {
                try {
                    b.this.f۴۲۸۴d.b(((d) b.this.f۴۲۸۵e.get((position2 - 7) - b.this.f۴۲۸۸h)).c());
                } catch (Exception e2) {
                }
            }
            return false;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public a b(ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(this.f۴۲۸۳c).inflate(c.item_day, parent, false));
    }

    /* renamed from: a */
    public void b(a holder, int position) {
        holder.w.setBackgroundResource(this.f۴۲۸۷g.p());
        holder.x.setBackgroundResource(this.f۴۲۸۷g.n());
        holder.y.setBackgroundColor(this.f۴۲۸۷g.c());
        int position2 = position + (6 - ((position % 7) * 2));
        if (this.i >= (position2 - 6) - this.f۴۲۸۸h) {
            if (!e(position2)) {
                if ((position2 - 7) - this.f۴۲۸۸h >= 0) {
                    TextView textView = holder.v;
                    List<d> list = this.f۴۲۸۵e;
                    textView.setText(list.get((position2 - 7) - list.get(0).a()).b());
                    holder.v.setVisibility(0);
                    holder.v.setTextSize(0, this.f۴۲۸۷g.h());
                    if (this.f۴۲۸۵e.get((position2 - 7) - this.f۴۲۸۸h).e()) {
                        holder.v.setTextColor(this.f۴۲۸۷g.d());
                    } else {
                        holder.v.setTextColor(this.f۴۲۸۷g.f());
                    }
                    d day = this.f۴۲۸۵e.get((position2 - 7) - this.f۴۲۸۸h);
                    if (!day.d()) {
                        holder.y.setVisibility(8);
                    } else if (day.f() && this.f۴۲۸۷g.q()) {
                        holder.y.setVisibility(0);
                    } else if (day.f() || !this.f۴۲۸۷g.r()) {
                        holder.y.setVisibility(8);
                    } else {
                        holder.y.setVisibility(0);
                    }
                    if (this.f۴۲۸۵e.get((position2 - 7) - this.f۴۲۸۸h).g()) {
                        holder.w.setVisibility(0);
                    } else {
                        holder.w.setVisibility(8);
                    }
                    if (position2 == this.f۴۲۸۶f) {
                        holder.x.setVisibility(0);
                        if (this.f۴۲۸۵e.get((position2 - 7) - this.f۴۲۸۸h).e()) {
                            holder.v.setTextColor(this.f۴۲۸۷g.e());
                        } else {
                            holder.v.setTextColor(this.f۴۲۸۷g.g());
                        }
                    } else {
                        holder.x.setVisibility(8);
                    }
                } else {
                    holder.w.setVisibility(8);
                    holder.x.setVisibility(8);
                    holder.v.setVisibility(8);
                    holder.y.setVisibility(8);
                }
                this.f۴۲۸۷g.b(holder.v);
                return;
            }
            holder.v.setText(ir.mirrajabi.persiancalendar.f.a.f۴۲۷۲a[position2]);
            holder.v.setTextColor(this.f۴۲۸۷g.b());
            holder.v.setTextSize(0, this.f۴۲۸۷g.i());
            holder.v.setTypeface(this.f۴۲۸۷g.j());
            holder.w.setVisibility(8);
            holder.x.setVisibility(8);
            holder.y.setVisibility(8);
            holder.v.setVisibility(0);
            this.f۴۲۸۷g.a(holder.v);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int a() {
        return 49;
    }

    @Override // android.support.v7.widget.RecyclerView.g
    public int b(int position) {
        if (e(position)) {
            return 0;
        }
        return 1;
    }

    private boolean e(int position) {
        return position < 7;
    }
}
