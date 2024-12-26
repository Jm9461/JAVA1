package android.support.v7.widget;

import a.b.h.a.f;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.o;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

class d1 extends o implements View.OnClickListener {
    private int A = -1;
    private final SearchView n;
    private final SearchableInfo o;
    private final Context p;
    private final WeakHashMap<String, Drawable.ConstantState> q;
    private final int r;
    private boolean s = false;
    private int t = 1;
    private ColorStateList u;
    private int v = -1;
    private int w = -1;
    private int x = -1;
    private int y = -1;
    private int z = -1;

    public d1(Context context, SearchView searchView, SearchableInfo searchable, WeakHashMap<String, Drawable.ConstantState> outsideDrawablesCache) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        SearchManager searchManager = (SearchManager) this.f۱۴۴۲f.getSystemService("search");
        this.n = searchView;
        this.o = searchable;
        this.r = searchView.getSuggestionCommitIconResId();
        this.p = context;
        this.q = outsideDrawablesCache;
    }

    public void a(int refineWhat) {
        this.t = refineWhat;
    }

    public boolean hasStableIds() {
        return false;
    }

    @Override // android.support.v4.widget.e.a
    public Cursor a(CharSequence constraint) {
        String query = constraint == null ? "" : constraint.toString();
        if (this.n.getVisibility() != 0 || this.n.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor cursor = a(this.o, query, 50);
            if (cursor != null) {
                cursor.getCount();
                return cursor;
            }
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
        }
        return null;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        g(a());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        g(a());
    }

    private void g(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null && !extras.getBoolean("in_progress")) {
        }
    }

    @Override // android.support.v4.widget.d, android.support.v4.widget.e.a
    public void b(Cursor c2) {
        if (this.s) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (c2 != null) {
                c2.close();
                return;
            }
            return;
        }
        try {
            super.b(c2);
            if (c2 != null) {
                this.v = c2.getColumnIndex("suggest_text_1");
                this.w = c2.getColumnIndex("suggest_text_2");
                this.x = c2.getColumnIndex("suggest_text_2_url");
                this.y = c2.getColumnIndex("suggest_icon_1");
                this.z = c2.getColumnIndex("suggest_icon_2");
                this.A = c2.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // android.support.v4.widget.d, android.support.v4.widget.o
    public View b(Context context, Cursor cursor, ViewGroup parent) {
        View v2 = super.b(context, cursor, parent);
        v2.setTag(new a(v2));
        ((ImageView) v2.findViewById(f.edit_query)).setImageResource(this.r);
        return v2;
    }

    /* access modifiers changed from: private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f۲۰۱۸a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f۲۰۱۹b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f۲۰۲۰c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f۲۰۲۱d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f۲۰۲۲e;

        public a(View v) {
            this.f۲۰۱۸a = (TextView) v.findViewById(16908308);
            this.f۲۰۱۹b = (TextView) v.findViewById(16908309);
            this.f۲۰۲۰c = (ImageView) v.findViewById(16908295);
            this.f۲۰۲۱d = (ImageView) v.findViewById(16908296);
            this.f۲۰۲۲e = (ImageView) v.findViewById(f.edit_query);
        }
    }

    @Override // android.support.v4.widget.d
    public void a(View view, Context context, Cursor cursor) {
        CharSequence text2;
        a views = (a) view.getTag();
        int flags = 0;
        int i = this.A;
        if (i != -1) {
            flags = cursor.getInt(i);
        }
        if (views.f۲۰۱۸a != null) {
            a(views.f۲۰۱۸a, a(cursor, this.v));
        }
        if (views.f۲۰۱۹b != null) {
            CharSequence text22 = a(cursor, this.x);
            if (text22 != null) {
                text2 = b(text22);
            } else {
                text2 = a(cursor, this.w);
            }
            if (TextUtils.isEmpty(text2)) {
                TextView textView = views.f۲۰۱۸a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    views.f۲۰۱۸a.setMaxLines(2);
                }
            } else {
                TextView textView2 = views.f۲۰۱۸a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    views.f۲۰۱۸a.setMaxLines(1);
                }
            }
            a(views.f۲۰۱۹b, text2);
        }
        ImageView imageView = views.f۲۰۲۰c;
        if (imageView != null) {
            a(imageView, e(cursor), 4);
        }
        ImageView imageView2 = views.f۲۰۲۱d;
        if (imageView2 != null) {
            a(imageView2, f(cursor), 8);
        }
        int i2 = this.t;
        if (i2 == 2 || (i2 == 1 && (flags & 1) != 0)) {
            views.f۲۰۲۲e.setVisibility(0);
            views.f۲۰۲۲e.setTag(views.f۲۰۱۸a.getText());
            views.f۲۰۲۲e.setOnClickListener(this);
            return;
        }
        views.f۲۰۲۲e.setVisibility(8);
    }

    public void onClick(View v2) {
        Object tag = v2.getTag();
        if (tag instanceof CharSequence) {
            this.n.a((CharSequence) tag);
        }
    }

    private CharSequence b(CharSequence url) {
        if (this.u == null) {
            TypedValue colorValue = new TypedValue();
            this.f۱۴۴۲f.getTheme().resolveAttribute(a.b.h.a.a.textColorSearchUrl, colorValue, true);
            this.u = this.f۱۴۴۲f.getResources().getColorStateList(colorValue.resourceId);
        }
        SpannableString text = new SpannableString(url);
        text.setSpan(new TextAppearanceSpan(null, 0, 0, this.u, null), 0, url.length(), 33);
        return text;
    }

    private void a(TextView v2, CharSequence text) {
        v2.setText(text);
        if (TextUtils.isEmpty(text)) {
            v2.setVisibility(8);
        } else {
            v2.setVisibility(0);
        }
    }

    private Drawable e(Cursor cursor) {
        int i = this.y;
        if (i == -1) {
            return null;
        }
        Drawable drawable = b(cursor.getString(i));
        if (drawable != null) {
            return drawable;
        }
        return d(cursor);
    }

    private Drawable f(Cursor cursor) {
        int i = this.z;
        if (i == -1) {
            return null;
        }
        return b(cursor.getString(i));
    }

    private void a(ImageView v2, Drawable drawable, int nullVisibility) {
        v2.setImageDrawable(drawable);
        if (drawable == null) {
            v2.setVisibility(nullVisibility);
            return;
        }
        v2.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    @Override // android.support.v4.widget.d, android.support.v4.widget.e.a
    public CharSequence a(Cursor cursor) {
        String text1;
        String data;
        if (cursor == null) {
            return null;
        }
        String query = a(cursor, "suggest_intent_query");
        if (query != null) {
            return query;
        }
        if (this.o.shouldRewriteQueryFromData() && (data = a(cursor, "suggest_intent_data")) != null) {
            return data;
        }
        if (!this.o.shouldRewriteQueryFromText() || (text1 = a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return text1;
    }

    @Override // android.support.v4.widget.d
    public View getView(int position, View convertView, ViewGroup parent) {
        try {
            return super.getView(position, convertView, parent);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View v2 = b(this.f۱۴۴۲f, this.f۱۴۴۱e, parent);
            if (v2 != null) {
                ((a) v2.getTag()).f۲۰۱۸a.setText(e2.toString());
            }
            return v2;
        }
    }

    @Override // android.support.v4.widget.d
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        try {
            return super.getDropDownView(position, convertView, parent);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View v2 = a(this.f۱۴۴۲f, this.f۱۴۴۱e, parent);
            if (v2 != null) {
                ((a) v2.getTag()).f۲۰۱۸a.setText(e2.toString());
            }
            return v2;
        }
    }

    private Drawable b(String drawableId) {
        if (drawableId == null || drawableId.isEmpty() || "0".equals(drawableId)) {
            return null;
        }
        try {
            int resourceId = Integer.parseInt(drawableId);
            String drawableUri = "android.resource://" + this.p.getPackageName() + "/" + resourceId;
            Drawable drawable = a(drawableUri);
            if (drawable != null) {
                return drawable;
            }
            Drawable drawable2 = android.support.v4.content.a.c(this.p, resourceId);
            a(drawableUri, drawable2);
            return drawable2;
        } catch (NumberFormatException e2) {
            Drawable drawable3 = a(drawableId);
            if (drawable3 != null) {
                return drawable3;
            }
            Drawable drawable4 = b(Uri.parse(drawableId));
            a(drawableId, drawable4);
            return drawable4;
        } catch (Resources.NotFoundException e3) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + drawableId);
            return null;
        }
    }

    private Drawable b(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return a(uri);
                } catch (Resources.NotFoundException e2) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            } else {
                InputStream stream = this.p.getContentResolver().openInputStream(uri);
                if (stream != null) {
                    try {
                        return Drawable.createFromStream(stream, null);
                    } finally {
                        try {
                            stream.close();
                        } catch (IOException ex) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, ex);
                        }
                    }
                } else {
                    throw new FileNotFoundException("Failed to open " + uri);
                }
            }
        } catch (FileNotFoundException fnfe) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + fnfe.getMessage());
            return null;
        }
    }

    private Drawable a(String resourceUri) {
        Drawable.ConstantState cached = this.q.get(resourceUri);
        if (cached == null) {
            return null;
        }
        return cached.newDrawable();
    }

    private void a(String resourceUri, Drawable drawable) {
        if (drawable != null) {
            this.q.put(resourceUri, drawable.getConstantState());
        }
    }

    private Drawable d(Cursor cursor) {
        Drawable drawable = b(this.o.getSearchActivity());
        if (drawable != null) {
            return drawable;
        }
        return this.f۱۴۴۲f.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable b(ComponentName component) {
        String componentIconKey = component.flattenToShortString();
        Drawable.ConstantState toCache = null;
        if (this.q.containsKey(componentIconKey)) {
            Drawable.ConstantState cached = this.q.get(componentIconKey);
            if (cached == null) {
                return null;
            }
            return cached.newDrawable(this.p.getResources());
        }
        Drawable drawable = a(component);
        if (drawable != null) {
            toCache = drawable.getConstantState();
        }
        this.q.put(componentIconKey, toCache);
        return drawable;
    }

    private Drawable a(ComponentName component) {
        PackageManager pm = this.f۱۴۴۲f.getPackageManager();
        try {
            ActivityInfo activityInfo = pm.getActivityInfo(component, 128);
            int iconId = activityInfo.getIconResource();
            if (iconId == 0) {
                return null;
            }
            Drawable drawable = pm.getDrawable(component.getPackageName(), iconId, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconId + " for " + component.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException ex) {
            Log.w("SuggestionsAdapter", ex.toString());
            return null;
        }
    }

    public static String a(Cursor cursor, String columnName) {
        return a(cursor, cursor.getColumnIndex(columnName));
    }

    private static String a(Cursor cursor, int col) {
        if (col == -1) {
            return null;
        }
        try {
            return cursor.getString(col);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public Drawable a(Uri uri) {
        int id;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources r2 = this.f۱۴۴۲f.getPackageManager().getResourcesForApplication(authority);
                List<String> path = uri.getPathSegments();
                if (path != null) {
                    int len = path.size();
                    if (len == 1) {
                        try {
                            id = Integer.parseInt(path.get(0));
                        } catch (NumberFormatException e2) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (len == 2) {
                        id = r2.getIdentifier(path.get(1), path.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (id != 0) {
                        return r2.getDrawable(id);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException e3) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* access modifiers changed from: package-private */
    public Cursor a(SearchableInfo searchable, String query, int limit) {
        String authority;
        String[] selArgs;
        if (searchable == null || (authority = searchable.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder uriBuilder = new Uri.Builder().scheme("content").authority(authority).query("").fragment("");
        String contentPath = searchable.getSuggestPath();
        if (contentPath != null) {
            uriBuilder.appendEncodedPath(contentPath);
        }
        uriBuilder.appendPath("search_suggest_query");
        String selection = searchable.getSuggestSelection();
        if (selection != null) {
            selArgs = new String[]{query};
        } else {
            uriBuilder.appendPath(query);
            selArgs = null;
        }
        if (limit > 0) {
            uriBuilder.appendQueryParameter("limit", String.valueOf(limit));
        }
        return this.f۱۴۴۲f.getContentResolver().query(uriBuilder.build(), null, selection, selArgs, null);
    }
}
