package CollectorsClass;


import latest.Collector.Citizen;

import java.util.*;
import java.util.stream.Collectors;

public class Collector {

    public static void main(String[] args) {
        List<Citizen> Citizens = List.of(
                new Citizen(1, "Alice"),
                new Citizen(7, "Bob"),
                new Citizen(4, "Charlie")
        );

        // Collectors.toList()
        List<String> CitizenNamesList = Citizens.stream()
                .map(Citizen::getName)
                .collect(Collectors.toList());
        System.out.println("toList: " + CitizenNamesList);

        // Collectors.toSet()
        Set<String> CitizenNamesSet = Citizens.stream()
                .map(Citizen::getName)
                .collect(Collectors.toSet());
        System.out.println("toSet: " + CitizenNamesSet);

        // Collectors.toMap()
        Map<Integer, String> CitizenIdToNameMap = Citizens.stream()
                .collect(Collectors.toMap(Citizen::getId, Citizen::getName));
        System.out.println("toMap: " + CitizenIdToNameMap);

        // Collectors.joining()
        String joinedCitizenNames = Citizens.stream()
                .map(Citizen::getName)
                .collect(Collectors.joining(", "));
        System.out.println("joining: " + joinedCitizenNames);

        // Collectors.groupingBy()
        Map<Integer, List<Citizen>> CitizensById = Citizens.stream()
                .collect(Collectors.groupingBy(Citizen::getId));
        System.out.println("groupingBy: " + CitizensById);

        // Collectors.partitioningBy()
        Map<Boolean, List<Citizen>> partitionedCitizens = Citizens.stream()
                .collect(Collectors.partitioningBy(e -> e.getId() % 2 == 0));
        System.out.println("partitioningBy: " + partitionedCitizens);

        // Collectors.counting()
        long count = Citizens.stream()
                .collect(Collectors.counting());
        System.out.println("counting: " + count);

        // Collectors.summarizingInt()
        IntSummaryStatistics idStatistics = Citizens.stream()
                .collect(Collectors.summarizingInt(Citizen::getId));
        System.out.println("summarizingInt: " + idStatistics);

        // Collectors.mapping()
        List<String> uppercaseNames = Citizens.stream()
                .collect(Collectors.mapping(e -> e.getName().toUpperCase(), Collectors.toList()));
        System.out.println("mapping: " + uppercaseNames);

        // Collectors.collectingAndThen()
        List<Citizen> unmodifiableCitizens = Citizens.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        System.out.println("collectingAndThen: " + unmodifiableCitizens);
    }
}
