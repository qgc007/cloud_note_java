package com.kebab.cloud_note_java.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Code  result;
    private  Object data;
    private  String msg;

    public  static  enum  Code{
        OK, FAIL, ERROR
    }
}
