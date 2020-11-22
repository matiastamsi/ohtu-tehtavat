package ohtu;

public class TennisGame {

    private Player p1;
    private Player p2;

    public TennisGame(String p1, String p2) {
        this.p1 = new Player(p1);
        this.p2 = new Player(p2);
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(p1.getName())) {
            p1.setScore(p1.getScore() + 1);
        } else {
            p2.setScore(p2.getScore() + 1);
        }
    }

    public String getScore() {
        if (p1.getScore() == p2.getScore()) {
            return getScoreWhenEven();
        } else if (p1.getScore() >= 4 || p2.getScore() >= 4) {
            return anotherPlayerIsNearWinning();
        } else {
            return getScoreNormalSituation();
        }
    }

    public String getScoreWhenEven() {
        switch (p1.getScore()) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    public String anotherPlayerIsNearWinning() {
        int minusResult = p1.getScore() - p2.getScore();
        if (minusResult == 1) {
            return "Advantage " + p1.getName();
        } else if (minusResult == -1) {
            return "Advantage " + p2.getName();
        } else if (minusResult >= 2) {
            return "Win for " + p1.getName();
        } else {
            return "Win for " + p2.getName();
        }
    }

    public String getScoreNormalSituation() {
        int tempScore;
        String score = "";
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = p1.getScore();
            } else {
                score += "-";
                tempScore = p2.getScore();
            }
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
}
