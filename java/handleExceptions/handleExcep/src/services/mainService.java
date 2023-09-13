package services;

public class mainService extends Exception{
    public void convertStringNumber (String s ) throws StringException {

        try {

            if (s.length() > 1) {
                throw new StringException("the number can not  be change of string to int");
            }

        } catch (StringException e) {
            throw e;
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }


    }
}
