package com.device.management.controller;

import com.device.management.dto.SzAttendanceDto;
import com.device.management.po.SzAttendance;
import com.device.management.service.SzAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/SzAttendanceController")
public class SzAttendanceController {

    @Autowired
    SzAttendanceService szAttendanceService;

    @GetMapping("/getSBList")
    public List<SzAttendanceDto> getList(){
        return szAttendanceService.getList();
    }
}
