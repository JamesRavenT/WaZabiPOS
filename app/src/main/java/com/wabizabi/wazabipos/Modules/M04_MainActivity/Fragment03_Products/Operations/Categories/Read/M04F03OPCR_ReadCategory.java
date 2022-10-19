package com.wabizabi.wazabipos.Modules.M04_MainActivity.Fragment03_Products.Operations.Categories.Read;

import static com.wabizabi.wazabipos.Modules.M04_MainActivity.Fragment03_Products.M04F03_Products.M04F03_CurrentCategory;
import static com.wabizabi.wazabipos.Modules.M04_MainActivity.Fragment03_Products.Operations.Categories.Read.Adapter.M04F03OPCR_ReadCategoryRVA.listOfAssociatedProductItems;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wabizabi.wazabipos.Database.Schemas.ProductsItem;
import com.wabizabi.wazabipos.Database.Schemas.ProductsList;
import com.wabizabi.wazabipos.Modules.M04_MainActivity.Fragment03_Products.Operations.Categories.Read.Adapter.M04F03OPCR_ReadCategoryRVA;
import com.wabizabi.wazabipos.R;

import io.realm.Realm;

public class M04F03OPCR_ReadCategory extends Fragment {

    Realm realm;
    ImageView categoryImage;
    TextView categoryName;
    RecyclerView associatedItemsRV;
    RecyclerView.Adapter associatedItemsRVA;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.act04_main_frag03_products_operation_crud_categoryread, container, false);
        init_FragmentFunctionalities(v);
        return v;
    }

    private void init_FragmentFunctionalities(View v){
        init_Views(v);
        init_DB();
        init_CategoryDetails();
        init_RecyclerView();
    }

    private void init_Views(View v){
        categoryImage = v.findViewById(R.id.M04F03OPCR_CategoryImage);
        categoryName = v.findViewById(R.id.M04F03OPCR_CategoryName);
        associatedItemsRV = v.findViewById(R.id.M04F03OPCR_AssociatedItemsRV);
    }

    private void init_DB(){
        realm = Realm.getDefaultInstance();
    }

    private void init_CategoryDetails(){
        ProductsList category = realm.where(ProductsList.class).equalTo("categoryName", M04F03_CurrentCategory).findFirst();
        categoryName.setText(category.getCategoryName());
        switch(category.getCategoryImage()){
            case 0:
                categoryImage.setImageResource(R.drawable.icon_products00_default);
                break;
            case 1:
                categoryImage.setImageResource(R.drawable.icon_products01_carpaccio);
                break;
            case 2:
                categoryImage.setImageResource(R.drawable.icon_products02_deepfried);
                break;
            case 3:
                categoryImage.setImageResource(R.drawable.icon_products03_dessert);
                break;
            case 4:
                categoryImage.setImageResource(R.drawable.icon_products04_donburi);
                break;
            case 5:
                categoryImage.setImageResource(R.drawable.icon_products05_drinks);
                break;
            case 6:
                categoryImage.setImageResource(R.drawable.icon_products06_nigiri);
                break;
            case 7:
                categoryImage.setImageResource(R.drawable.icon_products07_noodles);
                break;
            case 8:
                categoryImage.setImageResource(R.drawable.icon_products08_platter);
                break;
            case 9:
                categoryImage.setImageResource(R.drawable.icon_products09_salad);
                break;
            case 10:
                categoryImage.setImageResource(R.drawable.icon_products10_sushi);
                break;
        }
    }

    private void init_RecyclerView(){
        LinearLayoutManager layout = new LinearLayoutManager(getActivity());
        layout.setOrientation(LinearLayoutManager.VERTICAL);
        listOfAssociatedProductItems = realm.where(ProductsItem.class).equalTo("itemCategory", M04F03_CurrentCategory).sort("itemName").findAll();
        associatedItemsRVA = new M04F03OPCR_ReadCategoryRVA(getActivity());
        associatedItemsRV.setLayoutManager(layout);
        associatedItemsRV.setAdapter(associatedItemsRVA);

    }
}
