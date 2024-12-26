package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.c;
import android.os.Bundle;

public class m extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private a f۵۵۳c;

    /* access modifiers changed from: package-private */
    public interface a {
        void a();

        void b();

        void c();
    }

    public static void a(Activity activity) {
        FragmentManager manager = activity.getFragmentManager();
        if (manager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            manager.beginTransaction().add(new m(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            manager.executePendingTransactions();
        }
    }

    private void a(a listener) {
        if (listener != null) {
            listener.a();
        }
    }

    private void c(a listener) {
        if (listener != null) {
            listener.c();
        }
    }

    private void b(a listener) {
        if (listener != null) {
            listener.b();
        }
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        a(this.f۵۵۳c);
        a(c.a.ON_CREATE);
    }

    public void onStart() {
        super.onStart();
        c(this.f۵۵۳c);
        a(c.a.ON_START);
    }

    public void onResume() {
        super.onResume();
        b(this.f۵۵۳c);
        a(c.a.ON_RESUME);
    }

    public void onPause() {
        super.onPause();
        a(c.a.ON_PAUSE);
    }

    public void onStop() {
        super.onStop();
        a(c.a.ON_STOP);
    }

    public void onDestroy() {
        super.onDestroy();
        a(c.a.ON_DESTROY);
        this.f۵۵۳c = null;
    }

    private void a(c.a event) {
        Activity activity = getActivity();
        if (activity instanceof g) {
            ((g) activity).a().a(event);
        } else if (activity instanceof e) {
            c lifecycle = ((e) activity).a();
            if (lifecycle instanceof f) {
                ((f) lifecycle).a(event);
            }
        }
    }
}
