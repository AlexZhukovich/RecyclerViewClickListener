package com.alexzh.tutorial.recyclerviewclick;

import android.view.View;

/**
 * Created by alex on 5/6/15.
 */
public interface ItemClickListener {

    void onClick(View view, int position, boolean isLongClick);

}
