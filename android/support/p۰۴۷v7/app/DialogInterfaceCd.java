package android.support.p۰۴۷v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p۰۴۷v7.app.AlertController;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;

/* renamed from: android.support.v7.app.d  reason: invalid class name */
public class DialogInterfaceCd extends DialogCi implements DialogInterface {

    /* renamed from: e  reason: contains not printable characters */
    final AlertController f۱۰۹۷۳e = new AlertController(getContext(), this, getWindow());

    protected DialogInterfaceCd(Context context, int themeResId) {
        super(context, m۱۳۴۶۸a(context, themeResId));
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۳۴۶۸a(Context context, int resid) {
        if (((resid >>> 24) & 255) >= 1) {
            return resid;
        }
        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.alertDialogTheme, outValue, true);
        return outValue.resourceId;
    }

    @Override // android.support.p۰۴۷v7.app.DialogCi, android.app.Dialog
    public void setTitle(CharSequence title) {
        super.setTitle(title);
        this.f۱۰۹۷۳e.m۱۳۴۰۱b(title);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۷v7.app.DialogCi
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f۱۰۹۷۳e.m۱۳۳۹۲a();
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (this.f۱۰۹۷۳e.m۱۳۳۹۸a(keyCode, event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (this.f۱۰۹۷۳e.m۱۳۴۰۲b(keyCode, event)) {
            return true;
        }
        return super.onKeyUp(keyCode, event);
    }

    /* renamed from: android.support.v7.app.d$a  reason: invalid class name */
    public static class Ca {

        /* renamed from: a  reason: contains not printable characters */
        private final AlertController.Cf f۱۰۹۷۴a;

        /* renamed from: b  reason: contains not printable characters */
        private final int f۱۰۹۷۵b;

        public Ca(Context context) {
            this(context, DialogInterfaceCd.m۱۳۴۶۸a(context, 0));
        }

        public Ca(Context context, int themeResId) {
            this.f۱۰۹۷۴a = new AlertController.Cf(new ContextThemeWrapper(context, DialogInterfaceCd.m۱۳۴۶۸a(context, themeResId)));
            this.f۱۰۹۷۵b = themeResId;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Context m۱۳۴۷۵b() {
            return this.f۱۰۹۷۴a.f۱۰۹۱۰a;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۳۴۷۳a(CharSequence title) {
            this.f۱۰۹۷۴a.f۱۰۹۱۵f = title;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۳۴۷۱a(View customTitleView) {
            this.f۱۰۹۷۴a.f۱۰۹۱۶g = customTitleView;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۳۴۷۰a(Drawable icon) {
            this.f۱۰۹۷۴a.f۱۰۹۱۳d = icon;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۳۴۶۹a(DialogInterface.OnKeyListener onKeyListener) {
            this.f۱۰۹۷۴a.f۱۰۹۳۰u = onKeyListener;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۳۴۷۲a(ListAdapter adapter, DialogInterface.OnClickListener listener) {
            AlertController.Cf fVar = this.f۱۰۹۷۴a;
            fVar.f۱۰۹۳۲w = adapter;
            fVar.f۱۰۹۳۳x = listener;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public DialogInterfaceCd m۱۳۴۷۴a() {
            DialogInterfaceCd dialog = new DialogInterfaceCd(this.f۱۰۹۷۴a.f۱۰۹۱۰a, this.f۱۰۹۷۵b);
            this.f۱۰۹۷۴a.m۱۳۴۰۷a(dialog.f۱۰۹۷۳e);
            dialog.setCancelable(this.f۱۰۹۷۴a.f۱۰۹۲۷r);
            if (this.f۱۰۹۷۴a.f۱۰۹۲۷r) {
                dialog.setCanceledOnTouchOutside(true);
            }
            dialog.setOnCancelListener(this.f۱۰۹۷۴a.f۱۰۹۲۸s);
            dialog.setOnDismissListener(this.f۱۰۹۷۴a.f۱۰۹۲۹t);
            DialogInterface.OnKeyListener onKeyListener = this.f۱۰۹۷۴a.f۱۰۹۳۰u;
            if (onKeyListener != null) {
                dialog.setOnKeyListener(onKeyListener);
            }
            return dialog;
        }
    }
}
