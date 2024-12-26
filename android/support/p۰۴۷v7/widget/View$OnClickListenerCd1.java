package android.support.p۰۴۷v7.widget;

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
import android.support.p۰۴۳v4.widget.AbstractCo;
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
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf;

/* renamed from: android.support.v7.widget.d1  reason: invalid class name */
class View$OnClickListenerCd1 extends AbstractCo implements View.OnClickListener {

    /* renamed from: A  reason: contains not printable characters */
    private int f۱۱۹۸۱A = -1;

    /* renamed from: n  reason: contains not printable characters */
    private final SearchView f۱۱۹۸۲n;

    /* renamed from: o  reason: contains not printable characters */
    private final SearchableInfo f۱۱۹۸۳o;

    /* renamed from: p  reason: contains not printable characters */
    private final Context f۱۱۹۸۴p;

    /* renamed from: q  reason: contains not printable characters */
    private final WeakHashMap<String, Drawable.ConstantState> f۱۱۹۸۵q;

    /* renamed from: r  reason: contains not printable characters */
    private final int f۱۱۹۸۶r;

    /* renamed from: s  reason: contains not printable characters */
    private boolean f۱۱۹۸۷s = false;

    /* renamed from: t  reason: contains not printable characters */
    private int f۱۱۹۸۸t = 1;

    /* renamed from: u  reason: contains not printable characters */
    private ColorStateList f۱۱۹۸۹u;

    /* renamed from: v  reason: contains not printable characters */
    private int f۱۱۹۹۰v = -1;

    /* renamed from: w  reason: contains not printable characters */
    private int f۱۱۹۹۱w = -1;

    /* renamed from: x  reason: contains not printable characters */
    private int f۱۱۹۹۲x = -1;

    /* renamed from: y  reason: contains not printable characters */
    private int f۱۱۹۹۳y = -1;

    /* renamed from: z  reason: contains not printable characters */
    private int f۱۱۹۹۴z = -1;

    public View$OnClickListenerCd1(Context context, SearchView searchView, SearchableInfo searchable, WeakHashMap<String, Drawable.ConstantState> outsideDrawablesCache) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        SearchManager searchManager = (SearchManager) this.f۱۰۷۶۹f.getSystemService("search");
        this.f۱۱۹۸۲n = searchView;
        this.f۱۱۹۸۳o = searchable;
        this.f۱۱۹۸۶r = searchView.getSuggestionCommitIconResId();
        this.f۱۱۹۸۴p = context;
        this.f۱۱۹۸۵q = outsideDrawablesCache;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۱۷۷a(int refineWhat) {
        this.f۱۱۹۸۸t = refineWhat;
    }

    public boolean hasStableIds() {
        return false;
    }

    @Override // android.support.p۰۴۳v4.widget.Ce.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public Cursor m۱۵۱۷۴a(CharSequence constraint) {
        String query = constraint == null ? "" : constraint.toString();
        if (this.f۱۱۹۸۲n.getVisibility() != 0 || this.f۱۱۹۸۲n.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor cursor = m۱۵۱۷۳a(this.f۱۱۹۸۳o, query, 50);
            if (cursor != null) {
                cursor.getCount();
                return cursor;
            }
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
        }
        return null;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m۱۵۱۷۲g(m۱۳۲۲۵a());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m۱۵۱۷۲g(m۱۳۲۲۵a());
    }

    /* renamed from: g  reason: contains not printable characters */
    private void m۱۵۱۷۲g(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null && !extras.getBoolean("in_progress")) {
        }
    }

    @Override // android.support.p۰۴۳v4.widget.AbstractCd, android.support.p۰۴۳v4.widget.Ce.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۱۸۰b(Cursor c) {
        if (this.f۱۱۹۸۷s) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (c != null) {
                c.close();
                return;
            }
            return;
        }
        try {
            super.m۱۳۲۳۲b(c);
            if (c != null) {
                this.f۱۱۹۹۰v = c.getColumnIndex("suggest_text_1");
                this.f۱۱۹۹۱w = c.getColumnIndex("suggest_text_2");
                this.f۱۱۹۹۲x = c.getColumnIndex("suggest_text_2_url");
                this.f۱۱۹۹۳y = c.getColumnIndex("suggest_icon_1");
                this.f۱۱۹۹۴z = c.getColumnIndex("suggest_icon_2");
                this.f۱۱۹۸۱A = c.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // android.support.p۰۴۳v4.widget.AbstractCd, android.support.p۰۴۳v4.widget.AbstractCo
    /* renamed from: b  reason: contains not printable characters */
    public View m۱۵۱۷۹b(Context context, Cursor cursor, ViewGroup parent) {
        View v = super.m۱۳۲۹۷b(context, cursor, parent);
        v.setTag(new Ca(v));
        ((ImageView) v.findViewById(Cf.edit_query)).setImageResource(this.f۱۱۹۸۶r);
        return v;
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.d1$a  reason: invalid class name */
    public static final class Ca {

        /* renamed from: a  reason: contains not printable characters */
        public final TextView f۱۱۹۹۵a;

        /* renamed from: b  reason: contains not printable characters */
        public final TextView f۱۱۹۹۶b;

        /* renamed from: c  reason: contains not printable characters */
        public final ImageView f۱۱۹۹۷c;

        /* renamed from: d  reason: contains not printable characters */
        public final ImageView f۱۱۹۹۸d;

        /* renamed from: e  reason: contains not printable characters */
        public final ImageView f۱۱۹۹۹e;

        public Ca(View v) {
            this.f۱۱۹۹۵a = (TextView) v.findViewById(16908308);
            this.f۱۱۹۹۶b = (TextView) v.findViewById(16908309);
            this.f۱۱۹۹۷c = (ImageView) v.findViewById(16908295);
            this.f۱۱۹۹۸d = (ImageView) v.findViewById(16908296);
            this.f۱۱۹۹۹e = (ImageView) v.findViewById(Cf.edit_query);
        }
    }

    @Override // android.support.p۰۴۳v4.widget.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۱۷۸a(View view, Context context, Cursor cursor) {
        CharSequence text2;
        Ca views = (Ca) view.getTag();
        int flags = 0;
        int i = this.f۱۱۹۸۱A;
        if (i != -1) {
            flags = cursor.getInt(i);
        }
        if (views.f۱۱۹۹۵a != null) {
            m۱۵۱۶۳a(views.f۱۱۹۹۵a, m۱۵۱۶۰a(cursor, this.f۱۱۹۹۰v));
        }
        if (views.f۱۱۹۹۶b != null) {
            CharSequence text22 = m۱۵۱۶۰a(cursor, this.f۱۱۹۹۲x);
            if (text22 != null) {
                text2 = m۱۵۱۶۸b(text22);
            } else {
                text2 = m۱۵۱۶۰a(cursor, this.f۱۱۹۹۱w);
            }
            if (TextUtils.isEmpty(text2)) {
                TextView textView = views.f۱۱۹۹۵a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    views.f۱۱۹۹۵a.setMaxLines(2);
                }
            } else {
                TextView textView2 = views.f۱۱۹۹۵a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    views.f۱۱۹۹۵a.setMaxLines(1);
                }
            }
            m۱۵۱۶۳a(views.f۱۱۹۹۶b, text2);
        }
        ImageView imageView = views.f۱۱۹۹۷c;
        if (imageView != null) {
            m۱۵۱۶۲a(imageView, m۱۵۱۷۰e(cursor), 4);
        }
        ImageView imageView2 = views.f۱۱۹۹۸d;
        if (imageView2 != null) {
            m۱۵۱۶۲a(imageView2, m۱۵۱۷۱f(cursor), 8);
        }
        int i2 = this.f۱۱۹۸۸t;
        if (i2 == 2 || (i2 == 1 && (flags & 1) != 0)) {
            views.f۱۱۹۹۹e.setVisibility(0);
            views.f۱۱۹۹۹e.setTag(views.f۱۱۹۹۵a.getText());
            views.f۱۱۹۹۹e.setOnClickListener(this);
            return;
        }
        views.f۱۱۹۹۹e.setVisibility(8);
    }

    public void onClick(View v) {
        Object tag = v.getTag();
        if (tag instanceof CharSequence) {
            this.f۱۱۹۸۲n.m۱۴۷۳۹a((CharSequence) tag);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private CharSequence m۱۵۱۶۸b(CharSequence url) {
        if (this.f۱۱۹۸۹u == null) {
            TypedValue colorValue = new TypedValue();
            this.f۱۰۷۶۹f.getTheme().resolveAttribute(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.textColorSearchUrl, colorValue, true);
            this.f۱۱۹۸۹u = this.f۱۰۷۶۹f.getResources().getColorStateList(colorValue.resourceId);
        }
        SpannableString text = new SpannableString(url);
        text.setSpan(new TextAppearanceSpan(null, 0, 0, this.f۱۱۹۸۹u, null), 0, url.length(), 33);
        return text;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۱۶۳a(TextView v, CharSequence text) {
        v.setText(text);
        if (TextUtils.isEmpty(text)) {
            v.setVisibility(8);
        } else {
            v.setVisibility(0);
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private Drawable m۱۵۱۷۰e(Cursor cursor) {
        int i = this.f۱۱۹۹۳y;
        if (i == -1) {
            return null;
        }
        Drawable drawable = m۱۵۱۶۷b(cursor.getString(i));
        if (drawable != null) {
            return drawable;
        }
        return m۱۵۱۶۹d(cursor);
    }

    /* renamed from: f  reason: contains not printable characters */
    private Drawable m۱۵۱۷۱f(Cursor cursor) {
        int i = this.f۱۱۹۹۴z;
        if (i == -1) {
            return null;
        }
        return m۱۵۱۶۷b(cursor.getString(i));
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۱۶۲a(ImageView v, Drawable drawable, int nullVisibility) {
        v.setImageDrawable(drawable);
        if (drawable == null) {
            v.setVisibility(nullVisibility);
            return;
        }
        v.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    @Override // android.support.p۰۴۳v4.widget.AbstractCd, android.support.p۰۴۳v4.widget.Ce.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public CharSequence m۱۵۱۷۶a(Cursor cursor) {
        String text1;
        String data;
        if (cursor == null) {
            return null;
        }
        String query = m۱۵۱۶۱a(cursor, "suggest_intent_query");
        if (query != null) {
            return query;
        }
        if (this.f۱۱۹۸۳o.shouldRewriteQueryFromData() && (data = m۱۵۱۶۱a(cursor, "suggest_intent_data")) != null) {
            return data;
        }
        if (!this.f۱۱۹۸۳o.shouldRewriteQueryFromText() || (text1 = m۱۵۱۶۱a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return text1;
    }

    @Override // android.support.p۰۴۳v4.widget.AbstractCd
    public View getView(int position, View convertView, ViewGroup parent) {
        try {
            return super.getView(position, convertView, parent);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View v = m۱۵۱۷۹b(this.f۱۰۷۶۹f, this.f۱۰۷۶۸e, parent);
            if (v != null) {
                ((Ca) v.getTag()).f۱۱۹۹۵a.setText(e.toString());
            }
            return v;
        }
    }

    @Override // android.support.p۰۴۳v4.widget.AbstractCd
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        try {
            return super.getDropDownView(position, convertView, parent);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View v = m۱۳۲۹۶a(this.f۱۰۷۶۹f, this.f۱۰۷۶۸e, parent);
            if (v != null) {
                ((Ca) v.getTag()).f۱۱۹۹۵a.setText(e.toString());
            }
            return v;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private Drawable m۱۵۱۶۷b(String drawableId) {
        if (drawableId == null || drawableId.isEmpty() || "0".equals(drawableId)) {
            return null;
        }
        try {
            int resourceId = Integer.parseInt(drawableId);
            String drawableUri = "android.resource://" + this.f۱۱۹۸۴p.getPackageName() + "/" + resourceId;
            Drawable drawable = m۱۵۱۵۹a(drawableUri);
            if (drawable != null) {
                return drawable;
            }
            Drawable drawable2 = android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۶c(this.f۱۱۹۸۴p, resourceId);
            m۱۵۱۶۴a(drawableUri, drawable2);
            return drawable2;
        } catch (NumberFormatException e) {
            Drawable drawable3 = m۱۵۱۵۹a(drawableId);
            if (drawable3 != null) {
                return drawable3;
            }
            Drawable drawable4 = m۱۵۱۶۶b(Uri.parse(drawableId));
            m۱۵۱۶۴a(drawableId, drawable4);
            return drawable4;
        } catch (Resources.NotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + drawableId);
            return null;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private Drawable m۱۵۱۶۶b(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m۱۵۱۷۵a(uri);
                } catch (Resources.NotFoundException e) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            } else {
                InputStream stream = this.f۱۱۹۸۴p.getContentResolver().openInputStream(uri);
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

    /* renamed from: a  reason: contains not printable characters */
    private Drawable m۱۵۱۵۹a(String resourceUri) {
        Drawable.ConstantState cached = this.f۱۱۹۸۵q.get(resourceUri);
        if (cached == null) {
            return null;
        }
        return cached.newDrawable();
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۱۶۴a(String resourceUri, Drawable drawable) {
        if (drawable != null) {
            this.f۱۱۹۸۵q.put(resourceUri, drawable.getConstantState());
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private Drawable m۱۵۱۶۹d(Cursor cursor) {
        Drawable drawable = m۱۵۱۶۵b(this.f۱۱۹۸۳o.getSearchActivity());
        if (drawable != null) {
            return drawable;
        }
        return this.f۱۰۷۶۹f.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: b  reason: contains not printable characters */
    private Drawable m۱۵۱۶۵b(ComponentName component) {
        String componentIconKey = component.flattenToShortString();
        Drawable.ConstantState toCache = null;
        if (this.f۱۱۹۸۵q.containsKey(componentIconKey)) {
            Drawable.ConstantState cached = this.f۱۱۹۸۵q.get(componentIconKey);
            if (cached == null) {
                return null;
            }
            return cached.newDrawable(this.f۱۱۹۸۴p.getResources());
        }
        Drawable drawable = m۱۵۱۵۸a(component);
        if (drawable != null) {
            toCache = drawable.getConstantState();
        }
        this.f۱۱۹۸۵q.put(componentIconKey, toCache);
        return drawable;
    }

    /* renamed from: a  reason: contains not printable characters */
    private Drawable m۱۵۱۵۸a(ComponentName component) {
        PackageManager pm = this.f۱۰۷۶۹f.getPackageManager();
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

    /* renamed from: a  reason: contains not printable characters */
    public static String m۱۵۱۶۱a(Cursor cursor, String columnName) {
        return m۱۵۱۶۰a(cursor, cursor.getColumnIndex(columnName));
    }

    /* renamed from: a  reason: contains not printable characters */
    private static String m۱۵۱۶۰a(Cursor cursor, int col) {
        if (col == -1) {
            return null;
        }
        try {
            return cursor.getString(col);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Drawable m۱۵۱۷۵a(Uri uri) {
        int id;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources r = this.f۱۰۷۶۹f.getPackageManager().getResourcesForApplication(authority);
                List<String> path = uri.getPathSegments();
                if (path != null) {
                    int len = path.size();
                    if (len == 1) {
                        try {
                            id = Integer.parseInt(path.get(0));
                        } catch (NumberFormatException e) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (len == 2) {
                        id = r.getIdentifier(path.get(1), path.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (id != 0) {
                        return r.getDrawable(id);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException e2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Cursor m۱۵۱۷۳a(SearchableInfo searchable, String query, int limit) {
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
        return this.f۱۰۷۶۹f.getContentResolver().query(uriBuilder.build(), null, selection, selArgs, null);
    }
}
