package android.support.v4.app;

import android.arch.lifecycle.p;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* access modifiers changed from: package-private */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    final String f۱۱۵۱c;

    /* renamed from: d  reason: collision with root package name */
    final int f۱۱۵۲d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f۱۱۵۳e;

    /* renamed from: f  reason: collision with root package name */
    final int f۱۱۵۴f;

    /* renamed from: g  reason: collision with root package name */
    final int f۱۱۵۵g;

    /* renamed from: h  reason: collision with root package name */
    final String f۱۱۵۶h;
    final boolean i;
    final boolean j;
    final Bundle k;
    final boolean l;
    Bundle m;
    f n;

    o(f frag) {
        this.f۱۱۵۱c = frag.getClass().getName();
        this.f۱۱۵۲d = frag.f۱۰۷۴g;
        this.f۱۱۵۳e = frag.o;
        this.f۱۱۵۴f = frag.z;
        this.f۱۱۵۵g = frag.A;
        this.f۱۱۵۶h = frag.B;
        this.i = frag.E;
        this.j = frag.D;
        this.k = frag.i;
        this.l = frag.C;
    }

    o(Parcel in) {
        this.f۱۱۵۱c = in.readString();
        this.f۱۱۵۲d = in.readInt();
        boolean z = true;
        this.f۱۱۵۳e = in.readInt() != 0;
        this.f۱۱۵۴f = in.readInt();
        this.f۱۱۵۵g = in.readInt();
        this.f۱۱۵۶h = in.readString();
        this.i = in.readInt() != 0;
        this.j = in.readInt() != 0;
        this.k = in.readBundle();
        this.l = in.readInt() == 0 ? false : z;
        this.m = in.readBundle();
    }

    public f a(j host, h container, f parent, m childNonConfig, p viewModelStore) {
        if (this.n == null) {
            Context context = host.c();
            Bundle bundle = this.k;
            if (bundle != null) {
                bundle.setClassLoader(context.getClassLoader());
            }
            if (container != null) {
                this.n = container.a(context, this.f۱۱۵۱c, this.k);
            } else {
                this.n = f.a(context, this.f۱۱۵۱c, this.k);
            }
            Bundle bundle2 = this.m;
            if (bundle2 != null) {
                bundle2.setClassLoader(context.getClassLoader());
                this.n.f۱۰۷۱d = this.m;
            }
            this.n.a(this.f۱۱۵۲d, parent);
            f fVar = this.n;
            fVar.o = this.f۱۱۵۳e;
            fVar.q = true;
            fVar.z = this.f۱۱۵۴f;
            fVar.A = this.f۱۱۵۵g;
            fVar.B = this.f۱۱۵۶h;
            fVar.E = this.i;
            fVar.D = this.j;
            fVar.C = this.l;
            fVar.t = host.f۱۱۰۳d;
            if (l.G) {
                Log.v("FragmentManager", "Instantiated fragment " + this.n);
            }
        }
        f fVar2 = this.n;
        fVar2.w = childNonConfig;
        fVar2.x = viewModelStore;
        return fVar2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f۱۱۵۱c);
        dest.writeInt(this.f۱۱۵۲d);
        dest.writeInt(this.f۱۱۵۳e ? 1 : 0);
        dest.writeInt(this.f۱۱۵۴f);
        dest.writeInt(this.f۱۱۵۵g);
        dest.writeString(this.f۱۱۵۶h);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeInt(this.j ? 1 : 0);
        dest.writeBundle(this.k);
        dest.writeInt(this.l ? 1 : 0);
        dest.writeBundle(this.m);
    }

    static class a implements Parcelable.Creator<o> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public o createFromParcel(Parcel in) {
            return new o(in);
        }

        @Override // android.os.Parcelable.Creator
        public o[] newArray(int size) {
            return new o[size];
        }
    }
}
