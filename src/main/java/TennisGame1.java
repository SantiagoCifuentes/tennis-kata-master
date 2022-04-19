
public class TennisGame1 implements TennisGame {

    private int player_score1 = 0;
    private int player_score2 = 0;
    private String player1Name;
    private String player2Name;
    String score = "";

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            player_score1 += 1;
        else
            player_score2 += 1;
    }

    private boolean cualquierPuntajeMayorDeCuatro() {
        return player_score1 >=4 || player_score2 >= 4 ;
    }

    public String empate() {



        switch (player_score1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            default:
                score = "Deuce";
                break;


        }
        return score;
    }


    public String puntajeMayorDeCuatro(){
        String score = "";

        //if (player_score1 >= 4 || player_score2 >= 4)
            int minusResult = player_score1 - player_score2;

            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            return score = "Win for player2";

    }

    public int puntajeTemporal(int temp){

        if (temp==1) return player_score1;
         return player_score2;
    }

    public  String compararResultados()
    {
        int tempScore = 0;
        for (int i = 1; i < 3; i++) {

            tempScore =puntajeTemporal(i);

            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }

        return score;
    }


    public String getScore() {
        String score = "";






        return score;
    }
}
