package com.wabizabi.wazabipos.Database.RealmSchemas;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class RealmInventoryTransaction extends RealmObject {
    @PrimaryKey
    String _id;
    String transactionDT;
    String transactionType;
    String itemName;
    int amount;
    String itemUnit;
    int newAmount;
    String day, month, year;

    public RealmInventoryTransaction(){}


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTransactionDT() {
        return transactionDT;
    }

    public void setTransactionDT(String transactionDT) {
        this.transactionDT = transactionDT;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    public int getNewAmount() {
        return newAmount;
    }

    public void setNewAmount(int newAmount) {
        this.newAmount = newAmount;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
