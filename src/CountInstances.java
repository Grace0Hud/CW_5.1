public class CountInstances
{
   public static void main (String [] args)
   {
       Slogan obj;
       obj = new Slogan ("Remember the Alamo.");
       System.out.println(obj);
       //this still creates new objects, not simply changing the object.
       obj = new Slogan ("Don't worry. Be happy.");
       System.out.println(obj);
       obj = new Slogan ("Live Free or Die.");
       System.out.println(obj);
       obj = new Slogan ("Talk is Cheap.");
       System.out.println(obj);
       obj = new Slogan ("Write Once, Run Anywhere.");
       System.out.println(obj);
       System.out.println();
       System.out.println("Slogans created: " + Slogan.getCount());
       System.out.println("By Grace Hudgens");
   }//end of main method
}//end of count instances
