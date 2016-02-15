    package com.liu.thomas.lightitup;

    import android.os.Bundle;
    import android.support.design.widget.TabLayout;
    import android.support.v4.app.Fragment;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.LinearLayout;
    import android.widget.TextView;

    import java.awt.font.TextAttribute;

    public class Tab1 extends Fragment{
        public static final String ARG_PAGE = "ARG_PAGE";

        private int mPage;

        public static Tab1 NewInstance (int page) {
            Bundle args = new Bundle();
            args.putInt(ARG_PAGE, page);
            Tab1 fragment = new Tab1();
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            mPage = getArguments().getInt(ARG_PAGE);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            View view = inflater.inflate(R.layout.tab1_layout, container, false);
            TextView textView = (TextView) view;
            textView.setText("Fragment #" + mPage);
            return view;
        }
    }
