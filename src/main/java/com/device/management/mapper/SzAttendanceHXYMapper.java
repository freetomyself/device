package com.device.management.mapper;

import com.device.management.dto.SzAttendanceHXYDto;
import com.device.management.po.SzAttendanceHXY;
import com.device.management.po.SzAttendanceHXYExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface SzAttendanceHXYMapper extends BaseMapper<SzAttendanceHXY, SzAttendanceHXYExample>{
    //sql查询考勤设备
@Select("<script>" +
        " select s.school_name as schoolName,a.clint_id as clintId,a.position,a.lastlogin_time as lastloginTime,a.state, " +
        "a.version,a.ip, " +
        "CAST(" +
        "             CASE  " +
        "                  WHEN LEN(a.clint_id)>15 " +
        "                     THEN '班牌'  " +
        "                  ELSE  '话机' " +
        "             END AS varchar ) as type " +
        "from SmartCampus.dbo.SZ_Attendance  a " +
        " INNER JOIN " +
        " SmartCampus.dbo.SZ_School s " +
        " on a.school_id = s.school_id Where s.school_id != -1 " +

        "<if test=\"schoolName != null\">" +
        " and s.school_name like #{schoolName} " +
        "</if>" +
        "<if test=\"clintId != null\"> " +
        " and a.clint_id like #{clintId}" +
        "</if>" +
        " order by s.school_name "+
        "</script>")
    List<SzAttendanceHXYDto> querySzAttendance( @Param("schoolName") String schoolName,@Param("clintId") String clintId);

}