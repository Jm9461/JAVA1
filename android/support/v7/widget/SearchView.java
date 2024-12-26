package android.support.v7.widget;

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
import android.support.v4.view.u;
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

public class SearchView extends o0 implements a.b.h.f.c {
    static final k s0 = new k();
    private p A;
    private Rect B;
    private Rect C;
    private int[] D;
    private int[] E;
    private final ImageView F;
    private final Drawable G;
    private final int H;
    private final int I;
    private final Intent J;
    private final Intent K;
    private final CharSequence L;
    private m M;
    private l N;
    View.OnFocusChangeListener O;
    private n P;
    private View.OnClickListener Q;
    private boolean R;
    private boolean S;
    android.support.v4.widget.d T;
    private boolean U;
    private CharSequence V;
    private boolean W;
    private boolean a0;
    private int b0;
    private boolean c0;
    private CharSequence d0;
    private CharSequence e0;
    private boolean f0;
    private int g0;
    SearchableInfo h0;
    private Bundle i0;
    private final Runnable j0;
    private Runnable k0;
    private final WeakHashMap<String, Drawable.ConstantState> l0;
    private final View.OnClickListener m0;
    View.OnKeyListener n0;
    private final TextView.OnEditorActionListener o0;
    private final AdapterView.OnItemClickListener p0;
    private final AdapterView.OnItemSelectedListener q0;
    final SearchAutoComplete r;
    private TextWatcher r0;
    private final View s;
    private final View t;
    private final View u;
    final ImageView v;
    final ImageView w;
    final ImageView x;
    final ImageView y;
    private final View z;

    public interface l {
        boolean a();
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
        boolean a(int i);

        boolean b(int i);
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            SearchView.this.l();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            android.support.v4.widget.d dVar = SearchView.this.T;
            if (dVar != null && (dVar instanceof d1)) {
                dVar.b(null);
            }
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attrs) {
        this(context, attrs, a.b.h.a.a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.B = new Rect();
        this.C = new Rect();
        this.D = new int[2];
        this.E = new int[2];
        this.j0 = new b();
        this.k0 = new c();
        this.l0 = new WeakHashMap<>();
        this.m0 = new f();
        this.n0 = new g();
        this.o0 = new h();
        this.p0 = new i();
        this.q0 = new j();
        this.r0 = new a();
        j1 a2 = j1.a(context, attrs, a.b.h.a.j.SearchView, defStyleAttr, 0);
        LayoutInflater.from(context).inflate(a2.g(a.b.h.a.j.SearchView_layout, a.b.h.a.g.abc_search_view), (ViewGroup) this, true);
        this.r = (SearchAutoComplete) findViewById(a.b.h.a.f.search_src_text);
        this.r.setSearchView(this);
        this.s = findViewById(a.b.h.a.f.search_edit_frame);
        this.t = findViewById(a.b.h.a.f.search_plate);
        this.u = findViewById(a.b.h.a.f.submit_area);
        this.v = (ImageView) findViewById(a.b.h.a.f.search_button);
        this.w = (ImageView) findViewById(a.b.h.a.f.search_go_btn);
        this.x = (ImageView) findViewById(a.b.h.a.f.search_close_btn);
        this.y = (ImageView) findViewById(a.b.h.a.f.search_voice_btn);
        this.F = (ImageView) findViewById(a.b.h.a.f.search_mag_icon);
        u.a(this.t, a2.b(a.b.h.a.j.SearchView_queryBackground));
        u.a(this.u, a2.b(a.b.h.a.j.SearchView_submitBackground));
        this.v.setImageDrawable(a2.b(a.b.h.a.j.SearchView_searchIcon));
        this.w.setImageDrawable(a2.b(a.b.h.a.j.SearchView_goIcon));
        this.x.setImageDrawable(a2.b(a.b.h.a.j.SearchView_closeIcon));
        this.y.setImageDrawable(a2.b(a.b.h.a.j.SearchView_voiceIcon));
        this.F.setImageDrawable(a2.b(a.b.h.a.j.SearchView_searchIcon));
        this.G = a2.b(a.b.h.a.j.SearchView_searchHintIcon);
        l1.a(this.v, getResources().getString(a.b.h.a.h.abc_searchview_description_search));
        this.H = a2.g(a.b.h.a.j.SearchView_suggestionRowLayout, a.b.h.a.g.abc_search_dropdown_item_icons_2line);
        this.I = a2.g(a.b.h.a.j.SearchView_commitIcon, 0);
        this.v.setOnClickListener(this.m0);
        this.x.setOnClickListener(this.m0);
        this.w.setOnClickListener(this.m0);
        this.y.setOnClickListener(this.m0);
        this.r.setOnClickListener(this.m0);
        this.r.addTextChangedListener(this.r0);
        this.r.setOnEditorActionListener(this.o0);
        this.r.setOnItemClickListener(this.p0);
        this.r.setOnItemSelectedListener(this.q0);
        this.r.setOnKeyListener(this.n0);
        this.r.setOnFocusChangeListener(new d());
        setIconifiedByDefault(a2.a(a.b.h.a.j.SearchView_iconifiedByDefault, true));
        int maxWidth = a2.c(a.b.h.a.j.SearchView_android_maxWidth, -1);
        if (maxWidth != -1) {
            setMaxWidth(maxWidth);
        }
        this.L = a2.e(a.b.h.a.j.SearchView_defaultQueryHint);
        this.V = a2.e(a.b.h.a.j.SearchView_queryHint);
        int imeOptions = a2.d(a.b.h.a.j.SearchView_android_imeOptions, -1);
        if (imeOptions != -1) {
            setImeOptions(imeOptions);
        }
        int inputType = a2.d(a.b.h.a.j.SearchView_android_inputType, -1);
        if (inputType != -1) {
            setInputType(inputType);
        }
        setFocusable(a2.a(a.b.h.a.j.SearchView_android_focusable, true));
        a2.a();
        this.J = new Intent("android.speech.action.WEB_SEARCH");
        this.J.addFlags(268435456);
        this.J.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.K = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.K.addFlags(268435456);
        this.z = findViewById(this.r.getDropDownAnchor());
        View view = this.z;
        if (view != null) {
            view.addOnLayoutChangeListener(new e());
        }
        b(this.R);
        r();
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        public void onFocusChange(View v, boolean hasFocus) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.O;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, hasFocus);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            SearchView.this.d();
        }
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.H;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.I;
    }

    public void setSearchableInfo(SearchableInfo searchable) {
        this.h0 = searchable;
        if (this.h0 != null) {
            s();
            r();
        }
        this.c0 = n();
        if (this.c0) {
            this.r.setPrivateImeOptions("nm");
        }
        b(f());
    }

    public void setAppSearchData(Bundle appSearchData) {
        this.i0 = appSearchData;
    }

    public void setImeOptions(int imeOptions) {
        this.r.setImeOptions(imeOptions);
    }

    public int getImeOptions() {
        return this.r.getImeOptions();
    }

    public void setInputType(int inputType) {
        this.r.setInputType(inputType);
    }

    public int getInputType() {
        return this.r.getInputType();
    }

    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        if (this.a0 || !isFocusable()) {
            return false;
        }
        if (f()) {
            return super.requestFocus(direction, previouslyFocusedRect);
        }
        boolean result = this.r.requestFocus(direction, previouslyFocusedRect);
        if (result) {
            b(false);
        }
        return result;
    }

    public void clearFocus() {
        this.a0 = true;
        super.clearFocus();
        this.r.clearFocus();
        this.r.setImeVisibility(false);
        this.a0 = false;
    }

    public void setOnQueryTextListener(m listener) {
        this.M = listener;
    }

    public void setOnCloseListener(l listener) {
        this.N = listener;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener listener) {
        this.O = listener;
    }

    public void setOnSuggestionListener(n listener) {
        this.P = listener;
    }

    public void setOnSearchClickListener(View.OnClickListener listener) {
        this.Q = listener;
    }

    public CharSequence getQuery() {
        return this.r.getText();
    }

    public void a(CharSequence query, boolean submit) {
        this.r.setText(query);
        if (query != null) {
            SearchAutoComplete searchAutoComplete = this.r;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.e0 = query;
        }
        if (submit && !TextUtils.isEmpty(query)) {
            i();
        }
    }

    public void setQueryHint(CharSequence hint) {
        this.V = hint;
        r();
    }

    public CharSequence getQueryHint() {
        if (this.V != null) {
            return this.V;
        }
        SearchableInfo searchableInfo = this.h0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.L;
        }
        return getContext().getText(this.h0.getHintId());
    }

    public void setIconifiedByDefault(boolean iconified) {
        if (this.R != iconified) {
            this.R = iconified;
            b(iconified);
            r();
        }
    }

    public void setIconified(boolean iconify) {
        if (iconify) {
            g();
        } else {
            h();
        }
    }

    public boolean f() {
        return this.S;
    }

    public void setSubmitButtonEnabled(boolean enabled) {
        this.U = enabled;
        b(f());
    }

    public void setQueryRefinementEnabled(boolean enable) {
        this.W = enable;
        android.support.v4.widget.d dVar = this.T;
        if (dVar instanceof d1) {
            ((d1) dVar).a(enable ? 2 : 1);
        }
    }

    public void setSuggestionsAdapter(android.support.v4.widget.d adapter) {
        this.T = adapter;
        this.r.setAdapter(this.T);
    }

    public android.support.v4.widget.d getSuggestionsAdapter() {
        return this.T;
    }

    public void setMaxWidth(int maxpixels) {
        this.b0 = maxpixels;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.b0;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v7.widget.o0
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i2;
        if (f()) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int width = View.MeasureSpec.getSize(widthMeasureSpec);
        if (widthMode == Integer.MIN_VALUE) {
            int i3 = this.b0;
            width = i3 > 0 ? Math.min(i3, width) : Math.min(getPreferredWidth(), width);
        } else if (widthMode == 0) {
            int i4 = this.b0;
            if (i4 <= 0) {
                i4 = getPreferredWidth();
            }
            width = i4;
        } else if (widthMode == 1073741824 && (i2 = this.b0) > 0) {
            width = Math.min(i2, width);
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
    @Override // android.support.v7.widget.o0
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            a(this.r, this.B);
            Rect rect = this.C;
            Rect rect2 = this.B;
            rect.set(rect2.left, 0, rect2.right, bottom - top);
            p pVar = this.A;
            if (pVar == null) {
                this.A = new p(this.C, this.B, this.r);
                setTouchDelegate(this.A);
                return;
            }
            pVar.a(this.C, this.B);
        }
    }

    private void a(View view, Rect rect) {
        view.getLocationInWindow(this.D);
        getLocationInWindow(this.E);
        int[] iArr = this.D;
        int i2 = iArr[1];
        int[] iArr2 = this.E;
        int top = i2 - iArr2[1];
        int left = iArr[0] - iArr2[0];
        rect.set(left, top, view.getWidth() + left, view.getHeight() + top);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(a.b.h.a.d.abc_search_view_preferred_width);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(a.b.h.a.d.abc_search_view_preferred_height);
    }

    private void b(boolean collapsed) {
        int iconVisibility;
        this.S = collapsed;
        int i2 = 8;
        boolean z2 = false;
        int visCollapsed = collapsed ? 0 : 8;
        boolean hasText = !TextUtils.isEmpty(this.r.getText());
        this.v.setVisibility(visCollapsed);
        a(hasText);
        View view = this.s;
        if (!collapsed) {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (this.F.getDrawable() == null || this.R) {
            iconVisibility = 8;
        } else {
            iconVisibility = 0;
        }
        this.F.setVisibility(iconVisibility);
        q();
        if (!hasText) {
            z2 = true;
        }
        c(z2);
        t();
    }

    private boolean n() {
        SearchableInfo searchableInfo = this.h0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent testIntent = null;
            if (this.h0.getVoiceSearchLaunchWebSearch()) {
                testIntent = this.J;
            } else if (this.h0.getVoiceSearchLaunchRecognizer()) {
                testIntent = this.K;
            }
            if (testIntent == null || getContext().getPackageManager().resolveActivity(testIntent, 65536) == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean o() {
        return (this.U || this.c0) && !f();
    }

    private void a(boolean hasText) {
        int visibility = 8;
        if (this.U && o() && hasFocus() && (hasText || !this.c0)) {
            visibility = 0;
        }
        this.w.setVisibility(visibility);
    }

    private void t() {
        int visibility = 8;
        if (o() && (this.w.getVisibility() == 0 || this.y.getVisibility() == 0)) {
            visibility = 0;
        }
        this.u.setVisibility(visibility);
    }

    private void q() {
        boolean showClose = true;
        boolean hasText = !TextUtils.isEmpty(this.r.getText());
        int i2 = 0;
        if (!hasText && (!this.R || this.f0)) {
            showClose = false;
        }
        ImageView imageView = this.x;
        if (!showClose) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable closeButtonImg = this.x.getDrawable();
        if (closeButtonImg != null) {
            closeButtonImg.setState(hasText ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void p() {
        post(this.j0);
    }

    /* access modifiers changed from: package-private */
    public void l() {
        int[] stateSet = this.r.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable searchPlateBg = this.t.getBackground();
        if (searchPlateBg != null) {
            searchPlateBg.setState(stateSet);
        }
        Drawable submitAreaBg = this.u.getBackground();
        if (submitAreaBg != null) {
            submitAreaBg.setState(stateSet);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.j0);
        post(this.k0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    public void a(CharSequence queryText) {
        setQuery(queryText);
    }

    class f implements View.OnClickListener {
        f() {
        }

        public void onClick(View v) {
            SearchView searchView = SearchView.this;
            if (v == searchView.v) {
                searchView.h();
            } else if (v == searchView.x) {
                searchView.g();
            } else if (v == searchView.w) {
                searchView.i();
            } else if (v == searchView.y) {
                searchView.k();
            } else if (v == searchView.r) {
                searchView.e();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        public boolean onKey(View v, int keyCode, KeyEvent event) {
            SearchView searchView = SearchView.this;
            if (searchView.h0 == null) {
                return false;
            }
            if (searchView.r.isPopupShowing() && SearchView.this.r.getListSelection() != -1) {
                return SearchView.this.a(v, keyCode, event);
            }
            if (SearchView.this.r.a() || !event.hasNoModifiers() || event.getAction() != 1 || keyCode != 66) {
                return false;
            }
            v.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.a(0, (String) null, searchView2.r.getText().toString());
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(View v2, int keyCode, KeyEvent event) {
        int selPoint;
        if (this.h0 != null && this.T != null && event.getAction() == 0 && event.hasNoModifiers()) {
            if (keyCode == 66 || keyCode == 84 || keyCode == 61) {
                return a(this.r.getListSelection(), 0, (String) null);
            }
            if (keyCode == 21 || keyCode == 22) {
                if (keyCode == 21) {
                    selPoint = 0;
                } else {
                    selPoint = this.r.length();
                }
                this.r.setSelection(selPoint);
                this.r.setListSelection(0);
                this.r.clearListSelection();
                s0.a(this.r, true);
                return true;
            } else if (keyCode != 19 || this.r.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    private CharSequence c(CharSequence hintText) {
        if (!this.R || this.G == null) {
            return hintText;
        }
        double textSize = (double) this.r.getTextSize();
        Double.isNaN(textSize);
        int textSize2 = (int) (textSize * 1.25d);
        this.G.setBounds(0, 0, textSize2, textSize2);
        SpannableStringBuilder ssb = new SpannableStringBuilder("   ");
        ssb.setSpan(new ImageSpan(this.G), 1, 2, 33);
        ssb.append(hintText);
        return ssb;
    }

    private void r() {
        CharSequence hint = getQueryHint();
        this.r.setHint(c(hint == null ? "" : hint));
    }

    private void s() {
        this.r.setThreshold(this.h0.getSuggestThreshold());
        this.r.setImeOptions(this.h0.getImeOptions());
        int inputType = this.h0.getInputType();
        int i2 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.h0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.r.setInputType(inputType);
        android.support.v4.widget.d dVar = this.T;
        if (dVar != null) {
            dVar.b(null);
        }
        if (this.h0.getSuggestAuthority() != null) {
            this.T = new d1(getContext(), this, this.h0, this.l0);
            this.r.setAdapter(this.T);
            d1 d1Var = (d1) this.T;
            if (this.W) {
                i2 = 2;
            }
            d1Var.a(i2);
        }
    }

    private void c(boolean empty) {
        int visibility = 8;
        if (this.c0 && !f() && empty) {
            visibility = 0;
            this.w.setVisibility(8);
        }
        this.y.setVisibility(visibility);
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            SearchView.this.i();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void b(CharSequence newText) {
        CharSequence text = this.r.getText();
        this.e0 = text;
        boolean z2 = true;
        boolean hasText = !TextUtils.isEmpty(text);
        a(hasText);
        if (hasText) {
            z2 = false;
        }
        c(z2);
        q();
        t();
        if (this.M != null && !TextUtils.equals(newText, this.d0)) {
            this.M.a(newText.toString());
        }
        this.d0 = newText.toString();
    }

    /* access modifiers changed from: package-private */
    public void i() {
        CharSequence query = this.r.getText();
        if (query != null && TextUtils.getTrimmedLength(query) > 0) {
            m mVar = this.M;
            if (mVar == null || !mVar.b(query.toString())) {
                if (this.h0 != null) {
                    a(0, (String) null, query.toString());
                }
                this.r.setImeVisibility(false);
                m();
            }
        }
    }

    private void m() {
        this.r.dismissDropDown();
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (!TextUtils.isEmpty(this.r.getText())) {
            this.r.setText("");
            this.r.requestFocus();
            this.r.setImeVisibility(true);
        } else if (this.R) {
            l lVar = this.N;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                b(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        b(false);
        this.r.requestFocus();
        this.r.setImeVisibility(true);
        View.OnClickListener onClickListener = this.Q;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        if (this.h0 != null) {
            SearchableInfo searchable = this.h0;
            try {
                if (searchable.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(b(this.J, searchable));
                } else if (searchable.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(a(this.K, searchable));
                }
            } catch (ActivityNotFoundException e2) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        b(f());
        p();
        if (this.r.hasFocus()) {
            e();
        }
    }

    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        p();
    }

    @Override // a.b.h.f.c
    public void c() {
        a("", false);
        clearFocus();
        b(true);
        this.r.setImeOptions(this.g0);
        this.f0 = false;
    }

    @Override // a.b.h.f.c
    public void b() {
        if (!this.f0) {
            this.f0 = true;
            this.g0 = this.r.getImeOptions();
            this.r.setImeOptions(this.g0 | 33554432);
            this.r.setText("");
            setIconified(false);
        }
    }

    /* access modifiers changed from: package-private */
    public static class o extends android.support.v4.view.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        boolean f۱۹۱۱e;

        o(Parcelable superState) {
            super(superState);
        }

        public o(Parcel source, ClassLoader loader) {
            super(source, loader);
            this.f۱۹۱۱e = ((Boolean) source.readValue(null)).booleanValue();
        }

        @Override // android.support.v4.view.a
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeValue(Boolean.valueOf(this.f۱۹۱۱e));
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f۱۹۱۱e + "}";
        }

        static class a implements Parcelable.ClassLoaderCreator<o> {
            a() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public o createFromParcel(Parcel in, ClassLoader loader) {
                return new o(in, loader);
            }

            @Override // android.os.Parcelable.Creator
            public o createFromParcel(Parcel in) {
                return new o(in, null);
            }

            @Override // android.os.Parcelable.Creator
            public o[] newArray(int size) {
                return new o[size];
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        o ss = new o(super.onSaveInstanceState());
        ss.f۱۹۱۱e = f();
        return ss;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof o)) {
            super.onRestoreInstanceState(state);
            return;
        }
        o ss = (o) state;
        super.onRestoreInstanceState(ss.a());
        b(ss.f۱۹۱۱e);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void d() {
        int offset;
        if (this.z.getWidth() > 1) {
            Resources res = getContext().getResources();
            int anchorPadding = this.t.getPaddingLeft();
            Rect dropDownPadding = new Rect();
            boolean isLayoutRtl = r1.a(this);
            int iconOffset = this.R ? res.getDimensionPixelSize(a.b.h.a.d.abc_dropdownitem_icon_width) + res.getDimensionPixelSize(a.b.h.a.d.abc_dropdownitem_text_padding_left) : 0;
            this.r.getDropDownBackground().getPadding(dropDownPadding);
            if (isLayoutRtl) {
                offset = -dropDownPadding.left;
            } else {
                offset = anchorPadding - (dropDownPadding.left + iconOffset);
            }
            this.r.setDropDownHorizontalOffset(offset);
            this.r.setDropDownWidth((((this.z.getWidth() + dropDownPadding.left) + dropDownPadding.right) + iconOffset) - anchorPadding);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(int position, int actionKey, String actionMsg) {
        n nVar = this.P;
        if (nVar != null && nVar.b(position)) {
            return false;
        }
        b(position, 0, null);
        this.r.setImeVisibility(false);
        m();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean d(int position) {
        n nVar = this.P;
        if (nVar != null && nVar.a(position)) {
            return false;
        }
        e(position);
        return true;
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            SearchView.this.a(position, 0, (String) null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
            SearchView.this.d(position);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private void e(int position) {
        CharSequence oldQuery = this.r.getText();
        Cursor c2 = this.T.a();
        if (c2 != null) {
            if (c2.moveToPosition(position)) {
                CharSequence newQuery = this.T.a(c2);
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

    private boolean b(int position, int actionKey, String actionMsg) {
        Cursor c2 = this.T.a();
        if (c2 == null || !c2.moveToPosition(position)) {
            return false;
        }
        a(a(c2, actionKey, actionMsg));
        return true;
    }

    private void a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException ex) {
                Log.e("SearchView", "Failed launch activity: " + intent, ex);
            }
        }
    }

    private void setQuery(CharSequence query) {
        this.r.setText(query);
        this.r.setSelection(TextUtils.isEmpty(query) ? 0 : query.length());
    }

    /* access modifiers changed from: package-private */
    public void a(int actionKey, String actionMsg, String query) {
        getContext().startActivity(a("android.intent.action.SEARCH", (Uri) null, (String) null, query, actionKey, actionMsg));
    }

    private Intent a(String action, Uri data, String extraData, String query, int actionKey, String actionMsg) {
        Intent intent = new Intent(action);
        intent.addFlags(268435456);
        if (data != null) {
            intent.setData(data);
        }
        intent.putExtra("user_query", this.e0);
        if (query != null) {
            intent.putExtra("query", query);
        }
        if (extraData != null) {
            intent.putExtra("intent_extra_data_key", extraData);
        }
        Bundle bundle = this.i0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (actionKey != 0) {
            intent.putExtra("action_key", actionKey);
            intent.putExtra("action_msg", actionMsg);
        }
        intent.setComponent(this.h0.getSearchActivity());
        return intent;
    }

    private Intent b(Intent baseIntent, SearchableInfo searchable) {
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

    private Intent a(Intent baseIntent, SearchableInfo searchable) {
        String str;
        ComponentName searchActivity = searchable.getSearchActivity();
        Intent queryIntent = new Intent("android.intent.action.SEARCH");
        queryIntent.setComponent(searchActivity);
        PendingIntent pending = PendingIntent.getActivity(getContext(), 0, queryIntent, 1073741824);
        Bundle queryExtras = new Bundle();
        Bundle bundle = this.i0;
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

    private Intent a(Cursor c2, int actionKey, String actionMsg) {
        int rowNum;
        String data;
        String id;
        try {
            String action = d1.a(c2, "suggest_intent_action");
            if (action == null) {
                action = this.h0.getSuggestIntentAction();
            }
            if (action == null) {
                action = "android.intent.action.SEARCH";
            }
            String data2 = d1.a(c2, "suggest_intent_data");
            if (data2 == null) {
                data2 = this.h0.getSuggestIntentData();
            }
            if (data2 == null || (id = d1.a(c2, "suggest_intent_data_id")) == null) {
                data = data2;
            } else {
                data = data2 + "/" + Uri.encode(id);
            }
            return a(action, data == null ? null : Uri.parse(data), d1.a(c2, "suggest_intent_extra_data"), d1.a(c2, "suggest_intent_query"), actionKey, actionMsg);
        } catch (RuntimeException e2) {
            try {
                rowNum = c2.getPosition();
            } catch (RuntimeException e3) {
                rowNum = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + rowNum + " returned exception.", e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        s0.b(this.r);
        s0.a(this.r);
    }

    static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    class a implements TextWatcher {
        a() {
        }

        public void beforeTextChanged(CharSequence s, int start, int before, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int after) {
            SearchView.this.b(s);
        }

        public void afterTextChanged(Editable s) {
        }
    }

    private static class p extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f۱۹۱۲a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f۱۹۱۳b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        private final Rect f۱۹۱۴c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        private final Rect f۱۹۱۵d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        private final int f۱۹۱۶e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f۱۹۱۷f;

        public p(Rect targetBounds, Rect actualBounds, View delegateView) {
            super(targetBounds, delegateView);
            this.f۱۹۱۶e = ViewConfiguration.get(delegateView.getContext()).getScaledTouchSlop();
            a(targetBounds, actualBounds);
            this.f۱۹۱۲a = delegateView;
        }

        public void a(Rect desiredBounds, Rect actualBounds) {
            this.f۱۹۱۳b.set(desiredBounds);
            this.f۱۹۱۵d.set(desiredBounds);
            Rect rect = this.f۱۹۱۵d;
            int i = this.f۱۹۱۶e;
            rect.inset(-i, -i);
            this.f۱۹۱۴c.set(actualBounds);
        }

        public boolean onTouchEvent(MotionEvent event) {
            int x = (int) event.getX();
            int y = (int) event.getY();
            boolean sendToDelegate = false;
            boolean hit = true;
            int action = event.getAction();
            if (action != 0) {
                if (action == 1 || action == 2) {
                    sendToDelegate = this.f۱۹۱۷f;
                    if (sendToDelegate && !this.f۱۹۱۵d.contains(x, y)) {
                        hit = false;
                    }
                } else if (action == 3) {
                    sendToDelegate = this.f۱۹۱۷f;
                    this.f۱۹۱۷f = false;
                }
            } else if (this.f۱۹۱۳b.contains(x, y)) {
                this.f۱۹۱۷f = true;
                sendToDelegate = true;
            }
            if (!sendToDelegate) {
                return false;
            }
            if (!hit || this.f۱۹۱۴c.contains(x, y)) {
                Rect rect = this.f۱۹۱۴c;
                event.setLocation((float) (x - rect.left), (float) (y - rect.top));
            } else {
                event.setLocation((float) (this.f۱۹۱۲a.getWidth() / 2), (float) (this.f۱۹۱۲a.getHeight() / 2));
            }
            return this.f۱۹۱۲a.dispatchTouchEvent(event);
        }
    }

    public static class SearchAutoComplete extends e {

        /* renamed from: f  reason: collision with root package name */
        private int f۱۸۹۴f;

        /* renamed from: g  reason: collision with root package name */
        private SearchView f۱۸۹۵g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f۱۸۹۶h;
        final Runnable i;

        class a implements Runnable {
            a() {
            }

            public void run() {
                SearchAutoComplete.this.b();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attrs) {
            this(context, attrs, a.b.h.a.a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
            this.i = new a();
            this.f۱۸۹۴f = getThreshold();
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f۱۸۹۵g = searchView;
        }

        public void setThreshold(int threshold) {
            super.setThreshold(threshold);
            this.f۱۸۹۴f = threshold;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence text) {
        }

        public void performCompletion() {
        }

        public void onWindowFocusChanged(boolean hasWindowFocus) {
            super.onWindowFocusChanged(hasWindowFocus);
            if (hasWindowFocus && this.f۱۸۹۵g.hasFocus() && getVisibility() == 0) {
                this.f۱۸۹۶h = true;
                if (SearchView.a(getContext())) {
                    SearchView.s0.a(this, true);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
            super.onFocusChanged(focused, direction, previouslyFocusedRect);
            this.f۱۸۹۵g.j();
        }

        public boolean enoughToFilter() {
            return this.f۱۸۹۴f <= 0 || super.enoughToFilter();
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
                        this.f۱۸۹۵g.clearFocus();
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

        @Override // android.support.v7.widget.e
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection ic = super.onCreateInputConnection(editorInfo);
            if (this.f۱۸۹۶h) {
                removeCallbacks(this.i);
                post(this.i);
            }
            return ic;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (this.f۱۸۹۶h) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f۱۸۹۶h = false;
            }
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean visible) {
            InputMethodManager imm = (InputMethodManager) getContext().getSystemService("input_method");
            if (!visible) {
                this.f۱۸۹۶h = false;
                removeCallbacks(this.i);
                imm.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (imm.isActive(this)) {
                this.f۱۸۹۶h = false;
                removeCallbacks(this.i);
                imm.showSoftInput(this, 0);
            } else {
                this.f۱۸۹۶h = true;
            }
        }
    }

    /* access modifiers changed from: private */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        private Method f۱۹۰۸a;

        /* renamed from: b  reason: collision with root package name */
        private Method f۱۹۰۹b;

        /* renamed from: c  reason: collision with root package name */
        private Method f۱۹۱۰c;

        k() {
            try {
                this.f۱۹۰۸a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f۱۹۰۸a.setAccessible(true);
            } catch (NoSuchMethodException e2) {
            }
            try {
                this.f۱۹۰۹b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f۱۹۰۹b.setAccessible(true);
            } catch (NoSuchMethodException e3) {
            }
            try {
                this.f۱۹۱۰c = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f۱۹۱۰c.setAccessible(true);
            } catch (NoSuchMethodException e4) {
            }
        }

        /* access modifiers changed from: package-private */
        public void b(AutoCompleteTextView view) {
            Method method = this.f۱۹۰۸a;
            if (method != null) {
                try {
                    method.invoke(view, new Object[0]);
                } catch (Exception e2) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(AutoCompleteTextView view) {
            Method method = this.f۱۹۰۹b;
            if (method != null) {
                try {
                    method.invoke(view, new Object[0]);
                } catch (Exception e2) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(AutoCompleteTextView view, boolean visible) {
            Method method = this.f۱۹۱۰c;
            if (method != null) {
                try {
                    method.invoke(view, Boolean.valueOf(visible));
                } catch (Exception e2) {
                }
            }
        }
    }
}
