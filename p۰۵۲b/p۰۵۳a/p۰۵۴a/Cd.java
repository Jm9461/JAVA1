package p۰۵۲b.p۰۵۳a.p۰۵۴a;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.p۰۴۷v7.widget.RecyclerView;
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
import com.afollestad.materialdialogs.internal.AbstractCb;
import com.afollestad.materialdialogs.internal.Cc;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import java.util.ArrayList;
import java.util.Arrays;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca;
import p۱۶۳me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable;
import p۱۶۳me.zhanghai.android.materialprogressbar.IndeterminateCircularProgressDrawable;
import p۱۶۳me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.d  reason: invalid class name */
public class Cd {
    /* renamed from: b  reason: contains not printable characters */
    static int m۱۵۸۱۸b(View$OnClickListenerCf.Cd builder) {
        boolean darkTheme = Ca.m۱۵۸۹۹a(builder.f۱۲۵۳۲a, Cg.md_dark_theme, builder.f۱۲۵۱۱K == EnumCp.DARK);
        builder.f۱۲۵۱۱K = darkTheme ? EnumCp.DARK : EnumCp.LIGHT;
        return darkTheme ? Cm.MD_Dark : Cm.MD_Light;
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۵۸۱۵a(View$OnClickListenerCf.Cd builder) {
        if (builder.f۱۲۵۶۸s != null) {
            return Cl.md_dialog_custom;
        }
        if (builder.f۱۲۵۵۴l == null && builder.f۱۲۵۲۹X == null) {
            if (builder.f۱۲۵۵۳k0 > -2) {
                return Cl.md_dialog_progress;
            }
            if (builder.f۱۲۵۴۹i0) {
                if (builder.f۱۲۴۹۴B0) {
                    return Cl.md_dialog_progress_indeterminate_horizontal;
                }
                return Cl.md_dialog_progress_indeterminate;
            } else if (builder.f۱۲۵۶۱o0 != null) {
                if (builder.f۱۲۵۷۷w0 != null) {
                    return Cl.md_dialog_input_check;
                }
                return Cl.md_dialog_input;
            } else if (builder.f۱۲۵۷۷w0 != null) {
                return Cl.md_dialog_basic_check;
            } else {
                return Cl.md_dialog_basic;
            }
        } else if (builder.f۱۲۵۷۷w0 != null) {
            return Cl.md_dialog_list_check;
        } else {
            return Cl.md_dialog_list;
        }
    }

    /* JADX INFO: Multiple debug info for r2v48 int: [D('d' android.graphics.drawable.Drawable), D('maxIconSize' int)] */
    /* renamed from: a  reason: contains not printable characters */
    static void m۱۵۸۱۷a(View$OnClickListenerCf dialog) {
        boolean textAllCaps;
        int i;
        int maxIconSize;
        View$OnClickListenerCf.Cd builder = dialog.f۱۲۴۶۷e;
        dialog.setCancelable(builder.f۱۲۵۱۳L);
        dialog.setCanceledOnTouchOutside(builder.f۱۲۵۱۵M);
        if (builder.f۱۲۵۴۵g0 == 0) {
            builder.f۱۲۵۴۵g0 = Ca.m۱۵۸۹۰a(builder.f۱۲۵۳۲a, Cg.md_background_color, Ca.m۱۵۹۰۶e(dialog.getContext(), Cg.colorBackgroundFloating));
        }
        if (builder.f۱۲۵۴۵g0 != 0) {
            GradientDrawable drawable = new GradientDrawable();
            drawable.setCornerRadius(builder.f۱۲۵۳۲a.getResources().getDimension(Ci.md_bg_corner_radius));
            drawable.setColor(builder.f۱۲۵۴۵g0);
            dialog.getWindow().setBackgroundDrawable(drawable);
        }
        if (!builder.f۱۲۵۰۲F0) {
            builder.f۱۲۵۷۴v = Ca.m۱۵۸۹۳a(builder.f۱۲۵۳۲a, Cg.md_positive_color, builder.f۱۲۵۷۴v);
        }
        if (!builder.f۱۲۵۰۴G0) {
            builder.f۱۲۵۷۸x = Ca.m۱۵۸۹۳a(builder.f۱۲۵۳۲a, Cg.md_neutral_color, builder.f۱۲۵۷۸x);
        }
        if (!builder.f۱۲۵۰۶H0) {
            builder.f۱۲۵۷۶w = Ca.m۱۵۸۹۳a(builder.f۱۲۵۳۲a, Cg.md_negative_color, builder.f۱۲۵۷۶w);
        }
        if (!builder.f۱۲۵۰۸I0) {
            builder.f۱۲۵۷۰t = Ca.m۱۵۸۹۰a(builder.f۱۲۵۳۲a, Cg.md_widget_color, builder.f۱۲۵۷۰t);
        }
        if (!builder.f۱۲۴۹۶C0) {
            builder.f۱۲۵۴۸i = Ca.m۱۵۸۹۰a(builder.f۱۲۵۳۲a, Cg.md_title_color, Ca.m۱۵۹۰۶e(dialog.getContext(), 16842806));
        }
        if (!builder.f۱۲۴۹۸D0) {
            builder.f۱۲۵۵۰j = Ca.m۱۵۸۹۰a(builder.f۱۲۵۳۲a, Cg.md_content_color, Ca.m۱۵۹۰۶e(dialog.getContext(), 16842808));
        }
        if (!builder.f۱۲۵۰۰E0) {
            builder.f۱۲۵۴۷h0 = Ca.m۱۵۸۹۰a(builder.f۱۲۵۳۲a, Cg.md_item_color, builder.f۱۲۵۵۰j);
        }
        dialog.f۱۲۴۶۹g = (TextView) dialog.f۱۲۴۵۹c.findViewById(Ck.md_title);
        dialog.f۱۲۴۶۸f = (ImageView) dialog.f۱۲۴۵۹c.findViewById(Ck.md_icon);
        dialog.f۱۲۴۷۳k = dialog.f۱۲۴۵۹c.findViewById(Ck.md_titleFrame);
        dialog.f۱۲۴۷۰h = (TextView) dialog.f۱۲۴۵۹c.findViewById(Ck.md_content);
        dialog.f۱۲۴۷۲j = (RecyclerView) dialog.f۱۲۴۵۹c.findViewById(Ck.md_contentRecyclerView);
        dialog.f۱۲۴۷۹q = (CheckBox) dialog.f۱۲۴۵۹c.findViewById(Ck.md_promptCheckbox);
        dialog.f۱۲۴۸۰r = (MDButton) dialog.f۱۲۴۵۹c.findViewById(Ck.md_buttonDefaultPositive);
        dialog.f۱۲۴۸۱s = (MDButton) dialog.f۱۲۴۵۹c.findViewById(Ck.md_buttonDefaultNeutral);
        dialog.f۱۲۴۸۲t = (MDButton) dialog.f۱۲۴۵۹c.findViewById(Ck.md_buttonDefaultNegative);
        if (builder.f۱۲۵۶۱o0 != null && builder.f۱۲۵۵۶m == null) {
            builder.f۱۲۵۵۶m = builder.f۱۲۵۳۲a.getText(17039370);
        }
        dialog.f۱۲۴۸۰r.setVisibility(builder.f۱۲۵۵۶m != null ? 0 : 8);
        dialog.f۱۲۴۸۱s.setVisibility(builder.f۱۲۵۵۸n != null ? 0 : 8);
        dialog.f۱۲۴۸۲t.setVisibility(builder.f۱۲۵۶۰o != null ? 0 : 8);
        dialog.f۱۲۴۸۰r.setFocusable(true);
        dialog.f۱۲۴۸۱s.setFocusable(true);
        dialog.f۱۲۴۸۲t.setFocusable(true);
        if (builder.f۱۲۵۶۲p) {
            dialog.f۱۲۴۸۰r.requestFocus();
        }
        if (builder.f۱۲۵۶۴q) {
            dialog.f۱۲۴۸۱s.requestFocus();
        }
        if (builder.f۱۲۵۶۶r) {
            dialog.f۱۲۴۸۲t.requestFocus();
        }
        if (builder.f۱۲۵۲۶U != null) {
            dialog.f۱۲۴۶۸f.setVisibility(0);
            dialog.f۱۲۴۶۸f.setImageDrawable(builder.f۱۲۵۲۶U);
        } else {
            Drawable d = Ca.m۱۵۹۰۸g(builder.f۱۲۵۳۲a, Cg.md_icon);
            if (d != null) {
                dialog.f۱۲۴۶۸f.setVisibility(0);
                dialog.f۱۲۴۶۸f.setImageDrawable(d);
            } else {
                dialog.f۱۲۴۶۸f.setVisibility(8);
            }
        }
        int maxIconSize2 = builder.f۱۲۵۲۸W;
        if (maxIconSize2 == -1) {
            maxIconSize2 = Ca.m۱۵۹۰۷f(builder.f۱۲۵۳۲a, Cg.md_icon_max_size);
        }
        if (builder.f۱۲۵۲۷V || Ca.m۱۵۹۰۵d(builder.f۱۲۵۳۲a, Cg.md_icon_limit_icon_to_default_size)) {
            maxIconSize2 = builder.f۱۲۵۳۲a.getResources().getDimensionPixelSize(Ci.md_icon_max_size);
        }
        if (maxIconSize2 > -1) {
            dialog.f۱۲۴۶۸f.setAdjustViewBounds(true);
            dialog.f۱۲۴۶۸f.setMaxHeight(maxIconSize2);
            dialog.f۱۲۴۶۸f.setMaxWidth(maxIconSize2);
            dialog.f۱۲۴۶۸f.requestLayout();
        }
        if (!builder.f۱۲۵۱۰J0) {
            builder.f۱۲۵۴۳f0 = Ca.m۱۵۸۹۰a(builder.f۱۲۵۳۲a, Cg.md_divider_color, Ca.m۱۵۹۰۶e(dialog.getContext(), Cg.md_divider));
        }
        dialog.f۱۲۴۵۹c.setDividerColor(builder.f۱۲۵۴۳f0);
        TextView textView = dialog.f۱۲۴۶۹g;
        if (textView != null) {
            dialog.m۱۵۸۲۸a(textView, builder.f۱۲۵۲۵T);
            dialog.f۱۲۴۶۹g.setTextColor(builder.f۱۲۵۴۸i);
            dialog.f۱۲۴۶۹g.setGravity(builder.f۱۲۵۳۶c.m۱۵۸۲۱a());
            if (Build.VERSION.SDK_INT >= 17) {
                dialog.f۱۲۴۶۹g.setTextAlignment(builder.f۱۲۵۳۶c.m۱۵۸۲۲b());
            }
            CharSequence charSequence = builder.f۱۲۵۳۴b;
            if (charSequence == null) {
                dialog.f۱۲۴۷۳k.setVisibility(8);
            } else {
                dialog.f۱۲۴۶۹g.setText(charSequence);
                dialog.f۱۲۴۷۳k.setVisibility(0);
            }
        }
        TextView textView2 = dialog.f۱۲۴۷۰h;
        if (textView2 != null) {
            textView2.setMovementMethod(new LinkMovementMethod());
            dialog.m۱۵۸۲۸a(dialog.f۱۲۴۷۰h, builder.f۱۲۵۲۴S);
            dialog.f۱۲۴۷۰h.setLineSpacing(0.0f, builder.f۱۲۵۱۷N);
            ColorStateList colorStateList = builder.f۱۲۵۸۰y;
            if (colorStateList == null) {
                dialog.f۱۲۴۷۰h.setLinkTextColor(Ca.m۱۵۹۰۶e(dialog.getContext(), 16842806));
            } else {
                dialog.f۱۲۴۷۰h.setLinkTextColor(colorStateList);
            }
            dialog.f۱۲۴۷۰h.setTextColor(builder.f۱۲۵۵۰j);
            dialog.f۱۲۴۷۰h.setGravity(builder.f۱۲۵۳۸d.m۱۵۸۲۱a());
            if (Build.VERSION.SDK_INT >= 17) {
                dialog.f۱۲۴۷۰h.setTextAlignment(builder.f۱۲۵۳۸d.m۱۵۸۲۲b());
            }
            CharSequence charSequence2 = builder.f۱۲۵۵۲k;
            if (charSequence2 != null) {
                dialog.f۱۲۴۷۰h.setText(charSequence2);
                dialog.f۱۲۴۷۰h.setVisibility(0);
            } else {
                dialog.f۱۲۴۷۰h.setVisibility(8);
            }
        }
        CheckBox checkBox = dialog.f۱۲۴۷۹q;
        if (checkBox != null) {
            checkBox.setText(builder.f۱۲۵۷۷w0);
            dialog.f۱۲۴۷۹q.setChecked(builder.f۱۲۵۷۹x0);
            dialog.f۱۲۴۷۹q.setOnCheckedChangeListener(builder.f۱۲۵۸۱y0);
            dialog.m۱۵۸۲۸a(dialog.f۱۲۴۷۹q, builder.f۱۲۵۲۴S);
            dialog.f۱۲۴۷۹q.setTextColor(builder.f۱۲۵۵۰j);
            Cc.m۱۶۷۶۴a(dialog.f۱۲۴۷۹q, builder.f۱۲۵۷۰t);
        }
        dialog.f۱۲۴۵۹c.setButtonGravity(builder.f۱۲۵۴۴g);
        dialog.f۱۲۴۵۹c.setButtonStackedGravity(builder.f۱۲۵۴۰e);
        dialog.f۱۲۴۵۹c.setStackingBehavior(builder.f۱۲۵۳۹d0);
        if (Build.VERSION.SDK_INT >= 14) {
            textAllCaps = Ca.m۱۵۸۹۹a(builder.f۱۲۵۳۲a, 16843660, true);
            if (textAllCaps) {
                textAllCaps = Ca.m۱۵۸۹۹a(builder.f۱۲۵۳۲a, Cg.textAllCaps, true);
            }
        } else {
            textAllCaps = Ca.m۱۵۸۹۹a(builder.f۱۲۵۳۲a, Cg.textAllCaps, true);
        }
        MDButton positiveTextView = dialog.f۱۲۴۸۰r;
        dialog.m۱۵۸۲۸a(positiveTextView, builder.f۱۲۵۲۵T);
        positiveTextView.setAllCapsCompat(textAllCaps);
        positiveTextView.setText(builder.f۱۲۵۵۶m);
        positiveTextView.setTextColor(builder.f۱۲۵۷۴v);
        dialog.f۱۲۴۸۰r.setStackedSelector(dialog.m۱۵۸۲۵a(EnumCb.POSITIVE, true));
        dialog.f۱۲۴۸۰r.setDefaultSelector(dialog.m۱۵۸۲۵a(EnumCb.POSITIVE, false));
        dialog.f۱۲۴۸۰r.setTag(EnumCb.POSITIVE);
        dialog.f۱۲۴۸۰r.setOnClickListener(dialog);
        MDButton negativeTextView = dialog.f۱۲۴۸۲t;
        dialog.m۱۵۸۲۸a(negativeTextView, builder.f۱۲۵۲۵T);
        negativeTextView.setAllCapsCompat(textAllCaps);
        negativeTextView.setText(builder.f۱۲۵۶۰o);
        negativeTextView.setTextColor(builder.f۱۲۵۷۶w);
        dialog.f۱۲۴۸۲t.setStackedSelector(dialog.m۱۵۸۲۵a(EnumCb.NEGATIVE, true));
        dialog.f۱۲۴۸۲t.setDefaultSelector(dialog.m۱۵۸۲۵a(EnumCb.NEGATIVE, false));
        dialog.f۱۲۴۸۲t.setTag(EnumCb.NEGATIVE);
        dialog.f۱۲۴۸۲t.setOnClickListener(dialog);
        MDButton neutralTextView = dialog.f۱۲۴۸۱s;
        dialog.m۱۵۸۲۸a(neutralTextView, builder.f۱۲۵۲۵T);
        neutralTextView.setAllCapsCompat(textAllCaps);
        neutralTextView.setText(builder.f۱۲۵۵۸n);
        neutralTextView.setTextColor(builder.f۱۲۵۷۸x);
        dialog.f۱۲۴۸۱s.setStackedSelector(dialog.m۱۵۸۲۵a(EnumCb.NEUTRAL, true));
        dialog.f۱۲۴۸۱s.setDefaultSelector(dialog.m۱۵۸۲۵a(EnumCb.NEUTRAL, false));
        dialog.f۱۲۴۸۱s.setTag(EnumCb.NEUTRAL);
        dialog.f۱۲۴۸۱s.setOnClickListener(dialog);
        if (builder.f۱۲۵۰۵H != null) {
            dialog.f۱۲۴۸۴v = new ArrayList();
        }
        if (dialog.f۱۲۴۷۲j != null) {
            RecyclerView.AbstractCg<?> gVar = builder.f۱۲۵۲۹X;
            if (gVar == null) {
                if (builder.f۱۲۵۰۳G != null) {
                    dialog.f۱۲۴۸۳u = View$OnClickListenerCf.EnumCl.SINGLE;
                } else if (builder.f۱۲۵۰۵H != null) {
                    dialog.f۱۲۴۸۳u = View$OnClickListenerCf.EnumCl.MULTI;
                    Integer[] numArr = builder.f۱۲۵۲۱P;
                    if (numArr != null) {
                        dialog.f۱۲۴۸۴v = new ArrayList(Arrays.asList(numArr));
                        builder.f۱۲۵۲۱P = null;
                    }
                } else {
                    dialog.f۱۲۴۸۳u = View$OnClickListenerCf.EnumCl.REGULAR;
                }
                builder.f۱۲۵۲۹X = new Ca(dialog, View$OnClickListenerCf.EnumCl.m۱۵۸۸۶a(dialog.f۱۲۴۸۳u));
            } else if (gVar instanceof AbstractCb) {
                ((AbstractCb) gVar).m۱۶۷۶۲a(dialog);
            }
        }
        m۱۵۸۲۰c(dialog);
        m۱۵۸۱۹b(dialog);
        if (builder.f۱۲۵۶۸s != null) {
            ((MDRootLayout) dialog.f۱۲۴۵۹c.findViewById(Ck.md_root)).m۱۶۷۶۰a();
            FrameLayout frame = (FrameLayout) dialog.f۱۲۴۵۹c.findViewById(Ck.md_customViewFrame);
            dialog.f۱۲۴۷۴l = frame;
            View innerView = builder.f۱۲۵۶۸s;
            if (innerView.getParent() != null) {
                ((ViewGroup) innerView.getParent()).removeView(innerView);
            }
            if (builder.f۱۲۵۴۱e0) {
                Resources r = dialog.getContext().getResources();
                int framePadding = r.getDimensionPixelSize(Ci.md_dialog_frame_margin);
                ScrollView sv = new ScrollView(dialog.getContext());
                int paddingTop = r.getDimensionPixelSize(Ci.md_content_padding_top);
                int paddingBottom = r.getDimensionPixelSize(Ci.md_content_padding_bottom);
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
        DialogInterface.OnShowListener onShowListener = builder.f۱۲۵۳۷c0;
        if (onShowListener != null) {
            dialog.setOnShowListener(onShowListener);
        }
        DialogInterface.OnCancelListener onCancelListener = builder.f۱۲۵۳۳a0;
        if (onCancelListener != null) {
            dialog.setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnDismissListener onDismissListener = builder.f۱۲۵۳۱Z;
        if (onDismissListener != null) {
            dialog.setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnKeyListener onKeyListener = builder.f۱۲۵۳۵b0;
        if (onKeyListener != null) {
            dialog.setOnKeyListener(onKeyListener);
        }
        dialog.m۱۵۸۱۳a();
        dialog.m۱۵۸۳۸h();
        dialog.m۱۵۸۱۴a(dialog.f۱۲۴۵۹c);
        dialog.m۱۵۸۳۲b();
        Display display = dialog.getWindow().getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int windowWidth = size.x;
        int windowHeight = size.y;
        int windowVerticalPadding = builder.f۱۲۵۳۲a.getResources().getDimensionPixelSize(Ci.md_dialog_vertical_margin);
        int windowHorizontalPadding = builder.f۱۲۵۳۲a.getResources().getDimensionPixelSize(Ci.md_dialog_horizontal_margin);
        dialog.f۱۲۴۵۹c.setMaxHeight(windowHeight - (windowVerticalPadding * 2));
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = Math.min(builder.f۱۲۵۳۲a.getResources().getDimensionPixelSize(Ci.md_dialog_max_width), windowWidth - (windowHorizontalPadding * 2));
        dialog.getWindow().setAttributes(lp);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۵۸۱۶a(ProgressBar pb) {
        if (Build.VERSION.SDK_INT < 18 && pb.isHardwareAccelerated() && pb.getLayerType() != 1) {
            pb.setLayerType(1, null);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private static void m۱۵۸۲۰c(View$OnClickListenerCf dialog) {
        View$OnClickListenerCf.Cd builder = dialog.f۱۲۴۶۷e;
        if (builder.f۱۲۵۴۹i0 || builder.f۱۲۵۵۳k0 > -2) {
            dialog.f۱۲۴۷۵m = (ProgressBar) dialog.f۱۲۴۵۹c.findViewById(16908301);
            ProgressBar progressBar = dialog.f۱۲۴۷۵m;
            if (progressBar != null) {
                if (Build.VERSION.SDK_INT < 14) {
                    Cc.m۱۶۷۶۷a(progressBar, builder.f۱۲۵۷۰t);
                } else if (!builder.f۱۲۵۴۹i0) {
                    HorizontalProgressDrawable d = new HorizontalProgressDrawable(builder.m۱۵۸۵۵b());
                    d.setTint(builder.f۱۲۵۷۰t);
                    dialog.f۱۲۴۷۵m.setProgressDrawable(d);
                    dialog.f۱۲۴۷۵m.setIndeterminateDrawable(d);
                } else if (builder.f۱۲۴۹۴B0) {
                    IndeterminateHorizontalProgressDrawable d2 = new IndeterminateHorizontalProgressDrawable(builder.m۱۵۸۵۵b());
                    d2.setTint(builder.f۱۲۵۷۰t);
                    dialog.f۱۲۴۷۵m.setProgressDrawable(d2);
                    dialog.f۱۲۴۷۵m.setIndeterminateDrawable(d2);
                } else {
                    IndeterminateCircularProgressDrawable d3 = new IndeterminateCircularProgressDrawable(builder.m۱۵۸۵۵b());
                    d3.setTint(builder.f۱۲۵۷۰t);
                    dialog.f۱۲۴۷۵m.setProgressDrawable(d3);
                    dialog.f۱۲۴۷۵m.setIndeterminateDrawable(d3);
                }
                if (!builder.f۱۲۵۴۹i0 || builder.f۱۲۴۹۴B0) {
                    dialog.f۱۲۴۷۵m.setIndeterminate(builder.f۱۲۵۴۹i0 && builder.f۱۲۴۹۴B0);
                    dialog.f۱۲۴۷۵m.setProgress(0);
                    dialog.f۱۲۴۷۵m.setMax(builder.f۱۲۵۵۵l0);
                    dialog.f۱۲۴۷۶n = (TextView) dialog.f۱۲۴۵۹c.findViewById(Ck.md_label);
                    TextView textView = dialog.f۱۲۴۷۶n;
                    if (textView != null) {
                        textView.setTextColor(builder.f۱۲۵۵۰j);
                        dialog.m۱۵۸۲۸a(dialog.f۱۲۴۷۶n, builder.f۱۲۵۲۵T);
                        dialog.f۱۲۴۷۶n.setText(builder.f۱۲۴۹۲A0.format(0L));
                    }
                    dialog.f۱۲۴۷۷o = (TextView) dialog.f۱۲۴۵۹c.findViewById(Ck.md_minMax);
                    TextView textView2 = dialog.f۱۲۴۷۷o;
                    if (textView2 != null) {
                        textView2.setTextColor(builder.f۱۲۵۵۰j);
                        dialog.m۱۵۸۲۸a(dialog.f۱۲۴۷۷o, builder.f۱۲۵۲۴S);
                        if (builder.f۱۲۵۵۱j0) {
                            dialog.f۱۲۴۷۷o.setVisibility(0);
                            dialog.f۱۲۴۷۷o.setText(String.format(builder.f۱۲۵۸۳z0, 0, Integer.valueOf(builder.f۱۲۵۵۵l0)));
                            ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) dialog.f۱۲۴۷۵m.getLayoutParams();
                            lp.leftMargin = 0;
                            lp.rightMargin = 0;
                        } else {
                            dialog.f۱۲۴۷۷o.setVisibility(8);
                        }
                    } else {
                        builder.f۱۲۵۵۱j0 = false;
                    }
                }
            } else {
                return;
            }
        }
        ProgressBar progressBar2 = dialog.f۱۲۴۷۵m;
        if (progressBar2 != null) {
            m۱۵۸۱۶a(progressBar2);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private static void m۱۵۸۱۹b(View$OnClickListenerCf dialog) {
        View$OnClickListenerCf.Cd builder = dialog.f۱۲۴۶۷e;
        dialog.f۱۲۴۷۱i = (EditText) dialog.f۱۲۴۵۹c.findViewById(16908297);
        EditText editText = dialog.f۱۲۴۷۱i;
        if (editText != null) {
            dialog.m۱۵۸۲۸a(editText, builder.f۱۲۵۲۴S);
            CharSequence charSequence = builder.f۱۲۵۵۷m0;
            if (charSequence != null) {
                dialog.f۱۲۴۷۱i.setText(charSequence);
            }
            dialog.m۱۵۸۳۹i();
            dialog.f۱۲۴۷۱i.setHint(builder.f۱۲۵۵۹n0);
            dialog.f۱۲۴۷۱i.setSingleLine();
            dialog.f۱۲۴۷۱i.setTextColor(builder.f۱۲۵۵۰j);
            dialog.f۱۲۴۷۱i.setHintTextColor(Ca.m۱۵۸۸۸a(builder.f۱۲۵۵۰j, 0.3f));
            Cc.m۱۶۷۷۲b(dialog.f۱۲۴۷۱i, dialog.f۱۲۴۶۷e.f۱۲۵۷۰t);
            int i = builder.f۱۲۵۶۵q0;
            if (i != -1) {
                dialog.f۱۲۴۷۱i.setInputType(i);
                int i2 = builder.f۱۲۵۶۵q0;
                if (i2 != 144 && (i2 & 128) == 128) {
                    dialog.f۱۲۴۷۱i.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
            dialog.f۱۲۴۷۸p = (TextView) dialog.f۱۲۴۵۹c.findViewById(Ck.md_minMax);
            if (builder.f۱۲۵۶۹s0 > 0 || builder.f۱۲۵۷۱t0 > -1) {
                dialog.m۱۵۸۲۷a(dialog.f۱۲۴۷۱i.getText().toString().length(), !builder.f۱۲۵۶۳p0);
                return;
            }
            dialog.f۱۲۴۷۸p.setVisibility(8);
            dialog.f۱۲۴۷۸p = null;
        }
    }
}
