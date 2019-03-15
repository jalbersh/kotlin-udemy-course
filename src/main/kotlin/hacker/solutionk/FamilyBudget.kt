package hacker.solutionk

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@Retention(RetentionPolicy.RUNTIME)
internal annotation class FamilyBudget(val userRole: String = "GUEST", val budgetLimit: Int = 200)