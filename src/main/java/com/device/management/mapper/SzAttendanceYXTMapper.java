package com.device.management.mapper;

import com.device.management.dto.SzAttendanceYXTDto;
import com.device.management.po.SzAttendanceYXT;
import com.device.management.po.SzAttendanceYXTExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SzAttendanceYXTMapper extends BaseMapper<SzAttendanceYXT, SzAttendanceYXTExample>{

    //查询语句
    @Select("<script>" +
            "select DISTINCT s.deptName as schoolName,a.clint_id as clintId,a.position,a.lastlogin_time as lastloginTime," +
            " (CASE  " +
            "WHEN a.isConnection=0  " +
            "  THEN '掉线'  " +
            "WHEN a.isConnection=1  " +
            "  THEN '在线'  " +
            "END  ) as state,a.version,a.ip, " +
            "             CASE " +
            "                  WHEN LEN(a.clint_id)>15  " +
            "                     THEN ''  " +
            "                  ELSE  '话机' " +
            "             END as type " +
            "from NewSZYXT.dbo.Attendance as a " +
            " LEFT  JOIN SZYXT.dbo.Agency as s " +
            " on a.school_id = s.DeptID where s.deptName !='1' " +
            "<if test = \"schoolName != null\">" +
            " and s.deptName like #{schoolName} " +
            "</if>" +
            "<if test = \"clintId != null\">" +
            " and a.clint_id like #{clintId}  " +
            "</if>" +
            "order by s.deptName " +
            "</script>")
    List<SzAttendanceYXTDto> querySzAttendance( @Param("schoolName") String schoolName,@Param("clintId") String clintId);
}