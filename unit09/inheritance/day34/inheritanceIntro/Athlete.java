package unit09.inheritance.day34.inheritanceIntro;

public class Athlete {
    private String name;
    private int birthYear;
    private String team;



    public Athlete(){
        name = "John Doe";
        birthYear = 1991;
        team = "Team USA";
    }



    public void practice(){
        System.out.println("The athlete is in practice.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", team='" + team + '\'' +
                '}';
    }
}
