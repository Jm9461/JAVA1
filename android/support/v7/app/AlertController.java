package android.support.v7.app;

import a.b.h.a.j;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.u;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.o0;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public class AlertController {
    NestedScrollView A;
    private int B = 0;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    int I = -1;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    private int Q = 0;
    Handler R;
    private final View.OnClickListener S = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f۱۴۸۴a;

    /* renamed from: b  reason: collision with root package name */
    final i f۱۴۸۵b;

    /* renamed from: c  reason: collision with root package name */
    private final Window f۱۴۸۶c;

    /* renamed from: d  reason: collision with root package name */
    private final int f۱۴۸۷d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f۱۴۸۸e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f۱۴۸۹f;

    /* renamed from: g  reason: collision with root package name */
    ListView f۱۴۹۰g;

    /* renamed from: h  reason: collision with root package name */
    private View f۱۴۹۱h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n = false;
    Button o;
    private CharSequence p;
    Message q;
    private Drawable r;
    Button s;
    private CharSequence t;
    Message u;
    private Drawable v;
    Button w;
    private CharSequence x;
    Message y;
    private Drawable z;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View v) {
            Message m;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (v != alertController.o || (message3 = alertController.q) == null) {
                AlertController alertController2 = AlertController.this;
                if (v != alertController2.s || (message2 = alertController2.u) == null) {
                    AlertController alertController3 = AlertController.this;
                    if (v != alertController3.w || (message = alertController3.y) == null) {
                        m = null;
                    } else {
                        m = Message.obtain(message);
                    }
                } else {
                    m = Message.obtain(message2);
                }
            } else {
                m = Message.obtain(message3);
            }
            if (m != null) {
                m.sendToTarget();
            }
            AlertController alertController4 = AlertController.this;
            alertController4.R.obtainMessage(1, alertController4.f۱۴۸۵b).sendToTarget();
        }
    }

    private static final class g extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DialogInterface> f۱۵۲۵a;

        public g(DialogInterface dialog) {
            this.f۱۵۲۵a = new WeakReference<>(dialog);
        }

        public void handleMessage(Message msg) {
            int i = msg.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) msg.obj).onClick(this.f۱۵۲۵a.get(), msg.what);
            } else if (i == 1) {
                ((DialogInterface) msg.obj).dismiss();
            }
        }
    }

    private static boolean a(Context context) {
        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.h.a.a.alertDialogCenterButtons, outValue, true);
        if (outValue.data != 0) {
            return true;
        }
        return false;
    }

    public AlertController(Context context, i di, Window window) {
        this.f۱۴۸۴a = context;
        this.f۱۴۸۵b = di;
        this.f۱۴۸۶c = window;
        this.R = new g(di);
        TypedArray a2 = context.obtainStyledAttributes(null, j.AlertDialog, a.b.h.a.a.alertDialogStyle, 0);
        this.J = a2.getResourceId(j.AlertDialog_android_layout, 0);
        this.K = a2.getResourceId(j.AlertDialog_buttonPanelSideLayout, 0);
        this.L = a2.getResourceId(j.AlertDialog_listLayout, 0);
        this.M = a2.getResourceId(j.AlertDialog_multiChoiceItemLayout, 0);
        this.N = a2.getResourceId(j.AlertDialog_singleChoiceItemLayout, 0);
        this.O = a2.getResourceId(j.AlertDialog_listItemLayout, 0);
        this.P = a2.getBoolean(j.AlertDialog_showTitle, true);
        this.f۱۴۸۷d = a2.getDimensionPixelSize(j.AlertDialog_buttonIconDimen, 0);
        a2.recycle();
        di.a(1);
    }

    static boolean c(View v2) {
        if (v2.onCheckIsTextEditor()) {
            return true;
        }
        if (!(v2 instanceof ViewGroup)) {
            return false;
        }
        ViewGroup vg = (ViewGroup) v2;
        int i2 = vg.getChildCount();
        while (i2 > 0) {
            i2--;
            if (c(vg.getChildAt(i2))) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        this.f۱۴۸۵b.setContentView(b());
        c();
    }

    private int b() {
        int i2 = this.K;
        if (i2 == 0) {
            return this.J;
        }
        if (this.Q == 1) {
            return i2;
        }
        return this.J;
    }

    public void b(CharSequence title) {
        this.f۱۴۸۸e = title;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(title);
        }
    }

    public void a(View customTitleView) {
        this.G = customTitleView;
    }

    public void a(CharSequence message) {
        this.f۱۴۸۹f = message;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(message);
        }
    }

    public void c(int layoutResId) {
        this.f۱۴۹۱h = null;
        this.i = layoutResId;
        this.n = false;
    }

    public void b(View view) {
        this.f۱۴۹۱h = view;
        this.i = 0;
        this.n = false;
    }

    public void a(View view, int viewSpacingLeft, int viewSpacingTop, int viewSpacingRight, int viewSpacingBottom) {
        this.f۱۴۹۱h = view;
        this.i = 0;
        this.n = true;
        this.j = viewSpacingLeft;
        this.k = viewSpacingTop;
        this.l = viewSpacingRight;
        this.m = viewSpacingBottom;
    }

    public void a(int whichButton, CharSequence text, DialogInterface.OnClickListener listener, Message msg, Drawable icon) {
        if (msg == null && listener != null) {
            msg = this.R.obtainMessage(whichButton, listener);
        }
        if (whichButton == -3) {
            this.x = text;
            this.y = msg;
            this.z = icon;
        } else if (whichButton == -2) {
            this.t = text;
            this.u = msg;
            this.v = icon;
        } else if (whichButton == -1) {
            this.p = text;
            this.q = msg;
            this.r = icon;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void b(int resId) {
        this.C = null;
        this.B = resId;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (resId != 0) {
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
            return;
        }
        imageView.setVisibility(8);
    }

    public void a(Drawable icon) {
        this.C = icon;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (icon != null) {
            imageView.setVisibility(0);
            this.D.setImageDrawable(icon);
            return;
        }
        imageView.setVisibility(8);
    }

    public int a(int attrId) {
        TypedValue out = new TypedValue();
        this.f۱۴۸۴a.getTheme().resolveAttribute(attrId, out, true);
        return out.resourceId;
    }

    public boolean a(int keyCode, KeyEvent event) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.a(event);
    }

    public boolean b(int keyCode, KeyEvent event) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.a(event);
    }

    private ViewGroup a(View customPanel, View defaultPanel) {
        if (customPanel == null) {
            if (defaultPanel instanceof ViewStub) {
                defaultPanel = ((ViewStub) defaultPanel).inflate();
            }
            return (ViewGroup) defaultPanel;
        }
        if (defaultPanel != null) {
            ViewParent parent = defaultPanel.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(defaultPanel);
            }
        }
        if (customPanel instanceof ViewStub) {
            customPanel = ((ViewStub) customPanel).inflate();
        }
        return (ViewGroup) customPanel;
    }

    private void c() {
        ListAdapter listAdapter;
        View parentPanel = this.f۱۴۸۶c.findViewById(a.b.h.a.f.parentPanel);
        View defaultTopPanel = parentPanel.findViewById(a.b.h.a.f.topPanel);
        View defaultContentPanel = parentPanel.findViewById(a.b.h.a.f.contentPanel);
        View defaultButtonPanel = parentPanel.findViewById(a.b.h.a.f.buttonPanel);
        ViewGroup customPanel = (ViewGroup) parentPanel.findViewById(a.b.h.a.f.customPanel);
        c(customPanel);
        View customTopPanel = customPanel.findViewById(a.b.h.a.f.topPanel);
        View customContentPanel = customPanel.findViewById(a.b.h.a.f.contentPanel);
        View customButtonPanel = customPanel.findViewById(a.b.h.a.f.buttonPanel);
        ViewGroup topPanel = a(customTopPanel, defaultTopPanel);
        ViewGroup contentPanel = a(customContentPanel, defaultContentPanel);
        ViewGroup buttonPanel = a(customButtonPanel, defaultButtonPanel);
        b(contentPanel);
        a(buttonPanel);
        d(topPanel);
        boolean hasCustomPanel = (customPanel == null || customPanel.getVisibility() == 8) ? false : true;
        boolean hasTopPanel = (topPanel == null || topPanel.getVisibility() == 8) ? false : true;
        boolean hasButtonPanel = (buttonPanel == null || buttonPanel.getVisibility() == 8) ? false : true;
        if (!hasButtonPanel) {
            if (contentPanel != null) {
                View spacer = contentPanel.findViewById(a.b.h.a.f.textSpacerNoButtons);
                if (spacer != null) {
                    spacer.setVisibility(0);
                }
            }
        }
        if (hasTopPanel) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View divider = null;
            if (!(this.f۱۴۸۹f == null && this.f۱۴۹۰g == null)) {
                divider = topPanel.findViewById(a.b.h.a.f.titleDividerNoCustom);
            }
            if (divider != null) {
                divider.setVisibility(0);
            }
        } else if (contentPanel != null) {
            View spacer2 = contentPanel.findViewById(a.b.h.a.f.textSpacerNoTitle);
            if (spacer2 != null) {
                spacer2.setVisibility(0);
            }
        }
        ListView listView = this.f۱۴۹۰g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(hasTopPanel, hasButtonPanel);
        }
        if (!hasCustomPanel) {
            View content = this.f۱۴۹۰g;
            if (content == null) {
                content = this.A;
            }
            if (content != null) {
                a(contentPanel, content, (hasTopPanel ? 1 : 0) | (hasButtonPanel ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f۱۴۹۰g;
        if (listView2 != null && (listAdapter = this.H) != null) {
            listView2.setAdapter(listAdapter);
            int checkedItem = this.I;
            if (checkedItem > -1) {
                listView2.setItemChecked(checkedItem, true);
                listView2.setSelection(checkedItem);
            }
        }
    }

    private void a(ViewGroup contentPanel, View content, int indicators, int mask) {
        View indicatorUp = this.f۱۴۸۶c.findViewById(a.b.h.a.f.scrollIndicatorUp);
        View indicatorDown = this.f۱۴۸۶c.findViewById(a.b.h.a.f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            u.a(content, indicators, mask);
            if (indicatorUp != null) {
                contentPanel.removeView(indicatorUp);
            }
            if (indicatorDown != null) {
                contentPanel.removeView(indicatorDown);
                return;
            }
            return;
        }
        if (indicatorUp != null && (indicators & 1) == 0) {
            contentPanel.removeView(indicatorUp);
            indicatorUp = null;
        }
        if (indicatorDown != null && (indicators & 2) == 0) {
            contentPanel.removeView(indicatorDown);
            indicatorDown = null;
        }
        if (indicatorUp != null || indicatorDown != null) {
            if (this.f۱۴۸۹f != null) {
                this.A.setOnScrollChangeListener(new b(this, indicatorUp, indicatorDown));
                this.A.post(new c(indicatorUp, indicatorDown));
                return;
            }
            ListView listView = this.f۱۴۹۰g;
            if (listView != null) {
                listView.setOnScrollListener(new d(this, indicatorUp, indicatorDown));
                this.f۱۴۹۰g.post(new e(indicatorUp, indicatorDown));
                return;
            }
            if (indicatorUp != null) {
                contentPanel.removeView(indicatorUp);
            }
            if (indicatorDown != null) {
                contentPanel.removeView(indicatorDown);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements NestedScrollView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f۱۴۹۵a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f۱۴۹۶b;

        b(AlertController this$0, View view, View view2) {
            this.f۱۴۹۵a = view;
            this.f۱۴۹۶b = view2;
        }

        @Override // android.support.v4.widget.NestedScrollView.b
        public void a(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
            AlertController.a(v, this.f۱۴۹۵a, this.f۱۴۹۶b);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f۱۴۹۷c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View f۱۴۹۸d;

        c(View view, View view2) {
            this.f۱۴۹۷c = view;
            this.f۱۴۹۸d = view2;
        }

        public void run() {
            AlertController.a(AlertController.this.A, this.f۱۴۹۷c, this.f۱۴۹۸d);
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements AbsListView.OnScrollListener {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f۱۵۰۰c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View f۱۵۰۱d;

        d(AlertController this$0, View view, View view2) {
            this.f۱۵۰۰c = view;
            this.f۱۵۰۱d = view2;
        }

        public void onScrollStateChanged(AbsListView view, int scrollState) {
        }

        public void onScroll(AbsListView v, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
            AlertController.a(v, this.f۱۵۰۰c, this.f۱۵۰۱d);
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f۱۵۰۲c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View f۱۵۰۳d;

        e(View view, View view2) {
            this.f۱۵۰۲c = view;
            this.f۱۵۰۳d = view2;
        }

        public void run() {
            AlertController.a(AlertController.this.f۱۴۹۰g, this.f۱۵۰۲c, this.f۱۵۰۳d);
        }
    }

    private void c(ViewGroup customPanel) {
        View customView;
        boolean hasCustomView = false;
        if (this.f۱۴۹۱h != null) {
            customView = this.f۱۴۹۱h;
        } else if (this.i != 0) {
            customView = LayoutInflater.from(this.f۱۴۸۴a).inflate(this.i, customPanel, false);
        } else {
            customView = null;
        }
        if (customView != null) {
            hasCustomView = true;
        }
        if (!hasCustomView || !c(customView)) {
            this.f۱۴۸۶c.setFlags(131072, 131072);
        }
        if (hasCustomView) {
            FrameLayout custom = (FrameLayout) this.f۱۴۸۶c.findViewById(a.b.h.a.f.custom);
            custom.addView(customView, new ViewGroup.LayoutParams(-1, -1));
            if (this.n) {
                custom.setPadding(this.j, this.k, this.l, this.m);
            }
            if (this.f۱۴۹۰g != null) {
                ((o0.a) customPanel.getLayoutParams()).f۲۲۰۵a = 0.0f;
                return;
            }
            return;
        }
        customPanel.setVisibility(8);
    }

    private void d(ViewGroup topPanel) {
        if (this.G != null) {
            topPanel.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f۱۴۸۶c.findViewById(a.b.h.a.f.title_template).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f۱۴۸۶c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f۱۴۸۸e)) || !this.P) {
            this.f۱۴۸۶c.findViewById(a.b.h.a.f.title_template).setVisibility(8);
            this.D.setVisibility(8);
            topPanel.setVisibility(8);
            return;
        }
        this.E = (TextView) this.f۱۴۸۶c.findViewById(a.b.h.a.f.alertTitle);
        this.E.setText(this.f۱۴۸۸e);
        int i2 = this.B;
        if (i2 != 0) {
            this.D.setImageResource(i2);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
            return;
        }
        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
        this.D.setVisibility(8);
    }

    private void b(ViewGroup contentPanel) {
        this.A = (NestedScrollView) this.f۱۴۸۶c.findViewById(a.b.h.a.f.scrollView);
        this.A.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        this.F = (TextView) contentPanel.findViewById(16908299);
        TextView textView = this.F;
        if (textView != null) {
            CharSequence charSequence = this.f۱۴۸۹f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.A.removeView(this.F);
            if (this.f۱۴۹۰g != null) {
                ViewGroup scrollParent = (ViewGroup) this.A.getParent();
                int childIndex = scrollParent.indexOfChild(this.A);
                scrollParent.removeViewAt(childIndex);
                scrollParent.addView(this.f۱۴۹۰g, childIndex, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            contentPanel.setVisibility(8);
        }
    }

    static void a(View v2, View upIndicator, View downIndicator) {
        int i2 = 0;
        if (upIndicator != null) {
            upIndicator.setVisibility(v2.canScrollVertically(-1) ? 0 : 4);
        }
        if (downIndicator != null) {
            if (!v2.canScrollVertically(1)) {
                i2 = 4;
            }
            downIndicator.setVisibility(i2);
        }
    }

    private void a(ViewGroup buttonPanel) {
        int whichButtons = 0;
        this.o = (Button) buttonPanel.findViewById(16908313);
        this.o.setOnClickListener(this.S);
        boolean hasButtons = false;
        if (!TextUtils.isEmpty(this.p) || this.r != null) {
            this.o.setText(this.p);
            Drawable drawable = this.r;
            if (drawable != null) {
                int i2 = this.f۱۴۸۷d;
                drawable.setBounds(0, 0, i2, i2);
                this.o.setCompoundDrawables(this.r, null, null, null);
            }
            this.o.setVisibility(0);
            whichButtons = 0 | 1;
        } else {
            this.o.setVisibility(8);
        }
        this.s = (Button) buttonPanel.findViewById(16908314);
        this.s.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.t) || this.v != null) {
            this.s.setText(this.t);
            Drawable drawable2 = this.v;
            if (drawable2 != null) {
                int i3 = this.f۱۴۸۷d;
                drawable2.setBounds(0, 0, i3, i3);
                this.s.setCompoundDrawables(this.v, null, null, null);
            }
            this.s.setVisibility(0);
            whichButtons |= 2;
        } else {
            this.s.setVisibility(8);
        }
        this.w = (Button) buttonPanel.findViewById(16908315);
        this.w.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.x) || this.z != null) {
            this.w.setText(this.x);
            Drawable drawable3 = this.r;
            if (drawable3 != null) {
                int i4 = this.f۱۴۸۷d;
                drawable3.setBounds(0, 0, i4, i4);
                this.o.setCompoundDrawables(this.r, null, null, null);
            }
            this.w.setVisibility(0);
            whichButtons |= 4;
        } else {
            this.w.setVisibility(8);
        }
        if (a(this.f۱۴۸۴a)) {
            if (whichButtons == 1) {
                a(this.o);
            } else if (whichButtons == 2) {
                a(this.s);
            } else if (whichButtons == 4) {
                a(this.w);
            }
        }
        if (whichButtons != 0) {
            hasButtons = true;
        }
        if (!hasButtons) {
            buttonPanel.setVisibility(8);
        }
    }

    private void a(Button button) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) button.getLayoutParams();
        params.gravity = 1;
        params.weight = 0.5f;
        button.setLayoutParams(params);
    }

    public static class RecycleListView extends ListView {

        /* renamed from: c  reason: collision with root package name */
        private final int f۱۴۹۲c;

        /* renamed from: d  reason: collision with root package name */
        private final int f۱۴۹۳d;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attrs) {
            super(context, attrs);
            TypedArray ta = context.obtainStyledAttributes(attrs, j.RecycleListView);
            this.f۱۴۹۳d = ta.getDimensionPixelOffset(j.RecycleListView_paddingBottomNoButtons, -1);
            this.f۱۴۹۲c = ta.getDimensionPixelOffset(j.RecycleListView_paddingTopNoTitle, -1);
        }

        public void a(boolean hasTitle, boolean hasButtons) {
            if (!hasButtons || !hasTitle) {
                setPadding(getPaddingLeft(), hasTitle ? getPaddingTop() : this.f۱۴۹۲c, getPaddingRight(), hasButtons ? getPaddingBottom() : this.f۱۴۹۳d);
            }
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E = false;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public int I = -1;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;

        /* renamed from: a  reason: collision with root package name */
        public final Context f۱۵۰۵a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f۱۵۰۶b;

        /* renamed from: c  reason: collision with root package name */
        public int f۱۵۰۷c = 0;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f۱۵۰۸d;

        /* renamed from: e  reason: collision with root package name */
        public int f۱۵۰۹e = 0;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f۱۵۱۰f;

        /* renamed from: g  reason: collision with root package name */
        public View f۱۵۱۱g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f۱۵۱۲h;
        public CharSequence i;
        public Drawable j;
        public DialogInterface.OnClickListener k;
        public CharSequence l;
        public Drawable m;
        public DialogInterface.OnClickListener n;
        public CharSequence o;
        public Drawable p;
        public DialogInterface.OnClickListener q;
        public boolean r;
        public DialogInterface.OnCancelListener s;
        public DialogInterface.OnDismissListener t;
        public DialogInterface.OnKeyListener u;
        public CharSequence[] v;
        public ListAdapter w;
        public DialogInterface.OnClickListener x;
        public int y;
        public View z;

        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f۱۵۰۵a = context;
            this.r = true;
            this.f۱۵۰۶b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(AlertController dialog) {
            View view = this.f۱۵۱۱g;
            if (view != null) {
                dialog.a(view);
            } else {
                CharSequence charSequence = this.f۱۵۱۰f;
                if (charSequence != null) {
                    dialog.b(charSequence);
                }
                Drawable drawable = this.f۱۵۰۸d;
                if (drawable != null) {
                    dialog.a(drawable);
                }
                int i2 = this.f۱۵۰۷c;
                if (i2 != 0) {
                    dialog.b(i2);
                }
                int i3 = this.f۱۵۰۹e;
                if (i3 != 0) {
                    dialog.b(dialog.a(i3));
                }
            }
            CharSequence charSequence2 = this.f۱۵۱۲h;
            if (charSequence2 != null) {
                dialog.a(charSequence2);
            }
            if (!(this.i == null && this.j == null)) {
                dialog.a(-1, this.i, this.k, (Message) null, this.j);
            }
            if (!(this.l == null && this.m == null)) {
                dialog.a(-2, this.l, this.n, (Message) null, this.m);
            }
            if (!(this.o == null && this.p == null)) {
                dialog.a(-3, this.o, this.q, (Message) null, this.p);
            }
            if (!(this.v == null && this.K == null && this.w == null)) {
                b(dialog);
            }
            View view2 = this.z;
            if (view2 == null) {
                int i4 = this.y;
                if (i4 != 0) {
                    dialog.c(i4);
                }
            } else if (this.E) {
                dialog.a(view2, this.A, this.B, this.C, this.D);
            } else {
                dialog.b(view2);
            }
        }

        private void b(AlertController dialog) {
            ListAdapter adapter;
            int layout;
            RecycleListView listView = (RecycleListView) this.f۱۵۰۶b.inflate(dialog.L, (ViewGroup) null);
            if (this.G) {
                Cursor cursor = this.K;
                if (cursor == null) {
                    adapter = new a(this.f۱۵۰۵a, dialog.M, 16908308, this.v, listView);
                } else {
                    adapter = new b(this.f۱۵۰۵a, cursor, false, listView, dialog);
                }
            } else {
                if (this.H) {
                    layout = dialog.N;
                } else {
                    layout = dialog.O;
                }
                Cursor cursor2 = this.K;
                if (cursor2 != null) {
                    adapter = new SimpleCursorAdapter(this.f۱۵۰۵a, layout, cursor2, new String[]{this.L}, new int[]{16908308});
                } else if (this.w != null) {
                    adapter = this.w;
                } else {
                    adapter = new h(this.f۱۵۰۵a, layout, 16908308, this.v);
                }
            }
            e eVar = this.O;
            if (eVar != null) {
                eVar.a(listView);
            }
            dialog.H = adapter;
            dialog.I = this.I;
            if (this.x != null) {
                listView.setOnItemClickListener(new c(dialog));
            } else if (this.J != null) {
                listView.setOnItemClickListener(new d(listView, dialog));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.N;
            if (onItemSelectedListener != null) {
                listView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.H) {
                listView.setChoiceMode(1);
            } else if (this.G) {
                listView.setChoiceMode(2);
            }
            dialog.f۱۴۹۰g = listView;
        }

        /* access modifiers changed from: package-private */
        public class a extends ArrayAdapter<CharSequence> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ RecycleListView f۱۵۱۳c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Context x0, int x1, int x2, CharSequence[] x3, RecycleListView recycleListView) {
                super(x0, x1, x2, x3);
                this.f۱۵۱۳c = recycleListView;
            }

            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[position]) {
                    this.f۱۵۱۳c.setItemChecked(position, true);
                }
                return view;
            }
        }

        /* access modifiers changed from: package-private */
        public class b extends CursorAdapter {

            /* renamed from: c  reason: collision with root package name */
            private final int f۱۵۱۵c;

            /* renamed from: d  reason: collision with root package name */
            private final int f۱۵۱۶d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ RecycleListView f۱۵۱۷e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ AlertController f۱۵۱۸f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(Context x0, Cursor x1, boolean x2, RecycleListView recycleListView, AlertController alertController) {
                super(x0, x1, x2);
                this.f۱۵۱۷e = recycleListView;
                this.f۱۵۱۸f = alertController;
                Cursor cursor = getCursor();
                this.f۱۵۱۵c = cursor.getColumnIndexOrThrow(f.this.L);
                this.f۱۵۱۶d = cursor.getColumnIndexOrThrow(f.this.M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f۱۵۱۵c));
                RecycleListView recycleListView = this.f۱۵۱۷e;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f۱۵۱۶d) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup parent) {
                return f.this.f۱۵۰۶b.inflate(this.f۱۵۱۸f.M, parent, false);
            }
        }

        /* access modifiers changed from: package-private */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AlertController f۱۵۲۰c;

            c(AlertController alertController) {
                this.f۱۵۲۰c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                f.this.x.onClick(this.f۱۵۲۰c.f۱۴۸۵b, position);
                if (!f.this.H) {
                    this.f۱۵۲۰c.f۱۴۸۵b.dismiss();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ RecycleListView f۱۵۲۲c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ AlertController f۱۵۲۳d;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f۱۵۲۲c = recycleListView;
                this.f۱۵۲۳d = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[position] = this.f۱۵۲۲c.isItemChecked(position);
                }
                f.this.J.onClick(this.f۱۵۲۳d.f۱۴۸۵b, position, this.f۱۵۲۲c.isItemChecked(position));
            }
        }
    }

    /* access modifiers changed from: private */
    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int resource, int textViewResourceId, CharSequence[] objects) {
            super(context, resource, textViewResourceId, objects);
        }

        public boolean hasStableIds() {
            return true;
        }

        public long getItemId(int position) {
            return (long) position;
        }
    }
}
