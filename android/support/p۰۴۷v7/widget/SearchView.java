package android.support.p۰۴۷v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p۰۴۳v4.view.AbstractCa;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.widget.AbstractCd;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cd;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cg;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCc;

/* renamed from: android.support.v7.widget.SearchView */
public class SearchView extends Co0 implements AbstractCc {

    /* renamed from: s0  reason: contains not printable characters */
    static final Ck f۱۱۷۱۳s0 = new Ck();

    /* renamed from: A  reason: contains not printable characters */
    private Cp f۱۱۷۱۴A;

    /* renamed from: B  reason: contains not printable characters */
    private Rect f۱۱۷۱۵B;

    /* renamed from: C  reason: contains not printable characters */
    private Rect f۱۱۷۱۶C;

    /* renamed from: D  reason: contains not printable characters */
    private int[] f۱۱۷۱۷D;

    /* renamed from: E  reason: contains not printable characters */
    private int[] f۱۱۷۱۸E;

    /* renamed from: F  reason: contains not printable characters */
    private final ImageView f۱۱۷۱۹F;

    /* renamed from: G  reason: contains not printable characters */
    private final Drawable f۱۱۷۲۰G;

    /* renamed from: H  reason: contains not printable characters */
    private final int f۱۱۷۲۱H;

    /* renamed from: I  reason: contains not printable characters */
    private final int f۱۱۷۲۲I;

    /* renamed from: J  reason: contains not printable characters */
    private final Intent f۱۱۷۲۳J;

    /* renamed from: K  reason: contains not printable characters */
    private final Intent f۱۱۷۲۴K;

    /* renamed from: L  reason: contains not printable characters */
    private final CharSequence f۱۱۷۲۵L;

    /* renamed from: M  reason: contains not printable characters */
    private AbstractCm f۱۱۷۲۶M;

    /* renamed from: N  reason: contains not printable characters */
    private AbstractCl f۱۱۷۲۷N;

    /* renamed from: O  reason: contains not printable characters */
    View.OnFocusChangeListener f۱۱۷۲۸O;

    /* renamed from: P  reason: contains not printable characters */
    private AbstractCn f۱۱۷۲۹P;

    /* renamed from: Q  reason: contains not printable characters */
    private View.OnClickListener f۱۱۷۳۰Q;

    /* renamed from: R  reason: contains not printable characters */
    private boolean f۱۱۷۳۱R;

    /* renamed from: S  reason: contains not printable characters */
    private boolean f۱۱۷۳۲S;

    /* renamed from: T  reason: contains not printable characters */
    AbstractCd f۱۱۷۳۳T;

    /* renamed from: U  reason: contains not printable characters */
    private boolean f۱۱۷۳۴U;

    /* renamed from: V  reason: contains not printable characters */
    private CharSequence f۱۱۷۳۵V;

    /* renamed from: W  reason: contains not printable characters */
    private boolean f۱۱۷۳۶W;

    /* renamed from: a0  reason: contains not printable characters */
    private boolean f۱۱۷۳۷a0;

    /* renamed from: b0  reason: contains not printable characters */
    private int f۱۱۷۳۸b0;

    /* renamed from: c0  reason: contains not printable characters */
    private boolean f۱۱۷۳۹c0;

    /* renamed from: d0  reason: contains not printable characters */
    private CharSequence f۱۱۷۴۰d0;

    /* renamed from: e0  reason: contains not printable characters */
    private CharSequence f۱۱۷۴۱e0;

    /* renamed from: f0  reason: contains not printable characters */
    private boolean f۱۱۷۴۲f0;

    /* renamed from: g0  reason: contains not printable characters */
    private int f۱۱۷۴۳g0;

    /* renamed from: h0  reason: contains not printable characters */
    SearchableInfo f۱۱۷۴۴h0;

    /* renamed from: i0  reason: contains not printable characters */
    private Bundle f۱۱۷۴۵i0;

    /* renamed from: j0  reason: contains not printable characters */
    private final Runnable f۱۱۷۴۶j0;

    /* renamed from: k0  reason: contains not printable characters */
    private Runnable f۱۱۷۴۷k0;

    /* renamed from: l0  reason: contains not printable characters */
    private final WeakHashMap<String, Drawable.ConstantState> f۱۱۷۴۸l0;

    /* renamed from: m0  reason: contains not printable characters */
    private final View.OnClickListener f۱۱۷۴۹m0;

    /* renamed from: n0  reason: contains not printable characters */
    View.OnKeyListener f۱۱۷۵۰n0;

    /* renamed from: o0  reason: contains not printable characters */
    private final TextView.OnEditorActionListener f۱۱۷۵۱o0;

    /* renamed from: p0  reason: contains not printable characters */
    private final AdapterView.OnItemClickListener f۱۱۷۵۲p0;

    /* renamed from: q0  reason: contains not printable characters */
    private final AdapterView.OnItemSelectedListener f۱۱۷۵۳q0;

    /* renamed from: r  reason: contains not printable characters */
    final SearchAutoComplete f۱۱۷۵۴r;

    /* renamed from: r0  reason: contains not printable characters */
    private TextWatcher f۱۱۷۵۵r0;

    /* renamed from: s  reason: contains not printable characters */
    private final View f۱۱۷۵۶s;

    /* renamed from: t  reason: contains not printable characters */
    private final View f۱۱۷۵۷t;

    /* renamed from: u  reason: contains not printable characters */
    private final View f۱۱۷۵۸u;

    /* renamed from: v  reason: contains not printable characters */
    final ImageView f۱۱۷۵۹v;

    /* renamed from: w  reason: contains not printable characters */
    final ImageView f۱۱۷۶۰w;

    /* renamed from: x  reason: contains not printable characters */
    final ImageView f۱۱۷۶۱x;

    /* renamed from: y  reason: contains not printable characters */
    final ImageView f۱۱۷۶۲y;

    /* renamed from: z  reason: contains not printable characters */
    private final View f۱۱۷۶۳z;

    /* renamed from: android.support.v7.widget.SearchView$l  reason: invalid class name */
    public interface AbstractCl {
        /* renamed from: a  reason: contains not printable characters */
        boolean m۱۴۷۶۱a();
    }

    /* renamed from: android.support.v7.widget.SearchView$m  reason: invalid class name */
    public interface AbstractCm {
        /* renamed from: a  reason: contains not printable characters */
        boolean m۱۴۷۶۲a(String str);

        /* renamed from: b  reason: contains not printable characters */
        boolean m۱۴۷۶۳b(String str);
    }

    /* renamed from: android.support.v7.widget.SearchView$n  reason: invalid class name */
    public interface AbstractCn {
        /* renamed from: a  reason: contains not printable characters */
        boolean m۱۴۷۶۴a(int i);

        /* renamed from: b  reason: contains not printable characters */
        boolean m۱۴۷۶۵b(int i);
    }

    /* renamed from: android.support.v7.widget.SearchView$b  reason: invalid class name */
    class RunnableCb implements Runnable {
        RunnableCb() {
        }

        public void run() {
            SearchView.this.m۱۴۷۵۵l();
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$c  reason: invalid class name */
    class RunnableCc implements Runnable {
        RunnableCc() {
        }

        public void run() {
            AbstractCd dVar = SearchView.this.f۱۱۷۳۳T;
            if (dVar != null && (dVar instanceof View$OnClickListenerCd1)) {
                dVar.m۱۳۲۳۲b(null);
            }
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attrs) {
        this(context, attrs, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۱۱۷۱۵B = new Rect();
        this.f۱۱۷۱۶C = new Rect();
        this.f۱۱۷۱۷D = new int[2];
        this.f۱۱۷۱۸E = new int[2];
        this.f۱۱۷۴۶j0 = new RunnableCb();
        this.f۱۱۷۴۷k0 = new RunnableCc();
        this.f۱۱۷۴۸l0 = new WeakHashMap<>();
        this.f۱۱۷۴۹m0 = new View$OnClickListenerCf();
        this.f۱۱۷۵۰n0 = new View$OnKeyListenerCg();
        this.f۱۱۷۵۱o0 = new Ch();
        this.f۱۱۷۵۲p0 = new Ci();
        this.f۱۱۷۵۳q0 = new Cj();
        this.f۱۱۷۵۵r0 = new Ca();
        Cj1 a = Cj1.m۱۵۳۴۵a(context, attrs, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.SearchView, defStyleAttr, 0);
        LayoutInflater.from(context).inflate(a.m۱۵۳۶۳g(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.SearchView_layout, Cg.abc_search_view), (ViewGroup) this, true);
        this.f۱۱۷۵۴r = (SearchAutoComplete) findViewById(Cf.search_src_text);
        this.f۱۱۷۵۴r.setSearchView(this);
        this.f۱۱۷۵۶s = findViewById(Cf.search_edit_frame);
        this.f۱۱۷۵۷t = findViewById(Cf.search_plate);
        this.f۱۱۷۵۸u = findViewById(Cf.submit_area);
        this.f۱۱۷۵۹v = (ImageView) findViewById(Cf.search_button);
        this.f۱۱۷۶۰w = (ImageView) findViewById(Cf.search_go_btn);
        this.f۱۱۷۶۱x = (ImageView) findViewById(Cf.search_close_btn);
        this.f۱۱۷۶۲y = (ImageView) findViewById(Cf.search_voice_btn);
        this.f۱۱۷۱۹F = (ImageView) findViewById(Cf.search_mag_icon);
        Cu.m۱۲۹۸۴a(this.f۱۱۷۵۷t, a.m۱۵۳۵۴b(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.SearchView_queryBackground));
        Cu.m۱۲۹۸۴a(this.f۱۱۷۵۸u, a.m۱۵۳۵۴b(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.SearchView_submitBackground));
        this.f۱۱۷۵۹v.setImageDrawable(a.m۱۵۳۵۴b(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.SearchView_searchIcon));
        this.f۱۱۷۶۰w.setImageDrawable(a.m۱۵۳۵۴b(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.SearchView_goIcon));
        this.f۱۱۷۶۱x.setImageDrawable(a.m۱۵۳۵۴b(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.SearchView_closeIcon));
        this.f۱۱۷۶۲y.setImageDrawable(a.m۱۵۳۵۴b(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.SearchView_voiceIcon));
        this.f۱۱۷۱۹F.setImageDrawable(a.m۱۵۳۵۴b(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.SearchView_searchIcon));
        this.f۱۱۷۲۰G = a.m۱۵۳۵۴b(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.SearchView_searchHintIcon);
        Cl1.m۱۵۴۱۷a(this.f۱۱۷۵۹v, getResources().getString(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ch.abc_searchview_description_search));
        this.f۱۱۷۲۱H = a.m۱۵۳۶۳g(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.SearchView_suggestionRowLayout, Cg.abc_search_dropdown_item_icons_2line);
        this.f۱۱۷۲۲I = a.m۱۵۳۶۳g(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.SearchView_commitIcon, 0);
        this.f۱۱۷۵۹v.setOnClickListener(this.f۱۱۷۴۹m0);
        this.f۱۱۷۶۱x.setOnClickListener(this.f۱۱۷۴۹m0);
        this.f۱۱۷۶۰w.setOnClickListener(this.f۱۱۷۴۹m0);
        this.f۱۱۷۶۲y.setOnClickListener(this.f۱۱۷۴۹m0);
        this.f۱۱۷۵۴r.setOnClickListener(this.f۱۱۷۴۹m0);
        this.f۱۱۷۵۴r.addTextChangedListener(this.f۱۱۷۵۵r0);
        this.f۱۱۷۵۴r.setOnEditorActionListener(this.f۱۱۷۵۱o0);
        this.f۱۱۷۵۴r.setOnItemClickListener(this.f۱۱۷۵۲p0);
        this.f۱۱۷۵۴r.setOnItemSelectedListener(this.f۱۱۷۵۳q0);
        this.f۱۱۷۵۴r.setOnKeyListener(this.f۱۱۷۵۰n0);
        this.f۱۱۷۵۴r.setOnFocusChangeListener(new View$OnFocusChangeListenerCd());
        setIconifiedByDefault(a.m۱۵۳۵۱a(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.SearchView_iconifiedByDefault, true));
        int maxWidth = a.m۱۵۳۵۵c(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.SearchView_android_maxWidth, -1);
        if (maxWidth != -1) {
            setMaxWidth(maxWidth);
        }
        this.f۱۱۷۲۵L = a.m۱۵۳۶۰e(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.SearchView_defaultQueryHint);
        this.f۱۱۷۳۵V = a.m۱۵۳۶۰e(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.SearchView_queryHint);
        int imeOptions = a.m۱۵۳۵۷d(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.SearchView_android_imeOptions, -1);
        if (imeOptions != -1) {
            setImeOptions(imeOptions);
        }
        int inputType = a.m۱۵۳۵۷d(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.SearchView_android_inputType, -1);
        if (inputType != -1) {
            setInputType(inputType);
        }
        setFocusable(a.m۱۵۳۵۱a(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj.SearchView_android_focusable, true));
        a.m۱۵۳۵۰a();
        this.f۱۱۷۲۳J = new Intent("android.speech.action.WEB_SEARCH");
        this.f۱۱۷۲۳J.addFlags(268435456);
        this.f۱۱۷۲۳J.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f۱۱۷۲۴K = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f۱۱۷۲۴K.addFlags(268435456);
        this.f۱۱۷۶۳z = findViewById(this.f۱۱۷۵۴r.getDropDownAnchor());
        View view = this.f۱۱۷۶۳z;
        if (view != null) {
            view.addOnLayoutChangeListener(new View$OnLayoutChangeListenerCe());
        }
        m۱۴۷۲۵b(this.f۱۱۷۳۱R);
        m۱۴۷۳۵r();
    }

    /* renamed from: android.support.v7.widget.SearchView$d  reason: invalid class name */
    class View$OnFocusChangeListenerCd implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerCd() {
        }

        public void onFocusChange(View v, boolean hasFocus) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f۱۱۷۲۸O;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, hasFocus);
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$e  reason: invalid class name */
    class View$OnLayoutChangeListenerCe implements View.OnLayoutChangeListener {
        View$OnLayoutChangeListenerCe() {
        }

        public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            SearchView.this.m۱۴۷۴۶d();
        }
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f۱۱۷۲۱H;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f۱۱۷۲۲I;
    }

    public void setSearchableInfo(SearchableInfo searchable) {
        this.f۱۱۷۴۴h0 = searchable;
        if (this.f۱۱۷۴۴h0 != null) {
            m۱۴۷۳۶s();
            m۱۴۷۳۵r();
        }
        this.f۱۱۷۳۹c0 = m۱۴۷۳۱n();
        if (this.f۱۱۷۳۹c0) {
            this.f۱۱۷۵۴r.setPrivateImeOptions("nm");
        }
        m۱۴۷۲۵b(m۱۴۷۴۹f());
    }

    public void setAppSearchData(Bundle appSearchData) {
        this.f۱۱۷۴۵i0 = appSearchData;
    }

    public void setImeOptions(int imeOptions) {
        this.f۱۱۷۵۴r.setImeOptions(imeOptions);
    }

    public int getImeOptions() {
        return this.f۱۱۷۵۴r.getImeOptions();
    }

    public void setInputType(int inputType) {
        this.f۱۱۷۵۴r.setInputType(inputType);
    }

    public int getInputType() {
        return this.f۱۱۷۵۴r.getInputType();
    }

    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        if (this.f۱۱۷۳۷a0 || !isFocusable()) {
            return false;
        }
        if (m۱۴۷۴۹f()) {
            return super.requestFocus(direction, previouslyFocusedRect);
        }
        boolean result = this.f۱۱۷۵۴r.requestFocus(direction, previouslyFocusedRect);
        if (result) {
            m۱۴۷۲۵b(false);
        }
        return result;
    }

    public void clearFocus() {
        this.f۱۱۷۳۷a0 = true;
        super.clearFocus();
        this.f۱۱۷۵۴r.clearFocus();
        this.f۱۱۷۵۴r.setImeVisibility(false);
        this.f۱۱۷۳۷a0 = false;
    }

    public void setOnQueryTextListener(AbstractCm listener) {
        this.f۱۱۷۲۶M = listener;
    }

    public void setOnCloseListener(AbstractCl listener) {
        this.f۱۱۷۲۷N = listener;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener listener) {
        this.f۱۱۷۲۸O = listener;
    }

    public void setOnSuggestionListener(AbstractCn listener) {
        this.f۱۱۷۲۹P = listener;
    }

    public void setOnSearchClickListener(View.OnClickListener listener) {
        this.f۱۱۷۳۰Q = listener;
    }

    public CharSequence getQuery() {
        return this.f۱۱۷۵۴r.getText();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۷۴۰a(CharSequence query, boolean submit) {
        this.f۱۱۷۵۴r.setText(query);
        if (query != null) {
            SearchAutoComplete searchAutoComplete = this.f۱۱۷۵۴r;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f۱۱۷۴۱e0 = query;
        }
        if (submit && !TextUtils.isEmpty(query)) {
            m۱۴۷۵۲i();
        }
    }

    public void setQueryHint(CharSequence hint) {
        this.f۱۱۷۳۵V = hint;
        m۱۴۷۳۵r();
    }

    public CharSequence getQueryHint() {
        if (this.f۱۱۷۳۵V != null) {
            return this.f۱۱۷۳۵V;
        }
        SearchableInfo searchableInfo = this.f۱۱۷۴۴h0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f۱۱۷۲۵L;
        }
        return getContext().getText(this.f۱۱۷۴۴h0.getHintId());
    }

    public void setIconifiedByDefault(boolean iconified) {
        if (this.f۱۱۷۳۱R != iconified) {
            this.f۱۱۷۳۱R = iconified;
            m۱۴۷۲۵b(iconified);
            m۱۴۷۳۵r();
        }
    }

    public void setIconified(boolean iconify) {
        if (iconify) {
            m۱۴۷۵۰g();
        } else {
            m۱۴۷۵۱h();
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    public boolean m۱۴۷۴۹f() {
        return this.f۱۱۷۳۲S;
    }

    public void setSubmitButtonEnabled(boolean enabled) {
        this.f۱۱۷۳۴U = enabled;
        m۱۴۷۲۵b(m۱۴۷۴۹f());
    }

    public void setQueryRefinementEnabled(boolean enable) {
        this.f۱۱۷۳۶W = enable;
        AbstractCd dVar = this.f۱۱۷۳۳T;
        if (dVar instanceof View$OnClickListenerCd1) {
            ((View$OnClickListenerCd1) dVar).m۱۵۱۷۷a(enable ? 2 : 1);
        }
    }

    public void setSuggestionsAdapter(AbstractCd adapter) {
        this.f۱۱۷۳۳T = adapter;
        this.f۱۱۷۵۴r.setAdapter(this.f۱۱۷۳۳T);
    }

    public AbstractCd getSuggestionsAdapter() {
        return this.f۱۱۷۳۳T;
    }

    public void setMaxWidth(int maxpixels) {
        this.f۱۱۷۳۸b0 = maxpixels;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.f۱۱۷۳۸b0;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۷v7.widget.Co0
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        if (m۱۴۷۴۹f()) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int width = View.MeasureSpec.getSize(widthMeasureSpec);
        if (widthMode == Integer.MIN_VALUE) {
            int i2 = this.f۱۱۷۳۸b0;
            width = i2 > 0 ? Math.min(i2, width) : Math.min(getPreferredWidth(), width);
        } else if (widthMode == 0) {
            int i3 = this.f۱۱۷۳۸b0;
            if (i3 <= 0) {
                i3 = getPreferredWidth();
            }
            width = i3;
        } else if (widthMode == 1073741824 && (i = this.f۱۱۷۳۸b0) > 0) {
            width = Math.min(i, width);
        }
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int height = View.MeasureSpec.getSize(heightMeasureSpec);
        if (heightMode == Integer.MIN_VALUE) {
            height = Math.min(getPreferredHeight(), height);
        } else if (heightMode == 0) {
            height = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۷v7.widget.Co0
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            m۱۴۷۲۱a(this.f۱۱۷۵۴r, this.f۱۱۷۱۵B);
            Rect rect = this.f۱۱۷۱۶C;
            Rect rect2 = this.f۱۱۷۱۵B;
            rect.set(rect2.left, 0, rect2.right, bottom - top);
            Cp pVar = this.f۱۱۷۱۴A;
            if (pVar == null) {
                this.f۱۱۷۱۴A = new Cp(this.f۱۱۷۱۶C, this.f۱۱۷۱۵B, this.f۱۱۷۵۴r);
                setTouchDelegate(this.f۱۱۷۱۴A);
                return;
            }
            pVar.m۱۴۷۶۶a(this.f۱۱۷۱۶C, this.f۱۱۷۱۵B);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۷۲۱a(View view, Rect rect) {
        view.getLocationInWindow(this.f۱۱۷۱۷D);
        getLocationInWindow(this.f۱۱۷۱۸E);
        int[] iArr = this.f۱۱۷۱۷D;
        int i = iArr[1];
        int[] iArr2 = this.f۱۱۷۱۸E;
        int top = i - iArr2[1];
        int left = iArr[0] - iArr2[0];
        rect.set(left, top, view.getWidth() + left, view.getHeight() + top);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(Cd.abc_search_view_preferred_width);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(Cd.abc_search_view_preferred_height);
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۴۷۲۵b(boolean collapsed) {
        int iconVisibility;
        this.f۱۱۷۳۲S = collapsed;
        int i = 8;
        boolean z = false;
        int visCollapsed = collapsed ? 0 : 8;
        boolean hasText = !TextUtils.isEmpty(this.f۱۱۷۵۴r.getText());
        this.f۱۱۷۵۹v.setVisibility(visCollapsed);
        m۱۴۷۲۲a(hasText);
        View view = this.f۱۱۷۵۶s;
        if (!collapsed) {
            i = 0;
        }
        view.setVisibility(i);
        if (this.f۱۱۷۱۹F.getDrawable() == null || this.f۱۱۷۳۱R) {
            iconVisibility = 8;
        } else {
            iconVisibility = 0;
        }
        this.f۱۱۷۱۹F.setVisibility(iconVisibility);
        m۱۴۷۳۴q();
        if (!hasText) {
            z = true;
        }
        m۱۴۷۲۸c(z);
        m۱۴۷۳۷t();
    }

    /* renamed from: n  reason: contains not printable characters */
    private boolean m۱۴۷۳۱n() {
        SearchableInfo searchableInfo = this.f۱۱۷۴۴h0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent testIntent = null;
            if (this.f۱۱۷۴۴h0.getVoiceSearchLaunchWebSearch()) {
                testIntent = this.f۱۱۷۲۳J;
            } else if (this.f۱۱۷۴۴h0.getVoiceSearchLaunchRecognizer()) {
                testIntent = this.f۱۱۷۲۴K;
            }
            if (testIntent == null || getContext().getPackageManager().resolveActivity(testIntent, 65536) == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: o  reason: contains not printable characters */
    private boolean m۱۴۷۳۲o() {
        return (this.f۱۱۷۳۴U || this.f۱۱۷۳۹c0) && !m۱۴۷۴۹f();
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۷۲۲a(boolean hasText) {
        int visibility = 8;
        if (this.f۱۱۷۳۴U && m۱۴۷۳۲o() && hasFocus() && (hasText || !this.f۱۱۷۳۹c0)) {
            visibility = 0;
        }
        this.f۱۱۷۶۰w.setVisibility(visibility);
    }

    /* renamed from: t  reason: contains not printable characters */
    private void m۱۴۷۳۷t() {
        int visibility = 8;
        if (m۱۴۷۳۲o() && (this.f۱۱۷۶۰w.getVisibility() == 0 || this.f۱۱۷۶۲y.getVisibility() == 0)) {
            visibility = 0;
        }
        this.f۱۱۷۵۸u.setVisibility(visibility);
    }

    /* renamed from: q  reason: contains not printable characters */
    private void m۱۴۷۳۴q() {
        boolean showClose = true;
        boolean hasText = !TextUtils.isEmpty(this.f۱۱۷۵۴r.getText());
        int i = 0;
        if (!hasText && (!this.f۱۱۷۳۱R || this.f۱۱۷۴۲f0)) {
            showClose = false;
        }
        ImageView imageView = this.f۱۱۷۶۱x;
        if (!showClose) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable closeButtonImg = this.f۱۱۷۶۱x.getDrawable();
        if (closeButtonImg != null) {
            closeButtonImg.setState(hasText ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: p  reason: contains not printable characters */
    private void m۱۴۷۳۳p() {
        post(this.f۱۱۷۴۶j0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l  reason: contains not printable characters */
    public void m۱۴۷۵۵l() {
        int[] stateSet = this.f۱۱۷۵۴r.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable searchPlateBg = this.f۱۱۷۵۷t.getBackground();
        if (searchPlateBg != null) {
            searchPlateBg.setState(stateSet);
        }
        Drawable submitAreaBg = this.f۱۱۷۵۸u.getBackground();
        if (submitAreaBg != null) {
            submitAreaBg.setState(stateSet);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f۱۱۷۴۶j0);
        post(this.f۱۱۷۴۷k0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۷۳۹a(CharSequence queryText) {
        setQuery(queryText);
    }

    /* renamed from: android.support.v7.widget.SearchView$f  reason: invalid class name */
    class View$OnClickListenerCf implements View.OnClickListener {
        View$OnClickListenerCf() {
        }

        public void onClick(View v) {
            SearchView searchView = SearchView.this;
            if (v == searchView.f۱۱۷۵۹v) {
                searchView.m۱۴۷۵۱h();
            } else if (v == searchView.f۱۱۷۶۱x) {
                searchView.m۱۴۷۵۰g();
            } else if (v == searchView.f۱۱۷۶۰w) {
                searchView.m۱۴۷۵۲i();
            } else if (v == searchView.f۱۱۷۶۲y) {
                searchView.m۱۴۷۵۴k();
            } else if (v == searchView.f۱۱۷۵۴r) {
                searchView.m۱۴۷۴۸e();
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$g  reason: invalid class name */
    class View$OnKeyListenerCg implements View.OnKeyListener {
        View$OnKeyListenerCg() {
        }

        public boolean onKey(View v, int keyCode, KeyEvent event) {
            SearchView searchView = SearchView.this;
            if (searchView.f۱۱۷۴۴h0 == null) {
                return false;
            }
            if (searchView.f۱۱۷۵۴r.isPopupShowing() && SearchView.this.f۱۱۷۵۴r.getListSelection() != -1) {
                return SearchView.this.m۱۴۷۴۲a(v, keyCode, event);
            }
            if (SearchView.this.f۱۱۷۵۴r.m۱۴۷۵۶a() || !event.hasNoModifiers() || event.getAction() != 1 || keyCode != 66) {
                return false;
            }
            v.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m۱۴۷۳۸a(0, (String) null, searchView2.f۱۱۷۵۴r.getText().toString());
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۴۷۴۲a(View v, int keyCode, KeyEvent event) {
        int selPoint;
        if (this.f۱۱۷۴۴h0 != null && this.f۱۱۷۳۳T != null && event.getAction() == 0 && event.hasNoModifiers()) {
            if (keyCode == 66 || keyCode == 84 || keyCode == 61) {
                return m۱۴۷۴۱a(this.f۱۱۷۵۴r.getListSelection(), 0, (String) null);
            }
            if (keyCode == 21 || keyCode == 22) {
                if (keyCode == 21) {
                    selPoint = 0;
                } else {
                    selPoint = this.f۱۱۷۵۴r.length();
                }
                this.f۱۱۷۵۴r.setSelection(selPoint);
                this.f۱۱۷۵۴r.setListSelection(0);
                this.f۱۱۷۵۴r.clearListSelection();
                f۱۱۷۱۳s0.m۱۴۷۵۹a(this.f۱۱۷۵۴r, true);
                return true;
            } else if (keyCode != 19 || this.f۱۱۷۵۴r.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: c  reason: contains not printable characters */
    private CharSequence m۱۴۷۲۷c(CharSequence hintText) {
        if (!this.f۱۱۷۳۱R || this.f۱۱۷۲۰G == null) {
            return hintText;
        }
        double textSize = (double) this.f۱۱۷۵۴r.getTextSize();
        Double.isNaN(textSize);
        int textSize2 = (int) (textSize * 1.25d);
        this.f۱۱۷۲۰G.setBounds(0, 0, textSize2, textSize2);
        SpannableStringBuilder ssb = new SpannableStringBuilder("   ");
        ssb.setSpan(new ImageSpan(this.f۱۱۷۲۰G), 1, 2, 33);
        ssb.append(hintText);
        return ssb;
    }

    /* renamed from: r  reason: contains not printable characters */
    private void m۱۴۷۳۵r() {
        CharSequence hint = getQueryHint();
        this.f۱۱۷۵۴r.setHint(m۱۴۷۲۷c(hint == null ? "" : hint));
    }

    /* renamed from: s  reason: contains not printable characters */
    private void m۱۴۷۳۶s() {
        this.f۱۱۷۵۴r.setThreshold(this.f۱۱۷۴۴h0.getSuggestThreshold());
        this.f۱۱۷۵۴r.setImeOptions(this.f۱۱۷۴۴h0.getImeOptions());
        int inputType = this.f۱۱۷۴۴h0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f۱۱۷۴۴h0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f۱۱۷۵۴r.setInputType(inputType);
        AbstractCd dVar = this.f۱۱۷۳۳T;
        if (dVar != null) {
            dVar.m۱۳۲۳۲b(null);
        }
        if (this.f۱۱۷۴۴h0.getSuggestAuthority() != null) {
            this.f۱۱۷۳۳T = new View$OnClickListenerCd1(getContext(), this, this.f۱۱۷۴۴h0, this.f۱۱۷۴۸l0);
            this.f۱۱۷۵۴r.setAdapter(this.f۱۱۷۳۳T);
            View$OnClickListenerCd1 d1Var = (View$OnClickListenerCd1) this.f۱۱۷۳۳T;
            if (this.f۱۱۷۳۶W) {
                i = 2;
            }
            d1Var.m۱۵۱۷۷a(i);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۴۷۲۸c(boolean empty) {
        int visibility = 8;
        if (this.f۱۱۷۳۹c0 && !m۱۴۷۴۹f() && empty) {
            visibility = 0;
            this.f۱۱۷۶۰w.setVisibility(8);
        }
        this.f۱۱۷۶۲y.setVisibility(visibility);
    }

    /* renamed from: android.support.v7.widget.SearchView$h  reason: invalid class name */
    class Ch implements TextView.OnEditorActionListener {
        Ch() {
        }

        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            SearchView.this.m۱۴۷۵۲i();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۷۴۴b(CharSequence newText) {
        CharSequence text = this.f۱۱۷۵۴r.getText();
        this.f۱۱۷۴۱e0 = text;
        boolean z = true;
        boolean hasText = !TextUtils.isEmpty(text);
        m۱۴۷۲۲a(hasText);
        if (hasText) {
            z = false;
        }
        m۱۴۷۲۸c(z);
        m۱۴۷۳۴q();
        m۱۴۷۳۷t();
        if (this.f۱۱۷۲۶M != null && !TextUtils.equals(newText, this.f۱۱۷۴۰d0)) {
            this.f۱۱۷۲۶M.m۱۴۷۶۲a(newText.toString());
        }
        this.f۱۱۷۴۰d0 = newText.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i  reason: contains not printable characters */
    public void m۱۴۷۵۲i() {
        CharSequence query = this.f۱۱۷۵۴r.getText();
        if (query != null && TextUtils.getTrimmedLength(query) > 0) {
            AbstractCm mVar = this.f۱۱۷۲۶M;
            if (mVar == null || !mVar.m۱۴۷۶۳b(query.toString())) {
                if (this.f۱۱۷۴۴h0 != null) {
                    m۱۴۷۳۸a(0, (String) null, query.toString());
                }
                this.f۱۱۷۵۴r.setImeVisibility(false);
                m۱۴۷۳۰m();
            }
        }
    }

    /* renamed from: m  reason: contains not printable characters */
    private void m۱۴۷۳۰m() {
        this.f۱۱۷۵۴r.dismissDropDown();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public void m۱۴۷۵۰g() {
        if (!TextUtils.isEmpty(this.f۱۱۷۵۴r.getText())) {
            this.f۱۱۷۵۴r.setText("");
            this.f۱۱۷۵۴r.requestFocus();
            this.f۱۱۷۵۴r.setImeVisibility(true);
        } else if (this.f۱۱۷۳۱R) {
            AbstractCl lVar = this.f۱۱۷۲۷N;
            if (lVar == null || !lVar.m۱۴۷۶۱a()) {
                clearFocus();
                m۱۴۷۲۵b(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h  reason: contains not printable characters */
    public void m۱۴۷۵۱h() {
        m۱۴۷۲۵b(false);
        this.f۱۱۷۵۴r.requestFocus();
        this.f۱۱۷۵۴r.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f۱۱۷۳۰Q;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k  reason: contains not printable characters */
    public void m۱۴۷۵۴k() {
        if (this.f۱۱۷۴۴h0 != null) {
            SearchableInfo searchable = this.f۱۱۷۴۴h0;
            try {
                if (searchable.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(m۱۴۷۲۴b(this.f۱۱۷۲۳J, searchable));
                } else if (searchable.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(m۱۴۷۱۷a(this.f۱۱۷۲۴K, searchable));
                }
            } catch (ActivityNotFoundException e) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j  reason: contains not printable characters */
    public void m۱۴۷۵۳j() {
        m۱۴۷۲۵b(m۱۴۷۴۹f());
        m۱۴۷۳۳p();
        if (this.f۱۱۷۵۴r.hasFocus()) {
            m۱۴۷۴۸e();
        }
    }

    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        m۱۴۷۳۳p();
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCc
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۴۷۴۵c() {
        m۱۴۷۴۰a("", false);
        clearFocus();
        m۱۴۷۲۵b(true);
        this.f۱۱۷۵۴r.setImeOptions(this.f۱۱۷۴۳g0);
        this.f۱۱۷۴۲f0 = false;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCc
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۷۴۳b() {
        if (!this.f۱۱۷۴۲f0) {
            this.f۱۱۷۴۲f0 = true;
            this.f۱۱۷۴۳g0 = this.f۱۱۷۵۴r.getImeOptions();
            this.f۱۱۷۵۴r.setImeOptions(this.f۱۱۷۴۳g0 | 33554432);
            this.f۱۱۷۵۴r.setText("");
            setIconified(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.SearchView$o  reason: invalid class name */
    public static class Co extends AbstractCa {
        public static final Parcelable.Creator<Co> CREATOR = new Ca();

        /* renamed from: e  reason: contains not printable characters */
        boolean f۱۱۷۸۲e;

        Co(Parcelable superState) {
            super(superState);
        }

        public Co(Parcel source, ClassLoader loader) {
            super(source, loader);
            this.f۱۱۷۸۲e = ((Boolean) source.readValue(null)).booleanValue();
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCa
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeValue(Boolean.valueOf(this.f۱۱۷۸۲e));
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f۱۱۷۸۲e + "}";
        }

        /* renamed from: android.support.v7.widget.SearchView$o$a  reason: invalid class name */
        static class Ca implements Parcelable.ClassLoaderCreator<Co> {
            Ca() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public Co createFromParcel(Parcel in, ClassLoader loader) {
                return new Co(in, loader);
            }

            @Override // android.os.Parcelable.Creator
            public Co createFromParcel(Parcel in) {
                return new Co(in, null);
            }

            @Override // android.os.Parcelable.Creator
            public Co[] newArray(int size) {
                return new Co[size];
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Co ss = new Co(super.onSaveInstanceState());
        ss.f۱۱۷۸۲e = m۱۴۷۴۹f();
        return ss;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof Co)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Co ss = (Co) state;
        super.onRestoreInstanceState(ss.m۱۲۷۹۱a());
        m۱۴۷۲۵b(ss.f۱۱۷۸۲e);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۴۷۴۶d() {
        int offset;
        if (this.f۱۱۷۶۳z.getWidth() > 1) {
            Resources res = getContext().getResources();
            int anchorPadding = this.f۱۱۷۵۷t.getPaddingLeft();
            Rect dropDownPadding = new Rect();
            boolean isLayoutRtl = Cr1.m۱۵۵۶۷a(this);
            int iconOffset = this.f۱۱۷۳۱R ? res.getDimensionPixelSize(Cd.abc_dropdownitem_icon_width) + res.getDimensionPixelSize(Cd.abc_dropdownitem_text_padding_left) : 0;
            this.f۱۱۷۵۴r.getDropDownBackground().getPadding(dropDownPadding);
            if (isLayoutRtl) {
                offset = -dropDownPadding.left;
            } else {
                offset = anchorPadding - (dropDownPadding.left + iconOffset);
            }
            this.f۱۱۷۵۴r.setDropDownHorizontalOffset(offset);
            this.f۱۱۷۵۴r.setDropDownWidth((((this.f۱۱۷۶۳z.getWidth() + dropDownPadding.left) + dropDownPadding.right) + iconOffset) - anchorPadding);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۴۷۴۱a(int position, int actionKey, String actionMsg) {
        AbstractCn nVar = this.f۱۱۷۲۹P;
        if (nVar != null && nVar.m۱۴۷۶۵b(position)) {
            return false;
        }
        m۱۴۷۲۶b(position, 0, null);
        this.f۱۱۷۵۴r.setImeVisibility(false);
        m۱۴۷۳۰m();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۴۷۴۷d(int position) {
        AbstractCn nVar = this.f۱۱۷۲۹P;
        if (nVar != null && nVar.m۱۴۷۶۴a(position)) {
            return false;
        }
        m۱۴۷۲۹e(position);
        return true;
    }

    /* renamed from: android.support.v7.widget.SearchView$i  reason: invalid class name */
    class Ci implements AdapterView.OnItemClickListener {
        Ci() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            SearchView.this.m۱۴۷۴۱a(position, 0, (String) null);
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$j  reason: invalid class name */
    class Cj implements AdapterView.OnItemSelectedListener {
        Cj() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
            SearchView.this.m۱۴۷۴۷d(position);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۴۷۲۹e(int position) {
        CharSequence oldQuery = this.f۱۱۷۵۴r.getText();
        Cursor c = this.f۱۱۷۳۳T.m۱۳۲۲۵a();
        if (c != null) {
            if (c.moveToPosition(position)) {
                CharSequence newQuery = this.f۱۱۷۳۳T.m۱۳۲۲۷a(c);
                if (newQuery != null) {
                    setQuery(newQuery);
                } else {
                    setQuery(oldQuery);
                }
            } else {
                setQuery(oldQuery);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۴۷۲۶b(int position, int actionKey, String actionMsg) {
        Cursor c = this.f۱۱۷۳۳T.m۱۳۲۲۵a();
        if (c == null || !c.moveToPosition(position)) {
            return false;
        }
        m۱۴۷۲۰a(m۱۴۷۱۸a(c, actionKey, actionMsg));
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۷۲۰a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException ex) {
                Log.e("SearchView", "Failed launch activity: " + intent, ex);
            }
        }
    }

    private void setQuery(CharSequence query) {
        this.f۱۱۷۵۴r.setText(query);
        this.f۱۱۷۵۴r.setSelection(TextUtils.isEmpty(query) ? 0 : query.length());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۷۳۸a(int actionKey, String actionMsg, String query) {
        getContext().startActivity(m۱۴۷۱۹a("android.intent.action.SEARCH", (Uri) null, (String) null, query, actionKey, actionMsg));
    }

    /* renamed from: a  reason: contains not printable characters */
    private Intent m۱۴۷۱۹a(String action, Uri data, String extraData, String query, int actionKey, String actionMsg) {
        Intent intent = new Intent(action);
        intent.addFlags(268435456);
        if (data != null) {
            intent.setData(data);
        }
        intent.putExtra("user_query", this.f۱۱۷۴۱e0);
        if (query != null) {
            intent.putExtra("query", query);
        }
        if (extraData != null) {
            intent.putExtra("intent_extra_data_key", extraData);
        }
        Bundle bundle = this.f۱۱۷۴۵i0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (actionKey != 0) {
            intent.putExtra("action_key", actionKey);
            intent.putExtra("action_msg", actionMsg);
        }
        intent.setComponent(this.f۱۱۷۴۴h0.getSearchActivity());
        return intent;
    }

    /* renamed from: b  reason: contains not printable characters */
    private Intent m۱۴۷۲۴b(Intent baseIntent, SearchableInfo searchable) {
        String str;
        Intent voiceIntent = new Intent(baseIntent);
        ComponentName searchActivity = searchable.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        voiceIntent.putExtra("calling_package", str);
        return voiceIntent;
    }

    /* renamed from: a  reason: contains not printable characters */
    private Intent m۱۴۷۱۷a(Intent baseIntent, SearchableInfo searchable) {
        String str;
        ComponentName searchActivity = searchable.getSearchActivity();
        Intent queryIntent = new Intent("android.intent.action.SEARCH");
        queryIntent.setComponent(searchActivity);
        PendingIntent pending = PendingIntent.getActivity(getContext(), 0, queryIntent, 1073741824);
        Bundle queryExtras = new Bundle();
        Bundle bundle = this.f۱۱۷۴۵i0;
        if (bundle != null) {
            queryExtras.putParcelable("app_data", bundle);
        }
        Intent voiceIntent = new Intent(baseIntent);
        String languageModel = "free_form";
        String prompt = null;
        String language = null;
        int maxResults = 1;
        Resources resources = getResources();
        if (searchable.getVoiceLanguageModeId() != 0) {
            languageModel = resources.getString(searchable.getVoiceLanguageModeId());
        }
        if (searchable.getVoicePromptTextId() != 0) {
            prompt = resources.getString(searchable.getVoicePromptTextId());
        }
        if (searchable.getVoiceLanguageId() != 0) {
            language = resources.getString(searchable.getVoiceLanguageId());
        }
        if (searchable.getVoiceMaxResults() != 0) {
            maxResults = searchable.getVoiceMaxResults();
        }
        voiceIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", languageModel);
        voiceIntent.putExtra("android.speech.extra.PROMPT", prompt);
        voiceIntent.putExtra("android.speech.extra.LANGUAGE", language);
        voiceIntent.putExtra("android.speech.extra.MAX_RESULTS", maxResults);
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        voiceIntent.putExtra("calling_package", str);
        voiceIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", pending);
        voiceIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", queryExtras);
        return voiceIntent;
    }

    /* renamed from: a  reason: contains not printable characters */
    private Intent m۱۴۷۱۸a(Cursor c, int actionKey, String actionMsg) {
        int rowNum;
        String data;
        String id;
        try {
            String action = View$OnClickListenerCd1.m۱۵۱۶۱a(c, "suggest_intent_action");
            if (action == null) {
                action = this.f۱۱۷۴۴h0.getSuggestIntentAction();
            }
            if (action == null) {
                action = "android.intent.action.SEARCH";
            }
            String data2 = View$OnClickListenerCd1.m۱۵۱۶۱a(c, "suggest_intent_data");
            if (data2 == null) {
                data2 = this.f۱۱۷۴۴h0.getSuggestIntentData();
            }
            if (data2 == null || (id = View$OnClickListenerCd1.m۱۵۱۶۱a(c, "suggest_intent_data_id")) == null) {
                data = data2;
            } else {
                data = data2 + "/" + Uri.encode(id);
            }
            return m۱۴۷۱۹a(action, data == null ? null : Uri.parse(data), View$OnClickListenerCd1.m۱۵۱۶۱a(c, "suggest_intent_extra_data"), View$OnClickListenerCd1.m۱۵۱۶۱a(c, "suggest_intent_query"), actionKey, actionMsg);
        } catch (RuntimeException e) {
            try {
                rowNum = c.getPosition();
            } catch (RuntimeException e2) {
                rowNum = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + rowNum + " returned exception.", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۴۷۴۸e() {
        f۱۱۷۱۳s0.m۱۴۷۶۰b(this.f۱۱۷۵۴r);
        f۱۱۷۱۳s0.m۱۴۷۵۸a(this.f۱۱۷۵۴r);
    }

    /* renamed from: a  reason: contains not printable characters */
    static boolean m۱۴۷۲۳a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: android.support.v7.widget.SearchView$a  reason: invalid class name */
    class Ca implements TextWatcher {
        Ca() {
        }

        public void beforeTextChanged(CharSequence s, int start, int before, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int after) {
            SearchView.this.m۱۴۷۴۴b(s);
        }

        public void afterTextChanged(Editable s) {
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$p  reason: invalid class name */
    private static class Cp extends TouchDelegate {

        /* renamed from: a  reason: contains not printable characters */
        private final View f۱۱۷۸۳a;

        /* renamed from: b  reason: contains not printable characters */
        private final Rect f۱۱۷۸۴b = new Rect();

        /* renamed from: c  reason: contains not printable characters */
        private final Rect f۱۱۷۸۵c = new Rect();

        /* renamed from: d  reason: contains not printable characters */
        private final Rect f۱۱۷۸۶d = new Rect();

        /* renamed from: e  reason: contains not printable characters */
        private final int f۱۱۷۸۷e;

        /* renamed from: f  reason: contains not printable characters */
        private boolean f۱۱۷۸۸f;

        public Cp(Rect targetBounds, Rect actualBounds, View delegateView) {
            super(targetBounds, delegateView);
            this.f۱۱۷۸۷e = ViewConfiguration.get(delegateView.getContext()).getScaledTouchSlop();
            m۱۴۷۶۶a(targetBounds, actualBounds);
            this.f۱۱۷۸۳a = delegateView;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۷۶۶a(Rect desiredBounds, Rect actualBounds) {
            this.f۱۱۷۸۴b.set(desiredBounds);
            this.f۱۱۷۸۶d.set(desiredBounds);
            Rect rect = this.f۱۱۷۸۶d;
            int i = this.f۱۱۷۸۷e;
            rect.inset(-i, -i);
            this.f۱۱۷۸۵c.set(actualBounds);
        }

        public boolean onTouchEvent(MotionEvent event) {
            int x = (int) event.getX();
            int y = (int) event.getY();
            boolean sendToDelegate = false;
            boolean hit = true;
            int action = event.getAction();
            if (action != 0) {
                if (action == 1 || action == 2) {
                    sendToDelegate = this.f۱۱۷۸۸f;
                    if (sendToDelegate && !this.f۱۱۷۸۶d.contains(x, y)) {
                        hit = false;
                    }
                } else if (action == 3) {
                    sendToDelegate = this.f۱۱۷۸۸f;
                    this.f۱۱۷۸۸f = false;
                }
            } else if (this.f۱۱۷۸۴b.contains(x, y)) {
                this.f۱۱۷۸۸f = true;
                sendToDelegate = true;
            }
            if (!sendToDelegate) {
                return false;
            }
            if (!hit || this.f۱۱۷۸۵c.contains(x, y)) {
                Rect rect = this.f۱۱۷۸۵c;
                event.setLocation((float) (x - rect.left), (float) (y - rect.top));
            } else {
                event.setLocation((float) (this.f۱۱۷۸۳a.getWidth() / 2), (float) (this.f۱۱۷۸۳a.getHeight() / 2));
            }
            return this.f۱۱۷۸۳a.dispatchTouchEvent(event);
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete */
    public static class SearchAutoComplete extends Ce {

        /* renamed from: f  reason: contains not printable characters */
        private int f۱۱۷۶۴f;

        /* renamed from: g  reason: contains not printable characters */
        private SearchView f۱۱۷۶۵g;

        /* renamed from: h  reason: contains not printable characters */
        private boolean f۱۱۷۶۶h;

        /* renamed from: i  reason: contains not printable characters */
        final Runnable f۱۱۷۶۷i;

        /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete$a  reason: invalid class name */
        class RunnableCa implements Runnable {
            RunnableCa() {
            }

            public void run() {
                SearchAutoComplete.this.m۱۴۷۵۷b();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attrs) {
            this(context, attrs, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
            this.f۱۱۷۶۷i = new RunnableCa();
            this.f۱۱۷۶۴f = getThreshold();
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f۱۱۷۶۵g = searchView;
        }

        public void setThreshold(int threshold) {
            super.setThreshold(threshold);
            this.f۱۱۷۶۴f = threshold;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۷۵۶a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence text) {
        }

        public void performCompletion() {
        }

        public void onWindowFocusChanged(boolean hasWindowFocus) {
            super.onWindowFocusChanged(hasWindowFocus);
            if (hasWindowFocus && this.f۱۱۷۶۵g.hasFocus() && getVisibility() == 0) {
                this.f۱۱۷۶۶h = true;
                if (SearchView.m۱۴۷۲۳a(getContext())) {
                    SearchView.f۱۱۷۱۳s0.m۱۴۷۵۹a(this, true);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
            super.onFocusChanged(focused, direction, previouslyFocusedRect);
            this.f۱۱۷۶۵g.m۱۴۷۵۳j();
        }

        public boolean enoughToFilter() {
            return this.f۱۱۷۶۴f <= 0 || super.enoughToFilter();
        }

        public boolean onKeyPreIme(int keyCode, KeyEvent event) {
            if (keyCode == 4) {
                if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState state = getKeyDispatcherState();
                    if (state != null) {
                        state.startTracking(event, this);
                    }
                    return true;
                } else if (event.getAction() == 1) {
                    KeyEvent.DispatcherState state2 = getKeyDispatcherState();
                    if (state2 != null) {
                        state2.handleUpEvent(event);
                    }
                    if (event.isTracking() && !event.isCanceled()) {
                        this.f۱۱۷۶۵g.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(keyCode, event);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration config = getResources().getConfiguration();
            int widthDp = config.screenWidthDp;
            int heightDp = config.screenHeightDp;
            if (widthDp >= 960 && heightDp >= 720 && config.orientation == 2) {
                return 256;
            }
            if (widthDp >= 600) {
                return 192;
            }
            if (widthDp < 640 || heightDp < 480) {
                return 160;
            }
            return 192;
        }

        @Override // android.support.p۰۴۷v7.widget.Ce
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection ic = super.onCreateInputConnection(editorInfo);
            if (this.f۱۱۷۶۶h) {
                removeCallbacks(this.f۱۱۷۶۷i);
                post(this.f۱۱۷۶۷i);
            }
            return ic;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۷۵۷b() {
            if (this.f۱۱۷۶۶h) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f۱۱۷۶۶h = false;
            }
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean visible) {
            InputMethodManager imm = (InputMethodManager) getContext().getSystemService("input_method");
            if (!visible) {
                this.f۱۱۷۶۶h = false;
                removeCallbacks(this.f۱۱۷۶۷i);
                imm.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (imm.isActive(this)) {
                this.f۱۱۷۶۶h = false;
                removeCallbacks(this.f۱۱۷۶۷i);
                imm.showSoftInput(this, 0);
            } else {
                this.f۱۱۷۶۶h = true;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.SearchView$k  reason: invalid class name */
    public static class Ck {

        /* renamed from: a  reason: contains not printable characters */
        private Method f۱۱۷۷۹a;

        /* renamed from: b  reason: contains not printable characters */
        private Method f۱۱۷۸۰b;

        /* renamed from: c  reason: contains not printable characters */
        private Method f۱۱۷۸۱c;

        Ck() {
            try {
                this.f۱۱۷۷۹a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f۱۱۷۷۹a.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            try {
                this.f۱۱۷۸۰b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f۱۱۷۸۰b.setAccessible(true);
            } catch (NoSuchMethodException e2) {
            }
            try {
                this.f۱۱۷۸۱c = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f۱۱۷۸۱c.setAccessible(true);
            } catch (NoSuchMethodException e3) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۷۶۰b(AutoCompleteTextView view) {
            Method method = this.f۱۱۷۷۹a;
            if (method != null) {
                try {
                    method.invoke(view, new Object[0]);
                } catch (Exception e) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۷۵۸a(AutoCompleteTextView view) {
            Method method = this.f۱۱۷۸۰b;
            if (method != null) {
                try {
                    method.invoke(view, new Object[0]);
                } catch (Exception e) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۷۵۹a(AutoCompleteTextView view, boolean visible) {
            Method method = this.f۱۱۷۸۱c;
            if (method != null) {
                try {
                    method.invoke(view, Boolean.valueOf(visible));
                } catch (Exception e) {
                }
            }
        }
    }
}
