package com.yupi.tuoj.Judge.codesandbox.model.Judge;

import com.yupi.tuoj.model.entity.QuestionSubmit;

public interface JudgeService {

    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
