package android.support.p۰۴۳v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.app.i  reason: invalid class name */
public class Ci {

    /* renamed from: a  reason: contains not printable characters */
    private final AbstractCj<?> f۱۰۲۲۰a;

    /* renamed from: a  reason: contains not printable characters */
    public static Ci m۱۲۲۷۹a(AbstractCj<?> jVar) {
        return new Ci(jVar);
    }

    private Ci(AbstractCj<?> jVar) {
        this.f۱۰۲۲۰a = jVar;
    }

    /* renamed from: j  reason: contains not printable characters */
    public AbstractCk m۱۲۳۰۱j() {
        return this.f۱۰۲۲۰a.m۱۲۳۱۱d();
    }

    /* renamed from: a  reason: contains not printable characters */
    public ComponentCallbacksCf m۱۲۲۸۰a(String who) {
        return this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۳۹۹b(who);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۲۸۵a(ComponentCallbacksCf parent) {
        AbstractCj<?> jVar = this.f۱۰۲۲۰a;
        jVar.f۱۰۲۲۴d.m۱۲۳۹۰a(jVar, jVar, parent);
    }

    /* renamed from: a  reason: contains not printable characters */
    public View m۱۲۲۸۱a(View parent, String name, Context context, AttributeSet attrs) {
        return this.f۱۰۲۲۰a.f۱۰۲۲۴d.onCreateView(parent, name, context, attrs);
    }

    /* renamed from: k  reason: contains not printable characters */
    public void m۱۲۳۰۲k() {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۴۴۸r();
    }

    /* renamed from: m  reason: contains not printable characters */
    public Parcelable m۱۲۳۰۴m() {
        return this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۴۵۱u();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۲۸۴a(Parcelable state, Cm nonConfig) {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۳۸۲a(state, nonConfig);
    }

    /* renamed from: l  reason: contains not printable characters */
    public Cm m۱۲۳۰۳l() {
        return this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۴۵۰t();
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۲۹۰b() {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۴۲۲f();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۲۸۲a() {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۴۱۹e();
    }

    /* renamed from: g  reason: contains not printable characters */
    public void m۱۲۲۹۸g() {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۴۳۷l();
    }

    /* renamed from: f  reason: contains not printable characters */
    public void m۱۲۲۹۷f() {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۴۳۵k();
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۲۲۹۶e() {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۴۳۳j();
    }

    /* renamed from: h  reason: contains not printable characters */
    public void m۱۲۲۹۹h() {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۴۴۰m();
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۲۹۴c() {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۴۲۵g();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۲۸۷a(boolean isInMultiWindowMode) {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۳۹۴a(isInMultiWindowMode);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۲۹۱b(boolean isInPictureInPictureMode) {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۴۰۷b(isInPictureInPictureMode);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۲۸۳a(Configuration newConfig) {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۳۸۰a(newConfig);
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۲۲۹۵d() {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۴۳۱i();
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۲۸۸a(Menu menu, MenuInflater inflater) {
        return this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۳۹۵a(menu, inflater);
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۲۲۹۲b(Menu menu) {
        return this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۴۰۸b(menu);
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۲۲۹۳b(MenuItem item) {
        return this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۴۰۹b(item);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۲۸۹a(MenuItem item) {
        return this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۳۹۶a(item);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۲۸۶a(Menu menu) {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۳۹۲a(menu);
    }

    /* renamed from: i  reason: contains not printable characters */
    public boolean m۱۲۳۰۰i() {
        return this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۲۴۴۴o();
    }
}
