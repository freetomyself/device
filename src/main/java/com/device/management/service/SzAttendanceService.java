package com.device.management.service;

import com.device.management.dataSource.TargetDataSource;
import com.device.management.dto.ListDto;
import com.device.management.dto.SzAttendanceHXYDto;
import com.device.management.dto.SzAttendanceXSTDto;
import com.device.management.dto.SzAttendanceYXTDto;
import com.device.management.mapper.SzAttendanceHXYMapper;
import com.device.management.mapper.SzAttendanceXSTMapper;
import com.device.management.mapper.SzAttendanceYXTMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * author:WaHotDog
 * Created in Date:2018/11/25 0025下午 06:39
 */

@Service
@ComponentScan
public class SzAttendanceService {

    @Autowired
    SzAttendanceHXYMapper szAttendanceHXYMapper;
    @Autowired
    SzAttendanceXSTMapper szAttendanceXSTMapper;
    @Autowired
    SzAttendanceYXTMapper szAttendanceYXTMapper;


    /**
     *
     * @param schoolName
     * @param clintId
     */
    //通过自定义的ListDto 接收查询返回数据和当前页和当前行
    @TargetDataSource(name="ds1")
    public ListDto<SzAttendanceHXYDto> getHXYAttList(String schoolName, String clintId, Integer page, Integer rows){
        List<SzAttendanceHXYDto> szAttendanceHXYDtos;
        // 当前页
        int intPage = (page == null || page == 0) ? 1 : page;
        // 每页显示条数
        int number = (rows == null || rows == 0) ? 20 : rows;
        // 通过值进行模糊查询字符连接
        if (!StringUtils.isEmpty(schoolName))schoolName = "%"+schoolName + "%";
        if (!StringUtils.isEmpty(clintId))clintId = "%"+clintId + "%";
        //使用分页插件
        Page page1 = PageHelper.startPage(intPage, number);
        szAttendanceHXYDtos = new ArrayList<>(szAttendanceHXYMapper.querySzAttendance(schoolName,clintId));

        //获取总的number
        long total = page1.getTotal()/page1.getPageSize()+1;
        //获取所有数据条数
        long countList = page1.getTotal();
        //将角色装入SzAttendanceDto
        ListDto<SzAttendanceHXYDto> list = new ListDto<>();
        //最终通过set 将 数据放入ListDto中 并返回
        list.setTotal(total);
        list.setCountList(countList);
        list.setRows(szAttendanceHXYDtos);
        return list;
    }

    /**
     *
     * @param schoolName
     * @param clintId
     */
    //通过自定义的ListDto 接收查询返回数据和当前页和当前行
    public ListDto<SzAttendanceXSTDto> getXSTAttList(String schoolName, String clintId, Integer page , Integer rows){
        List<SzAttendanceXSTDto> szAttendanceXSTDtos;

        // 当前页
        int intPage = (page == null || page == 0) ? 1 : page;
        // 每页显示条数
        int number = (rows == null || rows == 0) ? 20 : rows;
        // 通过值进行模糊查询字符连接
        if (!StringUtils.isEmpty(schoolName))schoolName = "%"+schoolName + "%";
        if (!StringUtils.isEmpty(clintId))clintId = "%"+clintId + "%";
        Page page1 = PageHelper.startPage(intPage, number);
        //使用分页插件
        szAttendanceXSTDtos = new ArrayList<>(szAttendanceXSTMapper.querySzAttendance(clintId,schoolName));
        //获取总的number
        long total = page1.getTotal()/page1.getPageSize()+1;
        //获取所有数据条数
        long countList = page1.getTotal();
        //将角色装入SzAttendanceDto
        ListDto<SzAttendanceXSTDto> list = new ListDto<>();
        //最终通过set 将 数据放入ListDto中 并返回
        list.setTotal(total);
        list.setCountList(countList);
        System.out.println("###########################################################");
        System.out.println(list);
        list.setRows(szAttendanceXSTDtos);
        System.out.println(list.toString());
        System.out.println(szAttendanceXSTDtos.toString());
        return list;
    }

    /**
     *
     * @param schoolName
     * @param clintId
     */
    //通过自定义的ListDto 接收查询返回数据和当前页和当前行
    @TargetDataSource(name="ds2")
    public ListDto<SzAttendanceYXTDto> getYXTAttList(String schoolName, String clintId, Integer page, Integer rows){
        List<SzAttendanceYXTDto> szAttendanceYXTDtos;
        // 当前页
        int intPage = (page == null || page == 0) ? 1 : page;
        // 每页显示条数
        int number = (rows == null || rows == 0) ? 20 : rows;
        // 通过值进行模糊查询字符连接
        if (!StringUtils.isEmpty(schoolName))schoolName = "%"+schoolName + "%";
        if (!StringUtils.isEmpty(clintId))clintId = "%"+clintId + "%";
        //使用分页插件
        Page page1 = PageHelper.startPage(intPage, number);
        szAttendanceYXTDtos = new ArrayList<>(szAttendanceYXTMapper.querySzAttendance(schoolName,clintId));

        //获取总的number
        long total = page1.getTotal()/page1.getPageSize()+1;
        //获取所有数据条数
        long countList = page1.getTotal();
        //将角色装入SzAttendanceDto
        ListDto<SzAttendanceYXTDto> list = new ListDto<>();
        //最终通过set 将 数据放入ListDto中 并返回
        list.setTotal(total);
        list.setCountList(countList);
        list.setRows(szAttendanceYXTDtos);
        System.out.println(szAttendanceYXTDtos.toString());
        return list;
    }
}
