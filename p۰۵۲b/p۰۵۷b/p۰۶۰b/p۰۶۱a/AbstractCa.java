package p۰۵۲b.p۰۵۷b.p۰۶۰b.p۰۶۱a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.b.b.a.a  reason: invalid class name */
public interface AbstractCa extends IInterface {
    /* renamed from: a  reason: contains not printable characters */
    Bundle m۱۵۹۱۲a(int i, String str, String str2, String str3);

    /* renamed from: a  reason: contains not printable characters */
    Bundle m۱۵۹۱۳a(int i, String str, String str2, String str3, String str4);

    /* renamed from: b.b.b.a.a$a  reason: invalid class name */
    public static abstract class AbstractBinderCa extends Binder implements AbstractCa {
        /* renamed from: a  reason: contains not printable characters */
        public static AbstractCa m۱۵۹۱۴a(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            if (iin == null || !(iin instanceof AbstractCa)) {
                return new Ca(obj);
            }
            return (AbstractCa) iin;
        }

        /* renamed from: b.b.b.a.a$a$a  reason: invalid class name */
        private static class Ca implements AbstractCa {

            /* renamed from: a  reason: contains not printable characters */
            private IBinder f۱۲۶۰۱a;

            Ca(IBinder remote) {
                this.f۱۲۶۰۱a = remote;
            }

            public IBinder asBinder() {
                return this.f۱۲۶۰۱a;
            }

            @Override // p۰۵۲b.p۰۵۷b.p۰۶۰b.p۰۶۱a.AbstractCa
            /* renamed from: a  reason: contains not printable characters */
            public Bundle m۱۵۹۱۶a(int apiVersion, String packageName, String sku, String type, String developerPayload) {
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

            @Override // p۰۵۲b.p۰۵۷b.p۰۶۰b.p۰۶۱a.AbstractCa
            /* renamed from: a  reason: contains not printable characters */
            public Bundle m۱۵۹۱۵a(int apiVersion, String packageName, String type, String continuationToken) {
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
