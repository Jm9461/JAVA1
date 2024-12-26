package android.support.v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: android.support.v4.app.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class DialogInterfaceOnCancelListenerCe extends ComponentCallbacksCf implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a0, reason: contains not printable characters */
    int f۱۰۱۲۰a0 = 0;

    /* renamed from: b0, reason: contains not printable characters */
    int f۱۰۱۲۱b0 = 0;

    /* renamed from: c0, reason: contains not printable characters */
    boolean f۱۰۱۲۲c0 = true;

    /* renamed from: d0, reason: contains not printable characters */
    boolean f۱۰۱۲۳d0 = true;

    /* renamed from: e0, reason: contains not printable characters */
    int f۱۰۱۲۴e0 = -1;

    /* renamed from: f0, reason: contains not printable characters */
    Dialog f۱۰۱۲۵f0;

    /* renamed from: g0, reason: contains not printable characters */
    boolean f۱۰۱۲۶g0;

    /* renamed from: h0, reason: contains not printable characters */
    boolean f۱۰۱۲۷h0;

    /* renamed from: i0, reason: contains not printable characters */
    boolean f۱۰۱۲۸i0;

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۰۴۰a(AbstractCk manager, String tag) {
        this.f۱۰۱۲۷h0 = false;
        this.f۱۰۱۲۸i0 = true;
        AbstractCq ft = manager.mo۱۰۳۰۶a();
        ft.mo۱۰۴۰۹a(this, tag);
        ft.mo۱۰۴۰۵a();
    }

    /* renamed from: d0, reason: contains not printable characters */
    public void m۱۰۰۴۴d0() {
        m۱۰۰۴۸i(false);
    }

    /* renamed from: i, reason: contains not printable characters */
    void m۱۰۰۴۸i(boolean allowStateLoss) {
        if (this.f۱۰۱۲۷h0) {
            return;
        }
        this.f۱۰۱۲۷h0 = true;
        this.f۱۰۱۲۸i0 = false;
        Dialog dialog = this.f۱۰۱۲۵f0;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.f۱۰۱۲۶g0 = true;
        if (this.f۱۰۱۲۴e0 >= 0) {
            m۱۰۱۵۷p().mo۱۰۳۰۷a(this.f۱۰۱۲۴e0, 1);
            this.f۱۰۱۲۴e0 = -1;
            return;
        }
        AbstractCq ft = m۱۰۱۵۷p().mo۱۰۳۰۶a();
        ft.mo۱۰۴۰۸a(this);
        if (allowStateLoss) {
            ft.mo۱۰۴۱۰b();
        } else {
            ft.mo۱۰۴۰۵a();
        }
    }

    /* renamed from: e0, reason: contains not printable characters */
    public Dialog m۱۰۰۴۶e0() {
        return this.f۱۰۱۲۵f0;
    }

    /* renamed from: f0, reason: contains not printable characters */
    public int m۱۰۰۴۷f0() {
        return this.f۱۰۱۲۱b0;
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۴۶۴۳a(Context context) {
        super.mo۱۴۶۴۳a(context);
        if (!this.f۱۰۱۲۸i0) {
            this.f۱۰۱۲۷h0 = false;
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: N, reason: contains not printable characters */
    public void mo۱۰۰۶۸N() {
        super.mo۱۰۰۶۸N();
        if (!this.f۱۰۱۲۸i0 && !this.f۱۰۱۲۷h0) {
            this.f۱۰۱۲۷h0 = true;
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۵۵۱۶c(Bundle savedInstanceState) {
        super.mo۱۵۵۱۶c(savedInstanceState);
        this.f۱۰۱۲۳d0 = this.f۱۰۱۳۲A == 0;
        if (savedInstanceState != null) {
            this.f۱۰۱۲۰a0 = savedInstanceState.getInt("android:style", 0);
            this.f۱۰۱۲۱b0 = savedInstanceState.getInt("android:theme", 0);
            this.f۱۰۱۲۲c0 = savedInstanceState.getBoolean("android:cancelable", true);
            this.f۱۰۱۲۳d0 = savedInstanceState.getBoolean("android:showsDialog", this.f۱۰۱۲۳d0);
            this.f۱۰۱۲۴e0 = savedInstanceState.getInt("android:backStackId", -1);
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: d, reason: contains not printable characters */
    public LayoutInflater mo۱۰۱۲۸d(Bundle savedInstanceState) {
        if (!this.f۱۰۱۲۳d0) {
            return super.mo۱۰۱۲۸d(savedInstanceState);
        }
        this.f۱۰۱۲۵f0 = mo۱۴۶۴۶n(savedInstanceState);
        Dialog dialog = this.f۱۰۱۲۵f0;
        if (dialog != null) {
            m۱۰۰۳۸a(dialog, this.f۱۰۱۲۰a0);
            return (LayoutInflater) this.f۱۰۱۲۵f0.getContext().getSystemService("layout_inflater");
        }
        return (LayoutInflater) this.f۱۰۱۷۴u.m۱۰۲۴۰c().getSystemService("layout_inflater");
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۰۳۸a(Dialog dialog, int style) {
        if (style != 1 && style != 2) {
            if (style == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: n, reason: contains not printable characters */
    public Dialog mo۱۴۶۴۶n(Bundle savedInstanceState) {
        return new Dialog(m۱۰۱۲۷d(), m۱۰۰۴۷f0());
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        if (!this.f۱۰۱۲۶g0) {
            m۱۰۰۴۸i(true);
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۰۱۱۳b(Bundle savedInstanceState) {
        Bundle dialogState;
        super.mo۱۰۱۱۳b(savedInstanceState);
        if (!this.f۱۰۱۲۳d0) {
            return;
        }
        View view = m۱۰۰۵۵A();
        if (view != null) {
            if (view.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            this.f۱۰۱۲۵f0.setContentView(view);
        }
        Activity activity = m۱۰۱۲۷d();
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

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: Q, reason: contains not printable characters */
    public void mo۱۰۰۷۱Q() {
        super.mo۱۰۰۷۱Q();
        Dialog dialog = this.f۱۰۱۲۵f0;
        if (dialog != null) {
            this.f۱۰۱۲۶g0 = false;
            dialog.show();
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: e, reason: contains not printable characters */
    public void mo۱۴۶۴۴e(Bundle outState) {
        Bundle dialogState;
        super.mo۱۴۶۴۴e(outState);
        Dialog dialog = this.f۱۰۱۲۵f0;
        if (dialog != null && (dialogState = dialog.onSaveInstanceState()) != null) {
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

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: R, reason: contains not printable characters */
    public void mo۱۰۰۷۲R() {
        super.mo۱۰۰۷۲R();
        Dialog dialog = this.f۱۰۱۲۵f0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // android.support.v4.app.ComponentCallbacksCf
    /* renamed from: M, reason: contains not printable characters */
    public void mo۱۰۰۶۷M() {
        super.mo۱۰۰۶۷M();
        Dialog dialog = this.f۱۰۱۲۵f0;
        if (dialog != null) {
            this.f۱۰۱۲۶g0 = true;
            dialog.dismiss();
            this.f۱۰۱۲۵f0 = null;
        }
    }
}
