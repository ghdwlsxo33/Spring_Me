package com.busanit501.springex.dto;


import lombok.Builder;

import java.util.List;

public class PageResponseDTO<E> {
    private int page;
    private int size;
    private int total;

    private int start;

    private int end;

    private boolean prev;

    private boolean next;

    private List<E> dtolist;

    @Builder(builderMethodName = "withAll")
    public PageResponseDTO(PageRequestDTO pageRequestDTO, List<E> dtoList, int total) {
        this.page = pageRequestDTO.getPage();
        this.size = pageRequestDTO.getSize();

        this.total = total;
        this.dtolist = dtoList;

        this.end = (int)(Math.ceil(this.page / 10.0)) * 10;

        this.start = this.end - 9;

        int last = (int)(Math.ceil(total /(double)size));

        this.end = end > last ? last : end;

        this.prev = this.start > 1;
        this.next = total > this.end * this.size;
    }
}
