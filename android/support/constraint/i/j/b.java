package android.support.constraint.i.j;

import android.support.constraint.i.e;

/* access modifiers changed from: package-private */
public class b {
    static void a(f constraintWidgetContainer, e system, int orientation) {
        c[] chainsArray;
        int chainsSize;
        int offset;
        if (orientation == 0) {
            offset = 0;
            chainsSize = constraintWidgetContainer.m0;
            chainsArray = constraintWidgetContainer.p0;
        } else {
            offset = 2;
            chainsSize = constraintWidgetContainer.n0;
            chainsArray = constraintWidgetContainer.o0;
        }
        for (int i = 0; i < chainsSize; i++) {
            c first = chainsArray[i];
            first.a();
            if (!constraintWidgetContainer.p(4)) {
                a(constraintWidgetContainer, system, orientation, offset, first);
            } else if (!i.a(constraintWidgetContainer, system, orientation, offset, first)) {
                a(constraintWidgetContainer, system, orientation, offset, first);
            }
        }
    }

    /* JADX INFO: Multiple debug info for r3v15 android.support.constraint.i.i: [D('beginNextTarget' android.support.constraint.i.i), D('beginNext' android.support.constraint.i.i)] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x055a  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x05c6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x05d8  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x05db  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x05e1  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x05e4  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x05e7  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x05f9  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x05fd  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0607  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x060a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(android.support.constraint.i.j.f r44, android.support.constraint.i.e r45, int r46, int r47, android.support.constraint.i.j.c r48) {
        /*
        // Method dump skipped, instructions count: 1596
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.i.j.b.a(android.support.constraint.i.j.f, android.support.constraint.i.e, int, int, android.support.constraint.i.j.c):void");
    }
}
