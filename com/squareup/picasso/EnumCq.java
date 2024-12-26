package com.squareup.picasso;

/* renamed from: com.squareup.picasso.q  reason: invalid class name */
public enum EnumCq {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    

    /* renamed from: c  reason: contains not printable characters */
    final int f۱۵۴۷۶c;

    /* renamed from: b  reason: contains not printable characters */
    public static boolean m۱۸۳۸۵b(int networkPolicy) {
        return (NO_CACHE.f۱۵۴۷۶c & networkPolicy) == 0;
    }

    /* renamed from: c  reason: contains not printable characters */
    public static boolean m۱۸۳۸۶c(int networkPolicy) {
        return (NO_STORE.f۱۵۴۷۶c & networkPolicy) == 0;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۸۳۸۴a(int networkPolicy) {
        return (OFFLINE.f۱۵۴۷۶c & networkPolicy) != 0;
    }

    private EnumCq(int index) {
        this.f۱۵۴۷۶c = index;
    }
}
