package android.support.p۰۴۷v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۷v7.widget.AppCompatCheckBox;
import android.support.p۰۴۷v7.widget.AppCompatRadioButton;
import android.support.p۰۴۷v7.widget.AppCompatTextView;
import android.support.p۰۴۷v7.widget.Ce;
import android.support.p۰۴۷v7.widget.Cg;
import android.support.p۰۴۷v7.widget.Cg1;
import android.support.p۰۴۷v7.widget.Ch;
import android.support.p۰۴۷v7.widget.Ck;
import android.support.p۰۴۷v7.widget.Cm;
import android.support.p۰۴۷v7.widget.Co;
import android.support.p۰۴۷v7.widget.Cp;
import android.support.p۰۴۷v7.widget.Cs;
import android.support.p۰۴۷v7.widget.Ct;
import android.support.p۰۴۷v7.widget.Cv;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Cd;

/* renamed from: android.support.v7.app.AppCompatViewInflater */
public class AppCompatViewInflater {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> sConstructorMap = new Ca();
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
            context = Cg1.m۱۵۲۵۳b(context);
        }
        char c = 65535;
        switch (name.hashCode()) {
            case -1946472170:
                if (name.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (name.equals("CheckedTextView")) {
                    c = '\b';
                    break;
                }
                break;
            case -1346021293:
                if (name.equals("MultiAutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case -938935918:
                if (name.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (name.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (name.equals("SeekBar")) {
                    c = '\f';
                    break;
                }
                break;
            case -339785223:
                if (name.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (name.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (name.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (name.equals("AutoCompleteTextView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1601505219:
                if (name.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (name.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (name.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
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
    public Co createImageView(Context context, AttributeSet attrs) {
        return new Co(context, attrs);
    }

    /* access modifiers changed from: protected */
    public Cg createButton(Context context, AttributeSet attrs) {
        return new Cg(context, attrs);
    }

    /* access modifiers changed from: protected */
    public Ck createEditText(Context context, AttributeSet attrs) {
        return new Ck(context, attrs);
    }

    /* access modifiers changed from: protected */
    public Cv createSpinner(Context context, AttributeSet attrs) {
        return new Cv(context, attrs);
    }

    /* access modifiers changed from: protected */
    public Cm createImageButton(Context context, AttributeSet attrs) {
        return new Cm(context, attrs);
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
    public Ch createCheckedTextView(Context context, AttributeSet attrs) {
        return new Ch(context, attrs);
    }

    /* access modifiers changed from: protected */
    public Ce createAutoCompleteTextView(Context context, AttributeSet attrs) {
        return new Ce(context, attrs);
    }

    /* access modifiers changed from: protected */
    public Cp createMultiAutoCompleteTextView(Context context, AttributeSet attrs) {
        return new Cp(context, attrs);
    }

    /* access modifiers changed from: protected */
    public Cs createRatingBar(Context context, AttributeSet attrs) {
        return new Cs(context, attrs);
    }

    /* access modifiers changed from: protected */
    public Ct createSeekBar(Context context, AttributeSet attrs) {
        return new Ct(context, attrs);
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
        } catch (Exception e) {
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
        if (Build.VERSION.SDK_INT < 15 || Cu.m۱۳۰۲۴u(view)) {
            TypedArray a = context.obtainStyledAttributes(attrs, sOnClickAttrs);
            String handlerName = a.getString(0);
            if (handlerName != null) {
                view.setOnClickListener(new View$OnClickListenerCa(view, handlerName));
            }
            a.recycle();
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
            } catch (Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private static Context themifyContext(Context context, AttributeSet attrs, boolean useAndroidTheme, boolean useAppTheme) {
        TypedArray a = context.obtainStyledAttributes(attrs, Cj.View, 0, 0);
        int themeId = 0;
        if (useAndroidTheme) {
            themeId = a.getResourceId(Cj.View_android_theme, 0);
        }
        if (useAppTheme && themeId == 0 && (themeId = a.getResourceId(Cj.View_theme, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        a.recycle();
        if (themeId == 0) {
            return context;
        }
        if (!(context instanceof Cd) || ((Cd) context).m۱۰۷۹۷a() != themeId) {
            return new Cd(context, themeId);
        }
        return context;
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.app.AppCompatViewInflater$a  reason: invalid class name */
    public static class View$OnClickListenerCa implements View.OnClickListener {

        /* renamed from: c  reason: contains not printable characters */
        private final View f۱۰۹۴۹c;

        /* renamed from: d  reason: contains not printable characters */
        private final String f۱۰۹۵۰d;

        /* renamed from: e  reason: contains not printable characters */
        private Method f۱۰۹۵۱e;

        /* renamed from: f  reason: contains not printable characters */
        private Context f۱۰۹۵۲f;

        public View$OnClickListenerCa(View hostView, String methodName) {
            this.f۱۰۹۴۹c = hostView;
            this.f۱۰۹۵۰d = methodName;
        }

        public void onClick(View v) {
            if (this.f۱۰۹۵۱e == null) {
                m۱۳۴۰۹a(this.f۱۰۹۴۹c.getContext(), this.f۱۰۹۵۰d);
            }
            try {
                this.f۱۰۹۵۱e.invoke(this.f۱۰۹۵۲f, v);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۳۴۰۹a(Context context, String name) {
            String idText;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f۱۰۹۵۰d, View.class)) != null) {
                        this.f۱۰۹۵۱e = method;
                        this.f۱۰۹۵۲f = context;
                        return;
                    }
                } catch (NoSuchMethodException e) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            int id = this.f۱۰۹۴۹c.getId();
            if (id == -1) {
                idText = "";
            } else {
                idText = " with id '" + this.f۱۰۹۴۹c.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f۱۰۹۵۰d + "(View) in a parent or ancestor Context for android:onClick " + "attribute defined on view " + this.f۱۰۹۴۹c.getClass() + idText);
        }
    }
}
