package com.example.user.blackjack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int playerOneScore;
    private int playerTwoScore;
    private String win = " ";

    Button p1b1;
    Button p1b2;
    Button p1b3;
    Button p1b4;
    Button p1b5;
    Button p1b6;
    Button p1b7;
    Button p1b8;
    Button p1b9;
    Button p1b10;
    Button p1b11;
    Button p1JQK;

    Button p2b1;
    Button p2b2;
    Button p2b3;
    Button p2b4;
    Button p2b5;
    Button p2b6;
    Button p2b7;
    Button p2b8;
    Button p2b9;
    Button p2b10;
    Button p2b11;
    Button p2JQK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1b1 = findViewById(R.id.playerOneAce1);
        p1b2 = findViewById(R.id.button2PlayerOne);
        p1b3 = findViewById(R.id.button3PlayerOne);
        p1b4 = findViewById(R.id.button4PlayerOne);
        p1b5 = findViewById(R.id.button5PlayerOne);
        p1b6 = findViewById(R.id.button6PlayerOne);
        p1b7 = findViewById(R.id.button7PlayerOne);
        p1b8 = findViewById(R.id.button8PlayerOne);
        p1b9 = findViewById(R.id.button9PlayerOne);
        p1b10 = findViewById(R.id.button10PlayerOne);
        p1b11 = findViewById(R.id.playerOneAce11);
        p1JQK = findViewById(R.id.JQKP1);

        p2b1 = findViewById(R.id.playerTwoAce1);
        p2b2 = findViewById(R.id.button2PlayerTwo);
        p2b3 = findViewById(R.id.button3PlayerTwo);
        p2b4 = findViewById(R.id.button4PlayerTwo);
        p2b5 = findViewById(R.id.button5PlayerTwo);
        p2b6 = findViewById(R.id.button6PlayerTwo);
        p2b7 = findViewById(R.id.button7PlayerTwo);
        p2b8 = findViewById(R.id.button8PlayerTwo);
        p2b9 = findViewById(R.id.button9PlayerTwo);
        p2b10 = findViewById(R.id.button10PlayerTwo);
        p2b11 = findViewById(R.id.playerTwoAce11);
        p2JQK = findViewById(R.id.JQKP2);

        p1b1.setOnClickListener(playerOneHandler);
        p1b2.setOnClickListener(playerOneHandler);
        p1b3.setOnClickListener(playerOneHandler);
        p1b4.setOnClickListener(playerOneHandler);
        p1b5.setOnClickListener(playerOneHandler);
        p1b6.setOnClickListener(playerOneHandler);
        p1b7.setOnClickListener(playerOneHandler);
        p1b8.setOnClickListener(playerOneHandler);
        p1b9.setOnClickListener(playerOneHandler);
        p1b10.setOnClickListener(playerOneHandler);
        p1b11.setOnClickListener(playerOneHandler);
        p1JQK.setOnClickListener(playerOneHandler);

        p2b1.setOnClickListener(playerTwoHandler);
        p2b2.setOnClickListener(playerTwoHandler);
        p2b3.setOnClickListener(playerTwoHandler);
        p2b4.setOnClickListener(playerTwoHandler);
        p2b5.setOnClickListener(playerTwoHandler);
        p2b6.setOnClickListener(playerTwoHandler);
        p2b7.setOnClickListener(playerTwoHandler);
        p2b8.setOnClickListener(playerTwoHandler);
        p2b9.setOnClickListener(playerTwoHandler);
        p2b10.setOnClickListener(playerTwoHandler);
        p2b11.setOnClickListener(playerTwoHandler);
        p2JQK.setOnClickListener(playerTwoHandler);

    }

    //These are methods that count points and pass them for further processing

    View.OnClickListener playerOneHandler = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.playerOneAce1:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerOneScore += 1;
                        displayPlayerOneScore(playerOneScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.button2PlayerOne:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerOneScore += 2;
                        displayPlayerOneScore(playerOneScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.button3PlayerOne:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerOneScore += 3;
                        displayPlayerOneScore(playerOneScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.button4PlayerOne:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerOneScore += 4;
                        displayPlayerOneScore(playerOneScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.button5PlayerOne:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerOneScore += 5;
                        displayPlayerOneScore(playerOneScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.button6PlayerOne:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerOneScore += 6;
                        displayPlayerOneScore(playerOneScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.button7PlayerOne:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerOneScore += 7;
                        displayPlayerOneScore(playerOneScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.button8PlayerOne:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerOneScore += 8;
                        displayPlayerOneScore(playerOneScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.button9PlayerOne:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerOneScore += 9;
                        displayPlayerOneScore(playerOneScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.button10PlayerOne:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerOneScore += 10;
                        displayPlayerOneScore(playerOneScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.playerOneAce11:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerOneScore += 11;
                        displayPlayerOneScore(playerOneScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.JQKP1:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerOneScore += 10;
                        displayPlayerOneScore(playerOneScore);
                    } else winLoseMsg(win);
                    break;

            }

        }
    };

    View.OnClickListener playerTwoHandler = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.playerTwoAce1:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerTwoScore += 1;
                        displayPlayerTwoScore(playerTwoScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.button2PlayerTwo:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerTwoScore += 2;
                        displayPlayerTwoScore(playerTwoScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.button3PlayerTwo:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerTwoScore += 3;
                        displayPlayerTwoScore(playerTwoScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.button4PlayerTwo:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerTwoScore += 4;
                        displayPlayerTwoScore(playerTwoScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.button5PlayerTwo:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerTwoScore += 5;
                        displayPlayerTwoScore(playerTwoScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.button6PlayerTwo:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerTwoScore += 6;
                        displayPlayerTwoScore(playerTwoScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.button7PlayerTwo:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerTwoScore += 7;
                        displayPlayerTwoScore(playerTwoScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.button8PlayerTwo:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerTwoScore += 8;
                        displayPlayerTwoScore(playerTwoScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.button9PlayerTwo:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerTwoScore += 9;
                        displayPlayerTwoScore(playerTwoScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.button10PlayerTwo:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerTwoScore += 10;
                        displayPlayerTwoScore(playerTwoScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.playerTwoAce11:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerTwoScore += 11;
                        displayPlayerTwoScore(playerTwoScore);
                    } else winLoseMsg(win);
                    break;

                case R.id.JQKP2:
                    if (playerOneScore < 21 && playerTwoScore < 21) {
                        playerTwoScore += 10;
                        displayPlayerTwoScore(playerTwoScore);
                    } else winLoseMsg(win);
                    break;

            }
        }
    };


    //This method resets app to the default values

    public void resetButton(View v) {
        playerOneScore = 0;
        playerTwoScore = 0;
        win = "";
        displayPlayerOneScore(playerOneScore);
        displayPlayerTwoScore(playerTwoScore);
    }

    /**
     * @param number passes current score displays it and checks if it
     *               equals 21 or if its bellow or higher than 21 and displays
     *               proper message for player one
     *
     */

    public void displayPlayerOneScore(int number) {
        TextView scoreView = findViewById(R.id.player_one_score);
        scoreView.setText(String.valueOf(number));

        if (number == 21) {
            win = "Player One BLACK JACK!";
            TextView blackJackView = findViewById(R.id.gameResult);
            blackJackView.setText(String.valueOf(win));
        } else if (number > 21) {
            win = "PLAYER ONE LOSES";
            TextView blackJackView = findViewById(R.id.gameResult);
            blackJackView.setText(String.valueOf(win));
        } else if (number == 0) {
            win = " ";
            TextView blackJackView = findViewById(R.id.gameResult);
            blackJackView.setText(String.valueOf(win));
        } else {
            win = "HIT?";
            TextView blackJackView = findViewById(R.id.gameResult);
            blackJackView.setText(String.valueOf(win));
        }
    }

    /**
     * @param number passes current score displays it and checks if it
     *               equals 21 or if its bellow or higher than 21 and displays
     *               proper message for player two
     *
     */

    public void displayPlayerTwoScore(int number) {
        TextView scoreView = findViewById(R.id.player_two_score);
        scoreView.setText(String.valueOf(number));

        if (number == 21) {
            win = "Player Two BLACK JACK!";
            TextView blackJackView = findViewById(R.id.gameResult);
            blackJackView.setText(String.valueOf(win));
        } else if (number > 21) {
            win = "PLAYER TWO LOSES";
            TextView blackJackView = findViewById(R.id.gameResult);
            blackJackView.setText(String.valueOf(win));
        } else if (number == 0) {
            win = " ";
            TextView blackJackView = findViewById(R.id.gameResult);
            blackJackView.setText(String.valueOf(win));
        } else {
            win = "HIT?";
            TextView blackJackView = findViewById(R.id.gameResult);
            blackJackView.setText(String.valueOf(win));
        }
    }

//    TODO: finish this method
    //only a test how T O D O works

    public void winLoseMsg (String msg) {
        TextView blackJackView = findViewById(R.id.gameResult);
        blackJackView.setText(String.valueOf(msg));
        Toast toast = Toast.makeText(this, "You have to reset the game", Toast.LENGTH_SHORT);
        toast.show();
    }
}
