package uk.co.chrisjenx.calligraphy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* access modifiers changed from: package-private */
public interface CalligraphyActivityFactory {
    View onActivityCreateView(View view, View view2, String str, Context context, AttributeSet attributeSet);
}
