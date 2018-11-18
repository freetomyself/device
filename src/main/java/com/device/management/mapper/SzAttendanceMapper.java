package com.device.management.mapper;
import com.device.management.dto.SzAttendanceDto;
import com.device.management.po.SzAttendance;
import com.device.management.po.SzAttendanceExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SzAttendanceMapper extends BaseMapper<SzAttendance, SzAttendanceExample>{
//sql 查询设备信息
    @Select("<script>"+
            "select s.school_name as schoolName,a.clint_id as clintId, " +
            " a.position as position,a.lastlogin_time as lastloginTime,a.state as state ," +
            " a.version as version,a.ip as ip, " +
            " CAST(" +
            "             CASE  " +
            "                  WHEN LEN(a.clint_id)=16 " +
            "                     THEN '班牌'  " +
            "                  ELSE  '话机' " +
            "             END AS varchar ) as type "+
            " from xiaoan.SZ_Schema.SZ_Attendance as a " +
            " INNER JOIN xiaoan.SZ_Schema.SZ_School as s " +
            " on a.school_id = s.school_id " +
            " WHERE a.state != -1 " +
            "<if test=\"schoolName != null\">" +
            " and s.school_name like #{schoolName}" +
            " </if>"+
            "<if test=\"clintId != null\">" +
            " and a.clint_id like #{clintId}" +
            " </if>"+
            " order by s.school_name "
            +"</script>")
    List<SzAttendanceDto> querySzAttendance(@Param("clintId") String clintId , @Param("schoolName") String schoolName);
}