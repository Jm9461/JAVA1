package android.support.p۰۴۳v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p۰۴۳v4.app.Cc;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.d  reason: invalid class name */
public final class Cd implements Parcelable {
    public static final Parcelable.Creator<Cd> CREATOR = new Ca();

    /* renamed from: c  reason: contains not printable characters */
    final int[] f۱۰۱۰۸c;

    /* renamed from: d  reason: contains not printable characters */
    final int f۱۰۱۰۹d;

    /* renamed from: e  reason: contains not printable characters */
    final int f۱۰۱۱۰e;

    /* renamed from: f  reason: contains not printable characters */
    final String f۱۰۱۱۱f;

    /* renamed from: g  reason: contains not printable characters */
    final int f۱۰۱۱۲g;

    /* renamed from: h  reason: contains not printable characters */
    final int f۱۰۱۱۳h;

    /* renamed from: i  reason: contains not printable characters */
    final CharSequence f۱۰۱۱۴i;

    /* renamed from: j  reason: contains not printable characters */
    final int f۱۰۱۱۵j;

    /* renamed from: k  reason: contains not printable characters */
    final CharSequence f۱۰۱۱۶k;

    /* renamed from: l  reason: contains not printable characters */
    final ArrayList<String> f۱۰۱۱۷l;

    /* renamed from: m  reason: contains not printable characters */
    final ArrayList<String> f۱۰۱۱۸m;

    /* renamed from: n  reason: contains not printable characters */
    final boolean f۱۰۱۱۹n;

    public Cd(Cc bse) {
        int numOps = bse.f۱۰۰۸۳b.size();
        this.f۱۰۱۰۸c = new int[(numOps * 6)];
        if (bse.f۱۰۰۹۰i) {
            int pos = 0;
            for (int opNum = 0; opNum < numOps; opNum++) {
                Cc.Ca op = bse.f۱۰۰۸۳b.get(opNum);
                int[] iArr = this.f۱۰۱۰۸c;
                int pos2 = pos + 1;
                iArr[pos] = op.f۱۰۱۰۲a;
                int pos3 = pos2 + 1;
                ComponentCallbacksCf fVar = op.f۱۰۱۰۳b;
                iArr[pos2] = fVar != null ? fVar.f۱۰۱۶۰g : -1;
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
            this.f۱۰۱۰۹d = bse.f۱۰۰۸۸g;
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
            return;
        }
        throw new IllegalStateException("Not on back stack");
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

    /* renamed from: a  reason: contains not printable characters */
    public Cc m۱۲۱۰۳a(LayoutInflater$Factory2Cl fm) {
        Cc bse = new Cc(fm);
        int pos = 0;
        int num = 0;
        while (pos < this.f۱۰۱۰۸c.length) {
            Cc.Ca op = new Cc.Ca();
            int pos2 = pos + 1;
            op.f۱۰۱۰۲a = this.f۱۰۱۰۸c[pos];
            if (LayoutInflater$Factory2Cl.f۱۰۲۲۵G) {
                Log.v("FragmentManager", "Instantiate " + bse + " op #" + num + " base fragment #" + this.f۱۰۱۰۸c[pos2]);
            }
            int pos3 = pos2 + 1;
            int findex = this.f۱۰۱۰۸c[pos2];
            if (findex >= 0) {
                op.f۱۰۱۰۳b = fm.f۱۰۲۳۹g.get(findex);
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
            bse.m۱۲۰۸۳a(op);
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
        bse.m۱۲۰۸۲a(1);
        return bse;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeIntArray(this.f۱۰۱۰۸c);
        dest.writeInt(this.f۱۰۱۰۹d);
        dest.writeInt(this.f۱۰۱۱۰e);
        dest.writeString(this.f۱۰۱۱۱f);
        dest.writeInt(this.f۱۰۱۱۲g);
        dest.writeInt(this.f۱۰۱۱۳h);
        TextUtils.writeToParcel(this.f۱۰۱۱۴i, dest, 0);
        dest.writeInt(this.f۱۰۱۱۵j);
        TextUtils.writeToParcel(this.f۱۰۱۱۶k, dest, 0);
        dest.writeStringList(this.f۱۰۱۱۷l);
        dest.writeStringList(this.f۱۰۱۱۸m);
        dest.writeInt(this.f۱۰۱۱۹n ? 1 : 0);
    }

    /* renamed from: android.support.v4.app.d$a  reason: invalid class name */
    static class Ca implements Parcelable.Creator<Cd> {
        Ca() {
        }

        @Override // android.os.Parcelable.Creator
        public Cd createFromParcel(Parcel in) {
            return new Cd(in);
        }

        @Override // android.os.Parcelable.Creator
        public Cd[] newArray(int size) {
            return new Cd[size];
        }
    }
}
