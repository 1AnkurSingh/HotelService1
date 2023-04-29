package com.lcwd.hotel.controlles;

import com.lcwd.hotel.entites.Hotel;
import com.lcwd.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    // create
    @PostMapping
    public ResponseEntity<Hotel>createHotel(@RequestBody Hotel hotel){
        return  ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
    }


    // get Single by id
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel>getHotelById(@PathVariable String hotelId){
        return  ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotelById(hotelId));
    }


    // get All

    @GetMapping
    public ResponseEntity<List<Hotel>>getAllHotel(){
        return ResponseEntity.ok(hotelService.getAllHotel());
    }
}
