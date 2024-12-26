package android.support.v4.app;

import android.arch.lifecycle.AbstractCc;
import android.arch.lifecycle.Cp;
import android.arch.lifecycle.InterfaceCq;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.app.Ca;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Co;

/* renamed from: android.support.v4.app.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class ActivityCg extends ActivityCe0 implements InterfaceCq, Ca.b, Ca.d {

    /* renamed from: f, reason: contains not printable characters */
    private Cp f۱۰۲۰۷f;

    /* renamed from: g, reason: contains not printable characters */
    boolean f۱۰۲۰۸g;

    /* renamed from: h, reason: contains not printable characters */
    boolean f۱۰۲۰۹h;

    /* renamed from: j, reason: contains not printable characters */
    boolean f۱۰۲۱۱j;

    /* renamed from: k, reason: contains not printable characters */
    boolean f۱۰۲۱۲k;

    /* renamed from: l, reason: contains not printable characters */
    boolean f۱۰۲۱۳l;

    /* renamed from: m, reason: contains not printable characters */
    int f۱۰۲۱۴m;

    /* renamed from: n, reason: contains not printable characters */
    Co<String> f۱۰۲۱۵n;

    /* renamed from: d, reason: contains not printable characters */
    final Handler f۱۰۲۰۵d = new a();

    /* renamed from: e, reason: contains not printable characters */
    final Ci f۱۰۲۰۶e = Ci.m۱۰۲۰۹a(new b());

    /* renamed from: i, reason: contains not printable characters */
    boolean f۱۰۲۱۰i = true;

    /* renamed from: android.support.v4.app.g$a */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            if (msg.what == 2) {
                ActivityCg.this.m۱۰۱۹۳f();
                ActivityCg.this.f۱۰۲۰۶e.m۱۰۲۳۰i();
            } else {
                super.handleMessage(msg);
            }
        }
    }

    /* renamed from: android.support.v4.app.g$c */
    static final class c {

        /* renamed from: a, reason: contains not printable characters */
        Cp f۱۰۲۱۸a;

        /* renamed from: b, reason: contains not printable characters */
        Cm f۱۰۲۱۹b;

        c() {
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        this.f۱۰۲۰۶e.m۱۰۲۳۲k();
        int requestIndex = requestCode >> 16;
        if (requestIndex != 0) {
            int requestIndex2 = requestIndex - 1;
            String who = this.f۱۰۲۱۵n.m۸۵۹۲b(requestIndex2);
            this.f۱۰۲۱۵n.m۸۵۹۷e(requestIndex2);
            if (who == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            ComponentCallbacksCf targetFragment = this.f۱۰۲۰۶e.m۱۰۲۱۰a(who);
            if (targetFragment == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + who);
                return;
            }
            targetFragment.mo۱۵۴۹۶a(65535 & requestCode, resultCode, data);
            return;
        }
        Ca.c delegate = Ca.m۹۹۸۹a();
        if (delegate != null && delegate.m۹۹۹۳a(this, requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        AbstractCk fragmentManager = this.f۱۰۲۰۶e.m۱۰۲۳۱j();
        boolean isStateSaved = fragmentManager.mo۱۰۳۴۳c();
        if (isStateSaved && Build.VERSION.SDK_INT <= 25) {
            return;
        }
        if (isStateSaved || !fragmentManager.mo۱۰۳۴۸d()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        this.f۱۰۲۰۶e.m۱۰۲۱۷a(isInMultiWindowMode);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        this.f۱۰۲۰۶e.m۱۰۲۲۱b(isInPictureInPictureMode);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.f۱۰۲۰۶e.m۱۰۲۳۲k();
        this.f۱۰۲۰۶e.m۱۰۲۱۳a(newConfig);
    }

    @Override // android.arch.lifecycle.InterfaceCq
    /* renamed from: b, reason: contains not printable characters */
    public Cp mo۱۰۱۹۱b() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f۱۰۲۰۷f == null) {
            c nc = (c) getLastNonConfigurationInstance();
            if (nc != null) {
                this.f۱۰۲۰۷f = nc.f۱۰۲۱۸a;
            }
            if (this.f۱۰۲۰۷f == null) {
                this.f۱۰۲۰۷f = new Cp();
            }
        }
        return this.f۱۰۲۰۷f;
    }

    @Override // android.support.v4.app.ActivityCe0, android.arch.lifecycle.InterfaceCe
    /* renamed from: a, reason: contains not printable characters */
    public AbstractCc mo۱۰۱۸۵a() {
        return super.mo۱۰۱۸۵a();
    }

    @Override // android.support.v4.app.ActivityCe0, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Cp cp;
        this.f۱۰۲۰۶e.m۱۰۲۱۵a((ComponentCallbacksCf) null);
        super.onCreate(savedInstanceState);
        c nc = (c) getLastNonConfigurationInstance();
        if (nc != null && (cp = nc.f۱۰۲۱۸a) != null && this.f۱۰۲۰۷f == null) {
            this.f۱۰۲۰۷f = cp;
        }
        if (savedInstanceState != null) {
            Parcelable p = savedInstanceState.getParcelable("android:support:fragments");
            this.f۱۰۲۰۶e.m۱۰۲۱۴a(p, nc != null ? nc.f۱۰۲۱۹b : null);
            if (savedInstanceState.containsKey("android:support:next_request_index")) {
                this.f۱۰۲۱۴m = savedInstanceState.getInt("android:support:next_request_index");
                int[] requestCodes = savedInstanceState.getIntArray("android:support:request_indicies");
                String[] fragmentWhos = savedInstanceState.getStringArray("android:support:request_fragment_who");
                if (requestCodes == null || fragmentWhos == null || requestCodes.length != fragmentWhos.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f۱۰۲۱۵n = new Co<>(requestCodes.length);
                    for (int i = 0; i < requestCodes.length; i++) {
                        this.f۱۰۲۱۵n.m۸۵۹۵c(requestCodes[i], fragmentWhos[i]);
                    }
                }
            }
        }
        if (this.f۱۰۲۱۵n == null) {
            this.f۱۰۲۱۵n = new Co<>();
            this.f۱۰۲۱۴m = 0;
        }
        this.f۱۰۲۰۶e.m۱۰۲۲۰b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        if (featureId == 0) {
            boolean show = super.onCreatePanelMenu(featureId, menu);
            return show | this.f۱۰۲۰۶e.m۱۰۲۱۸a(menu, getMenuInflater());
        }
        boolean show2 = super.onCreatePanelMenu(featureId, menu);
        return show2;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        View v = m۱۰۱۸۶a(parent, name, context, attrs);
        if (v == null) {
            return super.onCreateView(parent, name, context, attrs);
        }
        return v;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        View v = m۱۰۱۸۶a((View) null, name, context, attrs);
        if (v == null) {
            return super.onCreateView(name, context, attrs);
        }
        return v;
    }

    /* renamed from: a, reason: contains not printable characters */
    final View m۱۰۱۸۶a(View parent, String name, Context context, AttributeSet attrs) {
        return this.f۱۰۲۰۶e.m۱۰۲۱۱a(parent, name, context, attrs);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.f۱۰۲۰۷f != null && !isChangingConfigurations()) {
            this.f۱۰۲۰۷f.m۸۸۶۴a();
        }
        this.f۱۰۲۰۶e.m۱۰۲۲۴c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f۱۰۲۰۶e.m۱۰۲۲۵d();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.f۱۰۲۰۶e.m۱۰۲۲۳b(item);
        }
        if (featureId == 6) {
            return this.f۱۰۲۰۶e.m۱۰۲۱۹a(item);
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        if (featureId == 0) {
            this.f۱۰۲۰۶e.m۱۰۲۱۶a(menu);
        }
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f۱۰۲۰۹h = false;
        if (this.f۱۰۲۰۵d.hasMessages(2)) {
            this.f۱۰۲۰۵d.removeMessages(2);
            m۱۰۱۹۳f();
        }
        this.f۱۰۲۰۶e.m۱۰۲۲۶e();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f۱۰۲۰۶e.m۱۰۲۳۲k();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f۱۰۲۰۶e.m۱۰۲۳۲k();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f۱۰۲۰۵d.sendEmptyMessage(2);
        this.f۱۰۲۰۹h = true;
        this.f۱۰۲۰۶e.m۱۰۲۳۰i();
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.f۱۰۲۰۵d.removeMessages(2);
        m۱۰۱۹۳f();
        this.f۱۰۲۰۶e.m۱۰۲۳۰i();
    }

    /* renamed from: f, reason: contains not printable characters */
    protected void m۱۰۱۹۳f() {
        this.f۱۰۲۰۶e.m۱۰۲۲۷f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        if (featureId == 0 && menu != null) {
            boolean goforit = m۱۰۱۹۰a(view, menu);
            return goforit | this.f۱۰۲۰۶e.m۱۰۲۲۲b(menu);
        }
        boolean goforit2 = super.onPreparePanel(featureId, view, menu);
        return goforit2;
    }

    /* renamed from: a, reason: contains not printable characters */
    protected boolean m۱۰۱۹۰a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        Object custom = m۱۰۱۹۴g();
        Cm fragments = this.f۱۰۲۰۶e.m۱۰۲۳۳l();
        if (fragments == null && this.f۱۰۲۰۷f == null && custom == null) {
            return null;
        }
        c nci = new c();
        nci.f۱۰۲۱۸a = this.f۱۰۲۰۷f;
        nci.f۱۰۲۱۹b = fragments;
        return nci;
    }

    @Override // android.support.v4.app.ActivityCe0, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        m۱۰۱۸۴i();
        Parcelable p = this.f۱۰۲۰۶e.m۱۰۲۳۴m();
        if (p != null) {
            outState.putParcelable("android:support:fragments", p);
        }
        if (this.f۱۰۲۱۵n.m۸۵۹۱b() > 0) {
            outState.putInt("android:support:next_request_index", this.f۱۰۲۱۴m);
            int[] requestCodes = new int[this.f۱۰۲۱۵n.m۸۵۹۱b()];
            String[] fragmentWhos = new String[this.f۱۰۲۱۵n.m۸۵۹۱b()];
            for (int i = 0; i < this.f۱۰۲۱۵n.m۸۵۹۱b(); i++) {
                requestCodes[i] = this.f۱۰۲۱۵n.m۸۵۹۶d(i);
                fragmentWhos[i] = this.f۱۰۲۱۵n.m۸۵۹۸f(i);
            }
            outState.putIntArray("android:support:request_indicies", requestCodes);
            outState.putStringArray("android:support:request_fragment_who", fragmentWhos);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f۱۰۲۱۰i = false;
        if (!this.f۱۰۲۰۸g) {
            this.f۱۰۲۰۸g = true;
            this.f۱۰۲۰۶e.m۱۰۲۱۲a();
        }
        this.f۱۰۲۰۶e.m۱۰۲۳۲k();
        this.f۱۰۲۰۶e.m۱۰۲۳۰i();
        this.f۱۰۲۰۶e.m۱۰۲۲۸g();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f۱۰۲۱۰i = true;
        m۱۰۱۸۴i();
        this.f۱۰۲۰۶e.m۱۰۲۲۹h();
    }

    /* renamed from: g, reason: contains not printable characters */
    public Object m۱۰۱۹۴g() {
        return null;
    }

    @Deprecated
    /* renamed from: h, reason: contains not printable characters */
    public void mo۱۱۴۱۷h() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        super.dump(prefix, fd, writer, args);
        writer.print(prefix);
        writer.print("Local FragmentActivity ");
        writer.print(Integer.toHexString(System.identityHashCode(this)));
        writer.println(" State:");
        String innerPrefix = prefix + "  ";
        writer.print(innerPrefix);
        writer.print("mCreated=");
        writer.print(this.f۱۰۲۰۸g);
        writer.print(" mResumed=");
        writer.print(this.f۱۰۲۰۹h);
        writer.print(" mStopped=");
        writer.print(this.f۱۰۲۱۰i);
        if (getApplication() != null) {
            AbstractCu.m۱۰۴۸۶a(this).mo۱۰۴۸۸a(innerPrefix, fd, writer, args);
        }
        this.f۱۰۲۰۶e.m۱۰۲۳۱j().mo۱۰۳۲۳a(prefix, fd, writer, args);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۱۸۸a(ComponentCallbacksCf fragment) {
    }

    /* renamed from: e, reason: contains not printable characters */
    public AbstractCk m۱۰۱۹۲e() {
        return this.f۱۰۲۰۶e.m۱۰۲۳۱j();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int requestCode) {
        if (!this.f۱۰۲۱۳l && requestCode != -1) {
            m۱۰۱۸۳b(requestCode);
        }
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        if (!this.f۱۰۲۱۳l && requestCode != -1) {
            m۱۰۱۸۳b(requestCode);
        }
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) {
        if (!this.f۱۰۲۱۲k && requestCode != -1) {
            m۱۰۱۸۳b(requestCode);
        }
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) {
        if (!this.f۱۰۲۱۲k && requestCode != -1) {
            m۱۰۱۸۳b(requestCode);
        }
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    /* renamed from: b, reason: contains not printable characters */
    static void m۱۰۱۸۳b(int requestCode) {
        if (((-65536) & requestCode) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    @Override // android.support.v4.app.Ca.d
    /* renamed from: a, reason: contains not printable characters */
    public final void mo۱۰۱۸۷a(int requestCode) {
        if (!this.f۱۰۲۱۱j && requestCode != -1) {
            m۱۰۱۸۳b(requestCode);
        }
    }

    @Override // android.app.Activity, android.support.v4.app.Ca.b
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        this.f۱۰۲۰۶e.m۱۰۲۳۲k();
        int index = (requestCode >> 16) & 65535;
        if (index != 0) {
            int index2 = index - 1;
            String who = this.f۱۰۲۱۵n.m۸۵۹۲b(index2);
            this.f۱۰۲۱۵n.m۸۵۹۷e(index2);
            if (who == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            ComponentCallbacksCf frag = this.f۱۰۲۰۶e.m۱۰۲۱۰a(who);
            if (frag == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + who);
                return;
            }
            frag.m۱۰۰۸۹a(65535 & requestCode, permissions, grantResults);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۱۸۹a(ComponentCallbacksCf fragment, Intent intent, int requestCode, Bundle options) {
        this.f۱۰۲۱۳l = true;
        try {
            if (requestCode == -1) {
                Ca.m۹۹۹۱a(this, intent, -1, options);
                return;
            }
            m۱۰۱۸۳b(requestCode);
            int requestIndex = m۱۰۱۸۲b(fragment);
            Ca.m۹۹۹۱a(this, intent, ((requestIndex + 1) << 16) + (65535 & requestCode), options);
        } finally {
            this.f۱۰۲۱۳l = false;
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private int m۱۰۱۸۲b(ComponentCallbacksCf fragment) {
        if (this.f۱۰۲۱۵n.m۸۵۹۱b() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.f۱۰۲۱۵n.m۸۵۹۴c(this.f۱۰۲۱۴m) >= 0) {
            this.f۱۰۲۱۴m = (this.f۱۰۲۱۴m + 1) % 65534;
        }
        int requestIndex = this.f۱۰۲۱۴m;
        this.f۱۰۲۱۵n.m۸۵۹۵c(requestIndex, fragment.f۱۰۱۶۱h);
        this.f۱۰۲۱۴m = (this.f۱۰۲۱۴m + 1) % 65534;
        return requestIndex;
    }

    /* renamed from: android.support.v4.app.g$b */
    class b extends AbstractCj<ActivityCg> {
        public b() {
            super(ActivityCg.this);
        }

        @Override // android.support.v4.app.AbstractCj
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۰۲۳۷a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
            ActivityCg.this.dump(prefix, fd, writer, args);
        }

        @Override // android.support.v4.app.AbstractCj
        /* renamed from: b, reason: contains not printable characters */
        public boolean mo۱۰۲۳۹b(ComponentCallbacksCf fragment) {
            return !ActivityCg.this.isFinishing();
        }

        @Override // android.support.v4.app.AbstractCj
        /* renamed from: f, reason: contains not printable characters */
        public LayoutInflater mo۱۰۲۴۳f() {
            return ActivityCg.this.getLayoutInflater().cloneInContext(ActivityCg.this);
        }

        @Override // android.support.v4.app.AbstractCj
        /* renamed from: i, reason: contains not printable characters */
        public void mo۱۰۲۴۶i() {
            ActivityCg.this.mo۱۱۴۱۷h();
        }

        @Override // android.support.v4.app.AbstractCj
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۰۲۳۶a(ComponentCallbacksCf fragment, Intent intent, int requestCode, Bundle options) {
            ActivityCg.this.m۱۰۱۸۹a(fragment, intent, requestCode, options);
        }

        @Override // android.support.v4.app.AbstractCj
        /* renamed from: h, reason: contains not printable characters */
        public boolean mo۱۰۲۴۵h() {
            return ActivityCg.this.getWindow() != null;
        }

        @Override // android.support.v4.app.AbstractCj
        /* renamed from: g, reason: contains not printable characters */
        public int mo۱۰۲۴۴g() {
            Window w = ActivityCg.this.getWindow();
            if (w == null) {
                return 0;
            }
            return w.getAttributes().windowAnimations;
        }

        @Override // android.support.v4.app.AbstractCj
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۰۲۳۵a(ComponentCallbacksCf fragment) {
            ActivityCg.this.m۱۰۱۸۸a(fragment);
        }

        @Override // android.support.v4.app.AbstractCh
        /* renamed from: a, reason: contains not printable characters */
        public View mo۱۰۲۰۷a(int id) {
            return ActivityCg.this.findViewById(id);
        }

        @Override // android.support.v4.app.AbstractCh
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۰۲۰۸a() {
            Window w = ActivityCg.this.getWindow();
            return (w == null || w.peekDecorView() == null) ? false : true;
        }
    }

    /* renamed from: i, reason: contains not printable characters */
    private void m۱۰۱۸۴i() {
        boolean reiterate;
        do {
            reiterate = m۱۰۱۸۱a(m۱۰۱۹۲e(), AbstractCc.b.CREATED);
        } while (reiterate);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۱۰۱۸۱a(AbstractCk manager, AbstractCc.b state) {
        boolean hadNotMarked = false;
        Collection<Fragment> fragments = manager.mo۱۰۳۳۰b();
        for (ComponentCallbacksCf fragment : fragments) {
            if (fragment != null) {
                if (fragment.mo۱۰۱۸۵a().mo۸۸۳۵a().m۸۸۲۱a(AbstractCc.b.STARTED)) {
                    fragment.f۱۰۱۵۲U.m۸۸۳۷a(state);
                    hadNotMarked = true;
                }
                AbstractCk childFragmentManager = fragment.m۱۰۰۷۳S();
                if (childFragmentManager != null) {
                    hadNotMarked |= m۱۰۱۸۱a(childFragmentManager, state);
                }
            }
        }
        return hadNotMarked;
    }
}
