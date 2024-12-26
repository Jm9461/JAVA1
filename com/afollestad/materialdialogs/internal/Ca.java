package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: com.afollestad.materialdialogs.internal.a  reason: invalid class name */
public class Ca implements TransformationMethod {

    /* renamed from: c  reason: contains not printable characters */
    private Locale f۱۳۳۲۳c;

    Ca(Context context) {
        this.f۱۳۳۲۳c = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence source, View view) {
        if (source != null) {
            return source.toString().toUpperCase(this.f۱۳۳۲۳c);
        }
        return null;
    }

    public void onFocusChanged(View view, CharSequence sourceText, boolean focused, int direction, Rect previouslyFocusedRect) {
    }
}
