package org.tsui.footprint.coreflow.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tsui.footprint.coreflow.vo.Record;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author cuiyunhong.
 * Created by cuiyunhong on 2018/11/10.
 */
@RestController
@RequestMapping("/")
@Api(value = "事件接口")
public class RecordController {

    @GetMapping("/records")
    public List<Record> records() {
        return null;
    }

    @GetMapping("/record")
    @ApiOperation("查询单条记录接口")
    public Record record() {
        final Record record = new Record();
        record.setContent("在鹿港小镇吃了中饭，食物很好吃，尤其是油条🦐");
        record.setTitle("中饭");
        record.setCreatedBy("tsuixh");
        record.setCreationTime(new Timestamp(System.currentTimeMillis()));
        record.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        record.setPage(null);
        return record;
    }
}
