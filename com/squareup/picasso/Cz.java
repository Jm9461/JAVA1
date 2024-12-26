package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.AbstractCy;
import com.squareup.picasso.Ct;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.z  reason: invalid class name */
public class Cz extends AbstractCy {

    /* renamed from: a  reason: contains not printable characters */
    private final Context f۱۵۵۸۶a;

    Cz(Context context) {
        this.f۱۵۵۸۶a = context;
    }

    @Override // com.squareup.picasso.AbstractCy
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۴۵۵a(Cw data) {
        if (data.f۱۵۵۳۶e != 0) {
            return true;
        }
        return "android.resource".equals(data.f۱۵۵۳۵d.getScheme());
    }

    @Override // com.squareup.picasso.AbstractCy
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCy.Ca m۱۸۴۵۴a(Cw request, int networkPolicy) {
        Resources res = Cd0.m۱۸۳۱۳a(this.f۱۵۵۸۶a, request);
        return new AbstractCy.Ca(m۱۸۴۵۳a(res, Cd0.m۱۸۳۱۰a(res, request), request), Ct.EnumCe.DISK);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Bitmap m۱۸۴۵۳a(Resources resources, int id, Cw data) {
        BitmapFactory.Options options = AbstractCy.m۱۸۴۴۳b(data);
        if (AbstractCy.m۱۸۴۴۲a(options)) {
            BitmapFactory.decodeResource(resources, id, options);
            AbstractCy.m۱۸۴۴۱a(data.f۱۵۵۳۹h, data.f۱۵۵۴۰i, options, data);
        }
        return BitmapFactory.decodeResource(resources, id, options);
    }
}
