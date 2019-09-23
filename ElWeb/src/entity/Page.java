package entity;

import java.util.List;

public class Page{
    private Integer PageNo;
    private Integer PageSize;
    private Integer First;
    private Integer prev;
    private Integer Next;
    private Integer Last;
    private Integer Pages;
    private Integer Totalcount;
    private List Date;

    public Page(Integer pageNo, Integer pageSize, Integer totalcount, List date) {
        PageNo = pageNo;
        PageSize = pageSize;
        Totalcount = totalcount;
        Date = date;
//        当前页
        if (PageNo<0)PageNo=1;
//        上页
        if (PageNo>1){
            prev=PageNo-1;
        }else {prev=1;}
//        总页数
        this.Pages=Totalcount%PageSize==0?Totalcount/PageSize:Totalcount/PageSize+1;
//        前页
        if (this.PageNo<this.Pages){
            this.Next=this.PageNo+1;
        }else {
            this.Next=this.Pages;
        }
//        尾页
        this.Last=this.Pages;
    }

    public List getDate() {
        return Date;
    }

    public void setDate(List date) {
        Date = date;
    }

    public Integer getPages() {
        return Pages;
    }

    public void setPages(Integer pages) {
        Pages = pages;
    }

    public Integer getTotalcount() {
        return Totalcount;
    }

    public void setTotalcount(Integer totalcount) {
        Totalcount = totalcount;
    }

    public Integer getPageNo() {
        return PageNo;
    }

    public void setPageNo(Integer pageNo) {
        PageNo = pageNo;
    }

    public Integer getPageSize() {
        return PageSize;
    }

    public void setPageSize(Integer pageSize) {
        PageSize = pageSize;
    }

    public Integer getFirst() {
        return First;
    }

    public void setFirst(Integer first) {
        First = first;
    }

    public Integer getPrev() {
        return prev;
    }

    public void setPrev(Integer prev) {
        this.prev = prev;
    }

    public Integer getNext() {
        return Next;
    }

    public void setNext(Integer next) {
        Next = next;
    }

    public Integer getLast() {
        return Last;
    }

    public void setLast(Integer last) {
        Last = last;
    }

}
