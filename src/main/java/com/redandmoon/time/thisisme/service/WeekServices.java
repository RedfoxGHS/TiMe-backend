package com.redandmoon.time.thisisme.service;

import com.redandmoon.time.thisisme.entity.Week;
import com.redandmoon.time.thisisme.repository.WeekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class WeekServices {
    @Autowired
    private WeekRepository weekRepository;

    public Week saveNewWeek(Week week){
        try{
            return weekRepository.save(week);
        }catch (DataIntegrityViolationException e){
            throw e;
        }
    }

}
