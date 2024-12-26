package b.a.a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* access modifiers changed from: package-private */
public class c extends Dialog implements DialogInterface.OnShowListener {

    /* renamed from: c  reason: collision with root package name */
    protected MDRootLayout f۲۳۳۹c;

    /* renamed from: d  reason: collision with root package name */
    private DialogInterface.OnShowListener f۲۳۴۰d;

    c(Context context, int theme) {
        super(context, theme);
    }

    @Override // android.app.Dialog
    public View findViewById(int id) {
        return this.f۲۳۳۹c.findViewById(id);
    }

    public final void setOnShowListener(DialogInterface.OnShowListener listener) {
        this.f۲۳۴۰d = listener;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        super.setOnShowListener(this);
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        super.setContentView(view);
    }

    public void onShow(DialogInterface dialog) {
        DialogInterface.OnShowListener onShowListener = this.f۲۳۴۰d;
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
