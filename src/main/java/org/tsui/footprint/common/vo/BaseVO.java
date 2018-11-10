package org.tsui.footprint.common.vo;

import java.io.Serializable;

/**
 * @author cuiyunhong.
 * Created by cuiyunhong on 2018/11/10.
 */
public class BaseVO implements Serializable {

    private static final long serialVersionUID = -4173180530842543463L;

    private PageVO page;

    public BaseVO() {
    }

    public PageVO getPage() {
        return page;
    }

    public void setPage(PageVO page) {
        this.page = page;
    }

    private class PageVO {
        private Integer curPage;
        private Integer pageSize;
        private Integer totalRows;

        public Integer getCurPage() {
            return curPage;
        }

        public void setCurPage(Integer curPage) {
            this.curPage = curPage;
        }

        public Integer getPageSize() {
            return pageSize;
        }

        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }

        public Integer getTotalRows() {
            return totalRows;
        }

        public void setTotalRows(Integer totalRows) {
            this.totalRows = totalRows;
        }
    }
}
