package android.support.p۰۴۷v7.widget;

import android.support.p۰۴۷v7.widget.Cd;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.s0  reason: invalid class name */
public class Cs0 {

    /* renamed from: a  reason: contains not printable characters */
    final AbstractCa f۱۲۳۳۲a;

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.s0$a  reason: invalid class name */
    public interface AbstractCa {
        /* renamed from: a  reason: contains not printable characters */
        Cd.Cb m۱۵۵۷۵a(int i, int i2, int i3, Object obj);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۵۵۷۶a(Cd.Cb bVar);
    }

    Cs0(AbstractCa callback) {
        this.f۱۲۳۳۲a = callback;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۵۷۲a(List<Cd.Cb> list) {
        while (true) {
            int badMove = m۱۵۵۷۰b(list);
            if (badMove != -1) {
                m۱۵۵۶۹a(list, badMove, badMove + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۵۶۹a(List<Cd.Cb> list, int badMove, int next) {
        Cd.Cb moveOp = list.get(badMove);
        Cd.Cb nextOp = list.get(next);
        int i = nextOp.f۱۱۹۷۲a;
        if (i == 1) {
            m۱۵۵۷۱c(list, badMove, moveOp, next, nextOp);
        } else if (i == 2) {
            m۱۵۵۷۳a(list, badMove, moveOp, next, nextOp);
        } else if (i == 4) {
            m۱۵۵۷۴b(list, badMove, moveOp, next, nextOp);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۵۷۳a(List<Cd.Cb> list, int movePos, Cd.Cb moveOp, int removePos, Cd.Cb removeOp) {
        boolean moveIsBackwards;
        Cd.Cb extraRm = null;
        boolean revertedMove = false;
        int i = moveOp.f۱۱۹۷۳b;
        int i2 = moveOp.f۱۱۹۷۵d;
        if (i < i2) {
            moveIsBackwards = false;
            if (removeOp.f۱۱۹۷۳b == i && removeOp.f۱۱۹۷۵d == i2 - i) {
                revertedMove = true;
            }
        } else {
            moveIsBackwards = true;
            if (removeOp.f۱۱۹۷۳b == i2 + 1 && removeOp.f۱۱۹۷۵d == i - i2) {
                revertedMove = true;
            }
        }
        int i3 = moveOp.f۱۱۹۷۵d;
        int i4 = removeOp.f۱۱۹۷۳b;
        if (i3 < i4) {
            removeOp.f۱۱۹۷۳b = i4 - 1;
        } else {
            int i5 = removeOp.f۱۱۹۷۵d;
            if (i3 < i4 + i5) {
                removeOp.f۱۱۹۷۵d = i5 - 1;
                moveOp.f۱۱۹۷۲a = 2;
                moveOp.f۱۱۹۷۵d = 1;
                if (removeOp.f۱۱۹۷۵d == 0) {
                    list.remove(removePos);
                    this.f۱۲۳۳۲a.m۱۵۵۷۶a(removeOp);
                    return;
                }
                return;
            }
        }
        int i6 = moveOp.f۱۱۹۷۳b;
        int i7 = removeOp.f۱۱۹۷۳b;
        if (i6 <= i7) {
            removeOp.f۱۱۹۷۳b = i7 + 1;
        } else {
            int i8 = removeOp.f۱۱۹۷۵d;
            if (i6 < i7 + i8) {
                extraRm = this.f۱۲۳۳۲a.m۱۵۵۷۵a(2, i6 + 1, (i7 + i8) - i6, null);
                removeOp.f۱۱۹۷۵d = moveOp.f۱۱۹۷۳b - removeOp.f۱۱۹۷۳b;
            }
        }
        if (revertedMove) {
            list.set(movePos, removeOp);
            list.remove(removePos);
            this.f۱۲۳۳۲a.m۱۵۵۷۶a(moveOp);
            return;
        }
        if (moveIsBackwards) {
            if (extraRm != null) {
                int i9 = moveOp.f۱۱۹۷۳b;
                if (i9 > extraRm.f۱۱۹۷۳b) {
                    moveOp.f۱۱۹۷۳b = i9 - extraRm.f۱۱۹۷۵d;
                }
                int i10 = moveOp.f۱۱۹۷۵d;
                if (i10 > extraRm.f۱۱۹۷۳b) {
                    moveOp.f۱۱۹۷۵d = i10 - extraRm.f۱۱۹۷۵d;
                }
            }
            int i11 = moveOp.f۱۱۹۷۳b;
            if (i11 > removeOp.f۱۱۹۷۳b) {
                moveOp.f۱۱۹۷۳b = i11 - removeOp.f۱۱۹۷۵d;
            }
            int i12 = moveOp.f۱۱۹۷۵d;
            if (i12 > removeOp.f۱۱۹۷۳b) {
                moveOp.f۱۱۹۷۵d = i12 - removeOp.f۱۱۹۷۵d;
            }
        } else {
            if (extraRm != null) {
                int i13 = moveOp.f۱۱۹۷۳b;
                if (i13 >= extraRm.f۱۱۹۷۳b) {
                    moveOp.f۱۱۹۷۳b = i13 - extraRm.f۱۱۹۷۵d;
                }
                int i14 = moveOp.f۱۱۹۷۵d;
                if (i14 >= extraRm.f۱۱۹۷۳b) {
                    moveOp.f۱۱۹۷۵d = i14 - extraRm.f۱۱۹۷۵d;
                }
            }
            int i15 = moveOp.f۱۱۹۷۳b;
            if (i15 >= removeOp.f۱۱۹۷۳b) {
                moveOp.f۱۱۹۷۳b = i15 - removeOp.f۱۱۹۷۵d;
            }
            int i16 = moveOp.f۱۱۹۷۵d;
            if (i16 >= removeOp.f۱۱۹۷۳b) {
                moveOp.f۱۱۹۷۵d = i16 - removeOp.f۱۱۹۷۵d;
            }
        }
        list.set(movePos, removeOp);
        if (moveOp.f۱۱۹۷۳b != moveOp.f۱۱۹۷۵d) {
            list.set(removePos, moveOp);
        } else {
            list.remove(removePos);
        }
        if (extraRm != null) {
            list.add(movePos, extraRm);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۵۵۷۱c(List<Cd.Cb> list, int move, Cd.Cb moveOp, int add, Cd.Cb addOp) {
        int offset = 0;
        if (moveOp.f۱۱۹۷۵d < addOp.f۱۱۹۷۳b) {
            offset = 0 - 1;
        }
        if (moveOp.f۱۱۹۷۳b < addOp.f۱۱۹۷۳b) {
            offset++;
        }
        int i = addOp.f۱۱۹۷۳b;
        int i2 = moveOp.f۱۱۹۷۳b;
        if (i <= i2) {
            moveOp.f۱۱۹۷۳b = i2 + addOp.f۱۱۹۷۵d;
        }
        int i3 = addOp.f۱۱۹۷۳b;
        int i4 = moveOp.f۱۱۹۷۵d;
        if (i3 <= i4) {
            moveOp.f۱۱۹۷۵d = i4 + addOp.f۱۱۹۷۵d;
        }
        addOp.f۱۱۹۷۳b += offset;
        list.set(move, addOp);
        list.set(add, moveOp);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۵۷۴b(List<Cd.Cb> list, int move, Cd.Cb moveOp, int update, Cd.Cb updateOp) {
        Cd.Cb extraUp1 = null;
        Cd.Cb extraUp2 = null;
        int i = moveOp.f۱۱۹۷۵d;
        int i2 = updateOp.f۱۱۹۷۳b;
        if (i < i2) {
            updateOp.f۱۱۹۷۳b = i2 - 1;
        } else {
            int i3 = updateOp.f۱۱۹۷۵d;
            if (i < i2 + i3) {
                updateOp.f۱۱۹۷۵d = i3 - 1;
                extraUp1 = this.f۱۲۳۳۲a.m۱۵۵۷۵a(4, moveOp.f۱۱۹۷۳b, 1, updateOp.f۱۱۹۷۴c);
            }
        }
        int i4 = moveOp.f۱۱۹۷۳b;
        int i5 = updateOp.f۱۱۹۷۳b;
        if (i4 <= i5) {
            updateOp.f۱۱۹۷۳b = i5 + 1;
        } else {
            int i6 = updateOp.f۱۱۹۷۵d;
            if (i4 < i5 + i6) {
                int remaining = (i5 + i6) - i4;
                extraUp2 = this.f۱۲۳۳۲a.m۱۵۵۷۵a(4, i4 + 1, remaining, updateOp.f۱۱۹۷۴c);
                updateOp.f۱۱۹۷۵d -= remaining;
            }
        }
        list.set(update, moveOp);
        if (updateOp.f۱۱۹۷۵d > 0) {
            list.set(move, updateOp);
        } else {
            list.remove(move);
            this.f۱۲۳۳۲a.m۱۵۵۷۶a(updateOp);
        }
        if (extraUp1 != null) {
            list.add(move, extraUp1);
        }
        if (extraUp2 != null) {
            list.add(move, extraUp2);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۵۵۷۰b(List<Cd.Cb> list) {
        boolean foundNonMove = false;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).f۱۱۹۷۲a != 8) {
                foundNonMove = true;
            } else if (foundNonMove) {
                return i;
            }
        }
        return -1;
    }
}
