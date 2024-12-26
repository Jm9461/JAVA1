package android.support.v7.view.menu;

import a.b.g.b.a.b;
import android.content.Context;
import android.support.v4.view.c;
import android.support.v7.view.menu.l;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* access modifiers changed from: package-private */
public class m extends l {
    m(Context context, b object) {
        super(context, object);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.v7.view.menu.l
    public l.a a(ActionProvider provider) {
        return new a(this, this.f۱۶۶۷b, provider);
    }

    class a extends l.a implements ActionProvider.VisibilityListener {

        /* renamed from: d  reason: collision with root package name */
        c.b f۱۷۲۷d;

        public a(m this$0, Context context, ActionProvider inner) {
            super(context, inner);
        }

        @Override // android.support.v4.view.c
        public View a(MenuItem forItem) {
            return this.f۱۷۲۲b.onCreateActionView(forItem);
        }

        @Override // android.support.v4.view.c
        public boolean e() {
            return this.f۱۷۲۲b.overridesItemVisibility();
        }

        @Override // android.support.v4.view.c
        public boolean b() {
            return this.f۱۷۲۲b.isVisible();
        }

        @Override // android.support.v4.view.c
        public void a(c.b listener) {
            this.f۱۷۲۷d = listener;
            this.f۱۷۲۲b.setVisibilityListener(listener != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean isVisible) {
            c.b bVar = this.f۱۷۲۷d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(isVisible);
            }
        }
    }
}
