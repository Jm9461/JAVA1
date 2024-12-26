package p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f;

import android.content.Context;
import android.support.p۰۴۷v7.view.menu.Ch;
import android.support.p۰۴۷v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb;

/* renamed from: a.b.h.f.e  reason: invalid class name */
public class Ce extends AbstractCb implements Ch.AbstractCa {

    /* renamed from: e  reason: contains not printable characters */
    private Context f۸۸۸۶e;

    /* renamed from: f  reason: contains not printable characters */
    private ActionBarContextView f۸۸۸۷f;

    /* renamed from: g  reason: contains not printable characters */
    private AbstractCb.AbstractCa f۸۸۸۸g;

    /* renamed from: h  reason: contains not printable characters */
    private WeakReference<View> f۸۸۸۹h;

    /* renamed from: i  reason: contains not printable characters */
    private boolean f۸۸۹۰i;

    /* renamed from: j  reason: contains not printable characters */
    private Ch f۸۸۹۱j;

    public Ce(Context context, ActionBarContextView view, AbstractCb.AbstractCa callback, boolean isFocusable) {
        this.f۸۸۸۶e = context;
        this.f۸۸۸۷f = view;
        this.f۸۸۸۸g = callback;
        Ch hVar = new Ch(view.getContext());
        hVar.m۱۳۸۶۳c(1);
        this.f۸۸۹۱j = hVar;
        this.f۸۸۹۱j.m۱۳۸۴۷a(this);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۸۰۸b(CharSequence title) {
        this.f۸۸۸۷f.setTitle(title);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۸۰۳a(CharSequence subtitle) {
        this.f۸۸۸۷f.setSubtitle(subtitle);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۸۰۷b(int resId) {
        m۱۰۸۰۸b(this.f۸۸۸۶e.getString(resId));
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۸۰۰a(int resId) {
        m۱۰۸۰۳a((CharSequence) this.f۸۸۸۶e.getString(resId));
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۸۰۴a(boolean titleOptional) {
        super.m۱۰۷۷۷a(titleOptional);
        this.f۸۸۸۷f.setTitleOptional(titleOptional);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
    /* renamed from: j  reason: contains not printable characters */
    public boolean m۱۰۸۱۴j() {
        return this.f۸۸۸۷f.m۱۴۰۲۳b();
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۸۰۲a(View view) {
        this.f۸۸۸۷f.setCustomView(view);
        this.f۸۸۸۹h = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
    /* renamed from: i  reason: contains not printable characters */
    public void m۱۰۸۱۳i() {
        this.f۸۸۸۸g.m۱۰۷۹۲b(this, this.f۸۸۹۱j);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۷۹۹a() {
        if (!this.f۸۸۹۰i) {
            this.f۸۸۹۰i = true;
            this.f۸۸۸۷f.sendAccessibilityEvent(32);
            this.f۸۸۸۸g.m۱۰۷۸۹a(this);
        }
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
    /* renamed from: c  reason: contains not printable characters */
    public Menu m۱۰۸۰۹c() {
        return this.f۸۸۹۱j;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
    /* renamed from: g  reason: contains not printable characters */
    public CharSequence m۱۰۸۱۲g() {
        return this.f۸۸۸۷f.getTitle();
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
    /* renamed from: e  reason: contains not printable characters */
    public CharSequence m۱۰۸۱۱e() {
        return this.f۸۸۸۷f.getSubtitle();
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
    /* renamed from: b  reason: contains not printable characters */
    public View m۱۰۸۰۶b() {
        WeakReference<View> weakReference = this.f۸۸۸۹h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb
    /* renamed from: d  reason: contains not printable characters */
    public MenuInflater m۱۰۸۱۰d() {
        return new Cg(this.f۸۸۸۷f.getContext());
    }

    @Override // android.support.p۰۴۷v7.view.menu.Ch.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۰۸۰۵a(Ch menu, MenuItem item) {
        return this.f۸۸۸۸g.m۱۰۷۹۱a(this, item);
    }

    @Override // android.support.p۰۴۷v7.view.menu.Ch.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۸۰۱a(Ch menu) {
        m۱۰۸۱۳i();
        this.f۸۸۸۷f.m۱۴۰۲۵d();
    }
}
