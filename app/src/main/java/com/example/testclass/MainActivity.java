package com.example.testclass;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.testclass.databinding.ActivityMainBinding;

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;


public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




   binding.carousel.addData(new CarouselItem("https://www.shutterstock.com/image-vector/discount-banner-shape-special-offer-260nw-1467549638.jpg","Your text here"));
   binding.carousel.addData(new CarouselItem("https://img.freepik.com/free-vector/mega-sale-offers-banner-template_1017-31299.jpg",""));
   binding.carousel.addData(new CarouselItem("https://www.shutterstock.com/image-vector/red-banner-special-offer-260nw-1035467014.jpg",""));
   binding.carousel.addData(new CarouselItem("https://www.shutterstock.com/image-vector/red-banner-special-offer-260nw-1035467014.jpg",""));

        Toast.makeText(this, "Write Something Here", Toast.LENGTH_SHORT).show();




       

    }
}