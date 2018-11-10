package org.tsui.footprint.coreflow.service;

import org.tsui.footprint.coreflow.vo.Record;

import java.util.List;

/**
 * @author cuiyunhong.
 * Created by cuiyunhong on 2018/11/10.
 */
public interface RecordService {
    /**
     * 获取当前用户的所有记录
     *
     * @return list 分页的结果
     */
    List<Record> records();
}
