package android.support.v7.app;

import a.b.h.f.b;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.e;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

public class i extends Dialog implements f {

    /* renamed from: c  reason: collision with root package name */
    private g f۱۵۸۷c;

    /* renamed from: d  reason: collision with root package name */
    private final e.a f۱۵۸۸d = new a();

    class a implements e.a {
        a() {
        }

        @Override // android.support.v4.view.e.a
        public boolean a(KeyEvent event) {
            return i.this.a(event);
        }
    }

    public i(Context context, int theme) {
        super(context, a(context, theme));
        a().a((Bundle) null);
        a().a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        a().e();
        super.onCreate(savedInstanceState);
        a().a(savedInstanceState);
    }

    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        a().c(layoutResID);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams params) {
        a().b(view, params);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int id) {
        return (T) a().a(id);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence title) {
        super.setTitle(title);
        a().a(title);
    }

    @Override // android.app.Dialog
    public void setTitle(int titleId) {
        super.setTitle(titleId);
        a().a(getContext().getString(titleId));
    }

    public void addContentView(View view, ViewGroup.LayoutParams params) {
        a().a(view, params);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        a().j();
    }

    public boolean a(int featureId) {
        return a().b(featureId);
    }

    public void invalidateOptionsMenu() {
        a().f();
    }

    public g a() {
        if (this.f۱۵۸۷c == null) {
            this.f۱۵۸۷c = g.a(this, this);
        }
        return this.f۱۵۸۷c;
    }

    private static int a(Context context, int themeId) {
        if (themeId != 0) {
            return themeId;
        }
        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.h.a.a.dialogTheme, outValue, true);
        return outValue.resourceId;
    }

    @Override // android.support.v7.app.f
    public void b(b mode) {
    }

    @Override // android.support.v7.app.f
    public void a(b mode) {
    }

    @Override // android.support.v7.app.f
    public b a(b.a callback) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean a(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        return e.a(this.f۱۵۸۸d, getWindow().getDecorView(), this, event);
    }
}
