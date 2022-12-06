import java.time.LocalDate;
import java.util.ArrayList;

import static sun.jvm.hotspot.runtime.PerfMemory.end;

public class Main {
    public static void main(String[] args) {

        //region homework 1

        // region task 1

        var maxim = new Human(35, "Максим", "Минск");
        var anya = new Human(29, "Anya", "Москва");
        var katya = new Human(28, "Катя", "Калининград");
        var artiom = new Human(28, "Катя", "Калининград");

        ArrayList<Human> humans = new ArrayList<>();
        humans.add(maxim);
        humans.add(anya);
        humans.add(katya);
        humans.add(artiom);

        for(var i : humans){
            System.out.println(" Привет! Меня зовут " + i.getName() +
                    ". Я из города " + i.getTown() +
                    ". Я родился в " + LocalDate.now().minusYears(i.getYearOfBirth()) + " году. Будем знакомы!");
        }
        //endregion

        // region task 2

        maxim.setJob("Бренд-менеджер");
        anya.setJob("Методист образовательных программ");
        katya.setJob("Продакт-менеджер");
        artiom.setJob("директор по развитию бизнеса");

        for(var i : humans){
            System.out.println(" Привет! Меня зовут " + i.getName() +
                    ". Я из города " + i.getTown() +
                    ". Я родился в " + LocalDate.now().minusYears(i.getYearOfBirth()) +
                    "Я работаю на должности " + i.getJob() + ". Будем знакомы!");
        }
        //endregion

        //region task 3



        //endregion



    }
}
