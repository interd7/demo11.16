package com.gengdan.demo.entity;

import lombok.Data;

/**
 * @author inter.d
 */
@Data
public class JSONPage {
    private Integer pageSize;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    private Integer pageNumber;

}
