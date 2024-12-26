package android.support.v4.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ck;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cn;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.InterfaceCj;

/* renamed from: android.support.v4.widget.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cf<T> {

    /* renamed from: a, reason: contains not printable characters */
    private final InterfaceCj<ArrayList<T>> f۱۰۷۷۷a = new Ck(10);

    /* renamed from: b, reason: contains not printable characters */
    private final Cn<T, ArrayList<T>> f۱۰۷۷۸b = new Cn<>();

    /* renamed from: c, reason: contains not printable characters */
    private final ArrayList<T> f۱۰۷۷۹c = new ArrayList<>();

    /* renamed from: d, reason: contains not printable characters */
    private final HashSet<T> f۱۰۷۸۰d = new HashSet<>();

    /* JADX WARN: Generic types in debug info not equals: android.support.v4.widget.f != android.support.v4.widget.DirectedAcyclicGraph<T> */
    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۱۷۲a(T node) {
        if (!this.f۱۰۷۷۸b.containsKey(node)) {
            this.f۱۰۷۷۸b.put(node, null);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v4.widget.f != android.support.v4.widget.DirectedAcyclicGraph<T> */
    /* renamed from: b, reason: contains not printable characters */
    public boolean m۱۱۱۷۵b(T node) {
        return this.f۱۰۷۷۸b.containsKey(node);
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v4.widget.f != android.support.v4.widget.DirectedAcyclicGraph<T> */
    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۱۷۳a(T node, T incomingEdge) {
        if (!this.f۱۰۷۷۸b.containsKey(node) || !this.f۱۰۷۷۸b.containsKey(incomingEdge)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> edges = this.f۱۰۷۷۸b.get(node);
        if (edges == null) {
            edges = m۱۱۱۷۰c();
            this.f۱۰۷۷۸b.put(node, edges);
        }
        edges.add(incomingEdge);
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v4.widget.f != android.support.v4.widget.DirectedAcyclicGraph<T> */
    /* renamed from: c, reason: contains not printable characters */
    public List m۱۱۱۷۶c(T node) {
        return this.f۱۰۷۷۸b.get(node);
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v4.widget.f != android.support.v4.widget.DirectedAcyclicGraph<T> */
    /* renamed from: d, reason: contains not printable characters */
    public List<T> m۱۱۱۷۷d(T node) {
        ArrayList<T> result = null;
        int size = this.f۱۰۷۷۸b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> edges = this.f۱۰۷۷۸b.m۸۵۸۶d(i);
            if (edges != null && edges.contains(node)) {
                if (result == null) {
                    result = new ArrayList<>();
                }
                result.add(this.f۱۰۷۷۸b.m۸۵۸۴b(i));
            }
        }
        return result;
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v4.widget.f != android.support.v4.widget.DirectedAcyclicGraph<T> */
    /* renamed from: e, reason: contains not printable characters */
    public boolean m۱۱۱۷۸e(T node) {
        int size = this.f۱۰۷۷۸b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> edges = this.f۱۰۷۷۸b.m۸۵۸۶d(i);
            if (edges != null && edges.contains(node)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v4.widget.f != android.support.v4.widget.DirectedAcyclicGraph<T> */
    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۱۷۱a() {
        int size = this.f۱۰۷۷۸b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> edges = this.f۱۰۷۷۸b.m۸۵۸۶d(i);
            if (edges != null) {
                m۱۱۱۶۹a((ArrayList) edges);
            }
        }
        this.f۱۰۷۷۸b.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v4.widget.f != android.support.v4.widget.DirectedAcyclicGraph<T> */
    /* renamed from: b, reason: contains not printable characters */
    public ArrayList<T> m۱۱۱۷۴b() {
        this.f۱۰۷۷۹c.clear();
        this.f۱۰۷۸۰d.clear();
        int size = this.f۱۰۷۷۸b.size();
        for (int i = 0; i < size; i++) {
            m۱۱۱۶۸a(this.f۱۰۷۷۸b.m۸۵۸۴b(i), this.f۱۰۷۷۹c, this.f۱۰۷۸۰d);
        }
        return this.f۱۰۷۷۹c;
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v4.widget.f != android.support.v4.widget.DirectedAcyclicGraph<T> */
    /* renamed from: a, reason: contains not printable characters */
    private void m۱۱۱۶۸a(T node, ArrayList<T> result, HashSet<T> tmpMarked) {
        if (result.contains(node)) {
            return;
        }
        if (tmpMarked.contains(node)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        tmpMarked.add(node);
        ArrayList<T> edges = this.f۱۰۷۷۸b.get(node);
        if (edges != null) {
            int size = edges.size();
            for (int i = 0; i < size; i++) {
                m۱۱۱۶۸a(edges.get(i), result, tmpMarked);
            }
        }
        tmpMarked.remove(node);
        result.add(node);
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v4.widget.f != android.support.v4.widget.DirectedAcyclicGraph<T> */
    /* renamed from: c, reason: contains not printable characters */
    private ArrayList<T> m۱۱۱۷۰c() {
        ArrayList<T> list = this.f۱۰۷۷۷a.mo۸۵۶۹a();
        if (list == null) {
            return new ArrayList<>();
        }
        return list;
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v4.widget.f != android.support.v4.widget.DirectedAcyclicGraph<T> */
    /* renamed from: a, reason: contains not printable characters */
    private void m۱۱۱۶۹a(ArrayList<T> list) {
        list.clear();
        this.f۱۰۷۷۷a.mo۸۵۷۰a(list);
    }
}
