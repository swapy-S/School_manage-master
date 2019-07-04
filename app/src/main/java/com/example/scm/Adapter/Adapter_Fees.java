package com.example.scm.Adapter;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;



import java.util.ArrayList;

import com.example.scm.Bean.Bean_Fees;
import com.example.scm.R;
/**
 * Created by jigar on 5/27/2019.
 */

public class Adapter_Fees extends BaseAdapter{
    ArrayList<Bean_Fees> arrbf;
    Context context;

    public Adapter_Fees(Context context,ArrayList<Bean_Fees> arrbf){
        this.context=context;
        this.arrbf=arrbf;
    }


    @Override
    public int getCount() {
        return arrbf.size();
    }

    @Override
    public Object getItem(int i) {
        return arrbf.get(i);
    }

    @Override
    public long getItemId(int i) {
        return arrbf.get(i).getSid();
    }

    private class ViewHolder{
        TextView tv_sid;
        TextView tv_total;
        TextView tv_paid;
        TextView tv_due;
        TextView tv_install;


    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder= null;
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view==null){
            viewHolder= new ViewHolder();
            view=layoutInflater.inflate(R.layout.activity_fees, viewGroup, false);
            //viewHolder.tv_sid= (TextView)view.findViewById(R.id.sid);
            viewHolder.tv_total=(TextView)view.findViewById(R.id.t_fees_value);
            viewHolder.tv_paid= (TextView)view.findViewById(R.id.p_fees_value);
            viewHolder.tv_due= (TextView)view.findViewById(R.id.d_fees_value);
            viewHolder.tv_install= (TextView)view.findViewById(R.id.u_fees_value);


            view.setTag(viewHolder);


        }else{
            viewHolder=(ViewHolder) view.getTag();
        }


        //viewHolder.tv_sid.setText(""+arrbf.get(i).getSid());
        viewHolder.tv_total.setText(""+arrbf.get(i).getTotalFees());
        viewHolder.tv_paid.setText(""+arrbf.get(i).getPaidFees());
        viewHolder.tv_due.setText(""+arrbf.get(i).getDueFees());
        viewHolder.tv_install.setText(""+arrbf.get(i).getInstallment());



        return view;
    }

}

