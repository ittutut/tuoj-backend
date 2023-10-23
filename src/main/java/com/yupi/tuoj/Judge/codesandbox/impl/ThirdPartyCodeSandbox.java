package com.yupi.tuoj.Judge.codesandbox.impl;

import com.yupi.tuoj.Judge.codesandbox.CodeSandbox;
import com.yupi.tuoj.Judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.tuoj.Judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 * @author Ittutu
 * @version 666
 */

public class ThirdPartyCodeSandbox implements CodeSandbox {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
