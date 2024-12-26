package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.squareup.picasso.AbstractCy;
import com.squareup.picasso.Ct;
import p۰۰۰a.p۰۰۵b.p۰۲۱e.Ca;
import p۱۴۹f.Cl;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.k  reason: invalid class name */
public class Ck extends Cg {
    Ck(Context context) {
        super(context);
    }

    @Override // com.squareup.picasso.Cg, com.squareup.picasso.AbstractCy
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۳۶۵a(Cw data) {
        return "file".equals(data.f۱۵۵۳۵d.getScheme());
    }

    @Override // com.squareup.picasso.Cg, com.squareup.picasso.AbstractCy
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCy.Ca m۱۸۳۶۴a(Cw request, int networkPolicy) {
        return new AbstractCy.Ca(null, Cl.m۱۹۴۸۶a(m۱۸۳۳۶c(request)), Ct.EnumCe.DISK, m۱۸۳۶۳a(request.f۱۵۵۳۵d));
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۸۳۶۳a(Uri uri) {
        return new Ca(uri.getPath()).m۱۰۱۴۱a("Orientation", 1);
    }
}
