public class TennisGame {

    public static final String SCORE = "-";

    public static String getScore(String nameOfPlayer1, String nameOfPlayer2, int player1Score, int player2Score) {
        String score = "";
        int tempScore = 0;
        boolean draw = player1Score == player2Score;
        if (draw)
        {
            score = getDraw(player1Score);
        }
        else {
            boolean winGame = player1Score >= 4 || player2Score >= 4;
            if (winGame)
            {
                score = getEndResult(player1Score, player2Score);
            }
            else
            {
                for (int i=1; i<3; i++)
                {
                    if (i==1) tempScore = player1Score;
                    else { score += SCORE; tempScore = player2Score;}
                    switch(tempScore)
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
                }
            }
        }
        return score;
    }

    private static String getDraw(int player1Score) {
        String score;
        switch (player1Score)
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

    private static String getEndResult(int m_score1, int m_score2) {
        String score;
        int minusResult = m_score1-m_score2;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }
}
