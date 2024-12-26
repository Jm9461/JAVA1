package android.support.p۰۴۳v4.app;

import android.support.p۰۴۳v4.app.AbstractCk;
import android.support.p۰۴۳v4.app.ComponentCallbacksCf;
import android.support.p۰۴۳v4.app.LayoutInflater$Factory2Cl;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ce;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.c  reason: invalid class name */
public final class Cc extends AbstractCq implements AbstractCk.AbstractCa, LayoutInflater$Factory2Cl.AbstractCl {

    /* renamed from: a  reason: contains not printable characters */
    final LayoutInflater$Factory2Cl f۱۰۰۸۲a;

    /* renamed from: b  reason: contains not printable characters */
    ArrayList<Ca> f۱۰۰۸۳b = new ArrayList<>();

    /* renamed from: c  reason: contains not printable characters */
    int f۱۰۰۸۴c;

    /* renamed from: d  reason: contains not printable characters */
    int f۱۰۰۸۵d;

    /* renamed from: e  reason: contains not printable characters */
    int f۱۰۰۸۶e;

    /* renamed from: f  reason: contains not printable characters */
    int f۱۰۰۸۷f;

    /* renamed from: g  reason: contains not printable characters */
    int f۱۰۰۸۸g;

    /* renamed from: h  reason: contains not printable characters */
    int f۱۰۰۸۹h;

    /* renamed from: i  reason: contains not printable characters */
    boolean f۱۰۰۹۰i;

    /* renamed from: j  reason: contains not printable characters */
    String f۱۰۰۹۱j;

    /* renamed from: k  reason: contains not printable characters */
    boolean f۱۰۰۹۲k;

    /* renamed from: l  reason: contains not printable characters */
    int f۱۰۰۹۳l = -1;

    /* renamed from: m  reason: contains not printable characters */
    int f۱۰۰۹۴m;

    /* renamed from: n  reason: contains not printable characters */
    CharSequence f۱۰۰۹۵n;

    /* renamed from: o  reason: contains not printable characters */
    int f۱۰۰۹۶o;

    /* renamed from: p  reason: contains not printable characters */
    CharSequence f۱۰۰۹۷p;

    /* renamed from: q  reason: contains not printable characters */
    ArrayList<String> f۱۰۰۹۸q;

    /* renamed from: r  reason: contains not printable characters */
    ArrayList<String> f۱۰۰۹۹r;

    /* renamed from: s  reason: contains not printable characters */
    boolean f۱۰۱۰۰s = false;

    /* renamed from: t  reason: contains not printable characters */
    ArrayList<Runnable> f۱۰۱۰۱t;

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.c$a  reason: invalid class name */
    public static final class Ca {

        /* renamed from: a  reason: contains not printable characters */
        int f۱۰۱۰۲a;

        /* renamed from: b  reason: contains not printable characters */
        ComponentCallbacksCf f۱۰۱۰۳b;

        /* renamed from: c  reason: contains not printable characters */
        int f۱۰۱۰۴c;

        /* renamed from: d  reason: contains not printable characters */
        int f۱۰۱۰۵d;

        /* renamed from: e  reason: contains not printable characters */
        int f۱۰۱۰۶e;

        /* renamed from: f  reason: contains not printable characters */
        int f۱۰۱۰۷f;

        Ca() {
        }

        Ca(int cmd, ComponentCallbacksCf fragment) {
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

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۰۸۵a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        m۱۲۰۸۶a(prefix, writer, true);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۰۸۶a(String prefix, PrintWriter writer, boolean full) {
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
            if (!(this.f۱۰۰۸۴c == 0 && this.f۱۰۰۸۵d == 0)) {
                writer.print(prefix);
                writer.print("mEnterAnim=#");
                writer.print(Integer.toHexString(this.f۱۰۰۸۴c));
                writer.print(" mExitAnim=#");
                writer.println(Integer.toHexString(this.f۱۰۰۸۵d));
            }
            if (!(this.f۱۰۰۸۶e == 0 && this.f۱۰۰۸۷f == 0)) {
                writer.print(prefix);
                writer.print("mPopEnterAnim=#");
                writer.print(Integer.toHexString(this.f۱۰۰۸۶e));
                writer.print(" mPopExitAnim=#");
                writer.println(Integer.toHexString(this.f۱۰۰۸۷f));
            }
            if (!(this.f۱۰۰۹۴m == 0 && this.f۱۰۰۹۵n == null)) {
                writer.print(prefix);
                writer.print("mBreadCrumbTitleRes=#");
                writer.print(Integer.toHexString(this.f۱۰۰۹۴m));
                writer.print(" mBreadCrumbTitleText=");
                writer.println(this.f۱۰۰۹۵n);
            }
            if (!(this.f۱۰۰۹۶o == 0 && this.f۱۰۰۹۷p == null)) {
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
                Ca op = this.f۱۰۰۸۳b.get(opNum);
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
                    if (!(op.f۱۰۱۰۴c == 0 && op.f۱۰۱۰۵d == 0)) {
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

    public Cc(LayoutInflater$Factory2Cl manager) {
        this.f۱۰۰۸۲a = manager;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۰۸۳a(Ca op) {
        this.f۱۰۰۸۳b.add(op);
        op.f۱۰۱۰۴c = this.f۱۰۰۸۴c;
        op.f۱۰۱۰۵d = this.f۱۰۰۸۵d;
        op.f۱۰۱۰۶e = this.f۱۰۰۸۶e;
        op.f۱۰۱۰۷f = this.f۱۰۰۸۷f;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCq
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCq m۱۲۰۸۱a(ComponentCallbacksCf fragment, String tag) {
        m۱۲۰۷۳a(0, fragment, tag, 1);
        return this;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCq
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCq m۱۲۰۷۸a(int containerViewId, ComponentCallbacksCf fragment) {
        m۱۲۰۷۳a(containerViewId, fragment, (String) null, 1);
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۲۰۷۳a(int containerViewId, ComponentCallbacksCf fragment, String tag, int opcmd) {
        Class fragmentClass = fragment.getClass();
        int modifiers = fragmentClass.getModifiers();
        if (fragmentClass.isAnonymousClass() || !Modifier.isPublic(modifiers) || (fragmentClass.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + fragmentClass.getCanonicalName() + " must be a public static class to be  properly recreated from" + " instance state.");
        }
        fragment.f۱۰۱۷۳t = this.f۱۰۰۸۲a;
        if (tag != null) {
            String str = fragment.f۱۰۱۳۳B;
            if (str == null || tag.equals(str)) {
                fragment.f۱۰۱۳۳B = tag;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f۱۰۱۳۳B + " now " + tag);
            }
        }
        if (containerViewId != 0) {
            if (containerViewId != -1) {
                int i = fragment.f۱۰۱۷۹z;
                if (i == 0 || i == containerViewId) {
                    fragment.f۱۰۱۷۹z = containerViewId;
                    fragment.f۱۰۱۳۲A = containerViewId;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f۱۰۱۷۹z + " now " + containerViewId);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + tag + " to container view with no id");
            }
        }
        m۱۲۰۸۳a(new Ca(opcmd, fragment));
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCq
    /* renamed from: b  reason: contains not printable characters */
    public AbstractCq m۱۲۰۹۱b(int containerViewId, ComponentCallbacksCf fragment) {
        m۱۲۰۷۹a(containerViewId, fragment, (String) null);
        return this;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCq
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCq m۱۲۰۷۹a(int containerViewId, ComponentCallbacksCf fragment, String tag) {
        if (containerViewId != 0) {
            m۱۲۰۷۳a(containerViewId, fragment, tag, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCq
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCq m۱۲۰۸۰a(ComponentCallbacksCf fragment) {
        m۱۲۰۸۳a(new Ca(3, fragment));
        return this;
    }

    /* renamed from: d  reason: contains not printable characters */
    public AbstractCq m۱۲۰۹۵d() {
        if (!this.f۱۰۰۹۰i) {
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۰۸۲a(int amt) {
        if (this.f۱۰۰۹۰i) {
            if (LayoutInflater$Factory2Cl.f۱۰۲۲۵G) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + amt);
            }
            int numOps = this.f۱۰۰۸۳b.size();
            for (int opNum = 0; opNum < numOps; opNum++) {
                Ca op = this.f۱۰۰۸۳b.get(opNum);
                ComponentCallbacksCf fVar = op.f۱۰۱۰۳b;
                if (fVar != null) {
                    fVar.f۱۰۱۷۲s += amt;
                    if (LayoutInflater$Factory2Cl.f۱۰۲۲۵G) {
                        Log.v("FragmentManager", "Bump nesting of " + op.f۱۰۱۰۳b + " to " + op.f۱۰۱۰۳b.f۱۰۱۷۲s);
                    }
                }
            }
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    public void m۱۲۰۹۹h() {
        ArrayList<Runnable> arrayList = this.f۱۰۱۰۱t;
        if (arrayList != null) {
            int N = arrayList.size();
            for (int i = 0; i < N; i++) {
                this.f۱۰۱۰۱t.get(i).run();
            }
            this.f۱۰۱۰۱t = null;
        }
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCq
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۲۰۷۵a() {
        return m۱۲۰۷۶a(false);
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCq
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۲۰۸۹b() {
        return m۱۲۰۷۶a(true);
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCq
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۰۹۴c() {
        m۱۲۰۹۵d();
        this.f۱۰۰۸۲a.m۱۲۴۰۶b((LayoutInflater$Factory2Cl.AbstractCl) this, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۲۰۷۶a(boolean allowStateLoss) {
        if (!this.f۱۰۰۹۲k) {
            if (LayoutInflater$Factory2Cl.f۱۰۲۲۵G) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter pw = new PrintWriter(new Ce("FragmentManager"));
                m۱۲۰۸۵a("  ", (FileDescriptor) null, pw, (String[]) null);
                pw.close();
            }
            this.f۱۰۰۹۲k = true;
            if (this.f۱۰۰۹۰i) {
                this.f۱۰۰۹۳l = this.f۱۰۰۸۲a.m۱۲۳۹۸b(this);
            } else {
                this.f۱۰۰۹۳l = -1;
            }
            this.f۱۰۰۸۲a.m۱۲۳۹۱a(this, allowStateLoss);
            return this.f۱۰۰۹۳l;
        }
        throw new IllegalStateException("commit already called");
    }

    @Override // android.support.p۰۴۳v4.app.LayoutInflater$Factory2Cl.AbstractCl
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۰۸۸a(ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop) {
        if (LayoutInflater$Factory2Cl.f۱۰۲۲۵G) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        isRecordPop.add(false);
        if (!this.f۱۰۰۹۰i) {
            return true;
        }
        this.f۱۰۰۸۲a.m۱۲۳۸۳a(this);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۲۰۹۳b(int containerId) {
        int numOps = this.f۱۰۰۸۳b.size();
        int opNum = 0;
        while (true) {
            int fragContainer = 0;
            if (opNum >= numOps) {
                return false;
            }
            ComponentCallbacksCf fVar = this.f۱۰۰۸۳b.get(opNum).f۱۰۱۰۳b;
            if (fVar != null) {
                fragContainer = fVar.f۱۰۱۳۲A;
            }
            if (fragContainer != 0 && fragContainer == containerId) {
                return true;
            }
            opNum++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۰۸۷a(ArrayList<Cc> arrayList, int startIndex, int endIndex) {
        if (endIndex == startIndex) {
            return false;
        }
        int numOps = this.f۱۰۰۸۳b.size();
        int lastContainer = -1;
        for (int opNum = 0; opNum < numOps; opNum++) {
            ComponentCallbacksCf fVar = this.f۱۰۰۸۳b.get(opNum).f۱۰۱۰۳b;
            int container = fVar != null ? fVar.f۱۰۱۳۲A : 0;
            if (!(container == 0 || container == lastContainer)) {
                lastContainer = container;
                for (int i = startIndex; i < endIndex; i++) {
                    Cc record = arrayList.get(i);
                    int numThoseOps = record.f۱۰۰۸۳b.size();
                    for (int thoseOpIndex = 0; thoseOpIndex < numThoseOps; thoseOpIndex++) {
                        ComponentCallbacksCf fVar2 = record.f۱۰۰۸۳b.get(thoseOpIndex).f۱۰۱۰۳b;
                        if ((fVar2 != null ? fVar2.f۱۰۱۳۲A : 0) == container) {
                            return true;
                        }
                    }
                }
                continue;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۲۰۹۶e() {
        int numOps = this.f۱۰۰۸۳b.size();
        for (int opNum = 0; opNum < numOps; opNum++) {
            Ca op = this.f۱۰۰۸۳b.get(opNum);
            ComponentCallbacksCf f = op.f۱۰۱۰۳b;
            if (f != null) {
                f.m۱۲۱۵۶a(this.f۱۰۰۸۸g, this.f۱۰۰۸۹h);
            }
            switch (op.f۱۰۱۰۲a) {
                case 1:
                    f.m۱۲۱۹۱c(op.f۱۰۱۰۴c);
                    this.f۱۰۰۸۲a.m۱۲۳۸۹a(f, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.f۱۰۱۰۲a);
                case 3:
                    f.m۱۲۱۹۱c(op.f۱۰۱۰۵d);
                    this.f۱۰۰۸۲a.m۱۲۴۳۸l(f);
                    break;
                case 4:
                    f.m۱۲۱۹۱c(op.f۱۰۱۰۵d);
                    this.f۱۰۰۸۲a.m۱۲۴۲۳f(f);
                    break;
                case 5:
                    f.m۱۲۱۹۱c(op.f۱۰۱۰۴c);
                    this.f۱۰۰۸۲a.m۱۲۴۴۶p(f);
                    break;
                case 6:
                    f.m۱۲۱۹۱c(op.f۱۰۱۰۵d);
                    this.f۱۰۰۸۲a.m۱۲۴۱۵d(f);
                    break;
                case 7:
                    f.m۱۲۱۹۱c(op.f۱۰۱۰۴c);
                    this.f۱۰۰۸۲a.m۱۲۴۰۲b(f);
                    break;
                case 8:
                    this.f۱۰۰۸۲a.m۱۲۴۴۳o(f);
                    break;
                case 9:
                    this.f۱۰۰۸۲a.m۱۲۴۴۳o(null);
                    break;
            }
            if (!(this.f۱۰۱۰۰s || op.f۱۰۱۰۲a == 1 || f == null)) {
                this.f۱۰۰۸۲a.m۱۲۴۳۲i(f);
            }
        }
        if (!this.f۱۰۱۰۰s) {
            LayoutInflater$Factory2Cl lVar = this.f۱۰۰۸۲a;
            lVar.m۱۲۳۷۹a(lVar.f۱۰۲۴۶n, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۰۹۲b(boolean moveToState) {
        for (int opNum = this.f۱۰۰۸۳b.size() - 1; opNum >= 0; opNum--) {
            Ca op = this.f۱۰۰۸۳b.get(opNum);
            ComponentCallbacksCf f = op.f۱۰۱۰۳b;
            if (f != null) {
                f.m۱۲۱۵۶a(LayoutInflater$Factory2Cl.m۱۲۳۶۷e(this.f۱۰۰۸۸g), this.f۱۰۰۸۹h);
            }
            switch (op.f۱۰۱۰۲a) {
                case 1:
                    f.m۱۲۱۹۱c(op.f۱۰۱۰۷f);
                    this.f۱۰۰۸۲a.m۱۲۴۳۸l(f);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.f۱۰۱۰۲a);
                case 3:
                    f.m۱۲۱۹۱c(op.f۱۰۱۰۶e);
                    this.f۱۰۰۸۲a.m۱۲۳۸۹a(f, false);
                    break;
                case 4:
                    f.m۱۲۱۹۱c(op.f۱۰۱۰۶e);
                    this.f۱۰۰۸۲a.m۱۲۴۴۶p(f);
                    break;
                case 5:
                    f.m۱۲۱۹۱c(op.f۱۰۱۰۷f);
                    this.f۱۰۰۸۲a.m۱۲۴۲۳f(f);
                    break;
                case 6:
                    f.m۱۲۱۹۱c(op.f۱۰۱۰۶e);
                    this.f۱۰۰۸۲a.m۱۲۴۰۲b(f);
                    break;
                case 7:
                    f.m۱۲۱۹۱c(op.f۱۰۱۰۷f);
                    this.f۱۰۰۸۲a.m۱۲۴۱۵d(f);
                    break;
                case 8:
                    this.f۱۰۰۸۲a.m۱۲۴۴۳o(null);
                    break;
                case 9:
                    this.f۱۰۰۸۲a.m۱۲۴۴۳o(f);
                    break;
            }
            if (!(this.f۱۰۱۰۰s || op.f۱۰۱۰۲a == 3 || f == null)) {
                this.f۱۰۰۸۲a.m۱۲۴۳۲i(f);
            }
        }
        if (!this.f۱۰۱۰۰s && moveToState) {
            LayoutInflater$Factory2Cl lVar = this.f۱۰۰۸۲a;
            lVar.m۱۲۳۷۹a(lVar.f۱۰۲۴۶n, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public ComponentCallbacksCf m۱۲۰۷۷a(ArrayList<ComponentCallbacksCf> arrayList, ComponentCallbacksCf oldPrimaryNav) {
        int opNum = 0;
        while (opNum < this.f۱۰۰۸۳b.size()) {
            Ca op = this.f۱۰۰۸۳b.get(opNum);
            int i = op.f۱۰۱۰۲a;
            if (i != 1) {
                if (i == 2) {
                    ComponentCallbacksCf f = op.f۱۰۱۰۳b;
                    int containerId = f.f۱۰۱۳۲A;
                    boolean alreadyAdded = false;
                    for (int i2 = arrayList.size() - 1; i2 >= 0; i2--) {
                        ComponentCallbacksCf old = arrayList.get(i2);
                        if (old.f۱۰۱۳۲A == containerId) {
                            if (old == f) {
                                alreadyAdded = true;
                            } else {
                                if (old == oldPrimaryNav) {
                                    this.f۱۰۰۸۳b.add(opNum, new Ca(9, old));
                                    opNum++;
                                    oldPrimaryNav = null;
                                }
                                Ca removeOp = new Ca(3, old);
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
                        arrayList.add(f);
                    }
                } else if (i == 3 || i == 6) {
                    arrayList.remove(op.f۱۰۱۰۳b);
                    ComponentCallbacksCf fVar = op.f۱۰۱۰۳b;
                    if (fVar == oldPrimaryNav) {
                        this.f۱۰۰۸۳b.add(opNum, new Ca(9, fVar));
                        opNum++;
                        oldPrimaryNav = null;
                    }
                } else if (i != 7) {
                    if (i == 8) {
                        this.f۱۰۰۸۳b.add(opNum, new Ca(9, oldPrimaryNav));
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

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public ComponentCallbacksCf m۱۲۰۹۰b(ArrayList<ComponentCallbacksCf> arrayList, ComponentCallbacksCf oldPrimaryNav) {
        for (int opNum = 0; opNum < this.f۱۰۰۸۳b.size(); opNum++) {
            Ca op = this.f۱۰۰۸۳b.get(opNum);
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

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public boolean m۱۲۰۹۸g() {
        for (int opNum = 0; opNum < this.f۱۰۰۸۳b.size(); opNum++) {
            if (m۱۲۰۷۴b(this.f۱۰۰۸۳b.get(opNum))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۰۸۴a(ComponentCallbacksCf.AbstractCf listener) {
        for (int opNum = 0; opNum < this.f۱۰۰۸۳b.size(); opNum++) {
            Ca op = this.f۱۰۰۸۳b.get(opNum);
            if (m۱۲۰۷۴b(op)) {
                op.f۱۰۱۰۳b.m۱۲۱۷۰a(listener);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private static boolean m۱۲۰۷۴b(Ca op) {
        ComponentCallbacksCf fragment = op.f۱۰۱۰۳b;
        return fragment != null && fragment.f۱۰۱۶۶m && fragment.f۱۰۱۴۲K != null && !fragment.f۱۰۱۳۵D && !fragment.f۱۰۱۳۴C && fragment.m۱۲۱۳۲H();
    }

    /* renamed from: f  reason: contains not printable characters */
    public String m۱۲۰۹۷f() {
        return this.f۱۰۰۹۱j;
    }
}
