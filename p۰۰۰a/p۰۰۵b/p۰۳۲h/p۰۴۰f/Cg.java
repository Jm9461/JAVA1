package p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.support.p۰۴۳v4.view.AbstractCc;
import android.support.p۰۴۳v4.view.Ch;
import android.support.p۰۴۷v7.view.menu.Ck;
import android.support.p۰۴۷v7.view.menu.MenuItemCl;
import android.support.p۰۴۷v7.widget.Ch0;
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
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuCa;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;

/* renamed from: a.b.h.f.g  reason: invalid class name */
public class Cg extends MenuInflater {

    /* renamed from: e  reason: contains not printable characters */
    static final Class<?>[] f۸۸۹۸e = {Context.class};

    /* renamed from: f  reason: contains not printable characters */
    static final Class<?>[] f۸۸۹۹f = f۸۸۹۸e;

    /* renamed from: a  reason: contains not printable characters */
    final Object[] f۸۹۰۰a;

    /* renamed from: b  reason: contains not printable characters */
    final Object[] f۸۹۰۱b = this.f۸۹۰۰a;

    /* renamed from: c  reason: contains not printable characters */
    Context f۸۹۰۲c;

    /* renamed from: d  reason: contains not printable characters */
    private Object f۸۹۰۳d;

    public Cg(Context context) {
        super(context);
        this.f۸۹۰۲c = context;
        this.f۸۹۰۰a = new Object[]{context};
    }

    public void inflate(int menuRes, Menu menu) {
        if (!(menu instanceof AbstractMenuCa)) {
            super.inflate(menuRes, menu);
            return;
        }
        XmlResourceParser parser = null;
        try {
            parser = this.f۸۹۰۲c.getResources().getLayout(menuRes);
            m۱۰۸۲۲a(parser, Xml.asAttributeSet(parser), menu);
            if (parser != null) {
                parser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (parser != null) {
                parser.close();
            }
            throw th;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۸۲۲a(XmlPullParser parser, AttributeSet attrs, Menu menu) {
        Cb menuState = new Cb(menu);
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
                            menuState.m۱۰۸۳۲d();
                        } else if (tagName2.equals("item")) {
                            if (!menuState.m۱۰۸۳۱c()) {
                                AbstractCc cVar = menuState.f۸۹۰۷A;
                                if (cVar == null || !cVar.m۱۲۸۰۹a()) {
                                    menuState.m۱۰۸۲۷a();
                                } else {
                                    menuState.m۱۰۸۲۹b();
                                }
                            }
                        } else if (tagName2.equals("menu")) {
                            reachedEndOfMenu = true;
                        }
                    }
                } else if (!lookingForEndOfUnknownTag) {
                    String tagName3 = parser.getName();
                    if (tagName3.equals("group")) {
                        menuState.m۱۰۸۲۸a(attrs);
                    } else if (tagName3.equals("item")) {
                        menuState.m۱۰۸۳۰b(attrs);
                    } else if (tagName3.equals("menu")) {
                        m۱۰۸۲۲a(parser, attrs, menuState.m۱۰۸۲۹b());
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
    /* renamed from: a  reason: contains not printable characters */
    public Object m۱۰۸۲۳a() {
        if (this.f۸۹۰۳d == null) {
            this.f۸۹۰۳d = m۱۰۸۲۱a(this.f۸۹۰۲c);
        }
        return this.f۸۹۰۳d;
    }

    /* renamed from: a  reason: contains not printable characters */
    private Object m۱۰۸۲۱a(Object owner) {
        if (!(owner instanceof Activity) && (owner instanceof ContextWrapper)) {
            return m۱۰۸۲۱a(((ContextWrapper) owner).getBaseContext());
        }
        return owner;
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.h.f.g$a  reason: invalid class name */
    public static class MenuItem$OnMenuItemClickListenerCa implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: contains not printable characters */
        private static final Class<?>[] f۸۹۰۴c = {MenuItem.class};

        /* renamed from: a  reason: contains not printable characters */
        private Object f۸۹۰۵a;

        /* renamed from: b  reason: contains not printable characters */
        private Method f۸۹۰۶b;

        public MenuItem$OnMenuItemClickListenerCa(Object realOwner, String methodName) {
            this.f۸۹۰۵a = realOwner;
            Class<?> c = realOwner.getClass();
            try {
                this.f۸۹۰۶b = c.getMethod(methodName, f۸۹۰۴c);
            } catch (Exception e) {
                InflateException ex = new InflateException("Couldn't resolve menu item onClick handler " + methodName + " in class " + c.getName());
                ex.initCause(e);
                throw ex;
            }
        }

        public boolean onMenuItemClick(MenuItem item) {
            try {
                if (this.f۸۹۰۶b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f۸۹۰۶b.invoke(this.f۸۹۰۵a, item)).booleanValue();
                }
                this.f۸۹۰۶b.invoke(this.f۸۹۰۵a, item);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.h.f.g$b  reason: invalid class name */
    public class Cb {

        /* renamed from: A  reason: contains not printable characters */
        AbstractCc f۸۹۰۷A;

        /* renamed from: B  reason: contains not printable characters */
        private CharSequence f۸۹۰۸B;

        /* renamed from: C  reason: contains not printable characters */
        private CharSequence f۸۹۰۹C;

        /* renamed from: D  reason: contains not printable characters */
        private ColorStateList f۸۹۱۰D = null;

        /* renamed from: E  reason: contains not printable characters */
        private PorterDuff.Mode f۸۹۱۱E = null;

        /* renamed from: a  reason: contains not printable characters */
        private Menu f۸۹۱۳a;

        /* renamed from: b  reason: contains not printable characters */
        private int f۸۹۱۴b;

        /* renamed from: c  reason: contains not printable characters */
        private int f۸۹۱۵c;

        /* renamed from: d  reason: contains not printable characters */
        private int f۸۹۱۶d;

        /* renamed from: e  reason: contains not printable characters */
        private int f۸۹۱۷e;

        /* renamed from: f  reason: contains not printable characters */
        private boolean f۸۹۱۸f;

        /* renamed from: g  reason: contains not printable characters */
        private boolean f۸۹۱۹g;

        /* renamed from: h  reason: contains not printable characters */
        private boolean f۸۹۲۰h;

        /* renamed from: i  reason: contains not printable characters */
        private int f۸۹۲۱i;

        /* renamed from: j  reason: contains not printable characters */
        private int f۸۹۲۲j;

        /* renamed from: k  reason: contains not printable characters */
        private CharSequence f۸۹۲۳k;

        /* renamed from: l  reason: contains not printable characters */
        private CharSequence f۸۹۲۴l;

        /* renamed from: m  reason: contains not printable characters */
        private int f۸۹۲۵m;

        /* renamed from: n  reason: contains not printable characters */
        private char f۸۹۲۶n;

        /* renamed from: o  reason: contains not printable characters */
        private int f۸۹۲۷o;

        /* renamed from: p  reason: contains not printable characters */
        private char f۸۹۲۸p;

        /* renamed from: q  reason: contains not printable characters */
        private int f۸۹۲۹q;

        /* renamed from: r  reason: contains not printable characters */
        private int f۸۹۳۰r;

        /* renamed from: s  reason: contains not printable characters */
        private boolean f۸۹۳۱s;

        /* renamed from: t  reason: contains not printable characters */
        private boolean f۸۹۳۲t;

        /* renamed from: u  reason: contains not printable characters */
        private boolean f۸۹۳۳u;

        /* renamed from: v  reason: contains not printable characters */
        private int f۸۹۳۴v;

        /* renamed from: w  reason: contains not printable characters */
        private int f۸۹۳۵w;

        /* renamed from: x  reason: contains not printable characters */
        private String f۸۹۳۶x;

        /* renamed from: y  reason: contains not printable characters */
        private String f۸۹۳۷y;

        /* renamed from: z  reason: contains not printable characters */
        private String f۸۹۳۸z;

        public Cb(Menu menu) {
            this.f۸۹۱۳a = menu;
            m۱۰۸۳۲d();
        }

        /* renamed from: d  reason: contains not printable characters */
        public void m۱۰۸۳۲d() {
            this.f۸۹۱۴b = 0;
            this.f۸۹۱۵c = 0;
            this.f۸۹۱۶d = 0;
            this.f۸۹۱۷e = 0;
            this.f۸۹۱۸f = true;
            this.f۸۹۱۹g = true;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۸۲۸a(AttributeSet attrs) {
            TypedArray a = Cg.this.f۸۹۰۲c.obtainStyledAttributes(attrs, Cj.MenuGroup);
            this.f۸۹۱۴b = a.getResourceId(Cj.MenuGroup_android_id, 0);
            this.f۸۹۱۵c = a.getInt(Cj.MenuGroup_android_menuCategory, 0);
            this.f۸۹۱۶d = a.getInt(Cj.MenuGroup_android_orderInCategory, 0);
            this.f۸۹۱۷e = a.getInt(Cj.MenuGroup_android_checkableBehavior, 0);
            this.f۸۹۱۸f = a.getBoolean(Cj.MenuGroup_android_visible, true);
            this.f۸۹۱۹g = a.getBoolean(Cj.MenuGroup_android_enabled, true);
            a.recycle();
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۰۸۳۰b(AttributeSet attrs) {
            TypedArray a = Cg.this.f۸۹۰۲c.obtainStyledAttributes(attrs, Cj.MenuItem);
            this.f۸۹۲۱i = a.getResourceId(Cj.MenuItem_android_id, 0);
            this.f۸۹۲۲j = (-65536 & a.getInt(Cj.MenuItem_android_menuCategory, this.f۸۹۱۵c)) | (65535 & a.getInt(Cj.MenuItem_android_orderInCategory, this.f۸۹۱۶d));
            this.f۸۹۲۳k = a.getText(Cj.MenuItem_android_title);
            this.f۸۹۲۴l = a.getText(Cj.MenuItem_android_titleCondensed);
            this.f۸۹۲۵m = a.getResourceId(Cj.MenuItem_android_icon, 0);
            this.f۸۹۲۶n = m۱۰۸۲۴a(a.getString(Cj.MenuItem_android_alphabeticShortcut));
            this.f۸۹۲۷o = a.getInt(Cj.MenuItem_alphabeticModifiers, 4096);
            this.f۸۹۲۸p = m۱۰۸۲۴a(a.getString(Cj.MenuItem_android_numericShortcut));
            this.f۸۹۲۹q = a.getInt(Cj.MenuItem_numericModifiers, 4096);
            if (a.hasValue(Cj.MenuItem_android_checkable)) {
                this.f۸۹۳۰r = a.getBoolean(Cj.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f۸۹۳۰r = this.f۸۹۱۷e;
            }
            this.f۸۹۳۱s = a.getBoolean(Cj.MenuItem_android_checked, false);
            this.f۸۹۳۲t = a.getBoolean(Cj.MenuItem_android_visible, this.f۸۹۱۸f);
            this.f۸۹۳۳u = a.getBoolean(Cj.MenuItem_android_enabled, this.f۸۹۱۹g);
            this.f۸۹۳۴v = a.getInt(Cj.MenuItem_showAsAction, -1);
            this.f۸۹۳۸z = a.getString(Cj.MenuItem_android_onClick);
            this.f۸۹۳۵w = a.getResourceId(Cj.MenuItem_actionLayout, 0);
            this.f۸۹۳۶x = a.getString(Cj.MenuItem_actionViewClass);
            this.f۸۹۳۷y = a.getString(Cj.MenuItem_actionProviderClass);
            boolean hasActionProvider = this.f۸۹۳۷y != null;
            if (hasActionProvider && this.f۸۹۳۵w == 0 && this.f۸۹۳۶x == null) {
                this.f۸۹۰۷A = (AbstractCc) m۱۰۸۲۵a(this.f۸۹۳۷y, Cg.f۸۸۹۹f, Cg.this.f۸۹۰۱b);
            } else {
                if (hasActionProvider) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f۸۹۰۷A = null;
            }
            this.f۸۹۰۸B = a.getText(Cj.MenuItem_contentDescription);
            this.f۸۹۰۹C = a.getText(Cj.MenuItem_tooltipText);
            if (a.hasValue(Cj.MenuItem_iconTintMode)) {
                this.f۸۹۱۱E = Ch0.m۱۵۲۵۴a(a.getInt(Cj.MenuItem_iconTintMode, -1), this.f۸۹۱۱E);
            } else {
                this.f۸۹۱۱E = null;
            }
            if (a.hasValue(Cj.MenuItem_iconTint)) {
                this.f۸۹۱۰D = a.getColorStateList(Cj.MenuItem_iconTint);
            } else {
                this.f۸۹۱۰D = null;
            }
            a.recycle();
            this.f۸۹۲۰h = false;
        }

        /* renamed from: a  reason: contains not printable characters */
        private char m۱۰۸۲۴a(String shortcutString) {
            if (shortcutString == null) {
                return 0;
            }
            return shortcutString.charAt(0);
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۰۸۲۶a(MenuItem item) {
            item.setChecked(this.f۸۹۳۱s).setVisible(this.f۸۹۳۲t).setEnabled(this.f۸۹۳۳u).setCheckable(this.f۸۹۳۰r >= 1).setTitleCondensed(this.f۸۹۲۴l).setIcon(this.f۸۹۲۵m);
            int i = this.f۸۹۳۴v;
            if (i >= 0) {
                item.setShowAsAction(i);
            }
            if (this.f۸۹۳۸z != null) {
                if (!Cg.this.f۸۹۰۲c.isRestricted()) {
                    item.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerCa(Cg.this.m۱۰۸۲۳a(), this.f۸۹۳۸z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (item instanceof Ck) {
                Ck kVar = (Ck) item;
            }
            if (this.f۸۹۳۰r >= 2) {
                if (item instanceof Ck) {
                    ((Ck) item).m۱۳۹۰۶c(true);
                } else if (item instanceof MenuItemCl) {
                    ((MenuItemCl) item).m۱۳۹۲۱a(true);
                }
            }
            boolean actionViewSpecified = false;
            String str = this.f۸۹۳۶x;
            if (str != null) {
                item.setActionView((View) m۱۰۸۲۵a(str, Cg.f۸۸۹۸e, Cg.this.f۸۹۰۰a));
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
            AbstractCc cVar = this.f۸۹۰۷A;
            if (cVar != null) {
                Ch.m۱۲۹۱۶a(item, cVar);
            }
            Ch.m۱۲۹۲۰a(item, this.f۸۹۰۸B);
            Ch.m۱۲۹۲۲b(item, this.f۸۹۰۹C);
            Ch.m۱۲۹۱۷a(item, this.f۸۹۲۶n, this.f۸۹۲۷o);
            Ch.m۱۲۹۲۱b(item, this.f۸۹۲۸p, this.f۸۹۲۹q);
            PorterDuff.Mode mode = this.f۸۹۱۱E;
            if (mode != null) {
                Ch.m۱۲۹۱۹a(item, mode);
            }
            ColorStateList colorStateList = this.f۸۹۱۰D;
            if (colorStateList != null) {
                Ch.m۱۲۹۱۸a(item, colorStateList);
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۸۲۷a() {
            this.f۸۹۲۰h = true;
            m۱۰۸۲۶a(this.f۸۹۱۳a.add(this.f۸۹۱۴b, this.f۸۹۲۱i, this.f۸۹۲۲j, this.f۸۹۲۳k));
        }

        /* renamed from: b  reason: contains not printable characters */
        public SubMenu m۱۰۸۲۹b() {
            this.f۸۹۲۰h = true;
            SubMenu subMenu = this.f۸۹۱۳a.addSubMenu(this.f۸۹۱۴b, this.f۸۹۲۱i, this.f۸۹۲۲j, this.f۸۹۲۳k);
            m۱۰۸۲۶a(subMenu.getItem());
            return subMenu;
        }

        /* renamed from: c  reason: contains not printable characters */
        public boolean m۱۰۸۳۱c() {
            return this.f۸۹۲۰h;
        }

        /* renamed from: a  reason: contains not printable characters */
        private <T> T m۱۰۸۲۵a(String className, Class<?>[] constructorSignature, Object[] arguments) {
            try {
                Constructor<?> constructor = Cg.this.f۸۹۰۲c.getClassLoader().loadClass(className).getConstructor(constructorSignature);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(arguments);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + className, e);
                return null;
            }
        }
    }
}
