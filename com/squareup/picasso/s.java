package com.squareup.picasso;

import android.content.Context;
import e.a0;
import e.e;
import e.v;
import e.y;
import java.io.File;

public final class s implements j {

    /* renamed from: a  reason: collision with root package name */
    final e.a f۳۵۸۴a;

    public s(Context context) {
        this(d0.b(context));
    }

    public s(File cacheDir) {
        this(cacheDir, d0.a(cacheDir));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s(java.io.File r3, long r4) {
        /*
            r2 = this;
            e.v$b r0 = new e.v$b
            r0.<init>()
            e.c r1 = new e.c
            r1.<init>(r3, r4)
            r0.a(r1)
            e.v r0 = r0.a()
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.s.<init>(java.io.File, long):void");
    }

    public s(v client) {
        this.f۳۵۸۴a = client;
        client.b();
    }

    @Override // com.squareup.picasso.j
    public a0 a(y request) {
        return this.f۳۵۸۴a.a(request).l();
    }
}
