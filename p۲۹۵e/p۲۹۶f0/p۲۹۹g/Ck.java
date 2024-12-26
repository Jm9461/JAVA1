package p۲۹۵e.p۲۹۶f0.p۲۹۹g;

import java.net.ProtocolException;
import p۲۹۵e.EnumCw;

/* renamed from: e.f0.g.k, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ck {

    /* renamed from: a, reason: contains not printable characters */
    public final EnumCw f۱۵۸۴۳a;

    /* renamed from: b, reason: contains not printable characters */
    public final int f۱۵۸۴۴b;

    /* renamed from: c, reason: contains not printable characters */
    public final String f۱۵۸۴۵c;

    public Ck(EnumCw protocol, int code, String message) {
        this.f۱۵۸۴۳a = protocol;
        this.f۱۵۸۴۴b = code;
        this.f۱۵۸۴۵c = message;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Ck m۱۶۷۲۹a(String statusLine) {
        EnumCw protocol;
        int codeStart;
        if (statusLine.startsWith("HTTP/1.")) {
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            int httpMinorVersion = statusLine.charAt(7) - '0';
            codeStart = 9;
            if (httpMinorVersion == 0) {
                protocol = EnumCw.HTTP_1_0;
            } else if (httpMinorVersion == 1) {
                protocol = EnumCw.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        } else if (statusLine.startsWith("ICY ")) {
            protocol = EnumCw.HTTP_1_0;
            codeStart = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + statusLine);
        }
        if (statusLine.length() < codeStart + 3) {
            throw new ProtocolException("Unexpected status line: " + statusLine);
        }
        try {
            int code = Integer.parseInt(statusLine.substring(codeStart, codeStart + 3));
            String message = "";
            if (statusLine.length() > codeStart + 3) {
                if (statusLine.charAt(codeStart + 3) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                message = statusLine.substring(codeStart + 4);
            }
            return new Ck(protocol, code, message);
        } catch (NumberFormatException e2) {
            throw new ProtocolException("Unexpected status line: " + statusLine);
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.f۱۵۸۴۳a == EnumCw.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        result.append(' ');
        result.append(this.f۱۵۸۴۴b);
        if (this.f۱۵۸۴۵c != null) {
            result.append(' ');
            result.append(this.f۱۵۸۴۵c);
        }
        return result.toString();
    }
}
