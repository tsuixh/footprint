package org.tsui.footprint.common.util.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tsui.footprint.common.util.vo.EncryptionVO;

/**
 * 加密解密工具
 *
 * @author cuiyunhong.
 */
@RestController
@RequestMapping("/v1/encryption")
@Api(value = "Encryption")
public class EncryptUtilController {

    @GetMapping("/encrypt/{origin}")
    @ApiOperation(value = "encrypt", httpMethod = "GET")
    public EncryptionVO encrypt(@PathVariable("origin") String orign) {
        return null;
    }
}
