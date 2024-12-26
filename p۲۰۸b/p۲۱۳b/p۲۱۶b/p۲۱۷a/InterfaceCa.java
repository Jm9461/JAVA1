package p۲۰۸b.p۲۱۳b.p۲۱۶b.p۲۱۷a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.b.b.a.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public interface InterfaceCa extends IInterface {
    /* renamed from: a, reason: contains not printable characters */
    Bundle mo۱۳۸۴۵a(int i, String str, String str2, String str3);

    /* renamed from: a, reason: contains not printable characters */
    Bundle mo۱۳۸۴۶a(int i, String str, String str2, String str3, String str4);

    /* renamed from: b.b.b.a.a$a */
    public static abstract class a extends Binder implements InterfaceCa {
        /* renamed from: a, reason: contains not printable characters */
        public static InterfaceCa m۱۳۸۴۴a(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            if (iin != null && (iin instanceof InterfaceCa)) {
                return (InterfaceCa) iin;
            }
            return new C۱۴۳۱a(obj);
        }

        /* renamed from: b.b.b.a.a$a$a, reason: collision with other inner class name */
        private static class C۱۴۳۱a implements InterfaceCa {

            /* renamed from: a, reason: contains not printable characters */
            private IBinder f۱۲۶۰۱a;

            C۱۴۳۱a(IBinder remote) {
                this.f۱۲۶۰۱a = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f۱۲۶۰۱a;
            }

            @Override // p۲۰۸b.p۲۱۳b.p۲۱۶b.p۲۱۷a.InterfaceCa
            /* renamed from: a, reason: contains not printable characters */
            public Bundle mo۱۳۸۴۶a(int apiVersion, String packageName, String sku, String type, String developerPayload) {
                Bundle _result;
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    _data.writeInt(apiVersion);
                    _data.writeString(packageName);
                    _data.writeString(sku);
                    _data.writeString(type);
                    _data.writeString(developerPayload);
                    this.f۱۲۶۰۱a.transact(3, _data, _reply, 0);
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = (Bundle) Bundle.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // p۲۰۸b.p۲۱۳b.p۲۱۶b.p۲۱۷a.InterfaceCa
            /* renamed from: a, reason: contains not printable characters */
            public Bundle mo۱۳۸۴۵a(int apiVersion, String packageName, String type, String continuationToken) {
                Bundle _result;
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    _data.writeInt(apiVersion);
                    _data.writeString(packageName);
                    _data.writeString(type);
                    _data.writeString(continuationToken);
                    this.f۱۲۶۰۱a.transact(4, _data, _reply, 0);
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = (Bundle) Bundle.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
        }
    }
}
