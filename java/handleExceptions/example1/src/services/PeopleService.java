package services;

import entities.People;
import exception.IsAdultException;

public class PeopleService extends Exception{

    public void isAdult (People p1) throws IsAdultException {

        try {

            if (p1.getAge() <= 18 ) {
                throw new IsAdultException("the person is not a adult");
            }

        }catch (IsAdultException | NullPointerException a){
            throw a;
        } catch (Exception a ) {
            a.printStackTrace();
            System.out.println("error");
        }


    }

}
