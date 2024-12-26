package android.support.p۰۴۳v4.app;

import android.arch.lifecycle.AbstractCe;
import android.arch.lifecycle.AbstractCk;
import android.arch.lifecycle.AbstractCn;
import android.arch.lifecycle.Cj;
import android.arch.lifecycle.Co;
import android.arch.lifecycle.Cp;
import android.os.Bundle;
import android.support.p۰۴۳v4.content.Cb;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cd;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.LoaderManagerImpl */
public class LoaderManagerImpl extends AbstractCu {

    /* renamed from: c  reason: contains not printable characters */
    static boolean f۱۰۰۶۴c = false;

    /* renamed from: a  reason: contains not printable characters */
    private final AbstractCe f۱۰۰۶۵a;

    /* renamed from: b  reason: contains not printable characters */
    private final LoaderViewModel f۱۰۰۶۶b;

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.LoaderManagerImpl$b  reason: invalid class name */
    public static class Cb<D> implements AbstractCk<D> {
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$a  reason: invalid class name */
    public static class Ca<D> extends Cj<D> implements Cb.AbstractCa<D> {

        /* renamed from: j  reason: contains not printable characters */
        private final int f۱۰۰۶۹j;

        /* renamed from: k  reason: contains not printable characters */
        private final Bundle f۱۰۰۷۰k;

        /* renamed from: l  reason: contains not printable characters */
        private final android.support.p۰۴۳v4.content.Cb<D> f۱۰۰۷۱l;

        /* renamed from: m  reason: contains not printable characters */
        private AbstractCe f۱۰۰۷۲m;

        /* renamed from: n  reason: contains not printable characters */
        private Cb<D> f۱۰۰۷۳n;

        /* renamed from: o  reason: contains not printable characters */
        private android.support.p۰۴۳v4.content.Cb<D> f۱۰۰۷۴o;

        /* access modifiers changed from: protected */
        @Override // android.arch.lifecycle.LiveData
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۲۰۵۳a() {
            if (LoaderManagerImpl.f۱۰۰۶۴c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f۱۰۰۷۱l.m۱۲۶۳۰c();
            throw null;
        }

        /* access modifiers changed from: protected */
        @Override // android.arch.lifecycle.LiveData
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۲۰۵۷b() {
            if (LoaderManagerImpl.f۱۰۰۶۴c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f۱۰۰۷۱l.m۱۲۶۳۱d();
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d  reason: contains not printable characters */
        public void m۱۲۰۵۸d() {
            AbstractCe lifecycleOwner = this.f۱۰۰۷۲m;
            LoaderObserver<D> observer = this.f۱۰۰۷۳n;
            if (lifecycleOwner != null && observer != null) {
                super.m۱۰۸۶۵a((AbstractCk) observer);
                m۱۰۸۶۴a(lifecycleOwner, (AbstractCk) observer);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.arch.lifecycle.k<? super D> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.arch.lifecycle.LiveData
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۲۰۵۴a(AbstractCk<? super D> kVar) {
            super.m۱۰۸۶۵a((AbstractCk) kVar);
            this.f۱۰۰۷۲m = null;
            this.f۱۰۰۷۳n = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public android.support.p۰۴۳v4.content.Cb<D> m۱۲۰۵۲a(boolean reset) {
            if (LoaderManagerImpl.f۱۰۰۶۴c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f۱۰۰۷۱l.m۱۲۶۲۸a();
            throw null;
        }

        @Override // android.arch.lifecycle.Cj, android.arch.lifecycle.LiveData
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۲۰۵۵a(D value) {
            super.m۱۰۹۱۸a((Object) value);
            android.support.p۰۴۳v4.content.Cb<D> bVar = this.f۱۰۰۷۴o;
            if (bVar != null) {
                bVar.m۱۲۶۲۹b();
                throw null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f۱۰۰۶۹j);
            sb.append(" : ");
            Cd.m۱۰۵۹۲a(this.f۱۰۰۷۱l, sb);
            sb.append("}}");
            return sb.toString();
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۲۰۵۶a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
            writer.print(prefix);
            writer.print("mId=");
            writer.print(this.f۱۰۰۶۹j);
            writer.print(" mArgs=");
            writer.println(this.f۱۰۰۷۰k);
            writer.print(prefix);
            writer.print("mLoader=");
            writer.println(this.f۱۰۰۷۱l);
            android.support.p۰۴۳v4.content.Cb<D> bVar = this.f۱۰۰۷۱l;
            bVar.m۱۲۶۲۷a(prefix + "  ", fd, writer, args);
            throw null;
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel */
    static class LoaderViewModel extends AbstractCn {

        /* renamed from: b  reason: contains not printable characters */
        private static final Co.AbstractCa f۱۰۰۶۷b = new Ca();

        /* renamed from: a  reason: contains not printable characters */
        private p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Co<Ca> f۱۰۰۶۸a = new p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Co<>();

        /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel$a  reason: invalid class name */
        static class Ca implements Co.AbstractCa {
            Ca() {
            }

            @Override // android.arch.lifecycle.Co.AbstractCa
            /* renamed from: a  reason: contains not printable characters */
            public <T extends AbstractCn> T m۱۲۰۵۱a(Class<T> cls) {
                return new LoaderViewModel();
            }
        }

        LoaderViewModel() {
        }

        /* renamed from: a  reason: contains not printable characters */
        static LoaderViewModel m۱۲۰۴۷a(Cp viewModelStore) {
            return (LoaderViewModel) new Co(viewModelStore, f۱۰۰۶۷b).m۱۰۹۲۹a(LoaderViewModel.class);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۲۰۵۰b() {
            int size = this.f۱۰۰۶۸a.m۱۰۶۶۱b();
            for (int index = 0; index < size; index++) {
                this.f۱۰۰۶۸a.m۱۰۶۶۸f(index).m۱۲۰۵۸d();
            }
        }

        /* access modifiers changed from: protected */
        @Override // android.arch.lifecycle.AbstractCn
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۲۰۴۸a() {
            super.m۱۰۹۲۸a();
            if (0 >= this.f۱۰۰۶۸a.m۱۰۶۶۱b()) {
                this.f۱۰۰۶۸a.m۱۰۶۵۸a();
            } else {
                this.f۱۰۰۶۸a.m۱۰۶۶۸f(0).m۱۲۰۵۲a(true);
                throw null;
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۲۰۴۹a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
            if (this.f۱۰۰۶۸a.m۱۰۶۶۱b() > 0) {
                writer.print(prefix);
                writer.println("Loaders:");
                String str = prefix + "    ";
                if (0 < this.f۱۰۰۶۸a.m۱۰۶۶۱b()) {
                    Ca info2 = this.f۱۰۰۶۸a.m۱۰۶۶۸f(0);
                    writer.print(prefix);
                    writer.print("  #");
                    writer.print(this.f۱۰۰۶۸a.m۱۰۶۶۶d(0));
                    writer.print(": ");
                    writer.println(info2.toString());
                    info2.m۱۲۰۵۶a(str, fd, writer, args);
                    throw null;
                }
            }
        }
    }

    LoaderManagerImpl(AbstractCe lifecycleOwner, Cp viewModelStore) {
        this.f۱۰۰۶۵a = lifecycleOwner;
        this.f۱۰۰۶۶b = LoaderViewModel.m۱۲۰۴۷a(viewModelStore);
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCu
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۰۴۵a() {
        this.f۱۰۰۶۶b.m۱۲۰۵۰b();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Cd.m۱۰۵۹۲a(this.f۱۰۰۶۵a, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCu
    @Deprecated
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۰۴۶a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        this.f۱۰۰۶۶b.m۱۲۰۴۹a(prefix, fd, writer, args);
    }
}
