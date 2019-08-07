package app.util;

import java.util.function.Function;

public class Result<R,E> {

    private R result;
    private E error;

    protected Result(R result, E error){
        this.result = result;
        this.error = error;
    }

    public static <R,E> Result<R,E> ok(R result){
        return new Result<R,E>(result, null);
    }

    public static <R,E> Result<R,E> err(E error){
        return new Result<>(null, error);
    }

    public boolean isOk(){
        return result != null && error == null;
    }

    public boolean isErr(){
        return error != null && result == null;
    }

    public R unwrap(){
        if(!this.isOk()){
            throw new RuntimeException();
        }
        return result;
    }

    public R unwrapOr(Object x, Function function){
        if(!this.isOk()){
            return (R)function.apply(x);
        }
        return result;
    }

    public R unwrapOrElse(Runnable runnable){
        if(!this.isOk()){
            runnable.run();
            throw new RuntimeException();
        }
        return result;
    }

    public E unwrapErr(){
        if(!this.isErr()){
            throw new RuntimeException();
        }
        return error;
    }
}
