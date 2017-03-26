package fr.esilv.s8.finalproject.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.esilv.s8.finalproject.Interface.OnVideoSelectedListener;
import fr.esilv.s8.finalproject.R;
import fr.esilv.s8.finalproject.models.Items;
import fr.esilv.s8.finalproject.viewsholder.ItemsViewHolder;

/**
 * Created by hugoalix on 22/03/2017.
 */

public class ItemsAdapter extends RecyclerView.Adapter<ItemsViewHolder> {

    private final Items items;
    private OnVideoSelectedListener onVideoSelectedListener;

    public ItemsAdapter(Items items) {
        this.items = items;
    }

    @Override
    public ItemsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder, parent, false);
        return new ItemsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemsViewHolder holder, int position) {
        holder.setOnVideoSelectedListener(onVideoSelectedListener);
        holder.bind(items.get(position));

    }

    @Override
    public int getItemCount() {
        return items != null ? items.size() : 0;
    }

    public void setOnVideoSelectedListener(OnVideoSelectedListener onVideoSelectedListener) {
        this.onVideoSelectedListener = onVideoSelectedListener;
    }
}
