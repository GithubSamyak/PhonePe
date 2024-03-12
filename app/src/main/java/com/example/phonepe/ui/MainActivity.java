package com.example.phonepe.ui;

import android.os.Bundle;

import com.example.phonepe.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.phonepe.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private TextView toolbartext;
    private BottomNavigationView bottomNavigationView;

    private HomeFragment homeFragment;
    private AccountFragment accountFragment;
    private OffersFragment offersFragment;
    private PaymentFragment paymentFragment;
    private TransactionsFragment transactionsFragment;

    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener
            = item ->
    {
        switch(item.getItemId())
        {
            case R.id.navigation_home:toolbartext.setText("PhonePe");
            setUpFragment(homeFragment);
            return true;
            case R.id.navigation_offer:
                toolbartext.setText("Offers");
                setUpFragment(offersFragment);
                return true;

            case R.id.navigation_payment:
                toolbartext.setText("Scan & Pay");
                setUpFragment(paymentFragment);
                return true;
            case R.id.navigation_account:
                toolbartext.setText("My Account");
                setUpFragment(accountFragment);
                return true;
            case R.id.navigation_transaction:
                toolbartext.setText("Transactions");
                setUpFragment(transactionsFragment);
                return true;
            default:
                return false;
        }
    };













    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       initViews();
       setSupportActionBar(mToolbar);
       getSupportActionBar().setTitle("");
       toolbartext.setText("PhonePe");

       bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);




    }
}