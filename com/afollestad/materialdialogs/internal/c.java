package com.afollestad.materialdialogs.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.graphics.drawable.a;
import android.support.v7.widget.k;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import b.a.a.g;
import b.a.a.j;
import java.lang.reflect.Field;

@SuppressLint({"PrivateResource"})
public class c {
    public static void a(RadioButton radioButton, ColorStateList colors) {
        if (Build.VERSION.SDK_INT >= 22) {
            radioButton.setButtonTintList(colors);
            return;
        }
        Drawable d2 = a.h(android.support.v4.content.a.c(radioButton.getContext(), j.abc_btn_radio_material));
        a.a(d2, colors);
        radioButton.setButtonDrawable(d2);
    }

    public static void a(RadioButton radioButton, int color) {
        int disabledColor = b.a.a.r.a.a(radioButton.getContext());
        a(radioButton, new ColorStateList(new int[][]{new int[]{16842910, -16842912}, new int[]{16842910, 16842912}, new int[]{-16842910, -16842912}, new int[]{-16842910, 16842912}}, new int[]{b.a.a.r.a.e(radioButton.getContext(), g.colorControlNormal), color, disabledColor, disabledColor}));
    }

    public static void a(CheckBox box, ColorStateList colors) {
        if (Build.VERSION.SDK_INT >= 22) {
            box.setButtonTintList(colors);
            return;
        }
        Drawable drawable = a.h(android.support.v4.content.a.c(box.getContext(), j.abc_btn_check_material));
        a.a(drawable, colors);
        box.setButtonDrawable(drawable);
    }

    public static void a(CheckBox box, int color) {
        int disabledColor = b.a.a.r.a.a(box.getContext());
        a(box, new ColorStateList(new int[][]{new int[]{16842910, -16842912}, new int[]{16842910, 16842912}, new int[]{-16842910, -16842912}, new int[]{-16842910, 16842912}}, new int[]{b.a.a.r.a.e(box.getContext(), g.colorControlNormal), color, disabledColor, disabledColor}));
    }

    public static void a(SeekBar seekBar, int color) {
        ColorStateList s1 = ColorStateList.valueOf(color);
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            seekBar.setThumbTintList(s1);
            seekBar.setProgressTintList(s1);
        } else if (i > 10) {
            Drawable progressDrawable = a.h(seekBar.getProgressDrawable());
            seekBar.setProgressDrawable(progressDrawable);
            a.a(progressDrawable, s1);
            if (Build.VERSION.SDK_INT >= 16) {
                Drawable thumbDrawable = a.h(seekBar.getThumb());
                a.a(thumbDrawable, s1);
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

    public static void a(ProgressBar progressBar, int color) {
        a(progressBar, color, false);
    }

    private static void a(ProgressBar progressBar, int color, boolean skipIndeterminate) {
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

    private static ColorStateList a(Context context, int color) {
        int[][] states = new int[3][];
        int[] colors = new int[3];
        states[0] = new int[]{-16842910};
        colors[0] = b.a.a.r.a.e(context, g.colorControlNormal);
        int i = 0 + 1;
        states[i] = new int[]{-16842919, -16842908};
        colors[i] = b.a.a.r.a.e(context, g.colorControlNormal);
        int i2 = i + 1;
        states[i2] = new int[0];
        colors[i2] = color;
        return new ColorStateList(states, colors);
    }

    public static void b(EditText editText, int color) {
        ColorStateList editTextColorStateList = a(editText.getContext(), color);
        if (editText instanceof k) {
            ((k) editText).setSupportBackgroundTintList(editTextColorStateList);
        } else if (Build.VERSION.SDK_INT >= 21) {
            editText.setBackgroundTintList(editTextColorStateList);
        }
        a(editText, color);
    }

    private static void a(EditText editText, int color) {
        try {
            Field fCursorDrawableRes = TextView.class.getDeclaredField("mCursorDrawableRes");
            fCursorDrawableRes.setAccessible(true);
            int mCursorDrawableRes = fCursorDrawableRes.getInt(editText);
            Field fEditor = TextView.class.getDeclaredField("mEditor");
            fEditor.setAccessible(true);
            Object editor = fEditor.get(editText);
            Field fCursorDrawable = editor.getClass().getDeclaredField("mCursorDrawable");
            fCursorDrawable.setAccessible(true);
            Drawable[] drawables = {android.support.v4.content.a.c(editText.getContext(), mCursorDrawableRes), android.support.v4.content.a.c(editText.getContext(), mCursorDrawableRes)};
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
