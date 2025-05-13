//******************************************************************************
//*                                 Javascape                                  *
//******************************************************************************
//* Description:   This program is a text-based escape puzzle. The player      *
//*                begins the game locked inside a house. The player must      *
//*                navigate the rooms of the house and use items there to      *
//*                escape to the outside world.                                *
//* Author:        Jonathan Tyler (GitHub: https://github.com/JonMiTy)         *
//* Last modified: May 10, 2025                                                *
//******************************************************************************

import java.util.Scanner;

public class Javascape
{
    public static final Scanner KEYBOARD = new Scanner(System.in);

    //**************************************************************************
    //*                          Private Data Members                          *
    //**************************************************************************
    // Commands
    private final int HELP    = 0; // Get a list of all possible commands
    private final int EXPLORE = 1; // Get a description of the current room
    private final int ENTER   = 2; // Move to a different room
    private final int USE     = 3; // Use an item
    private final int EXAMINE = 4; // Get a detailed description of a piece of furniture

    public static void main(String[] args)
    {
        String command; //?

        // Game opening
        printOpening();

        // Move
        while (/* game is not over */)
        {
            // Take a command
            command = KEYBOARD.next().toLowerCase();
            switch (command)
            {
                case "help":
                    printCommands();
                    break;
                case "explore":
                    break;
                case "enter":
                    break;
                case "use":
                    break;
                case "examine":
                    break;
            }

            // Process the outcome

            // Print the result
        }

        // End game
    }

    private static void printOpening()
    {
        System.out.println("           __");
        System.out.println("          / /");
        System.out.println("         / /  _____   __    __   _____     ____     _____   _____     _____     ____");
        System.out.println("        / /  / __  \\  \\ \\  / /  / __  \\   / ___\\   / ___/  / __  \\   / __  \\   / __ \\");
        System.out.println("  __   / /  / /  / /  / / / /  / /  / /  / /__    / /     / /  / /  / /  / /  / / /_/");
        System.out.println(" / /  / /  / /__/ /  / /_/ /  / /__/ /   \\___ \\  / /___  / /__/ /  / /__/ /  / /___");
        System.out.println("/ /__/ /   \\______\\  \\____/ __\\______\\______/ /  \\____/  \\______\\ /  ____/   \\____/");
        System.out.println("\\_____/                    /_________________/                   / /");
        System.out.println("                                                                /_/");
    }

    private static void printCommands()
    {

    }
}