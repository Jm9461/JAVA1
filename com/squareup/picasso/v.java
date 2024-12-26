package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.d0;
import com.squareup.picasso.t;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public class v extends ThreadPoolExecutor {
    v() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d0.c());
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    public void a(NetworkInfo info2) {
        if (info2 == null || !info2.isConnectedOrConnecting()) {
            a(3);
            return;
        }
        int type = info2.getType();
        if (type == 0) {
            int subtype = info2.getSubtype();
            switch (subtype) {
                case 1:
                case 2:
                    a(1);
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
                            a(3);
                            return;
                        default:
                            a(3);
                            return;
                    }
            }
            a(2);
        } else if (type == 1 || type == 6 || type == 9) {
            a(4);
        } else {
            a(3);
        }
    }

    private void a(int threadCount) {
        setCorePoolSize(threadCount);
        setMaximumPoolSize(threadCount);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable task) {
        a ftask = new a((c) task);
        execute(ftask);
        return ftask;
    }

    private static final class a extends FutureTask<c> implements Comparable<a> {

        /* renamed from: c  reason: collision with root package name */
        private final c f۳۶۲۲c;

        a(c hunter) {
            super(hunter, null);
            this.f۳۶۲۲c = hunter;
        }

        /* renamed from: a */
        public int compareTo(a other) {
            int i;
            int i2;
            t.f p1 = this.f۳۶۲۲c.j();
            t.f p2 = other.f۳۶۲۲c.j();
            if (p1 == p2) {
                i2 = this.f۳۶۲۲c.f۳۵۲۴c;
                i = other.f۳۶۲۲c.f۳۵۲۴c;
            } else {
                i2 = p2.ordinal();
                i = p1.ordinal();
            }
            return i2 - i;
        }
    }
}
