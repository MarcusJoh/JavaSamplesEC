package com.example.lesson6_1;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ValueAdapter extends RecyclerView.Adapter<ValueAdapter.ViewHolder> {

    // testing only
    //  private String[] testTitle= {"Item 1","Item 2", "Item 3"};
    //  private String[] testContent= {"Content 1","Content 2", "Content 3"};

    // real thing
    ArrayList<ValueBean> localValueBeans;

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView valueTitle, valueContent;

        public ViewHolder(View itemView) {
            super(itemView);

            valueTitle = itemView.findViewById(R.id.valueTitle);

            valueContent = itemView.findViewById(R.id.valueContent);
        }

        public TextView getValueTitle() {

            return valueTitle;
        }

        public TextView getValueContent() {

            return valueContent;
        }
    }

    public ValueAdapter(ArrayList<ValueBean> valueBeans) {
        // this runs when the adaper is called
        Log.d("ADA", "ValueAdapter: ");

        localValueBeans = valueBeans;


    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.value_layout, viewGroup, false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ValueAdapter.ViewHolder holder, int position) {
        // this is where you can connect content and the list

        //  Log.d("ADA", "onBindViewHolder: "+testTitle[position]);
        // holder.getValueTitle().setText(testTitle[position]);

        //  holder.getValueContent().setText(testContent[position]);

        Log.d("ADA", "onBindViewHolder: " + localValueBeans.get(position).getValueTitle());

        holder.getValueTitle().setText(localValueBeans.get(position).getValueTitle());

        holder.getValueContent().setText(localValueBeans.get(position).getValueContent());


    }

    @Override
    public int getItemCount() {
        //return testTitle.length;
        return localValueBeans.size();
    }


}
