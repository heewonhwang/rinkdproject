package com.example.rinkdproject.ui.star;

import android.view.View;

import com.example.rinkdproject.ui.star.CafeAdapter;

public interface OnCafeItemClickListener {
    public void onItemClick(CafeAdapter.ViewHolder holder, View view, int position);
}
