package com.redandmoon.time.thisisme.controller;

import com.redandmoon.time.thisisme.entity.Goal;
import com.redandmoon.time.thisisme.entity.Week;
import com.redandmoon.time.thisisme.service.GoalsServices;
import com.redandmoon.time.thisisme.service.WeekServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/week")
public class WeekController {
    @Autowired
    private WeekServices weekServices;

    @PostMapping(path = "/save")
    public Week create(@RequestBody Week week){
        return weekServices.saveNewWeek(week);
    }
}
