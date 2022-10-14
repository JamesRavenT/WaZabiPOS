package com.wabizabi.wazabipos.Database.Instances;


import com.wabizabi.wazabipos.Database.Schemas.TransactionsOfInventory;
import com.wabizabi.wazabipos.Database.Schemas.TransactionsOfSales;

import org.bson.types.ObjectId;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmList;

public class OpenTransactionsInstance {

    public static void toCreateSalesTransaction(List<String> itemsetName,
                                                List<Double> itemsetPrice,
                                                List<Integer> itemsetQty,
                                                double totalPrice,
                                                String time,
                                                String month,
                                                String day,
                                                String year){
        try(Realm realm = Realm.getDefaultInstance()){
            realm.executeTransaction(db -> {
                TransactionsOfSales transaction = db.createObject(TransactionsOfSales.class, new ObjectId());
                RealmList<String> itemsIDName = new RealmList<>(); itemsIDName.addAll(itemsetName);
                RealmList<Double> itemsIDPrice = new RealmList<>(); itemsIDPrice.addAll(itemsetPrice);
                RealmList<Integer> itemsIDAmount = new RealmList<>(); itemsIDAmount.addAll(itemsetQty);
                transaction.setNameOfEachItem(itemsIDName);
                transaction.setPriceOfEachItem(itemsIDPrice);
                transaction.setAmountOfEachItem(itemsIDAmount);
                transaction.setPriceOfAllItems(totalPrice);
                transaction.setTime(time);
                transaction.setMonth(month);
                transaction.setDay(day);
                transaction.setYear(year);
            });
        }
    }

    public static void toCreateInventoryTransaction(String operation,
                                                    String itemName,
                                                    int amountAdded,
                                                    int amountSubtracted,
                                                    String time,
                                                    String day,
                                                    String month,
                                                    String year){
        try(Realm realm = Realm.getDefaultInstance()){
            realm.executeTransaction(db -> {
                TransactionsOfInventory transaction = db.createObject(TransactionsOfInventory.class, new ObjectId());
                transaction.setOperation(operation);
                transaction.setItemName(itemName);
                transaction.setAmountAdded(amountAdded);
                transaction.setAmountSubtracted(amountSubtracted);
                transaction.setTime(time);
                transaction.setDay(day);
                transaction.setMonth(month);
                transaction.setYear(year);
            });
        }
    }
}
