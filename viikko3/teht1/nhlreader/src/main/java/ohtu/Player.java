
package ohtu;

public class Player {
    private String name;
    private String nationality;
    private int assist;
    private int goals;
    private String team;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }
    
    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return name + " team " + team + " goals " + goals + " assists " + assist;
    }
      
}
