package com.wabizabi.wazabipos.Modules.M04_MainActivity.Fragment04_Discount.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wabizabi.wazabipos.Database.ObjectSchemas.Discount;
import com.wabizabi.wazabipos.R;
import com.wabizabi.wazabipos.Utilities.Interfaces.DialogLoader;
import com.wabizabi.wazabipos.Utilities.Libraries.Bundles.DialogBundle;
import com.wabizabi.wazabipos.Utilities.Libraries.Helper.LayoutHelper;

import java.util.List;

import io.realm.Realm;

public class M04F04_DiscountsRVA extends RecyclerView.Adapter<M04F04_DiscountsRVA.ViewHolder> {
    Context context;
    Realm realm;
    List<Discount> listOfDiscounts;
    DialogLoader dialog;

    public M04F04_DiscountsRVA(Context context, Realm realm, List<Discount> listOfDiscounts, DialogLoader dialog) {
        this.context = context;
        this.realm = realm;
        this.listOfDiscounts = listOfDiscounts;
        this.dialog = dialog;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutHelper.inflateRV(parent, R.layout.act04_main_frag04_discounts_rvlayout);
        ViewHolder layout = new ViewHolder(view);
        return layout;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Discount discount = listOfDiscounts.get(position);
        holder.loadFunctionalities(discount, position);
    }

    @Override
    public int getItemCount() {
        return listOfDiscounts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private int position;
        private TextView discountName, discountPercentage, lastUpdatedText;
        private ImageView editBtn;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            discountName = itemView.findViewById(R.id.M04F04_RVDiscountName);
            discountPercentage = itemView.findViewById(R.id.M04F04_RVDiscountPercentageText);
            lastUpdatedText = itemView.findViewById(R.id.M04F04_RVDateAndTime);
            editBtn = itemView.findViewById(R.id.M04F04_RVEditBtn);
        }

        public void loadFunctionalities(Discount discount, int position){
            //Load Details
            this.position = position;
            discountName.setText(discount.getDiscountName());
            discountPercentage.setText(discount.getDiscountInPercentage() + "%");
            lastUpdatedText.setText(discount.getLastUpdatedText());

            //On Edit Btn
            editBtn.setOnClickListener(edit -> {
                dialog.load_DGContents(new DialogBundle(2, discount));
            });
        }
    }
}
