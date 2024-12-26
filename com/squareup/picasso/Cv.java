package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.Cd0;
import com.squareup.picasso.Ct;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.v  reason: invalid class name */
public class Cv extends ThreadPoolExecutor {
    Cv() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new Cd0.ThreadFactoryCc());
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۴۱۷a(NetworkInfo info2) {
        if (info2 == null || !info2.isConnectedOrConnecting()) {
            m۱۸۴۱۶a(3);
            return;
        }
        int type = info2.getType();
        if (type == 0) {
            int subtype = info2.getSubtype();
            switch (subtype) {
                case 1:
                case 2:
                    m۱۸۴۱۶a(1);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    switch (subtype) {
                        case 12:
                            break;
                        case 13:
                        case 14:
                        case 15:
                            m۱۸۴۱۶a(3);
                            return;
                        default:
                            m۱۸۴۱۶a(3);
                            return;
                    }
            }
            m۱۸۴۱۶a(2);
        } else if (type == 1 || type == 6 || type == 9) {
            m۱۸۴۱۶a(4);
        } else {
            m۱۸۴۱۶a(3);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۴۱۶a(int threadCount) {
        setCorePoolSize(threadCount);
        setMaximumPoolSize(threadCount);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable task) {
        Ca ftask = new Ca((RunnableCc) task);
        execute(ftask);
        return ftask;
    }

    /* renamed from: com.squareup.picasso.v$a  reason: invalid class name */
    private static final class Ca extends FutureTask<RunnableCc> implements Comparable<Ca> {

        /* renamed from: c  reason: contains not printable characters */
        private final RunnableCc f۱۵۵۳۰c;

        Ca(RunnableCc hunter) {
            super(hunter, null);
            this.f۱۵۵۳۰c = hunter;
        }

        /* renamed from: a  reason: contains not printable characters */
        public int compareTo(Ca other) {
            int i;
            int i2;
            Ct.EnumCf p1 = this.f۱۵۵۳۰c.m۱۸۲۹۴j();
            Ct.EnumCf p2 = other.f۱۵۵۳۰c.m۱۸۲۹۴j();
            if (p1 == p2) {
                i2 = this.f۱۵۵۳۰c.f۱۵۳۹۷c;
                i = other.f۱۵۵۳۰c.f۱۵۳۹۷c;
            } else {
                i2 = p2.ordinal();
                i = p1.ordinal();
            }
            return i2 - i;
        }
    }
}
