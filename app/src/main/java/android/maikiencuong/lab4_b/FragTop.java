package android.maikiencuong.lab4_b;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class FragTop extends Fragment {

    private ImageView imgvBack,imgvShopping;
    private TextView tvChat;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;


    public FragTop() {
    }
    public static FragTop newInstance(String param1) {
        FragTop fragment = new FragTop();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag_top, container, false);
        view.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        imgvBack = view.findViewById(R.id.imgvBack);
        imgvShopping = view.findViewById(R.id.imgvShopping);
        tvChat = view.findViewById(R.id.tvChat);
        tvChat.setTypeface(null, Typeface.BOLD);
        tvChat.setTextColor(Color.WHITE);
        imgvShopping.setImageResource(R.drawable.ic_baseline_add_shopping_cart_24);
        imgvBack.setImageResource(R.drawable.ic_baseline_arrow_back_24);
        tvChat.setText(mParam1);
        return view;
    }
}