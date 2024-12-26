package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

/* renamed from: androidx.versionedparcelable.b  reason: invalid class name */
class Cb extends AbstractCa {

    /* renamed from: a  reason: contains not printable characters */
    private final SparseIntArray f۱۲۴۳۸a;

    /* renamed from: b  reason: contains not printable characters */
    private final Parcel f۱۲۴۳۹b;

    /* renamed from: c  reason: contains not printable characters */
    private final int f۱۲۴۴۰c;

    /* renamed from: d  reason: contains not printable characters */
    private final int f۱۲۴۴۱d;

    /* renamed from: e  reason: contains not printable characters */
    private final String f۱۲۴۴۲e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۲۴۴۳f;

    /* renamed from: g  reason: contains not printable characters */
    private int f۱۲۴۴۴g;

    Cb(Parcel p) {
        this(p, p.dataPosition(), p.dataSize(), "");
    }

    Cb(Parcel p, int offset, int end, String prefix) {
        this.f۱۲۴۳۸a = new SparseIntArray();
        this.f۱۲۴۴۳f = -1;
        this.f۱۲۴۴۴g = 0;
        this.f۱۲۴۳۹b = p;
        this.f۱۲۴۴۰c = offset;
        this.f۱۲۴۴۱d = end;
        this.f۱۲۴۴۴g = this.f۱۲۴۴۰c;
        this.f۱۲۴۴۲e = prefix;
    }

    /* renamed from: d  reason: contains not printable characters */
    private int m۱۵۷۸۸d(int fieldId) {
        int fid;
        do {
            int i = this.f۱۲۴۴۴g;
            if (i >= this.f۱۲۴۴۱d) {
                return -1;
            }
            this.f۱۲۴۳۹b.setDataPosition(i);
            int size = this.f۱۲۴۳۹b.readInt();
            fid = this.f۱۲۴۳۹b.readInt();
            this.f۱۲۴۴۴g += size;
        } while (fid != fieldId);
        return this.f۱۲۴۳۹b.dataPosition();
    }

    @Override // androidx.versionedparcelable.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۵۷۹۳a(int fieldId) {
        int position = m۱۵۷۸۸d(fieldId);
        if (position == -1) {
            return false;
        }
        this.f۱۲۴۳۹b.setDataPosition(position);
        return true;
    }

    @Override // androidx.versionedparcelable.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۷۹۵b(int fieldId) {
        m۱۵۷۸۹a();
        this.f۱۲۴۴۳f = fieldId;
        this.f۱۲۴۳۸a.put(fieldId, this.f۱۲۴۳۹b.dataPosition());
        m۱۵۷۹۶c(0);
        m۱۵۷۹۶c(fieldId);
    }

    @Override // androidx.versionedparcelable.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۸۹a() {
        int i = this.f۱۲۴۴۳f;
        if (i >= 0) {
            int currentFieldPosition = this.f۱۲۴۳۸a.get(i);
            int position = this.f۱۲۴۳۹b.dataPosition();
            this.f۱۲۴۳۹b.setDataPosition(currentFieldPosition);
            this.f۱۲۴۳۹b.writeInt(position - currentFieldPosition);
            this.f۱۲۴۳۹b.setDataPosition(position);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public AbstractCa m۱۵۷۹۴b() {
        Parcel parcel = this.f۱۲۴۳۹b;
        int dataPosition = parcel.dataPosition();
        int i = this.f۱۲۴۴۴g;
        if (i == this.f۱۲۴۴۰c) {
            i = this.f۱۲۴۴۱d;
        }
        return new Cb(parcel, dataPosition, i, this.f۱۲۴۴۲e + "  ");
    }

    @Override // androidx.versionedparcelable.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۹۲a(byte[] b) {
        if (b != null) {
            this.f۱۲۴۳۹b.writeInt(b.length);
            this.f۱۲۴۳۹b.writeByteArray(b);
            return;
        }
        this.f۱۲۴۳۹b.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.AbstractCa
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۵۷۹۶c(int val) {
        this.f۱۲۴۳۹b.writeInt(val);
    }

    @Override // androidx.versionedparcelable.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۹۱a(String val) {
        this.f۱۲۴۳۹b.writeString(val);
    }

    @Override // androidx.versionedparcelable.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۹۰a(Parcelable p) {
        this.f۱۲۴۳۹b.writeParcelable(p, 0);
    }

    @Override // androidx.versionedparcelable.AbstractCa
    /* renamed from: e  reason: contains not printable characters */
    public int m۱۵۷۹۸e() {
        return this.f۱۲۴۳۹b.readInt();
    }

    @Override // androidx.versionedparcelable.AbstractCa
    /* renamed from: g  reason: contains not printable characters */
    public String m۱۵۸۰۰g() {
        return this.f۱۲۴۳۹b.readString();
    }

    @Override // androidx.versionedparcelable.AbstractCa
    /* renamed from: d  reason: contains not printable characters */
    public byte[] m۱۵۷۹۷d() {
        int len = this.f۱۲۴۳۹b.readInt();
        if (len < 0) {
            return null;
        }
        byte[] bytes = new byte[len];
        this.f۱۲۴۳۹b.readByteArray(bytes);
        return bytes;
    }

    @Override // androidx.versionedparcelable.AbstractCa
    /* renamed from: f  reason: contains not printable characters */
    public <T extends Parcelable> T m۱۵۷۹۹f() {
        return (T) this.f۱۲۴۳۹b.readParcelable(getClass().getClassLoader());
    }
}
