package com.viddu.codegaga.controllers;

import java.util.Map;

import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.ModelAndView;

import scala.concurrent.ExecutionContext;
import scala.concurrent.Future;
import akka.dispatch.ExecutionContexts;
import akka.dispatch.OnComplete;

public class DeferredWebResult extends DeferredResult<ModelAndView> {
    private ExecutionContext global = ExecutionContexts.global();

    private final String viewName;

    public DeferredWebResult(String viewName) {
        this.viewName = viewName;
    }

    public void completeWith(Future<Map<String, Object>> mmFuture) {
        mmFuture.onComplete(new OnComplete<Map<String, Object>>() {

            @Override
            public void onComplete(Throwable failure, Map<String, Object> mm) throws Throwable {
                if (failure != null) {
                    // TODO: Handle exceptions here..
                } else {
                    ModelAndView mv = new ModelAndView(viewName);
                    mv.addAllObjects(mm);
                    setResult(mv);
                }
            }
        }, global);
    }
}
