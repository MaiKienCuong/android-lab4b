package android.maikiencuong.lab4_b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.NameViewHolder> {
    private LayoutInflater layoutInflater;
    private ArrayList<Product> products;

    public ProductsAdapter(Context context, ArrayList<Product> products) {

        layoutInflater = LayoutInflater.from(context);
        this.products = products;
    }

    @NonNull
    @Override
    public ProductsAdapter.NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = layoutInflater.inflate(R.layout.line_item,parent,false);

       return new NameViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsAdapter.NameViewHolder holder, int position) {
        Product productCurrent = products.get(position);
        holder.tvShopName.setText(productCurrent.getShopName());
        holder.tvProductName.setText(productCurrent.getProductName());
        holder.imgvProductImage.setImageResource(productCurrent.getImage());
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class NameViewHolder extends RecyclerView.ViewHolder{
        public TextView tvProductName,tvShopName;
        public ImageView imgvProductImage;
        ProductsAdapter adapter;

        public NameViewHolder(@NonNull View itemView, ProductsAdapter adapter) {
            super(itemView);
            tvProductName = itemView.findViewById(R.id.tvProductName);
            tvShopName = itemView.findViewById(R.id.tvShopName);
            imgvProductImage = itemView.findViewById(R.id.imgvProductImage);
            this.adapter = adapter;
        }
    }
}
