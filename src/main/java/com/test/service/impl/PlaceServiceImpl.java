package com.test.service.impl;

import com.test.mapper.PlaceMapper;
import com.test.pojo.Place;
import com.test.service.IPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LQ on 2019/7/27 12:55
 */
@Service
public class PlaceServiceImpl implements IPlaceService {
    @Autowired
    private PlaceMapper placeMapper;
    /*获取所有的场地信息*/
    @Override
    public List<Place> placelist() {
        return placeMapper.selectByExample(null);
    }
}
