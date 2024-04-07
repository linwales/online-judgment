package com.mubai.mubojcodesandbox;


import com.mubai.mubojcodesandbox.model.ExecuteCodeRequest;
import com.mubai.mubojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
