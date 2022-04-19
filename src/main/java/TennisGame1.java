
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

    public String agregarRaya(int i, String score)
    {
        String score1 = score;
        if (i == 2){
            return score1 += "-";
        }
        return score1;
    }

    public String calcularPuntajeMayorDeCuatro(){
        String score = "";

        //if (player_score1 >= 4 || player_score2 >= 4)
        int minusResult = player_score1 - player_score2;

        if (minusResult == 1)  return  "Advantage player1";
        else if (minusResult == -1) return  "Advantage player2";
        else if (minusResult >= 2) return  "Win for player1";
        return   "Win for player2";

    }

    private boolean puntajeMayorDeCuatro() {
        return player_score1 >=4 || player_score2 >= 4 ;
    }

    public String calcularEmpate() {

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


    private boolean sonPuntajesIguales() {
        return player_score1 == player_score2;
    }



    public int puntajeTemporal(int temp){

        if (temp==1) return player_score1;
         return player_score2;
    }

    public  String compararResultados()
    {
        String score = "";
        int tempScore = 0;
        for (int i = 1; i < 3; i++) {

            score= agregarRaya(i,score);
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
       if (sonPuntajesIguales())
           return  calcularEmpate();

       if (puntajeMayorDeCuatro())
           return calcularPuntajeMayorDeCuatro();


        return compararResultados();
    }
}
