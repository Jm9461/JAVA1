package ir.mirrajabi.persiancalendar.f.c;

import android.os.Bundle;
import android.support.v4.app.f;
import android.support.v4.app.k;
import android.support.v4.app.p;
import ir.mirrajabi.persiancalendar.f.e.b;

public class a extends p {
    public a(k fm) {
        super(fm);
    }

    @Override // android.support.v4.app.p
    public f c(int position) {
        b fragment = new b();
        Bundle bundle = new Bundle();
        bundle.putInt("OFFSET_ARGUMENT", position - 2500);
        fragment.m(bundle);
        return fragment;
    }

    @Override // android.support.v4.view.q
    public int a() {
        return 5000;
    }
}
