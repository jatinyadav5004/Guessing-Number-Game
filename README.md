# OIBSIP_2

This code is an updated version of the "Guess the Number" game that allows the user to play multiple rounds.

At the beginning of the program, the user is prompted to enter the number of rounds they want to play. The input is read using a Scanner object and stored in the variable num_rounds.

Then, a for loop is used to iterate over the number of rounds specified by the user. Inside the for loop, a random number between 0 and 99 is generated using the Random class and stored in the variable right_guess.

The user is then prompted to guess the number within 10 turns. The number of turns is stored in the variable turns, which is initialized to 0. The variable i is used to keep track of the number of turns left, and it is initialized to 0.

A while loop is used to repeatedly ask the user to enter their guess until they either guess the right number or run out of turns. If the user guesses the right number, the variable win is set to true, and the loop is exited. If the user runs out of turns, the loop is exited, and the user is notified that they lost the round.

If the user wins the round, the score for the round is calculated as (11 - turns) * 10, and the variable score is assigned this value. The total score for all rounds is kept in the variable total_score, which is updated by adding the score for each round.

At the end of the program, the user is notified of their total score for all rounds played.
