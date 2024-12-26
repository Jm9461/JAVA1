package com.aurelhubert.ahbottomnavigation.p۲۸۵i;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.aurelhubert.ahbottomnavigation.notification.AHNotification;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.aurelhubert.ahbottomnavigation.i.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca implements Parcelable {
    public static final Parcelable.Creator<Ca> CREATOR = new a();

    /* renamed from: c, reason: contains not printable characters */
    private String f۱۳۴۷۹c;

    /* renamed from: d, reason: contains not printable characters */
    private int f۱۳۴۸۰d;

    /* renamed from: e, reason: contains not printable characters */
    private int f۱۳۴۸۱e;

    /* synthetic */ Ca(Parcel x0, a x1) {
        this(x0);
    }

    public Ca() {
    }

    private Ca(Parcel in) {
        this.f۱۳۴۷۹c = in.readString();
        this.f۱۳۴۸۰d = in.readInt();
        this.f۱۳۴۸۱e = in.readInt();
    }

    /* renamed from: d, reason: contains not printable characters */
    public boolean m۱۴۷۸۱d() {
        return TextUtils.isEmpty(this.f۱۳۴۷۹c);
    }

    /* renamed from: b, reason: contains not printable characters */
    public String m۱۴۷۷۹b() {
        return this.f۱۳۴۷۹c;
    }

    /* renamed from: c, reason: contains not printable characters */
    public int m۱۴۷۸۰c() {
        return this.f۱۳۴۸۰d;
    }

    /* renamed from: a, reason: contains not printable characters */
    public int m۱۴۷۷۸a() {
        return this.f۱۳۴۸۱e;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static List<Ca> m۱۴۷۷۷a(int size) {
        List<AHNotification> notificationList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            notificationList.add(new Ca());
        }
        return notificationList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f۱۳۴۷۹c);
        dest.writeInt(this.f۱۳۴۸۰d);
        dest.writeInt(this.f۱۳۴۸۱e);
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.i.a$a */
    static class a implements Parcelable.Creator<Ca> {
        a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Ca createFromParcel(Parcel in) {
            return new Ca(in, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Ca[] newArray(int size) {
            return new Ca[size];
        }
    }
}
