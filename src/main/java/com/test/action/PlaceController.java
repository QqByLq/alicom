package com.test.action;


import com.test.pojo.Place;
import com.test.service.IPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by LQ on 2019/7/27 12:09
 */
@RestController
@RequestMapping("/place")
public class PlaceController {

    @Autowired
    private IPlaceService placeService;
    @RequestMapping("/search")
    public List<Place> list(){
       List<Place> list = placeService.placelist();
       return list;
    }
}
