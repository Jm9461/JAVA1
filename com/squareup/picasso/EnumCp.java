package com.squareup.picasso;

/* renamed from: com.squareup.picasso.p  reason: invalid class name */
public enum EnumCp {
    NO_CACHE(1),
    NO_STORE(2);
    

    /* renamed from: c  reason: contains not printable characters */
    final int f۱۵۴۷۱c;

    /* renamed from: a  reason: contains not printable characters */
    static boolean m۱۸۳۸۲a(int memoryPolicy) {
        return (NO_CACHE.f۱۵۴۷۱c & memoryPolicy) == 0;
    }

    /* renamed from: b  reason: contains not printable characters */
    static boolean m۱۸۳۸۳b(int memoryPolicy) {
        return (NO_STORE.f۱۵۴۷۱c & memoryPolicy) == 0;
    }

    private EnumCp(int index) {
        this.f۱۵۴۷۱c = index;
    }
}
