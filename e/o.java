package e;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

public interface o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f۴۰۹۲a = new a();

    List<InetAddress> a(String str);

    class a implements o {
        a() {
        }

        @Override // e.o
        public List<InetAddress> a(String hostname) {
            if (hostname != null) {
                try {
                    return Arrays.asList(InetAddress.getAllByName(hostname));
                } catch (NullPointerException e2) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e2);
                    throw unknownHostException;
                }
            } else {
                throw new UnknownHostException("hostname == null");
            }
        }
    }
}
