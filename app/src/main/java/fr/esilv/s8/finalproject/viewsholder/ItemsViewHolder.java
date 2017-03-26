package fr.esilv.s8.finalproject.viewsholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


import fr.esilv.s8.finalproject.Interface.OnVideoSelectedListener;
import fr.esilv.s8.finalproject.R;
import fr.esilv.s8.finalproject.models.Item;
import fr.esilv.s8.finalproject.models.Items;

/**
 * Created by hugoalix on 17/03/2017.
 */

public class ItemsViewHolder extends RecyclerView.ViewHolder {

    private TextView title;
    private OnVideoSelectedListener onVideoSelectedListener;

    public ItemsViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.Title);
    }

    public void setOnVideoSelectedListener(OnVideoSelectedListener onVideoSelectedListener) {
        this.onVideoSelectedListener = onVideoSelectedListener;
    }

    public void bind(final Item item) {
        title.setText(item.getSnippet().getTitle());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onVideoSelectedListener == null) {
                    return;
                }
                onVideoSelectedListener.onVideoSelected(item);
            }
        });
    }
}