package OOPs;
//Aggregation contains references of other objects
import java.util.ArrayList;
import java.util.List;

class Player{
    String name;
    Player(String name){
        this.name = name;
    }
}


class Team{
    String teamName;
    // Aggregation : A team "has" players.


    List<Player> players = new ArrayList<>();

    Team(String teamName){
        this.teamName = teamName;
    }

    void addPlayer(Player player){
        players.add(player);
    }

    void showTeam(){
        System.out.println("Team " + teamName + " has players:");
        for(Player p : players){
            System.out.println("- "+ p.name);
        }
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        Team team = new Team("Free Coders");
        team.addPlayer(new Player("Me"));
        team.addPlayer(new Player("B1"));
        team.addPlayer(new Player("Manjan"));
        team.addPlayer(new Player("Raghav"));

        team.showTeam();
    }
}
