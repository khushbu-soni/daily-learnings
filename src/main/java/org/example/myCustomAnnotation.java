package org.example;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS  )
public @interface myCustomAnnotation {
}
