package assignments.assignment2;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

import org.grouplens.lenskit.core.Parameter;

/**
 * Parameter annotation for user profile vector type.
 * @author Samer Meggaly
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@Qualifier
@Parameter(IUserProfileType.class)
public @interface UserProfileType {
}
