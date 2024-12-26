package com.squareup.picasso;

import java.io.PrintWriter;

/* renamed from: com.squareup.picasso.b0  reason: invalid class name */
public class Cb0 {

    /* renamed from: a  reason: contains not printable characters */
    public final int f۱۵۳۷۹a;

    /* renamed from: b  reason: contains not printable characters */
    public final int f۱۵۳۸۰b;

    /* renamed from: c  reason: contains not printable characters */
    public final long f۱۵۳۸۱c;

    /* renamed from: d  reason: contains not printable characters */
    public final long f۱۵۳۸۲d;

    /* renamed from: e  reason: contains not printable characters */
    public final long f۱۵۳۸۳e;

    /* renamed from: f  reason: contains not printable characters */
    public final long f۱۵۳۸۴f;

    /* renamed from: g  reason: contains not printable characters */
    public final long f۱۵۳۸۵g;

    /* renamed from: h  reason: contains not printable characters */
    public final long f۱۵۳۸۶h;

    /* renamed from: i  reason: contains not printable characters */
    public final long f۱۵۳۸۷i;

    /* renamed from: j  reason: contains not printable characters */
    public final long f۱۵۳۸۸j;

    /* renamed from: k  reason: contains not printable characters */
    public final int f۱۵۳۸۹k;

    /* renamed from: l  reason: contains not printable characters */
    public final int f۱۵۳۹۰l;

    /* renamed from: m  reason: contains not printable characters */
    public final int f۱۵۳۹۱m;

    /* renamed from: n  reason: contains not printable characters */
    public final long f۱۵۳۹۲n;

    public Cb0(int maxSize, int size, long cacheHits, long cacheMisses, long totalDownloadSize, long totalOriginalBitmapSize, long totalTransformedBitmapSize, long averageDownloadSize, long averageOriginalBitmapSize, long averageTransformedBitmapSize, int downloadCount, int originalBitmapCount, int transformedBitmapCount, long timeStamp) {
        this.f۱۵۳۷۹a = maxSize;
        this.f۱۵۳۸۰b = size;
        this.f۱۵۳۸۱c = cacheHits;
        this.f۱۵۳۸۲d = cacheMisses;
        this.f۱۵۳۸۳e = totalDownloadSize;
        this.f۱۵۳۸۴f = totalOriginalBitmapSize;
        this.f۱۵۳۸۵g = totalTransformedBitmapSize;
        this.f۱۵۳۸۶h = averageDownloadSize;
        this.f۱۵۳۸۷i = averageOriginalBitmapSize;
        this.f۱۵۳۸۸j = averageTransformedBitmapSize;
        this.f۱۵۳۸۹k = downloadCount;
        this.f۱۵۳۹۰l = originalBitmapCount;
        this.f۱۵۳۹۱m = transformedBitmapCount;
        this.f۱۵۳۹۲n = timeStamp;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۲۷۲a(PrintWriter writer) {
        writer.println("===============BEGIN PICASSO STATS ===============");
        writer.println("Memory Cache Stats");
        writer.print("  Max Cache Size: ");
        writer.println(this.f۱۵۳۷۹a);
        writer.print("  Cache Size: ");
        writer.println(this.f۱۵۳۸۰b);
        writer.print("  Cache % Full: ");
        writer.println((int) Math.ceil((double) ((((float) this.f۱۵۳۸۰b) / ((float) this.f۱۵۳۷۹a)) * 100.0f)));
        writer.print("  Cache Hits: ");
        writer.println(this.f۱۵۳۸۱c);
        writer.print("  Cache Misses: ");
        writer.println(this.f۱۵۳۸۲d);
        writer.println("Network Stats");
        writer.print("  Download Count: ");
        writer.println(this.f۱۵۳۸۹k);
        writer.print("  Total Download Size: ");
        writer.println(this.f۱۵۳۸۳e);
        writer.print("  Average Download Size: ");
        writer.println(this.f۱۵۳۸۶h);
        writer.println("Bitmap Stats");
        writer.print("  Total Bitmaps Decoded: ");
        writer.println(this.f۱۵۳۹۰l);
        writer.print("  Total Bitmap Size: ");
        writer.println(this.f۱۵۳۸۴f);
        writer.print("  Total Transformed Bitmaps: ");
        writer.println(this.f۱۵۳۹۱m);
        writer.print("  Total Transformed Bitmap Size: ");
        writer.println(this.f۱۵۳۸۵g);
        writer.print("  Average Bitmap Size: ");
        writer.println(this.f۱۵۳۸۷i);
        writer.print("  Average Transformed Bitmap Size: ");
        writer.println(this.f۱۵۳۸۸j);
        writer.println("===============END PICASSO STATS ===============");
        writer.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f۱۵۳۷۹a + ", size=" + this.f۱۵۳۸۰b + ", cacheHits=" + this.f۱۵۳۸۱c + ", cacheMisses=" + this.f۱۵۳۸۲d + ", downloadCount=" + this.f۱۵۳۸۹k + ", totalDownloadSize=" + this.f۱۵۳۸۳e + ", averageDownloadSize=" + this.f۱۵۳۸۶h + ", totalOriginalBitmapSize=" + this.f۱۵۳۸۴f + ", totalTransformedBitmapSize=" + this.f۱۵۳۸۵g + ", averageOriginalBitmapSize=" + this.f۱۵۳۸۷i + ", averageTransformedBitmapSize=" + this.f۱۵۳۸۸j + ", originalBitmapCount=" + this.f۱۵۳۹۰l + ", transformedBitmapCount=" + this.f۱۵۳۹۱m + ", timeStamp=" + this.f۱۵۳۹۲n + '}';
    }
}
