package com.device.management.controller;

import com.device.management.dto.ListDto;
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
    public ListDto<SzAttendanceDto> getList(@RequestParam("sql") String sql , @RequestParam(required = false) String schoolName,
                                            @RequestParam(required = false) String clintId ,
                                            @RequestParam(required = false) Integer page,
                                            @RequestParam(required = false) Integer rows){
        return szAttendanceService.getAttList(schoolName, clintId, sql , page , rows);
    }
   /* @GetMapping("/getSBList")
    public List<SzAttendanceDto> getList(){
        return szAttendanceService.getList();
    }*/
}
