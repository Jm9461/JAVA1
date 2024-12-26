package android.support.v7.widget;

import android.support.v7.widget.Cs0;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ck;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.InterfaceCj;

/* renamed from: android.support.v7.widget.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cd implements Cs0.a {

    /* renamed from: a, reason: contains not printable characters */
    private InterfaceCj<b> f۱۱۹۶۴a;

    /* renamed from: b, reason: contains not printable characters */
    final ArrayList<b> f۱۱۹۶۵b;

    /* renamed from: c, reason: contains not printable characters */
    final ArrayList<b> f۱۱۹۶۶c;

    /* renamed from: d, reason: contains not printable characters */
    final a f۱۱۹۶۷d;

    /* renamed from: e, reason: contains not printable characters */
    Runnable f۱۱۹۶۸e;

    /* renamed from: f, reason: contains not printable characters */
    final boolean f۱۱۹۶۹f;

    /* renamed from: g, reason: contains not printable characters */
    final Cs0 f۱۱۹۷۰g;

    /* renamed from: h, reason: contains not printable characters */
    private int f۱۱۹۷۱h;

    /* renamed from: android.support.v7.widget.d$a */
    interface a {
        /* renamed from: a, reason: contains not printable characters */
        RecyclerView.AbstractCd0 mo۱۳۰۴۰a(int i);

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۳۰۴۱a(int i, int i2);

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۳۰۴۲a(int i, int i2, Object obj);

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۳۰۴۳a(b bVar);

        /* renamed from: b, reason: contains not printable characters */
        void mo۱۳۰۴۴b(int i, int i2);

        /* renamed from: b, reason: contains not printable characters */
        void mo۱۳۰۴۵b(b bVar);

        /* renamed from: c, reason: contains not printable characters */
        void mo۱۳۰۴۶c(int i, int i2);

        /* renamed from: d, reason: contains not printable characters */
        void mo۱۳۰۴۷d(int i, int i2);
    }

    Cd(a callback) {
        this(callback, false);
    }

    Cd(a callback, boolean disableRecycler) {
        this.f۱۱۹۶۴a = new Ck(30);
        this.f۱۱۹۶۵b = new ArrayList<>();
        this.f۱۱۹۶۶c = new ArrayList<>();
        this.f۱۱۹۷۱h = 0;
        this.f۱۱۹۶۷d = callback;
        this.f۱۱۹۶۹f = disableRecycler;
        this.f۱۱۹۷۰g = new Cs0(this);
    }

    /* renamed from: f, reason: contains not printable characters */
    void m۱۳۰۳۹f() {
        m۱۳۰۳۱a(this.f۱۱۹۶۵b);
        m۱۳۰۳۱a(this.f۱۱۹۶۶c);
        this.f۱۱۹۷۱h = 0;
    }

    /* renamed from: e, reason: contains not printable characters */
    void m۱۳۰۳۸e() {
        this.f۱۱۹۷۰g.m۱۳۵۰۲a(this.f۱۱۹۶۵b);
        int count = this.f۱۱۹۶۵b.size();
        for (int i = 0; i < count; i++) {
            b op = this.f۱۱۹۶۵b.get(i);
            int i2 = op.f۱۱۹۷۲a;
            if (i2 == 1) {
                m۱۳۰۱۸b(op);
            } else if (i2 == 2) {
                m۱۳۰۲۰d(op);
            } else if (i2 == 4) {
                m۱۳۰۲۲e(op);
            } else if (i2 == 8) {
                m۱۳۰۱۹c(op);
            }
            Runnable runnable = this.f۱۱۹۶۸e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f۱۱۹۶۵b.clear();
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۰۲۸a() {
        int count = this.f۱۱۹۶۶c.size();
        for (int i = 0; i < count; i++) {
            this.f۱۱۹۶۷d.mo۱۳۰۴۵b(this.f۱۱۹۶۶c.get(i));
        }
        m۱۳۰۳۱a(this.f۱۱۹۶۶c);
        this.f۱۱۹۷۱h = 0;
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۱۳۰۱۹c(b op) {
        m۱۳۰۲۴g(op);
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۱۳۰۲۰d(b op) {
        int tmpStart = op.f۱۱۹۷۳b;
        int tmpCount = 0;
        int tmpEnd = op.f۱۱۹۷۳b + op.f۱۱۹۷۵d;
        int type = -1;
        int position = op.f۱۱۹۷۳b;
        while (position < tmpEnd) {
            boolean typeChanged = false;
            RecyclerView.AbstractCd0 vh = this.f۱۱۹۶۷d.mo۱۳۰۴۰a(position);
            if (vh != null || m۱۳۰۲۱d(position)) {
                if (type == 0) {
                    b newOp = mo۱۳۵۰۵a(2, tmpStart, tmpCount, null);
                    m۱۳۰۲۳f(newOp);
                    typeChanged = true;
                }
                type = 1;
            } else {
                if (type == 1) {
                    b newOp2 = mo۱۳۵۰۵a(2, tmpStart, tmpCount, null);
                    m۱۳۰۲۴g(newOp2);
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
        int position2 = op.f۱۱۹۷۵d;
        if (tmpCount != position2) {
            mo۱۳۵۰۶a(op);
            op = mo۱۳۵۰۵a(2, tmpStart, tmpCount, null);
        }
        if (type == 0) {
            m۱۳۰۲۳f(op);
        } else {
            m۱۳۰۲۴g(op);
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    private void m۱۳۰۲۲e(b op) {
        int tmpStart = op.f۱۱۹۷۳b;
        int tmpCount = 0;
        int tmpEnd = op.f۱۱۹۷۳b + op.f۱۱۹۷۵d;
        int type = -1;
        for (int position = op.f۱۱۹۷۳b; position < tmpEnd; position++) {
            RecyclerView.AbstractCd0 vh = this.f۱۱۹۶۷d.mo۱۳۰۴۰a(position);
            if (vh != null || m۱۳۰۲۱d(position)) {
                if (type == 0) {
                    b newOp = mo۱۳۵۰۵a(4, tmpStart, tmpCount, op.f۱۱۹۷۴c);
                    m۱۳۰۲۳f(newOp);
                    tmpCount = 0;
                    tmpStart = position;
                }
                type = 1;
            } else {
                if (type == 1) {
                    b newOp2 = mo۱۳۵۰۵a(4, tmpStart, tmpCount, op.f۱۱۹۷۴c);
                    m۱۳۰۲۴g(newOp2);
                    tmpCount = 0;
                    tmpStart = position;
                }
                type = 0;
            }
            tmpCount++;
        }
        int position2 = op.f۱۱۹۷۵d;
        if (tmpCount != position2) {
            Object payload = op.f۱۱۹۷۴c;
            mo۱۳۵۰۶a(op);
            op = mo۱۳۵۰۵a(4, tmpStart, tmpCount, payload);
        }
        if (type == 0) {
            m۱۳۰۲۳f(op);
        } else {
            m۱۳۰۲۴g(op);
        }
    }

    /* renamed from: f, reason: contains not printable characters */
    private void m۱۳۰۲۳f(b op) {
        int positionMultiplier;
        int i = op.f۱۱۹۷۲a;
        if (i == 1 || i == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int tmpStart = m۱۳۰۱۷b(op.f۱۱۹۷۳b, i);
        int tmpCnt = 1;
        int offsetPositionForPartial = op.f۱۱۹۷۳b;
        int i2 = op.f۱۱۹۷۲a;
        if (i2 == 2) {
            positionMultiplier = 0;
        } else if (i2 == 4) {
            positionMultiplier = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + op);
        }
        for (int p = 1; p < op.f۱۱۹۷۵d; p++) {
            int pos = op.f۱۱۹۷۳b + (positionMultiplier * p);
            int updatedPos = m۱۳۰۱۷b(pos, op.f۱۱۹۷۲a);
            boolean continuous = false;
            int i3 = op.f۱۱۹۷۲a;
            if (i3 == 2) {
                continuous = updatedPos == tmpStart;
            } else if (i3 == 4) {
                continuous = updatedPos == tmpStart + 1;
            }
            if (continuous) {
                tmpCnt++;
            } else {
                b tmp = mo۱۳۵۰۵a(op.f۱۱۹۷۲a, tmpStart, tmpCnt, op.f۱۱۹۷۴c);
                m۱۳۰۳۰a(tmp, offsetPositionForPartial);
                mo۱۳۵۰۶a(tmp);
                if (op.f۱۱۹۷۲a == 4) {
                    offsetPositionForPartial += tmpCnt;
                }
                tmpStart = updatedPos;
                tmpCnt = 1;
            }
        }
        Object payload = op.f۱۱۹۷۴c;
        mo۱۳۵۰۶a(op);
        if (tmpCnt > 0) {
            b tmp2 = mo۱۳۵۰۵a(op.f۱۱۹۷۲a, tmpStart, tmpCnt, payload);
            m۱۳۰۳۰a(tmp2, offsetPositionForPartial);
            mo۱۳۵۰۶a(tmp2);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۰۳۰a(b op, int offsetStart) {
        this.f۱۱۹۶۷d.mo۱۳۰۴۳a(op);
        int i = op.f۱۱۹۷۲a;
        if (i == 2) {
            this.f۱۱۹۶۷d.mo۱۳۰۴۴b(offsetStart, op.f۱۱۹۷۵d);
        } else {
            if (i == 4) {
                this.f۱۱۹۶۷d.mo۱۳۰۴۲a(offsetStart, op.f۱۱۹۷۵d, op.f۱۱۹۷۴c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private int m۱۳۰۱۷b(int pos, int cmd) {
        int start;
        int end;
        int count = this.f۱۱۹۶۶c.size();
        for (int i = count - 1; i >= 0; i--) {
            b postponed = this.f۱۱۹۶۶c.get(i);
            int i2 = postponed.f۱۱۹۷۲a;
            if (i2 == 8) {
                if (postponed.f۱۱۹۷۳b < postponed.f۱۱۹۷۵d) {
                    start = postponed.f۱۱۹۷۳b;
                    end = postponed.f۱۱۹۷۵d;
                } else {
                    start = postponed.f۱۱۹۷۵d;
                    end = postponed.f۱۱۹۷۳b;
                }
                if (pos >= start && pos <= end) {
                    int i3 = postponed.f۱۱۹۷۳b;
                    if (start == i3) {
                        if (cmd == 1) {
                            postponed.f۱۱۹۷۵d++;
                        } else if (cmd == 2) {
                            postponed.f۱۱۹۷۵d--;
                        }
                        pos++;
                    } else {
                        if (cmd == 1) {
                            postponed.f۱۱۹۷۳b = i3 + 1;
                        } else if (cmd == 2) {
                            postponed.f۱۱۹۷۳b = i3 - 1;
                        }
                        pos--;
                    }
                } else {
                    int i4 = postponed.f۱۱۹۷۳b;
                    if (pos < i4) {
                        if (cmd == 1) {
                            postponed.f۱۱۹۷۳b = i4 + 1;
                            postponed.f۱۱۹۷۵d++;
                        } else if (cmd == 2) {
                            postponed.f۱۱۹۷۳b = i4 - 1;
                            postponed.f۱۱۹۷۵d--;
                        }
                    }
                }
            } else {
                int i5 = postponed.f۱۱۹۷۳b;
                if (i5 <= pos) {
                    if (i2 == 1) {
                        pos -= postponed.f۱۱۹۷۵d;
                    } else if (i2 == 2) {
                        pos += postponed.f۱۱۹۷۵d;
                    }
                } else if (cmd == 1) {
                    postponed.f۱۱۹۷۳b = i5 + 1;
                } else if (cmd == 2) {
                    postponed.f۱۱۹۷۳b = i5 - 1;
                }
            }
        }
        for (int i6 = this.f۱۱۹۶۶c.size() - 1; i6 >= 0; i6--) {
            b op = this.f۱۱۹۶۶c.get(i6);
            if (op.f۱۱۹۷۲a == 8) {
                int i7 = op.f۱۱۹۷۵d;
                if (i7 == op.f۱۱۹۷۳b || i7 < 0) {
                    this.f۱۱۹۶۶c.remove(i6);
                    mo۱۳۵۰۶a(op);
                }
            } else if (op.f۱۱۹۷۵d <= 0) {
                this.f۱۱۹۶۶c.remove(i6);
                mo۱۳۵۰۶a(op);
            }
        }
        return pos;
    }

    /* renamed from: d, reason: contains not printable characters */
    private boolean m۱۳۰۲۱d(int position) {
        int count = this.f۱۱۹۶۶c.size();
        for (int i = 0; i < count; i++) {
            b op = this.f۱۱۹۶۶c.get(i);
            int i2 = op.f۱۱۹۷۲a;
            if (i2 == 8) {
                if (m۱۳۰۲۶a(op.f۱۱۹۷۵d, i + 1) == position) {
                    return true;
                }
            } else if (i2 == 1) {
                int end = op.f۱۱۹۷۳b + op.f۱۱۹۷۵d;
                for (int pos = op.f۱۱۹۷۳b; pos < end; pos++) {
                    if (m۱۳۰۲۶a(pos, i + 1) == position) {
                        return true;
                    }
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۳۰۱۸b(b op) {
        m۱۳۰۲۴g(op);
    }

    /* renamed from: g, reason: contains not printable characters */
    private void m۱۳۰۲۴g(b op) {
        this.f۱۱۹۶۶c.add(op);
        int i = op.f۱۱۹۷۲a;
        if (i == 1) {
            this.f۱۱۹۶۷d.mo۱۳۰۴۷d(op.f۱۱۹۷۳b, op.f۱۱۹۷۵d);
            return;
        }
        if (i == 2) {
            this.f۱۱۹۶۷d.mo۱۳۰۴۶c(op.f۱۱۹۷۳b, op.f۱۱۹۷۵d);
            return;
        }
        if (i == 4) {
            this.f۱۱۹۶۷d.mo۱۳۰۴۲a(op.f۱۱۹۷۳b, op.f۱۱۹۷۵d, op.f۱۱۹۷۴c);
        } else {
            if (i == 8) {
                this.f۱۱۹۶۷d.mo۱۳۰۴۱a(op.f۱۱۹۷۳b, op.f۱۱۹۷۵d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + op);
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    boolean m۱۳۰۳۵c() {
        return this.f۱۱۹۶۵b.size() > 0;
    }

    /* renamed from: c, reason: contains not printable characters */
    boolean m۱۳۰۳۶c(int updateTypes) {
        return (this.f۱۱۹۷۱h & updateTypes) != 0;
    }

    /* renamed from: b, reason: contains not printable characters */
    int m۱۳۰۳۳b(int position) {
        return m۱۳۰۲۶a(position, 0);
    }

    /* renamed from: a, reason: contains not printable characters */
    int m۱۳۰۲۶a(int position, int firstPostponedItem) {
        int count = this.f۱۱۹۶۶c.size();
        for (int i = firstPostponedItem; i < count; i++) {
            b op = this.f۱۱۹۶۶c.get(i);
            int i2 = op.f۱۱۹۷۲a;
            if (i2 == 8) {
                int i3 = op.f۱۱۹۷۳b;
                if (i3 == position) {
                    position = op.f۱۱۹۷۵d;
                } else {
                    if (i3 < position) {
                        position--;
                    }
                    if (op.f۱۱۹۷۵d <= position) {
                        position++;
                    }
                }
            } else {
                int i4 = op.f۱۱۹۷۳b;
                if (i4 > position) {
                    continue;
                } else if (i2 == 2) {
                    int i5 = op.f۱۱۹۷۵d;
                    if (position < i4 + i5) {
                        return -1;
                    }
                    position -= i5;
                } else if (i2 == 1) {
                    position += op.f۱۱۹۷۵d;
                }
            }
        }
        return position;
    }

    /* renamed from: a, reason: contains not printable characters */
    boolean m۱۳۰۳۲a(int positionStart, int itemCount, Object payload) {
        if (itemCount < 1) {
            return false;
        }
        this.f۱۱۹۶۵b.add(mo۱۳۵۰۵a(4, positionStart, itemCount, payload));
        this.f۱۱۹۷۱h |= 4;
        return this.f۱۱۹۶۵b.size() == 1;
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۳۰۳۴b() {
        m۱۳۰۲۸a();
        int count = this.f۱۱۹۶۵b.size();
        for (int i = 0; i < count; i++) {
            b op = this.f۱۱۹۶۵b.get(i);
            int i2 = op.f۱۱۹۷۲a;
            if (i2 == 1) {
                this.f۱۱۹۶۷d.mo۱۳۰۴۵b(op);
                this.f۱۱۹۶۷d.mo۱۳۰۴۷d(op.f۱۱۹۷۳b, op.f۱۱۹۷۵d);
            } else if (i2 == 2) {
                this.f۱۱۹۶۷d.mo۱۳۰۴۵b(op);
                this.f۱۱۹۶۷d.mo۱۳۰۴۴b(op.f۱۱۹۷۳b, op.f۱۱۹۷۵d);
            } else if (i2 == 4) {
                this.f۱۱۹۶۷d.mo۱۳۰۴۵b(op);
                this.f۱۱۹۶۷d.mo۱۳۰۴۲a(op.f۱۱۹۷۳b, op.f۱۱۹۷۵d, op.f۱۱۹۷۴c);
            } else if (i2 == 8) {
                this.f۱۱۹۶۷d.mo۱۳۰۴۵b(op);
                this.f۱۱۹۶۷d.mo۱۳۰۴۱a(op.f۱۱۹۷۳b, op.f۱۱۹۷۵d);
            }
            Runnable runnable = this.f۱۱۹۶۸e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m۱۳۰۳۱a(this.f۱۱۹۶۵b);
        this.f۱۱۹۷۱h = 0;
    }

    /* renamed from: a, reason: contains not printable characters */
    public int m۱۳۰۲۵a(int position) {
        int size = this.f۱۱۹۶۵b.size();
        for (int i = 0; i < size; i++) {
            b op = this.f۱۱۹۶۵b.get(i);
            int i2 = op.f۱۱۹۷۲a;
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = op.f۱۱۹۷۳b;
                    if (i3 <= position) {
                        int i4 = op.f۱۱۹۷۵d;
                        int end = i3 + i4;
                        if (end > position) {
                            return -1;
                        }
                        position -= i4;
                    } else {
                        continue;
                    }
                } else if (i2 == 8) {
                    int i5 = op.f۱۱۹۷۳b;
                    if (i5 == position) {
                        position = op.f۱۱۹۷۵d;
                    } else {
                        if (i5 < position) {
                            position--;
                        }
                        if (op.f۱۱۹۷۵d <= position) {
                            position++;
                        }
                    }
                }
            } else if (op.f۱۱۹۷۳b <= position) {
                position += op.f۱۱۹۷۵d;
            }
        }
        return position;
    }

    /* renamed from: d, reason: contains not printable characters */
    boolean m۱۳۰۳۷d() {
        return (this.f۱۱۹۶۶c.isEmpty() || this.f۱۱۹۶۵b.isEmpty()) ? false : true;
    }

    /* renamed from: android.support.v7.widget.d$b */
    static class b {

        /* renamed from: a, reason: contains not printable characters */
        int f۱۱۹۷۲a;

        /* renamed from: b, reason: contains not printable characters */
        int f۱۱۹۷۳b;

        /* renamed from: c, reason: contains not printable characters */
        Object f۱۱۹۷۴c;

        /* renamed from: d, reason: contains not printable characters */
        int f۱۱۹۷۵d;

        b(int cmd, int positionStart, int itemCount, Object payload) {
            this.f۱۱۹۷۲a = cmd;
            this.f۱۱۹۷۳b = positionStart;
            this.f۱۱۹۷۵d = itemCount;
            this.f۱۱۹۷۴c = payload;
        }

        /* renamed from: a, reason: contains not printable characters */
        String m۱۳۰۴۸a() {
            int i = this.f۱۱۹۷۲a;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i == 4) {
                return "up";
            }
            if (i == 8) {
                return "mv";
            }
            return "??";
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m۱۳۰۴۸a() + ",s:" + this.f۱۱۹۷۳b + "c:" + this.f۱۱۹۷۵d + ",p:" + this.f۱۱۹۷۴c + "]";
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            b op = (b) o;
            int i = this.f۱۱۹۷۲a;
            if (i != op.f۱۱۹۷۲a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f۱۱۹۷۵d - this.f۱۱۹۷۳b) == 1 && this.f۱۱۹۷۵d == op.f۱۱۹۷۳b && this.f۱۱۹۷۳b == op.f۱۱۹۷۵d) {
                return true;
            }
            if (this.f۱۱۹۷۵d != op.f۱۱۹۷۵d || this.f۱۱۹۷۳b != op.f۱۱۹۷۳b) {
                return false;
            }
            Object obj = this.f۱۱۹۷۴c;
            if (obj != null) {
                if (!obj.equals(op.f۱۱۹۷۴c)) {
                    return false;
                }
            } else if (op.f۱۱۹۷۴c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int result = this.f۱۱۹۷۲a;
            return (((result * 31) + this.f۱۱۹۷۳b) * 31) + this.f۱۱۹۷۵d;
        }
    }

    @Override // android.support.v7.widget.Cs0.a
    /* renamed from: a, reason: contains not printable characters */
    public b mo۱۳۵۰۵a(int cmd, int positionStart, int itemCount, Object payload) {
        b op = this.f۱۱۹۶۴a.mo۸۵۶۹a();
        if (op == null) {
            return new b(cmd, positionStart, itemCount, payload);
        }
        op.f۱۱۹۷۲a = cmd;
        op.f۱۱۹۷۳b = positionStart;
        op.f۱۱۹۷۵d = itemCount;
        op.f۱۱۹۷۴c = payload;
        return op;
    }

    @Override // android.support.v7.widget.Cs0.a
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۵۰۶a(b op) {
        if (!this.f۱۱۹۶۹f) {
            op.f۱۱۹۷۴c = null;
            this.f۱۱۹۶۴a.mo۸۵۷۰a(op);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۰۳۱a(List<b> list) {
        int count = list.size();
        for (int i = 0; i < count; i++) {
            mo۱۳۵۰۶a(list.get(i));
        }
        list.clear();
    }
}
