package android.support.p۰۴۷v7.widget;

import android.support.p۰۴۷v7.widget.RecyclerView;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCj;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cf;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ck;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.q1  reason: invalid class name */
public class Cq1 {

    /* renamed from: a  reason: contains not printable characters */
    final p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<RecyclerView.AbstractCd0, Ca> f۱۲۳۱۵a = new p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<>();

    /* renamed from: b  reason: contains not printable characters */
    final Cf<RecyclerView.AbstractCd0> f۱۲۳۱۶b = new Cf<>();

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.q1$b  reason: invalid class name */
    public interface AbstractCb {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۵۵۵۰a(RecyclerView.AbstractCd0 d0Var);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۵۵۵۱a(RecyclerView.AbstractCd0 d0Var, RecyclerView.AbstractCl.Cc cVar, RecyclerView.AbstractCl.Cc cVar2);

        /* renamed from: b  reason: contains not printable characters */
        void m۱۵۵۵۲b(RecyclerView.AbstractCd0 d0Var, RecyclerView.AbstractCl.Cc cVar, RecyclerView.AbstractCl.Cc cVar2);

        /* renamed from: c  reason: contains not printable characters */
        void m۱۵۵۵۳c(RecyclerView.AbstractCd0 d0Var, RecyclerView.AbstractCl.Cc cVar, RecyclerView.AbstractCl.Cc cVar2);
    }

    Cq1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۵۳۲a() {
        this.f۱۲۳۱۵a.clear();
        this.f۱۲۳۱۶b.m۱۰۵۹۶a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۵۵۴۰c(RecyclerView.AbstractCd0 holder, RecyclerView.AbstractCl.Cc info2) {
        Ca record = this.f۱۲۳۱۵a.get(holder);
        if (record == null) {
            record = Ca.m۱۵۵۴۹b();
            this.f۱۲۳۱۵a.put(holder, record);
        }
        record.f۱۲۳۱۹b = info2;
        record.f۱۲۳۱۸a |= 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۵۵۳۹b(RecyclerView.AbstractCd0 holder) {
        Ca record = this.f۱۲۳۱۵a.get(holder);
        return (record == null || (record.f۱۲۳۱۸a & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public RecyclerView.AbstractCl.Cc m۱۵۵۴۴f(RecyclerView.AbstractCd0 vh) {
        return m۱۵۵۳۰a(vh, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public RecyclerView.AbstractCl.Cc m۱۵۵۴۳e(RecyclerView.AbstractCd0 vh) {
        return m۱۵۵۳۰a(vh, 8);
    }

    /* renamed from: a  reason: contains not printable characters */
    private RecyclerView.AbstractCl.Cc m۱۵۵۳۰a(RecyclerView.AbstractCd0 vh, int flag) {
        Ca record;
        RecyclerView.AbstractCl.Cc info2;
        int index = this.f۱۲۳۱۵a.m۱۰۶۴۸a(vh);
        if (index >= 0 && (record = this.f۱۲۳۱۵a.m۱۰۶۵۶d(index)) != null) {
            int i = record.f۱۲۳۱۸a;
            if ((i & flag) != 0) {
                record.f۱۲۳۱۸a = (flag ^ -1) & i;
                if (flag == 4) {
                    info2 = record.f۱۲۳۱۹b;
                } else if (flag == 8) {
                    info2 = record.f۱۲۳۲۰c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((record.f۱۲۳۱۸a & 12) == 0) {
                    this.f۱۲۳۱۵a.m۱۰۶۵۵c(index);
                    Ca.m۱۵۵۴۸a(record);
                }
                return info2;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۵۳۳a(long key, RecyclerView.AbstractCd0 holder) {
        this.f۱۲۳۱۶b.m۱۰۶۰۵c(key, holder);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۵۳۵a(RecyclerView.AbstractCd0 holder, RecyclerView.AbstractCl.Cc info2) {
        Ca record = this.f۱۲۳۱۵a.get(holder);
        if (record == null) {
            record = Ca.m۱۵۵۴۹b();
            this.f۱۲۳۱۵a.put(holder, record);
        }
        record.f۱۲۳۱۸a |= 2;
        record.f۱۲۳۱۹b = info2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۵۵۴۱c(RecyclerView.AbstractCd0 viewHolder) {
        Ca record = this.f۱۲۳۱۵a.get(viewHolder);
        return (record == null || (record.f۱۲۳۱۸a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public RecyclerView.AbstractCd0 m۱۵۵۳۱a(long key) {
        return this.f۱۲۳۱۶b.m۱۰۶۰۰b(key);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۵۳۸b(RecyclerView.AbstractCd0 holder, RecyclerView.AbstractCl.Cc info2) {
        Ca record = this.f۱۲۳۱۵a.get(holder);
        if (record == null) {
            record = Ca.m۱۵۵۴۹b();
            this.f۱۲۳۱۵a.put(holder, record);
        }
        record.f۱۲۳۲۰c = info2;
        record.f۱۲۳۱۸a |= 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۵۳۴a(RecyclerView.AbstractCd0 holder) {
        Ca record = this.f۱۲۳۱۵a.get(holder);
        if (record == null) {
            record = Ca.m۱۵۵۴۹b();
            this.f۱۲۳۱۵a.put(holder, record);
        }
        record.f۱۲۳۱۸a |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public void m۱۵۵۴۵g(RecyclerView.AbstractCd0 holder) {
        Ca record = this.f۱۲۳۱۵a.get(holder);
        if (record != null) {
            record.f۱۲۳۱۸a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۵۳۶a(AbstractCb callback) {
        for (int index = this.f۱۲۳۱۵a.size() - 1; index >= 0; index--) {
            RecyclerView.AbstractCd0 viewHolder = this.f۱۲۳۱۵a.m۱۰۶۵۴b(index);
            Ca record = this.f۱۲۳۱۵a.m۱۰۶۵۵c(index);
            int i = record.f۱۲۳۱۸a;
            if ((i & 3) == 3) {
                callback.m۱۵۵۵۰a(viewHolder);
            } else if ((i & 1) != 0) {
                RecyclerView.AbstractCl.Cc cVar = record.f۱۲۳۱۹b;
                if (cVar == null) {
                    callback.m۱۵۵۵۰a(viewHolder);
                } else {
                    callback.m۱۵۵۵۳c(viewHolder, cVar, record.f۱۲۳۲۰c);
                }
            } else if ((i & 14) == 14) {
                callback.m۱۵۵۵۱a(viewHolder, record.f۱۲۳۱۹b, record.f۱۲۳۲۰c);
            } else if ((i & 12) == 12) {
                callback.m۱۵۵۵۲b(viewHolder, record.f۱۲۳۱۹b, record.f۱۲۳۲۰c);
            } else if ((i & 4) != 0) {
                callback.m۱۵۵۵۳c(viewHolder, record.f۱۲۳۱۹b, null);
            } else if ((i & 8) != 0) {
                callback.m۱۵۵۵۱a(viewHolder, record.f۱۲۳۱۹b, record.f۱۲۳۲۰c);
            }
            Ca.m۱۵۵۴۸a(record);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h  reason: contains not printable characters */
    public void m۱۵۵۴۶h(RecyclerView.AbstractCd0 holder) {
        int i = this.f۱۲۳۱۶b.m۱۰۵۹۹b() - 1;
        while (true) {
            if (i < 0) {
                break;
            } else if (holder == this.f۱۲۳۱۶b.m۱۰۶۰۴c(i)) {
                this.f۱۲۳۱۶b.m۱۰۶۰۲b(i);
                break;
            } else {
                i--;
            }
        }
        Ca info2 = this.f۱۲۳۱۵a.remove(holder);
        if (info2 != null) {
            Ca.m۱۵۵۴۸a(info2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۵۳۷b() {
        Ca.m۱۵۵۴۷a();
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۵۵۴۲d(RecyclerView.AbstractCd0 viewHolder) {
        m۱۵۵۴۵g(viewHolder);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.q1$a  reason: invalid class name */
    public static class Ca {

        /* renamed from: d  reason: contains not printable characters */
        static AbstractCj<Ca> f۱۲۳۱۷d = new Ck(20);

        /* renamed from: a  reason: contains not printable characters */
        int f۱۲۳۱۸a;

        /* renamed from: b  reason: contains not printable characters */
        RecyclerView.AbstractCl.Cc f۱۲۳۱۹b;

        /* renamed from: c  reason: contains not printable characters */
        RecyclerView.AbstractCl.Cc f۱۲۳۲۰c;

        private Ca() {
        }

        /* renamed from: b  reason: contains not printable characters */
        static Ca m۱۵۵۴۹b() {
            Ca record = f۱۲۳۱۷d.m۱۰۶۳۴a();
            return record == null ? new Ca() : record;
        }

        /* renamed from: a  reason: contains not printable characters */
        static void m۱۵۵۴۸a(Ca record) {
            record.f۱۲۳۱۸a = 0;
            record.f۱۲۳۱۹b = null;
            record.f۱۲۳۲۰c = null;
            f۱۲۳۱۷d.m۱۰۶۳۵a(record);
        }

        /* renamed from: a  reason: contains not printable characters */
        static void m۱۵۵۴۷a() {
            do {
            } while (f۱۲۳۱۷d.m۱۰۶۳۴a() != null);
        }
    }
}
