package com.gengdan.demo.entity;

/**
 * Created by inter.d on 2020/11/10 10:21 上午
 */
public class JSONPage {
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

    private Integer pageSize;
    private Integer pageNumber;

}
