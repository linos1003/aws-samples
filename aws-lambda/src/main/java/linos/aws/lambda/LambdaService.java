package linos.aws.lambda;

import com.amazonaws.services.lambda.invoke.LambdaFunction;

public interface LambdaService {
    @LambdaFunction(functionName="test2")
    String helloFromLabda(Object input);

}
