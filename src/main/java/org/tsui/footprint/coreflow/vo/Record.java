package org.tsui.footprint.coreflow.vo;

import org.tsui.footprint.common.vo.BaseVO;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author cuiyunhong.
 * Created by cuiyunhong on 2018/11/10.
 */
public class Record extends BaseVO implements Serializable {

    private static final long serialVersionUID = 804163028440345776L;

    private Long recordId;

    private String content;

    private String title;

    private String createdBy;

    private Timestamp creationTime;

    private Timestamp updateTime;

    public Record() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Record{" +
                "recordId=" + recordId +
                ", content='" + content + '\'' +
                ", title='" + title + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
