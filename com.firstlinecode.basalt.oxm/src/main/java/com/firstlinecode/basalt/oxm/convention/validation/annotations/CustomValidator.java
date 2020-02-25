package com.firstlinecode.basalt.oxm.convention.validation.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.firstlinecode.basalt.oxm.convention.annotations.Arg;
import com.firstlinecode.basalt.oxm.convention.validation.Validator;
import com.firstlinecode.basalt.oxm.validation.IValidator;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Validator
public @interface CustomValidator {
	Class<? extends IValidator<?>> value();
	Arg[] args() default {};
}
