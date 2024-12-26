package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import f.l;

/* access modifiers changed from: package-private */
public class o extends g {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f۳۵۶۴b = {"orientation"};

    o(Context context) {
        super(context);
    }

    @Override // com.squareup.picasso.g, com.squareup.picasso.y
    public boolean a(w data) {
        Uri uri = data.f۳۶۲۶d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // com.squareup.picasso.g, com.squareup.picasso.y
    public y.a a(w request, int networkPolicy) {
        Bitmap bitmap;
        ContentResolver contentResolver = this.f۳۵۴۰a.getContentResolver();
        int exifOrientation = a(contentResolver, request.f۳۶۲۶d);
        String mimeType = contentResolver.getType(request.f۳۶۲۶d);
        int kind = 1;
        boolean isVideo = mimeType != null && mimeType.startsWith("video/");
        if (request.c()) {
            a picassoKind = a(request.f۳۶۳۰h, request.i);
            if (!isVideo && picassoKind == a.FULL) {
                return new y.a(null, l.a(c(request)), t.e.DISK, exifOrientation);
            }
            long id = ContentUris.parseId(request.f۳۶۲۶d);
            BitmapFactory.Options options = y.b(request);
            options.inJustDecodeBounds = true;
            y.a(request.f۳۶۳۰h, request.i, picassoKind.f۳۵۶۹d, picassoKind.f۳۵۷۰e, options, request);
            if (isVideo) {
                if (picassoKind != a.FULL) {
                    kind = picassoKind.f۳۵۶۸c;
                }
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, id, kind, options);
            } else {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, id, picassoKind.f۳۵۶۸c, options);
            }
            if (bitmap != null) {
                return new y.a(bitmap, null, t.e.DISK, exifOrientation);
            }
        }
        return new y.a(null, l.a(c(request)), t.e.DISK, exifOrientation);
    }

    static a a(int targetWidth, int targetHeight) {
        a aVar = a.MICRO;
        if (targetWidth <= aVar.f۳۵۶۹d && targetHeight <= aVar.f۳۵۷۰e) {
            return aVar;
        }
        a aVar2 = a.MINI;
        if (targetWidth > aVar2.f۳۵۶۹d || targetHeight > aVar2.f۳۵۷۰e) {
            return a.FULL;
        }
        return aVar2;
    }

    static int a(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            Cursor cursor2 = contentResolver.query(uri, f۳۵۶۴b, null, null, null);
            if (cursor2 != null) {
                if (cursor2.moveToFirst()) {
                    int i = cursor2.getInt(0);
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return i;
                }
            }
            if (cursor2 != null) {
                cursor2.close();
            }
            return 0;
        } catch (RuntimeException e2) {
            if (0 != 0) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        

        /* renamed from: c  reason: collision with root package name */
        final int f۳۵۶۸c;

        /* renamed from: d  reason: collision with root package name */
        final int f۳۵۶۹d;

        /* renamed from: e  reason: collision with root package name */
        final int f۳۵۷۰e;

        private a(int androidKind, int width, int height) {
            this.f۳۵۶۸c = androidKind;
            this.f۳۵۶۹d = width;
            this.f۳۵۷۰e = height;
        }
    }
}
