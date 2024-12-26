package android.support.v7.widget;

import a.b.g.g.f;
import a.b.g.g.j;
import a.b.g.g.k;
import android.support.v7.widget.RecyclerView;

/* access modifiers changed from: package-private */
public class q1 {

    /* renamed from: a  reason: collision with root package name */
    final a.b.g.g.a<RecyclerView.d0, a> f۲۲۳۴a = new a.b.g.g.a<>();

    /* renamed from: b  reason: collision with root package name */
    final f<RecyclerView.d0> f۲۲۳۵b = new f<>();

    /* access modifiers changed from: package-private */
    public interface b {
        void a(RecyclerView.d0 d0Var);

        void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void b(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    q1() {
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f۲۲۳۴a.clear();
        this.f۲۲۳۵b.a();
    }

    /* access modifiers changed from: package-private */
    public void c(RecyclerView.d0 holder, RecyclerView.l.c info2) {
        a record = this.f۲۲۳۴a.get(holder);
        if (record == null) {
            record = a.b();
            this.f۲۲۳۴a.put(holder, record);
        }
        record.f۲۲۳۸b = info2;
        record.f۲۲۳۷a |= 4;
    }

    /* access modifiers changed from: package-private */
    public boolean b(RecyclerView.d0 holder) {
        a record = this.f۲۲۳۴a.get(holder);
        return (record == null || (record.f۲۲۳۷a & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.l.c f(RecyclerView.d0 vh) {
        return a(vh, 4);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.l.c e(RecyclerView.d0 vh) {
        return a(vh, 8);
    }

    private RecyclerView.l.c a(RecyclerView.d0 vh, int flag) {
        a record;
        RecyclerView.l.c info2;
        int index = this.f۲۲۳۴a.a(vh);
        if (index >= 0 && (record = this.f۲۲۳۴a.d(index)) != null) {
            int i = record.f۲۲۳۷a;
            if ((i & flag) != 0) {
                record.f۲۲۳۷a = (flag ^ -1) & i;
                if (flag == 4) {
                    info2 = record.f۲۲۳۸b;
                } else if (flag == 8) {
                    info2 = record.f۲۲۳۹c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((record.f۲۲۳۷a & 12) == 0) {
                    this.f۲۲۳۴a.c(index);
                    a.a(record);
                }
                return info2;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(long key, RecyclerView.d0 holder) {
        this.f۲۲۳۵b.c(key, holder);
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.d0 holder, RecyclerView.l.c info2) {
        a record = this.f۲۲۳۴a.get(holder);
        if (record == null) {
            record = a.b();
            this.f۲۲۳۴a.put(holder, record);
        }
        record.f۲۲۳۷a |= 2;
        record.f۲۲۳۸b = info2;
    }

    /* access modifiers changed from: package-private */
    public boolean c(RecyclerView.d0 viewHolder) {
        a record = this.f۲۲۳۴a.get(viewHolder);
        return (record == null || (record.f۲۲۳۷a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.d0 a(long key) {
        return this.f۲۲۳۵b.b(key);
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.d0 holder, RecyclerView.l.c info2) {
        a record = this.f۲۲۳۴a.get(holder);
        if (record == null) {
            record = a.b();
            this.f۲۲۳۴a.put(holder, record);
        }
        record.f۲۲۳۹c = info2;
        record.f۲۲۳۷a |= 8;
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.d0 holder) {
        a record = this.f۲۲۳۴a.get(holder);
        if (record == null) {
            record = a.b();
            this.f۲۲۳۴a.put(holder, record);
        }
        record.f۲۲۳۷a |= 1;
    }

    /* access modifiers changed from: package-private */
    public void g(RecyclerView.d0 holder) {
        a record = this.f۲۲۳۴a.get(holder);
        if (record != null) {
            record.f۲۲۳۷a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(b callback) {
        for (int index = this.f۲۲۳۴a.size() - 1; index >= 0; index--) {
            RecyclerView.d0 viewHolder = this.f۲۲۳۴a.b(index);
            a record = this.f۲۲۳۴a.c(index);
            int i = record.f۲۲۳۷a;
            if ((i & 3) == 3) {
                callback.a(viewHolder);
            } else if ((i & 1) != 0) {
                RecyclerView.l.c cVar = record.f۲۲۳۸b;
                if (cVar == null) {
                    callback.a(viewHolder);
                } else {
                    callback.c(viewHolder, cVar, record.f۲۲۳۹c);
                }
            } else if ((i & 14) == 14) {
                callback.a(viewHolder, record.f۲۲۳۸b, record.f۲۲۳۹c);
            } else if ((i & 12) == 12) {
                callback.b(viewHolder, record.f۲۲۳۸b, record.f۲۲۳۹c);
            } else if ((i & 4) != 0) {
                callback.c(viewHolder, record.f۲۲۳۸b, null);
            } else if ((i & 8) != 0) {
                callback.a(viewHolder, record.f۲۲۳۸b, record.f۲۲۳۹c);
            }
            a.a(record);
        }
    }

    /* access modifiers changed from: package-private */
    public void h(RecyclerView.d0 holder) {
        int i = this.f۲۲۳۵b.b() - 1;
        while (true) {
            if (i < 0) {
                break;
            } else if (holder == this.f۲۲۳۵b.c(i)) {
                this.f۲۲۳۵b.b(i);
                break;
            } else {
                i--;
            }
        }
        a info2 = this.f۲۲۳۴a.remove(holder);
        if (info2 != null) {
            a.a(info2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        a.a();
    }

    public void d(RecyclerView.d0 viewHolder) {
        g(viewHolder);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        static j<a> f۲۲۳۶d = new k(20);

        /* renamed from: a  reason: collision with root package name */
        int f۲۲۳۷a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.l.c f۲۲۳۸b;

        /* renamed from: c  reason: collision with root package name */
        RecyclerView.l.c f۲۲۳۹c;

        private a() {
        }

        static a b() {
            a record = f۲۲۳۶d.a();
            return record == null ? new a() : record;
        }

        static void a(a record) {
            record.f۲۲۳۷a = 0;
            record.f۲۲۳۸b = null;
            record.f۲۲۳۹c = null;
            f۲۲۳۶d.a(record);
        }

        static void a() {
            do {
            } while (f۲۲۳۶d.a() != null);
        }
    }
}
