package com.device.management.controller;

import com.device.management.dto.ListDto;
import com.device.management.enums.AttType;
import com.device.management.service.SzAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * author:WaHotDog
 * Created in Date:2018/11/25 0025上午 11:34
 */
//此注释解决跨域问题
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Manger")
public class MasterController {

    @Autowired
    SzAttendanceService szAttendanceService;



    @GetMapping("/getAttList")
    /*@RequestParam(required = false) false 表示可以为空 */
    public ListDto getYXTList(@RequestParam(required = false) String schoolName,
                                               @RequestParam(required = false) String clintId ,
                                               @RequestParam Integer type,
                                               @RequestParam(required = false) Integer page,
                                               @RequestParam(required = false) Integer rows){
        /*XST(1,"学士通"),
        HXY(2,"慧校园"),
        YXT(3,"翼校通"); */
        if (type.equals(AttType.XST.getState())){
            return szAttendanceService.getXSTAttList(schoolName, clintId, page , rows);
        }else if (type.equals(AttType.HXY.getState())){
            return szAttendanceService.getHXYAttList(schoolName, clintId ,page,rows);
        }else if (type.equals(AttType.YXT.getState())){
            return szAttendanceService.getYXTAttList(schoolName , clintId, page , rows );
        }
        return new ListDto();
    }

    /*@GetMapping("/getAttListHXY")
    *//*@RequestParam(required = false) false 表示可以为空 *//*
    public ListDto<SzAttendanceHXYDto> getHXYList(@RequestParam(required = false) String schoolName,
                                               @RequestParam(required = false) String clintId ,
                                               @RequestParam(required = false) Integer page,
                                               @RequestParam(required = false) Integer rows){
        return szAttendanceService.getHXYAttList(schoolName, clintId ,page,rows);
    }

    @GetMapping("/getAttListXST")
    *//*@RequestParam(required = false) false 表示可以为空 *//*
    public ListDto<SzAttendanceXSTDto> getXSTList(@RequestParam(required = false) String schoolName,
                                               @RequestParam(required = false) String clintId ,
                                               @RequestParam(required = false) Integer page,
                                               @RequestParam(required = false) Integer rows){
        return szAttendanceService.getXSTAttList(schoolName, clintId, page , rows);
    }*/
}
