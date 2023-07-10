package _02_OOP._02_Encapsulation.Exercise._05_FootballTeamGenerator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Team> teams = new HashMap<>();

        String command = scanner.nextLine();
        while (!"END".equals(command)) {
            try {
                String[] commandParts = command.split(";");
                String commandType = commandParts[0];
                String teamName = commandParts[1];
                switch (commandType) {
                    case "Team":
                        Team team = new Team(teamName);
                        teams.put(teamName, team);
                        break;
                    case "Add":
                        String playerName = commandParts[2];
                        int playerEndurance = Integer.parseInt(commandParts[3]);
                        int playerSprint = Integer.parseInt(commandParts[4]);
                        int playerDribble = Integer.parseInt(commandParts[5]);
                        int playerPassing = Integer.parseInt(commandParts[6]);
                        int playerShooting = Integer.parseInt(commandParts[7]);


                        if (!teams.containsKey(teamName)) {
                            System.out.printf("Team %s does not exist.%n", teamName);
                        } else {
                            Player player = new Player(playerName, playerEndurance, playerSprint, playerDribble, playerPassing, playerShooting);
                            teams.get(teamName).addPlayer(player);
                        }
                        break;
                    case "Remove":
                        String playerToRemove = commandParts[2];
                        if (!teams.containsKey(teamName)) {
                            System.out.printf("Team %s does not exist.%n", teamName);
                        } else {
                            teams.get(teamName).removePLayer(playerToRemove);
                        }
                        break;
                    case "Rating":
                        if (!teams.containsKey(teamName)) {
                            System.out.printf("Team %s does not exist.%n", teamName);
                        } else {
                            System.out.printf("%s - %d%n", teamName, Math.round(teams.get(teamName).getRating()));
                        }
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            command = scanner.nextLine();
        }
    }
}
