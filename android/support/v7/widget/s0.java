package android.support.v7.widget;

import android.support.v7.widget.d;
import java.util.List;

/* access modifiers changed from: package-private */
public class s0 {

    /* renamed from: a  reason: collision with root package name */
    final a f۲۲۴۵a;

    /* access modifiers changed from: package-private */
    public interface a {
        d.b a(int i, int i2, int i3, Object obj);

        void a(d.b bVar);
    }

    s0(a callback) {
        this.f۲۲۴۵a = callback;
    }

    /* access modifiers changed from: package-private */
    public void a(List<d.b> list) {
        while (true) {
            int badMove = b(list);
            if (badMove != -1) {
                a(list, badMove, badMove + 1);
            } else {
                return;
            }
        }
    }

    private void a(List<d.b> list, int badMove, int next) {
        d.b moveOp = list.get(badMove);
        d.b nextOp = list.get(next);
        int i = nextOp.f۲۰۰۹a;
        if (i == 1) {
            c(list, badMove, moveOp, next, nextOp);
        } else if (i == 2) {
            a(list, badMove, moveOp, next, nextOp);
        } else if (i == 4) {
            b(list, badMove, moveOp, next, nextOp);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(List<d.b> list, int movePos, d.b moveOp, int removePos, d.b removeOp) {
        boolean moveIsBackwards;
        d.b extraRm = null;
        boolean revertedMove = false;
        int i = moveOp.f۲۰۱۰b;
        int i2 = moveOp.f۲۰۱۲d;
        if (i < i2) {
            moveIsBackwards = false;
            if (removeOp.f۲۰۱۰b == i && removeOp.f۲۰۱۲d == i2 - i) {
                revertedMove = true;
            }
        } else {
            moveIsBackwards = true;
            if (removeOp.f۲۰۱۰b == i2 + 1 && removeOp.f۲۰۱۲d == i - i2) {
                revertedMove = true;
            }
        }
        int i3 = moveOp.f۲۰۱۲d;
        int i4 = removeOp.f۲۰۱۰b;
        if (i3 < i4) {
            removeOp.f۲۰۱۰b = i4 - 1;
        } else {
            int i5 = removeOp.f۲۰۱۲d;
            if (i3 < i4 + i5) {
                removeOp.f۲۰۱۲d = i5 - 1;
                moveOp.f۲۰۰۹a = 2;
                moveOp.f۲۰۱۲d = 1;
                if (removeOp.f۲۰۱۲d == 0) {
                    list.remove(removePos);
                    this.f۲۲۴۵a.a(removeOp);
                    return;
                }
                return;
            }
        }
        int i6 = moveOp.f۲۰۱۰b;
        int i7 = removeOp.f۲۰۱۰b;
        if (i6 <= i7) {
            removeOp.f۲۰۱۰b = i7 + 1;
        } else {
            int i8 = removeOp.f۲۰۱۲d;
            if (i6 < i7 + i8) {
                extraRm = this.f۲۲۴۵a.a(2, i6 + 1, (i7 + i8) - i6, null);
                removeOp.f۲۰۱۲d = moveOp.f۲۰۱۰b - removeOp.f۲۰۱۰b;
            }
        }
        if (revertedMove) {
            list.set(movePos, removeOp);
            list.remove(removePos);
            this.f۲۲۴۵a.a(moveOp);
            return;
        }
        if (moveIsBackwards) {
            if (extraRm != null) {
                int i9 = moveOp.f۲۰۱۰b;
                if (i9 > extraRm.f۲۰۱۰b) {
                    moveOp.f۲۰۱۰b = i9 - extraRm.f۲۰۱۲d;
                }
                int i10 = moveOp.f۲۰۱۲d;
                if (i10 > extraRm.f۲۰۱۰b) {
                    moveOp.f۲۰۱۲d = i10 - extraRm.f۲۰۱۲d;
                }
            }
            int i11 = moveOp.f۲۰۱۰b;
            if (i11 > removeOp.f۲۰۱۰b) {
                moveOp.f۲۰۱۰b = i11 - removeOp.f۲۰۱۲d;
            }
            int i12 = moveOp.f۲۰۱۲d;
            if (i12 > removeOp.f۲۰۱۰b) {
                moveOp.f۲۰۱۲d = i12 - removeOp.f۲۰۱۲d;
            }
        } else {
            if (extraRm != null) {
                int i13 = moveOp.f۲۰۱۰b;
                if (i13 >= extraRm.f۲۰۱۰b) {
                    moveOp.f۲۰۱۰b = i13 - extraRm.f۲۰۱۲d;
                }
                int i14 = moveOp.f۲۰۱۲d;
                if (i14 >= extraRm.f۲۰۱۰b) {
                    moveOp.f۲۰۱۲d = i14 - extraRm.f۲۰۱۲d;
                }
            }
            int i15 = moveOp.f۲۰۱۰b;
            if (i15 >= removeOp.f۲۰۱۰b) {
                moveOp.f۲۰۱۰b = i15 - removeOp.f۲۰۱۲d;
            }
            int i16 = moveOp.f۲۰۱۲d;
            if (i16 >= removeOp.f۲۰۱۰b) {
                moveOp.f۲۰۱۲d = i16 - removeOp.f۲۰۱۲d;
            }
        }
        list.set(movePos, removeOp);
        if (moveOp.f۲۰۱۰b != moveOp.f۲۰۱۲d) {
            list.set(removePos, moveOp);
        } else {
            list.remove(removePos);
        }
        if (extraRm != null) {
            list.add(movePos, extraRm);
        }
    }

    private void c(List<d.b> list, int move, d.b moveOp, int add, d.b addOp) {
        int offset = 0;
        if (moveOp.f۲۰۱۲d < addOp.f۲۰۱۰b) {
            offset = 0 - 1;
        }
        if (moveOp.f۲۰۱۰b < addOp.f۲۰۱۰b) {
            offset++;
        }
        int i = addOp.f۲۰۱۰b;
        int i2 = moveOp.f۲۰۱۰b;
        if (i <= i2) {
            moveOp.f۲۰۱۰b = i2 + addOp.f۲۰۱۲d;
        }
        int i3 = addOp.f۲۰۱۰b;
        int i4 = moveOp.f۲۰۱۲d;
        if (i3 <= i4) {
            moveOp.f۲۰۱۲d = i4 + addOp.f۲۰۱۲d;
        }
        addOp.f۲۰۱۰b += offset;
        list.set(move, addOp);
        list.set(add, moveOp);
    }

    /* access modifiers changed from: package-private */
    public void b(List<d.b> list, int move, d.b moveOp, int update, d.b updateOp) {
        d.b extraUp1 = null;
        d.b extraUp2 = null;
        int i = moveOp.f۲۰۱۲d;
        int i2 = updateOp.f۲۰۱۰b;
        if (i < i2) {
            updateOp.f۲۰۱۰b = i2 - 1;
        } else {
            int i3 = updateOp.f۲۰۱۲d;
            if (i < i2 + i3) {
                updateOp.f۲۰۱۲d = i3 - 1;
                extraUp1 = this.f۲۲۴۵a.a(4, moveOp.f۲۰۱۰b, 1, updateOp.f۲۰۱۱c);
            }
        }
        int i4 = moveOp.f۲۰۱۰b;
        int i5 = updateOp.f۲۰۱۰b;
        if (i4 <= i5) {
            updateOp.f۲۰۱۰b = i5 + 1;
        } else {
            int i6 = updateOp.f۲۰۱۲d;
            if (i4 < i5 + i6) {
                int remaining = (i5 + i6) - i4;
                extraUp2 = this.f۲۲۴۵a.a(4, i4 + 1, remaining, updateOp.f۲۰۱۱c);
                updateOp.f۲۰۱۲d -= remaining;
            }
        }
        list.set(update, moveOp);
        if (updateOp.f۲۰۱۲d > 0) {
            list.set(move, updateOp);
        } else {
            list.remove(move);
            this.f۲۲۴۵a.a(updateOp);
        }
        if (extraUp1 != null) {
            list.add(move, extraUp1);
        }
        if (extraUp2 != null) {
            list.add(move, extraUp2);
        }
    }

    private int b(List<d.b> list) {
        boolean foundNonMove = false;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).f۲۰۰۹a != 8) {
                foundNonMove = true;
            } else if (foundNonMove) {
                return i;
            }
        }
        return -1;
    }
}
