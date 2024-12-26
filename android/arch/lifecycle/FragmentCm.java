package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.AbstractCc;
import android.os.Bundle;

/* renamed from: android.arch.lifecycle.m  reason: invalid class name */
public class FragmentCm extends Fragment {

    /* renamed from: c  reason: contains not printable characters */
    private AbstractCa f۸۹۹۷c;

    /* access modifiers changed from: package-private */
    /* renamed from: android.arch.lifecycle.m$a  reason: invalid class name */
    public interface AbstractCa {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۰۹۲۵a();

        /* renamed from: b  reason: contains not printable characters */
        void m۱۰۹۲۶b();

        /* renamed from: c  reason: contains not printable characters */
        void m۱۰۹۲۷c();
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۰۹۲۰a(Activity activity) {
        FragmentManager manager = activity.getFragmentManager();
        if (manager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            manager.beginTransaction().add(new FragmentCm(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            manager.executePendingTransactions();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۹۲۲a(AbstractCa listener) {
        if (listener != null) {
            listener.m۱۰۹۲۵a();
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۰۹۲۴c(AbstractCa listener) {
        if (listener != null) {
            listener.m۱۰۹۲۷c();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۰۹۲۳b(AbstractCa listener) {
        if (listener != null) {
            listener.m۱۰۹۲۶b();
        }
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        m۱۰۹۲۲a(this.f۸۹۹۷c);
        m۱۰۹۲۱a(AbstractCc.EnumCa.ON_CREATE);
    }

    public void onStart() {
        super.onStart();
        m۱۰۹۲۴c(this.f۸۹۹۷c);
        m۱۰۹۲۱a(AbstractCc.EnumCa.ON_START);
    }

    public void onResume() {
        super.onResume();
        m۱۰۹۲۳b(this.f۸۹۹۷c);
        m۱۰۹۲۱a(AbstractCc.EnumCa.ON_RESUME);
    }

    public void onPause() {
        super.onPause();
        m۱۰۹۲۱a(AbstractCc.EnumCa.ON_PAUSE);
    }

    public void onStop() {
        super.onStop();
        m۱۰۹۲۱a(AbstractCc.EnumCa.ON_STOP);
    }

    public void onDestroy() {
        super.onDestroy();
        m۱۰۹۲۱a(AbstractCc.EnumCa.ON_DESTROY);
        this.f۸۹۹۷c = null;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۹۲۱a(AbstractCc.EnumCa event) {
        Activity activity = getActivity();
        if (activity instanceof AbstractCg) {
            ((AbstractCg) activity).m۱۰۹۱۰a().m۱۰۹۰۵a(event);
        } else if (activity instanceof AbstractCe) {
            AbstractCc lifecycle = ((AbstractCe) activity).m۱۰۸۹۱a();
            if (lifecycle instanceof Cf) {
                ((Cf) lifecycle).m۱۰۹۰۵a(event);
            }
        }
    }
}
