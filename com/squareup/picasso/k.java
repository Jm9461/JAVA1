package com.squareup.picasso;

import a.b.e.a;
import android.content.Context;
import android.net.Uri;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import f.l;

/* access modifiers changed from: package-private */
public class k extends g {
    k(Context context) {
        super(context);
    }

    @Override // com.squareup.picasso.g, com.squareup.picasso.y
    public boolean a(w data) {
        return "file".equals(data.f۳۶۲۶d.getScheme());
    }

    @Override // com.squareup.picasso.g, com.squareup.picasso.y
    public y.a a(w request, int networkPolicy) {
        return new y.a(null, l.a(c(request)), t.e.DISK, a(request.f۳۶۲۶d));
    }

    static int a(Uri uri) {
        return new a(uri.getPath()).a("Orientation", 1);
    }
}
