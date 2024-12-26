package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertController;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca;

/* renamed from: android.support.v7.app.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class DialogInterfaceCd extends DialogCi implements DialogInterface {

    /* renamed from: e, reason: contains not printable characters */
    final AlertController f۱۰۹۷۳e;

    protected DialogInterfaceCd(Context context, int themeResId) {
        super(context, m۱۱۳۹۸a(context, themeResId));
        this.f۱۰۹۷۳e = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: a, reason: contains not printable characters */
    static int m۱۱۳۹۸a(Context context, int resid) {
        if (((resid >>> 24) & 255) >= 1) {
            return resid;
        }
        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(Ca.alertDialogTheme, outValue, true);
        return outValue.resourceId;
    }

    @Override // android.support.v7.app.DialogCi, android.app.Dialog
    public void setTitle(CharSequence title) {
        super.setTitle(title);
        this.f۱۰۹۷۳e.m۱۱۳۳۱b(title);
    }

    @Override // android.support.v7.app.DialogCi, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f۱۰۹۷۳e.m۱۱۳۲۲a();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (this.f۱۰۹۷۳e.m۱۱۳۲۸a(keyCode, event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (this.f۱۰۹۷۳e.m۱۱۳۳۲b(keyCode, event)) {
            return true;
        }
        return super.onKeyUp(keyCode, event);
    }

    /* renamed from: android.support.v7.app.d$a */
    public static class a {

        /* renamed from: a, reason: contains not printable characters */
        private final AlertController.Cf f۱۰۹۷۴a;

        /* renamed from: b, reason: contains not printable characters */
        private final int f۱۰۹۷۵b;

        public a(Context context) {
            this(context, DialogInterfaceCd.m۱۱۳۹۸a(context, 0));
        }

        public a(Context context, int themeResId) {
            this.f۱۰۹۷۴a = new AlertController.Cf(new ContextThemeWrapper(context, DialogInterfaceCd.m۱۱۳۹۸a(context, themeResId)));
            this.f۱۰۹۷۵b = themeResId;
        }

        /* renamed from: b, reason: contains not printable characters */
        public Context m۱۱۴۰۵b() {
            return this.f۱۰۹۷۴a.f۱۰۹۱۰a;
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۱۴۰۳a(CharSequence title) {
            this.f۱۰۹۷۴a.f۱۰۹۱۵f = title;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۱۴۰۱a(View customTitleView) {
            this.f۱۰۹۷۴a.f۱۰۹۱۶g = customTitleView;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۱۴۰۰a(Drawable icon) {
            this.f۱۰۹۷۴a.f۱۰۹۱۳d = icon;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۱۳۹۹a(DialogInterface.OnKeyListener onKeyListener) {
            this.f۱۰۹۷۴a.f۱۰۹۳۰u = onKeyListener;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۱۴۰۲a(ListAdapter adapter, DialogInterface.OnClickListener listener) {
            AlertController.Cf cf = this.f۱۰۹۷۴a;
            cf.f۱۰۹۳۲w = adapter;
            cf.f۱۰۹۳۳x = listener;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public DialogInterfaceCd m۱۱۴۰۴a() {
            DialogInterfaceCd dialog = new DialogInterfaceCd(this.f۱۰۹۷۴a.f۱۰۹۱۰a, this.f۱۰۹۷۵b);
            this.f۱۰۹۷۴a.m۱۱۳۳۷a(dialog.f۱۰۹۷۳e);
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
