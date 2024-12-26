package p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f;

import android.content.Context;
import android.support.v7.view.menu.Ch;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb;

/* renamed from: a.b.h.f.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ce extends AbstractCb implements Ch.a {

    /* renamed from: e, reason: contains not printable characters */
    private Context f۸۸۸۶e;

    /* renamed from: f, reason: contains not printable characters */
    private ActionBarContextView f۸۸۸۷f;

    /* renamed from: g, reason: contains not printable characters */
    private AbstractCb.a f۸۸۸۸g;

    /* renamed from: h, reason: contains not printable characters */
    private WeakReference<View> f۸۸۸۹h;

    /* renamed from: i, reason: contains not printable characters */
    private boolean f۸۸۹۰i;

    /* renamed from: j, reason: contains not printable characters */
    private Ch f۸۸۹۱j;

    public Ce(Context context, ActionBarContextView view, AbstractCb.a callback, boolean isFocusable) {
        this.f۸۸۸۶e = context;
        this.f۸۸۸۷f = view;
        this.f۸۸۸۸g = callback;
        Ch ch = new Ch(view.getContext());
        ch.m۱۱۷۹۳c(1);
        this.f۸۸۹۱j = ch;
        this.f۸۸۹۱j.mo۱۱۹۳۷a(this);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۶۵۷b(CharSequence title) {
        this.f۸۸۸۷f.setTitle(title);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۶۵۲a(CharSequence subtitle) {
        this.f۸۸۸۷f.setSubtitle(subtitle);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۶۵۶b(int resId) {
        mo۱۱۶۵۷b(this.f۸۸۸۶e.getString(resId));
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۶۴۹a(int resId) {
        mo۱۱۶۵۲a((CharSequence) this.f۸۸۸۶e.getString(resId));
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۶۵۳a(boolean titleOptional) {
        super.mo۱۱۶۵۳a(titleOptional);
        this.f۸۸۸۷f.setTitleOptional(titleOptional);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
    /* renamed from: j, reason: contains not printable characters */
    public boolean mo۱۱۶۶۳j() {
        return this.f۸۸۸۷f.m۱۱۹۵۳b();
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۶۵۱a(View view) {
        this.f۸۸۸۷f.setCustomView(view);
        this.f۸۸۸۹h = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
    /* renamed from: i, reason: contains not printable characters */
    public void mo۱۱۶۶۲i() {
        this.f۸۸۸۸g.mo۱۱۵۴۱b(this, this.f۸۸۹۱j);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۶۴۸a() {
        if (this.f۸۸۹۰i) {
            return;
        }
        this.f۸۸۹۰i = true;
        this.f۸۸۸۷f.sendAccessibilityEvent(32);
        this.f۸۸۸۸g.mo۱۱۵۳۸a(this);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
    /* renamed from: c, reason: contains not printable characters */
    public Menu mo۱۱۶۵۸c() {
        return this.f۸۸۹۱j;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
    /* renamed from: g, reason: contains not printable characters */
    public CharSequence mo۱۱۶۶۱g() {
        return this.f۸۸۸۷f.getTitle();
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
    /* renamed from: e, reason: contains not printable characters */
    public CharSequence mo۱۱۶۶۰e() {
        return this.f۸۸۸۷f.getSubtitle();
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
    /* renamed from: b, reason: contains not printable characters */
    public View mo۱۱۶۵۵b() {
        WeakReference<View> weakReference = this.f۸۸۸۹h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb
    /* renamed from: d, reason: contains not printable characters */
    public MenuInflater mo۱۱۶۵۹d() {
        return new Cg(this.f۸۸۸۷f.getContext());
    }

    @Override // android.support.v7.view.menu.Ch.a
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۳۵۶۶a(Ch menu, MenuItem item) {
        return this.f۸۸۸۸g.mo۱۱۵۴۰a(this, item);
    }

    @Override // android.support.v7.view.menu.Ch.a
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۵۶۵a(Ch menu) {
        mo۱۱۶۶۲i();
        this.f۸۸۸۷f.m۱۱۹۵۵d();
    }
}
