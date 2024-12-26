package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.app.i, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ci {

    /* renamed from: a, reason: contains not printable characters */
    private final AbstractCj<?> f۱۰۲۲۰a;

    /* JADX WARN: Generic types in debug info not equals: android.support.v4.app.j != android.support.v4.app.FragmentHostCallback<?> */
    /* renamed from: a, reason: contains not printable characters */
    public static Ci m۱۰۲۰۹a(AbstractCj<?> abstractCj) {
        return new Ci(abstractCj);
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v4.app.j != android.support.v4.app.FragmentHostCallback<?> */
    private Ci(AbstractCj<?> abstractCj) {
        this.f۱۰۲۲۰a = abstractCj;
    }

    /* renamed from: j, reason: contains not printable characters */
    public AbstractCk m۱۰۲۳۱j() {
        return this.f۱۰۲۲۰a.m۱۰۲۴۱d();
    }

    /* renamed from: a, reason: contains not printable characters */
    public ComponentCallbacksCf m۱۰۲۱۰a(String who) {
        return this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۲۹b(who);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۲۱۵a(ComponentCallbacksCf parent) {
        AbstractCj<?> abstractCj = this.f۱۰۲۲۰a;
        abstractCj.f۱۰۲۲۴d.m۱۰۳۲۰a(abstractCj, abstractCj, parent);
    }

    /* renamed from: a, reason: contains not printable characters */
    public View m۱۰۲۱۱a(View parent, String name, Context context, AttributeSet attrs) {
        return this.f۱۰۲۲۰a.f۱۰۲۲۴d.onCreateView(parent, name, context, attrs);
    }

    /* renamed from: k, reason: contains not printable characters */
    public void m۱۰۲۳۲k() {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۷۸r();
    }

    /* renamed from: m, reason: contains not printable characters */
    public Parcelable m۱۰۲۳۴m() {
        return this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۸۱u();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۲۱۴a(Parcelable state, Cm nonConfig) {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۱۲a(state, nonConfig);
    }

    /* renamed from: l, reason: contains not printable characters */
    public Cm m۱۰۲۳۳l() {
        return this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۸۰t();
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۰۲۲۰b() {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۵۲f();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۲۱۲a() {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۴۹e();
    }

    /* renamed from: g, reason: contains not printable characters */
    public void m۱۰۲۲۸g() {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۶۷l();
    }

    /* renamed from: f, reason: contains not printable characters */
    public void m۱۰۲۲۷f() {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۶۵k();
    }

    /* renamed from: e, reason: contains not printable characters */
    public void m۱۰۲۲۶e() {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۶۳j();
    }

    /* renamed from: h, reason: contains not printable characters */
    public void m۱۰۲۲۹h() {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۷۰m();
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۰۲۲۴c() {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۵۵g();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۲۱۷a(boolean isInMultiWindowMode) {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۲۴a(isInMultiWindowMode);
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۰۲۲۱b(boolean isInPictureInPictureMode) {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۳۷b(isInPictureInPictureMode);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۲۱۳a(Configuration newConfig) {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۱۰a(newConfig);
    }

    /* renamed from: d, reason: contains not printable characters */
    public void m۱۰۲۲۵d() {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۶۱i();
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۰۲۱۸a(Menu menu, MenuInflater inflater) {
        return this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۲۵a(menu, inflater);
    }

    /* renamed from: b, reason: contains not printable characters */
    public boolean m۱۰۲۲۲b(Menu menu) {
        return this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۳۸b(menu);
    }

    /* renamed from: b, reason: contains not printable characters */
    public boolean m۱۰۲۲۳b(MenuItem item) {
        return this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۳۹b(item);
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۰۲۱۹a(MenuItem item) {
        return this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۲۶a(item);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۲۱۶a(Menu menu) {
        this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۲۲a(menu);
    }

    /* renamed from: i, reason: contains not printable characters */
    public boolean m۱۰۲۳۰i() {
        return this.f۱۰۲۲۰a.f۱۰۲۲۴d.m۱۰۳۷۴o();
    }
}
