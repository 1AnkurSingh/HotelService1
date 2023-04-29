package com.lcwd.hotel.impl;

import com.lcwd.hotel.entites.Hotel;
import com.lcwd.hotel.exceptions.ResourceNotFoundException;
import com.lcwd.hotel.repository.HotelRepository;
import com.lcwd.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setHotelId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelById(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel With Given Id Not Found!!"));
    }
}
