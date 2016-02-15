package com.liu.thomas.lightitup;


import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.EditText;
import android.widget.TextView;

import java.util.List;
import java.util.Vector;

public class Rooms extends AppCompatActivity {

        public String Kamer;
    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;
    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    public void setTitle(CharSequence title) {
        super.setTitle("Light IT up");
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, Add.class);
        startActivity(intent);}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rooms);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rooms, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent intent = new Intent(this, Settings.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class Tab1 extends Fragment {

        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_PAGE_NUMBER = "page_number";

        public Tab1() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        /* Tab 1 */
        public static Tab1 newInstance(int sectionNumber) {
            Tab1 fragment = new Tab1();
            Bundle args = new Bundle();
            args.putInt(ARG_PAGE_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_rooms, container, false);

            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            int page = getArguments().getInt(ARG_PAGE_NUMBER, - 1);

            switch (page){
                case 1:
                    View rootView1 = inflater.inflate(R.layout.tab1_layout, container, false);
                    return rootView1;
                case 2:
                    View rootView2 = inflater.inflate(R.layout.tab2_layout, container, false);
                    return rootView2;
                case 3:
                    View rootView3 = inflater.inflate(R.layout.tab3_layout, container, false);
                    return rootView3;
                case 4:
                    View rootView4 = inflater.inflate(R.layout.tab4_layout, container, false);
                    return rootView4;
                default: return rootView;
            }

        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).

            return Tab1.newInstance(position + 1);
        }


        @Override
        public int getCount() {
            // Show 4 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    Kamer="Living";
                    return Kamer;

                case 1:
                    Kamer="Keuken";
                    return Kamer;
                case 2:
                    Kamer="Gang";
                    return Kamer;
                case 3:
                    Kamer="Toilet";
                    return Kamer;
            }
            return null;
        }
    }
}
