package android.support.v7.app;

import a.b.h.a.j;
import a.b.h.f.d;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.view.u;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.e;
import android.support.v7.widget.g;
import android.support.v7.widget.g1;
import android.support.v7.widget.h;
import android.support.v7.widget.k;
import android.support.v7.widget.m;
import android.support.v7.widget.o;
import android.support.v7.widget.p;
import android.support.v7.widget.s;
import android.support.v7.widget.t;
import android.support.v7.widget.v;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class AppCompatViewInflater {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> sConstructorMap = new a.b.g.g.a();
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private final Object[] mConstructorArgs = new Object[2];

    /* access modifiers changed from: package-private */
    public final View createView(View parent, String name, Context context, AttributeSet attrs, boolean inheritContext, boolean readAndroidTheme, boolean readAppTheme, boolean wrapContext) {
        View view;
        if (inheritContext && parent != null) {
            context = parent.getContext();
        }
        if (readAndroidTheme || readAppTheme) {
            context = themifyContext(context, attrs, readAndroidTheme, readAppTheme);
        }
        if (wrapContext) {
            context = g1.b(context);
        }
        char c2 = 65535;
        switch (name.hashCode()) {
            case -1946472170:
                if (name.equals("RatingBar")) {
                    c2 = 11;
                    break;
                }
                break;
            case -1455429095:
                if (name.equals("CheckedTextView")) {
                    c2 = '\b';
                    break;
                }
                break;
            case -1346021293:
                if (name.equals("MultiAutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                break;
            case -938935918:
                if (name.equals("TextView")) {
                    c2 = 0;
                    break;
                }
                break;
            case -937446323:
                if (name.equals("ImageButton")) {
                    c2 = 5;
                    break;
                }
                break;
            case -658531749:
                if (name.equals("SeekBar")) {
                    c2 = '\f';
                    break;
                }
                break;
            case -339785223:
                if (name.equals("Spinner")) {
                    c2 = 4;
                    break;
                }
                break;
            case 776382189:
                if (name.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                break;
            case 1125864064:
                if (name.equals("ImageView")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1413872058:
                if (name.equals("AutoCompleteTextView")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1601505219:
                if (name.equals("CheckBox")) {
                    c2 = 6;
                    break;
                }
                break;
            case 1666676343:
                if (name.equals("EditText")) {
                    c2 = 3;
                    break;
                }
                break;
            case 2001146706:
                if (name.equals("Button")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                view = createTextView(context, attrs);
                verifyNotNull(view, name);
                break;
            case 1:
                view = createImageView(context, attrs);
                verifyNotNull(view, name);
                break;
            case 2:
                view = createButton(context, attrs);
                verifyNotNull(view, name);
                break;
            case 3:
                view = createEditText(context, attrs);
                verifyNotNull(view, name);
                break;
            case 4:
                view = createSpinner(context, attrs);
                verifyNotNull(view, name);
                break;
            case 5:
                view = createImageButton(context, attrs);
                verifyNotNull(view, name);
                break;
            case 6:
                view = createCheckBox(context, attrs);
                verifyNotNull(view, name);
                break;
            case 7:
                view = createRadioButton(context, attrs);
                verifyNotNull(view, name);
                break;
            case '\b':
                view = createCheckedTextView(context, attrs);
                verifyNotNull(view, name);
                break;
            case '\t':
                view = createAutoCompleteTextView(context, attrs);
                verifyNotNull(view, name);
                break;
            case '\n':
                view = createMultiAutoCompleteTextView(context, attrs);
                verifyNotNull(view, name);
                break;
            case 11:
                view = createRatingBar(context, attrs);
                verifyNotNull(view, name);
                break;
            case '\f':
                view = createSeekBar(context, attrs);
                verifyNotNull(view, name);
                break;
            default:
                view = createView(context, name, attrs);
                break;
        }
        if (view == null && context != context) {
            view = createViewFromTag(context, name, attrs);
        }
        if (view != null) {
            checkOnClickListener(view, attrs);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    public AppCompatTextView createTextView(Context context, AttributeSet attrs) {
        return new AppCompatTextView(context, attrs);
    }

    /* access modifiers changed from: protected */
    public o createImageView(Context context, AttributeSet attrs) {
        return new o(context, attrs);
    }

    /* access modifiers changed from: protected */
    public g createButton(Context context, AttributeSet attrs) {
        return new g(context, attrs);
    }

    /* access modifiers changed from: protected */
    public k createEditText(Context context, AttributeSet attrs) {
        return new k(context, attrs);
    }

    /* access modifiers changed from: protected */
    public v createSpinner(Context context, AttributeSet attrs) {
        return new v(context, attrs);
    }

    /* access modifiers changed from: protected */
    public m createImageButton(Context context, AttributeSet attrs) {
        return new m(context, attrs);
    }

    /* access modifiers changed from: protected */
    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attrs) {
        return new AppCompatCheckBox(context, attrs);
    }

    /* access modifiers changed from: protected */
    public AppCompatRadioButton createRadioButton(Context context, AttributeSet attrs) {
        return new AppCompatRadioButton(context, attrs);
    }

    /* access modifiers changed from: protected */
    public h createCheckedTextView(Context context, AttributeSet attrs) {
        return new h(context, attrs);
    }

    /* access modifiers changed from: protected */
    public e createAutoCompleteTextView(Context context, AttributeSet attrs) {
        return new e(context, attrs);
    }

    /* access modifiers changed from: protected */
    public p createMultiAutoCompleteTextView(Context context, AttributeSet attrs) {
        return new p(context, attrs);
    }

    /* access modifiers changed from: protected */
    public s createRatingBar(Context context, AttributeSet attrs) {
        return new s(context, attrs);
    }

    /* access modifiers changed from: protected */
    public t createSeekBar(Context context, AttributeSet attrs) {
        return new t(context, attrs);
    }

    private void verifyNotNull(View view, String name) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + name + ">, but returned null");
        }
    }

    /* access modifiers changed from: protected */
    public View createView(Context context, String name, AttributeSet attrs) {
        return null;
    }

    private View createViewFromTag(Context context, String name, AttributeSet attrs) {
        if (name.equals("view")) {
            name = attrs.getAttributeValue(null, "class");
        }
        try {
            this.mConstructorArgs[0] = context;
            this.mConstructorArgs[1] = attrs;
            if (-1 == name.indexOf(46)) {
                for (int i = 0; i < sClassPrefixList.length; i++) {
                    View view = createViewByPrefix(context, name, sClassPrefixList[i]);
                    if (view != null) {
                        return view;
                    }
                }
                Object[] objArr = this.mConstructorArgs;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
            View createViewByPrefix = createViewByPrefix(context, name, null);
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
            return createViewByPrefix;
        } catch (Exception e2) {
            return null;
        } finally {
            Object[] objArr3 = this.mConstructorArgs;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    private void checkOnClickListener(View view, AttributeSet attrs) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || u.u(view)) {
            TypedArray a2 = context.obtainStyledAttributes(attrs, sOnClickAttrs);
            String handlerName = a2.getString(0);
            if (handlerName != null) {
                view.setOnClickListener(new a(view, handlerName));
            }
            a2.recycle();
        }
    }

    private View createViewByPrefix(Context context, String name, String prefix) {
        String str;
        Constructor<? extends View> constructor = sConstructorMap.get(name);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (prefix != null) {
                    str = prefix + name;
                } else {
                    str = name;
                }
                constructor = classLoader.loadClass(str).asSubclass(View.class).getConstructor(sConstructorSignature);
                sConstructorMap.put(name, constructor);
            } catch (Exception e2) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private static Context themifyContext(Context context, AttributeSet attrs, boolean useAndroidTheme, boolean useAppTheme) {
        TypedArray a2 = context.obtainStyledAttributes(attrs, j.View, 0, 0);
        int themeId = 0;
        if (useAndroidTheme) {
            themeId = a2.getResourceId(j.View_android_theme, 0);
        }
        if (useAppTheme && themeId == 0 && (themeId = a2.getResourceId(j.View_theme, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        a2.recycle();
        if (themeId == 0) {
            return context;
        }
        if (!(context instanceof d) || ((d) context).a() != themeId) {
            return new d(context, themeId);
        }
        return context;
    }

    /* access modifiers changed from: private */
    public static class a implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        private final View f۱۵۲۶c;

        /* renamed from: d  reason: collision with root package name */
        private final String f۱۵۲۷d;

        /* renamed from: e  reason: collision with root package name */
        private Method f۱۵۲۸e;

        /* renamed from: f  reason: collision with root package name */
        private Context f۱۵۲۹f;

        public a(View hostView, String methodName) {
            this.f۱۵۲۶c = hostView;
            this.f۱۵۲۷d = methodName;
        }

        public void onClick(View v) {
            if (this.f۱۵۲۸e == null) {
                a(this.f۱۵۲۶c.getContext(), this.f۱۵۲۷d);
            }
            try {
                this.f۱۵۲۸e.invoke(this.f۱۵۲۹f, v);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }

        private void a(Context context, String name) {
            String idText;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f۱۵۲۷d, View.class)) != null) {
                        this.f۱۵۲۸e = method;
                        this.f۱۵۲۹f = context;
                        return;
                    }
                } catch (NoSuchMethodException e2) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            int id = this.f۱۵۲۶c.getId();
            if (id == -1) {
                idText = "";
            } else {
                idText = " with id '" + this.f۱۵۲۶c.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f۱۵۲۷d + "(View) in a parent or ancestor Context for android:onClick " + "attribute defined on view " + this.f۱۵۲۶c.getClass() + idText);
        }
    }
}
