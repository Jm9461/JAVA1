package p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.support.p۰۴۳v4.view.p۰۴۶e0.Ca;
import android.support.p۰۴۳v4.view.p۰۴۶e0.Cb;
import android.support.p۰۴۳v4.view.p۰۴۶e0.Cc;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: a.b.d.a.d  reason: invalid class name */
public class Cd {
    /* renamed from: a  reason: contains not printable characters */
    public static Interpolator m۱۰۰۴۰a(Context context, int id) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, id);
        }
        XmlResourceParser parser = null;
        if (id == 17563663) {
            try {
                Ca aVar = new Ca();
                if (0 != 0) {
                    parser.close();
                }
                return aVar;
            } catch (XmlPullParserException ex) {
                Resources.NotFoundException rnf = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(id));
                rnf.initCause(ex);
                throw rnf;
            } catch (IOException ex2) {
                Resources.NotFoundException rnf2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(id));
                rnf2.initCause(ex2);
                throw rnf2;
            } catch (Throwable th) {
                if (0 != 0) {
                    parser.close();
                }
                throw th;
            }
        } else if (id == 17563661) {
            Cb bVar = new Cb();
            if (0 != 0) {
                parser.close();
            }
            return bVar;
        } else if (id == 17563662) {
            Cc cVar = new Cc();
            if (0 != 0) {
                parser.close();
            }
            return cVar;
        } else {
            XmlResourceParser parser2 = context.getResources().getAnimation(id);
            Interpolator a = m۱۰۰۴۱a(context, context.getResources(), context.getTheme(), parser2);
            if (parser2 != null) {
                parser2.close();
            }
            return a;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Interpolator m۱۰۰۴۱a(Context context, Resources res, Resources.Theme theme, XmlPullParser parser) {
        Interpolator interpolator = null;
        int depth = parser.getDepth();
        while (true) {
            int type = parser.next();
            if ((type != 3 || parser.getDepth() > depth) && type != 1) {
                if (type == 2) {
                    AttributeSet attrs = Xml.asAttributeSet(parser);
                    String name = parser.getName();
                    if (name.equals("linearInterpolator")) {
                        interpolator = new LinearInterpolator();
                    } else if (name.equals("accelerateInterpolator")) {
                        interpolator = new AccelerateInterpolator(context, attrs);
                    } else if (name.equals("decelerateInterpolator")) {
                        interpolator = new DecelerateInterpolator(context, attrs);
                    } else if (name.equals("accelerateDecelerateInterpolator")) {
                        interpolator = new AccelerateDecelerateInterpolator();
                    } else if (name.equals("cycleInterpolator")) {
                        interpolator = new CycleInterpolator(context, attrs);
                    } else if (name.equals("anticipateInterpolator")) {
                        interpolator = new AnticipateInterpolator(context, attrs);
                    } else if (name.equals("overshootInterpolator")) {
                        interpolator = new OvershootInterpolator(context, attrs);
                    } else if (name.equals("anticipateOvershootInterpolator")) {
                        interpolator = new AnticipateOvershootInterpolator(context, attrs);
                    } else if (name.equals("bounceInterpolator")) {
                        interpolator = new BounceInterpolator();
                    } else if (name.equals("pathInterpolator")) {
                        interpolator = new animationInterpolatorCg(context, attrs, parser);
                    } else {
                        throw new RuntimeException("Unknown interpolator name: " + parser.getName());
                    }
                }
            }
        }
        return interpolator;
    }
}
