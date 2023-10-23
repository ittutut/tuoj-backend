package com.yupi.tuoj.Judge;

import com.yupi.tuoj.Judge.codesandbox.model.JudgeInfo;
import com.yupi.tuoj.Judge.startegy.DefaultJudgeStrategy;
import com.yupi.tuoj.Judge.startegy.JavaLanguageJudgeStrategy;
import com.yupi.tuoj.Judge.startegy.JudgeContext;
import com.yupi.tuoj.Judge.startegy.JudgeStrategy;
import com.yupi.tuoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * @author Ittutu
 * @version 666
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext){
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)){
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
