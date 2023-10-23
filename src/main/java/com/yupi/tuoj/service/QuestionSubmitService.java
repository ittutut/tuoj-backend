package com.yupi.tuoj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yupi.tuoj.model.dto.question.QuestionQueryRequest;
import com.yupi.tuoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.yupi.tuoj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.yupi.tuoj.model.entity.Question;
import com.yupi.tuoj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.tuoj.model.entity.User;
import com.yupi.tuoj.model.vo.QuestionSubmitVO;
import com.yupi.tuoj.model.vo.QuestionVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author YY怪
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2023-09-21 15:30:07
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {

    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);



    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);


    /**
     * 获取题目封装
     *
     * @param questionSubmit
     * @param request
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取题目封装
     *
     * @param questionSubmitPage
     * @param request
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);
}
