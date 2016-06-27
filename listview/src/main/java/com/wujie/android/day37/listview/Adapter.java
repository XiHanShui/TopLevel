package com.wujie.android.day37.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.HashMap;
import java.util.List;

/**
 *
 * Created by TF on 2016/6/26.
 */
public class Adapter extends BaseAdapter {
    private List<String> list;
    private HashMap<Integer,Boolean> isCheck;
    private Context context;
    private LayoutInflater inflater;

    public Adapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;
        inflater=LayoutInflater.from(context);
        isCheck=new HashMap<>();
        initData();
    }

    private void initData() {
        for(int i=0;i<list.size();i++){
                
        }
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
