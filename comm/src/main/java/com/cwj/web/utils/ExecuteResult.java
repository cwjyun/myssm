package com.cwj.web.utils;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

@Data
public class ExecuteResult<T> {
    private boolean success;
    private int code;
    private String message;
    private T data;
    private T rows;
    private T pages;
    private transient String exception;


    public ExecuteResult code(int status) {
        this.success = status == HttpStatus.OK.value();
        this.code = status;
        return this;
    }

    public ExecuteResult message(String message) {
        this.message = message;
        return this;
    }

    public ExecuteResult data(T data) {
        this.data = data;
        return this;
    }

    public ExecuteResult success() {
        this.success = true;
        this.code = HttpStatus.OK.value();
        return this;
    }

    public ExecuteResult success(T data) {
        this.success = true;
        this.code = HttpStatus.OK.value();
        this.data = data;
        return this;
    }

    public ExecuteResult success(T data, String message) {
        this.success = true;
        this.code = HttpStatus.OK.value();
        this.data = data;
        this.message = message;
        return this;
    }

    public ExecuteResult successRows(T rows, T pages ,String message) {
        this.success = true;
        this.code = HttpStatus.OK.value();
        this.rows = rows;
        this.pages = pages;
        this.message = message;
        return this;
    }

    public ExecuteResult fail() {
        this.success = false;
        this.code = HttpStatus.INTERNAL_SERVER_ERROR.value();
        return this;
    }

    public ExecuteResult loginError(String message) {
        this.success = false;
        this.message = message;
        this.code = HttpStatus.NETWORK_AUTHENTICATION_REQUIRED.value();
        return this;
    }

    public ExecuteResult fail(String message) {
        this.message = message;
        return this.fail();
    }

    public ExecuteResult exception(Exception e) {
        StringWriter stringWriter = null;
        PrintWriter printWriter = null;
        try {
            stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
            e.printStackTrace(printWriter);
            this.exception = stringWriter.toString();
        } finally {
            if (stringWriter != null){
                try {
                    stringWriter.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if (printWriter != null){
                printWriter.close();
            }
            return this;
        }
    }

}
