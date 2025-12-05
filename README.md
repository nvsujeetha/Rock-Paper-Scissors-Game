This Java console program allows a user to play the classic Rock–Paper–Scissors game against the computer. The user selects a choice (Rock, Paper, or Scissors), and the computer randomly generates its own choice. The program then determines the winner based on the standard rules of the game.

🎮 Game Rules

Rock (0) beats Scissors (2)

Scissors (2) beats Paper (1)

Paper (1) beats Rock (0)

If both the user and the computer choose the same option, the result is a draw

📌 Features

User enters a number representing Rock, Paper, or Scissors

Validates user input (must be 0, 1, or 2)

Computer randomly selects a choice using Random

Compares choices to determine the winner

Displays user choice, computer choice, and game result

🧩 How the Program Works

User is prompted to enter:

0 = Rock  
1 = Paper  
2 = Scissors


Input is validated (must be between 0 and 2).

The computer generates a random choice using:

new Random().nextInt(3)


The program compares choices using standard game logic.

The winner is printed to the console.

▶️ Running the Program
Prerequisites

Java Development Kit (JDK 8 or above)

Compile
javac RockPaperScissorsGame.java

Run
java RockPaperScissorsGame

📝 Example Output
Enter choice 0:Rock 1:Paper 2:Scissor
0
User choice is 0
Computer choice is 2
Congratulation!! You win

📂 Code Structure
RockPaperScissorsGame
 ├── Reads user input
 ├── Validates choice
 ├── Randomly generates computer choice
 ├── Compares both choices
 └── Prints the winner

⚠️ Notes

If the user enters a number outside 0–2, the program displays an error message.

User input is not re-prompted; the game continues with the incorrect input detected.
