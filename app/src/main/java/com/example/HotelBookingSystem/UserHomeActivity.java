package com.example.HotelBookingSystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.HotelBookingSystem.R;

public class UserHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
    }

    public void nextPage(View view)
    {
        Intent intent = new Intent(this, com.example.HotelBookingSystem.UpdateProfile.class);
        startActivity(intent);
    }

    public void nextPage1(View view)
    {
        Intent intent = new Intent(this, com.example.HotelBookingSystem.ViewMyReservations.class);
        startActivity(intent);
    }

    public void requestReservation(View view)
    {
        Intent intent = new Intent(this, RoomSearch.class);
        startActivity(intent);
    }


    public void logout(View view)
    {
        Intent intent = new Intent(this, com.example.HotelBookingSystem.MainActivity.class);
        Toast.makeText(this,"Logged Out!",Toast.LENGTH_SHORT).show();
        startActivity(intent);
        finish();
    }
}