package com.device.management.controller;

import com.device.management.dto.SzAttendanceDto;
import com.device.management.service.SzAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/SzAttendanceManage")
public class SzAttendanceController {

    @Autowired
    SzAttendanceService szAttendanceService;

    @GetMapping("/getAttList")
    public List<SzAttendanceDto> getList(@RequestParam("sql") String sql ,@RequestParam(required = false) String schoolName,
                                         @RequestParam(required = false) String clintId){
        return szAttendanceService.getAttList(schoolName, clintId, sql);
    }
   /* @GetMapping("/getSBList")
    public List<SzAttendanceDto> getList(){
        return szAttendanceService.getList();
    }*/
}
