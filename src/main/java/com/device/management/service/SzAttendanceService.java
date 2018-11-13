package com.device.management.service;

import com.device.management.dto.SzAttendanceDto;
import com.device.management.enums.SzAttendenceStatusType;
import com.device.management.mapper.SzAttendanceMapper;
import com.device.management.po.SzAttendance;
import com.device.management.po.SzAttendanceExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SzAttendanceService {

    @Autowired
    SzAttendanceMapper szAttendanceMapper;


    public List<SzAttendanceDto> getList(Integer intads) {
        SzAttendanceExample szAttendanceExample = new SzAttendanceExample();
        SzAttendanceExample.Criteria criteria = szAttendanceExample.createCriteria();
        if (intads.equals(1))
            criteria.andStateEqualTo();
        if (intads.equals(2))
            criteria.andAppconnectstateBetween();

        szAttendanceExample.or().andStateEqualTo(SzAttendenceStatusType.ONLINE.getState()).andAppconnectstateBetween();
        List<SzAttendance> list = szAttendanceMapper.selectByExample(szAttendanceExample);
        List<SzAttendanceDto> szAttendanceDtos = new ArrayList<>();
        for (SzAttendance szAttendance : list){
            SzAttendanceDto szAttendanceDto = new SzAttendanceDto(szAttendance);
            szAttendanceDtos.add(szAttendanceDto);
        }
        return szAttendanceDtos;
    }
}
