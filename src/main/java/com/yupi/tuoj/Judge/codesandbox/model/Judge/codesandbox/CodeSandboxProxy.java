package com.yupi.tuoj.Judge.codesandbox.model.Judge.codesandbox;

import com.yupi.tuoj.Judge.codesandbox.model.Judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.tuoj.Judge.codesandbox.model.Judge.codesandbox.model.ExecuteCodeResponse;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.common.util.report.qual.ReportOverride;

/**
 * @author Ittutu
 * @version 666
 */
@Slf4j
public class CodeSandboxProxy implements CodeSandbox {

    private CodeSandbox codeSandbox;

    public CodeSandboxProxy(CodeSandbox codeSandbox){
        this.codeSandbox = codeSandbox;
    }

    @ReportOverride
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        log.info("代码沙箱请求信息：" + executeCodeRequest.toString());
        ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
        log.info("代码沙箱响应信息：" + executeCodeResponse.toString());
        return executeCodeResponse;
    }
}
