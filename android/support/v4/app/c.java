package android.support.v4.app;

import a.b.g.g.e;
import android.support.v4.app.f;
import android.support.v4.app.k;
import android.support.v4.app.l;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class c extends q implements k.a, l.AbstractC۰۰۲۶l {

    /* renamed from: a  reason: collision with root package name */
    final l f۱۰۴۹a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<a> f۱۰۵۰b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    int f۱۰۵۱c;

    /* renamed from: d  reason: collision with root package name */
    int f۱۰۵۲d;

    /* renamed from: e  reason: collision with root package name */
    int f۱۰۵۳e;

    /* renamed from: f  reason: collision with root package name */
    int f۱۰۵۴f;

    /* renamed from: g  reason: collision with root package name */
    int f۱۰۵۵g;

    /* renamed from: h  reason: collision with root package name */
    int f۱۰۵۶h;
    boolean i;
    String j;
    boolean k;
    int l = -1;
    int m;
    CharSequence n;
    int o;
    CharSequence p;
    ArrayList<String> q;
    ArrayList<String> r;
    boolean s = false;
    ArrayList<Runnable> t;

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f۱۰۵۷a;

        /* renamed from: b  reason: collision with root package name */
        f f۱۰۵۸b;

        /* renamed from: c  reason: collision with root package name */
        int f۱۰۵۹c;

        /* renamed from: d  reason: collision with root package name */
        int f۱۰۶۰d;

        /* renamed from: e  reason: collision with root package name */
        int f۱۰۶۱e;

        /* renamed from: f  reason: collision with root package name */
        int f۱۰۶۲f;

        a() {
        }

        a(int cmd, f fragment) {
            this.f۱۰۵۷a = cmd;
            this.f۱۰۵۸b = fragment;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.l >= 0) {
            sb.append(" #");
            sb.append(this.l);
        }
        if (this.j != null) {
            sb.append(" ");
            sb.append(this.j);
        }
        sb.append("}");
        return sb.toString();
    }

    public void a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        a(prefix, writer, true);
    }

    public void a(String prefix, PrintWriter writer, boolean full) {
        String cmdStr;
        if (full) {
            writer.print(prefix);
            writer.print("mName=");
            writer.print(this.j);
            writer.print(" mIndex=");
            writer.print(this.l);
            writer.print(" mCommitted=");
            writer.println(this.k);
            if (this.f۱۰۵۵g != 0) {
                writer.print(prefix);
                writer.print("mTransition=#");
                writer.print(Integer.toHexString(this.f۱۰۵۵g));
                writer.print(" mTransitionStyle=#");
                writer.println(Integer.toHexString(this.f۱۰۵۶h));
            }
            if (!(this.f۱۰۵۱c == 0 && this.f۱۰۵۲d == 0)) {
                writer.print(prefix);
                writer.print("mEnterAnim=#");
                writer.print(Integer.toHexString(this.f۱۰۵۱c));
                writer.print(" mExitAnim=#");
                writer.println(Integer.toHexString(this.f۱۰۵۲d));
            }
            if (!(this.f۱۰۵۳e == 0 && this.f۱۰۵۴f == 0)) {
                writer.print(prefix);
                writer.print("mPopEnterAnim=#");
                writer.print(Integer.toHexString(this.f۱۰۵۳e));
                writer.print(" mPopExitAnim=#");
                writer.println(Integer.toHexString(this.f۱۰۵۴f));
            }
            if (!(this.m == 0 && this.n == null)) {
                writer.print(prefix);
                writer.print("mBreadCrumbTitleRes=#");
                writer.print(Integer.toHexString(this.m));
                writer.print(" mBreadCrumbTitleText=");
                writer.println(this.n);
            }
            if (!(this.o == 0 && this.p == null)) {
                writer.print(prefix);
                writer.print("mBreadCrumbShortTitleRes=#");
                writer.print(Integer.toHexString(this.o));
                writer.print(" mBreadCrumbShortTitleText=");
                writer.println(this.p);
            }
        }
        if (!this.f۱۰۵۰b.isEmpty()) {
            writer.print(prefix);
            writer.println("Operations:");
            String str = prefix + "    ";
            int numOps = this.f۱۰۵۰b.size();
            for (int opNum = 0; opNum < numOps; opNum++) {
                a op = this.f۱۰۵۰b.get(opNum);
                switch (op.f۱۰۵۷a) {
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
                        cmdStr = "cmd=" + op.f۱۰۵۷a;
                        break;
                }
                writer.print(prefix);
                writer.print("  Op #");
                writer.print(opNum);
                writer.print(": ");
                writer.print(cmdStr);
                writer.print(" ");
                writer.println(op.f۱۰۵۸b);
                if (full) {
                    if (!(op.f۱۰۵۹c == 0 && op.f۱۰۶۰d == 0)) {
                        writer.print(prefix);
                        writer.print("enterAnim=#");
                        writer.print(Integer.toHexString(op.f۱۰۵۹c));
                        writer.print(" exitAnim=#");
                        writer.println(Integer.toHexString(op.f۱۰۶۰d));
                    }
                    if (op.f۱۰۶۱e != 0 || op.f۱۰۶۲f != 0) {
                        writer.print(prefix);
                        writer.print("popEnterAnim=#");
                        writer.print(Integer.toHexString(op.f۱۰۶۱e));
                        writer.print(" popExitAnim=#");
                        writer.println(Integer.toHexString(op.f۱۰۶۲f));
                    }
                }
            }
        }
    }

    public c(l manager) {
        this.f۱۰۴۹a = manager;
    }

    /* access modifiers changed from: package-private */
    public void a(a op) {
        this.f۱۰۵۰b.add(op);
        op.f۱۰۵۹c = this.f۱۰۵۱c;
        op.f۱۰۶۰d = this.f۱۰۵۲d;
        op.f۱۰۶۱e = this.f۱۰۵۳e;
        op.f۱۰۶۲f = this.f۱۰۵۴f;
    }

    @Override // android.support.v4.app.q
    public q a(f fragment, String tag) {
        a(0, fragment, tag, 1);
        return this;
    }

    @Override // android.support.v4.app.q
    public q a(int containerViewId, f fragment) {
        a(containerViewId, fragment, (String) null, 1);
        return this;
    }

    private void a(int containerViewId, f fragment, String tag, int opcmd) {
        Class fragmentClass = fragment.getClass();
        int modifiers = fragmentClass.getModifiers();
        if (fragmentClass.isAnonymousClass() || !Modifier.isPublic(modifiers) || (fragmentClass.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + fragmentClass.getCanonicalName() + " must be a public static class to be  properly recreated from" + " instance state.");
        }
        fragment.t = this.f۱۰۴۹a;
        if (tag != null) {
            String str = fragment.B;
            if (str == null || tag.equals(str)) {
                fragment.B = tag;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.B + " now " + tag);
            }
        }
        if (containerViewId != 0) {
            if (containerViewId != -1) {
                int i2 = fragment.z;
                if (i2 == 0 || i2 == containerViewId) {
                    fragment.z = containerViewId;
                    fragment.A = containerViewId;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.z + " now " + containerViewId);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + tag + " to container view with no id");
            }
        }
        a(new a(opcmd, fragment));
    }

    @Override // android.support.v4.app.q
    public q b(int containerViewId, f fragment) {
        a(containerViewId, fragment, (String) null);
        return this;
    }

    @Override // android.support.v4.app.q
    public q a(int containerViewId, f fragment, String tag) {
        if (containerViewId != 0) {
            a(containerViewId, fragment, tag, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    @Override // android.support.v4.app.q
    public q a(f fragment) {
        a(new a(3, fragment));
        return this;
    }

    public q d() {
        if (!this.i) {
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    public void a(int amt) {
        if (this.i) {
            if (l.G) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + amt);
            }
            int numOps = this.f۱۰۵۰b.size();
            for (int opNum = 0; opNum < numOps; opNum++) {
                a op = this.f۱۰۵۰b.get(opNum);
                f fVar = op.f۱۰۵۸b;
                if (fVar != null) {
                    fVar.s += amt;
                    if (l.G) {
                        Log.v("FragmentManager", "Bump nesting of " + op.f۱۰۵۸b + " to " + op.f۱۰۵۸b.s);
                    }
                }
            }
        }
    }

    public void h() {
        ArrayList<Runnable> arrayList = this.t;
        if (arrayList != null) {
            int N = arrayList.size();
            for (int i2 = 0; i2 < N; i2++) {
                this.t.get(i2).run();
            }
            this.t = null;
        }
    }

    @Override // android.support.v4.app.q
    public int a() {
        return a(false);
    }

    @Override // android.support.v4.app.q
    public int b() {
        return a(true);
    }

    @Override // android.support.v4.app.q
    public void c() {
        d();
        this.f۱۰۴۹a.b((l.AbstractC۰۰۲۶l) this, true);
    }

    /* access modifiers changed from: package-private */
    public int a(boolean allowStateLoss) {
        if (!this.k) {
            if (l.G) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter pw = new PrintWriter(new e("FragmentManager"));
                a("  ", (FileDescriptor) null, pw, (String[]) null);
                pw.close();
            }
            this.k = true;
            if (this.i) {
                this.l = this.f۱۰۴۹a.b(this);
            } else {
                this.l = -1;
            }
            this.f۱۰۴۹a.a(this, allowStateLoss);
            return this.l;
        }
        throw new IllegalStateException("commit already called");
    }

    @Override // android.support.v4.app.l.AbstractC۰۰۲۶l
    public boolean a(ArrayList<c> arrayList, ArrayList<Boolean> isRecordPop) {
        if (l.G) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        isRecordPop.add(false);
        if (!this.i) {
            return true;
        }
        this.f۱۰۴۹a.a(this);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean b(int containerId) {
        int numOps = this.f۱۰۵۰b.size();
        int opNum = 0;
        while (true) {
            int fragContainer = 0;
            if (opNum >= numOps) {
                return false;
            }
            f fVar = this.f۱۰۵۰b.get(opNum).f۱۰۵۸b;
            if (fVar != null) {
                fragContainer = fVar.A;
            }
            if (fragContainer != 0 && fragContainer == containerId) {
                return true;
            }
            opNum++;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(ArrayList<c> arrayList, int startIndex, int endIndex) {
        if (endIndex == startIndex) {
            return false;
        }
        int numOps = this.f۱۰۵۰b.size();
        int lastContainer = -1;
        for (int opNum = 0; opNum < numOps; opNum++) {
            f fVar = this.f۱۰۵۰b.get(opNum).f۱۰۵۸b;
            int container = fVar != null ? fVar.A : 0;
            if (!(container == 0 || container == lastContainer)) {
                lastContainer = container;
                for (int i2 = startIndex; i2 < endIndex; i2++) {
                    c record = arrayList.get(i2);
                    int numThoseOps = record.f۱۰۵۰b.size();
                    for (int thoseOpIndex = 0; thoseOpIndex < numThoseOps; thoseOpIndex++) {
                        f fVar2 = record.f۱۰۵۰b.get(thoseOpIndex).f۱۰۵۸b;
                        if ((fVar2 != null ? fVar2.A : 0) == container) {
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
    public void e() {
        int numOps = this.f۱۰۵۰b.size();
        for (int opNum = 0; opNum < numOps; opNum++) {
            a op = this.f۱۰۵۰b.get(opNum);
            f f2 = op.f۱۰۵۸b;
            if (f2 != null) {
                f2.a(this.f۱۰۵۵g, this.f۱۰۵۶h);
            }
            switch (op.f۱۰۵۷a) {
                case 1:
                    f2.c(op.f۱۰۵۹c);
                    this.f۱۰۴۹a.a(f2, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.f۱۰۵۷a);
                case 3:
                    f2.c(op.f۱۰۶۰d);
                    this.f۱۰۴۹a.l(f2);
                    break;
                case 4:
                    f2.c(op.f۱۰۶۰d);
                    this.f۱۰۴۹a.f(f2);
                    break;
                case 5:
                    f2.c(op.f۱۰۵۹c);
                    this.f۱۰۴۹a.p(f2);
                    break;
                case 6:
                    f2.c(op.f۱۰۶۰d);
                    this.f۱۰۴۹a.d(f2);
                    break;
                case 7:
                    f2.c(op.f۱۰۵۹c);
                    this.f۱۰۴۹a.b(f2);
                    break;
                case 8:
                    this.f۱۰۴۹a.o(f2);
                    break;
                case 9:
                    this.f۱۰۴۹a.o(null);
                    break;
            }
            if (!(this.s || op.f۱۰۵۷a == 1 || f2 == null)) {
                this.f۱۰۴۹a.i(f2);
            }
        }
        if (!this.s) {
            l lVar = this.f۱۰۴۹a;
            lVar.a(lVar.n, true);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(boolean moveToState) {
        for (int opNum = this.f۱۰۵۰b.size() - 1; opNum >= 0; opNum--) {
            a op = this.f۱۰۵۰b.get(opNum);
            f f2 = op.f۱۰۵۸b;
            if (f2 != null) {
                f2.a(l.e(this.f۱۰۵۵g), this.f۱۰۵۶h);
            }
            switch (op.f۱۰۵۷a) {
                case 1:
                    f2.c(op.f۱۰۶۲f);
                    this.f۱۰۴۹a.l(f2);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.f۱۰۵۷a);
                case 3:
                    f2.c(op.f۱۰۶۱e);
                    this.f۱۰۴۹a.a(f2, false);
                    break;
                case 4:
                    f2.c(op.f۱۰۶۱e);
                    this.f۱۰۴۹a.p(f2);
                    break;
                case 5:
                    f2.c(op.f۱۰۶۲f);
                    this.f۱۰۴۹a.f(f2);
                    break;
                case 6:
                    f2.c(op.f۱۰۶۱e);
                    this.f۱۰۴۹a.b(f2);
                    break;
                case 7:
                    f2.c(op.f۱۰۶۲f);
                    this.f۱۰۴۹a.d(f2);
                    break;
                case 8:
                    this.f۱۰۴۹a.o(null);
                    break;
                case 9:
                    this.f۱۰۴۹a.o(f2);
                    break;
            }
            if (!(this.s || op.f۱۰۵۷a == 3 || f2 == null)) {
                this.f۱۰۴۹a.i(f2);
            }
        }
        if (!this.s && moveToState) {
            l lVar = this.f۱۰۴۹a;
            lVar.a(lVar.n, true);
        }
    }

    /* access modifiers changed from: package-private */
    public f a(ArrayList<f> arrayList, f oldPrimaryNav) {
        int opNum = 0;
        while (opNum < this.f۱۰۵۰b.size()) {
            a op = this.f۱۰۵۰b.get(opNum);
            int i2 = op.f۱۰۵۷a;
            if (i2 != 1) {
                if (i2 == 2) {
                    f f2 = op.f۱۰۵۸b;
                    int containerId = f2.A;
                    boolean alreadyAdded = false;
                    for (int i3 = arrayList.size() - 1; i3 >= 0; i3--) {
                        f old = arrayList.get(i3);
                        if (old.A == containerId) {
                            if (old == f2) {
                                alreadyAdded = true;
                            } else {
                                if (old == oldPrimaryNav) {
                                    this.f۱۰۵۰b.add(opNum, new a(9, old));
                                    opNum++;
                                    oldPrimaryNav = null;
                                }
                                a removeOp = new a(3, old);
                                removeOp.f۱۰۵۹c = op.f۱۰۵۹c;
                                removeOp.f۱۰۶۱e = op.f۱۰۶۱e;
                                removeOp.f۱۰۶۰d = op.f۱۰۶۰d;
                                removeOp.f۱۰۶۲f = op.f۱۰۶۲f;
                                this.f۱۰۵۰b.add(opNum, removeOp);
                                arrayList.remove(old);
                                opNum++;
                            }
                        }
                    }
                    if (alreadyAdded) {
                        this.f۱۰۵۰b.remove(opNum);
                        opNum--;
                    } else {
                        op.f۱۰۵۷a = 1;
                        arrayList.add(f2);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(op.f۱۰۵۸b);
                    f fVar = op.f۱۰۵۸b;
                    if (fVar == oldPrimaryNav) {
                        this.f۱۰۵۰b.add(opNum, new a(9, fVar));
                        opNum++;
                        oldPrimaryNav = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f۱۰۵۰b.add(opNum, new a(9, oldPrimaryNav));
                        opNum++;
                        oldPrimaryNav = op.f۱۰۵۸b;
                    }
                }
                opNum++;
            }
            arrayList.add(op.f۱۰۵۸b);
            opNum++;
        }
        return oldPrimaryNav;
    }

    /* access modifiers changed from: package-private */
    public f b(ArrayList<f> arrayList, f oldPrimaryNav) {
        for (int opNum = 0; opNum < this.f۱۰۵۰b.size(); opNum++) {
            a op = this.f۱۰۵۰b.get(opNum);
            int i2 = op.f۱۰۵۷a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 8:
                            oldPrimaryNav = null;
                            break;
                        case 9:
                            oldPrimaryNav = op.f۱۰۵۸b;
                            break;
                    }
                }
                arrayList.add(op.f۱۰۵۸b);
            }
            arrayList.remove(op.f۱۰۵۸b);
        }
        return oldPrimaryNav;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        for (int opNum = 0; opNum < this.f۱۰۵۰b.size(); opNum++) {
            if (b(this.f۱۰۵۰b.get(opNum))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void a(f.AbstractC۰۰۲۵f listener) {
        for (int opNum = 0; opNum < this.f۱۰۵۰b.size(); opNum++) {
            a op = this.f۱۰۵۰b.get(opNum);
            if (b(op)) {
                op.f۱۰۵۸b.a(listener);
            }
        }
    }

    private static boolean b(a op) {
        f fragment = op.f۱۰۵۸b;
        return fragment != null && fragment.m && fragment.K != null && !fragment.D && !fragment.C && fragment.H();
    }

    public String f() {
        return this.j;
    }
}
