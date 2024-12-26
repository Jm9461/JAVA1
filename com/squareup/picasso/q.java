package com.squareup.picasso;

public enum q {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    

    /* renamed from: c  reason: collision with root package name */
    final int f۳۵۷۹c;

    public static boolean b(int networkPolicy) {
        return (NO_CACHE.f۳۵۷۹c & networkPolicy) == 0;
    }

    public static boolean c(int networkPolicy) {
        return (NO_STORE.f۳۵۷۹c & networkPolicy) == 0;
    }

    public static boolean a(int networkPolicy) {
        return (OFFLINE.f۳۵۷۹c & networkPolicy) != 0;
    }

    private q(int index) {
        this.f۳۵۷۹c = index;
    }
}
