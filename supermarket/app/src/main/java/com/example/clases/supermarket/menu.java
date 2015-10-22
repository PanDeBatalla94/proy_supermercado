package com.example.clases.supermarket;

import android.content.res.TypedArray;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Clases on 08/10/2015.
 */
public class menu {
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;

    private CharSequence mDrawerTitle;
    private CharSequence mTitle;

    // slide menu items
    private String[] navMenuTitles;
    private TypedArray navMenuIcons;

    private ArrayList navDrawerItems;
    private NavDrawerListAdapter adapter;


}
