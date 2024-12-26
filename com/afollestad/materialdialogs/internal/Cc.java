package com.afollestad.materialdialogs.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p۰۴۳v4.graphics.drawable.Ca;
import android.support.p۰۴۷v7.widget.Ck;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import java.lang.reflect.Field;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.Cg;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.Cj;

@SuppressLint({"PrivateResource"})
/* renamed from: com.afollestad.materialdialogs.internal.c  reason: invalid class name */
public class Cc {
    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۶۷۷۰a(RadioButton radioButton, ColorStateList colors) {
        if (Build.VERSION.SDK_INT >= 22) {
            radioButton.setButtonTintList(colors);
            return;
        }
        Drawable d = Ca.m۱۲۷۲۲h(android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۶c(radioButton.getContext(), Cj.abc_btn_radio_material));
        Ca.m۱۲۷۰۸a(d, colors);
        radioButton.setButtonDrawable(d);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۶۷۶۹a(RadioButton radioButton, int color) {
        int disabledColor = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۸۸۹a(radioButton.getContext());
        m۱۶۷۷۰a(radioButton, new ColorStateList(new int[][]{new int[]{16842910, -16842912}, new int[]{16842910, 16842912}, new int[]{-16842910, -16842912}, new int[]{-16842910, 16842912}}, new int[]{p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۶e(radioButton.getContext(), Cg.colorControlNormal), color, disabledColor, disabledColor}));
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۶۷۶۵a(CheckBox box, ColorStateList colors) {
        if (Build.VERSION.SDK_INT >= 22) {
            box.setButtonTintList(colors);
            return;
        }
        Drawable drawable = Ca.m۱۲۷۲۲h(android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۶c(box.getContext(), Cj.abc_btn_check_material));
        Ca.m۱۲۷۰۸a(drawable, colors);
        box.setButtonDrawable(drawable);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۶۷۶۴a(CheckBox box, int color) {
        int disabledColor = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۸۸۹a(box.getContext());
        m۱۶۷۶۵a(box, new ColorStateList(new int[][]{new int[]{16842910, -16842912}, new int[]{16842910, 16842912}, new int[]{-16842910, -16842912}, new int[]{-16842910, 16842912}}, new int[]{p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۶e(box.getContext(), Cg.colorControlNormal), color, disabledColor, disabledColor}));
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۶۷۷۱a(SeekBar seekBar, int color) {
        ColorStateList s1 = ColorStateList.valueOf(color);
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            seekBar.setThumbTintList(s1);
            seekBar.setProgressTintList(s1);
        } else if (i > 10) {
            Drawable progressDrawable = Ca.m۱۲۷۲۲h(seekBar.getProgressDrawable());
            seekBar.setProgressDrawable(progressDrawable);
            Ca.m۱۲۷۰۸a(progressDrawable, s1);
            if (Build.VERSION.SDK_INT >= 16) {
                Drawable thumbDrawable = Ca.m۱۲۷۲۲h(seekBar.getThumb());
                Ca.m۱۲۷۰۸a(thumbDrawable, s1);
                seekBar.setThumb(thumbDrawable);
            }
        } else {
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            if (i <= 10) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (seekBar.getIndeterminateDrawable() != null) {
                seekBar.getIndeterminateDrawable().setColorFilter(color, mode);
            }
            if (seekBar.getProgressDrawable() != null) {
                seekBar.getProgressDrawable().setColorFilter(color, mode);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۶۷۶۷a(ProgressBar progressBar, int color) {
        m۱۶۷۶۸a(progressBar, color, false);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۶۷۶۸a(ProgressBar progressBar, int color, boolean skipIndeterminate) {
        ColorStateList sl = ColorStateList.valueOf(color);
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            progressBar.setProgressTintList(sl);
            progressBar.setSecondaryProgressTintList(sl);
            if (!skipIndeterminate) {
                progressBar.setIndeterminateTintList(sl);
                return;
            }
            return;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i <= 10) {
            mode = PorterDuff.Mode.MULTIPLY;
        }
        if (!skipIndeterminate && progressBar.getIndeterminateDrawable() != null) {
            progressBar.getIndeterminateDrawable().setColorFilter(color, mode);
        }
        if (progressBar.getProgressDrawable() != null) {
            progressBar.getProgressDrawable().setColorFilter(color, mode);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static ColorStateList m۱۶۷۶۳a(Context context, int color) {
        int[][] states = new int[3][];
        int[] colors = new int[3];
        states[0] = new int[]{-16842910};
        colors[0] = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۶e(context, Cg.colorControlNormal);
        int i = 0 + 1;
        states[i] = new int[]{-16842919, -16842908};
        colors[i] = p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۶e(context, Cg.colorControlNormal);
        int i2 = i + 1;
        states[i2] = new int[0];
        colors[i2] = color;
        return new ColorStateList(states, colors);
    }

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۶۷۷۲b(EditText editText, int color) {
        ColorStateList editTextColorStateList = m۱۶۷۶۳a(editText.getContext(), color);
        if (editText instanceof Ck) {
            ((Ck) editText).setSupportBackgroundTintList(editTextColorStateList);
        } else if (Build.VERSION.SDK_INT >= 21) {
            editText.setBackgroundTintList(editTextColorStateList);
        }
        m۱۶۷۶۶a(editText, color);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۶۷۶۶a(EditText editText, int color) {
        try {
            Field fCursorDrawableRes = TextView.class.getDeclaredField("mCursorDrawableRes");
            fCursorDrawableRes.setAccessible(true);
            int mCursorDrawableRes = fCursorDrawableRes.getInt(editText);
            Field fEditor = TextView.class.getDeclaredField("mEditor");
            fEditor.setAccessible(true);
            Object editor = fEditor.get(editText);
            Field fCursorDrawable = editor.getClass().getDeclaredField("mCursorDrawable");
            fCursorDrawable.setAccessible(true);
            Drawable[] drawables = {android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۶c(editText.getContext(), mCursorDrawableRes), android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۶c(editText.getContext(), mCursorDrawableRes)};
            drawables[0].setColorFilter(color, PorterDuff.Mode.SRC_IN);
            drawables[1].setColorFilter(color, PorterDuff.Mode.SRC_IN);
            fCursorDrawable.set(editor, drawables);
        } catch (NoSuchFieldException e1) {
            Log.d("MDTintHelper", "Device issue with cursor tinting: " + e1.getMessage());
            e1.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
