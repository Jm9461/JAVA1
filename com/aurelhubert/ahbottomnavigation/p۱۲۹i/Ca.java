package com.aurelhubert.ahbottomnavigation.p۱۲۹i;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.aurelhubert.ahbottomnavigation.notification.AHNotification;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.aurelhubert.ahbottomnavigation.i.a  reason: invalid class name */
public class Ca implements Parcelable {
    public static final Parcelable.Creator<Ca> CREATOR = new Ca();

    /* renamed from: c  reason: contains not printable characters */
    private String f۱۳۴۷۹c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۳۴۸۰d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۳۴۸۱e;

    /* synthetic */ Ca(Parcel x0, Ca x1) {
        this(x0);
    }

    public Ca() {
    }

    private Ca(Parcel in) {
        this.f۱۳۴۷۹c = in.readString();
        this.f۱۳۴۸۰d = in.readInt();
        this.f۱۳۴۸۱e = in.readInt();
    }

    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۶۸۵۹d() {
        return TextUtils.isEmpty(this.f۱۳۴۷۹c);
    }

    /* renamed from: b  reason: contains not printable characters */
    public String m۱۶۸۵۷b() {
        return this.f۱۳۴۷۹c;
    }

    /* renamed from: c  reason: contains not printable characters */
    public int m۱۶۸۵۸c() {
        return this.f۱۳۴۸۰d;
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۶۸۵۶a() {
        return this.f۱۳۴۸۱e;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static List<Ca> m۱۶۸۵۵a(int size) {
        List<AHNotification> notificationList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            notificationList.add(new Ca());
        }
        return notificationList;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f۱۳۴۷۹c);
        dest.writeInt(this.f۱۳۴۸۰d);
        dest.writeInt(this.f۱۳۴۸۱e);
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.i.a$a  reason: invalid class name */
    static class Ca implements Parcelable.Creator<Ca> {
        Ca() {
        }

        @Override // android.os.Parcelable.Creator
        public Ca createFromParcel(Parcel in) {
            return new Ca(in, null);
        }

        @Override // android.os.Parcelable.Creator
        public Ca[] newArray(int size) {
            return new Ca[size];
        }
    }
}
