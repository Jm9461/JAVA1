package android.support.v4.app;

import android.arch.lifecycle.Cp;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* renamed from: android.support.v4.app.o, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Co implements Parcelable {
    public static final Parcelable.Creator<Co> CREATOR = new a();

    /* renamed from: c, reason: contains not printable characters */
    final String f۱۰۳۰۰c;

    /* renamed from: d, reason: contains not printable characters */
    final int f۱۰۳۰۱d;

    /* renamed from: e, reason: contains not printable characters */
    final boolean f۱۰۳۰۲e;

    /* renamed from: f, reason: contains not printable characters */
    final int f۱۰۳۰۳f;

    /* renamed from: g, reason: contains not printable characters */
    final int f۱۰۳۰۴g;

    /* renamed from: h, reason: contains not printable characters */
    final String f۱۰۳۰۵h;

    /* renamed from: i, reason: contains not printable characters */
    final boolean f۱۰۳۰۶i;

    /* renamed from: j, reason: contains not printable characters */
    final boolean f۱۰۳۰۷j;

    /* renamed from: k, reason: contains not printable characters */
    final Bundle f۱۰۳۰۸k;

    /* renamed from: l, reason: contains not printable characters */
    final boolean f۱۰۳۰۹l;

    /* renamed from: m, reason: contains not printable characters */
    Bundle f۱۰۳۱۰m;

    /* renamed from: n, reason: contains not printable characters */
    ComponentCallbacksCf f۱۰۳۱۱n;

    Co(ComponentCallbacksCf frag) {
        this.f۱۰۳۰۰c = frag.getClass().getName();
        this.f۱۰۳۰۱d = frag.f۱۰۱۶۰g;
        this.f۱۰۳۰۲e = frag.f۱۰۱۶۸o;
        this.f۱۰۳۰۳f = frag.f۱۰۱۷۹z;
        this.f۱۰۳۰۴g = frag.f۱۰۱۳۲A;
        this.f۱۰۳۰۵h = frag.f۱۰۱۳۳B;
        this.f۱۰۳۰۶i = frag.f۱۰۱۳۶E;
        this.f۱۰۳۰۷j = frag.f۱۰۱۳۵D;
        this.f۱۰۳۰۸k = frag.f۱۰۱۶۲i;
        this.f۱۰۳۰۹l = frag.f۱۰۱۳۴C;
    }

    Co(Parcel in) {
        this.f۱۰۳۰۰c = in.readString();
        this.f۱۰۳۰۱d = in.readInt();
        this.f۱۰۳۰۲e = in.readInt() != 0;
        this.f۱۰۳۰۳f = in.readInt();
        this.f۱۰۳۰۴g = in.readInt();
        this.f۱۰۳۰۵h = in.readString();
        this.f۱۰۳۰۶i = in.readInt() != 0;
        this.f۱۰۳۰۷j = in.readInt() != 0;
        this.f۱۰۳۰۸k = in.readBundle();
        this.f۱۰۳۰۹l = in.readInt() != 0;
        this.f۱۰۳۱۰m = in.readBundle();
    }

    /* renamed from: a, reason: contains not printable characters */
    public ComponentCallbacksCf m۱۰۳۹۵a(AbstractCj host, AbstractCh container, ComponentCallbacksCf parent, Cm childNonConfig, Cp viewModelStore) {
        if (this.f۱۰۳۱۱n == null) {
            Context context = host.m۱۰۲۴۰c();
            Bundle bundle = this.f۱۰۳۰۸k;
            if (bundle != null) {
                bundle.setClassLoader(context.getClassLoader());
            }
            if (container != null) {
                this.f۱۰۳۱۱n = container.mo۱۰۲۰۶a(context, this.f۱۰۳۰۰c, this.f۱۰۳۰۸k);
            } else {
                this.f۱۰۳۱۱n = ComponentCallbacksCf.m۱۰۰۵۲a(context, this.f۱۰۳۰۰c, this.f۱۰۳۰۸k);
            }
            Bundle bundle2 = this.f۱۰۳۱۰m;
            if (bundle2 != null) {
                bundle2.setClassLoader(context.getClassLoader());
                this.f۱۰۳۱۱n.f۱۰۱۵۷d = this.f۱۰۳۱۰m;
            }
            this.f۱۰۳۱۱n.m۱۰۰۸۸a(this.f۱۰۳۰۱d, parent);
            ComponentCallbacksCf componentCallbacksCf = this.f۱۰۳۱۱n;
            componentCallbacksCf.f۱۰۱۶۸o = this.f۱۰۳۰۲e;
            componentCallbacksCf.f۱۰۱۷۰q = true;
            componentCallbacksCf.f۱۰۱۷۹z = this.f۱۰۳۰۳f;
            componentCallbacksCf.f۱۰۱۳۲A = this.f۱۰۳۰۴g;
            componentCallbacksCf.f۱۰۱۳۳B = this.f۱۰۳۰۵h;
            componentCallbacksCf.f۱۰۱۳۶E = this.f۱۰۳۰۶i;
            componentCallbacksCf.f۱۰۱۳۵D = this.f۱۰۳۰۷j;
            componentCallbacksCf.f۱۰۱۳۴C = this.f۱۰۳۰۹l;
            componentCallbacksCf.f۱۰۱۷۳t = host.f۱۰۲۲۴d;
            if (LayoutInflaterFactory2Cl.f۱۰۲۲۵G) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f۱۰۳۱۱n);
            }
        }
        ComponentCallbacksCf componentCallbacksCf2 = this.f۱۰۳۱۱n;
        componentCallbacksCf2.f۱۰۱۷۶w = childNonConfig;
        componentCallbacksCf2.f۱۰۱۷۷x = viewModelStore;
        return componentCallbacksCf2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f۱۰۳۰۰c);
        parcel.writeInt(this.f۱۰۳۰۱d);
        parcel.writeInt(this.f۱۰۳۰۲e ? 1 : 0);
        parcel.writeInt(this.f۱۰۳۰۳f);
        parcel.writeInt(this.f۱۰۳۰۴g);
        parcel.writeString(this.f۱۰۳۰۵h);
        parcel.writeInt(this.f۱۰۳۰۶i ? 1 : 0);
        parcel.writeInt(this.f۱۰۳۰۷j ? 1 : 0);
        parcel.writeBundle(this.f۱۰۳۰۸k);
        parcel.writeInt(this.f۱۰۳۰۹l ? 1 : 0);
        parcel.writeBundle(this.f۱۰۳۱۰m);
    }

    /* renamed from: android.support.v4.app.o$a */
    static class a implements Parcelable.Creator<Co> {
        a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Co createFromParcel(Parcel in) {
            return new Co(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Co[] newArray(int size) {
            return new Co[size];
        }
    }
}
