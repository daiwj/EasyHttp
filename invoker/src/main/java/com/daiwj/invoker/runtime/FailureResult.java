package com.daiwj.invoker.runtime;

import androidx.annotation.Nullable;

/**
 * author: daiwj on 1/16/21 21:53
 */
public class FailureResult<F extends IFailure> extends Result {

    private F mFailure;

    public FailureResult(Result result, F failure) {
        super(result);
        mFailure = failure;
    }

    @Nullable
    @Override
    public IResponse getResponse() {
        return super.getResponse();
    }

    public F getFailure() {
        return mFailure;
    }

}
