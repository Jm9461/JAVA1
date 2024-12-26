package com.squareup.picasso;

import android.content.Context;
import java.io.File;
import p۱۳۹e.AbstractCe;
import p۱۳۹e.Ca0;
import p۱۳۹e.Cv;
import p۱۳۹e.Cy;

/* renamed from: com.squareup.picasso.s  reason: invalid class name */
public final class Cs implements AbstractCj {

    /* renamed from: a  reason: contains not printable characters */
    final AbstractCe.AbstractCa f۱۵۴۸۱a;

    public Cs(Context context) {
        this(Cd0.m۱۸۳۲۵b(context));
    }

    public Cs(File cacheDir) {
        this(cacheDir, Cd0.m۱۸۳۱۲a(cacheDir));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Cs(java.io.File r3, long r4) {
        /*
            r2 = this;
            e.v$b r0 = new e.v$b
            r0.<init>()
            e.c r1 = new e.c
            r1.<init>(r3, r4)
            r0.m۱۹۳۰۷a(r1)
            e.v r0 = r0.m۱۹۳۰۸a()
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.Cs.<init>(java.io.File, long):void");
    }

    public Cs(Cv client) {
        this.f۱۵۴۸۱a = client;
        client.m۱۹۲۷۳b();
    }

    @Override // com.squareup.picasso.AbstractCj
    /* renamed from: a  reason: contains not printable characters */
    public Ca0 m۱۸۳۹۳a(Cy request) {
        return this.f۱۵۴۸۱a.m۱۸۵۹۳a(request).m۱۸۵۹۲l();
    }
}
