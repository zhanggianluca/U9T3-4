public class PerformingArtsTest
{
    public static void main(String[] args)
    {
//     Agent amy = new Agent("Amy Higgins", "646-555-5555");
//     Comedian brittany = new Comedian("Brittany", 19, amy);
//     brittany.printInfo();

        // Exercise 1
        System.out.println("---- Exercise 1 ----");
        Agent amy = new Agent("Amy Higgins", "646-555-5555");

        Performer david = new Performer("David", 23, amy);
        david.callAgent();

        // override callAgent in Comedian to print
        // "Let me run this new joke past my agent! Siri, dial 646-555-5555"
        Comedian brittany = new Comedian("Brittany", 19, amy);
        brittany.callAgent();

        //DEMO
        brittany.printInfo();

        brittany.annoyAgent();


    // Exercise 2
    System.out.println("---- Exercise 2 ----");
    brittany.perform();
    brittany.perform();
    brittany.perform();
    brittany.printInfo();


    // Exercise 3
    System.out.println("---- Exercise 3 ----");
    Comedian morgan = new Comedian("Morgan Smith", 31, amy);
    morgan.writeJoke("There are 10 kinds of people in the world: Those that understand binary and those that don't");
    morgan.writeJoke("How many programmers does it take to change a light bulb? None, that's a hardware problem!");
    morgan.writeJoke("What's the object oriented way to become wealthy? Inheritance!");
    morgan.perform();

/*
    // Exercise 4
    System.out.println("---- Exercise 4 ----");
    morgan.randomMethod();
*/

        // DEMO:
        // morgan.rehearse();
        // morgan.rehearse(true);
        // morgan.rehearse(false);

/*
    // Exercise 5
    System.out.println("---- Exercise 5 ----");
    morgan.rehearse();
    morgan.rehearse(true);
    morgan.rehearse(false);
*/
    }
}
