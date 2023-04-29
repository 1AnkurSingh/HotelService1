package com.lcwd.hotel.services;

import com.lcwd.hotel.entites.Hotel;

import java.util.List;

public interface HotelService {

    // Create
    Hotel create(Hotel hotel);



    // getAll
    List<Hotel>getAllHotel();


    //getSingle
    Hotel getHotelById(String id);


}
