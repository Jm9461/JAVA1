package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.Ce;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb;

/* renamed from: android.support.v7.app.i, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class DialogCi extends Dialog implements InterfaceCf {

    /* renamed from: c, reason: contains not printable characters */
    private AbstractCg f۱۱۰۶۷c;

    /* renamed from: d, reason: contains not printable characters */
    private final Ce.a f۱۱۰۶۸d;

    /* renamed from: android.support.v7.app.i$a */
    class a implements Ce.a {
        a() {
        }

        @Override // android.support.v4.view.Ce.a
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۱۵۶۲a(KeyEvent event) {
            return DialogCi.this.m۱۱۵۶۰a(event);
        }
    }

    public DialogCi(Context context, int theme) {
        super(context, m۱۱۵۵۵a(context, theme));
        this.f۱۱۰۶۸d = new a();
        m۱۱۵۵۷a().mo۱۱۴۷۸a((Bundle) null);
        m۱۱۵۵۷a().mo۱۱۴۸۶a();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        m۱۱۵۵۷a().mo۱۱۵۰۳e();
        super.onCreate(savedInstanceState);
        m۱۱۵۵۷a().mo۱۱۴۷۸a(savedInstanceState);
    }

    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        m۱۱۵۵۷a().mo۱۱۴۹۸c(layoutResID);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m۱۱۵۵۷a().mo۱۱۴۸۲a(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        m۱۱۵۵۷a().mo۱۱۴۹۴b(view, params);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) m۱۱۵۵۷a().mo۱۱۴۷۴a(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence title) {
        super.setTitle(title);
        m۱۱۵۵۷a().mo۱۱۴۸۵a(title);
    }

    @Override // android.app.Dialog
    public void setTitle(int titleId) {
        super.setTitle(titleId);
        m۱۱۵۵۷a().mo۱۱۴۸۵a(getContext().getString(titleId));
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        m۱۱۵۵۷a().mo۱۱۴۸۳a(view, params);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        m۱۱۵۵۷a().mo۱۱۵۱۳j();
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۱۵۵۹a(int featureId) {
        return m۱۱۵۵۷a().mo۱۱۴۹۵b(featureId);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m۱۱۵۵۷a().mo۱۱۵۰۶f();
    }

    /* renamed from: a, reason: contains not printable characters */
    public AbstractCg m۱۱۵۵۷a() {
        if (this.f۱۱۰۶۷c == null) {
            this.f۱۱۰۶۷c = AbstractCg.m۱۱۴۲۶a(this, this);
        }
        return this.f۱۱۰۶۷c;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static int m۱۱۵۵۵a(Context context, int themeId) {
        if (themeId == 0) {
            TypedValue outValue = new TypedValue();
            context.getTheme().resolveAttribute(Ca.dialogTheme, outValue, true);
            return outValue.resourceId;
        }
        return themeId;
    }

    @Override // android.support.v7.app.InterfaceCf
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۵۶۱b(AbstractCb mode) {
    }

    @Override // android.support.v7.app.InterfaceCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۵۵۸a(AbstractCb mode) {
    }

    @Override // android.support.v7.app.InterfaceCf
    /* renamed from: a, reason: contains not printable characters */
    public AbstractCb mo۱۱۵۵۶a(AbstractCb.a callback) {
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    boolean m۱۱۵۶۰a(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        View decor = getWindow().getDecorView();
        return Ce.m۱۰۸۳۷a(this.f۱۱۰۶۸d, decor, this, event);
    }
}
