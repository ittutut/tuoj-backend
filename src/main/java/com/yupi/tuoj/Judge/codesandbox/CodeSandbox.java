package com.yupi.tuoj.Judge.codesandbox;

import com.yupi.tuoj.Judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.tuoj.Judge.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {
    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
