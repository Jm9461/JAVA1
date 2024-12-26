package android.support.v7.widget;

import android.R;
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
import android.support.v4.widget.AbstractCo;
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
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cf;

/* renamed from: android.support.v7.widget.d1, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class ViewOnClickListenerCd1 extends AbstractCo implements View.OnClickListener {

    /* renamed from: A, reason: contains not printable characters */
    private int f۱۱۹۸۱A;

    /* renamed from: n, reason: contains not printable characters */
    private final SearchView f۱۱۹۸۲n;

    /* renamed from: o, reason: contains not printable characters */
    private final SearchableInfo f۱۱۹۸۳o;

    /* renamed from: p, reason: contains not printable characters */
    private final Context f۱۱۹۸۴p;

    /* renamed from: q, reason: contains not printable characters */
    private final WeakHashMap<String, Drawable.ConstantState> f۱۱۹۸۵q;

    /* renamed from: r, reason: contains not printable characters */
    private final int f۱۱۹۸۶r;

    /* renamed from: s, reason: contains not printable characters */
    private boolean f۱۱۹۸۷s;

    /* renamed from: t, reason: contains not printable characters */
    private int f۱۱۹۸۸t;

    /* renamed from: u, reason: contains not printable characters */
    private ColorStateList f۱۱۹۸۹u;

    /* renamed from: v, reason: contains not printable characters */
    private int f۱۱۹۹۰v;

    /* renamed from: w, reason: contains not printable characters */
    private int f۱۱۹۹۱w;

    /* renamed from: x, reason: contains not printable characters */
    private int f۱۱۹۹۲x;

    /* renamed from: y, reason: contains not printable characters */
    private int f۱۱۹۹۳y;

    /* renamed from: z, reason: contains not printable characters */
    private int f۱۱۹۹۴z;

    public ViewOnClickListenerCd1(Context context, SearchView searchView, SearchableInfo searchable, WeakHashMap<String, Drawable.ConstantState> outsideDrawablesCache) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f۱۱۹۸۷s = false;
        this.f۱۱۹۸۸t = 1;
        this.f۱۱۹۹۰v = -1;
        this.f۱۱۹۹۱w = -1;
        this.f۱۱۹۹۲x = -1;
        this.f۱۱۹۹۳y = -1;
        this.f۱۱۹۹۴z = -1;
        this.f۱۱۹۸۱A = -1;
        this.f۱۱۹۸۲n = searchView;
        this.f۱۱۹۸۳o = searchable;
        this.f۱۱۹۸۶r = searchView.getSuggestionCommitIconResId();
        this.f۱۱۹۸۴p = context;
        this.f۱۱۹۸۵q = outsideDrawablesCache;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۱۰۷a(int refineWhat) {
        this.f۱۱۹۸۸t = refineWhat;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.support.v4.widget.Ce.a
    /* renamed from: a, reason: contains not printable characters */
    public Cursor mo۱۳۱۰۴a(CharSequence constraint) {
        String query = constraint == null ? "" : constraint.toString();
        if (this.f۱۱۹۸۲n.getVisibility() != 0 || this.f۱۱۹۸۲n.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor cursor = m۱۳۱۰۳a(this.f۱۱۹۸۳o, query, 50);
            if (cursor != null) {
                cursor.getCount();
                return cursor;
            }
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
        }
        return null;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m۱۳۱۰۲g(mo۱۱۱۶۴a());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m۱۳۱۰۲g(mo۱۱۱۶۴a());
    }

    /* renamed from: g, reason: contains not printable characters */
    private void m۱۳۱۰۲g(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    @Override // android.support.v4.widget.AbstractCd, android.support.v4.widget.Ce.a
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۳۱۱۰b(Cursor c2) {
        if (this.f۱۱۹۸۷s) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (c2 != null) {
                c2.close();
                return;
            }
            return;
        }
        try {
            super.mo۱۳۱۱۰b(c2);
            if (c2 != null) {
                this.f۱۱۹۹۰v = c2.getColumnIndex("suggest_text_1");
                this.f۱۱۹۹۱w = c2.getColumnIndex("suggest_text_2");
                this.f۱۱۹۹۲x = c2.getColumnIndex("suggest_text_2_url");
                this.f۱۱۹۹۳y = c2.getColumnIndex("suggest_icon_1");
                this.f۱۱۹۹۴z = c2.getColumnIndex("suggest_icon_2");
                this.f۱۱۹۸۱A = c2.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // android.support.v4.widget.AbstractCo, android.support.v4.widget.AbstractCd
    /* renamed from: b, reason: contains not printable characters */
    public View mo۱۳۱۰۹b(Context context, Cursor cursor, ViewGroup parent) {
        View v = super.mo۱۳۱۰۹b(context, cursor, parent);
        v.setTag(new a(v));
        ImageView iconRefine = (ImageView) v.findViewById(Cf.edit_query);
        iconRefine.setImageResource(this.f۱۱۹۸۶r);
        return v;
    }

    /* renamed from: android.support.v7.widget.d1$a */
    private static final class a {

        /* renamed from: a, reason: contains not printable characters */
        public final TextView f۱۱۹۹۵a;

        /* renamed from: b, reason: contains not printable characters */
        public final TextView f۱۱۹۹۶b;

        /* renamed from: c, reason: contains not printable characters */
        public final ImageView f۱۱۹۹۷c;

        /* renamed from: d, reason: contains not printable characters */
        public final ImageView f۱۱۹۹۸d;

        /* renamed from: e, reason: contains not printable characters */
        public final ImageView f۱۱۹۹۹e;

        public a(View v) {
            this.f۱۱۹۹۵a = (TextView) v.findViewById(R.id.text1);
            this.f۱۱۹۹۶b = (TextView) v.findViewById(R.id.text2);
            this.f۱۱۹۹۷c = (ImageView) v.findViewById(R.id.icon1);
            this.f۱۱۹۹۸d = (ImageView) v.findViewById(R.id.icon2);
            this.f۱۱۹۹۹e = (ImageView) v.findViewById(Cf.edit_query);
        }
    }

    @Override // android.support.v4.widget.AbstractCd
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۱۰۸a(View view, Context context, Cursor cursor) {
        CharSequence text2;
        a views = (a) view.getTag();
        int flags = 0;
        int i = this.f۱۱۹۸۱A;
        if (i != -1) {
            flags = cursor.getInt(i);
        }
        if (views.f۱۱۹۹۵a != null) {
            String text1 = m۱۳۰۹۰a(cursor, this.f۱۱۹۹۰v);
            m۱۳۰۹۳a(views.f۱۱۹۹۵a, text1);
        }
        if (views.f۱۱۹۹۶b != null) {
            CharSequence text22 = m۱۳۰۹۰a(cursor, this.f۱۱۹۹۲x);
            if (text22 != null) {
                text2 = m۱۳۰۹۸b(text22);
            } else {
                text2 = m۱۳۰۹۰a(cursor, this.f۱۱۹۹۱w);
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
            m۱۳۰۹۳a(views.f۱۱۹۹۶b, text2);
        }
        ImageView imageView = views.f۱۱۹۹۷c;
        if (imageView != null) {
            m۱۳۰۹۲a(imageView, m۱۳۱۰۰e(cursor), 4);
        }
        ImageView imageView2 = views.f۱۱۹۹۸d;
        if (imageView2 != null) {
            m۱۳۰۹۲a(imageView2, m۱۳۱۰۱f(cursor), 8);
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

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        Object tag = v.getTag();
        if (tag instanceof CharSequence) {
            this.f۱۱۹۸۲n.m۱۲۶۶۹a((CharSequence) tag);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private CharSequence m۱۳۰۹۸b(CharSequence url) {
        if (this.f۱۱۹۸۹u == null) {
            TypedValue colorValue = new TypedValue();
            this.f۱۰۷۶۹f.getTheme().resolveAttribute(Ca.textColorSearchUrl, colorValue, true);
            this.f۱۱۹۸۹u = this.f۱۰۷۶۹f.getResources().getColorStateList(colorValue.resourceId);
        }
        SpannableString text = new SpannableString(url);
        text.setSpan(new TextAppearanceSpan(null, 0, 0, this.f۱۱۹۸۹u, null), 0, url.length(), 33);
        return text;
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۰۹۳a(TextView v, CharSequence text) {
        v.setText(text);
        if (TextUtils.isEmpty(text)) {
            v.setVisibility(8);
        } else {
            v.setVisibility(0);
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    private Drawable m۱۳۱۰۰e(Cursor cursor) {
        int i = this.f۱۱۹۹۳y;
        if (i == -1) {
            return null;
        }
        String value = cursor.getString(i);
        Drawable drawable = m۱۳۰۹۷b(value);
        if (drawable != null) {
            return drawable;
        }
        return m۱۳۰۹۹d(cursor);
    }

    /* renamed from: f, reason: contains not printable characters */
    private Drawable m۱۳۱۰۱f(Cursor cursor) {
        int i = this.f۱۱۹۹۴z;
        if (i == -1) {
            return null;
        }
        String value = cursor.getString(i);
        return m۱۳۰۹۷b(value);
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۰۹۲a(ImageView v, Drawable drawable, int nullVisibility) {
        v.setImageDrawable(drawable);
        if (drawable == null) {
            v.setVisibility(nullVisibility);
            return;
        }
        v.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    @Override // android.support.v4.widget.AbstractCd, android.support.v4.widget.Ce.a
    /* renamed from: a, reason: contains not printable characters */
    public CharSequence mo۱۳۱۰۶a(Cursor cursor) {
        String text1;
        String data;
        if (cursor == null) {
            return null;
        }
        String query = m۱۳۰۹۱a(cursor, "suggest_intent_query");
        if (query != null) {
            return query;
        }
        if (this.f۱۱۹۸۳o.shouldRewriteQueryFromData() && (data = m۱۳۰۹۱a(cursor, "suggest_intent_data")) != null) {
            return data;
        }
        if (!this.f۱۱۹۸۳o.shouldRewriteQueryFromText() || (text1 = m۱۳۰۹۱a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return text1;
    }

    @Override // android.support.v4.widget.AbstractCd, android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        try {
            return super.getView(position, convertView, parent);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View v = mo۱۳۱۰۹b(this.f۱۰۷۶۹f, this.f۱۰۷۶۸e, parent);
            if (v != null) {
                a views = (a) v.getTag();
                TextView tv = views.f۱۱۹۹۵a;
                tv.setText(e2.toString());
            }
            return v;
        }
    }

    @Override // android.support.v4.widget.AbstractCd, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        try {
            return super.getDropDownView(position, convertView, parent);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View v = mo۱۱۲۲۶a(this.f۱۰۷۶۹f, this.f۱۰۷۶۸e, parent);
            if (v != null) {
                a views = (a) v.getTag();
                TextView tv = views.f۱۱۹۹۵a;
                tv.setText(e2.toString());
            }
            return v;
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private Drawable m۱۳۰۹۷b(String drawableId) {
        if (drawableId == null || drawableId.isEmpty() || "0".equals(drawableId)) {
            return null;
        }
        try {
            int resourceId = Integer.parseInt(drawableId);
            String drawableUri = "android.resource://" + this.f۱۱۹۸۴p.getPackageName() + "/" + resourceId;
            Drawable drawable = m۱۳۰۸۹a(drawableUri);
            if (drawable != null) {
                return drawable;
            }
            Drawable drawable2 = android.support.v4.content.Ca.m۱۰۵۵۶c(this.f۱۱۹۸۴p, resourceId);
            m۱۳۰۹۴a(drawableUri, drawable2);
            return drawable2;
        } catch (Resources.NotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + drawableId);
            return null;
        } catch (NumberFormatException e3) {
            Drawable drawable3 = m۱۳۰۸۹a(drawableId);
            if (drawable3 != null) {
                return drawable3;
            }
            Uri uri = Uri.parse(drawableId);
            Drawable drawable4 = m۱۳۰۹۶b(uri);
            m۱۳۰۹۴a(drawableId, drawable4);
            return drawable4;
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private Drawable m۱۳۰۹۶b(Uri uri) {
        try {
            String scheme = uri.getScheme();
            if ("android.resource".equals(scheme)) {
                try {
                    return m۱۳۱۰۵a(uri);
                } catch (Resources.NotFoundException e2) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream stream = this.f۱۱۹۸۴p.getContentResolver().openInputStream(uri);
            if (stream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(stream, null);
            } finally {
                try {
                    stream.close();
                } catch (IOException ex) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, ex);
                }
            }
        } catch (FileNotFoundException fnfe) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + fnfe.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + fnfe.getMessage());
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    private Drawable m۱۳۰۸۹a(String resourceUri) {
        Drawable.ConstantState cached = this.f۱۱۹۸۵q.get(resourceUri);
        if (cached == null) {
            return null;
        }
        return cached.newDrawable();
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۰۹۴a(String resourceUri, Drawable drawable) {
        if (drawable != null) {
            this.f۱۱۹۸۵q.put(resourceUri, drawable.getConstantState());
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    private Drawable m۱۳۰۹۹d(Cursor cursor) {
        Drawable drawable = m۱۳۰۹۵b(this.f۱۱۹۸۳o.getSearchActivity());
        if (drawable != null) {
            return drawable;
        }
        return this.f۱۰۷۶۹f.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: b, reason: contains not printable characters */
    private Drawable m۱۳۰۹۵b(ComponentName component) {
        String componentIconKey = component.flattenToShortString();
        if (this.f۱۱۹۸۵q.containsKey(componentIconKey)) {
            Drawable.ConstantState cached = this.f۱۱۹۸۵q.get(componentIconKey);
            if (cached == null) {
                return null;
            }
            return cached.newDrawable(this.f۱۱۹۸۴p.getResources());
        }
        Drawable drawable = m۱۳۰۸۸a(component);
        Drawable.ConstantState toCache = drawable != null ? drawable.getConstantState() : null;
        this.f۱۱۹۸۵q.put(componentIconKey, toCache);
        return drawable;
    }

    /* renamed from: a, reason: contains not printable characters */
    private Drawable m۱۳۰۸۸a(ComponentName component) {
        PackageManager pm = this.f۱۰۷۶۹f.getPackageManager();
        try {
            ActivityInfo activityInfo = pm.getActivityInfo(component, 128);
            int iconId = activityInfo.getIconResource();
            if (iconId == 0) {
                return null;
            }
            String pkg = component.getPackageName();
            Drawable drawable = pm.getDrawable(pkg, iconId, activityInfo.applicationInfo);
            if (drawable == null) {
                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconId + " for " + component.flattenToShortString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException ex) {
            Log.w("SuggestionsAdapter", ex.toString());
            return null;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static String m۱۳۰۹۱a(Cursor cursor, String columnName) {
        int col = cursor.getColumnIndex(columnName);
        return m۱۳۰۹۰a(cursor, col);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static String m۱۳۰۹۰a(Cursor cursor, int col) {
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

    /* renamed from: a, reason: contains not printable characters */
    Drawable m۱۳۱۰۵a(Uri uri) {
        int id;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources r = this.f۱۰۷۶۹f.getPackageManager().getResourcesForApplication(authority);
            List<String> path = uri.getPathSegments();
            if (path == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int len = path.size();
            if (len == 1) {
                try {
                    id = Integer.parseInt(path.get(0));
                } catch (NumberFormatException e2) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (len == 2) {
                id = r.getIdentifier(path.get(1), path.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + uri);
            }
            if (id == 0) {
                throw new FileNotFoundException("No resource found for: " + uri);
            }
            return r.getDrawable(id);
        } catch (PackageManager.NameNotFoundException e3) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    Cursor m۱۳۱۰۳a(SearchableInfo searchable, String query, int limit) {
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
            String[] selArgs2 = {query};
            selArgs = selArgs2;
        } else {
            uriBuilder.appendPath(query);
            selArgs = null;
        }
        if (limit > 0) {
            uriBuilder.appendQueryParameter("limit", String.valueOf(limit));
        }
        Uri uri = uriBuilder.build();
        return this.f۱۰۷۶۹f.getContentResolver().query(uri, null, selection, selArgs, null);
    }
}
