package linos.aws.lambda;

import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.invoke.LambdaInvokerFactory;

public class ClientLambda {
    public static void main(String[] args){
        System.out.println("Hello world");

        final LambdaService lambdaService = LambdaInvokerFactory.builder()
                .lambdaClient(AWSLambdaClientBuilder.defaultClient())
                .build(LambdaService.class);

      Object output =  lambdaService.helloFromLabda("sdqsd");
        System.out.println(output);
    }
}
