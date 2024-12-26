package p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۷c;

import android.os.Bundle;
import android.support.p۰۴۳v4.app.AbstractCk;
import android.support.p۰۴۳v4.app.AbstractCp;
import android.support.p۰۴۳v4.app.ComponentCallbacksCf;
import p۱۵۵ir.mirrajabi.persiancalendar.p۱۵۶f.p۱۵۹e.Cb;

/* renamed from: ir.mirrajabi.persiancalendar.f.c.a  reason: invalid class name */
public class Ca extends AbstractCp {
    public Ca(AbstractCk fm) {
        super(fm);
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCp
    /* renamed from: c  reason: contains not printable characters */
    public ComponentCallbacksCf m۱۹۷۲۶c(int position) {
        Cb fragment = new Cb();
        Bundle bundle = new Bundle();
        bundle.putInt("OFFSET_ARGUMENT", position - 2500);
        fragment.m۱۲۲۲۴m(bundle);
        return fragment;
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCq
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۹۷۲۵a() {
        return 5000;
    }
}
