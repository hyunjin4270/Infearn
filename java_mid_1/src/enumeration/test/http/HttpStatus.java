package enumeration.test.http;

public enum HttpStatus {
    Ok(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private int code;
    private String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    static HttpStatus findByCode(int httpCodeInput) {
        if (200 <= httpCodeInput && httpCodeInput < 300) {
            return Ok;
        } else if (httpCodeInput == 400) {
            return BAD_REQUEST;
        } else if (httpCodeInput == 404) {
            return NOT_FOUND;
        } else if (httpCodeInput == 500) {
            return INTERNAL_SERVER_ERROR;
        } else {
            return null;
        }
    }

    public int getCode() {
        return code;
    }
    
    public String getMessage() {
        return message;
    }

    Boolean isSuccess() {
        return 200 <= code && code < 300;
    }
    
}
