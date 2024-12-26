package android.arch.lifecycle;

import android.arch.lifecycle.AbstractCc;
import android.arch.lifecycle.Ca;

class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {

    /* renamed from: a  reason: contains not printable characters */
    private final Object f۸۹۶۸a;

    /* renamed from: b  reason: contains not printable characters */
    private final Ca.Ca f۸۹۶۹b = Ca.f۸۹۷۱c.m۱۰۸۸۱a(this.f۸۹۶۸a.getClass());

    ReflectiveGenericLifecycleObserver(Object wrapped) {
        this.f۸۹۶۸a = wrapped;
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۸۷۶a(AbstractCe source, AbstractCc.EnumCa event) {
        this.f۸۹۶۹b.m۱۰۸۸۴a(source, event, this.f۸۹۶۸a);
    }
}
