package com.example.scm.Adapter;




import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.example.scm.Bean.Bean_Achievement;
import com.example.scm.Bean.Bean_Results;
import com.example.scm.R;

import java.util.ArrayList;


/**
 * Created by jigar on 5/27/2019.
 */

public class Adapter_Results extends BaseAdapter{
    ArrayList<Bean_Results> arrbr;
    Context context;

    public Adapter_Results(Context context,ArrayList<Bean_Results> arrbr){
        this.context=context;
        this.arrbr=arrbr;
    }


    @Override
    public int getCount() {
        return arrbr.size();
    }

    @Override
    public Object getItem(int i) {
        return arrbr.get(i);
    }

    @Override
    public long getItemId(int i) {
        return arrbr.get(i).getSid();
    }

    private class ViewHolder{
        TextView tv_sid;
        TextView tv_sname;
        TextView tv_sclass;
        TextView tv_java;
        TextView tv_android;
        TextView tv_OS;
        TextView tv_AI;
        TextView tv_Cpp;
        TextView tv_Maths;
        TextView tv_Database;
        TextView tv_Networking;
        TextView tv_total;

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder= null;
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view==null){
            viewHolder= new ViewHolder();
            view=layoutInflater.inflate(R.layout.activity_result, viewGroup, false);
            viewHolder.tv_sid= (TextView)view.findViewById(R.id.stid);
            viewHolder.tv_sname=(TextView)view.findViewById(R.id.stname);
            viewHolder.tv_sclass= (TextView)view.findViewById(R.id.stclass);
            viewHolder.tv_java= (TextView)view.findViewById(R.id.java);
            viewHolder.tv_android= (TextView)view.findViewById(R.id.android);
            viewHolder.tv_OS= (TextView)view.findViewById(R.id.os);
            viewHolder.tv_AI= (TextView)view.findViewById(R.id.ai);
            viewHolder.tv_Cpp= (TextView)view.findViewById(R.id.cpp);
            viewHolder.tv_Maths= (TextView)view.findViewById(R.id.maths);
            viewHolder.tv_Database= (TextView)view.findViewById(R.id.db);
            viewHolder.tv_Networking= (TextView)view.findViewById(R.id.network);
            viewHolder.tv_total= (TextView)view.findViewById(R.id.total);
            view.setTag(viewHolder);


        }else{
            viewHolder=(ViewHolder) view.getTag();
        }


        viewHolder.tv_sid.setText(""+arrbr.get(i).getSid());

        viewHolder.tv_sname.setText((arrbr.get(i).getSname()));
        viewHolder.tv_sclass.setText((arrbr.get(i).getSclass()));
        viewHolder.tv_java.setText((arrbr.get(i).getJava()));
        viewHolder.tv_android.setText((arrbr.get(i).getAndroid()));
        viewHolder.tv_OS.setText((arrbr.get(i).getOS()));
        viewHolder.tv_AI.setText((arrbr.get(i).getAI()));
        viewHolder.tv_Cpp.setText((arrbr.get(i).getCpp()));
        viewHolder.tv_Maths.setText((arrbr.get(i).getMaths()));
        viewHolder.tv_Database.setText((arrbr.get(i).getDatabase()));
        viewHolder.tv_Networking.setText((arrbr.get(i).getNetworking()));
        viewHolder.tv_total.setText((arrbr.get(i).getTotal()));
        return view;
    }

}

