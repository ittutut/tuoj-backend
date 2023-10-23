package com.yupi.tuoj.Judge.codesandbox.impl;

import com.yupi.tuoj.Judge.codesandbox.CodeSandbox;
import com.yupi.tuoj.Judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.tuoj.Judge.codesandbox.model.ExecuteCodeResponse;
import com.yupi.tuoj.Judge.codesandbox.model.JudgeInfo;
import com.yupi.tuoj.model.enums.JudgeInfoMessageEnum;
import com.yupi.tuoj.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

/**
 * 示例代码沙箱
 * @author Ittutu
 * @version 666
 */

public class ExampleCodeSandbox implements CodeSandbox {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getValue());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
