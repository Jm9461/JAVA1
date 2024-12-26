package g;

import android.os.Handler;
import android.os.Looper;

/* access modifiers changed from: package-private */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f۴۲۳۹a = new Handler(Looper.getMainLooper());

    h() {
    }

    public void a(Runnable runnable) {
        f۴۲۳۹a.post(runnable);
    }
}
