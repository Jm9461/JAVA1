package ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۱c;

import android.os.Bundle;
import android.support.v4.app.AbstractCk;
import android.support.v4.app.AbstractCp;
import android.support.v4.app.ComponentCallbacksCf;
import ir.mirrajabi.persiancalendar.p۳۱۰f.p۳۱۳e.Cb;

/* renamed from: ir.mirrajabi.persiancalendar.f.c.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca extends AbstractCp {
    public Ca(AbstractCk fm) {
        super(fm);
    }

    @Override // android.support.v4.app.AbstractCp
    /* renamed from: c, reason: contains not printable characters */
    public ComponentCallbacksCf mo۱۷۶۴۹c(int position) {
        Cb fragment = new Cb();
        Bundle bundle = new Bundle();
        bundle.putInt("OFFSET_ARGUMENT", position - 2500);
        fragment.m۱۰۱۵۴m(bundle);
        return fragment;
    }

    @Override // android.support.v4.view.AbstractCq
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۷۶۴۸a() {
        return 5000;
    }
}
