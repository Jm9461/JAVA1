package com.squareup.picasso;

import java.io.PrintWriter;

public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f۳۵۱۶a;

    /* renamed from: b  reason: collision with root package name */
    public final int f۳۵۱۷b;

    /* renamed from: c  reason: collision with root package name */
    public final long f۳۵۱۸c;

    /* renamed from: d  reason: collision with root package name */
    public final long f۳۵۱۹d;

    /* renamed from: e  reason: collision with root package name */
    public final long f۳۵۲۰e;

    /* renamed from: f  reason: collision with root package name */
    public final long f۳۵۲۱f;

    /* renamed from: g  reason: collision with root package name */
    public final long f۳۵۲۲g;

    /* renamed from: h  reason: collision with root package name */
    public final long f۳۵۲۳h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final int m;
    public final long n;

    public b0(int maxSize, int size, long cacheHits, long cacheMisses, long totalDownloadSize, long totalOriginalBitmapSize, long totalTransformedBitmapSize, long averageDownloadSize, long averageOriginalBitmapSize, long averageTransformedBitmapSize, int downloadCount, int originalBitmapCount, int transformedBitmapCount, long timeStamp) {
        this.f۳۵۱۶a = maxSize;
        this.f۳۵۱۷b = size;
        this.f۳۵۱۸c = cacheHits;
        this.f۳۵۱۹d = cacheMisses;
        this.f۳۵۲۰e = totalDownloadSize;
        this.f۳۵۲۱f = totalOriginalBitmapSize;
        this.f۳۵۲۲g = totalTransformedBitmapSize;
        this.f۳۵۲۳h = averageDownloadSize;
        this.i = averageOriginalBitmapSize;
        this.j = averageTransformedBitmapSize;
        this.k = downloadCount;
        this.l = originalBitmapCount;
        this.m = transformedBitmapCount;
        this.n = timeStamp;
    }

    public void a(PrintWriter writer) {
        writer.println("===============BEGIN PICASSO STATS ===============");
        writer.println("Memory Cache Stats");
        writer.print("  Max Cache Size: ");
        writer.println(this.f۳۵۱۶a);
        writer.print("  Cache Size: ");
        writer.println(this.f۳۵۱۷b);
        writer.print("  Cache % Full: ");
        writer.println((int) Math.ceil((double) ((((float) this.f۳۵۱۷b) / ((float) this.f۳۵۱۶a)) * 100.0f)));
        writer.print("  Cache Hits: ");
        writer.println(this.f۳۵۱۸c);
        writer.print("  Cache Misses: ");
        writer.println(this.f۳۵۱۹d);
        writer.println("Network Stats");
        writer.print("  Download Count: ");
        writer.println(this.k);
        writer.print("  Total Download Size: ");
        writer.println(this.f۳۵۲۰e);
        writer.print("  Average Download Size: ");
        writer.println(this.f۳۵۲۳h);
        writer.println("Bitmap Stats");
        writer.print("  Total Bitmaps Decoded: ");
        writer.println(this.l);
        writer.print("  Total Bitmap Size: ");
        writer.println(this.f۳۵۲۱f);
        writer.print("  Total Transformed Bitmaps: ");
        writer.println(this.m);
        writer.print("  Total Transformed Bitmap Size: ");
        writer.println(this.f۳۵۲۲g);
        writer.print("  Average Bitmap Size: ");
        writer.println(this.i);
        writer.print("  Average Transformed Bitmap Size: ");
        writer.println(this.j);
        writer.println("===============END PICASSO STATS ===============");
        writer.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f۳۵۱۶a + ", size=" + this.f۳۵۱۷b + ", cacheHits=" + this.f۳۵۱۸c + ", cacheMisses=" + this.f۳۵۱۹d + ", downloadCount=" + this.k + ", totalDownloadSize=" + this.f۳۵۲۰e + ", averageDownloadSize=" + this.f۳۵۲۳h + ", totalOriginalBitmapSize=" + this.f۳۵۲۱f + ", totalTransformedBitmapSize=" + this.f۳۵۲۲g + ", averageOriginalBitmapSize=" + this.i + ", averageTransformedBitmapSize=" + this.j + ", originalBitmapCount=" + this.l + ", transformedBitmapCount=" + this.m + ", timeStamp=" + this.n + '}';
    }
}
