package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g;

/* renamed from: a.b.g.g.d  reason: invalid class name */
public class Cd {
    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۰۵۹۲a(Object cls, StringBuilder out) {
        int end;
        if (cls == null) {
            out.append("null");
            return;
        }
        String simpleName = cls.getClass().getSimpleName();
        if ((simpleName == null || simpleName.length() <= 0) && (end = (simpleName = cls.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(end + 1);
        }
        out.append(simpleName);
        out.append('{');
        out.append(Integer.toHexString(System.identityHashCode(cls)));
    }
}
