package com.wabizabi.wazabipos.Modules.M04_MainActivity.Fragment01_POS.SubFragments.SubFragment01_Cart;

import static com.wabizabi.wazabipos.Modules.M04_MainActivity.Fragment01_POS.SubFragments.SubFragment01_Cart.Adapter.RVA_Cart.cart;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wabizabi.wazabipos.Modules.M04_MainActivity.Fragment01_POS.Objects.CartObject;
import com.wabizabi.wazabipos.Modules.M04_MainActivity.Fragment01_POS.SubFragments.SubFragment01_Cart.Adapter.RVA_Cart;
import com.wabizabi.wazabipos.Modules.M04_MainActivity.Fragment01_POS.SubFragments.SubFragment01_Cart.Interfaces.Update_Cart;
import com.wabizabi.wazabipos.R;

import java.util.Map;

public class SubFragment01_Cart extends Fragment implements Update_Cart {

    TextView cartCount;
    RecyclerView cartRV;
    RecyclerView.Adapter cartRVA;
    TextView itemAllPrice, itemTax, itemFinalPrice;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.act04_main_frag01_pos_subfrag01_cart, container, false);
        setViews(v);
        setRecyclerView();
        setContent();
        return v;
    }

    private void setViews(View v){
        cartRV = v.findViewById(R.id.POS_CartRV);
        cartCount = v.findViewById(R.id.POS_CartTxt);
        itemAllPrice = v.findViewById(R.id.POS_CartTotalPriceNo);
        itemTax = v.findViewById(R.id.POS_CartTotalTaxNo);
        itemFinalPrice = v.findViewById(R.id.POS_CartFinalNo);
    }

    private void setContent(){
        setCartCount();
        setPrices();
    }

    private void setRecyclerView(){
        LinearLayoutManager cartLayout = new LinearLayoutManager(getActivity());
        cartLayout.setOrientation(LinearLayoutManager.VERTICAL);
        cartRVA = new RVA_Cart(getActivity(), this);
        cartRV.setAdapter(cartRVA);
        cartRV.setLayoutManager(cartLayout);

    }

    private void setCartCount(){
        cartCount.setText("屋台Cart ( " + cart.size() + " )");
    }

    private void setPrices(){
        double allprice = 0.00;
        for(Map.Entry<CartObject, Integer> basket : cart.entrySet()){
            CartObject item = basket.getKey();
            int quantity = basket.getValue();
            double individualprice = item.getItemPrice();
            double product = individualprice * quantity;
            allprice = allprice + product;
        }

        double tax = allprice * 0.03;
        double finalprice = allprice + tax;
        itemAllPrice.setText("₱" + String.valueOf(allprice));
        itemTax.setText("₱" + String.valueOf(tax));
        itemFinalPrice.setText("₱" + String.valueOf(finalprice));
    }

    @Override
    public void refreshCart(Context context) {
        setCartCount();
        setPrices();
    }
}