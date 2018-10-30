package com.bfc.web.base.model;

import com.bfc.web.common.IPubConstantDefine;
import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseModel implements Serializable {

    private static final long serialVersionUID = -7530914554077800126L;
    private String code;
    private String msg;
    private Object data;

    public void success(Object data) {
        this.data = data;
        this.code = IPubConstantDefine.IBaseConstantDefine.CODE_200;
        this.msg = IPubConstantDefine.IBaseConstantDefine.MSG_200;
    }

    public void message(String code,String msg){
        this.code=code;
        this.msg=msg;
    }
}
