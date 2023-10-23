package com.yupi.tuoj.Judge.startegy;

import com.yupi.tuoj.Judge.codesandbox.model.JudgeInfo;
import com.yupi.tuoj.model.dto.question.JudgeCase;
import com.yupi.tuoj.model.entity.Question;
import com.yupi.tuoj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * @author Ittutu
 * @version 666
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private Question question;

    private List<JudgeCase> judgeCaseList;

    private QuestionSubmit questionSubmit;
}
