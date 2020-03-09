package com.shovo.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabPageAdaptar tabPageAdaptar;
    private  int[] tabIcons={
            R.drawable.ic_home,
            R.drawable.ic_message,
            R.drawable.ic_email_,
            R.drawable.ic_monetization_,
            R.drawable.ic_perm_contac

    };
    private FloatingActionButton inbox ,contract,transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inbox=findViewById(R.id.inboxId);
        contract=findViewById(R.id.contactId);
        transaction=findViewById(R.id.transctionId);


        viewPager=findViewById(R.id.viewPagerId);
        tabLayout=findViewById(R.id.tablayoutId);
        tabPageAdaptar =new TabPageAdaptar(getSupportFragmentManager());
        viewPager.setAdapter(tabPageAdaptar);
        tabLayout.setTabTextColors(Color.parseColor("#000000"),Color.parseColor("#FFFFFF"));
        tabLayout.setupWithViewPager(viewPager);
        setutTabIcon();


        inbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "inbox", Toast.LENGTH_SHORT).show();
            }
        });

        contract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "contract", Toast.LENGTH_SHORT).show();
            }
        });

        transaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Transaction", Toast.LENGTH_SHORT).show();
            }
        });





        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getIcon().setTint(getResources().getColor(R.color.White));
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

                tab.getIcon().setTint(getResources().getColor(R.color.Black));

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setutTabIcon() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
        tabLayout.getTabAt(4).setIcon(tabIcons[4]);
    }
}
