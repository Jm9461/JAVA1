package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import f.l;
import java.io.InputStream;

/* access modifiers changed from: package-private */
public class g extends y {

    /* renamed from: a  reason: collision with root package name */
    final Context f۳۵۴۰a;

    g(Context context) {
        this.f۳۵۴۰a = context;
    }

    @Override // com.squareup.picasso.y
    public boolean a(w data) {
        return "content".equals(data.f۳۶۲۶d.getScheme());
    }

    @Override // com.squareup.picasso.y
    public y.a a(w request, int networkPolicy) {
        return new y.a(l.a(c(request)), t.e.DISK);
    }

    /* access modifiers changed from: package-private */
    public InputStream c(w request) {
        return this.f۳۵۴۰a.getContentResolver().openInputStream(request.f۳۶۲۶d);
    }
}
