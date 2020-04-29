package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;


public class ViewPagerAdapter extends FragmentStateAdapter {

    private static final int CARD_ITEM_SIZE = 10;


    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    //Создаем фрагмент
    @NonNull @Override public Fragment createFragment(int position) {
        return Fragments.newInstance(position);
    }

    //Выводит количество фрагментов
    @Override public int getItemCount() {
        return CARD_ITEM_SIZE;
    }
}