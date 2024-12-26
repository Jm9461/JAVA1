package com.lawyer_smartCalendar.activity;

import android.content.Context;
import android.content.Intent;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.support.p۰۴۷v7.widget.LinearLayoutManager;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.lawyer_smartCalendar.R;
import com.lawyer_smartCalendar.model.Case;
import com.lawyer_smartCalendar.model.Client;
import com.lawyer_smartCalendar.model.Note;
import com.lawyer_smartCalendar.model.Schedule;
import com.lawyer_smartCalendar.p۱۳۰a.Ce0;
import com.lawyer_smartCalendar.p۱۳۰a.Cf;
import com.lawyer_smartCalendar.p۱۳۰a.Cl;
import com.lawyer_smartCalendar.p۱۳۰a.Cx;
import com.lawyer_smartCalendar.utils.Ci;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import java.util.List;
import p۱۶۴uk.p۱۶۵co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class SearchActivity extends ActivityCe {
    public RecyclerView mRecyclerView;

    /* renamed from: r  reason: contains not printable characters */
    private String f۱۴۴۶۸r = "";

    /* renamed from: s  reason: contains not printable characters */
    MaterialSearchView f۱۴۴۶۹s;

    /* renamed from: t  reason: contains not printable characters */
    private MenuItem f۱۴۴۷۰t;
    public TextView txt_recycle_no_data;

    /* renamed from: u  reason: contains not printable characters */
    private String f۱۴۴۷۱u = "";

    /* renamed from: v  reason: contains not printable characters */
    private Ci f۱۴۴۷۲v;

    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onBackPressed() {
        if (this.f۱۴۴۶۹s.m۱۷۸۵۸c()) {
            this.f۱۴۴۶۹s.m۱۷۸۵۱a();
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            overridePendingTransition(17432576, 17432577);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            m۱۷۴۶۷a(this.f۱۴۴۷۱u);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search, menu);
        this.f۱۴۴۷۰t = menu.findItem(R.id.action_search);
        this.f۱۴۴۶۹s.setMenuItem(this.f۱۴۴۷۰t);
        this.f۱۴۴۶۹s.m۱۷۸۵۹d();
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_search) {
            this.f۱۴۴۶۹s.m۱۷۸۵۹d();
        }
        return super.onOptionsItemSelected(item);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0094, code lost:
        if (r2.equals("meeting") != false) goto L_0x00de;
     */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 346
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lawyer_smartCalendar.activity.SearchActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: com.lawyer_smartCalendar.activity.SearchActivity$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {
        View$OnClickListenerCa() {
        }

        public void onClick(View view) {
            SearchActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.SearchActivity$b  reason: invalid class name */
    class Cb implements MaterialSearchView.AbstractCh {
        Cb() {
        }

        @Override // com.miguelcatalan.materialsearchview.MaterialSearchView.AbstractCh
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۷۴۷۰b(String query) {
            return false;
        }

        @Override // com.miguelcatalan.materialsearchview.MaterialSearchView.AbstractCh
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۷۴۶۹a(String newText) {
            if (!newText.equals("") && newText.length() > 2) {
                SearchActivity.this.f۱۴۴۷۱u = newText;
                SearchActivity.this.m۱۷۴۶۷a(newText);
            }
            if (newText.length() != 0) {
                return false;
            }
            SearchActivity.this.mRecyclerView.removeAllViews();
            SearchActivity.this.mRecyclerView.setVisibility(8);
            return false;
        }
    }

    /* renamed from: com.lawyer_smartCalendar.activity.SearchActivity$c  reason: invalid class name */
    class Cc implements MaterialSearchView.AbstractCj {
        Cc(SearchActivity this$0) {
        }

        @Override // com.miguelcatalan.materialsearchview.MaterialSearchView.AbstractCj
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۴۷۱a() {
        }

        @Override // com.miguelcatalan.materialsearchview.MaterialSearchView.AbstractCj
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۷۴۷۲b() {
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۴۶۷a(String queryText) {
        char c;
        String str = this.f۱۴۴۶۸r;
        switch (str.hashCode()) {
            case -1357712437:
                if (str.equals("client")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3046192:
                if (str.equals("case")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3387378:
                if (str.equals("note")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 942033467:
                if (str.equals("meeting")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.f۱۴۴۷۲v.m۱۷۸۱۱n();
            List<Schedule> ScheduleList = this.f۱۴۴۷۲v.m۱۷۷۵۴A(queryText);
            this.f۱۴۴۷۲v.close();
            this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            this.mRecyclerView.setAdapter(new Ce0(this, ScheduleList));
            if (ScheduleList.isEmpty()) {
                this.mRecyclerView.setVisibility(8);
                this.txt_recycle_no_data.setVisibility(0);
                return;
            }
            this.mRecyclerView.setVisibility(0);
            this.txt_recycle_no_data.setVisibility(8);
        } else if (c == 1) {
            this.f۱۴۴۷۲v.m۱۷۸۱۱n();
            List<Case> caseList = this.f۱۴۴۷۲v.m۱۷۸۰۲j(queryText);
            this.f۱۴۴۷۲v.close();
            this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            this.mRecyclerView.setAdapter(new Cf(this, caseList));
            if (caseList.isEmpty()) {
                this.mRecyclerView.setVisibility(8);
                this.txt_recycle_no_data.setVisibility(0);
                return;
            }
            this.mRecyclerView.setVisibility(0);
            this.txt_recycle_no_data.setVisibility(8);
        } else if (c == 2) {
            this.f۱۴۴۷۲v.m۱۷۸۱۱n();
            List<Client> clientList = this.f۱۴۴۷۲v.m۱۷۸۱۰n(queryText);
            this.f۱۴۴۷۲v.close();
            this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            this.mRecyclerView.setAdapter(new Cl(this, clientList));
            if (clientList.isEmpty()) {
                this.mRecyclerView.setVisibility(8);
                this.txt_recycle_no_data.setVisibility(0);
                return;
            }
            this.mRecyclerView.setVisibility(0);
            this.txt_recycle_no_data.setVisibility(8);
        } else if (c == 3) {
            this.f۱۴۴۷۲v.m۱۷۸۱۱n();
            List<Note> noteList = this.f۱۴۴۷۲v.m۱۷۸۱۷t(queryText);
            this.f۱۴۴۷۲v.close();
            this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            this.mRecyclerView.setAdapter(new Cx(this, noteList));
            if (noteList.isEmpty()) {
                this.mRecyclerView.setVisibility(8);
                this.txt_recycle_no_data.setVisibility(0);
                return;
            }
            this.mRecyclerView.setVisibility(0);
            this.txt_recycle_no_data.setVisibility(8);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۷۴۶۸c(Intent intent) {
        startActivityForResult(intent, 200);
    }
}
