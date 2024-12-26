package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import f.l;
import java.io.InputStream;

/* access modifiers changed from: package-private */
public class f extends y {

    /* renamed from: b  reason: collision with root package name */
    private static final UriMatcher f۳۵۳۸b = new UriMatcher(-1);

    /* renamed from: a  reason: collision with root package name */
    private final Context f۳۵۳۹a;

    static {
        f۳۵۳۸b.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f۳۵۳۸b.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f۳۵۳۸b.addURI("com.android.contacts", "contacts/#/photo", 2);
        f۳۵۳۸b.addURI("com.android.contacts", "contacts/#", 3);
        f۳۵۳۸b.addURI("com.android.contacts", "display_photo/#", 4);
    }

    f(Context context) {
        this.f۳۵۳۹a = context;
    }

    @Override // com.squareup.picasso.y
    public boolean a(w data) {
        Uri uri = data.f۳۶۲۶d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f۳۵۳۸b.match(data.f۳۶۲۶d) != -1;
    }

    @Override // com.squareup.picasso.y
    public y.a a(w request, int networkPolicy) {
        InputStream is = c(request);
        if (is == null) {
            return null;
        }
        return new y.a(l.a(is), t.e.DISK);
    }

    private InputStream c(w data) {
        ContentResolver contentResolver = this.f۳۵۳۹a.getContentResolver();
        Uri uri = data.f۳۶۲۶d;
        int match = f۳۵۳۸b.match(uri);
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
