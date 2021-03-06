package com.maaz.interiar.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.maaz.interiar.R;
import com.maaz.interiar.ui.Models.HorizontalProductScrollModel;

import java.util.List;

public class HorizontalProductScrollAdapter  extends RecyclerView.Adapter<HorizontalProductScrollAdapter.ViewHolder>{


    private List<HorizontalProductScrollModel> horizontalProductScrollModelList;

    public HorizontalProductScrollAdapter(List<HorizontalProductScrollModel> horizontalProductScrollModelList) {
        this.horizontalProductScrollModelList = horizontalProductScrollModelList;
    }


    /*video 17 (23mins)*/
    @NonNull
    @Override
    public HorizontalProductScrollAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.horizontal_scroll_item_layout, viewGroup , false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalProductScrollAdapter.ViewHolder viewHolder, int position) {
        int resource = horizontalProductScrollModelList.get(position).getProductImage();
        String title = horizontalProductScrollModelList.get(position).getProductTitle();
        String description = horizontalProductScrollModelList.get(position).getProductDescription();
        String price = horizontalProductScrollModelList.get(position).getProductPrice();

        viewHolder.setProductImage(resource);
        viewHolder.setProductTitle(title);
        viewHolder.setProductDescription(description);
        viewHolder.setProductPrice(price);
    }

    @Override
    public int getItemCount() {

        /*Maximum 8 view are visible in horizont Product Scroll Layout*/
        if (horizontalProductScrollModelList.size() > 8)
        {
            return 8;
        }
        else
        {
            return horizontalProductScrollModelList.size();
        }

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView productImage;
        private TextView productTitle;
        private TextView productDescription;
        private TextView productPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            productImage = itemView.findViewById(R.id.horizontal_scroll_product_image);
            productTitle = itemView.findViewById(R.id.horizontal_scroll_product_title);
            productDescription = itemView.findViewById(R.id.horizontal_scroll_product_description);
            productPrice = itemView.findViewById(R.id.horizontal_scroll_product_price);
        }

        private void setProductImage(int resource){
            productImage.setImageResource(resource);
        }
        private void setProductTitle(String title){
            productTitle.setText(title);
        }
        private void setProductDescription(String description){
            productTitle.setText(description);
        }
        private void setProductPrice(String price){
            productTitle.setText(price);
        }
    }
}
