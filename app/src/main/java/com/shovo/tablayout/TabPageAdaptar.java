package com.shovo.tablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabPageAdaptar extends FragmentPagerAdapter {


    public TabPageAdaptar(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Home_Fragment home_fragment =new Home_Fragment();
                return home_fragment;
            case 1:
                MessageFragment messageFragment =new MessageFragment();
                return messageFragment;
            case 2:
                inbox_Fragment inbox_fragment =new inbox_Fragment();
                return inbox_fragment;
            case  3:
                Transaction_Fragment transaction_fragment=new Transaction_Fragment();
                return transaction_fragment;
                case   4:
                Contract_Fragment contract_fragment=new Contract_Fragment();
                return contract_fragment;

                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
       switch (position) {
           case  0:
               return "Home";
           case  1:
               return "Message";
           case  2:
               return "Inbox";
           case 3:
               return "Transaction";
           case 4:
               return "Contract";
               default:
                   return null;

       }
    }
}
