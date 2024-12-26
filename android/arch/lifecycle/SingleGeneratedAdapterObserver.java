package android.arch.lifecycle;

import android.arch.lifecycle.AbstractCc;

public class SingleGeneratedAdapterObserver implements GenericLifecycleObserver {

    /* renamed from: a  reason: contains not printable characters */
    private final AbstractCb f۸۹۷۰a;

    SingleGeneratedAdapterObserver(AbstractCb generatedAdapter) {
        this.f۸۹۷۰a = generatedAdapter;
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۸۷۷a(AbstractCe source, AbstractCc.EnumCa event) {
        this.f۸۹۷۰a.m۱۰۸۸۶a(source, event, false, null);
        this.f۸۹۷۰a.m۱۰۸۸۶a(source, event, true, null);
    }
}
