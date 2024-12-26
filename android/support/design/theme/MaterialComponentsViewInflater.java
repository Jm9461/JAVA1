package android.support.design.theme;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.p۰۴۷v7.app.AppCompatViewInflater;
import android.support.p۰۴۷v7.widget.Cg;
import android.util.AttributeSet;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۰m.Ca;

@Keep
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۷v7.app.AppCompatViewInflater
    public Cg createButton(Context context, AttributeSet attrs) {
        return new Ca(context, attrs);
    }
}
