package p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.support.v4.view.AbstractCc;
import android.support.v4.view.Ch;
import android.support.v7.view.menu.Ck;
import android.support.v7.view.menu.MenuItemCl;
import android.support.v7.widget.Ch0;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuCa;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj;

/* renamed from: a.b.h.f.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cg extends MenuInflater {

    /* renamed from: e, reason: contains not printable characters */
    static final Class<?>[] f۸۸۹۸e = {Context.class};

    /* renamed from: f, reason: contains not printable characters */
    static final Class<?>[] f۸۸۹۹f = f۸۸۹۸e;

    /* renamed from: a, reason: contains not printable characters */
    final Object[] f۸۹۰۰a;

    /* renamed from: b, reason: contains not printable characters */
    final Object[] f۸۹۰۱b;

    /* renamed from: c, reason: contains not printable characters */
    Context f۸۹۰۲c;

    /* renamed from: d, reason: contains not printable characters */
    private Object f۸۹۰۳d;

    public Cg(Context context) {
        super(context);
        this.f۸۹۰۲c = context;
        this.f۸۹۰۰a = new Object[]{context};
        this.f۸۹۰۱b = this.f۸۹۰۰a;
    }

    @Override // android.view.MenuInflater
    public void inflate(int menuRes, Menu menu) {
        if (!(menu instanceof InterfaceMenuCa)) {
            super.inflate(menuRes, menu);
            return;
        }
        XmlResourceParser parser = null;
        try {
            try {
                parser = this.f۸۹۰۲c.getResources().getLayout(menuRes);
                AttributeSet attrs = Xml.asAttributeSet(parser);
                m۸۷۵۳a(parser, attrs, menu);
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } finally {
            if (parser != null) {
                parser.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r1 == 2) goto L۴۱;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r1 == 3) goto L۲۰;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        r10 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r2 == false) goto L۲۵;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r10.equals(r3) == false) goto L۲۵;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        r2 = false;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b8, code lost:
    
        r1 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r10.equals("group") == false) goto L۲۸;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        r0.m۸۷۶۳d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r10.equals("item") == false) goto L۳۸;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r0.m۸۷۶۲c() != false) goto L۶۵;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        r8 = r0.f۸۹۰۷A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (r8 == null) goto L۳۷;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (r8.mo۱۱۸۵۳a() == false) goto L۳۷;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        r0.m۸۷۶۰b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        r0.m۸۷۵۸a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r10.equals("menu") == false) goto L۶۸;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        if (r2 == false) goto L۴۳;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
    
        r10 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0097, code lost:
    
        if (r10.equals("group") == false) goto L۴۶;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0099, code lost:
    
        r0.m۸۷۵۹a(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a1, code lost:
    
        if (r10.equals("item") == false) goto L۴۹;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a3, code lost:
    
        r0.m۸۷۶۱b(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ab, code lost:
    
        if (r10.equals("menu") == false) goto L۵۲;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ad, code lost:
    
        r8 = r0.m۸۷۶۰b();
        m۸۷۵۳a(r13, r14, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b5, code lost:
    
        r2 = true;
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c4, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r7 != false) goto L۶۱;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if (r1 == 1) goto L۶۰;
     */
    /* renamed from: a, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m۸۷۵۳a(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            a.b.h.f.g$b r0 = new a.b.h.f.g$b
            r0.<init>(r15)
            int r1 = r13.getEventType()
            r2 = 0
            r3 = 0
        Lb:
            r4 = 1
            r5 = 2
            java.lang.String r6 = "menu"
            if (r1 != r5) goto L37
            java.lang.String r7 = r13.getName()
            boolean r8 = r7.equals(r6)
            if (r8 == 0) goto L20
            int r1 = r13.next()
            goto L3d
        L20:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expecting menu, got "
            r5.append(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L37:
            int r1 = r13.next()
            if (r1 != r4) goto Lb
        L3d:
            r7 = 0
        L3e:
            if (r7 != 0) goto Lc5
            if (r1 == r4) goto Lbd
            java.lang.String r8 = "item"
            java.lang.String r9 = "group"
            if (r1 == r5) goto L8c
            r10 = 3
            if (r1 == r10) goto L4d
            goto Lb8
        L4d:
            java.lang.String r10 = r13.getName()
            if (r2 == 0) goto L5c
            boolean r11 = r10.equals(r3)
            if (r11 == 0) goto L5c
            r2 = 0
            r3 = 0
            goto Lb8
        L5c:
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L66
            r0.m۸۷۶۳d()
            goto Lb8
        L66:
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L84
            boolean r8 = r0.m۸۷۶۲c()
            if (r8 != 0) goto Lb8
            android.support.v4.view.c r8 = r0.f۸۹۰۷A
            if (r8 == 0) goto L80
            boolean r8 = r8.mo۱۱۸۵۳a()
            if (r8 == 0) goto L80
            r0.m۸۷۶۰b()
            goto Lb8
        L80:
            r0.m۸۷۵۸a()
            goto Lb8
        L84:
            boolean r8 = r10.equals(r6)
            if (r8 == 0) goto Lb8
            r7 = 1
            goto Lb8
        L8c:
            if (r2 == 0) goto L8f
            goto Lb8
        L8f:
            java.lang.String r10 = r13.getName()
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L9d
            r0.m۸۷۵۹a(r14)
            goto Lb8
        L9d:
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La7
            r0.m۸۷۶۱b(r14)
            goto Lb8
        La7:
            boolean r8 = r10.equals(r6)
            if (r8 == 0) goto Lb5
            android.view.SubMenu r8 = r0.m۸۷۶۰b()
            r12.m۸۷۵۳a(r13, r14, r8)
            goto Lb8
        Lb5:
            r2 = 1
            r3 = r10
        Lb8:
            int r1 = r13.next()
            goto L3e
        Lbd:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Unexpected end of document"
            r4.<init>(r5)
            throw r4
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.Cg.m۸۷۵۳a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    /* renamed from: a, reason: contains not printable characters */
    Object m۸۷۵۴a() {
        if (this.f۸۹۰۳d == null) {
            this.f۸۹۰۳d = m۸۷۵۲a(this.f۸۹۰۲c);
        }
        return this.f۸۹۰۳d;
    }

    /* renamed from: a, reason: contains not printable characters */
    private Object m۸۷۵۲a(Object owner) {
        if (owner instanceof Activity) {
            return owner;
        }
        if (owner instanceof ContextWrapper) {
            return m۸۷۵۲a(((ContextWrapper) owner).getBaseContext());
        }
        return owner;
    }

    /* renamed from: a.b.h.f.g$a */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: contains not printable characters */
        private static final Class<?>[] f۸۹۰۴c = {MenuItem.class};

        /* renamed from: a, reason: contains not printable characters */
        private Object f۸۹۰۵a;

        /* renamed from: b, reason: contains not printable characters */
        private Method f۸۹۰۶b;

        public a(Object realOwner, String methodName) {
            this.f۸۹۰۵a = realOwner;
            Class<?> c2 = realOwner.getClass();
            try {
                this.f۸۹۰۶b = c2.getMethod(methodName, f۸۹۰۴c);
            } catch (Exception e2) {
                InflateException ex = new InflateException("Couldn't resolve menu item onClick handler " + methodName + " in class " + c2.getName());
                ex.initCause(e2);
                throw ex;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem item) {
            try {
                if (this.f۸۹۰۶b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f۸۹۰۶b.invoke(this.f۸۹۰۵a, item)).booleanValue();
                }
                this.f۸۹۰۶b.invoke(this.f۸۹۰۵a, item);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* renamed from: a.b.h.f.g$b */
    private class b {

        /* renamed from: A, reason: contains not printable characters */
        AbstractCc f۸۹۰۷A;

        /* renamed from: B, reason: contains not printable characters */
        private CharSequence f۸۹۰۸B;

        /* renamed from: C, reason: contains not printable characters */
        private CharSequence f۸۹۰۹C;

        /* renamed from: D, reason: contains not printable characters */
        private ColorStateList f۸۹۱۰D = null;

        /* renamed from: E, reason: contains not printable characters */
        private PorterDuff.Mode f۸۹۱۱E = null;

        /* renamed from: a, reason: contains not printable characters */
        private Menu f۸۹۱۳a;

        /* renamed from: b, reason: contains not printable characters */
        private int f۸۹۱۴b;

        /* renamed from: c, reason: contains not printable characters */
        private int f۸۹۱۵c;

        /* renamed from: d, reason: contains not printable characters */
        private int f۸۹۱۶d;

        /* renamed from: e, reason: contains not printable characters */
        private int f۸۹۱۷e;

        /* renamed from: f, reason: contains not printable characters */
        private boolean f۸۹۱۸f;

        /* renamed from: g, reason: contains not printable characters */
        private boolean f۸۹۱۹g;

        /* renamed from: h, reason: contains not printable characters */
        private boolean f۸۹۲۰h;

        /* renamed from: i, reason: contains not printable characters */
        private int f۸۹۲۱i;

        /* renamed from: j, reason: contains not printable characters */
        private int f۸۹۲۲j;

        /* renamed from: k, reason: contains not printable characters */
        private CharSequence f۸۹۲۳k;

        /* renamed from: l, reason: contains not printable characters */
        private CharSequence f۸۹۲۴l;

        /* renamed from: m, reason: contains not printable characters */
        private int f۸۹۲۵m;

        /* renamed from: n, reason: contains not printable characters */
        private char f۸۹۲۶n;

        /* renamed from: o, reason: contains not printable characters */
        private int f۸۹۲۷o;

        /* renamed from: p, reason: contains not printable characters */
        private char f۸۹۲۸p;

        /* renamed from: q, reason: contains not printable characters */
        private int f۸۹۲۹q;

        /* renamed from: r, reason: contains not printable characters */
        private int f۸۹۳۰r;

        /* renamed from: s, reason: contains not printable characters */
        private boolean f۸۹۳۱s;

        /* renamed from: t, reason: contains not printable characters */
        private boolean f۸۹۳۲t;

        /* renamed from: u, reason: contains not printable characters */
        private boolean f۸۹۳۳u;

        /* renamed from: v, reason: contains not printable characters */
        private int f۸۹۳۴v;

        /* renamed from: w, reason: contains not printable characters */
        private int f۸۹۳۵w;

        /* renamed from: x, reason: contains not printable characters */
        private String f۸۹۳۶x;

        /* renamed from: y, reason: contains not printable characters */
        private String f۸۹۳۷y;

        /* renamed from: z, reason: contains not printable characters */
        private String f۸۹۳۸z;

        public b(Menu menu) {
            this.f۸۹۱۳a = menu;
            m۸۷۶۳d();
        }

        /* renamed from: d, reason: contains not printable characters */
        public void m۸۷۶۳d() {
            this.f۸۹۱۴b = 0;
            this.f۸۹۱۵c = 0;
            this.f۸۹۱۶d = 0;
            this.f۸۹۱۷e = 0;
            this.f۸۹۱۸f = true;
            this.f۸۹۱۹g = true;
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۸۷۵۹a(AttributeSet attrs) {
            TypedArray a2 = Cg.this.f۸۹۰۲c.obtainStyledAttributes(attrs, Cj.MenuGroup);
            this.f۸۹۱۴b = a2.getResourceId(Cj.MenuGroup_android_id, 0);
            this.f۸۹۱۵c = a2.getInt(Cj.MenuGroup_android_menuCategory, 0);
            this.f۸۹۱۶d = a2.getInt(Cj.MenuGroup_android_orderInCategory, 0);
            this.f۸۹۱۷e = a2.getInt(Cj.MenuGroup_android_checkableBehavior, 0);
            this.f۸۹۱۸f = a2.getBoolean(Cj.MenuGroup_android_visible, true);
            this.f۸۹۱۹g = a2.getBoolean(Cj.MenuGroup_android_enabled, true);
            a2.recycle();
        }

        /* renamed from: b, reason: contains not printable characters */
        public void m۸۷۶۱b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = Cg.this.f۸۹۰۲c.obtainStyledAttributes(attributeSet, Cj.MenuItem);
            this.f۸۹۲۱i = obtainStyledAttributes.getResourceId(Cj.MenuItem_android_id, 0);
            this.f۸۹۲۲j = ((-65536) & obtainStyledAttributes.getInt(Cj.MenuItem_android_menuCategory, this.f۸۹۱۵c)) | (65535 & obtainStyledAttributes.getInt(Cj.MenuItem_android_orderInCategory, this.f۸۹۱۶d));
            this.f۸۹۲۳k = obtainStyledAttributes.getText(Cj.MenuItem_android_title);
            this.f۸۹۲۴l = obtainStyledAttributes.getText(Cj.MenuItem_android_titleCondensed);
            this.f۸۹۲۵m = obtainStyledAttributes.getResourceId(Cj.MenuItem_android_icon, 0);
            this.f۸۹۲۶n = m۸۷۵۵a(obtainStyledAttributes.getString(Cj.MenuItem_android_alphabeticShortcut));
            this.f۸۹۲۷o = obtainStyledAttributes.getInt(Cj.MenuItem_alphabeticModifiers, 4096);
            this.f۸۹۲۸p = m۸۷۵۵a(obtainStyledAttributes.getString(Cj.MenuItem_android_numericShortcut));
            this.f۸۹۲۹q = obtainStyledAttributes.getInt(Cj.MenuItem_numericModifiers, 4096);
            if (obtainStyledAttributes.hasValue(Cj.MenuItem_android_checkable)) {
                this.f۸۹۳۰r = obtainStyledAttributes.getBoolean(Cj.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f۸۹۳۰r = this.f۸۹۱۷e;
            }
            this.f۸۹۳۱s = obtainStyledAttributes.getBoolean(Cj.MenuItem_android_checked, false);
            this.f۸۹۳۲t = obtainStyledAttributes.getBoolean(Cj.MenuItem_android_visible, this.f۸۹۱۸f);
            this.f۸۹۳۳u = obtainStyledAttributes.getBoolean(Cj.MenuItem_android_enabled, this.f۸۹۱۹g);
            this.f۸۹۳۴v = obtainStyledAttributes.getInt(Cj.MenuItem_showAsAction, -1);
            this.f۸۹۳۸z = obtainStyledAttributes.getString(Cj.MenuItem_android_onClick);
            this.f۸۹۳۵w = obtainStyledAttributes.getResourceId(Cj.MenuItem_actionLayout, 0);
            this.f۸۹۳۶x = obtainStyledAttributes.getString(Cj.MenuItem_actionViewClass);
            this.f۸۹۳۷y = obtainStyledAttributes.getString(Cj.MenuItem_actionProviderClass);
            boolean z = this.f۸۹۳۷y != null;
            if (z && this.f۸۹۳۵w == 0 && this.f۸۹۳۶x == null) {
                this.f۸۹۰۷A = (AbstractCc) m۸۷۵۶a(this.f۸۹۳۷y, Cg.f۸۸۹۹f, Cg.this.f۸۹۰۱b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f۸۹۰۷A = null;
            }
            this.f۸۹۰۸B = obtainStyledAttributes.getText(Cj.MenuItem_contentDescription);
            this.f۸۹۰۹C = obtainStyledAttributes.getText(Cj.MenuItem_tooltipText);
            if (obtainStyledAttributes.hasValue(Cj.MenuItem_iconTintMode)) {
                this.f۸۹۱۱E = Ch0.m۱۳۱۸۴a(obtainStyledAttributes.getInt(Cj.MenuItem_iconTintMode, -1), this.f۸۹۱۱E);
            } else {
                this.f۸۹۱۱E = null;
            }
            if (obtainStyledAttributes.hasValue(Cj.MenuItem_iconTint)) {
                this.f۸۹۱۰D = obtainStyledAttributes.getColorStateList(Cj.MenuItem_iconTint);
            } else {
                this.f۸۹۱۰D = null;
            }
            obtainStyledAttributes.recycle();
            this.f۸۹۲۰h = false;
        }

        /* renamed from: a, reason: contains not printable characters */
        private char m۸۷۵۵a(String shortcutString) {
            if (shortcutString == null) {
                return (char) 0;
            }
            return shortcutString.charAt(0);
        }

        /* renamed from: a, reason: contains not printable characters */
        private void m۸۷۵۷a(MenuItem item) {
            item.setChecked(this.f۸۹۳۱s).setVisible(this.f۸۹۳۲t).setEnabled(this.f۸۹۳۳u).setCheckable(this.f۸۹۳۰r >= 1).setTitleCondensed(this.f۸۹۲۴l).setIcon(this.f۸۹۲۵m);
            int i = this.f۸۹۳۴v;
            if (i >= 0) {
                item.setShowAsAction(i);
            }
            if (this.f۸۹۳۸z != null) {
                if (Cg.this.f۸۹۰۲c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                item.setOnMenuItemClickListener(new a(Cg.this.m۸۷۵۴a(), this.f۸۹۳۸z));
            }
            if (item instanceof Ck) {
            }
            if (this.f۸۹۳۰r >= 2) {
                if (item instanceof Ck) {
                    ((Ck) item).m۱۱۸۳۶c(true);
                } else if (item instanceof MenuItemCl) {
                    ((MenuItemCl) item).m۱۱۸۵۱a(true);
                }
            }
            boolean actionViewSpecified = false;
            String str = this.f۸۹۳۶x;
            if (str != null) {
                View actionView = (View) m۸۷۵۶a(str, Cg.f۸۸۹۸e, Cg.this.f۸۹۰۰a);
                item.setActionView(actionView);
                actionViewSpecified = true;
            }
            int i2 = this.f۸۹۳۵w;
            if (i2 > 0) {
                if (!actionViewSpecified) {
                    item.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            AbstractCc abstractCc = this.f۸۹۰۷A;
            if (abstractCc != null) {
                Ch.m۱۰۸۴۶a(item, abstractCc);
            }
            Ch.m۱۰۸۵۰a(item, this.f۸۹۰۸B);
            Ch.m۱۰۸۵۲b(item, this.f۸۹۰۹C);
            Ch.m۱۰۸۴۷a(item, this.f۸۹۲۶n, this.f۸۹۲۷o);
            Ch.m۱۰۸۵۱b(item, this.f۸۹۲۸p, this.f۸۹۲۹q);
            PorterDuff.Mode mode = this.f۸۹۱۱E;
            if (mode != null) {
                Ch.m۱۰۸۴۹a(item, mode);
            }
            ColorStateList colorStateList = this.f۸۹۱۰D;
            if (colorStateList != null) {
                Ch.m۱۰۸۴۸a(item, colorStateList);
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۸۷۵۸a() {
            this.f۸۹۲۰h = true;
            m۸۷۵۷a(this.f۸۹۱۳a.add(this.f۸۹۱۴b, this.f۸۹۲۱i, this.f۸۹۲۲j, this.f۸۹۲۳k));
        }

        /* renamed from: b, reason: contains not printable characters */
        public SubMenu m۸۷۶۰b() {
            this.f۸۹۲۰h = true;
            SubMenu subMenu = this.f۸۹۱۳a.addSubMenu(this.f۸۹۱۴b, this.f۸۹۲۱i, this.f۸۹۲۲j, this.f۸۹۲۳k);
            m۸۷۵۷a(subMenu.getItem());
            return subMenu;
        }

        /* renamed from: c, reason: contains not printable characters */
        public boolean m۸۷۶۲c() {
            return this.f۸۹۲۰h;
        }

        /* renamed from: a, reason: contains not printable characters */
        private <T> T m۸۷۵۶a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Cg.this.f۸۹۰۲c.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }
    }
}
