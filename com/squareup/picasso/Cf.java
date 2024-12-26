package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.squareup.picasso.AbstractCy;
import com.squareup.picasso.Ct;
import java.io.InputStream;
import p۱۴۹f.Cl;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.f  reason: invalid class name */
public class Cf extends AbstractCy {

    /* renamed from: b  reason: contains not printable characters */
    private static final UriMatcher f۱۵۴۲۴b = new UriMatcher(-1);

    /* renamed from: a  reason: contains not printable characters */
    private final Context f۱۵۴۲۵a;

    static {
        f۱۵۴۲۴b.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f۱۵۴۲۴b.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f۱۵۴۲۴b.addURI("com.android.contacts", "contacts/#/photo", 2);
        f۱۵۴۲۴b.addURI("com.android.contacts", "contacts/#", 3);
        f۱۵۴۲۴b.addURI("com.android.contacts", "display_photo/#", 4);
    }

    Cf(Context context) {
        this.f۱۵۴۲۵a = context;
    }

    @Override // com.squareup.picasso.AbstractCy
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۳۳۳a(Cw data) {
        Uri uri = data.f۱۵۵۳۵d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f۱۵۴۲۴b.match(data.f۱۵۵۳۵d) != -1;
    }

    @Override // com.squareup.picasso.AbstractCy
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCy.Ca m۱۸۳۳۲a(Cw request, int networkPolicy) {
        InputStream is = m۱۸۳۳۱c(request);
        if (is == null) {
            return null;
        }
        return new AbstractCy.Ca(Cl.m۱۹۴۸۶a(is), Ct.EnumCe.DISK);
    }

    /* renamed from: c  reason: contains not printable characters */
    private InputStream m۱۸۳۳۱c(Cw data) {
        ContentResolver contentResolver = this.f۱۵۴۲۵a.getContentResolver();
        Uri uri = data.f۱۵۵۳۵d;
        int match = f۱۵۴۲۴b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}
