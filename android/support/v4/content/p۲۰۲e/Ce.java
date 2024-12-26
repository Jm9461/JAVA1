package android.support.v4.content.p۲۰۲e;

import java.lang.reflect.Array;

/* renamed from: android.support.v4.content.e.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Ce {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Object[]] */
    /* renamed from: a, reason: contains not printable characters */
    public static <T> T[] m۱۰۶۱۰a(T[] array, int currentSize, T element) {
        if (currentSize + 1 > array.length) {
            ?? r0 = (Object[]) Array.newInstance(array.getClass().getComponentType(), m۱۰۶۰۸a(currentSize));
            System.arraycopy(array, 0, r0, 0, currentSize);
            array = r0;
        }
        array[currentSize] = element;
        return array;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int[] m۱۰۶۰۹a(int[] array, int currentSize, int element) {
        if (currentSize + 1 > array.length) {
            int[] newArray = new int[m۱۰۶۰۸a(currentSize)];
            System.arraycopy(array, 0, newArray, 0, currentSize);
            array = newArray;
        }
        array[currentSize] = element;
        return array;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۰۶۰۸a(int currentSize) {
        if (currentSize <= 4) {
            return 8;
        }
        return currentSize * 2;
    }
}
