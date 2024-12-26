package p۰۵۲b.p۰۵۳a.p۰۵۴a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.c  reason: invalid class name */
public class DialogCc extends Dialog implements DialogInterface.OnShowListener {

    /* renamed from: c  reason: contains not printable characters */
    protected MDRootLayout f۱۲۴۵۹c;

    /* renamed from: d  reason: contains not printable characters */
    private DialogInterface.OnShowListener f۱۲۴۶۰d;

    DialogCc(Context context, int theme) {
        super(context, theme);
    }

    @Override // android.app.Dialog
    public View findViewById(int id) {
        return this.f۱۲۴۵۹c.findViewById(id);
    }

    public final void setOnShowListener(DialogInterface.OnShowListener listener) {
        this.f۱۲۴۶۰d = listener;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۵۸۱۳a() {
        super.setOnShowListener(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۵۸۱۴a(View view) {
        super.setContentView(view);
    }

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

    @Deprecated
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }
}
