package android.support.v4.app;

import android.support.v4.app.AbstractCk;
import android.support.v4.app.ComponentCallbacksCf;
import android.support.v4.app.LayoutInflaterFactory2Cl;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ce;

/* renamed from: android.support.v4.app.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Cc extends AbstractCq implements AbstractCk.a, LayoutInflaterFactory2Cl.l {

    /* renamed from: a, reason: contains not printable characters */
    final LayoutInflaterFactory2Cl f۱۰۰۸۲a;

    /* renamed from: c, reason: contains not printable characters */
    int f۱۰۰۸۴c;

    /* renamed from: d, reason: contains not printable characters */
    int f۱۰۰۸۵d;

    /* renamed from: e, reason: contains not printable characters */
    int f۱۰۰۸۶e;

    /* renamed from: f, reason: contains not printable characters */
    int f۱۰۰۸۷f;

    /* renamed from: g, reason: contains not printable characters */
    int f۱۰۰۸۸g;

    /* renamed from: h, reason: contains not printable characters */
    int f۱۰۰۸۹h;

    /* renamed from: i, reason: contains not printable characters */
    boolean f۱۰۰۹۰i;

    /* renamed from: j, reason: contains not printable characters */
    String f۱۰۰۹۱j;

    /* renamed from: k, reason: contains not printable characters */
    boolean f۱۰۰۹۲k;

    /* renamed from: m, reason: contains not printable characters */
    int f۱۰۰۹۴m;

    /* renamed from: n, reason: contains not printable characters */
    CharSequence f۱۰۰۹۵n;

    /* renamed from: o, reason: contains not printable characters */
    int f۱۰۰۹۶o;

    /* renamed from: p, reason: contains not printable characters */
    CharSequence f۱۰۰۹۷p;

    /* renamed from: q, reason: contains not printable characters */
    ArrayList<String> f۱۰۰۹۸q;

    /* renamed from: r, reason: contains not printable characters */
    ArrayList<String> f۱۰۰۹۹r;

    /* renamed from: t, reason: contains not printable characters */
    ArrayList<Runnable> f۱۰۱۰۱t;

    /* renamed from: b, reason: contains not printable characters */
    ArrayList<a> f۱۰۰۸۳b = new ArrayList<>();

    /* renamed from: l, reason: contains not printable characters */
    int f۱۰۰۹۳l = -1;

    /* renamed from: s, reason: contains not printable characters */
    boolean f۱۰۱۰۰s = false;

    /* renamed from: android.support.v4.app.c$a */
    static final class a {

        /* renamed from: a, reason: contains not printable characters */
        int f۱۰۱۰۲a;

        /* renamed from: b, reason: contains not printable characters */
        ComponentCallbacksCf f۱۰۱۰۳b;

        /* renamed from: c, reason: contains not printable characters */
        int f۱۰۱۰۴c;

        /* renamed from: d, reason: contains not printable characters */
        int f۱۰۱۰۵d;

        /* renamed from: e, reason: contains not printable characters */
        int f۱۰۱۰۶e;

        /* renamed from: f, reason: contains not printable characters */
        int f۱۰۱۰۷f;

        a() {
        }

        a(int cmd, ComponentCallbacksCf fragment) {
            this.f۱۰۱۰۲a = cmd;
            this.f۱۰۱۰۳b = fragment;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f۱۰۰۹۳l >= 0) {
            sb.append(" #");
            sb.append(this.f۱۰۰۹۳l);
        }
        if (this.f۱۰۰۹۱j != null) {
            sb.append(" ");
            sb.append(this.f۱۰۰۹۱j);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۰۱۵a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        m۱۰۰۱۶a(prefix, writer, true);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۰۱۶a(String prefix, PrintWriter writer, boolean full) {
        String cmdStr;
        if (full) {
            writer.print(prefix);
            writer.print("mName=");
            writer.print(this.f۱۰۰۹۱j);
            writer.print(" mIndex=");
            writer.print(this.f۱۰۰۹۳l);
            writer.print(" mCommitted=");
            writer.println(this.f۱۰۰۹۲k);
            if (this.f۱۰۰۸۸g != 0) {
                writer.print(prefix);
                writer.print("mTransition=#");
                writer.print(Integer.toHexString(this.f۱۰۰۸۸g));
                writer.print(" mTransitionStyle=#");
                writer.println(Integer.toHexString(this.f۱۰۰۸۹h));
            }
            if (this.f۱۰۰۸۴c != 0 || this.f۱۰۰۸۵d != 0) {
                writer.print(prefix);
                writer.print("mEnterAnim=#");
                writer.print(Integer.toHexString(this.f۱۰۰۸۴c));
                writer.print(" mExitAnim=#");
                writer.println(Integer.toHexString(this.f۱۰۰۸۵d));
            }
            if (this.f۱۰۰۸۶e != 0 || this.f۱۰۰۸۷f != 0) {
                writer.print(prefix);
                writer.print("mPopEnterAnim=#");
                writer.print(Integer.toHexString(this.f۱۰۰۸۶e));
                writer.print(" mPopExitAnim=#");
                writer.println(Integer.toHexString(this.f۱۰۰۸۷f));
            }
            if (this.f۱۰۰۹۴m != 0 || this.f۱۰۰۹۵n != null) {
                writer.print(prefix);
                writer.print("mBreadCrumbTitleRes=#");
                writer.print(Integer.toHexString(this.f۱۰۰۹۴m));
                writer.print(" mBreadCrumbTitleText=");
                writer.println(this.f۱۰۰۹۵n);
            }
            if (this.f۱۰۰۹۶o != 0 || this.f۱۰۰۹۷p != null) {
                writer.print(prefix);
                writer.print("mBreadCrumbShortTitleRes=#");
                writer.print(Integer.toHexString(this.f۱۰۰۹۶o));
                writer.print(" mBreadCrumbShortTitleText=");
                writer.println(this.f۱۰۰۹۷p);
            }
        }
        if (!this.f۱۰۰۸۳b.isEmpty()) {
            writer.print(prefix);
            writer.println("Operations:");
            String str = prefix + "    ";
            int numOps = this.f۱۰۰۸۳b.size();
            for (int opNum = 0; opNum < numOps; opNum++) {
                a op = this.f۱۰۰۸۳b.get(opNum);
                switch (op.f۱۰۱۰۲a) {
                    case 0:
                        cmdStr = "NULL";
                        break;
                    case 1:
                        cmdStr = "ADD";
                        break;
                    case 2:
                        cmdStr = "REPLACE";
                        break;
                    case 3:
                        cmdStr = "REMOVE";
                        break;
                    case 4:
                        cmdStr = "HIDE";
                        break;
                    case 5:
                        cmdStr = "SHOW";
                        break;
                    case 6:
                        cmdStr = "DETACH";
                        break;
                    case 7:
                        cmdStr = "ATTACH";
                        break;
                    case 8:
                        cmdStr = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        cmdStr = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        cmdStr = "cmd=" + op.f۱۰۱۰۲a;
                        break;
                }
                writer.print(prefix);
                writer.print("  Op #");
                writer.print(opNum);
                writer.print(": ");
                writer.print(cmdStr);
                writer.print(" ");
                writer.println(op.f۱۰۱۰۳b);
                if (full) {
                    if (op.f۱۰۱۰۴c != 0 || op.f۱۰۱۰۵d != 0) {
                        writer.print(prefix);
                        writer.print("enterAnim=#");
                        writer.print(Integer.toHexString(op.f۱۰۱۰۴c));
                        writer.print(" exitAnim=#");
                        writer.println(Integer.toHexString(op.f۱۰۱۰۵d));
                    }
                    if (op.f۱۰۱۰۶e != 0 || op.f۱۰۱۰۷f != 0) {
                        writer.print(prefix);
                        writer.print("popEnterAnim=#");
                        writer.print(Integer.toHexString(op.f۱۰۱۰۶e));
                        writer.print(" popExitAnim=#");
                        writer.println(Integer.toHexString(op.f۱۰۱۰۷f));
                    }
                }
            }
        }
    }

    public Cc(LayoutInflaterFactory2Cl manager) {
        this.f۱۰۰۸۲a = manager;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۰۱۳a(a op) {
        this.f۱۰۰۸۳b.add(op);
        op.f۱۰۱۰۴c = this.f۱۰۰۸۴c;
        op.f۱۰۱۰۵d = this.f۱۰۰۸۵d;
        op.f۱۰۱۰۶e = this.f۱۰۰۸۶e;
        op.f۱۰۱۰۷f = this.f۱۰۰۸۷f;
    }

    @Override // android.support.v4.app.AbstractCq
    /* renamed from: a, reason: contains not printable characters */
    public AbstractCq mo۱۰۴۰۹a(ComponentCallbacksCf fragment, String tag) {
        m۱۰۰۰۳a(0, fragment, tag, 1);
        return this;
    }

    @Override // android.support.v4.app.AbstractCq
    /* renamed from: a, reason: contains not printable characters */
    public AbstractCq mo۱۰۴۰۶a(int containerViewId, ComponentCallbacksCf fragment) {
        m۱۰۰۰۳a(containerViewId, fragment, (String) null, 1);
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۰۰۰۳a(int containerViewId, ComponentCallbacksCf fragment, String tag, int opcmd) {
        Class fragmentClass = fragment.getClass();
        int modifiers = fragmentClass.getModifiers();
        if (fragmentClass.isAnonymousClass() || !Modifier.isPublic(modifiers) || (fragmentClass.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + fragmentClass.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        fragment.f۱۰۱۷۳t = this.f۱۰۰۸۲a;
        if (tag != null) {
            String str = fragment.f۱۰۱۳۳B;
            if (str != null && !tag.equals(str)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f۱۰۱۳۳B + " now " + tag);
            }
            fragment.f۱۰۱۳۳B = tag;
        }
        if (containerViewId != 0) {
            if (containerViewId == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + tag + " to container view with no id");
            }
            int i = fragment.f۱۰۱۷۹z;
            if (i != 0 && i != containerViewId) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f۱۰۱۷۹z + " now " + containerViewId);
            }
            fragment.f۱۰۱۷۹z = containerViewId;
            fragment.f۱۰۱۳۲A = containerViewId;
        }
        m۱۰۰۱۳a(new a(opcmd, fragment));
    }

    @Override // android.support.v4.app.AbstractCq
    /* renamed from: b, reason: contains not printable characters */
    public AbstractCq mo۱۰۴۱۱b(int containerViewId, ComponentCallbacksCf fragment) {
        mo۱۰۴۰۷a(containerViewId, fragment, (String) null);
        return this;
    }

    @Override // android.support.v4.app.AbstractCq
    /* renamed from: a, reason: contains not printable characters */
    public AbstractCq mo۱۰۴۰۷a(int containerViewId, ComponentCallbacksCf fragment, String tag) {
        if (containerViewId == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        m۱۰۰۰۳a(containerViewId, fragment, tag, 2);
        return this;
    }

    @Override // android.support.v4.app.AbstractCq
    /* renamed from: a, reason: contains not printable characters */
    public AbstractCq mo۱۰۴۰۸a(ComponentCallbacksCf fragment) {
        m۱۰۰۱۳a(new a(3, fragment));
        return this;
    }

    /* renamed from: d, reason: contains not printable characters */
    public AbstractCq m۱۰۰۲۵d() {
        if (this.f۱۰۰۹۰i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۰۱۲a(int amt) {
        if (!this.f۱۰۰۹۰i) {
            return;
        }
        if (LayoutInflaterFactory2Cl.f۱۰۲۲۵G) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + amt);
        }
        int numOps = this.f۱۰۰۸۳b.size();
        for (int opNum = 0; opNum < numOps; opNum++) {
            a op = this.f۱۰۰۸۳b.get(opNum);
            ComponentCallbacksCf componentCallbacksCf = op.f۱۰۱۰۳b;
            if (componentCallbacksCf != null) {
                componentCallbacksCf.f۱۰۱۷۲s += amt;
                if (LayoutInflaterFactory2Cl.f۱۰۲۲۵G) {
                    Log.v("FragmentManager", "Bump nesting of " + op.f۱۰۱۰۳b + " to " + op.f۱۰۱۰۳b.f۱۰۱۷۲s);
                }
            }
        }
    }

    /* renamed from: h, reason: contains not printable characters */
    public void m۱۰۰۲۹h() {
        ArrayList<Runnable> arrayList = this.f۱۰۱۰۱t;
        if (arrayList != null) {
            int N = arrayList.size();
            for (int i = 0; i < N; i++) {
                this.f۱۰۱۰۱t.get(i).run();
            }
            this.f۱۰۱۰۱t = null;
        }
    }

    @Override // android.support.v4.app.AbstractCq
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۰۴۰۵a() {
        return m۱۰۰۰۶a(false);
    }

    @Override // android.support.v4.app.AbstractCq
    /* renamed from: b, reason: contains not printable characters */
    public int mo۱۰۴۱۰b() {
        return m۱۰۰۰۶a(true);
    }

    @Override // android.support.v4.app.AbstractCq
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۰۴۱۲c() {
        m۱۰۰۲۵d();
        this.f۱۰۰۸۲a.m۱۰۳۳۶b((LayoutInflaterFactory2Cl.l) this, true);
    }

    /* renamed from: a, reason: contains not printable characters */
    int m۱۰۰۰۶a(boolean allowStateLoss) {
        if (this.f۱۰۰۹۲k) {
            throw new IllegalStateException("commit already called");
        }
        if (LayoutInflaterFactory2Cl.f۱۰۲۲۵G) {
            Log.v("FragmentManager", "Commit: " + this);
            Ce logw = new Ce("FragmentManager");
            PrintWriter pw = new PrintWriter(logw);
            m۱۰۰۱۵a("  ", (FileDescriptor) null, pw, (String[]) null);
            pw.close();
        }
        this.f۱۰۰۹۲k = true;
        if (this.f۱۰۰۹۰i) {
            this.f۱۰۰۹۳l = this.f۱۰۰۸۲a.m۱۰۳۲۸b(this);
        } else {
            this.f۱۰۰۹۳l = -1;
        }
        this.f۱۰۰۸۲a.m۱۰۳۲۱a(this, allowStateLoss);
        return this.f۱۰۰۹۳l;
    }

    @Override // android.support.v4.app.LayoutInflaterFactory2Cl.l
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۰۳۸۶a(ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop) {
        if (LayoutInflaterFactory2Cl.f۱۰۲۲۵G) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        isRecordPop.add(false);
        if (this.f۱۰۰۹۰i) {
            this.f۱۰۰۸۲a.m۱۰۳۱۳a(this);
            return true;
        }
        return true;
    }

    /* renamed from: b, reason: contains not printable characters */
    boolean m۱۰۰۲۳b(int containerId) {
        int numOps = this.f۱۰۰۸۳b.size();
        int opNum = 0;
        while (true) {
            if (opNum >= numOps) {
                return false;
            }
            a op = this.f۱۰۰۸۳b.get(opNum);
            ComponentCallbacksCf componentCallbacksCf = op.f۱۰۱۰۳b;
            int fragContainer = componentCallbacksCf != null ? componentCallbacksCf.f۱۰۱۳۲A : 0;
            if (fragContainer == 0 || fragContainer != containerId) {
                opNum++;
            } else {
                return true;
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    boolean m۱۰۰۱۷a(ArrayList<Cc> arrayList, int startIndex, int endIndex) {
        if (endIndex == startIndex) {
            return false;
        }
        int numOps = this.f۱۰۰۸۳b.size();
        int lastContainer = -1;
        for (int opNum = 0; opNum < numOps; opNum++) {
            a op = this.f۱۰۰۸۳b.get(opNum);
            ComponentCallbacksCf componentCallbacksCf = op.f۱۰۱۰۳b;
            int container = componentCallbacksCf != null ? componentCallbacksCf.f۱۰۱۳۲A : 0;
            if (container != 0 && container != lastContainer) {
                lastContainer = container;
                for (int i = startIndex; i < endIndex; i++) {
                    Cc record = arrayList.get(i);
                    int numThoseOps = record.f۱۰۰۸۳b.size();
                    for (int thoseOpIndex = 0; thoseOpIndex < numThoseOps; thoseOpIndex++) {
                        a thatOp = record.f۱۰۰۸۳b.get(thoseOpIndex);
                        ComponentCallbacksCf componentCallbacksCf2 = thatOp.f۱۰۱۰۳b;
                        int thatContainer = componentCallbacksCf2 != null ? componentCallbacksCf2.f۱۰۱۳۲A : 0;
                        if (thatContainer == container) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: e, reason: contains not printable characters */
    void m۱۰۰۲۶e() {
        int numOps = this.f۱۰۰۸۳b.size();
        for (int opNum = 0; opNum < numOps; opNum++) {
            a op = this.f۱۰۰۸۳b.get(opNum);
            ComponentCallbacksCf f2 = op.f۱۰۱۰۳b;
            if (f2 != null) {
                f2.m۱۰۰۸۶a(this.f۱۰۰۸۸g, this.f۱۰۰۸۹h);
            }
            switch (op.f۱۰۱۰۲a) {
                case 1:
                    f2.m۱۰۱۲۱c(op.f۱۰۱۰۴c);
                    this.f۱۰۰۸۲a.m۱۰۳۱۹a(f2, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.f۱۰۱۰۲a);
                case 3:
                    f2.m۱۰۱۲۱c(op.f۱۰۱۰۵d);
                    this.f۱۰۰۸۲a.m۱۰۳۶۸l(f2);
                    break;
                case 4:
                    f2.m۱۰۱۲۱c(op.f۱۰۱۰۵d);
                    this.f۱۰۰۸۲a.m۱۰۳۵۳f(f2);
                    break;
                case 5:
                    f2.m۱۰۱۲۱c(op.f۱۰۱۰۴c);
                    this.f۱۰۰۸۲a.m۱۰۳۷۶p(f2);
                    break;
                case 6:
                    f2.m۱۰۱۲۱c(op.f۱۰۱۰۵d);
                    this.f۱۰۰۸۲a.m۱۰۳۴۵d(f2);
                    break;
                case 7:
                    f2.m۱۰۱۲۱c(op.f۱۰۱۰۴c);
                    this.f۱۰۰۸۲a.m۱۰۳۳۲b(f2);
                    break;
                case 8:
                    this.f۱۰۰۸۲a.m۱۰۳۷۳o(f2);
                    break;
                case 9:
                    this.f۱۰۰۸۲a.m۱۰۳۷۳o(null);
                    break;
            }
            if (!this.f۱۰۱۰۰s && op.f۱۰۱۰۲a != 1 && f2 != null) {
                this.f۱۰۰۸۲a.m۱۰۳۶۲i(f2);
            }
        }
        if (!this.f۱۰۱۰۰s) {
            LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۰۸۲a;
            layoutInflaterFactory2Cl.m۱۰۳۰۹a(layoutInflaterFactory2Cl.f۱۰۲۴۶n, true);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۰۰۲۲b(boolean moveToState) {
        for (int opNum = this.f۱۰۰۸۳b.size() - 1; opNum >= 0; opNum--) {
            a op = this.f۱۰۰۸۳b.get(opNum);
            ComponentCallbacksCf f2 = op.f۱۰۱۰۳b;
            if (f2 != null) {
                f2.m۱۰۰۸۶a(LayoutInflaterFactory2Cl.m۱۰۲۹۷e(this.f۱۰۰۸۸g), this.f۱۰۰۸۹h);
            }
            switch (op.f۱۰۱۰۲a) {
                case 1:
                    f2.m۱۰۱۲۱c(op.f۱۰۱۰۷f);
                    this.f۱۰۰۸۲a.m۱۰۳۶۸l(f2);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.f۱۰۱۰۲a);
                case 3:
                    f2.m۱۰۱۲۱c(op.f۱۰۱۰۶e);
                    this.f۱۰۰۸۲a.m۱۰۳۱۹a(f2, false);
                    break;
                case 4:
                    f2.m۱۰۱۲۱c(op.f۱۰۱۰۶e);
                    this.f۱۰۰۸۲a.m۱۰۳۷۶p(f2);
                    break;
                case 5:
                    f2.m۱۰۱۲۱c(op.f۱۰۱۰۷f);
                    this.f۱۰۰۸۲a.m۱۰۳۵۳f(f2);
                    break;
                case 6:
                    f2.m۱۰۱۲۱c(op.f۱۰۱۰۶e);
                    this.f۱۰۰۸۲a.m۱۰۳۳۲b(f2);
                    break;
                case 7:
                    f2.m۱۰۱۲۱c(op.f۱۰۱۰۷f);
                    this.f۱۰۰۸۲a.m۱۰۳۴۵d(f2);
                    break;
                case 8:
                    this.f۱۰۰۸۲a.m۱۰۳۷۳o(null);
                    break;
                case 9:
                    this.f۱۰۰۸۲a.m۱۰۳۷۳o(f2);
                    break;
            }
            if (!this.f۱۰۱۰۰s && op.f۱۰۱۰۲a != 3 && f2 != null) {
                this.f۱۰۰۸۲a.m۱۰۳۶۲i(f2);
            }
        }
        if (!this.f۱۰۱۰۰s && moveToState) {
            LayoutInflaterFactory2Cl layoutInflaterFactory2Cl = this.f۱۰۰۸۲a;
            layoutInflaterFactory2Cl.m۱۰۳۰۹a(layoutInflaterFactory2Cl.f۱۰۲۴۶n, true);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    ComponentCallbacksCf m۱۰۰۰۷a(ArrayList<ComponentCallbacksCf> arrayList, ComponentCallbacksCf oldPrimaryNav) {
        int opNum = 0;
        while (opNum < this.f۱۰۰۸۳b.size()) {
            a op = this.f۱۰۰۸۳b.get(opNum);
            int i = op.f۱۰۱۰۲a;
            if (i != 1) {
                if (i == 2) {
                    ComponentCallbacksCf f2 = op.f۱۰۱۰۳b;
                    int containerId = f2.f۱۰۱۳۲A;
                    boolean alreadyAdded = false;
                    for (int i2 = arrayList.size() - 1; i2 >= 0; i2--) {
                        ComponentCallbacksCf old = arrayList.get(i2);
                        if (old.f۱۰۱۳۲A == containerId) {
                            if (old == f2) {
                                alreadyAdded = true;
                            } else {
                                if (old == oldPrimaryNav) {
                                    this.f۱۰۰۸۳b.add(opNum, new a(9, old));
                                    opNum++;
                                    oldPrimaryNav = null;
                                }
                                a removeOp = new a(3, old);
                                removeOp.f۱۰۱۰۴c = op.f۱۰۱۰۴c;
                                removeOp.f۱۰۱۰۶e = op.f۱۰۱۰۶e;
                                removeOp.f۱۰۱۰۵d = op.f۱۰۱۰۵d;
                                removeOp.f۱۰۱۰۷f = op.f۱۰۱۰۷f;
                                this.f۱۰۰۸۳b.add(opNum, removeOp);
                                arrayList.remove(old);
                                opNum++;
                            }
                        }
                    }
                    if (alreadyAdded) {
                        this.f۱۰۰۸۳b.remove(opNum);
                        opNum--;
                    } else {
                        op.f۱۰۱۰۲a = 1;
                        arrayList.add(f2);
                    }
                } else if (i == 3 || i == 6) {
                    arrayList.remove(op.f۱۰۱۰۳b);
                    ComponentCallbacksCf componentCallbacksCf = op.f۱۰۱۰۳b;
                    if (componentCallbacksCf == oldPrimaryNav) {
                        this.f۱۰۰۸۳b.add(opNum, new a(9, componentCallbacksCf));
                        opNum++;
                        oldPrimaryNav = null;
                    }
                } else if (i != 7) {
                    if (i == 8) {
                        this.f۱۰۰۸۳b.add(opNum, new a(9, oldPrimaryNav));
                        opNum++;
                        oldPrimaryNav = op.f۱۰۱۰۳b;
                    }
                }
                opNum++;
            }
            arrayList.add(op.f۱۰۱۰۳b);
            opNum++;
        }
        return oldPrimaryNav;
    }

    /* renamed from: b, reason: contains not printable characters */
    ComponentCallbacksCf m۱۰۰۲۰b(ArrayList<ComponentCallbacksCf> arrayList, ComponentCallbacksCf oldPrimaryNav) {
        for (int opNum = 0; opNum < this.f۱۰۰۸۳b.size(); opNum++) {
            a op = this.f۱۰۰۸۳b.get(opNum);
            int i = op.f۱۰۱۰۲a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            oldPrimaryNav = null;
                            break;
                        case 9:
                            oldPrimaryNav = op.f۱۰۱۰۳b;
                            break;
                    }
                }
                arrayList.add(op.f۱۰۱۰۳b);
            }
            arrayList.remove(op.f۱۰۱۰۳b);
        }
        return oldPrimaryNav;
    }

    /* renamed from: g, reason: contains not printable characters */
    boolean m۱۰۰۲۸g() {
        for (int opNum = 0; opNum < this.f۱۰۰۸۳b.size(); opNum++) {
            a op = this.f۱۰۰۸۳b.get(opNum);
            if (m۱۰۰۰۴b(op)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۰۱۴a(ComponentCallbacksCf.f listener) {
        for (int opNum = 0; opNum < this.f۱۰۰۸۳b.size(); opNum++) {
            a op = this.f۱۰۰۸۳b.get(opNum);
            if (m۱۰۰۰۴b(op)) {
                op.f۱۰۱۰۳b.m۱۰۱۰۰a(listener);
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private static boolean m۱۰۰۰۴b(a op) {
        ComponentCallbacksCf fragment = op.f۱۰۱۰۳b;
        return (fragment == null || !fragment.f۱۰۱۶۶m || fragment.f۱۰۱۴۲K == null || fragment.f۱۰۱۳۵D || fragment.f۱۰۱۳۴C || !fragment.m۱۰۰۶۲H()) ? false : true;
    }

    /* renamed from: f, reason: contains not printable characters */
    public String m۱۰۰۲۷f() {
        return this.f۱۰۰۹۱j;
    }
}
