package android.support.p۰۴۷v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.widget.NestedScrollView;
import android.support.p۰۴۷v7.widget.Co0;
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
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.AlertController */
public class AlertController {

    /* renamed from: A  reason: contains not printable characters */
    NestedScrollView f۱۰۸۳۷A;

    /* renamed from: B  reason: contains not printable characters */
    private int f۱۰۸۳۸B = 0;

    /* renamed from: C  reason: contains not printable characters */
    private Drawable f۱۰۸۳۹C;

    /* renamed from: D  reason: contains not printable characters */
    private ImageView f۱۰۸۴۰D;

    /* renamed from: E  reason: contains not printable characters */
    private TextView f۱۰۸۴۱E;

    /* renamed from: F  reason: contains not printable characters */
    private TextView f۱۰۸۴۲F;

    /* renamed from: G  reason: contains not printable characters */
    private View f۱۰۸۴۳G;

    /* renamed from: H  reason: contains not printable characters */
    ListAdapter f۱۰۸۴۴H;

    /* renamed from: I  reason: contains not printable characters */
    int f۱۰۸۴۵I = -1;

    /* renamed from: J  reason: contains not printable characters */
    private int f۱۰۸۴۶J;

    /* renamed from: K  reason: contains not printable characters */
    private int f۱۰۸۴۷K;

    /* renamed from: L  reason: contains not printable characters */
    int f۱۰۸۴۸L;

    /* renamed from: M  reason: contains not printable characters */
    int f۱۰۸۴۹M;

    /* renamed from: N  reason: contains not printable characters */
    int f۱۰۸۵۰N;

    /* renamed from: O  reason: contains not printable characters */
    int f۱۰۸۵۱O;

    /* renamed from: P  reason: contains not printable characters */
    private boolean f۱۰۸۵۲P;

    /* renamed from: Q  reason: contains not printable characters */
    private int f۱۰۸۵۳Q = 0;

    /* renamed from: R  reason: contains not printable characters */
    Handler f۱۰۸۵۴R;

    /* renamed from: S  reason: contains not printable characters */
    private final View.OnClickListener f۱۰۸۵۵S = new View$OnClickListenerCa();

    /* renamed from: a  reason: contains not printable characters */
    private final Context f۱۰۸۵۶a;

    /* renamed from: b  reason: contains not printable characters */
    final DialogCi f۱۰۸۵۷b;

    /* renamed from: c  reason: contains not printable characters */
    private final Window f۱۰۸۵۸c;

    /* renamed from: d  reason: contains not printable characters */
    private final int f۱۰۸۵۹d;

    /* renamed from: e  reason: contains not printable characters */
    private CharSequence f۱۰۸۶۰e;

    /* renamed from: f  reason: contains not printable characters */
    private CharSequence f۱۰۸۶۱f;

    /* renamed from: g  reason: contains not printable characters */
    ListView f۱۰۸۶۲g;

    /* renamed from: h  reason: contains not printable characters */
    private View f۱۰۸۶۳h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۰۸۶۴i;

    /* renamed from: j  reason: contains not printable characters */
    private int f۱۰۸۶۵j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۱۰۸۶۶k;

    /* renamed from: l  reason: contains not printable characters */
    private int f۱۰۸۶۷l;

    /* renamed from: m  reason: contains not printable characters */
    private int f۱۰۸۶۸m;

    /* renamed from: n  reason: contains not printable characters */
    private boolean f۱۰۸۶۹n = false;

    /* renamed from: o  reason: contains not printable characters */
    Button f۱۰۸۷۰o;

    /* renamed from: p  reason: contains not printable characters */
    private CharSequence f۱۰۸۷۱p;

    /* renamed from: q  reason: contains not printable characters */
    Message f۱۰۸۷۲q;

    /* renamed from: r  reason: contains not printable characters */
    private Drawable f۱۰۸۷۳r;

    /* renamed from: s  reason: contains not printable characters */
    Button f۱۰۸۷۴s;

    /* renamed from: t  reason: contains not printable characters */
    private CharSequence f۱۰۸۷۵t;

    /* renamed from: u  reason: contains not printable characters */
    Message f۱۰۸۷۶u;

    /* renamed from: v  reason: contains not printable characters */
    private Drawable f۱۰۸۷۷v;

    /* renamed from: w  reason: contains not printable characters */
    Button f۱۰۸۷۸w;

    /* renamed from: x  reason: contains not printable characters */
    private CharSequence f۱۰۸۷۹x;

    /* renamed from: y  reason: contains not printable characters */
    Message f۱۰۸۸۰y;

    /* renamed from: z  reason: contains not printable characters */
    private Drawable f۱۰۸۸۱z;

    /* renamed from: android.support.v7.app.AlertController$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {
        View$OnClickListenerCa() {
        }

        public void onClick(View v) {
            Message m;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (v != alertController.f۱۰۸۷۰o || (message3 = alertController.f۱۰۸۷۲q) == null) {
                AlertController alertController2 = AlertController.this;
                if (v != alertController2.f۱۰۸۷۴s || (message2 = alertController2.f۱۰۸۷۶u) == null) {
                    AlertController alertController3 = AlertController.this;
                    if (v != alertController3.f۱۰۸۷۸w || (message = alertController3.f۱۰۸۸۰y) == null) {
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
            alertController4.f۱۰۸۵۴R.obtainMessage(1, alertController4.f۱۰۸۵۷b).sendToTarget();
        }
    }

    /* renamed from: android.support.v7.app.AlertController$g  reason: invalid class name */
    private static final class HandlerCg extends Handler {

        /* renamed from: a  reason: contains not printable characters */
        private WeakReference<DialogInterface> f۱۰۹۴۸a;

        public HandlerCg(DialogInterface dialog) {
            this.f۱۰۹۴۸a = new WeakReference<>(dialog);
        }

        public void handleMessage(Message msg) {
            int i = msg.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) msg.obj).onClick(this.f۱۰۹۴۸a.get(), msg.what);
            } else if (i == 1) {
                ((DialogInterface) msg.obj).dismiss();
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۳۳۸۴a(Context context) {
        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(Ca.alertDialogCenterButtons, outValue, true);
        if (outValue.data != 0) {
            return true;
        }
        return false;
    }

    public AlertController(Context context, DialogCi di, Window window) {
        this.f۱۰۸۵۶a = context;
        this.f۱۰۸۵۷b = di;
        this.f۱۰۸۵۸c = window;
        this.f۱۰۸۵۴R = new HandlerCg(di);
        TypedArray a = context.obtainStyledAttributes(null, Cj.AlertDialog, Ca.alertDialogStyle, 0);
        this.f۱۰۸۴۶J = a.getResourceId(Cj.AlertDialog_android_layout, 0);
        this.f۱۰۸۴۷K = a.getResourceId(Cj.AlertDialog_buttonPanelSideLayout, 0);
        this.f۱۰۸۴۸L = a.getResourceId(Cj.AlertDialog_listLayout, 0);
        this.f۱۰۸۴۹M = a.getResourceId(Cj.AlertDialog_multiChoiceItemLayout, 0);
        this.f۱۰۸۵۰N = a.getResourceId(Cj.AlertDialog_singleChoiceItemLayout, 0);
        this.f۱۰۸۵۱O = a.getResourceId(Cj.AlertDialog_listItemLayout, 0);
        this.f۱۰۸۵۲P = a.getBoolean(Cj.AlertDialog_showTitle, true);
        this.f۱۰۸۵۹d = a.getDimensionPixelSize(Cj.AlertDialog_buttonIconDimen, 0);
        a.recycle();
        di.m۱۳۶۲۹a(1);
    }

    /* renamed from: c  reason: contains not printable characters */
    static boolean m۱۳۳۸۹c(View v) {
        if (v.onCheckIsTextEditor()) {
            return true;
        }
        if (!(v instanceof ViewGroup)) {
            return false;
        }
        ViewGroup vg = (ViewGroup) v;
        int i = vg.getChildCount();
        while (i > 0) {
            i--;
            if (m۱۳۳۸۹c(vg.getChildAt(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۳۹۲a() {
        this.f۱۰۸۵۷b.setContentView(m۱۳۳۸۵b());
        m۱۳۳۸۷c();
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۳۳۸۵b() {
        int i = this.f۱۰۸۴۷K;
        if (i == 0) {
            return this.f۱۰۸۴۶J;
        }
        if (this.f۱۰۸۵۳Q == 1) {
            return i;
        }
        return this.f۱۰۸۴۶J;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۴۰۱b(CharSequence title) {
        this.f۱۰۸۶۰e = title;
        TextView textView = this.f۱۰۸۴۱E;
        if (textView != null) {
            textView.setText(title);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۳۹۵a(View customTitleView) {
        this.f۱۰۸۴۳G = customTitleView;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۳۹۷a(CharSequence message) {
        this.f۱۰۸۶۱f = message;
        TextView textView = this.f۱۰۸۴۲F;
        if (textView != null) {
            textView.setText(message);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۳۴۰۳c(int layoutResId) {
        this.f۱۰۸۶۳h = null;
        this.f۱۰۸۶۴i = layoutResId;
        this.f۱۰۸۶۹n = false;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۴۰۰b(View view) {
        this.f۱۰۸۶۳h = view;
        this.f۱۰۸۶۴i = 0;
        this.f۱۰۸۶۹n = false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۳۹۶a(View view, int viewSpacingLeft, int viewSpacingTop, int viewSpacingRight, int viewSpacingBottom) {
        this.f۱۰۸۶۳h = view;
        this.f۱۰۸۶۴i = 0;
        this.f۱۰۸۶۹n = true;
        this.f۱۰۸۶۵j = viewSpacingLeft;
        this.f۱۰۸۶۶k = viewSpacingTop;
        this.f۱۰۸۶۷l = viewSpacingRight;
        this.f۱۰۸۶۸m = viewSpacingBottom;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۳۹۳a(int whichButton, CharSequence text, DialogInterface.OnClickListener listener, Message msg, Drawable icon) {
        if (msg == null && listener != null) {
            msg = this.f۱۰۸۵۴R.obtainMessage(whichButton, listener);
        }
        if (whichButton == -3) {
            this.f۱۰۸۷۹x = text;
            this.f۱۰۸۸۰y = msg;
            this.f۱۰۸۸۱z = icon;
        } else if (whichButton == -2) {
            this.f۱۰۸۷۵t = text;
            this.f۱۰۸۷۶u = msg;
            this.f۱۰۸۷۷v = icon;
        } else if (whichButton == -1) {
            this.f۱۰۸۷۱p = text;
            this.f۱۰۸۷۲q = msg;
            this.f۱۰۸۷۳r = icon;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۳۹۹b(int resId) {
        this.f۱۰۸۳۹C = null;
        this.f۱۰۸۳۸B = resId;
        ImageView imageView = this.f۱۰۸۴۰D;
        if (imageView == null) {
            return;
        }
        if (resId != 0) {
            imageView.setVisibility(0);
            this.f۱۰۸۴۰D.setImageResource(this.f۱۰۸۳۸B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۳۹۴a(Drawable icon) {
        this.f۱۰۸۳۹C = icon;
        this.f۱۰۸۳۸B = 0;
        ImageView imageView = this.f۱۰۸۴۰D;
        if (imageView == null) {
            return;
        }
        if (icon != null) {
            imageView.setVisibility(0);
            this.f۱۰۸۴۰D.setImageDrawable(icon);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۳۳۹۱a(int attrId) {
        TypedValue out = new TypedValue();
        this.f۱۰۸۵۶a.getTheme().resolveAttribute(attrId, out, true);
        return out.resourceId;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۳۹۸a(int keyCode, KeyEvent event) {
        NestedScrollView nestedScrollView = this.f۱۰۸۳۷A;
        return nestedScrollView != null && nestedScrollView.m۱۳۱۷۳a(event);
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۴۰۲b(int keyCode, KeyEvent event) {
        NestedScrollView nestedScrollView = this.f۱۰۸۳۷A;
        return nestedScrollView != null && nestedScrollView.m۱۳۱۷۳a(event);
    }

    /* renamed from: a  reason: contains not printable characters */
    private ViewGroup m۱۳۳۷۹a(View customPanel, View defaultPanel) {
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

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۳۳۸۷c() {
        ListAdapter listAdapter;
        View parentPanel = this.f۱۰۸۵۸c.findViewById(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf.parentPanel);
        View defaultTopPanel = parentPanel.findViewById(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf.topPanel);
        View defaultContentPanel = parentPanel.findViewById(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf.contentPanel);
        View defaultButtonPanel = parentPanel.findViewById(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf.buttonPanel);
        ViewGroup customPanel = (ViewGroup) parentPanel.findViewById(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf.customPanel);
        m۱۳۳۸۸c(customPanel);
        View customTopPanel = customPanel.findViewById(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf.topPanel);
        View customContentPanel = customPanel.findViewById(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf.contentPanel);
        View customButtonPanel = customPanel.findViewById(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf.buttonPanel);
        ViewGroup topPanel = m۱۳۳۷۹a(customTopPanel, defaultTopPanel);
        ViewGroup contentPanel = m۱۳۳۷۹a(customContentPanel, defaultContentPanel);
        ViewGroup buttonPanel = m۱۳۳۷۹a(customButtonPanel, defaultButtonPanel);
        m۱۳۳۸۶b(contentPanel);
        m۱۳۳۸۱a(buttonPanel);
        m۱۳۳۹۰d(topPanel);
        boolean hasCustomPanel = (customPanel == null || customPanel.getVisibility() == 8) ? false : true;
        boolean hasTopPanel = (topPanel == null || topPanel.getVisibility() == 8) ? false : true;
        boolean hasButtonPanel = (buttonPanel == null || buttonPanel.getVisibility() == 8) ? false : true;
        if (!hasButtonPanel) {
            if (contentPanel != null) {
                View spacer = contentPanel.findViewById(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf.textSpacerNoButtons);
                if (spacer != null) {
                    spacer.setVisibility(0);
                }
            }
        }
        if (hasTopPanel) {
            NestedScrollView nestedScrollView = this.f۱۰۸۳۷A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View divider = null;
            if (!(this.f۱۰۸۶۱f == null && this.f۱۰۸۶۲g == null)) {
                divider = topPanel.findViewById(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf.titleDividerNoCustom);
            }
            if (divider != null) {
                divider.setVisibility(0);
            }
        } else if (contentPanel != null) {
            View spacer2 = contentPanel.findViewById(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf.textSpacerNoTitle);
            if (spacer2 != null) {
                spacer2.setVisibility(0);
            }
        }
        ListView listView = this.f۱۰۸۶۲g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m۱۳۴۰۴a(hasTopPanel, hasButtonPanel);
        }
        if (!hasCustomPanel) {
            View content = this.f۱۰۸۶۲g;
            if (content == null) {
                content = this.f۱۰۸۳۷A;
            }
            if (content != null) {
                m۱۳۳۸۲a(contentPanel, content, (hasTopPanel ? 1 : 0) | (hasButtonPanel ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f۱۰۸۶۲g;
        if (listView2 != null && (listAdapter = this.f۱۰۸۴۴H) != null) {
            listView2.setAdapter(listAdapter);
            int checkedItem = this.f۱۰۸۴۵I;
            if (checkedItem > -1) {
                listView2.setItemChecked(checkedItem, true);
                listView2.setSelection(checkedItem);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۳۳۸۲a(ViewGroup contentPanel, View content, int indicators, int mask) {
        View indicatorUp = this.f۱۰۸۵۸c.findViewById(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf.scrollIndicatorUp);
        View indicatorDown = this.f۱۰۸۵۸c.findViewById(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            Cu.m۱۲۹۷۹a(content, indicators, mask);
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
            if (this.f۱۰۸۶۱f != null) {
                this.f۱۰۸۳۷A.setOnScrollChangeListener(new Cb(this, indicatorUp, indicatorDown));
                this.f۱۰۸۳۷A.post(new RunnableCc(indicatorUp, indicatorDown));
                return;
            }
            ListView listView = this.f۱۰۸۶۲g;
            if (listView != null) {
                listView.setOnScrollListener(new Cd(this, indicatorUp, indicatorDown));
                this.f۱۰۸۶۲g.post(new RunnableCe(indicatorUp, indicatorDown));
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
    /* renamed from: android.support.v7.app.AlertController$b  reason: invalid class name */
    public class Cb implements NestedScrollView.AbstractCb {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ View f۱۰۸۸۵a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ View f۱۰۸۸۶b;

        Cb(AlertController this$0, View view, View view2) {
            this.f۱۰۸۸۵a = view;
            this.f۱۰۸۸۶b = view2;
        }

        @Override // android.support.p۰۴۳v4.widget.NestedScrollView.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۴۰۵a(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
            AlertController.m۱۳۳۸۰a(v, this.f۱۰۸۸۵a, this.f۱۰۸۸۶b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.AlertController$c  reason: invalid class name */
    public class RunnableCc implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ View f۱۰۸۸۷c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ View f۱۰۸۸۸d;

        RunnableCc(View view, View view2) {
            this.f۱۰۸۸۷c = view;
            this.f۱۰۸۸۸d = view2;
        }

        public void run() {
            AlertController.m۱۳۳۸۰a(AlertController.this.f۱۰۸۳۷A, this.f۱۰۸۸۷c, this.f۱۰۸۸۸d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.AlertController$d  reason: invalid class name */
    public class Cd implements AbsListView.OnScrollListener {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ View f۱۰۸۹۰c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ View f۱۰۸۹۱d;

        Cd(AlertController this$0, View view, View view2) {
            this.f۱۰۸۹۰c = view;
            this.f۱۰۸۹۱d = view2;
        }

        public void onScrollStateChanged(AbsListView view, int scrollState) {
        }

        public void onScroll(AbsListView v, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
            AlertController.m۱۳۳۸۰a(v, this.f۱۰۸۹۰c, this.f۱۰۸۹۱d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.AlertController$e  reason: invalid class name */
    public class RunnableCe implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ View f۱۰۸۹۲c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ View f۱۰۸۹۳d;

        RunnableCe(View view, View view2) {
            this.f۱۰۸۹۲c = view;
            this.f۱۰۸۹۳d = view2;
        }

        public void run() {
            AlertController.m۱۳۳۸۰a(AlertController.this.f۱۰۸۶۲g, this.f۱۰۸۹۲c, this.f۱۰۸۹۳d);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۳۳۸۸c(ViewGroup customPanel) {
        View customView;
        boolean hasCustomView = false;
        if (this.f۱۰۸۶۳h != null) {
            customView = this.f۱۰۸۶۳h;
        } else if (this.f۱۰۸۶۴i != 0) {
            customView = LayoutInflater.from(this.f۱۰۸۵۶a).inflate(this.f۱۰۸۶۴i, customPanel, false);
        } else {
            customView = null;
        }
        if (customView != null) {
            hasCustomView = true;
        }
        if (!hasCustomView || !m۱۳۳۸۹c(customView)) {
            this.f۱۰۸۵۸c.setFlags(131072, 131072);
        }
        if (hasCustomView) {
            FrameLayout custom = (FrameLayout) this.f۱۰۸۵۸c.findViewById(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf.custom);
            custom.addView(customView, new ViewGroup.LayoutParams(-1, -1));
            if (this.f۱۰۸۶۹n) {
                custom.setPadding(this.f۱۰۸۶۵j, this.f۱۰۸۶۶k, this.f۱۰۸۶۷l, this.f۱۰۸۶۸m);
            }
            if (this.f۱۰۸۶۲g != null) {
                ((Co0.Ca) customPanel.getLayoutParams()).f۱۲۲۵۸a = 0.0f;
                return;
            }
            return;
        }
        customPanel.setVisibility(8);
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۳۳۹۰d(ViewGroup topPanel) {
        if (this.f۱۰۸۴۳G != null) {
            topPanel.addView(this.f۱۰۸۴۳G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f۱۰۸۵۸c.findViewById(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf.title_template).setVisibility(8);
            return;
        }
        this.f۱۰۸۴۰D = (ImageView) this.f۱۰۸۵۸c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f۱۰۸۶۰e)) || !this.f۱۰۸۵۲P) {
            this.f۱۰۸۵۸c.findViewById(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf.title_template).setVisibility(8);
            this.f۱۰۸۴۰D.setVisibility(8);
            topPanel.setVisibility(8);
            return;
        }
        this.f۱۰۸۴۱E = (TextView) this.f۱۰۸۵۸c.findViewById(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf.alertTitle);
        this.f۱۰۸۴۱E.setText(this.f۱۰۸۶۰e);
        int i = this.f۱۰۸۳۸B;
        if (i != 0) {
            this.f۱۰۸۴۰D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f۱۰۸۳۹C;
        if (drawable != null) {
            this.f۱۰۸۴۰D.setImageDrawable(drawable);
            return;
        }
        this.f۱۰۸۴۱E.setPadding(this.f۱۰۸۴۰D.getPaddingLeft(), this.f۱۰۸۴۰D.getPaddingTop(), this.f۱۰۸۴۰D.getPaddingRight(), this.f۱۰۸۴۰D.getPaddingBottom());
        this.f۱۰۸۴۰D.setVisibility(8);
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۳۳۸۶b(ViewGroup contentPanel) {
        this.f۱۰۸۳۷A = (NestedScrollView) this.f۱۰۸۵۸c.findViewById(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf.scrollView);
        this.f۱۰۸۳۷A.setFocusable(false);
        this.f۱۰۸۳۷A.setNestedScrollingEnabled(false);
        this.f۱۰۸۴۲F = (TextView) contentPanel.findViewById(16908299);
        TextView textView = this.f۱۰۸۴۲F;
        if (textView != null) {
            CharSequence charSequence = this.f۱۰۸۶۱f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f۱۰۸۳۷A.removeView(this.f۱۰۸۴۲F);
            if (this.f۱۰۸۶۲g != null) {
                ViewGroup scrollParent = (ViewGroup) this.f۱۰۸۳۷A.getParent();
                int childIndex = scrollParent.indexOfChild(this.f۱۰۸۳۷A);
                scrollParent.removeViewAt(childIndex);
                scrollParent.addView(this.f۱۰۸۶۲g, childIndex, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            contentPanel.setVisibility(8);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۳۳۸۰a(View v, View upIndicator, View downIndicator) {
        int i = 0;
        if (upIndicator != null) {
            upIndicator.setVisibility(v.canScrollVertically(-1) ? 0 : 4);
        }
        if (downIndicator != null) {
            if (!v.canScrollVertically(1)) {
                i = 4;
            }
            downIndicator.setVisibility(i);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۳۳۸۱a(ViewGroup buttonPanel) {
        int whichButtons = 0;
        this.f۱۰۸۷۰o = (Button) buttonPanel.findViewById(16908313);
        this.f۱۰۸۷۰o.setOnClickListener(this.f۱۰۸۵۵S);
        boolean hasButtons = false;
        if (!TextUtils.isEmpty(this.f۱۰۸۷۱p) || this.f۱۰۸۷۳r != null) {
            this.f۱۰۸۷۰o.setText(this.f۱۰۸۷۱p);
            Drawable drawable = this.f۱۰۸۷۳r;
            if (drawable != null) {
                int i = this.f۱۰۸۵۹d;
                drawable.setBounds(0, 0, i, i);
                this.f۱۰۸۷۰o.setCompoundDrawables(this.f۱۰۸۷۳r, null, null, null);
            }
            this.f۱۰۸۷۰o.setVisibility(0);
            whichButtons = 0 | 1;
        } else {
            this.f۱۰۸۷۰o.setVisibility(8);
        }
        this.f۱۰۸۷۴s = (Button) buttonPanel.findViewById(16908314);
        this.f۱۰۸۷۴s.setOnClickListener(this.f۱۰۸۵۵S);
        if (!TextUtils.isEmpty(this.f۱۰۸۷۵t) || this.f۱۰۸۷۷v != null) {
            this.f۱۰۸۷۴s.setText(this.f۱۰۸۷۵t);
            Drawable drawable2 = this.f۱۰۸۷۷v;
            if (drawable2 != null) {
                int i2 = this.f۱۰۸۵۹d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f۱۰۸۷۴s.setCompoundDrawables(this.f۱۰۸۷۷v, null, null, null);
            }
            this.f۱۰۸۷۴s.setVisibility(0);
            whichButtons |= 2;
        } else {
            this.f۱۰۸۷۴s.setVisibility(8);
        }
        this.f۱۰۸۷۸w = (Button) buttonPanel.findViewById(16908315);
        this.f۱۰۸۷۸w.setOnClickListener(this.f۱۰۸۵۵S);
        if (!TextUtils.isEmpty(this.f۱۰۸۷۹x) || this.f۱۰۸۸۱z != null) {
            this.f۱۰۸۷۸w.setText(this.f۱۰۸۷۹x);
            Drawable drawable3 = this.f۱۰۸۷۳r;
            if (drawable3 != null) {
                int i3 = this.f۱۰۸۵۹d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f۱۰۸۷۰o.setCompoundDrawables(this.f۱۰۸۷۳r, null, null, null);
            }
            this.f۱۰۸۷۸w.setVisibility(0);
            whichButtons |= 4;
        } else {
            this.f۱۰۸۷۸w.setVisibility(8);
        }
        if (m۱۳۳۸۴a(this.f۱۰۸۵۶a)) {
            if (whichButtons == 1) {
                m۱۳۳۸۳a(this.f۱۰۸۷۰o);
            } else if (whichButtons == 2) {
                m۱۳۳۸۳a(this.f۱۰۸۷۴s);
            } else if (whichButtons == 4) {
                m۱۳۳۸۳a(this.f۱۰۸۷۸w);
            }
        }
        if (whichButtons != 0) {
            hasButtons = true;
        }
        if (!hasButtons) {
            buttonPanel.setVisibility(8);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۳۳۸۳a(Button button) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) button.getLayoutParams();
        params.gravity = 1;
        params.weight = 0.5f;
        button.setLayoutParams(params);
    }

    /* renamed from: android.support.v7.app.AlertController$RecycleListView */
    public static class RecycleListView extends ListView {

        /* renamed from: c  reason: contains not printable characters */
        private final int f۱۰۸۸۲c;

        /* renamed from: d  reason: contains not printable characters */
        private final int f۱۰۸۸۳d;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attrs) {
            super(context, attrs);
            TypedArray ta = context.obtainStyledAttributes(attrs, Cj.RecycleListView);
            this.f۱۰۸۸۳d = ta.getDimensionPixelOffset(Cj.RecycleListView_paddingBottomNoButtons, -1);
            this.f۱۰۸۸۲c = ta.getDimensionPixelOffset(Cj.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۴۰۴a(boolean hasTitle, boolean hasButtons) {
            if (!hasButtons || !hasTitle) {
                setPadding(getPaddingLeft(), hasTitle ? getPaddingTop() : this.f۱۰۸۸۲c, getPaddingRight(), hasButtons ? getPaddingBottom() : this.f۱۰۸۸۳d);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$f  reason: invalid class name */
    public static class Cf {

        /* renamed from: A  reason: contains not printable characters */
        public int f۱۰۸۹۵A;

        /* renamed from: B  reason: contains not printable characters */
        public int f۱۰۸۹۶B;

        /* renamed from: C  reason: contains not printable characters */
        public int f۱۰۸۹۷C;

        /* renamed from: D  reason: contains not printable characters */
        public int f۱۰۸۹۸D;

        /* renamed from: E  reason: contains not printable characters */
        public boolean f۱۰۸۹۹E = false;

        /* renamed from: F  reason: contains not printable characters */
        public boolean[] f۱۰۹۰۰F;

        /* renamed from: G  reason: contains not printable characters */
        public boolean f۱۰۹۰۱G;

        /* renamed from: H  reason: contains not printable characters */
        public boolean f۱۰۹۰۲H;

        /* renamed from: I  reason: contains not printable characters */
        public int f۱۰۹۰۳I = -1;

        /* renamed from: J  reason: contains not printable characters */
        public DialogInterface.OnMultiChoiceClickListener f۱۰۹۰۴J;

        /* renamed from: K  reason: contains not printable characters */
        public Cursor f۱۰۹۰۵K;

        /* renamed from: L  reason: contains not printable characters */
        public String f۱۰۹۰۶L;

        /* renamed from: M  reason: contains not printable characters */
        public String f۱۰۹۰۷M;

        /* renamed from: N  reason: contains not printable characters */
        public AdapterView.OnItemSelectedListener f۱۰۹۰۸N;

        /* renamed from: O  reason: contains not printable characters */
        public AbstractCe f۱۰۹۰۹O;

        /* renamed from: a  reason: contains not printable characters */
        public final Context f۱۰۹۱۰a;

        /* renamed from: b  reason: contains not printable characters */
        public final LayoutInflater f۱۰۹۱۱b;

        /* renamed from: c  reason: contains not printable characters */
        public int f۱۰۹۱۲c = 0;

        /* renamed from: d  reason: contains not printable characters */
        public Drawable f۱۰۹۱۳d;

        /* renamed from: e  reason: contains not printable characters */
        public int f۱۰۹۱۴e = 0;

        /* renamed from: f  reason: contains not printable characters */
        public CharSequence f۱۰۹۱۵f;

        /* renamed from: g  reason: contains not printable characters */
        public View f۱۰۹۱۶g;

        /* renamed from: h  reason: contains not printable characters */
        public CharSequence f۱۰۹۱۷h;

        /* renamed from: i  reason: contains not printable characters */
        public CharSequence f۱۰۹۱۸i;

        /* renamed from: j  reason: contains not printable characters */
        public Drawable f۱۰۹۱۹j;

        /* renamed from: k  reason: contains not printable characters */
        public DialogInterface.OnClickListener f۱۰۹۲۰k;

        /* renamed from: l  reason: contains not printable characters */
        public CharSequence f۱۰۹۲۱l;

        /* renamed from: m  reason: contains not printable characters */
        public Drawable f۱۰۹۲۲m;

        /* renamed from: n  reason: contains not printable characters */
        public DialogInterface.OnClickListener f۱۰۹۲۳n;

        /* renamed from: o  reason: contains not printable characters */
        public CharSequence f۱۰۹۲۴o;

        /* renamed from: p  reason: contains not printable characters */
        public Drawable f۱۰۹۲۵p;

        /* renamed from: q  reason: contains not printable characters */
        public DialogInterface.OnClickListener f۱۰۹۲۶q;

        /* renamed from: r  reason: contains not printable characters */
        public boolean f۱۰۹۲۷r;

        /* renamed from: s  reason: contains not printable characters */
        public DialogInterface.OnCancelListener f۱۰۹۲۸s;

        /* renamed from: t  reason: contains not printable characters */
        public DialogInterface.OnDismissListener f۱۰۹۲۹t;

        /* renamed from: u  reason: contains not printable characters */
        public DialogInterface.OnKeyListener f۱۰۹۳۰u;

        /* renamed from: v  reason: contains not printable characters */
        public CharSequence[] f۱۰۹۳۱v;

        /* renamed from: w  reason: contains not printable characters */
        public ListAdapter f۱۰۹۳۲w;

        /* renamed from: x  reason: contains not printable characters */
        public DialogInterface.OnClickListener f۱۰۹۳۳x;

        /* renamed from: y  reason: contains not printable characters */
        public int f۱۰۹۳۴y;

        /* renamed from: z  reason: contains not printable characters */
        public View f۱۰۹۳۵z;

        /* renamed from: android.support.v7.app.AlertController$f$e  reason: invalid class name */
        public interface AbstractCe {
            /* renamed from: a  reason: contains not printable characters */
            void m۱۳۴۰۸a(ListView listView);
        }

        public Cf(Context context) {
            this.f۱۰۹۱۰a = context;
            this.f۱۰۹۲۷r = true;
            this.f۱۰۹۱۱b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۴۰۷a(AlertController dialog) {
            View view = this.f۱۰۹۱۶g;
            if (view != null) {
                dialog.m۱۳۳۹۵a(view);
            } else {
                CharSequence charSequence = this.f۱۰۹۱۵f;
                if (charSequence != null) {
                    dialog.m۱۳۴۰۱b(charSequence);
                }
                Drawable drawable = this.f۱۰۹۱۳d;
                if (drawable != null) {
                    dialog.m۱۳۳۹۴a(drawable);
                }
                int i = this.f۱۰۹۱۲c;
                if (i != 0) {
                    dialog.m۱۳۳۹۹b(i);
                }
                int i2 = this.f۱۰۹۱۴e;
                if (i2 != 0) {
                    dialog.m۱۳۳۹۹b(dialog.m۱۳۳۹۱a(i2));
                }
            }
            CharSequence charSequence2 = this.f۱۰۹۱۷h;
            if (charSequence2 != null) {
                dialog.m۱۳۳۹۷a(charSequence2);
            }
            if (!(this.f۱۰۹۱۸i == null && this.f۱۰۹۱۹j == null)) {
                dialog.m۱۳۳۹۳a(-1, this.f۱۰۹۱۸i, this.f۱۰۹۲۰k, (Message) null, this.f۱۰۹۱۹j);
            }
            if (!(this.f۱۰۹۲۱l == null && this.f۱۰۹۲۲m == null)) {
                dialog.m۱۳۳۹۳a(-2, this.f۱۰۹۲۱l, this.f۱۰۹۲۳n, (Message) null, this.f۱۰۹۲۲m);
            }
            if (!(this.f۱۰۹۲۴o == null && this.f۱۰۹۲۵p == null)) {
                dialog.m۱۳۳۹۳a(-3, this.f۱۰۹۲۴o, this.f۱۰۹۲۶q, (Message) null, this.f۱۰۹۲۵p);
            }
            if (!(this.f۱۰۹۳۱v == null && this.f۱۰۹۰۵K == null && this.f۱۰۹۳۲w == null)) {
                m۱۳۴۰۶b(dialog);
            }
            View view2 = this.f۱۰۹۳۵z;
            if (view2 == null) {
                int i3 = this.f۱۰۹۳۴y;
                if (i3 != 0) {
                    dialog.m۱۳۴۰۳c(i3);
                }
            } else if (this.f۱۰۸۹۹E) {
                dialog.m۱۳۳۹۶a(view2, this.f۱۰۸۹۵A, this.f۱۰۸۹۶B, this.f۱۰۸۹۷C, this.f۱۰۸۹۸D);
            } else {
                dialog.m۱۳۴۰۰b(view2);
            }
        }

        /* renamed from: b  reason: contains not printable characters */
        private void m۱۳۴۰۶b(AlertController dialog) {
            ListAdapter adapter;
            int layout;
            RecycleListView listView = (RecycleListView) this.f۱۰۹۱۱b.inflate(dialog.f۱۰۸۴۸L, (ViewGroup) null);
            if (this.f۱۰۹۰۱G) {
                Cursor cursor = this.f۱۰۹۰۵K;
                if (cursor == null) {
                    adapter = new Ca(this.f۱۰۹۱۰a, dialog.f۱۰۸۴۹M, 16908308, this.f۱۰۹۳۱v, listView);
                } else {
                    adapter = new Cb(this.f۱۰۹۱۰a, cursor, false, listView, dialog);
                }
            } else {
                if (this.f۱۰۹۰۲H) {
                    layout = dialog.f۱۰۸۵۰N;
                } else {
                    layout = dialog.f۱۰۸۵۱O;
                }
                Cursor cursor2 = this.f۱۰۹۰۵K;
                if (cursor2 != null) {
                    adapter = new SimpleCursorAdapter(this.f۱۰۹۱۰a, layout, cursor2, new String[]{this.f۱۰۹۰۶L}, new int[]{16908308});
                } else if (this.f۱۰۹۳۲w != null) {
                    adapter = this.f۱۰۹۳۲w;
                } else {
                    adapter = new Ch(this.f۱۰۹۱۰a, layout, 16908308, this.f۱۰۹۳۱v);
                }
            }
            AbstractCe eVar = this.f۱۰۹۰۹O;
            if (eVar != null) {
                eVar.m۱۳۴۰۸a(listView);
            }
            dialog.f۱۰۸۴۴H = adapter;
            dialog.f۱۰۸۴۵I = this.f۱۰۹۰۳I;
            if (this.f۱۰۹۳۳x != null) {
                listView.setOnItemClickListener(new Cc(dialog));
            } else if (this.f۱۰۹۰۴J != null) {
                listView.setOnItemClickListener(new Cd(listView, dialog));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f۱۰۹۰۸N;
            if (onItemSelectedListener != null) {
                listView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f۱۰۹۰۲H) {
                listView.setChoiceMode(1);
            } else if (this.f۱۰۹۰۱G) {
                listView.setChoiceMode(2);
            }
            dialog.f۱۰۸۶۲g = listView;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v7.app.AlertController$f$a  reason: invalid class name */
        public class Ca extends ArrayAdapter<CharSequence> {

            /* renamed from: c  reason: contains not printable characters */
            final /* synthetic */ RecycleListView f۱۰۹۳۶c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            Ca(Context x0, int x1, int x2, CharSequence[] x3, RecycleListView recycleListView) {
                super(x0, x1, x2, x3);
                this.f۱۰۹۳۶c = recycleListView;
            }

            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                boolean[] zArr = Cf.this.f۱۰۹۰۰F;
                if (zArr != null && zArr[position]) {
                    this.f۱۰۹۳۶c.setItemChecked(position, true);
                }
                return view;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v7.app.AlertController$f$b  reason: invalid class name */
        public class Cb extends CursorAdapter {

            /* renamed from: c  reason: contains not printable characters */
            private final int f۱۰۹۳۸c;

            /* renamed from: d  reason: contains not printable characters */
            private final int f۱۰۹۳۹d;

            /* renamed from: e  reason: contains not printable characters */
            final /* synthetic */ RecycleListView f۱۰۹۴۰e;

            /* renamed from: f  reason: contains not printable characters */
            final /* synthetic */ AlertController f۱۰۹۴۱f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            Cb(Context x0, Cursor x1, boolean x2, RecycleListView recycleListView, AlertController alertController) {
                super(x0, x1, x2);
                this.f۱۰۹۴۰e = recycleListView;
                this.f۱۰۹۴۱f = alertController;
                Cursor cursor = getCursor();
                this.f۱۰۹۳۸c = cursor.getColumnIndexOrThrow(Cf.this.f۱۰۹۰۶L);
                this.f۱۰۹۳۹d = cursor.getColumnIndexOrThrow(Cf.this.f۱۰۹۰۷M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f۱۰۹۳۸c));
                RecycleListView recycleListView = this.f۱۰۹۴۰e;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f۱۰۹۳۹d) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup parent) {
                return Cf.this.f۱۰۹۱۱b.inflate(this.f۱۰۹۴۱f.f۱۰۸۴۹M, parent, false);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v7.app.AlertController$f$c  reason: invalid class name */
        public class Cc implements AdapterView.OnItemClickListener {

            /* renamed from: c  reason: contains not printable characters */
            final /* synthetic */ AlertController f۱۰۹۴۳c;

            Cc(AlertController alertController) {
                this.f۱۰۹۴۳c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                Cf.this.f۱۰۹۳۳x.onClick(this.f۱۰۹۴۳c.f۱۰۸۵۷b, position);
                if (!Cf.this.f۱۰۹۰۲H) {
                    this.f۱۰۹۴۳c.f۱۰۸۵۷b.dismiss();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v7.app.AlertController$f$d  reason: invalid class name */
        public class Cd implements AdapterView.OnItemClickListener {

            /* renamed from: c  reason: contains not printable characters */
            final /* synthetic */ RecycleListView f۱۰۹۴۵c;

            /* renamed from: d  reason: contains not printable characters */
            final /* synthetic */ AlertController f۱۰۹۴۶d;

            Cd(RecycleListView recycleListView, AlertController alertController) {
                this.f۱۰۹۴۵c = recycleListView;
                this.f۱۰۹۴۶d = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                boolean[] zArr = Cf.this.f۱۰۹۰۰F;
                if (zArr != null) {
                    zArr[position] = this.f۱۰۹۴۵c.isItemChecked(position);
                }
                Cf.this.f۱۰۹۰۴J.onClick(this.f۱۰۹۴۶d.f۱۰۸۵۷b, position, this.f۱۰۹۴۵c.isItemChecked(position));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.app.AlertController$h  reason: invalid class name */
    public static class Ch extends ArrayAdapter<CharSequence> {
        public Ch(Context context, int resource, int textViewResourceId, CharSequence[] objects) {
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
