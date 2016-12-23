package com.jorgereina.myapplication1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jorgereina.myapplication1.objects.Period;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>  {

    Context context;
    List<Period> periodList;

    public Adapter(Context context, List<Period> periodList) {
        this.context = context;
        this.periodList = periodList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView dateTv;
        public TextView highTempTv;
        public TextView lowTempTv;

        public ViewHolder(View itemView) {
            super(itemView);

            dateTv = (TextView) itemView.findViewById(R.id.date_tv);
            highTempTv = (TextView) itemView.findViewById(R.id.high_temp_tv);
            lowTempTv = (TextView) itemView.findViewById(R.id.low_temp_tv);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
//        ViewHolder viewHolder = new ViewHolder(v);
//        return new ViewHolder(v);

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Period period = periodList.get(position);

        holder.dateTv.setText(convertTimestamp(period.getTimestamp()));
        holder.highTempTv.setText("High: "+period.getMaxTempF()+"F");
        holder.lowTempTv.setText("Low: "+period.getMinTempF()+"F");

    }

    @Override
    public int getItemCount() {
        return periodList.size();
    }


    public String convertTimestamp(long timestamp){
        Timestamp stamp = new Timestamp(timestamp*1000);
        Date date = new Date(stamp.getTime());
        String dateS = date.toString();
        dateS = dateS.substring(0, 10);
        return dateS;
    }


}
