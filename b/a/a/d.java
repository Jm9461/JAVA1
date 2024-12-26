package b.a.a;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.text.method.LinkMovementMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import b.a.a.f;
import b.a.a.r.a;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import com.afollestad.materialdialogs.internal.b;
import com.afollestad.materialdialogs.internal.c;
import java.util.ArrayList;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateCircularProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable;

/* access modifiers changed from: package-private */
public class d {
    static int b(f.d builder) {
        boolean darkTheme = a.a(builder.f۲۳۵۷a, g.md_dark_theme, builder.K == p.DARK);
        builder.K = darkTheme ? p.DARK : p.LIGHT;
        return darkTheme ? m.MD_Dark : m.MD_Light;
    }

    static int a(f.d builder) {
        if (builder.s != null) {
            return l.md_dialog_custom;
        }
        if (builder.l == null && builder.X == null) {
            if (builder.k0 > -2) {
                return l.md_dialog_progress;
            }
            if (builder.i0) {
                if (builder.B0) {
                    return l.md_dialog_progress_indeterminate_horizontal;
                }
                return l.md_dialog_progress_indeterminate;
            } else if (builder.o0 != null) {
                if (builder.w0 != null) {
                    return l.md_dialog_input_check;
                }
                return l.md_dialog_input;
            } else if (builder.w0 != null) {
                return l.md_dialog_basic_check;
            } else {
                return l.md_dialog_basic;
            }
        } else if (builder.w0 != null) {
            return l.md_dialog_list_check;
        } else {
            return l.md_dialog_list;
        }
    }

    /* JADX INFO: Multiple debug info for r2v48 int: [D('d' android.graphics.drawable.Drawable), D('maxIconSize' int)] */
    static void a(f dialog) {
        boolean textAllCaps;
        int i;
        int maxIconSize;
        f.d builder = dialog.f۲۳۴۷e;
        dialog.setCancelable(builder.L);
        dialog.setCanceledOnTouchOutside(builder.M);
        if (builder.g0 == 0) {
            builder.g0 = a.a(builder.f۲۳۵۷a, g.md_background_color, a.e(dialog.getContext(), g.colorBackgroundFloating));
        }
        if (builder.g0 != 0) {
            GradientDrawable drawable = new GradientDrawable();
            drawable.setCornerRadius(builder.f۲۳۵۷a.getResources().getDimension(i.md_bg_corner_radius));
            drawable.setColor(builder.g0);
            dialog.getWindow().setBackgroundDrawable(drawable);
        }
        if (!builder.F0) {
            builder.v = a.a(builder.f۲۳۵۷a, g.md_positive_color, builder.v);
        }
        if (!builder.G0) {
            builder.x = a.a(builder.f۲۳۵۷a, g.md_neutral_color, builder.x);
        }
        if (!builder.H0) {
            builder.w = a.a(builder.f۲۳۵۷a, g.md_negative_color, builder.w);
        }
        if (!builder.I0) {
            builder.t = a.a(builder.f۲۳۵۷a, g.md_widget_color, builder.t);
        }
        if (!builder.C0) {
            builder.i = a.a(builder.f۲۳۵۷a, g.md_title_color, a.e(dialog.getContext(), 16842806));
        }
        if (!builder.D0) {
            builder.j = a.a(builder.f۲۳۵۷a, g.md_content_color, a.e(dialog.getContext(), 16842808));
        }
        if (!builder.E0) {
            builder.h0 = a.a(builder.f۲۳۵۷a, g.md_item_color, builder.j);
        }
        dialog.f۲۳۴۹g = (TextView) dialog.f۲۳۳۹c.findViewById(k.md_title);
        dialog.f۲۳۴۸f = (ImageView) dialog.f۲۳۳۹c.findViewById(k.md_icon);
        dialog.k = dialog.f۲۳۳۹c.findViewById(k.md_titleFrame);
        dialog.f۲۳۵۰h = (TextView) dialog.f۲۳۳۹c.findViewById(k.md_content);
        dialog.j = (RecyclerView) dialog.f۲۳۳۹c.findViewById(k.md_contentRecyclerView);
        dialog.q = (CheckBox) dialog.f۲۳۳۹c.findViewById(k.md_promptCheckbox);
        dialog.r = (MDButton) dialog.f۲۳۳۹c.findViewById(k.md_buttonDefaultPositive);
        dialog.s = (MDButton) dialog.f۲۳۳۹c.findViewById(k.md_buttonDefaultNeutral);
        dialog.t = (MDButton) dialog.f۲۳۳۹c.findViewById(k.md_buttonDefaultNegative);
        if (builder.o0 != null && builder.m == null) {
            builder.m = builder.f۲۳۵۷a.getText(17039370);
        }
        dialog.r.setVisibility(builder.m != null ? 0 : 8);
        dialog.s.setVisibility(builder.n != null ? 0 : 8);
        dialog.t.setVisibility(builder.o != null ? 0 : 8);
        dialog.r.setFocusable(true);
        dialog.s.setFocusable(true);
        dialog.t.setFocusable(true);
        if (builder.p) {
            dialog.r.requestFocus();
        }
        if (builder.q) {
            dialog.s.requestFocus();
        }
        if (builder.r) {
            dialog.t.requestFocus();
        }
        if (builder.U != null) {
            dialog.f۲۳۴۸f.setVisibility(0);
            dialog.f۲۳۴۸f.setImageDrawable(builder.U);
        } else {
            Drawable d2 = a.g(builder.f۲۳۵۷a, g.md_icon);
            if (d2 != null) {
                dialog.f۲۳۴۸f.setVisibility(0);
                dialog.f۲۳۴۸f.setImageDrawable(d2);
            } else {
                dialog.f۲۳۴۸f.setVisibility(8);
            }
        }
        int maxIconSize2 = builder.W;
        if (maxIconSize2 == -1) {
            maxIconSize2 = a.f(builder.f۲۳۵۷a, g.md_icon_max_size);
        }
        if (builder.V || a.d(builder.f۲۳۵۷a, g.md_icon_limit_icon_to_default_size)) {
            maxIconSize2 = builder.f۲۳۵۷a.getResources().getDimensionPixelSize(i.md_icon_max_size);
        }
        if (maxIconSize2 > -1) {
            dialog.f۲۳۴۸f.setAdjustViewBounds(true);
            dialog.f۲۳۴۸f.setMaxHeight(maxIconSize2);
            dialog.f۲۳۴۸f.setMaxWidth(maxIconSize2);
            dialog.f۲۳۴۸f.requestLayout();
        }
        if (!builder.J0) {
            builder.f0 = a.a(builder.f۲۳۵۷a, g.md_divider_color, a.e(dialog.getContext(), g.md_divider));
        }
        dialog.f۲۳۳۹c.setDividerColor(builder.f0);
        TextView textView = dialog.f۲۳۴۹g;
        if (textView != null) {
            dialog.a(textView, builder.T);
            dialog.f۲۳۴۹g.setTextColor(builder.i);
            dialog.f۲۳۴۹g.setGravity(builder.f۲۳۵۹c.a());
            if (Build.VERSION.SDK_INT >= 17) {
                dialog.f۲۳۴۹g.setTextAlignment(builder.f۲۳۵۹c.b());
            }
            CharSequence charSequence = builder.f۲۳۵۸b;
            if (charSequence == null) {
                dialog.k.setVisibility(8);
            } else {
                dialog.f۲۳۴۹g.setText(charSequence);
                dialog.k.setVisibility(0);
            }
        }
        TextView textView2 = dialog.f۲۳۵۰h;
        if (textView2 != null) {
            textView2.setMovementMethod(new LinkMovementMethod());
            dialog.a(dialog.f۲۳۵۰h, builder.S);
            dialog.f۲۳۵۰h.setLineSpacing(0.0f, builder.N);
            ColorStateList colorStateList = builder.y;
            if (colorStateList == null) {
                dialog.f۲۳۵۰h.setLinkTextColor(a.e(dialog.getContext(), 16842806));
            } else {
                dialog.f۲۳۵۰h.setLinkTextColor(colorStateList);
            }
            dialog.f۲۳۵۰h.setTextColor(builder.j);
            dialog.f۲۳۵۰h.setGravity(builder.f۲۳۶۰d.a());
            if (Build.VERSION.SDK_INT >= 17) {
                dialog.f۲۳۵۰h.setTextAlignment(builder.f۲۳۶۰d.b());
            }
            CharSequence charSequence2 = builder.k;
            if (charSequence2 != null) {
                dialog.f۲۳۵۰h.setText(charSequence2);
                dialog.f۲۳۵۰h.setVisibility(0);
            } else {
                dialog.f۲۳۵۰h.setVisibility(8);
            }
        }
        CheckBox checkBox = dialog.q;
        if (checkBox != null) {
            checkBox.setText(builder.w0);
            dialog.q.setChecked(builder.x0);
            dialog.q.setOnCheckedChangeListener(builder.y0);
            dialog.a(dialog.q, builder.S);
            dialog.q.setTextColor(builder.j);
            c.a(dialog.q, builder.t);
        }
        dialog.f۲۳۳۹c.setButtonGravity(builder.f۲۳۶۳g);
        dialog.f۲۳۳۹c.setButtonStackedGravity(builder.f۲۳۶۱e);
        dialog.f۲۳۳۹c.setStackingBehavior(builder.d0);
        if (Build.VERSION.SDK_INT >= 14) {
            textAllCaps = a.a(builder.f۲۳۵۷a, 16843660, true);
            if (textAllCaps) {
                textAllCaps = a.a(builder.f۲۳۵۷a, g.textAllCaps, true);
            }
        } else {
            textAllCaps = a.a(builder.f۲۳۵۷a, g.textAllCaps, true);
        }
        MDButton positiveTextView = dialog.r;
        dialog.a(positiveTextView, builder.T);
        positiveTextView.setAllCapsCompat(textAllCaps);
        positiveTextView.setText(builder.m);
        positiveTextView.setTextColor(builder.v);
        dialog.r.setStackedSelector(dialog.a(b.POSITIVE, true));
        dialog.r.setDefaultSelector(dialog.a(b.POSITIVE, false));
        dialog.r.setTag(b.POSITIVE);
        dialog.r.setOnClickListener(dialog);
        MDButton negativeTextView = dialog.t;
        dialog.a(negativeTextView, builder.T);
        negativeTextView.setAllCapsCompat(textAllCaps);
        negativeTextView.setText(builder.o);
        negativeTextView.setTextColor(builder.w);
        dialog.t.setStackedSelector(dialog.a(b.NEGATIVE, true));
        dialog.t.setDefaultSelector(dialog.a(b.NEGATIVE, false));
        dialog.t.setTag(b.NEGATIVE);
        dialog.t.setOnClickListener(dialog);
        MDButton neutralTextView = dialog.s;
        dialog.a(neutralTextView, builder.T);
        neutralTextView.setAllCapsCompat(textAllCaps);
        neutralTextView.setText(builder.n);
        neutralTextView.setTextColor(builder.x);
        dialog.s.setStackedSelector(dialog.a(b.NEUTRAL, true));
        dialog.s.setDefaultSelector(dialog.a(b.NEUTRAL, false));
        dialog.s.setTag(b.NEUTRAL);
        dialog.s.setOnClickListener(dialog);
        if (builder.H != null) {
            dialog.v = new ArrayList();
        }
        if (dialog.j != null) {
            RecyclerView.g<?> gVar = builder.X;
            if (gVar == null) {
                if (builder.G != null) {
                    dialog.u = f.l.SINGLE;
                } else if (builder.H != null) {
                    dialog.u = f.l.MULTI;
                    Integer[] numArr = builder.P;
                    if (numArr != null) {
                        dialog.v = new ArrayList(Arrays.asList(numArr));
                        builder.P = null;
                    }
                } else {
                    dialog.u = f.l.REGULAR;
                }
                builder.X = new a(dialog, f.l.a(dialog.u));
            } else if (gVar instanceof b) {
                ((b) gVar).a(dialog);
            }
        }
        c(dialog);
        b(dialog);
        if (builder.s != null) {
            ((MDRootLayout) dialog.f۲۳۳۹c.findViewById(k.md_root)).a();
            FrameLayout frame = (FrameLayout) dialog.f۲۳۳۹c.findViewById(k.md_customViewFrame);
            dialog.l = frame;
            View innerView = builder.s;
            if (innerView.getParent() != null) {
                ((ViewGroup) innerView.getParent()).removeView(innerView);
            }
            if (builder.e0) {
                Resources r = dialog.getContext().getResources();
                int framePadding = r.getDimensionPixelSize(i.md_dialog_frame_margin);
                ScrollView sv = new ScrollView(dialog.getContext());
                int paddingTop = r.getDimensionPixelSize(i.md_content_padding_top);
                int paddingBottom = r.getDimensionPixelSize(i.md_content_padding_bottom);
                sv.setClipToPadding(false);
                if (innerView instanceof EditText) {
                    sv.setPadding(framePadding, paddingTop, framePadding, paddingBottom);
                } else {
                    sv.setPadding(0, paddingTop, 0, paddingBottom);
                    innerView.setPadding(framePadding, 0, framePadding, 0);
                }
                maxIconSize = -1;
                i = -2;
                sv.addView(innerView, new FrameLayout.LayoutParams(-1, -2));
                innerView = sv;
            } else {
                maxIconSize = -1;
                i = -2;
            }
            frame.addView(innerView, new ViewGroup.LayoutParams(maxIconSize, i));
        }
        DialogInterface.OnShowListener onShowListener = builder.c0;
        if (onShowListener != null) {
            dialog.setOnShowListener(onShowListener);
        }
        DialogInterface.OnCancelListener onCancelListener = builder.a0;
        if (onCancelListener != null) {
            dialog.setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnDismissListener onDismissListener = builder.Z;
        if (onDismissListener != null) {
            dialog.setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnKeyListener onKeyListener = builder.b0;
        if (onKeyListener != null) {
            dialog.setOnKeyListener(onKeyListener);
        }
        dialog.a();
        dialog.h();
        dialog.a(dialog.f۲۳۳۹c);
        dialog.b();
        Display display = dialog.getWindow().getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int windowWidth = size.x;
        int windowHeight = size.y;
        int windowVerticalPadding = builder.f۲۳۵۷a.getResources().getDimensionPixelSize(i.md_dialog_vertical_margin);
        int windowHorizontalPadding = builder.f۲۳۵۷a.getResources().getDimensionPixelSize(i.md_dialog_horizontal_margin);
        dialog.f۲۳۳۹c.setMaxHeight(windowHeight - (windowVerticalPadding * 2));
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = Math.min(builder.f۲۳۵۷a.getResources().getDimensionPixelSize(i.md_dialog_max_width), windowWidth - (windowHorizontalPadding * 2));
        dialog.getWindow().setAttributes(lp);
    }

    private static void a(ProgressBar pb) {
        if (Build.VERSION.SDK_INT < 18 && pb.isHardwareAccelerated() && pb.getLayerType() != 1) {
            pb.setLayerType(1, null);
        }
    }

    private static void c(f dialog) {
        f.d builder = dialog.f۲۳۴۷e;
        if (builder.i0 || builder.k0 > -2) {
            dialog.m = (ProgressBar) dialog.f۲۳۳۹c.findViewById(16908301);
            ProgressBar progressBar = dialog.m;
            if (progressBar != null) {
                if (Build.VERSION.SDK_INT < 14) {
                    c.a(progressBar, builder.t);
                } else if (!builder.i0) {
                    HorizontalProgressDrawable d2 = new HorizontalProgressDrawable(builder.b());
                    d2.setTint(builder.t);
                    dialog.m.setProgressDrawable(d2);
                    dialog.m.setIndeterminateDrawable(d2);
                } else if (builder.B0) {
                    IndeterminateHorizontalProgressDrawable d3 = new IndeterminateHorizontalProgressDrawable(builder.b());
                    d3.setTint(builder.t);
                    dialog.m.setProgressDrawable(d3);
                    dialog.m.setIndeterminateDrawable(d3);
                } else {
                    IndeterminateCircularProgressDrawable d4 = new IndeterminateCircularProgressDrawable(builder.b());
                    d4.setTint(builder.t);
                    dialog.m.setProgressDrawable(d4);
                    dialog.m.setIndeterminateDrawable(d4);
                }
                if (!builder.i0 || builder.B0) {
                    dialog.m.setIndeterminate(builder.i0 && builder.B0);
                    dialog.m.setProgress(0);
                    dialog.m.setMax(builder.l0);
                    dialog.n = (TextView) dialog.f۲۳۳۹c.findViewById(k.md_label);
                    TextView textView = dialog.n;
                    if (textView != null) {
                        textView.setTextColor(builder.j);
                        dialog.a(dialog.n, builder.T);
                        dialog.n.setText(builder.A0.format(0L));
                    }
                    dialog.o = (TextView) dialog.f۲۳۳۹c.findViewById(k.md_minMax);
                    TextView textView2 = dialog.o;
                    if (textView2 != null) {
                        textView2.setTextColor(builder.j);
                        dialog.a(dialog.o, builder.S);
                        if (builder.j0) {
                            dialog.o.setVisibility(0);
                            dialog.o.setText(String.format(builder.z0, 0, Integer.valueOf(builder.l0)));
                            ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) dialog.m.getLayoutParams();
                            lp.leftMargin = 0;
                            lp.rightMargin = 0;
                        } else {
                            dialog.o.setVisibility(8);
                        }
                    } else {
                        builder.j0 = false;
                    }
                }
            } else {
                return;
            }
        }
        ProgressBar progressBar2 = dialog.m;
        if (progressBar2 != null) {
            a(progressBar2);
        }
    }

    private static void b(f dialog) {
        f.d builder = dialog.f۲۳۴۷e;
        dialog.i = (EditText) dialog.f۲۳۳۹c.findViewById(16908297);
        EditText editText = dialog.i;
        if (editText != null) {
            dialog.a(editText, builder.S);
            CharSequence charSequence = builder.m0;
            if (charSequence != null) {
                dialog.i.setText(charSequence);
            }
            dialog.i();
            dialog.i.setHint(builder.n0);
            dialog.i.setSingleLine();
            dialog.i.setTextColor(builder.j);
            dialog.i.setHintTextColor(a.a(builder.j, 0.3f));
            c.b(dialog.i, dialog.f۲۳۴۷e.t);
            int i = builder.q0;
            if (i != -1) {
                dialog.i.setInputType(i);
                int i2 = builder.q0;
                if (i2 != 144 && (i2 & 128) == 128) {
                    dialog.i.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
            dialog.p = (TextView) dialog.f۲۳۳۹c.findViewById(k.md_minMax);
            if (builder.s0 > 0 || builder.t0 > -1) {
                dialog.a(dialog.i.getText().toString().length(), !builder.p0);
                return;
            }
            dialog.p.setVisibility(8);
            dialog.p = null;
        }
    }
}
