package com.example.assignment1;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import android.os.AsyncTask;

import androidx.lifecycle.MutableLiveData;

import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;

import android.app.Application;

import java.util.List;

@Database(entities = Customer.class), version = 1)
public class CustomerRoomDatabase extends RoomDatabase {
    public abstract CustomerDao customerDao();
    private static CustomerRoomDatabase INSTANCE;

    static CustomerRoomDatabase getDatabase(final Context context){
        if(INSTANCE == null){
            synchronized (CustomerRoomDatabase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(
                            context.getApplicationContext(),
                            CustomerRoomDatabase.class, "customer_database").build();
                    )
                }
            }
        }
    }
}
