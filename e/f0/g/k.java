package e.f0.g;

import e.w;
import java.net.ProtocolException;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final w f۳۸۴۶a;

    /* renamed from: b  reason: collision with root package name */
    public final int f۳۸۴۷b;

    /* renamed from: c  reason: collision with root package name */
    public final String f۳۸۴۸c;

    public k(w protocol, int code, String message) {
        this.f۳۸۴۶a = protocol;
        this.f۳۸۴۷b = code;
        this.f۳۸۴۸c = message;
    }

    public static k a(String statusLine) {
        w protocol;
        int codeStart;
        if (statusLine.startsWith("HTTP/1.")) {
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            int httpMinorVersion = statusLine.charAt(7) - '0';
            codeStart = 9;
            if (httpMinorVersion == 0) {
                protocol = w.HTTP_1_0;
            } else if (httpMinorVersion == 1) {
                protocol = w.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        } else if (statusLine.startsWith("ICY ")) {
            protocol = w.HTTP_1_0;
            codeStart = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + statusLine);
        }
        if (statusLine.length() >= codeStart + 3) {
            try {
                int code = Integer.parseInt(statusLine.substring(codeStart, codeStart + 3));
                String message = "";
                if (statusLine.length() > codeStart + 3) {
                    if (statusLine.charAt(codeStart + 3) == ' ') {
                        message = statusLine.substring(codeStart + 4);
                    } else {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                }
                return new k(protocol, code, message);
            } catch (NumberFormatException e2) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        } else {
            throw new ProtocolException("Unexpected status line: " + statusLine);
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.f۳۸۴۶a == w.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        result.append(' ');
        result.append(this.f۳۸۴۷b);
        if (this.f۳۸۴۸c != null) {
            result.append(' ');
            result.append(this.f۳۸۴۸c);
        }
        return result.toString();
    }
}
