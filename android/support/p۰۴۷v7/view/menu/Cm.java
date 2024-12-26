package android.support.p۰۴۷v7.view.menu;

import android.content.Context;
import android.support.p۰۴۳v4.view.AbstractCc;
import android.support.p۰۴۷v7.view.menu.MenuItemCl;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.m  reason: invalid class name */
public class Cm extends MenuItemCl {
    Cm(Context context, AbstractMenuItemCb object) {
        super(context, object);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.p۰۴۷v7.view.menu.MenuItemCl
    /* renamed from: a  reason: contains not printable characters */
    public MenuItemCl.Ca m۱۳۹۲۹a(ActionProvider provider) {
        return new ActionProvider$VisibilityListenerCa(this, this.f۱۱۲۰۳b, provider);
    }

    /* renamed from: android.support.v7.view.menu.m$a  reason: invalid class name */
    class ActionProvider$VisibilityListenerCa extends MenuItemCl.Ca implements ActionProvider.VisibilityListener {

        /* renamed from: d  reason: contains not printable characters */
        AbstractCc.AbstractCb f۱۱۳۳۱d;

        public ActionProvider$VisibilityListenerCa(Cm this$0, Context context, ActionProvider inner) {
            super(context, inner);
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public View m۱۳۹۳۰a(MenuItem forItem) {
            return this.f۱۱۳۲۶b.onCreateActionView(forItem);
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCc
        /* renamed from: e  reason: contains not printable characters */
        public boolean m۱۳۹۳۳e() {
            return this.f۱۱۳۲۶b.overridesItemVisibility();
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۳۹۳۲b() {
            return this.f۱۱۳۲۶b.isVisible();
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۹۳۱a(AbstractCc.AbstractCb listener) {
            this.f۱۱۳۳۱d = listener;
            this.f۱۱۳۲۶b.setVisibilityListener(listener != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean isVisible) {
            AbstractCc.AbstractCb bVar = this.f۱۱۳۳۱d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(isVisible);
            }
        }
    }
}
