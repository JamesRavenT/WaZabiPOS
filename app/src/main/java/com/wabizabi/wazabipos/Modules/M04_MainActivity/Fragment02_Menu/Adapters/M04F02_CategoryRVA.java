package com.wabizabi.wazabipos.Modules.M04_MainActivity.Fragment02_Menu.Adapters;

import static com.wabizabi.wazabipos.Modules.M04_MainActivity.M04_Main.currentFragment;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.wabizabi.wazabipos.Database.ObjectSchemas.MenuCategory;
import com.wabizabi.wazabipos.Database.ObjectSchemas.MenuItem;
import com.wabizabi.wazabipos.Modules.M04_MainActivity.Fragment02_Menu.Helpers.MIHelper;
import com.wabizabi.wazabipos.R;
import com.wabizabi.wazabipos.Utilities.Interfaces.DialogLoader;
import com.wabizabi.wazabipos.Utilities.Interfaces.RVLoader;
import com.wabizabi.wazabipos.Utilities.Libraries.Bundles.DialogBundle;
import com.wabizabi.wazabipos.Utilities.Libraries.Bundles.RVBundle;
import com.wabizabi.wazabipos.Utilities.Libraries.Helper.LayoutHelper;

import java.util.List;

import io.realm.Realm;

public class M04F02_CategoryRVA extends RecyclerView.Adapter<M04F02_CategoryRVA.ViewHolder> {
    Context context;
    Realm realm;
    EditText searchbar;
    List<MenuCategory> listOfCategories;
    RVLoader itemRV;
    DialogLoader dialogLoader;

    public M04F02_CategoryRVA(Context context, Realm realm, EditText searchbar, List<MenuCategory> listOfCategories, RVLoader itemRV, DialogLoader dialogLoader) {
        this.context = context;
        this.realm = realm;
        this.searchbar = searchbar;
        this.listOfCategories = listOfCategories;
        this.itemRV = itemRV;
        this.dialogLoader = dialogLoader;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutHelper.inflateRV(parent, R.layout.act04_main_frag02_menu_category_rvlayout);
        ViewHolder layout = new ViewHolder(view);
        return layout;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MenuCategory category = listOfCategories.get(position);
        holder.loadFunctionalities(category, position);
    }

    @Override
    public int getItemCount() {
        return listOfCategories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private int position;
        private TextView categoryName;
        private CardView viewBtn;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryName = itemView.findViewById(R.id.M04F02_CRVCategoryName);
            viewBtn = itemView.findViewById(R.id.M04F02_CRVViewBtn);
        }

        public void loadFunctionalities(MenuCategory category, int position){
            //Load Details
            String name = category.getCategoryName();

            //SetViews
            this.position = position;
            categoryName.setText(name);

            //On View Btn
            viewBtn.setOnClickListener(click -> {
                currentFragment = "Menu02";
                List<MenuItem> listOfItems = MIHelper.getMenuItems(realm, name);
                itemRV.load_RVContents(new RVBundle(category.getCategoryImage(), category.getCategoryName(), listOfItems));
            });
        }
    }
}
