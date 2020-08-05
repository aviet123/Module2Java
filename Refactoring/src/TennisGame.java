public class TennisGame {

    public static String getScore(String nameOfPlayer1, String nameOfPlayer2, int scoreOfPlayer1, int scoreOfplayer2) {
        String score = "";
        int currentScore =0;
        boolean draw = scoreOfPlayer1 == scoreOfplayer2;
        if (draw)
        {
            score = getCurrentResult(scoreOfPlayer1);
        }
        else {
            boolean findPlayerWin = scoreOfPlayer1 >= 4 || scoreOfplayer2 >= 4;
            if (findPlayerWin)
            {
                score = getResult(scoreOfPlayer1, scoreOfplayer2);
            }
            else {
                for (int i=1; i<3; i++)
                {
                    if (i==1) currentScore  = scoreOfPlayer1;
                    else {
                        score+="-"; currentScore  = scoreOfplayer2;
                    }
                    score = getCurrentScore(score, currentScore);
                }
            }
        }
        return score;
    }

    private static String getCurrentScore(String score, int currentScore) {
        switch(currentScore )
        {
            case 0:
                score+="Love";
                break;
            case 1:
                score+="Fifteen";
                break;
            case 2:
                score+="Thirty";
                break;
            case 3:
                score+="Forty";
                break;
        }
        return score;
    }

    private static String getResult(int scoreOfPlayer1, int scoreOfPlayer2) {
        String score;
        int minusResult = scoreOfPlayer1-scoreOfPlayer2;
        if (minusResult==1) score ="Advantage player1";
        else
            if (minusResult ==-1) score ="Advantage player2";
        else
            if (minusResult>=2) score = "Win for player1";
        else
            score ="Win for player2";
        return score;
    }

    private static String getCurrentResult(int scoreOfPlayer1) {
        String score;
        switch (scoreOfPlayer1)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}
