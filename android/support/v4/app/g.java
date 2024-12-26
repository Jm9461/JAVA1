package android.support.v4.app;

import a.b.g.g.o;
import android.arch.lifecycle.c;
import android.arch.lifecycle.p;
import android.arch.lifecycle.q;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.app.a;
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

public class g extends e0 implements q, a.b, a.d {

    /* renamed from: d  reason: collision with root package name */
    final Handler f۱۰۹۰d = new a();

    /* renamed from: e  reason: collision with root package name */
    final i f۱۰۹۱e = i.a(new b());

    /* renamed from: f  reason: collision with root package name */
    private p f۱۰۹۲f;

    /* renamed from: g  reason: collision with root package name */
    boolean f۱۰۹۳g;

    /* renamed from: h  reason: collision with root package name */
    boolean f۱۰۹۴h;
    boolean i = true;
    boolean j;
    boolean k;
    boolean l;
    int m;
    o<String> n;

    class a extends Handler {
        a() {
        }

        public void handleMessage(Message msg) {
            if (msg.what != 2) {
                super.handleMessage(msg);
                return;
            }
            g.this.f();
            g.this.f۱۰۹۱e.i();
        }
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        p f۱۰۹۷a;

        /* renamed from: b  reason: collision with root package name */
        m f۱۰۹۸b;

        c() {
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        this.f۱۰۹۱e.k();
        int requestIndex = requestCode >> 16;
        if (requestIndex != 0) {
            int requestIndex2 = requestIndex - 1;
            String who = this.n.b(requestIndex2);
            this.n.e(requestIndex2);
            if (who == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            f targetFragment = this.f۱۰۹۱e.a(who);
            if (targetFragment == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + who);
                return;
            }
            targetFragment.a(65535 & requestCode, resultCode, data);
            return;
        }
        a.c delegate = a.a();
        if (delegate == null || !delegate.a(this, requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void onBackPressed() {
        k fragmentManager = this.f۱۰۹۱e.j();
        boolean isStateSaved = fragmentManager.c();
        if (isStateSaved && Build.VERSION.SDK_INT <= 25) {
            return;
        }
        if (isStateSaved || !fragmentManager.d()) {
            super.onBackPressed();
        }
    }

    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        this.f۱۰۹۱e.a(isInMultiWindowMode);
    }

    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        this.f۱۰۹۱e.b(isInPictureInPictureMode);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.f۱۰۹۱e.k();
        this.f۱۰۹۱e.a(newConfig);
    }

    @Override // android.arch.lifecycle.q
    public p b() {
        if (getApplication() != null) {
            if (this.f۱۰۹۲f == null) {
                c nc = (c) getLastNonConfigurationInstance();
                if (nc != null) {
                    this.f۱۰۹۲f = nc.f۱۰۹۷a;
                }
                if (this.f۱۰۹۲f == null) {
                    this.f۱۰۹۲f = new p();
                }
            }
            return this.f۱۰۹۲f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // android.support.v4.app.e0, android.arch.lifecycle.e
    public android.arch.lifecycle.c a() {
        return super.a();
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v4.app.e0
    public void onCreate(Bundle savedInstanceState) {
        p pVar;
        m mVar = null;
        this.f۱۰۹۱e.a((f) null);
        super.onCreate(savedInstanceState);
        c nc = (c) getLastNonConfigurationInstance();
        if (!(nc == null || (pVar = nc.f۱۰۹۷a) == null || this.f۱۰۹۲f != null)) {
            this.f۱۰۹۲f = pVar;
        }
        if (savedInstanceState != null) {
            Parcelable p = savedInstanceState.getParcelable("android:support:fragments");
            i iVar = this.f۱۰۹۱e;
            if (nc != null) {
                mVar = nc.f۱۰۹۸b;
            }
            iVar.a(p, mVar);
            if (savedInstanceState.containsKey("android:support:next_request_index")) {
                this.m = savedInstanceState.getInt("android:support:next_request_index");
                int[] requestCodes = savedInstanceState.getIntArray("android:support:request_indicies");
                String[] fragmentWhos = savedInstanceState.getStringArray("android:support:request_fragment_who");
                if (requestCodes == null || fragmentWhos == null || requestCodes.length != fragmentWhos.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.n = new o<>(requestCodes.length);
                    for (int i2 = 0; i2 < requestCodes.length; i2++) {
                        this.n.c(requestCodes[i2], fragmentWhos[i2]);
                    }
                }
            }
        }
        if (this.n == null) {
            this.n = new o<>();
            this.m = 0;
        }
        this.f۱۰۹۱e.b();
    }

    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        if (featureId == 0) {
            return super.onCreatePanelMenu(featureId, menu) | this.f۱۰۹۱e.a(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(featureId, menu);
    }

    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        View v = a(parent, name, context, attrs);
        if (v == null) {
            return super.onCreateView(parent, name, context, attrs);
        }
        return v;
    }

    public View onCreateView(String name, Context context, AttributeSet attrs) {
        View v = a((View) null, name, context, attrs);
        if (v == null) {
            return super.onCreateView(name, context, attrs);
        }
        return v;
    }

    /* access modifiers changed from: package-private */
    public final View a(View parent, String name, Context context, AttributeSet attrs) {
        return this.f۱۰۹۱e.a(parent, name, context, attrs);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f۱۰۹۲f != null && !isChangingConfigurations()) {
            this.f۱۰۹۲f.a();
        }
        this.f۱۰۹۱e.c();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f۱۰۹۱e.d();
    }

    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.f۱۰۹۱e.b(item);
        }
        if (featureId != 6) {
            return false;
        }
        return this.f۱۰۹۱e.a(item);
    }

    public void onPanelClosed(int featureId, Menu menu) {
        if (featureId == 0) {
            this.f۱۰۹۱e.a(menu);
        }
        super.onPanelClosed(featureId, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f۱۰۹۴h = false;
        if (this.f۱۰۹۰d.hasMessages(2)) {
            this.f۱۰۹۰d.removeMessages(2);
            f();
        }
        this.f۱۰۹۱e.e();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f۱۰۹۱e.k();
    }

    public void onStateNotSaved() {
        this.f۱۰۹۱e.k();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f۱۰۹۰d.sendEmptyMessage(2);
        this.f۱۰۹۴h = true;
        this.f۱۰۹۱e.i();
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.f۱۰۹۰d.removeMessages(2);
        f();
        this.f۱۰۹۱e.i();
    }

    /* access modifiers changed from: protected */
    public void f() {
        this.f۱۰۹۱e.f();
    }

    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        if (featureId != 0 || menu == null) {
            return super.onPreparePanel(featureId, view, menu);
        }
        return a(view, menu) | this.f۱۰۹۱e.b(menu);
    }

    /* access modifiers changed from: protected */
    public boolean a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public final Object onRetainNonConfigurationInstance() {
        Object custom = g();
        m fragments = this.f۱۰۹۱e.l();
        if (fragments == null && this.f۱۰۹۲f == null && custom == null) {
            return null;
        }
        c nci = new c();
        nci.f۱۰۹۷a = this.f۱۰۹۲f;
        nci.f۱۰۹۸b = fragments;
        return nci;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v4.app.e0
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        i();
        Parcelable p = this.f۱۰۹۱e.m();
        if (p != null) {
            outState.putParcelable("android:support:fragments", p);
        }
        if (this.n.b() > 0) {
            outState.putInt("android:support:next_request_index", this.m);
            int[] requestCodes = new int[this.n.b()];
            String[] fragmentWhos = new String[this.n.b()];
            for (int i2 = 0; i2 < this.n.b(); i2++) {
                requestCodes[i2] = this.n.d(i2);
                fragmentWhos[i2] = this.n.f(i2);
            }
            outState.putIntArray("android:support:request_indicies", requestCodes);
            outState.putStringArray("android:support:request_fragment_who", fragmentWhos);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.i = false;
        if (!this.f۱۰۹۳g) {
            this.f۱۰۹۳g = true;
            this.f۱۰۹۱e.a();
        }
        this.f۱۰۹۱e.k();
        this.f۱۰۹۱e.i();
        this.f۱۰۹۱e.g();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.i = true;
        i();
        this.f۱۰۹۱e.h();
    }

    public Object g() {
        return null;
    }

    @Deprecated
    public void h() {
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
        writer.print(this.f۱۰۹۳g);
        writer.print(" mResumed=");
        writer.print(this.f۱۰۹۴h);
        writer.print(" mStopped=");
        writer.print(this.i);
        if (getApplication() != null) {
            u.a(this).a(innerPrefix, fd, writer, args);
        }
        this.f۱۰۹۱e.j().a(prefix, fd, writer, args);
    }

    public void a(f fragment) {
    }

    public k e() {
        return this.f۱۰۹۱e.j();
    }

    public void startActivityForResult(Intent intent, int requestCode) {
        if (!this.l && requestCode != -1) {
            b(requestCode);
        }
        super.startActivityForResult(intent, requestCode);
    }

    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        if (!this.l && requestCode != -1) {
            b(requestCode);
        }
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) {
        if (!this.k && requestCode != -1) {
            b(requestCode);
        }
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) {
        if (!this.k && requestCode != -1) {
            b(requestCode);
        }
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    static void b(int requestCode) {
        if ((-65536 & requestCode) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    @Override // android.support.v4.app.a.d
    public final void a(int requestCode) {
        if (!this.j && requestCode != -1) {
            b(requestCode);
        }
    }

    @Override // android.support.v4.app.a.b
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        this.f۱۰۹۱e.k();
        int index = (requestCode >> 16) & 65535;
        if (index != 0) {
            int index2 = index - 1;
            String who = this.n.b(index2);
            this.n.e(index2);
            if (who == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            f frag = this.f۱۰۹۱e.a(who);
            if (frag == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + who);
                return;
            }
            frag.a(65535 & requestCode, permissions, grantResults);
        }
    }

    public void a(f fragment, Intent intent, int requestCode, Bundle options) {
        this.l = true;
        if (requestCode == -1) {
            try {
                a.a(this, intent, -1, options);
            } finally {
                this.l = false;
            }
        } else {
            b(requestCode);
            a.a(this, intent, ((b(fragment) + 1) << 16) + (65535 & requestCode), options);
            this.l = false;
        }
    }

    private int b(f fragment) {
        if (this.n.b() < 65534) {
            while (this.n.c(this.m) >= 0) {
                this.m = (this.m + 1) % 65534;
            }
            int requestIndex = this.m;
            this.n.c(requestIndex, fragment.f۱۰۷۵h);
            this.m = (this.m + 1) % 65534;
            return requestIndex;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    class b extends j<g> {
        public b() {
            super(g.this);
        }

        @Override // android.support.v4.app.j
        public void a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
            g.this.dump(prefix, fd, writer, args);
        }

        @Override // android.support.v4.app.j
        public boolean b(f fragment) {
            return !g.this.isFinishing();
        }

        @Override // android.support.v4.app.j
        public LayoutInflater f() {
            return g.this.getLayoutInflater().cloneInContext(g.this);
        }

        @Override // android.support.v4.app.j
        public void i() {
            g.this.h();
        }

        @Override // android.support.v4.app.j
        public void a(f fragment, Intent intent, int requestCode, Bundle options) {
            g.this.a(fragment, intent, requestCode, options);
        }

        @Override // android.support.v4.app.j
        public boolean h() {
            return g.this.getWindow() != null;
        }

        @Override // android.support.v4.app.j
        public int g() {
            Window w = g.this.getWindow();
            if (w == null) {
                return 0;
            }
            return w.getAttributes().windowAnimations;
        }

        @Override // android.support.v4.app.j
        public void a(f fragment) {
            g.this.a(fragment);
        }

        @Override // android.support.v4.app.h
        public View a(int id) {
            return g.this.findViewById(id);
        }

        @Override // android.support.v4.app.h
        public boolean a() {
            Window w = g.this.getWindow();
            return (w == null || w.peekDecorView() == null) ? false : true;
        }
    }

    private void i() {
        do {
        } while (a(e(), c.b.CREATED));
    }

    private static boolean a(k manager, c.b state) {
        boolean hadNotMarked = false;
        Iterator<Fragment> it = manager.b().iterator();
        while (it.hasNext()) {
            f fragment = (f) it.next();
            if (fragment != null) {
                if (fragment.a().a().a(c.b.STARTED)) {
                    fragment.U.a(state);
                    hadNotMarked = true;
                }
                k childFragmentManager = fragment.S();
                if (childFragmentManager != null) {
                    hadNotMarked |= a(childFragmentManager, state);
                }
            }
        }
        return hadNotMarked;
    }
}
