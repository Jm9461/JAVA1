package android.support.p۰۴۷v7.widget;

import android.os.Bundle;
import android.support.p۰۴۳v4.view.Cb;
import android.support.p۰۴۳v4.view.p۰۴۵d0.Cc;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.v0  reason: invalid class name */
public class Cv0 extends Cb {

    /* renamed from: c  reason: contains not printable characters */
    final RecyclerView f۱۲۳۷۱c;

    /* renamed from: d  reason: contains not printable characters */
    final Cb f۱۲۳۷۲d = new Ca(this);

    public Cv0(RecyclerView recyclerView) {
        this.f۱۲۳۷۱c = recyclerView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۵۶۵۲c() {
        return this.f۱۲۳۷۱c.m۱۴۳۳۷j();
    }

    @Override // android.support.p۰۴۳v4.view.Cb
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۵۶۴۹a(View host, int action, Bundle args) {
        if (super.m۱۲۷۹۸a(host, action, args)) {
            return true;
        }
        if (m۱۵۶۵۲c() || this.f۱۲۳۷۱c.getLayoutManager() == null) {
            return false;
        }
        return this.f۱۲۳۷۱c.getLayoutManager().m۱۴۵۴۳a(action, args);
    }

    @Override // android.support.p۰۴۳v4.view.Cb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۴۸a(View host, Cc info2) {
        super.m۱۲۷۹۷a(host, info2);
        info2.m۱۲۸۴۲a((CharSequence) RecyclerView.class.getName());
        if (!m۱۵۶۵۲c() && this.f۱۲۳۷۱c.getLayoutManager() != null) {
            this.f۱۲۳۷۱c.getLayoutManager().m۱۴۵۱۹a(info2);
        }
    }

    @Override // android.support.p۰۴۳v4.view.Cb
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۶۵۱b(View host, AccessibilityEvent event) {
        super.m۱۲۸۰۱b(host, event);
        event.setClassName(RecyclerView.class.getName());
        if ((host instanceof RecyclerView) && !m۱۵۶۵۲c()) {
            RecyclerView rv = (RecyclerView) host;
            if (rv.getLayoutManager() != null) {
                rv.getLayoutManager().m۱۴۵۴۰a(event);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public Cb m۱۵۶۵۰b() {
        return this.f۱۲۳۷۲d;
    }

    /* renamed from: android.support.v7.widget.v0$a  reason: invalid class name */
    public static class Ca extends Cb {

        /* renamed from: c  reason: contains not printable characters */
        final Cv0 f۱۲۳۷۳c;

        public Ca(Cv0 recyclerViewDelegate) {
            this.f۱۲۳۷۳c = recyclerViewDelegate;
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۶۵۳a(View host, Cc info2) {
            super.m۱۲۷۹۷a(host, info2);
            if (!this.f۱۲۳۷۳c.m۱۵۶۵۲c() && this.f۱۲۳۷۳c.f۱۲۳۷۱c.getLayoutManager() != null) {
                this.f۱۲۳۷۳c.f۱۲۳۷۱c.getLayoutManager().m۱۴۵۳۷a(host, info2);
            }
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۵۶۵۴a(View host, int action, Bundle args) {
            if (super.m۱۲۷۹۸a(host, action, args)) {
                return true;
            }
            if (this.f۱۲۳۷۳c.m۱۵۶۵۲c() || this.f۱۲۳۷۳c.f۱۲۳۷۱c.getLayoutManager() == null) {
                return false;
            }
            return this.f۱۲۳۷۳c.f۱۲۳۷۱c.getLayoutManager().m۱۴۵۵۳a(host, action, args);
        }
    }
}
