package us.bojie.mybutterknife;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by bojiejiang on 7/13/17.
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface BindView {
    int value();
}
