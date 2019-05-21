package alobha.com.ecommerce.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import alobha.com.ecommerce.MainActivity;
import alobha.com.ecommerce.Productlist;
import alobha.com.ecommerce.R;
import alobha.com.ecommerce.RecylerViewProduct;

/**
 * Created by Dell on 5/25/2018.
 */

public class ProductAdapter  extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {

    private ArrayList<Productlist> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;

        ImageView imageViewIcon;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewName = (TextView) itemView.findViewById(R.id.name);
            final Context context = itemView.getContext();
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imgproduct);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    if (getPosition()==0)
                    {
                        Intent intent = new Intent(context,MainActivity.class);
                        context.startActivity(intent);
                    } if (getPosition()==1)
                {
                    Intent intent = new Intent(context,MainActivity.class);
                    context.startActivity(intent);
                } if (getPosition()==2)
                {
                    Intent intent = new Intent(context,MainActivity.class);
                    context.startActivity(intent);
                } if (getPosition()==3)
                {
                    Intent intent = new Intent(context,MainActivity.class);
                    context.startActivity(intent);
                } if (getPosition()==4)
                {
                    Intent intent = new Intent(context,MainActivity.class);
                    context.startActivity(intent);
                }

                }
            });
        }
    }

    public ProductAdapter(ArrayList<Productlist> data)
    {
        this.dataSet = data;
    }

    @Override
    public ProductAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.singleproductlayout, parent, false);

        //view.setOnClickListener(Navigation.myOnClickListener);

        ProductAdapter.MyViewHolder myViewHolder = new ProductAdapter.MyViewHolder(view);
        return myViewHolder;
    }
    @Override
    public void onBindViewHolder(final ProductAdapter.MyViewHolder holder, final int listPosition) {

        TextView textViewName = holder.textViewName;
        // TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(dataSet.get(listPosition).getName());
        //textViewVersion.setText(dataSet.get(listPosition).getVersion());
        imageView.setImageResource(dataSet.get(listPosition).getImage());
    }

    @Override
    public int getItemCount() {
        return (dataSet == null) ? 0 : dataSet.size();
    }}



