public class Variable {
    public static void main(String[] args) {
        String name;
        name = "riskybaguse";

        System.out.println("Nama saya adalah "+name);

        int age;
        age = 20;

        System.out.println("Umur saya adalah "+age);

        // Kata Kunci Var
        var firstname = "risky";
        var lastname = "baguse";
        var address = "jateng";
        var age1 = 20;
        System.out.println(firstname+" "+lastname+" "+address+" "+age1);

        final String applicationName = "Belajar Java";
        // applicationName = "Belajar PHP" => akan error karena sudah FINAL

        System.out.println(applicationName);
    }
}
