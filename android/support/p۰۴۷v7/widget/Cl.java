package android.support.p۰۴۷v7.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.l  reason: invalid class name */
public class Cl {
    /* renamed from: a  reason: contains not printable characters */
    static InputConnection m۱۵۴۰۶a(InputConnection ic, EditorInfo outAttrs, View view) {
        if (ic != null && outAttrs.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof AbstractCs1) {
                    outAttrs.hintText = ((AbstractCs1) parent).m۱۵۵۷۷a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return ic;
    }
}
