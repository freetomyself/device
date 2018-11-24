package com.device.management.service;


import com.device.management.dataSource.TargetDataSource;
import com.device.management.dto.ListDto;
import com.device.management.dto.SzAttendanceHXYDto;
import com.device.management.dto.SzAttendanceYXTDto;
import com.device.management.mapper.SzAttendanceYXTMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
@ComponentScan
public class SzAttendanceYXTService {


    @Autowired
    com.device.management.mapper.SzAttendanceYXTMapper SzAttendanceYXTMapper;


    /**
     *
     * @param schoolName
     * @param clintId
     */
//通过自定义的ListDto 接收查询返回数据和当前页和当前行
    @TargetDataSource(name="ds2")
    public ListDto<SzAttendanceYXTDto> getAttList(String schoolName, String clintId, Integer page, Integer rows){
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
        szAttendanceYXTDtos = new ArrayList<>(SzAttendanceYXTMapper.querySzAttendance(schoolName,clintId));

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
//    SzAttendanceXSTExample.Criteria criteria = szAttendanceExample.createCriteria();
//    if(!StringUtils.isEmpty(clintId))
//        criteria.andClintIdLike(clintId);


//if(!StringUtils.isEmpty(clintId) && StringUtils.isEmpty(schoolName)){
//    SzAttendanceXSTExample szAttendanceExample = new SzAttendanceXSTExample();
//    szAttendanceExample.or().andClintIdLike(clintId);
//    List<SzAttendanceXST> list = szAttendanceMapper.selectByExample(szAttendanceExample);
//    if (!CollectionUtils.isEmpty(list)){
//        for(SzAttendanceXST szAtt : list){
//            SzAttendanceXSTDto szAttendanceDto = new SzAttendanceXSTDto(szAtt);
//            szAttendanceDtos.add(szAttendanceDto);
//        }
//    }
//}

}
