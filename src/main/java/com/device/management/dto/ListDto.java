package com.device.management.dto;
import java.util.List;

/**
 * @program: manage
 * @description: 用来处理 数据库数据和分页
 * @author: WaHotDog 2018-11-18 17:08
 **/


public class ListDto<T> {
    private Long total;
    private Long countList;
    private List<T> rows;


    public Long getCountList() {
        return countList;
    }

    public void setCountList(Long countList) {
        this.countList = countList;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "ListDto{" +
                "total=" + total +
                ", countList=" + countList +
                ", rows=" + rows +
                '}';
    }
}

