package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.Cb;
import android.support.v4.view.p۲۰۳d0.Cc;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.v0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cv0 extends Cb {

    /* renamed from: c, reason: contains not printable characters */
    final RecyclerView f۱۲۳۷۱c;

    /* renamed from: d, reason: contains not printable characters */
    final Cb f۱۲۳۷۲d = new a(this);

    public Cv0(RecyclerView recyclerView) {
        this.f۱۲۳۷۱c = recyclerView;
    }

    /* renamed from: c, reason: contains not printable characters */
    boolean m۱۳۵۸۲c() {
        return this.f۱۲۳۷۱c.m۱۲۲۶۷j();
    }

    @Override // android.support.v4.view.Cb
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۳۵۸۴a(View host, int action, Bundle args) {
        if (super.mo۱۳۵۸۴a(host, action, args)) {
            return true;
        }
        if (!m۱۳۵۸۲c() && this.f۱۲۳۷۱c.getLayoutManager() != null) {
            return this.f۱۲۳۷۱c.getLayoutManager().m۱۲۴۷۳a(action, args);
        }
        return false;
    }

    @Override // android.support.v4.view.Cb
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۵۸۳a(View host, Cc info2) {
        super.mo۱۳۵۸۳a(host, info2);
        info2.m۱۰۷۷۲a((CharSequence) RecyclerView.class.getName());
        if (!m۱۳۵۸۲c() && this.f۱۲۳۷۱c.getLayoutManager() != null) {
            this.f۱۲۳۷۱c.getLayoutManager().m۱۲۴۴۹a(info2);
        }
    }

    @Override // android.support.v4.view.Cb
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۳۵۸۱b(View host, AccessibilityEvent event) {
        super.mo۱۳۵۸۱b(host, event);
        event.setClassName(RecyclerView.class.getName());
        if ((host instanceof RecyclerView) && !m۱۳۵۸۲c()) {
            RecyclerView rv = (RecyclerView) host;
            if (rv.getLayoutManager() != null) {
                rv.getLayoutManager().mo۱۲۷۶۱a(event);
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public Cb m۱۳۵۸۰b() {
        return this.f۱۲۳۷۲d;
    }

    /* renamed from: android.support.v7.widget.v0$a */
    public static class a extends Cb {

        /* renamed from: c, reason: contains not printable characters */
        final Cv0 f۱۲۳۷۳c;

        public a(Cv0 recyclerViewDelegate) {
            this.f۱۲۳۷۳c = recyclerViewDelegate;
        }

        @Override // android.support.v4.view.Cb
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۳۵۸۳a(View host, Cc info2) {
            super.mo۱۳۵۸۳a(host, info2);
            if (!this.f۱۲۳۷۳c.m۱۳۵۸۲c() && this.f۱۲۳۷۳c.f۱۲۳۷۱c.getLayoutManager() != null) {
                this.f۱۲۳۷۳c.f۱۲۳۷۱c.getLayoutManager().m۱۲۴۶۷a(host, info2);
            }
        }

        @Override // android.support.v4.view.Cb
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۳۵۸۴a(View host, int action, Bundle args) {
            if (super.mo۱۳۵۸۴a(host, action, args)) {
                return true;
            }
            if (!this.f۱۲۳۷۳c.m۱۳۵۸۲c() && this.f۱۲۳۷۳c.f۱۲۳۷۱c.getLayoutManager() != null) {
                return this.f۱۲۳۷۳c.f۱۲۳۷۱c.getLayoutManager().m۱۲۴۸۳a(host, action, args);
            }
            return false;
        }
    }
}
