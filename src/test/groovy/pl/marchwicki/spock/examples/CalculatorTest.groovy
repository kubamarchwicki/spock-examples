package pl.marchwicki.spock.examples

class CalculatorTest extends GroovyTestCase {

    def calculator = new Calculator();

    void test_add_two_numbers() {
        assert calculator.add(2, 2) == 4
    }


//    void test_wrong_addition() {
//        assert calculator.add(3, 3) == 7
//    }


}
