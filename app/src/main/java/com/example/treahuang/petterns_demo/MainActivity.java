package com.example.treahuang.petterns_demo;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.treahuang.petterns_demo.abstract_factory_pattern.AbstractFactory;
import com.example.treahuang.petterns_demo.abstract_factory_pattern.BenzFactory;
import com.example.treahuang.petterns_demo.abstract_factory_pattern.Car;
import com.example.treahuang.petterns_demo.abstract_factory_pattern.Gun;
import com.example.treahuang.petterns_demo.state_pattern.VendingMachine;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private TextView showDetail;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        showDetail = (TextView) findViewById(R.id.showdetail);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        String temp=null;
        switch (id) {
            case R.id.nav_Abstract_Factory:
                //奔驰车司机
                AbstractFactory factory = new BenzFactory();
                //今天想做奥迪车
                Car car = factory.getCar();
                //开车
                temp = car.drive()+ "\n";
                //获得开Benz时要用的枪
                Gun gun = factory.getGun();
                //开火
                temp = temp + gun.fire()+ "\n";
                showDetail.setText(temp);

                break;
            case R.id.nav_Adapter:
                break;
            case R.id.nav_Decorator:
                break;
            case R.id.nav_Facade:
                break;
            case R.id.nav_Observer:
                break;
            case R.id.nav_State:
                toolbar.setSubtitle("");
                VendingMachine machine = new VendingMachine(10);
                machine.insertMoney();
                machine.backMoney();

                temp = "----我要中奖----\n";

                temp = temp + machine.insertMoney() + "\n";
                temp = temp + machine.turnCrank() + "\n" + "\n";
                temp = temp + machine.insertMoney() + "\n";
                temp = temp + machine.turnCrank() + "\n";
                temp = temp + machine.insertMoney() + "\n";
                temp = temp + machine.turnCrank() + "\n";
                temp = temp + machine.insertMoney() + "\n";
                temp = temp + machine.turnCrank() + "\n";
                temp = temp + machine.insertMoney() + "\n";
                temp = temp + machine.turnCrank() + "\n";
                temp = temp + machine.insertMoney() + "\n";
                temp = temp + machine.turnCrank() + "\n";
                temp = temp + machine.insertMoney() + "\n";
                temp = temp + machine.turnCrank() + "\n";

                temp = temp + "-------压力测试------" + "\n";

                temp = temp + machine.insertMoney() + "\n";
                temp = temp + machine.backMoney() + "\n";
                temp = temp + machine.backMoney() + "\n";
                temp = temp + machine.turnCrank() + "\n";// 无效操作
                temp = temp + machine.turnCrank() + "\n";// 无效操作
                temp = temp + machine.backMoney() + "\n";
                showDetail.setText(temp);
                break;
            default:
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
