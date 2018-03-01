package com.example.user.blackjack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int playerOneScore = 0;
    int playerTwoScore = 0;
    String win = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //These are methods that count points and pass them for further processing

    public void TwoPointsP1(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerOneScore += 2;
            displayPlayerOneScore(playerOneScore);
        } else winLoseMsg(win);
    }

    public void TwoPointsP2(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerTwoScore += 2;
            displayPlayerTwoScore(playerTwoScore);
        } else winLoseMsg(win);
    }

    public void ThreePointsP1(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerOneScore += 3;
            displayPlayerOneScore(playerOneScore);
        } else winLoseMsg(win);
    }

    public void ThreePointsP2(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerTwoScore += 3;
            displayPlayerTwoScore(playerTwoScore);
        } else winLoseMsg(win);
    }

    public void FourPointsP1(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerOneScore += 4;
            displayPlayerOneScore(playerOneScore);
        } else winLoseMsg(win);
    }

    public void FourPointsP2(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerTwoScore += 4;
            displayPlayerTwoScore(playerTwoScore);
        } else winLoseMsg(win);
    }

    public void FivePointsP1(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerOneScore += 5;
            displayPlayerOneScore(playerOneScore);
        } else winLoseMsg(win);
    }

    public void FivePointsP2(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerTwoScore += 5;
            displayPlayerTwoScore(playerTwoScore);
        } else winLoseMsg(win);
    }

    public void SixPointsP1(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerOneScore += 6;
            displayPlayerOneScore(playerOneScore);
        } else winLoseMsg(win);
    }

    public void SixPointsP2(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerTwoScore += 6;
            displayPlayerTwoScore(playerTwoScore);
        } else winLoseMsg(win);
    }

    public void SevenPointsP1(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerOneScore += 7;
            displayPlayerOneScore(playerOneScore);
        } else winLoseMsg(win);
    }

    public void SevenPointsP2(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerTwoScore += 7;
            displayPlayerTwoScore(playerTwoScore);
        } else winLoseMsg(win);
    }

    public void EightPointsP1(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerOneScore += 8;
            displayPlayerOneScore(playerOneScore);
        } else winLoseMsg(win);
    }

    public void EightPointsP2(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerTwoScore += 8;
            displayPlayerTwoScore(playerTwoScore);
        } else winLoseMsg(win);
    }

    public void NinePointsP1(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerOneScore += 9;
            displayPlayerOneScore(playerOneScore);
        } else winLoseMsg(win);
    }

    public void NinePointsP2(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerTwoScore += 9;
            displayPlayerTwoScore(playerTwoScore);
        } else winLoseMsg(win);
    }

    public void TenPointsP1(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerOneScore += 10;
            displayPlayerOneScore(playerOneScore);
        } else winLoseMsg(win);
    }

    public void TenPointsP2(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerTwoScore += 10;
            displayPlayerTwoScore(playerTwoScore);
        } else winLoseMsg(win);
    }

    public void OnePointP1(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerOneScore += 1;
            displayPlayerOneScore(playerOneScore);
        } else winLoseMsg(win);
    }

    public void OnePointP2(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerTwoScore += 1;
            displayPlayerTwoScore(playerTwoScore);
        } else winLoseMsg(win);
    }

    public void ElevenPointsP1(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerOneScore += 11;
            displayPlayerOneScore(playerOneScore);
        } else winLoseMsg(win);
    }

    public void ElevenPointsP2(View v) {
        if (playerOneScore < 21 && playerTwoScore < 21) {
            playerTwoScore += 11;
            displayPlayerTwoScore(playerTwoScore);
        } else winLoseMsg(win);
    }

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
    public void winLoseMsg (String msg) {
        TextView blackJackView = findViewById(R.id.gameResult);
        blackJackView.setText(String.valueOf(msg));
        Toast toast = Toast.makeText(this, "You have to reset game", Toast.LENGTH_SHORT);
        toast.show();
    }
}
