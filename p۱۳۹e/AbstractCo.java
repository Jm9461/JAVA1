package p۱۳۹e;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: e.o  reason: invalid class name */
public interface AbstractCo {

    /* renamed from: a  reason: contains not printable characters */
    public static final AbstractCo f۱۶۱۳۹a = new Ca();

    /* renamed from: a  reason: contains not printable characters */
    List<InetAddress> m۱۹۱۶۷a(String str);

    /* renamed from: e.o$a  reason: invalid class name */
    class Ca implements AbstractCo {
        Ca() {
        }

        @Override // p۱۳۹e.AbstractCo
        /* renamed from: a  reason: contains not printable characters */
        public List<InetAddress> m۱۹۱۶۸a(String hostname) {
            if (hostname != null) {
                try {
                    return Arrays.asList(InetAddress.getAllByName(hostname));
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            } else {
                throw new UnknownHostException("hostname == null");
            }
        }
    }
}
