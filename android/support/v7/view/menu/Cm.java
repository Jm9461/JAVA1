package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.view.AbstractCc;
import android.support.v7.view.menu.MenuItemCl;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb;

/* renamed from: android.support.v7.view.menu.m, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cm extends MenuItemCl {
    Cm(Context context, InterfaceMenuItemCb object) {
        super(context, object);
    }

    @Override // android.support.v7.view.menu.MenuItemCl
    /* renamed from: a, reason: contains not printable characters */
    MenuItemCl.a mo۱۱۸۵۹a(ActionProvider provider) {
        return new a(this, this.f۱۱۲۰۳b, provider);
    }

    /* renamed from: android.support.v7.view.menu.m$a */
    class a extends MenuItemCl.a implements ActionProvider.VisibilityListener {

        /* renamed from: d, reason: contains not printable characters */
        AbstractCc.b f۱۱۳۳۱d;

        public a(Cm this$0, Context context, ActionProvider inner) {
            super(context, inner);
        }

        @Override // android.support.v4.view.AbstractCc
        /* renamed from: a, reason: contains not printable characters */
        public View mo۱۱۸۶۰a(MenuItem forItem) {
            return this.f۱۱۳۲۶b.onCreateActionView(forItem);
        }

        @Override // android.support.v4.view.AbstractCc
        /* renamed from: e, reason: contains not printable characters */
        public boolean mo۱۱۸۶۳e() {
            return this.f۱۱۳۲۶b.overridesItemVisibility();
        }

        @Override // android.support.v4.view.AbstractCc
        /* renamed from: b, reason: contains not printable characters */
        public boolean mo۱۱۸۶۲b() {
            return this.f۱۱۳۲۶b.isVisible();
        }

        @Override // android.support.v4.view.AbstractCc
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۱۸۶۱a(AbstractCc.b listener) {
            this.f۱۱۳۳۱d = listener;
            this.f۱۱۳۲۶b.setVisibilityListener(listener != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean isVisible) {
            AbstractCc.b bVar = this.f۱۱۳۳۱d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(isVisible);
            }
        }
    }
}
