package android.support.v7.widget;

import a.b.g.g.j;
import a.b.g.g.k;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.s0;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public class d implements s0.a {

    /* renamed from: a  reason: collision with root package name */
    private j<b> f۲۰۰۱a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f۲۰۰۲b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<b> f۲۰۰۳c;

    /* renamed from: d  reason: collision with root package name */
    final a f۲۰۰۴d;

    /* renamed from: e  reason: collision with root package name */
    Runnable f۲۰۰۵e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f۲۰۰۶f;

    /* renamed from: g  reason: collision with root package name */
    final s0 f۲۰۰۷g;

    /* renamed from: h  reason: collision with root package name */
    private int f۲۰۰۸h;

    /* access modifiers changed from: package-private */
    public interface a {
        RecyclerView.d0 a(int i);

        void a(int i, int i2);

        void a(int i, int i2, Object obj);

        void a(b bVar);

        void b(int i, int i2);

        void b(b bVar);

        void c(int i, int i2);

        void d(int i, int i2);
    }

    d(a callback) {
        this(callback, false);
    }

    d(a callback, boolean disableRecycler) {
        this.f۲۰۰۱a = new k(30);
        this.f۲۰۰۲b = new ArrayList<>();
        this.f۲۰۰۳c = new ArrayList<>();
        this.f۲۰۰۸h = 0;
        this.f۲۰۰۴d = callback;
        this.f۲۰۰۶f = disableRecycler;
        this.f۲۰۰۷g = new s0(this);
    }

    /* access modifiers changed from: package-private */
    public void f() {
        a(this.f۲۰۰۲b);
        a(this.f۲۰۰۳c);
        this.f۲۰۰۸h = 0;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f۲۰۰۷g.a(this.f۲۰۰۲b);
        int count = this.f۲۰۰۲b.size();
        for (int i = 0; i < count; i++) {
            b op = this.f۲۰۰۲b.get(i);
            int i2 = op.f۲۰۰۹a;
            if (i2 == 1) {
                b(op);
            } else if (i2 == 2) {
                d(op);
            } else if (i2 == 4) {
                e(op);
            } else if (i2 == 8) {
                c(op);
            }
            Runnable runnable = this.f۲۰۰۵e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f۲۰۰۲b.clear();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int count = this.f۲۰۰۳c.size();
        for (int i = 0; i < count; i++) {
            this.f۲۰۰۴d.b(this.f۲۰۰۳c.get(i));
        }
        a(this.f۲۰۰۳c);
        this.f۲۰۰۸h = 0;
    }

    private void c(b op) {
        g(op);
    }

    private void d(b op) {
        int tmpStart = op.f۲۰۱۰b;
        int tmpCount = 0;
        int tmpEnd = op.f۲۰۱۰b + op.f۲۰۱۲d;
        int type = -1;
        int position = op.f۲۰۱۰b;
        while (position < tmpEnd) {
            boolean typeChanged = false;
            if (this.f۲۰۰۴d.a(position) != null || d(position)) {
                if (type == 0) {
                    f(a(2, tmpStart, tmpCount, null));
                    typeChanged = true;
                }
                type = 1;
            } else {
                if (type == 1) {
                    g(a(2, tmpStart, tmpCount, null));
                    typeChanged = true;
                }
                type = 0;
            }
            if (typeChanged) {
                position -= tmpCount;
                tmpEnd -= tmpCount;
                tmpCount = 1;
            } else {
                tmpCount++;
            }
            position++;
        }
        if (tmpCount != op.f۲۰۱۲d) {
            a(op);
            op = a(2, tmpStart, tmpCount, null);
        }
        if (type == 0) {
            f(op);
        } else {
            g(op);
        }
    }

    private void e(b op) {
        int tmpStart = op.f۲۰۱۰b;
        int tmpCount = 0;
        int tmpEnd = op.f۲۰۱۰b + op.f۲۰۱۲d;
        int type = -1;
        for (int position = op.f۲۰۱۰b; position < tmpEnd; position++) {
            if (this.f۲۰۰۴d.a(position) != null || d(position)) {
                if (type == 0) {
                    f(a(4, tmpStart, tmpCount, op.f۲۰۱۱c));
                    tmpCount = 0;
                    tmpStart = position;
                }
                type = 1;
            } else {
                if (type == 1) {
                    g(a(4, tmpStart, tmpCount, op.f۲۰۱۱c));
                    tmpCount = 0;
                    tmpStart = position;
                }
                type = 0;
            }
            tmpCount++;
        }
        if (tmpCount != op.f۲۰۱۲d) {
            Object payload = op.f۲۰۱۱c;
            a(op);
            op = a(4, tmpStart, tmpCount, payload);
        }
        if (type == 0) {
            f(op);
        } else {
            g(op);
        }
    }

    private void f(b op) {
        int positionMultiplier;
        int i = op.f۲۰۰۹a;
        if (i == 1 || i == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int tmpStart = b(op.f۲۰۱۰b, i);
        int tmpCnt = 1;
        int offsetPositionForPartial = op.f۲۰۱۰b;
        int i2 = op.f۲۰۰۹a;
        if (i2 == 2) {
            positionMultiplier = 0;
        } else if (i2 == 4) {
            positionMultiplier = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + op);
        }
        for (int p = 1; p < op.f۲۰۱۲d; p++) {
            int updatedPos = b(op.f۲۰۱۰b + (positionMultiplier * p), op.f۲۰۰۹a);
            boolean continuous = false;
            int i3 = op.f۲۰۰۹a;
            boolean z = false;
            if (i3 == 2) {
                if (updatedPos == tmpStart) {
                    z = true;
                }
                continuous = z;
            } else if (i3 == 4) {
                if (updatedPos == tmpStart + 1) {
                    z = true;
                }
                continuous = z;
            }
            if (continuous) {
                tmpCnt++;
            } else {
                b tmp = a(op.f۲۰۰۹a, tmpStart, tmpCnt, op.f۲۰۱۱c);
                a(tmp, offsetPositionForPartial);
                a(tmp);
                if (op.f۲۰۰۹a == 4) {
                    offsetPositionForPartial += tmpCnt;
                }
                tmpStart = updatedPos;
                tmpCnt = 1;
            }
        }
        Object payload = op.f۲۰۱۱c;
        a(op);
        if (tmpCnt > 0) {
            b tmp2 = a(op.f۲۰۰۹a, tmpStart, tmpCnt, payload);
            a(tmp2, offsetPositionForPartial);
            a(tmp2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(b op, int offsetStart) {
        this.f۲۰۰۴d.a(op);
        int i = op.f۲۰۰۹a;
        if (i == 2) {
            this.f۲۰۰۴d.b(offsetStart, op.f۲۰۱۲d);
        } else if (i == 4) {
            this.f۲۰۰۴d.a(offsetStart, op.f۲۰۱۲d, op.f۲۰۱۱c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    private int b(int pos, int cmd) {
        int end;
        int start;
        for (int i = this.f۲۰۰۳c.size() - 1; i >= 0; i--) {
            b postponed = this.f۲۰۰۳c.get(i);
            int i2 = postponed.f۲۰۰۹a;
            if (i2 == 8) {
                if (postponed.f۲۰۱۰b < postponed.f۲۰۱۲d) {
                    start = postponed.f۲۰۱۰b;
                    end = postponed.f۲۰۱۲d;
                } else {
                    start = postponed.f۲۰۱۲d;
                    end = postponed.f۲۰۱۰b;
                }
                if (pos < start || pos > end) {
                    int i3 = postponed.f۲۰۱۰b;
                    if (pos < i3) {
                        if (cmd == 1) {
                            postponed.f۲۰۱۰b = i3 + 1;
                            postponed.f۲۰۱۲d++;
                        } else if (cmd == 2) {
                            postponed.f۲۰۱۰b = i3 - 1;
                            postponed.f۲۰۱۲d--;
                        }
                    }
                } else {
                    int i4 = postponed.f۲۰۱۰b;
                    if (start == i4) {
                        if (cmd == 1) {
                            postponed.f۲۰۱۲d++;
                        } else if (cmd == 2) {
                            postponed.f۲۰۱۲d--;
                        }
                        pos++;
                    } else {
                        if (cmd == 1) {
                            postponed.f۲۰۱۰b = i4 + 1;
                        } else if (cmd == 2) {
                            postponed.f۲۰۱۰b = i4 - 1;
                        }
                        pos--;
                    }
                }
            } else {
                int i5 = postponed.f۲۰۱۰b;
                if (i5 <= pos) {
                    if (i2 == 1) {
                        pos -= postponed.f۲۰۱۲d;
                    } else if (i2 == 2) {
                        pos += postponed.f۲۰۱۲d;
                    }
                } else if (cmd == 1) {
                    postponed.f۲۰۱۰b = i5 + 1;
                } else if (cmd == 2) {
                    postponed.f۲۰۱۰b = i5 - 1;
                }
            }
        }
        for (int i6 = this.f۲۰۰۳c.size() - 1; i6 >= 0; i6--) {
            b op = this.f۲۰۰۳c.get(i6);
            if (op.f۲۰۰۹a == 8) {
                int i7 = op.f۲۰۱۲d;
                if (i7 == op.f۲۰۱۰b || i7 < 0) {
                    this.f۲۰۰۳c.remove(i6);
                    a(op);
                }
            } else if (op.f۲۰۱۲d <= 0) {
                this.f۲۰۰۳c.remove(i6);
                a(op);
            }
        }
        return pos;
    }

    private boolean d(int position) {
        int count = this.f۲۰۰۳c.size();
        for (int i = 0; i < count; i++) {
            b op = this.f۲۰۰۳c.get(i);
            int i2 = op.f۲۰۰۹a;
            if (i2 == 8) {
                if (a(op.f۲۰۱۲d, i + 1) == position) {
                    return true;
                }
            } else if (i2 == 1) {
                int end = op.f۲۰۱۰b + op.f۲۰۱۲d;
                for (int pos = op.f۲۰۱۰b; pos < end; pos++) {
                    if (a(pos, i + 1) == position) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void b(b op) {
        g(op);
    }

    private void g(b op) {
        this.f۲۰۰۳c.add(op);
        int i = op.f۲۰۰۹a;
        if (i == 1) {
            this.f۲۰۰۴d.d(op.f۲۰۱۰b, op.f۲۰۱۲d);
        } else if (i == 2) {
            this.f۲۰۰۴d.c(op.f۲۰۱۰b, op.f۲۰۱۲d);
        } else if (i == 4) {
            this.f۲۰۰۴d.a(op.f۲۰۱۰b, op.f۲۰۱۲d, op.f۲۰۱۱c);
        } else if (i == 8) {
            this.f۲۰۰۴d.a(op.f۲۰۱۰b, op.f۲۰۱۲d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + op);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f۲۰۰۲b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean c(int updateTypes) {
        return (this.f۲۰۰۸h & updateTypes) != 0;
    }

    /* access modifiers changed from: package-private */
    public int b(int position) {
        return a(position, 0);
    }

    /* access modifiers changed from: package-private */
    public int a(int position, int firstPostponedItem) {
        int count = this.f۲۰۰۳c.size();
        for (int i = firstPostponedItem; i < count; i++) {
            b op = this.f۲۰۰۳c.get(i);
            int i2 = op.f۲۰۰۹a;
            if (i2 == 8) {
                int i3 = op.f۲۰۱۰b;
                if (i3 == position) {
                    position = op.f۲۰۱۲d;
                } else {
                    if (i3 < position) {
                        position--;
                    }
                    if (op.f۲۰۱۲d <= position) {
                        position++;
                    }
                }
            } else {
                int i4 = op.f۲۰۱۰b;
                if (i4 > position) {
                    continue;
                } else if (i2 == 2) {
                    int i5 = op.f۲۰۱۲d;
                    if (position < i4 + i5) {
                        return -1;
                    }
                    position -= i5;
                } else if (i2 == 1) {
                    position += op.f۲۰۱۲d;
                }
            }
        }
        return position;
    }

    /* access modifiers changed from: package-private */
    public boolean a(int positionStart, int itemCount, Object payload) {
        if (itemCount < 1) {
            return false;
        }
        this.f۲۰۰۲b.add(a(4, positionStart, itemCount, payload));
        this.f۲۰۰۸h |= 4;
        if (this.f۲۰۰۲b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        a();
        int count = this.f۲۰۰۲b.size();
        for (int i = 0; i < count; i++) {
            b op = this.f۲۰۰۲b.get(i);
            int i2 = op.f۲۰۰۹a;
            if (i2 == 1) {
                this.f۲۰۰۴d.b(op);
                this.f۲۰۰۴d.d(op.f۲۰۱۰b, op.f۲۰۱۲d);
            } else if (i2 == 2) {
                this.f۲۰۰۴d.b(op);
                this.f۲۰۰۴d.b(op.f۲۰۱۰b, op.f۲۰۱۲d);
            } else if (i2 == 4) {
                this.f۲۰۰۴d.b(op);
                this.f۲۰۰۴d.a(op.f۲۰۱۰b, op.f۲۰۱۲d, op.f۲۰۱۱c);
            } else if (i2 == 8) {
                this.f۲۰۰۴d.b(op);
                this.f۲۰۰۴d.a(op.f۲۰۱۰b, op.f۲۰۱۲d);
            }
            Runnable runnable = this.f۲۰۰۵e;
            if (runnable != null) {
                runnable.run();
            }
        }
        a(this.f۲۰۰۲b);
        this.f۲۰۰۸h = 0;
    }

    public int a(int position) {
        int size = this.f۲۰۰۲b.size();
        for (int i = 0; i < size; i++) {
            b op = this.f۲۰۰۲b.get(i);
            int i2 = op.f۲۰۰۹a;
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = op.f۲۰۱۰b;
                    if (i3 <= position) {
                        int i4 = op.f۲۰۱۲d;
                        if (i3 + i4 > position) {
                            return -1;
                        }
                        position -= i4;
                    } else {
                        continue;
                    }
                } else if (i2 == 8) {
                    int i5 = op.f۲۰۱۰b;
                    if (i5 == position) {
                        position = op.f۲۰۱۲d;
                    } else {
                        if (i5 < position) {
                            position--;
                        }
                        if (op.f۲۰۱۲d <= position) {
                            position++;
                        }
                    }
                }
            } else if (op.f۲۰۱۰b <= position) {
                position += op.f۲۰۱۲d;
            }
        }
        return position;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return !this.f۲۰۰۳c.isEmpty() && !this.f۲۰۰۲b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        int f۲۰۰۹a;

        /* renamed from: b  reason: collision with root package name */
        int f۲۰۱۰b;

        /* renamed from: c  reason: collision with root package name */
        Object f۲۰۱۱c;

        /* renamed from: d  reason: collision with root package name */
        int f۲۰۱۲d;

        b(int cmd, int positionStart, int itemCount, Object payload) {
            this.f۲۰۰۹a = cmd;
            this.f۲۰۱۰b = positionStart;
            this.f۲۰۱۲d = itemCount;
            this.f۲۰۱۱c = payload;
        }

        /* access modifiers changed from: package-private */
        public String a() {
            int i = this.f۲۰۰۹a;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i == 4) {
                return "up";
            }
            if (i != 8) {
                return "??";
            }
            return "mv";
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f۲۰۱۰b + "c:" + this.f۲۰۱۲d + ",p:" + this.f۲۰۱۱c + "]";
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            b op = (b) o;
            int i = this.f۲۰۰۹a;
            if (i != op.f۲۰۰۹a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f۲۰۱۲d - this.f۲۰۱۰b) == 1 && this.f۲۰۱۲d == op.f۲۰۱۰b && this.f۲۰۱۰b == op.f۲۰۱۲d) {
                return true;
            }
            if (this.f۲۰۱۲d != op.f۲۰۱۲d || this.f۲۰۱۰b != op.f۲۰۱۰b) {
                return false;
            }
            Object obj = this.f۲۰۱۱c;
            if (obj != null) {
                if (!obj.equals(op.f۲۰۱۱c)) {
                    return false;
                }
            } else if (op.f۲۰۱۱c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f۲۰۰۹a * 31) + this.f۲۰۱۰b) * 31) + this.f۲۰۱۲d;
        }
    }

    @Override // android.support.v7.widget.s0.a
    public b a(int cmd, int positionStart, int itemCount, Object payload) {
        b op = this.f۲۰۰۱a.a();
        if (op == null) {
            return new b(cmd, positionStart, itemCount, payload);
        }
        op.f۲۰۰۹a = cmd;
        op.f۲۰۱۰b = positionStart;
        op.f۲۰۱۲d = itemCount;
        op.f۲۰۱۱c = payload;
        return op;
    }

    @Override // android.support.v7.widget.s0.a
    public void a(b op) {
        if (!this.f۲۰۰۶f) {
            op.f۲۰۱۱c = null;
            this.f۲۰۰۱a.a(op);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(List<b> list) {
        int count = list.size();
        for (int i = 0; i < count; i++) {
            a(list.get(i));
        }
        list.clear();
    }
}
