package com.example.webproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Dylan
 * @version 1.0
 * @date 2022/11/26 22:40
 * @description TODO
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private String errMessage;
    private boolean success;
    private Object data;

    public static Result ok(){
        return new Result(null,true,null);
    }
    public static Result ok(Object data){
        return new Result(null,true,data);
    }
    public static Result fail(){
        return new Result(null,false,null);
    }
    public static Result fail(String errMessage){
        return new Result(errMessage,false,null);
    }

}
