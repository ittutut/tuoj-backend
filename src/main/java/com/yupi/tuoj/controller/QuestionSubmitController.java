package com.yupi.tuoj.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yupi.tuoj.common.BaseResponse;
import com.yupi.tuoj.common.ErrorCode;
import com.yupi.tuoj.common.ResultUtils;
import com.yupi.tuoj.exception.BusinessException;
import com.yupi.tuoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.yupi.tuoj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.yupi.tuoj.model.entity.QuestionSubmit;
import com.yupi.tuoj.model.entity.User;
import com.yupi.tuoj.model.vo.QuestionSubmitVO;
import com.yupi.tuoj.service.QuestionSubmitService;
import com.yupi.tuoj.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 提交题目接口
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
//@RestController
//@RequestMapping("/question_submit")
//@Slf4j
//public class QuestionSubmitController {
//
//    @Resource
//    private QuestionSubmitService questionSubmitService;
//
//    @Resource
//    private UserService userService;
//
//    /**
//     * 点赞 / 取消点赞
//     *
//     * @param questionSubmitAddRequest
//     * @param request
//     * @return 提交记录id
//     */
//    @PostMapping("/")
//    public BaseResponse<Long> doQuestionSubmit(@RequestBody QuestionSubmitAddRequest questionSubmitAddRequest,
//                                               HttpServletRequest request) {
//        if (questionSubmitAddRequest == null || questionSubmitAddRequest.getQuestionId() <= 0) {
//            throw new BusinessException(ErrorCode.PARAMS_ERROR);
//        }
//        // 登录才能点赞
//        final User loginUser = userService.getLoginUser(request);
//        long questionSubmitId = questionSubmitService.doQuestionSubmit(questionSubmitAddRequest, loginUser);
//        return ResultUtils.success(questionSubmitId);
//    }
//
//
//    /**
//     * 分页获取题目提交列表（除了管理员之外，登录的用户，其他用户只能看到非答案，提交代码等其他公开信息）
//     *
//     * @param questionSubmitQueryRequest
//     * @param request
//     * @return
//     */
//    @PostMapping("/list/page")
//    public BaseResponse<Page<QuestionSubmitVO>> listQuestionByPage(@RequestBody QuestionSubmitQueryRequest questionSubmitQueryRequest,
//                                                                   HttpServletRequest request) {
//        long current = questionSubmitQueryRequest.getCurrent();
//        long size = questionSubmitQueryRequest.getPageSize();
//        Page<QuestionSubmit> questionSubmitQueryPage = questionSubmitService.page(new Page<>(current, size),
//                questionSubmitService.getQueryWrapper(questionSubmitQueryRequest));
//        final User loginUser = userService.getLoginUser(request);
//        return ResultUtils.success(questionSubmitService.getQuestionSubmitVOPage(questionSubmitQueryPage, loginUser));
//    }
//}
