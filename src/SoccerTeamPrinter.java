public class SoccerTeamPrinter {
    public static void main(String[] args) {
        SoccerTeam teamCalifornia = new SoccerTeam();
        TeamPerson headCoach = new TeamPerson();
        TeamPerson asstCoach = new TeamPerson();

        headCoach.setFullName("Mark Miwerds");
        headCoach.setAgeYears(42);
        teamCalifornia.setHeadCoach(headCoach);

        asstCoach.setFullName("Stanley Lee");
        asstCoach.setAgeYears(30);
        teamCalifornia.setAssistantCoach(asstCoach);

        teamCalifornia.print();
    }
}
