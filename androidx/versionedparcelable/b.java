package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f۲۳۲۱a;

    /* renamed from: b  reason: collision with root package name */
    private final Parcel f۲۳۲۲b;

    /* renamed from: c  reason: collision with root package name */
    private final int f۲۳۲۳c;

    /* renamed from: d  reason: collision with root package name */
    private final int f۲۳۲۴d;

    /* renamed from: e  reason: collision with root package name */
    private final String f۲۳۲۵e;

    /* renamed from: f  reason: collision with root package name */
    private int f۲۳۲۶f;

    /* renamed from: g  reason: collision with root package name */
    private int f۲۳۲۷g;

    b(Parcel p) {
        this(p, p.dataPosition(), p.dataSize(), "");
    }

    b(Parcel p, int offset, int end, String prefix) {
        this.f۲۳۲۱a = new SparseIntArray();
        this.f۲۳۲۶f = -1;
        this.f۲۳۲۷g = 0;
        this.f۲۳۲۲b = p;
        this.f۲۳۲۳c = offset;
        this.f۲۳۲۴d = end;
        this.f۲۳۲۷g = this.f۲۳۲۳c;
        this.f۲۳۲۵e = prefix;
    }

    private int d(int fieldId) {
        int fid;
        do {
            int i = this.f۲۳۲۷g;
            if (i >= this.f۲۳۲۴d) {
                return -1;
            }
            this.f۲۳۲۲b.setDataPosition(i);
            int size = this.f۲۳۲۲b.readInt();
            fid = this.f۲۳۲۲b.readInt();
            this.f۲۳۲۷g += size;
        } while (fid != fieldId);
        return this.f۲۳۲۲b.dataPosition();
    }

    @Override // androidx.versionedparcelable.a
    public boolean a(int fieldId) {
        int position = d(fieldId);
        if (position == -1) {
            return false;
        }
        this.f۲۳۲۲b.setDataPosition(position);
        return true;
    }

    @Override // androidx.versionedparcelable.a
    public void b(int fieldId) {
        a();
        this.f۲۳۲۶f = fieldId;
        this.f۲۳۲۱a.put(fieldId, this.f۲۳۲۲b.dataPosition());
        c(0);
        c(fieldId);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i = this.f۲۳۲۶f;
        if (i >= 0) {
            int currentFieldPosition = this.f۲۳۲۱a.get(i);
            int position = this.f۲۳۲۲b.dataPosition();
            this.f۲۳۲۲b.setDataPosition(currentFieldPosition);
            this.f۲۳۲۲b.writeInt(position - currentFieldPosition);
            this.f۲۳۲۲b.setDataPosition(position);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.a
    public a b() {
        Parcel parcel = this.f۲۳۲۲b;
        int dataPosition = parcel.dataPosition();
        int i = this.f۲۳۲۷g;
        if (i == this.f۲۳۲۳c) {
            i = this.f۲۳۲۴d;
        }
        return new b(parcel, dataPosition, i, this.f۲۳۲۵e + "  ");
    }

    @Override // androidx.versionedparcelable.a
    public void a(byte[] b2) {
        if (b2 != null) {
            this.f۲۳۲۲b.writeInt(b2.length);
            this.f۲۳۲۲b.writeByteArray(b2);
            return;
        }
        this.f۲۳۲۲b.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.a
    public void c(int val) {
        this.f۲۳۲۲b.writeInt(val);
    }

    @Override // androidx.versionedparcelable.a
    public void a(String val) {
        this.f۲۳۲۲b.writeString(val);
    }

    @Override // androidx.versionedparcelable.a
    public void a(Parcelable p) {
        this.f۲۳۲۲b.writeParcelable(p, 0);
    }

    @Override // androidx.versionedparcelable.a
    public int e() {
        return this.f۲۳۲۲b.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public String g() {
        return this.f۲۳۲۲b.readString();
    }

    @Override // androidx.versionedparcelable.a
    public byte[] d() {
        int len = this.f۲۳۲۲b.readInt();
        if (len < 0) {
            return null;
        }
        byte[] bytes = new byte[len];
        this.f۲۳۲۲b.readByteArray(bytes);
        return bytes;
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T f() {
        return (T) this.f۲۳۲۲b.readParcelable(getClass().getClassLoader());
    }
}
