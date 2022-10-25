package badcode;

import common.Person;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyBadCode {

    private static final Logger logger = Logger.getLogger(MyBadCode.class.getName());

    public static void main(String[] args) {

        var narutoOriginal = new Person("Yellow", "Naruto Uzumaki", "Orange");

        var clone1 = new Person(narutoOriginal.getHairColor(), narutoOriginal.getName(), narutoOriginal.getFavoriteColor());

        var clone2 = new Person(narutoOriginal.getHairColor(), narutoOriginal.getName(), narutoOriginal.getFavoriteColor());

        List.of(clone1, clone2)
                .forEach(MyBadCode::logClone);
    }

    private static void logClone(Person clone) {
        logger.log(Level.INFO, "Clone! {0}", clone);
    }
}
