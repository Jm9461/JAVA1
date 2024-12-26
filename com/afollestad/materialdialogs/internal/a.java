package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* access modifiers changed from: package-private */
public class a implements TransformationMethod {

    /* renamed from: c  reason: collision with root package name */
    private Locale f۲۷۵۲c;

    a(Context context) {
        this.f۲۷۵۲c = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence source, View view) {
        if (source != null) {
            return source.toString().toUpperCase(this.f۲۷۵۲c);
        }
        return null;
    }

    public void onFocusChanged(View view, CharSequence sourceText, boolean focused, int direction, Rect previouslyFocusedRect) {
    }
}
