package latest.Collector.Done;

import java.util.List;

/*
* 1. implement custom hashmap
* 2. stream candidate filter*/
public class Rakuten {
    public static void main(String[] args) {
        /* Design a new implementation of the Map interface that will also keep a count of all
           the calls made to add a key-value pair in the Map.*/

        //class ResForm{id,List<Done.Candidate>} Done.Candidate{id,name,address,gender}
        //Stream find list of registration form ,
        //filled by canditaes particular gender & address(citry anem)
        //banglore & male

        CustomHashMap<String, Integer> customMap = new CustomHashMap<>();
        customMap.put("asdf", 1);
        customMap.put("hjkl", 5);
        System.out.println(customMap.getPutCounter());
        customMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        List<Candidate> candidates1 =
                List.of(new Candidate(1, "can1", "Pune", "FeMale"),
                        new Candidate(2, "can2", "Banglore", "Male"));

        List<Candidate> candidates2 =
                List.of(new Candidate(3, "can3", "Pune", "Male"),
                        new Candidate(4, "can4", "Bhopal", "FeMale"));

        RegistrationForm registrationForm1 = new RegistrationForm(1, candidates1);
        RegistrationForm registrationForm2 = new RegistrationForm(2, candidates2);

        var rFList = List.of(registrationForm1, registrationForm2);


        //streams to get registration forms with filter criteria on candidates
        List<RegistrationForm> filteredForms = rFList.stream()
                .filter(form -> form.getCandidates().stream()
                        .anyMatch(candidate -> "male".equalsIgnoreCase(candidate.getGender())))
                .toList();

        filteredForms.forEach(System.out::println);

        //streams to get candidates with filter criteria on candidates
        List<Candidate> filteredCandidates = rFList.stream()
                .flatMap(form -> form.getCandidates().stream())
//              .flatMap(RegistrationForm::getCandidates)//with method reference
                .filter(candidate -> "male".equalsIgnoreCase(candidate.getGender()))
                .toList();

        filteredCandidates.forEach(System.out::println);
    }
}
