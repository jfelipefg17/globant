import entities.People;
import exception.IsAdultException;
import services.PeopleService;

public class main {

    public static void main(String[] args) {

        People p1 = null;
        People p2 = new People("felipe",19,1001445250);
        People p3 = new People("felipe",18,1001445250);

        PeopleService s1 = new PeopleService();


        try { 

            s1.isAdult(p3);
            System.out.println(p3.toString());


        }catch (IsAdultException a) {
            System.out.println(a.getMessage());

        }catch (NullPointerException a) {
            System.out.println(a.getMessage());
            System.out.println("the object is null");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}