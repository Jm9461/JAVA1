package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private final j<?> f۱۰۹۹a;

    public static i a(j<?> jVar) {
        return new i(jVar);
    }

    private i(j<?> jVar) {
        this.f۱۰۹۹a = jVar;
    }

    public k j() {
        return this.f۱۰۹۹a.d();
    }

    public f a(String who) {
        return this.f۱۰۹۹a.f۱۱۰۳d.b(who);
    }

    public void a(f parent) {
        j<?> jVar = this.f۱۰۹۹a;
        jVar.f۱۱۰۳d.a(jVar, jVar, parent);
    }

    public View a(View parent, String name, Context context, AttributeSet attrs) {
        return this.f۱۰۹۹a.f۱۱۰۳d.onCreateView(parent, name, context, attrs);
    }

    public void k() {
        this.f۱۰۹۹a.f۱۱۰۳d.r();
    }

    public Parcelable m() {
        return this.f۱۰۹۹a.f۱۱۰۳d.u();
    }

    public void a(Parcelable state, m nonConfig) {
        this.f۱۰۹۹a.f۱۱۰۳d.a(state, nonConfig);
    }

    public m l() {
        return this.f۱۰۹۹a.f۱۱۰۳d.t();
    }

    public void b() {
        this.f۱۰۹۹a.f۱۱۰۳d.f();
    }

    public void a() {
        this.f۱۰۹۹a.f۱۱۰۳d.e();
    }

    public void g() {
        this.f۱۰۹۹a.f۱۱۰۳d.l();
    }

    public void f() {
        this.f۱۰۹۹a.f۱۱۰۳d.k();
    }

    public void e() {
        this.f۱۰۹۹a.f۱۱۰۳d.j();
    }

    public void h() {
        this.f۱۰۹۹a.f۱۱۰۳d.m();
    }

    public void c() {
        this.f۱۰۹۹a.f۱۱۰۳d.g();
    }

    public void a(boolean isInMultiWindowMode) {
        this.f۱۰۹۹a.f۱۱۰۳d.a(isInMultiWindowMode);
    }

    public void b(boolean isInPictureInPictureMode) {
        this.f۱۰۹۹a.f۱۱۰۳d.b(isInPictureInPictureMode);
    }

    public void a(Configuration newConfig) {
        this.f۱۰۹۹a.f۱۱۰۳d.a(newConfig);
    }

    public void d() {
        this.f۱۰۹۹a.f۱۱۰۳d.i();
    }

    public boolean a(Menu menu, MenuInflater inflater) {
        return this.f۱۰۹۹a.f۱۱۰۳d.a(menu, inflater);
    }

    public boolean b(Menu menu) {
        return this.f۱۰۹۹a.f۱۱۰۳d.b(menu);
    }

    public boolean b(MenuItem item) {
        return this.f۱۰۹۹a.f۱۱۰۳d.b(item);
    }

    public boolean a(MenuItem item) {
        return this.f۱۰۹۹a.f۱۱۰۳d.a(item);
    }

    public void a(Menu menu) {
        this.f۱۰۹۹a.f۱۱۰۳d.a(menu);
    }

    public boolean i() {
        return this.f۱۰۹۹a.f۱۱۰۳d.o();
    }
}
