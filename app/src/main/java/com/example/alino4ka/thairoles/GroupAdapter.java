package com.example.alino4ka.thairoles;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.GroupHolder> {
    private List<String> groups;
    private OnItemClickListener clickListener;

    public GroupAdapter(List<String>groups , OnItemClickListener clickListener){
        this.groups = groups;
        this.clickListener = clickListener;
        System.out.println(clickListener);
    }



    @Override
    public GroupHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.group_item, parent, false);
        return new GroupHolder(view);
    }

    @Override
    public void onBindViewHolder(GroupHolder holder, int position) {
        holder.bind(groups.get(position));
    }


    @Override
    public int getItemCount() {
        return groups.size();
    }

    public class GroupHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView title;

        public GroupHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
        }

        public void bind(String group){
            title.setText(group);
        }

        @Override
        public void onClick(View v) {
            clickListener.onClick(v, getAdapterPosition());
        }
    }
}

