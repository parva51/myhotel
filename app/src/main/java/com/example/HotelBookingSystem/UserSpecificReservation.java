package com.example.HotelBookingSystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserSpecificReservation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_specific_reservation);
    }
    public void updateReservation(View view)
    {
        Intent intent = new Intent(this,UpdateUserSpecificReservation.class);
        startActivity(intent);
    }
}