import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private LocalDate birthDate;
    private LocalDate deathDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person(String name, LocalDate birthDate, LocalDate deathDate, Person mother, Person father) {
        this.name = name;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.mother = mother;
        this.father = father;
    }

    Person mother;
    Person father;

    public static void fromCsvLine(String line, List<Person> people){

        try {
            String[] parts = line.split(",");
            int numOfParts = parts.length;

            String fullName = null;
            LocalDate birthDate = null;
            LocalDate deathDate = null;
            Person father = null;
            Person mother = null;

            if (numOfParts > 0) {
                fullName = parts[0].trim();
            }
            String dob = parts[1].trim();
            if (numOfParts > 1) {
                birthDate = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            }
            String dod = parts[2].trim();
            if (numOfParts > 2 && !dod.isEmpty()) {
                deathDate = LocalDate.parse(dod, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            }
            if (deathDate != null && birthDate != null && deathDate.isBefore(birthDate)) {
                throw new NegativeLifespanException(fullName);
            }
            Person person = new Person(fullName, birthDate, deathDate, mother, father);
            people.add(person);
        }
        catch( Exception e){
            System.err.println(e.getMessage());
        }
    }

    public static List<Person> fromCsv(String filePath){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            List<Person> people = new ArrayList<>();
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null){
                fromCsvLine(line, people);
            }
            return people;
        } catch (IOException e) {
            System.out.println("Problem z odczytem pliku!");
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Osoba{");
        sb.append("Imię i nazwisko='" + name + '\'');
        if (birthDate != null){
            sb.append(", data urodzenia=" + birthDate);
        }
        if(deathDate != null){
            sb.append(", data śmierci=" + deathDate);
        }
        if(mother != null){
            sb.append(", matka=" + mother.getName());
        }
        if(father != null){
            sb.append(", ojciec=" + father.getName());
        }
        sb.append("}");
        return sb.toString();
    }
}
