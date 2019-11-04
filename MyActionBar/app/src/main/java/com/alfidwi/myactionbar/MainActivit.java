package com.alfidwi.myactionbar;

import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

abstract class MainActivit extends AppCompatActivity {
    public abstract boolean onOptionItemSelected(MenuItem item);
}
