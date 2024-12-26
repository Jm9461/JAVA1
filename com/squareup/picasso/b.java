package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import f.l;

/* access modifiers changed from: package-private */
public class b extends y {

    /* renamed from: d  reason: collision with root package name */
    private static final int f۳۵۱۲d = "file:///android_asset/".length();

    /* renamed from: a  reason: collision with root package name */
    private final Context f۳۵۱۳a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f۳۵۱۴b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private AssetManager f۳۵۱۵c;

    b(Context context) {
        this.f۳۵۱۳a = context;
    }

    @Override // com.squareup.picasso.y
    public boolean a(w data) {
        Uri uri = data.f۳۶۲۶d;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.picasso.y
    public y.a a(w request, int networkPolicy) {
        if (this.f۳۵۱۵c == null) {
            synchronized (this.f۳۵۱۴b) {
                if (this.f۳۵۱۵c == null) {
                    this.f۳۵۱۵c = this.f۳۵۱۳a.getAssets();
                }
            }
        }
        return new y.a(l.a(this.f۳۵۱۵c.open(c(request))), t.e.DISK);
    }

    static String c(w request) {
        return request.f۳۶۲۶d.toString().substring(f۳۵۱۲d);
    }
}
