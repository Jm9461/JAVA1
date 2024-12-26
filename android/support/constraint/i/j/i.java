package android.support.constraint.i.j;

import android.support.constraint.i.e;
import android.support.constraint.i.f;
import android.support.constraint.i.j.e;

public class i {

    /* renamed from: a  reason: collision with root package name */
    static boolean[] f۶۹۸a = new boolean[3];

    static void a(f container, e system, e widget) {
        if (container.B[0] != e.b.WRAP_CONTENT && widget.B[0] == e.b.MATCH_PARENT) {
            int left = widget.r.f۶۶۴e;
            int right = container.t() - widget.t.f۶۶۴e;
            d dVar = widget.r;
            dVar.i = system.a(dVar);
            d dVar2 = widget.t;
            dVar2.i = system.a(dVar2);
            system.a(widget.r.i, left);
            system.a(widget.t.i, right);
            widget.f۶۸۲a = 2;
            widget.a(left, right);
        }
        if (container.B[1] != e.b.WRAP_CONTENT && widget.B[1] == e.b.MATCH_PARENT) {
            int top = widget.s.f۶۶۴e;
            int bottom = container.i() - widget.u.f۶۶۴e;
            d dVar3 = widget.s;
            dVar3.i = system.a(dVar3);
            d dVar4 = widget.u;
            dVar4.i = system.a(dVar4);
            system.a(widget.s.i, top);
            system.a(widget.u.i, bottom);
            if (widget.N > 0 || widget.s() == 8) {
                d dVar5 = widget.v;
                dVar5.i = system.a(dVar5);
                system.a(widget.v.i, widget.N + top);
            }
            widget.f۶۸۳b = 2;
            widget.d(top, bottom);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x003c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(android.support.constraint.i.j.e r5, int r6) {
        /*
            android.support.constraint.i.j.e$b[] r0 = r5.B
            r1 = r0[r6]
            android.support.constraint.i.j.e$b r2 = android.support.constraint.i.j.e.b.MATCH_CONSTRAINT
            r3 = 0
            if (r1 == r2) goto L_0x000a
            return r3
        L_0x000a:
            float r1 = r5.F
            r2 = 0
            r4 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x001e
            if (r6 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            r0 = r0[r4]
            android.support.constraint.i.j.e$b r1 = android.support.constraint.i.j.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x001d
            return r3
        L_0x001d:
            return r3
        L_0x001e:
            if (r6 != 0) goto L_0x002e
            int r0 = r5.f۶۸۶e
            if (r0 == 0) goto L_0x0025
            return r3
        L_0x0025:
            int r0 = r5.f۶۸۹h
            if (r0 != 0) goto L_0x002d
            int r0 = r5.i
            if (r0 == 0) goto L_0x003c
        L_0x002d:
            return r3
        L_0x002e:
            int r0 = r5.f۶۸۷f
            if (r0 == 0) goto L_0x0033
            return r3
        L_0x0033:
            int r0 = r5.k
            if (r0 != 0) goto L_0x003d
            int r0 = r5.l
            if (r0 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            return r4
        L_0x003d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.i.j.i.a(android.support.constraint.i.j.e, int):boolean");
    }

    static void a(int optimisationLevel, e widget) {
        widget.G();
        k leftNode = widget.r.d();
        k topNode = widget.s.d();
        k rightNode = widget.t.d();
        k bottomNode = widget.u.d();
        boolean optimiseDimensions = (optimisationLevel & 8) == 8;
        boolean isOptimizableHorizontalMatch = widget.B[0] == e.b.MATCH_CONSTRAINT && a(widget, 0);
        if (!(leftNode.f۷۰۴h == 4 || rightNode.f۷۰۴h == 4)) {
            if (widget.B[0] == e.b.FIXED || (isOptimizableHorizontalMatch && widget.s() == 8)) {
                if (widget.r.f۶۶۳d == null && widget.t.f۶۶۳d == null) {
                    leftNode.b(1);
                    rightNode.b(1);
                    if (optimiseDimensions) {
                        rightNode.a(leftNode, 1, widget.n());
                    } else {
                        rightNode.a(leftNode, widget.t());
                    }
                } else if (widget.r.f۶۶۳d != null && widget.t.f۶۶۳d == null) {
                    leftNode.b(1);
                    rightNode.b(1);
                    if (optimiseDimensions) {
                        rightNode.a(leftNode, 1, widget.n());
                    } else {
                        rightNode.a(leftNode, widget.t());
                    }
                } else if (widget.r.f۶۶۳d == null && widget.t.f۶۶۳d != null) {
                    leftNode.b(1);
                    rightNode.b(1);
                    leftNode.a(rightNode, -widget.t());
                    if (optimiseDimensions) {
                        leftNode.a(rightNode, -1, widget.n());
                    } else {
                        leftNode.a(rightNode, -widget.t());
                    }
                } else if (!(widget.r.f۶۶۳d == null || widget.t.f۶۶۳d == null)) {
                    leftNode.b(2);
                    rightNode.b(2);
                    if (optimiseDimensions) {
                        widget.n().a(leftNode);
                        widget.n().a(rightNode);
                        leftNode.b(rightNode, -1, widget.n());
                        rightNode.b(leftNode, 1, widget.n());
                    } else {
                        leftNode.b(rightNode, (float) (-widget.t()));
                        rightNode.b(leftNode, (float) widget.t());
                    }
                }
            } else if (isOptimizableHorizontalMatch) {
                int width = widget.t();
                leftNode.b(1);
                rightNode.b(1);
                if (widget.r.f۶۶۳d == null && widget.t.f۶۶۳d == null) {
                    if (optimiseDimensions) {
                        rightNode.a(leftNode, 1, widget.n());
                    } else {
                        rightNode.a(leftNode, width);
                    }
                } else if (widget.r.f۶۶۳d == null || widget.t.f۶۶۳d != null) {
                    if (widget.r.f۶۶۳d != null || widget.t.f۶۶۳d == null) {
                        if (!(widget.r.f۶۶۳d == null || widget.t.f۶۶۳d == null)) {
                            if (optimiseDimensions) {
                                widget.n().a(leftNode);
                                widget.n().a(rightNode);
                            }
                            if (widget.F == 0.0f) {
                                leftNode.b(3);
                                rightNode.b(3);
                                leftNode.b(rightNode, 0.0f);
                                rightNode.b(leftNode, 0.0f);
                            } else {
                                leftNode.b(2);
                                rightNode.b(2);
                                leftNode.b(rightNode, (float) (-width));
                                rightNode.b(leftNode, (float) width);
                                widget.k(width);
                            }
                        }
                    } else if (optimiseDimensions) {
                        leftNode.a(rightNode, -1, widget.n());
                    } else {
                        leftNode.a(rightNode, -width);
                    }
                } else if (optimiseDimensions) {
                    rightNode.a(leftNode, 1, widget.n());
                } else {
                    rightNode.a(leftNode, width);
                }
            }
        }
        boolean isOptimizableVerticalMatch = widget.B[1] == e.b.MATCH_CONSTRAINT && a(widget, 1);
        if (topNode.f۷۰۴h != 4 && bottomNode.f۷۰۴h != 4) {
            if (widget.B[1] == e.b.FIXED || (isOptimizableVerticalMatch && widget.s() == 8)) {
                if (widget.s.f۶۶۳d == null && widget.u.f۶۶۳d == null) {
                    topNode.b(1);
                    bottomNode.b(1);
                    if (optimiseDimensions) {
                        bottomNode.a(topNode, 1, widget.m());
                    } else {
                        bottomNode.a(topNode, widget.i());
                    }
                    d dVar = widget.v;
                    if (dVar.f۶۶۳d != null) {
                        dVar.d().b(1);
                        topNode.a(1, widget.v.d(), -widget.N);
                    }
                } else if (widget.s.f۶۶۳d != null && widget.u.f۶۶۳d == null) {
                    topNode.b(1);
                    bottomNode.b(1);
                    if (optimiseDimensions) {
                        bottomNode.a(topNode, 1, widget.m());
                    } else {
                        bottomNode.a(topNode, widget.i());
                    }
                    if (widget.N > 0) {
                        widget.v.d().a(1, topNode, widget.N);
                    }
                } else if (widget.s.f۶۶۳d == null && widget.u.f۶۶۳d != null) {
                    topNode.b(1);
                    bottomNode.b(1);
                    if (optimiseDimensions) {
                        topNode.a(bottomNode, -1, widget.m());
                    } else {
                        topNode.a(bottomNode, -widget.i());
                    }
                    if (widget.N > 0) {
                        widget.v.d().a(1, topNode, widget.N);
                    }
                } else if (widget.s.f۶۶۳d != null && widget.u.f۶۶۳d != null) {
                    topNode.b(2);
                    bottomNode.b(2);
                    if (optimiseDimensions) {
                        topNode.b(bottomNode, -1, widget.m());
                        bottomNode.b(topNode, 1, widget.m());
                        widget.m().a(topNode);
                        widget.n().a(bottomNode);
                    } else {
                        topNode.b(bottomNode, (float) (-widget.i()));
                        bottomNode.b(topNode, (float) widget.i());
                    }
                    if (widget.N > 0) {
                        widget.v.d().a(1, topNode, widget.N);
                    }
                }
            } else if (isOptimizableVerticalMatch) {
                int height = widget.i();
                topNode.b(1);
                bottomNode.b(1);
                if (widget.s.f۶۶۳d == null && widget.u.f۶۶۳d == null) {
                    if (optimiseDimensions) {
                        bottomNode.a(topNode, 1, widget.m());
                    } else {
                        bottomNode.a(topNode, height);
                    }
                } else if (widget.s.f۶۶۳d == null || widget.u.f۶۶۳d != null) {
                    if (widget.s.f۶۶۳d != null || widget.u.f۶۶۳d == null) {
                        if (widget.s.f۶۶۳d != null && widget.u.f۶۶۳d != null) {
                            if (optimiseDimensions) {
                                widget.m().a(topNode);
                                widget.n().a(bottomNode);
                            }
                            if (widget.F == 0.0f) {
                                topNode.b(3);
                                bottomNode.b(3);
                                topNode.b(bottomNode, 0.0f);
                                bottomNode.b(topNode, 0.0f);
                                return;
                            }
                            topNode.b(2);
                            bottomNode.b(2);
                            topNode.b(bottomNode, (float) (-height));
                            bottomNode.b(topNode, (float) height);
                            widget.c(height);
                            if (widget.N > 0) {
                                widget.v.d().a(1, topNode, widget.N);
                            }
                        }
                    } else if (optimiseDimensions) {
                        topNode.a(bottomNode, -1, widget.m());
                    } else {
                        topNode.a(bottomNode, -height);
                    }
                } else if (optimiseDimensions) {
                    bottomNode.a(topNode, 1, widget.m());
                } else {
                    bottomNode.a(topNode, height);
                }
            }
        }
    }

    static boolean a(f container, android.support.constraint.i.e system, int orientation, int offset, c chainHead) {
        boolean isChainSpreadInside;
        boolean isChainSpread;
        boolean isChainPacked;
        float distance;
        e widget;
        float distance2;
        float totalWeights;
        e firstVisibleWidget;
        boolean isChainPacked2;
        float dimension;
        float totalWeights2;
        float dimension2;
        float extraMargin;
        e first;
        int numMatchConstraints;
        int numMatchConstraints2;
        e next;
        e first2 = chainHead.f۶۵۲a;
        e last = chainHead.f۶۵۴c;
        e firstVisibleWidget2 = chainHead.f۶۵۳b;
        e lastVisibleWidget = chainHead.f۶۵۵d;
        e head = chainHead.f۶۵۶e;
        d nextAnchor = null;
        float totalWeights3 = chainHead.k;
        e firstMatchConstraintsWidget = chainHead.f۶۵۷f;
        e eVar = chainHead.f۶۵۸g;
        boolean isWrapContent = container.B[orientation] == e.b.WRAP_CONTENT;
        if (orientation == 0) {
            isChainSpread = head.Y == 0;
            isChainSpreadInside = head.Y == 1;
            isChainPacked = head.Y == 2;
        } else {
            isChainSpread = head.Z == 0;
            isChainSpreadInside = head.Z == 1;
            isChainPacked = head.Z == 2;
        }
        int numMatchConstraints3 = 0;
        int numVisibleWidgets = 0;
        float totalMargins = 0.0f;
        float totalSize = 0.0f;
        e widget2 = first2;
        while (nextAnchor == null) {
            if (widget2.s() != 8) {
                numVisibleWidgets++;
                if (orientation == 0) {
                    totalSize += (float) widget2.t();
                } else {
                    totalSize += (float) widget2.i();
                }
                if (widget2 != firstVisibleWidget2) {
                    totalSize += (float) widget2.z[offset].b();
                }
                totalMargins = totalMargins + ((float) widget2.z[offset].b()) + ((float) widget2.z[offset + 1].b());
            }
            d dVar = widget2.z[offset];
            if (widget2.s() != 8 && widget2.B[orientation] == e.b.MATCH_CONSTRAINT) {
                numMatchConstraints3++;
                if (orientation == 0) {
                    if (!(widget2.f۶۸۶e == 0 && widget2.f۶۸۹h == 0 && widget2.i == 0)) {
                        return false;
                    }
                } else if (!(widget2.f۶۸۷f == 0 && widget2.k == 0 && widget2.l == 0)) {
                    return false;
                }
            }
            d nextAnchor2 = widget2.z[offset + 1].f۶۶۳d;
            if (nextAnchor2 != null) {
                e next2 = nextAnchor2.f۶۶۱b;
                d[] dVarArr = next2.z;
                numMatchConstraints2 = numMatchConstraints3;
                if (dVarArr[offset].f۶۶۳d == null || dVarArr[offset].f۶۶۳d.f۶۶۱b != widget2) {
                    next = null;
                } else {
                    next = next2;
                }
            } else {
                numMatchConstraints2 = numMatchConstraints3;
                next = null;
            }
            if (next != null) {
                widget2 = next;
                nextAnchor = nextAnchor;
            } else {
                nextAnchor = 1;
            }
            firstMatchConstraintsWidget = firstMatchConstraintsWidget;
            numMatchConstraints3 = numMatchConstraints2;
        }
        k firstNode = first2.z[offset].d();
        k lastNode = last.z[offset + 1].d();
        k kVar = firstNode.f۷۰۰d;
        if (kVar != null) {
            k kVar2 = lastNode.f۷۰۰d;
            if (kVar2 != null) {
                if (kVar.f۷۰۷b != 1 && kVar2.f۷۰۷b != 1) {
                    return false;
                }
                if (numMatchConstraints3 > 0 && numMatchConstraints3 != numVisibleWidgets) {
                    return false;
                }
                float extraMargin2 = 0.0f;
                if (isChainPacked || isChainSpread || isChainSpreadInside) {
                    if (firstVisibleWidget2 != null) {
                        extraMargin2 = (float) firstVisibleWidget2.z[offset].b();
                    }
                    if (lastVisibleWidget != null) {
                        extraMargin2 += (float) lastVisibleWidget.z[offset + 1].b();
                    }
                }
                float firstOffset = firstNode.f۷۰۰d.f۷۰۳g;
                float lastOffset = lastNode.f۷۰۰d.f۷۰۳g;
                if (firstOffset < lastOffset) {
                    distance = (lastOffset - firstOffset) - totalSize;
                } else {
                    distance = (firstOffset - lastOffset) - totalSize;
                }
                if (numMatchConstraints3 > 0 && numMatchConstraints3 == numVisibleWidgets) {
                    if (widget2.l() != null) {
                        if (widget2.l().B[orientation] == e.b.WRAP_CONTENT) {
                            return false;
                        }
                    }
                    float distance3 = (distance + totalSize) - totalMargins;
                    e widget3 = firstVisibleWidget2;
                    float position = firstOffset;
                    if (isChainSpread) {
                        distance3 -= totalMargins - extraMargin2;
                    }
                    if (isChainSpread) {
                        position += (float) widget3.z[offset + 1].b();
                        e next3 = widget3.c0[orientation];
                        if (next3 != null) {
                            position += (float) next3.z[offset].b();
                        }
                    }
                    while (widget3 != null) {
                        f fVar = android.support.constraint.i.e.q;
                        if (fVar != null) {
                            first = first2;
                            extraMargin = extraMargin2;
                            fVar.z--;
                            fVar.r++;
                            fVar.x++;
                        } else {
                            first = first2;
                            extraMargin = extraMargin2;
                        }
                        e next4 = widget3.c0[orientation];
                        if (next4 != null || widget3 == lastVisibleWidget) {
                            float dimension3 = distance3 / ((float) numMatchConstraints3);
                            if (totalWeights3 > 0.0f) {
                                dimension3 = (widget3.a0[orientation] * distance3) / totalWeights3;
                            }
                            float position2 = position + ((float) widget3.z[offset].b());
                            widget3.z[offset].d().a(firstNode.f۷۰۲f, position2);
                            numMatchConstraints = numMatchConstraints3;
                            widget3.z[offset + 1].d().a(firstNode.f۷۰۲f, position2 + dimension3);
                            widget3.z[offset].d().a(system);
                            widget3.z[offset + 1].d().a(system);
                            position = position2 + dimension3 + ((float) widget3.z[offset + 1].b());
                        } else {
                            numMatchConstraints = numMatchConstraints3;
                        }
                        widget3 = next4;
                        first2 = first;
                        extraMargin2 = extraMargin;
                        numMatchConstraints3 = numMatchConstraints;
                    }
                    return true;
                } else if (distance < totalSize) {
                    return false;
                } else {
                    if (isChainPacked) {
                        e widget4 = firstVisibleWidget2;
                        float distance4 = (first2.j() * (distance - extraMargin2)) + firstOffset;
                        while (widget4 != null) {
                            f fVar2 = android.support.constraint.i.e.q;
                            if (fVar2 != null) {
                                totalWeights2 = totalWeights3;
                                fVar2.z--;
                                fVar2.r++;
                                fVar2.x++;
                            } else {
                                totalWeights2 = totalWeights3;
                            }
                            e next5 = widget4.c0[orientation];
                            if (next5 != null || widget4 == lastVisibleWidget) {
                                if (orientation == 0) {
                                    dimension2 = (float) widget4.t();
                                } else {
                                    dimension2 = (float) widget4.i();
                                }
                                float distance5 = distance4 + ((float) widget4.z[offset].b());
                                widget4.z[offset].d().a(firstNode.f۷۰۲f, distance5);
                                widget4.z[offset + 1].d().a(firstNode.f۷۰۲f, distance5 + dimension2);
                                widget4.z[offset].d().a(system);
                                widget4.z[offset + 1].d().a(system);
                                distance4 = distance5 + dimension2 + ((float) widget4.z[offset + 1].b());
                            }
                            widget4 = next5;
                            totalWeights3 = totalWeights2;
                        }
                        return true;
                    }
                    float totalWeights4 = totalWeights3;
                    if (!isChainSpread && !isChainSpreadInside) {
                        return true;
                    }
                    if (isChainSpread) {
                        distance -= extraMargin2;
                    } else if (isChainSpreadInside) {
                        distance -= extraMargin2;
                    }
                    float gap = distance / ((float) (numVisibleWidgets + 1));
                    if (isChainSpreadInside) {
                        if (numVisibleWidgets > 1) {
                            gap = distance / ((float) (numVisibleWidgets - 1));
                        } else {
                            gap = distance / 2.0f;
                        }
                    }
                    float distance6 = firstOffset + gap;
                    if (isChainSpreadInside && numVisibleWidgets > 1) {
                        distance6 = firstOffset + ((float) firstVisibleWidget2.z[offset].b());
                    }
                    if (!isChainSpread || firstVisibleWidget2 == null) {
                        widget = firstVisibleWidget2;
                        distance2 = distance6;
                    } else {
                        float distance7 = distance6 + ((float) firstVisibleWidget2.z[offset].b());
                        widget = firstVisibleWidget2;
                        distance2 = distance7;
                    }
                    while (widget != null) {
                        f fVar3 = android.support.constraint.i.e.q;
                        if (fVar3 != null) {
                            totalWeights = totalWeights4;
                            firstVisibleWidget = firstVisibleWidget2;
                            fVar3.z--;
                            fVar3.r++;
                            fVar3.x++;
                        } else {
                            totalWeights = totalWeights4;
                            firstVisibleWidget = firstVisibleWidget2;
                        }
                        e next6 = widget.c0[orientation];
                        if (next6 != null || widget == lastVisibleWidget) {
                            if (orientation == 0) {
                                dimension = (float) widget.t();
                            } else {
                                dimension = (float) widget.i();
                            }
                            widget.z[offset].d().a(firstNode.f۷۰۲f, distance2);
                            isChainPacked2 = isChainPacked;
                            widget.z[offset + 1].d().a(firstNode.f۷۰۲f, distance2 + dimension);
                            widget.z[offset].d().a(system);
                            widget.z[offset + 1].d().a(system);
                            distance2 += dimension + gap;
                        } else {
                            isChainPacked2 = isChainPacked;
                        }
                        widget = next6;
                        firstVisibleWidget2 = firstVisibleWidget;
                        totalWeights4 = totalWeights;
                        isChainPacked = isChainPacked2;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
