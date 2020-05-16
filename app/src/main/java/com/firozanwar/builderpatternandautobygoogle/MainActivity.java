package com.firozanwar.builderpatternandautobygoogle;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.firozanwar.builderpatternandautobygoogle.User.UserWitAutoValue;
import com.firozanwar.builderpatternandautobygoogle.User.UserWithoutAutoValue;
import com.firozanwar.builderpatternandautobygoogle.bankaccount.BankAccountWithBuilder;
import com.firozanwar.builderpatternandautobygoogle.bankaccount.BankAccountWithoutBuilder;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // BankAccount Without Builder
        BankAccountWithoutBuilder account = new BankAccountWithoutBuilder(123L, "Bart", 100.00);
        Log.d(TAG, "Account Number using without builder: " + account.getAccountNumber());

        BankAccountWithBuilder accountWithBuilder = new BankAccountWithBuilder.Builder(123L)
                .withOwner("Firoz")
                .atBranch("NFC")
                .atRate(2.5)
                .openingBalance(100)
                .build();

        Log.d(TAG, "Account Number using with builder: " + accountWithBuilder.getAccountNumber());

        // Auto
        UserWithoutAutoValue user1 = UserWithoutAutoValue.with("Firoz", "Anwar");
        UserWithoutAutoValue user2 = UserWithoutAutoValue.with("Firoz", "Anwar");
        Log.d(TAG, "Without AutoValue user1 equals user2: " + user1.equals(user2)); // false

        UserWitAutoValue user3 = UserWitAutoValue.with("Firoz", "Anwar");
        UserWitAutoValue user4 = UserWitAutoValue.with("Firoz", "Anwar");
        Log.d(TAG, "With AutoValue user1 equals user2: " + user3.equals(user4));  // true
    }
}
