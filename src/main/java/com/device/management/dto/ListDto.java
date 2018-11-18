package com.device.management.dto;
import java.util.List;

/**
 * @program: manage
 * @description: 用来处理 数据库数据和分页
 * @author: WaHotDog 2018-11-18 17:08
 **/


public class ListDto<T> {
    private Long total;
    private List<T> rows;

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
}

