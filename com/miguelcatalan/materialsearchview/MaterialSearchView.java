package com.miguelcatalan.materialsearchview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.miguelcatalan.materialsearchview.p۱۳۴e.Ca;
import java.lang.reflect.Field;

public class MaterialSearchView extends FrameLayout implements Filter.FilterListener {

    /* renamed from: c  reason: contains not printable characters */
    private MenuItem f۱۴۸۰۰c;

    /* renamed from: d  reason: contains not printable characters */
    private boolean f۱۴۸۰۱d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۴۸۰۲e;

    /* renamed from: f  reason: contains not printable characters */
    private boolean f۱۴۸۰۳f;

    /* renamed from: g  reason: contains not printable characters */
    private View f۱۴۸۰۴g;

    /* renamed from: h  reason: contains not printable characters */
    private View f۱۴۸۰۵h;

    /* renamed from: i  reason: contains not printable characters */
    private ListView f۱۴۸۰۶i;

    /* renamed from: j  reason: contains not printable characters */
    private EditText f۱۴۸۰۷j;

    /* renamed from: k  reason: contains not printable characters */
    private ImageButton f۱۴۸۰۸k;

    /* renamed from: l  reason: contains not printable characters */
    private ImageButton f۱۴۸۰۹l;

    /* renamed from: m  reason: contains not printable characters */
    private ImageButton f۱۴۸۱۰m;

    /* renamed from: n  reason: contains not printable characters */
    private RelativeLayout f۱۴۸۱۱n;

    /* renamed from: o  reason: contains not printable characters */
    private CharSequence f۱۴۸۱۲o;

    /* renamed from: p  reason: contains not printable characters */
    private CharSequence f۱۴۸۱۳p;

    /* renamed from: q  reason: contains not printable characters */
    private AbstractCh f۱۴۸۱۴q;

    /* renamed from: r  reason: contains not printable characters */
    private AbstractCj f۱۴۸۱۵r;

    /* renamed from: s  reason: contains not printable characters */
    private ListAdapter f۱۴۸۱۶s;

    /* renamed from: t  reason: contains not printable characters */
    private Ci f۱۴۸۱۷t;

    /* renamed from: u  reason: contains not printable characters */
    private boolean f۱۴۸۱۸u;

    /* renamed from: v  reason: contains not printable characters */
    private boolean f۱۴۸۱۹v;

    /* renamed from: w  reason: contains not printable characters */
    private boolean f۱۴۸۲۰w;

    /* renamed from: x  reason: contains not printable characters */
    private Drawable f۱۴۸۲۱x;

    /* renamed from: y  reason: contains not printable characters */
    private Context f۱۴۸۲۲y;

    /* renamed from: z  reason: contains not printable characters */
    private final View.OnClickListener f۱۴۸۲۳z;

    /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$h  reason: invalid class name */
    public interface AbstractCh {
        /* renamed from: a  reason: contains not printable characters */
        boolean m۱۷۸۶۴a(String str);

        /* renamed from: b  reason: contains not printable characters */
        boolean m۱۷۸۶۵b(String str);
    }

    /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$j  reason: invalid class name */
    public interface AbstractCj {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۷۸۶۶a();

        /* renamed from: b  reason: contains not printable characters */
        void m۱۷۸۶۷b();
    }

    public MaterialSearchView(Context context) {
        this(context, null);
    }

    public MaterialSearchView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MaterialSearchView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs);
        this.f۱۴۸۰۱d = false;
        this.f۱۴۸۱۸u = false;
        this.f۱۴۸۱۹v = false;
        this.f۱۴۸۲۳z = new View$OnClickListenerCd();
        this.f۱۴۸۲۲y = context;
        m۱۷۸۴۳g();
        m۱۷۸۳۱a(attrs, defStyleAttr);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۷۸۳۱a(AttributeSet attrs, int defStyleAttr) {
        TypedArray a = this.f۱۴۸۲۲y.obtainStyledAttributes(attrs, Cc.MaterialSearchView, defStyleAttr, 0);
        if (a != null) {
            if (a.hasValue(Cc.MaterialSearchView_searchBackground)) {
                setBackground(a.getDrawable(Cc.MaterialSearchView_searchBackground));
            }
            if (a.hasValue(Cc.MaterialSearchView_android_textColor)) {
                setTextColor(a.getColor(Cc.MaterialSearchView_android_textColor, 0));
            }
            if (a.hasValue(Cc.MaterialSearchView_android_textColorHint)) {
                setHintTextColor(a.getColor(Cc.MaterialSearchView_android_textColorHint, 0));
            }
            if (a.hasValue(Cc.MaterialSearchView_android_hint)) {
                setHint(a.getString(Cc.MaterialSearchView_android_hint));
            }
            if (a.hasValue(Cc.MaterialSearchView_searchVoiceIcon)) {
                setVoiceIcon(a.getDrawable(Cc.MaterialSearchView_searchVoiceIcon));
            }
            if (a.hasValue(Cc.MaterialSearchView_searchCloseIcon)) {
                setCloseIcon(a.getDrawable(Cc.MaterialSearchView_searchCloseIcon));
            }
            if (a.hasValue(Cc.MaterialSearchView_searchBackIcon)) {
                setBackIcon(a.getDrawable(Cc.MaterialSearchView_searchBackIcon));
            }
            if (a.hasValue(Cc.MaterialSearchView_searchSuggestionBackground)) {
                setSuggestionBackground(a.getDrawable(Cc.MaterialSearchView_searchSuggestionBackground));
            }
            if (a.hasValue(Cc.MaterialSearchView_searchSuggestionIcon)) {
                setSuggestionIcon(a.getDrawable(Cc.MaterialSearchView_searchSuggestionIcon));
            }
            a.recycle();
        }
    }

    /* renamed from: g  reason: contains not printable characters */
    private void m۱۷۸۴۳g() {
        LayoutInflater.from(this.f۱۴۸۲۲y).inflate(Cb.search_view, (ViewGroup) this, true);
        this.f۱۴۸۰۴g = findViewById(Ca.search_layout);
        this.f۱۴۸۱۱n = (RelativeLayout) this.f۱۴۸۰۴g.findViewById(Ca.search_top_bar);
        this.f۱۴۸۰۶i = (ListView) this.f۱۴۸۰۴g.findViewById(Ca.suggestion_list);
        this.f۱۴۸۰۷j = (EditText) this.f۱۴۸۰۴g.findViewById(Ca.searchTextView);
        this.f۱۴۸۰۸k = (ImageButton) this.f۱۴۸۰۴g.findViewById(Ca.action_up_btn);
        this.f۱۴۸۰۹l = (ImageButton) this.f۱۴۸۰۴g.findViewById(Ca.action_voice_btn);
        this.f۱۴۸۱۰m = (ImageButton) this.f۱۴۸۰۴g.findViewById(Ca.action_empty_btn);
        this.f۱۴۸۰۵h = this.f۱۴۸۰۴g.findViewById(Ca.transparent_view);
        this.f۱۴۸۰۷j.setOnClickListener(this.f۱۴۸۲۳z);
        this.f۱۴۸۰۸k.setOnClickListener(this.f۱۴۸۲۳z);
        this.f۱۴۸۰۹l.setOnClickListener(this.f۱۴۸۲۳z);
        this.f۱۴۸۱۰m.setOnClickListener(this.f۱۴۸۲۳z);
        this.f۱۴۸۰۵h.setOnClickListener(this.f۱۴۸۲۳z);
        this.f۱۴۸۲۰w = false;
        m۱۷۸۵۷b(true);
        m۱۷۸۴۲f();
        this.f۱۴۸۰۶i.setVisibility(8);
        setAnimationDuration(com.miguelcatalan.materialsearchview.p۱۳۴e.Ca.f۱۴۸۴۳a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$a  reason: invalid class name */
    public class Ca implements TextView.OnEditorActionListener {
        Ca() {
        }

        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            MaterialSearchView.this.m۱۷۸۴۸i();
            return true;
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۷۸۴۲f() {
        this.f۱۴۸۰۷j.setOnEditorActionListener(new Ca());
        this.f۱۴۸۰۷j.addTextChangedListener(new Cb());
        this.f۱۴۸۰۷j.setOnFocusChangeListener(new View$OnFocusChangeListenerCc());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$b  reason: invalid class name */
    public class Cb implements TextWatcher {
        Cb() {
        }

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
            MaterialSearchView.this.f۱۴۸۱۳p = s;
            MaterialSearchView.this.m۱۷۸۳۵b((MaterialSearchView) s);
            MaterialSearchView.this.m۱۷۸۳۳a((MaterialSearchView) s);
        }

        public void afterTextChanged(Editable s) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$c  reason: invalid class name */
    public class View$OnFocusChangeListenerCc implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerCc() {
        }

        public void onFocusChange(View v, boolean hasFocus) {
            if (hasFocus) {
                MaterialSearchView materialSearchView = MaterialSearchView.this;
                materialSearchView.m۱۷۸۵۶b(materialSearchView.f۱۴۸۰۷j);
                MaterialSearchView.this.m۱۷۸۶۰e();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b  reason: contains not printable characters */
    private void m۱۷۸۳۵b(CharSequence s) {
        ListAdapter listAdapter = this.f۱۴۸۱۶s;
        if (listAdapter != null && (listAdapter instanceof Filterable)) {
            ((Filterable) listAdapter).getFilter().filter(s, this);
        }
    }

    /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$d  reason: invalid class name */
    class View$OnClickListenerCd implements View.OnClickListener {
        View$OnClickListenerCd() {
        }

        public void onClick(View v) {
            if (v == MaterialSearchView.this.f۱۴۸۰۸k) {
                MaterialSearchView.this.m۱۷۸۵۱a();
            } else if (v == MaterialSearchView.this.f۱۴۸۰۹l) {
                MaterialSearchView.this.m۱۷۸۴۹j();
            } else if (v == MaterialSearchView.this.f۱۴۸۱۰m) {
                MaterialSearchView.this.f۱۴۸۰۷j.setText((CharSequence) null);
            } else if (v == MaterialSearchView.this.f۱۴۸۰۷j) {
                MaterialSearchView.this.m۱۷۸۶۰e();
            } else if (v == MaterialSearchView.this.f۱۴۸۰۵h) {
                MaterialSearchView.this.m۱۷۸۵۱a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: j  reason: contains not printable characters */
    private void m۱۷۸۴۹j() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
        Context context = this.f۱۴۸۲۲y;
        if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(intent, 9999);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۷۸۳۳a(CharSequence newText) {
        CharSequence text = this.f۱۴۸۰۷j.getText();
        this.f۱۴۸۱۳p = text;
        if (!TextUtils.isEmpty(text)) {
            this.f۱۴۸۱۰m.setVisibility(0);
            m۱۷۸۵۷b(false);
        } else {
            this.f۱۴۸۱۰m.setVisibility(8);
            m۱۷۸۵۷b(true);
        }
        if (this.f۱۴۸۱۴q != null && !TextUtils.equals(newText, this.f۱۴۸۱۲o)) {
            this.f۱۴۸۱۴q.m۱۷۸۶۴a(newText.toString());
        }
        this.f۱۴۸۱۲o = newText.toString();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: i  reason: contains not printable characters */
    private void m۱۷۸۴۸i() {
        CharSequence query = this.f۱۴۸۰۷j.getText();
        if (query != null && TextUtils.getTrimmedLength(query) > 0) {
            AbstractCh hVar = this.f۱۴۸۱۴q;
            if (hVar == null || !hVar.m۱۷۸۶۵b(query.toString())) {
                m۱۷۸۵۱a();
                this.f۱۴۸۰۷j.setText((CharSequence) null);
            }
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    private boolean m۱۷۸۴۶h() {
        if (!isInEditMode() && getContext().getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0).size() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۸۵۲a(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۸۵۶b(View view) {
        if (Build.VERSION.SDK_INT <= 10 && view.hasFocus()) {
            view.clearFocus();
        }
        view.requestFocus();
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
    }

    public void setBackground(Drawable background) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۱۴۸۱۱n.setBackground(background);
        } else {
            this.f۱۴۸۱۱n.setBackgroundDrawable(background);
        }
    }

    public void setBackgroundColor(int color) {
        this.f۱۴۸۱۱n.setBackgroundColor(color);
    }

    public void setTextColor(int color) {
        this.f۱۴۸۰۷j.setTextColor(color);
    }

    public void setHintTextColor(int color) {
        this.f۱۴۸۰۷j.setHintTextColor(color);
    }

    public void setHint(CharSequence hint) {
        this.f۱۴۸۰۷j.setHint(hint);
    }

    public void setVoiceIcon(Drawable drawable) {
        this.f۱۴۸۰۹l.setImageDrawable(drawable);
    }

    public void setCloseIcon(Drawable drawable) {
        this.f۱۴۸۱۰m.setImageDrawable(drawable);
    }

    public void setBackIcon(Drawable drawable) {
        this.f۱۴۸۰۸k.setImageDrawable(drawable);
    }

    public void setSuggestionIcon(Drawable drawable) {
        this.f۱۴۸۲۱x = drawable;
    }

    public void setSuggestionBackground(Drawable background) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۱۴۸۰۶i.setBackground(background);
        } else {
            this.f۱۴۸۰۶i.setBackgroundDrawable(background);
        }
    }

    public void setCursorDrawable(int drawable) {
        try {
            Field f = TextView.class.getDeclaredField("mCursorDrawableRes");
            f.setAccessible(true);
            f.set(this.f۱۴۸۰۷j, Integer.valueOf(drawable));
        } catch (Exception ignored) {
            Log.e("MaterialSearchView", ignored.toString());
        }
    }

    public void setVoiceSearch(boolean voiceSearch) {
        this.f۱۴۸۲۰w = voiceSearch;
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۷۸۶۰e() {
        ListAdapter listAdapter = this.f۱۴۸۱۶s;
        if (listAdapter != null && listAdapter.getCount() > 0 && this.f۱۴۸۰۶i.getVisibility() == 8) {
            this.f۱۴۸۰۶i.setVisibility(0);
        }
    }

    public void setSubmitOnClick(boolean submit) {
        this.f۱۴۸۱۸u = submit;
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener listener) {
        this.f۱۴۸۰۶i.setOnItemClickListener(listener);
    }

    public void setAdapter(ListAdapter adapter) {
        this.f۱۴۸۱۶s = adapter;
        this.f۱۴۸۰۶i.setAdapter(adapter);
        m۱۷۸۳۵b(this.f۱۴۸۰۷j.getText());
    }

    public void setSuggestions(String[] suggestions) {
        if (suggestions == null || suggestions.length <= 0) {
            this.f۱۴۸۰۵h.setVisibility(8);
            return;
        }
        this.f۱۴۸۰۵h.setVisibility(0);
        Cd adapter = new Cd(this.f۱۴۸۲۲y, suggestions, this.f۱۴۸۲۱x, this.f۱۴۸۱۹v);
        setAdapter(adapter);
        setOnItemClickListener(new Ce(adapter));
    }

    /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$e  reason: invalid class name */
    class Ce implements AdapterView.OnItemClickListener {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ Cd f۱۴۸۲۸c;

        Ce(Cd dVar) {
            this.f۱۴۸۲۸c = dVar;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            MaterialSearchView.this.m۱۷۸۵۳a((String) this.f۱۴۸۲۸c.getItem(position), MaterialSearchView.this.f۱۴۸۱۸u);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۸۵۵b() {
        if (this.f۱۴۸۰۶i.getVisibility() == 0) {
            this.f۱۴۸۰۶i.setVisibility(8);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۸۵۳a(CharSequence query, boolean submit) {
        this.f۱۴۸۰۷j.setText(query);
        if (query != null) {
            EditText editText = this.f۱۴۸۰۷j;
            editText.setSelection(editText.length());
            this.f۱۴۸۱۳p = query;
        }
        if (submit && !TextUtils.isEmpty(query)) {
            m۱۷۸۴۸i();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۷۸۵۷b(boolean show) {
        if (!show || !m۱۷۸۴۶h() || !this.f۱۴۸۲۰w) {
            this.f۱۴۸۰۹l.setVisibility(8);
        } else {
            this.f۱۴۸۰۹l.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$f  reason: invalid class name */
    public class MenuItem$OnMenuItemClickListenerCf implements MenuItem.OnMenuItemClickListener {
        MenuItem$OnMenuItemClickListenerCf() {
        }

        public boolean onMenuItemClick(MenuItem item) {
            MaterialSearchView.this.m۱۷۸۵۹d();
            return true;
        }
    }

    public void setMenuItem(MenuItem menuItem) {
        this.f۱۴۸۰۰c = menuItem;
        this.f۱۴۸۰۰c.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerCf());
    }

    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۷۸۵۸c() {
        return this.f۱۴۸۰۱d;
    }

    public void setAnimationDuration(int duration) {
        this.f۱۴۸۰۲e = duration;
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۷۸۵۹d() {
        m۱۷۸۵۴a(true);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۸۵۴a(boolean animate) {
        if (!m۱۷۸۵۸c()) {
            this.f۱۴۸۰۷j.setText((CharSequence) null);
            this.f۱۴۸۰۷j.requestFocus();
            if (animate) {
                m۱۷۸۵۰k();
            } else {
                this.f۱۴۸۰۴g.setVisibility(0);
                AbstractCj jVar = this.f۱۴۸۱۵r;
                if (jVar != null) {
                    jVar.m۱۷۸۶۶a();
                }
            }
            this.f۱۴۸۰۱d = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$g  reason: invalid class name */
    public class Cg implements Ca.AbstractCc {
        Cg() {
        }

        @Override // com.miguelcatalan.materialsearchview.p۱۳۴e.Ca.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۷۸۶۲b(View view) {
            return false;
        }

        @Override // com.miguelcatalan.materialsearchview.p۱۳۴e.Ca.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۷۸۶۱a(View view) {
            if (MaterialSearchView.this.f۱۴۸۱۵r == null) {
                return false;
            }
            MaterialSearchView.this.f۱۴۸۱۵r.m۱۷۸۶۶a();
            return false;
        }

        @Override // com.miguelcatalan.materialsearchview.p۱۳۴e.Ca.AbstractCc
        /* renamed from: c  reason: contains not printable characters */
        public boolean m۱۷۸۶۳c(View view) {
            return false;
        }
    }

    /* renamed from: k  reason: contains not printable characters */
    private void m۱۷۸۵۰k() {
        Ca.AbstractCc animationListener = new Cg();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f۱۴۸۰۴g.setVisibility(0);
            com.miguelcatalan.materialsearchview.p۱۳۴e.Ca.m۱۷۸۷۲a(this.f۱۴۸۱۱n, animationListener);
            return;
        }
        com.miguelcatalan.materialsearchview.p۱۳۴e.Ca.m۱۷۸۷۱a(this.f۱۴۸۰۴g, this.f۱۴۸۰۲e, animationListener);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۸۵۱a() {
        if (m۱۷۸۵۸c()) {
            this.f۱۴۸۰۷j.setText((CharSequence) null);
            m۱۷۸۵۵b();
            clearFocus();
            this.f۱۴۸۰۴g.setVisibility(8);
            AbstractCj jVar = this.f۱۴۸۱۵r;
            if (jVar != null) {
                jVar.m۱۷۸۶۷b();
            }
            this.f۱۴۸۰۱d = false;
        }
    }

    public void setOnQueryTextListener(AbstractCh listener) {
        this.f۱۴۸۱۴q = listener;
    }

    public void setOnSearchViewListener(AbstractCj listener) {
        this.f۱۴۸۱۵r = listener;
    }

    public void setEllipsize(boolean ellipsize) {
        this.f۱۴۸۱۹v = ellipsize;
    }

    public void onFilterComplete(int count) {
        if (count > 0) {
            m۱۷۸۶۰e();
        } else {
            m۱۷۸۵۵b();
        }
    }

    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        if (!this.f۱۴۸۰۳f && isFocusable()) {
            return this.f۱۴۸۰۷j.requestFocus(direction, previouslyFocusedRect);
        }
        return false;
    }

    public void clearFocus() {
        this.f۱۴۸۰۳f = true;
        m۱۷۸۵۲a((View) this);
        super.clearFocus();
        this.f۱۴۸۰۷j.clearFocus();
        this.f۱۴۸۰۳f = false;
    }

    public Parcelable onSaveInstanceState() {
        this.f۱۴۸۱۷t = new Ci(super.onSaveInstanceState());
        Ci iVar = this.f۱۴۸۱۷t;
        CharSequence charSequence = this.f۱۴۸۱۳p;
        iVar.f۱۴۸۳۲c = charSequence != null ? charSequence.toString() : null;
        Ci iVar2 = this.f۱۴۸۱۷t;
        iVar2.f۱۴۸۳۳d = this.f۱۴۸۰۱d;
        return iVar2;
    }

    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof Ci)) {
            super.onRestoreInstanceState(state);
            return;
        }
        this.f۱۴۸۱۷t = (Ci) state;
        if (this.f۱۴۸۱۷t.f۱۴۸۳۳d) {
            m۱۷۸۵۴a(false);
            m۱۷۸۵۳a((CharSequence) this.f۱۴۸۱۷t.f۱۴۸۳۲c, false);
        }
        super.onRestoreInstanceState(this.f۱۴۸۱۷t.getSuperState());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$i  reason: invalid class name */
    public static class Ci extends View.BaseSavedState {
        public static final Parcelable.Creator<Ci> CREATOR = new Ca();

        /* renamed from: c  reason: contains not printable characters */
        String f۱۴۸۳۲c;

        /* renamed from: d  reason: contains not printable characters */
        boolean f۱۴۸۳۳d;

        /* synthetic */ Ci(Parcel x0, Ca x1) {
            this(x0);
        }

        Ci(Parcelable superState) {
            super(superState);
        }

        private Ci(Parcel in) {
            super(in);
            this.f۱۴۸۳۲c = in.readString();
            this.f۱۴۸۳۳d = in.readInt() != 1 ? false : true;
        }

        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeString(this.f۱۴۸۳۲c);
            out.writeInt(this.f۱۴۸۳۳d ? 1 : 0);
        }

        /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$i$a  reason: invalid class name */
        static class Ca implements Parcelable.Creator<Ci> {
            Ca() {
            }

            @Override // android.os.Parcelable.Creator
            public Ci createFromParcel(Parcel in) {
                return new Ci(in, null);
            }

            @Override // android.os.Parcelable.Creator
            public Ci[] newArray(int size) {
                return new Ci[size];
            }
        }
    }
}
