package linos.aws.lambda;

import com.amazonaws.services.lambda.invoke.LambdaFunction;

public interface LambdaService {
    @LambdaFunction(functionName="test-with-cloudformation")
    String helloFromLabda(Object input);

}
