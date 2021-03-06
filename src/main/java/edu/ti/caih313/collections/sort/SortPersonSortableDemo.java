package edu.ti.caih313.collections.sort;

import edu.ti.caih313.collections.dataobj.Name;
import edu.ti.caih313.collections.dataobj.Person;
import edu.ti.caih313.collections.dataobj.PersonSortable;
import edu.ti.caih313.collections.demo.PrintGeneric;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortPersonSortableDemo {

        public static void main(String... args) {
            PersonSortable personArray[] = {
                    new PersonSortable(new Name("John", "Smith"), Person.Gender.MALE, 24),
                    new PersonSortable(new Name("Karl", "Ng"), Person.Gender.MALE, 27),
                    new PersonSortable(new Name("Jessie", "Smith"), Person.Gender.FEMALE, 24),
                    new PersonSortable(new Name("Sara", "Rich"), Person.Gender.FEMALE, 36),
                    new PersonSortable(new Name("Bob", "Smith"), Person.Gender.MALE, 27),
                    new PersonSortable(new Name("Jane", "Doe"), Person.Gender.FEMALE, 40),
                    new PersonSortable(new Name("Tony", "Stark"), Person.Gender.MALE, 18),
                    new PersonSortable(new Name("Bo", "Peep"), Person.Gender.MALE, 37)
            };

            List<PersonSortable> personList = Arrays.asList(personArray);

            PrintGeneric<PersonSortable> sortPersonDemo = new PrintGeneric<>();
            sortPersonDemo.printCollection(personList);
            Collections.sort(personList);
            System.out.print("\n");
            System.out.println("Print sorted personList.");
            sortPersonDemo.printCollection(personList);
        }
}
