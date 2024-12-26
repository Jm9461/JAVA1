package p۲۹۵e;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: e.o, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public interface InterfaceCo {

    /* renamed from: a, reason: contains not printable characters */
    public static final InterfaceCo f۱۶۱۳۹a = new a();

    /* renamed from: a, reason: contains not printable characters */
    List<InetAddress> mo۱۷۰۸۹a(String str);

    /* renamed from: e.o$a */
    final class a implements InterfaceCo {
        a() {
        }

        @Override // p۲۹۵e.InterfaceCo
        /* renamed from: a, reason: contains not printable characters */
        public List<InetAddress> mo۱۷۰۸۹a(String hostname) {
            if (hostname == null) {
                throw new UnknownHostException("hostname == null");
            }
            try {
                return Arrays.asList(InetAddress.getAllByName(hostname));
            } catch (NullPointerException e2) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                unknownHostException.initCause(e2);
                throw unknownHostException;
            }
        }
    }
}
