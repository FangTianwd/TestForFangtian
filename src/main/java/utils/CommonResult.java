package utils;

/**
 * 封装公共响应类(枚举)
 * @author jiangshengcheng
 * @date 2021/8/2 11:37 上午
 */
public class CommonResult<T> {
    private Boolean isSuccess = true;
    private String resultCode;
    private String resultMessage;
    private T resultObject;

    public CommonResult() {
    }

    public CommonResult(T resultObject) {
        this.resultObject = resultObject;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public T getResultObject() {
        return resultObject;
    }

    public void setResultObject(T resultObject) {
        this.resultObject = resultObject;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "isSuccess=" + isSuccess +
                ", resultCode='" + resultCode + '\'' +
                ", resultMessage='" + resultMessage + '\'' +
                ", resultObject=" + resultObject +
                '}';
    }
}
