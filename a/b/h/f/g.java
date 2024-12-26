package a.b.h.f;

import a.b.h.a.j;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.support.v4.view.c;
import android.support.v4.view.h;
import android.support.v7.view.menu.k;
import android.support.v7.view.menu.l;
import android.support.v7.widget.h0;
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
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class<?>[] f۴۷۹e = {Context.class};

    /* renamed from: f  reason: collision with root package name */
    static final Class<?>[] f۴۸۰f = f۴۷۹e;

    /* renamed from: a  reason: collision with root package name */
    final Object[] f۴۸۱a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f۴۸۲b = this.f۴۸۱a;

    /* renamed from: c  reason: collision with root package name */
    Context f۴۸۳c;

    /* renamed from: d  reason: collision with root package name */
    private Object f۴۸۴d;

    public g(Context context) {
        super(context);
        this.f۴۸۳c = context;
        this.f۴۸۱a = new Object[]{context};
    }

    public void inflate(int menuRes, Menu menu) {
        if (!(menu instanceof a.b.g.b.a.a)) {
            super.inflate(menuRes, menu);
            return;
        }
        XmlResourceParser parser = null;
        try {
            parser = this.f۴۸۳c.getResources().getLayout(menuRes);
            a(parser, Xml.asAttributeSet(parser), menu);
            if (parser != null) {
                parser.close();
            }
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (parser != null) {
                parser.close();
            }
            throw th;
        }
    }

    private void a(XmlPullParser parser, AttributeSet attrs, Menu menu) {
        b menuState = new b(menu);
        int eventType = parser.getEventType();
        boolean lookingForEndOfUnknownTag = false;
        String unknownTagName = null;
        while (true) {
            if (eventType != 2) {
                eventType = parser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String tagName = parser.getName();
                if (tagName.equals("menu")) {
                    eventType = parser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + tagName);
                }
            }
        }
        boolean reachedEndOfMenu = false;
        while (!reachedEndOfMenu) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String tagName2 = parser.getName();
                        if (lookingForEndOfUnknownTag && tagName2.equals(unknownTagName)) {
                            lookingForEndOfUnknownTag = false;
                            unknownTagName = null;
                        } else if (tagName2.equals("group")) {
                            menuState.d();
                        } else if (tagName2.equals("item")) {
                            if (!menuState.c()) {
                                c cVar = menuState.A;
                                if (cVar == null || !cVar.a()) {
                                    menuState.a();
                                } else {
                                    menuState.b();
                                }
                            }
                        } else if (tagName2.equals("menu")) {
                            reachedEndOfMenu = true;
                        }
                    }
                } else if (!lookingForEndOfUnknownTag) {
                    String tagName3 = parser.getName();
                    if (tagName3.equals("group")) {
                        menuState.a(attrs);
                    } else if (tagName3.equals("item")) {
                        menuState.b(attrs);
                    } else if (tagName3.equals("menu")) {
                        a(parser, attrs, menuState.b());
                    } else {
                        lookingForEndOfUnknownTag = true;
                        unknownTagName = tagName3;
                    }
                }
                eventType = parser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object a() {
        if (this.f۴۸۴d == null) {
            this.f۴۸۴d = a(this.f۴۸۳c);
        }
        return this.f۴۸۴d;
    }

    private Object a(Object owner) {
        if (!(owner instanceof Activity) && (owner instanceof ContextWrapper)) {
            return a(((ContextWrapper) owner).getBaseContext());
        }
        return owner;
    }

    /* access modifiers changed from: private */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?>[] f۴۸۵c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        private Object f۴۸۶a;

        /* renamed from: b  reason: collision with root package name */
        private Method f۴۸۷b;

        public a(Object realOwner, String methodName) {
            this.f۴۸۶a = realOwner;
            Class<?> c2 = realOwner.getClass();
            try {
                this.f۴۸۷b = c2.getMethod(methodName, f۴۸۵c);
            } catch (Exception e2) {
                InflateException ex = new InflateException("Couldn't resolve menu item onClick handler " + methodName + " in class " + c2.getName());
                ex.initCause(e2);
                throw ex;
            }
        }

        public boolean onMenuItemClick(MenuItem item) {
            try {
                if (this.f۴۸۷b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f۴۸۷b.invoke(this.f۴۸۶a, item)).booleanValue();
                }
                this.f۴۸۷b.invoke(this.f۴۸۶a, item);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* access modifiers changed from: private */
    public class b {
        c A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        private Menu f۴۸۸a;

        /* renamed from: b  reason: collision with root package name */
        private int f۴۸۹b;

        /* renamed from: c  reason: collision with root package name */
        private int f۴۹۰c;

        /* renamed from: d  reason: collision with root package name */
        private int f۴۹۱d;

        /* renamed from: e  reason: collision with root package name */
        private int f۴۹۲e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f۴۹۳f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f۴۹۴g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f۴۹۵h;
        private int i;
        private int j;
        private CharSequence k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.f۴۸۸a = menu;
            d();
        }

        public void d() {
            this.f۴۸۹b = 0;
            this.f۴۹۰c = 0;
            this.f۴۹۱d = 0;
            this.f۴۹۲e = 0;
            this.f۴۹۳f = true;
            this.f۴۹۴g = true;
        }

        public void a(AttributeSet attrs) {
            TypedArray a2 = g.this.f۴۸۳c.obtainStyledAttributes(attrs, j.MenuGroup);
            this.f۴۸۹b = a2.getResourceId(j.MenuGroup_android_id, 0);
            this.f۴۹۰c = a2.getInt(j.MenuGroup_android_menuCategory, 0);
            this.f۴۹۱d = a2.getInt(j.MenuGroup_android_orderInCategory, 0);
            this.f۴۹۲e = a2.getInt(j.MenuGroup_android_checkableBehavior, 0);
            this.f۴۹۳f = a2.getBoolean(j.MenuGroup_android_visible, true);
            this.f۴۹۴g = a2.getBoolean(j.MenuGroup_android_enabled, true);
            a2.recycle();
        }

        public void b(AttributeSet attrs) {
            TypedArray a2 = g.this.f۴۸۳c.obtainStyledAttributes(attrs, j.MenuItem);
            this.i = a2.getResourceId(j.MenuItem_android_id, 0);
            this.j = (-65536 & a2.getInt(j.MenuItem_android_menuCategory, this.f۴۹۰c)) | (65535 & a2.getInt(j.MenuItem_android_orderInCategory, this.f۴۹۱d));
            this.k = a2.getText(j.MenuItem_android_title);
            this.l = a2.getText(j.MenuItem_android_titleCondensed);
            this.m = a2.getResourceId(j.MenuItem_android_icon, 0);
            this.n = a(a2.getString(j.MenuItem_android_alphabeticShortcut));
            this.o = a2.getInt(j.MenuItem_alphabeticModifiers, 4096);
            this.p = a(a2.getString(j.MenuItem_android_numericShortcut));
            this.q = a2.getInt(j.MenuItem_numericModifiers, 4096);
            if (a2.hasValue(j.MenuItem_android_checkable)) {
                this.r = a2.getBoolean(j.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.r = this.f۴۹۲e;
            }
            this.s = a2.getBoolean(j.MenuItem_android_checked, false);
            this.t = a2.getBoolean(j.MenuItem_android_visible, this.f۴۹۳f);
            this.u = a2.getBoolean(j.MenuItem_android_enabled, this.f۴۹۴g);
            this.v = a2.getInt(j.MenuItem_showAsAction, -1);
            this.z = a2.getString(j.MenuItem_android_onClick);
            this.w = a2.getResourceId(j.MenuItem_actionLayout, 0);
            this.x = a2.getString(j.MenuItem_actionViewClass);
            this.y = a2.getString(j.MenuItem_actionProviderClass);
            boolean hasActionProvider = this.y != null;
            if (hasActionProvider && this.w == 0 && this.x == null) {
                this.A = (c) a(this.y, g.f۴۸۰f, g.this.f۴۸۲b);
            } else {
                if (hasActionProvider) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = a2.getText(j.MenuItem_contentDescription);
            this.C = a2.getText(j.MenuItem_tooltipText);
            if (a2.hasValue(j.MenuItem_iconTintMode)) {
                this.E = h0.a(a2.getInt(j.MenuItem_iconTintMode, -1), this.E);
            } else {
                this.E = null;
            }
            if (a2.hasValue(j.MenuItem_iconTint)) {
                this.D = a2.getColorStateList(j.MenuItem_iconTint);
            } else {
                this.D = null;
            }
            a2.recycle();
            this.f۴۹۵h = false;
        }

        private char a(String shortcutString) {
            if (shortcutString == null) {
                return 0;
            }
            return shortcutString.charAt(0);
        }

        private void a(MenuItem item) {
            item.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i2 = this.v;
            if (i2 >= 0) {
                item.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (!g.this.f۴۸۳c.isRestricted()) {
                    item.setOnMenuItemClickListener(new a(g.this.a(), this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (item instanceof k) {
                k kVar = (k) item;
            }
            if (this.r >= 2) {
                if (item instanceof k) {
                    ((k) item).c(true);
                } else if (item instanceof l) {
                    ((l) item).a(true);
                }
            }
            boolean actionViewSpecified = false;
            String str = this.x;
            if (str != null) {
                item.setActionView((View) a(str, g.f۴۷۹e, g.this.f۴۸۱a));
                actionViewSpecified = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (!actionViewSpecified) {
                    item.setActionView(i3);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            c cVar = this.A;
            if (cVar != null) {
                h.a(item, cVar);
            }
            h.a(item, this.B);
            h.b(item, this.C);
            h.a(item, this.n, this.o);
            h.b(item, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                h.a(item, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                h.a(item, colorStateList);
            }
        }

        public void a() {
            this.f۴۹۵h = true;
            a(this.f۴۸۸a.add(this.f۴۸۹b, this.i, this.j, this.k));
        }

        public SubMenu b() {
            this.f۴۹۵h = true;
            SubMenu subMenu = this.f۴۸۸a.addSubMenu(this.f۴۸۹b, this.i, this.j, this.k);
            a(subMenu.getItem());
            return subMenu;
        }

        public boolean c() {
            return this.f۴۹۵h;
        }

        private <T> T a(String className, Class<?>[] constructorSignature, Object[] arguments) {
            try {
                Constructor<?> constructor = g.this.f۴۸۳c.getClassLoader().loadClass(className).getConstructor(constructorSignature);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(arguments);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + className, e2);
                return null;
            }
        }
    }
}
