package com.device.management.controller;

import com.device.management.dto.ListDto;

import com.device.management.dto.SzAttendanceYXTDto;
import com.device.management.service.SzAttendanceYXTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/SzAttendanceManage")
public class SzAttendanceYXTController {

    @Autowired
    SzAttendanceYXTService szAttendanceYXTService;

    @GetMapping("/getAttListYXT")
    /*@RequestParam(required = false) false 表示可以为空 */
    public ListDto<SzAttendanceYXTDto> getList(@RequestParam(required = false) String schoolName,
                                               @RequestParam(required = false) String clintId ,
                                               @RequestParam(required = false) Integer page,
                                               @RequestParam(required = false) Integer rows){
        return szAttendanceYXTService.getAttList(schoolName , clintId, page , rows );
    }
   /* @GetMapping("/getSBList")
    public List<SzAttendanceXSTDto> getList(){
        return szAttendanceService.getList();
    }*/
}
