package common;

public interface BizCallback<T> {

    void checkParam();

    T doBusiness();
}
