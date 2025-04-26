
/**
 * Write a description of class Horse here.
 * 
 * @author Manveen Singh 
 * @version 1 18/04/25
 */
public class Horse
{
    //Fields of class Horse
    private final String horseName;
    private char horseSymbol;
    private int distanceTravelled = 0;
    private boolean fallen = false;
    private double horseConfidence;


    
      
    //Constructor of class Horse
    /**
     * Constructor for objects of class Horse
     */
    public Horse(char horseSymbol, String horseName, double horseConfidence)
    {
       this.horseName = horseName;
       this.setConfidence(horseConfidence);
       this.setSymbol(horseSymbol);
       
    }
    
    
    
    //Other methods of class Horse
    public void fall()
    {
        this.fallen = true;
        return;
    }

    public double getConfidence()
    {
        return this.horseConfidence;
    }
    
    public int getDistanceTravelled()
    {
        return this.distanceTravelled;
    }
    
    public String getName()
    {
        return this.horseName;
    }
    
    public char getSymbol()
    {
        return this.horseSymbol;
    }
    
    public void goBackToStart()
    {
        this.distanceTravelled = 0;
        this.fallen = false;
    }
    
    public boolean hasFallen()
    {
        return this.fallen;
    }

    public void moveForward()
    {
        if (! this.hasFallen()){
            this.distanceTravelled++;
        }
    }

    public void setConfidence(double newConfidence)
    {
        if ( newConfidence > 0 && newConfidence < 1){
            this.horseConfidence = newConfidence;
        }
        return;
    }
    
    public void setSymbol(char newSymbol)
    {
        this.horseSymbol = newSymbol;
        return;
    }
    
}

