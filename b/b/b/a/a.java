package b.b.b.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {
    Bundle a(int i, String str, String str2, String str3);

    Bundle a(int i, String str, String str2, String str3, String str4);

    /* renamed from: b.b.b.a.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC۰۰۴۵a extends Binder implements a {
        public static a a(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            if (iin == null || !(iin instanceof a)) {
                return new C۰۰۴۶a(obj);
            }
            return (a) iin;
        }

        /* renamed from: b.b.b.a.a$a$a  reason: collision with other inner class name */
        private static class C۰۰۴۶a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f۲۳۸۳a;

            C۰۰۴۶a(IBinder remote) {
                this.f۲۳۸۳a = remote;
            }

            public IBinder asBinder() {
                return this.f۲۳۸۳a;
            }

            @Override // b.b.b.a.a
            public Bundle a(int apiVersion, String packageName, String sku, String type, String developerPayload) {
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
                    this.f۲۳۸۳a.transact(3, _data, _reply, 0);
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

            @Override // b.b.b.a.a
            public Bundle a(int apiVersion, String packageName, String type, String continuationToken) {
                Bundle _result;
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    _data.writeInt(apiVersion);
                    _data.writeString(packageName);
                    _data.writeString(type);
                    _data.writeString(continuationToken);
                    this.f۲۳۸۳a.transact(4, _data, _reply, 0);
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
