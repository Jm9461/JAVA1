package android.arch.lifecycle;

import android.arch.lifecycle.AbstractCc;

public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {

    /* renamed from: a  reason: contains not printable characters */
    private final AbstractCb[] f۸۹۴۹a;

    CompositeGeneratedAdaptersObserver(AbstractCb[] generatedAdapters) {
        this.f۸۹۴۹a = generatedAdapters;
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۸۴۴a(AbstractCe source, AbstractCc.EnumCa event) {
        Ci logger = new Ci();
        for (AbstractCb mGenerated : this.f۸۹۴۹a) {
            mGenerated.m۱۰۸۸۶a(source, event, false, logger);
        }
        for (AbstractCb mGenerated2 : this.f۸۹۴۹a) {
            mGenerated2.m۱۰۸۸۶a(source, event, true, logger);
        }
    }
}
