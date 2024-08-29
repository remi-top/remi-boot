package ai.remi.boot.server.exception;

import ai.remi.comm.exception.custom.BusinessException;

public class BootServiceException extends BusinessException {

    public BootServiceException(String code, String message) {
        super(code, message);
    }

    public BootServiceException(String code, Throwable cause) {
        super(code, cause);
    }

    public BootServiceException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public BootServiceException(String code, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(code, message, cause, enableSuppression, writableStackTrace);
    }
}
