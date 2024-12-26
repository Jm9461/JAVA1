package android.support.v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class e extends f implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    int a0 = 0;
    int b0 = 0;
    boolean c0 = true;
    boolean d0 = true;
    int e0 = -1;
    Dialog f0;
    boolean g0;
    boolean h0;
    boolean i0;

    public void a(k manager, String tag) {
        this.h0 = false;
        this.i0 = true;
        q ft = manager.a();
        ft.a(this, tag);
        ft.a();
    }

    public void d0() {
        i(false);
    }

    /* access modifiers changed from: package-private */
    public void i(boolean allowStateLoss) {
        if (!this.h0) {
            this.h0 = true;
            this.i0 = false;
            Dialog dialog = this.f0;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.g0 = true;
            if (this.e0 >= 0) {
                p().a(this.e0, 1);
                this.e0 = -1;
                return;
            }
            q ft = p().a();
            ft.a(this);
            if (allowStateLoss) {
                ft.b();
            } else {
                ft.a();
            }
        }
    }

    public Dialog e0() {
        return this.f0;
    }

    public int f0() {
        return this.b0;
    }

    @Override // android.support.v4.app.f
    public void a(Context context) {
        super.a(context);
        if (!this.i0) {
            this.h0 = false;
        }
    }

    @Override // android.support.v4.app.f
    public void N() {
        super.N();
        if (!this.i0 && !this.h0) {
            this.h0 = true;
        }
    }

    @Override // android.support.v4.app.f
    public void c(Bundle savedInstanceState) {
        super.c(savedInstanceState);
        this.d0 = this.A == 0;
        if (savedInstanceState != null) {
            this.a0 = savedInstanceState.getInt("android:style", 0);
            this.b0 = savedInstanceState.getInt("android:theme", 0);
            this.c0 = savedInstanceState.getBoolean("android:cancelable", true);
            this.d0 = savedInstanceState.getBoolean("android:showsDialog", this.d0);
            this.e0 = savedInstanceState.getInt("android:backStackId", -1);
        }
    }

    @Override // android.support.v4.app.f
    public LayoutInflater d(Bundle savedInstanceState) {
        if (!this.d0) {
            return super.d(savedInstanceState);
        }
        this.f0 = n(savedInstanceState);
        Dialog dialog = this.f0;
        if (dialog == null) {
            return (LayoutInflater) this.u.c().getSystemService("layout_inflater");
        }
        a(dialog, this.a0);
        return (LayoutInflater) this.f0.getContext().getSystemService("layout_inflater");
    }

    public void a(Dialog dialog, int style) {
        if (!(style == 1 || style == 2)) {
            if (style == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public Dialog n(Bundle savedInstanceState) {
        return new Dialog(d(), f0());
    }

    public void onCancel(DialogInterface dialog) {
    }

    public void onDismiss(DialogInterface dialog) {
        if (!this.g0) {
            i(true);
        }
    }

    @Override // android.support.v4.app.f
    public void b(Bundle savedInstanceState) {
        Bundle dialogState;
        super.b(savedInstanceState);
        if (this.d0) {
            View view = A();
            if (view != null) {
                if (view.getParent() == null) {
                    this.f0.setContentView(view);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            Activity activity = d();
            if (activity != null) {
                this.f0.setOwnerActivity(activity);
            }
            this.f0.setCancelable(this.c0);
            this.f0.setOnCancelListener(this);
            this.f0.setOnDismissListener(this);
            if (savedInstanceState != null && (dialogState = savedInstanceState.getBundle("android:savedDialogState")) != null) {
                this.f0.onRestoreInstanceState(dialogState);
            }
        }
    }

    @Override // android.support.v4.app.f
    public void Q() {
        super.Q();
        Dialog dialog = this.f0;
        if (dialog != null) {
            this.g0 = false;
            dialog.show();
        }
    }

    @Override // android.support.v4.app.f
    public void e(Bundle outState) {
        Bundle dialogState;
        super.e(outState);
        Dialog dialog = this.f0;
        if (!(dialog == null || (dialogState = dialog.onSaveInstanceState()) == null)) {
            outState.putBundle("android:savedDialogState", dialogState);
        }
        int i = this.a0;
        if (i != 0) {
            outState.putInt("android:style", i);
        }
        int i2 = this.b0;
        if (i2 != 0) {
            outState.putInt("android:theme", i2);
        }
        boolean z = this.c0;
        if (!z) {
            outState.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.d0;
        if (!z2) {
            outState.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.e0;
        if (i3 != -1) {
            outState.putInt("android:backStackId", i3);
        }
    }

    @Override // android.support.v4.app.f
    public void R() {
        super.R();
        Dialog dialog = this.f0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // android.support.v4.app.f
    public void M() {
        super.M();
        Dialog dialog = this.f0;
        if (dialog != null) {
            this.g0 = true;
            dialog.dismiss();
            this.f0 = null;
        }
    }
}
