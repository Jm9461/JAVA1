package p۲۰۸b.p۲۰۹a.p۲۱۰a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* renamed from: b.a.a.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class DialogCc extends Dialog implements DialogInterface.OnShowListener {

    /* renamed from: c, reason: contains not printable characters */
    protected MDRootLayout f۱۲۴۵۹c;

    /* renamed from: d, reason: contains not printable characters */
    private DialogInterface.OnShowListener f۱۲۴۶۰d;

    DialogCc(Context context, int theme) {
        super(context, theme);
    }

    @Override // android.app.Dialog
    public View findViewById(int id) {
        return this.f۱۲۴۵۹c.findViewById(id);
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener listener) {
        this.f۱۲۴۶۰d = listener;
    }

    /* renamed from: a, reason: contains not printable characters */
    final void m۱۳۷۴۳a() {
        super.setOnShowListener(this);
    }

    /* renamed from: a, reason: contains not printable characters */
    final void m۱۳۷۴۴a(View view) {
        super.setContentView(view);
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialog) {
        DialogInterface.OnShowListener onShowListener = this.f۱۲۴۶۰d;
        if (onShowListener != null) {
            onShowListener.onShow(dialog);
        }
    }

    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(int layoutResID) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(View view) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }
}
