package com.yupi.tuoj.Judge.startegy;

import com.yupi.tuoj.Judge.codesandbox.model.JudgeInfo;

public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
