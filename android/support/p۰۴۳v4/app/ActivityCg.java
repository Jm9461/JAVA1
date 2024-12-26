package android.support.p۰۴۳v4.app;

import android.arch.lifecycle.AbstractCc;
import android.arch.lifecycle.AbstractCq;
import android.arch.lifecycle.Cp;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.p۰۴۳v4.app.Ca;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Co;

/* renamed from: android.support.v4.app.g  reason: invalid class name */
public class ActivityCg extends ActivityCe0 implements AbstractCq, Ca.AbstractCb, Ca.AbstractCd {

    /* renamed from: d  reason: contains not printable characters */
    final Handler f۱۰۲۰۵d = new HandlerCa();

    /* renamed from: e  reason: contains not printable characters */
    final Ci f۱۰۲۰۶e = Ci.m۱۲۲۷۹a(new Cb());

    /* renamed from: f  reason: contains not printable characters */
    private Cp f۱۰۲۰۷f;

    /* renamed from: g  reason: contains not printable characters */
    boolean f۱۰۲۰۸g;

    /* renamed from: h  reason: contains not printable characters */
    boolean f۱۰۲۰۹h;

    /* renamed from: i  reason: contains not printable characters */
    boolean f۱۰۲۱۰i = true;

    /* renamed from: j  reason: contains not printable characters */
    boolean f۱۰۲۱۱j;

    /* renamed from: k  reason: contains not printable characters */
    boolean f۱۰۲۱۲k;

    /* renamed from: l  reason: contains not printable characters */
    boolean f۱۰۲۱۳l;

    /* renamed from: m  reason: contains not printable characters */
    int f۱۰۲۱۴m;

    /* renamed from: n  reason: contains not printable characters */
    Co<String> f۱۰۲۱۵n;

    /* renamed from: android.support.v4.app.g$a  reason: invalid class name */
    class HandlerCa extends Handler {
        HandlerCa() {
        }

        public void handleMessage(Message msg) {
            if (msg.what != 2) {
                super.handleMessage(msg);
                return;
            }
            ActivityCg.this.m۱۲۲۶۳f();
            ActivityCg.this.f۱۰۲۰۶e.m۱۲۳۰۰i();
        }
    }

    /* renamed from: android.support.v4.app.g$c  reason: invalid class name */
    static final class Cc {

        /* renamed from: a  reason: contains not printable characters */
        Cp f۱۰۲۱۸a;

        /* renamed from: b  reason: contains not printable characters */
        Cm f۱۰۲۱۹b;

        Cc() {
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        this.f۱۰۲۰۶e.m۱۲۳۰۲k();
        int requestIndex = requestCode >> 16;
        if (requestIndex != 0) {
            int requestIndex2 = requestIndex - 1;
            String who = this.f۱۰۲۱۵n.m۱۰۶۶۲b(requestIndex2);
            this.f۱۰۲۱۵n.m۱۰۶۶۷e(requestIndex2);
            if (who == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            ComponentCallbacksCf targetFragment = this.f۱۰۲۰۶e.m۱۲۲۸۰a(who);
            if (targetFragment == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + who);
                return;
            }
            targetFragment.m۱۲۱۵۷a(65535 & requestCode, resultCode, data);
            return;
        }
        Ca.AbstractCc delegate = Ca.m۱۲۰۵۹a();
        if (delegate == null || !delegate.m۱۲۰۶۳a(this, requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void onBackPressed() {
        AbstractCk fragmentManager = this.f۱۰۲۰۶e.m۱۲۳۰۱j();
        boolean isStateSaved = fragmentManager.m۱۲۳۲۵c();
        if (isStateSaved && Build.VERSION.SDK_INT <= 25) {
            return;
        }
        if (isStateSaved || !fragmentManager.m۱۲۳۲۶d()) {
            super.onBackPressed();
        }
    }

    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        this.f۱۰۲۰۶e.m۱۲۲۸۷a(isInMultiWindowMode);
    }

    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        this.f۱۰۲۰۶e.m۱۲۲۹۱b(isInPictureInPictureMode);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.f۱۰۲۰۶e.m۱۲۳۰۲k();
        this.f۱۰۲۰۶e.m۱۲۲۸۳a(newConfig);
    }

    @Override // android.arch.lifecycle.AbstractCq
    /* renamed from: b  reason: contains not printable characters */
    public Cp m۱۲۲۶۱b() {
        if (getApplication() != null) {
            if (this.f۱۰۲۰۷f == null) {
                Cc nc = (Cc) getLastNonConfigurationInstance();
                if (nc != null) {
                    this.f۱۰۲۰۷f = nc.f۱۰۲۱۸a;
                }
                if (this.f۱۰۲۰۷f == null) {
                    this.f۱۰۲۰۷f = new Cp();
                }
            }
            return this.f۱۰۲۰۷f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCe0, android.arch.lifecycle.AbstractCe
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCc m۱۲۲۵۵a() {
        return super.m۱۲۱۲۰a();
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCe0
    public void onCreate(Bundle savedInstanceState) {
        Cp pVar;
        Cm mVar = null;
        this.f۱۰۲۰۶e.m۱۲۲۸۵a((ComponentCallbacksCf) null);
        super.onCreate(savedInstanceState);
        Cc nc = (Cc) getLastNonConfigurationInstance();
        if (!(nc == null || (pVar = nc.f۱۰۲۱۸a) == null || this.f۱۰۲۰۷f != null)) {
            this.f۱۰۲۰۷f = pVar;
        }
        if (savedInstanceState != null) {
            Parcelable p = savedInstanceState.getParcelable("android:support:fragments");
            Ci iVar = this.f۱۰۲۰۶e;
            if (nc != null) {
                mVar = nc.f۱۰۲۱۹b;
            }
            iVar.m۱۲۲۸۴a(p, mVar);
            if (savedInstanceState.containsKey("android:support:next_request_index")) {
                this.f۱۰۲۱۴m = savedInstanceState.getInt("android:support:next_request_index");
                int[] requestCodes = savedInstanceState.getIntArray("android:support:request_indicies");
                String[] fragmentWhos = savedInstanceState.getStringArray("android:support:request_fragment_who");
                if (requestCodes == null || fragmentWhos == null || requestCodes.length != fragmentWhos.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f۱۰۲۱۵n = new Co<>(requestCodes.length);
                    for (int i = 0; i < requestCodes.length; i++) {
                        this.f۱۰۲۱۵n.m۱۰۶۶۵c(requestCodes[i], fragmentWhos[i]);
                    }
                }
            }
        }
        if (this.f۱۰۲۱۵n == null) {
            this.f۱۰۲۱۵n = new Co<>();
            this.f۱۰۲۱۴m = 0;
        }
        this.f۱۰۲۰۶e.m۱۲۲۹۰b();
    }

    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        if (featureId == 0) {
            return super.onCreatePanelMenu(featureId, menu) | this.f۱۰۲۰۶e.m۱۲۲۸۸a(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(featureId, menu);
    }

    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        View v = m۱۲۲۵۶a(parent, name, context, attrs);
        if (v == null) {
            return super.onCreateView(parent, name, context, attrs);
        }
        return v;
    }

    public View onCreateView(String name, Context context, AttributeSet attrs) {
        View v = m۱۲۲۵۶a((View) null, name, context, attrs);
        if (v == null) {
            return super.onCreateView(name, context, attrs);
        }
        return v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final View m۱۲۲۵۶a(View parent, String name, Context context, AttributeSet attrs) {
        return this.f۱۰۲۰۶e.m۱۲۲۸۱a(parent, name, context, attrs);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f۱۰۲۰۷f != null && !isChangingConfigurations()) {
            this.f۱۰۲۰۷f.m۱۰۹۳۳a();
        }
        this.f۱۰۲۰۶e.m۱۲۲۹۴c();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f۱۰۲۰۶e.m۱۲۲۹۵d();
    }

    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.f۱۰۲۰۶e.m۱۲۲۹۳b(item);
        }
        if (featureId != 6) {
            return false;
        }
        return this.f۱۰۲۰۶e.m۱۲۲۸۹a(item);
    }

    public void onPanelClosed(int featureId, Menu menu) {
        if (featureId == 0) {
            this.f۱۰۲۰۶e.m۱۲۲۸۶a(menu);
        }
        super.onPanelClosed(featureId, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f۱۰۲۰۹h = false;
        if (this.f۱۰۲۰۵d.hasMessages(2)) {
            this.f۱۰۲۰۵d.removeMessages(2);
            m۱۲۲۶۳f();
        }
        this.f۱۰۲۰۶e.m۱۲۲۹۶e();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f۱۰۲۰۶e.m۱۲۳۰۲k();
    }

    public void onStateNotSaved() {
        this.f۱۰۲۰۶e.m۱۲۳۰۲k();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f۱۰۲۰۵d.sendEmptyMessage(2);
        this.f۱۰۲۰۹h = true;
        this.f۱۰۲۰۶e.m۱۲۳۰۰i();
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.f۱۰۲۰۵d.removeMessages(2);
        m۱۲۲۶۳f();
        this.f۱۰۲۰۶e.m۱۲۳۰۰i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f  reason: contains not printable characters */
    public void m۱۲۲۶۳f() {
        this.f۱۰۲۰۶e.m۱۲۲۹۷f();
    }

    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        if (featureId != 0 || menu == null) {
            return super.onPreparePanel(featureId, view, menu);
        }
        return m۱۲۲۶۰a(view, menu) | this.f۱۰۲۰۶e.m۱۲۲۹۲b(menu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۲۶۰a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public final Object onRetainNonConfigurationInstance() {
        Object custom = m۱۲۲۶۴g();
        Cm fragments = this.f۱۰۲۰۶e.m۱۲۳۰۳l();
        if (fragments == null && this.f۱۰۲۰۷f == null && custom == null) {
            return null;
        }
        Cc nci = new Cc();
        nci.f۱۰۲۱۸a = this.f۱۰۲۰۷f;
        nci.f۱۰۲۱۹b = fragments;
        return nci;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCe0
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        m۱۲۲۵۴i();
        Parcelable p = this.f۱۰۲۰۶e.m۱۲۳۰۴m();
        if (p != null) {
            outState.putParcelable("android:support:fragments", p);
        }
        if (this.f۱۰۲۱۵n.m۱۰۶۶۱b() > 0) {
            outState.putInt("android:support:next_request_index", this.f۱۰۲۱۴m);
            int[] requestCodes = new int[this.f۱۰۲۱۵n.m۱۰۶۶۱b()];
            String[] fragmentWhos = new String[this.f۱۰۲۱۵n.m۱۰۶۶۱b()];
            for (int i = 0; i < this.f۱۰۲۱۵n.m۱۰۶۶۱b(); i++) {
                requestCodes[i] = this.f۱۰۲۱۵n.m۱۰۶۶۶d(i);
                fragmentWhos[i] = this.f۱۰۲۱۵n.m۱۰۶۶۸f(i);
            }
            outState.putIntArray("android:support:request_indicies", requestCodes);
            outState.putStringArray("android:support:request_fragment_who", fragmentWhos);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f۱۰۲۱۰i = false;
        if (!this.f۱۰۲۰۸g) {
            this.f۱۰۲۰۸g = true;
            this.f۱۰۲۰۶e.m۱۲۲۸۲a();
        }
        this.f۱۰۲۰۶e.m۱۲۳۰۲k();
        this.f۱۰۲۰۶e.m۱۲۳۰۰i();
        this.f۱۰۲۰۶e.m۱۲۲۹۸g();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f۱۰۲۱۰i = true;
        m۱۲۲۵۴i();
        this.f۱۰۲۰۶e.m۱۲۲۹۹h();
    }

    /* renamed from: g  reason: contains not printable characters */
    public Object m۱۲۲۶۴g() {
        return null;
    }

    @Deprecated
    /* renamed from: h  reason: contains not printable characters */
    public void m۱۲۲۶۵h() {
        invalidateOptionsMenu();
    }

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
            AbstractCu.m۱۲۵۵۶a(this).m۱۲۵۵۸a(innerPrefix, fd, writer, args);
        }
        this.f۱۰۲۰۶e.m۱۲۳۰۱j().m۱۲۳۲۳a(prefix, fd, writer, args);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۲۵۸a(ComponentCallbacksCf fragment) {
    }

    /* renamed from: e  reason: contains not printable characters */
    public AbstractCk m۱۲۲۶۲e() {
        return this.f۱۰۲۰۶e.m۱۲۳۰۱j();
    }

    public void startActivityForResult(Intent intent, int requestCode) {
        if (!this.f۱۰۲۱۳l && requestCode != -1) {
            m۱۲۲۵۳b(requestCode);
        }
        super.startActivityForResult(intent, requestCode);
    }

    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        if (!this.f۱۰۲۱۳l && requestCode != -1) {
            m۱۲۲۵۳b(requestCode);
        }
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) {
        if (!this.f۱۰۲۱۲k && requestCode != -1) {
            m۱۲۲۵۳b(requestCode);
        }
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) {
        if (!this.f۱۰۲۱۲k && requestCode != -1) {
            m۱۲۲۵۳b(requestCode);
        }
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    /* renamed from: b  reason: contains not printable characters */
    static void m۱۲۲۵۳b(int requestCode) {
        if ((-65536 & requestCode) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    @Override // android.support.p۰۴۳v4.app.Ca.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۲۲۵۷a(int requestCode) {
        if (!this.f۱۰۲۱۱j && requestCode != -1) {
            m۱۲۲۵۳b(requestCode);
        }
    }

    @Override // android.support.p۰۴۳v4.app.Ca.AbstractCb
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        this.f۱۰۲۰۶e.m۱۲۳۰۲k();
        int index = (requestCode >> 16) & 65535;
        if (index != 0) {
            int index2 = index - 1;
            String who = this.f۱۰۲۱۵n.m۱۰۶۶۲b(index2);
            this.f۱۰۲۱۵n.m۱۰۶۶۷e(index2);
            if (who == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            ComponentCallbacksCf frag = this.f۱۰۲۰۶e.m۱۲۲۸۰a(who);
            if (frag == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + who);
                return;
            }
            frag.m۱۲۱۵۹a(65535 & requestCode, permissions, grantResults);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۲۵۹a(ComponentCallbacksCf fragment, Intent intent, int requestCode, Bundle options) {
        this.f۱۰۲۱۳l = true;
        if (requestCode == -1) {
            try {
                Ca.m۱۲۰۶۱a(this, intent, -1, options);
            } finally {
                this.f۱۰۲۱۳l = false;
            }
        } else {
            m۱۲۲۵۳b(requestCode);
            Ca.m۱۲۰۶۱a(this, intent, ((m۱۲۲۵۲b(fragment) + 1) << 16) + (65535 & requestCode), options);
            this.f۱۰۲۱۳l = false;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۲۲۵۲b(ComponentCallbacksCf fragment) {
        if (this.f۱۰۲۱۵n.m۱۰۶۶۱b() < 65534) {
            while (this.f۱۰۲۱۵n.m۱۰۶۶۴c(this.f۱۰۲۱۴m) >= 0) {
                this.f۱۰۲۱۴m = (this.f۱۰۲۱۴m + 1) % 65534;
            }
            int requestIndex = this.f۱۰۲۱۴m;
            this.f۱۰۲۱۵n.m۱۰۶۶۵c(requestIndex, fragment.f۱۰۱۶۱h);
            this.f۱۰۲۱۴m = (this.f۱۰۲۱۴m + 1) % 65534;
            return requestIndex;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    /* renamed from: android.support.v4.app.g$b  reason: invalid class name */
    class Cb extends AbstractCj<ActivityCg> {
        public Cb() {
            super(ActivityCg.this);
        }

        @Override // android.support.p۰۴۳v4.app.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۲۲۶۹a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
            ActivityCg.this.dump(prefix, fd, writer, args);
        }

        @Override // android.support.p۰۴۳v4.app.AbstractCj
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۲۲۷۱b(ComponentCallbacksCf fragment) {
            return !ActivityCg.this.isFinishing();
        }

        @Override // android.support.p۰۴۳v4.app.AbstractCj
        /* renamed from: f  reason: contains not printable characters */
        public LayoutInflater m۱۲۲۷۲f() {
            return ActivityCg.this.getLayoutInflater().cloneInContext(ActivityCg.this);
        }

        @Override // android.support.p۰۴۳v4.app.AbstractCj
        /* renamed from: i  reason: contains not printable characters */
        public void m۱۲۲۷۵i() {
            ActivityCg.this.m۱۲۲۶۵h();
        }

        @Override // android.support.p۰۴۳v4.app.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۲۲۶۸a(ComponentCallbacksCf fragment, Intent intent, int requestCode, Bundle options) {
            ActivityCg.this.m۱۲۲۵۹a(fragment, intent, requestCode, options);
        }

        @Override // android.support.p۰۴۳v4.app.AbstractCj
        /* renamed from: h  reason: contains not printable characters */
        public boolean m۱۲۲۷۴h() {
            return ActivityCg.this.getWindow() != null;
        }

        @Override // android.support.p۰۴۳v4.app.AbstractCj
        /* renamed from: g  reason: contains not printable characters */
        public int m۱۲۲۷۳g() {
            Window w = ActivityCg.this.getWindow();
            if (w == null) {
                return 0;
            }
            return w.getAttributes().windowAnimations;
        }

        @Override // android.support.p۰۴۳v4.app.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۲۲۶۷a(ComponentCallbacksCf fragment) {
            ActivityCg.this.m۱۲۲۵۸a(fragment);
        }

        @Override // android.support.p۰۴۳v4.app.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public View m۱۲۲۶۶a(int id) {
            return ActivityCg.this.findViewById(id);
        }

        @Override // android.support.p۰۴۳v4.app.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۲۲۷۰a() {
            Window w = ActivityCg.this.getWindow();
            return (w == null || w.peekDecorView() == null) ? false : true;
        }
    }

    /* renamed from: i  reason: contains not printable characters */
    private void m۱۲۲۵۴i() {
        do {
        } while (m۱۲۲۵۱a(m۱۲۲۶۲e(), AbstractCc.EnumCb.CREATED));
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۲۲۵۱a(AbstractCk manager, AbstractCc.EnumCb state) {
        boolean hadNotMarked = false;
        Iterator<Fragment> it = manager.m۱۲۳۲۴b().iterator();
        while (it.hasNext()) {
            ComponentCallbacksCf fragment = (ComponentCallbacksCf) it.next();
            if (fragment != null) {
                if (fragment.m۱۲۱۵۱a().m۱۰۸۸۷a().m۱۰۸۹۰a(AbstractCc.EnumCb.STARTED)) {
                    fragment.f۱۰۱۵۲U.m۱۰۹۰۶a(state);
                    hadNotMarked = true;
                }
                AbstractCk childFragmentManager = fragment.m۱۲۱۴۳S();
                if (childFragmentManager != null) {
                    hadNotMarked |= m۱۲۲۵۱a(childFragmentManager, state);
                }
            }
        }
        return hadNotMarked;
    }
}
