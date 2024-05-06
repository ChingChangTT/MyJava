package Testing;

import lombok.Data;

import java.time.LocalDate;


@Data
 class Start {
    private String name;
    private int age;
    private String email;
    private LocalDate currentDate;

}

class Work extends Start {


}

class Result {
    public static void main(String[] args) {
        Work test=new Work();
        test.setName("Ching");
        test.setAge(12);
        test.setEmail("ratanakeo@gmail.com");
        test.setCurrentDate(LocalDate.of(2022,11,2));
        String name=test.getName();
        System.out.println(name);
        int Age=test.getAge();
        System.out.println(Age);
        String email=test.getEmail();
        System.out.println(email);
        LocalDate myDate=test.getCurrentDate();
        System.out.println(myDate);
    }
}
