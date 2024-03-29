package com.wabizabi.wazabipos.Modules.M04_MainActivity.Fragment01_POS.SubFragments.SubFragment03_Cart.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.wabizabi.wazabipos.R;
import com.wabizabi.wazabipos.Utilities.Libraries.Helper.LayoutHelper;

import java.util.List;
import java.util.Map;

import io.realm.Realm;

public class M04F01SF03D06_SelectDiscountToApplyRVA extends RecyclerView.Adapter<M04F01SF03D06_SelectDiscountToApplyRVA.ViewHolder> {

    Context context;
    Realm realm;
    Map<String, Integer> listOfDiscounts;
    List<String> listOfDiscountsKeyset;
    Map<String, Integer> listOfDiscountsToApply;

    public M04F01SF03D06_SelectDiscountToApplyRVA(Context context, Realm realm, Map<String, Integer> listOfDiscounts, List<String> listOfDiscountsKeyset, Map<String, Integer> listOfDiscountsToApply) {
        this.context = context;
        this.realm = realm;
        this.listOfDiscounts = listOfDiscounts;
        this.listOfDiscountsKeyset = listOfDiscountsKeyset;
        this.listOfDiscountsToApply = listOfDiscountsToApply;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutHelper.inflateRV(parent, R.layout.act04_main_frag01_pos_subfrag03_order_dg06_itemdiscountapply_rvlayout);
        ViewHolder layout = new ViewHolder(view);
        return layout;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String discountName = listOfDiscountsKeyset.get(position);
        int discountPercentage = listOfDiscounts.get(discountName);
        holder.loadFunctionalities(discountName, discountPercentage, position);
    }

    @Override
    public int getItemCount() {
        return listOfDiscounts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private int position;
        private ConstraintLayout discountContainer;
        private TextView discountName, discountPercentage, discountStatus;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            discountContainer = itemView.findViewById(R.id.M04F01SF03D06_RVContainer);
            discountName = itemView.findViewById(R.id.M04F01SF03D06_RVDiscountName);
            discountPercentage = itemView.findViewById(R.id.M04F01SF03D06_RVDiscountPercentage);
            discountStatus = itemView.findViewById(R.id.M04F01SF03D06_RVDiscountStatus);
        }

        public void loadFunctionalities(String name, int percentage, int position){
            //Set Views
            this.position = position;
            discountName.setText(name);
            discountPercentage.setText(percentage + "%");
            if(listOfDiscountsToApply.containsKey(name)){
                discountContainer.setBackgroundColor(ContextCompat.getColor(context, R.color.green));
                discountStatus.setText("Selected");
                discountName.setTextColor(ContextCompat.getColor(context, R.color.white));
                discountPercentage.setTextColor(ContextCompat.getColor(context, R.color.white));
            } else {
                discountContainer.setBackgroundColor(ContextCompat.getColor(context, R.color.white));
                discountStatus.setText("Not Selected");
                discountName.setTextColor(ContextCompat.getColor(context, R.color.wabizabi));
                discountPercentage.setTextColor(ContextCompat.getColor(context, R.color.wabizabi));
            }

            //On Select
            discountContainer.setOnClickListener(select -> {
                if(listOfDiscountsToApply.containsKey(name)){
                    listOfDiscountsToApply.remove(name, percentage);
                    notifyDataSetChanged();
                    discountContainer.setBackgroundColor(ContextCompat.getColor(context, R.color.white));
                    discountStatus.setText("Not Selected");
                    discountName.setTextColor(ContextCompat.getColor(context, R.color.wabizabi));
                    discountPercentage.setTextColor(ContextCompat.getColor(context, R.color.wabizabi));
                    discountStatus.setTextColor(ContextCompat.getColor(context, R.color.wabizabi));
                } else {
                    listOfDiscountsToApply.put(name, percentage);
                    notifyDataSetChanged();
                    discountContainer.setBackgroundColor(ContextCompat.getColor(context, R.color.green));
                    discountStatus.setText("Selected");
                    discountName.setTextColor(ContextCompat.getColor(context, R.color.white));
                    discountPercentage.setTextColor(ContextCompat.getColor(context, R.color.white));
                    discountStatus.setTextColor(ContextCompat.getColor(context, R.color.white));
                }
            });
        }
    }
}
