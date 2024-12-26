package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.c;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    final int[] f۱۰۶۳c;

    /* renamed from: d  reason: collision with root package name */
    final int f۱۰۶۴d;

    /* renamed from: e  reason: collision with root package name */
    final int f۱۰۶۵e;

    /* renamed from: f  reason: collision with root package name */
    final String f۱۰۶۶f;

    /* renamed from: g  reason: collision with root package name */
    final int f۱۰۶۷g;

    /* renamed from: h  reason: collision with root package name */
    final int f۱۰۶۸h;
    final CharSequence i;
    final int j;
    final CharSequence k;
    final ArrayList<String> l;
    final ArrayList<String> m;
    final boolean n;

    public d(c bse) {
        int numOps = bse.f۱۰۵۰b.size();
        this.f۱۰۶۳c = new int[(numOps * 6)];
        if (bse.i) {
            int pos = 0;
            for (int opNum = 0; opNum < numOps; opNum++) {
                c.a op = bse.f۱۰۵۰b.get(opNum);
                int[] iArr = this.f۱۰۶۳c;
                int pos2 = pos + 1;
                iArr[pos] = op.f۱۰۵۷a;
                int pos3 = pos2 + 1;
                f fVar = op.f۱۰۵۸b;
                iArr[pos2] = fVar != null ? fVar.f۱۰۷۴g : -1;
                int[] iArr2 = this.f۱۰۶۳c;
                int pos4 = pos3 + 1;
                iArr2[pos3] = op.f۱۰۵۹c;
                int pos5 = pos4 + 1;
                iArr2[pos4] = op.f۱۰۶۰d;
                int pos6 = pos5 + 1;
                iArr2[pos5] = op.f۱۰۶۱e;
                pos = pos6 + 1;
                iArr2[pos6] = op.f۱۰۶۲f;
            }
            this.f۱۰۶۴d = bse.f۱۰۵۵g;
            this.f۱۰۶۵e = bse.f۱۰۵۶h;
            this.f۱۰۶۶f = bse.j;
            this.f۱۰۶۷g = bse.l;
            this.f۱۰۶۸h = bse.m;
            this.i = bse.n;
            this.j = bse.o;
            this.k = bse.p;
            this.l = bse.q;
            this.m = bse.r;
            this.n = bse.s;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public d(Parcel in) {
        this.f۱۰۶۳c = in.createIntArray();
        this.f۱۰۶۴d = in.readInt();
        this.f۱۰۶۵e = in.readInt();
        this.f۱۰۶۶f = in.readString();
        this.f۱۰۶۷g = in.readInt();
        this.f۱۰۶۸h = in.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(in);
        this.j = in.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(in);
        this.l = in.createStringArrayList();
        this.m = in.createStringArrayList();
        this.n = in.readInt() != 0;
    }

    public c a(l fm) {
        c bse = new c(fm);
        int pos = 0;
        int num = 0;
        while (pos < this.f۱۰۶۳c.length) {
            c.a op = new c.a();
            int pos2 = pos + 1;
            op.f۱۰۵۷a = this.f۱۰۶۳c[pos];
            if (l.G) {
                Log.v("FragmentManager", "Instantiate " + bse + " op #" + num + " base fragment #" + this.f۱۰۶۳c[pos2]);
            }
            int pos3 = pos2 + 1;
            int findex = this.f۱۰۶۳c[pos2];
            if (findex >= 0) {
                op.f۱۰۵۸b = fm.f۱۱۰۸g.get(findex);
            } else {
                op.f۱۰۵۸b = null;
            }
            int[] iArr = this.f۱۰۶۳c;
            int pos4 = pos3 + 1;
            op.f۱۰۵۹c = iArr[pos3];
            int pos5 = pos4 + 1;
            op.f۱۰۶۰d = iArr[pos4];
            int pos6 = pos5 + 1;
            op.f۱۰۶۱e = iArr[pos5];
            op.f۱۰۶۲f = iArr[pos6];
            bse.f۱۰۵۱c = op.f۱۰۵۹c;
            bse.f۱۰۵۲d = op.f۱۰۶۰d;
            bse.f۱۰۵۳e = op.f۱۰۶۱e;
            bse.f۱۰۵۴f = op.f۱۰۶۲f;
            bse.a(op);
            num++;
            pos = pos6 + 1;
        }
        bse.f۱۰۵۵g = this.f۱۰۶۴d;
        bse.f۱۰۵۶h = this.f۱۰۶۵e;
        bse.j = this.f۱۰۶۶f;
        bse.l = this.f۱۰۶۷g;
        bse.i = true;
        bse.m = this.f۱۰۶۸h;
        bse.n = this.i;
        bse.o = this.j;
        bse.p = this.k;
        bse.q = this.l;
        bse.r = this.m;
        bse.s = this.n;
        bse.a(1);
        return bse;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeIntArray(this.f۱۰۶۳c);
        dest.writeInt(this.f۱۰۶۴d);
        dest.writeInt(this.f۱۰۶۵e);
        dest.writeString(this.f۱۰۶۶f);
        dest.writeInt(this.f۱۰۶۷g);
        dest.writeInt(this.f۱۰۶۸h);
        TextUtils.writeToParcel(this.i, dest, 0);
        dest.writeInt(this.j);
        TextUtils.writeToParcel(this.k, dest, 0);
        dest.writeStringList(this.l);
        dest.writeStringList(this.m);
        dest.writeInt(this.n ? 1 : 0);
    }

    static class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public d createFromParcel(Parcel in) {
            return new d(in);
        }

        @Override // android.os.Parcelable.Creator
        public d[] newArray(int size) {
            return new d[size];
        }
    }
}
