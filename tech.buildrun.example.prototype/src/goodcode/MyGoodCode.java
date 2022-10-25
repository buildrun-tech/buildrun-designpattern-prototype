package goodcode;

import common.Person;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyGoodCode {

    private static final Logger logger = Logger.getLogger(MyGoodCode.class.getName());

    public static void main(String[] args) {

        var narutoOriginal = new Person("Yellow", "Naruto Uzumaki", "Orange");

        var cloneNaruto = new Person(narutoOriginal);

        var cloneNaruto2 = new Person(narutoOriginal);

        List.of(cloneNaruto, cloneNaruto2)
                .forEach(MyGoodCode::logClone);
    }

    private static void logClone(Person clone) {
        logger.log(Level.INFO, "Clone! {0}", clone);
    }
}
