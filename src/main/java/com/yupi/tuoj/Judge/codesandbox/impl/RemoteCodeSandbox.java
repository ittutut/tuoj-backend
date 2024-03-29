package com.yupi.tuoj.Judge.codesandbox.impl;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.yupi.tuoj.Judge.codesandbox.CodeSandbox;
import com.yupi.tuoj.Judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.tuoj.Judge.codesandbox.model.ExecuteCodeResponse;
import com.yupi.tuoj.common.ErrorCode;
import com.yupi.tuoj.exception.BusinessException;
import org.apache.commons.lang3.StringUtils;

/**
 * 远程代码沙箱（实际调用接口沙箱）
 * @author Ittutu
 * @version 666
 */


/**
 * 远程代码沙箱（实际调用接口的沙箱）
 */
public class RemoteCodeSandbox implements CodeSandbox {

    // 定义鉴权请求头和密钥
    private static final String AUTH_REQUEST_HEADER = "auth";

    private static final String AUTH_REQUEST_SECRET = "secretKey";


    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱");
        String url = "http://192.168.190.130:8022/executeCode";
        String json = JSONUtil.toJsonStr(executeCodeRequest);
        String responseStr = HttpUtil.createPost(url)
                .header(AUTH_REQUEST_HEADER, AUTH_REQUEST_SECRET)
                .body(json)
                .execute()
                .body();
        if (StringUtils.isBlank(responseStr)) {
            throw new BusinessException(ErrorCode.API_REQUEST_ERROR, "executeCode remoteSandbox error, message = " + responseStr);
        }
        return JSONUtil.toBean(responseStr, ExecuteCodeResponse.class);
    }
}

