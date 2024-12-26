package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.AbstractCy;
import com.squareup.picasso.Ct;
import java.io.InputStream;
import p۱۴۹f.Cl;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.g  reason: invalid class name */
public class Cg extends AbstractCy {

    /* renamed from: a  reason: contains not printable characters */
    final Context f۱۵۴۲۶a;

    Cg(Context context) {
        this.f۱۵۴۲۶a = context;
    }

    @Override // com.squareup.picasso.AbstractCy
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۳۳۵a(Cw data) {
        return "content".equals(data.f۱۵۵۳۵d.getScheme());
    }

    @Override // com.squareup.picasso.AbstractCy
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCy.Ca m۱۸۳۳۴a(Cw request, int networkPolicy) {
        return new AbstractCy.Ca(Cl.m۱۹۴۸۶a(m۱۸۳۳۶c(request)), Ct.EnumCe.DISK);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public InputStream m۱۸۳۳۶c(Cw request) {
        return this.f۱۵۴۲۶a.getContentResolver().openInputStream(request.f۱۵۵۳۵d);
    }
}
