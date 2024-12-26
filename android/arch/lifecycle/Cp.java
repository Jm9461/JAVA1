package android.arch.lifecycle;

import java.util.HashMap;

/* renamed from: android.arch.lifecycle.p  reason: invalid class name */
public class Cp {

    /* renamed from: a  reason: contains not printable characters */
    private final HashMap<String, AbstractCn> f۹۰۰۰a = new HashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۰۹۳۴a(String key, AbstractCn viewModel) {
        AbstractCn oldViewModel = this.f۹۰۰۰a.put(key, viewModel);
        if (oldViewModel != null) {
            oldViewModel.m۱۰۹۲۸a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final AbstractCn m۱۰۹۳۲a(String key) {
        return this.f۹۰۰۰a.get(key);
    }

    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۰۹۳۳a() {
        for (AbstractCn vm : this.f۹۰۰۰a.values()) {
            vm.m۱۰۹۲۸a();
        }
        this.f۹۰۰۰a.clear();
    }
}
