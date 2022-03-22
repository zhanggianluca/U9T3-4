import java.util.ArrayList;

public class Comedian extends Performer
{
    private ArrayList<String> jokes;

    public Comedian(String name, int age, Agent agent)
    {
        super(name, age, agent);
        jokes = new ArrayList<String>();
    }

    public void writeJoke(String joke)
    {
        jokes.add(joke);
    }

    // Exercise 1: Write your overridden method below for callAgent():
    @Override
    public void callAgent()
    {
        System.out.println("Let me run this new joke past my agent! Siri, dial " + getAgent().getCellPhoneNum());
    }

    public void annoyAgent()
    {
        super.callAgent();
        callAgent();
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("I will make you laugh!");
    }


    // Exercise 3: Write your overridden method for perform()
    // so that the output for Exercise 2 test code in Main.java prints
    //      "Performing for an audience! Performance #1"
    // followed by each joke in jokes on a new line
    public void perform() {
        super.perform();
        for (String joke: jokes) {
            System.out.println(joke);
        }
    }

    // Exercise 4: PREDICT what this will do when
    // the Exercise 3 test code in Main.java is executed
    public void randomMethod()
    {
        super.callAgent();
        this.callAgent();
        callAgent();

        super.rehearse();
        this.rehearse();
        rehearse();
    }

    // OVERLOADED rehearse method -- not overridden
    public void rehearse(boolean fullRehearsal)
    {
        if (fullRehearsal)
        {
            for (String joke : jokes)
            {
                System.out.println(joke);
            }
        }
        else
        {
            rehearse();
        }
    }
//   public void rehearse(boolean performAfter)
//   {
//     rehearse();
//
//     if (performAfter)
//     {
//       this.perform();
//     }
//   }
}
