package com.yupi.tuoj.Judge;

import com.yupi.tuoj.model.entity.QuestionSubmit;
import com.yupi.tuoj.model.vo.QuestionSubmitVO;

public interface JudgeService {

    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
