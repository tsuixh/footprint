package org.tsui.footprint.common.util.vo;

import java.io.Serializable;

/**
 * 加解密返回的结果
 *
 * @author cuiyunhong.
 * Created by cuiyunhong on 2018/10/21.
 */
public class EncryptionVO implements Serializable{
    /**
     * 需要加密或者解密的内容
     */
    private String origin;
    /**
     * 加密或者解密的结果
     */
    private String result;

    public EncryptionVO() {
    }

    public EncryptionVO(String origin, String result) {
        this.origin = origin;
        this.result = result;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "EncryptionVO{" +
                "origin='" + origin + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}


