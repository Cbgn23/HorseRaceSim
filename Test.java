public class Test {
    
    public static void main(String [] a){

        Horse Horse1 = new Horse('l', "1 legged larry", 0.7);
        
        System.out.println("Name test:");
        System.out.println(Horse1.getName());

        System.out.println("");
        System.out.println("distanceTravelled, moveForward, goBackToStart test:");
        System.out.println(Horse1.getDistanceTravelled());
        Horse1.moveForward();
        Horse1.moveForward();
        Horse1.moveForward();
        System.out.println(Horse1.getDistanceTravelled());
        Horse1.goBackToStart();
        System.out.println(Horse1.getDistanceTravelled());

        System.out.println("");
        System.out.println("get/set Symbol test:");
        System.out.println(Horse1.getSymbol());
        Horse1.setSymbol('p');
        System.out.println(Horse1.getSymbol());

        System.out.println("");
        System.out.println("get/set Confidence test:");
        System.out.println(Horse1.getConfidence());
        Horse1.setConfidence(0.2);
        System.out.println(Horse1.getConfidence());
        Horse1.setConfidence(100.0);
        System.out.println(Horse1.getConfidence());
        
        System.out.println("");
        System.out.println("fall, hasFallen test:");
        System.out.println(Horse1.hasFallen());
        Horse1.fall();
        System.out.println(Horse1.hasFallen());

        return;
    }
}
