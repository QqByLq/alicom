package com.test.pojo;

public class SportResult {

    //状态
    private String status;
    //回传的消息
    private String message;
    //接收服务器回传的数据
    private Object data;

    public static SportResult ok(){
        SportResult result = new SportResult();
        result.setStatus("ok");
        result.setMessage("执行成功！");
        return result;
    }
    public static SportResult ok(String message){
        SportResult result = new SportResult();
        result.setStatus("ok");
        result.setMessage(message);
        return result;
    }

    public static SportResult ok(Object data){
        SportResult result = new SportResult();
        result.setStatus("ok");
        result.setMessage("执行成功！");
        result.setData(data);
        return result;
    }
    public static SportResult ok(String message, Object data){
        SportResult result = new SportResult();
        result.setStatus("ok");
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static SportResult notOk(){
        SportResult result = new SportResult();
        result.setStatus("not ok");
        result.setMessage("执行失败");
        return result;
    }

    public static SportResult notOk(String message){
        SportResult result = new SportResult();
        result.setStatus("not ok");
        result.setMessage(message);
        return result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
