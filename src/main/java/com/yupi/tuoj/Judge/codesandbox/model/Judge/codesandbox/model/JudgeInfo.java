package com.yupi.tuoj.Judge.codesandbox.model.Judge.codesandbox.model;

/**
 * @author Ittutu
 * @version 666
 */
import lombok.Data;

/**
 * 判题信息
 */
@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存
     */
    private Long memory;

    /**
     * 消耗时间（KB）
     */
    private Long time;
}
