package com.aurelhubert.ahbottomnavigation.i;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.aurelhubert.ahbottomnavigation.notification.AHNotification;
import java.util.ArrayList;
import java.util.List;

public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C۰۰۶۴a();

    /* renamed from: c  reason: collision with root package name */
    private String f۲۸۲۱c;

    /* renamed from: d  reason: collision with root package name */
    private int f۲۸۲۲d;

    /* renamed from: e  reason: collision with root package name */
    private int f۲۸۲۳e;

    /* synthetic */ a(Parcel x0, C۰۰۶۴a x1) {
        this(x0);
    }

    public a() {
    }

    private a(Parcel in) {
        this.f۲۸۲۱c = in.readString();
        this.f۲۸۲۲d = in.readInt();
        this.f۲۸۲۳e = in.readInt();
    }

    public boolean d() {
        return TextUtils.isEmpty(this.f۲۸۲۱c);
    }

    public String b() {
        return this.f۲۸۲۱c;
    }

    public int c() {
        return this.f۲۸۲۲d;
    }

    public int a() {
        return this.f۲۸۲۳e;
    }

    public static List<a> a(int size) {
        List<AHNotification> notificationList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            notificationList.add(new a());
        }
        return notificationList;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f۲۸۲۱c);
        dest.writeInt(this.f۲۸۲۲d);
        dest.writeInt(this.f۲۸۲۳e);
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.i.a$a  reason: collision with other inner class name */
    static class C۰۰۶۴a implements Parcelable.Creator<a> {
        C۰۰۶۴a() {
        }

        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel in) {
            return new a(in, null);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int size) {
            return new a[size];
        }
    }
}
