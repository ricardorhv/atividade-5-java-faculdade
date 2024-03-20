import model.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Ricardo", 20);
        person.addMainAddress("New York", "Gerry St", "Broadway Triangle", 222, "12-345");

        person.addNewAddressToTheList("Secundario", "Toledo", "Rua Ipiranga", "Centro", 234, "12-345");

        person.addNewAddressToTheList("Secundario", "Toledo", "Rua Ipiranga", "Centro", 234, "12-345");

        person.addNewAddressToTheList("Trabalho", "Toledo", "Rua Ipiranga", "Centro", 234, "12-345");
        person.removeAddressFromTheListByDescription("trabalho");

        person.showData();
    }
}
