package secao26;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //em tempo de execução
@Target(ElementType.METHOD) // aplicada em metodos
@interface Executar {

    int vezes() default 1;

    

    
}
