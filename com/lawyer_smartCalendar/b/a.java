package com.lawyer_smartCalendar.b;

import com.mohamadamin.persianmaterialdatetimepicker.j.b;

public class a {
    public static String a(Long timeStamp) {
        b mcurrentDate = new b();
        mcurrentDate.setTimeInMillis(timeStamp.longValue());
        return mcurrentDate.f();
    }
}
