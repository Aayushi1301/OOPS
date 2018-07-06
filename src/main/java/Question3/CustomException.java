/**
 * My custom exception class.
 */
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

/**
 * Our test class to demonstrate custom exception.
 */
class Foo {
    public String getNum(int i) throws MyCustomException {
        if (i == 0) {
            // throw custom exception
            throw new MyCustomException("Anything but zero ...");
        } else {
            return "Thanks";
        }
    }
}


class TestException {
    public static void main(String[] args) {
        // create a new foo
        Foo foo = new Foo();

        try {
            // intentionally throw our custom exception by
            // calling getBar with a zero
            String bar = foo.getNum(0);
        } catch (MyCustomException e) {
            // print the stack trace
            e.printStackTrace();
        }
    }
}