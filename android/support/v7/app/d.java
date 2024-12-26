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

public class d extends i implements DialogInterface {

    /* renamed from: e  reason: collision with root package name */
    final AlertController f۱۵۴۹e = new AlertController(getContext(), this, getWindow());

    protected d(Context context, int themeResId) {
        super(context, a(context, themeResId));
    }

    static int a(Context context, int resid) {
        if (((resid >>> 24) & 255) >= 1) {
            return resid;
        }
        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.h.a.a.alertDialogTheme, outValue, true);
        return outValue.resourceId;
    }

    @Override // android.support.v7.app.i, android.app.Dialog
    public void setTitle(CharSequence title) {
        super.setTitle(title);
        this.f۱۵۴۹e.b(title);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v7.app.i
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f۱۵۴۹e.a();
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (this.f۱۵۴۹e.a(keyCode, event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (this.f۱۵۴۹e.b(keyCode, event)) {
            return true;
        }
        return super.onKeyUp(keyCode, event);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.f f۱۵۵۰a;

        /* renamed from: b  reason: collision with root package name */
        private final int f۱۵۵۱b;

        public a(Context context) {
            this(context, d.a(context, 0));
        }

        public a(Context context, int themeResId) {
            this.f۱۵۵۰a = new AlertController.f(new ContextThemeWrapper(context, d.a(context, themeResId)));
            this.f۱۵۵۱b = themeResId;
        }

        public Context b() {
            return this.f۱۵۵۰a.f۱۵۰۵a;
        }

        public a a(CharSequence title) {
            this.f۱۵۵۰a.f۱۵۱۰f = title;
            return this;
        }

        public a a(View customTitleView) {
            this.f۱۵۵۰a.f۱۵۱۱g = customTitleView;
            return this;
        }

        public a a(Drawable icon) {
            this.f۱۵۵۰a.f۱۵۰۸d = icon;
            return this;
        }

        public a a(DialogInterface.OnKeyListener onKeyListener) {
            this.f۱۵۵۰a.u = onKeyListener;
            return this;
        }

        public a a(ListAdapter adapter, DialogInterface.OnClickListener listener) {
            AlertController.f fVar = this.f۱۵۵۰a;
            fVar.w = adapter;
            fVar.x = listener;
            return this;
        }

        public d a() {
            d dialog = new d(this.f۱۵۵۰a.f۱۵۰۵a, this.f۱۵۵۱b);
            this.f۱۵۵۰a.a(dialog.f۱۵۴۹e);
            dialog.setCancelable(this.f۱۵۵۰a.r);
            if (this.f۱۵۵۰a.r) {
                dialog.setCanceledOnTouchOutside(true);
            }
            dialog.setOnCancelListener(this.f۱۵۵۰a.s);
            dialog.setOnDismissListener(this.f۱۵۵۰a.t);
            DialogInterface.OnKeyListener onKeyListener = this.f۱۵۵۰a.u;
            if (onKeyListener != null) {
                dialog.setOnKeyListener(onKeyListener);
            }
            return dialog;
        }
    }
}
