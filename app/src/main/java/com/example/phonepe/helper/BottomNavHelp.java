package com.example.phonepe.helper;

import android.annotation.SuppressLint;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.lang.reflect.Field;

public class BottomNavHelp {

     @SuppressLint("RestrictedApi")
     public static void removeShiftMode(BottomNavigationView view)
     {
           BottomNavigationView menu = (BottomNavigationView) view.getChildAt(0);
           try
           {
            Field shiftingMode = menu.getClass().getDeclaredField("mShiftingMode");
            shiftingMode.setAccessible(true);
            shiftingMode.setBoolean(menu,false);
            shiftingMode.setAccessible(false);
            for(int i=0; i< menu.getChildCount();i++)
            {
                 BottomNavigationView item = (BottomNavigationView) menu.getChildAt(i);
                 item.setChecked(item.getItemData().isChecked());
            }

           }
           catch (Exception e)
          {
              e.printStackTrace();
          }
     }

}
