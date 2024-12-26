package android.databinding;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class MergedDataBinderMapper extends AbstractCc {

    /* renamed from: a  reason: contains not printable characters */
    private Set<Class<? extends AbstractCc>> f۹۰۰۱a = new HashSet();

    /* renamed from: b  reason: contains not printable characters */
    private List<AbstractCc> f۹۰۰۲b = new CopyOnWriteArrayList();

    public MergedDataBinderMapper() {
        new CopyOnWriteArrayList();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Set<java.lang.Class<? extends android.databinding.c>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۹۳۶a(AbstractCc mapper) {
        if (this.f۹۰۰۱a.add(mapper.getClass())) {
            this.f۹۰۰۲b.add(mapper);
            Iterator<DataBinderMapper> it = mapper.m۱۰۹۴۵a().iterator();
            while (it.hasNext()) {
                m۱۰۹۳۶a((AbstractCc) it.next());
            }
        }
    }
}
