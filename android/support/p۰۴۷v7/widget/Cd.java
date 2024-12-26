package android.support.p۰۴۷v7.widget;

import android.support.p۰۴۷v7.widget.Cs0;
import android.support.p۰۴۷v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.AbstractCj;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ck;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.d  reason: invalid class name */
public class Cd implements Cs0.AbstractCa {

    /* renamed from: a  reason: contains not printable characters */
    private AbstractCj<Cb> f۱۱۹۶۴a;

    /* renamed from: b  reason: contains not printable characters */
    final ArrayList<Cb> f۱۱۹۶۵b;

    /* renamed from: c  reason: contains not printable characters */
    final ArrayList<Cb> f۱۱۹۶۶c;

    /* renamed from: d  reason: contains not printable characters */
    final AbstractCa f۱۱۹۶۷d;

    /* renamed from: e  reason: contains not printable characters */
    Runnable f۱۱۹۶۸e;

    /* renamed from: f  reason: contains not printable characters */
    final boolean f۱۱۹۶۹f;

    /* renamed from: g  reason: contains not printable characters */
    final Cs0 f۱۱۹۷۰g;

    /* renamed from: h  reason: contains not printable characters */
    private int f۱۱۹۷۱h;

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.d$a  reason: invalid class name */
    public interface AbstractCa {
        /* renamed from: a  reason: contains not printable characters */
        RecyclerView.AbstractCd0 m۱۵۱۱۰a(int i);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۵۱۱۱a(int i, int i2);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۵۱۱۲a(int i, int i2, Object obj);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۵۱۱۳a(Cb bVar);

        /* renamed from: b  reason: contains not printable characters */
        void m۱۵۱۱۴b(int i, int i2);

        /* renamed from: b  reason: contains not printable characters */
        void m۱۵۱۱۵b(Cb bVar);

        /* renamed from: c  reason: contains not printable characters */
        void m۱۵۱۱۶c(int i, int i2);

        /* renamed from: d  reason: contains not printable characters */
        void m۱۵۱۱۷d(int i, int i2);
    }

    Cd(AbstractCa callback) {
        this(callback, false);
    }

    Cd(AbstractCa callback, boolean disableRecycler) {
        this.f۱۱۹۶۴a = new Ck(30);
        this.f۱۱۹۶۵b = new ArrayList<>();
        this.f۱۱۹۶۶c = new ArrayList<>();
        this.f۱۱۹۷۱h = 0;
        this.f۱۱۹۶۷d = callback;
        this.f۱۱۹۶۹f = disableRecycler;
        this.f۱۱۹۷۰g = new Cs0(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public void m۱۵۱۰۹f() {
        m۱۵۱۰۱a(this.f۱۱۹۶۵b);
        m۱۵۱۰۱a(this.f۱۱۹۶۶c);
        this.f۱۱۹۷۱h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۵۱۰۸e() {
        this.f۱۱۹۷۰g.m۱۵۵۷۲a(this.f۱۱۹۶۵b);
        int count = this.f۱۱۹۶۵b.size();
        for (int i = 0; i < count; i++) {
            Cb op = this.f۱۱۹۶۵b.get(i);
            int i2 = op.f۱۱۹۷۲a;
            if (i2 == 1) {
                m۱۵۰۸۸b(op);
            } else if (i2 == 2) {
                m۱۵۰۹۰d(op);
            } else if (i2 == 4) {
                m۱۵۰۹۲e(op);
            } else if (i2 == 8) {
                m۱۵۰۸۹c(op);
            }
            Runnable runnable = this.f۱۱۹۶۸e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f۱۱۹۶۵b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۰۹۸a() {
        int count = this.f۱۱۹۶۶c.size();
        for (int i = 0; i < count; i++) {
            this.f۱۱۹۶۷d.m۱۵۱۱۵b(this.f۱۱۹۶۶c.get(i));
        }
        m۱۵۱۰۱a(this.f۱۱۹۶۶c);
        this.f۱۱۹۷۱h = 0;
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۵۰۸۹c(Cb op) {
        m۱۵۰۹۴g(op);
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۵۰۹۰d(Cb op) {
        int tmpStart = op.f۱۱۹۷۳b;
        int tmpCount = 0;
        int tmpEnd = op.f۱۱۹۷۳b + op.f۱۱۹۷۵d;
        int type = -1;
        int position = op.f۱۱۹۷۳b;
        while (position < tmpEnd) {
            boolean typeChanged = false;
            if (this.f۱۱۹۶۷d.m۱۵۱۱۰a(position) != null || m۱۵۰۹۱d(position)) {
                if (type == 0) {
                    m۱۵۰۹۳f(m۱۵۰۹۷a(2, tmpStart, tmpCount, null));
                    typeChanged = true;
                }
                type = 1;
            } else {
                if (type == 1) {
                    m۱۵۰۹۴g(m۱۵۰۹۷a(2, tmpStart, tmpCount, null));
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
        if (tmpCount != op.f۱۱۹۷۵d) {
            m۱۵۰۹۹a(op);
            op = m۱۵۰۹۷a(2, tmpStart, tmpCount, null);
        }
        if (type == 0) {
            m۱۵۰۹۳f(op);
        } else {
            m۱۵۰۹۴g(op);
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۵۰۹۲e(Cb op) {
        int tmpStart = op.f۱۱۹۷۳b;
        int tmpCount = 0;
        int tmpEnd = op.f۱۱۹۷۳b + op.f۱۱۹۷۵d;
        int type = -1;
        for (int position = op.f۱۱۹۷۳b; position < tmpEnd; position++) {
            if (this.f۱۱۹۶۷d.m۱۵۱۱۰a(position) != null || m۱۵۰۹۱d(position)) {
                if (type == 0) {
                    m۱۵۰۹۳f(m۱۵۰۹۷a(4, tmpStart, tmpCount, op.f۱۱۹۷۴c));
                    tmpCount = 0;
                    tmpStart = position;
                }
                type = 1;
            } else {
                if (type == 1) {
                    m۱۵۰۹۴g(m۱۵۰۹۷a(4, tmpStart, tmpCount, op.f۱۱۹۷۴c));
                    tmpCount = 0;
                    tmpStart = position;
                }
                type = 0;
            }
            tmpCount++;
        }
        if (tmpCount != op.f۱۱۹۷۵d) {
            Object payload = op.f۱۱۹۷۴c;
            m۱۵۰۹۹a(op);
            op = m۱۵۰۹۷a(4, tmpStart, tmpCount, payload);
        }
        if (type == 0) {
            m۱۵۰۹۳f(op);
        } else {
            m۱۵۰۹۴g(op);
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۵۰۹۳f(Cb op) {
        int positionMultiplier;
        int i = op.f۱۱۹۷۲a;
        if (i == 1 || i == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int tmpStart = m۱۵۰۸۷b(op.f۱۱۹۷۳b, i);
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
            int updatedPos = m۱۵۰۸۷b(op.f۱۱۹۷۳b + (positionMultiplier * p), op.f۱۱۹۷۲a);
            boolean continuous = false;
            int i3 = op.f۱۱۹۷۲a;
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
                Cb tmp = m۱۵۰۹۷a(op.f۱۱۹۷۲a, tmpStart, tmpCnt, op.f۱۱۹۷۴c);
                m۱۵۱۰۰a(tmp, offsetPositionForPartial);
                m۱۵۰۹۹a(tmp);
                if (op.f۱۱۹۷۲a == 4) {
                    offsetPositionForPartial += tmpCnt;
                }
                tmpStart = updatedPos;
                tmpCnt = 1;
            }
        }
        Object payload = op.f۱۱۹۷۴c;
        m۱۵۰۹۹a(op);
        if (tmpCnt > 0) {
            Cb tmp2 = m۱۵۰۹۷a(op.f۱۱۹۷۲a, tmpStart, tmpCnt, payload);
            m۱۵۱۰۰a(tmp2, offsetPositionForPartial);
            m۱۵۰۹۹a(tmp2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۱۰۰a(Cb op, int offsetStart) {
        this.f۱۱۹۶۷d.m۱۵۱۱۳a(op);
        int i = op.f۱۱۹۷۲a;
        if (i == 2) {
            this.f۱۱۹۶۷d.m۱۵۱۱۴b(offsetStart, op.f۱۱۹۷۵d);
        } else if (i == 4) {
            this.f۱۱۹۶۷d.m۱۵۱۱۲a(offsetStart, op.f۱۱۹۷۵d, op.f۱۱۹۷۴c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۵۰۸۷b(int pos, int cmd) {
        int end;
        int start;
        for (int i = this.f۱۱۹۶۶c.size() - 1; i >= 0; i--) {
            Cb postponed = this.f۱۱۹۶۶c.get(i);
            int i2 = postponed.f۱۱۹۷۲a;
            if (i2 == 8) {
                if (postponed.f۱۱۹۷۳b < postponed.f۱۱۹۷۵d) {
                    start = postponed.f۱۱۹۷۳b;
                    end = postponed.f۱۱۹۷۵d;
                } else {
                    start = postponed.f۱۱۹۷۵d;
                    end = postponed.f۱۱۹۷۳b;
                }
                if (pos < start || pos > end) {
                    int i3 = postponed.f۱۱۹۷۳b;
                    if (pos < i3) {
                        if (cmd == 1) {
                            postponed.f۱۱۹۷۳b = i3 + 1;
                            postponed.f۱۱۹۷۵d++;
                        } else if (cmd == 2) {
                            postponed.f۱۱۹۷۳b = i3 - 1;
                            postponed.f۱۱۹۷۵d--;
                        }
                    }
                } else {
                    int i4 = postponed.f۱۱۹۷۳b;
                    if (start == i4) {
                        if (cmd == 1) {
                            postponed.f۱۱۹۷۵d++;
                        } else if (cmd == 2) {
                            postponed.f۱۱۹۷۵d--;
                        }
                        pos++;
                    } else {
                        if (cmd == 1) {
                            postponed.f۱۱۹۷۳b = i4 + 1;
                        } else if (cmd == 2) {
                            postponed.f۱۱۹۷۳b = i4 - 1;
                        }
                        pos--;
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
            Cb op = this.f۱۱۹۶۶c.get(i6);
            if (op.f۱۱۹۷۲a == 8) {
                int i7 = op.f۱۱۹۷۵d;
                if (i7 == op.f۱۱۹۷۳b || i7 < 0) {
                    this.f۱۱۹۶۶c.remove(i6);
                    m۱۵۰۹۹a(op);
                }
            } else if (op.f۱۱۹۷۵d <= 0) {
                this.f۱۱۹۶۶c.remove(i6);
                m۱۵۰۹۹a(op);
            }
        }
        return pos;
    }

    /* renamed from: d  reason: contains not printable characters */
    private boolean m۱۵۰۹۱d(int position) {
        int count = this.f۱۱۹۶۶c.size();
        for (int i = 0; i < count; i++) {
            Cb op = this.f۱۱۹۶۶c.get(i);
            int i2 = op.f۱۱۹۷۲a;
            if (i2 == 8) {
                if (m۱۵۰۹۶a(op.f۱۱۹۷۵d, i + 1) == position) {
                    return true;
                }
            } else if (i2 == 1) {
                int end = op.f۱۱۹۷۳b + op.f۱۱۹۷۵d;
                for (int pos = op.f۱۱۹۷۳b; pos < end; pos++) {
                    if (m۱۵۰۹۶a(pos, i + 1) == position) {
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

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۵۰۸۸b(Cb op) {
        m۱۵۰۹۴g(op);
    }

    /* renamed from: g  reason: contains not printable characters */
    private void m۱۵۰۹۴g(Cb op) {
        this.f۱۱۹۶۶c.add(op);
        int i = op.f۱۱۹۷۲a;
        if (i == 1) {
            this.f۱۱۹۶۷d.m۱۵۱۱۷d(op.f۱۱۹۷۳b, op.f۱۱۹۷۵d);
        } else if (i == 2) {
            this.f۱۱۹۶۷d.m۱۵۱۱۶c(op.f۱۱۹۷۳b, op.f۱۱۹۷۵d);
        } else if (i == 4) {
            this.f۱۱۹۶۷d.m۱۵۱۱۲a(op.f۱۱۹۷۳b, op.f۱۱۹۷۵d, op.f۱۱۹۷۴c);
        } else if (i == 8) {
            this.f۱۱۹۶۷d.m۱۵۱۱۱a(op.f۱۱۹۷۳b, op.f۱۱۹۷۵d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + op);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۵۱۰۵c() {
        return this.f۱۱۹۶۵b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۵۱۰۶c(int updateTypes) {
        return (this.f۱۱۹۷۱h & updateTypes) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۵۱۰۳b(int position) {
        return m۱۵۰۹۶a(position, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۵۰۹۶a(int position, int firstPostponedItem) {
        int count = this.f۱۱۹۶۶c.size();
        for (int i = firstPostponedItem; i < count; i++) {
            Cb op = this.f۱۱۹۶۶c.get(i);
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

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۵۱۰۲a(int positionStart, int itemCount, Object payload) {
        if (itemCount < 1) {
            return false;
        }
        this.f۱۱۹۶۵b.add(m۱۵۰۹۷a(4, positionStart, itemCount, payload));
        this.f۱۱۹۷۱h |= 4;
        if (this.f۱۱۹۶۵b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۱۰۴b() {
        m۱۵۰۹۸a();
        int count = this.f۱۱۹۶۵b.size();
        for (int i = 0; i < count; i++) {
            Cb op = this.f۱۱۹۶۵b.get(i);
            int i2 = op.f۱۱۹۷۲a;
            if (i2 == 1) {
                this.f۱۱۹۶۷d.m۱۵۱۱۵b(op);
                this.f۱۱۹۶۷d.m۱۵۱۱۷d(op.f۱۱۹۷۳b, op.f۱۱۹۷۵d);
            } else if (i2 == 2) {
                this.f۱۱۹۶۷d.m۱۵۱۱۵b(op);
                this.f۱۱۹۶۷d.m۱۵۱۱۴b(op.f۱۱۹۷۳b, op.f۱۱۹۷۵d);
            } else if (i2 == 4) {
                this.f۱۱۹۶۷d.m۱۵۱۱۵b(op);
                this.f۱۱۹۶۷d.m۱۵۱۱۲a(op.f۱۱۹۷۳b, op.f۱۱۹۷۵d, op.f۱۱۹۷۴c);
            } else if (i2 == 8) {
                this.f۱۱۹۶۷d.m۱۵۱۱۵b(op);
                this.f۱۱۹۶۷d.m۱۵۱۱۱a(op.f۱۱۹۷۳b, op.f۱۱۹۷۵d);
            }
            Runnable runnable = this.f۱۱۹۶۸e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m۱۵۱۰۱a(this.f۱۱۹۶۵b);
        this.f۱۱۹۷۱h = 0;
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۵۰۹۵a(int position) {
        int size = this.f۱۱۹۶۵b.size();
        for (int i = 0; i < size; i++) {
            Cb op = this.f۱۱۹۶۵b.get(i);
            int i2 = op.f۱۱۹۷۲a;
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = op.f۱۱۹۷۳b;
                    if (i3 <= position) {
                        int i4 = op.f۱۱۹۷۵d;
                        if (i3 + i4 > position) {
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

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۵۱۰۷d() {
        return !this.f۱۱۹۶۶c.isEmpty() && !this.f۱۱۹۶۵b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.d$b  reason: invalid class name */
    public static class Cb {

        /* renamed from: a  reason: contains not printable characters */
        int f۱۱۹۷۲a;

        /* renamed from: b  reason: contains not printable characters */
        int f۱۱۹۷۳b;

        /* renamed from: c  reason: contains not printable characters */
        Object f۱۱۹۷۴c;

        /* renamed from: d  reason: contains not printable characters */
        int f۱۱۹۷۵d;

        Cb(int cmd, int positionStart, int itemCount, Object payload) {
            this.f۱۱۹۷۲a = cmd;
            this.f۱۱۹۷۳b = positionStart;
            this.f۱۱۹۷۵d = itemCount;
            this.f۱۱۹۷۴c = payload;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public String m۱۵۱۱۸a() {
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
            if (i != 8) {
                return "??";
            }
            return "mv";
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m۱۵۱۱۸a() + ",s:" + this.f۱۱۹۷۳b + "c:" + this.f۱۱۹۷۵d + ",p:" + this.f۱۱۹۷۴c + "]";
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Cb op = (Cb) o;
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
            return (((this.f۱۱۹۷۲a * 31) + this.f۱۱۹۷۳b) * 31) + this.f۱۱۹۷۵d;
        }
    }

    @Override // android.support.p۰۴۷v7.widget.Cs0.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۵۰۹۷a(int cmd, int positionStart, int itemCount, Object payload) {
        Cb op = this.f۱۱۹۶۴a.m۱۰۶۳۴a();
        if (op == null) {
            return new Cb(cmd, positionStart, itemCount, payload);
        }
        op.f۱۱۹۷۲a = cmd;
        op.f۱۱۹۷۳b = positionStart;
        op.f۱۱۹۷۵d = itemCount;
        op.f۱۱۹۷۴c = payload;
        return op;
    }

    @Override // android.support.p۰۴۷v7.widget.Cs0.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۰۹۹a(Cb op) {
        if (!this.f۱۱۹۶۹f) {
            op.f۱۱۹۷۴c = null;
            this.f۱۱۹۶۴a.m۱۰۶۳۵a(op);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۱۰۱a(List<Cb> list) {
        int count = list.size();
        for (int i = 0; i < count; i++) {
            m۱۵۰۹۹a(list.get(i));
        }
        list.clear();
    }
}
