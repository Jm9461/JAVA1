package android.support.v7.widget;

import android.support.v7.widget.RecyclerView;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ca;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cf;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ck;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.InterfaceCj;

/* renamed from: android.support.v7.widget.q1, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cq1 {

    /* renamed from: a, reason: contains not printable characters */
    final Ca<RecyclerView.AbstractCd0, a> f۱۲۳۱۵a = new Ca<>();

    /* renamed from: b, reason: contains not printable characters */
    final Cf<RecyclerView.AbstractCd0> f۱۲۳۱۶b = new Cf<>();

    /* renamed from: android.support.v7.widget.q1$b */
    interface b {
        /* renamed from: a, reason: contains not printable characters */
        void mo۱۳۴۸۰a(RecyclerView.AbstractCd0 abstractCd0);

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۳۴۸۱a(RecyclerView.AbstractCd0 abstractCd0, RecyclerView.AbstractCl.c cVar, RecyclerView.AbstractCl.c cVar2);

        /* renamed from: b, reason: contains not printable characters */
        void mo۱۳۴۸۲b(RecyclerView.AbstractCd0 abstractCd0, RecyclerView.AbstractCl.c cVar, RecyclerView.AbstractCl.c cVar2);

        /* renamed from: c, reason: contains not printable characters */
        void mo۱۳۴۸۳c(RecyclerView.AbstractCd0 abstractCd0, RecyclerView.AbstractCl.c cVar, RecyclerView.AbstractCl.c cVar2);
    }

    Cq1() {
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۴۶۲a() {
        this.f۱۲۳۱۵a.clear();
        this.f۱۲۳۱۶b.m۸۵۲۵a();
    }

    /* renamed from: c, reason: contains not printable characters */
    void m۱۳۴۷۰c(RecyclerView.AbstractCd0 holder, RecyclerView.AbstractCl.c info2) {
        a record = this.f۱۲۳۱۵a.get(holder);
        if (record == null) {
            record = a.m۱۳۴۷۹b();
            this.f۱۲۳۱۵a.put(holder, record);
        }
        record.f۱۲۳۱۹b = info2;
        record.f۱۲۳۱۸a |= 4;
    }

    /* renamed from: b, reason: contains not printable characters */
    boolean m۱۳۴۶۹b(RecyclerView.AbstractCd0 holder) {
        a record = this.f۱۲۳۱۵a.get(holder);
        return (record == null || (record.f۱۲۳۱۸a & 1) == 0) ? false : true;
    }

    /* renamed from: f, reason: contains not printable characters */
    RecyclerView.AbstractCl.c m۱۳۴۷۴f(RecyclerView.AbstractCd0 vh) {
        return m۱۳۴۶۰a(vh, 4);
    }

    /* renamed from: e, reason: contains not printable characters */
    RecyclerView.AbstractCl.c m۱۳۴۷۳e(RecyclerView.AbstractCd0 vh) {
        return m۱۳۴۶۰a(vh, 8);
    }

    /* renamed from: a, reason: contains not printable characters */
    private RecyclerView.AbstractCl.c m۱۳۴۶۰a(RecyclerView.AbstractCd0 vh, int flag) {
        a record;
        RecyclerView.AbstractCl.c info2;
        int index = this.f۱۲۳۱۵a.m۸۵۷۸a(vh);
        if (index >= 0 && (record = this.f۱۲۳۱۵a.m۸۵۸۶d(index)) != null) {
            int i = record.f۱۲۳۱۸a;
            if ((i & flag) != 0) {
                record.f۱۲۳۱۸a = (flag ^ (-1)) & i;
                if (flag == 4) {
                    info2 = record.f۱۲۳۱۹b;
                } else if (flag == 8) {
                    info2 = record.f۱۲۳۲۰c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((record.f۱۲۳۱۸a & 12) == 0) {
                    this.f۱۲۳۱۵a.m۸۵۸۵c(index);
                    a.m۱۳۴۷۸a(record);
                }
                return info2;
            }
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۴۶۳a(long key, RecyclerView.AbstractCd0 holder) {
        this.f۱۲۳۱۶b.m۸۵۳۴c(key, holder);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۴۶۵a(RecyclerView.AbstractCd0 holder, RecyclerView.AbstractCl.c info2) {
        a record = this.f۱۲۳۱۵a.get(holder);
        if (record == null) {
            record = a.m۱۳۴۷۹b();
            this.f۱۲۳۱۵a.put(holder, record);
        }
        record.f۱۲۳۱۸a |= 2;
        record.f۱۲۳۱۹b = info2;
    }

    /* renamed from: c, reason: contains not printable characters */
    boolean m۱۳۴۷۱c(RecyclerView.AbstractCd0 viewHolder) {
        a record = this.f۱۲۳۱۵a.get(viewHolder);
        return (record == null || (record.f۱۲۳۱۸a & 4) == 0) ? false : true;
    }

    /* renamed from: a, reason: contains not printable characters */
    RecyclerView.AbstractCd0 m۱۳۴۶۱a(long key) {
        return this.f۱۲۳۱۶b.m۸۵۲۹b(key);
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۳۴۶۸b(RecyclerView.AbstractCd0 holder, RecyclerView.AbstractCl.c info2) {
        a record = this.f۱۲۳۱۵a.get(holder);
        if (record == null) {
            record = a.m۱۳۴۷۹b();
            this.f۱۲۳۱۵a.put(holder, record);
        }
        record.f۱۲۳۲۰c = info2;
        record.f۱۲۳۱۸a |= 8;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۴۶۴a(RecyclerView.AbstractCd0 holder) {
        a record = this.f۱۲۳۱۵a.get(holder);
        if (record == null) {
            record = a.m۱۳۴۷۹b();
            this.f۱۲۳۱۵a.put(holder, record);
        }
        record.f۱۲۳۱۸a |= 1;
    }

    /* renamed from: g, reason: contains not printable characters */
    void m۱۳۴۷۵g(RecyclerView.AbstractCd0 holder) {
        a record = this.f۱۲۳۱۵a.get(holder);
        if (record == null) {
            return;
        }
        record.f۱۲۳۱۸a &= -2;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۴۶۶a(b callback) {
        for (int index = this.f۱۲۳۱۵a.size() - 1; index >= 0; index--) {
            RecyclerView.AbstractCd0 viewHolder = this.f۱۲۳۱۵a.m۸۵۸۴b(index);
            a record = this.f۱۲۳۱۵a.m۸۵۸۵c(index);
            int i = record.f۱۲۳۱۸a;
            if ((i & 3) == 3) {
                callback.mo۱۳۴۸۰a(viewHolder);
            } else if ((i & 1) != 0) {
                RecyclerView.AbstractCl.c cVar = record.f۱۲۳۱۹b;
                if (cVar == null) {
                    callback.mo۱۳۴۸۰a(viewHolder);
                } else {
                    callback.mo۱۳۴۸۳c(viewHolder, cVar, record.f۱۲۳۲۰c);
                }
            } else if ((i & 14) == 14) {
                callback.mo۱۳۴۸۱a(viewHolder, record.f۱۲۳۱۹b, record.f۱۲۳۲۰c);
            } else if ((i & 12) == 12) {
                callback.mo۱۳۴۸۲b(viewHolder, record.f۱۲۳۱۹b, record.f۱۲۳۲۰c);
            } else if ((i & 4) != 0) {
                callback.mo۱۳۴۸۳c(viewHolder, record.f۱۲۳۱۹b, null);
            } else if ((i & 8) != 0) {
                callback.mo۱۳۴۸۱a(viewHolder, record.f۱۲۳۱۹b, record.f۱۲۳۲۰c);
            }
            a.m۱۳۴۷۸a(record);
        }
    }

    /* renamed from: h, reason: contains not printable characters */
    void m۱۳۴۷۶h(RecyclerView.AbstractCd0 holder) {
        int i = this.f۱۲۳۱۶b.m۸۵۲۸b() - 1;
        while (true) {
            if (i < 0) {
                break;
            }
            if (holder != this.f۱۲۳۱۶b.m۸۵۳۳c(i)) {
                i--;
            } else {
                this.f۱۲۳۱۶b.m۸۵۳۱b(i);
                break;
            }
        }
        a info2 = this.f۱۲۳۱۵a.remove(holder);
        if (info2 != null) {
            a.m۱۳۴۷۸a(info2);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۳۴۶۷b() {
        a.m۱۳۴۷۷a();
    }

    /* renamed from: d, reason: contains not printable characters */
    public void m۱۳۴۷۲d(RecyclerView.AbstractCd0 viewHolder) {
        m۱۳۴۷۵g(viewHolder);
    }

    /* renamed from: android.support.v7.widget.q1$a */
    static class a {

        /* renamed from: d, reason: contains not printable characters */
        static InterfaceCj<a> f۱۲۳۱۷d = new Ck(20);

        /* renamed from: a, reason: contains not printable characters */
        int f۱۲۳۱۸a;

        /* renamed from: b, reason: contains not printable characters */
        RecyclerView.AbstractCl.c f۱۲۳۱۹b;

        /* renamed from: c, reason: contains not printable characters */
        RecyclerView.AbstractCl.c f۱۲۳۲۰c;

        private a() {
        }

        /* renamed from: b, reason: contains not printable characters */
        static a m۱۳۴۷۹b() {
            a record = f۱۲۳۱۷d.mo۸۵۶۹a();
            return record == null ? new a() : record;
        }

        /* renamed from: a, reason: contains not printable characters */
        static void m۱۳۴۷۸a(a record) {
            record.f۱۲۳۱۸a = 0;
            record.f۱۲۳۱۹b = null;
            record.f۱۲۳۲۰c = null;
            f۱۲۳۱۷d.mo۸۵۷۰a(record);
        }

        /* renamed from: a, reason: contains not printable characters */
        static void m۱۳۴۷۷a() {
            while (f۱۲۳۱۷d.mo۸۵۶۹a() != null) {
            }
        }
    }
}
