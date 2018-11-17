package com.device.management.service;

import com.device.management.dto.SzAttendanceDto;
import com.device.management.mapper.SzAttendanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
@ComponentScan
public class SzAttendanceService {

    @Autowired
    SzAttendanceMapper szAttendanceMapper;
/**
 *
 * @param schoolName
 * @param clintId
 */
public List<SzAttendanceDto> getAttList(String schoolName, String clintId,String sql){
    List<SzAttendanceDto> szAttendanceDtos = new ArrayList<>();
    if (!StringUtils.isEmpty(schoolName))schoolName = "%"+schoolName + "%";
    if (!StringUtils.isEmpty(clintId))clintId = "%"+clintId + "%";
    if(sql.equals("0"))
        szAttendanceDtos = szAttendanceMapper.querySzAttendance(clintId,schoolName);

    return szAttendanceDtos;
}
    //    SzAttendanceExample szAttendanceExample = new SzAttendanceExample();
//    SzAttendanceExample.Criteria criteria = szAttendanceExample.createCriteria();
//    if(!StringUtils.isEmpty(clintId))
//        criteria.andClintIdLike(clintId);


//if(!StringUtils.isEmpty(clintId) && StringUtils.isEmpty(schoolName)){
//    SzAttendanceExample szAttendanceExample = new SzAttendanceExample();
//    szAttendanceExample.or().andClintIdLike(clintId);
//    List<SzAttendance> list = szAttendanceMapper.selectByExample(szAttendanceExample);
//    if (!CollectionUtils.isEmpty(list)){
//        for(SzAttendance szAtt : list){
//            SzAttendanceDto szAttendanceDto = new SzAttendanceDto(szAtt);
//            szAttendanceDtos.add(szAttendanceDto);
//        }
//    }
//}

}
