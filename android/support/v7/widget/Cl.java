package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: android.support.v7.widget.l, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cl {
    /* renamed from: a, reason: contains not printable characters */
    static InputConnection m۱۳۳۳۶a(InputConnection ic, EditorInfo outAttrs, View view) {
        if (ic != null && outAttrs.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                if (parent instanceof InterfaceCs1) {
                    outAttrs.hintText = ((InterfaceCs1) parent).m۱۳۵۰۷a();
                    break;
                }
                parent = parent.getParent();
            }
        }
        return ic;
    }
}
