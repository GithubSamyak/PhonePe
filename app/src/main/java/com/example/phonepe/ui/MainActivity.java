package com.example.phonepe.ui;

import android.os.Bundle;

import com.example.phonepe.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

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
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private TextView toolbartext;
    private BottomNavigationView bottomNavigationView;

    private HomeFragment homeFragment;
    private AccountFragment accountFragment;
    private OffersFragment offersFragment;
    private PaymentFragment paymentFragment;
    private TransactionsFragment transactionsFragment;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}