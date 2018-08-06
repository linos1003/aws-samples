package linos.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class ServiceImpl implements RequestHandler<Object, String> {
    public String handleRequest(Object input, Context context) {
        context.getLogger().log("hello from test ");
        return "Hello from test"+input;
    }
}
