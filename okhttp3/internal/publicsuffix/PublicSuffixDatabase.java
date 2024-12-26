package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p۱۳۹e.p۱۴۰f0.Cc;
import p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf;
import p۱۴۹f.AbstractCe;
import p۱۴۹f.Cj;
import p۱۴۹f.Cl;

public final class PublicSuffixDatabase {

    /* renamed from: e  reason: contains not printable characters */
    private static final byte[] f۱۶۴۴۷e = {42};

    /* renamed from: f  reason: contains not printable characters */
    private static final String[] f۱۶۴۴۸f = new String[0];

    /* renamed from: g  reason: contains not printable characters */
    private static final String[] f۱۶۴۴۹g = {"*"};

    /* renamed from: h  reason: contains not printable characters */
    private static final PublicSuffixDatabase f۱۶۴۵۰h = new PublicSuffixDatabase();

    /* renamed from: a  reason: contains not printable characters */
    private final AtomicBoolean f۱۶۴۵۱a = new AtomicBoolean(false);

    /* renamed from: b  reason: contains not printable characters */
    private final CountDownLatch f۱۶۴۵۲b = new CountDownLatch(1);

    /* renamed from: c  reason: contains not printable characters */
    private byte[] f۱۶۴۵۳c;

    /* renamed from: d  reason: contains not printable characters */
    private byte[] f۱۶۴۵۴d;

    /* renamed from: a  reason: contains not printable characters */
    public static PublicSuffixDatabase m۱۹۸۱۹a() {
        return f۱۶۴۵۰h;
    }

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۹۸۲۳a(String domain) {
        int firstLabelOffset;
        if (domain != null) {
            String[] domainLabels = IDN.toUnicode(domain).split("\\.");
            String[] rule = m۱۹۸۲۰a(domainLabels);
            if (domainLabels.length == rule.length && rule[0].charAt(0) != '!') {
                return null;
            }
            if (rule[0].charAt(0) == '!') {
                firstLabelOffset = domainLabels.length - rule.length;
            } else {
                firstLabelOffset = domainLabels.length - (rule.length + 1);
            }
            StringBuilder effectiveTldPlusOne = new StringBuilder();
            String[] punycodeLabels = domain.split("\\.");
            for (int i = firstLabelOffset; i < punycodeLabels.length; i++) {
                effectiveTldPlusOne.append(punycodeLabels[i]);
                effectiveTldPlusOne.append('.');
            }
            effectiveTldPlusOne.deleteCharAt(effectiveTldPlusOne.length() - 1);
            return effectiveTldPlusOne.toString();
        }
        throw new NullPointerException("domain == null");
    }

    /* renamed from: a  reason: contains not printable characters */
    private String[] m۱۹۸۲۰a(String[] domainLabels) {
        String[] exactRuleLabels;
        String[] wildcardRuleLabels;
        if (this.f۱۶۴۵۱a.get() || !this.f۱۶۴۵۱a.compareAndSet(false, true)) {
            try {
                this.f۱۶۴۵۲b.await();
            } catch (InterruptedException e) {
            }
        } else {
            m۱۹۸۲۲c();
        }
        synchronized (this) {
            if (this.f۱۶۴۵۳c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        byte[][] domainLabelsUtf8Bytes = new byte[domainLabels.length][];
        for (int i = 0; i < domainLabels.length; i++) {
            domainLabelsUtf8Bytes[i] = domainLabels[i].getBytes(Cc.f۱۵۷۰۶d);
        }
        String exactMatch = null;
        int i2 = 0;
        while (true) {
            if (i2 >= domainLabelsUtf8Bytes.length) {
                break;
            }
            String rule = m۱۹۸۱۸a(this.f۱۶۴۵۳c, domainLabelsUtf8Bytes, i2);
            if (rule != null) {
                exactMatch = rule;
                break;
            }
            i2++;
        }
        String wildcardMatch = null;
        if (domainLabelsUtf8Bytes.length > 1) {
            byte[][] labelsWithWildcard = (byte[][]) domainLabelsUtf8Bytes.clone();
            int labelIndex = 0;
            while (true) {
                if (labelIndex >= labelsWithWildcard.length - 1) {
                    break;
                }
                labelsWithWildcard[labelIndex] = f۱۶۴۴۷e;
                String rule2 = m۱۹۸۱۸a(this.f۱۶۴۵۳c, labelsWithWildcard, labelIndex);
                if (rule2 != null) {
                    wildcardMatch = rule2;
                    break;
                }
                labelIndex++;
            }
        }
        String exception = null;
        if (wildcardMatch != null) {
            int labelIndex2 = 0;
            while (true) {
                if (labelIndex2 >= domainLabelsUtf8Bytes.length - 1) {
                    break;
                }
                String rule3 = m۱۹۸۱۸a(this.f۱۶۴۵۴d, domainLabelsUtf8Bytes, labelIndex2);
                if (rule3 != null) {
                    exception = rule3;
                    break;
                }
                labelIndex2++;
            }
        }
        if (exception != null) {
            return ("!" + exception).split("\\.");
        } else if (exactMatch == null && wildcardMatch == null) {
            return f۱۶۴۴۹g;
        } else {
            if (exactMatch != null) {
                exactRuleLabels = exactMatch.split("\\.");
            } else {
                exactRuleLabels = f۱۶۴۴۸f;
            }
            if (wildcardMatch != null) {
                wildcardRuleLabels = wildcardMatch.split("\\.");
            } else {
                wildcardRuleLabels = f۱۶۴۴۸f;
            }
            return exactRuleLabels.length > wildcardRuleLabels.length ? exactRuleLabels : wildcardRuleLabels;
        }
    }

    /* JADX INFO: Multiple debug info for r12v1 int: [D('low' int), D('publicSuffixBytesLeft' int)] */
    /* renamed from: a  reason: contains not printable characters */
    private static String m۱۹۸۱۸a(byte[] bytesToSearch, byte[][] labels, int labelIndex) {
        int byte0;
        int compareResult;
        int low;
        int low2 = 0;
        int high = bytesToSearch.length;
        while (low2 < high) {
            int mid = (low2 + high) / 2;
            while (mid > -1 && bytesToSearch[mid] != 10) {
                mid--;
            }
            int mid2 = mid + 1;
            int end = 1;
            while (bytesToSearch[mid2 + end] != 10) {
                end++;
            }
            int publicSuffixLength = (mid2 + end) - mid2;
            int currentLabelIndex = labelIndex;
            int currentLabelByteIndex = 0;
            int publicSuffixByteIndex = 0;
            boolean expectDot = false;
            while (true) {
                if (expectDot) {
                    byte0 = 46;
                    expectDot = false;
                } else {
                    byte0 = labels[currentLabelIndex][currentLabelByteIndex] & 255;
                }
                compareResult = byte0 - (bytesToSearch[mid2 + publicSuffixByteIndex] & 255);
                if (compareResult == 0) {
                    publicSuffixByteIndex++;
                    currentLabelByteIndex++;
                    if (publicSuffixByteIndex == publicSuffixLength) {
                        break;
                    }
                    if (labels[currentLabelIndex].length != currentLabelByteIndex) {
                        low = low2;
                    } else if (currentLabelIndex == labels.length - 1) {
                        break;
                    } else {
                        low = low2;
                        currentLabelIndex++;
                        expectDot = true;
                        currentLabelByteIndex = -1;
                    }
                    low2 = low;
                } else {
                    break;
                }
            }
            if (compareResult < 0) {
                high = mid2 - 1;
            } else if (compareResult > 0) {
                low2 = mid2 + end + 1;
            } else {
                int publicSuffixBytesLeft = publicSuffixLength - publicSuffixByteIndex;
                int labelBytesLeft = labels[currentLabelIndex].length - currentLabelByteIndex;
                int i = currentLabelIndex + 1;
                while (i < labels.length) {
                    labelBytesLeft += labels[i].length;
                    i++;
                    low2 = low2;
                }
                if (labelBytesLeft < publicSuffixBytesLeft) {
                    high = mid2 - 1;
                    low2 = low2;
                } else if (labelBytesLeft <= publicSuffixBytesLeft) {
                    return new String(bytesToSearch, mid2, publicSuffixLength, Cc.f۱۵۷۰۶d);
                } else {
                    low2 = mid2 + end + 1;
                }
            }
        }
        return null;
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۹۸۲۲c() {
        boolean interrupted = false;
        while (true) {
            try {
                m۱۹۸۲۱b();
                break;
            } catch (InterruptedIOException e) {
                interrupted = true;
            } catch (IOException e2) {
                Cf.m۱۹۰۸۶d().m۱۹۰۹۱a(5, "Failed to read public suffix list", e2);
                if (interrupted) {
                    Thread.currentThread().interrupt();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (interrupted) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (interrupted) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۹۸۲۱b() {
        InputStream resource = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resource != null) {
            AbstractCe bufferedSource = Cl.m۱۹۴۸۰a(new Cj(Cl.m۱۹۴۸۶a(resource)));
            try {
                byte[] publicSuffixListBytes = new byte[bufferedSource.readInt()];
                bufferedSource.readFully(publicSuffixListBytes);
                byte[] publicSuffixExceptionListBytes = new byte[bufferedSource.readInt()];
                bufferedSource.readFully(publicSuffixExceptionListBytes);
                synchronized (this) {
                    this.f۱۶۴۵۳c = publicSuffixListBytes;
                    this.f۱۶۴۵۴d = publicSuffixExceptionListBytes;
                }
                this.f۱۶۴۵۲b.countDown();
            } finally {
                Cc.m۱۸۶۲۱a(bufferedSource);
            }
        }
    }
}
