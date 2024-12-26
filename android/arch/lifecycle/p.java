package android.arch.lifecycle;

import java.util.HashMap;

public class p {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, n> f۵۵۶a = new HashMap<>();

    /* access modifiers changed from: package-private */
    public final void a(String key, n viewModel) {
        n oldViewModel = this.f۵۵۶a.put(key, viewModel);
        if (oldViewModel != null) {
            oldViewModel.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final n a(String key) {
        return this.f۵۵۶a.get(key);
    }

    public final void a() {
        for (n vm : this.f۵۵۶a.values()) {
            vm.a();
        }
        this.f۵۵۶a.clear();
    }
}
