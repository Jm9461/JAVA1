package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.AbstractCy;
import com.squareup.picasso.Ct;
import p۱۴۹f.Cl;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.b  reason: invalid class name */
public class Cb extends AbstractCy {

    /* renamed from: d  reason: contains not printable characters */
    private static final int f۱۵۳۷۵d = "file:///android_asset/".length();

    /* renamed from: a  reason: contains not printable characters */
    private final Context f۱۵۳۷۶a;

    /* renamed from: b  reason: contains not printable characters */
    private final Object f۱۵۳۷۷b = new Object();

    /* renamed from: c  reason: contains not printable characters */
    private AssetManager f۱۵۳۷۸c;

    Cb(Context context) {
        this.f۱۵۳۷۶a = context;
    }

    @Override // com.squareup.picasso.AbstractCy
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۲۷۱a(Cw data) {
        Uri uri = data.f۱۵۵۳۵d;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.picasso.AbstractCy
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCy.Ca m۱۸۲۷۰a(Cw request, int networkPolicy) {
        if (this.f۱۵۳۷۸c == null) {
            synchronized (this.f۱۵۳۷۷b) {
                if (this.f۱۵۳۷۸c == null) {
                    this.f۱۵۳۷۸c = this.f۱۵۳۷۶a.getAssets();
                }
            }
        }
        return new AbstractCy.Ca(Cl.m۱۹۴۸۶a(this.f۱۵۳۷۸c.open(m۱۸۲۶۹c(request))), Ct.EnumCe.DISK);
    }

    /* renamed from: c  reason: contains not printable characters */
    static String m۱۸۲۶۹c(Cw request) {
        return request.f۱۵۵۳۵d.toString().substring(f۱۵۳۷۵d);
    }
}
