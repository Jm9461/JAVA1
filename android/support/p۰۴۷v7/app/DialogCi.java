package android.support.p۰۴۷v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p۰۴۳v4.view.Ce;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb;

/* renamed from: android.support.v7.app.i  reason: invalid class name */
public class DialogCi extends Dialog implements AbstractCf {

    /* renamed from: c  reason: contains not printable characters */
    private AbstractCg f۱۱۰۶۷c;

    /* renamed from: d  reason: contains not printable characters */
    private final Ce.AbstractCa f۱۱۰۶۸d = new Ca();

    /* renamed from: android.support.v7.app.i$a  reason: invalid class name */
    class Ca implements Ce.AbstractCa {
        Ca() {
        }

        @Override // android.support.p۰۴۳v4.view.Ce.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۳۶۳۲a(KeyEvent event) {
            return DialogCi.this.m۱۳۶۳۰a(event);
        }
    }

    public DialogCi(Context context, int theme) {
        super(context, m۱۳۶۲۵a(context, theme));
        m۱۳۶۲۷a().m۱۳۵۰۰a((Bundle) null);
        m۱۳۶۲۷a().m۱۳۵۰۵a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        m۱۳۶۲۷a().m۱۳۵۱۴e();
        super.onCreate(savedInstanceState);
        m۱۳۶۲۷a().m۱۳۵۰۰a(savedInstanceState);
    }

    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        m۱۳۶۲۷a().m۱۳۵۱۱c(layoutResID);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m۱۳۶۲۷a().m۱۳۵۰۲a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams params) {
        m۱۳۶۲۷a().m۱۳۵۰۸b(view, params);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int id) {
        return (T) m۱۳۶۲۷a().m۱۳۴۹۸a(id);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence title) {
        super.setTitle(title);
        m۱۳۶۲۷a().m۱۳۵۰۴a(title);
    }

    @Override // android.app.Dialog
    public void setTitle(int titleId) {
        super.setTitle(titleId);
        m۱۳۶۲۷a().m۱۳۵۰۴a(getContext().getString(titleId));
    }

    public void addContentView(View view, ViewGroup.LayoutParams params) {
        m۱۳۶۲۷a().m۱۳۵۰۳a(view, params);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        m۱۳۶۲۷a().m۱۳۵۱۹j();
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۶۲۹a(int featureId) {
        return m۱۳۶۲۷a().m۱۳۵۰۹b(featureId);
    }

    public void invalidateOptionsMenu() {
        m۱۳۶۲۷a().m۱۳۵۱۵f();
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCg m۱۳۶۲۷a() {
        if (this.f۱۱۰۶۷c == null) {
            this.f۱۱۰۶۷c = AbstractCg.m۱۳۴۹۶a(this, this);
        }
        return this.f۱۱۰۶۷c;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۳۶۲۵a(Context context, int themeId) {
        if (themeId != 0) {
            return themeId;
        }
        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.dialogTheme, outValue, true);
        return outValue.resourceId;
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCf
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۶۳۱b(AbstractCb mode) {
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۶۲۸a(AbstractCb mode) {
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCf
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCb m۱۳۶۲۶a(AbstractCb.AbstractCa callback) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۶۳۰a(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        return Ce.m۱۲۹۰۷a(this.f۱۱۰۶۸d, getWindow().getDecorView(), this, event);
    }
}
