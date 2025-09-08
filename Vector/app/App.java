package app;

import vector.Vector;

public class App {
    public void run() {

        try {

            Vector vect1 = new Vector(3.0, 4.0, 5.0);
            // Vector vect2 = new Vector(3.0, 4.0, 5.0);
            Vector vect2 = new Vector(4.0, 19.0, 23.0);

            System.out.println("Vector 1 : " + vect1);
            System.out.println("Vector 2 : " + vect2);

            System.out.println("Addition : " + vect1.add(vect2));
            System.out.println("Dot Product : " + vect1.dotProduct(vect2));

            Vector crossP = vect1.crossProduct(vect2);
            System.out.println("Cross Product : "
                    + crossP.getAxes(0) + "i ,"
                    + crossP.getAxes(1) + "j ,"
                    + crossP.getAxes(2) + "k");

            System.out.println("Vectors are Equal ? : " + vect1.equal(vect2));

            System.out.println("-------------------Clone method below ---------------------");

            // ------------------ Checking our clone Method for Deep & Shallow ---------

            Vector vect3 = new Vector(2.0, 3.0, 4.0);
            Vector vect4 = (Vector) vect3.clone();

            System.out.println("Vector 3 : Original : " + vect3);
            System.out.println("Vector 4 : Copy : " + vect4);

            System.out.println("Vectors are Equal ? : " + vect3.equal(vect4));

            vect4 = vect4.add(vect3);
            System.out.println("Change in Copy : Which is actually Vector 4 : " + vect4);

            // Now checking if the changes reflects on original Vector ( Vector 3 ) or not
            System.out.println("Checking Original Vector 3 After Change in Copy Vector 4 : " + vect3);

            // ---------------- Clone end ------------------------

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
