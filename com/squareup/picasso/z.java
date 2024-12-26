package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.t;
import com.squareup.picasso.y;

/* access modifiers changed from: package-private */
public class z extends y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f۳۶۵۱a;

    z(Context context) {
        this.f۳۶۵۱a = context;
    }

    @Override // com.squareup.picasso.y
    public boolean a(w data) {
        if (data.f۳۶۲۷e != 0) {
            return true;
        }
        return "android.resource".equals(data.f۳۶۲۶d.getScheme());
    }

    @Override // com.squareup.picasso.y
    public y.a a(w request, int networkPolicy) {
        Resources res = d0.a(this.f۳۶۵۱a, request);
        return new y.a(a(res, d0.a(res, request), request), t.e.DISK);
    }

    private static Bitmap a(Resources resources, int id, w data) {
        BitmapFactory.Options options = y.b(data);
        if (y.a(options)) {
            BitmapFactory.decodeResource(resources, id, options);
            y.a(data.f۳۶۳۰h, data.i, options, data);
        }
        return BitmapFactory.decodeResource(resources, id, options);
    }
}
