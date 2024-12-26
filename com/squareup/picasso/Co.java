package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.squareup.picasso.AbstractCy;
import com.squareup.picasso.Ct;
import p۱۴۹f.Cl;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.o  reason: invalid class name */
public class Co extends Cg {

    /* renamed from: b  reason: contains not printable characters */
    private static final String[] f۱۵۴۶۰b = {"orientation"};

    Co(Context context) {
        super(context);
    }

    @Override // com.squareup.picasso.Cg, com.squareup.picasso.AbstractCy
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۳۸۱a(Cw data) {
        Uri uri = data.f۱۵۵۳۵d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // com.squareup.picasso.Cg, com.squareup.picasso.AbstractCy
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCy.Ca m۱۸۳۸۰a(Cw request, int networkPolicy) {
        Bitmap bitmap;
        ContentResolver contentResolver = this.f۱۵۴۲۶a.getContentResolver();
        int exifOrientation = m۱۸۳۷۸a(contentResolver, request.f۱۵۵۳۵d);
        String mimeType = contentResolver.getType(request.f۱۵۵۳۵d);
        int kind = 1;
        boolean isVideo = mimeType != null && mimeType.startsWith("video/");
        if (request.m۱۸۴۲۱c()) {
            EnumCa picassoKind = m۱۸۳۷۹a(request.f۱۵۵۳۹h, request.f۱۵۵۴۰i);
            if (!isVideo && picassoKind == EnumCa.FULL) {
                return new AbstractCy.Ca(null, Cl.m۱۹۴۸۶a(m۱۸۳۳۶c(request)), Ct.EnumCe.DISK, exifOrientation);
            }
            long id = ContentUris.parseId(request.f۱۵۵۳۵d);
            BitmapFactory.Options options = AbstractCy.m۱۸۴۴۳b(request);
            options.inJustDecodeBounds = true;
            AbstractCy.m۱۸۴۴۰a(request.f۱۵۵۳۹h, request.f۱۵۵۴۰i, picassoKind.f۱۵۴۶۶d, picassoKind.f۱۵۴۶۷e, options, request);
            if (isVideo) {
                if (picassoKind != EnumCa.FULL) {
                    kind = picassoKind.f۱۵۴۶۵c;
                }
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, id, kind, options);
            } else {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, id, picassoKind.f۱۵۴۶۵c, options);
            }
            if (bitmap != null) {
                return new AbstractCy.Ca(bitmap, null, Ct.EnumCe.DISK, exifOrientation);
            }
        }
        return new AbstractCy.Ca(null, Cl.m۱۹۴۸۶a(m۱۸۳۳۶c(request)), Ct.EnumCe.DISK, exifOrientation);
    }

    /* renamed from: a  reason: contains not printable characters */
    static EnumCa m۱۸۳۷۹a(int targetWidth, int targetHeight) {
        EnumCa aVar = EnumCa.MICRO;
        if (targetWidth <= aVar.f۱۵۴۶۶d && targetHeight <= aVar.f۱۵۴۶۷e) {
            return aVar;
        }
        EnumCa aVar2 = EnumCa.MINI;
        if (targetWidth > aVar2.f۱۵۴۶۶d || targetHeight > aVar2.f۱۵۴۶۷e) {
            return EnumCa.FULL;
        }
        return aVar2;
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۸۳۷۸a(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            Cursor cursor2 = contentResolver.query(uri, f۱۵۴۶۰b, null, null, null);
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
        } catch (RuntimeException e) {
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
    /* renamed from: com.squareup.picasso.o$a  reason: invalid class name */
    public enum EnumCa {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        

        /* renamed from: c  reason: contains not printable characters */
        final int f۱۵۴۶۵c;

        /* renamed from: d  reason: contains not printable characters */
        final int f۱۵۴۶۶d;

        /* renamed from: e  reason: contains not printable characters */
        final int f۱۵۴۶۷e;

        private EnumCa(int androidKind, int width, int height) {
            this.f۱۵۴۶۵c = androidKind;
            this.f۱۵۴۶۶d = width;
            this.f۱۵۴۶۷e = height;
        }
    }
}
