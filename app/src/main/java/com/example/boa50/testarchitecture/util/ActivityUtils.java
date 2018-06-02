package com.example.boa50.testarchitecture.util;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public final class ActivityUtils {
    public static void addFragmentToActivity(@NonNull FragmentManager fragmentManager,
                                             @NonNull Fragment fragment, int layoutId){
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(layoutId, fragment);
        transaction.commit();
    }
}
