package com.squareup.picasso;

public enum p {
    NO_CACHE(1),
    NO_STORE(2);
    

    /* renamed from: c  reason: collision with root package name */
    final int f۳۵۷۴c;

    static boolean a(int memoryPolicy) {
        return (NO_CACHE.f۳۵۷۴c & memoryPolicy) == 0;
    }

    static boolean b(int memoryPolicy) {
        return (NO_STORE.f۳۵۷۴c & memoryPolicy) == 0;
    }

    private p(int index) {
        this.f۳۵۷۴c = index;
    }
}
