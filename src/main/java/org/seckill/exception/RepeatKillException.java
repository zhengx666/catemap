package org.seckill.exception;

/**
 * Created by zheng on 2016/6/15.
 * 运行期异常
 */
public class RepeatKillException extends SeckillException{
    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
