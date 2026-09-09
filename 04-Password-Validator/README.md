# Robust Password Validator

A Java console application that continuously evaluates user-inputted passwords against strict security policies using String manipulation and Regular Expressions.

**Core Concepts Demonstrated**
* **Continuous Input Streams:** Managing live user input via `Scanner` within an infinite `while` loop, configured to terminate when the user inputs "END".
* **Regular Expressions (Regex):** Utilizing pattern matching (`.matches()`) to enforce the inclusion of numeric digits and specific special characters (!@#$%).
* **Logical Validation:** Enforcing a multi-step security policy, including length requirements and case diversity (comparing uppercase and lowercase variants).
* **Session Tracking:** Accumulating specific validation errors to provide detailed user feedback, while maintaining a running tally of valid versus invalid entries across the session.
