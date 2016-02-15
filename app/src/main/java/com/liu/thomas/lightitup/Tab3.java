package com.liu.thomas.lightitup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class Tab3 extends android.app.Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TO DO auto-generated method stub
        if (container ==null){
            return null;
        }
        return (LinearLayout)inflater.inflate(R.layout.tab3_layout, container, false);
    }
}
