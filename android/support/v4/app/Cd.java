package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Cc;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Cd implements Parcelable {
    public static final Parcelable.Creator<Cd> CREATOR = new a();

    /* renamed from: c, reason: contains not printable characters */
    final int[] f۱۰۱۰۸c;

    /* renamed from: d, reason: contains not printable characters */
    final int f۱۰۱۰۹d;

    /* renamed from: e, reason: contains not printable characters */
    final int f۱۰۱۱۰e;

    /* renamed from: f, reason: contains not printable characters */
    final String f۱۰۱۱۱f;

    /* renamed from: g, reason: contains not printable characters */
    final int f۱۰۱۱۲g;

    /* renamed from: h, reason: contains not printable characters */
    final int f۱۰۱۱۳h;

    /* renamed from: i, reason: contains not printable characters */
    final CharSequence f۱۰۱۱۴i;

    /* renamed from: j, reason: contains not printable characters */
    final int f۱۰۱۱۵j;

    /* renamed from: k, reason: contains not printable characters */
    final CharSequence f۱۰۱۱۶k;

    /* renamed from: l, reason: contains not printable characters */
    final ArrayList<String> f۱۰۱۱۷l;

    /* renamed from: m, reason: contains not printable characters */
    final ArrayList<String> f۱۰۱۱۸m;

    /* renamed from: n, reason: contains not printable characters */
    final boolean f۱۰۱۱۹n;

    public Cd(Cc bse) {
        int numOps = bse.f۱۰۰۸۳b.size();
        this.f۱۰۱۰۸c = new int[numOps * 6];
        if (!bse.f۱۰۰۹۰i) {
            throw new IllegalStateException("Not on back stack");
        }
        int pos = 0;
        for (int opNum = 0; opNum < numOps; opNum++) {
            Cc.a op = bse.f۱۰۰۸۳b.get(opNum);
            int[] iArr = this.f۱۰۱۰۸c;
            int pos2 = pos + 1;
            iArr[pos] = op.f۱۰۱۰۲a;
            int pos3 = pos2 + 1;
            ComponentCallbacksCf componentCallbacksCf = op.f۱۰۱۰۳b;
            iArr[pos2] = componentCallbacksCf != null ? componentCallbacksCf.f۱۰۱۶۰g : -1;
            int[] iArr2 = this.f۱۰۱۰۸c;
            int pos4 = pos3 + 1;
            iArr2[pos3] = op.f۱۰۱۰۴c;
            int pos5 = pos4 + 1;
            iArr2[pos4] = op.f۱۰۱۰۵d;
            int pos6 = pos5 + 1;
            iArr2[pos5] = op.f۱۰۱۰۶e;
            pos = pos6 + 1;
            iArr2[pos6] = op.f۱۰۱۰۷f;
        }
        int opNum2 = bse.f۱۰۰۸۸g;
        this.f۱۰۱۰۹d = opNum2;
        this.f۱۰۱۱۰e = bse.f۱۰۰۸۹h;
        this.f۱۰۱۱۱f = bse.f۱۰۰۹۱j;
        this.f۱۰۱۱۲g = bse.f۱۰۰۹۳l;
        this.f۱۰۱۱۳h = bse.f۱۰۰۹۴m;
        this.f۱۰۱۱۴i = bse.f۱۰۰۹۵n;
        this.f۱۰۱۱۵j = bse.f۱۰۰۹۶o;
        this.f۱۰۱۱۶k = bse.f۱۰۰۹۷p;
        this.f۱۰۱۱۷l = bse.f۱۰۰۹۸q;
        this.f۱۰۱۱۸m = bse.f۱۰۰۹۹r;
        this.f۱۰۱۱۹n = bse.f۱۰۱۰۰s;
    }

    public Cd(Parcel in) {
        this.f۱۰۱۰۸c = in.createIntArray();
        this.f۱۰۱۰۹d = in.readInt();
        this.f۱۰۱۱۰e = in.readInt();
        this.f۱۰۱۱۱f = in.readString();
        this.f۱۰۱۱۲g = in.readInt();
        this.f۱۰۱۱۳h = in.readInt();
        this.f۱۰۱۱۴i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(in);
        this.f۱۰۱۱۵j = in.readInt();
        this.f۱۰۱۱۶k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(in);
        this.f۱۰۱۱۷l = in.createStringArrayList();
        this.f۱۰۱۱۸m = in.createStringArrayList();
        this.f۱۰۱۱۹n = in.readInt() != 0;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cc m۱۰۰۳۳a(LayoutInflaterFactory2Cl fm) {
        Cc bse = new Cc(fm);
        int pos = 0;
        int num = 0;
        while (pos < this.f۱۰۱۰۸c.length) {
            Cc.a op = new Cc.a();
            int pos2 = pos + 1;
            op.f۱۰۱۰۲a = this.f۱۰۱۰۸c[pos];
            if (LayoutInflaterFactory2Cl.f۱۰۲۲۵G) {
                Log.v("FragmentManager", "Instantiate " + bse + " op #" + num + " base fragment #" + this.f۱۰۱۰۸c[pos2]);
            }
            int pos3 = pos2 + 1;
            int findex = this.f۱۰۱۰۸c[pos2];
            if (findex >= 0) {
                ComponentCallbacksCf f2 = fm.f۱۰۲۳۹g.get(findex);
                op.f۱۰۱۰۳b = f2;
            } else {
                op.f۱۰۱۰۳b = null;
            }
            int[] iArr = this.f۱۰۱۰۸c;
            int pos4 = pos3 + 1;
            op.f۱۰۱۰۴c = iArr[pos3];
            int pos5 = pos4 + 1;
            op.f۱۰۱۰۵d = iArr[pos4];
            int pos6 = pos5 + 1;
            op.f۱۰۱۰۶e = iArr[pos5];
            op.f۱۰۱۰۷f = iArr[pos6];
            bse.f۱۰۰۸۴c = op.f۱۰۱۰۴c;
            bse.f۱۰۰۸۵d = op.f۱۰۱۰۵d;
            bse.f۱۰۰۸۶e = op.f۱۰۱۰۶e;
            bse.f۱۰۰۸۷f = op.f۱۰۱۰۷f;
            bse.m۱۰۰۱۳a(op);
            num++;
            pos = pos6 + 1;
        }
        bse.f۱۰۰۸۸g = this.f۱۰۱۰۹d;
        bse.f۱۰۰۸۹h = this.f۱۰۱۱۰e;
        bse.f۱۰۰۹۱j = this.f۱۰۱۱۱f;
        bse.f۱۰۰۹۳l = this.f۱۰۱۱۲g;
        bse.f۱۰۰۹۰i = true;
        bse.f۱۰۰۹۴m = this.f۱۰۱۱۳h;
        bse.f۱۰۰۹۵n = this.f۱۰۱۱۴i;
        bse.f۱۰۰۹۶o = this.f۱۰۱۱۵j;
        bse.f۱۰۰۹۷p = this.f۱۰۱۱۶k;
        bse.f۱۰۰۹۸q = this.f۱۰۱۱۷l;
        bse.f۱۰۰۹۹r = this.f۱۰۱۱۸m;
        bse.f۱۰۱۰۰s = this.f۱۰۱۱۹n;
        bse.m۱۰۰۱۲a(1);
        return bse;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f۱۰۱۰۸c);
        parcel.writeInt(this.f۱۰۱۰۹d);
        parcel.writeInt(this.f۱۰۱۱۰e);
        parcel.writeString(this.f۱۰۱۱۱f);
        parcel.writeInt(this.f۱۰۱۱۲g);
        parcel.writeInt(this.f۱۰۱۱۳h);
        TextUtils.writeToParcel(this.f۱۰۱۱۴i, parcel, 0);
        parcel.writeInt(this.f۱۰۱۱۵j);
        TextUtils.writeToParcel(this.f۱۰۱۱۶k, parcel, 0);
        parcel.writeStringList(this.f۱۰۱۱۷l);
        parcel.writeStringList(this.f۱۰۱۱۸m);
        parcel.writeInt(this.f۱۰۱۱۹n ? 1 : 0);
    }

    /* renamed from: android.support.v4.app.d$a */
    static class a implements Parcelable.Creator<Cd> {
        a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Cd createFromParcel(Parcel in) {
            return new Cd(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Cd[] newArray(int size) {
            return new Cd[size];
        }
    }
}
