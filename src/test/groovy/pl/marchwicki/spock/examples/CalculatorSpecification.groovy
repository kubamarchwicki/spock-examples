package pl.marchwicki.spock.examples

import spock.lang.Ignore
import spock.lang.Specification

class CalculatorSpecification extends Specification {

    def calculator

    def setup() {
        calculator = new Calculator()
    }

//    @Unroll("Result of #a + #b is #result")
    def "should add two numbers"() {
        expect:
        result == calculator.add(a, b)

        where:
        result | a | b
        4      | 2 | 2
        5      | 3 | 2
    }

    @Ignore
    def "failing test"() {
        expect:
        5 == calculator.add(2,2)
    }

}
