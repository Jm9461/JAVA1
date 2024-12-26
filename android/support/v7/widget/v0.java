package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.b;
import android.support.v4.view.d0.c;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class v0 extends b {

    /* renamed from: c  reason: collision with root package name */
    final RecyclerView f۲۲۷۴c;

    /* renamed from: d  reason: collision with root package name */
    final b f۲۲۷۵d = new a(this);

    public v0(RecyclerView recyclerView) {
        this.f۲۲۷۴c = recyclerView;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f۲۲۷۴c.j();
    }

    @Override // android.support.v4.view.b
    public boolean a(View host, int action, Bundle args) {
        if (super.a(host, action, args)) {
            return true;
        }
        if (c() || this.f۲۲۷۴c.getLayoutManager() == null) {
            return false;
        }
        return this.f۲۲۷۴c.getLayoutManager().a(action, args);
    }

    @Override // android.support.v4.view.b
    public void a(View host, c info2) {
        super.a(host, info2);
        info2.a((CharSequence) RecyclerView.class.getName());
        if (!c() && this.f۲۲۷۴c.getLayoutManager() != null) {
            this.f۲۲۷۴c.getLayoutManager().a(info2);
        }
    }

    @Override // android.support.v4.view.b
    public void b(View host, AccessibilityEvent event) {
        super.b(host, event);
        event.setClassName(RecyclerView.class.getName());
        if ((host instanceof RecyclerView) && !c()) {
            RecyclerView rv = (RecyclerView) host;
            if (rv.getLayoutManager() != null) {
                rv.getLayoutManager().a(event);
            }
        }
    }

    public b b() {
        return this.f۲۲۷۵d;
    }

    public static class a extends b {

        /* renamed from: c  reason: collision with root package name */
        final v0 f۲۲۷۶c;

        public a(v0 recyclerViewDelegate) {
            this.f۲۲۷۶c = recyclerViewDelegate;
        }

        @Override // android.support.v4.view.b
        public void a(View host, c info2) {
            super.a(host, info2);
            if (!this.f۲۲۷۶c.c() && this.f۲۲۷۶c.f۲۲۷۴c.getLayoutManager() != null) {
                this.f۲۲۷۶c.f۲۲۷۴c.getLayoutManager().a(host, info2);
            }
        }

        @Override // android.support.v4.view.b
        public boolean a(View host, int action, Bundle args) {
            if (super.a(host, action, args)) {
                return true;
            }
            if (this.f۲۲۷۶c.c() || this.f۲۲۷۶c.f۲۲۷۴c.getLayoutManager() == null) {
                return false;
            }
            return this.f۲۲۷۶c.f۲۲۷۴c.getLayoutManager().a(host, action, args);
        }
    }
}
