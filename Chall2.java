//Steve~~Making an Eye of Ender to open the [End Portal]
public class Chall2 {
    
    public static void main(String[] args) //main method
    {
        
        minecraft();
        enderman();
    }

    //Created a minecraft method that outputs Creeper stuff (This is a Single line comment BTW)
    static void minecraft()
    {
        System.out.println("Creeper! AWWW MAN");
    }

    static void enderman()
    {
        int Blaze_Rods = 1;
        int Enderpearl = 1;
        int Eyes_Ender = Blaze_Rods + Enderpearl;

        System.out.print("Eye of Ender: "+ Blaze_Rods + Enderpearl);  //Outputs 11 (Didnt add them it only places them together)
        
        if(Eyes_Ender <= 2)
        {
            System.out.print("\nI have created: 1 Eyes of Ender");
        }

    }

    static void End_portal()
    {
        Variable_End Eyes_Ender = new Variable_End();
        if ( Eyes_Ender == 24)
        {
            System.out.println("The End Portal Has Opened...");
        }


        
    }
    
}