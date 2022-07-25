package Collections;

import java.util.*;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {

        List<FootballTeamMember> list = new ArrayList<>();
        list.add(new FootballTeamMember(10, "Zidane"));
        list.add(new FootballTeamMember(9, "Ronaldo"));
        list.add(new FootballTeamMember(11, "Di Maria"));
        list.add(new FootballTeamMember(8, "Gerard"));
        list.add(new FootballTeamMember(5, "Konate"));
        list.add(new FootballTeamMember(1, "Bartez"));
        list.add(new FootballTeamMember(7, "Ronaldo"));
        list.add(new FootballTeamMember(6, "Busquets"));
        list.add(new FootballTeamMember(4, "Van Dijk"));
        list.add(new FootballTeamMember(2, "Arnold"));

        System.out.println(createFootballTeam(list));

        HashMap<Integer, String> map = new HashMap<>();

        map.put(10, "Zidane");
        map.put(9, "Ronaldo");
        map.put(8, "Gerard");
        map.put(7, "Ronaldo");
        map.put(2, "Arnold");
        map.put(3, "Ramos");

        System.out.println(removeFromMap(map,3));
        printAllMemberNames(map);
        printAllMembers(map);
    }

    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։
    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {
        Map<Integer, String> hashMap = members.stream().collect(
                Collectors.toMap(FootballTeamMember::getNumber, FootballTeamMember::getName));

        return hashMap;
    }

    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {
        Iterator<Map.Entry<Integer, String> > iterator = memberMap.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<Integer, String> entry = iterator.next();

            if (removedNumber == entry.getKey()) {

                iterator.remove();
                return true;
            }
        }
        System.out.println(memberMap);
        return false;
    }

    //Մեթոդով տպելու ենք միայն անունները
    static void printAllMemberNames(Map<Integer, String> memberMap) {
        System.out.println(memberMap.values());
    }

    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
    // 11 - Poxos Poxosyan
    // 12 - Petros Petrosyan
    static void printAllMembers(Map<Integer, String> memberMap) {
        for (Integer key: memberMap.keySet()){
            System.out.println(key+ " - " + memberMap.get(key));
        }
    }


    static class FootballTeamMember {
        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
