package com.example.scm.Adapter;

import android.content.Context;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.scm.Bean.Bean_Profile;
import com.example.scm.R;

import java.util.ArrayList;


public class Adapter_profile extends BaseAdapter{
    ArrayList<Bean_Profile> arrbp;
    Context context;

    public Adapter_profile(Context context,ArrayList<Bean_Profile> arrbp){
        this.context=context;
        this.arrbp=arrbp;
    }


    @Override
    public int getCount() {
        return arrbp.size();
    }

    @Override
    public Object getItem(int i) {
        return arrbp.get(i);
    }

    @Override
    public long getItemId(int i) {
        return arrbp.get(i).getSID();
    }

    public byte[] getImg(int i){return arrbp.get(i).getStudentdisp();}




    private class ViewHolder{
        TextView tv_sid;
        TextView tv_sname;
        TextView tv_fname;
        TextView tv_fc;
        TextView tv_mname;
        TextView tv_mc;
        TextView tv_add;
        TextView tv_class;
        TextView tv_tname;
        TextView tv_dob;
        ImageView tv_disp;

        ImageView papa_img,mom_img;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder= null;
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view==null){
            viewHolder= new ViewHolder();
            view=layoutInflater.inflate(R.layout.activity_profile, viewGroup, false);
            viewHolder.papa_img=view.findViewById(R.id.papa_img);
            viewHolder.mom_img=view.findViewById(R.id.mom_img);
            viewHolder.tv_sid= (TextView)view.findViewById(R.id.sid);
            viewHolder.tv_sname=(TextView)view.findViewById(R.id.snm);
            viewHolder.tv_fname= (TextView)view.findViewById(R.id.fnm);
            viewHolder.tv_fc= (TextView)view.findViewById(R.id.fc);
            viewHolder.tv_mname =(TextView)view.findViewById(R.id.mnm);
            viewHolder.tv_mc= (TextView)view.findViewById(R.id.mc);
            viewHolder.tv_add= (TextView)view.findViewById(R.id.add_txt);
            viewHolder.tv_class= (TextView)view.findViewById(R.id.sclass);
            viewHolder.tv_tname= (TextView)view.findViewById(R.id.tname);
            viewHolder.tv_dob= (TextView)view.findViewById(R.id.dob);
            viewHolder.tv_disp=(ImageView)view.findViewById(R.id.display);




            view.setTag(viewHolder);


        }else{
            viewHolder=(ViewHolder) view.getTag();
        }
        Bitmap bmp = BitmapFactory.decodeByteArray(arrbp.get(i).getStudentdisp(),0,arrbp.get(i).getStudentdisp().length);

        viewHolder.tv_disp.setImageBitmap(bmp);

        viewHolder.tv_sname.setText(arrbp.get(i).getSNAME());
        viewHolder.tv_sid.setText(""+arrbp.get(i).getSID());
        viewHolder.tv_fname.setText(arrbp.get(i).getFNAME());
        viewHolder.tv_fc.setText((arrbp.get(i).getFCONTACT()));
        viewHolder.tv_mname.setText(arrbp.get(i).getMNAME());
        viewHolder.tv_mc.setText(arrbp.get(i).getMCONTACT());
        viewHolder.tv_add.setText(arrbp.get(i).getADD());
        viewHolder.tv_class.setText(arrbp.get(i).getCLASS());
        viewHolder.tv_tname.setText(arrbp.get(i).getTNAME());
        viewHolder.tv_dob.setText(arrbp.get(i).getDOB());






        return view;
    }


}