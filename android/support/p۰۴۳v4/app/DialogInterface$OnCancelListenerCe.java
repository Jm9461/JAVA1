package android.support.p۰۴۳v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: android.support.v4.app.e  reason: invalid class name */
public class DialogInterface$OnCancelListenerCe extends ComponentCallbacksCf implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a0  reason: contains not printable characters */
    int f۱۰۱۲۰a0 = 0;

    /* renamed from: b0  reason: contains not printable characters */
    int f۱۰۱۲۱b0 = 0;

    /* renamed from: c0  reason: contains not printable characters */
    boolean f۱۰۱۲۲c0 = true;

    /* renamed from: d0  reason: contains not printable characters */
    boolean f۱۰۱۲۳d0 = true;

    /* renamed from: e0  reason: contains not printable characters */
    int f۱۰۱۲۴e0 = -1;

    /* renamed from: f0  reason: contains not printable characters */
    Dialog f۱۰۱۲۵f0;

    /* renamed from: g0  reason: contains not printable characters */
    boolean f۱۰۱۲۶g0;

    /* renamed from: h0  reason: contains not printable characters */
    boolean f۱۰۱۲۷h0;

    /* renamed from: i0  reason: contains not printable characters */
    boolean f۱۰۱۲۸i0;

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۱۰a(AbstractCk manager, String tag) {
        this.f۱۰۱۲۷h0 = false;
        this.f۱۰۱۲۸i0 = true;
        AbstractCq ft = manager.m۱۲۳۲۰a();
        ft.m۱۲۴۷۹a(this, tag);
        ft.m۱۲۴۷۵a();
    }

    /* renamed from: d0  reason: contains not printable characters */
    public void m۱۲۱۱۴d0() {
        m۱۲۱۱۸i(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i  reason: contains not printable characters */
    public void m۱۲۱۱۸i(boolean allowStateLoss) {
        if (!this.f۱۰۱۲۷h0) {
            this.f۱۰۱۲۷h0 = true;
            this.f۱۰۱۲۸i0 = false;
            Dialog dialog = this.f۱۰۱۲۵f0;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.f۱۰۱۲۶g0 = true;
            if (this.f۱۰۱۲۴e0 >= 0) {
                m۱۲۲۲۷p().m۱۲۳۲۱a(this.f۱۰۱۲۴e0, 1);
                this.f۱۰۱۲۴e0 = -1;
                return;
            }
            AbstractCq ft = m۱۲۲۲۷p().m۱۲۳۲۰a();
            ft.m۱۲۴۷۸a(this);
            if (allowStateLoss) {
                ft.m۱۲۴۸۰b();
            } else {
                ft.m۱۲۴۷۵a();
            }
        }
    }

    /* renamed from: e0  reason: contains not printable characters */
    public Dialog m۱۲۱۱۶e0() {
        return this.f۱۰۱۲۵f0;
    }

    /* renamed from: f0  reason: contains not printable characters */
    public int m۱۲۱۱۷f0() {
        return this.f۱۰۱۲۱b0;
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۰۹a(Context context) {
        super.m۱۲۱۶۳a(context);
        if (!this.f۱۰۱۲۸i0) {
            this.f۱۰۱۲۷h0 = false;
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: N  reason: contains not printable characters */
    public void m۱۲۱۰۵N() {
        super.m۱۲۱۳۸N();
        if (!this.f۱۰۱۲۸i0 && !this.f۱۰۱۲۷h0) {
            this.f۱۰۱۲۷h0 = true;
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۱۱۲c(Bundle savedInstanceState) {
        super.m۱۲۱۹۲c(savedInstanceState);
        this.f۱۰۱۲۳d0 = this.f۱۰۱۳۲A == 0;
        if (savedInstanceState != null) {
            this.f۱۰۱۲۰a0 = savedInstanceState.getInt("android:style", 0);
            this.f۱۰۱۲۱b0 = savedInstanceState.getInt("android:theme", 0);
            this.f۱۰۱۲۲c0 = savedInstanceState.getBoolean("android:cancelable", true);
            this.f۱۰۱۲۳d0 = savedInstanceState.getBoolean("android:showsDialog", this.f۱۰۱۲۳d0);
            this.f۱۰۱۲۴e0 = savedInstanceState.getInt("android:backStackId", -1);
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: d  reason: contains not printable characters */
    public LayoutInflater m۱۲۱۱۳d(Bundle savedInstanceState) {
        if (!this.f۱۰۱۲۳d0) {
            return super.m۱۲۱۹۸d(savedInstanceState);
        }
        this.f۱۰۱۲۵f0 = m۱۲۱۱۹n(savedInstanceState);
        Dialog dialog = this.f۱۰۱۲۵f0;
        if (dialog == null) {
            return (LayoutInflater) this.f۱۰۱۷۴u.m۱۲۳۱۰c().getSystemService("layout_inflater");
        }
        m۱۲۱۰۸a(dialog, this.f۱۰۱۲۰a0);
        return (LayoutInflater) this.f۱۰۱۲۵f0.getContext().getSystemService("layout_inflater");
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۱۰۸a(Dialog dialog, int style) {
        if (!(style == 1 || style == 2)) {
            if (style == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: n  reason: contains not printable characters */
    public Dialog m۱۲۱۱۹n(Bundle savedInstanceState) {
        return new Dialog(m۱۲۱۹۷d(), m۱۲۱۱۷f0());
    }

    public void onCancel(DialogInterface dialog) {
    }

    public void onDismiss(DialogInterface dialog) {
        if (!this.f۱۰۱۲۶g0) {
            m۱۲۱۱۸i(true);
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۱۱۱b(Bundle savedInstanceState) {
        Bundle dialogState;
        super.m۱۲۱۸۳b(savedInstanceState);
        if (this.f۱۰۱۲۳d0) {
            View view = m۱۲۱۲۵A();
            if (view != null) {
                if (view.getParent() == null) {
                    this.f۱۰۱۲۵f0.setContentView(view);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            Activity activity = m۱۲۱۹۷d();
            if (activity != null) {
                this.f۱۰۱۲۵f0.setOwnerActivity(activity);
            }
            this.f۱۰۱۲۵f0.setCancelable(this.f۱۰۱۲۲c0);
            this.f۱۰۱۲۵f0.setOnCancelListener(this);
            this.f۱۰۱۲۵f0.setOnDismissListener(this);
            if (savedInstanceState != null && (dialogState = savedInstanceState.getBundle("android:savedDialogState")) != null) {
                this.f۱۰۱۲۵f0.onRestoreInstanceState(dialogState);
            }
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: Q  reason: contains not printable characters */
    public void m۱۲۱۰۶Q() {
        super.m۱۲۱۴۱Q();
        Dialog dialog = this.f۱۰۱۲۵f0;
        if (dialog != null) {
            this.f۱۰۱۲۶g0 = false;
            dialog.show();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۲۱۱۵e(Bundle outState) {
        Bundle dialogState;
        super.m۱۲۲۰۳e(outState);
        Dialog dialog = this.f۱۰۱۲۵f0;
        if (!(dialog == null || (dialogState = dialog.onSaveInstanceState()) == null)) {
            outState.putBundle("android:savedDialogState", dialogState);
        }
        int i = this.f۱۰۱۲۰a0;
        if (i != 0) {
            outState.putInt("android:style", i);
        }
        int i2 = this.f۱۰۱۲۱b0;
        if (i2 != 0) {
            outState.putInt("android:theme", i2);
        }
        boolean z = this.f۱۰۱۲۲c0;
        if (!z) {
            outState.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f۱۰۱۲۳d0;
        if (!z2) {
            outState.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f۱۰۱۲۴e0;
        if (i3 != -1) {
            outState.putInt("android:backStackId", i3);
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: R  reason: contains not printable characters */
    public void m۱۲۱۰۷R() {
        super.m۱۲۱۴۲R();
        Dialog dialog = this.f۱۰۱۲۵f0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // android.support.p۰۴۳v4.app.ComponentCallbacksCf
    /* renamed from: M  reason: contains not printable characters */
    public void m۱۲۱۰۴M() {
        super.m۱۲۱۳۷M();
        Dialog dialog = this.f۱۰۱۲۵f0;
        if (dialog != null) {
            this.f۱۰۱۲۶g0 = true;
            dialog.dismiss();
            this.f۱۰۱۲۵f0 = null;
        }
    }
}
