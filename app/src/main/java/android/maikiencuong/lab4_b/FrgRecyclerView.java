package android.maikiencuong.lab4_b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FrgRecyclerView extends Fragment {
    private RecyclerView rclProduct;
    private ProductsAdapter productsAdapter;
    private ArrayList<Product> products = new ArrayList<Product>();

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public FrgRecyclerView() {
    }

    public static FrgRecyclerView newInstance() {
        FrgRecyclerView fragment = new FrgRecyclerView();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        products.add(new Product("1","Lorem Ipsum is simply dummy","Devang",R.drawable.nam1));
        products.add(new Product("2","Lorem Ipsum is simply dummy","Lorem Ipsum is",R.drawable.nam1));
        products.add(new Product("3","Lorem Ipsum is simply dummy","Lorem Ipsum is",R.drawable.nam1));
        products.add(new Product("4","Lorem Ipsum is simply dummy","Lorem Ipsum is",R.drawable.nam1));
        products.add(new Product("2","Lorem Ipsum is simply dummy","Lorem Ipsum is",R.drawable.nam1));
        products.add(new Product("3","Lorem Ipsum is simply dummy","Lorem Ipsum is",R.drawable.nam1));
        products.add(new Product("4","Lorem Ipsum is simply dummy","Lorem Ipsum is",R.drawable.nam1));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_frg_recycler_view, container, false);
        rclProduct = view.findViewById(R.id.rcvRecycler);

        productsAdapter = new ProductsAdapter(view.getContext(),products);

        rclProduct.setAdapter(productsAdapter);

        rclProduct.setLayoutManager(new LinearLayoutManager(view.getContext()));
        return view;
    }
}