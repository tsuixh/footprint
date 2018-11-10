package org.tsui.footprint.common.util;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志工具
 *
 * @author cuiyunhong.
 * Created by cuiyunhong on 2018/11/10.
 */
public class LogUtil {

    private static final Logger LOG = LoggerFactory.getLogger(LogUtil.class);

    /**
     * 在debug模式开启的时候，返回JSON的字符串
     *
     * @param object 需要转化为JSON字符串的对象
     * @return String 日志中打印的debug串
     */
    public static String toDebugStr(Object object) {
        if (LOG.isDebugEnabled()) {
            return JSON.toJSONString(object);
        }
        return "";
    }
}
