package bg.softUni.mobilelele.web.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ObjNotFoundException extends RuntimeException {
    public ObjNotFoundException(String message) {
        super(message);
    }
}
