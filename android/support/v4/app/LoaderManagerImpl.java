package android.support.v4.app;

import a.b.g.g.d;
import android.arch.lifecycle.e;
import android.arch.lifecycle.j;
import android.arch.lifecycle.k;
import android.arch.lifecycle.n;
import android.arch.lifecycle.o;
import android.arch.lifecycle.p;
import android.os.Bundle;
import android.support.v4.content.b;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* access modifiers changed from: package-private */
public class LoaderManagerImpl extends u {

    /* renamed from: c  reason: collision with root package name */
    static boolean f۱۰۳۷c = false;

    /* renamed from: a  reason: collision with root package name */
    private final e f۱۰۳۸a;

    /* renamed from: b  reason: collision with root package name */
    private final LoaderViewModel f۱۰۳۹b;

    /* access modifiers changed from: package-private */
    public static class b<D> implements k<D> {
    }

    public static class a<D> extends j<D> implements b.a<D> {
        private final int j;
        private final Bundle k;
        private final android.support.v4.content.b<D> l;
        private e m;
        private b<D> n;
        private android.support.v4.content.b<D> o;

        /* access modifiers changed from: protected */
        @Override // android.arch.lifecycle.LiveData
        public void a() {
            if (LoaderManagerImpl.f۱۰۳۷c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.l.c();
            throw null;
        }

        /* access modifiers changed from: protected */
        @Override // android.arch.lifecycle.LiveData
        public void b() {
            if (LoaderManagerImpl.f۱۰۳۷c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.l.d();
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            e lifecycleOwner = this.m;
            LoaderObserver<D> observer = this.n;
            if (lifecycleOwner != null && observer != null) {
                super.a((k) observer);
                a(lifecycleOwner, (k) observer);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.arch.lifecycle.k<? super D> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.arch.lifecycle.LiveData
        public void a(k<? super D> kVar) {
            super.a((k) kVar);
            this.m = null;
            this.n = null;
        }

        /* access modifiers changed from: package-private */
        public android.support.v4.content.b<D> a(boolean reset) {
            if (LoaderManagerImpl.f۱۰۳۷c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.l.a();
            throw null;
        }

        @Override // android.arch.lifecycle.j, android.arch.lifecycle.LiveData
        public void a(D value) {
            super.a((Object) value);
            android.support.v4.content.b<D> bVar = this.o;
            if (bVar != null) {
                bVar.b();
                throw null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.j);
            sb.append(" : ");
            d.a(this.l, sb);
            sb.append("}}");
            return sb.toString();
        }

        public void a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
            writer.print(prefix);
            writer.print("mId=");
            writer.print(this.j);
            writer.print(" mArgs=");
            writer.println(this.k);
            writer.print(prefix);
            writer.print("mLoader=");
            writer.println(this.l);
            android.support.v4.content.b<D> bVar = this.l;
            bVar.a(prefix + "  ", fd, writer, args);
            throw null;
        }
    }

    static class LoaderViewModel extends n {

        /* renamed from: b  reason: collision with root package name */
        private static final o.a f۱۰۴۰b = new a();

        /* renamed from: a  reason: collision with root package name */
        private a.b.g.g.o<a> f۱۰۴۱a = new a.b.g.g.o<>();

        static class a implements o.a {
            a() {
            }

            @Override // android.arch.lifecycle.o.a
            public <T extends n> T a(Class<T> cls) {
                return new LoaderViewModel();
            }
        }

        LoaderViewModel() {
        }

        static LoaderViewModel a(p viewModelStore) {
            return (LoaderViewModel) new o(viewModelStore, f۱۰۴۰b).a(LoaderViewModel.class);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int size = this.f۱۰۴۱a.b();
            for (int index = 0; index < size; index++) {
                this.f۱۰۴۱a.f(index).d();
            }
        }

        /* access modifiers changed from: protected */
        @Override // android.arch.lifecycle.n
        public void a() {
            super.a();
            if (0 >= this.f۱۰۴۱a.b()) {
                this.f۱۰۴۱a.a();
            } else {
                this.f۱۰۴۱a.f(0).a(true);
                throw null;
            }
        }

        public void a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
            if (this.f۱۰۴۱a.b() > 0) {
                writer.print(prefix);
                writer.println("Loaders:");
                String str = prefix + "    ";
                if (0 < this.f۱۰۴۱a.b()) {
                    a info2 = this.f۱۰۴۱a.f(0);
                    writer.print(prefix);
                    writer.print("  #");
                    writer.print(this.f۱۰۴۱a.d(0));
                    writer.print(": ");
                    writer.println(info2.toString());
                    info2.a(str, fd, writer, args);
                    throw null;
                }
            }
        }
    }

    LoaderManagerImpl(e lifecycleOwner, p viewModelStore) {
        this.f۱۰۳۸a = lifecycleOwner;
        this.f۱۰۳۹b = LoaderViewModel.a(viewModelStore);
    }

    @Override // android.support.v4.app.u
    public void a() {
        this.f۱۰۳۹b.b();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        d.a(this.f۱۰۳۸a, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // android.support.v4.app.u
    @Deprecated
    public void a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        this.f۱۰۳۹b.a(prefix, fd, writer, args);
    }
}
